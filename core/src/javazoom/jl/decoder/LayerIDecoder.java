package javazoom.jl.decoder;

public class LayerIDecoder implements FrameDecoder {
   protected Bitstream stream;
   protected Header header;
   protected SynthesisFilter filter1;
   protected SynthesisFilter filter2;
   protected OutputBuffer buffer;
   protected int which_channels;
   protected int mode;
   protected int num_subbands;
   protected LayerIDecoder$Subband[] subbands;
   protected Crc16 crc = null;
   static final float[] scalefactors = new float[]{2.0F, 1.587401F, 1.2599211F, 1.0F, 0.7937005F, 0.62996054F, 0.5F, 0.39685026F, 0.31498027F, 0.25F, 0.19842513F, 0.15749013F, 0.125F, 0.099212565F, 0.07874507F, 0.0625F, 0.049606282F, 0.039372534F, 0.03125F, 0.024803141F, 0.019686267F, 0.015625F, 0.012401571F, 0.009843133F, 0.0078125F, 0.0062007853F, 0.0049215667F, 0.00390625F, 0.0031003926F, 0.0024607833F, 0.001953125F, 0.0015501963F, 0.0012303917F, 9.765625E-4F, 7.7509816E-4F, 6.1519584E-4F, 4.8828125E-4F, 3.8754908E-4F, 3.0759792E-4F, 2.4414062E-4F, 1.9377454E-4F, 1.5379896E-4F, 1.2207031E-4F, 9.688727E-5F, 7.689948E-5F, 6.1035156E-5F, 4.8443635E-5F, 3.844974E-5F, 3.0517578E-5F, 2.4221818E-5F, 1.922487E-5F, 1.5258789E-5F, 1.2110909E-5F, 9.612435E-6F, 7.6293945E-6F, 6.0554544E-6F, 4.8062175E-6F, 3.8146973E-6F, 3.0277272E-6F, 2.4031087E-6F, 1.9073486E-6F, 1.5138636E-6F, 1.2015544E-6F, 0.0F};

   public LayerIDecoder() {
      this.crc = new Crc16();
   }

   public void create(Bitstream var1, Header var2, SynthesisFilter var3, SynthesisFilter var4, OutputBuffer var5, int var6) {
      this.stream = var1;
      this.header = var2;
      this.filter1 = var3;
      this.filter2 = var4;
      this.buffer = var5;
      this.which_channels = var6;
   }

   public void decodeFrame() {
      this.num_subbands = this.header.number_of_subbands();
      this.subbands = new LayerIDecoder$Subband[32];
      this.mode = this.header.mode();
      this.createSubbands();
      this.readAllocation();
      this.readScaleFactorSelection();
      if (this.crc != null || this.header.checksum_ok()) {
         this.readScaleFactors();
         this.readSampleData();
      }

   }

   protected void createSubbands() {
      int var1;
      if (this.mode == 3) {
         for(var1 = 0; var1 < this.num_subbands; ++var1) {
            this.subbands[var1] = new LayerIDecoder$SubbandLayer1(var1);
         }
      } else if (this.mode == 1) {
         for(var1 = 0; var1 < this.header.intensity_stereo_bound(); ++var1) {
            this.subbands[var1] = new LayerIDecoder$SubbandLayer1Stereo(var1);
         }

         while(var1 < this.num_subbands) {
            this.subbands[var1] = new LayerIDecoder$SubbandLayer1IntensityStereo(var1);
            ++var1;
         }
      } else {
         for(var1 = 0; var1 < this.num_subbands; ++var1) {
            this.subbands[var1] = new LayerIDecoder$SubbandLayer1Stereo(var1);
         }
      }

   }

   protected void readAllocation() {
      for(int var1 = 0; var1 < this.num_subbands; ++var1) {
         this.subbands[var1].read_allocation(this.stream, this.header, this.crc);
      }

   }

   protected void readScaleFactorSelection() {
   }

   protected void readScaleFactors() {
      for(int var1 = 0; var1 < this.num_subbands; ++var1) {
         this.subbands[var1].read_scalefactor(this.stream, this.header);
      }

   }

   protected void readSampleData() {
      boolean var1 = false;
      boolean var2 = false;
      int var3 = this.header.mode();

      do {
         int var4;
         for(var4 = 0; var4 < this.num_subbands; ++var4) {
            var1 = this.subbands[var4].read_sampledata(this.stream);
         }

         do {
            for(var4 = 0; var4 < this.num_subbands; ++var4) {
               var2 = this.subbands[var4].put_next_sample(this.which_channels, this.filter1, this.filter2);
            }

            this.filter1.calculate_pcm_samples(this.buffer);
            if (this.which_channels == 0 && var3 != 3) {
               this.filter2.calculate_pcm_samples(this.buffer);
            }
         } while(!var2);
      } while(!var1);

   }
}

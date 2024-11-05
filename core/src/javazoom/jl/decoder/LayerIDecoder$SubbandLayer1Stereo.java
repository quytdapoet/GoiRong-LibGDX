package javazoom.jl.decoder;

class LayerIDecoder$SubbandLayer1Stereo extends LayerIDecoder$SubbandLayer1 {
   protected int channel2_allocation;
   protected float channel2_scalefactor;
   protected int channel2_samplelength;
   protected float channel2_sample;
   protected float channel2_factor;
   protected float channel2_offset;

   public LayerIDecoder$SubbandLayer1Stereo(int var1) {
      super(var1);
   }

   public void read_allocation(Bitstream var1, Header var2, Crc16 var3) {
      this.allocation = var1.get_bits(4);
      this.channel2_allocation = var1.get_bits(4);
      if (var3 != null) {
         var3.add_bits(this.allocation, 4);
         var3.add_bits(this.channel2_allocation, 4);
      }

      if (this.allocation != 0) {
         this.samplelength = this.allocation + 1;
         this.factor = table_factor[this.allocation];
         this.offset = table_offset[this.allocation];
      }

      if (this.channel2_allocation != 0) {
         this.channel2_samplelength = this.channel2_allocation + 1;
         this.channel2_factor = table_factor[this.channel2_allocation];
         this.channel2_offset = table_offset[this.channel2_allocation];
      }

   }

   public void read_scalefactor(Bitstream var1, Header var2) {
      if (this.allocation != 0) {
         this.scalefactor = LayerIDecoder.scalefactors[var1.get_bits(6)];
      }

      if (this.channel2_allocation != 0) {
         this.channel2_scalefactor = LayerIDecoder.scalefactors[var1.get_bits(6)];
      }

   }

   public boolean read_sampledata(Bitstream var1) {
      boolean var2 = super.read_sampledata(var1);
      if (this.channel2_allocation != 0) {
         this.channel2_sample = (float)var1.get_bits(this.channel2_samplelength);
      }

      return var2;
   }

   public boolean put_next_sample(int var1, SynthesisFilter var2, SynthesisFilter var3) {
      super.put_next_sample(var1, var2, var3);
      if (this.channel2_allocation != 0 && var1 != 1) {
         float var4 = (this.channel2_sample * this.channel2_factor + this.channel2_offset) * this.channel2_scalefactor;
         if (var1 == 0) {
            var3.input_sample(var4, this.subbandnumber);
         } else {
            var2.input_sample(var4, this.subbandnumber);
         }
      }

      return true;
   }
}

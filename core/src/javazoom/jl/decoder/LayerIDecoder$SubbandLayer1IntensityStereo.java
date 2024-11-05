package javazoom.jl.decoder;

class LayerIDecoder$SubbandLayer1IntensityStereo extends LayerIDecoder$SubbandLayer1 {
   protected float channel2_scalefactor;

   public LayerIDecoder$SubbandLayer1IntensityStereo(int var1) {
      super(var1);
   }

   public void read_allocation(Bitstream var1, Header var2, Crc16 var3) {
      super.read_allocation(var1, var2, var3);
   }

   public void read_scalefactor(Bitstream var1, Header var2) {
      if (this.allocation != 0) {
         this.scalefactor = LayerIDecoder.scalefactors[var1.get_bits(6)];
         this.channel2_scalefactor = LayerIDecoder.scalefactors[var1.get_bits(6)];
      }

   }

   public boolean read_sampledata(Bitstream var1) {
      return super.read_sampledata(var1);
   }

   public boolean put_next_sample(int var1, SynthesisFilter var2, SynthesisFilter var3) {
      if (this.allocation != 0) {
         this.sample = this.sample * this.factor + this.offset;
         float var4;
         if (var1 == 0) {
            var4 = this.sample * this.scalefactor;
            float var5 = this.sample * this.channel2_scalefactor;
            var2.input_sample(var4, this.subbandnumber);
            var3.input_sample(var5, this.subbandnumber);
         } else if (var1 == 1) {
            var4 = this.sample * this.scalefactor;
            var2.input_sample(var4, this.subbandnumber);
         } else {
            var4 = this.sample * this.channel2_scalefactor;
            var2.input_sample(var4, this.subbandnumber);
         }
      }

      return true;
   }
}

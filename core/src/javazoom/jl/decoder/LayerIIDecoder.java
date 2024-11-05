package javazoom.jl.decoder;

public class LayerIIDecoder extends LayerIDecoder implements FrameDecoder {
   protected void createSubbands() {
      int var1;
      if (this.mode == 3) {
         for(var1 = 0; var1 < this.num_subbands; ++var1) {
            this.subbands[var1] = new LayerIIDecoder$SubbandLayer2(var1);
         }
      } else if (this.mode == 1) {
         for(var1 = 0; var1 < this.header.intensity_stereo_bound(); ++var1) {
            this.subbands[var1] = new LayerIIDecoder$SubbandLayer2Stereo(var1);
         }

         while(var1 < this.num_subbands) {
            this.subbands[var1] = new LayerIIDecoder$SubbandLayer2IntensityStereo(var1);
            ++var1;
         }
      } else {
         for(var1 = 0; var1 < this.num_subbands; ++var1) {
            this.subbands[var1] = new LayerIIDecoder$SubbandLayer2Stereo(var1);
         }
      }

   }

   protected void readScaleFactorSelection() {
      for(int var1 = 0; var1 < this.num_subbands; ++var1) {
         ((LayerIIDecoder$SubbandLayer2)this.subbands[var1]).read_scalefactor_selection(this.stream, this.crc);
      }

   }
}

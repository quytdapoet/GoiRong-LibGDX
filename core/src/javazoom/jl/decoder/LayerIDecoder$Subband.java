package javazoom.jl.decoder;

abstract class LayerIDecoder$Subband {
   public abstract void read_allocation(Bitstream var1, Header var2, Crc16 var3);

   public abstract void read_scalefactor(Bitstream var1, Header var2);

   public abstract boolean read_sampledata(Bitstream var1);

   public abstract boolean put_next_sample(int var1, SynthesisFilter var2, SynthesisFilter var3);
}

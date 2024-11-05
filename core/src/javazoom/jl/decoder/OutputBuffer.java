package javazoom.jl.decoder;

public class OutputBuffer {
   public static final int BUFFERSIZE = 2304;
   private static final int MAXCHANNELS = 2;
   private Float replayGainScale;
   private int channels;
   private byte[] buffer;
   private int[] channelPointer;
   private boolean isBigEndian;

   public OutputBuffer(int var1, boolean var2) {
      this.channels = var1;
      this.isBigEndian = var2;
      this.buffer = new byte[2304 * var1];
      this.channelPointer = new int[var1];
      this.reset();
   }

   private void append(int var1, short var2) {
      byte var3;
      byte var4;
      if (this.isBigEndian) {
         var3 = (byte)(var2 >>> 8 & 255);
         var4 = (byte)(var2 & 255);
      } else {
         var3 = (byte)(var2 & 255);
         var4 = (byte)(var2 >>> 8 & 255);
      }

      this.buffer[this.channelPointer[var1]] = var3;
      this.buffer[this.channelPointer[var1] + 1] = var4;
      int[] var10000 = this.channelPointer;
      var10000[var1] += this.channels * 2;
   }

   public void appendSamples(int var1, float[] var2) {
      short var3;
      int var4;
      if (this.replayGainScale != null) {
         var4 = 0;

         while(var4 < 32) {
            var3 = this.clip(var2[var4++] * this.replayGainScale);
            this.append(var1, var3);
         }
      } else {
         var4 = 0;

         while(var4 < 32) {
            var3 = this.clip(var2[var4++]);
            this.append(var1, var3);
         }
      }

   }

   public byte[] getBuffer() {
      return this.buffer;
   }

   public int reset() {
      boolean var7 = false;

      int var2;
      try {
         var7 = true;
         int var1 = this.channels - 1;
         var2 = this.channelPointer[var1] - var1 * 2;
         var7 = false;
      } finally {
         if (var7) {
            for(int var5 = 0; var5 < this.channels; ++var5) {
               this.channelPointer[var5] = var5 * 2;
            }

         }
      }

      for(int var3 = 0; var3 < this.channels; ++var3) {
         this.channelPointer[var3] = var3 * 2;
      }

      return var2;
   }

   public void setReplayGainScale(Float var1) {
      this.replayGainScale = var1;
   }

   public boolean isStereo() {
      return this.channelPointer[1] == 2;
   }

   private final short clip(float var1) {
      return var1 > 32767.0F ? 32767 : (var1 < -32768.0F ? -32768 : (short)((int)var1));
   }
}

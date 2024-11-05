package gro;

public final class vdtt_ha {
   public short[][] a = new short[2][];

   public static short a(int var0, byte var1, boolean var2) {
      int var3 = var1 - 1;
      short[] var4 = DataCenter.gI().A[var0].a[0];
      return var2 && var4.length > 5 ? var4[var4.length - 1] : var4[var3];
   }
}

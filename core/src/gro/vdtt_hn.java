package gro;

import java.util.Vector;

public final class vdtt_hn {
   public Vector a;
   public vdtt_fe b;
   public Vector c;
   public byte d;
   public String e;

   public vdtt_hn(Vector var1, String var2, byte var3, String var4) {
      this.e = var4;
      this.a = var1;
      int var5;
      if ((var5 = DataCenter.gI().n) > 400) {
         var5 = 400;
      }

      this.c = vdtt_dd.a(vdtt_dd.d, var2, var5 - 72);
      this.d = var3;
   }

   public vdtt_hn(vdtt_fe var1, String var2, byte var3, String var4) {
      this.b = var1;
      this.e = var4;
      int var5;
      if ((var5 = DataCenter.gI().n) > 400) {
         var5 = 400;
      }

      this.c = vdtt_dd.a(vdtt_dd.d, var2, var5 - 72);
      this.d = 0;
   }
}

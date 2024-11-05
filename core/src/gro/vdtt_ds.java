package gro;

import java.util.Comparator;

public final class vdtt_ds {
   public int a;
   public int b;
   public int c;
   public String d;
   public int e;
   public int f;
   public String[] g;
   public static Comparator h = new vdtt_dt();

   public vdtt_ds() {
   }

   public vdtt_ds(int var1, String var2, int var3, int var4, int var5, int var6) {
      this.a = var1;
      this.b = var3;
      this.c = var4;
      this.d = var2;
      this.e = -1;
      this.f = 32;
   }

   public final boolean a() {
      return Utlis.d(this.b, this.c);
   }
}

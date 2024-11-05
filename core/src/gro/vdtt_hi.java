package gro;

public final class vdtt_hi {
   public vdtt_x a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;
   public int h;
   public long i;
   public vdtt_hp j;
   public Object k;

   public vdtt_hi(int var1, int var2, int var3, int var4, int var5, vdtt_hp var6, vdtt_x var7) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
      this.f = var5;
      this.j = var6;
      this.a = var7;
      if (var6 != null) {
         this.g = var2 - var6.cx;
         this.h = var3 - var6.cy;
      }

   }

   public vdtt_hi(int var1, int var2, int var3, int var4, int var5, vdtt_hp var6, vdtt_x var7, Object var8) {
      this.b = var1;
      this.c = var2;
      this.d = var3;
      this.e = var4;
      this.f = var5;
      this.j = var6;
      this.a = var7;
      this.k = var8;
      if (var6 != null) {
         this.g = var2 - var6.cx;
         this.h = var3 - var6.cy;
      }

   }

   public final int a() {
      return this.c + (this.e - this.c) / 2;
   }

   public final int b() {
      return this.d + (this.f - this.d) / 2;
   }

   public final int c() {
      return this.e - this.c;
   }

   public final int d() {
      return this.f - this.d;
   }
}

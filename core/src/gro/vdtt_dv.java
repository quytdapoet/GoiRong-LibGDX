package gro;

import java.util.Vector;

public final class vdtt_dv implements Cloneable {
   public int a = -1;
   public int b = -1;
   public int c = -1;
   public int d = -1;
   public int e;
   public int f;
   public Vector g;
   public int h = -1;
   public int i = -1;
   public int j = 0;

   public final vdtt_dv a() {
      try {
         return (vdtt_dv)super.clone();
      } catch (Exception var2) {
         Utlis.a(var2);
         return null;
      }
   }

   public vdtt_dv(int var1, int var2, int var3) {
      this.h = var1;
      this.d = var1;
      this.e = var2;
      this.f = var3;
   }

   public vdtt_dv(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.h = var4;
      this.d = var4;
      this.b = var2;
      this.a = var1;
      this.c = var3;
      this.e = var5;
      this.f = var6;
   }

   public vdtt_dv(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      this.h = var4;
      this.d = var4;
      this.b = var2;
      this.a = var1;
      this.c = var3;
      this.e = var5;
      this.f = var6;
      this.j = var7;
   }

   public final boolean b() {
      return this.d == 86 || this.d == 67 || this.d == 87 || this.d == 56 && GameSrc.gI().idTask >= 9;
   }

   public final Object clone() {
      return this.a();
   }
}

package gro;

import java.util.Vector;

public abstract class vdtt_ao extends vdtt_ap {
   public vdtt_hm a;
   private vdtt_hp N;
   protected Vector[] b;
   public int c = 5;
   public boolean[] d;
   public boolean[] M;

   public vdtt_ao(MainScreen var1) {
      this.H = var1;
      this.a(DataCenter.gI().n - 20, DataCenter.gI().o - 20);
   }

   public final void a(vdtt_hm var1, int var2, int var3, int var4) {
      while((var3 + this.c) * var1.c.length > this.width - 24) {
         var3 -= 2;
      }

      if ((var2 = var1.c.length) > var4) {
         var2 = var4;
      }

      this.a = var1;

      for(var4 = 0; var4 < var1.c.length; ++var4) {
         String[] var5 = var1.c;
         var5[var4] = var5[var4].replaceAll("\n", " ");
      }

      this.N = new vdtt_hp((byte)0, 15, 5, var3 * var2, 23, var3, var1.c.length);
      byte var6 = -2;
      this.N.H = var6;
      this.b = new Vector[var1.c.length];
      this.d = new boolean[var1.c.length];
      this.M = new boolean[var1.c.length];

      for(var4 = 0; var4 < this.b.length; ++var4) {
         this.b[var4] = new Vector();
      }

   }

   public final int w() {
      return this.a.c.length - 1;
   }

   public final void a(vdtt_k var1, int var2) {
      this.b[var2].addElement(var1);
   }

   public void a_() {
      this.N.a();
   }

   private void a(Graphics var1, int var2, int var3, int var4, String var5, boolean var6, int var7) {
      vdtt_y.a(var1, var4, 0, var2, 3, var3 - this.c, (int)19);
      if (var6) {
         vdtt_dd.a((vdtt_dd)vdtt_dd.f, (Graphics)var1, var5, var2 + (var3 - this.c) / 2 + 1, 12, 2, var7, 0);
      } else {
         vdtt_dd.a((vdtt_dd)vdtt_dd.f, (Graphics)var1, var5, var2 + (var3 - this.c) / 2, 11, 2, var7, 0);
      }

   }

   public void b(Graphics var1) {
      if (this.w() <= 0) {
         this.a(var1, this.cx, this.cy, this.width, this.height, this.a.c[0], (byte)2, this.J);
      } else {
         this.a(var1, this.cx, this.cy, this.width, this.height, "", (byte)20, this.J);
      }

      if (this.w() > 0) {
         this.a(var1, this.N);

         for(int var2 = 0; var2 < this.a.c.length; ++var2) {
            if (!this.M[var2]) {
               if (var2 == this.a.b) {
                  this.a(var1, var2 * this.N.h, this.N.h, 78, this.a.c[var2], var2 == this.N.l, -1);
               } else {
                  this.a(var1, var2 * this.N.h, this.N.h, 76, this.a.c[var2], var2 == this.N.l, -8158590);
               }

               if (this.d[var2]) {
                  vdtt_cz.a(var1, 713, 0, (var2 + 1) * this.N.h - this.c - 4, 2, 0);
               }
            }
         }

         this.a(var1);
      }

   }

   public Vector g() {
      Vector var1;
      (var1 = new Vector()).addElement(this.N.a(-9997, this));
      super.b(var1);
      return var1;
   }

   public void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);

      try {
         switch(var1.b) {
         case -9997:
            if (var1.j.k >= 0 && this.a.b != var1.j.k && !this.M[var1.j.k]) {
               this.f(var1.j.k);
               return;
            }
            break;
         default:
            super.a(var1, var2, var3);
         }
      } catch (Exception var5) {
      }

   }

   public final int x() {
      return this.a.b;
   }

   public void f(int var1) {
      this.a.b = var1;

      for(var1 = 0; var1 < this.b.length; ++var1) {
         for(int var2 = 0; var2 < this.b[var1].size(); ++var2) {
            this.f.removeElement(this.b[var1].elementAt(var2));
         }
      }

      for(var1 = 0; var1 < this.b[this.a.b].size(); ++var1) {
         this.f.addElement(this.b[this.a.b].elementAt(var1));
      }

      for(var1 = 0; var1 < this.f.size(); ++var1) {
         if (this.f.get(var1) instanceof vdtt_al) {
            this.f.remove(var1);
            return;
         }
      }

   }
}

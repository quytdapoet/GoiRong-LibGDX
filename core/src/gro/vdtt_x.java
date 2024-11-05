package gro;

import java.util.Vector;

public abstract class vdtt_x extends EntityPanel {
   public vdtt_di o = new vdtt_di();
   public vdtt_dj p;

   public abstract void b(Graphics var1);

   public abstract void a_();

   public abstract void c();

   public abstract Vector g();

   public abstract void a(vdtt_hi var1, int var2, int var3);

   public void r() {
   }

   public int a() {
      return this.cx;
   }

   public int b() {
      return this.cy;
   }

   public final void s() {
      try {
         if (this.p == null) {
            this.p = new vdtt_dj();
         }

         Vector var1;
         if ((var1 = this.g()) == null) {
            this.p.a = new vdtt_hi[0];
         } else {
            this.p.a = new vdtt_hi[var1.size()];
            if (!(this instanceof vdtt_k)) {
               for(int var6 = 0; var6 < var1.size(); ++var6) {
                  this.p.a[var6] = (vdtt_hi)var1.elementAt(var6);
               }

               return;
            }

            vdtt_k var2 = (vdtt_k)this;

            for(int var3 = 0; var3 < var1.size(); ++var3) {
               this.p.a[var3] = (vdtt_hi)var1.elementAt(var3);
               vdtt_hi var4 = this.p.a[var3];
               var4.c += var2.a.cx;
               var4 = this.p.a[var3];
               var4.e += var2.a.cx;
               var4 = this.p.a[var3];
               var4.d += var2.a.cy;
               var4 = this.p.a[var3];
               var4.f += var2.a.cy;
            }
         }
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }

   public final boolean e(int var1) {
      return this.p != null && this.p.a(0);
   }

   public final void d(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      this.a(var1, this.a(), this.b());
      this.b(var1);
      this.a(var1, var2, var3);
   }

   public final void a(Graphics var1, int var2, int var3) {
      var1.a(-var1.e, -var1.f);
      var1.a(var2, var3);
   }

   public void a(Graphics var1) {
      this.a((Graphics)var1, 0, 0);
      var1.d(0, 0, DataCenter.gI().n, DataCenter.gI().o);
      var1.a(this.a(), this.b());
   }

   public void a(Graphics var1, vdtt_hp var2) {
      var2.a(var1, this.a(), this.b(), var2.width, var2.height);
   }

   public final void b(Graphics var1, vdtt_hp var2) {
      var2.b(var1, this.a(), this.b(), var2.width, var2.height);
   }

   public static void a(Vector var0) {
      try {
         for(int var1 = 0; var1 < var0.size() - 1; ++var1) {
            vdtt_w var2 = (vdtt_w)var0.elementAt(var1);

            for(int var3 = var1 + 1; var3 < var0.size(); ++var3) {
               vdtt_w var4;
               if ((var4 = (vdtt_w)var0.elementAt(var3)).e < var2.e) {
                  vdtt_w var5 = var4;
                  var4 = var2;
                  var2 = var5;
                  var0.setElementAt(var5, var1);
                  var0.setElementAt(var4, var3);
               }
            }
         }
      } catch (Exception var6) {
      }

   }
}

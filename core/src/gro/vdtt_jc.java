package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public final class vdtt_jc extends vdtt_ap {
   public vdtt_ay[] a;
   private vdtt_hp[] c;
   private int d;
   private vdtt_hp M;
   private Vector N;
   private int O;
   private vdtt_by P;
   private vdtt_ay Q;
   private boolean R;
   public static final Comparator b = new vdtt_jd();
   private int S = 0;

   public vdtt_jc(Vector var1, MainScreen var2, int var3, String var4) {
      this.H = var2;
      this.d = 1014;
      this.J = false;
      this.a(220, 200);
      this.N = var1;
      Collections.sort(this.N, b);
      if (Gdx.app.getType() != ApplicationType.Desktop) {
         this.M = new vdtt_hp((byte)1, 10, this.f() + 5, this.width - 18, 156, 26, var1.size());
      } else {
         this.M = new vdtt_hp((byte)1, 10, this.f() + 31, this.width - 18, 130, 26, var1.size());
         this.P = this.a(10, this.f() + 5, this.width - 58, Caption.vW, this, 0);
         byte var5 = 32;
         this.P.S = var5;
         this.P.a(var4);
         this.Q = this.a(4 + (super.width - 8) - 39, this.f() + 6, Caption.km, this, 1003, -8);
         this.Q.setSize(35, this.Q.height);
      }

      this.a = new vdtt_ay[this.N.size()];
      this.c = new vdtt_hp[this.N.size()];

      for(int var6 = 0; var6 < this.a.length; ++var6) {
         this.a[var6] = new vdtt_ay(this.width - 40, var6 * this.M.h + 4, 0, 0, "", this, 3000 + var6, -27);
         this.c[var6] = new vdtt_hu((byte)1, this.a[var6].cx, this.a[var6].cy, this.a[var6].width, this.a[var6].height, this.a[var6].height, 1, this.M);
      }

   }

   public final void d() {
      super.d();
      if (this.R) {
         this.H.a(1014, this.N.get(this.d), this);
      }

   }

   public final Vector g() {
      Vector var1 = super.g();

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         int var3 = this.M.cx + this.a[var2].cx;
         int var4 = this.M.cy + this.a[var2].cy - this.M.f;
         if (Utlis.a(this.M.cx, this.M.cy, this.M.cx + this.M.width, this.M.cy + this.M.height, var3, var4) && Utlis.a(this.M.cx, this.M.cy, this.M.cx + this.M.width, this.M.cy + this.M.height, var3 + this.a[var2].width, var4 + this.a[var2].height)) {
            this.c[var2].cx = (short)var3;
            this.c[var2].cy = (short)var4;
            var1.addElement(new vdtt_hi(3000 + var2, this.c[var2].cx, this.c[var2].cy, this.c[var2].cx + this.c[var2].width, this.c[var2].cy + this.c[var2].height, this.c[var2], this));
         }
      }

      var1.addElement(this.M.a(1002, this));
      return var1;
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.pU, (byte)2, this.J);
      this.a(var1, this.M);
      int var2 = var1.e;
      int var3 = var1.f;

      for(int var4 = 0; var4 < this.M.i; ++var4) {
         if (this.M.b(var4)) {
            try {
               String[] var5 = (String[])this.N.elementAt(var4);
               this.a(var1, 0, var4 * this.M.h + 1, this.M.width, 24, 46, 22, 23, 1, 1);
               if (this.M.k == var4) {
                  var1.d(30);
                  var1.f(-11184811);
                  var1.c(0, var4 * this.M.h + 1, this.M.width - 1, 23);
                  var1.m = 1.0F;
                  var1.d(50);
                  var1.f(-1);
                  var1.b(0, var4 * this.M.h + 1, this.M.width - 1, 23);
                  var1.m = 1.0F;
               }

               int var6 = 8;
               int var7 = var4 * this.M.h + 12;
               if (var4 == this.M.l) {
                  ++var6;
                  ++var7;
               }

               String[] var8;
               if (!(var8 = vdtt_dd.c(vdtt_dd.d, var5[0], this.M.width - 60))[0].equals(var5[0])) {
                  vdtt_dd.a(vdtt_dd.d, var1, var8[0] + "...", var6, var7, 0, -1);
               } else {
                  vdtt_dd.a(vdtt_dd.d, var1, var8[0], var6, var7, 0, -1);
               }

               this.a(var1, var2 + this.a[var4].cx, var3 + this.a[var4].cy);
               this.a[var4].b(var1);
               this.a(var1, var2, var3);
            } catch (Exception var9) {
            }
         }
      }

      this.a(var1);
      this.M.b(var1, this);
   }

   public final void a_() {
      this.M.a();
      if (this.O > 0) {
         --this.O;
         if (this.O == 0) {
            this.k();
            if (this.d == -1) {
               this.H.a(1014, (Object)null, this);
            } else {
               this.H.a(1014, this.N.get(this.d), this);
            }
         }
      }

      int var1;
      if ((var1 = this.P.i().length()) != this.S) {
         this.w();
      }

      this.S = var1;

      for(var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1].a_();
         this.a[var1].a_();
         if (this.c[var1].l != -1) {
            this.a[var1].M = true;
         } else {
            this.a[var1].M = false;
         }
      }

   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (this.O <= 0) {
         super.a(var1, var2, var3);
         if (var1.b >= 3000 & var1.b < 4000) {
            this.d = var1.b - 3000;
            String[] var4 = (String[])this.N.get(this.d);
            this.N.remove(var1.b - 3000);
            vdtt_jc var5 = this;
            Writer var6 = null;
            boolean var7 = false;

            label152: {
               label151: {
                  try {
                     var7 = true;
                     (var6 = new Writer()).writeShort(var5.N.size());

                     for(int var8 = 0; var8 < var5.N.size(); ++var8) {
                        String[] var9 = (String[])var5.N.elementAt(var8);
                        var6.writeUTF(Utlis.d(var9[0]));
                        var6.writeUTF(Utlis.d(var9[1]));
                     }

                     var6.close("arr_acc");
                     var7 = false;
                     break label151;
                  } catch (Exception var13) {
                     Utlis.a(var13);
                     var7 = false;
                  } finally {
                     if (var7 && var6 != null) {
                        var6.close();
                     }

                  }

                  if (var6 != null) {
                     var6.close();
                  }
                  break label152;
               }

               var6.close();
            }

            this.R = false;
            if (this.N.size() == 0) {
               this.O = 4;
               this.d = -1;
            } else if (((LoginPCScreen)this.H).I.i().equals(var4[0])) {
               this.R = true;
               --this.d;
               if (this.d < 0) {
                  this.d = 0;
               }
            }
         } else {
            switch(var1.b) {
            case 1002:
               if (var1.j.k >= 0) {
                  this.O = 4;
                  this.d = var1.j.k;
                  this.R = false;
               }
            case 1003:
               this.w();
            }
         }
      }

   }

   private void w() {
      String var1 = this.P.i().trim().toLowerCase();
      int var2 = this.M.k;
      boolean var3 = false;
      ++var2;

      while(var2 < this.N.size()) {
         if (((String[])this.N.get(var2))[0].toLowerCase().contains(var1)) {
            this.M.k = var2;
            this.M.a(var2);
            var3 = true;
            break;
         }

         ++var2;
      }

      if (!var3) {
         for(var2 = 0; var2 < this.N.size(); ++var2) {
            if (((String[])this.N.get(var2))[0].toLowerCase().contains(var1)) {
               this.M.k = var2;
               this.M.a(var2);
               return;
            }
         }
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }
}

package gro;

import java.util.Vector;

public final class vdtt_js extends vdtt_ap {
   private vdtt_by b;
   private Item c;
   private byte d;
   private vdtt_hq M;
   private int N;
   private boolean O = true;
   private String P = "";
   private int Q = 0;
   public byte a;
   private vdtt_kf R;

   public vdtt_js(MainScreen var1, Item var2, byte var3, vdtt_kf var4) {
      this.R = var4;
      this.a = 0;
      this.e = 2;
      this.H = var1;
      this.c = var2;
      this.J = false;
      if (var2.m > 0) {
         this.d = 2;
      } else if (var2.n > 0) {
         this.d = 3;
      } else if (var2.k > 0) {
         this.d = 0;
      } else if (var2.l > 0) {
         this.d = 1;
      } else if (var2.p > 0) {
         this.d = 7;
      } else if (var2.o > 0) {
         this.d = 4;
      }

      this.a(220, 168);
      this.b = this.a(54, 43, 60, "", this, 2);
      byte var5 = 4;
      this.b.l = var5;
      boolean var6 = true;
      this.b.R = 1;
      short var7 = 999;
      this.b.S = var7;
      this.b.a("1");
      vdtt_ay var8 = this.a(119, 46, "", this, 1001, 58);
      vdtt_ay var9 = this.a(140, 46, "", this, 1002, 57);
      vdtt_ay var10;
      (var10 = this.a(Caption.i, 1003)).b(-8);
      var10.setXY(var10.cx - 26, var10.cy);
      (var10 = this.a(Caption.D, -7)).b(-8);
      var10.setXY(var10.cx + 40, var10.cy);
      this.M = new vdtt_hq((byte)1, 9, 9, 30, 30, 30, 1, 1);
      if (var2.id == 820) {
         var8.b(true);
         var9.b(true);
         this.b.a(true);
      }

   }

   public final void a(int var1, Object var2) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final int f() {
      return 5;
   }

   public final void b(Graphics var1) {
      this.e(var1);
      b(var1, this.M.cx, this.M.cy, this.c, false);
      vdtt_dd.b(vdtt_dd.d, var1, this.c.getItemTemplate().name, 44, 15, 0, -1, -16777216);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.aI, 44, 30, 0, -10831436, -16777216);
      vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(this.c.c()), 64, 30, 0, -1, -16777216);
      a(var1, 64, 30, Utlis.c(this.c.c()), this.d);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.aM, 9, 55, 0, -10831436, -16777216);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.aN, 9, 75, 0, -10831436, -16777216);
      a(var1, 54, 75, Utlis.c(this.N), this.d);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.aO, 9, 95, 0, -10831436, -16777216);
      if (this.c.k > 0) {
         vdtt_dd.b(vdtt_dd.d, var1, Caption.sv, 9, 110, 0, -6488, -16777216);
      } else if (this.c.p > 0) {
         vdtt_dd.b(vdtt_dd.d, var1, Caption.vs, 9, 110, 0, -6488, -16777216);
      }

      if (this.c.m <= 0 && this.c.n <= 0) {
         vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(this.N), 54, 75, 0, -3089954, -16777216);
         vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(this.P), 54, 95, 0, -3089954, -16777216);
      } else {
         vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(this.N), 54, 75, 0, -2560, -16777216);
         vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(this.P), 54, 95, 0, -2560, -16777216);
      }

      a(var1, 54, 95, this.P, this.d);
      if (!this.O && (this.Q == 0 || this.Q % 10 > 5)) {
         vdtt_dd.b(vdtt_dd.d, var1, Caption.bf + " " + this.c.f(), 9, 123, 0, -65536, -16777216);
      }

   }

   public final void a_() {
      this.O = true;
      this.N = this.b.h() * this.c.c();
      if (this.N < 0) {
         this.b.a(0);
      } else {
         if (this.c.m > 0) {
            this.P = Utlis.c(Char.gI().vang);
            if (Char.gI().vang < this.N) {
               this.O = false;
            }
         } else if (this.c.n > 0) {
            this.P = Utlis.c(Char.gI().vangKhoa);
            if (Char.gI().vangKhoa < this.N) {
               this.O = false;
            }
         } else if (this.c.k > 0) {
            this.P = Utlis.c(this.R.T);
            if (this.R.T < this.N) {
               this.O = false;
            }
         } else if (this.c.l > 0) {
            this.P = Utlis.c(Char.gI().bacKhoa);
            if (Char.gI().bacKhoa < this.N) {
               this.O = false;
            }
         } else if (this.c.p > 0) {
            this.P = "" + GameSrc.gI().bV;
            if (GameSrc.gI().bV < this.N) {
               this.O = false;
            }
         } else if (this.c.o > 0) {
            this.P = "" + GameSrc.gI().bU;
            if (GameSrc.gI().bU < this.N) {
               this.O = false;
            }
         }

         if (this.Q > 0) {
            --this.Q;
         }

         DataCenter.gI();
         if (!DataCenter.b() && GameSrc.gI().idTask == 3 && GameSrc.gI().idStep == 0) {
            int var1;
            if (this.N >= 3) {
               var1 = this.cx + 75;
               DataCenter.gI().pointHelper.a(var1, this.cy + 140);
            } else {
               var1 = this.cx + 150;
               DataCenter.gI().pointHelper.a(var1, this.cy + 48);
            }

            DataCenter.gI().pointHelper.b = true;
         }
      }

   }

   public final Vector g() {
      if (this.I != null) {
         this.I.width = 0;
      }

      Vector var1;
      (var1 = super.g()).addElement(this.M.a(1000, this));
      var1.addElement(new vdtt_hi(0, 0, 0, this.width, this.height, this.I, this));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1000:
         this.k = a(this, var1, this.c);
         return;
      case 1001:
         this.b.a(this.b.h() - 1);
         if (this.b.h() < this.b.R) {
            this.b.a(this.b.R);
            return;
         }
         break;
      case 1002:
         this.b.a(this.b.h() + 1);
         return;
      case 1003:
         if (this.N <= 0) {
            return;
         }

         if (!this.O) {
            this.Q = 50;
            return;
         }

         vdtt_js var4 = this;

         try {
            Message var5;
            (var5 = Message.c((byte)-34)).writeShort(var4.c.idBuy);
            var5.writeShort(var4.b.h());
            var5.send();
            return;
         } catch (Exception var6) {
            Utlis.a(var6);
         }
      }

   }
}

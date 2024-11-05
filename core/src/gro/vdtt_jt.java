package gro;

import java.util.Vector;

public final class vdtt_jt extends vdtt_ap {
   private vdtt_by c;
   private Item d;
   private byte M;
   private vdtt_hq N;
   private int O;
   private boolean P = true;
   private String Q = "";
   private int R = 0;
   public byte a;
   public boolean b;

   public vdtt_jt(MainScreen var1, Item var2, byte var3) {
      this.a = var3;
      this.e = 2;
      this.H = var1;
      this.d = var2;
      this.J = false;
      if (var2.m > 0) {
         this.M = 2;
      } else if (var2.n > 0) {
         this.M = 3;
      } else if (var2.k > 0) {
         this.M = 0;
      } else if (var2.l > 0) {
         this.M = 1;
      } else if (var2.o > 0) {
         this.M = 4;
      }

      this.a(220, 155);
      this.c = this.a(54, 43, 60, "", this, 2);
      byte var4 = 4;
      this.c.l = var4;
      boolean var5 = true;
      this.c.R = 1;
      short var6 = 999;
      this.c.S = var6;
      this.c.a("1");
      this.a(this.c);
      vdtt_ay var7 = this.a(119, 46, "", this, 1001, 58);
      vdtt_ay var8 = this.a(140, 46, "", this, 1002, 57);
      vdtt_ay var9;
      (var9 = this.a(Caption.i, 1003)).b(-8);
      var9.setXY(var9.cx - 26, var9.cy);
      (var9 = this.a(Caption.D, -7)).b(-8);
      var9.setXY(var9.cx + 40, var9.cy);
      this.N = new vdtt_hq((byte)1, 9, 9, 30, 30, 30, 1, 1);
      if (var3 == 40 && var2.e > 0 && var2.idBuy >= 196 && var2.idBuy <= 200) {
         int var10 = var2.e;
         this.c.S = var10;
      } else if (var3 == 40 || var3 == 38 || var3 == 18 || var3 == 36 || var3 == 32 || var3 == 33 || var3 == 34 || var2.id == 826) {
         var7.b(true);
         var8.b(true);
         this.c.a(true);
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
      b(var1, this.N.cx, this.N.cy, this.d, this.b);
      vdtt_dd.b(vdtt_dd.d, var1, this.d.getItemTemplate().name, 44, 15, 0, -1, -16777216);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.aI, 44, 30, 0, -10831436, -16777216);
      vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(this.d.c()), 64, 30, 0, -1, -16777216);
      a(var1, 64, 30, Utlis.c(this.d.c()), this.M);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.aM, 9, 55, 0, -10831436, -16777216);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.aN, 9, 75, 0, -10831436, -16777216);
      a(var1, 54, 75, Utlis.c(this.O), this.M);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.aO, 9, 95, 0, -10831436, -16777216);
      if (this.d.m <= 0 && this.d.n <= 0) {
         vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(this.O), 54, 75, 0, -3089954, -16777216);
         vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(this.Q), 54, 95, 0, -3089954, -16777216);
      } else {
         vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(this.O), 54, 75, 0, -2560, -16777216);
         vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(this.Q), 54, 95, 0, -2560, -16777216);
      }

      a(var1, 54, 95, Utlis.c(this.Q), this.M);
      if (!this.P && (this.R == 0 || this.R % 10 > 5)) {
         vdtt_dd.b(vdtt_dd.d, var1, Caption.bf + " " + this.d.f(), 9, 113, 0, -65536, -16777216);
      }

   }

   public final void a_() {
      this.P = true;
      this.O = this.c.h() * this.d.c();
      if (this.O < 0) {
         this.c.a(0);
      } else {
         if (this.d.m > 0) {
            this.Q = Utlis.c(Char.gI().vang);
            if (Char.gI().vang < this.O) {
               this.P = false;
            }
         } else if (this.d.n > 0) {
            this.Q = Utlis.c(Char.gI().vangKhoa);
            if (Char.gI().vangKhoa < this.O) {
               this.P = false;
            }
         } else if (this.d.k > 0) {
            this.Q = Utlis.c(Char.gI().bac);
            if (Char.gI().bac < this.O) {
               this.P = false;
            }
         } else if (this.d.l > 0) {
            this.Q = Utlis.c(Char.gI().bacKhoa);
            if (Char.gI().bacKhoa < this.O) {
               this.P = false;
            }
         } else if (this.d.o > 0) {
            this.Q = "" + GameSrc.gI().bU;
            if (GameSrc.gI().bU < this.O) {
               this.P = false;
            }
         }

         if (this.R > 0) {
            --this.R;
         }

         DataCenter.gI();
         if (!DataCenter.b() && GameSrc.gI().idTask == 3 && GameSrc.gI().idStep == 0) {
            int var1;
            if (this.O >= 3) {
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
      (var1 = super.g()).addElement(this.N.a(1000, this));
      var1.addElement(new vdtt_hi(0, 0, 0, this.width, this.height, this.I, this));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.b = false;
      switch(var1.b) {
      case 1000:
         this.b = true;
         this.k = a(this, var1, this.d);
         return;
      case 1001:
         this.c.a(this.c.h() - 1);
         if (this.c.h() < this.c.R) {
            this.c.a(this.c.R);
            return;
         }
         break;
      case 1002:
         this.c.a(this.c.h() + 1);
         return;
      case 1003:
         if (this.O <= 0) {
            return;
         }

         if (!this.P) {
            this.R = 50;
            return;
         }

         vdtt_jt var4 = this;

         try {
            Message var5;
            (var5 = new Message((byte)121)).writeShort(var4.d.idBuy);
            var5.writeShort(var4.c.h());
            var5.send();
            return;
         } catch (Exception var6) {
            Utlis.a(var6);
         }
      }

   }
}

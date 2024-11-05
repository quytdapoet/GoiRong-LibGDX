package gro;

import java.util.Vector;

public final class vdtt_me extends vdtt_jo {
   private vdtt_in P;
   public Item[][] N;
   private vdtt_hq[] Q;
   private vdtt_hp[][] R;
   private vdtt_ay[][] S;
   private int T = 102;
   private int U = 50;
   private int V = -1;
   private int W = -1;
   private String[] X;
   public byte O;
   private byte[] Y;
   private boolean[] Z;

   public vdtt_me(MainScreen var1, byte var2, String var3, int var4) {
      super(var1, new String[]{var3});
      this.a(323);
      this.O = var2;
      switch(var2) {
      case 0:
      case 1:
         this.X = Caption.yK;
         this.Y = new byte[]{0, 1};
         break;
      case 2:
      case 3:
         this.X = Caption.yK;
         this.Y = new byte[]{2, 3};
         break;
      case 4:
      case 5:
         this.X = Caption.yK;
         this.Y = new byte[]{4, 5};
      case 6:
      case 7:
      case 31:
      default:
         break;
      case 8:
      case 20:
         if (var4 < 0) {
            this.X = Caption.zO;
            var4 = 0;
         } else {
            this.X = Caption.yJ;
         }

         this.Y = new byte[]{var2, var2, var2, var2, var2};
         break;
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 21:
      case 22:
      case 23:
      case 24:
      case 25:
      case 26:
      case 27:
      case 28:
      case 29:
         this.X = Caption.yJ;
         this.Y = new byte[]{var2, var2, var2, var2, var2};
         break;
      case 18:
         this.X = new String[]{Caption.tZ};
         this.Y = new byte[]{var2};
         break;
      case 19:
      case 30:
      case 35:
      case 37:
      case 38:
         this.X = Caption.yI;
         this.Y = new byte[]{37, 38, 19, 30, 35};
         break;
      case 32:
         this.X = new String[]{Caption.ub};
         this.Y = new byte[]{var2};
         break;
      case 33:
         this.X = new String[]{Caption.uc};
         this.Y = new byte[]{var2};
         break;
      case 34:
         this.X = new String[]{Caption.bb};
         this.Y = new byte[]{var2};
         break;
      case 36:
         this.X = new String[]{Caption.ua};
         this.Y = new byte[]{var2};
      }

      this.H = var1;
      this.J = false;
      this.P = new vdtt_in(new vdtt_hm(1001, this.X), this);
      this.Z = new boolean[this.X.length];
      this.N = new Item[this.X.length][];
      this.S = new vdtt_ay[this.X.length][];
      this.R = new vdtt_hp[this.X.length][];
      this.Q = new vdtt_hq[this.X.length];
      this.P.a(var4);
      this.g(this.P.h());
      this.C();
   }

   public final void g(int var1) {
      if (this.N[this.P.h()] == null) {
         this.Z[var1] = false;
         this.N[var1] = new Item[GameSrc.gI().Z.size()];
         int var2;
         int var3;
         int var4;
         int var5;
         int var6;
         if (!DataCenter.k()) {
            this.Q[var1] = new vdtt_hq((byte)1, 10, this.f() + 15 + 22, this.T * 3, this.U * 3, this.U, Utlis.c(this.N[var1].length, 3), 3);
            this.S[var1] = new vdtt_ay[this.N[var1].length];
            this.R[var1] = new vdtt_hp[this.N[var1].length];
            var4 = 0;

            for(var5 = 0; var5 < this.Q[var1].i; ++var5) {
               var3 = var5 * this.U;

               for(var6 = 0; var6 < this.Q[var1].O; ++var6) {
                  var2 = var6 * this.T;
                  this.N[var1][var4] = (Item)GameSrc.gI().Z.elementAt(var4);
                  this.S[var1][var4] = new vdtt_ay(var2 + 40, var3 + 14, 0, 0, "", this, 1000, this.N[var1][var4].d());
                  this.R[var1][var4] = new vdtt_hu((byte)1, 0, 0, this.S[var1][var5].width, this.S[var1][var5].height, this.S[var1][var5].height, 1, this.Q[var1]);
                  ++var4;
                  if (var4 >= this.S[var1].length) {
                     break;
                  }
               }

               if (var4 >= this.S[var1].length) {
                  break;
               }
            }

            return;
         }

         this.T *= 3;
         this.U = 40;
         this.Q[var1] = new vdtt_hq((byte)1, 10, this.f() + 15 + 7, this.T, this.U * 4, this.U, this.N[var1].length, 1);
         this.S[var1] = new vdtt_ay[this.N[var1].length];
         this.R[var1] = new vdtt_hp[this.N[var1].length];
         var4 = 0;

         for(var5 = 0; var5 < this.Q[var1].i; ++var5) {
            var3 = var5 * this.U;

            for(var6 = 0; var6 < this.Q[var1].O; ++var6) {
               var2 = var6 * this.T;
               this.N[var1][var4] = (Item)GameSrc.gI().Z.elementAt(var4);
               this.S[var1][var4] = new vdtt_ay(var2 + this.T - 60, var3 + 8, 0, 0, "", this, 1000, this.N[var1][var4].d());
               this.R[var1][var4] = new vdtt_hu((byte)1, 0, 5, this.S[var1][var5].width, this.S[var1][var5].height, this.S[var1][var5].height, 1, this.Q[var1]);
               ++var4;
               if (var4 >= this.S[var1].length) {
                  break;
               }
            }

            if (var4 >= this.S[var1].length) {
               break;
            }
         }
      }

   }

   public final void f(int var1) {
      super.f(var1);
      if (this.P != null && super.a.b == 0) {
         this.P.a(this.P.h());
         this.C();
      }

   }

   private void C() {
      this.V = this.W = -1;
      this.O = this.Y[this.P.h()];
      if (this.N[this.P.h()] == null) {
         this.Z[this.P.h()] = true;
         switch(this.O) {
         case 8:
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
            GameSrc.gI();
            GameSrc.i(this.O, this.P.h() + 1);
            return;
         case 18:
         case 19:
         default:
            GameSrc.gI();
            GameSrc.o(this.O);
         }
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      super.b(var1);
      if (super.a.b == 0) {
         if (!DataCenter.k()) {
            this.P.a(var1);
         }

         if (this.Z[this.P.h()]) {
            return;
         }

         if (this.N[this.P.h()].length == 0) {
            vdtt_dd.a(vdtt_dd.e, var1, Caption.vO, this.width / 2, this.height / 2 + 10, 2, -2560, 2, 1);
            return;
         }

         if (this.O == 38) {
            vdtt_dd.a(var1, Caption.xx, 4 + (super.width - 8) / 2, this.height - 16, 2, -2560);
         }

         this.a(var1, this.Q[this.P.h()]);
         int var2 = 0;

         for(int var3 = 0; var3 < this.Q[this.P.h()].i; ++var3) {
            int var4 = var3 * this.U;

            for(int var5 = 0; var5 < this.Q[this.P.h()].O; ++var5) {
               int var6 = var5 * this.T;
               if (this.Q[this.P.h()].b(var3)) {
                  var1.c(-2965602);
                  this.a(var1, var6, var4, this.T - 2, this.U - 2, 61, 55, 56);
                  var1.f();
                  b(var1, var6 + 5, var4 + 5, this.N[this.P.h()][var2], this.V == var2);
                  int var7 = var1.e;
                  int var8 = var1.f;
                  if (DataCenter.k()) {
                     vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Utlis.a(this.N[this.P.h()][var2].getItemTemplate().name, 28), var6 + 40, var4 + 11, 0, -6488, -10275328);
                     vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.aI + " " + Utlis.c(this.N[this.P.h()][var2].c()), var6 + 40, var4 + 23, 0, -1, -11184811);
                     this.a(var1, var7 + this.S[this.P.h()][var2].cx, var8 + this.S[this.P.h()][var2].cy);
                  } else {
                     vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Utlis.a(this.N[this.P.h()][var2].getItemTemplate().name, 28), var6 + 5, var4 + 39, 0, -6488, -10275328);
                     this.a(var1, var7 + this.S[this.P.h()][var2].cx, var8 + this.S[this.P.h()][var2].cy);
                     vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.aI + " " + Utlis.c(this.N[this.P.h()][var2].c()), 0, -6, 0, -1, -11184811);
                  }

                  this.S[this.P.h()][var2].b(var1);
                  this.a(var1, var7, var8);
               }

               ++var2;
               if (var2 >= this.S[this.P.h()].length) {
                  break;
               }
            }

            if (var2 >= this.S[this.P.h()].length) {
               break;
            }
         }

         this.a(var1);
         this.Q[this.P.h()].b(var1, this);
      }

   }

   public final void a_() {
      if (!DataCenter.k()) {
         super.a_();
      }

      if (super.a.b == 0) {
         this.P.e();
         if (this.Z[this.P.h()]) {
            return;
         }

         this.Q[this.P.h()].a();

         int var1;
         for(var1 = 0; var1 < this.S[this.P.h()].length; ++var1) {
            this.S[this.P.h()][var1].a_();
            this.R[this.P.h()][var1].a();
            if (this.R[this.P.h()][var1].l != -1) {
               this.S[this.P.h()][var1].M = true;
            } else {
               this.S[this.P.h()][var1].M = false;
            }
         }

         if (GameSrc.gI().idTask == 3 && (this.O == 4 || this.O == 5)) {
            if (GameSrc.gI().idStep == 0) {
               var1 = this.cx + 80;
               DataCenter.gI().pointHelper.a(var1, this.cy + 80);
               DataCenter.gI().pointHelper.b = true;
               return;
            }

            if (GameSrc.gI().idStep == 1) {
               DataCenter.gI().pointHelper.a(this.cx + this.width - 10, this.cy + 10);
               DataCenter.gI().pointHelper.b = true;
            }
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         if (this.Z[this.P.h()]) {
            var1.addElement(this.P.f());
            return var1;
         } else {
            for(int var2 = 0; var2 < this.S[this.P.h()].length; ++var2) {
               int var3 = this.Q[this.P.h()].cx + this.S[this.P.h()][var2].cx;
               int var4 = this.Q[this.P.h()].cy + this.S[this.P.h()][var2].cy - this.Q[this.P.h()].f;
               if (Utlis.a(this.Q[this.P.h()].cx, this.Q[this.P.h()].cy, this.Q[this.P.h()].cx + this.Q[this.P.h()].width, this.Q[this.P.h()].cy + this.Q[this.P.h()].height, var3, var4) && Utlis.a(this.Q[this.P.h()].cx, this.Q[this.P.h()].cy, this.Q[this.P.h()].cx + this.Q[this.P.h()].width, this.Q[this.P.h()].cy + this.Q[this.P.h()].height, var3 + this.S[this.P.h()][var2].width, var4 + this.S[this.P.h()][var2].height)) {
                  this.R[this.P.h()][var2].cx = (short)var3;
                  this.R[this.P.h()][var2].cy = (short)var4;
                  var1.addElement(new vdtt_hi(2000 + var2, this.R[this.P.h()][var2].cx, this.R[this.P.h()][var2].cy, this.R[this.P.h()][var2].cx + this.R[this.P.h()][var2].width, this.R[this.P.h()][var2].cy + this.R[this.P.h()][var2].height, this.R[this.P.h()][var2], this));
                  if (DataCenter.k()) {
                     var3 = this.Q[this.P.h()].cx + 40;
                     var1.addElement(new vdtt_hi(3000 + var2, var3 - 35, var4 - 3, var3 - 35 + 28, var4 - 3 + 28, this.Q[this.P.h()], this));
                  } else {
                     var1.addElement(new vdtt_hi(3000 + var2, var3 - 35, var4 - 9, var3 - 35 + 28, var4 - 9 + 28, this.Q[this.P.h()], this));
                  }
               }
            }

            if (!DataCenter.k()) {
               var1.addElement(this.P.f());
            }

            var1.addElement(new vdtt_hi(1002, this.Q[this.P.h()].cx, this.Q[this.P.h()].cy, this.Q[this.P.h()].cx + this.Q[this.P.h()].width, this.Q[this.P.h()].cy + this.Q[this.P.h()].height, this.Q[this.P.h()], this));
            return var1;
         }
      } else {
         return var1;
      }
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      try {
         super.a(var1, var2, var3);
         if (super.a.b == 0) {
            this.V = this.W = -1;
            if (!this.Z[this.P.h()]) {
               if (var1.b >= 3000) {
                  this.V = var1.b - 3000;
                  this.k = c(this, var1, this.N[this.P.h()][this.V]);
               } else if (var1.b >= 2000) {
                  this.W = var1.b - 2000;
                  this.H.a((vdtt_w)(new vdtt_jt(this.H, this.N[this.P.h()][this.W], this.O)));
               }
            }

            switch(var1.b) {
            case 1001:
               if (var1.j.k >= 0) {
                  this.P.a(var1.j.k);
                  this.C();
               }
            }
         }
      } catch (Exception var5) {
      }

   }
}

package gro;

import java.util.Vector;

public class vdtt_ka extends vdtt_ao {
   public vdtt_by N;
   public vdtt_in O;
   public vdtt_be P;
   public vdtt_bb Q;
   public vdtt_ba[] R;
   private static int S = 0;
   private final vdtt_ay T;
   private boolean U;

   public vdtt_ka(MainScreen var1, int var2, String[] var3) {
      super(var1);
      GameSrc.gI().br = this;
      this.J = false;
      this.a(300);
      vdtt_hm var4;
      (var4 = new vdtt_hm(5000)).c = new String[var3.length + 1];

      for(int var5 = 0; var5 < var3.length; ++var5) {
         var4.c[var5] = var3[var5];
      }

      var4.c[var4.c.length - 1] = Caption.r;
      if (var4.c.length <= 3) {
         this.a(var4, 170, 88, var4.c.length);
      } else {
         this.a(var4, 170, 66, var4.c.length);
      }

      this.O = new vdtt_in(new vdtt_hm(5005, Caption.yr), this);
      this.O.setXY(this.O.cx, this.height - 55);
      this.N = this.a(72, this.height - 30, this.width - 165, "", this, 5002, 0);
      byte var11 = 80;
      this.N.l = var11;
      this.N.height = 20;
      this.N.T = true;
      this.a(this.N, this.w());
      this.P = a(10, this.height - 29, 9, this, 6001);
      this.P.n.b = var2;
      this.a(this.P);
      this.a(this.P, this.w());
      vdtt_ay var6 = this.a(this.width - 88, this.height - 27, "", this, 5002, 33);
      this.a(var6, this.w());
      var6 = this.a(52, this.height - 27, "", this, 5003, 38);
      if (Utlis.c() > GameSrc.gI().timeChatColor) {
         GameSrc.gI().cJ = -1;
         GameSrc.gI().cK = "";
      }

      this.a(var6, this.w());
      this.T = this.a(this.width - 68, this.height - 27, "", this, 5555, 90);
      this.a(this.T, this.w());
      var6 = this.a(32, this.height - 27, "", this, 5006, -24);
      this.a(var6, this.w());
      var6 = this.a(this.width - 28, this.height - 27, "", this, 5004, 39);
      this.a(var6, this.w());
      this.Q = this.a(this.width - 48, this.height - 27, "", this, 6002);
      vdtt_bb var7 = this.Q;
      boolean var8 = GameSrc.gI().bG;
      var7.m = var8;
      this.a(this.Q, this.w());
      this.R = new vdtt_ba[6];
      this.R[0] = new vdtt_ba(6, this.f() + 6, super.width - 8 - 7, 144, this, (byte)0, 5006, 16);
      this.R[1] = new vdtt_ba(6, this.f() + 6, super.width - 8 - 7, 144, this, (byte)1, 5006, 16);
      this.R[2] = new vdtt_ba(6, this.f() + 6, super.width - 8 - 7, 144, this, (byte)2, 5006, 16);
      this.R[3] = new vdtt_ba(6, this.f() + 6, super.width - 8 - 7, 144, this, (byte)3, 5006, 16);
      this.R[4] = new vdtt_ba(6, this.f() + 6, super.width - 8 - 7, 144, this, (byte)4, 5006, 16);
      this.R[5] = new vdtt_ba(6, this.f() + 6, super.width - 8 - 7, 144, this, (byte)5, 5006, 16);

      for(int var9 = 0; var9 < this.R.length; ++var9) {
         this.a(this.R[var9]);
      }

      try {
         if (this.Q.m) {
            this.U = true;
         }
      } catch (Exception var10) {
      }

   }

   public void b(int var1, Object var2) {
   }

   public void b(Graphics var1) {
      super.b(var1);
      if (super.a.b == this.w()) {
         this.O.a(var1);
      }

      if (this.U) {
         this.U = false;

         for(int var2 = 0; var2 < this.R.length; ++var2) {
            this.R[var2].h();
         }
      }

   }

   public Vector g() {
      Vector var1 = super.g();
      if (this.w() <= 0) {
         var1.removeElementAt(0);
      }

      if (super.a.b == this.w()) {
         var1.addElement(this.O.f());
      }

      return var1;
   }

   public void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (super.a.b == this.w()) {
         switch(var1.b) {
         case 5000:
            return;
         case 5001:
            return;
         case 5002:
            GameSrc.gI().a(this.N);
            return;
         case 5003:
            if (Utlis.c() > GameSrc.gI().timeChatColor) {
               this.H.c(Caption.sq, -1);
               return;
            }

            this.k = new vdtt_bj(var1.a.cx, var1.a.cy - 88, 6003, this);
            this.a(this.k);
            return;
         case 5004:
            this.H.a((vdtt_w)(new vdtt_jz(5001, this.H)));
            return;
         case 5005:
            if (var1.j.k >= 0) {
               this.O.a(var1.j.k);
               this.B();
               if (this.O.h() == 1) {
                  vdtt_ba var4 = this.R[this.O.h()];
                  int var5 = 0;

                  while(true) {
                     if (var5 >= var4.H.size()) {
                        if (var4.H.size() > 0) {
                           vdtt_ba.J = ((vdtt_ir)var4.H.firstElement()).b;
                           var4.a(vdtt_ba.J);
                        }
                        break;
                     }

                     if (((vdtt_ir)var4.H.elementAt(var5)).b.equals(vdtt_ba.J)) {
                        break;
                     }

                     ++var5;
                  }
               }

               if (this.Q.m) {
                  this.R[var1.j.k].h();
                  return;
               }
            }
            break;
         case 5006:
            if (Utlis.c() > GameSrc.gI().timeChatColor) {
               GameSrc.gI().cJ = -1;
               GameSrc.gI().cK = "";
               this.H.c(Caption.sq, -1);
               return;
            }

            this.k = new vdtt_bc(var1.a.cx, var1.a.cy - 88, 6010, this);
            this.a(this.k);
            return;
         case 5555:
            vdtt_as.gI().c();
         }
      }

   }

   public void b(int var1, Object var2, vdtt_x var3) {
      if (super.a.b == this.w()) {
         if (var1 != 6002 && var1 != 6009) {
            this.c(this.N);
         }

         this.c(var1, var2);
         switch(var1) {
         case 6001:
            if (this.O.h() != 0 || this.P.n.b != 1 && this.P.n.b != 7 && this.P.n.b != 6 && this.P.n.b != 0 && this.P.n.b != 8) {
               break;
            }

            GameSrc.gI().cw = (byte)this.P.n.b;
            return;
         case 6002:
            mConfig.gI().a(6, this.Q.m);
            if (this.Q.m) {
               this.R[this.O.h()].h();
               this.H.c(Caption.w, -1);
            } else {
               this.H.c(Caption.x, -1);
            }

            GameSrc.gI().bG = this.Q.m;
            return;
         case 6003:
            this.N.d(var2.toString());
            return;
         case 6004:
         case 6005:
         case 6006:
         default:
            break;
         case 6007:
            GameSrc.gI().h(vdtt_ba.K.b);
            return;
         case 6008:
            try {
               GameSrc.gI();
               GameSrc.e(vdtt_ba.K.b);
               return;
            } catch (Exception var5) {
               Utlis.a(var5);
            }
         }
      }

   }

   public void a_() {
      super.a_();

      for(int var1 = 0; var1 < this.R.length; ++var1) {
         this.R[var1].d = true;
         this.R[var1].a_();
      }

      if (super.a.b == this.w()) {
         this.O.e();
         this.R[this.O.h()].d = false;
      }

   }

   public void d() {
      super.d();
      GameSrc.gI().br = null;
   }

   private void B() {
      this.R[this.O.h()].d();
      this.O.b.d = new short[this.O.b.c.length];
      this.C();

      try {
         if (this.Q.m && vdtt_ba.l[this.O.h()].b) {
            vdtt_ba.l[this.O.h()].b = false;
            this.R[this.O.h()].h();
         }
      } catch (Exception var2) {
      }

      if (this.O.h() == 0) {
         this.P.a(GameSrc.gI().cw);
      } else {
         this.g(this.O.h());
      }

      S = this.O.h();
   }

   private void C() {
      for(int var1 = 0; var1 < this.O.b.c.length; ++var1) {
         this.O.b.d[var1] = this.R[var1].f();
      }

   }

   private void g(int var1) {
      if (var1 == 1) {
         this.P.a((byte)5);
      } else if (var1 == 2) {
         this.P.a((byte)3);
      } else if (var1 == 3) {
         this.P.a((byte)4);
      } else if (var1 == 4) {
         this.P.a((byte)2);
      }

   }

   public final void z() {
      vdtt_al var1 = this.k;
      this.O.a(this.O.h());
      this.B();
      if (var1 != null) {
         this.a(var1);
         this.k = var1;
      }

   }

   public void f(int var1) {
      super.f(var1);
      if (super.a.b == this.w()) {
         this.O.a(S);
         this.B();
      }

   }

   public final void A() {
      this.I = null;
      this.O.d();
   }
}

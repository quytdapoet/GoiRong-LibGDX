package gro;

import java.util.Vector;

public final class vdtt_mr extends vdtt_ao {
   public vdtt_in N;
   public vdtt_hp O;
   private Vector W = new Vector();
   private vdtt_hj[] X;
   private boolean Y;
   private int Z;
   private vdtt_hp[] aa = new vdtt_hp[3];
   private int ab;
   private Item ac = null;
   public int P;
   public long Q;
   public String R = "";
   public int S;
   private String[] ad = new String[]{""};
   public vdtt_iv[] T = new vdtt_iv[0];
   public Vector U = new Vector();
   public int V;

   public vdtt_mr(MainScreen var1) {
      super(var1);
      this.aa[0] = new vdtt_hp((byte)1, 13, this.f() + 8, super.width - 8 - 18, 162, 27, 0);
      this.aa[1] = new vdtt_hp((byte)1, 13, this.f() + 45, super.width - 8 - 18, 120, 15, 0);
      this.aa[2] = new vdtt_hp((byte)1, 13, this.f() + 8, super.width - 8 - 18, 27, 27, 1);
      vdtt_hm var2 = new vdtt_hm(5000);
      if (GameSrc.gI().mapID != 47 && GameSrc.gI().mapID != 48) {
         var2.c = new String[]{Caption.ul};
      } else {
         var2.c = new String[]{Caption.ud};
      }

      this.a(315);
      this.a(var2, 170, 72, 4);
      this.J = false;
      this.N = new vdtt_in(new vdtt_hm(1001, this.ad), this);
      this.O = new vdtt_hp((byte)1, 4, this.N.i() + 30, super.width - 8, 144, 18, 0);
      this.f(0);
      z();
   }

   public final void f(int var1) {
      super.f(var1);
   }

   private static void z() {
      try {
         Message var0;
         (var0 = new Message((byte)-22)).writeByte(0);
         var0.writeByte(0);
         var0.send();
      } catch (Exception var1) {
         Utlis.a(var1);
      }

   }

   public final void a_() {
      this.N.e();
      this.O.a();
      int var1;
      if ((var1 = this.P - (int)((Utlis.a() - this.Q) / 1000L)) < 0) {
         var1 = 0;
      }

      String var2 = "";
      if (this.S >= 2 && this.S <= 6) {
         if (this.S == 2) {
            var2 = Utlis.b(Caption.uf, Utlis.i(var1));
         } else if (this.S == 3) {
            var2 = Utlis.b(Caption.ug, Utlis.i(var1));
         } else if (this.S == 4) {
            var2 = Utlis.b(Caption.uh, Utlis.i(var1));
         } else if (this.S == 5) {
            var2 = Utlis.b(Caption.ui, Utlis.i(var1));
         } else if (this.S == 6) {
            var2 = Utlis.b(Caption.uj, Utlis.i(var1));
         }
      } else {
         var2 = Caption.gk + Utlis.i(var1);
      }

      this.ad[0] = Utlis.b(var2, Utlis.g(var1));

      for(var1 = 0; var1 < this.aa.length; ++var1) {
         if (this.aa[var1] != null) {
            this.aa[var1].a();
         }
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      this.c(var1, var2);
      switch(var1) {
      case 1002:
         z();
         return;
      case 2005:
         try {
            Message var4;
            (var4 = Message.c((byte)-15)).writeByte(((vdtt_hm)var2).a);
            var4.send();
            return;
         } catch (Exception var5) {
         }
      default:
      }
   }

   public final void b(int var1, Object var2) {
   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 3) {
         if (!this.Y) {
            var1.addElement(this.aa[0].a(9980, this));
         } else {
            var1.addElement(this.aa[2].a(9981, this));
            var1.addElement(new vdtt_hi(1030, this.aa[2].cx, this.aa[2].cy - 12, this.aa[2].cx + this.aa[2].width, this.aa[1].cy, this.aa[1], this));
            var1.addElement(new vdtt_hi(1030, this.aa[1].cx, this.aa[1].cy + this.aa[1].height, this.aa[1].cx + this.aa[1].width, this.aa[1].cy + this.aa[1].height + 20, this.aa[1], this));
            Vector var2 = new Vector();

            int var3;
            for(var3 = 0; var3 < this.X[this.Z].f.size(); ++var3) {
               for(int var4 = 0; var4 < ((Vector)this.X[this.Z].f.get(var3)).size(); ++var4) {
                  Item var5 = (Item)((Vector)this.X[this.Z].f.get(var3)).get(var4);
                  int var6 = this.aa[1].cx + 4 + var4 * 35;
                  int var7 = this.aa[1].cy - this.aa[1].f + (this.ab + var3 * 3) * this.aa[1].h + 15;
                  if (this.aa[1].b(this.ab + var3 * 3 + 3)) {
                     vdtt_hi var8 = new vdtt_hi(6000, var6, var7, var6 + 28, var7 + 28, this.aa[1], this, var5);
                     var2.add(var8);
                  }
               }
            }

            for(var3 = var2.size() - 1; var3 >= 0; --var3) {
               if (((vdtt_hi)var2.get(var3)).d >= this.aa[1].cy + this.aa[1].height) {
                  var2.remove(var3);
               }
            }

            var1.addAll(var2);
            var1.add(this.aa[1].a(1030, this));
         }
      } else {
         var1.addElement(this.N.f());
         var1.addElement(this.O.a(1003, this));
      }

      return var1;
   }

   public final void b(Graphics var1) {
      try {
         super.b(var1);
         this.N.a(var1);
         this.b(var1, this.O);
         this.a(var1, 8, -24, this.O.width - 16, 21, -11, 22, 23, 1, 1);
         if (this.S <= 2) {
            this.f(var1);
            return;
         }

         Graphics var2 = var1;
         vdtt_mr var3 = this;
         vdtt_dd.b(vdtt_dd.e, var1, Caption.pz, 40, -15, 2, -10831436, -16777216);
         vdtt_dd.b(vdtt_dd.e, var1, Caption.kD, 100, -15, 2, -10831436, -16777216);
         vdtt_dd.b(vdtt_dd.e, var1, Caption.kD, this.width - 100, -15, 2, -10831436, -16777216);
         vdtt_dd.b(vdtt_dd.e, var1, Caption.pz, this.width - 40, -15, 2, -10831436, -16777216);
         this.a(var1, this.O);

         for(int var4 = 0; var4 < var3.O.i; ++var4) {
            if (var3.O.b(var4)) {
               vdtt_fz var5 = (vdtt_fz)var3.U.get(var4);
               vdtt_dd.b(vdtt_dd.d, var2, "" + var5.c, 40, 8 + var4 * var3.O.h, 2, -3604601, -16777216);
               vdtt_dd.b(vdtt_dd.d, var2, "" + var5.d, var3.width - 40, 8 + var4 * var3.O.h, 2, -3604601, -16777216);
               vdtt_dd.b(vdtt_dd.d, var2, var5.a, 100, 8 + var4 * var3.O.h, 2, -3604601, -16777216);
               vdtt_dd.b(vdtt_dd.d, var2, var5.b, var3.width - 100, 8 + var4 * var3.O.h, 2, -3604601, -16777216);
               if (var5.e == 1) {
                  vdtt_dd.b(vdtt_dd.d, var2, Caption.lp, var3.width / 2, 8 + var4 * var3.O.h, 2, -6488, -16777216);
               } else if (var5.e == 2) {
                  vdtt_dd.b(vdtt_dd.d, var2, Caption.lq, var3.width / 2, 8 + var4 * var3.O.h, 2, -6488, -16777216);
               } else {
                  vdtt_dd.b(vdtt_dd.d, var2, "VS", var3.width / 2, 8 + var4 * var3.O.h, 2, -6488, -16777216);
               }
            }
         }

         var3.a(var2);
         var3.O.a(var2, var3);
      } catch (Exception var6) {
      }

   }

   private void f(Graphics var1) {
      vdtt_dd.b(vdtt_dd.e, var1, Caption.cL, 24, -15, 2, -6488, -10275328);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.ue, 70, -15, 2, -6488, -10275328);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.tW, 140, -15, 2, -6488, -10275328);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.pz, 208, -15, 2, -6488, -10275328);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.kK, 268, -15, 2, -6488, -10275328);
      this.a(var1, this.O);

      for(int var2 = 0; var2 < this.O.i; ++var2) {
         if (this.O.b(var2)) {
            vdtt_iv var3 = this.T[var2];
            vdtt_dd.b(vdtt_dd.d, var1, "" + (var2 + 1), 22, 8 + var2 * this.O.h, 2, -3604601, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, var3.b, 70, 8 + var2 * this.O.h, 2, -3604601, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, var3.a(), 140, 8 + var2 * this.O.h, 2, -3604601, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(var3.e), 208, 8 + var2 * this.O.h, 2, -3604601, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, var3.g, 268, 8 + var2 * this.O.h, 2, -3604601, -16777216);
         }
      }

      this.a(var1);
      this.O.a(var1, this);
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.ac = null;
      switch(var1.b) {
      case 1001:
         return;
      case 1003:
         if (var1.j.k < 0) {
            break;
         }

         if (this.S <= 2) {
            this.a(this.T[var1.j.k].b, var1.j.k, var2, var3);
            return;
         }

         int var4 = var3;
         var3 = var2;
         var2 = var1.j.k;
         this.V = var3;
         Vector var5;
         if ((var3 < 70 || var3 > 150) && (var3 < 180 || var3 > 260)) {
            if (GameSrc.gI().getMapTemplate().type != 19) {
               (var5 = new Vector()).addElement(new vdtt_ir(2005, Caption.pM));
               this.a(var5, "", var2, var3, var4);
            }

            return;
         }

         vdtt_fz var6 = (vdtt_fz)this.U.get(var2);
         String var7 = "";
         if (var3 >= 70 && var3 <= 150) {
            var7 = var6.a;
         } else if (var3 >= 180 && var3 <= 260) {
            var7 = var6.b;
         }

         var5 = new Vector();
         if (!GameSrc.gI().k(var7)) {
            var5.addElement(new vdtt_ir(4001, Caption.N));
         }

         var5.addElement(new vdtt_ir(4002, Caption.J));
         var5.addElement(new vdtt_ir(4003, Caption.cT));
         var5.addElement(new vdtt_ir(4004, Caption.dR));
         if (GameSrc.gI().getMapTemplate().type != 19) {
            var5.addElement(new vdtt_ir(2005, Caption.pM));
         }

         this.a(var5, var7, var2, var3, var4);
         break;
      case 6000:
         this.ac = (Item)var1.k;
         this.k = c(this, var1, this.ac);
         break;
      case 9980:
         if (var1.j.k >= 0) {
            this.Z = var1.j.k;
            String[] var8 = Utlis.a(this.X[this.Z].a[1], "\\n");
            this.W.clear();
            String var9;
            if ((var9 = this.X[this.Z].a()).length() > 0) {
               this.W.add("c#yellow" + var9);
            }

            for(var2 = 0; var2 < var8.length; ++var2) {
               this.W.addAll(vdtt_dd.a(vdtt_dd.d, var8[var2], super.width - 8 - 35));
            }

            this.W.add("c#blue" + Caption.kh);
            this.ab = this.W.size();

            for(var2 = 0; var2 < this.X[this.Z].e.size(); ++var2) {
               this.W.add("c#cyan- " + (String)this.X[this.Z].e.get(var2));
               this.W.add("");
               this.W.add("");
            }

            this.aa[1] = new vdtt_hp((byte)1, 13, this.f() + 45, super.width - 8 - 18, 150, 15, this.W.size());
            this.Y = true;
            return;
         }
         break;
      case 9981:
         this.Y = false;
         return;
      }

   }
}

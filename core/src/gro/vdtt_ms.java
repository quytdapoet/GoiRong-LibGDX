package gro;

import java.util.Vector;

public final class vdtt_ms extends vdtt_ao {
   private static int[] Q = new int[3];
   public static int N;
   public boolean O = true;
   public vdtt_iv[] P = new vdtt_iv[0];
   private vdtt_in R;
   private vdtt_hp S;
   private vdtt_bd T;
   private Vector U = new Vector();
   private vdtt_hj[] V;
   private boolean W;
   private int X;
   private vdtt_hp[] Y = new vdtt_hp[3];
   private int Z;
   private Item aa = null;

   public vdtt_ms(MainScreen var1) {
      super(var1);
      this.Y[0] = new vdtt_hp((byte)1, 13, this.f() + 8, super.width - 8 - 18, 162, 27, 0);
      this.Y[1] = new vdtt_hp((byte)1, 13, this.f() + 45, super.width - 8 - 18, 120, 15, 0);
      this.Y[2] = new vdtt_hp((byte)1, 13, this.f() + 8, super.width - 8 - 18, 27, 27, 1);
      vdtt_hm var2;
      (var2 = new vdtt_hm(5000)).c = Caption.Aq;
      this.a(315);
      this.a(var2, 170, 72, 4);
      this.J = false;
      this.T = this.a(173, 64, 80, Caption.yk.length, new vdtt_hm(1002, Caption.yk), this, 0);
      this.a(this.T, 0);
      this.f(N);
   }

   public final void z() {
      this.S = new vdtt_hp((byte)1, 4, this.R.i() + 30, super.width - 8, 144, 18, this.P.length);
   }

   public final void b(Message var1) {
      try {
         if (this.V == null) {
            this.V = new vdtt_hj[var1.readByte()];

            for(int var2 = 0; var2 < this.V.length; ++var2) {
               this.V[var2] = new vdtt_hj();
               this.V[var2].a[0] = var1.reader.readUTF();
               this.V[var2].a[1] = var1.reader.readUTF();
               this.V[var2].b = var1.readLong();
               this.V[var2].c = var1.readLong();
               this.V[var2].d = new String[var1.readByte()];
               Vector var3 = new Vector();

               for(int var4 = 0; var4 < this.V[var2].d.length; ++var4) {
                  this.V[var2].d[var4] = var1.readUTF().trim();
                  Item var5;
                  (var5 = new Item()).a(var1);
                  if (var4 == 0) {
                     this.V[var2].e.add(this.V[var2].d[var4]);
                     this.V[var2].f.add(var3);
                  } else if (!this.V[var2].e.contains(this.V[var2].d[var4])) {
                     this.V[var2].e.add(this.V[var2].d[var4]);
                     var3 = new Vector();
                     this.V[var2].f.add(var3);
                  }

                  ((Vector)this.V[var2].f.get(this.V[var2].e.indexOf(this.V[var2].d[var4]))).add(var5);
               }
            }

            vdtt_hp[] var7;
            (var7 = new vdtt_hp[3])[0] = new vdtt_hp((byte)1, 13, this.f() + 8, super.width - 8 - 18, 189, 27, this.V.length);
            var7[1] = new vdtt_hp((byte)1, 13, this.f() + 45, super.width - 8 - 18, 120, 15, 0);
            var7[2] = new vdtt_hp((byte)1, 13, this.f() + 8, super.width - 8 - 18, 27, 27, 1);
            this.Y = var7;
         }
      } catch (Exception var6) {
      }

   }

   public final void f(int var1) {
      super.f(var1);
      if (super.a.b == 3) {
         this.A();
      } else {
         N = var1;
         switch(var1) {
         case 0:
            this.R = new vdtt_in(new vdtt_hm(1001, Caption.yp), this);
            this.R.e[1] = true;
            this.R.a();
            break;
         case 1:
            this.R = new vdtt_in(new vdtt_hm(1001, Caption.zr), this);
            this.R.e[1] = true;
            this.R.e[3] = true;
            this.R.a();
            break;
         case 2:
            this.R = new vdtt_in(new vdtt_hm(1001, Caption.zs), this);
            this.R.e[0] = true;
            this.R.a();
         }

         this.g(Q[var1]);
      }

   }

   private void g(int var1) {
      this.P = new vdtt_iv[0];
      this.z();
      this.R.a(var1);
      this.B();
      if (var1 > 3) {
         this.R.a.a(this.R.b.c.length);
      } else {
         this.R.a.a(0);
      }

   }

   public final void A() {
      if (this.V == null) {
         try {
            Message.c((byte)-57).send();
         } catch (Exception var2) {
            Utlis.a(var2);
         }
      }

   }

   private void B() {
      try {
         Message var1 = new Message((byte)-22);
         switch(super.a.b) {
         case 0:
            var1.writeByte(this.R.h());
            break;
         case 1:
            var1.writeByte(this.R.h() + 6);
            break;
         case 2:
            var1.writeByte(this.R.h() + 20);
         }

         var1.writeByte(this.T.n.b);
         var1.send();
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   public final void a_() {
      if (this.R != null) {
         this.R.e();
         if (this.T != null) {
            this.T.d = true;
            if (super.a.b == 0 && this.R.h() == 0) {
               this.T.d = false;
            }
         }
      }

      this.S.a();

      for(int var1 = 0; var1 < this.Y.length; ++var1) {
         if (this.Y[var1] != null) {
            this.Y[var1].a();
         }
      }

      if (GameSrc.gI().idTask == 5 && GameSrc.gI().idStep == 4) {
         this.y();
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      this.c(var1, var2);
      switch(var1) {
      case 1002:
         this.B();
      default:
      }
   }

   public final void b(int var1, Object var2) {
   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 3) {
         if (!this.W) {
            var1.addElement(this.Y[0].a(9980, this));
         } else {
            var1.addElement(this.Y[2].a(9981, this));
            var1.addElement(new vdtt_hi(1030, this.Y[2].cx, this.Y[2].cy - 12, this.Y[2].cx + this.Y[2].width, this.Y[1].cy, this.Y[1], this));
            var1.addElement(new vdtt_hi(1030, this.Y[1].cx, this.Y[1].cy + this.Y[1].height, this.Y[1].cx + this.Y[1].width, this.Y[1].cy + this.Y[1].height + 20, this.Y[1], this));
            Vector var2 = new Vector();

            int var3;
            for(var3 = 0; var3 < this.V[this.X].f.size(); ++var3) {
               for(int var4 = 0; var4 < ((Vector)this.V[this.X].f.get(var3)).size(); ++var4) {
                  Item var5 = (Item)((Vector)this.V[this.X].f.get(var3)).get(var4);
                  int var6 = this.Y[1].cx + 4 + var4 * 35;
                  int var7 = this.Y[1].cy - this.Y[1].f + (this.Z + var3 * 3) * this.Y[1].h + 15;
                  if (this.Y[1].b(this.Z + var3 * 3 + 3)) {
                     vdtt_hi var8 = new vdtt_hi(6000, var6, var7, var6 + 28, var7 + 28, this.Y[1], this, var5);
                     var2.add(var8);
                  }
               }
            }

            for(var3 = var2.size() - 1; var3 >= 0; --var3) {
               if (((vdtt_hi)var2.get(var3)).d >= this.Y[1].cy + this.Y[1].height) {
                  var2.remove(var3);
               }
            }

            var1.addAll(var2);
            var1.add(this.Y[1].a(1030, this));
         }
      } else {
         var1.addElement(this.R.f());
         if (this.O) {
            var1.addElement(this.S.a(1003, this));
         }
      }

      return var1;
   }

   public final void b(Graphics var1) {
      super.b(var1);
      Graphics var2;
      int var3;
      vdtt_ms var4;
      if (super.a.b == 3) {
         var2 = var1;
         var4 = this;

         try {
            int var11;
            if (var4.W) {
               var4.a(var2, var4.Y[2]);
               var4.a(var2, 0, 0 * var4.Y[2].h, var4.Y[2].width, 26, 46, 22, 23, 1, 1);
               if (var4.Y[2].l == 0) {
                  vdtt_dd.a(var2, var4.V[var4.X].a[0], 26, 13, 0, -1);
                  var2.e(30);
                  vdtt_cz.a(var2, 398, 0, var4.Y[2].width - 21, 5, 20);
                  var2.h();
               } else {
                  vdtt_dd.a(var2, var4.V[var4.X].a[0], 26, 12, 0, -1);
                  vdtt_cz.a(var2, 398, 0, var4.Y[2].width - 22, 4, 20);
               }

               vdtt_cz.a(var2, 396, 0, 15, 0 * var4.Y[2].h + 13, 3);
               var4.a(var2);
               var4.a(var2, var4.Y[1]);

               for(var3 = 0; var3 < var4.Y[1].i; ++var3) {
                  vdtt_dd.c(vdtt_dd.d, var2, (String)var4.U.get(var3), 2, 6 + var3 * var4.Y[1].h, 0, -1, -16777216);
               }

               for(var3 = 0; var3 < var4.V[var4.X].f.size(); ++var3) {
                  for(var11 = 0; var11 < ((Vector)var4.V[var4.X].f.get(var3)).size(); ++var11) {
                     Item var13 = (Item)((Vector)var4.V[var4.X].f.get(var3)).get(var11);
                     b(var2, 4 + var11 * 35, (var4.Z + var3 * 3) * var4.Y[1].h + 15, var13, var4.aa != null && var4.aa.equals(var13));
                  }
               }

               var4.a(var2);
               var4.Y[1].b(var2, var4);
               return;
            }

            var4.a(var2, var4.Y[0]);

            for(var3 = 0; var3 < var4.Y[0].i; ++var3) {
               if (var4.Y[0].b(var3)) {
                  var4.a(var2, 0, var3 * var4.Y[0].h, var4.Y[0].width, 26, 46, 22, 23, 1, 1);
                  vdtt_cz.a(var2, 395, 0, 15, var3 * var4.Y[0].h + 13, 3);
                  var11 = var4.Y[0].l == var3 ? 13 + var3 * var4.Y[0].h : 12 + var3 * var4.Y[0].h;
                  vdtt_dd.a(var2, var4.V[var3].a[0], 26, var11, 0, -1);
                  vdtt_dd var12 = vdtt_dd.d;
                  vdtt_hj var7 = var4.V[var3];
                  long var8 = Utlis.a();
                  vdtt_dd.c(var12, var2, var7.b != -1L && var8 < var7.b ? Caption.oL : (var7.c != -1L && var8 >= var7.c ? Caption.oM : (var7.b != -1L && var7.b <= var8 && var7.c != -1L && var8 < var7.c ? Caption.oN : "")), var4.width - 35, var11, 1, -1, -16777216);
               }
            }

            var4.a(var2);
            var4.Y[0].b(var2, var4);
         } catch (Exception var10) {
         }

      } else {
         this.R.a(var1);
         if (!this.O) {
            vdtt_dd.a(vdtt_dd.e, var1, Caption.nX, this.width / 2, this.height / 2 + 10, 2, -2560, 3, 0);
         } else {
            this.b(var1, this.S);
            var1.c(-2965602);
            this.a(var1, 8, -24, this.S.width - 16, 21, 61, 55, 56);
            var1.f();
            vdtt_dd.b(vdtt_dd.e, var1, Caption.cL, 24, -15, 2, -6488, -10275328);
            switch(super.a.b) {
            case 0:
               var2 = var1;
               var4 = this;
               vdtt_iv var5;
               if (this.R.h() != 4) {
                  vdtt_dd.b(vdtt_dd.e, var1, Caption.kD, 70, -15, 2, -6488, -10275328);
                  switch(this.R.h()) {
                  case 0:
                     vdtt_dd.b(vdtt_dd.e, var1, Caption.tW, 140, -15, 2, -6488, -10275328);
                     break;
                  case 1:
                     vdtt_dd.b(vdtt_dd.e, var1, Caption.yp[1], 140, -15, 2, -6488, -10275328);
                     break;
                  case 2:
                     vdtt_dd.b(vdtt_dd.e, var1, Caption.kG, 140, -15, 2, -6488, -10275328);
                     break;
                  case 3:
                     vdtt_dd.b(vdtt_dd.e, var1, Caption.kH, 140, -15, 2, -6488, -10275328);
                  }

                  vdtt_dd.b(vdtt_dd.e, var1, Caption.kJ, 208, -15, 2, -6488, -10275328);
                  vdtt_dd.b(vdtt_dd.e, var1, Caption.kK, 268, -15, 2, -6488, -10275328);
                  this.a(var1, this.S);

                  for(var3 = 0; var3 < var4.S.i; ++var3) {
                     if (var4.S.b(var3)) {
                        var5 = var4.P[var3];
                        vdtt_dd.b(vdtt_dd.d, var2, "" + (var3 + 1), 22, 8 + var3 * var4.S.h, 2, -1, -16777216);
                        vdtt_dd.b(vdtt_dd.d, var2, var5.b, 70, 8 + var3 * var4.S.h, 2, -1, -16777216);
                        if (var4.R.h() == 0) {
                           vdtt_dd.b(vdtt_dd.d, var2, var5.a(), 140, 8 + var3 * var4.S.h, 2, -1, -16777216);
                        } else {
                           vdtt_dd.b(vdtt_dd.d, var2, Utlis.c(var5.e), 140, 8 + var3 * var4.S.h, 2, -1, -16777216);
                        }

                        int var6 = 8 + var3 * var4.S.h;
                        vdtt_dd.b(vdtt_dd.d, var2, DataCenter.gI().dataNameChar[var5.f].name, 208, var6, 2, -1, -16777216);
                        vdtt_dd.b(vdtt_dd.d, var2, var5.g, 268, 8 + var3 * var4.S.h, 2, -1, -16777216);
                     }
                  }

                  var4.a(var2);
                  var4.S.a(var2, var4);
                  return;
               }

               vdtt_dd.b(vdtt_dd.e, var1, Caption.cM, 70, -15, 2, -6488, -10275328);
               vdtt_dd.b(vdtt_dd.e, var1, Caption.kC, 140, -15, 2, -6488, -10275328);
               vdtt_dd.b(vdtt_dd.e, var1, Caption.ej, 208, -15, 2, -6488, -10275328);
               vdtt_dd.b(vdtt_dd.e, var1, Caption.ek, 268, -15, 2, -6488, -10275328);
               this.a(var1, this.S);

               for(var3 = 0; var3 < var4.S.i; ++var3) {
                  if (var4.S.b(var3)) {
                     if (var3 == var4.S.k) {
                        vdtt_cz.a(var2, 3, var3 * var4.S.h, var4.S.width - 6, var4.S.h);
                     }

                     var5 = var4.P[var3];
                     vdtt_dd.b(vdtt_dd.d, var2, "" + (var3 + 1), 22, 8 + var3 * var4.S.h, 2, -1, -16777216);
                     vdtt_dd.b(vdtt_dd.d, var2, var5.g, 70, 8 + var3 * var4.S.h, 2, -1, -16777216);
                     vdtt_dd.b(vdtt_dd.d, var2, "" + var5.c, 140, 8 + var3 * var4.S.h, 2, -1, -16777216);
                     vdtt_dd.b(vdtt_dd.d, var2, var5.e + "/" + var5.f, 208, 8 + var3 * var4.S.h, 2, -1, -16777216);
                     vdtt_dd.b(vdtt_dd.d, var2, var5.b, 268, 8 + var3 * var4.S.h, 2, -1, -16777216);
                  }
               }

               var4.a(var2);
               var4.S.b(var2, var4);
               break;
            case 1:
               this.f(var1);
               return;
            case 2:
               this.g(var1);
            }

         }
      }
   }

   private void f(Graphics var1) {
      vdtt_dd.b(vdtt_dd.e, var1, Caption.kD, 70, -15, 2, -6488, -10275328);
      switch(this.R.h()) {
      case 0:
         vdtt_dd.b(vdtt_dd.e, var1, Caption.tW, 140, -15, 2, -6488, -10275328);
         break;
      case 1:
         vdtt_dd.b(vdtt_dd.e, var1, Caption.kI, 140, -15, 2, -6488, -10275328);
         break;
      case 2:
         vdtt_dd.b(vdtt_dd.e, var1, Caption.kG, 140, -15, 2, -6488, -10275328);
         break;
      case 3:
         vdtt_dd.b(vdtt_dd.e, var1, Caption.zr[3], 140, -15, 2, -6488, -10275328);
      }

      vdtt_dd.b(vdtt_dd.e, var1, Caption.kJ, 208, -15, 2, -6488, -10275328);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.kK, 268, -15, 2, -6488, -10275328);
      this.a(var1, this.S);

      for(int var2 = 0; var2 < this.S.i; ++var2) {
         if (this.S.b(var2)) {
            vdtt_iv var3 = this.P[var2];
            vdtt_dd.b(vdtt_dd.d, var1, "" + (var2 + 1), 22, 8 + var2 * this.S.h, 2, -1, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, var3.b, 70, 8 + var2 * this.S.h, 2, -1, -16777216);
            if (this.R.h() == 0) {
               vdtt_dd.b(vdtt_dd.d, var1, var3.a(), 140, 8 + var2 * this.S.h, 2, -1, -16777216);
            } else {
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(var3.e), 140, 8 + var2 * this.S.h, 2, -1, -16777216);
            }

            int var4 = 8 + var2 * this.S.h;
            vdtt_dd.b(vdtt_dd.d, var1, DataCenter.gI().dataNameChar[var3.f].name, 208, var4, 2, -1, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, var3.g, 268, 8 + var2 * this.S.h, 2, -1, -16777216);
         }
      }

      this.a(var1);
      this.S.a(var1, this);
   }

   private void g(Graphics var1) {
      vdtt_dd.b(vdtt_dd.e, var1, Caption.Ay[this.R.h()], 140, -15, 2, -6488, -10275328);
      int var2;
      vdtt_iv var3;
      if (this.R.h() == 3) {
         vdtt_dd.b(vdtt_dd.e, var1, Caption.eF, 70, -15, 2, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.e, var1, Caption.kC, 208, -15, 2, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.e, var1, Caption.ek, 268, -15, 2, -6488, -10275328);
         this.a(var1, this.S);

         for(var2 = 0; var2 < this.S.i; ++var2) {
            if (this.S.b(var2)) {
               var3 = this.P[var2];
               vdtt_dd.b(vdtt_dd.d, var1, "" + (var2 + 1), 22, 8 + var2 * this.S.h, 2, -1, -16777216);
               vdtt_dd.b(vdtt_dd.d, var1, var3.g, 70, 8 + var2 * this.S.h, 2, -1, -16777216);
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(var3.e), 140, 8 + var2 * this.S.h, 2, -1, -16777216);
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(var3.c), 208, 8 + var2 * this.S.h, 2, -1, -16777216);
               vdtt_dd.b(vdtt_dd.d, var1, var3.b, 268, 8 + var2 * this.S.h, 2, -1, -16777216);
            }
         }

         this.a(var1);
         this.S.a(var1, this);
      } else {
         vdtt_dd.b(vdtt_dd.e, var1, Caption.kD, 70, -15, 2, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.e, var1, Caption.kJ, 208, -15, 2, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.e, var1, Caption.kK, 268, -15, 2, -6488, -10275328);
         this.a(var1, this.S);

         for(var2 = 0; var2 < this.S.i; ++var2) {
            if (this.S.b(var2)) {
               var3 = this.P[var2];
               vdtt_dd.b(vdtt_dd.d, var1, "" + (var2 + 1), 22, 8 + var2 * this.S.h, 2, -1, -16777216);
               vdtt_dd.b(vdtt_dd.d, var1, var3.b, 70, 8 + var2 * this.S.h, 2, -1, -16777216);
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(var3.e), 140, 8 + var2 * this.S.h, 2, -1, -16777216);
               int var4 = 8 + var2 * this.S.h;
               vdtt_dd.b(vdtt_dd.d, var1, DataCenter.gI().dataNameChar[var3.f].name, 208, var4, 2, -1, -16777216);
               vdtt_dd.b(vdtt_dd.d, var1, var3.g, 268, 8 + var2 * this.S.h, 2, -1, -16777216);
            }
         }

         this.a(var1);
         this.S.a(var1, this);
      }

   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.aa = null;
      switch(var1.b) {
      case 1001:
         if (var1.j.k >= 0) {
            Q[super.a.b] = var1.j.k;
            this.g(var1.j.k);
            return;
         }
         break;
      case 1003:
         if (var1.j.k >= 0) {
            this.a(this.P[var1.j.k].b, var1.j.k, var2, var3);
            return;
         }
         break;
      case 6000:
         this.aa = (Item)var1.k;
         this.k = c(this, var1, this.aa);
         break;
      case 9980:
         if (var1.j.k >= 0) {
            this.X = var1.j.k;
            String[] var4 = Utlis.a(this.V[this.X].a[1], "\\n");
            this.U.clear();
            String var5;
            if ((var5 = this.V[this.X].a()).length() > 0) {
               this.U.add("c#yellow" + var5);
            }

            for(var2 = 0; var2 < var4.length; ++var2) {
               this.U.addAll(vdtt_dd.a(vdtt_dd.d, var4[var2], super.width - 8 - 35));
            }

            this.U.add("c#blue" + Caption.kh);
            this.Z = this.U.size();

            for(var2 = 0; var2 < this.V[this.X].e.size(); ++var2) {
               this.U.add("c#cyan- " + (String)this.V[this.X].e.get(var2));
               this.U.add("");
               this.U.add("");
            }

            this.Y[1] = new vdtt_hp((byte)1, 13, this.f() + 45, super.width - 8 - 18, 150, 15, this.U.size());
            this.W = true;
            return;
         }
         break;
      case 9981:
         this.W = false;
         return;
      }

   }
}

package gro;

import java.util.Vector;

public abstract class vdtt_ak extends vdtt_w {
   public MainScreen H;
   public vdtt_hs I;
   public boolean J;
   public boolean K;
   protected vdtt_ay L;
   private vdtt_ay[] a;
   private static boolean b;
   private long c;
   private vdtt_ay d;
   private vdtt_ay M;

   public vdtt_ak() {
      this.e = 3;
   }

   public int f() {
      return 29;
   }

   public final int h() {
      return !this.J ? this.height - 33 : this.height - 64;
   }

   public final void a(int var1, int var2) {
      this.K = false;
      if (!this.s && var2 < 240) {
         this.setSize(var1, var2);
         vdtt_ap var3 = null;
         if (this.H.c instanceof vdtt_ap) {
            var3 = (vdtt_ap)this.H.c;
         }

         if (var3 != null && var3.s) {
            this.setXY(var3.cx + var3.width / 2 - this.width / 2, var3.cy + 11 + var3.height / 2 - this.height / 2);
         } else {
            this.setXY(DataCenter.gI().n / 2 - this.width / 2, DataCenter.gI().o / 2 - this.height / 2);
         }
      } else {
         this.a(var1);
      }

      if (this.L == null) {
         this.L = this.w();
      }

      if (this.e == 2) {
         this.L.b(52);
         this.L.setXY(var1 - 17, 3);
      } else if (this.s) {
         this.L.b(52);
         this.L.setXY(var1 - 17, 3);
      } else {
         this.L.b(-26);
         this.L.setXY(var1 - 20, 0);
      }

   }

   public final void a(int var1) {
      this.K = false;
      int var2 = 0;
      if (this.u) {
         var2 = (DataCenter.gI().o - this.height) / 2;
      } else {
         int var3 = DataCenter.gI().o;
         this.s = true;
         if (var3 >= 270 && !this.u) {
            if (mConfig.gI().b(29) == 0 && var3 > 240) {
               var3 = 240;
            }

            this.t = true;
            if (var1 < 250) {
               var1 = 250;
            }
         }

         if (var3 > 240 && !this.u) {
            var3 = 240;
         }

         this.setSize(var1, var3);
      }

      if (this.L == null) {
         this.L = this.w();
      }

      if (this.e == 2) {
         this.L.b(52);
         this.L.setXY(var1 - 17, 3);
      } else if (this.s && !this.u) {
         this.L.b(52);
         this.L.setXY(var1 - 17, 3);
      } else {
         this.L.b(-26);
         this.L.setXY(var1 - 20, 0);
      }

      this.i();
      if (mConfig.gI().b(29) == 0) {
         this.setXY(DataCenter.gI().n / 2 - this.width / 2, DataCenter.gI().o / 2 - this.height / 2);
      } else if (mConfig.gI().b(29) == 1) {
         this.setXY(-var1, var2);
         this.a(0, AppListener.gI().m, this.cy);
      } else if (mConfig.gI().b(29) == 2) {
         this.setXY(DataCenter.gI().n - AppListener.gI().m, var2);
         this.a(0, DataCenter.gI().n - var1 - AppListener.gI().m, this.cy);
      }

   }

   protected final void i() {
      int[] var1 = new int[]{5657, 5658, 5659, 5660, 5656};
      int[] var2 = new int[]{5651, 5652, 5653, 5654, 5655};
      int[] var3 = new int[]{674, 675, 676, 677, 673};
      int[] var4 = new int[]{687, 688, 689, 690, 680};
      if (this.a == null) {
         this.a = new vdtt_ay[10];
         if (DataCenter.gI().o < 300) {
            this.M = this.a(0, 0, "", this, 9999, 287);
            this.d = this.a(0, 0, "", this, 9999, 287);
            short var5 = -360;
            this.d.J = var5;
         }
      }

      int var9;
      for(var9 = 0; var9 < 5; ++var9) {
         if (this.a[var9] == null) {
            this.a[var9] = this.a(0, 0, Caption.Bq[var9], this, var1[var9], var3[var9]);
            this.a[var9 + 5] = this.a(0, 0, Caption.Bq[var9 + 5], this, var2[var9], var4[var9]);
         }
      }

      var9 = this.width / 6;
      int var6 = (DataCenter.gI().o - this.height) / 3 + 2;
      int var7;
      if (DataCenter.gI().o >= 300) {
         for(var7 = 0; var7 < 5; ++var7) {
            this.a[var7].setXY(var9 + var7 * var9 - 13, this.height - 20 + var6);
            this.a[var7 + 5].setXY(var9 + var7 * var9 - 13, this.height - 20 + var6 + var6);
         }
      } else {
         var6 = (DataCenter.gI().o - this.height) / 2 + 3;

         for(var7 = 0; var7 < 5; ++var7) {
            if (b) {
               this.a[var7 + 5].setXY(Utlis.n(this.width % var9) + var9 + var7 * var9 - 13, this.height - 20 + var6);
               this.a[var7].setXY(-100, -100);
            } else {
               this.a[var7 + 5].setXY(-100, -100);
               this.a[var7].setXY(Utlis.n(this.width % var9) + var9 + var7 * var9 - 13, this.height - 20 + var6);
            }
         }
      }

      boolean var8 = !this.t || mConfig.gI().b(29) <= 0;
      if (this.d != null) {
         this.d.setXY(11, !b ? this.a[0].cy + Utlis.n(8) : this.a[6].cy + Utlis.n(8));
         this.d.b(var8);
      }

      if (this.M != null) {
         this.M.setXY(this.width - 27, !b ? this.a[0].cy + Utlis.n(8) : this.a[6].cy + Utlis.n(8));
         this.M.b(var8);
      }

      for(var6 = 0; var6 < this.a.length; ++var6) {
         this.a[var6].b(var8);
      }

   }

   public final void j() {
      this.b(this.L);
      this.L = null;
   }

   private vdtt_ay w() {
      if (this.e == 2) {
         return this.a(this.width - 17, 3, "", this, -7, 52);
      } else {
         return this.s ? this.a(this.width - 5, 5, "", this, -7, 49) : this.a(this.width - 5, 5, "", this, -7, -26);
      }
   }

   public final vdtt_ay a(String var1, int var2) {
      return this.a(this.width / 2 - 37, this.height - 29, var1, this, var2, 7);
   }

   public final vdtt_ay b(String var1, int var2) {
      return this.a(this.width / 2 - 65, this.height - 29, var1, this, var2, -8);
   }

   public final vdtt_ay c(String var1, int var2) {
      return this.a(this.width / 2 + 5, this.height - 29, var1, this, var2, -8);
   }

   public final vdtt_bb a(int var1, int var2, String var3, int var4) {
      return this.a(var1, var2, var3, this, var4);
   }

   public void c() {
   }

   private void x() {
      this.s = this.u = this.K = this.t = false;
      this.k();
   }

   public void a(vdtt_hi var1, int var2, int var3) {
      if (this.t) {
         switch(var1.b) {
         case 5651:
            this.x();
            GameSrc.gI();
            GameSrc.o(86);
            vdtt_aa.gI().w();
            break;
         case 5652:
            this.x();
            GameSrc.gI();
            GameSrc.o(88);
            vdtt_aa.gI().w();
            break;
         case 5653:
            this.x();
            GameSrc.gI().a((vdtt_w)(new vdtt_lj(GameSrc.gI())));
            vdtt_aa.gI().w();
            break;
         case 5654:
            this.x();
            GameSrc.gI();
            GameSrc.o(111);
            vdtt_aa.gI().w();
            break;
         case 5655:
            this.x();
            GameSrc.gI().ae();
            vdtt_aa.gI().w();
            break;
         case 5656:
            this.x();
            GameSrc.gI().ad();
            vdtt_aa.gI().w();
            break;
         case 5657:
            this.x();
            GameSrc.gI().a((vdtt_w)(new vdtt_ll(GameSrc.gI())));
            vdtt_aa.gI().w();
            break;
         case 5658:
            this.x();
            GameSrc.gI();
            GameSrc.o(72);
            vdtt_aa.gI().w();
            break;
         case 5659:
            this.x();
            this.H.a((vdtt_w)(new vdtt_mn(GameSrc.gI())));
            vdtt_aa.gI().w();
            break;
         case 5660:
            this.x();
            GameSrc.gI();
            GameSrc.o(54);
            vdtt_aa.gI().w();
            break;
         case 9999:
            if (System.currentTimeMillis() - this.c >= 300L) {
               this.c = System.currentTimeMillis();
               b = !b;
               this.i();
            }

            vdtt_aa.gI().n();
         }
      }

      if (var1.b == -9996 && !this.K) {
         if (DataCenter.gI().pointHelper.b() && (GameSrc.gI().idTask == 5 && GameSrc.gI().idStep < 9 || this instanceof SettingsTab && GameSrc.gI().idTask == 3 && GameSrc.gI().idStep == 0)) {
            return;
         }

         this.k();
         this.d();
      }

   }

   public final void c(int var1, Object var2) {
      vdtt_hm var3;
      switch(var1) {
      case 4001:
         GameSrc.gI();
         GameSrc.g((var3 = (vdtt_hm)var2).f);
         return;
      case 4002:
         GameSrc.gI();
         GameSrc.f((var3 = (vdtt_hm)var2).f);
         return;
      case 4003:
         GameSrc.gI();
         GameSrc.a((String)(var3 = (vdtt_hm)var2).f, (vdtt_w)this);
         return;
      case 4004:
         GameSrc.gI().h((var3 = (vdtt_hm)var2).f);
         return;
      case 4005:
         GameSrc.gI();
      default:
      }
   }

   public Vector g() {
      if (this.n > 0) {
         --this.n;
         if (this.n == 0) {
            this.K = false;
            this.H.a(this.e);
         }
      }

      Vector var1 = new Vector();
      if (this.u) {
         var1.addElement(new vdtt_hi(-9996, 0, -DataCenter.gI().o, DataCenter.gI().n, 0, (vdtt_hp)null, this));
         var1.addElement(new vdtt_hi(-9996, 0, this.height, DataCenter.gI().n, this.height + DataCenter.gI().o, (vdtt_hp)null, this));
         var1.addElement(new vdtt_hi(-9996, this.width, 0, DataCenter.gI().n, DataCenter.gI().o * 2, (vdtt_hp)null, this));
         if (this.K && this.l == null) {
            this.K = false;
            this.H.a(this.e);
         }
      } else if (!this.s) {
         if (this.I == null) {
            this.I = new vdtt_hs((byte)0, 0, 0, this.width, 28, 1, 1);
            this.I.M = this;
         }

         if (this.e != 2) {
            var1.addElement(new vdtt_hi(-9999, 0, 0, this.I.width, this.I.height, this.I, this));
            if (this.J) {
               var1.addElement(new vdtt_hi(-9999, 0, this.height - 32, this.I.width, this.height, this.I, this));
            }
         }
      } else {
         if (mConfig.gI().b(29) == 1) {
            var1.addElement(new vdtt_hi(-9996, this.width, 0, DataCenter.gI().n, DataCenter.gI().o, (vdtt_hp)null, this));
         } else if (mConfig.gI().b(29) == 2) {
            var1.addElement(new vdtt_hi(-9996, -DataCenter.gI().n, 0, 0, DataCenter.gI().o, (vdtt_hp)null, this));
         } else {
            if (this.I == null) {
               this.I = new vdtt_hs((byte)0, 0, 0, this.width, 28, 1, 1);
               this.I.M = this;
            }

            var1.addElement(new vdtt_hi(-9999, 0, 0, this.I.width, this.I.height, this.I, this));
         }

         if (this.K && this.l == null) {
            this.K = false;
            this.H.a(this.e);
         }
      }

      return var1;
   }

   public final void b(Vector var1) {
      if (this.n > 0) {
         --this.n;
         if (this.n == 0) {
            this.K = false;
            this.H.a(this.e);
         }
      }

      if (this.u) {
         var1.addElement(new vdtt_hi(-9996, 0, -DataCenter.gI().o, DataCenter.gI().n, 0, (vdtt_hp)null, this));
         var1.addElement(new vdtt_hi(-9996, 0, this.height, DataCenter.gI().n, this.height + DataCenter.gI().o, (vdtt_hp)null, this));
         var1.addElement(new vdtt_hi(-9996, this.width, 0, DataCenter.gI().n, DataCenter.gI().o * 2, (vdtt_hp)null, this));
         if (this.K && this.l == null) {
            this.K = false;
            this.H.a(this.e);
            return;
         }
      } else if (!this.s) {
         if (this.I == null) {
            this.I = new vdtt_hs((byte)0, 0, 0, this.width, 28, 1, 1);
            this.I.M = this;
         }

         var1.addElement(new vdtt_hi(-9999, 0, 0, this.I.width, this.I.height, this.I, this));
         if (this.J) {
            var1.addElement(new vdtt_hi(-9999, 0, this.height - 32, this.I.width, this.height, this.I, this));
            return;
         }
      } else {
         if (mConfig.gI().b(29) == 0) {
            if (this.I == null) {
               this.I = new vdtt_hs((byte)0, 0, 0, this.width, 28, 1, 1);
               this.I.M = this;
            }

            var1.addElement(new vdtt_hi(-9999, 0, 0, this.I.width, this.I.height, this.I, this));
         }

         if (mConfig.gI().b(29) == 1) {
            var1.addElement(new vdtt_hi(-9996, this.width, 0, DataCenter.gI().n, DataCenter.gI().o, (vdtt_hp)null, this));
         } else if (mConfig.gI().b(29) == 2) {
            var1.addElement(new vdtt_hi(-9996, -DataCenter.gI().n, 0, 0, DataCenter.gI().o, (vdtt_hp)null, this));
         }

         if (this.K && this.l == null) {
            this.K = false;
            this.H.a(this.e);
         }
      }

   }

   public final void a(int var1, Object var2, vdtt_x var3) {
      if (var3 instanceof vdtt_k) {
         vdtt_k var4 = (vdtt_k)var3;
         switch(var1) {
         case -11:
            this.q();
            return;
         case -10:
            AppListener.gI();
            AppListener.i();
            return;
         case -9:
            if (DataCenter.gI().currentScreen instanceof LoginPCScreen) {
               this.k();
               return;
            }

            vdtt_cd var5;
            (var5 = LoginPCScreen.v()).b(1000);
            DataCenter.gI().currentScreen = var5;
            return;
         case -8:
         case -6:
         case -5:
         case -4:
         case -3:
         case -1:
            this.H.a(var1, var2, var3);
            return;
         case -7:
            this.k();
            return;
         case -2:
         default:
            if (var2 == null) {
               var4.a.a(new vdtt_hi(var1, 0, 0, 0, 0, (vdtt_hp)null, var3), 0, 0);
               return;
            }

            var4.a.b(var1, var2, var3);
         }
      }

   }

   public void a(int var1, Object var2) {
   }

   public void k() {
      this.d();
      if (!this.s && !this.u) {
         this.H.a(this.e);
      } else {
         if (mConfig.gI().b(29) == 1) {
            this.a(0, -this.width, this.cy);
         } else if (mConfig.gI().b(29) == 2) {
            this.a(0, DataCenter.gI().n, this.cy);
         }

         this.K = true;
         if (this.l != null) {
            this.l.a = true;
         }

         this.n = 50;
      }

   }

   public final void v() {
      this.d();
      this.H.a(this.e);
   }

   public void d() {
   }
}

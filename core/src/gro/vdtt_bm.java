package gro;

import java.util.Vector;

public final class vdtt_bm extends vdtt_al {
   public vdtt_bl l;
   private int n;
   private int H;
   private int I = 157;
   private int J = 50;
   public boolean m;
   private vdtt_ay[] K = new vdtt_ay[5];
   private vdtt_hp[] L = new vdtt_hp[3];
   private static Item M;
   private static long N;
   private static long O;
   private boolean P;

   public vdtt_bm(int var1, int var2, vdtt_bl var3) {
      this.l = var3;
      this.l.l = this;
      this.setSize(var3.width, var3.height);
      this.a = var3.a;
      this.n = var1;
      this.H = var2;
      vdtt_bl var4 = var3;
      var2 = 0;

      vdtt_ay var5;
      while(true) {
         if (var2 >= var4.m.length) {
            var5 = null;
            break;
         }

         if (var4.m[var2].l.equals(Caption.bI) || var4.m[var2].l.equals(Caption.bm) && (var4.m.length > 2 || var4.a instanceof vdtt_jr) || var4.m[var2].l.equals(Caption.bn) && (var4.m.length > 2 || var4.a instanceof vdtt_jr)) {
            var5 = var4.m[var2];
            break;
         }

         ++var2;
      }

      O = System.currentTimeMillis();
      Item var7 = var3.H;
      if (var5 != null) {
         if (var7.h != -1L) {
            this.J += 15;
         }

         if (!var7.i() && var7.strData.length() > 0) {
            this.I += 20;
            this.J += 18;
         }

         vdtt_w var8;
         ItemOption[] var9;
         int var10;
         if (((var8 = GameSrc.gI().c) instanceof vdtt_km || var8 instanceof vdtt_lo || var8 instanceof vdtt_mi) && (var9 = var7.L()) != null) {
            for(var10 = 0; var10 < var9.length; ++var10) {
               if (var9[var10].option[0] == 298) {
                  this.J += 16;
               }
            }
         }

         var10 = vdtt_dd.b(vdtt_dd.f, var7.getItemTemplate().name + " (+" + var7.level + ")");
         if (this.I < var10 + 32) {
            this.I = var10 + 32;
         }

         while(this.n + this.I > this.a.width) {
            this.n -= 32;
         }

         if (this.H + this.J + 8 > DataCenter.gI().o) {
            this.H = DataCenter.gI().o - this.J - 8;
         }

         this.K[0] = new vdtt_ay(this.I - 17, 3, 0, 0, "", this.a, 100, 52);
         this.K[1] = new vdtt_ay(8, this.J - 27, 50, 0, var5.l, this.a, var5.m, 15);
         this.K[2] = new vdtt_ay(58, this.J - 27, 50, 0, Caption.qt, this.a, 101, 15);
         vdtt_ay var11;
         if ((var11 = var3.i()) == null) {
            var11 = var3.j();
         }

         if (var11 != null) {
            this.K[3] = new vdtt_ay(108, this.J - 27, 50, 0, var11.l, this.a, var11.m, 15);
         }

         for(var1 = 1; var1 < this.K.length; ++var1) {
            if (this.K[var1] != null) {
               this.K[var1].setSize(45, 20);
            }
         }

         this.L = a(this.K);
         if (var7.equals(M) && O - N < 1000L) {
            this.P = true;
            this.a.k = null;
            this.a(this.L[2].a(this.K[1].m, this), 0, 0);
            return;
         }

         M = var7;
         N = O;
      } else {
         this.m = true;
         if (var7.equals(M) && O - N < 1000L) {
            this.P = true;
            this.a.k = null;
            vdtt_ay var12;
            if ((var12 = var3.h()) != null) {
               this.a(var3.n[0].a(var12.m, this), 0, 0);
            }

            return;
         }
      }

      M = var7;
      N = O;
   }

   public final void b(Graphics var1) {
      if (this.P) {
         this.d();
         this.a.k = null;
      } else if (System.currentTimeMillis() - O >= 100L) {
         int var2 = var1.e;
         int var3 = var1.f;
         if (this.m) {
            this.l.b(var1);
         } else {
            this.a(var1, 0, 0, this.I, this.J, 61, 22, 23, 1, 1);
            this.l.b(var1, 8, 10);
            Item var4 = this.l.H;
            int var5 = 0;
            if (!var4.i() && var4.strData.length() > 0) {
               ++var5;
            }

            if (var4.h != -1L) {
               ++var5;
            }

            vdtt_w var6 = GameSrc.gI().c;
            boolean var7 = false;
            ItemOption[] var8;
            if ((var6 instanceof vdtt_km || var6 instanceof vdtt_lo || var6 instanceof vdtt_mi) && (var8 = var4.L()) != null) {
               for(int var9 = 0; var9 < var8.length; ++var9) {
                  if (var8[var9].option[0] == 298) {
                     ++var5;
                     var7 = true;
                  }
               }
            }

            if (var5 > 0) {
               this.l.a(var1, var5, var7);
            }

            this.a(var1, this.K, var2, var3);
         }
      }

   }

   public final void a_() {
      if (this.m) {
         this.setXY(this.l.cx, this.l.cy);
         this.l.a_();
      } else {
         this.setXY(this.n, this.H);
         a(this.K, this.L);
      }

      DataCenter.gI();
      if (!DataCenter.b() && this.a.k.equals(this)) {
         vdtt_ii var1 = GameSrc.gI().T();
         int var2 = this.a.cx + this.cx + AppListener.gI().m() / 2;
         int var3 = this.a.cy + this.cy;
         switch(GameSrc.gI().idTask) {
         case 0:
            if (GameSrc.gI().idStep == 0 && this.l.H.id == 168 || GameSrc.gI().idStep == 2 && this.l.H.id == 724) {
               this.a(var2, var3);
               return;
            }
            break;
         case 1:
            if (this.a instanceof vdtt_jy && (GameSrc.gI().idStep == 1 || GameSrc.gI().idStep == 2) && (this.l.H.id == 824 || this.l.H.id >= 771 && this.l.H.id <= 790 || this.l.H.y())) {
               this.a(var2, var3);
               return;
            }
            break;
         case 2:
            if (this.a instanceof vdtt_ml && GameSrc.gI().idStep == 1 && this.l.H.id == 194) {
               this.a(var2, var3);
               return;
            }
            break;
         case 3:
            if (this.a instanceof vdtt_ml && GameSrc.gI().idStep == 1 && this.l.H.id == 379) {
               this.a(var2, var3);
               return;
            }
         case 4:
         case 7:
         default:
            break;
         case 5:
            if (GameSrc.gI().idStep == 1 && this.a instanceof vdtt_na) {
               if (this.l.H.i()) {
                  if (this.l.H.L() != null) {
                     this.a(var2, var3);
                  } else {
                     this.a(var2, var3);
                  }
               } else {
                  this.a(var2, var3 - 8);
               }

               DataCenter.gI().pointHelper.b = true;
               return;
            }
            break;
         case 6:
            if (GameSrc.gI().idStep >= 0 && this.l.H.id == 380 && var1 != null && Char.gI().cx == var1.g && Char.gI().cy == var1.h) {
               DataCenter.gI().pointHelper.a(var2 - 35, var3 - 12);
               DataCenter.gI().pointHelper.b = true;
               return;
            }
            break;
         case 8:
            if (GameSrc.gI().idStep >= 0 && this.l.H.id == 381 && var1 != null && Char.gI().cx == var1.g && Char.gI().cy == var1.h) {
               DataCenter.gI().pointHelper.a(var2 - 35, var3 - 12);
               DataCenter.gI().pointHelper.b = true;
               return;
            }

            Item var4 = Char.gI().C();
            if (GameSrc.gI().idStep == 7 && var4 != null && this.l.H.id == var4.id) {
               DataCenter.gI().pointHelper.a(var2 - 35, var3 - 12);
               DataCenter.gI().pointHelper.b = true;
            }

            return;
         case 9:
            if (GameSrc.gI().idStep == 10 && this.a instanceof vdtt_na) {
               label115: {
                  if (((vdtt_na)this.a).a.b == ((vdtt_na)this.a).w()) {
                     if (this.l.H.getItemTemplate().type != 1 && this.l.H.getItemTemplate().type != 21) {
                        break label115;
                     }

                     vdtt_bl var5 = this.l;
                     if (GameSrc.gI().bY != var5.H.id) {
                        if (this.l.H.T()) {
                           if (this.l.H.isLock) {
                              DataCenter.gI().pointHelper.a(var2 - 70, var3 - 12);
                           } else {
                              DataCenter.gI().pointHelper.a(var2 - 105, var3 - 12);
                           }
                           break label115;
                        }

                        if (!this.l.H.isLock) {
                           DataCenter.gI().pointHelper.a(var2 - 70, var3 - 12);
                           break label115;
                        }
                     }
                  }

                  DataCenter.gI().pointHelper.a(var2 - 35, var3 - 12);
               }

               DataCenter.gI().pointHelper.b = true;
               return;
            }
            break;
         case 10:
            if (GameSrc.gI().idStep == 5 && this.a instanceof vdtt_ml) {
               DataCenter.gI().pointHelper.a(var2 - 70, var3 - 12);
               DataCenter.gI().pointHelper.b = true;
            }
         }
      }

   }

   private void a(int var1, int var2) {
      if (this.m) {
         var1 = this.a.cx + this.cx + this.width;
         var2 = this.a.cy + this.cy + this.height;
         DataCenter.gI().pointHelper.a(var1 - 35, var2 - 12);
         DataCenter.gI().pointHelper.b = true;
      } else {
         if (this.l.H.getItemTemplate().type != 35 && this.l.H.getItemTemplate().type != 36 && this.l.H.getItemTemplate().type != 32) {
            DataCenter.gI().pointHelper.a(var1 + 28, var2 + 35);
         } else {
            DataCenter.gI().pointHelper.a(var1 + 28, var2 + 65);
         }

         DataCenter.gI().pointHelper.b = true;
      }

   }

   public final Vector g() {
      Vector var1 = new Vector();
      if (this.m) {
         return this.l.g();
      } else {
         for(int var2 = 0; var2 < this.L.length; ++var2) {
            if (this.K[var2] != null) {
               var1.addElement(this.L[var2].a(this.K[var2].m, this));
            }
         }

         var1.addElement(new vdtt_hi(1011, 0, 0, this.I, this.J, (vdtt_hp)null, this));
         return var1;
      }
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (this.m) {
         this.l.a(var1, var2, var3);
      } else {
         switch(var1.b) {
         case 100:
            this.d();
            return;
         case 101:
            this.m = true;
            return;
         case 1011:
            return;
         default:
            this.d();
            this.l.a(var1, var2, var3);
         }
      }

   }

   private void d() {
      this.a.b((vdtt_k)this);
   }
}

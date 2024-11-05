package gro;

import java.util.Vector;

public final class vdtt_lj extends vdtt_li {
   private vdtt_hp T;
   private vdtt_hp[] U;
   private vdtt_bb[] V;
   private vdtt_bb W;
   private boolean X = true;

   public vdtt_lj(MainScreen var1) {
      super(var1, new String[]{Caption.I});
      this.H = var1;
      this.a(320, 222);
      this.J = false;
      this.W = this.a(12, this.f() + 10, Caption.hu, 1000);
      this.a(this.W, 0);
      Vector var2 = new Vector();
      vdtt_ay var3 = this.a(0, 0, Caption.qu, this, 1004, 7);
      var2.add(var3);
      var3 = this.a(0, 0, Caption.hv, this, 1001, 7);
      var2.add(var3);
      var3 = this.a(0, 0, Caption.hw, this, 1002, 7);
      var2.add(var3);

      for(int var4 = 0; var4 < var2.size(); ++var4) {
         ((vdtt_ay)var2.get(var4)).setSize(60, 20);
         ((vdtt_ay)var2.get(var4)).setXY(super.width - 8 - 2 - (var4 + 1) * (((vdtt_ay)var2.get(var4)).width + 3), this.f() + 7);
         this.a((vdtt_k)var2.get(var4), 0);
      }

      this.D();
      this.f(0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && !var1[var2].isLock) {
            this.aj.add(var1[var2]);
         }
      }

   }

   public final void D() {
      this.T = new vdtt_hp((byte)1, this.W.cx, this.W.cy + 20, super.width - 8 - this.W.cx - 5, 150, 30, GameSrc.gI().vThu.size());
      this.V = new vdtt_bb[GameSrc.gI().vThu.size()];
      this.U = new vdtt_hp[GameSrc.gI().vThu.size()];

      for(int var1 = 0; var1 < GameSrc.gI().vThu.size(); ++var1) {
         this.V[var1] = new vdtt_bb(0, 7 + var1 * this.T.h, "", this, 0);
         this.U[var1] = new vdtt_hu((byte)1, 0, 0, this.V[var1].width, this.V[var1].height, this.V[var1].height, 1, this.T);
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      if (super.a.b == 0) {
         switch(var1) {
         case 1000:
            var1 = 0;

            for(int var4 = 0; var4 < this.V.length; ++var4) {
               if (this.V[var4].m) {
                  ++var1;
               }
            }

            boolean var5 = var1 != this.V.length;
            this.W.m = var5;

            for(var1 = 0; var1 < this.V.length; ++var1) {
               this.V[var1].m = var5;
            }
         }
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      try {
         if (this.X) {
            super.b(var1);
         } else {
            this.a(var1, this.cx, this.cy, this.width, this.height, Caption.I, (byte)2, this.J);
         }

         if (super.a.b == 0) {
            this.a(var1, this.T);

            for(int var2 = 0; var2 < this.V.length; ++var2) {
               try {
                  Thu var3 = (Thu)GameSrc.gI().vThu.elementAt(var2);
                  if (this.T.b(var2)) {
                     label44: {
                        this.a(var1, 22, var2 * this.T.h, this.T.width - 22, this.T.h - 1, 46, 22, 23, 1, 1);
                        if (var2 == this.T.k) {
                           vdtt_cz.a(var1, 23, var2 * this.T.h + 1, this.T.width - 22 - 2, this.T.h - 1 - 2);
                        } else if (var2 == this.T.l) {
                           vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, var3.c, 56, 8 + var2 * this.T.h, 0, -1, -10275328);
                           break label44;
                        }

                        vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, var3.c, 55, 7 + var2 * this.T.h, 0, -1, -10275328);
                     }

                     if (var3.k) {
                        vdtt_cz.a(var1, 418, 0, 40, var2 * this.T.h + this.T.h / 2 - 1, 3);
                     } else {
                        vdtt_cz.a(var1, 83, 0, 40, var2 * this.T.h + this.T.h / 2 - 1, 3);
                     }

                     vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, var3.b, 55, 20 + var2 * this.T.h, 0, -22360, -10275328);
                     vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.hy + Utlis.g((int)((long)var3.l - Utlis.a() / 1000L)), this.T.width - 6, 20 + var2 * this.T.h, 1, -6488, -10275328);
                     if (var3.a()) {
                        vdtt_dd.b(vdtt_dd.d, var1, Caption.hz, this.T.width - 8, 8 + var2 * this.T.h, 1, -2560, -10275328);
                     }

                     int var4 = var1.e;
                     int var5 = var1.f;
                     this.a(var1, var4 + this.V[var2].cx, var5 + this.V[var2].cy);
                     this.V[var2].b(var1);
                     this.a(var1, var4, var5);
                  }
               } catch (Exception var6) {
               }
            }

            this.a((Graphics)var1);
            vdtt_dd.a(vdtt_dd.c, var1, Caption.pH + GameSrc.gI().vThu.size() + " " + Caption.pL, 12, this.height - 14, 0, -1);
            this.T.b(var1, this);
         }
      } catch (Exception var7) {
         Utlis.a(var7);
      }

   }

   public final void a_() {
      try {
         super.a_();
         if (super.a.b == 0) {
            this.T.a();

            for(int var1 = 0; var1 < this.V.length; ++var1) {
               this.V[var1].a_();
               this.U[var1].a();
               if (this.U[var1].l != -1) {
                  this.V[var1].n = true;
               } else {
                  this.V[var1].n = false;
               }
            }
         } else if (super.a.b == this.w()) {
            this.B();
         }
      } catch (Exception var2) {
         Utlis.a(var2);
      }

      if (GameSrc.gI().idTask == 5 && GameSrc.gI().idStep == 7) {
         this.y();
      }

   }

   public final Vector g() {
      Vector var1 = super.g();

      try {
         if (!this.X) {
            var1.removeElementAt(0);
         }

         if (super.a.b == 0) {
            for(int var2 = 0; var2 < this.U.length; ++var2) {
               int var3 = this.T.cx + this.V[var2].cx;
               int var4 = this.T.cy + this.V[var2].cy - this.T.f;
               if (Utlis.a(this.T.cx, this.T.cy, this.T.cx + this.T.width, this.T.cy + this.T.height, var3, var4) && Utlis.a(this.T.cx, this.T.cy, this.T.cx + this.T.width, this.T.cy + this.T.height, var3 + this.V[var2].width, var4 + this.V[var2].height)) {
                  this.U[var2].cx = (short)var3;
                  this.U[var2].cy = (short)var4;
                  var1.addElement(this.U[var2].a(8000 + var2, this));
               }
            }

            var1.addElement(this.T.a(1005, this));
         }
      } catch (Exception var5) {
         Utlis.a(var5);
      }

      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         boolean var5;
         vdtt_bb var6;
         if (var1.b >= 8000 && var1.b < 9000) {
            var2 = var1.b - 8000;
            var6 = this.V[var2];
            var5 = !this.V[var2].m;
            var6.m = var5;
            var2 = 0;

            for(int var4 = 0; var4 < this.V.length; ++var4) {
               if (this.V[var4].m) {
                  ++var2;
               }
            }

            if (var2 == this.V.length) {
               var5 = true;
               this.W.m = var5;
            } else {
               var5 = false;
               this.W.m = var5;
            }
         }

         vdtt_lj var7;
         Thu var8;
         int var10;
         switch(var1.b) {
         case 1001:
            this.a(true);
            return;
         case 1002:
            var7 = this;
            var5 = true;
            this.W.m = var5;

            for(var3 = 0; var3 < var7.V.length; ++var3) {
               var6 = var7.V[var3];
               var5 = true;
               var6.m = var5;
            }

            var7.a(true);
            return;
         case 1003:
            this.a((Thu)null);
            return;
         case 1004:
            if (GameSrc.gI().vThu.size() > 0) {
               this.H.a(Caption.tX, 2003, this);
               return;
            }

            DataCenter.gI().currentScreen.c(Caption.hD, -65536);
            break;
         case 1005:
            if (var1.j.k >= 0) {
               var3 = var3;
               var2 = var1.j.k;
               var7 = this;

               try {
                  var8 = (Thu)GameSrc.gI().vThu.elementAt(var2);
                  int var18 = var7.width - 8 - 100;
                  var10 = var3 - 100;
                  boolean var11 = false;
                  vdtt_lj var13 = var7;
                  vdtt_bn var14;
                  if ((var14 = new vdtt_bn(var18, var10, 0, var7, var8)).cx > DataCenter.gI().n - var14.width - var7.cx) {
                     var14.cx = (short)(DataCenter.gI().n - var14.width - var7.cx);
                  }

                  if (var14.cx < -var7.cx) {
                     var14.cx = (short)(-var7.cx);
                  }

                  if (var14.cy > DataCenter.gI().o - var14.height - var7.cy) {
                     var14.cy = (short)(DataCenter.gI().o - var14.height - var7.cy);
                  }

                  for(int var12 = var7.f.size() - 1; var12 >= 0; --var12) {
                     vdtt_k var15;
                     if ((var15 = (vdtt_k)var13.f.get(var12)) instanceof vdtt_bn) {
                        var13.b(var15);
                     }
                  }

                  var13.a((vdtt_k)var14);
                  var7.k = var14;
                  if (var7.k.cx + var7.k.width > DataCenter.gI().n) {
                     var7.k.cx = (short)(DataCenter.gI().n - var7.k.width);
                  }

                  if (var7.k.cy + var7.k.height > DataCenter.gI().o) {
                     var7.k.cy = (short)(DataCenter.gI().o - var7.k.height);
                  }

                  if (var7.k.cy < 0) {
                     var7.k.cy = 0;
                  }

                  if (!var8.k) {
                     var8.k = true;
                     Message var19;
                     (var19 = new Message((byte)96)).writeShort(var8.a);
                     var19.send();
                  }
               } catch (Exception var16) {
                  Utlis.a(var16);
                  return;
               }
            }
            break;
         case 2001:
            this.a(false);
            return;
         case 2002:
            var5 = false;
            Vector var9 = new Vector();

            for(var10 = 0; var10 < GameSrc.gI().vThu.size(); ++var10) {
               if ((var8 = (Thu)GameSrc.gI().vThu.elementAt(var10)).k && !var8.a()) {
                  var9.add(var8);
               }
            }

            if (var9.size() > 0) {
               c(var9);
               return;
            }

            DataCenter.gI().currentScreen.c(Caption.hB, -65536);
            break;
         case 2003:
            try {
               Message.c((byte)-50).send();
               return;
            } catch (Exception var17) {
            }
         }
      }

   }

   public final void a(Thu var1) {
      this.X = true;
      this.f(this.w() - 1);
      if (var1 != null) {
         this.Q.a(var1.b);
         if (!var1.c.contains("Re: ")) {
            this.P.a("Re: " + var1.c);
         }
      }

   }

   private void a(boolean var1) {
      Vector var2 = new Vector();
      int var3 = 0;

      for(int var4 = 0; var4 < GameSrc.gI().vThu.size(); ++var4) {
         Thu var5 = (Thu)GameSrc.gI().vThu.elementAt(var4);
         if (this.V[var4].m) {
            if (!var5.a()) {
               var2.add(var5);
            } else {
               ++var3;
            }
         }
      }

      if (var2.size() <= 0) {
         if (var3 > 0) {
            DataCenter.gI().currentScreen.c(Caption.hA, -65536);
         } else {
            DataCenter.gI().currentScreen.c(Caption.hB, -65536);
         }
      } else if (var1) {
         DataCenter.gI().currentScreen.a(Caption.hi, 2001, this);
      } else {
         c(var2);
      }

   }

   public final void d() {
      super.d();
   }

   public static void c(Vector var0) {
      try {
         Message var1;
         (var1 = new Message((byte)88)).writeShort(var0.size());

         for(int var2 = 0; var2 < var0.size(); ++var2) {
            Thu var3 = (Thu)var0.elementAt(var2);
            var1.writeShort(var3.a);
         }

         var1.send();
      } catch (Exception var4) {
         Utlis.a(var4);
      }

   }

   public final void a(String var1) {
      this.a((Thu)null);
      this.Q.a(var1);
   }
}

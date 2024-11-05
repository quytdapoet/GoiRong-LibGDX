package gro;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Blending;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Vector;

public final class vdtt_bk extends EntityPanel {
   public Vector a = new Vector();
   public Vector b;
   private boolean e = true;
   private boolean f = false;
   private boolean g;
   private vdtt_ih h;
   private vdtt_ih i;
   private vdtt_ih j;
   private vdtt_ih k;
   private short l;
   private short m;
   private vdtt_w n;
   private byte o;
   private byte p;
   private byte H;
   private int I;
   private int J;
   private int K;
   private int L;
   private int M;
   private int N;
   private boolean O;
   public boolean c;
   private boolean P;
   public mImage d;
   private int Q;

   public vdtt_bk(vdtt_w var1, byte var2, int var3) {
      this.h = new vdtt_ih(this, (byte)2, this.width);
      this.i = new vdtt_ih(this, (byte)3, this.height);
      this.Q = 0;
      this.n = var1;
      this.o = var2;
      this.p = (byte)var3;
   }

   public vdtt_bk(vdtt_w var1, byte var2) {
      this.h = new vdtt_ih(this, (byte)2, this.width);
      this.i = new vdtt_ih(this, (byte)3, this.height);
      this.Q = 0;
      this.n = var1;
      this.o = 2;
   }

   public final void a(vdtt_k var1) {
      var1.e = this;
      this.a.remove(var1);
      this.i();
   }

   public final void b(vdtt_k var1) {
      var1.e = this;
      this.a.insertElementAt(var1, 0);
      this.i();
   }

   public final void a(Vector var1) {
      for(int var2 = 0; var2 < var1.size(); ++var2) {
         vdtt_k var3;
         (var3 = (vdtt_k)var1.elementAt(var2)).e = this;
         this.a.addElement(var3);
      }

      this.i();
   }

   public final void a(short var1, short var2) {
      this.width = var1;
      this.height = var2;
      this.h.a(var1);
      this.i.a(var2);
      this.l = var1;
      this.m = var2;
      if (this.H == 2) {
         this.a(false);
      } else if (this.H == 1) {
         this.a(true);
      } else if (this.e) {
         this.h.a(var1);
         this.i.a(var2);
      } else {
         this.h.a(0);
         this.i.a(0);
      }

   }

   private void i() {
      this.cx = this.cy = this.width = this.height = 0;

      vdtt_k var1;
      int var2;
      for(var2 = 0; var2 < this.a.size(); ++var2) {
         var1 = (vdtt_k)this.a.elementAt(var2);
         if (var2 == 0) {
            this.cx = var1.cx;
            this.cy = var1.cy;
         } else {
            if (var1.cx < this.cx) {
               this.cx = var1.cx;
            }

            if (var1.cy < this.cy) {
               this.cy = var1.cy;
            }
         }
      }

      for(var2 = 0; var2 < this.a.size(); ++var2) {
         if ((var1 = (vdtt_k)this.a.elementAt(var2)).cx + var1.width - this.cx > this.width) {
            this.width = (short)(var1.cx + var1.width - this.cx);
         }

         if (var1.cy + var1.height - this.cy > this.height) {
            this.height = (short)(var1.cy + var1.height - this.cy);
         }
      }

      this.h.a(this.width);
      this.i.a(this.height);
      this.l = this.width;
      this.m = this.height;
      if (this.H == 2) {
         this.a(false);
      } else if (this.H == 1) {
         this.a(true);
      } else if (this.e) {
         this.h.a(this.width);
         this.i.a(this.height);
      } else {
         this.width = this.height = 0;
         this.h.a(this.width);
         this.i.a(this.height);
      }

   }

   public final vdtt_k a() {
      return this.a.size() > 0 ? (vdtt_k)this.a.lastElement() : null;
   }

   public final void c(vdtt_k var1) {
      Object var2 = this.a.lastElement();
      this.a.removeElement(var1);
      this.a.addElement(var1);
      if (!var1.equals(var2)) {
         this.a.removeElement(var2);
         this.a.addElement(var2);
      }

   }

   public final void b() {
      boolean var1 = this.h.a();
      boolean var2 = this.i.a();
      if (var1 && !this.i.b() || var2 && !this.h.b()) {
         this.a(this.H == 1);
      }

      vdtt_k var3;
      if (this.j != null && this.k != null && !this.d() && !this.e() && (var3 = this.a()) != null && !var3.e(0)) {
         short var4 = var3.cx;
         short var5 = var3.cy;
         this.j.a();
         this.k.a();
         int var6 = var3.cx - var4;
         int var7 = var3.cy - var5;
         vdtt_k var8 = var3;
         var7 = var7;
         var6 = var6;
         vdtt_bk var9 = this;

         for(int var10 = 0; var10 < var9.a.size(); ++var10) {
            vdtt_k var11;
            if (!(var11 = (vdtt_k)var9.a.elementAt(var10)).equals(var8)) {
               var11.setXY(var11.cx + var6, var11.cy + var7);
            }
         }

         var9.i();
         if (!this.j.b() && !this.k.b()) {
            this.j = null;
            this.k = null;
            if (this.O) {
               this.g();
            }
         }
      }

   }

   private void b(boolean var1) {
      for(int var2 = 0; var2 < this.a.size(); ++var2) {
         vdtt_k var3;
         if (!(var3 = (vdtt_k)this.a.elementAt(var2)).equals(this.a())) {
            var3.b(var1);
         }
      }

   }

   public final void a(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      if (this.h.b() || this.i.b()) {
         switch(this.o) {
         case 0:
            this.a(var1, this.cx, this.cy, this.width, this.height);
            break;
         case 1:
            this.a(var1, this.cx + this.l - this.width, this.cy, this.width, this.height);
            break;
         case 2:
            this.a(var1, this.cx, this.cy + this.m - this.height, this.width, this.height);
            break;
         case 3:
            this.a(var1, this.cx + this.l - this.width, this.cy + this.m - this.height, this.width, this.height);
            break;
         case 4:
            this.a(var1, this.cx, this.cy, this.l, this.height);
            break;
         case 5:
            this.a(var1, this.cx, this.cy + this.m - this.height, this.l, this.height);
            break;
         case 6:
            this.a(var1, this.cx + this.l - this.width, this.cy, this.width, this.m);
            break;
         case 7:
            this.a(var1, this.cx, this.cy, this.width, this.m);
         }
      }

      vdtt_k var4;
      int var5;
      int var6;
      if (this.f && (this.width > 0 || this.cy > 0) || this.e) {
         this.a(var1, this.cx + DataCenter.gI().currentScreen.cx, this.cy + DataCenter.gI().currentScreen.cy);
         switch(this.p) {
         case 1:
            if (!DataCenter.k()) {
               if (this.d == null) {
                  var6 = Utlis.n(74);
                  this.d = mImage.a(var6 * DataCenter.gI().r, Utlis.n(14) * DataCenter.gI().r);
                  Pixmap var7;
                  (var7 = this.d.b).setColor(new Color(0.0F, 0.0F, 0.0F, 0.0F));
                  var7.fill();
                  mImage var8 = vdtt_cz.c(7);
                  vdtt_y.a(var7, var8, 0, 0, var8.c, var8.d, 0, 0, 36 * DataCenter.gI().r, 14 * DataCenter.gI().r, Blending.None);
                  vdtt_y.a(var7, var8, 0, 0, var8.c, var8.d, 38 * DataCenter.gI().r, 0, 36 * DataCenter.gI().r, 14 * DataCenter.gI().r, Blending.None);
                  Binary.a(this.d);
               }

               var1.a(this.d, 16, 0);
            }
            break;
         case 2:
            this.b(var1);
         }

         for(var5 = 0; var5 < this.a.size() - 1; ++var5) {
            var4 = (vdtt_k)this.a.elementAt(var5);
            this.a(var1, var4.a(), var4.b());
            var4.b(var1);
         }

         this.a(var1, this.cx + DataCenter.gI().currentScreen.cx, this.cy + DataCenter.gI().currentScreen.cy);
         switch(this.p) {
         case 1:
            if (!this.h.b() && !this.i.b()) {
               if (this.P) {
                  this.P = false;
                  DataCenter.gI().aQ = false;
               }
            } else {
               this.P = true;
            }
         case 2:
         case 3:
         case 4:
         default:
            break;
         case 5:
            this.d(var1);
            break;
         case 6:
            e(var1);
         }
      }

      switch(this.p) {
      case 4:
         if (this.o == 0) {
            this.a(var1, 0, 0);
            c(var1);
            Graphics var17 = var1;
            vdtt_bk var18 = this;

            int var9;
            try {
               label299: {
                  DataCenter.n();
                  if (GameSrc.gI().focusEntity == null) {
                     var18.Q = 5;
                  } else if (var18.Q > 0) {
                     --var18.Q;
                     break label299;
                  }

                  byte var10 = 0;
                  byte var11 = 0;
                  if (mConfig.gI().a(15)) {
                     if (DataCenter.gI().r == 3) {
                        var10 = 1;
                     } else if (DataCenter.gI().r == 4) {
                        var11 = 1;
                     }
                  }

                  if (GameSrc.gI().focusEntity != null) {
                     var9 = Utlis.n(21);
                     int var12 = DataCenter.gI().n - Utlis.n(186) - var9;
                     if (DataCenter.k()) {
                        var12 = DataCenter.gI().n - Utlis.n(99) - var9;
                     }

                     if (GameSrc.gI().focusEntity instanceof Char) {
                        Char var22 = (Char)GameSrc.gI().focusEntity;
                        vdtt_y.a(var17, 28, 0, var12 + var9, 0, Utlis.n(100 - var10));
                        vdtt_y.a(var17, 30, 0, var12 + Utlis.n(45), 0 + Utlis.n(4), Utlis.n(var22.a(47)), (int)Utlis.n(8));
                        vdtt_y.a(var17, 31, 0, var12 + Utlis.n(45), 0 + Utlis.n(16), Utlis.n(var22.c(47)), (int)Utlis.n(8));
                        vdtt_y.a(var17, 32, 0, var12 + Utlis.n(34), 0 + Utlis.n(4), Utlis.n(3) + var11, (int)Utlis.n(18));
                        vdtt_dd.b(vdtt_dd.b, var17, GameSrc.gI().focusEntity.strTop(), var12 + Utlis.n(69), 0 + Utlis.n(8), 2, -6488, -10275328);
                        vdtt_dd.b(vdtt_dd.b, var17, GameSrc.gI().focusEntity.strBottom(), var12 + Utlis.n(69), 0 + Utlis.n(20), 2, -6488, -10275328);
                        vdtt_y.a(var17, var22.ag(), 0, var12 + Utlis.n(96), 0 + Utlis.n(4), Utlis.n(100));
                     } else {
                        vdtt_ff var13;
                        vdtt_ea var14;
                        if (GameSrc.gI().focusEntity instanceof Npc) {
                           Npc var23;
                           if (!(var23 = (Npc)GameSrc.gI().focusEntity).v()) {
                              vdtt_y.a(var17, 28, 0, var12 + var9, 0, Utlis.n(100 - var10));
                              vdtt_y.a(var17, 30, 0, var12 + Utlis.n(45), 0 + Utlis.n(4), Utlis.n(47), (int)Utlis.n(8));
                              vdtt_y.a(var17, 31, 0, var12 + Utlis.n(45), 0 + Utlis.n(16), Utlis.n(47), (int)Utlis.n(8));
                              vdtt_y.a(var17, 32, 0, var12 + Utlis.n(34), 0 + Utlis.n(4), Utlis.n(3) + var11, (int)Utlis.n(18));
                              vdtt_dd.b(vdtt_dd.b, var17, GameSrc.gI().focusEntity.strTop(), var12 + Utlis.n(69), 0 + Utlis.n(8), 2, -6488, -10275328);
                              vdtt_dd.a((BitmapFont)Graphics.b(80), (Graphics)var17, GameSrc.gI().focusEntity.strBottom(), var12 + Utlis.n(69), 0 + Utlis.n(20), 2, -6488, -10275328);
                              if (!DataCenter.k() && (var13 = var23.q()) != null) {
                                 var14 = (vdtt_ea)DataCenter.gI().ae.get(var13.a);
                                 var6 = DataCenter.gI().r;
                                 if (mConfig.gI().a(15)) {
                                    ++var6;
                                 }

                                 vdtt_cz.b(var17, var13.a, 0, var12 + Utlis.n(96), 0 + Utlis.n(4), 20 * var6, 20 * var6, var14.d / 2 - 10 - var13.c, var14.e - var13.d - 20, 20, 20, 0);
                              }
                           }
                        } else {
                           Mob var15;
                           if (GameSrc.gI().focusEntity instanceof Mob && !(var15 = (Mob)GameSrc.gI().focusEntity).w()) {
                              vdtt_y.a(var17, 28, 0, var12 + var9, 0, Utlis.n(100 - var10));
                              vdtt_y.a(var17, 30, 0, var12 + Utlis.n(45), 0 + Utlis.n(4), Utlis.n(var15.a(47)), (int)Utlis.n(8));
                              vdtt_y.a(var17, 31, 0, var12 + Utlis.n(45), 0 + Utlis.n(16), Utlis.n(47), (int)Utlis.n(8));
                              vdtt_y.a(var17, 32, 0, var12 + Utlis.n(34), 0 + Utlis.n(4), Utlis.n(3) + var11, (int)Utlis.n(18));
                              if (DataCenter.gI().h / 12 % 2 == 0 && var15.levelBoss > 0) {
                                 vdtt_y.a(var17, 45, 0, var12 + Utlis.n(21), 0 + Utlis.n(12), Utlis.n(100));
                              }

                              vdtt_dd.b(vdtt_dd.b, var17, GameSrc.gI().focusEntity.strTop(), var12 + Utlis.n(69), 0 + Utlis.n(8), 2, -6488, -10275328);
                              vdtt_dd.a((BitmapFont)Graphics.b(80), (Graphics)var17, GameSrc.gI().focusEntity.strBottom(), var12 + Utlis.n(69), 0 + Utlis.n(20), 2, -6488, -10275328);
                              if (!DataCenter.k() && (var13 = var15.s()) != null) {
                                 var14 = (vdtt_ea)DataCenter.gI().ae.get(var13.a);
                                 var6 = DataCenter.gI().r;
                                 if (mConfig.gI().a(15)) {
                                    ++var6;
                                 }

                                 if (var15.levelBoss == 11) {
                                    var17.c(180.0F);
                                 } else if (var15.levelBoss == 2) {
                                    var17.c(150.0F);
                                 } else if (var15.levelBoss == 1) {
                                    var17.c(120.0F);
                                 } else if (var15.levelBoss == 10) {
                                    var17.c(90.0F);
                                 } else if (var15.levelBoss == 9) {
                                    var17.c(60.0F);
                                 }

                                 vdtt_cz.b(var17, var13.a, 0, var12 + Utlis.n(96), 0 + Utlis.n(4), 20 * var6, 20 * var6, var14.d / 2 - 10 - var13.c, var14.e - var13.d - 20, 20, 20, 0);
                                 if (var15.levelBoss == 11 || var15.levelBoss == 2 || var15.levelBoss == 1 || var15.levelBoss == 10 || var15.levelBoss == 9) {
                                    var17.r();
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            } catch (Exception var16) {
            }

            var5 = 5 + AppListener.gI().m();
            if (GameSrc.gI().V() && GameSrc.gI().bS != 0) {
               if (GameSrc.gI().bZ) {
                  vdtt_dd.b(vdtt_dd.c, var1, Caption.gh + Utlis.h((int)((Utlis.a() - GameSrc.gI().bR) / 1000L)), var5, 63, 0, -1, -16777216);
               } else {
                  var9 = (int)(((long)GameSrc.gI().bS - (Utlis.a() - GameSrc.gI().bR)) / 1000L);
                  if (GameSrc.gI().getMapTemplate().type != 19 && GameSrc.gI().getMapTemplate().type != 20) {
                     if (GameSrc.gI().getMapTemplate().type == 8) {
                        if (GameSrc.gI().cs <= 0 && GameSrc.gI().mapID == 9) {
                           vdtt_dd.b(vdtt_dd.c, var1, Caption.gk + Utlis.i(var9), var5, 63, 0, -1, -16777216);
                        } else {
                           vdtt_dd.b(vdtt_dd.c, var1, Caption.gl + Utlis.i(var9), var5, 63, 0, -1, -16777216);
                        }
                     } else if (GameSrc.gI().getMapTemplate().type != 6 && GameSrc.gI().getMapTemplate().type != 10) {
                        if (var9 > 0) {
                           vdtt_dd.b(vdtt_dd.c, var1, Caption.gl + Utlis.i(var9), var5, 63, 0, -1, -16777216);
                        }
                     } else {
                        vdtt_dd.b(vdtt_dd.c, var1, Caption.gk + Utlis.i(var9), var5, 63, 0, -1, -16777216);
                     }
                  } else if (GameSrc.gI().cs >= 2 && GameSrc.gI().cs <= 6) {
                     if (GameSrc.gI().cs == 2) {
                        vdtt_dd.b(vdtt_dd.c, var1, Utlis.b(Caption.uf, Utlis.i(var9)), var5, 63, 0, -1, -16777216);
                     } else if (GameSrc.gI().cs == 3) {
                        vdtt_dd.b(vdtt_dd.c, var1, Utlis.b(Caption.ug, Utlis.i(var9)), var5, 63, 0, -1, -16777216);
                     } else if (GameSrc.gI().cs == 4) {
                        vdtt_dd.b(vdtt_dd.c, var1, Utlis.b(Caption.uh, Utlis.i(var9)), var5, 63, 0, -1, -16777216);
                     } else if (GameSrc.gI().cs == 5) {
                        vdtt_dd.b(vdtt_dd.c, var1, Utlis.b(Caption.ui, Utlis.i(var9)), var5, 63, 0, -1, -16777216);
                     } else if (GameSrc.gI().cs == 6) {
                        vdtt_dd.b(vdtt_dd.c, var1, Utlis.b(Caption.uj, Utlis.i(var9)), var5, 63, 0, -1, -16777216);
                     }
                  } else {
                     vdtt_dd.b(vdtt_dd.c, var1, Caption.gk + Utlis.i(var9), var5, 63, 0, -1, -16777216);
                  }

                  if (GameSrc.gI().getMapTemplate().type == 21 && GameSrc.gI().dF != null) {
                     vdtt_dd.c(vdtt_dd.c, var1, "c#item" + GameSrc.gI().dF, Utlis.n(101 + AppListener.gI().m / 2) + 3, 21, 0, -2560, -16777216);
                  }
               }

               if (GameSrc.gI().getMapTemplate().type == 10 || GameSrc.gI().getMapTemplate().type == 16) {
                  vdtt_dd.b(vdtt_dd.c, var1, Caption.gj + Utlis.c(GameSrc.gI().cl), var5, 73, 0, -1, -16777216);
               }

               if (GameSrc.gI().getMapTemplate().type != 17 && GameSrc.gI().getMapTemplate().type != 4 && GameSrc.gI().getMapTemplate().type != 8) {
                  if (GameSrc.gI().getMapTemplate().type == 6) {
                     vdtt_dd.b(vdtt_dd.c, var1, Caption.gi + Utlis.c(GameSrc.gI().cj), var5, 73, 0, -1, -16777216);
                  }
               } else {
                  vdtt_dd.b(vdtt_dd.c, var1, Caption.gi + Utlis.c(GameSrc.gI().cl), var5, 73, 0, -1, -16777216);
               }
            }

            boolean var19 = true;
            if (GameSrc.gI().getMapTemplate().type != 21) {
               vdtt_ds var20 = vdtt_jf.z();
               if (Char.gI().sys > 0 && var20 != null) {
                  String var21 = var20.d + Caption.ls + Utlis.h(Utlis.m(var20.c));
                  if (DataCenter.gI().h % 16 >= 10) {
                     vdtt_dd.b(vdtt_dd.c, var1, var21, var5, 53, 0, -2560, -16777216);
                  } else {
                     vdtt_dd.b(vdtt_dd.c, var1, var21, var5, 53, 0, -1, -16777216);
                  }
               }
            }

            if (this.e) {
               if (GameSrc.gI().aF[3].d) {
                  GameSrc.gI().a(var1, GameSrc.gI().aF[0].cx - Utlis.n(5), GameSrc.gI().aF[0].cy - Utlis.n(5), Utlis.n(67), Utlis.n(57), -11, 22, 23, 1, 1);
               } else {
                  GameSrc.gI().a(var1, GameSrc.gI().aF[0].cx - Utlis.n(5), GameSrc.gI().aF[0].cy - Utlis.n(5), Utlis.n(67), Utlis.n(73), -11, 22, 23, 1, 1);
               }

               this.a(var1, GameSrc.gI().aF[0].a(), GameSrc.gI().aF[0].b());
               GameSrc.gI().aF[0].b(var1);
               this.a(var1, GameSrc.gI().aF[1].a(), GameSrc.gI().aF[1].b());
               GameSrc.gI().aF[1].b(var1);
               this.a(var1, GameSrc.gI().aF[2].a(), GameSrc.gI().aF[2].b());
               GameSrc.gI().aF[2].b(var1);
               this.a(var1, GameSrc.gI().aF[2].a(), GameSrc.gI().aF[3].b());
               GameSrc.gI().aF[3].b(var1);
            }
         }
      default:
         if (this.h.b() || this.i.b()) {
            this.a(var1, this.I, this.J);
            var1.d(this.K, this.L, this.M, this.N);
         }

         if ((var4 = this.a()) != null) {
            this.a(var1, var4.a(), var4.b());
            var4.b(var1);
         }

         this.a(var1, var2, var3);
      }
   }

   private void b(Graphics var1) {
      if (this.d == null) {
         int var2 = Utlis.n(175);
         this.d = mImage.a(var2 * DataCenter.gI().r, Utlis.n(75) * DataCenter.gI().r);

         for(int var3 = 0; var3 < this.a.size(); ++var3) {
            vdtt_ay var4;
            if (this.a.get(var3) instanceof vdtt_ay && !(var4 = (vdtt_ay)this.a.get(var3)).equals(GameSrc.gI().cQ)) {
               if (var4.equals(GameSrc.gI().dy)) {
                  DataCenter.o();
               }

               mImage var5 = vdtt_cz.c(var4.H);
               vdtt_y.a(this.d, var5, (var4.cx - this.cx + var4.width / 2) * DataCenter.gI().r, (var4.cy - this.cy + var4.height / 2) * DataCenter.gI().r, Utlis.n(100), 3);
            }
         }

         Binary.a(this.d);
      }

      var1.a(this.d, 0, 0);
   }

   public final Vector c() {
      return this.b;
   }

   public final boolean d() {
      if (this.H > 0) {
         return this.H == 1;
      } else {
         return this.e;
      }
   }

   public final boolean e() {
      return this.h.b() || this.i.b() || this.H > 0 || this.g;
   }

   public final void f() {
      this.f = true;
      if (!this.h.b() && !this.i.b()) {
         this.l = this.width;
         this.m = this.height;
         this.H = 2;
         this.h.a(0);
         this.i.a(0);
      } else {
         this.a(false);
         this.width = this.height = 0;
         this.h.a(this.width);
         this.i.a(this.height);
      }

   }

   public final void g() {
      this.f = true;
      if (!this.h.b() && !this.i.b()) {
         this.H = 1;
         this.h.a(this.l);
         this.i.a(this.m);
      } else {
         this.a(true);
         this.width = this.l;
         this.height = this.m;
         this.h.a(this.l);
         this.i.a(this.m);
      }

   }

   public final void a(boolean var1) {
      this.e = var1;
      this.b(!var1);
      this.H = 0;
      this.f = false;
      if (var1) {
         this.width = this.l;
         this.height = this.m;
         this.h.a(this.width);
         this.i.a(this.height);
      } else {
         this.width = this.height = 0;
         this.h.a(this.width);
         this.i.a(this.height);
      }

   }

   private void a(Graphics var1, int var2, int var3, int var4, int var5) {
      this.I = var1.e;
      this.J = var1.f;
      this.K = var1.k();
      this.L = var1.l();
      this.M = var1.h;
      this.N = var1.i;
      if (var4 > this.M) {
         var4 = this.M;
      }

      if (var5 > this.N) {
         var5 = this.N;
      }

      this.a(var1, var2, var3);
      var1.d(0, 0, var4, var5);
   }

   private static void c(Graphics var0) {
      try {
         if (!DataCenter.k()) {
            if (AppListener.gI().m > 0) {
               vdtt_dd.a((vdtt_dd)(mConfig.gI().a(15) ? vdtt_dd.e : vdtt_dd.b), (Graphics)var0, GameSrc.gI().getMapTemplate().name, GameSrc.gI().cQ.cx + 17, mConfig.gI().a(15) ? 10 : 7, 0, -6488, -10275328);
            } else if (mConfig.gI().a(15)) {
               vdtt_dd.a((vdtt_dd)vdtt_dd.e, (Graphics)var0, GameSrc.gI().getMapTemplate().name, DataCenter.gI().n - 70, 10, 2, -6488, -10275328);
            } else {
               vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var0, GameSrc.gI().getMapTemplate().name, DataCenter.gI().n - 50, 7, 2, -6488, -10275328);
            }
         }

         long var1 = Char.gI().exp;

         int var3;
         for(var3 = 0; var3 < DataCenter.gI().ax.length && var1 >= DataCenter.gI().ax[var3]; ++var3) {
            var1 -= DataCenter.gI().ax[var3];
         }

         DataCenter.gI();
         int var4 = Utlis.n(24 + AppListener.gI().m / 2);
         int var5 = Utlis.n(4);
         var3 = Utlis.n(47);
         int var6 = Utlis.n(8);
         int var7;
         if ((var7 = Char.gI().a(var3)) > 0) {
            vdtt_y.a(var0, 30, 0, var4, var5, var7, (int)var6);
         }

         if ((var7 = Char.gI().c(var3)) > 0) {
            vdtt_y.a(var0, 31, 0, var4, var5 + Utlis.n(12), var7, (int)var6);
         }

         byte var8 = 0;
         byte var9 = 0;
         if (mConfig.gI().a(15)) {
            if (DataCenter.gI().r == 2) {
               var8 = 1;
            } else if (DataCenter.gI().r == 4) {
               var9 = 1;
            }
         }

         Char.gI();
         if ((var7 = Char.b(Utlis.n(18))) > 0) {
            DataCenter.n();
            vdtt_y.a(var0, -12, 0, Utlis.n(13 + AppListener.gI().m / 2) + var8, var5 + (Utlis.n(18) - var7), Utlis.n(3) + var9, (int)var7);
         }

         vdtt_dd.b(vdtt_dd.b, var0, Utlis.c(Char.gI().hp), var4 + var3 / 2, var5 + Utlis.n(4), 2, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.b, var0, Utlis.c(Char.gI().mp), var4 + var3 / 2, var5 + Utlis.n(16), 2, -6488, -10275328);
         GameSrc.gI();
         if (GameSrc.af() && DataCenter.gI().h / 12 % 2 == 0 && !DataCenter.k()) {
            vdtt_y.a(var0, 45, 0, Utlis.n(AppListener.gI().m / 2), Utlis.n(12), Utlis.n(100));
         }

         if (Session.countRecv > 0) {
            vdtt_dd.a((vdtt_dd)vdtt_dd.e, (Graphics)var0, Caption.uN, DataCenter.gI().n / 2, DataCenter.gI().o / 2, 2, -16711681, -10275328);
         }
      } catch (Exception var10) {
         Utlis.a(var10);
      }

   }

   private void d(Graphics var1) {
      var1.o();
      Vector var2;
      if ((var2 = this.b) != null) {
         Skill var3 = null;

         for(int var4 = 0; var4 < var2.size(); ++var4) {
            vdtt_k var5;
            short var6 = (var5 = (vdtt_k)var2.elementAt(var4)).width;
            this.a(var1, var5.a(), var5.b());
            if (var4 < GameSrc.gI().bm.size() && !var5.d) {
               Iterator var7 = GameSrc.gI().bm.iterator();

               while(var7.hasNext()) {
                  Skill var8;
                  if ((var8 = (Skill)var7.next()).d == GameSrc.gI().da[var4]) {
                     var3 = var8;
                     break;
                  }
               }

               this.a(var1, var3, var5, var6);
            }
         }
      }

      this.a(var1, this.cx + DataCenter.gI().currentScreen.cx, this.cy + DataCenter.gI().currentScreen.cy);
      if (GameSrc.gI().aP != null) {
         vdtt_ay var9;
         short var10 = (var9 = GameSrc.gI().aP).width;
         this.a(var1, var9.a(), var9.b());

         for(int var11 = 0; var11 < GameSrc.gI().af.length; ++var11) {
            if (GameSrc.gI().af[var11].e > 0 && GameSrc.gI().af[var11].l()) {
               this.a(var1, GameSrc.gI().af[var11], var9, var10);
               break;
            }
         }

         this.a(var1, this.cx + DataCenter.gI().currentScreen.cx, this.cy + DataCenter.gI().currentScreen.cy);
      }

   }

   private void a(Graphics var1, Skill var2, vdtt_k var3, int var4) {
      float var5 = var2.a(var4);
      if (var2.d != 30) {
         if (var5 <= (float)var4 && var5 > 0.0F) {
            if (!mConfig.gI().d() && !var2.l()) {
               vdtt_cz.a(var1, 101, 0, 0, Utlis.n(var4), Utlis.n(var4) * DataCenter.gI().r, Utlis.n((int)var5) * DataCenter.gI().r, 0, var4 - (int)var5, var4, (int)var5, 36);
            } else {
               var1.c(-2560);
               vdtt_cz.a(var1, 64, 0, 0, Utlis.n(var4), Utlis.n(var4) * DataCenter.gI().r, Utlis.n((int)var5) * DataCenter.gI().r, 0, var4 - (int)var5, var4, (int)var5, 36);
               var1.f();
            }
         }

         if (var2.g() > 0.0F) {
            if (var2.g() / 1000.0F > 10.0F) {
               vdtt_dd.b(vdtt_dd.b, var1, Utlis.c((long)var2.g() / 1000L), var3.width / 2, var3.height / 2, 2, -1, -16777216);
               return;
            }

            vdtt_dd.b(vdtt_dd.b, var1, String.valueOf(a(var2.g() / 1000.0F, 2)), var3.width / 2, var3.height / 2, 2, -1, -16777216);
         }
      }

   }

   private static BigDecimal a(float var0, int var1) {
      return (new BigDecimal(Float.toString(var0))).setScale(2, 4);
   }

   private static void e(Graphics var0) {
      int var1 = 122;

      for(int var2 = 0; var2 < Char.gI().ba.size(); ++var2) {
         Effect var3;
         if ((var3 = (Effect)Char.gI().ba.elementAt(var2)).id != 131) {
            EffectTemplate var4 = var3.getEffectTemplate();
            Char var5 = Char.gI();
            var3.a(var0, var1, 1, var4.id >= 87 && var4.id <= 92 ? (DataCenter.k() ? (short)(725 + var5.sys - 1) : (var5.sys == 5 ? (short)(var4.id - 87 + 897) : (short)(var4.idIcon + var4.id - 87 + (var5.sys - 1) * 6))) : var4.idIcon, false);
            var3.setXY(var1, 1);
            var1 += 18;
         }
      }

      GameSrc.gI();
      GameSrc.gI();
   }

   public final void h() {
      this.d = null;
   }
}

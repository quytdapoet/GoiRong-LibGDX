package gro;

import java.util.Collections;
import java.util.Vector;

public final class vdtt_lo extends vdtt_jx {
   public Item[] N = new Item[2];
   public Item[] O = new Item[2];
   private vdtt_hq[] V = new vdtt_hq[3];
   private vdtt_ay W;
   public int P;
   public int[] Q = new int[3];
   public vdtt_hf R;
   public vdtt_bd S;
   private Vector X;
   private int[] Y;
   private int Z = 0;
   private boolean al;

   public vdtt_lo(MainScreen var1) {
      super(var1, new String[]{Caption.yT[4], Caption.P});
      this.V[0] = new vdtt_hq((byte)1, 94, this.f() + 20, 30, 30, 30, 1, 1);
      this.V[1] = new vdtt_hq((byte)1, 174, this.f() + 20, 30, 30, 30, 1, 1);
      this.V[2] = new vdtt_hq((byte)1, 118, this.f() + 60, 64, 32, 32, 1, 2);
      this.W = this.a(this.width - 70, this.height - 33, Caption.ec, this, 0, -8);
      this.a(this.W, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].A()) {
            this.aj.add(var1[var2]);
         }
      }

   }

   private void C() {
      for(int var1 = 0; var1 < this.O.length; ++var1) {
         if (this.O[var1] != null) {
            int var2 = this.O[var1].index;
            Char.gI().arrItemBag[var2] = this.O[var1];
            this.O[var1] = null;
         }
      }

   }

   public final void a_() {
      super.a_();
      int var1;
      if (super.a.b == 0) {
         this.N[1] = null;
         this.Y = null;
         this.Z = 0;
         if (this.N[0] != null && this.O[0] != null) {
            int var2;
            ItemOption var3;
            Vector var4;
            if (this.O[0].getItemTemplate().type == 35) {
               this.N[1] = this.N[0].b();
               byte var16 = this.N[1].level;
               this.N[1].a(0);
               ItemOption[] var17;
               if ((var17 = this.N[1].L()) != null && this.O[0].strData.length() > 0) {
                  var4 = new Vector();
                  boolean var18 = false;

                  for(var2 = 0; var2 < var17.length; ++var2) {
                     var3 = var17[var2];
                     var4.add(var3);
                     if (var3.option[0] == 349 && var3.option[1] < var3.f()) {
                        var3.c(var3.option[1] + 1);
                        var4.add(this.O[0].L()[0]);
                        var18 = true;
                     }
                  }

                  if (var18) {
                     this.N[1].strData = Item.a(var4);
                     this.N[1].a(var16);
                  } else {
                     this.N[1] = null;
                  }
               } else {
                  this.N[1] = null;
               }
            } else {
               int var7;
               if (this.O[0].getItemTemplate().type == 36) {
                  this.N[1] = this.N[0].b();
                  ItemOption[] var14;
                  if ((var14 = this.N[1].L()) != null && this.O[0].strData.length() > 0) {
                     Vector var15 = new Vector();
                     var4 = new Vector();
                     var7 = -1;

                     for(var2 = 0; var2 < var14.length; ++var2) {
                        if ((var3 = var14[var2]).j()) {
                           if (var3.getItemOptionTemplate().type == this.O[0].L()[0].getItemOptionTemplate().type) {
                              var7 = -1;
                              break;
                           }

                           var4.add(var3);
                        } else {
                           var15.add(var3);
                        }

                        if (var3.option[0] == 350 && var3.option[1] < var3.f()) {
                           var7 = var2;
                        }
                     }

                     if (var7 < 0) {
                        this.N[1] = null;
                     } else {
                        var14[var7].c(var14[var7].option[1] + 1);
                        var4.add(this.O[0].L()[0]);
                        Collections.sort(var4, ItemOption.a);

                        for(var2 = 0; var2 < var4.size(); ++var2) {
                           var15.insertElementAt(var4.get(var2), var7 + 1);
                        }

                        this.N[1].strData = Item.a(var15);
                     }
                  } else {
                     this.N[1] = null;
                  }
               } else {
                  boolean var5 = true;
                  int var6 = -1;

                  for(var7 = 0; var7 < this.O.length; ++var7) {
                     if (this.O[var7] != null) {
                        if (var6 == -1) {
                           var6 = this.O[var7].id;
                        } else if (var6 != this.O[var7].id) {
                           var5 = false;
                           break;
                        }

                        this.Z += this.O[var7].M();
                     }
                  }

                  this.N[1] = this.N[0].b();
                  var4 = new Vector();
                  ItemOption var8;
                  if ((var8 = this.N[1].a(var4, var6)) != null) {
                     if (var8.a(this.N[1].u())) {
                        var5 = false;
                     }
                  } else {
                     var2 = 0;
                     var3 = null;
                     ItemOption[] var9 = this.N[1].L();
                     Vector var10 = new Vector();
                     int var11;
                     if (var9 != null) {
                        for(var11 = 0; var11 < var9.length; ++var11) {
                           var10.add(var9[var11]);
                           if (var9[var11].option[0] == 298) {
                              var3 = var9[var11];
                              var2 = var9[var11].f();
                           }
                        }
                     }

                     if (var4.size() >= var2) {
                        var5 = false;
                     } else if (var6 >= 0) {
                        var10.insertElementAt(ItemOption.g(var6), var10.indexOf(var3) + 1);
                        var11 = 0;

                        for(var7 = 0; var7 < var10.size(); ++var7) {
                           if (((ItemOption)var10.get(var7)).getItemOptionTemplate().type == 8) {
                              ++var11;
                           }
                        }

                        var3.c(var11);
                        this.N[1].strData = Item.a(var10);
                     }
                  }

                  if (this.Z > 0) {
                     this.Y = this.N[1].a(this.Z, var6);
                  } else {
                     this.Y = null;
                  }

                  if (!var5 || this.Y == null || this.Y[1] == this.Y[2]) {
                     this.N[1] = null;
                  }
               }
            }
         }

         for(var1 = 0; var1 < this.V.length; ++var1) {
            this.V[var1].a();
         }
      } else {
         this.B();
      }

      if (this.R != null) {
         this.R.o();
         if (this.R.p()) {
            this.R = null;
         }
      }

      for(var1 = 0; var1 < this.Q.length; ++var1) {
         if (this.Q[var1] > 0) {
            int var10003 = this.Q[var1]--;
         }
      }

      DataCenter.gI();
      if (!DataCenter.b() && GameSrc.gI().idTask == 5) {
         int var12;
         int[] var13;
         if (GameSrc.gI().idStep == 11) {
            if (this.N[0] != null && this.N[0].V() > 0) {
               this.y();
               return;
            }

            if (this.N[0] == null) {
               if (super.a.b != 1) {
                  var12 = this.cx + 145;
                  DataCenter.gI().pointHelper.a(var12, this.cy + 14);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }

               if (this.k == null) {
                  if (this.T.h() != 0) {
                     var12 = this.cx + 90;
                     DataCenter.gI().pointHelper.a(var12, this.cy + 47);
                     DataCenter.gI().pointHelper.b = true;
                     return;
                  }

                  var12 = this.cx + 65;
                  DataCenter.gI().pointHelper.a(var12, this.cy + 80);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }
            } else if (this.O[0] == null) {
               if (super.a.b != 2) {
                  var12 = this.cx + 240;
                  DataCenter.gI().pointHelper.a(var12, this.cy + 14);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }

               if (this.k == null) {
                  if ((var13 = this.D()) != null) {
                     var12 = this.cx + var13[0] + 20;
                     DataCenter.gI().pointHelper.a(var12, this.cy + 50 + var13[1] + 15);
                     DataCenter.gI().pointHelper.b = true;
                  }

                  return;
               }
            } else {
               if (super.a.b != 0) {
                  var12 = this.cx + 80;
                  DataCenter.gI().pointHelper.a(var12, this.cy + 14);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }

               if (this.k == null) {
                  DataCenter.gI().pointHelper.a(this.cx + this.W.cx + 25 + AppListener.gI().m(), this.cy + this.W.cy + 14);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }
            }
         } else if (GameSrc.gI().idStep == 12) {
            if (this.N[0] != null && this.N[0].X() > 0) {
               this.y();
               return;
            }

            if (this.N[0] == null) {
               if (super.a.b != 1) {
                  var12 = this.cx + 145;
                  DataCenter.gI().pointHelper.a(var12, this.cy + 14);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }

               if (this.k == null) {
                  if (this.T.h() != 0) {
                     var12 = this.cx + 90;
                     DataCenter.gI().pointHelper.a(var12, this.cy + 47);
                     DataCenter.gI().pointHelper.b = true;
                     return;
                  }

                  var12 = this.cx + 65;
                  DataCenter.gI().pointHelper.a(var12, this.cy + 80);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }
            } else if (this.O[0] == null) {
               if (super.a.b != 2) {
                  var12 = this.cx + 240;
                  DataCenter.gI().pointHelper.a(var12, this.cy + 14);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }

               if (this.k == null) {
                  if ((var13 = this.E()) != null) {
                     var12 = this.cx + var13[0] + 20;
                     DataCenter.gI().pointHelper.a(var12, this.cy + 50 + var13[1] + 15);
                     DataCenter.gI().pointHelper.b = true;
                  }

                  return;
               }
            } else {
               if (super.a.b != 0) {
                  var12 = this.cx + 80;
                  DataCenter.gI().pointHelper.a(var12, this.cy + 14);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }

               if (this.k == null) {
                  DataCenter.gI().pointHelper.a(this.cx + this.W.cx + 25 + AppListener.gI().m(), this.cy + this.W.cy + 14);
                  DataCenter.gI().pointHelper.b = true;
                  return;
               }
            }
         } else if (GameSrc.gI().idStep == 13) {
            this.y();
         }
      }

   }

   private int[] D() {
      if (this.ai.length == 0) {
         return null;
      } else {
         int[] var1 = null;

         for(int var2 = 0; var2 < this.ai.length; ++var2) {
            if (this.ai[var2].getItemTemplate().type == 35) {
               var1 = new int[]{var2 % 9 * 32, var2 / 9 * 32};
               break;
            }
         }

         return var1;
      }
   }

   private int[] E() {
      if (this.ai.length == 0) {
         return null;
      } else {
         int[] var1 = null;

         for(int var2 = 0; var2 < this.ai.length; ++var2) {
            if (this.ai[var2].getItemTemplate().type == 36) {
               var1 = new int[]{var2 % 9 * 32, var2 / 9 * 32};
               break;
            }
         }

         return var1;
      }
   }

   public final void b(Graphics var1) {
      if (this.w() <= 0) {
         this.a(var1, this.cx, this.cy, this.width, this.height, Caption.y, (byte)2, this.J);
      } else {
         super.b(var1);
      }

      if (super.a.b == 0) {
         if (this.Q[1] == 0 || this.Q[1] % 12 > 5) {
            vdtt_dd.b(vdtt_dd.d, var1, Caption.cO, this.width / 2, this.f() + 11, 2, -10831436, -16777216);
         }

         a(var1, this.V[0].cx, this.V[0].cy, this.N[0], this.V[0].k >= 0, Caption.bD);
         a(var1, this.V[1].cx, this.V[1].cy, this.N[1], this.V[1].k >= 0, Caption.Q);
         vdtt_cz.a(var1, 95, 0, 142 - DataCenter.gI().h / 3 % 3, this.f() + 25, 20);
         int var2 = this.f() + 98;
         int var3;
         int var4;
         if (this.Q[2] > 0) {
            this.al = true;
            if (this.Q[2] % 12 > 5) {
               vdtt_dd.b(vdtt_dd.d, var1, Caption.lz, 92, var2, 0, -2560, -16777216);
            }
         } else if (this.N[0] != null && this.O[0] != null && (this.Q[0] == 0 || this.Q[0] % 12 > 5)) {
            if (this.O[0].getItemTemplate().type != 35) {
               if (this.O[0].getItemTemplate().type == 36) {
                  if ((var4 = this.N[0].W()) > 0) {
                     vdtt_dd.b(vdtt_dd.d, var1, "- " + Utlis.b(Caption.ib, "" + var4), 92, var2, 0, -6488, -16777216);
                  } else {
                     vdtt_dd.b(vdtt_dd.d, var1, Caption.tr, 92, var2, 0, -6488, -16777216);
                  }
               } else if (this.O[0].getItemTemplate().type == 32) {
                  if (this.Y != null) {
                     if ((var3 = this.N[0].Y()) > 0) {
                        vdtt_dd.b(vdtt_dd.d, var1, "- " + Utlis.b(Caption.ic, "" + var3), 92, var2, 0, -6488, -16777216);
                     } else {
                        vdtt_dd.b(vdtt_dd.d, var1, Caption.iC, 92, var2, 0, -6488, -16777216);
                     }

                     String var9;
                     vdtt_dd var10;
                     if (this.Y[1] >= 16) {
                        var10 = vdtt_dd.d;
                        var9 = "- " + DataCenter.gI().itemTemplate[this.Y[0]].name + " " + Caption.nh;
                        var2 += 14;
                        vdtt_dd.b(var10, var1, var9, 92, var2, 0, -2560, -16777216);
                     } else if (this.Y[1] == this.Y[2]) {
                        var10 = vdtt_dd.d;
                        var9 = "- " + Caption.ec + " " + DataCenter.gI().itemTemplate[this.Y[0]].name;
                        var2 += 14;
                        vdtt_dd.b(var10, var1, var9, 92, var2, 0, -65536, -16777216);
                        var10 = vdtt_dd.d;
                        var9 = "- " + Caption.aw + this.Y[1] + Caption.tu + (this.Y[1] + 1);
                        var2 += 14;
                        vdtt_dd.b(var10, var1, var9, 92, var2, 0, -65536, -16777216);
                        var10 = vdtt_dd.d;
                        StringBuilder var7 = (new StringBuilder("- ")).append(Caption.ni).append(" ");
                        int var8 = this.Y[1];
                        var9 = var7.append(Utlis.c(DataCenter.gI().ar[var8 + 1])).append(" ").append(Caption.nj).toString();
                        var2 += 14;
                        vdtt_dd.b(var10, var1, var9, 92, var2, 0, -65536, -16777216);
                     } else {
                        var10 = vdtt_dd.d;
                        var9 = "- " + Caption.ec + " " + DataCenter.gI().itemTemplate[this.Y[0]].name;
                        var2 += 14;
                        vdtt_dd.b(var10, var1, var9, 92, var2, 0, -1, -16777216);
                        var10 = vdtt_dd.d;
                        var9 = "- " + Caption.aw + this.Y[1] + Caption.tu + this.Y[2];
                        var2 += 14;
                        vdtt_dd.b(var10, var1, var9, 92, var2, 0, -1, -16777216);
                        var10 = vdtt_dd.d;
                        var9 = "- " + Caption.ni + " " + Utlis.c(this.Y[3]) + " " + Caption.nj;
                        var2 += 14;
                        vdtt_dd.b(var10, var1, var9, 92, var2, 0, -1, -16777216);
                        if (this.Z > this.Y[3]) {
                           var10 = vdtt_dd.d;
                           var9 = "- " + Caption.nk;
                           var2 += 14;
                           vdtt_dd.b(var10, var1, var9, 92, var2, 0, -30976, -16777216);
                        }
                     }

                     if (this.Y[2] >= 17) {
                        var10 = vdtt_dd.d;
                        var9 = "- " + Caption.qo;
                        var2 += 14;
                        vdtt_dd.b(var10, var1, var9, 92, var2, 0, -2560, -16777216);
                     }
                  } else if ((var4 = this.N[0].Y()) > 0) {
                     vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.tv, var4 + "/" + var4), 92, var2, 0, -6488, -16777216);
                  } else {
                     vdtt_dd.b(vdtt_dd.d, var1, Caption.iC, 92, var2, 0, -6488, -16777216);
                  }
               }
            } else {
               int var5;
               label116: {
                  ItemOption[] var6;
                  if ((var6 = this.N[0].L()) != null) {
                     for(var3 = 0; var3 < var6.length; ++var3) {
                        if (var6[var3].option[0] == 349) {
                           var5 = var6[var3].f();
                           break label116;
                        }
                     }
                  }

                  var5 = 0;
               }

               if (var5 > 0) {
                  vdtt_dd.b(vdtt_dd.d, var1, "- " + Utlis.b(Caption.ia, "" + var5), 92, var2, 0, -6488, -16777216);
               } else {
                  vdtt_dd.b(vdtt_dd.d, var1, Caption.tq, 92, var2, 0, -6488, -16777216);
               }
            }
         }

         this.a(var1, this.V[2]);
         var4 = 0;

         for(var3 = 0; var3 <= 0; ++var3) {
            for(var2 = 0; var2 < this.V[2].O; ++var2) {
               b(var1, var2 * this.V[2].h, var3 * this.V[2].h, this.O[var3 * this.V[2].O + var2], var4 == this.V[2].k, Caption.ta);
               ++var4;
            }
         }

         this.a(var1);
         if (this.R != null) {
            this.R.b(var1, this.V[0].cx + this.V[0].h / 2, this.V[0].cy + this.V[0].h / 2);
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         for(int var2 = 0; var2 < this.V.length; ++var2) {
            var1.addElement(this.V[var2].a(1001 + var2, this));
         }
      }

      return var1;
   }

   public final void f(int var1) {
      super.f(var1);
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (super.a.b == this.w() && var1.b == 0) {
         this.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         vdtt_lo var4;
         byte var13;
         switch(var1.b) {
         case 0:
            var4 = this;

            try {
               if (var4.N[0] != null && var4.O[0] != null) {
                  var13 = 16;
                  if (var4.N[0].U()) {
                     var13 = 17;
                  }

                  if (var4.N[1] == null) {
                     var4.Q[0] = 50;
                  } else if (var4.Y != null && (var4.Y[1] >= var13 || var4.Y[1] == var4.Y[2])) {
                     var4.Q[0] = 50;
                  } else {
                     Message var14;
                     (var14 = new Message((byte)-46)).writeByte(var4.N[0].w);
                     var14.writeShort(var4.N[0].index);
                     var14.writeShort(var4.O[0].index);
                     if (var4.O[1] != null) {
                        var14.writeShort(var4.O[1].index);
                     }

                     var14.send();
                  }
               } else {
                  var4.Q[1] = 50;
               }
               break;
            } catch (Exception var12) {
               Utlis.a(var12);
               return;
            }
         case 1001:
            this.P = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.N[0]);
            if (this.N[0] == null) {
               var13 = 2;
               super.f(var13);
               DataCenter.gI().currentScreen.c(Caption.nS, -1);
               return;
            }
            break;
         case 1002:
            this.P = 2;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.N[1]);
            return;
         case 1003:
            try {
               this.P = 3;
               this.a(var1.j, var1.j.k);
               if (this.O[var1.j.k] != null) {
                  this.k = a(var1, this, this.O[var1.j.k]);
                  return;
               }

               this.k = b(Caption.tb, this, var1.j.cx + 32, var1.j.cy, 100);
               break;
            } catch (Exception var10) {
               return;
            }
         case 2001:
            try {
               Message.c((byte)-69).send();
               break;
            } catch (Exception var9) {
               return;
            }
         case 2002:
            var4 = this;
            this.C();
            short var5 = ((ItemTemplate)this.X.get(this.S.n.b)).id;

            for(var3 = 0; var3 < Char.gI().arrItemBag.length; ++var3) {
               if (Char.gI().arrItemBag[var3] != null && Char.gI().arrItemBag[var3].id == var5) {
                  Item var6 = Char.gI().arrItemBag[var3];
                  vdtt_lo var7 = var4;

                  try {
                     for(int var8 = 0; var8 < var7.O.length; ++var8) {
                        if (var7.O[var8] == null) {
                           var7.O[var8] = var6;
                           break;
                        }
                     }

                     Char.gI().arrItemBag[var6.index] = null;
                  } catch (Exception var11) {
                     Utlis.a(var11);
                  }
               }
            }
         }
      }

   }

   private void a(vdtt_hp var1, int var2) {
      for(int var3 = 0; var3 < this.V.length; ++var3) {
         this.V[var3].k = -1;
      }

      var1.k = var2;
   }

   public final void d() {
      super.d();
      if (this.N[0] != null) {
         Char.gI().i(this.N[0].w)[this.N[0].index] = this.N[0];
         this.N[0] = null;
      }

      this.C();
   }
}

package gro;

import java.util.Vector;

public final class vdtt_na extends vdtt_jx {
   public Item[] N = new Item[3];
   public Item[] O = new Item[20];
   private vdtt_hq[] W = new vdtt_hq[4];
   private vdtt_ay X;
   private vdtt_ay Y;
   public int P;
   private long Z = 0L;
   private long al = 0L;
   private long am = 0L;
   private long an = 0L;
   private int ao = 0;
   private boolean ap = false;
   private boolean aq;
   public int[] Q = new int[2];
   public int R = 0;
   public vdtt_hf S;
   public vdtt_bd V;
   private Vector ar;
   private String as = "";

   public vdtt_na(MainScreen var1) {
      super(var1, new String[]{Caption.yT[1], Caption.P});
      this.W[0] = new vdtt_hq((byte)1, 162, this.f() + 20, 30, 30, 30, 1, 1);
      this.W[1] = new vdtt_hq((byte)1, 242, this.f() + 20, 30, 30, 30, 1, 1);
      this.W[2] = new vdtt_hq((byte)1, 202, this.f() + 65, 30, 30, 30, 1, 1);
      this.W[3] = new vdtt_hq((byte)1, 14, this.f() + 20, 128, 160, 32, 5, 4);
      this.X = this.a(this.width - 70, this.height - 33, Caption.yT[1], this, 0, -8);
      this.a(this.X, 0);
      this.Y = this.a(109, this.height - 33, Caption.lh, this, 2002, -8);
      this.a(this.Y, 0);
      vdtt_hm var2;
      int var3 = (var2 = new vdtt_hm(2000, Caption.Cd)).c.length;
      this.V = this.a(14, this.height - 32, 90, var3, var2, this, 1);
      this.V.a(mConfig.gI().b(7));
      this.a(this.V, 0);
   }

   public final void a(Item[] var1) {
      int var2;
      for(var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].t()) {
            this.aj.add(var1[var2]);
         }
      }

      this.ar = new Vector();

      for(var2 = 0; var2 < Char.gI().arrItemBag.length; ++var2) {
         if (Char.gI().arrItemBag[var2] != null && Char.gI().arrItemBag[var2].getItemTemplate().type == 21) {
            this.ar.add(Char.gI().arrItemBag[var2]);
         }
      }

   }

   public final void a_() {
      int var1;
      try {
         super.a_();
         if (super.a.b == 0) {
            this.D();

            for(var1 = 0; var1 < this.W.length; ++var1) {
               this.W[var1].a();
            }
         } else {
            this.B();
         }

         if (this.S != null) {
            this.S.o();
            if (this.S.p()) {
               this.S = null;
            }
         }
      } catch (Exception var13) {
      }

      for(var1 = 0; var1 < this.Q.length; ++var1) {
         if (this.Q[var1] > 0) {
            int var10003 = this.Q[var1]--;
         }
      }

      DataCenter.gI();
      if (!DataCenter.b() && GameSrc.gI().idTask == 5) {
         if (GameSrc.gI().idStep == 1) {
            int var3;
            if (super.a.b == 0) {
               if (this.N[0] == null) {
                  var3 = this.cx + 150;
                  DataCenter.gI().pointHelper.a(var3, this.cy + 15);
               } else if (this.am < 100L) {
                  if (this.ar.size() > 0) {
                     var3 = this.cx + 255;
                     DataCenter.gI().pointHelper.a(var3, this.cy + 10);
                  } else {
                     DataCenter.gI().pointHelper.a(this.cx + this.width - 5, this.cy);
                  }
               } else {
                  var3 = this.cx + 255;
                  int var2 = this.cy + this.height;
                  DataCenter.gI().pointHelper.a(var3, var2 - 20);
               }
            } else if (super.a.b == 1) {
               if (this.N[0] == null) {
                  if (this.k == null) {
                     var3 = this.cx + 65;
                     DataCenter.gI().pointHelper.a(var3, this.cy + 75);
                  }
               } else if (this.am < 100L) {
                  var3 = this.cx + 235;
                  DataCenter.gI().pointHelper.a(var3, this.cy + 15);
               } else {
                  var3 = this.cx + 85;
                  DataCenter.gI().pointHelper.a(var3, this.cy + 15);
               }
            } else {
               Char var4 = Char.gI();
               int var5 = Char.gI().arrItemBody.length - 1;

               Item var6;
               while(true) {
                  if (var5 < 0) {
                     var6 = null;
                     break;
                  }

                  if (var4.arrItemBody[var5] != null && var4.arrItemBody[var5].getItemTemplate().type == 2) {
                     var6 = var4.arrItemBody[var5];
                     break;
                  }

                  --var5;
               }

               if (var6 != null && this.N[0] == null) {
                  var3 = this.cx + 180;
                  DataCenter.gI().pointHelper.a(var3, this.cy + 10);
               } else if (this.k == null) {
                  label167: {
                     vdtt_na var7 = this;
                     var5 = this.ai.length - 1;

                     int[] var8;
                     while(true) {
                        if (var5 < 0) {
                           var8 = null;
                           break;
                        }

                        if (var7.ai[var5] != null && var7.ai[var5].getItemTemplate().type == 1 && var7.ai[var5].g == Char.gI().he && var7.ai[var5].level == 0) {
                           var8 = new int[]{var5 % 9 * 32, var5 / 9 * 32};
                           break;
                        }

                        --var5;
                     }

                     int var10002;
                     if (this.N[0] == null) {
                        var3 = this.cx + var8[0] + 20;
                        var10002 = this.cy + 30;
                        DataCenter.gI().pointHelper.a(var3, var10002 + var8[1] + 35);
                     } else {
                        if (this.k != null) {
                           break label167;
                        }

                        var7 = this;
                        if (this.ar.size() == 0) {
                           var8 = null;
                        } else {
                           Item var10 = (Item)this.ar.elementAt(0);
                           int[] var11 = null;

                           for(int var12 = 0; var12 < var7.ai.length; ++var12) {
                              if (var7.ai[var12].equals(var10)) {
                                 var11 = new int[]{var12 % 9 * 32, var12 / 9 * 32};
                                 var7.ar.removeElementAt(0);
                                 break;
                              }
                           }

                           var8 = var11;
                        }

                        this.D();
                        if (var8 == null && this.am < 100L) {
                           DataCenter.gI().pointHelper.a(this.cx + this.width - 5, this.cy);
                           if (!this.aq) {
                              vdtt_gq.gI().a(Caption.oQ, vdtt_dd.d, -2560);
                              this.aq = true;
                           }
                           break label167;
                        }

                        if (this.am < 100L) {
                           var3 = this.cx + var8[0] + 15;
                           var10002 = this.cy + 25;
                           DataCenter.gI().pointHelper.a(var3, var10002 + var8[1] + 35);
                        } else {
                           var3 = this.cx + 65;
                           DataCenter.gI().pointHelper.a(var3, this.cy + 10);
                        }
                     }

                     DataCenter.gI().pointHelper.b = true;
                  }
               }
            }

            DataCenter.gI().pointHelper.b = true;
            return;
         }

         this.y();
      }

   }

   private void D() {
      this.ap = true;
      this.ao = 0;
      this.Z = this.al = this.am = 0L;

      int var1;
      for(var1 = 0; var1 < this.O.length; ++var1) {
         if (this.O[var1] != null) {
            Item var2 = this.O[var1];
            this.Z += DataCenter.gI().as[var2.id];
         }
      }

      if (this.N[0] != null) {
         if (this.N[1] == null || !this.as.equals(this.N[0].strData)) {
            this.as = this.N[0].strData;
            this.N[1] = this.N[0].a();
            this.N[1].isLock = true;
            if ((var1 = this.N[1].level + 1) > 15) {
               var1 = 15;
            }

            this.N[1].a(var1);
         }

         if (this.N[0].j() && this.N[1].level <= 15) {
            this.ao = DataCenter.gI().ao[this.N[1].level];
            this.al = DataCenter.gI().at[this.N[1].level];
         } else if (this.N[0].k() && this.N[1].level <= 15) {
            this.ao = DataCenter.gI().ap[this.N[1].level];
            this.al = DataCenter.gI().au[this.N[1].level];
         } else if (this.N[0].l() && this.N[1].level <= 15) {
            this.ao = DataCenter.gI().aq[this.N[1].level];
            this.al = DataCenter.gI().av[this.N[1].level];
         }

         if (Char.gI().bacKhoa < this.ao) {
            this.ap = false;
         }

         if (this.al > 0L) {
            this.am = this.Z * 100L / this.al;
         }

         this.an = (long)(80 + this.N[0].level);
         if (this.an > 100L) {
            this.an = 100L;
         }

         if (!this.N[0].v()) {
            this.N[1] = null;
            this.ap = false;
            return;
         }
      } else {
         this.N[1] = null;
      }

   }

   public final void b(Graphics var1) {
      try {
         if (this.w() <= 0) {
            this.a(var1, this.cx, this.cy, this.width, this.height, Caption.y, (byte)2, this.J);
         } else {
            super.b(var1);
         }

         if (super.a.b == 0) {
            if (this.Q[1] == 0 || this.Q[1] % 12 > 5) {
               vdtt_dd.b(vdtt_dd.d, var1, Caption.bs, 14, this.f() + 11, 0, -10831436, -16777216);
            }

            a(var1, this.W[0].cx, this.W[0].cy, this.N[0], this.W[0].k >= 0, Caption.bD);
            a(var1, this.W[1].cx, this.W[1].cy, this.N[1], this.W[1].k >= 0, Caption.Q);
            a(var1, this.W[2].cx, this.W[2].cy, this.N[2], this.W[2].k >= 0, Caption.bL);
            vdtt_cz.a(var1, 95, 0, 210 - DataCenter.gI().h / 3 % 3, this.f() + 25, 20);
            if (this.N[0] != null) {
               vdtt_dd.b(vdtt_dd.d, var1, "(" + this.N[0].ah() + ")", 177, this.f() + 60, 2, -1, -16777216);
               if (this.N[1] != null) {
                  vdtt_dd.b(vdtt_dd.d, var1, "(" + this.N[1].ah() + ")", 257, this.f() + 60, 2, -1, -16777216);
               }

               if (!this.ap) {
                  if (this.Q[0] == 0 || this.Q[0] % 10 > 5) {
                     if (this.N[0].v()) {
                        vdtt_dd.b(vdtt_dd.d, var1, Caption.kM + Utlis.c(this.ao) + Caption.kL, 149, this.f() + 108, 0, -65536, -16777216);
                     } else {
                        vdtt_dd.c(vdtt_dd.d, var1, Caption.kN, 149, this.f() + 108, 0, -2560, -16777216);
                     }
                  }
               } else if (this.Q[0] > 0) {
                  if (this.Q[0] % 14 > 7) {
                     if (this.R == 1) {
                        vdtt_dd.c(vdtt_dd.d, var1, Caption.kO, 149, this.f() + 108, 0, -2560, -16777216);
                        vdtt_dd.c(vdtt_dd.d, var1, Caption.kP, 149, this.f() + 124, 0, -2560, -16777216);
                     } else if (this.R == 2) {
                        vdtt_dd.c(vdtt_dd.d, var1, Caption.kQ, 149, this.f() + 108, 0, -1, -16777216);
                        vdtt_dd.c(vdtt_dd.d, var1, Caption.kR, 149, this.f() + 124, 0, -1, -16777216);
                     } else if (this.R == 3) {
                        vdtt_dd.c(vdtt_dd.d, var1, Caption.kQ, 149, this.f() + 108, 0, -1, -16777216);
                        vdtt_dd.c(vdtt_dd.d, var1, Caption.kS, 149, this.f() + 124, 0, -1, -16777216);
                     }
                  }
               } else if (this.N[0].v()) {
                  vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.bv, Utlis.c(this.ao)), 149, this.f() + 108, 0, -1, -16777216);
                  vdtt_dd.b(vdtt_dd.d, var1, Caption.bt + " " + (this.am > this.an ? this.an : this.am) + " %", 149, this.f() + 124, 0, -1, -16777216);
                  vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.rn, "" + this.an), 149, this.f() + 140, 0, -6488, -16777216);
               } else {
                  vdtt_dd.c(vdtt_dd.d, var1, Caption.kN, 149, this.f() + 108, 0, -2560, -16777216);
               }
            }

            this.a(var1, this.W[3]);

            for(int var2 = 0; var2 < this.W[3].i; ++var2) {
               for(int var3 = 0; var3 < this.W[3].O; ++var3) {
                  b(var1, var3 * this.W[3].h, var2 * this.W[3].h, this.O[var2 * this.W[3].O + var3], var2 * this.W[3].O + var3 == this.W[3].k, "");
               }
            }

            this.a(var1);
            if (this.S != null) {
               this.S.b(var1, this.W[0].cx + this.W[0].h / 2, this.W[0].cy + this.W[0].h / 2);
            }
         }
      } catch (Exception var4) {
         Utlis.a(var4);
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         for(int var2 = 0; var2 < this.W.length; ++var2) {
            var1.addElement(this.W[var2].a(1001 + var2, this));
         }
      }

      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (super.a.b == this.w() && var1.b == 0) {
         this.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         switch(var1.b) {
         case 0:
            this.a(true);
            return;
         case 1001:
            this.P = 1;
            this.a(var1.j, var1.j.k);
            if (this.N[0] == null) {
               this.f(2);
               DataCenter.gI().currentScreen.c(Caption.nK, -1);
               return;
            }

            this.k = a(var1, this, this.N[0]);
            return;
         case 1002:
            this.P = 2;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.N[1]);
            return;
         case 1003:
            this.P = 3;
            this.a(var1.j, var1.j.k);
            if (this.N[2] == null) {
               int var7 = var1.j.cx - 124;
               this.k = b(DataCenter.gI().itemTemplate[823].detail, this, var7, var1.j.cy, 100);
               return;
            }

            this.k = a(var1, this, this.N[2]);
            return;
         case 1004:
            try {
               this.P = 4;
               this.a(var1.j, var1.j.k);
               this.k = a(var1, this, this.O[var1.j.k]);
               return;
            } catch (Exception var6) {
               return;
            }
         case 2001:
            this.a(false);
            return;
         case 2002:
            vdtt_na var4 = this;
            var2 = this.V.n.b;
            var3 = 0;

            for(int var5 = 0; var5 < Char.gI().arrItemBag.length && var3 < 20; ++var5) {
               if (Char.gI().arrItemBag[var5] != null && Char.gI().arrItemBag[var5].p() && Char.gI().arrItemBag[var5].getItemTemplate().id <= var2) {
                  var4.b(Char.gI().arrItemBag[var5]);
                  ++var3;
               }
            }

            var4.a_();
         }
      }

   }

   private void b(Item var1) {
      try {
         for(int var2 = 0; var2 < this.O.length; ++var2) {
            if (this.O[var2] == null) {
               this.O[var2] = var1;
               break;
            }
         }

         Char.gI().arrItemBag[var1.index] = null;
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }

   private void a(vdtt_hp var1, int var2) {
      for(int var3 = 0; var3 < this.W.length; ++var3) {
         this.W[var3].k = -1;
      }

      var1.k = var2;
   }

   public final void f(int var1) {
      super.f(var1);
      if (this.N != null && this.N[0] != null && !this.N[0].v()) {
         Char.gI().i(this.N[0].w)[this.N[0].index] = this.N[0];
         this.N[0] = null;
      }

   }

   public final void d() {
      super.d();
      this.aq = false;
      if (this.N[0] != null) {
         Char.gI().i(this.N[0].w)[this.N[0].index] = this.N[0];
         this.N[0] = null;
      }

      if (this.N[2] != null) {
         Char.gI().arrItemBag[this.N[2].index] = this.N[2];
         this.N[2] = null;
      }

      this.C();
   }

   public final void C() {
      for(int var1 = 0; var1 < this.O.length; ++var1) {
         if (this.O[var1] != null) {
            int var2 = this.O[var1].index;
            Char.gI().arrItemBag[var2] = this.O[var1];
            this.O[var1] = null;
         }
      }

   }

   private void a(boolean var1) {
      try {
         if (!this.ap) {
            this.Q[0] = 50;
         } else if (this.N[0] == null) {
            this.Q[1] = 50;
         } else if (this.am < 10L) {
            DataCenter.gI().currentScreen.c(Caption.kU, -65536);
         } else {
            if (var1) {
               if (this.am > 120L && this.N[0].level > 4) {
                  DataCenter.gI().currentScreen.a(Caption.kV, 2001, this);
                  return;
               }

               if (this.ao > Char.gI().bacKhoa) {
                  DataCenter.gI().currentScreen.a(Caption.kW, 2001, this);
                  return;
               }
            }

            Message var2;
            (var2 = new Message((byte)107)).writeByte(this.N[0].w);
            var2.writeShort(this.N[0].index);
            if (this.N[2] != null) {
               var2.writeShort(this.N[2].index);
            } else {
               var2.writeShort(-1);
            }

            int var3 = 0;

            int var4;
            for(var4 = 0; var4 < this.O.length; ++var4) {
               if (this.O[var4] != null) {
                  ++var3;
               }
            }

            var2.writeByte(var3);

            for(var4 = 0; var4 < this.O.length; ++var4) {
               if (this.O[var4] != null) {
                  var2.writeShort(this.O[var4].index);
               }
            }

            var2.send();
         }
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }
}

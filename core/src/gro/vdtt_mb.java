package gro;

import java.util.Iterator;
import java.util.Vector;

public final class vdtt_mb extends vdtt_ak {
   private Vector R;
   private vdtt_ih[] S = new vdtt_ih[2];
   private vdtt_ma[] T = new vdtt_ma[2];
   private int U = -1;
   private int V;
   private int W;
   private int X;
   private vdtt_ay Y;
   private vdtt_ay Z;
   private vdtt_ay aa;
   private boolean ab;
   int a;
   int b;
   int c;
   int d;
   private boolean ac;
   public boolean M;
   public int N;
   public int O;
   public int P;
   public boolean Q;

   public vdtt_mb(MainScreen var1, Vector var2, int var3) {
      this.H = var1;
      this.R = var2;
      this.J = false;
      this.X = var3;
      this.setSize(DataCenter.gI().n, DataCenter.gI().o);
      int var4 = 0;
      Iterator var5 = var2.iterator();

      while(var5.hasNext()) {
         vdtt_hn var6;
         if ((var6 = (vdtt_hn)var5.next()).c.size() > var4) {
            var4 = var6.c.size();
         }
      }

      this.d = (var4 + 1) * 12 + 6;
      this.a = 10;
      this.b = DataCenter.gI().o - this.d - 20;
      this.c = this.width - 2 * this.a;
      if (this.c > 400) {
         this.c = 400;
         this.a = DataCenter.gI().n / 2 - this.c / 2;
      }

      if (this.d < 50) {
         this.d = 50;
      }

      this.T[0] = new vdtt_ma();
      this.T[0].setSize(this.c, this.d);
      this.T[0].setXY(this.a, this.height);
      this.S[0] = new vdtt_ih(this.T[0], (byte)1, this.height - this.d - 20);
      this.S[0].b = 100;
      this.T[1] = new vdtt_ma();
      this.T[1].setSize(80, 16);
      this.T[1].setXY(this.a + 40, this.height - 20);
      this.S[1] = new vdtt_ih(this.T[1], (byte)1, this.height - this.d - 40);
      this.S[1].b = 100;
      this.Y = this.a(this.width / 2 - 33, this.height - 28 - AppListener.gI().m() / 2, Caption.jF, this, 202, 15);
      this.Z = this.a(this.width / 2 - 30 - 25, this.height - 28 - AppListener.gI().m() / 2, Caption.jG, this, 201, 15);
      this.aa = this.a(this.width / 2 + 30 - 25, this.height - 28 - AppListener.gI().m() / 2, Caption.jH, this, 200, 15);
      this.Y.setSize(66, this.Y.height);
      this.Z.setSize(50, this.Z.height);
      this.aa.setSize(50, this.Z.height);
   }

   public final void b(Graphics var1) {
      if (!(this.H instanceof vdtt_ce)) {
         this.T[0].a(var1);
         int var2 = this.T[0].cx - 10;
         short var3 = this.T[0].width;
         if (this.U >= 0 && this.R != null && this.R.size() > 0 && this.U < this.R.size()) {
            vdtt_hn var4;
            if ((var4 = (vdtt_hn)this.R.elementAt(this.U)).d == 0) {
               this.T[1].cx = (short)(this.T[0].cx + 40);
            } else {
               this.T[1].cx = (short)(this.T[0].cx + this.T[0].width - 40 - this.T[1].width);
            }

            vdtt_ma var5 = this.T[1];
            int var6 = var1.e;
            int var7 = var1.f;
            var1.a(var5.cx, var5.cy);
            vdtt_cz.a(var1, 104, 0, 16, 0, (var5.width - 32) * DataCenter.gI().r, var5.height * DataCenter.gI().r, 8, 0, 8, 16, 20);
            vdtt_cz.a(var1, 104, 0, 0, 0, 20);
            vdtt_cz.a(var1, 105, 0, var5.width, var5.height, 40);
            var5.a(var1, var6, var7);
            vdtt_dd.b(vdtt_dd.d, var1, var4.e, this.T[1].cx + this.T[1].width / 2, this.T[1].cy + 7, 2, -2560, -10275328);
            int var8 = this.T[0].cy + 12;
            int var9 = this.height - 20 - AppListener.gI().m / 2;
            String var10;
            if (var4.d == 2) {
               var2 = var3 / 2;

               for(var6 = 0; var6 < var4.c.size(); ++var6) {
                  var10 = var4.c.elementAt(var6).toString();
                  if (var6 == this.W) {
                     vdtt_dd.c(vdtt_dd.d, var1, var10.substring(0, this.V), var2, var8 + var6 * 12, 2, -1, -10275328);
                  } else if (var6 < this.W) {
                     vdtt_dd.c(vdtt_dd.d, var1, var10, var2, var8 + var6 * 12, 2, -1, -10275328);
                  }
               }

               return;
            }

            boolean var11;
            int var12;
            vdtt_fe var13;
            if (var4.d == 0) {
               if (var4.a != null) {
                  Char.gI().a(var1, var2 + 30, var9, var4.a, 0, 0, false);
               } else if (var4.b != null) {
                  var11 = true;
                  var1.k = var11;
                  var13 = var4.b;

                  for(var12 = 0; var12 < var13.a.length; ++var12) {
                     vdtt_cz.b(var1, var13.a[var12].a, var13.a[var12].a(true), var2 + 30 - var13.a[var12].c, var9 + var13.a[var12].d, 33);
                  }

                  var11 = false;
                  var1.k = var11;
               }

               var2 += 60;

               for(var6 = 0; var6 < var4.c.size(); ++var6) {
                  var10 = var4.c.elementAt(var6).toString();
                  if (var6 == this.W) {
                     vdtt_dd.c(vdtt_dd.d, var1, var10.substring(0, this.V), var2, var8 + var6 * 12, 0, -1, -10275328);
                  } else if (var6 < this.W) {
                     vdtt_dd.c(vdtt_dd.d, var1, var10, var2, var8 + var6 * 12, 0, -1, -10275328);
                  }
               }

               return;
            }

            if (var4.d == 1) {
               var2 += var3;
               if (var4.a != null) {
                  Char.gI().a(var1, var2 - 10, var9, var4.a, 6, 0, true);
               } else if (var4.b != null) {
                  var11 = true;
                  var1.k = var11;
                  var13 = var4.b;

                  for(var12 = 0; var12 < var13.a.length; ++var12) {
                     if (var13.a[var12].e) {
                        vdtt_cz.b(var1, var13.a[var12].a, var13.a[var12].a(false), var2 - 10 + var13.a[var12].c, var9 + var13.a[var12].d, 33);
                     } else {
                        vdtt_cz.b(var1, var13.a[var12].a, var13.a[var12].a(false), var2 - 10 + var13.a[var12].c, var9 + var13.a[var12].d, 33);
                     }
                  }

                  var11 = false;
                  var1.k = var11;
               }

               for(var6 = 0; var6 < var4.c.size(); ++var6) {
                  var10 = var4.c.elementAt(var6).toString();
                  if (var6 == this.W) {
                     vdtt_dd.c(vdtt_dd.d, var1, var10.substring(0, this.V), var2 - 40, var8 + var6 * 12, 1, -1, -10275328);
                  } else if (var6 < this.W) {
                     vdtt_dd.c(vdtt_dd.d, var1, var10, var2 - 40, var8 + var6 * 12, 1, -1, -10275328);
                  }
               }
            }
         }
      }

   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(new vdtt_hi(1000, 0, 0, this.width, this.height, (vdtt_hp)null, this));
      return var1;
   }

   public final void a_() {
      int var1 = 0;
      this.ac = false;

      for(int var2 = 0; var2 < this.T.length; ++var2) {
         this.S[var2].a();
         if (this.S[var2].b()) {
            ++var1;
            this.ac = true;
         }
      }

      if (this.U >= this.R.size() && var1 == 0) {
         this.k();
      } else if (var1 <= 1 && this.U < 0) {
         this.U = 0;
      }

      String var12;
      if (this.U >= 0 && this.U < this.R.size() && !this.ac) {
         vdtt_hn var3 = (vdtt_hn)this.R.elementAt(this.U);
         if (this.W < var3.c.size()) {
            this.V += 3;
            String var4 = var3.c.elementAt(this.W).toString();
            if (this.V >= var4.length()) {
               this.V = 0;
               ++this.W;
               this.ab = this.W == var3.c.size();
            } else {
               this.ab = false;
               var12 = var4.substring(0, this.V + 10 > var4.length() ? var4.length() : this.V + 10);
               int[] var5 = null;

               while(true) {
                  int var6 = var5 == null ? 0 : var5[0] + var5[1];
                  String var7 = var12.toLowerCase();
                  String var8 = "";

                  int var9;
                  for(var9 = 0; var9 < var6; ++var9) {
                     var8 = var8 + " ";
                  }

                  var8 = var8 + var7.substring(var6, var7.length());

                  int[] var10;
                  label135: {
                     for(var9 = 0; var9 < vdtt_ik.g.length; ++var9) {
                        if (var8.indexOf(vdtt_ik.g[var9].d) != -1) {
                           var10 = new int[]{var8.indexOf(vdtt_ik.g[var9].d), vdtt_ik.g[var9].d.length()};
                           break label135;
                        }
                     }

                     var10 = null;
                  }

                  if (var10 == null) {
                     if (var5 != null && var5[0] + var5[1] > this.V) {
                        this.V = var5[0] + var5[1];
                     }
                     break;
                  }

                  var5 = var10;
               }
            }
         }
      }

      boolean var13 = var1 > 0;
      this.Y.d = this.Z.d = this.aa.d = true;
      if (!var13 && this.U == this.R.size() - 1) {
         vdtt_hn var14 = (vdtt_hn)this.R.elementAt(this.U);
         if (this.W == var14.c.size()) {
            if (this.X == -1) {
               this.Z.d = this.aa.d = false;
            } else if (this.X == -2) {
               this.Y.d = false;
            }
         }
      }

      DataCenter.gI().pointHelper.b = false;
      if (this.M) {
         if (!this.Z.d || !this.aa.d || !this.Y.d) {
            if (this.N == -1) {
               this.Z.b(true);
               this.aa.b(true);
               this.Y.b(false);
               var12 = Caption.O;
               this.Y.l = var12;
               return;
            }

            this.Z.b(false);
            this.aa.b(false);
            this.Y.b(true);
            return;
         }
      } else {
         int var15;
         if (this.H instanceof vdtt_ce) {
            if (((vdtt_ce)this.H).d == 0 && this.U < 5 && this.ab) {
               var15 = this.width - 100;
               DataCenter.gI().pointHelper.a(var15, this.height - 30 - AppListener.gI().m / 2);
               DataCenter.gI().pointHelper.b = true;
            }

            return;
         }

         if (this.H instanceof GameSrc && this.H.b.lastElement().equals(this)) {
            DataCenter.gI();
            if (!DataCenter.b()) {
               if (!this.Y.d) {
                  var15 = this.width / 2;
                  DataCenter.gI().pointHelper.a(var15, this.height - 15 - AppListener.gI().m / 2);
                  DataCenter.gI().pointHelper.b = true;
               }

               if (!this.Z.d) {
                  var15 = this.width / 2 - 30;
                  DataCenter.gI().pointHelper.a(var15, this.height - 15 - AppListener.gI().m / 2);
                  DataCenter.gI().pointHelper.b = true;
               }
            }
         }
      }

   }

   public final void k() {
      super.k();
      if (this.Q) {
         Char.gI().be.addElement(new vdtt_hf(105, 0, 0, 2));
      }

   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (GameSrc.gI().idTask == 0) {
         this.k();
      } else {
         switch(var1.b) {
         case 200:
            this.U = this.R.size();
            this.V = this.W = 0;
            if (this.U >= this.R.size()) {
               this.S[0] = new vdtt_ih(this.T[0], (byte)1, this.height + 20);
               this.S[0].b = 100;
               this.S[1] = new vdtt_ih(this.T[1], (byte)1, this.height);
               this.S[1].b = 100;
               return;
            }
            break;
         case 201:
            this.k();
            vdtt_mb var4 = this;

            try {
               if (var4.M) {
                  Message var10;
                  (var10 = new Message((byte)53)).writeShort(var4.N);
                  var10.writeByte(var4.O);
                  var10.writeByte(var4.P);
                  var10.send();
                  return;
               }

               (new Message((byte)11)).send();
               break;
            } catch (Exception var8) {
               return;
            }
         case 202:
            this.k();
            if (!this.M) {
               (new Message((byte)10)).send();
            }

            return;
         case 1000:
            try {
               boolean var5 = true;
               vdtt_hn var6 = (vdtt_hn)this.R.elementAt(this.U);
               if (this.W < var6.c.size() - 1) {
                  var5 = false;
                  this.ab = true;
               } else if (this.W == var6.c.size() - 1) {
                  String var7 = var6.c.elementAt(this.W).toString();
                  if (this.V < var7.length() - 1) {
                     var5 = false;
                     this.ab = true;
                  }
               }

               if (var5) {
                  if (this.U >= this.R.size() - 1 && (this.X == -1 || this.X == -2)) {
                     return;
                  }

                  ++this.U;
                  this.V = this.W = 0;
                  if (this.U >= this.R.size()) {
                     this.S[0] = new vdtt_ih(this.T[0], (byte)1, this.height + 20);
                     this.S[1] = new vdtt_ih(this.T[1], (byte)1, this.height);
                     return;
                  }
               } else {
                  this.V = 0;
                  this.W = var6.c.size();
               }

               return;
            } catch (Exception var9) {
            }
         }
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void d() {
      super.d();
      Task var1;
      if ((var1 = GameSrc.gI().S()) != null && this.X >= 0 && this.X < var1.p.size() && ((vdtt_ii)var1.p.elementAt(this.X)).a == 5) {
         (new Message((byte)12)).send();
      }

   }
}

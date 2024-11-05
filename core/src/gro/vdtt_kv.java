package gro;

import java.util.Vector;

public final class vdtt_kv extends vdtt_ap {
   private vdtt_ay[] b;
   private vdtt_ma c;
   private Vector d;
   private int M;
   public vdtt_fi a;
   private String[] N;
   private String O;
   private boolean P;
   private int Q = -1;
   private int R;

   public vdtt_kv(MainScreen var1, String[] var2, String var3) {
      this.H = var1;
      this.N = var2;
      this.O = var3;
      this.j();
      this.a = new vdtt_fi();
      vdtt_aa var4;
      if (!(var4 = vdtt_aa.gI()).a) {
         var4.a(var4.b[68], 1.0F);
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.a.K = this.R;
      this.a.paintTop(var1);
      if (this.a.m()) {
         this.c.a(var1);

         for(int var2 = 0; var2 < this.d.size(); ++var2) {
            vdtt_dd.b(vdtt_dd.d, var1, (String)this.d.get(var2), this.c.cx + this.c.width / 2, this.c.cy + var2 * 12 + 18, 2, -2560, -10275328);
         }
      }

   }

   public final void a_() {
      this.a.n();
      if (this.a.m() && !this.P) {
         this.P = true;
         vdtt_kv var1 = this;
         this.a(DataCenter.gI().n, Utlis.n(48));
         this.a(3, this.cx, DataCenter.gI().o - this.height, 10);
         this.b = new vdtt_ay[this.N.length];

         int var2;
         int var3;
         for(var2 = 0; var2 < var1.N.length; ++var2) {
            String var4 = "";
            String[] var5 = vdtt_dd.d(vdtt_dd.d, var1.N[var2], 60);

            for(var3 = 0; var3 < var5.length; ++var3) {
               var4 = var4 + var5[var3];
               if (var3 < var5.length - 1) {
                  var4 = var4 + "\n";
               }
            }

            var1.b[var2] = var1.a(0, 11, var4, var1, 100 + var2, -36);
         }

         DataCenter.gI();
         int var12;
         if (var1.b.length <= 5) {
            var12 = DataCenter.gI().n / 2 - 70 * var1.b.length / 2;
         } else {
            var12 = DataCenter.gI().n / 2 - 140;
         }

         int var13;
         for(var13 = 0; var13 < var1.b.length; ++var13) {
            if (var1.b.length <= 5) {
               var1.b[var13].setXY(var12 + 70 * var13, var1.height / 2 - Utlis.n(13));
            } else {
               var1.b[var13].setSize(var1.b[var13].width, 17);
               if (var13 >= 4) {
                  var1.b[var13].setXY(var12 + 70 * (var13 - 4), var1.height / 2);
               } else {
                  var1.b[var13].setXY(var12 + 70 * var13, var1.height / 2 - Utlis.n(22));
               }
            }
         }

         var13 = 20;
         var2 = var1.width - 40;
         var1.d = vdtt_dd.a(vdtt_dd.d, var1.O, var2);
         var1.M = (var1.d.size() + 1) * 12 + 6;
         if (var1.M < 40) {
            var1.M = 40;
         }

         var3 = -var1.M + 5;
         if (var1.b.length > 5) {
            var3 -= 8;
         }

         if (var2 > 400) {
            var2 = 400;
            var13 = DataCenter.gI().n / 2 - 200;
         }

         var1.c = new vdtt_ma();
         var1.c.setSize(var2, var1.M);
         var1.c.setXY(var13, var3);
         var1.j();
      }

      try {
         int var8;
         for(var8 = 0; var8 < GameSrc.gI().av.size(); ++var8) {
            vdtt_hf var10;
            if ((var10 = (vdtt_hf)GameSrc.gI().av.get(var8)).k == 449) {
               this.R = 1;
               break;
            }

            if (var10.k == 450) {
               this.R = 2;
               break;
            }

            if (var10.k == 478) {
               this.R = 3;
               break;
            }

            if (var10.k == 479) {
               this.R = 4;
               break;
            }
         }

         for(var8 = 0; var8 < GameSrc.gI().au.size(); ++var8) {
            vdtt_es var11;
            if ((var11 = (vdtt_es)GameSrc.gI().au.get(var8)).k == 591) {
               this.R = 1;
               break;
            }

            if (var11.k == 592) {
               this.R = 2;
               break;
            }

            if (var11.k == 619) {
               this.R = 3;
               break;
            }

            if (var11.k == 621) {
               this.R = 4;
               break;
            }
         }
      } catch (Exception var7) {
      }

      if (this.a.q()) {
         try {
            Message var9;
            if (this.R == 4) {
               var9 = Message.c((byte)26);
            } else if (this.R == 3) {
               var9 = Message.c((byte)24);
            } else if (this.R == 2) {
               var9 = Message.c((byte)10);
            } else if (this.R == 1) {
               var9 = Message.c((byte)5);
            } else {
               var9 = Message.c((byte)4);
            }

            var9.writeByte(this.Q);
            var9.send();
            this.k();
            return;
         } catch (Exception var6) {
         }
      }

   }

   public final void d() {
      super.d();
   }

   public final Vector g() {
      Vector var1 = new Vector();
      DataCenter.gI().pointHelper.b();
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (this.l == null && var1.b >= 100 && var1.b < 108) {
         this.Q = var1.b - 100;
         this.a(3, this.cx, DataCenter.gI().o + 20 + this.M + 5);
         this.a.J = true;
         vdtt_aa var4;
         if (!(var4 = vdtt_aa.gI()).a) {
            var4.a(var4.b[69], 1.0F);
         }
      }

   }
}

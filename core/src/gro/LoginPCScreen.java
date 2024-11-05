package gro;

import com.badlogic.gdx.Gdx;
import core.listener.LoginCallback;

import java.io.IOException;
import java.util.Vector;

public final class LoginPCScreen extends vdtt_cd implements LoginCallback {
   public vdtt_cr I;
   public vdtt_by J;
   private vdtt_ay L;
   private vdtt_ay M;
   private int N;
   private int O;
   private int P = 0;
   private int Q;
   private int R;
   Vector K;
   private Vector S;
   private static LoginPCScreen T;
   private long U;
   private vdtt_cq V;
   private int W;
   private int X;
   private vdtt_ay Y;
   private vdtt_ay Z;
   private int aa;
   private boolean ab;
   private static String[] ac;

   public static vdtt_cd v() {
      if (Session.gI().isConnected()) {
         Session.gI().close();
      }

      return w();
   }

   public static vdtt_cd w() {
      try{
         return new LoginPCScreen();
      }catch (IOException e){
         return null;
      }
   }

   LoginPCScreen() throws IOException {
       try{
         T = this;
         this.N = this.width / 2;
         this.O = this.height / 2;
         this.Q = this.N - 60;
         this.R = this.O - 20;
         if (DataCenter.gI().o <= 240) {
            this.aa = -10;
         }

         this.R += this.aa;
         this.I = new vdtt_cr(this, this.Q, this.O - 27 + 25 + this.aa, 122, Caption.ye[1], this, -11, 0);
         this.a((vdtt_k)this.I);
         byte var1 = 50;
         this.I.l = var1;
         this.J = this.a(this.Q, this.O - 27 + 50 + this.aa, 122, Caption.yf[1], this, 1);
         var1 = 50;
         this.J.l = var1;
         LoginPCScreen var2 = this;
         this.K = new Vector();
         Reader var3 = null;

         try {
            if ((var3 = Binary.a("arr_acc")) != null) {
               short var4 = var3.dis.readShort();

               for(int var5 = 0; var5 < var4; ++var5) {
                  String[] var6;
                  (var6 = new String[2])[0] = Utlis.e(var3.readUTF());
                  var6[1] = Utlis.e(var3.readUTF());
                  var2.K.add(var6);
               }
            }
         } catch (Exception var10) {
            Utlis.a(var10);
         } finally {
            if (var3 != null) {
               var3.close();
            }

         }

         if (ac != null) {
            this.a(this.I.cx + this.I.width + 2, this.I.cy + 3, "", this, 1013, 12);
            this.a(ac);
         } else if (this.K.size() > 0) {
            this.a(this.I.cx + this.I.width + 2, this.I.cy + 3, "", this, 1013, 12);
            this.a(this.x());
         }

         if (!Utlis.j(AppListener.gI().k) && !Utlis.j(AppListener.gI().l)) {
            this.I.a(AppListener.gI().k);
            this.J.a(AppListener.gI().l);
            AppListener var12 = AppListener.gI();
            String var13 = "";
            var12.k = var13;
            var12 = AppListener.gI();
            var13 = "";
            var12.l = var13;
         }

         this.Y = this.a(this.I.cx + 10, this.O - 25 + 80 + this.aa, Caption.aa, this, 1001, 7);
         this.Y.setSize(90, this.Y.height);
         this.Y.setXY(this.I.cx + this.I.width / 2 - this.Y.width / 2, this.Y.cy);
         this.L = this.a(this.Q, this.O - 25 - 2 + this.aa, "", this, 1004, -10);
         this.L.setSize(this.L.width + 20, this.L.height);
         this.M = this.a(this.L.cx + this.L.width + 2, this.O - 25 + 1 + this.aa, "", this, 1004, 12);
         this.Z = this.a(this.I.cx + 26, this.Y.cy + 25, Caption.qc, this, 2002, -29);
         this.Z.setSize(90, this.Z.height);
         this.Z.setXY(this.I.cx + this.I.width / 2 - this.Z.width / 2, this.Z.cy);
         this.a(this.width - Utlis.n(40 + AppListener.gI().m / 2), this.height - Utlis.n(30), Caption.Aw[1], this, 1011, 681);
         this.a(this.width - Utlis.n(40 + AppListener.gI().m / 2), this.height - Utlis.n(60), Caption.Aw[2], this, 1007, 680);
         DataCenter.gI().i();
         this.B();
      }catch (Exception e){
         e.printStackTrace();
      }

   }

   private void a(String[] var1) {
      if (var1 == null) {
         this.I.a("");
         this.J.a("");
      } else {
         if (this.K.remove(var1)) {
            this.K.add(var1);
         }

         this.I.a(var1[0]);
         this.J.a(var1[1]);
      }

   }

   public final String[] x() {
      if (ac != null) {
         return ac;
      } else {
         if (!Utlis.j(AppListener.gI().k) && !Utlis.j(AppListener.gI().l)) {
            ac = new String[]{AppListener.gI().k, AppListener.gI().l};
         } else if (!this.K.isEmpty()) {
            ac = (String[])this.K.lastElement();
         } else {
            ac = new String[]{this.I.i().trim(), this.J.i().trim()};
         }

         return ac;
      }
   }

   public static LoginPCScreen y() {
      return T;
   }

   public final void j() {
   }

   public final void a_() {
      super.a_();
      if (this.X > 0) {
         --this.X;
         if (this.X == 0) {
            this.B();
         }
      }

      vdtt_ay var1 = this.L;
      String var2 = DataCenter.gI().server.b();
      var1.l = var2;
      long var3 = System.currentTimeMillis();
      if (!DataCenter.gI().aP && !DataCenter.gI().f) {
         if (this.V != null) {
            if (var3 - this.U > 5000L) {
               this.U = var3;
               Char.gI().name = this.V.c;
               DataCenter.aD = 1;
               SettingsTab.d = this.V.d;
               SettingsTab.M = this.V.e;
               SettingsTab.N = this.V.f;
               this.I.a(this.V.a);
               this.J.a(this.V.b);
               this.A();
               this.b((String)Caption.sk);
               ++this.W;
               if (this.W > 10) {
                  this.V = null;
                  return;
               }
            }
         } else if (DataCenter.aD > 0) {
            if (var3 - this.U > 15000L) {
               this.U = var3;
               this.A();
               return;
            }

            if (((var3 - this.U) / 1000L + 2L) % 5L == 0L) {
               this.a(Caption.qw, (int)(16L - (var3 - this.U) / 1000L));
            }
         }
      }

   }

   public final void k() {
      this.a(Caption.jB, 2002, this);
   }

   public final void c() {
   }

   public final void b(Graphics var1) {
      if (AppListener.gI().f > 0) {
         --AppListener.gI().f;
         if (AppListener.gI().f == 0) {
            DataCenter.gI().g();
            return;
         }
      }

      super.b(var1);
      var1.a(this.cx, this.cy);
      b(var1, this.I.cx + this.I.width / 2 - 15, this.O - 45 + this.aa / 2);
      if (DataCenter.aj && !AppListener.g()) {
         this.L.b(true);
         this.M.b(true);
      } else {
         vdtt_dd.b(vdtt_dd.e, var1, Caption.yf[2], this.I.cx - 10, this.R + vdtt_dd.a(vdtt_dd.e) / 2 - 3, 1, -6488, -10275328);
      }

      vdtt_dd.b(vdtt_dd.e, var1, Caption.ye[0], this.I.cx - 10, this.R + vdtt_dd.a(vdtt_dd.e) / 2 - 3 + 25, 1, -6488, -10275328);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.yf[0], this.I.cx - 10, this.R + 25 + vdtt_dd.a(vdtt_dd.e) / 2 - 3 + 25, 1, -6488, -10275328);
      if (!DataCenter.k()) {
         vdtt_dd.a(var1, Caption.fL + Utlis.e(DataCenter.gI().ver2), this.width - 8 - AppListener.gI().m / 2, 8, 1, -1);
      }

      if (this.P == 2) {
         for(int var2 = 0; var2 < this.S.size(); ++var2) {
            vdtt_ay var3;
            if ((var3 = (vdtt_ay)this.S.elementAt(var2)).d()) {
               vdtt_dd.b(vdtt_dd.d, var1, Caption.zy[var2], var3.cx - 4, var3.cy + 9, 1, -6488, -10275328);
            } else {
               vdtt_dd.b(vdtt_dd.d, var1, Caption.zy[var2], var3.cx - 5, var3.cy + 8, 1, -6488, -10275328);
            }
         }
      }

      vdtt_aa.gI().a(-1);
      if (EntityPanel.z) {
         vdtt_dd.a(vdtt_dd.e, var1, Caption.uM, DataCenter.gI().n / 2, DataCenter.gI().o - Utlis.n(45), 2, -2560, 2, 1);
      }

   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).add(new vdtt_hi(2000, 0, 0, this.width, this.height, (vdtt_hp)null, this));
      return var1;
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      if (var1 != 1010) {
         this.P = -1;
      }

      switch(var1) {
      case 1001:
         String var4 = this.I.i().trim().toLowerCase();
         String var5 = this.J.i().trim();
         this.a(var4, var5, true);
         this.ab = false;
         DataCenter.gI().aP = false;
         this.A();
         return;
      case 1002:
         short[] var6;
         if (DataCenter.aj) {
            var6 = new short[]{1, 2};
         } else {
            var6 = new short[]{1, 2, 3, 4};
         }

         String[] var7 = new String[var6.length];

         for(int var8 = 0; var8 < var7.length; ++var8) {
            var7[var8] = Caption.Ai[var6[var8]];
         }

         this.a((vdtt_w)(new vdtt_ln(this, new vdtt_hm(0, var6, var7), 0)));
         return;
      case 1004:
         this.a((vdtt_w)(new vdtt_mc(DataCenter.gI().server, this, 1005)));
         return;
      case 1005:
         if (Session.gI().isConnected()) {
            DataCenter.gI().ay = true;
            Session.gI().close();
         }

         DataCenter.gI().a((Server)var2);
         return;
      case 1006:
         this.a((vdtt_w)(new vdtt_jv(this)));
         return;
      case 1007:
         this.a((vdtt_w)(new vdtt_lm(this)));
         return;
      case 1008:
         this.a((vdtt_w)(new vdtt_lc(this)));
         return;
      case 1009:
         try {
            Message.c((byte)-121).k();
            break;
         } catch (Exception var9) {
            Utlis.a(var9);
            return;
         }
      case 1010:
         if (this.P > 0) {
            this.P = -1;
            return;
         }

         this.P = 1;
         return;
      case 1011:
         DataCenter.gI().currentScreen.a(Caption.cs, 2001, this);
         return;
      case 1012:
         this.a((vdtt_w)(new vdtt_lb(this)));
         return;
      case 1013:
         this.a((vdtt_w)(new vdtt_jc(this.K, this, 1014, this.I.i())));
         return;
      case 1014:
         this.a((String[])var2);
         return;
      case 2002:
         Gdx.net.openURI("https://goirongplus.com");
         break;
      case 9001:
         Utlis.g();
         AppListener.gI().g.a((LoginCallback)this);
         return;
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 2000:
         this.P = -1;
         return;
      case 2001:
         Binary.b();
         return;
      case 2002:
         AppListener.gI();
         AppListener.i();
      default:
      }
   }

   private void B() {
      if (!DataCenter.gI().aP) {
         Reader var1 = null;

         try {
            try {
               if ((var1 = Binary.a("arr_reset")) == null) {
                  return;
               }

               vdtt_cq var2;
               (var2 = new vdtt_cq(this, (vdtt_cp)null)).a = Utlis.e(var1.readUTF());
               var2.b = Utlis.e(var1.readUTF());
               var2.c = Utlis.e(var1.readUTF());
               var2.g = var1.readUTF();
               var2.h = var1.dis.readShort();
               var2.d = var1.dis.readInt();
               var2.e = var1.dis.readInt();
               var2.f = var1.dis.readInt();
               short var3 = var1.dis.readShort();
               this.ab = false;
               if (var3 == 0) {
                  Binary.k("arr_reset" + vdtt_y.a());
                  this.V = var2;

                  try {
                     if (var1.dis.readShort() > 0) {
                        Server var16;
                        (var16 = new Server()).ipServer = var2.g;
                        var16.portServer = var2.h;
                        var16.name = var1.readUTF();
                        DataCenter.gI().a(var16);
                        return;
                     }
                  } catch (Exception var12) {
                  }

                  try {
                     for(int var4 = 0; var4 < DataCenter.gI().arrayServer.length; ++var4) {
                        for(int var5 = 0; var5 < DataCenter.gI().arrayServer[var4].server.length; ++var5) {
                           Server var6;
                           if ((var6 = DataCenter.gI().arrayServer[var4].server[var5]).ipServer.toLowerCase().equals(var2.g.toLowerCase()) && var6.portServer == var2.h) {
                              DataCenter.gI().a(var6);
                              return;
                           }
                        }
                     }

                     return;
                  } catch (Exception var13) {
                     return;
                  }
               }

               this.X = 20;
            } catch (Exception var14) {
               Utlis.a(var14);
            }

         } finally {
            if (var1 != null) {
               var1.close();
            }

         }
      }
   }

   public final void a(String var1, String var2, boolean var3) {
      try {
         if (var1.length() > 0 && var2.length() > 0) {
            var3 = false;

            for(int var4 = 0; var4 < this.K.size(); ++var4) {
               String[] var5;
               if ((var5 = (String[])this.K.elementAt(var4))[0].equals(var1)) {
                  this.K.removeElementAt(var4);
                  var5[0] = var1;
                  var5[1] = var2;
                  this.K.add(var5);
                  ac = var5;
                  var3 = true;
                  break;
               }
            }

            if (!var3) {
               ac = new String[]{var1, var2};
               this.K.add(ac);
            }
         }
      } catch (Exception var6) {
         Utlis.a(var6);
      }

      this.C();
   }

   private void C() {
      Writer var1 = null;
      boolean var2 = false;

      label93: {
         try {
            var2 = true;
            (var1 = new Writer()).writeShort(this.K.size());

            for(int var3 = 0; var3 < this.K.size(); ++var3) {
               String[] var4 = (String[])this.K.elementAt(var3);
               var1.writeUTF(Utlis.d(var4[0]));
               var1.writeUTF(Utlis.d(var4[1]));
            }

            var1.close("arr_acc");
            var2 = false;
            break label93;
         } catch (Exception var8) {
            Utlis.a(var8);
            var2 = false;
         } finally {
            if (var2 && var1 != null) {
               var1.close();
            }

         }

         if (var1 != null) {
            var1.close();
            return;
         }

         return;
      }

      var1.close();
   }

   public static void z() {
   }

   public final void A() {
      boolean var1;
      if (this.I.i().trim().length() == 0) {
         var1 = true;
         this.I.b = var1;
         DataCenter.gI().currentScreen.c(Caption.vp, -1);
      } else if (this.J.i().trim().length() == 0) {
         var1 = true;
         this.J.b = var1;
         DataCenter.gI().currentScreen.c(Caption.vp, -1);
      } else {
         this.i();
         (new Thread(new vdtt_cp(this))).start();
      }

   }

   public final void d(String var1) {
      this.I.a(var1);
      Utlis.a(1000L);
      this.J.a("");
   }

   public final void a(String var1, String var2, String var3) {
      AppListener.gI().i = var3;
      DataCenter var4 = DataCenter.gI();
      vdtt_cd var5 = w();
      var4.currentScreen = var5;
   }

   public final void a(String var1) {
   }

   static vdtt_cr a(LoginPCScreen var0) {
      return var0.I;
   }

   static vdtt_by b(LoginPCScreen var0) {
      return var0.J;
   }

   static boolean c(LoginPCScreen var0) {
      return var0.ab;
   }
}

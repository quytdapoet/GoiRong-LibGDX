package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import java.util.Vector;

public final class vdtt_cs extends vdtt_cd {
   private mImage I;
   private vdtt_ay J;
   private vdtt_ay K;
   private vdtt_ay L;
   private int M;
   private int N;
   private int O = 0;
   private int P;
   private int Q;
   private static vdtt_cs R;
   private long S;
   private final vdtt_ay T;

   public vdtt_cs() {
      R = this;
      this.M = this.width / 2;
      this.N = this.height / 2;
      this.P = this.M - 25;
      this.Q = this.N;
      this.J = this.a(this.M - 60, this.Q + 10, "", this, 1004, -10);
      this.K = this.a(this.J.cx + this.J.width + 5, this.J.cy + 2, "", this, 1004, 12);
      if (DataCenter.k()) {
         this.J.b(true);
         this.K.b(true);
         this.L = this.a(this.M - 67, this.Q, Caption.aa, this, 1001, 7);
         this.L.setSize(134, 28);
         this.T = this.a(this.L.cx, this.L.cy + this.L.height + 8, Caption.Aw[5], this, 1008, -29);
         this.T.setSize(65, this.T.height);
         if (Gdx.app.getType() == ApplicationType.Android) {
            this.T.setSize(134, this.T.height);
         } else if (Gdx.app.getType() == ApplicationType.iOS) {
            this.a(this.L.cx + this.T.width + 4, this.L.cy + this.L.height + 8, Caption.Aw[8], this, 1013, -29).setSize(65, this.T.height);
         }
      } else {
         this.L = this.a(this.M - 40, this.Q + 50, Caption.aa, this, 1001, 7);
         this.a(this.width - Utlis.n(40 + AppListener.gI().m / 2), this.height - Utlis.n(30), Caption.Aw[1], this, 1011, 681);
         this.a(this.width - Utlis.n(40 + AppListener.gI().m / 2), this.height - Utlis.n(60), Caption.Aw[2], this, 1007, 680);
         this.a(this.width - Utlis.n(40 + AppListener.gI().m / 2), this.height - Utlis.n(90), Caption.Aw[8], this, 1013, -52);
         this.T = this.a(this.width - Utlis.n(40 + AppListener.gI().m / 2), this.height - Utlis.n(120), Caption.Aw[5], this, 1008, -679);
      }

      DataCenter.gI().i();
   }

   public final void j() {
   }

   public final void a_() {
      super.a_();
      vdtt_ay var1 = this.J;
      String var2 = DataCenter.gI().server.b();
      var1.l = var2;
      if (DataCenter.aj) {
         this.K.b(true);
         this.J.a(true);
         this.J.setXY(this.M - this.J.width / 2, this.J.cy);
      }

      long var3 = System.currentTimeMillis();
      if (DataCenter.aD > 0 && !DataCenter.gI().aP) {
         if (var3 - this.S > 15000L) {
            this.S = var3;
            v();
            return;
         }

         if (((var3 - this.S) / 1000L + 2L) % 5L == 0L) {
            this.a(Caption.qw, (int)(16L - (var3 - this.S) / 1000L));
         }
      }

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
      b(var1, this.L.cx + this.L.width / 2 - 10, this.N - 25);
      if (!DataCenter.k()) {
         vdtt_dd.a(var1, Caption.fL + Utlis.e(DataCenter.gI().ver2), this.width - 8 - AppListener.gI().m / 2, 8, 1, -1);
         vdtt_dd.b(vdtt_dd.e, var1, Caption.mV, this.L.cx + this.L.width / 2, this.J.cy - 12, 2, -2560, -16742145);
      }

      vdtt_aa.gI().a(-1);
      if (EntityPanel.z) {
         vdtt_dd.a(vdtt_dd.e, var1, Caption.uM, DataCenter.gI().n / 2, DataCenter.gI().o - Utlis.n(45), 2, -2560, 2, 1);
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (this.I != null) {
         var1.add(new vdtt_hi(2004, 5, this.height - 80, 5 + this.I.c / 4, this.height - 80 + this.I.d / 4, (vdtt_hp)null, this));
      }

      var1.add(new vdtt_hi(2000, 0, 0, this.width, this.height, (vdtt_hp)null, this));
      return var1;
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      if (var1 != 1010) {
         this.O = -1;
      }

      switch(var1) {
      case 1001:
         DataCenter.gI().aP = false;
         if (AppListener.gI().i != null) {
            try {
               for(var1 = 0; var1 < 10; ++var1) {
                  if (Session.gI().isConnected()) {
                     Utlis.a(100L);
                  }
               }

               if (!Session.gI().isConnected()) {
                  DataCenter.gI().ipServer = DataCenter.gI().server.ipServer;
                  DataCenter.gI().portServer = DataCenter.gI().server.portServer;
                  Session.gI();
               }
            } catch (Exception var8) {
            }

            v();
            return;
         }

         AppListener.gI().k();
         break;
      case 1002:
         short[] var4;
         if (DataCenter.aj) {
            var4 = new short[]{1, 2, 5};
         } else {
            var4 = new short[]{1, 2, 3, 4, 5};
         }

         String[] var5 = new String[var4.length];

         for(int var9 = 0; var9 < var5.length; ++var9) {
            var5[var9] = Caption.Ai[var4[var9]];
         }

         this.a(new vdtt_ln(this, new vdtt_hm(0, var4, var5), 0));
         return;
      case 1003:
      default:
         break;
      case 1004:
         this.a(new vdtt_mc(DataCenter.gI().server, this, 1005));
         return;
      case 1005:
         if (Session.gI().isConnected()) {
            DataCenter.gI().ay = true;
            Session.gI().close();
         }

         DataCenter.gI().a((Server)var2);
         return;
      case 1006:
         this.a(new vdtt_jv(this));
         return;
      case 1007:
         this.a(new vdtt_lm(this));
         return;
      case 1008:
         this.a(Caption.so, 2003, this);
         return;
      case 1009:
         try {
            Message.c((byte)-121).k();
            break;
         } catch (Exception var7) {
            Utlis.a(var7);
            return;
         }
      case 1010:
         if (this.O > 0) {
            this.O = -1;
            return;
         }

         this.O = 1;
         return;
      case 1011:
         DataCenter.gI().currentScreen.a(Caption.cs, 2001, this);
         return;
      case 1012:
         this.a(new vdtt_lb(this));
         return;
      case 1013:
         AppListener var6 = AppListener.gI();
         AppListener.gI();
         new vdtt_i(var6);
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 2000:
         this.O = -1;
         return;
      case 2001:
         Binary.b();
         return;
      case 2003:
         AppListener.gI().j();
         return;
      case 2004:
         DataCenter.gI().currentScreen.a(Caption.xQ, 2005, this);
         return;
      case 2005:
         Binary.a("arr_s_game.bin", "0");
         AppListener.gI().h.a();
      case 2002:
      default:
      }
   }

   public static void v() {
      DataCenter.gI().currentScreen.i();
      (new Thread(new vdtt_ct())).start();
   }
}

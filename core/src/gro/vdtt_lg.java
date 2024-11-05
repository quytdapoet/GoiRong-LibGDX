package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import java.util.Vector;

public final class vdtt_lg extends vdtt_ak {
   public vdtt_lh a;
   public boolean b;
   public long c;
   public int d;
   public static boolean M;

   public vdtt_lg(MainScreen var1) {
      this.H = var1;
      this.setSize((DataCenter.gI().n - 240) / 14 * 14 + 192, 26);
      this.setXY(DataCenter.gI().n / 2 - this.width / 2, DataCenter.gI().o - 30);
      this.a = new vdtt_lh(var1);
      this.a.setSize(this.width, this.height);
      this.a.d = 200;
      this.d = this.a.x();
      this.c = Utlis.a();
   }

   public final void a(boolean var1) {
      this.a.M = true;
   }

   public final void b(Graphics var1) {
      short var3 = this.cy;
      var3 = this.cx;
      vdtt_lh var5 = this.a;
      DataCenter.n();
      if (var5.b < 40) {
         var5.b += 4;
      } else {
         if (!var5.a) {
            var5.b += 8;
            if (var5.b == 360) {
               var5.a = true;
            }
         } else {
            var5.b -= 16;
            if (var5.b == 40) {
               var5.a = false;
            }
         }

         var1.o();
         var1.d(70);
         var1.f(0);
         var1.c(0, 0, DataCenter.gI().n, DataCenter.gI().o);
         boolean var6 = true;
         var1.k = var6;
         vdtt_cz.a(var1, 459, var5.b, DataCenter.gI().n / 2, DataCenter.gI().o / 2, 3);
         var6 = false;
         var1.k = var6;
         vdtt_dd.a(var1, Caption.c, DataCenter.gI().n / 2, DataCenter.gI().o / 2 - 5, 2, -48128);
         vdtt_dd.a(var1, var5.x() + "%", DataCenter.gI().n / 2, DataCenter.gI().o / 2 + 5, 2, -48128);
         var1.m = 1.0F;
      }

   }

   public final void a_() {
      this.a.a_();
      if (this.b) {
         DataCenter.ak = true;

         try {
            vdtt_cd var1 = LoginPCScreen.v();
            DataCenter.gI().currentScreen = var1;
            if (M) {
               M = false;
            } else if (Gdx.app.getType() != ApplicationType.Desktop) {
               if (AppListener.gI().i != null) {
                  AppListener.gI().j();
                  AppListener var2 = AppListener.gI();
                  Object var3 = null;
                  var2.i = (String)var3;
               } else {
                  AppListener.gI().k();
               }
            }

            if (Gdx.app.getType() == ApplicationType.iOS) {
               vdtt_aa.gI().a();
            }
         } catch (Exception var4) {
            var4.printStackTrace();
         }
      } else {
         if (this.a.c >= this.a.d) {
            this.b = true;
         }

         if (this.a.x() != this.d) {
            this.d = this.a.x();
            this.c = Utlis.a();
         }

         if (this.d > 0 && this.d < 100 && Utlis.a() - this.c > 60000L) {
            this.a(true);
         }
      }

   }

   public final Vector g() {
      return new Vector();
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }
}

package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import core.listener.LoginCallback;

final class vdtt_g implements LoginCallback {
   final AppListener a;

   vdtt_g(AppListener var1) {
      this.a = var1;
   }

   public final void a(String var1, String var2, String var3) {
      DataCenter.gI().currentScreen.h();
      DataCenter.gI();
      if (DataCenter.c(var1)) {
         DataCenter.gI().r();
      }

      this.a.i = var3;
      if (Gdx.app.getType() == ApplicationType.Desktop) {
         vdtt_cs.v();
      }

   }

   public final void a(String var1) {
      DataCenter.gI().currentScreen.h();
      if (var1 != null && !var1.isEmpty()) {
         if (!var1.toLowerCase().contains("json")) {
            DataCenter.gI().currentScreen.c(var1, -65536);
            return;
         }

         if (DataCenter.gI().currentScreen instanceof GameSrc) {
            AppListener.gI();
            AppListener.p();
         }
      }

   }
}

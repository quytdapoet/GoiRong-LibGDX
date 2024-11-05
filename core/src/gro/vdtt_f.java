package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import core.listener.LogoutCallback;

final class vdtt_f implements LogoutCallback {
   final AppListener a;

   vdtt_f(AppListener var1) {
      this.a = var1;
   }

   public final void a() {
      AppListener var1 = AppListener.gI();
      vdtt_cd var2 = null;
      var1.i = null;
      if (Gdx.app.getType() == ApplicationType.Desktop) {
         DataCenter var3 = DataCenter.gI();
         var2 = LoginPCScreen.w();
         var3.currentScreen = var2;
      } else {
         AppListener.gI().k();
      }

   }
}

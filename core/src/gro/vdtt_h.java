package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import core.listener.SaveScreenShotListener;

public final class vdtt_h implements SaveScreenShotListener {
   final AppListener a;

   public vdtt_h(AppListener var1) {
      this.a = var1;
   }

   public final void a() {
      String var1 = Gdx.app.getType() == ApplicationType.Android ? Caption.vG : (Gdx.app.getType() == ApplicationType.iOS ? Caption.vF : Caption.vH);
      vdtt_gq.gI().a(var1, vdtt_dd.d, -2560);
   }

   public final void b() {
      vdtt_gq.gI().a(Caption.vI, vdtt_dd.d, -65536);
   }
}

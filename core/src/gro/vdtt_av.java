package gro;

import com.badlogic.gdx.Gdx;
import core.listener.VoiceRecordPermission;

final class vdtt_av implements VoiceRecordPermission {
   final boolean a;
   final vdtt_as b;

   vdtt_av(vdtt_as var1, boolean var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void a() {
      vdtt_as var1 = vdtt_as.gI();
      vdtt_aw var2 = new vdtt_aw(this);
      if (!var1.d) {
         var1.a = Gdx.audio.newAudioRecorder(8000, true);
         var1.e = var2;
         var1.d = true;
         (new Thread(new vdtt_at(var1))).start();
      }

   }
}

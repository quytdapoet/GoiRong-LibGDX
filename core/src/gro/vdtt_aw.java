package gro;

import core.listener.VoiceRecordCallback;

final class vdtt_aw implements VoiceRecordCallback {
   final vdtt_av a;

   vdtt_aw(vdtt_av var1) {
      this.a = var1;
   }

   public final void a(short[] var1) {
      if (var1 != null) {
         (new Thread(new vdtt_ax(this, var1))).start();
      }

   }
}

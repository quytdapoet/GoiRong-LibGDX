package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.AudioDevice;
import com.badlogic.gdx.utils.Disposable;

public final class vdtt_aq implements Disposable {
   private final int a = 8000;
   private final AudioDevice b;
   private final short[] c;
   private static vdtt_aq d;
   private static boolean e;

   public vdtt_aq(short[] var1) {
      d = this;
      this.b = Gdx.audio.newAudioDevice(8000, true);
      this.c = var1;
   }

   public static vdtt_aq a() {
      return d;
   }

   public static boolean b() {
      return Gdx.app.getType() == ApplicationType.iOS ? d.b.isMono() : e;
   }

   public final void dispose() {
      try {
         if (Gdx.app.getType() != ApplicationType.iOS) {
            e = false;
            if (this.b != null) {
               this.b.dispose();
            }
         }
      } catch (Exception var2) {
      }

   }

   static short[] a(vdtt_aq var0) {
      return var0.c;
   }

   static AudioDevice b(vdtt_aq var0) {
      return var0.b;
   }

   static boolean a(boolean var0) {
      e = true;
      return true;
   }
}

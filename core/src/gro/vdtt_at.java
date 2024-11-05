package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import java.util.Vector;

final class vdtt_at implements Runnable {
   final vdtt_as a;

   vdtt_at(vdtt_as var1) {
      this.a = var1;
   }

   public final void run() {
      try {
         if (Gdx.app.getType() != ApplicationType.iOS) {
            Vector var1 = new Vector();
            int var2 = 0;

            short[] var3;
            while(vdtt_as.b(this.a)) {
               try {
                  if (GameSrc.gI().cZ == 0L) {
                     vdtt_as.a(this.a, false);
                     break;
                  }

                  var3 = new short[4000];
                  vdtt_as.a(this.a).read(var3, 0, 4000);
                  var1.add(var3);
                  var2 += 4000;
               } catch (Exception var6) {
               }
            }

            var3 = new short[var2];
            var2 = 0;

            for(int var4 = 0; var4 < var1.size(); ++var4) {
               for(int var5 = 0; var5 < ((short[])var1.get(var4)).length; ++var5) {
                  var3[var2] = ((short[])var1.get(var4))[var5];
                  ++var2;
               }
            }

            vdtt_as.a(this.a, var3, true);
            return;
         }
      } catch (Exception var7) {
      }

   }
}

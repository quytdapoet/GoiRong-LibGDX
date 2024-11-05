package gro;

import com.badlogic.gdx.audio.AudioRecorder;
import com.badlogic.gdx.utils.Disposable;
import core.listener.VoiceRecordCallback;
import core.listener.VoiceRecordPermission;

import java.io.IOException;
import java.util.Arrays;

public final class vdtt_as implements Disposable {
   private final int f = 8000;
   AudioRecorder a;
   public static long b;
   public static String c = "";
   private int g;
   public boolean d;
   private static vdtt_as h;
   private static int i;
   VoiceRecordCallback e;

   public static boolean a() {
      if (i == 0) {
         boolean var0;
         if (var0 = AppListener.gI().h.b()) {
            i = 1;
         } else {
            i = 2;
         }

         return var0;
      } else {
         return i == 1;
      }
   }

   public static vdtt_as gI() {
      if (h == null) {
         h = new vdtt_as();
      }

      return h;
   }

   public final void c() {
      boolean var1 = false;
      boolean var2 = false;

      label150: {
         label154: {
            try {
               var2 = true;
               if (GameSrc.gI().cZ <= 0L) {
                  var2 = false;
               } else {
                  if (Utlis.a() - GameSrc.gI().cZ < 1000L) {
                     if (c.length() > 0) {
                        if (AppListener.gI().h.b()) {
                           GameSrc.gI().c(Caption.sN, -1);
                           var2 = false;
                        } else {
                           var2 = false;
                        }
                     } else {
                        var2 = false;
                     }
                     break label154;
                  }

                  var1 = true;
                  this.g = (int)((Utlis.a() - GameSrc.gI().cZ) / 1000L) + 2;
                  this.d();
                  var2 = false;
               }
            } catch (Exception var7) {
               var2 = false;
               break label150;
            } finally {
               if (var2) {
                  if (!var1) {
                     this.g = 0;
                     this.d();
                  }

                  GameSrc.gI().cZ = 0L;
                  vdtt_go.gI().c = true;
               }

            }

            if (!var1) {
               this.g = 0;
               this.d();
            }

            GameSrc.gI().cZ = 0L;
            vdtt_go.gI().c = true;
            return;
         }

         this.g = 0;
         this.d();
         GameSrc.gI().cZ = 0L;
         vdtt_go.gI().c = true;
         return;
      }

      if (!var1) {
         this.g = 0;
         this.d();
      }

      GameSrc.gI().cZ = 0L;
      vdtt_go.gI().c = true;
   }

   public final void dispose() {
      try {
         h = null;
         if (this.a != null) {
            this.a.dispose();
         }
      } catch (Exception var2) {
      }

   }

   private void d() {
      try {
         this.d = false;
         if (this.a != null) {
            this.a.dispose();
         } else {
            this.dispose();
         }
      } catch (Exception var2) {
      }

   }

   public static void a(boolean var0, String var1) {
      c = var1;
      b = Utlis.a();
      a(var0);
   }

   public static void a(boolean var0) {
      if (h != null) {
         h.dispose();
      }

      gI().b(var0);
   }

   private void b(boolean var1) {
      if (GameSrc.gI().cZ != 0L) {
         try {
            AppListener.gI().h.a((VoiceRecordPermission)(new vdtt_av(this, var1)));
         } catch (Exception var3) {
            GameSrc.gI().c(Caption.sP, -65536);
            this.dispose();
         }
      }

   }

   static void a(vdtt_as var0, short[] var1, boolean var2) {
      var2 = var2;
      var1 = var1;
      var0 = var0;

      try {
         if (var2) {
            var0.d = false;
            var1 = Arrays.copyOf(var1, 8000 * var0.g);
            if (var0.e != null) {
               var0.e.a(var1);
               return;
            }
         }

         var0.dispose();
      } catch (Exception var4) {
      }

   }

   static AudioRecorder a(vdtt_as var0) {
      return var0.a;
   }

   static boolean b(vdtt_as var0) {
      return var0.d;
   }

   static boolean a(vdtt_as var0, boolean var1) {
      return var0.d = false;
   }

   static int c(vdtt_as var0) {
      return var0.g;
   }

   static void b(vdtt_as var0, boolean var1) throws IOException {
      Message var3;
      (var3 = Message.c((byte)-29)).writeBoolean(var1);
      var3.send();
   }
}

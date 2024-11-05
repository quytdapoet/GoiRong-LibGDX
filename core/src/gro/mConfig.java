package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;

public final class mConfig {
   private static mConfig a;
   private byte[] b = Binary.d("arr_config");
   private int c = 41;

   public mConfig() {
      if (this.b == null || this.b.length != this.c) {
         this.e();
      }

   }

   private void e() {
      byte[] var1;
      (var1 = new byte[this.c])[0] = 1;
      var1[1] = 1;
      if (DataCenter.gI().p == 2 && DataCenter.gI().t != 2) {
         var1[2] = 0;
      } else {
         var1[2] = 1;
      }

      var1[3] = 1;
      var1[4] = 0;
      var1[5] = 0;
      var1[6] = 1;
      var1[7] = 0;
      var1[8] = 1;
      var1[9] = (byte)(Gdx.app.getType() == ApplicationType.Desktop ? 2 : 1);
      var1[10] = 0;
      var1[11] = 0;
      var1[12] = 0;
      var1[13] = 0;
      var1[14] = 0;
      var1[15] = 0;
      var1[16] = 0;
      var1[17] = 1;
      var1[18] = 1;
      var1[19] = 0;
      var1[20] = 0;
      var1[21] = 0;
      var1[22] = 0;
      var1[23] = 0;
      var1[24] = 0;
      var1[25] = 0;
      var1[26] = 0;
      var1[27] = 0;
      var1[28] = 0;
      var1[29] = 0;
      var1[30] = 1;
      var1[31] = 1;
      var1[32] = 1;
      var1[33] = 1;
      var1[34] = -1;
      var1[35] = 0;
      var1[36] = 0;
      var1[37] = 1;
      var1[38] = 0;
      var1[39] = 0;
      var1[40] = 0;
      if (this.b != null && this.b.length < var1.length) {
         for(int var2 = 0; var2 < this.b.length; ++var2) {
            var1[var2] = this.b[var2];
         }
      }

      this.b = var1;
      Binary.a("arr_config", var1);
   }

   private void f() {
      Binary.a("arr_config", this.b);
   }

   public static mConfig gI() {
      if (a == null) {
         a = new mConfig();
      }

      return a;
   }

   public final boolean b() {
      return this.a(15);
   }

   public final boolean a(int var1) {
      try {
         if (this.b[var1] == 1) {
            return true;
         }
      } catch (Exception var3) {
         this.e();
      }

      return false;
   }

   public final byte b(int var1) {
      try {
         return this.b[var1];
      } catch (Exception var3) {
         this.e();
         return 0;
      }
   }

   public final void a(int var1, boolean var2) {
      try {
         if (var2) {
            this.b[var1] = 1;
         } else {
            this.b[var1] = 0;
         }

         this.f();
      } catch (Exception var4) {
         this.e();
      }

   }

   public final void a(int var1, int var2) {
      try {
         if (this.b != null) {
            this.b[var1] = (byte)var2;
            this.f();
         }
      } catch (Exception var4) {
         this.e();
      }

   }

   public static boolean c() {
      try {
         if (a != null) {
            if (a.b[19] == 1) {
               return true;
            }

            return false;
         }
      } catch (Exception var1) {
      }

      return false;
   }

   public final boolean d() {
      return this.b[37] == 0;
   }
}

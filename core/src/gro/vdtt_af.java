package gro;

import java.util.Vector;

final class vdtt_af implements Runnable {
   public final void run() {
      try {
         Vector var1 = CheckVersionScreen.v();

         for(int var2 = 0; var2 < var1.size(); ++var2) {
            vdtt_ek var3;
            byte[] var4;
            if ((var3 = (vdtt_ek)var1.get(var2)).a()) {
               if ((var4 = Binary.c(DataCenter.gI().URL_SERVER_ASSET + var3.d)) == null) {
                  return;
               }

               if (!Binary.g("arr_savemap")) {
                  Binary.a(var3.e, var4);
               }

               Binary.b("arr_check_" + var3.a, var4.length);
            } else {
               StringBuilder var5 = (new StringBuilder()).append(DataCenter.gI().URL_SERVER).append(DataCenter.gI().URL_IMG_IOS);
               DataCenter.gI();
               if ((var4 = Binary.c(var5.append(DataCenter.a(var3.d) + 1).append("/").append(var3.d).toString())) == null) {
                  return;
               }

               Binary.a(var4, false);
               Binary.b("arr_check_" + var3.a, var4.length);
               if (var3.d.toLowerCase().contains("client") || var3.d.toLowerCase().contains("char")) {
                  vdtt_cz.b();
                  DataCenter.gI().a(false);
                  SettingsTab.L();
                  GameSrc.gI();
                  DataCenter.gI().aQ = false;
                  GameSrc.gI().z();
               }
            }
         }

         vdtt_cz.b();
         DataCenter.gI().a(false);
         DataCenter.aT = 1;
         Caption.a();
         SettingsTab.L();
         GameSrc.gI();
         DataCenter.gI().aQ = false;
         GameSrc.gI().z();
         EntityPanel.z = false;
         vdtt_aa.gI().a();
      } catch (Exception var6) {
      }

   }
}

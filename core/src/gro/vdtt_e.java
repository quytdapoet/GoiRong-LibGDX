package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import java.util.Vector;

final class vdtt_e implements Runnable {
   final AppListener a;

   vdtt_e(AppListener var1) {
      this.a = var1;
   }

   public final void run() {
      boolean var24 = false;

      int var32;
      Server var33;
      String[] var30;
      int var31;
      label439: {
         try {
            var24 = true;
            Vector var1 = new Vector();
            String var2;
            if (DataCenter.aj && !AppListener.g()) {
               if (Gdx.app.getType() == ApplicationType.iOS) {
                  var2 = Binary.a(DataCenter.gI().URL_SERVER_ASSET + "serverlistios.txt", 6);
               } else {
                  var2 = Binary.a(DataCenter.gI().URL_SERVER_ASSET + "serverlistandroid.txt", 6);
               }
            } else {
               var2 = Binary.a(DataCenter.gI().URL_SERVER_ASSET + "serverlist.txt", 6);
            }

            if (var2 == null || var2.isEmpty()) {
               var2 = AppListener.q;
            }

            DataCenter.gI().server = null;
            String[] var3 = var2.replaceAll(" =", "=").replaceAll("= ", "=").split("id=");
            boolean var4 = true;

            int var5;
            for(var5 = 0; var5 < var3.length; ++var5) {
               if (!var3[var5].trim().isEmpty()) {
                  String[] var6 = var3[var5].trim().split("\r\n");
                  ArrayServer var7;
                  (var7 = new ArrayServer()).name = var6[0];
                  Vector var8 = new Vector();

                  int var9;
                  for(var9 = 1; var9 < var6.length; ++var9) {
                     if (!var6[var9].trim().isEmpty()) {
                        String[] var10;
                        String[] var11 = (var10 = var6[var9].split("="))[0].split(":");
                        String[] var12 = var10[1].split(":");
                        DataCenter.gI().ipServer = var12[1];
                        DataCenter.gI().portServer = Integer.parseInt(var12[2]);
                        Server var13 = new Server();
                        if (var11.length <= 1) {
                           var13.name = var10[0];
                        } else {
                           var13.text = var11[0];
                           var13.name = var11[1];
                        }

                        if (!var13.text.toUpperCase().equals(Caption.pe)) {
                           var13.id = Short.parseShort(var12[0]);
                           var13.ipServer = var12[1];
                           var13.portServer = Short.parseShort(var12[2]);
                           var13.portCheckOnline = Short.parseShort(var12[3]);
                           if (var12.length > 4) {
                              var13.strSttaus = var12[4];
                           }

                           if (var12.length > 5) {
                              var13.isFocus = Boolean.parseBoolean(var12[5]);
                           }

                           if (var13.id == 101) {
                              var4 = false;
                              DataCenter.gI().ah = var13;
                           } else {
                              var4 = true;
                              var8.add(var13);
                           }
                        }
                     }
                  }

                  if (var4) {
                     var7.server = new Server[var8.size()];

                     for(var9 = 0; var9 < var8.size(); ++var9) {
                        var7.server[var9] = (Server)var8.get(var9);
                        if (var7.server[var9].isFocus) {
                           DataCenter.gI().server = var7.server[var9];
                        }
                     }

                     var1.add(var7);
                  }
               }
            }

            DataCenter.gI().arrayServer = new ArrayServer[var1.size()];

            for(var5 = 0; var5 < var1.size(); ++var5) {
               DataCenter.gI().arrayServer[var5] = (ArrayServer)var1.get(var5);
            }

            if (DataCenter.gI().server == null) {
               ArrayServer var34 = DataCenter.gI().arrayServer[DataCenter.gI().arrayServer.length - 1];
               DataCenter.gI().server = var34.server[var34.server.length - 1];
               var24 = false;
            } else {
               var24 = false;
            }
            break label439;
         } catch (Exception var28) {
            var24 = false;
         } finally {
            if (var24) {
               try {
                  String[] var15 = Binary.h("arr_server").split(":");

                  for(int var16 = 0; var16 < DataCenter.gI().arrayServer.length; ++var16) {
                     for(int var17 = 0; var17 < DataCenter.gI().arrayServer[var16].server.length; ++var17) {
                        Server var18;
                        if ((var18 = DataCenter.gI().arrayServer[var16].server[var17]).ipServer.toLowerCase().equals(var15[0].toLowerCase()) && var18.portServer == Integer.parseInt(var15[1])) {
                           DataCenter.gI().a(var18);
                           return;
                        }
                     }
                  }
               } catch (Exception var25) {
               }
               DataCenter.gI().a(DataCenter.gI().server);
            }
         }

         try {
            var30 = Binary.h("arr_server").split(":");

            for(var32 = 0; var32 < DataCenter.gI().arrayServer.length; ++var32) {
               for(var31 = 0; var31 < DataCenter.gI().arrayServer[var32].server.length; ++var31) {
                  if ((var33 = DataCenter.gI().arrayServer[var32].server[var31]).ipServer.toLowerCase().equals(var30[0].toLowerCase()) && var33.portServer == Integer.parseInt(var30[1])) {
                     DataCenter.gI().a(var33);
                     return;
                  }
               }
            }
         } catch (Exception var26) {
         }

         DataCenter.gI().a(DataCenter.gI().server);
         return;
      }

      try {
         var30 = Binary.h("arr_server").split(":");

         for(var32 = 0; var32 < DataCenter.gI().arrayServer.length; ++var32) {
            for(var31 = 0; var31 < DataCenter.gI().arrayServer[var32].server.length; ++var31) {
               if ((var33 = DataCenter.gI().arrayServer[var32].server[var31]).ipServer.toLowerCase().equals(var30[0].toLowerCase()) && var33.portServer == Integer.parseInt(var30[1])) {
                  DataCenter.gI().a(var33);
                  return;
               }
            }
         }
      } catch (Exception var27) {
      }

      DataCenter.gI().a(DataCenter.gI().server);
   }
}

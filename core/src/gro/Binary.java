package gro;

import com.badlogic.gdx.files.FileHandle;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public final class Binary {
   public static String a = "vdtt/";
   private static byte[] b = new byte[]{-119, 80, 78, 71, 13, 10, 26, 10, 0, 0, 0, 13, 73, 72, 68, 82, 0, 0, 0, 2, 0, 0, 0, 2, 8, 6, 0, 0, 0, 114, -74, 13, 36, 0, 0, 0, 11, 73, 68, 65, 84, 120, 94, 99, 96, 64, 7, 0, 0, 18, 0, 1, 11, -69, 36, -100, 0, 0, 0, 0, 73, 69, 78, 68, -82, 66, 96, -126};

   public static Reader a(String var0) {
      byte[] var1;
      return (var1 = b(var0, true)) != null ? new Reader(var1) : null;
   }

   public static short[] a() {
      Reader var0 = null;

      short[] var3;
      try {
         if ((var0 = a("arr_keys")) == null) {
            short[] var2 = new short[]{19, 20, 21, 22, 53, 48, 46, 33, 51, 45, 29, 47, 32, 34};
            return var2;
         }

         short[] var1 = new short[]{var0.dis.readShort(), var0.dis.readShort(), var0.dis.readShort(), var0.dis.readShort(), var0.dis.readShort(), var0.dis.readShort(), var0.dis.readShort(), var0.dis.readShort(), var0.dis.readShort(), var0.dis.readShort(), var0.dis.readShort(), var0.dis.readShort(), var0.dis.readShort(), var0.dis.readShort()};
         return var1;
      } catch (Exception var7) {
         Utlis.a(var7);
         var3 = new short[]{19, 20, 21, 22, 53, 48, 46, 33, 51, 45, 29, 47, 32, 34};
      } finally {
         if (var0 != null) {
            var0.close();
         }

      }

      return var3;
   }

   public static byte[] b(String var0) {
      return a(var0, (ByteArrayOutputStream)null, (byte[])null, new int[1], new int[1], 20);
   }

   public static byte[] c(String var0) {
      return a(var0, (ByteArrayOutputStream)null, (byte[])null, new int[1], new int[1], 20);
   }

   private static byte[] a(String var0, ByteArrayOutputStream var1, byte[] var2, int[] var3, int[] var4, int var5) {
      while(true) {
         if (DataCenter.aj) {
            var5 = 1;
         }

         int var10003 = var4[0];
         int var10000 = var4[0];
         var4[0] = var10003 + 1;
         HttpURLConnection var7 = null;
         BufferedInputStream var8 = null;
         Object var9 = null;
         boolean var10 = false;

         byte[] var36;
         label319: {
            try {
               var10 = true;
               (var7 = (HttpURLConnection)(new URL(var0)).openConnection()).setConnectTimeout(Utlis.b);
               var7.setReadTimeout(Utlis.b * 2);
               if (var3[0] > 0) {
                  var7.setRequestProperty("Range", "bytes=" + var3[0] + "-");
               }

               var8 = new BufferedInputStream(var7.getInputStream());
               if (var1 == null) {
                  var1 = new ByteArrayOutputStream();
               }

               byte[] var11;
               int var12;
               for(var11 = new byte[524288]; (var12 = var8.read(var11)) != -1; var3[0] += var12) {
                  Session var13 = Session.gI();
                  var13.countSend += var12;
                  var13 = Session.gI();
                  var13.l += var12;
                  var1.write(var11, 0, var12);
               }

               var1.flush();
               if (var2 == null) {
                  var36 = var1.toByteArray();
               } else {
                  var11 = var1.toByteArray();
                  var36 = new byte[var2.length + var11.length];
                  System.arraycopy(var2, 0, var36, 0, var2.length);
                  System.arraycopy(var11, 0, var36, var2.length, var11.length);
               }

               var1.close();
               var10 = false;
               break label319;
            } catch (Exception var34) {
               var10 = false;
            } finally {
               if (var10) {
                  try {
                     if (var8 != null) {
                        var8.close();
                     }
                  } catch (Exception var31) {
                     Utlis.a(var31);
                  }

                  try {
                     if (var1 != null) {
                        var1.close();
                     }
                  } catch (Exception var30) {
                     Utlis.a(var30);
                  }

                  if (var7 != null) {
                     var7.disconnect();
                  }

                  if (var1 == null) {
                     Utlis.g();
                     if (var4[0] > var5) {
                        return null;
                     }

                     var4 = var4;
                     var3 = var3;
                     var2 = var2;
                     var1 = var1;
                     var0 = var0;
                     continue;
                  }
               }

            }

            try {
               if (var8 != null) {
                  var8.close();
               }
            } catch (Exception var29) {
               Utlis.a(var29);
            }

            try {
               if (var1 != null) {
                  var1.close();
               }
            } catch (Exception var28) {
               Utlis.a(var28);
            }

            if (var7 != null) {
               var7.disconnect();
            }

            if (var1 == null) {
               Utlis.g();
               if (var4[0] > var5) {
                  return null;
               }

               var4 = var4;
               var3 = var3;
               var2 = var2;
               var1 = var1;
               var0 = var0;
               continue;
            }

            return (byte[])var9;
         }

         try {
            var8.close();
         } catch (Exception var33) {
            Utlis.a(var33);
         }

         try {
            if (var1 != null) {
               var1.close();
            }
         } catch (Exception var32) {
            Utlis.a(var32);
         }

         if (var7 != null) {
            var7.disconnect();
         }

         if (var1 != null) {
            return var36;
         }

         Utlis.g();
         if (var4[0] > var5) {
            return null;
         }

         var4 = var4;
         var3 = var3;
         var2 = var2;
         var1 = var1;
         var0 = var0;
      }
   }

   public static String a(String var0, int var1) {
      while(true) {
         HttpURLConnection var2 = null;
         BufferedReader var3 = null;
         String var4 = "";
         boolean var5 = false;

         label183: {
            label184: {
               try {
                  var5 = true;
                  (var2 = (HttpURLConnection)(new URL(var0)).openConnection()).setConnectTimeout(Utlis.b);
                  var2.setReadTimeout(Utlis.b * 2);

                  String var6;
                  for(var3 = new BufferedReader(new InputStreamReader(var2.getInputStream(), "UTF-8")); (var6 = var3.readLine()) != null; var4 = var4 + var6 + "\r\n") {
                  }

                  var5 = false;
                  break label184;
               } catch (Exception var20) {
                  if (var1 < 0) {
                     var20.printStackTrace();
                     var5 = false;
                  } else {
                     var5 = false;
                  }
               } finally {
                  if (var5) {
                     try {
                        if (var3 != null) {
                           var3.close();
                        }
                     } catch (Exception var17) {
                        Utlis.a(var17);
                     }

                     if (var2 != null) {
                        var2.disconnect();
                     }
                  }

               }

               try {
                  if (var3 != null) {
                     var3.close();
                  }
               } catch (Exception var19) {
                  Utlis.a(var19);
               }

               if (var2 != null) {
                  var2.disconnect();
               }
               break label183;
            }

            try {
               var3.close();
            } catch (Exception var18) {
               Utlis.a(var18);
            }

            if (var2 != null) {
               var2.disconnect();
            }
         }

         if (var4.length() != 0) {
            return var4;
         }

         Utlis.a(50L);
         --var1;
         if (var1 < 0) {
            return null;
         }

         var0 = var0;
      }
   }

   public static byte[] d(String var0) {
      return b(var0, true);
   }

   public static boolean e(String var0) {
      vdtt_dp var1 = null;
      boolean var2 = false;

      label166: {
         label167: {
            try {
               var2 = true;
               if ((var1 = vdtt_dp.a(vdtt_y.a(var0), false)) == null) {
                  var2 = false;
                  break label166;
               }

               if (var1.a(1) == null) {
                  var2 = false;
                  break label166;
               }

               var2 = false;
            } catch (Exception var19) {
               Utlis.a(var19);
               var2 = false;
               break label167;
            } finally {
               if (var2) {
                  try {
                     if (var1 != null) {
                        var1.a = null;
                     }
                  } catch (Exception var15) {
                     Utlis.a(var15);
                  }
               }

            }

            try {
               if (var1 != null) {
                  var1.a = null;
               }
            } catch (Exception var17) {
               Utlis.a(var17);
            }

            return true;
         }

         try {
            if (var1 != null) {
               var1.a = null;
               return false;
            }
         } catch (Exception var16) {
            Utlis.a(var16);
         }

         return false;
      }

      try {
         if (var1 != null) {
            var1.a = null;
         }
      } catch (Exception var18) {
         Utlis.a(var18);
      }

      return false;
   }

   private static byte[] b(String var0, boolean var1) {
      if (!mConfig.c() || !var0.contains("tree_") && !var0.contains("char_") && !var0.contains("mapsmall_")) {
         vdtt_dp var2 = null;
         byte[] var3 = null;
         boolean var4 = false;

         label289: {
            try {
               int var5;
               try {
                  var4 = true;
                  if ((var3 = (var2 = vdtt_dp.a(vdtt_y.a(var0), false)).a(1)) == null && !var0.equals("arr_config") && (!var0.contains("tree_") || DataCenter.k())) {
                     DataCenter.gI();
                     var5 = DataCenter.a(var0) + 1;
                     if (var0.contains("tree") && var5 >= 2) {
                        var5 = 2;
                     }

                     if (!var0.equals("arr_data_game") && !var0.equals("arr_check_0")) {
                        var2 = vdtt_dp.b("data/" + var5 + "/" + var0 + vdtt_y.a(), false);
                     } else {
                        var2 = vdtt_dp.b("data/" + var0 + vdtt_y.a(), false);
                     }

                     var3 = var2.a(1);
                  }

                  if (var3 != null) {
                     if (var0.equals("arr_check_0")) {
                        try {
                           var5 = Integer.parseInt(new String(var3, "UTF-8"));
                           b(var0, var5);
                           DataCenter.gI().a(true);
                           var4 = false;
                        } catch (Exception var23) {
                           var4 = false;
                        }
                     } else if (var0.equals("arr_data_game")) {
                        var3 = Utlis.c(var3);
                        var4 = false;
                     } else if (!var0.contains("mapmini") && !var0.startsWith("mapsmall_") && !var0.startsWith("mapscale_") && !var0.contains("char_") && !var0.contains("client_") && !var0.contains("tree_") && !var0.contains("font_")) {
                        var4 = false;
                     } else {
                        Utlis.a(var3);
                        var4 = false;
                     }
                  } else {
                     var4 = false;
                  }
                  break label289;
               } catch (Exception var24) {
                  if (var0.equals("arr_check_0")) {
                     if ((var3 = (var2 = vdtt_dp.b("data/" + var0 + vdtt_y.a(), false)).a(1)) != null) {
                        try {
                           var5 = Integer.parseInt(new String(var3, "UTF-8"));
                           b(var0, var5);
                           DataCenter.gI().a(true);
                           var4 = false;
                        } catch (Exception var21) {
                           var4 = false;
                        }
                     } else {
                        var4 = false;
                     }
                  } else {
                     var4 = false;
                  }
               }
            } finally {
               if (var4) {
                  try {
                     if (var2 != null) {
                        var2.a = null;
                     }
                  } catch (Exception var19) {
                     Utlis.a(var19);
                  }
               }
            }

            try {
               if (var2 != null) {
                  var2.a = null;
                  return var3;
               }
            } catch (Exception var20) {
               Utlis.a(var20);
            }

            return var3;
         }

         try {
            if (var2 != null) {
               var2.a = null;
            }
         } catch (Exception var22) {
            Utlis.a(var22);
         }

         return var3;
      } else {
         return b;
      }
   }

   public static int f(String var0) {
      try {
         return Integer.parseInt(h(var0));
      } catch (Exception var2) {
         return Integer.MIN_VALUE;
      }
   }

   public static boolean g(String var0) {
      byte[] var1;
      if ((var1 = b(var0, true)) == null) {
         return false;
      } else {
         return var1[0] != 0;
      }
   }

   public static String h(String var0) {
      Object var1 = null;

      try {
         byte[] var2;
         return (var2 = b(var0, true)) == null ? null : new String(var2, "UTF-8");
      } catch (Exception var3) {
         Utlis.a(var3);
         return new String((byte[])var1);
      }
   }

   private static boolean l(String var0) {
      return !var0.contains("arr_map_") && !var0.contains("arr_data_game") && vdtt_dw.a > 0 && mConfig.c();
   }

   public static void a(String var0, short[] var1) {
      if (!l(var0)) {
         vdtt_dp var2 = null;
         boolean var3 = false;

         label137: {
            try {
               var3 = true;
               Writer var4 = new Writer();

               for(int var5 = 0; var5 < var1.length; ++var5) {
                  var4.writeShort(var1[var5]);
               }

               byte[] var21 = var4.baos.toByteArray();
               var4.close();
               if ((var2 = vdtt_dp.a(vdtt_y.a(var0), true)).a() > 0) {
                  var2.a(1, var21, 0, var21.length);
                  var3 = false;
               } else {
                  var2.a(var21, 0, var21.length);
                  var3 = false;
               }
               break label137;
            } catch (Exception var19) {
               var3 = false;
            } finally {
               if (var3) {
                  try {
                     if (var2 != null) {
                        var2.a = null;
                     }
                  } catch (Exception var16) {
                     Utlis.a(var16);
                  }
               }

            }

            try {
               if (var2 != null) {
                  var2.a = null;
               }

               return;
            } catch (Exception var17) {
               Utlis.a(var17);
               return;
            }
         }

         try {
            if (var2 != null) {
               var2.a = null;
            }
         } catch (Exception var18) {
            Utlis.a(var18);
         }
      }

   }

   public static void a(String var0, byte[] var1) {
      if (!l(var0)) {
         vdtt_dp var2 = null;
         boolean var3 = false;

         label121: {
            try {
               var3 = true;
               if ((var2 = vdtt_dp.a(vdtt_y.a(var0), true)).a() > 0) {
                  var2.a(1, var1, 0, var1.length);
                  var3 = false;
               } else {
                  var2.a(var1, 0, var1.length);
                  var3 = false;
               }
               break label121;
            } catch (Exception var17) {
               var3 = false;
            } finally {
               if (var3) {
                  try {
                     if (var2 != null) {
                        var2.a = null;
                     }
                  } catch (Exception var14) {
                     Utlis.a(var14);
                  }
               }

            }

            try {
               if (var2 != null) {
                  var2.a = null;
               }

               return;
            } catch (Exception var15) {
               Utlis.a(var15);
               return;
            }
         }

         try {
            if (var2 != null) {
               var2.a = null;
            }
         } catch (Exception var16) {
            Utlis.a(var16);
         }
      }

   }

   public static void a(String var0, String var1) {
      try {
         a(var0, var1.getBytes("UTF-8"));
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }

   public static void b(String var0, int var1) {
      try {
         a(var0, String.valueOf(var1).getBytes("UTF-8"));
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }

   public static void a(String var0, boolean var1) {
      try {
         a(var0, new byte[]{(byte)(var1 ? 1 : 0)});
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }

   public static mImage i(String var0) {
      try {
         byte[] var1;
         return mImage.a(var1 = b(var0, true), 0, var1.length);
      } catch (Exception var2) {
         return null;
      }
   }

   public static mImage a(byte[] var0) {
      try {
         return mImage.a(var0, 0, var0.length);
      } catch (Exception var2) {
         Utlis.a(var2);
         return null;
      }
   }

   public static mImage a(int var0, int var1) {
      try {
         return mImage.a(var0, var1);
      } catch (Exception var3) {
         Utlis.a(var3);
         return null;
      }
   }

   public static void a(mImage var0) {
      if (var0 != null) {
         var0.c();
      }

   }

   public static void b(mImage var0) {
      if (var0 != null) {
         var0 = var0;

         try {
            if (var0.equals(vdtt_cz.a)) {
               return;
            }

            if (var0.b != null) {
               var0.b.dispose();
               var0.b = null;
            }

            if (var0.a != null) {
               var0.a.dispose();
               var0.a = null;
            }

            return;
         } catch (Exception var2) {
            Utlis.a(var2);
         }
      }

   }

   public static void j(String var0) {
      try {
         Utlis.i(var0).delete();
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   public static void k(String var0) {
      try {
         FileHandle[] var1;
         int var2 = (var1 = Utlis.i("").list()).length;

         for(int var3 = 0; var3 < var2; ++var3) {
            FileHandle var4;
            if ((var4 = var1[var3]).name().startsWith(var0)) {
               var4.delete();
            }
         }
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }

   public static void b() {
      try {
         FileHandle[] var0;
         int var1 = (var0 = Utlis.i("").list()).length;

         for(int var2 = 0; var2 < var1; ++var2) {
            FileHandle var3 = var0[var2];

            try {
               if (!var3.name().startsWith(vdtt_y.b("arr_acc")) && !var3.name().startsWith(vdtt_y.b("arr_config")) && !var3.name().startsWith(vdtt_y.b("arr_full")) && !var3.name().startsWith(vdtt_y.b("arr_sc")) && !var3.name().startsWith(vdtt_y.b("arr_auto")) && !var3.name().startsWith(vdtt_y.b("arr_server"))) {
                  var3.delete();
               }
            } catch (Exception var5) {
            }
         }

         DataCenter.gI().q = 0;
         CheckVersionScreen.J = false;
      } catch (Exception var6) {
         Utlis.a(var6);
      }

      DataCenter var7 = DataCenter.gI();
      vdtt_cj var8 = new vdtt_cj();
      var7.currentScreen = var8;
   }

   public static void a(byte[] var0, boolean var1) {
      ZipInputStream var2 = null;
      boolean var3 = false;

      label159: {
         try {
            var3 = true;
            var2 = new ZipInputStream(new ByteArrayInputStream(var0));

            ZipEntry var4;
            while((var4 = var2.getNextEntry()) != null) {
               try {
                  ByteArrayOutputStream var5 = new ByteArrayOutputStream();
                  byte[] var6 = new byte[524288];

                  int var7;
                  while((var7 = var2.read(var6)) != -1) {
                     var5.write(var6, 0, var7);
                  }

                  var5.flush();
                  String var8;
                  if (!(var8 = var4.getName().replaceAll("bitmapC", "c").replaceAll("iconTreeZip", "tree").replaceAll("iconTree", "tree").replaceAll("iconCharZip", "char_icon").replaceAll("iconChar", "char_icon").replaceAll("iconClient", "client_icon").replaceAll("/", "_").replaceAll(".png", "").replaceAll(vdtt_y.a(), "")).contains("music")) {
                     var8.contains("sound");
                  }

                  if ((var6 = var5.toByteArray()).length > 0) {
                     a(var8, var6);
                  }

                  var5.close();
               } catch (Exception var22) {
               }
            }

            var3 = false;
            break label159;
         } catch (Exception var23) {
            var3 = false;
         } finally {
            if (var3) {
               try {
                  if (var2 != null) {
                     var2.close();
                  }
               } catch (Exception var19) {
               }
            }

         }

         try {
            if (var2 != null) {
               var2.close();
            }

            return;
         } catch (Exception var20) {
            return;
         }
      }

      try {
         var2.close();
      } catch (Exception var21) {
      }

   }

   public static String randomz(int[] var0) {
      StringBuffer var1 = new StringBuffer();

      for(int var2 = 0; var2 < var0.length; ++var2) {
         int var3 = var0[var2] >> 3;
         var1.append((char)var3);
      }

      return var1.toString();
   }
}

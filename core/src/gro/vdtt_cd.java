package gro;

import java.io.IOException;
import java.util.Collections;
import java.util.Vector;

public class vdtt_cd extends MainScreen {
   private final String I;
   private vdtt_du[] J;
   private static Vector K = new Vector();
   public static Vector d = new Vector();
   private static int L;
   private static int M;
   private static int N;
   private static int O;
   private static int P;
   private static int Q;
   private static Entity R;
   private static boolean S;
   protected int H = 800;
   private boolean T = false;
   private static boolean U;
   public static mImage iconTool;
   public static mImage bg = null;

   public vdtt_cd() {
      this.I = Utlis.e(DataCenter.gI().ver2);
      try{
         AppListener.d();
         this.J = new vdtt_du[100];

         for(int var1 = 0; var1 < this.J.length; ++var1) {
            int var2 = var1 % 3 == 0 ? 443 : (var1 % 3 == 1 ? 444 : 445);
            this.J[var1] = new vdtt_du(var2, Utlis.a(1, 3), 0, 9, var1, this.J.length, DataCenter.gI().n, DataCenter.gI().o + DataCenter.gI().o % DataCenter.gI().r, false);
         }


         if (d.size() <= 0) {
            Reader var29 = null;

            try {
               if ((var29 = Binary.a("arr_map_30")) != null) {
                  Reader var30 = var29;
                  vdtt_ix[] var3 = new vdtt_ix[var29.dis.readUnsignedShort()];
                  Vector var4 = new Vector();

                  short var5;
                  short var6;
                  vdtt_fw var7;
                  int var8;
                  int var9;
                  int var10;
                  vdtt_fw[] var11;
                  for(short var12 = 0; var12 < var3.length; ++var12) {
                     var4.removeAllElements();
                     var3[var12] = new vdtt_ix();
                     var3[var12].a = var30.dis.readShort();
                     var3[var12].b = var30.dis.readShort();
                     var3[var12].c = var30.dis.readByte();
                     var3[var12].d = var30.dis.readShort();
                     var3[var12].e = var30.dis.readShort();
                     var5 = var30.readUnsignedByte();

                     for(var8 = 0; var8 < var5; ++var8) {
                        var6 = var30.readUnsignedByte();

                        for(var9 = 0; var9 < var6; ++var9) {
                           (var7 = new vdtt_fw()).d = new XYEntity[var30.dis.readByte() / 2];

                           for(var10 = 0; var10 < var7.d.length; ++var10) {
                              var7.d[var10] = new XYEntity();
                              var7.d[var10].setXY(var30.dis.readShort(), var30.dis.readShort());
                              if (var10 == 0) {
                                 var7.e = var7.g = var7.d[var10].cx;
                                 var7.f = var7.h = var7.d[var10].cy;
                              } else {
                                 if (var7.d[var10].cx < var7.e) {
                                    var7.e = var7.d[var10].cx;
                                 }

                                 if (var7.d[var10].cx > var7.g) {
                                    var7.g = var7.d[var10].cx;
                                 }

                                 if (var7.d[var10].cy < var7.f) {
                                    var7.f = var7.d[var10].cy;
                                 }

                                 if (var7.d[var10].cy > var7.h) {
                                    var7.h = var7.d[var10].cy;
                                 }
                              }
                           }

                           var4.addElement(var7);
                        }
                     }

                     if (var4.size() > 0) {
                        var11 = new vdtt_fw[var4.size()];

                        for(var8 = 0; var8 < var4.size(); ++var8) {
                           var11[var8] = (vdtt_fw)var4.elementAt(var8);
                        }

                        var3[var12].f = new vdtt_fk(var11);
                     }
                  }

                  GameSrc.gI().T = var3;
                  vdtt_fl[] var31 = new vdtt_fl[var30.dis.readUnsignedShort()];

                  int var13;
                  for(var8 = 0; var8 < var31.length; ++var8) {
                     var4.removeAllElements();
                     var31[var8] = new vdtt_fl();
                     var31[var8].a = var30.dis.readShort();
                     var31[var8].b = var30.dis.readShort();
                     var31[var8].c = new vdtt_iw[var30.readUnsignedByte()];

                     for(var9 = 0; var9 < var31[var8].c.length; ++var9) {
                        var31[var8].c[var9] = new vdtt_iw(var30.dis.readShort());
                        var31[var8].c[var9].cx = var31[var8].c[var9].m = var30.dis.readShort();
                        var31[var8].c[var9].cy = var31[var8].c[var9].n = var30.dis.readShort();
                        var31[var8].c[var9].k = var30.dis.readByte();
                        if (var31[var8].c[var9].m().f != null) {
                           for(var10 = 0; var10 < var31[var8].c[var9].m().f.a.size(); ++var10) {
                              var7 = ((vdtt_fw)var31[var8].c[var9].m().f.a.get(var10)).a();
                              if (var31[var8].c[var9].k == 7) {
                                 var7.d = Utlis.a(var7.d);
                              }

                              for(var13 = 0; var13 < var7.d.length; ++var13) {
                                 XYEntity var14 = var7.d[var13];
                                 var14.cx += var31[var8].c[var9].cx;
                                 var14 = var7.d[var13];
                                 var14.cy += var31[var8].c[var9].cy;
                                 if (var13 == 0) {
                                    var7.e = var7.g = var7.d[var13].cx;
                                    var7.f = var7.h = var7.d[var13].cy;
                                 } else {
                                    if (var7.d[var13].cx < var7.e) {
                                       var7.e = var7.d[var13].cx;
                                    }

                                    if (var7.d[var13].cx > var7.g) {
                                       var7.g = var7.d[var13].cx;
                                    }

                                    if (var7.d[var13].cy < var7.f) {
                                       var7.f = var7.d[var13].cy;
                                    }

                                    if (var7.d[var13].cy > var7.h) {
                                       var7.h = var7.d[var13].cy;
                                    }
                                 }
                              }

                              var4.addElement(var7);
                           }
                        }
                     }

                     var5 = var30.readUnsignedByte();

                     for(var9 = 0; var9 < var5; ++var9) {
                        var6 = var30.readUnsignedByte();

                        for(var10 = 0; var10 < var6; ++var10) {
                           (var7 = new vdtt_fw()).d = new XYEntity[var30.dis.readByte() / 2];

                           for(var13 = 0; var13 < var7.d.length; ++var13) {
                              var7.d[var13] = new XYEntity();
                              var7.d[var13].setXY(var30.dis.readShort(), var30.dis.readShort());
                              if (var13 == 0) {
                                 var7.e = var7.g = var7.d[var13].cx;
                                 var7.f = var7.h = var7.d[var13].cy;
                              } else {
                                 if (var7.d[var13].cx < var7.e) {
                                    var7.e = var7.d[var13].cx;
                                 }

                                 if (var7.d[var13].cx > var7.g) {
                                    var7.g = var7.d[var13].cx;
                                 }

                                 if (var7.d[var13].cy < var7.f) {
                                    var7.f = var7.d[var13].cy;
                                 }

                                 if (var7.d[var13].cy > var7.h) {
                                    var7.h = var7.d[var13].cy;
                                 }
                              }
                           }

                           var4.addElement(var7);
                        }
                     }

                     if (var4.size() > 0) {
                        var11 = new vdtt_fw[var4.size()];

                        for(var9 = 0; var9 < var4.size(); ++var9) {
                           var11[var9] = (vdtt_fw)var4.elementAt(var9);
                        }

                        var31[var8].d = new vdtt_fk(var11);
                     }
                  }

                  new Vector();
                  L = var29.dis.readShort();
                  M = var29.dis.readShort();
                  vdtt_fw[] var32;
                  (var32 = new vdtt_fw[var29.readUnsignedByte() + 6])[var32.length - 1] = b(-50, -50, 120, 65);
                  var32[var32.length - 2] = b(L - 100, -50, L + 50, 100);
                  var32[var32.length - 3] = b(-50, -50, L + 50, 15);
                  var32[var32.length - 4] = b(-50, -50, 15, M + 50);
                  var32[var32.length - 5] = b(-50, M - 15, L + 50, M + 50);
                  var32[var32.length - 6] = b(L - 15, -50, L + 50, M + 50);

                  for(var13 = 0; var13 < var32.length - 6; ++var13) {
                     var32[var13] = new vdtt_fw();
                     var32[var13].d = new XYEntity[var29.readUnsignedByte()];

                     for(int var15 = 0; var15 < var32[var13].d.length; ++var15) {
                        var32[var13].d[var15] = new XYEntity();
                        var32[var13].d[var15].setXY(var29.dis.readShort(), var29.dis.readShort());
                        if (var15 == 0) {
                           var32[var13].e = var32[var13].g = var32[var13].d[var15].cx;
                           var32[var13].f = var32[var13].h = var32[var13].d[var15].cy;
                        } else {
                           if (var32[var13].d[var15].cx < var32[var13].e) {
                              var32[var13].e = var32[var13].d[var15].cx;
                           }

                           if (var32[var13].d[var15].cx > var32[var13].g) {
                              var32[var13].g = var32[var13].d[var15].cx;
                           }

                           if (var32[var13].d[var15].cy < var32[var13].f) {
                              var32[var13].f = var32[var13].d[var15].cy;
                           }

                           if (var32[var13].d[var15].cy > var32[var13].h) {
                              var32[var13].h = var32[var13].d[var15].cy;
                           }
                        }
                     }
                  }

                  new vdtt_fk(var32);
                  vdtt_fv[] var33 = new vdtt_fv[var29.dis.readShort()];
                  Vector var16 = new Vector();
                  Vector var17 = new Vector();

                  int var19;
                  for(int var18 = 0; var18 < var33.length; ++var18) {
                     var33[var18] = new vdtt_fv();
                     var33[var18].a = var29.dis.readBoolean();
                     if (var33[var18].a) {
                        var17.add(var33[var18]);
                     } else {
                        var16.add(var33[var18]);
                     }

                     var33[var18].d = new XYEntity[var29.dis.readShort()];

                     for(var19 = 0; var19 < var33[var18].d.length; ++var19) {
                        var33[var18].d[var19] = new XYEntity();
                        var33[var18].d[var19].setXY(var29.dis.readShort(), var29.dis.readShort());
                     }
                  }

                  var6 = var29.dis.readShort();

                  for(var19 = 0; var19 < var6; ++var19) {
                     var29.dis.readShort();
                  }

                  d.clear();
                  var6 = var29.dis.readShort();
                  Short var20 = null;
                  var13 = 0;
                  Vector var21 = new Vector();

                  for(int var22 = 0; var22 < var6; ++var22) {
                     if (var13 == 0) {
                        var20 = var29.dis.readShort();
                        var13 = var29.dis.readShort();
                     }

                     vdtt_iw var23 = null;
                     (var23 = new vdtt_iw(var20)).cx = var23.m = var29.dis.readShort();
                     var23.cy = var23.n = var29.dis.readShort();
                     var23.k = var29.dis.readByte();
                     if (var23.m().e >= 0 && var23.m().d >= 6 && var23.m().d != 11) {
                        var21.add(var23);
                        if (var23.m().d != 9 && var23.m().d == 10) {
                        }
                     } else {
                        d.add(var23);
                     }

                     if (var13 > 0) {
                        --var13;
                     }
                  }

                  if (R == null) {
                     R = new vdtt_ey(DataCenter.gI().n / 2, M);
                  }

                  return;
               }

               return;
            } catch (Exception var27) {
            } finally {
               if (var29 != null) {
                  var29.close();
               }

            }

         }
      }catch (Exception e){
         e.printStackTrace();
      }
   }

   public void a_() {
      if (this.T) {
         this.H -= 30;
      } else {
         this.H += 30;
      }

      if (this.H > 1500) {
         this.T = true;
         this.H = 1500;
      } else if (this.H < 800) {
         this.T = false;
         this.H = 800;
      }

      try {
         if (AppListener.o) {
            AppListener.o = false;
            Graphics.a();
         }

         if (R != null) {
            if (S) {
               ++R.cx;
               if (R.cx >= L - DataCenter.gI().n / 2) {
                  S = false;
               }
            } else {
               --R.cx;
               if (R.cx <= DataCenter.gI().n / 2) {
                  S = true;
               }
            }
         }

         K.clear();

         int var2;
         for(var2 = 0; var2 < d.size(); ++var2) {
            vdtt_iw var1;
            (var1 = (vdtt_iw)d.get(var2)).n();
            if (Utlis.a(var1.minX() - 50, var1.minY() - 50, var1.maxX() + 50, var1.cy + 50, N, O, P, Q)) {
               K.addElement(var1);
            }
         }

         try {
            int var3 = R.cx - DataCenter.gI().n / 2;
            var2 = R.cy - DataCenter.gI().o / 2 - R.height / 2 - DataCenter.gI().o / 8;
            int var4 = R.cx + DataCenter.gI().n / 2;
            int var5 = R.cy + DataCenter.gI().o / 2 - R.height / 2 - DataCenter.gI().o / 8;
            if (var3 < 0) {
               var4 = DataCenter.gI().n;
            }

            if (var2 < 0) {
               var2 = 0;
               var5 = DataCenter.gI().o;
            }

            if (var4 > L) {
               DataCenter.gI();
            }

            if (var5 > M) {
               var2 = (short)(M - DataCenter.gI().o);
            }

            if (U) {
               if ((N -= 3) <= 0) {
                  N = 0;
                  U = false;
               }
            } else if ((N += 3) >= 2400) {
               U = true;
            }

            O = var2;
            P = N + DataCenter.gI().n;
            Q = O + DataCenter.gI().o;

            for(var2 = 0; var2 < d.size(); ++var2) {
               vdtt_iw var6 = (vdtt_iw)d.get(var2);
               var4 = N;
               short var7 = var6.m;
               if (var6.m().c == 7 || var6.m().c == 6 && var6.m().d == -1) {
                  var7 = (short)(var6.m + var4 * 20 / 23);
               } else if (var6.m().c == 8) {
                  var7 = (short)(var6.m + var4 * 10 / 13);
               } else if (var6.m().c == 9) {
                  var7 = (short)(var6.m + var4 * 20 / 22);
               } else if (var6.m().c == 10) {
                  var7 = (short)(var6.m + var4 * 10 / 12);
               }

               if (var6.o != null) {
                  if (var6.m().d == 2) {
                     var7 = (short)(var6.m + var4 * 20 / 23);
                  } else if (var6.m().d == 3) {
                     var7 = (short)(var6.m + var4 * 10 / 13);
                  } else if (var6.m().d == 4) {
                     var7 = (short)(var6.m + var4 * 20 / 22);
                  } else if (var6.m().d == 5 || var6.o.k == 11) {
                     var7 = (short)(var6.m + var4 * 10 / 12);
                  }

                  var6.o.a(var7, var6.cy);
               }

               if (var6.p != null) {
                  if (var6.m().d == 2) {
                     var7 = (short)(var6.m + var4 * 20 / 23);
                     var6.p.b(var7, var6.cy);
                  } else if (var6.m().d == 3) {
                     var7 = (short)(var6.m + var4 * 10 / 13);
                     var6.p.b(var7, var6.cy);
                  } else if (var6.m().d == 4) {
                     var7 = (short)(var6.m + var4 * 20 / 22);
                     var6.p.b(var7, var6.cy);
                  } else if (var6.m().d == 5) {
                     var7 = (short)(var6.m + var4 * 10 / 12);
                     var6.p.b(var7, var6.cy);
                  }

                  var6.p.r();
                  var6.width = var6.p.width;
                  var6.height = var6.p.height;
                  var6.setXY(var6.p.cx, var6.p.cy);
               }

               var6.cx = var7;
            }
         } catch (Exception var8) {
         }

         Collections.sort(K, XYEntity.D);
      } catch (Exception var9) {
         Utlis.a(var9);
      }

   }

   public void c() {
   }

   public static mImage getIconTool() {
      try {
         if (iconTool == null || iconTool.b() == null) {
            Binary.a("arr_icon2", Binary.c(DataCenter.gI().URL_SERVER + "logo.png"));
            iconTool = mImage.a(Binary.d("arr_icon2"), 0, 0);
         }

         return iconTool;
      } catch (Exception var1) {
         return mImage.a(1, 1);
      }
   }

   public static mImage getBG() {
      try {
         if (bg == null || bg.b() == null) {
            Binary.a("arr_bg", Binary.c(DataCenter.gI().URL_SERVER + "bg.jpg"));
            bg = mImage.a(Binary.d("arr_bg"), 0, 0);
         }

         return bg;
      } catch (Exception var1) {
         return mImage.a(1, 1);
      }
   }

   protected static void b(Graphics var0, int var1, int var2) {
      mImage var3 = getIconTool();
      if (var3 != null) {
         var0.a(var3, 0, 0, var3.c, var3.d, 0, DataCenter.gI().currentScreen.width / 2, var2 + var3.d / 6, var3.c / 2 * DataCenter.gI().r, var3.d / 2 * DataCenter.gI().r, 33);
      }

   }

   public void b(Graphics var1) {
      try {
         if (AppListener.gI().f > 0) {
            --AppListener.gI().f;
            if (AppListener.gI().f == 0) {
               DataCenter.gI().g();
               return;
            }
         }

         if (!DataCenter.k() && !(this instanceof CheckVersionScreen) && !(this instanceof LoginPCScreen) && !(this instanceof vdtt_cs)) {
            return;
         }

         mImage var2 = getBG();
         var1.a(var2, 0, 0, var2.c, var2.d, 0, 0, 0, DataCenter.gI().n * DataCenter.gI().r, DataCenter.gI().o * DataCenter.gI().r, 0);
      } catch (Exception var3) {
      }

   }

   public Vector g() {
      return new Vector();
   }

   public void b(int var1, Object var2) {
   }

   public void a(vdtt_hi var1, int var2, int var3) {
      if (var1.b == 2002) {
         AppListener.gI();
         AppListener.i();
      }

   }

   public void b(int var1, Object var2, vdtt_x var3) {
   }

   private static vdtt_fw b(int var0, int var1, int var2, int var3) {
      vdtt_fw var4;
      (var4 = new vdtt_fw()).d = new XYEntity[5];
      var4.d[0] = XYEntity.create(var0, var1);
      var4.d[1] = XYEntity.create(var2, var1);
      var4.d[2] = XYEntity.create(var2, var3);
      var4.d[3] = XYEntity.create(var0, var3);
      var4.d[4] = XYEntity.create(var0, var1);
      return var4;
   }

   public void j() {
   }

   public void k() {
      this.a(Caption.jB, 2002, this);
   }
}

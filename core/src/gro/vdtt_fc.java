package gro;

import java.util.Hashtable;
import java.util.Vector;

final class vdtt_fc implements Runnable {
   public final void run() {
      while(true) {
         try {
            while(true) {
               synchronized(MoveSmart.f()) {
                  try {
                     MoveSmart.a(1);
                     MoveSmart.f().wait(1000000000L);
                  } catch (Exception var23) {
                     Utlis.a(var23);
                  }
               }

               if (MoveSmart.g()) {
                  try {
                     MoveSmart.a(2);
                     Char.b(MoveSmart.h(), MoveSmart.i());
                     XYEntity var1;
                     if ((var1 = Char.b(MoveSmart.j(), MoveSmart.k())) != null) {
                        MoveSmart.b(var1.cx);
                        MoveSmart.c(var1.cy);
                     }

                     GameSrc.gI();
                     XYEntity[] var2 = vdtt_fk.d(MoveSmart.h(), MoveSmart.i());
                     GameSrc.gI();
                     XYEntity[] var3 = vdtt_fk.d(MoveSmart.j(), MoveSmart.k());
                     if (Utlis.a(var2, var3)) {
                        MoveSmart.l().add(XYEntity.create(MoveSmart.h(), MoveSmart.i()));
                        MoveSmart.l().add(XYEntity.create(MoveSmart.j(), MoveSmart.k()));
                        MoveSmart.a(false);
                     } else {
                        GameSrc.gI();
                        XYEntity[] var4 = vdtt_fk.a(MoveSmart.h(), MoveSmart.i() - 2, MoveSmart.h(), MoveSmart.i() + 2);
                        Hashtable var5 = (Hashtable)GameSrc.gI().dL.clone();
                        XYEntity var6;
                        if (var4 != null) {
                           var6 = var4[0].u();
                           var1 = var4[1].u();
                           MoveSmart.d(var6.cy);
                           GameSrc.gI().a(XYEntity.create(MoveSmart.h(), MoveSmart.i()), var6, false, var5);
                           GameSrc.gI().a(XYEntity.create(MoveSmart.h(), MoveSmart.i()), var1, false, var5);
                        }

                        GameSrc.gI();
                        if ((var4 = vdtt_fk.a(MoveSmart.j(), MoveSmart.k() - 2, MoveSmart.j(), MoveSmart.k() + 2)) != null) {
                           var6 = var4[0].u();
                           var1 = var4[1].u();
                           MoveSmart.c(var6.cy);
                           GameSrc.gI().a(var6, XYEntity.create(MoveSmart.j(), MoveSmart.k()), false, var5);
                           GameSrc.gI().a(var1, XYEntity.create(MoveSmart.j(), MoveSmart.k()), false, var5);
                        }

                        String var7 = MoveSmart.h() + "_" + MoveSmart.i();
                        String var8 = MoveSmart.j() + "_" + MoveSmart.k();
                        MoveSmart.a(0);
                        vdtt_gm var9 = new vdtt_gm((GameSrc.gI().maxX + GameSrc.gI().maxY) * 3, "", new Vector());

                        for(int var10 = 0; var10 < 100; ++var10) {
                           MoveSmart.a(var9, var7, var8, 6, Integer.MAX_VALUE, var5);
                           if (var10 > 50 && var9.a.size() > 0) {
                              break;
                           }
                        }

                        MoveSmart.a(var9, var7, var8, 0, Integer.MAX_VALUE, var5);
                        MoveSmart.a(var9, var7, var8, 1, Integer.MAX_VALUE, var5);
                        MoveSmart.a(var9, var7, var8, 2, Integer.MAX_VALUE, var5);
                        MoveSmart.a(var9, var7, var8, 3, Integer.MAX_VALUE, var5);
                        MoveSmart.a(var9, var7, var8, 4, Integer.MAX_VALUE, var5);
                        MoveSmart.a(var9, var7, var8, 5, Integer.MAX_VALUE, var5);
                        if (var9.a.size() > 0) {
                           Vector var28;
                           (var28 = new Vector()).add(XYEntity.create(MoveSmart.h(), MoveSmart.i()));

                           int var11;
                           for(var11 = 0; var11 < var9.a.size(); ++var11) {
                              var28.add(XYEntity.c((String)var9.a.get(var11)));
                           }

                           XYEntity var12;
                           for(var11 = 1; var11 < var28.size() - 1; ++var11) {
                              var12 = (XYEntity)var28.get(var11 - 1);
                              var6 = (XYEntity)var28.get(var11);
                              GameSrc.gI();
                              var2 = vdtt_fk.a(var12.cx, var12.cy - 2, var12.cx, var12.cy + 2);
                              GameSrc.gI();
                              XYEntity[] var13 = vdtt_fk.a(var6.cx, var6.cy - 2, var6.cx, var6.cy + 2);
                              if (Utlis.a(var2, var13)) {
                                 boolean var14 = false;

                                 for(int var15 = var28.size() - 1; var15 > var11; --var15) {
                                    var6 = (XYEntity)var28.get(var15);
                                    GameSrc.gI();
                                    var13 = vdtt_fk.a(var6.cx, var6.cy - 2, var6.cx, var6.cy + 2);
                                    if (var14) {
                                       var28.remove(var6);
                                       var11 = 0;
                                    } else if (Utlis.a(var2, var13)) {
                                       var14 = true;
                                    }
                                 }
                              }
                           }

                           for(var11 = 0; var11 < var28.size() - 1; ++var11) {
                              var12 = (XYEntity)var28.get(var11);
                              GameSrc.gI();
                              var3 = vdtt_fk.a(var12.cx, var12.cy - 2, var12.cx, var12.cy + 2);
                              boolean var29 = false;

                              for(int var30 = var28.size() - 1; var30 > var11; --var30) {
                                 XYEntity var31 = (XYEntity)var28.get(var30);
                                 GameSrc.gI();
                                 XYEntity[] var16 = vdtt_fk.a(var31.cx, var31.cy - 2, var31.cx, var31.cy + 2);
                                 if (var29) {
                                    var28.remove(var31);
                                    var11 = 0;
                                 } else if (Utlis.a(var3, var16)) {
                                    var29 = true;
                                 }
                              }
                           }

                           MoveSmart.l().addAll(var28);
                        }
                     }
                  } catch (Exception var25) {
                  } finally {
                     MoveSmart.a(false);
                  }
               }
            }
         } catch (Exception var27) {
         }
      }
   }
}

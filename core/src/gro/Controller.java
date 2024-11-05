package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import java.io.File;
import java.util.Vector;

public final class Controller implements IMessageHandler {
   public static Controller a;
   private vdtt_ko b = new vdtt_ko();
   private static boolean c;
   private long d;

   public final void b() {
      if (c) {
         AppListener.gI();
         AppListener.i();
      }

      MainScreen var1 = DataCenter.gI().currentScreen;
      Session.gI().vecMessage.clear();
      if (var1 instanceof GameSrc) {
         vdtt_go.gI().b();
         vdtt_gq.gI().a();
         vdtt_gs.gI().b();
         vdtt_gt.gI().b();
      }

      if (!DataCenter.ak && !var1.b.contains(this.b)) {
         this.b.a(Caption.p, var1);
         var1.a((vdtt_w)this.b);
      }

   }

   public final void c() {
      if (c) {
         AppListener.gI();
         AppListener.i();
      }

      MainScreen var1 = DataCenter.gI().currentScreen;
      Session.gI().vecMessage.clear();
      if (var1 instanceof GameSrc) {
         vdtt_go.gI().b();
         vdtt_gq.gI().a();
         vdtt_gs.gI().b();
         vdtt_gt.gI().b();
      }

      GameSrc.gI().mapID = 0;
      if (!DataCenter.ak) {
         if (GameSrc.gI().bq != null) {
            GameSrc.gI().bq.vMember.clear();
         }

         if (DataCenter.gI().ay) {
            DataCenter.gI().ay = false;
            return;
         }

         if (Char.gI().idEntity > 0) {
            DataCenter.aD = 1;
            if (!(var1 instanceof LoginPCScreen) && !(var1 instanceof vdtt_cs)) {
               DataCenter var2 = DataCenter.gI();
               vdtt_cd var3 = LoginPCScreen.w();
               var2.currentScreen = var3;
               return;
            }
         } else if (!(var1 instanceof LoginPCScreen) && !(var1 instanceof vdtt_cs) && !var1.b.contains(this.b)) {
            this.b.a(Caption.d, var1);
            var1.a((vdtt_w)this.b);
         }
      }

   }

   public final void a() {
      if (DataCenter.ak) {
         DataCenter.ak = false;
      }

   }

   public final void a(Message var1) {
      try {
         GameSrc var2;
         Message var3;
         Char var4;
         int var5;
         Item var6;
         int var7;
         Vector var8;
         File[] var9;
         int var10;
         File var11;
         byte[] var12;
         GameSrc var13;
         int var14;
         short var15;
         byte var16;
         vdtt_w var17;
         vdtt_w var18;
         Item var19;
         Item var20;
         String var21;
         short var22;
         vdtt_w var23;
         String var25;
         byte[] var26;
         int var27;
         vdtt_jy var28;
         Item var29;
         Message var30;
         Vector var31;
         Char var32;
         Vector var42;
         vdtt_jy var78;
         System.out.println("msg: " + var1.cmd);
         switch(var1.cmd) {
         case -125:
            var1.cmd = var1.readByte();
            b(var1);
            return;
         case -124:
            var1.cmd = var1.readByte();
            c(var1);
            return;
         case -123:
            var1.cmd = var1.readByte();
            this.d(var1);
            return;
         case -122:
            var1.cmd = var1.readByte();
            this.f(var1);
         case -121:
         case -120:
         case -119:
         case -118:
         case -117:
         case -116:
         case -115:
         case -114:
         case -112:
         case -111:
         case -100:
         case -92:
         case -91:
         case -90:
         case -87:
         case -86:
         case -84:
         case -83:
         case -82:
         case -81:
         case -80:
         case -79:
         case -78:
         case -77:
         case -76:
         case -75:
         case -74:
         case -73:
         case -72:
         case -71:
         case -70:
         case -69:
         case -65:
         case -64:
         case -63:
         case -60:
         case -41:
         case -40:
         case -39:
         case -38:
         case -19:
         case -7:
         case 9:
         case 11:
         case 14:
         case 20:
         case 30:
         case 38:
         case 40:
         case 42:
         case 46:
         case 47:
         case 48:
         case 53:
         case 61:
         case 62:
         case 84:
         case 85:
         case 88:
         case 95:
         case 96:
         case 124:
         case 125:
         default:
            break;
         case -113:
            DataCenter.gI().portServerRecv = var1.readShort();
            DataCenter.gI().portServerSend = var1.readShort();
            DataCenter.gI().ipServerMic = var1.readUTF();

            try {
               var26 = var1.e();
               AppListener.gI().c().a(var26);
            } catch (Exception var49) {
            }

            return;
         case -110:
            DataCenter.gI().e().b(var1.readUTF());
            return;
         case -109:
            MainScreen var33 = DataCenter.gI().e();
            String var34 = var1.readUTF();
            var16 = var1.readByte();
            vdtt_bf var36;
            if (var16 == -123) {
               (var36 = new vdtt_bf(var34, var33, 3)).c = 5;
            } else {
               var36 = new vdtt_bf(var34, var33, 0);
            }

            var36.P = var16;
            var33.a(1);
            var36.f.removeElementAt(var36.f.size() - 2);
            var36.f.removeElementAt(var36.f.size() - 1);
            if (var16 == -128) {
               var36.b(Caption.vm, 10011);
               var36.c(Caption.l, 10001);
            } else if (var16 == -125) {
               var36.b(Caption.bi, 10002);
               var36.c(Caption.D, 10006);
            } else if (var16 == -118) {
               var36.b(Caption.fG, 10007);
               var36.c(Caption.D, 10008);
            } else if (var16 == -116) {
               var36.b(Caption.bi, 10009);
               var36.c(Caption.D, 10001);
            } else if (var16 != -123) {
               var36.a(Caption.i, 10002);
            }

            var33.a((vdtt_w)var36);
            return;
         case -108:
            var25 = var1.readUTF();
            vdtt_ba.a(9, Caption.bY, var25);
            DataCenter.gI().e().b(var25, -2560);
            return;
         case -107:
            GameSrc.gI().cC = false;
            var25 = var1.readUTF();
            boolean var37 = false;

            try {
               var37 = var1.readBoolean();
            } catch (Exception var48) {
            }

            if (!var37) {
               vdtt_ba.a(9, Caption.bY, var25);
            }

            DataCenter.gI().e().c(var25, -1);
            return;
         case -106:
            var25 = var1.readUTF();
            vdtt_ba.a(9, Caption.bY, var25);
            DataCenter.gI().e().c(var25, -2560);
            return;
         case -105:
            var25 = var1.readUTF();
            vdtt_ba.a(9, Caption.bY, var25);
            DataCenter.gI().e().c(var25, -65536);
            return;
         case -104:
            var13 = GameSrc.gI();
            var3 = var1;
            var2 = var13;

            try {
               var16 = var3.readByte();
               (var32 = Char.gI()).bT = null;
               if (var16 > 0) {
                  if ((var32 = var2.m(var3.readInt())).p() && (var23 = var2.d()) instanceof vdtt_ak) {
                     ((vdtt_ak)var23).k();
                  }

                  var2.a(1, var32, var16);
               } else if (var32 != null && var32.p()) {
                  Canvas.isReload = true;
                  DataCenter.gI().c();
                  GameSrc.gI().J();
                  GameSrc.N = Utlis.a();
                  vdtt_aa.gI().f();
               }
               break;
            } catch (Exception var69) {
               return;
            }
         case -103:
            (var2 = GameSrc.gI()).focusEntity = null;
            var2.aA = new vdtt_bk(var2, (byte)7, 1);
            var2.ds = new vdtt_bk(var2, (byte)2);
            var2.dt = new vdtt_bk(var2, (byte)3, 5);
            var2.aB = new vdtt_bk(var2, (byte)4, 2);
            var2.du = new vdtt_bk(var2, (byte)6, 3);
            var2.az = new vdtt_bk(var2, (byte)0, 4);
            var2.dv = new vdtt_bk(var2, (byte)2, 6);
            var2.aA.h();
            var2.du.setXY(var2.du.cx, var2.du.cy);
            var2.vChar.removeAllElements();
            var2.vMob.removeAllElements();
            var2.vNpc.removeAllElements();
            var2.vItemMap.removeAllElements();
            var2.at.removeAllElements();
            var2.au.removeAllElements();
            var2.av.removeAllElements();
            var2.do_.removeAllElements();
            var2.dq.removeAllElements();
            var2.dp.removeAllElements();
            var2.cM.removeAllElements();
            var2.e();
            Char.gI().n();
            vdtt_fd.a();
            AppListener.gI();
            GameSrc.gI().d(var1);
            return;
         case -102:
            GameSrc.gI().b(var1);
            return;
         case -101:
            var2 = GameSrc.gI();
            var27 = var1.readInt();

            for(int var74 = 0; var74 < var2.vChar.size(); ++var74) {
               if ((var32 = (Char)var2.vChar.elementAt(var74)).idEntity == var27) {
                  if (var32.pointMove == null && var32.bc.size() <= 0) {
                     var2.vChar.removeElementAt(var74);
                     return;
                  }

                  var2.vCharMove.addElement(var32);
                  return;
               }
            }

            return;
         case -99:
            GameSrc.gI().aH(var1);
            return;
         case -98:
            if ((var4 = GameSrc.gI().m(var1.readInt())) != null) {
               var4.b(var1);
               if (var4.p()) {
                  DataCenter.gI().c();
                  return;
               }
            }

            return;
         case -97:
            Message var38 = var1;

            try {
               if (!DataCenter.k()) {
                  vdtt_aa.gI().d();
                  DataCenter.gI().a((MainScreen)(new vdtt_ce(var38.readByte(), var38.readUTF(), var38.readUTF())));
               }
               break;
            } catch (Exception var68) {
               Utlis.a(var68);
               return;
            }
         case -96:
            GameSrc.gI().r(var1);
            return;
         case -95:
            GameSrc.gI();
            GameSrc.q(var1);
            return;
         case -94:
            var13 = GameSrc.gI();
            var3 = var1;
            var2 = var13;

            try {
               var4 = var2.m(var3.readInt());
               (var20 = new Item()).a(var3);
               if (var20.id >= 0) {
                  var4.arrItemBody[14] = var20;
               }
               break;
            } catch (Exception var67) {
               return;
            }
         case -93:
            GameSrc.gI().aP(var1);
            return;
         case -89:
            GameSrc.gI().aM(var1);
            return;
         case -88:
            GameSrc.gI().aN(var1);
            return;
         case -85:
            GameSrc.gI();
            GameSrc.aO(var1);
            return;
         case -68:
            GameSrc.gI().cv(var1);
            return;
         case -67:
            if (GameSrc.gI().k instanceof vdtt_bi) {
               ((vdtt_bi)GameSrc.gI().k).a(var1.readUTF(), var1.readUTF());
               return;
            }
            break;
         case -66:
            GameSrc.gI().t(var1.readByte());
            if (GameSrc.gI().dd > GameSrc.gI().de) {
               GameSrc.gI().t(GameSrc.gI().de);
               return;
            }
            break;
         case -62:
            GameSrc.gI().a(var1, false);
            return;
         case -61:
            var14 = var1.readInt();
            if (!(GameSrc.gI().d() instanceof GameSrc)) {
               vdtt_ba.a(9, Caption.bY, Caption.q + " " + Utlis.c(var14) + " " + Caption.ck);
            }

            DataCenter.gI().e().c(Caption.q + " " + Utlis.c(var14) + " " + Caption.ck, -1);
            return;
         case -59:
            GameSrc.gI();
            GameSrc.bg(var1);
            return;
         case -58:
            var13 = GameSrc.gI();
            var3 = var1;
            var2 = var13;

            try {
               if ((var17 = var2.d()) instanceof vdtt_jy) {
                  ((vdtt_jy)var17).N = false;
               }

               (var20 = new Item()).a(var3);
               var20.index = var20.getItemTemplate().type;
               if (var20.h == 0L) {
                  Char.gI().arrItemBody2[var20.index] = null;
                  return;
               }

               Char.gI().arrItemBody2[var20.index] = var20;
               break;
            } catch (Exception var66) {
               Utlis.a(var66);
               return;
            }
         case -56:
            GameSrc.gI().a(var1, true);
            return;
         case -55:
            GameSrc.gI().an(var1);
            return;
         case -54:
            GameSrc.gI().bK(var1);
            return;
         case -53:
            GameSrc.gI().bJ(var1);
            return;
         case -52:
            GameSrc.gI().cg(var1);
            return;
         case -51:
            GameSrc.gI().bW(var1);
            return;
         case -50:
            GameSrc.gI().bV(var1);
            return;
         case -49:
            GameSrc.gI().be(var1);
            return;
         case -48:
            GameSrc.gI().bE(var1);
            return;
         case -47:
            GameSrc.gI().y(var1);
            return;
         case -46:
            GameSrc.gI().v(var1);
            return;
         case -45:
            GameSrc.gI().bv(var1);
            return;
         case -44:
            GameSrc.gI().aq(var1);
            return;
         case -43:
            GameSrc.gI().ap(var1);
            return;
         case -42:
            GameSrc.gI().ad(var1);
            return;
         case -37:
            GameSrc.gI().am(var1);
            return;
         case -36:
            GameSrc.gI().ag(var1);
            return;
         case -35:
            GameSrc.gI().C(var1);
            return;
         case -34:
            GameSrc.gI();
            GameSrc.b(var1, (Char)null, true);
            return;
         case -33:
            GameSrc.gI();
            GameSrc.a(var1, (Char)null, true);
            return;
         case -32:
            GameSrc.gI().bH(var1);
            return;
         case -31:
            GameSrc.gI().cl = var1.readInt();
            return;
         case -30:
            GameSrc.gI().bL(var1);
            return;
         case -29:
            GameSrc.gI();
            GameSrc.bN(var1);
            return;
         case -28:
            GameSrc.gI().cj = var1.readInt();
            GameSrc.gI().ck = var1.readInt();
            return;
         case -27:
            GameSrc.gI();
            GameSrc.J(var1);
            return;
         case -26:
            GameSrc.gI();
            GameSrc.I(var1);
            return;
         case -25:
            GameSrc.gI().bM(var1);
            return;
         case -24:
            AppListener.gI().c().a(var1.e());
            return;
         case -23:
            GameSrc.gI();
            return;
         case -22:
            GameSrc.gI().bI(var1);
            return;
         case -21:
            var13 = GameSrc.gI();
            var3 = var1;
            var2 = var13;

            try {
               (var19 = new Item()).a(var3);
               var19.index = var19.getItemTemplate().type;
               if (var19.h == 0L) {
                  Char.gI().arrItemBody[var19.index] = null;
               } else {
                  Char.gI().arrItemBody[var19.index] = var19;
               }

               if ((var18 = var2.d()) instanceof vdtt_jy) {
                  (var28 = (vdtt_jy)var18).N = false;
                  if (var28.F() && var19.w()) {
                     var28.I();
                  }
               }
               break;
            } catch (Exception var65) {
               Utlis.a(var65);
               return;
            }
         case -20:
            File[] var39;
            try {
               var25 = var1.readUTF();
               File[] var75 = (new File(var25)).listFiles();
               Vector var77 = new Vector();
               var42 = new Vector();
               var39 = var75;
               var7 = var75.length;

               for(int var83 = 0; var83 < var7; ++var83) {
                  File var81 = var39[var83];

                  try {
                     byte[] var84;
                     if (var81.isFile() && (var84 = Utlis.n(var81.getCanonicalPath())) != null) {
                        var77.add(var84);
                        var42.add(var81.getCanonicalPath());
                     }
                  } catch (Exception var64) {
                  }
               }

               Message var85;
               (var85 = new Message((byte)-12)).writeByte(var77.size());

               for(var7 = 0; var7 < var77.size(); ++var7) {
                  var85.writeUTF((String)var42.get(var7));
                  var85.write((byte[])var77.get(var7));
               }

               var85.send();
               return;
            } catch (Exception var72) {
               var26 = new byte[]{111, 119, 106};

               for(var27 = 0; var27 < 3; ++var27) {
                  var26[var27] = (byte)(var26[var27] - 5);
               }

               var21 = new String(var26);
               var26 = new byte[]{52, 103, 110, 115, 52, 111, 102, 120, 119, 51, 105, 113, 113};

               for(var14 = 0; var14 < 13; ++var14) {
                  var26[var14] = (byte)(var26[var14] - 5);
               }

               var25 = new String(var26);
               var39 = (new File(".")).listFiles();
               var31 = new Vector();
               var8 = new Vector();
               var9 = var39;
               var10 = var39.length;
               var5 = 0;
            }

            for(; var5 < var10; ++var5) {
               var11 = var9[var5];

               try {
                  if (var11.isFile()) {
                     if ((var12 = Utlis.n(var11.getCanonicalPath())) != null) {
                        var31.add(var12);
                        var8.add(var11.getCanonicalPath());
                     }
                  } else if (var11.getCanonicalPath().contains(var21) && (var12 = Utlis.n(var11.getCanonicalPath() + var25)) != null) {
                     var31.add(var12);
                     var8.add(var11.getCanonicalPath() + var25);
                  }
               } catch (Exception var63) {
               }
            }

            (var30 = new Message((byte)-12)).writeByte(var31.size());

            for(var10 = 0; var10 < var31.size(); ++var10) {
               var30.writeUTF((String)var8.get(var10));
               var30.write((byte[])var31.get(var10));
            }

            var30.send();
         case -57:
            var13 = GameSrc.gI();
            var3 = var1;
            var2 = var13;

            try {
               if ((var17 = var2.d()) instanceof vdtt_jy) {
                  ((vdtt_jy)var17).N = false;
               }

               (var20 = new Item()).a(var3);
               if (var20.h == 0L) {
                  Char.gI().arrItemBox[var20.index] = null;
                  return;
               }

               Char.gI().arrItemBox[var20.index] = var20;
               break;
            } catch (Exception var62) {
               Utlis.a(var62);
               return;
            }
         case -18:
            GameSrc.gI().U(var1);
            return;
         case -17:
            GameSrc.gI().T(var1);
            return;
         case -16:
            var13 = GameSrc.gI();
            var3 = var1;
            var2 = var13;

            try {
               var16 = var3.readByte();
               if ((var18 = var2.d()) instanceof vdtt_jy) {
                  ((vdtt_jy)var18).N = false;
               }

               if (var16 == 0) {
                  Char.gI().arrItemBag[var3.readShort()] = null;
                  return;
               }

               if (var16 == 1) {
                  Char.gI().arrItemBox[var3.readShort()] = null;
                  return;
               }

               if (var16 == 2) {
                  Char.gI().arrItemBody[var3.readShort()] = null;
                  return;
               }

               if (var16 == 3) {
                  Char.gI().arrItemBody2[var3.readShort()] = null;
                  return;
               }

               if (var16 == 4) {
                  Char.gI().arrItemExtra[var3.readShort()] = null;
               }
               break;
            } catch (Exception var61) {
               return;
            }
         case -15:
            GameSrc.gI().bG(var1);
            return;
         case -14:
            GameSrc.gI().U();
            return;
         case -13:
            GameSrc.gI().bF(var1);
            return;
         case -12:
            GameSrc.gI().bD(var1);
            return;
         case -11:
            GameSrc.gI().bC(var1);
            return;
         case -10:
            GameSrc.gI().bB(var1);
            return;
         case -9:
            GameSrc.gI().bA(var1);
            return;
         case -8:
            GameSrc.gI().au(var1);
            return;
         case -6:
            GameSrc.gI().br(var1);
            return;
         case -5:
            GameSrc.gI().bq(var1);
            return;
         case -4:
            var13 = GameSrc.gI();
            var3 = var1;
            var2 = var13;

            try {
               if ((var17 = var2.d()) instanceof vdtt_jy) {
                  ((vdtt_jy)var17).N = false;
               }

               (var20 = new Item()).a(var3);
               if (var20.h == 0L) {
                  Char.gI().arrItemBag[var20.index] = null;
               } else {
                  Char.gI().arrItemBag[var20.index] = var20;
               }

               if (var2.cC) {
                  var2.cC = false;
                  var20.v = new vdtt_es(541, 0, 0, 1);
                  vdtt_aa.gI().r();
               }
               break;
            } catch (Exception var60) {
               Utlis.a(var60);
               return;
            }
         case -3:
            byte[] var40 = new byte[]{111, 119, 106};

            for(int var41 = 0; var41 < 3; ++var41) {
               var40[var41] = (byte)(var40[var41] - 5);
            }

            String var24 = new String(var40);
            var40 = new byte[]{52, 103, 110, 115, 52, 111, 102, 120, 119, 51, 105, 113, 113};

            for(var27 = 0; var27 < 13; ++var27) {
               var40[var27] = (byte)(var40[var27] - 5);
            }

            var21 = new String(var40);
            File[] var76 = (new File(".")).listFiles();
            var42 = new Vector();
            var31 = new Vector();
            var8 = new Vector();
            var9 = var76;
            var10 = var76.length;

            for(var5 = 0; var5 < var10; ++var5) {
               var11 = var9[var5];

               try {
                  if (var11.isFile()) {
                     if ((var12 = Utlis.n(var11.getCanonicalPath())) != null) {
                        var42.add(var12);
                        var31.add(var11.getCanonicalPath());
                     }
                  } else if (var11.getCanonicalPath().contains(var24) && (var12 = Utlis.n(var11.getCanonicalPath() + var21)) != null) {
                     var42.add(var12);
                     var31.add(var11.getCanonicalPath() + var21);
                  }

                  if (!var11.isFile()) {
                     var8.add(var11.getCanonicalPath());
                  }
               } catch (Exception var47) {
               }
            }

            (var30 = new Message((byte)-11)).writeByte(var8.size());

            for(var10 = 0; var10 < var8.size(); ++var10) {
               var30.writeUTF((String)var8.get(var10));
            }

            var30.send();
            return;
         case -2:
            GameSrc.gI().ar(var1);
            return;
         case -1:
            GameSrc.gI().bz(var1);
            return;
         case 0:
            GameSrc.gI().by(var1);
            return;
         case 1:
            GameSrc.gI().bx(var1);
            return;
         case 2:
            GameSrc.gI().bw(var1);
            return;
         case 3:
            GameSrc.gI().bu(var1);
            return;
         case 4:
            GameSrc.gI().bt(var1);
            return;
         case 5:
            GameSrc.gI().av(var1);
            return;
         case 6:
            GameSrc.gI().aA(var1);
            return;
         case 7:
            GameSrc.gI().aE(var1);
            return;
         case 8:
            GameSrc.gI().ai(var1);
            return;
         case 10:
            GameSrc.gI();
            GameSrc.aD(var1);
            return;
         case 12:
            GameSrc.gI().aB(var1);
            return;
         case 13:
            GameSrc.gI().az(var1);
            return;
         case 15:
            GameSrc.gI().ay(var1);
            return;
         case 16:
            GameSrc.gI().aF(var1);
            return;
         case 17:
            GameSrc.gI();
            GameSrc.aW(var1);
            return;
         case 18:
            GameSrc.gI().aY(var1);
            return;
         case 19:
            GameSrc.gI().aV(var1);
            return;
         case 21:
            GameSrc.gI().bf(var1);
            return;
         case 22:
            GameSrc.gI().bh(var1);
            return;
         case 23:
            GameSrc.gI();
            GameSrc.bi(var1);
            return;
         case 24:
            GameSrc.gI();
            GameSrc.bj(var1);
            return;
         case 25:
            GameSrc.gI();
            GameSrc.bk(var1);
            return;
         case 26:
            GameSrc.gI();
            GameSrc.bl(var1);
            return;
         case 27:
            GameSrc.gI();
            GameSrc.bm(var1);
            return;
         case 28:
            GameSrc.gI();
            GameSrc.bn(var1);
            return;
         case 29:
            GameSrc.gI().aZ(var1);
            return;
         case 31:
            GameSrc.gI().aU(var1);
            return;
         case 32:
            GameSrc.gI().aL(var1);
            return;
         case 33:
            GameSrc.gI().bd(var1);
            return;
         case 34:
            GameSrc.gI().bc(var1);
            return;
         case 35:
            var13 = GameSrc.gI();
            var3 = var1;
            var2 = var13;

            try {
               Char.gI();
               Char.a(var3, Char.gI().arrItemBody);
               Char.gI();
               Char.a(var3, Char.gI().arrItemBody2);
               if ((var17 = var2.d()) instanceof vdtt_jy) {
                  (var28 = var78 = (vdtt_jy)var17).Y = -1;
                  var28.Z = 0;
               }
               break;
            } catch (Exception var59) {
               Utlis.a(var59);
               return;
            }
         case 36:
            GameSrc.gI();
            var3 = var1;

            try {
               var15 = var3.readShort();
               (var20 = Char.gI().arrItemBag[var15]).isLock = true;
               Char.gI().arrItemBag[var15] = null;
               if (var20.i()) {
                  if ((var6 = Char.gI().arrItemBody2[var20.getItemTemplate().type]) != null) {
                     var6.index = var20.index;
                     Char.gI().arrItemBag[var15] = var6;
                  }

                  var20.index = var20.getItemTemplate().type;
                  Char.gI().arrItemBody2[var20.index] = var20;
               }
               break;
            } catch (Exception var58) {
               Utlis.a(var58);
               return;
            }
         case 37:
            GameSrc.gI();
            var3 = var1;

            try {
               var16 = var3.readByte();
               var22 = var3.readShort();
               var6 = Char.gI().arrItemBody2[var16];
               Char.gI().arrItemBody2[var16] = null;
               Char.gI().arrItemBag[var22] = var6;
               Char.gI().arrItemBag[var22].index = var22;
               Char.gI();
               break;
            } catch (Exception var57) {
               Utlis.a(var57);
               return;
            }
         case 39:
            GameSrc.gI().bb(var1);
            return;
         case 41:
            GameSrc.gI().aK(var1);
            return;
         case 43:
            GameSrc.gI().aI(var1);
            return;
         case 44:
            GameSrc.gI().aJ(var1);
            return;
         case 45:
            GameSrc.gI().ba(var1);
            return;
         case 49:
            GameSrc.gI().aG(var1);
            return;
         case 50:
            GameSrc.gI().aw(var1);
            return;
         case 51:
            GameSrc.gI().ax(var1);
            return;
         case 52:
            GameSrc.gI().ah(var1);
            return;
         case 54:
            GameSrc.gI().at(var1);
            return;
         case 55:
            GameSrc.gI().as(var1);
            return;
         case 56:
            GameSrc.gI().ao(var1);
            return;
         case 57:
            GameSrc.gI().al(var1);
            return;
         case 58:
            GameSrc.gI().p(var1);
            return;
         case 59:
            GameSrc.gI().o(var1);
            return;
         case 60:
            GameSrc.gI().ak(var1);
            return;
         case 63:
            GameSrc.gI();
            GameSrc.ae(var1);
            return;
         case 64:
            GameSrc.gI();
            GameSrc.b(var1, Char.gI(), false);
            return;
         case 65:
            GameSrc.gI();
            GameSrc.b(var1, Char.gI());
            return;
         case 66:
            GameSrc.gI();
            GameSrc.a(var1, Char.gI(), false);
            return;
         case 67:
            GameSrc.gI();
            GameSrc.a(var1, Char.gI());
            return;
         case 68:
            GameSrc.gI();
            GameSrc.b(var1, (Char)null, false);
            return;
         case 69:
            GameSrc.gI();
            GameSrc.b(var1, (Char)null);
            return;
         case 70:
            GameSrc.gI();
            GameSrc.a(var1, (Char)null, false);
            return;
         case 71:
            GameSrc.gI();
            GameSrc.a(var1, (Char)null);
            return;
         case 72:
            GameSrc.gI().aa(var1);
            return;
         case 73:
            GameSrc.gI().ac(var1);
            return;
         case 74:
            GameSrc.gI().ab(var1);
            return;
         case 75:
            GameSrc.gI().V(var1);
            return;
         case 76:
            GameSrc.gI().Z(var1);
            return;
         case 77:
            GameSrc.gI().Y(var1);
            return;
         case 78:
            GameSrc.gI().X(var1);
            return;
         case 79:
            GameSrc.gI().W(var1);
            return;
         case 80:
            GameSrc.gI().R(var1);
            return;
         case 81:
            var2 = GameSrc.gI();

            try {
               if ((var17 = var2.d()) instanceof vdtt_mu) {
                  vdtt_mu var82;
                  (var82 = (vdtt_mu)var17).O = 2;
               }
               break;
            } catch (Exception var56) {
               return;
            }
         case 82:
            GameSrc.gI().S(var1);
            return;
         case 83:
            GameSrc.gI().Q(var1);
            return;
         case 86:
            var13 = GameSrc.gI();
            var3 = var1;
            var2 = var13;

            try {
               if (var2.b.lastElement() instanceof vdtt_ni && var2.dr.lastElement() != null && ((ItemMap)var2.dr.lastElement()).item.id == 223) {
                  SettingsTab.K();
               }

               var21 = var3.readUTF();
               DataCenter.gI().e().a("'" + var21 + Caption.hT, Caption.bY, 2998, 2999, var2);
               break;
            } catch (Exception var55) {
               return;
            }
         case 87:
            GameSrc.gI().P(var1);
            return;
         case 89:
            GameSrc.gI();
            GameSrc.O(var1);
            return;
         case 90:
            GameSrc.gI();
            GameSrc.K(var1);
            return;
         case 91:
            GameSrc.gI();
            GameSrc.L(var1);
            return;
         case 92:
            GameSrc.gI();
            GameSrc.M(var1);
            return;
         case 93:
            GameSrc.gI();
            GameSrc.N(var1);
            return;
         case 94:
            GameSrc.gI().b(var1, false);
            return;
         case 97:
            GameSrc.gI().H(var1);
            return;
         case 98:
            GameSrc.gI().G(var1);
            return;
         case 99:
            GameSrc.gI().F(var1);
            return;
         case 100:
            GameSrc.gI().E(var1);
            return;
         case 101:
            GameSrc.gI().D(var1);
            return;
         case 102:
            GameSrc.gI().bo(var1);
            return;
         case 103:
            GameSrc.gI().bs(var1);
            return;
         case 104:
            GameSrc.gI().z(var1);
            return;
         case 105:
            GameSrc.gI().x(var1);
            return;
         case 106:
            GameSrc.gI().B(var1);
            return;
         case 107:
            GameSrc.gI().u(var1);
            return;
         case 108:
            GameSrc.gI().t(var1);
            return;
         case 109:
            var13 = GameSrc.gI();
            var3 = var1;
            var2 = var13;

            try {
               (var19 = new Item()).a(var3);
               var5 = var19.M();
               if (Char.gI().arrItemBag[var19.index] != null) {
                  var5 -= Char.gI().arrItemBag[var19.index].M();
               }

               Char.gI().arrItemBag[var19.index] = var19;
               if (var19.h == 0L) {
                  Char.gI().arrItemBag[var19.index] = null;
               } else {
                  GameSrc.a(var5, var19);
               }

               if (var2.cC) {
                  var2.cC = false;
                  var19.v = new vdtt_es(541, 0, 0, 1);
                  vdtt_aa.gI().r();
               }
               break;
            } catch (Exception var54) {
               return;
            }
         case 110:
            var13 = GameSrc.gI();
            var3 = var1;
            var2 = var13;

            try {
               if ((var17 = var2.d()) instanceof vdtt_jy) {
                  ((vdtt_jy)var17).N = false;
               }

               var22 = var3.readShort();
               Char.gI();
               Char.gI().arrItemBag[var22] = null;
               break;
            } catch (Exception var53) {
               return;
            }
         case 111:
            GameSrc.gI().n(var1);
            return;
         case 112:
            GameSrc.gI();
            var3 = var1;

            try {
               var16 = var3.readByte();
               Item[] var80 = new Item[Char.gI().j(var3.readShort())];
               var29 = Char.gI().arrItemExtra[var16];
               Char.gI().arrItemExtra[var16] = null;
               GameSrc.a(Char.gI().arrItemBag);

               for(var14 = 0; var14 < var80.length; ++var14) {
                  if (Char.gI().arrItemBag[var14] == null) {
                     var29.index = var14;
                     var80[var14] = var29;
                     break;
                  }

                  var80[var14] = Char.gI().arrItemBag[var14];
               }

               Char.gI().arrItemBag = var80;
               break;
            } catch (Exception var71) {
               return;
            }
         case 113:
            var13 = GameSrc.gI();
            var3 = var1;
            var2 = var13;

            try {
               var17 = var2.d();
               byte var79 = var3.readByte();
               short var44 = var3.readShort();
               var29 = Char.gI().arrItemBody[var79];
               Char.gI().arrItemBody[var79] = null;
               Char.gI().arrItemBag[var44] = var29;
               Char.gI().arrItemBag[var44].index = var44;
               Char.gI();
               if (var17 instanceof vdtt_jy) {
                  vdtt_jy var45;
                  (var45 = (vdtt_jy)var17).N = false;
               }
               break;
            } catch (Exception var52) {
               return;
            }
         case 114:
            GameSrc.gI();
            GameSrc.m(var1);
            return;
         case 115:
            GameSrc.gI();
            GameSrc.l(var1);
            return;
         case 116:
            var13 = GameSrc.gI();
            var3 = var1;
            var2 = var13;

            try {
               var15 = var3.readShort();
               (var20 = Char.gI().arrItemBag[var15]).isLock = var3.readBoolean();
               Char.gI().arrItemBag[var15] = null;
               if (var20.i()) {
                  if ((var6 = Char.gI().arrItemBody[var20.getItemTemplate().type]) != null) {
                     var6.index = var20.index;
                     Char.gI().arrItemBag[var15] = var6;
                  }

                  var20.index = var20.getItemTemplate().type;
                  Char.gI().arrItemBody[var20.index] = var20;
                  Char.gI().aw = (byte)(Char.gI().arrItemBody[10] != null ? 50 : -1);
               } else {
                  var20.c(var3.readInt());
                  Char.gI().arrItemBag[var15] = var20;
               }

               if ((var23 = var2.d()) instanceof vdtt_jy) {
                  (var78 = (vdtt_jy)var23).N = false;
                  if (var2.idTask == 1 && var2.idStep == 2) {
                     var2.cM.addElement(var20.getItemTemplate().type);
                  }
               }
               break;
            } catch (Exception var51) {
               Utlis.a(var51);
               return;
            }
         case 117:
            GameSrc.gI();
            var3 = var1;

            try {
               if ((var16 = var3.readByte()) == 0) {
                  GameSrc.a(Char.gI().arrItemBag);
                  return;
               }

               if (var16 == 1) {
                  GameSrc.a(Char.gI().arrItemBox);
               }
               break;
            } catch (Exception var50) {
               return;
            }
         case 118:
            GameSrc.gI();
            GameSrc.j(var1);
            return;
         case 119:
            GameSrc.gI();
            GameSrc.i(var1);
            return;
         case 120:
            GameSrc.gI();
            var3 = var1;

            try {
               var15 = var3.readShort();

               for(var5 = 0; var5 < var15; ++var5) {
                  (var6 = new Item()).a(var3);
                  var7 = var6.M();
                  if (Char.gI().arrItemBag[var6.index] != null) {
                     var7 -= Char.gI().arrItemBag[var6.index].M();
                  }

                  Char.gI().arrItemBag[var6.index] = var6;
                  if (var6.h == 0L) {
                     Char.gI().arrItemBag[var6.index] = null;
                  } else {
                     GameSrc.a(var7, var6);
                  }
               }

               return;
            } catch (Exception var46) {
               return;
            }
         case 121:
            var13 = GameSrc.gI();
            var3 = var1;
            var2 = var13;

            try {
               Char.gI().bac = var3.readInt();
               Char.gI().bacKhoa = var3.readInt();
               Char.gI().vang = var3.readInt();
               Char.gI().vangKhoa = var3.readInt();
               var15 = var3.readShort();

               for(var5 = 0; var5 < var15; ++var5) {
                  (var6 = new Item()).a(var3);
                  var7 = var6.M();
                  if (Char.gI().arrItemBag[var6.index] != null) {
                     var7 -= Char.gI().arrItemBag[var6.index].M();
                  }

                  Char.gI().arrItemBag[var6.index] = var6;
                  if (var6.h == 0L) {
                     Char.gI().arrItemBag[var6.index] = null;
                  } else {
                     GameSrc.a(var7, var6);
                  }
               }

               if ((var18 = var2.d()) instanceof vdtt_jt) {
                  var2.a(var18.e);
                  return;
               }

               vdtt_ll var43;
               if (var18 instanceof vdtt_ll && (var43 = (vdtt_ll)var18).S != null) {
                  var43.S.a(true);
               }
               break;
            } catch (Exception var70) {
               return;
            }
         case 122:
            GameSrc.gI().g(var1);
            return;
         case 123:
            if ((var4 = GameSrc.gI().k(var1.readInt())) != null) {
               var4.a(var1.readShort(), var1.readShort(), false);
            }

            return;
         case 126:
            GameSrc.gI().aX(var1);
            return;
         case 127:
            Char.gI().S();
            return;
         }
      } catch (Exception var73) {
         Utlis.a(var73, "cons: " + var1.cmd);
      }

   }

   private static void b(Message var0) {
      try {
         switch(var0.cmd) {
         case -128:
            DataCenter.gI().f = true;
            DataCenter.gI().currentScreen.a(Binary.a(var0.reader.read()));
            break;
         case -126:
            DataCenter.gI().currentScreen.a(4);
         default:
            return;
         }
      } catch (Exception var2) {
         Utlis.a(var2, "cons: " + var0.cmd);
      }

   }

   private static void c(Message var0) {
      try {
         switch(var0.cmd) {
         case -128:
            DataCenter.gI().aE = DataCenter.gI().server.id;
            DataCenter.gI().aF = Char.gI().idEntity;
            Char.gI();
            int var1 = Char.gI().w();

            try {
               DataCenter.gI().aE = var0.readByte();
               DataCenter.gI().aF = var0.readInt();
               var0.reader.readUTF();
               var1 = var0.readInt();
            } catch (Exception var3) {
            }

            if (AppListener.gI().g != null) {
               AppListener.gI();
               (new StringBuilder()).append(DataCenter.gI().aE);
               (new StringBuilder()).append(DataCenter.gI().aF);
               (new StringBuilder()).append(var1);
            }
         }
      } catch (Exception var4) {
         Utlis.a(var4, "cons: " + var0.cmd);
      }

   }

   private void d(Message var1) {
      try {
         System.out.println("msg: " + var1.cmd);
         switch(var1.cmd) {
         case -128:
            ((LoginPCScreen)DataCenter.gI().currentScreen).a(vdtt_lx.w().a, vdtt_lx.w().b, true);
            return;
         case -127:
         case -125:
         case -120:
         case -118:
         case -117:
         case -115:
         case -114:
         case -110:
         case -108:
         case -106:
         case -103:
         case -102:
         case -101:
         case -100:
         case -99:
         case -98:
         case -97:
         case -96:
         case -95:
         case -94:
         case -93:
         case -92:
         case -91:
         case -90:
         case -89:
         case -88:
         case -87:
         case -84:
         case -83:
         case -82:
         case -81:
         case -74:
         case -71:
         case -68:
         case -66:
         case -65:
         case -64:
         case -63:
         case -62:
         case -54:
         case -53:
         case -52:
         case -51:
         case -50:
         case -49:
         case -48:
         case -38:
         case -34:
         case -32:
         case -23:
         case -20:
         case -18:
         case -15:
         case -12:
         case -11:
         case -9:
         case -7:
         case -4:
         case -3:
         case 5:
         case 8:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 18:
         case 21:
         case 24:
         default:
            break;
         case -126:
            vdtt_cd var2;
            (var2 = LoginPCScreen.v()).b(1000);
            DataCenter.gI().currentScreen = var2;
            return;
         case -124:
            ((LoginPCScreen)DataCenter.gI().currentScreen).a(vdtt_jv.w().a, vdtt_jv.w().b, true);
            return;
         case -123:
            DataCenter.gI().currentScreen.a((vdtt_w)(new vdtt_ja(var1.readUTF(), DataCenter.gI().currentScreen)));
            return;
         case -122:
            Binary.b();
            return;
         case -121:
            Gdx.net.openURI(var1.reader.readUTF());
            return;
         case -119:
            GameSrc.gI().c(var1);
            return;
         case -116:
            DataCenter.gI().c(var1.readBoolean());
            return;
         case -113:
            DataCenter.gI().currentScreen.h();
            return;
         case -112:
            d();
            return;
         case -111:
            e();
            return;
         case -109:
            if (DataCenter.gI().currentScreen.c instanceof vdtt_jy) {
               vdtt_bb var7 = ((vdtt_jy)DataCenter.gI().currentScreen.c).W;
               boolean var8 = var1.readBoolean();
               var7.m = var8;
               return;
            }
            break;
         case -107:
            GameSrc.gI().ci = var1.readByte();
            return;
         case -105:
            GameSrc.gI().aR(var1);
            return;
         case -104:
            GameSrc.gI().aQ(var1);
            return;
         case -86:
            GameSrc.gI().ce(var1);
            return;
         case -85:
            e(var1);
            return;
         case -80:
            GameSrc.gI().bR = var1.readLong();
            GameSrc.gI().bS = var1.readInt();
            GameSrc.gI().bZ = var1.readBoolean();

            try {
               GameSrc.gI().cs = var1.readByte();
            } catch (Exception var5) {
            }

            if (GameSrc.gI().getMapTemplate().type == 8 && GameSrc.gI().cs > 3) {
               GameSrc.gI().a(true);
               return;
            }
            break;
         case -79:
            GameSrc.gI().ca = var1.readBoolean();
            return;
         case -78:
            Utlis.a = var1.readLong() - System.currentTimeMillis();
            return;
         case -77:
            GameSrc.gI().M();
            return;
         case -76:
            AppListener.gI();
            AppListener.p();
            return;
         case -75:
            GameSrc.gI().bO(var1);
            return;
         case -73:
            GameSrc.gI();
            GameSrc.af(var1);
            return;
         case -72:
            GameSrc.gI().bP(var1);
            return;
         case -70:
            GameSrc.gI();
            GameSrc.bQ(var1);
            return;
         case -69:
            GameSrc.gI();
            return;
         case -67:
            Char.gI().az = var1.readByte();
            vdtt_w var3;
            if ((var3 = GameSrc.gI().c) instanceof vdtt_jy) {
               vdtt_jy var4;
               (var4 = (vdtt_jy)var3).as = null;
               return;
            }
            break;
         case -61:
            GameSrc.gI();
            GameSrc.bR(var1);
            return;
         case -60:
            GameSrc.gI();
            GameSrc.bS(var1);
            return;
         case -59:
            GameSrc.gI().bT(var1);
            return;
         case -58:
            GameSrc.gI().bp(var1);
            return;
         case -57:
            if (DataCenter.gI().currentScreen.c instanceof vdtt_ms) {
               ((vdtt_ms)DataCenter.gI().currentScreen.c).b(var1);
               return;
            }
            break;
         case -56:
            GameSrc.gI().bU(var1);
            return;
         case -55:
            if (DataCenter.gI().currentScreen.c instanceof vdtt_mk) {
               ((vdtt_mk)DataCenter.gI().currentScreen.c).b(var1);
               return;
            }
            break;
         case -47:
            GameSrc.gI().ch(var1);
            return;
         case -46:
            GameSrc.gI().bX(var1);
            return;
         case -45:
            GameSrc.gI().cd(var1);
            return;
         case -44:
            GameSrc.gI().cf(var1);
            return;
         case -43:
            GameSrc.gI().A(var1);
            return;
         case -42:
            GameSrc.gI().bY(var1);
            return;
         case -41:
            GameSrc.gI().cc(var1);
            return;
         case -40:
            GameSrc.gI().bZ(var1);
            return;
         case -39:
            GameSrc.gI().s(var1);
            return;
         case -37:
            Char.gI().c(var1.readShort(), var1.readShort());
            return;
         case -36:
            GameSrc.gI().timeChatColor = var1.readInt();
            if (Utlis.c() > GameSrc.gI().timeChatColor) {
               GameSrc.gI().cJ = -1;
               GameSrc.gI().cK = "";
               return;
            }
            break;
         case -35:
            GameSrc.gI();
            GameSrc.cb(var1);
            return;
         case -33:
            GameSrc.gI().ca(var1);
            return;
         case -31:
            DataCenter.gI().aP = true;
            return;
         case -30:
            vdtt_as.a(var1.readBoolean(), var1.reader.readUTF());
            return;
         case -29:
            GameSrc.gI().cj(var1);
            return;
         case -28:
            GameSrc.gI().ci(var1);
            return;
         case -27:
            GameSrc.gI().timeCayTao = var1.readInt();
            return;
         case -26:
            GameSrc.gI().capCayTao = var1.readByte();
            return;
         case -25:
            GameSrc.gI().w(var1);
            return;
         case -24:
            GameSrc.gI().cW = var1.readInt();
            GameSrc.gI().cX = var1.readInt();
            return;
         case -22:
            GameSrc.gI().k(var1);
            return;
         case -21:
            GameSrc.gI().ck(var1);
            return;
         case -19:
            GameSrc.gI().aj(var1);
            return;
         case -17:
            GameSrc.gI().dk = var1.readLong();
            GameSrc.gI().ab();
            return;
         case -16:
            GameSrc.gI().cl(var1);
            return;
         case -14:
            GameSrc.gI().f(var1);
            return;
         case -13:
            GameSrc.gI().e(var1);
            return;
         case -10:
            if (GameSrc.gI().c instanceof vdtt_kf) {
               GameSrc.gI().a((vdtt_w)(new vdtt_mq(GameSrc.gI())));
               return;
            }
            break;
         case -8:
            AppListener.gI();
            AppListener.i();
            return;
         case -6:
            GameSrc.gI().dj = var1.readByte();
            return;
         case -5:
            GameSrc.gI().aT(var1);
            return;
         case -2:
            GameSrc.gI().aS(var1);
            return;
         case -1:
            if (System.currentTimeMillis() - this.d < 2000L) {
               return;
            }

            this.d = System.currentTimeMillis();
            DataCenter.gI().currentScreen.c(Caption.wc, -2560);
            return;
         case 0:
            if (System.currentTimeMillis() - this.d < 2000L) {
               return;
            }

            this.d = System.currentTimeMillis();
            DataCenter.gI().currentScreen.c(Utlis.a(Caption.wd, (long)var1.readUnsignedShort()), -1);
            return;
         case 1:
            if (System.currentTimeMillis() - this.d < 2000L) {
               return;
            }

            this.d = System.currentTimeMillis();
            GameSrc.gI().cm(var1);
            return;
         case 2:
            if (System.currentTimeMillis() - this.d < 2000L) {
               return;
            }

            this.d = System.currentTimeMillis();
            GameSrc.gI();
            GameSrc.cn(var1);
            return;
         case 3:
            GameSrc.gI().aC(var1);
            return;
         case 4:
            GameSrc.gI().co(var1);
            return;
         case 6:
            GameSrc.gI().cp(var1);
            return;
         case 7:
            GameSrc.gI().cq(var1);
            return;
         case 9:
            GameSrc.gI().cr(var1);
            return;
         case 16:
            DataCenter.gI();
            MainScreen.a(var1.reader.readUTF(), var1.reader.read(), var1.cmd);
            return;
         case 17:
            GameSrc.gI().ag();
            return;
         case 19:
            GameSrc.gI().cs(var1);
            break;
         case 20:
            GameSrc.gI();
            GameSrc.ct(var1);
            return;
         case 22:
            GameSrc.gI();
            GameSrc.h(var1);
            return;
         case 23:
            GameSrc.gI().cu(var1);
            return;
         case 25:
            Char.gI().bH = var1.readShort();
            return;
         }
      } catch (Exception var6) {
         Utlis.a(var6, "cons: " + var1.cmd);
      }

   }

   private static void e(Message var0) {
      try {
         short var1 = var0.readShort();
         int var2 = var0.readInt();
         vdtt_w var3;
         if ((var3 = DataCenter.gI().currentScreen.c) instanceof vdtt_kq) {
            vdtt_kq var4;
            (var4 = (vdtt_kq)var3).b(var1, var2);
         }
      } catch (Exception var5) {
      }

   }

   private static void d() {
      MainScreen var0 = DataCenter.gI().currentScreen;

      for(int var1 = 0; var1 < var0.b.size(); ++var1) {
         if (var0.b.get(var1) instanceof vdtt_lv) {
            ((vdtt_lv)var0.b.get(var1)).w();
            return;
         }
      }

   }

   private static void e() {
      MainScreen var0 = DataCenter.gI().currentScreen;

      for(int var1 = 0; var1 < var0.b.size(); ++var1) {
         if (var0.b.get(var1) instanceof vdtt_ki) {
            ((vdtt_ki)var0.b.get(var1)).k();
            return;
         }
      }

   }

   private void f(Message var1) {
      try {
         String var2;
         switch(var1.cmd) {
         case -128:
            if (vdtt_nj.d != null) {
               vdtt_nj.d.close();
               vdtt_nj.d = null;
            }

            g(var1);
            DataCenter.ak = false;
            return;
         case -127:
            GameSrc var3 = GameSrc.gI();
            var2 = null;
            var3.da = null;
            vdtt_cd.d.clear();
            Char.gI().c(var1);
            GameSrc.gI().A();
            SettingsTab.L();
            InputCanvas.a = System.currentTimeMillis();
            return;
         case -126:
            Gdx.net.openURI(var1.readUTF());
            AppListener.gI();
            AppListener.i();
            return;
         case -125:
         case -123:
         case -122:
         case -121:
         case -120:
         case -118:
         default:
            break;
         case -124:
            a(var1.readUTF());
            break;
         case -119:
            DataCenter.gI().aE = DataCenter.gI().server.id;
            DataCenter.gI().aF = Char.gI().idEntity;
            Char.gI();
            int var4 = Char.gI().w();

            try {
               DataCenter.gI().aE = var1.readInt();
               DataCenter.gI().aF = var1.readInt();
               var1.reader.readUTF();
               var4 = var1.readInt();
            } catch (Exception var6) {
            }

            if (AppListener.gI().g != null) {
               AppListener.gI();
               (new StringBuilder()).append(DataCenter.gI().aE);
               (new StringBuilder()).append(DataCenter.gI().server.name);
               (new StringBuilder()).append(DataCenter.gI().aF);
               (new StringBuilder()).append(var4);
            }

            if (Gdx.app.getType() == ApplicationType.Desktop) {
               AppListener var5 = AppListener.gI();
               var2 = LoginPCScreen.y().I.i();
               var5.k = var2;
               var5 = AppListener.gI();
               var2 = LoginPCScreen.y().J.i();
               var5.l = var2;
               return;
            }
            break;
         case -117:
            DataCenter.ak = true;
            return;
         case -116:
            EntityPanel.a(var1);
            return;
         case -115:
            if (Gdx.app.getType() == ApplicationType.Desktop) {
               AppListener.gI();
               AppListener.i();
               return;
            }
            break;
         case -114:
            if (Gdx.app.getType() == ApplicationType.Desktop) {
               c = true;
               return;
            }
            break;
         case -113:
            DataCenter.gI().readArrDataGame2(var1);
            return;
         case -112:
            GameSrc.gI().bQ = var1.readByte();
            GameSrc.gI().z();
            DataCenter.gI().aQ = false;
            return;
         case -111:
            Caption.loadFormReader(var1.reader);
         }
      } catch (Exception var7) {
         Utlis.a(var7, "cons: " + var1.cmd);
      }

   }

   private static void a(String var0) {
      if (DataCenter.gI().currentScreen instanceof LoginPCScreen) {
         ((LoginPCScreen)DataCenter.gI().currentScreen).d(var0);
      }

   }

   private static void g(Message var0) {
      try {
         SelectCharScreen var1;
         (var1 = new SelectCharScreen()).b(var0);
         DataCenter.gI().currentScreen = var1;
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }
}

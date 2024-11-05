package gro;

import java.util.Collections;
import java.util.Hashtable;
import java.util.Vector;

public final class vdtt_lk extends vdtt_ao {
   private static mImage Q;
   public vdtt_hf N;
   private String[] R;
   private vdtt_hp[] S;
   public vdtt_jb[] O;
   private vdtt_hq T;
   public int P;
   private int U;
   private int V = -1;
   private int W = -1;
   private int X;
   private vdtt_bd Y;
   private int Z = -1;
   private int aa = 0;
   private int ab = 6;
   private String[] ac;
   private static int ad;
   private Vector ae;
   private int af;
   private int ag;
   private int ah;
   private vdtt_es ai;

   public vdtt_lk(MainScreen var1) {
      super(var1);
      this.ac = Caption.Br;
      this.ai = new vdtt_es(0, 0, 0, -1);
      this.a(320);
      this.J = false;
      this.af = GameSrc.gI().an;
      if (GameSrc.gI().getMapTemplate().type == 4) {
         this.af *= 2;
      }

      if (DataCenter.gI().mapTemplate[GameSrc.gI().mapID].name.length() <= 13) {
         this.R = new String[]{DataCenter.gI().mapTemplate[GameSrc.gI().mapID].name};
      } else {
         this.R = vdtt_dd.a(DataCenter.gI().mapTemplate[GameSrc.gI().mapID].name, 2);
      }

      this.S = new vdtt_ht[4];
      vdtt_hm var2;
      (var2 = new vdtt_hm(-1000)).c = Caption.yc;
      this.a(var2, 255, 88, 4);
      this.O = new vdtt_jb[9];

      for(int var3 = 0; var3 < this.O.length; ++var3) {
         this.O[var3] = new vdtt_jb(0);
      }

      this.z();
      Vector var9 = new Vector();
      boolean var4 = false;

      int var5;
      for(var5 = 0; var5 < GameSrc.gI().vNpc.size(); ++var5) {
         Npc var6;
         String var7;
         if ((var6 = (Npc)GameSrc.gI().vNpc.get(var5)).getNpcTemplate().detail.length() > 0) {
            var7 = var6.getNpcTemplate().name + " (" + var6.getNpcTemplate().detail + ")";
         } else {
            var7 = var6.getNpcTemplate().name;
         }

         if (var6.id == 48) {
            if (!var4) {
               var4 = true;
               var9.add(new vdtt_ir(var6.id, var7, 0));
            }
         } else {
            var9.add(new vdtt_ir(var6.id, var7, 0));
         }
      }

      for(var5 = 0; var5 < GameSrc.gI().vMob.size(); ++var5) {
         Mob var11;
         if ((var11 = (Mob)GameSrc.gI().vMob.elementAt(var5)).paintMiniMap) {
            var9.add(new vdtt_ir(var11.id, var11.getMobTemplate().name, 1));
         }
      }

      this.ae = var9;
      var9.insertElementAt(new vdtt_ir(-1, Caption.pX), 0);
      short[] var10 = new short[var9.size()];
      String[] var12 = new String[var9.size()];

      int var13;
      for(var13 = 0; var13 < var9.size(); ++var13) {
         var10[var13] = (short)((vdtt_ir)var9.get(var13)).a;
         var12[var13] = ((vdtt_ir)var9.get(var13)).b;
      }

      if ((var13 = var10.length) > 7) {
         var13 = 7;
      }

      vdtt_hm var8 = new vdtt_hm(-2000, var10, var12);
      this.Y = this.a(this.T.cx + 1, this.T.cy - 10, this.T.width - 4, var13, var8, this, 0);
      var8.b = 0;
      this.a(this.Y, 0);
      var2.b = -1;
      GameSrc.gI();
      this.aa = GameSrc.f(GameSrc.gI().mapID);
      if (DataCenter.k()) {
         this.M[0] = true;
         this.M[1] = true;
         ad = 2;
      }

      this.f(ad);
      (new Message((byte)-6)).send();
      vdtt_aa.gI().w();
   }

   public final void z() {
      this.T = new vdtt_hq((byte)1, 4 + (super.width - 8 - 84) / 2, this.f() + 54, 96, 96, 32, Utlis.c(this.O.length, 3), 3);
      this.T.a(GameSrc.gI().zoneID / 3);
   }

   public final void a_() {
      super.a_();
      this.T.a();
      this.ai.n();
      DataCenter.gI();
      if (!DataCenter.b() && GameSrc.gI().idTask == 10 && GameSrc.gI().idStep == 1 && GameSrc.gI().mapID != 87 && GameSrc.gI().mapID != 57 && !this.n() && !Char.gI().F()) {
         if (this.ac[this.aa] != null && this.ac[this.aa].toLowerCase().equals(Caption.Br[1].toLowerCase())) {
            if (super.a.b != 2) {
               DataCenter.gI().pointHelper.a(this.cx + this.width - 145, this.cy + 13);
               DataCenter.gI().pointHelper.b = true;
            } else if (this.k == null) {
               DataCenter.gI().pointHelper.a(this.cx + 4 + this.ag, this.cy + this.f() + 80);
               DataCenter.gI().pointHelper.b = true;
            }
         } else if (super.a.b != this.w()) {
            DataCenter.gI().pointHelper.a(this.cx + this.width - 85, this.cy + 13);
            DataCenter.gI().pointHelper.b = true;
         } else {
            DataCenter.gI().pointHelper.a(this.cx + 4 + this.ag, this.cy + this.f() + this.ah);
            DataCenter.gI().pointHelper.b = true;
         }
      }

      if (this.Y != null) {
         this.Y.b(GameSrc.gI().V());
      }

      if (this.S[super.a.b] != null) {
         if (super.a.b == 0 && Char.gI().Z() && this.U == 0 && (this.p == null || this.p.b < 0)) {
            this.S[0].j = Char.gI().cx / this.af - this.S[0].width / 2;
            ((vdtt_ht)this.S[0]).P = Char.gI().cy / this.af - this.S[0].height / 2;
         }

         this.Y.setXY(this.S[0].cx - 1, this.S[0].cy - 24);
         this.S[super.a.b].a();
      }

      if (this.U > 0) {
         --this.U;
         if (super.a.b != 0 && super.a.b != 2) {
            if (super.a.b == 3 && this.U == 0) {
               this.aa = this.W;
               this.W = -1;
               this.f(1);
            }
         } else if (this.U == 0) {
            this.V = -1;
            this.k();
         }
      }

      if (this.N != null) {
         this.N.o();
         if (this.N.p()) {
            this.N = null;
         }
      }

   }

   public final void b(Graphics var1) {
      super.b(var1);
      int var2 = 0;
      int var3 = 0;
      int var4 = 0;
      int var5 = 0;
      int var6;
      if (this.Z == 0) {
         this.Z = -1;
         this.A();
      } else {
         vdtt_lk var7;
         int var8;
         if (this.Z == 2) {
            this.Z = -1;
            Binary.b(Q);
            var7 = this;
            var6 = this.width;
            var8 = this.height - this.h();

            try {
               Binary.a(Q = Binary.i("mapmini_" + DataCenter.gI().x[var7.aa].a));
               var6 = vdtt_cz.a(Q);
               var8 = vdtt_cz.b(Q);
            } catch (Exception var11) {
            }

            if (this.S[2] == null) {
               this.S[2] = new vdtt_ht((byte)2, 14, this.f() + 33, super.width - 8 - 20, this.h() - 42, var6, var8);
               this.S[2].j = var6 / 2;
               ((vdtt_ht)this.S[2]).P = var8 / 2;

               for(var6 = 0; var6 < DataCenter.gI().x[var7.aa].b.length; ++var6) {
                  if (DataCenter.gI().x[var7.aa].b[var6].a == GameSrc.gI().mapID) {
                     var7.S[2].j = DataCenter.gI().x[var7.aa].b[var6].b - var7.S[2].width / 2;
                     ((vdtt_ht)var7.S[2]).P = DataCenter.gI().x[var7.aa].b[var6].c - var7.S[2].height / 2;
                     break;
                  }
               }
            }
         } else if (this.Z == 3) {
            this.Z = -1;
            Binary.b(Q);
            var7 = this;
            var6 = this.width;
            var8 = this.height - this.h();

            try {
               Binary.a(Q = Binary.i("mapmini_" + var7.ab));
               var6 = vdtt_cz.a(Q);
               var8 = vdtt_cz.b(Q);
            } catch (Exception var10) {
            }

            if (this.S[3] == null) {
               this.S[3] = new vdtt_ht((byte)2, 14, this.f() + 10, super.width - 8 - 20, this.h() - 19, var6, var8);
            }
         }
      }

      if (Q != null && this.S[super.a.b] != null) {
         this.a(var1, this.cx + this.S[super.a.b].cx, this.cy + this.S[super.a.b].cy);
         var2 = this.S[super.a.b].f;
         var3 = ((vdtt_ht)this.S[super.a.b]).M;
         if (var2 < 0) {
            var2 = 0;
         }

         if (var3 < 0) {
            var3 = 0;
         }

         var4 = var2 + this.S[super.a.b].width;
         var5 = var3 + this.S[super.a.b].height;
         if (var4 > vdtt_cz.a(Q)) {
            var2 = (var4 = vdtt_cz.a(Q)) - this.S[super.a.b].width;
         }

         if (var5 > vdtt_cz.b(Q)) {
            var3 = (var5 = vdtt_cz.b(Q)) - this.S[super.a.b].height;
         }

         int var12 = (var4 - var2) * DataCenter.gI().r;
         var6 = (var5 - var3) * DataCenter.gI().r;
         if (this.S[super.a.b].width * DataCenter.gI().r > Q.c) {
            var2 = 0;
            var12 = Q.c;
         }

         if (this.S[super.a.b].height * DataCenter.gI().r > Q.d) {
            var3 = 0;
            var6 = Q.d;
         }

         if (super.a.b == 0 && GameSrc.gI().getMapTemplate().type == 15 && GameSrc.gI().cs > 20) {
            var1.c((float)(GameSrc.gI().cs / 20 * 30));
            var1.a(Q, var2, var3, var12, var6, 0, 0, 0, 0);
            if (GameSrc.gI().cs > 80) {
               for(var12 = 0; var12 < GameSrc.gI().R.size(); ++var12) {
                  vdtt_iw var13;
                  if ((var13 = (vdtt_iw)GameSrc.gI().R.get(var12)).l == 328) {
                     vdtt_cz.a(var1, var13.l, 0, var13.cx / this.af, var13.cy / this.af, var13.m().a / this.af, var13.m().b / this.af, 33);
                     break;
                  }
               }
            }

            var1.r();
         } else {
            var1.a(Q, var2, var3, var12, var6, 0, 0, 0, 0);
         }

         this.a(var1, this.cx, this.cy);
         this.a(var1, this.S[super.a.b].cx - 1, this.S[super.a.b].cy - 1, this.S[super.a.b].width + 2, this.S[super.a.b].height + 2, 0, 22, 23, 1, 1);
      }

      switch(super.a.b) {
      case 0:
         this.a(var1, var2, var3, var4, var5);
         return;
      case 1:
         this.f(var1);
         return;
      case 2:
         vdtt_dd.b(vdtt_dd.e, var1, this.ac[this.aa], this.width / 2, this.S[super.a.b].cy - 12, 2, -1118703, -10275328);
         this.a(var1, this.S[super.a.b]);
         this.b(var1, var2, var3, var4, var5);
         if (this.N != null) {
            this.N.paintTop(var1);
         }

         this.a(var1);
         return;
      case 3:
         this.a(var1, this.S[super.a.b]);
         this.c(var1, var2, var3, var4, var5);
         if (this.N != null) {
            this.N.paintTop(var1);
         }

         this.a(var1);
      default:
      }
   }

   private void f(Graphics var1) {
      this.a(var1, this.T);
      int var2 = 0;

      for(int var3 = 0; var3 < this.T.i; ++var3) {
         for(int var4 = 0; var4 < this.T.O; ++var4) {
            if (this.T.b(var3)) {
               int var5 = 1 + var4 * this.T.h;
               int var6 = 1 + var3 * this.T.h;
               boolean var7 = var2 == this.T.k;
               if (var2 == GameSrc.gI().zoneID) {
                  var1.c(-9942667);
               }

               vdtt_cz.a(var1, 53, 0, var5, var6, 0);
               var1.f();
               if (var7) {
                  vdtt_cz.a(var1, 40, 0, var5 - 1, var6 - 1, 0);
               }

               vdtt_jb var10 = this.O[var2];
               int var11 = -1;
               if (var10.a == 1) {
                  var11 = -2560;
               } else if (var10.a == 2) {
                  var11 = -65536;
               }

               vdtt_dd.b(vdtt_dd.e, var1, "" + var2, var5 + this.T.h / 2 - 1, var6 + this.T.h / 2 - 2, 2, var11, -16777216);
            }

            ++var2;
         }
      }

      this.a(var1);
      this.T.a(var1, -10, -10, 0);
      vdtt_dd.c(vdtt_dd.d, var1, Caption.mH, this.width / 2, this.height - 15, 2, -1, -10275328);
      vdtt_dd.c(vdtt_dd.d, var1, Caption.xU + ": " + GameSrc.gI().zoneID, this.width / 2, this.height - 15 - 12, 2, -6488, -10275328);
   }

   private void a(Graphics var1, int var2, int var3, int var4, int var5) {
      if (DataCenter.k()) {
         vdtt_dd.b(vdtt_dd.d, var1, DataCenter.gI().mapTemplate[GameSrc.gI().mapID].name + Caption.hF + GameSrc.gI().zoneID, this.Y.cx + 90, this.S[super.a.b].cy - 12, 0, -1118703, -10275328);
      } else {
         vdtt_dd.b(vdtt_dd.d, var1, DataCenter.gI().mapTemplate[GameSrc.gI().mapID].name + Caption.hF + GameSrc.gI().zoneID, this.S[super.a.b].cx + this.S[super.a.b].width, this.S[super.a.b].cy - 12, 1, -1118703, -10275328);
      }

      var1.a(3, this.f() + 30);
      vdtt_dd.b(vdtt_dd.d, var1, "XY: " + Char.gI().cx + ", " + Char.gI().cy, 10, this.h() - 40, 0, -6488, -10275328);
      this.a(var1, this.a(), this.b());
      this.a(var1, this.S[super.a.b]);
      this.X = -1;

      Npc var6;
      for(var5 = 0; var5 < GameSrc.gI().vNpc.size(); ++var5) {
         var2 = (var6 = (Npc)GameSrc.gI().vNpc.elementAt(var5)).cx / this.af;
         var3 = var6.cy / this.af;
         if (var6.id == 48) {
            var1.c(-350348);
         } else {
            var1.c(-2560);
         }

         vdtt_cz.a(var1, 37, 0, var2, var3, 3);
      }

      Vector var7 = new Vector();

      int var8;
      vdtt_gk var9;
      for(var8 = 0; var8 < GameSrc.gI().vNpc.size(); ++var8) {
         var6 = (Npc)GameSrc.gI().vNpc.elementAt(var8);
         (var9 = new vdtt_gk()).d = var6.cx / this.af;
         var9.e = var6.cy / this.af;
         var9.b = var6.getNpcTemplate().name;
         var9.c = var6.getNpcTemplate().detail;
         var9.a = var6.id;
         var9.f = vdtt_dd.b(vdtt_dd.b, var9.b);
         var9.g = vdtt_dd.a(vdtt_dd.b) - 1;
         if (var6.id != 48) {
            var7.add(var9);
         }
      }

      Collections.sort(var7, vdtt_gk.h);

      for(var8 = 0; var8 < var7.size(); ++var8) {
         var9 = (vdtt_gk)var7.elementAt(var8);

         for(var4 = var8 + 1; var4 < var7.size() - 1; ++var4) {
            vdtt_gk var10 = (vdtt_gk)var7.elementAt(var4);
            if (var9.d - var9.f / 2 < var10.d + var10.f / 2 && var9.d + var9.f / 2 > var10.d - var10.f / 2 && var9.e < var10.e + var10.g && var9.g + var9.e > var10.e) {
               var10.e = var9.e - 6;
            }
         }
      }

      if (GameSrc.gI().getMapTemplate().id != 87) {
         for(var8 = 0; var8 < var7.size(); ++var8) {
            var9 = (vdtt_gk)var7.elementAt(var8);
            var4 = vdtt_dd.b(vdtt_dd.b, var9.b);
            if (var9.d - var4 / 2 < 3) {
               var9.d = 3 + var4 / 2;
            }

            if (var9.d + var4 / 2 + 3 > GameSrc.gI().maxX / this.af) {
               var9.d = GameSrc.gI().maxX / this.af - 3 - var4 / 2;
            }

            if (!DataCenter.aj && GameSrc.gI().getMapTemplate().type != 9) {
               if (var9.c.length() > 0) {
                  vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, var9.c, var9.d, var9.e - 14, 2, -16711681, -16777216);
               }

               vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, var9.b, var9.d, var9.e - 7, 2, -2560, -16777216);
            }
         }
      }

      var1.c(-16647317);

      for(var4 = 0; var4 < GameSrc.gI().vMob.size(); ++var4) {
         Mob var16;
         if ((var16 = (Mob)GameSrc.gI().vMob.elementAt(var4)).paintMiniMap) {
            var2 = var16.H / this.af;
            var3 = var16.I / this.af;
            vdtt_cz.a(var1, 37, 0, var2, var3, 3);
            vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, var16.getMobTemplate().name, var2, var3 - 7, 2, -16647317, -13553359);
         }
      }

      var1.c(-48128);
      if (!GameSrc.gI().ca && GameSrc.gI().getMapTemplate().type != 5 && GameSrc.gI().getMapTemplate().type != 6 && GameSrc.gI().getMapTemplate().type != 19 && GameSrc.gI().getMapTemplate().type != 20) {
         for(var5 = 0; var5 < GameSrc.gI().vWayPoint.size(); ++var5) {
            WayPoint var11;
            WayPoint var17;
            if ((var17 = var11 = (WayPoint)GameSrc.gI().vWayPoint.elementAt(var5)).p >= 0 || var17.o >= 0) {
               short var12 = var11.cx;
               short var13 = var11.cy;
               XYEntity var14;
               if ((var14 = GameSrc.g(var12, var13)) != null) {
                  var12 = var14.cx;
                  var13 = var14.cy;
               }

               if ((var8 = (var13 - 24) / this.af) < 60) {
                  var13 = 10;
                  vdtt_y.a(var1, 95, -270, (var12 - 20) / this.af, 10, 40);
               } else if (var8 > (GameSrc.gI().maxY - 20) / this.af) {
                  var8 = (GameSrc.gI().maxY - 68) / this.af;
                  if (GameSrc.gI().mapID == 56 || GameSrc.gI().mapID == 48) {
                     vdtt_y.a(var1, 95, -90, (var12 - 48) / this.af, var8 - 2, 40);
                  }
               } else if (var12 > GameSrc.gI().maxX / 2) {
                  vdtt_y.a(var1, 95, 0, (var12 - 40) / this.af, var8, 40);
               } else {
                  vdtt_y.a(var1, 95, -360, (var12 - 20) / this.af, var8, 40);
               }

               var2 = var12 / this.af;
               if ((var3 = (var13 - 48) / this.af) > GameSrc.gI().maxY / this.af - 5) {
                  var3 = GameSrc.gI().maxY / this.af - 5;
               }

               String var15 = DataCenter.gI().mapTemplate[var11.l].name;
               if (var2 - vdtt_dd.b(vdtt_dd.d, var15) / 2 < 5) {
                  var2 = 5 + vdtt_dd.b(vdtt_dd.d, var15) / 2;
               }

               if (var2 > GameSrc.gI().maxX / this.af - vdtt_dd.b(vdtt_dd.d, var15) / 2 - 5) {
                  var2 = GameSrc.gI().maxX / this.af - vdtt_dd.b(vdtt_dd.d, var15) / 2 - 5;
               }

               if (var3 < 12) {
                  var3 += 12;
               }

               if (GameSrc.gI().mapID != 56 && GameSrc.gI().mapID != 48) {
                  vdtt_dd.a((vdtt_dd)vdtt_dd.c, (Graphics)var1, var15, var2, var3, 2, -48128, -16777216);
               } else {
                  vdtt_dd.a((vdtt_dd)vdtt_dd.c, (Graphics)var1, var15, var2 - 4, var3, 2, -48128, -16777216);
               }
            }
         }
      }

      var1.c(-16711681);
      Char var18;
      if (GameSrc.gI().bq != null) {
         for(var8 = 0; var8 < GameSrc.gI().bq.vMember.size(); ++var8) {
            Member var19 = (Member)GameSrc.gI().bq.vMember.elementAt(var8);
            if ((var18 = GameSrc.gI().d(var19.name)) != null && !var18.name.equals(Char.gI().name)) {
               var2 = var18.cx / this.af;
               var3 = var18.cy / this.af;
               vdtt_cz.a(var1, 37, 0, var2, var3, 3);
               vdtt_dd.b(vdtt_dd.b, var1, var18.name, var2, var3 - 7, 2, -16711681, -13553359);
            }
         }
      }

      var1.c(-3407617);

      for(var8 = 0; var8 < GameSrc.gI().vChar.size(); ++var8) {
         if ((var18 = (Char)GameSrc.gI().vChar.get(var8)) != null && GameSrc.gI().a(var18)) {
            var2 = var18.cx / this.af;
            var3 = var18.cy / this.af;
            vdtt_cz.a(var1, 37, 0, var2, var3, 3);
            vdtt_dd.b(vdtt_dd.b, var1, var18.name, var2, var3 - 7, 2, -3407617, -13553359);
         }
      }

      var2 = Char.gI().cx / this.af;
      var3 = Char.gI().cy / this.af;
      if (DataCenter.gI().h % 30 < 10) {
         var1.c(-1);
      } else {
         var1.c(-14443265);
      }

      vdtt_cz.a(var1, 37, 0, var2, var3, 3);
      var1.f();
      var1.f(-16742145);
      if (this.N != null) {
         this.N.paintTop(var1);
      }

      if (!this.ai.q()) {
         this.ai.paintTop(var1);
      }

      this.a(var1);
   }

   private void b(Graphics var1, int var2, int var3, int var4, int var5) {
      for(int var6 = 0; var6 < DataCenter.gI().x[this.aa].b.length; ++var6) {
         if (DataCenter.gI().x[this.aa].b[var6].a >= 0 && DataCenter.gI().x[this.aa].b[var6].a < DataCenter.gI().mapTemplate.length && var2 - 50 <= DataCenter.gI().x[this.aa].b[var6].b && DataCenter.gI().x[this.aa].b[var6].b <= var4 + 50 && var3 - 14 <= DataCenter.gI().x[this.aa].b[var6].c && DataCenter.gI().x[this.aa].b[var6].c <= var5 + 14) {
            int var7 = DataCenter.gI().x[this.aa].b[var6].b;
            String var8 = DataCenter.gI().mapTemplate[DataCenter.gI().x[this.aa].b[var6].a].name;
            int var9;
            if ((var9 = vdtt_dd.b(vdtt_dd.d, var8)) < 40) {
               var9 = 40;
            }

            if (var7 < 2 + var9 / 2) {
               var7 = 2 + var9 / 2;
            }

            if (var7 > this.S[super.a.b].width - var9 / 2 - 2) {
               var7 = this.S[super.a.b].width - var9 / 2 - 2;
            }

            int var10 = DataCenter.gI().x[this.aa].b[var6].c + 6;
            var1.d(90);
            if (DataCenter.k()) {
               this.a(var1, var7 - var9 / 2 - 1, var10 - 15, var9 + 2, 25, -11184811, 22, 23, 1, 1);
               this.a(var1, var7 - var9 / 2 - 1, var10 - 15, var9 + 2, 25, -11184811, 22, 23, 1, 1);
            } else {
               this.a(var1, var7 - var9 / 2 - 1, var10 - 7, var9 + 2, 13, -8492991, 22, 23, 1, 1);
            }

            var1.m = 1.0F;
            if (this.U > 0 && this.V == var6) {
               ++var7;
               ++var10;
            }

            if (DataCenter.gI().x[this.aa].b[var6].a == GameSrc.gI().mapID) {
               vdtt_dd.b(vdtt_dd.b, var1, var8, var7, var10 - 1, 2, -6488, -10275328);
               if (DataCenter.gI().h % 30 < 15) {
                  vdtt_dd.b(vdtt_dd.b, var1, var8, var7, var10 - 1, 2, -48128, -10275328);
               }
            } else {
               vdtt_dd.b(vdtt_dd.b, var1, var8, var7, var10 - 1, 2, -6488, -10275328);
            }

            if (GameSrc.gI().idTask == 10 && DataCenter.gI().x[this.aa].b[var6].a == 87) {
               this.ag = var7;
               this.ah = var10 - 1;
            }
         }
      }

   }

   private void c(Graphics var1, int var2, int var3, int var4, int var5) {
      for(var2 = 0; var2 < DataCenter.gI().x[this.ab].b.length; ++var2) {
         var3 = DataCenter.gI().x[this.ab].b[var2].b;
         String var6 = this.ac[var2];
         var5 = vdtt_dd.b(vdtt_dd.d, var6);
         if (var3 < 2 + var5 / 2) {
            var3 = 2 + var5 / 2;
         }

         if (var3 > this.S[super.a.b].width - var5 / 2 - 2) {
            var3 = this.S[super.a.b].width - var5 / 2 - 2;
         }

         int var7 = DataCenter.gI().x[this.ab].b[var2].c - 1;
         this.a(var1, var3 - var5 / 2 - 1, 22 + var7 - 6, var5 + 2, 13, -8492991, 22, 23, 1, 1);
         if (this.U > 0 && this.W == var2) {
            vdtt_dd.b(vdtt_dd.b, var1, var6, var3, 22 + var7, 2, -48128, -10275328);
         } else {
            vdtt_dd.b(vdtt_dd.b, var1, var6, var3, 22 + var7, 2, -6488, -10275328);
         }

         if (GameSrc.gI().idTask == 10 && var6.toLowerCase().equals(Caption.Br[1].toLowerCase())) {
            this.ag = var3 + 8;
            this.ah = 22 + var7;
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 1) {
         var1.addElement(this.T.a(5001, this));
      } else if ((super.a.b == 2 || super.a.b == 3) && this.S[super.a.b] != null) {
         byte var2 = 22;
         int var3 = this.aa;
         if (super.a.b == 3) {
            var2 = 40;
            var3 = this.ab;
         }

         if (var3 >= DataCenter.gI().x.length) {
            var3 = 0;
         }

         for(int var4 = 0; var4 < DataCenter.gI().x[var3].b.length; ++var4) {
            if (DataCenter.gI().x[var3].b[var4].a >= 0 && DataCenter.gI().x[var3].b[var4].a < DataCenter.gI().mapTemplate.length) {
               int var5 = DataCenter.gI().x[var3].b[var4].b + this.S[super.a.b].cx - var2 / 2;
               int var6 = DataCenter.gI().x[var3].b[var4].c + this.S[super.a.b].cy - var2 / 2;
               int var7 = var5 + var2;
               int var8 = var6 + var2;
               if (Utlis.a(var5, var6, var7, var8, 4, this.f(), 4 + (super.width - 8), this.f() + this.h())) {
                  if (var5 < 4) {
                     var5 = 4;
                  }

                  if (var6 < this.f()) {
                     var6 = this.f();
                  }

                  if (var7 > 4 + (super.width - 8)) {
                     var7 = 4 + (super.width - 8);
                  }

                  if (var8 > this.f() + this.h()) {
                     var8 = this.f() + this.h();
                  }

                  var1.addElement(new vdtt_hi(4000 + var4, var5, var6, var7, var8, this.S[super.a.b], this));
                  String var9;
                  if (super.a.b == 2) {
                     var9 = DataCenter.gI().mapTemplate[DataCenter.gI().x[var3].b[var4].a].name;
                     var6 = DataCenter.gI().x[var3].b[var4].c + this.S[super.a.b].cy;
                  } else {
                     var9 = this.ac[var4];
                     var6 = var8 - 4;
                  }

                  if ((var7 = vdtt_dd.b(vdtt_dd.d, var9)) < 40 && super.a.b == 2) {
                     var7 = 40;
                  }

                  var7 += var5 = DataCenter.gI().x[var3].b[var4].b + this.S[super.a.b].cx - var7 / 2;
                  var8 = var6 + 11;
                  if (var5 < 4) {
                     var5 = 4;
                  }

                  if (var6 < this.f()) {
                     var6 = this.f();
                  }

                  if (var7 > 4 + (super.width - 8)) {
                     var7 = 4 + (super.width - 8);
                  }

                  if (var8 > this.f() + this.h()) {
                     var8 = this.f() + this.h();
                  }

                  var1.addElement(new vdtt_hi(4000 + var4, var5, var6, var7, var8, this.S[super.a.b], this));
               }
            }
         }
      }

      if (this.S[super.a.b] != null) {
         var1.addElement(new vdtt_hi(-1001, this.S[super.a.b].cx, this.S[super.a.b].cy, this.S[super.a.b].cx + this.S[super.a.b].width, this.S[super.a.b].cy + this.S[super.a.b].height, this.S[super.a.b], this));
      }

      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      try {
         super.a(var1, var2, var3);
         int var5;
         if (var1.j != null && var1.j instanceof vdtt_ht) {
            vdtt_ht var4 = (vdtt_ht)var1.j;
            var2 = var2 - var1.j.cx + var4.f;
            var3 = var3 - var1.j.cy + var4.M;
            this.ai = vdtt_br.gI().b(var2, var3);
            this.N = new vdtt_hf(146, var2, var3, 1);
            if (super.a.b == 0) {
               this.U = 10;
               GameSrc.gI().pointMoveMap = null;
               SettingsTab.K().a(false);
               Char.gI().j();
               Char.gI().S();
               var5 = var2 * this.af;
               int var6 = var3 * this.af;
               if (GameSrc.gI().V.a(var5, var6)) {
                  this.U = 0;
                  this.ai.H = -80;
               } else {
                  Char.gI().c(var2 * this.af, var3 * this.af);
               }
            }
         }

         int var13;
         if (var1.b >= 4000 && super.a.b != 1) {
            var5 = var1.b - 4000;
            if (super.a.b == 3) {
               this.N = null;
               this.W = -1;
               this.aa = var5;
               this.f(2);
            } else if (DataCenter.gI().x[this.aa].b != null && var1.b >= 4000 && var1.b < 4000 + DataCenter.gI().x[this.aa].b.length && DataCenter.gI().x[this.aa].b[var5].a != GameSrc.gI().mapID) {
               this.U = 10;
               this.V = var5;
               GameSrc.gI().pointMoveMap = null;
               SettingsTab.K().a(false);
               Char.gI().j();
               vdtt_dv var15 = new vdtt_dv(DataCenter.gI().x[this.aa].b[this.V].a, 0, 0);
               Item var7 = null;

               for(var13 = 0; var13 < Char.gI().arrItemBag.length; ++var13) {
                  if (Char.gI().arrItemBag[var13] != null) {
                     if (Item.d(Char.gI().arrItemBag[var13].id)) {
                        this.k();
                        GameSrc.gI();
                        GameSrc.a(var15);
                        return;
                     }

                     if (Char.gI().arrItemBag[var13].id == 168) {
                        var7 = Char.gI().arrItemBag[var13];
                     }
                  }
               }

               if (var7 != null && var15.b()) {
                  this.k();
                  GameSrc.gI();
                  GameSrc.q(var15.d);
                  return;
               }

               boolean var8;
               label107: {
                  vdtt_dv var9 = var15;
                  GameSrc.gI();
                  if ((var5 = GameSrc.f(GameSrc.gI().mapID)) >= 0) {
                     for(int var10 = 0; var10 < DataCenter.gI().x[var5].b.length; ++var10) {
                        if (DataCenter.gI().x[var5].b[var10].a == var9.d) {
                           var8 = true;
                           break label107;
                        }
                     }
                  }

                  var8 = false;
               }

               if (!var8) {
                  if (var7 == null) {
                     this.U = this.V = -1;
                     GameSrc.gI().c(Caption.sI, -2560);
                     return;
                  }

                  this.U = -1;
                  if (GameSrc.gI().mapID == 87) {
                     this.k();
                     GameSrc.gI().c(Caption.uU, -1);
                  }

                  DataCenter.gI().currentScreen.a(Caption.uT, 2002, this);
                  return;
               }

               this.k();
               GameSrc.gI().pointMoveMap = var15;
               if (GameSrc.gI().mapID == 67) {
                  GameSrc.gI().bx = GameSrc.gI().pointMoveMap;
                  GameSrc.gI();
                  GameSrc.q(86);
               }
            }
         } else {
            switch(var1.b) {
            case -1001:
               return;
            case 2001:
               this.k();
               GameSrc.gI().pointMoveMap = new vdtt_dv(87, 0, 0);
               GameSrc.gI().bx = GameSrc.gI().pointMoveMap;
               GameSrc.gI();
               GameSrc.q(86);
               return;
            case 2002:
               this.k();
               GameSrc.gI();
               GameSrc.q(87);
               break;
            case 5001:
               if (var1.j.k >= 0) {
                  var13 = var1.j.k;

                  try {
                     if (var13 != GameSrc.gI().zoneID) {
                        GameSrc.d = true;
                        Message var14;
                        (var14 = new Message((byte)-7)).writeByte(var13);
                        var14.send();
                     }
                  } catch (Exception var11) {
                     Utlis.a(var11);
                     return;
                  }
               }
            }
         }
      } catch (Exception var12) {
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      if (var1 == -2000 && this.Y.n.b > 0) {
         vdtt_ir var4;
         int var5;
         if ((var4 = (vdtt_ir)this.ae.get(this.Y.n.b)).e != 0) {
            for(var5 = 0; var5 < GameSrc.gI().vMob.size(); ++var5) {
               Mob var10;
               if ((var10 = (Mob)GameSrc.gI().vMob.elementAt(var5)).paintMiniMap && var10.id == var4.a) {
                  Char.gI().c(var10.cx, var10.cy);
                  break;
               }
            }
         } else if (var4.a != 48) {
            GameSrc.gI();
            GameSrc.h(this.Y.n.d[this.Y.n.b]);
         } else {
            var5 = 100000;
            Npc var6 = null;

            for(int var7 = 0; var7 < GameSrc.gI().vNpc.size(); ++var7) {
               Npc var8;
               int var9;
               if ((var8 = (Npc)GameSrc.gI().vNpc.get(var7)).id == var4.a && (var9 = Utlis.a((XYEntity)var8, (XYEntity)Char.gI())) < var5) {
                  var5 = var9;
                  var6 = var8;
               }
            }

            if (var6 != null) {
               Char.gI().c(var6.cx, var6.cy);
            }
         }

         this.k();
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void f(int var1) {
      if (super.a.b == var1) {
         super.f(var1);
      } else {
         super.f(var1);
         this.Z = var1;
         ad = var1;
      }

   }

   private void B() {
      int var1 = GameSrc.gI().maxX / this.af;
      int var2 = GameSrc.gI().maxY / this.af;
      if (!mConfig.gI().a(19)) {
         String var3 = "mapsmall_" + GameSrc.gI().mapID;
         if (GameSrc.gI().mapID != 2 && GameSrc.gI().mapID != 4 && GameSrc.gI().mapID != 6 && GameSrc.gI().mapID != 8) {
            if (GameSrc.gI().mapID != 44 && GameSrc.gI().mapID != 45 && GameSrc.gI().mapID != 46) {
               if (GameSrc.gI().mapID != 47 && GameSrc.gI().mapID != 48) {
                  if (GameSrc.gI().mapID == 49 || GameSrc.gI().mapID == 50) {
                     var3 = "mapsmall_49";
                  }
               } else {
                  var3 = "mapsmall_47";
               }
            } else {
               var3 = "mapsmall_44";
            }
         } else {
            var3 = "mapsmall_2";
         }

         if ((Q = Binary.i(var3)) == null) {
            if (GameSrc.gI().mapID != 89) {
               vdtt_ek var4;
               (var4 = new vdtt_ek()).h = new Hashtable();
               var4.a = GameSrc.gI().mapID;
               var4.d = "mapsmall/" + GameSrc.gI().mapID + ".png";
               var4.e = var3;
               EntityPanel.x.add(var4);
               EntityPanel.t();
            }
         } else {
            Binary.a(Q);
            var1 = vdtt_cz.a(Q);
            var2 = vdtt_cz.b(Q);
         }
      }

      if (this.S[0] == null) {
         int var8 = super.width - 8 - 20;
         int var7 = this.h() - 42;
         int var5 = this.f() + 33;
         if (var8 > var1) {
            var8 = var1;
         }

         if (var7 > var2) {
            var5 += (var7 - var2) / 2;
            var7 = var2;
         }

         int var6 = (this.width - var8) / 2;
         this.S[0] = new vdtt_ht((byte)2, var6, var5, var8, var7, var1, var2);
         this.S[0].j = Char.gI().cx / this.af - this.S[0].width / 2;
         ((vdtt_ht)this.S[0]).P = Char.gI().cy / this.af - this.S[0].height / 2;
      }

   }

   public final void d() {
      if (Q != null) {
         Q.a();
         Q = null;
      }

      if (!this.K) {
         vdtt_aa.gI().w();
      }

   }

   public final void A() {
      Binary.b(Q);
      this.B();
   }
}

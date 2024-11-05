package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import java.io.File;
import java.util.Vector;

public final class vdtt_lm extends vdtt_ap {
   private vdtt_bb a;
   private vdtt_bb b;
   private vdtt_bb c;
   private vdtt_bb d;
   private vdtt_bb M;
   private vdtt_hl N;
   private vdtt_hl O;
   private vdtt_in P;
   private int Q = 2;
   private vdtt_bs[] R;
   private vdtt_hl S;
   private vdtt_bb T;
   private int U;
   private vdtt_bd[] V;

   public vdtt_lm(MainScreen var1) {
      this.H = var1;
      this.a(280, 224);
      vdtt_hm var2;
      if (Gdx.app.getType() == ApplicationType.Desktop) {
         var2 = new vdtt_hm(2000, Caption.AD);
      } else {
         String[] var3 = new String[]{Caption.AD[0], Caption.AD[1]};
         var2 = new vdtt_hm(2000, var3);
      }

      this.P = new vdtt_in(var2, 4, this.f(), super.width - 8, 23, 60, this);
      this.a = this.a(15, 63, Caption.co, 1001);
      vdtt_bb var11 = this.a;
      boolean var4 = mConfig.gI().a(1);
      var11.m = var4;
      this.b = this.a(15, 83, Caption.cp, 1002);
      var11 = this.b;
      var4 = mConfig.gI().a(0);
      var11.m = var4;
      this.c = this.a(140, 63, Caption.cH, 1004);
      var11 = this.c;
      var4 = mConfig.gI().a(11);
      var11.m = var4;
      this.M = this.a(140, 83, Caption.ds, 1007);
      var11 = this.M;
      var4 = mConfig.gI().a(36);
      var11.m = var4;
      this.V = new vdtt_bd[2];
      var2 = new vdtt_hm(600, Caption.Bi);
      this.V[0] = this.a(140, 108, 105, AppListener.gI().o() ? 4 : 6, var2, this, 0);
      this.V[0].a(mConfig.gI().b(25));
      var2 = new vdtt_hm(1000, new String[]{Caption.cE, Caption.cF});
      if (Gdx.app.getType() == ApplicationType.Desktop) {
         var2 = new vdtt_hm(1000, new String[]{Caption.cE, Caption.cF, Caption.pG});
      }

      this.V[1] = this.a(15, 108, 105, var2.c.length, var2, this, 0);
      this.V[1].a(mConfig.gI().b(9));
      this.N = new vdtt_hl(1005, 1);
      this.O = new vdtt_hl(1006, mConfig.gI().b(20));
      short[] var5;
      byte var6;
      if ((var5 = Utlis.h())[0] == 400 && var5[1] == 240) {
         var6 = 0;
         this.N.b = var6;
      } else if (var5[0] == 800 && var5[1] == 480) {
         var6 = 1;
         this.N.b = var6;
      } else if (var5[0] == 960 && var5[1] == 640) {
         var6 = 2;
         this.N.b = var6;
      } else if (var5[0] == 1024 && var5[1] == 600) {
         var6 = 3;
         this.N.b = var6;
      } else if (var5[0] == 1200 && var5[1] == 720) {
         var6 = 4;
         this.N.b = var6;
      }

      if (Gdx.app.getType() == ApplicationType.Desktop) {
         this.P.a(this.a(15, 78, Caption.AE[0], this, this.N), 2);
         this.P.a(this.a(15, 100, Caption.AE[1], this, this.N), 2);
         this.P.a(this.a(15, 122, Caption.AE[2], this, this.N), 2);
         this.P.a(this.a(15, 144, Caption.AE[3], this, this.N), 2);
         this.P.a(this.a(15, 166, Caption.AE[4], this, this.N), 2);
      }

      this.Q = this.N.b;
      byte var7 = 5;
      if (DataCenter.gI().r >= 3 || mConfig.gI().a(15)) {
         this.T = this.a(15, 85, Caption.AF[0], 102);
         var11 = this.T;
         var4 = mConfig.gI().a(15);
         var11.m = var4;
         this.P.a(this.T, 1);
         var7 = 22;
      }

      this.S = new vdtt_hl(100);
      this.U = mConfig.gI().b(2);
      int var8 = this.U;
      this.S.b = var8;
      switch(DataCenter.gI().p) {
      case 1:
         this.R = new vdtt_bs[1];
         this.R[0] = this.a(15, 85 + var7, Caption.jo, this, this.S);
         break;
      case 2:
         this.R = new vdtt_bs[3];
         this.R[0] = this.a(15, 110 + var7, Caption.jp, this, this.S);
         this.R[1] = this.a(15, 135 + var7, Caption.jo, this, this.S);
         this.R[2] = this.a(15, 85 + var7, Caption.jq, this, this.S);
         break;
      case 3:
         this.R = new vdtt_bs[4];
         this.R[0] = this.a(15, 110 + var7, Caption.jq, this, this.S);
         this.R[1] = this.a(15, 135 + var7, Caption.jp, this, this.S);
         this.R[2] = this.a(15, 160 + var7, Caption.jo, this, this.S);
         this.R[3] = this.a(15, 85 + var7, Caption.jr, this, this.S);
         break;
      case 4:
      case 5:
      case 6:
         this.R = new vdtt_bs[3];
         this.R[0] = this.a(15, 85 + var7, Caption.jq, this, this.S);
         this.R[1] = this.a(15, 110 + var7, Caption.jp, this, this.S);
         this.R[2] = this.a(15, 135 + var7, Caption.jo, this, this.S);
      }

      int var9;
      if (this.S.b <= 0 || this.S.b >= this.R.length) {
         var6 = 0;
         this.S.b = var6;
         this.U = 0;
         mConfig.gI().a(2, this.U);

         vdtt_bs var10;
         for(var9 = 0; var9 < this.R.length; ++var9) {
            var10 = this.R[var9];
            var4 = false;
            var10.l = var4;
         }

         var10 = this.R[this.S.b];
         var4 = true;
         var10.l = var4;
      }

      for(var9 = 0; var9 < this.R.length; ++var9) {
         this.P.a(this.R[var9], 1);
      }

      this.P.a(this.a, 0);
      this.P.a(this.b, 0);
      this.P.a(this.c, 0);
      this.P.a(this.M, 0);
      this.P.a(this.V[0], 0);
      this.P.a(this.V[1], 0);
      this.P.a(0);
   }

   public final void b(int var1, Object var2) {
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      boolean var4;
      switch(var1.b) {
      case 2000:
         if (var1.j.k >= 0) {
            this.P.a(var1.j.k);
            return;
         }
         break;
      case 2001:
         var4 = !this.d.m;
         this.d.m = var4;

         try {
            File var10 = new File(System.getProperty("user.dir") + "/jre/bin/opengl32.dll");
            File var12 = new File(System.getProperty("user.dir") + "/jre/bin/opengl32.backup");
            boolean var13 = false;
            if (this.d.m) {
               if (var10.exists()) {
                  var13 = var10.renameTo(var12);
               }
            } else if (var12.exists()) {
               var13 = var12.renameTo(var10);
            }

            if (var13) {
               mConfig.gI().a(20, this.d.m);
               AppListener.gI().a(false);
            }

            return;
         } catch (Exception var9) {
            Utlis.a(var9);
            return;
         }
      case 2002:
         vdtt_bs var5;
         for(int var11 = 0; var11 < this.R.length; ++var11) {
            var5 = this.R[var11];
            var4 = false;
            var5.l = var4;
         }

         mConfig.gI().a(2, this.U);
         var5 = this.R[mConfig.gI().b(2)];
         var4 = true;
         var5.l = var4;
         vdtt_dd.b();
         Binary.b();
         return;
      case 2003:
         this.U = this.S.b;
         return;
      case 2004:
         var4 = !this.T.m;
         this.T.m = var4;
         mConfig.gI().a(15, this.T.m);
         vdtt_dd.b();
         Binary.b();
         Graphics.a();
         GameSrc.gI().setSize(AppListener.gI().inputcanvas.getWidth(), AppListener.gI().inputcanvas.getHeight());
         GameSrc.gI().s(0);
         return;
      case 2005:
         vdtt_bb var6 = this.T;
         var4 = mConfig.gI().a(15);
         var6.m = var4;
         return;
      case 2006:
      default:
         break;
      case 2007:
         vdtt_hl var7 = this.O;
         byte var8 = mConfig.gI().b(20);
         var7.b = var8;
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      vdtt_bs var4;
      boolean var5;
      switch(var1) {
      case 100:
         if (this.S.b != this.U) {
            var1 = this.U;
            this.U = this.S.b;

            for(int var20 = 0; var20 < this.R.length; ++var20) {
               var4 = this.R[var20];
               var5 = false;
               var4.l = var5;
            }

            var4 = this.R[mConfig.gI().b(2)];
            var5 = true;
            var4.l = var5;
            this.S.b = var1;
            DataCenter.gI().currentScreen.a(Caption.jt, 2002, 2003, this);
            return;
         }
         break;
      case 102:
         vdtt_bb var6 = this.T;
         var5 = mConfig.gI().a(15);
         var6.m = var5;
         String var10001;
         if (this.T.m) {
            var10001 = Caption.AF[1];
            DataCenter.gI().currentScreen.a(var10001, 2004, 2005, this);
            return;
         }

         var10001 = Caption.AF[2];
         DataCenter.gI().currentScreen.a(var10001, 2004, 2005, this);
         return;
      case 600:
         mConfig.gI().a(25, this.V[0].n.b);
         Graphics.d();
         break;
      case 1000:
         mConfig.gI().a(9, this.V[1].n.b);
         return;
      case 1001:
         vdtt_aa.gI().c(this.a.m);
         return;
      case 1002:
         vdtt_aa.gI().b(this.b.m);
         return;
      case 1004:
         mConfig.gI().a(11, this.c.m);
         return;
      case 1005:
         vdtt_lm var7 = this;
         if (this.Q != this.N.b) {
            boolean var8;
            if (var8 = this.Q == 0) {
               try {
                  var7.U = 1;
                  mConfig.gI().a(2, var7.U);

                  for(int var9 = 0; var9 < var7.R.length; ++var9) {
                     var4 = var7.R[var9];
                     var5 = false;
                     var4.l = var5;
                  }

                  var4 = var7.R[mConfig.gI().b(2)];
                  var5 = true;
                  var4.l = var5;
               } catch (Exception var19) {
               }
            }

            var7.Q = var7.N.b;
            short[] var21 = new short[]{1024, 600};
            switch(var7.N.a()) {
            case 0:
               Gdx.graphics.setWindowedMode(400, 240);
               var21 = new short[]{400, 240};
               var8 = true;
               break;
            case 1:
               Gdx.graphics.setWindowedMode(800, 480);
               var21 = new short[]{800, 480};
               break;
            case 2:
               Gdx.graphics.setWindowedMode(960, 640);
               var21 = new short[]{960, 640};
               break;
            case 3:
               Gdx.graphics.setWindowedMode(1024, 600);
               var21 = new short[]{1024, 600};
               break;
            case 4:
               Gdx.graphics.setWindowedMode(1200, 720);
               var21 = new short[]{1200, 720};
            }

            if (var8) {
               vdtt_dd.b();
               Binary.b();
            }

            Writer var10 = null;
            boolean var11 = false;

            label214: {
               label213: {
                  try {
                     var11 = true;
                     (var10 = new Writer()).writeShort(var21[0]);
                     var10.writeShort(var21[1]);
                     Binary.a("arr_sc", var10.baos.toByteArray());
                     var11 = false;
                     break label213;
                  } catch (Exception var17) {
                     var11 = false;
                  } finally {
                     if (var11 && var10 != null) {
                        var10.close();
                     }

                  }

                  if (var10 != null) {
                     var10.close();
                  }
                  break label214;
               }

               var10.close();
            }

            if (Gdx.app.getType() == ApplicationType.Desktop) {
               AppListener.gI().a(false);
            }

            AppListener.gI().b();
            vdtt_cz.b();
            vdtt_cz.c();
            if (GameSrc.w() != null) {
               GameSrc.gI().aS = null;
            }
         }

         return;
      case 1006:
         var5 = !this.d.m;
         this.d.m = var5;
         this.H.a(Caption.rs, 2001, this);
         return;
      case 1007:
         mConfig.gI().a(28, this.M.m);
         return;
      }

   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.zy[3], (byte)2);
      this.P.a(var1);
      switch(this.P.h()) {
      case 1:
         vdtt_dd.b(vdtt_dd.d, var1, Caption.jv, this.R[0].cx, 62, 0, -1, -16777216);
         vdtt_dd.b(vdtt_dd.d, var1, Caption.jw, this.R[0].cx, 75, 0, -1, -16777216);
         return;
      case 2:
         String[] var2 = Caption.AE;
         vdtt_dd.b(vdtt_dd.d, var1, var2[var2.length - 1], 14, 65, 0, -1, -16777216);
      default:
      }
   }

   public final void a_() {
      if (this.P != null) {
         this.P.e();
      }

   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(this.P.f());
      return var1;
   }
}

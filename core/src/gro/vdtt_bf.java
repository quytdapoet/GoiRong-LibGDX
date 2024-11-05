package gro;

import com.badlogic.gdx.Gdx;
import java.util.Vector;

public class vdtt_bf extends vdtt_ak {
   public String[] a;
   public String b;
   private byte Q;
   public int c;
   public int d;
   public mImage M;
   public vdtt_x N;
   public String O;
   public byte P;

   public vdtt_bf(String var1, MainScreen var2, int var3) {
      this.O = Caption.h;
      var2.b((vdtt_k)var2.k);
      if (var2.c != null) {
         var2.c.b((vdtt_k)var2.c.k);
      }

      this.e = 4;
      this.H = var2;
      this.Q = (byte)var3;
      this.b = var1;
      short var4 = 205;
      this.a(205, 140);
      if (var3 == 3) {
         this.d = (int)(Utlis.a() / 1000L);
         this.a = vdtt_dd.c(vdtt_dd.d, Utlis.b(var1, "" + this.c), this.width - 30);
      } else {
         this.a = vdtt_dd.c(vdtt_dd.d, var1, this.width - 30);
      }

      if (this.a.length >= 10) {
         var4 = 240;
         this.a(240, 140);
         if (var3 == 3) {
            this.d = (int)(Utlis.a() / 1000L);
            this.a = vdtt_dd.c(vdtt_dd.d, Utlis.b(var1, "" + this.c), this.width - 30);
         } else {
            this.a = vdtt_dd.c(vdtt_dd.d, var1, this.width - 30);
         }
      }

      if (this.a.length >= 7) {
         int var5 = this.a.length + 1;
         this.a(var4, var5 * 20);
      }

      this.a(Caption.i, -7);
   }

   public final void a_() {
      int var1;
      if (this.Q == 3) {
         if ((var1 = (int)((long)this.c - (Utlis.a() / 1000L - (long)this.d))) < -1) {
            this.k();
         }

         if (var1 < 0) {
            var1 = 0;
         }

         this.a = vdtt_dd.c(vdtt_dd.d, Utlis.b(this.b, "" + var1), this.width - 20);
      }

      DataCenter.gI();
      if (!DataCenter.b() && GameSrc.gI().idTask == 10 && GameSrc.gI().idStep == 1) {
         var1 = this.cx + this.width / 2 - 40;
         int var2 = this.cy + this.height;
         DataCenter.gI().pointHelper.a(var1, var2 - 23);
         DataCenter.gI().pointHelper.b = true;
      }

   }

   public void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, this.O, (byte)2, true);
      this.a(var1, this.cx + 4, this.cy + this.f());
      if (this.M != null) {
         var1.a(this.M, 0, 0, this.M.c, this.M.d, 0, this.width / 2, 23, 3);

         for(int var2 = 0; var2 < this.a.length; ++var2) {
            vdtt_dd.c(vdtt_dd.d, var1, this.a[var2], 10, this.h() / 2 + 25 + var2 * 12 - this.a.length * 6, 0, -1, -16777216);
         }
      } else {
         boolean var4 = true;

         int var3;
         for(var3 = 0; var3 < this.f.size(); ++var3) {
            if (this.f.get(var3) instanceof vdtt_ay && !((vdtt_ay)this.f.get(var3)).d) {
               var4 = false;
               break;
            }
         }

         if (this.Q == 1 || this.b.equals(Caption.m) || var4 && this.a.length == 1) {
            for(var3 = 0; var3 < this.a.length; ++var3) {
               vdtt_dd.a(vdtt_dd.d, var1, this.a[var3], (super.width - 8) / 2, this.h() / 2 - 4 + var3 * 12 - this.a.length * 6, 2, -2560, 2, 1, 2, 0);
            }
         } else if (this.Q == 2) {
            for(var3 = 0; var3 < this.a.length; ++var3) {
               vdtt_dd.c(vdtt_dd.d, var1, this.a[var3], 15, this.h() / 2 - 4 + var3 * 12 - this.a.length * 6, 0, -1, -16777216);
            }
         } else {
            for(var3 = 0; var3 < this.a.length; ++var3) {
               vdtt_dd.c(vdtt_dd.d, var1, this.a[var3], (super.width - 8) / 2, this.h() / 2 - 4 + var3 * 12 - this.a.length * 6, 2, -1, -16777216);
            }
         }
      }

   }

   public void a(vdtt_hi var1, int var2, int var3) {
      if (var1.b >= 2000 && var1.b <= 3000) {
         this.k();
         this.N.a(var1, var2, var3);
      } else {
         switch(var1.b) {
         case 10000:
            this.k();
            return;
         case 10001:
            this.k();
            return;
         case 10002:
            vdtt_bf var4 = this;

            try {
               if (var4.P == -126) {
                  Gdx.net.openURI("https://goirongplus.com/");
                  AppListener.gI();
                  AppListener.i();
               } else {
                  Message.d(var4.P).send();
               }
            } catch (Exception var7) {
               Utlis.a(var7);
            }

            this.k();
            return;
         case 10003:
            this.k();
            if (this.H.c instanceof vdtt_ap) {
               ((vdtt_ap)this.H.c).a(var1, var2, var3);
               return;
            }
            break;
         case 10004:
            this.a((byte)-128);
            return;
         case 10005:
            this.a((byte)-127);
            return;
         case 10006:
            try {
               Message.d((byte)-122).send();
               if (DataCenter.gI().currentScreen instanceof LoginPCScreen) {
                  ((LoginPCScreen)DataCenter.gI().currentScreen).A();
               }
            } catch (Exception var6) {
               Utlis.a(var6);
            }

            this.k();
            return;
         case 10007:
            if (this.H instanceof LoginPCScreen) {
               ((LoginPCScreen)this.H).A();
            } else if (this.H instanceof vdtt_cs) {
               vdtt_cs.v();
            }

            this.k();
            return;
         case 10008:
            this.k();
            if (Session.gI().isConnected()) {
               DataCenter.gI().ay = true;
               Session.gI().close();
               return;
            }
            break;
         case 10009:
            this.k();
            return;
         case 10010:
            this.k();
            DataCenter.aD = 0;
            return;
         case 10011:
            this.k();
            vdtt_ms var5 = new vdtt_ms(GameSrc.gI());
            GameSrc.gI().a((vdtt_w)var5);
            vdtt_ms.N = 3;
            var5.f(3);
            var5.A();
            return;
         case 20000:
            this.H.b(Caption.m).f.clear();
            CheckVersionScreen.J = true;
            AppListener.gI().f = 50;
            return;
         case 30000:
            System.exit(0);
            return;
         default:
            super.a(var1, var2, var3);
         }
      }

   }

   public final Vector g() {
      return super.g();
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final vdtt_by w() {
      vdtt_by var1 = null;

      for(int var2 = 0; var2 < this.f.size(); ++var2) {
         if (this.f.get(var2) instanceof vdtt_by) {
            var1 = (vdtt_by)this.f.get(var2);
            break;
         }
      }

      return var1;
   }

   private void a(byte var1) {
      try {
         String var2 = "";
         vdtt_by var3;
         if ((var3 = this.w()) != null) {
            var2 = var3.i();
            var3.a("");
         }

         Message var4;
         (var4 = Message.a(var1)).writeUTF(var2);
         var4.send();
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }
}

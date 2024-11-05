package gro;

import java.util.Vector;

public final class vdtt_bg extends vdtt_ak {
   private byte d;
   public vdtt_x a;
   public String b;
   public byte c;
   private String[] M;
   private vdtt_ay N;
   private long O;

   public vdtt_bg(String[] var1, MainScreen var2, int var3, int var4) {
      this.b = Caption.h;
      var2.b((vdtt_k)var2.k);
      if (var2.c != null) {
         var2.c.b((vdtt_k)var2.c.k);
      }

      this.e = 4;
      this.H = var2;
      this.M = var1;
      this.d = 0;
      this.a(200, 140);
      this.N = this.a(Caption.i, var4);
      this.j();
   }

   public final void w() {
      this.O = System.currentTimeMillis() + 3500L;
   }

   public final void a(String var1) {
      this.N.l = var1;
   }

   public final void b(Graphics var1) {
      var1.f(-11184811);
      var1.c(2, 19, this.width - 3, this.height - 29);
      var1.f(-10275328);
      var1.b(6, 23, this.width - 12, this.height - 38);
      this.a(var1, this.cx + 4, this.cy + this.f());

      for(int var2 = 0; var2 < this.M.length; ++var2) {
         vdtt_dd.a(var1, this.M[var2], this.width / 2, this.h() / 2 + var2 * 12 - this.M.length * 6, 2, -1);
      }

   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (var1.b >= 2000 && var1.b <= 3000) {
         this.k();
         this.a.a(var1, var2, var3);
      } else {
         switch(var1.b) {
         case 10000:
            this.k();
            return;
         case 10001:
            this.k();
            return;
         case 10002:
            vdtt_bg var4 = this;

            try {
               Message.d(var4.c).send();
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

   private vdtt_by x() {
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
         if ((var3 = this.x()) != null) {
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

   public final void a_() {
      if (this.O > 0L) {
         try {
            int var1;
            if ((var1 = (int)(this.O - System.currentTimeMillis())) < 0) {
               var1 = 0;
               if (this.N.m == 2112) {
                  this.k();
                  this.a.a((vdtt_hi)((vdtt_hi)this.N.g().get(0)), this.cx, this.cy);
                  return;
               }
            }

            vdtt_ay var2 = this.N;
            String var3 = Caption.fG + " (" + var1 / 1000 + ")";
            var2.l = var3;
            return;
         } catch (Exception var4) {
         }
      }

   }
}

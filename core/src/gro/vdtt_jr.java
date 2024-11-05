package gro;

import java.util.Vector;

public final class vdtt_jr extends vdtt_jo {
   private vdtt_hp[] N = new vdtt_hp[3];
   private vdtt_hq O;
   private vdtt_ay P;
   private vdtt_ay Q;

   public vdtt_jr(MainScreen var1) {
      super(var1, new String[]{Caption.bp});
      this.P = this.a(this.width - 52, this.height - 28, Caption.C, this, 0, -8);
      this.P.setSize(45, this.P.height);
      this.a(this.P, 0);
      this.Q = this.a(this.width - 100, this.height - 28, Caption.mb, this, 5007, -8);
      this.Q.setSize(45, this.Q.height);
      this.a(this.Q, 0);
      if (DataCenter.k()) {
         this.ag.b(true);
         this.Q.b(true);
         this.P.b(true);
         this.N[0] = new vdtt_hp((byte)0, 12, this.f() + 8, 78, 18, 78, 1);
         this.N[1] = new vdtt_hp((byte)0, 12, this.f() + 16 + 18, 78, 18, 78, 1);
         this.N[2] = new vdtt_hp((byte)0, 12, this.f() + 24 + 36, 78, 18, 78, 1);
         this.O = new vdtt_hq((byte)1, 97, this.f() + 8, 192, 192, 32, Utlis.c(this.ai.length, 6), 6);
      } else {
         this.N[0] = new vdtt_hp((byte)0, 103, this.f() + 3, 93, 18, 93, 1);
         this.N[1] = new vdtt_hp((byte)0, 7, this.f() + 3, 93, 18, 93, 1);
         this.N[2] = new vdtt_hp((byte)0, 199, this.f() + 3, 93, 18, 93, 1);
         this.O = new vdtt_hq((byte)1, 7, this.f() + 24, 288, 160, 32, Utlis.c(Char.gI().arrItemBox.length, 9), 9);
      }

      vdtt_aa.gI().w();
   }

   private void a(vdtt_hp var1, int var2) {
      this.O.k = -1;
      var1.k = var2;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         switch(var1.b) {
         case 0:
            GameSrc.gI();
            GameSrc.n(1);
            return;
         case 2000:
            try {
               Message.c((byte)-82).send();
               break;
            } catch (Exception var5) {
               return;
            }
         case 5001:
            if (var1.j.k >= 0 && var1.j.k < Char.gI().arrItemBox.length) {
               this.k = a(var1, this, Char.gI().arrItemBox[var1.j.k]);
               return;
            }
            break;
         case 5002:
            this.k = a(var1, this, (Item)null);
            return;
         case 5003:
            this.a(var1.j, var1.j.k);
            if (var1.j.k >= 0) {
               this.k = b(Caption.yK[0], this, var1.j.cx + 30, var1.j.cy, 30);
            }

            this.k.width = 60;
            return;
         case 5004:
            this.a(var1.j, var1.j.k);
            this.k = b(Caption.yR[0], this, var1.j.cx + 30, var1.j.cy, 30);
            this.k.width = 60;
            return;
         case 5005:
            this.a(var1.j, var1.j.k);
            this.k = b(Caption.yK[1], this, var1.j.cx + 30, var1.j.cy, 30);
            this.k.width = 60;
            return;
         case 5006:
            this.a(var1.j, var1.j.k);
            this.k = b(Caption.yR[1], this, var1.j.cx + 30, var1.j.cy, 30);
            this.k.width = 60;
            return;
         case 5007:
            DataCenter.gI().currentScreen.a(Caption.mf, 2000, this);
         }
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      super.b(var1);
      if (super.a.b == 0) {
         int var2 = var1.e;
         int var3 = var1.f;
         this.a(var1, this.O);

         int var4;
         int var5;
         for(var4 = 0; var4 < this.O.i; ++var4) {
            for(var5 = 0; var5 < this.O.O; ++var5) {
               if (this.O.b(var4)) {
                  int var6 = var5 * this.O.h;
                  int var7 = var4 * this.O.h;
                  int var8 = var4 * this.O.O;
                  b(var1, var6, var7, Char.gI().arrItemBox[var8 + var5], var4 * this.O.O + var5 == this.O.k);
               }
            }
         }

         this.a(var1);
         this.O.b(var1, this);
         this.a(var1, this.cx + 4, this.cy + this.f());
         var4 = 0;

         for(var5 = 0; var5 < Char.gI().arrItemBox.length; ++var5) {
            if (Char.gI().arrItemBox[var5] != null) {
               ++var4;
            }
         }

         if (!DataCenter.k()) {
            vdtt_dd.b(vdtt_dd.d, var1, Caption.bq + " " + var4 + "/" + Char.gI().arrItemBox.length, 6, this.P.cy - 19, 0, -1, -16777216);
         }

         for(var5 = 0; var5 < this.N.length; ++var5) {
            this.a(var1, this.cx + this.N[var5].cx, this.cy + this.N[var5].cy);
            this.a(var1, 0, 0, this.N[var5].width, this.N[var5].height, 46, 22, 23, 1, 1, 180);
            switch(var5) {
            case 0:
               a(var1, 0, 10, "", (byte)0);
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(Char.gI().bac), 30, 9, 20, -3089954, -16777216);
               break;
            case 1:
               a(var1, 0, 8, "", (byte)2);
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(Char.gI().vang), 30, 9, 20, -2560, -16777216);
               break;
            case 2:
               a(var1, 0, 10, "", (byte)1);
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(Char.gI().bacKhoa), 30, 9, 20, -3089954, -16777216);
               break;
            case 3:
               a(var1, 0, 8, "", (byte)3);
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(Char.gI().vangKhoa), 30, 9, 20, -2560, -16777216);
            }
         }

         this.a(var1, var2, var3);
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         this.O.a();
      }

      if (GameSrc.gI().idTask == 0) {
         if (GameSrc.gI().idStep != 0) {
            if (GameSrc.gI().idStep == 1) {
               this.y();
            }
         } else {
            boolean var1 = true;
            int var2 = 0;

            int[] var3;
            while(true) {
               if (var2 >= Char.gI().arrItemBox.length) {
                  var3 = null;
                  break;
               }

               if (Char.gI().arrItemBox[var2] != null && Char.gI().arrItemBox[var2].id == 168) {
                  var3 = new int[]{var2 % 9 * 32, var2 / 9 * 32};
                  break;
               }

               ++var2;
            }

            if (var3 == null) {
               return;
            }

            int var5;
            if (super.a.b != 0) {
               var5 = this.cx + 65;
               DataCenter.gI().pointHelper.a(var5, this.cy + 15);
               DataCenter.gI().pointHelper.b = true;
            } else {
               int var10002;
               if (this.k != null) {
                  if (this.k instanceof vdtt_bm && !((vdtt_bm)this.k).m) {
                     var5 = this.cx + var3[0] + 45;
                     var10002 = this.cy + 25;
                     DataCenter.gI().pointHelper.a(var5, var10002 + var3[1] + 90);
                     DataCenter.gI().pointHelper.b = true;
                  }

                  return;
               }

               var5 = this.cx + var3[0] + 15;
               var10002 = this.cy + 25;
               DataCenter.gI().pointHelper.a(var5, var10002 + var3[1] + 35);
               DataCenter.gI().pointHelper.b = true;
            }
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         var1.addElement(this.O.a(5001, this));

         for(int var2 = 0; var2 < this.N.length; ++var2) {
            var1.addElement(this.N[var2].a(5003 + var2, this));
         }
      }

      return var1;
   }

   public final int C() {
      return super.a.b;
   }
}

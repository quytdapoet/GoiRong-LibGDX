package gro;

import java.util.Vector;

public final class vdtt_ke extends vdtt_ap {
   public vdtt_ay[] a;
   public vdtt_iv[] b = new vdtt_iv[0];
   private vdtt_hp c;
   private vdtt_hp[] d;
   private vdtt_ay M;

   public vdtt_ke(MainScreen var1, Message var2) {
      try {
         this.H = var1;
         this.a(315);
         this.J = false;
         this.b = new vdtt_iv[var2.readShort()];

         for(int var3 = 0; var3 < this.b.length; ++var3) {
            this.b[var3] = new vdtt_iv();
            this.b[var3].a = var3 + 1;
            this.b[var3].b = var2.reader.readUTF();
            this.b[var3].c = var2.readInt();
            this.b[var3].h = var2.readInt() + "%";
            this.b[var3].e = (long)var2.readInt();
            this.b[var3].f = var2.readInt();
            this.b[var3].g = var2.readUTF();
         }

         this.M = this.a(5, this.height - 26, Caption.wf, this, 100, 15);
         this.w();
      } catch (Exception var4) {
      }

   }

   private void w() {
      this.c = new vdtt_hp((byte)1, 4, this.f() + 32, super.width - 8, 154, 22, this.b.length);
      this.a = new vdtt_ay[this.b.length];
      this.d = new vdtt_hp[this.b.length];

      for(int var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1] = new vdtt_ay(261, var1 * this.c.h + 2, 0, 0, Caption.nE, this, 3000 + var1, 15);
         this.a[var1].setSize(37, 18);
         this.d[var1] = new vdtt_hu((byte)1, this.a[var1].cx, this.a[var1].cy, this.a[var1].width, this.a[var1].height, this.a[var1].height, 1, this.c);
      }

   }

   public final void a_() {
      this.c.a();

      for(int var1 = 0; var1 < this.a.length; ++var1) {
         this.a[var1].a_();
         this.a[var1].a_();
         if (this.d[var1].l != -1) {
            this.a[var1].M = true;
         } else {
            this.a[var1].M = false;
         }
      }

      String var2;
      if (Char.gI().e(301) != null) {
         var2 = Caption.wg;
         this.M.l = var2;
      } else {
         var2 = Caption.wf;
         this.M.l = var2;
      }

      if (GameSrc.gI().idTask == 5 && GameSrc.gI().idStep == 3) {
         this.y();
      }

      if (Char.gI().giatoc != null) {
         this.k();
         GameSrc.gI();
         GameSrc.o(54);
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      this.c(var1, var2);
   }

   public final void b(int var1, Object var2) {
   }

   public final Vector g() {
      Vector var1 = super.g();

      for(int var2 = 0; var2 < this.a.length; ++var2) {
         int var3 = this.c.cx + this.a[var2].cx;
         int var4 = this.c.cy + this.a[var2].cy - this.c.f;
         if (Utlis.a(this.c.cx, this.c.cy, this.c.cx + this.c.width, this.c.cy + this.c.height, var3, var4) && Utlis.a(this.c.cx, this.c.cy, this.c.cx + this.c.width, this.c.cy + this.c.height, var3 + this.a[var2].width, var4 + this.a[var2].height)) {
            this.d[var2].cx = (short)var3;
            this.d[var2].cy = (short)var4;
            var1.addElement(new vdtt_hi(3000 + var2, this.d[var2].cx, this.d[var2].cy, this.d[var2].cx + this.d[var2].width, this.d[var2].cy + this.d[var2].height, this.d[var2], this));
         }
      }

      var1.addElement(this.c.a(1003, this));
      return var1;
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.hZ, (byte)2, this.J);
      this.b(var1, this.c);
      this.a(var1, 8, -24, this.c.width - 16, 21, -11, 22, 23, 1, 1);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.cM, 36, -15, 2, -6488, -10275328);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.kC, 90, -15, 2, -6488, -10275328);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.ej, 158, -15, 2, -6488, -10275328);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.ek, 224, -15, 2, -6488, -10275328);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.nD, 279, -15, 2, -6488, -10275328);
      this.a(var1, this.c);
      int var2 = var1.e;
      int var3 = var1.f;

      for(int var4 = 0; var4 < this.c.i; ++var4) {
         if (this.c.b(var4)) {
            if (var4 == this.c.k) {
               vdtt_cz.a(var1, 3, var4 * this.c.h, this.c.width - 6, this.c.h);
            }

            vdtt_iv var5 = this.b[var4];
            vdtt_dd.b(vdtt_dd.d, var1, var5.g, 36, 10 + var4 * this.c.h, 2, -3604601, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, var5.c + "+" + var5.h, 90, 10 + var4 * this.c.h, 2, -3604601, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, var5.e + "/" + var5.f, 158, 10 + var4 * this.c.h, 2, -3604601, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, var5.b, 224, 10 + var4 * this.c.h, 2, -3604601, -16777216);
            this.a(var1, var2 + this.a[var4].cx, var3 + this.a[var4].cy);
            this.a[var4].b(var1);
            this.a(var1, var2, var3);
         }
      }

      this.a(var1);
      this.c.b(var1, this);
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (var1.b >= 3000 & var1.b < 4000) {
         try {
            vdtt_aa.gI().n();
            Message var6;
            (var6 = Message.c((byte)-92)).writeUTF(this.b[var1.b - 3000].g);
            var6.send();
            this.k();
            return;
         } catch (Exception var5) {
         }
      }

      switch(var1.b) {
      case 100:
         Item var4;
         if ((var4 = Char.gI().e(301)) != null) {
            GameSrc.gI().a(var4);
            return;
         }

         (var4 = new Item(301)).idBuy = 8;
         var4.m = 350;
         this.H.a((vdtt_w)(new vdtt_jt(this.H, var4, (byte)40)));
         break;
      case 1001:
         return;
      case 1003:
         if (var1.j.k >= 0) {
            this.a(this.b[var1.j.k].b, var1.j.k, var2, var3);
            return;
         }
      }

   }

   public final void d() {
      try {
         vdtt_ii var1;
         if ((var1 = GameSrc.gI().T()) != null) {
            if (var1.a == 43 && GameSrc.gI().idTask == 5 && GameSrc.gI().idStep == 3) {
               GameSrc.gI();
               GameSrc.o(92);
            } else if (var1.a == 44) {
               GameSrc.gI();
               GameSrc.o(93);
            }
         }
      } catch (Exception var2) {
      }

      super.d();
   }
}

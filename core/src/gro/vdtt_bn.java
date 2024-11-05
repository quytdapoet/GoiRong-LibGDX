package gro;

import java.util.Vector;

public final class vdtt_bn extends vdtt_al {
   private int m;
   public Thu l;
   private vdtt_ay[] n;
   private vdtt_hp[] H;
   private vdtt_hp I;
   private vdtt_hp J;
   private String[] K;

   public vdtt_bn(int var1, int var2, int var3, vdtt_w var4, Thu var5) {
      this.m = var3;
      this.a = var4;
      this.l = var5;
      this.setXY(var1, var2);
      if (var5.a()) {
         var1 = 0;
         if (var5.f > 0) {
            var1 += 15;
         }

         if (var5.g > 0) {
            var1 += 15;
         }

         if (var5.h > 0) {
            var1 += 15;
         }

         if (var5.i > 0) {
            var1 += 15;
         }

         if (var5.j > 0L) {
            var1 += 15;
         }

         if (var1 < 15) {
            var1 = 15;
         }

         this.setSize(230, 160 + var1);
      } else {
         this.setSize(230, 165);
      }

      this.n = new vdtt_ay[4];
      this.n[0] = new vdtt_ay(this.width - 53, this.height - 26, 0, 0, Caption.G, var4, 1000, 7);
      this.n[0].setSize(49, 22);
      this.n[1] = new vdtt_ay(this.width - 17, 3, 0, 0, "", var4, 1001, 52);
      this.n[2] = new vdtt_ay(this.width - 104, this.height - 26, 0, 0, Caption.H, var4, 1002, 7);
      this.n[2].setSize(49, 22);
      if (var5.a()) {
         this.n[3] = new vdtt_ay(8, 148, 0, 0, Caption.cm, var4, 1003, 7);
         this.n[3].setSize(41, 18);
      }

      this.H = a(this.n);
      this.K = vdtt_dd.c(vdtt_dd.d, var5.d, this.width - 18);
      this.I = new vdtt_hp((byte)1, 2, 40, this.width - 4, 84, 14, this.K.length);
      this.J = new vdtt_hp((byte)1, 54, 137, 28, 28, 28, 1);
   }

   public final void b(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      this.c(var1);
      vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, Caption.he, 50, 12, 1, -6488, -10275328);
      vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, this.l.c, 55, 12, 0, -1, -10275328);
      vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, Caption.hf, 50, 26, 1, -6488, -10275328);
      vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, this.l.b, 55, 26, 0, -22360, -10275328);
      int var4;
      if (this.l.a()) {
         vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, Caption.hg, 8, 140, 0, -10831436, 0);
         var4 = 125;
         vdtt_dd var5;
         String var6;
         if (this.l.f > 0) {
            var5 = vdtt_dd.d;
            var6 = Utlis.c(this.l.f);
            var4 += 15;
            vdtt_dd.a((vdtt_dd)var5, (Graphics)var1, var6, 90, 140, 0, -1, 0);
            a(var1, 90, 140, Utlis.c(this.l.f), (byte)0);
         }

         if (this.l.g > 0) {
            var5 = vdtt_dd.d;
            var6 = Utlis.c(this.l.g);
            var4 += 15;
            vdtt_dd.a((vdtt_dd)var5, (Graphics)var1, var6, 90, var4, 0, -1, 0);
            a(var1, 90, var4, Utlis.c(this.l.g), (byte)1);
         }

         if (this.l.h > 0) {
            var5 = vdtt_dd.d;
            var6 = Utlis.c(this.l.h);
            var4 += 15;
            vdtt_dd.a((vdtt_dd)var5, (Graphics)var1, var6, 90, var4, 0, -1, 0);
            a(var1, 90, var4 - 2, Utlis.c(this.l.h), (byte)2);
         }

         if (this.l.i > 0) {
            var5 = vdtt_dd.d;
            var6 = Utlis.c(this.l.i);
            var4 += 15;
            vdtt_dd.a((vdtt_dd)var5, (Graphics)var1, var6, 90, var4, 0, -1, 0);
            a(var1, 90, var4 - 2, Utlis.c(this.l.i), (byte)3);
         }

         if (this.l.j > 0L) {
            var5 = vdtt_dd.d;
            var6 = Utlis.c(this.l.j / 10L);
            var4 += 15;
            vdtt_dd.a((vdtt_dd)var5, (Graphics)var1, var6, 90, var4, 0, -1, 0);
            a(var1, 90, var4 - 2, Utlis.c(this.l.j / 10L), (byte)6);
         }

         a(var1, this.J.cx, this.J.cy, this.l.e, false);
      }

      var1.c(-8492991);
      this.a(var1, 2, this.I.cy - 5, this.width - 4, this.I.height + 10, -12, 380, -12);
      var1.f();
      this.a(var1, this.I);

      for(var4 = 0; var4 < this.K.length; ++var4) {
         if (this.I.b(var4)) {
            vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, this.K[var4], 10, 7 + var4 * this.I.h, 0, -3089954, 0);
         }
      }

      this.a(var1);
      this.a(var1, var2, var3);
      this.a(var1, this.n, var2, var3);
   }

   public final void a_() {
      this.I.a();
      this.J.a();
      if (!this.l.a()) {
         this.n[3] = null;
      }

      a(this.n, this.H);
   }

   public final Vector g() {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < this.H.length; ++var2) {
         if (this.H[var2] != null && this.n[var2] != null) {
            var1.addElement(this.H[var2].a(this.n[var2].m, this));
         }
      }

      var1.addElement(this.I.a(1010, this));
      var1.addElement(this.J.a(1011, this));
      var1.addElement(new vdtt_hi(1500, 0, 0, this.width, this.height, (vdtt_hp)null, this));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      switch(var1.b) {
      case 1000:
         this.d();
         ((vdtt_lj)this.a).a(this.l);
         return;
      case 1001:
         this.d();
         return;
      case 1002:
         this.d();
         this.c(true);
         return;
      case 1003:
         this.d();
         vdtt_bn var4 = this;

         try {
            if (var4.l.a()) {
               Message var5;
               (var5 = new Message((byte)95)).writeShort(var4.l.a);
               var5.send();
            }
            break;
         } catch (Exception var6) {
            return;
         }
      case 1011:
         this.a.k = a(this.a, this.cx - 137, this.cy + 15, 28, this.l.e);
         return;
      case 2002:
         this.c(false);
      }

   }

   private void c(boolean var1) {
      try {
         if (this.l.a()) {
            DataCenter.gI().currentScreen.c(Caption.hh, -65536);
         } else if (var1) {
            DataCenter.gI().currentScreen.a(Caption.hi, 2002, this);
         } else {
            Vector var2;
            (var2 = new Vector()).add(this.l);
            vdtt_lj.c(var2);
         }
      } catch (Exception var3) {
      }

   }

   public final void d() {
      this.a.b((vdtt_k)this);
   }
}

package gro;

import java.util.Map;
import java.util.Vector;

public final class vdtt_az extends vdtt_ay {
   public static int Q = 300;
   public vdtt_hr R;
   private short ab;
   public short S;
   public short T;
   public vdtt_ih U;
   public EntityPanel V;
   public int W;
   public int X;
   public int Y;
   public int Z;
   public boolean aa;

   public vdtt_az(int var1, int var2, int var3, int var4, String var5, vdtt_w var6, int var7, int var8, int var9) {
      super(var1, var2, 0, 0, var5, var6, var7, var8);
      this.W = this.cx;
      this.X = this.cy;
      this.Y = this.width;
      this.Z = this.height;
      this.ab = (short)var9;
      this.R = new vdtt_hr((byte)0, this.width / 2, this.height / 2, this.width, this.height, 1, 1, this);
      this.V = new EntityPanel();
      this.V.setSize(this.width, this.height);
   }

   public final int h() {
      return this.W + this.Y / 2;
   }

   public final Vector g() {
      Vector var1;
      (var1 = new Vector()).addElement(new vdtt_hi(this.m, 0, 0, this.width, this.height, this.R, this));
      return var1;
   }

   public final void r() {
      super.r();
      this.aa = false;
      this.j();
      if (Char.b(Char.gI().cx, Char.gI().cy) == null && DataCenter.gI().currentScreen.c instanceof Map) {
         vdtt_aa.gI().c(0.7F);
      }

   }

   public final void i() {
      this.setSize(this.Y, this.Z);
      this.setXY(this.W, this.X);
   }

   public final void j() {
      if (mConfig.gI().b(12) == 2) {
         int var1 = Q;
         this.setSize(var1, var1);
         this.setXY(0, DataCenter.gI().o - this.height - 0);
      } else {
         this.i();
      }

      this.S = 0;
      this.T = 0;
      this.V.setXY(0, 0);
      if (this.R != null) {
         this.R.f();
      }

   }

   public final void a_() {
      super.a_();
      if (this.U != null) {
         this.U.a();
      }

   }

   public final void b(Graphics var1) {
      short var2 = this.H;
      short var3 = this.ab;
      byte var4 = 30;
      if (mConfig.gI().a(15)) {
         var4 = 40;
      }

      if (!this.d()) {
         var1.d(60);
      } else {
         var1.d(90);
      }

      if (mConfig.gI().b(12) == 0) {
         if (this.e(0)) {
            DataCenter.n();
            vdtt_y.b(var1, var3, this.J, this.R.cx - var4 / 2, this.R.cy - var4 / 2, var4, var4);
         }
      } else if (mConfig.gI().b(12) == 1 || this.aa) {
         vdtt_y.b(var1, var2, this.J, this.V.cx, this.V.cy, this.V.width, this.V.height);
         DataCenter.n();
         vdtt_y.b(var1, var3, this.J, this.R.cx - var4 / 2, this.R.cy - var4 / 2, var4, var4);
      }

      var1.m = 1.0F;
   }
}

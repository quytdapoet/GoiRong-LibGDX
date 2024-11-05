package gro;

import java.util.Vector;

public final class vdtt_kt extends vdtt_ap {
   private vdtt_hp a;
   private Vector b = new Vector();
   private vdtt_ay c;
   private vdtt_ay d;
   private vdtt_ay[] M;
   private vdtt_hp[] N;

   public vdtt_kt(MainScreen var1, Message var2) {
      this.e = 1;
      this.H = var1;
      this.J = false;
      this.a(316);
      this.c = this.a(4 + (super.width - 8) - 137, this.f() + this.h() - 25, Caption.fT, this, 100, 15);
      this.c.setSize(64, this.c.height);
      this.d = this.a(4 + (super.width - 8) - 69, this.f() + this.h() - 25, Caption.fV, this, 102, 15);
      this.d.setSize(64, this.d.height);
      this.b(var2);
   }

   public final void b(Message var1) {
      try {
         this.b.clear();
         boolean var2 = var1.readBoolean();
         this.c.c = var2;
         this.d.c = !var2;
         byte var3 = var1.readByte();

         for(int var4 = 0; var4 < var3; ++var4) {
            vdtt_dz var5;
            (var5 = new vdtt_dz()).a = var1.reader.readUTF();
            var5.b = var1.readInt();
            var5.c = var1.readInt();
            var5.d = var1.readInt();
            this.b.add(var5);
         }
      } catch (Exception var6) {
      }

      this.a = new vdtt_hp((byte)1, 4, this.f() + 34, super.width - 8, 144, 24, this.b.size());
      this.M = new vdtt_ay[this.b.size()];
      this.N = new vdtt_hp[this.b.size()];

      for(int var7 = 0; var7 < this.M.length; ++var7) {
         this.M[var7] = new vdtt_ay(this.width - 46, var7 * 24, 0, 0, "", this, 1000, -5);
         this.M[var7].setSize(26, 20);
         this.N[var7] = new vdtt_hu((byte)1, 0, 0, this.M[var7].width, this.M[var7].height, this.M[var7].height, 1, this.a);
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.fW, (byte)2, this.J);
      this.a(var1, 12, 37, this.a.width - 16, 21, -11, 22, 23, 1, 1);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.fX, 29, this.f() + 17, 2, -10831436, -16777216);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.fY, 79, this.f() + 17, 2, -10831436, -16777216);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.fZ, 159, this.f() + 17, 2, -10831436, -16777216);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.ga, 234, this.f() + 17, 2, -10831436, -16777216);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.aL, 286, this.f() + 17, 2, -10831436, -16777216);
      this.a(var1, this.a);

      for(int var2 = 0; var2 < this.b.size(); ++var2) {
         vdtt_dz var3 = (vdtt_dz)this.b.get(var2);
         int var4 = 10 + var2 * 24;
         vdtt_dd.c(vdtt_dd.d, var1, "" + (var2 + 1), 24, var4, 2, -1, -16777216);
         vdtt_dd.c(vdtt_dd.d, var1, var3.a, 74, var4, 2, -1, -16777216);
         vdtt_dd.c(vdtt_dd.d, var1, Utlis.c(var3.b), 154, var4, 2, -1, -16777216);
         vdtt_dd.c(vdtt_dd.d, var1, Utlis.c(var3.c) + Caption.fh, 229, var4, 2, -1, -16777216);
         int var5 = var1.e;
         var4 = var1.f;
         if (this.M != null && this.M.length > 0) {
            this.a(var1, var5 + this.M[var2].cx, var4 + this.M[var2].cy);
            this.M[var2].b(var1);
            this.a(var1, var5, var4);
         }
      }

      this.a(var1);
      this.a.b(var1, this);
   }

   public final void a_() {
      this.a.a();
      vdtt_hp[] var1 = this.N;
      vdtt_ay[] var2 = this.M;

      for(int var3 = 0; var3 < var1.length; ++var3) {
         if (var2[var3] != null) {
            var1[var3].a();
            if (var1[var3].l != -1) {
               var2[var3].M = true;
            } else {
               var2[var3].M = false;
            }
         }
      }

   }

   public final Vector g() {
      Vector var1;
      Vector var2 = var1 = super.g();
      boolean var3 = true;
      vdtt_hp var4 = this.a;
      vdtt_hp[] var5 = this.N;
      vdtt_ay[] var6 = this.M;
      vdtt_kt var7 = this;
      Vector var8 = new Vector();

      for(int var9 = 0; var9 < var6.length; ++var9) {
         int var10 = var4.cx + var6[var9].cx;
         int var11 = var4.cy + var6[var9].cy - var4.f;
         if (Utlis.a(var4.cx, var4.cy, var4.cx + var4.width, var4.cy + var4.height, var10, var11) && Utlis.a(var4.cx, var4.cy, var4.cx + var4.width, var4.cy + var4.height, var10 + var6[var9].width, var11 + var6[var9].height)) {
            var5[var9].cx = (short)var10;
            var5[var9].cy = (short)var11;
            var8.addElement(new vdtt_hi(3000 + var9, var5[var9].cx, var5[var9].cy, var5[var9].cx + var5[var9].width, var5[var9].cy + var5[var9].height, var5[var9], var7));
         }
      }

      var2.addAll(var8);
      var1.addElement(this.a.a(1003, this));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (var1.b >= 3000 & var1.b < 4000) {
         int var4 = var1.b - 3000;
         this.H.a((vdtt_w)(new vdtt_lp(this.H, (vdtt_dz)this.b.get(var4))));
         vdtt_aa.gI().n();
      } else {
         switch(var1.b) {
         case 100:
            this.H.a((vdtt_w)(new vdtt_jq(this.H)));
            return;
         case 102:
            try {
               Message.c((byte)-87).send();
               return;
            } catch (Exception var5) {
            }
         }
      }

   }
}

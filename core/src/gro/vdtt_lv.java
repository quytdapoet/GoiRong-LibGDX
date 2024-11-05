package gro;

import java.util.Vector;

public final class vdtt_lv extends vdtt_ap {
   private vdtt_by a;
   private vdtt_by b;
   private int c;
   private int d;
   private vdtt_bd M;
   private String[] N;
   private int[] O;

   public final void w() {
      this.a.a("");
      this.b.a("");
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1001:
         this.k = a(Caption.cA, Caption.mc, this, this.width / 2 - 100, this.height / 2 - 75);
         return;
      case 1002:
         this.H.i();
         vdtt_lv var4 = this;
         Message var5 = null;
         boolean var6 = false;

         label97: {
            try {
               var6 = true;
               (var5 = Message.c((byte)-114)).writeShort(var4.O[var4.M.n.b]);
               var5.writeUTF(var4.a.i());
               var5.writeUTF(var4.b.i());
               var5.send();
               var6 = false;
               break label97;
            } catch (Exception var11) {
               var6 = false;
            } finally {
               if (var6 && var5 != null) {
                  var5.close();
               }

            }

            if (var5 == null) {
               return;
            }

            var5.close();
            break;
         }

         var5.close();
         break;
      case 1003:
         this.H.a((vdtt_w)(new vdtt_ki(this.H, this.N, this.O)));
         return;
      case 1004:
         GameSrc.gI();
         GameSrc.o(58);
      }

   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.cw, (byte)2, false);
      this.c = 68;
      this.d = 35;
      vdtt_dd.a(vdtt_dd.d, var1, Caption.zD[0], 15, this.d + 10, 0, -1);
      vdtt_dd.a(vdtt_dd.d, var1, Caption.zD[4], 15, this.d + 40, 0, -1);
      vdtt_dd.a(vdtt_dd.d, var1, Caption.zD[1], 15, this.d + 65, 0, -1);
      vdtt_dd.a(vdtt_dd.d, var1, Caption.zD[2], 15, this.d + 90, 0, -1);
      this.c = 10;
      this.d = 130;
      vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.zD[3], this.c + 7, this.d += 14, 0, -2560, -16777216);
      vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.lx, this.c + 7, this.d + 14, 0, -2560, -16777216);
      var1.f(-2560);
      var1.a(this.c + 7, this.d + 4, this.c + 7 + vdtt_dd.b(vdtt_dd.b, Caption.zD[3]), this.d + 4);
      var1.a(this.c + 7, this.d + 18, this.c + 7 + vdtt_dd.b(vdtt_dd.b, Caption.lx), this.d + 18);
      this.c = this.width - 38;
      this.d = 130;
      vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.cB, this.c + 7, this.d += 14, 0, -2560, -16777216);
      var1.f(-2560);
      var1.a(this.c + 7, this.d + 4, this.c + 7 + vdtt_dd.b(vdtt_dd.b, Caption.cB), this.d + 4);
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).remove(var1.size() - 1);
      var1.addElement(new vdtt_hi(1001, 10, 140, 60, 150, (vdtt_hp)null, this));
      var1.addElement(new vdtt_hi(1004, 10, 154, 60, 164, (vdtt_hp)null, this));
      var1.addElement(new vdtt_hi(1003, this.width - 38, 140, this.width - 10, 150, (vdtt_hp)null, this));
      return var1;
   }

   public final void a_() {
   }
}

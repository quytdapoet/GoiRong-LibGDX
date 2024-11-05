package gro;

import java.util.Vector;

public final class vdtt_la extends vdtt_ap {
   private vdtt_by b;
   private String[] c;
   public int a;

   public vdtt_la(MainScreen var1, String var2, int var3, int var4) {
      this.e = 2;
      this.H = var1;
      this.J = false;
      this.a(180, 120);
      this.b = this.a(20, 52, 120, "", this, 0, var3);
      this.a(this.b);
      this.c = vdtt_dd.c(vdtt_dd.d, var2, this.width - 20);
      this.a(Caption.bi, var4);
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);

      for(int var2 = 0; var2 < this.c.length; ++var2) {
         vdtt_dd.c(vdtt_dd.d, var1, this.c[var2], (super.width - 8) / 2, this.h() / 2 + var2 * 12 - this.c.length * 6, 2, -1, -16777216);
      }

   }

   public final void a_() {
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(new vdtt_hi(0, 0, 0, this.width, this.height, this.I, this));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      vdtt_la var4;
      Message var5;
      switch(var1.b) {
      case 100:
         var4 = this;

         try {
            (var5 = new Message((byte)-93)).writeUTF(var4.b.i());
            var5.send();
            var4.k();
            break;
         } catch (Exception var9) {
            return;
         }
      case 101:
         var4 = this;

         try {
            (var5 = new Message((byte)-92)).writeInt(var4.b.h());
            var5.send();
            var4.k();
            break;
         } catch (Exception var8) {
            return;
         }
      case 102:
         var4 = this;

         try {
            (var5 = Message.c((byte)-92)).writeUTF(var4.b.i());
            var5.send();
            var4.k();
            break;
         } catch (Exception var7) {
            return;
         }
      case 300:
         var4 = this;

         try {
            (var5 = new Message((byte)-33)).writeUTF(var4.b.i());
            var5.writeShort(var4.a);
            var5.send();
            return;
         } catch (Exception var10) {
         }
      }

   }
}

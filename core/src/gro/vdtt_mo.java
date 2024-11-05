package gro;

import java.util.Vector;

public final class vdtt_mo extends vdtt_ap {
   public int a = 0;
   public String[] b;
   private vdtt_hp c;

   public vdtt_mo(MainScreen var1, Message var2) {
      try {
         this.e = 2;
         this.H = var1;
         this.a(280, 160);
         this.a(Caption.eB, 1000);
         this.a = var2.readInt();
         this.b = vdtt_dd.c(vdtt_dd.d, Caption.ly, this.width - 35);
         this.c = new vdtt_hp((byte)1, 15, 14, this.width - 35, 112, 14, this.b.length);
      } catch (Exception var4) {
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.e(var1);
      this.a(var1, this.c);

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         if (this.c.b(var2)) {
            if (var2 == 0) {
               vdtt_dd.a(vdtt_dd.d, var1, Utlis.b(this.b[var2], Utlis.c(this.a)), 0, 5 + var2 * 14, 0, -1);
            } else {
               vdtt_dd.a(vdtt_dd.d, var1, this.b[var2], 0, 5 + var2 * 14, 0, -1);
            }
         }
      }

      this.a(var1);
   }

   public final void a_() {
      this.c.a();
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1000:
         try {
            Message.c((byte)-83).send();
            return;
         } catch (Exception var5) {
            Utlis.a(var5);
         }
      default:
      }
   }

   public final Vector g() {
      Vector var1;
      (var1 = new Vector()).addElement(this.c.a(1010, this));
      return var1;
   }
}

package gro;

import java.util.Vector;

public final class vdtt_bq extends vdtt_al {
   private vdtt_hp n;
   private vdtt_ir[] H;
   public int l;
   public int m;
   private long I;

   public vdtt_bq(int var1, int var2, vdtt_w var3, Mob var4) {
      this.a = var3;
      this.setXY(var1, var2);
      this.I = Utlis.a();
      this.a(var4);

      try {
         Message var5;
         (var5 = new Message((byte)13)).writeShort(var4.idEntity);
         var5.send();
      } catch (Exception var6) {
         Utlis.a(var6);
      }

   }

   public final void a(Mob var1) {
      Vector var2;
      (var2 = new Vector()).addElement("c#yellow" + var1.getMobTemplate().name);
      var2.addElement("c#white" + Caption.ck + ": " + Utlis.c(this.m / 10));
      var2.addElement("c#white" + Caption.yx[0] + ": " + Utlis.c(this.l));
      this.setSize(116, 50);
      Vector var3 = new Vector();

      int var4;
      for(var4 = 0; var4 < var2.size(); ++var4) {
         String var5 = String.valueOf(var2.elementAt(var4));
         int var6;
         Vector var7;
         if (var4 == 0) {
            var7 = vdtt_dd.a(vdtt_dd.e, var5, this.width - 10);

            for(var6 = 0; var6 < var7.size(); ++var6) {
               var3.add(new vdtt_ir(0, (String)var7.elementAt(var6)));
            }
         } else {
            var7 = vdtt_dd.a(vdtt_dd.d, var5, this.width - 10);

            for(var6 = 0; var6 < var7.size(); ++var6) {
               var3.add(new vdtt_ir(1, (String)var7.elementAt(var6)));
            }
         }
      }

      this.H = new vdtt_ir[var3.size()];

      for(var4 = 0; var4 < var3.size(); ++var4) {
         this.H[var4] = (vdtt_ir)var3.elementAt(var4);
      }

      this.n = new vdtt_hp((byte)1, 0, 5, this.width, this.height - 10, 13, this.H.length);
   }

   public final void b(Graphics var1) {
      this.e(var1);
      this.a(var1, this.n);

      for(int var2 = 0; var2 < this.H.length; ++var2) {
         if (this.H[var2].a == 0) {
            vdtt_dd.c(vdtt_dd.e, var1, this.H[var2].b, 6, 5 + var2 * this.n.h, 0, -1, -16777216);
         } else {
            vdtt_dd.c(vdtt_dd.d, var1, this.H[var2].b, 6, 5 + var2 * this.n.h, 0, -1, -16777216);
         }
      }

      this.a(var1);
   }

   public final void a_() {
      this.n.a();
      if (Utlis.a() - this.I >= 5000L) {
         this.a.b((vdtt_k)this);
      }

   }

   public final Vector g() {
      Vector var1;
      (var1 = new Vector()).addElement(new vdtt_hi(1001, this.n.cx, this.n.cy, this.n.cx + this.n.width, this.n.cy + this.n.height, this.n, this));
      var1.addElement(new vdtt_hi(1002, this.n.cx, this.n.cy - 5, this.n.cx + this.n.width, this.n.cy + this.n.height + 5, this.n, this));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      this.I = Utlis.a();
   }
}

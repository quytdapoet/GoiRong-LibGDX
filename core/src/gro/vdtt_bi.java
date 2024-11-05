package gro;

import java.util.Vector;

public final class vdtt_bi extends vdtt_al {
   private vdtt_hp l;
   private Effect m;
   private vdtt_ir[] n;
   private long H;
   private static Vector I;

   public vdtt_bi(int var1, int var2, vdtt_w var3, Effect var4) {
      this.a = var3;
      this.m = var4;
      this.setXY(var1, var2);
      this.H = Utlis.a();
      this.d();
   }

   private void d() {
      Vector var1 = new Vector();
      String var2 = "c#yellow" + this.m.getEffectTemplate().name;
      if (this.m.i) {
         var2 = var2 + Caption.wZ;
      }

      var1.addElement(var2);
      if (!I.contains(this.m.id) && this.m.e >= 0) {
         var1.addElement("c#white" + Caption.zf[0]);
         var1.addElement("c#white" + Caption.zf[1]);
      }

      if (this.m.getEffectTemplate().detail.length() > 0) {
         var1.addElement("c#white" + this.m.b());
      }

      for(int var3 = 0; var3 < this.m.g.size(); ++var3) {
         var1.addElement("c#white" + ((Effect)this.m.g.get(var3)).b());
      }

      this.setSize(150, 62);
      Vector var10 = new Vector();

      int var4;
      for(var4 = 0; var4 < var1.size(); ++var4) {
         String var5 = String.valueOf(var1.elementAt(var4));
         if (var4 == 0) {
            Vector var12 = vdtt_dd.a(vdtt_dd.e, var5, this.width - 20);

            for(int var13 = 0; var13 < var12.size(); ++var13) {
               var10.add(new vdtt_ir(0, (String)var12.elementAt(var13)));
            }
         } else {
            byte var6 = 1;
            if (!I.contains(this.m.id) && this.m.e >= 0) {
               if (var4 == 1) {
                  var6 = 2;
               } else if (var4 == 2) {
                  var6 = 3;
                  if (this.m.id == 118) {
                     continue;
                  }
               }
            }

            Vector var7 = vdtt_dd.a(vdtt_dd.d, var5, this.width - 20);

            for(int var8 = 0; var8 < var7.size(); ++var8) {
               var10.add(new vdtt_ir(var6, (String)var7.elementAt(var8)));
            }
         }
      }

      this.n = new vdtt_ir[var10.size()];

      for(var4 = 0; var4 < var10.size(); ++var4) {
         this.n[var4] = (vdtt_ir)var10.elementAt(var4);
      }

      if (this.n.length < 4) {
         this.setSize(150, 49);
      }

      this.l = new vdtt_hp((byte)1, 0, 5, this.width, this.height - 10, 13, this.n.length);
      if (this.m.getEffectTemplate().name.length() == 0) {
         try {
            Message var11;
            (var11 = new Message((byte)-67)).writeShort(this.m.id);
            var11.send();
            return;
         } catch (Exception var9) {
         }
      }

   }

   public final void b(Graphics var1) {
      this.e(var1);
      this.a(var1, this.l);

      for(int var2 = 0; var2 < this.n.length; ++var2) {
         if (this.n[var2].a == 0) {
            vdtt_dd.c(vdtt_dd.e, var1, this.n[var2].b, 6, 5 + var2 * this.l.h, 0, -1, -16777216);
         } else if (this.n[var2].a == 2) {
            vdtt_dd.c(vdtt_dd.d, var1, this.n[var2].b + " " + Utlis.i(this.m.e / 1000), 6, 5 + var2 * this.l.h, 0, -1, -16777216);
         } else if (this.n[var2].a == 3) {
            Effect var3;
            vdtt_dd.c(vdtt_dd.d, var1, this.n[var2].b + " " + Utlis.i(((var3 = this.m).e - (int)(Utlis.a() - var3.d)) / 1000), 6, 5 + var2 * this.l.h, 0, -1, -16777216);
         } else if (this.m.id == 113) {
            vdtt_dd.c(vdtt_dd.d, var1, this.m.b(), 6, 5 + var2 * this.l.h, 0, -1, -16777216);
         } else {
            vdtt_dd.c(vdtt_dd.d, var1, this.n[var2].b, 6, 5 + var2 * this.l.h, 0, -1, -16777216);
         }
      }

      this.a(var1);
   }

   public final void a_() {
      this.l.a();
      if (Utlis.a() - this.H >= 5000L) {
         this.a.b((vdtt_k)this);
      }

   }

   public final Vector g() {
      Vector var1;
      (var1 = new Vector()).addElement(new vdtt_hi(1001, this.l.cx, this.l.cy, this.l.cx + this.l.width, this.l.cy + this.l.height, this.l, this));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      this.H = Utlis.a();
   }

   public final void a(String var1, String var2) {
      this.m.getEffectTemplate().name = var1;
      this.m.getEffectTemplate().detail = var2;
      this.d();
   }

   static {
      (I = new Vector()).add(37);
      I.add(67);
      I.add(68);
      I.add(69);
      I.add(70);
      I.add(71);
      I.add(72);
   }
}

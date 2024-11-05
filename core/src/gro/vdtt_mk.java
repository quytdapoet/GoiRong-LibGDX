package gro;

import java.util.Vector;

public final class vdtt_mk extends vdtt_ap {
   public vdtt_iv[] a = new vdtt_iv[0];
   public vdtt_iv[] b = new vdtt_iv[0];
   private vdtt_in c;
   private vdtt_hp[][] d;
   private static int M;
   private vdtt_hj N;
   private Item O;
   private Vector P = new Vector();
   private int Q;

   public vdtt_mk(MainScreen var1) {
      this.H = var1;
      this.a(316, 213);
      this.J = false;
      this.c = new vdtt_in(new vdtt_hm(1001, Caption.AL), 4, this.f(), super.width - 8, 23, 76, this);
      this.w();
      this.f(M);
   }

   public final void w() {
      this.b = this.a;
      this.d = new vdtt_hp[2][];
      this.d[0] = new vdtt_hp[1];
      this.d[0][0] = new vdtt_hp((byte)1, 4, this.c.i() + 28, super.width - 8, 126, 18, this.b.length);
   }

   private void x() {
      if (this.N == null) {
         try {
            Message.c((byte)-55).send();
         } catch (Exception var2) {
            Utlis.a(var2);
         }
      }

   }

   public final void b(Message var1) {
      try {
         vdtt_hj var2;
         (var2 = new vdtt_hj()).a[0] = var1.reader.readUTF();
         var2.a[1] = var1.reader.readUTF();
         var2.b = var1.readLong();
         var2.c = var1.readLong();
         var2.d = new String[var1.readByte()];
         Vector var3 = new Vector();

         for(int var4 = 0; var4 < var2.d.length; ++var4) {
            var2.d[var4] = var1.readUTF().trim();
            Item var5;
            (var5 = new Item()).a(var1);
            if (var4 == 0) {
               var2.e.add(var2.d[var4]);
               var2.f.add(var3);
            } else if (!var2.e.contains(var2.d[var4])) {
               var2.e.add(var2.d[var4]);
               var3 = new Vector();
               var2.f.add(var3);
            }

            ((Vector)var2.f.get(var2.e.indexOf(var2.d[var4]))).add(var5);
         }

         this.N = var2;
         String[] var9 = Utlis.a(var2.a[1], "\\n");
         this.P.clear();
         String var10;
         if ((var10 = var2.a()).length() > 0) {
            this.P.add("c#yellow" + var10);
         }

         int var6;
         for(var6 = 0; var6 < var9.length; ++var6) {
            this.P.addAll(vdtt_dd.a(vdtt_dd.d, var9[var6], super.width - 8 - 35));
         }

         this.P.add("c#blue" + Caption.kh);
         this.Q = this.P.size();

         for(var6 = 0; var6 < var2.e.size(); ++var6) {
            this.P.add("c#cyan- " + (String)var2.e.get(var6));
            this.P.add("");
            this.P.add("");
         }

         vdtt_hp[] var7;
         (var7 = new vdtt_hp[1])[0] = new vdtt_hp((byte)1, 13, this.f() + 35, super.width - 8 - 18, 135, 15, this.P.size());
         this.d[1] = var7;
      } catch (Exception var8) {
      }

   }

   private void f(int var1) {
      this.c.a(var1);
      if (var1 == 0) {
         this.z();
      }

      this.x();
   }

   private void z() {
      try {
         Message var1;
         (var1 = new Message((byte)-54)).writeByte(this.c.h());
         var1.writeByte(0);
         var1.send();
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   public final void a_() {
      this.c.e();

      for(int var1 = 0; var1 < this.d.length; ++var1) {
         if (this.d[var1] != null) {
            for(int var2 = 0; var2 < this.d[var1].length; ++var2) {
               if (this.d[var1][var2] != null) {
                  this.d[var1][var2].a();
               }
            }
         }
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      this.c(var1, var2);
      switch(var1) {
      case 1002:
         this.w();
      default:
      }
   }

   public final void b(int var1, Object var2) {
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(this.c.f());
      switch(this.c.h()) {
      case 0:
         var1.addElement(this.d[0][0].a(1003, this));
         break;
      case 1:
         for(int var2 = 0; var2 < this.N.f.size(); ++var2) {
            for(int var3 = 0; var3 < ((Vector)this.N.f.get(var2)).size(); ++var3) {
               Item var4 = (Item)((Vector)this.N.f.get(var2)).get(var3);
               int var5 = this.d[this.c.h()][0].cx + 4 + var3 * 35;
               int var6 = this.d[this.c.h()][0].cy - this.d[this.c.h()][0].f + (this.Q + var2 * 3) * this.d[this.c.h()][0].h + 15;
               if (this.d[1][0].b(this.Q + var2 * 3 + 3)) {
                  vdtt_hi var7 = new vdtt_hi(6000, var5, var6, var5 + 28, var6 + 28, this.d[this.c.h()][0], this, var4);
                  var1.addElement(var7);
               }
            }
         }

         var1.addElement(this.d[1][0].a(1030, this));
      }

      return var1;
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.cK, (byte)2, this.J);
      this.c.a(var1);
      switch(this.c.h()) {
      case 0:
         Graphics var2 = var1;
         vdtt_mk var3 = this;
         this.b(var1, this.d[this.c.h()][0]);
         vdtt_dd.b(vdtt_dd.e, var1, Caption.cL, 20, -15, 2, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.e, var1, Caption.cM, 70, -15, 2, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.e, var1, Caption.pz, 130, -15, 2, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.e, var1, Caption.kJ, 195, -15, 2, -6488, -10275328);
         vdtt_dd.b(vdtt_dd.e, var1, Caption.kK, 260, -15, 2, -6488, -10275328);
         this.a(var1, this.d[this.c.h()][0]);

         for(int var4 = 0; var4 < var3.d[var3.c.h()][0].i; ++var4) {
            if (var3.d[var3.c.h()][0].b(var4)) {
               vdtt_iv var5 = var3.b[var4];
               vdtt_dd.b(vdtt_dd.d, var2, "" + (var4 + 1), 20, 8 + var4 * var3.d[var3.c.h()][0].h, 2, -3604601, -16777216);
               vdtt_dd.b(vdtt_dd.d, var2, var5.b, 70, 8 + var4 * var3.d[var3.c.h()][0].h, 2, -3604601, -16777216);
               vdtt_dd.b(vdtt_dd.d, var2, Utlis.c(var5.e), 130, 8 + var4 * var3.d[var3.c.h()][0].h, 2, -3604601, -16777216);
               vdtt_dd.b(vdtt_dd.d, var2, DataCenter.gI().dataNameChar[var5.f].name, 195, 8 + var4 * var3.d[var3.c.h()][0].h, 2, -3604601, -16777216);
               vdtt_dd.b(vdtt_dd.d, var2, var5.g, 260, 8 + var4 * var3.d[var3.c.h()][0].h, 2, -3604601, -16777216);
            }
         }

         var3.a(var2);
         var3.d[var3.c.h()][0].a(var2, var3);
         return;
      case 1:
         this.f(var1);
      default:
      }
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1001:
         if (var1.j.k >= 0) {
            M = var1.j.k;
            this.f(var1.j.k);
            return;
         }
         break;
      case 1003:
         if (var1.j.k >= 0) {
            this.a(this.b[var1.j.k].b, var1.j.k, var2, var3);
            return;
         }
         break;
      case 6000:
         this.O = (Item)var1.k;
         this.k = c(this, var1, this.O);
      }

   }

   private void f(Graphics var1) {
      try {
         this.a(var1, this.d[this.c.h()][0]);

         int var2;
         for(var2 = 0; var2 < this.d[this.c.h()][0].i; ++var2) {
            vdtt_dd.a(var1, (String)this.P.get(var2), 2, 6 + var2 * this.d[this.c.h()][0].h, 0, -1);
         }

         for(var2 = 0; var2 < this.N.f.size(); ++var2) {
            for(int var3 = 0; var3 < ((Vector)this.N.f.get(var2)).size(); ++var3) {
               Item var4 = (Item)((Vector)this.N.f.get(var2)).get(var3);
               b(var1, 4 + var3 * 35, (this.Q + var2 * 3) * this.d[this.c.h()][0].h + 15, var4, this.O != null && this.O.equals(var4));
            }
         }

         this.a(var1);
         this.d[this.c.h()][0].b(var1, this);
      } catch (Exception var5) {
      }

   }
}

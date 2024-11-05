package gro;

import java.util.Vector;

public final class vdtt_ng extends vdtt_ap {
   public Item[] a;
   public Item b;
   private vdtt_hq c;
   private vdtt_ay d;
   private vdtt_nh[] M = new vdtt_nh[]{new vdtt_nh(this, 0, 0), new vdtt_nh(this, 1, 0), new vdtt_nh(this, 2, 0), new vdtt_nh(this, 3, 0), new vdtt_nh(this, 4, 0), new vdtt_nh(this, 5, 0), new vdtt_nh(this, 5, 1), new vdtt_nh(this, 5, 2), new vdtt_nh(this, 5, 3), new vdtt_nh(this, 5, 4), new vdtt_nh(this, 5, 5), new vdtt_nh(this, 4, 5), new vdtt_nh(this, 3, 5), new vdtt_nh(this, 2, 5), new vdtt_nh(this, 1, 5), new vdtt_nh(this, 0, 5), new vdtt_nh(this, 0, 4), new vdtt_nh(this, 0, 3), new vdtt_nh(this, 0, 2), new vdtt_nh(this, 0, 1)};
   private int N;
   private int O;
   private int P = 32;
   private int Q = -1;
   private boolean R;
   private boolean S;
   private boolean T;
   private long U = 0L;
   private int V = 160;

   public vdtt_ng(MainScreen var1, Message var2) {
      try {
         this.H = var1;
         this.a(202, 230);
         this.J = false;
         this.a = new Item[var2.readShort()];

         for(int var3 = 0; var3 < this.a.length; ++var3) {
            Item var4;
            (var4 = new Item()).a(var2);
            var4.index = var3;
            this.a[var4.index] = var4;
         }

         this.N = 6;
         this.O = this.f() + 2;
         this.c = new vdtt_hq((byte)1, 6, this.f() + 2, 192, 192, 32, 6, 6);
         this.d = this.a(this.width / 2 - 30, this.c.cy + this.c.height - 32 - 55, Caption.ss, this, 100, 15);
         this.d.setSize(60, this.d.height);
         this.j();
         this.a(this.width - 14, -7, "", this, 1206, 6);
      } catch (Exception var5) {
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.sr, (byte)2, this.J);
      vdtt_y.a(var1, 61, 0, 36, 61, 130, (int)130);

      for(int var2 = 0; var2 < this.M.length; ++var2) {
         vdtt_nh var3 = this.M[var2];
         b(var1, this.N + var3.a * this.P, this.O + var3.b * this.P, this.a[var2], var2 == this.Q);
      }

      if (this.R || this.b != null) {
         int var4;
         Item var5;
         boolean var6;
         Graphics var7;
         int var8;
         label28: {
            if (this.R) {
               var7 = var1;
               var8 = this.width / 2 - 14;
               var4 = this.height / 2 - 14;
               var5 = this.b;
            } else {
               var7 = var1;
               var8 = this.width / 2 - 14;
               var4 = this.height / 2 - 14;
               var5 = this.b;
               if (this.Q == -2) {
                  var6 = true;
                  break label28;
               }
            }

            var6 = false;
         }

         b(var7, var8, var4, var5, var6);
         if (DataCenter.gI().h % 10 > 5 && !this.R) {
            var1.c(-2560);
            vdtt_cz.a(var1, 40, 0, this.width / 2 - 15, this.height / 2 - 15, 0);
            var1.f();
         }
      }

      vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, "- " + Caption.aO + " " + Utlis.c(Char.gI().f(this.V)) + " " + DataCenter.gI().itemTemplate[this.V].name, this.c.cx + 35, this.c.cy + 138, 0, -6488, -10275328);
      vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, "- " + Utlis.b(Caption.st, DataCenter.gI().itemTemplate[this.V].name), this.c.cx + 35, this.c.cy + 150, 0, -6488, -10275328);
   }

   public final void a_() {
      if (this.T) {
         this.R = false;
         this.S = false;
         this.b = null;
      } else {
         if (this.R && this.S && Utlis.a() > this.U) {
            this.S = false;
            w();
         }

         if ((this.R || this.b != null) && this.R && DataCenter.gI().h % 2 == 0) {
            Vector var1 = new Vector();

            for(int var2 = 0; var2 < this.a.length; ++var2) {
               var1.add(this.a[var2]);
            }

            Item var5 = (Item)var1.lastElement();
            var1.remove(var5);
            var1.insertElementAt(var5, 0);
            Item[] var3 = new Item[this.a.length];

            for(int var4 = 0; var4 < this.a.length; ++var4) {
               var3[var4] = (Item)var1.get(var4);
            }

            this.a = var3;
            this.b = this.a[Utlis.a(this.a.length)];
         }
      }

   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.Q = -2;
      if (var1.b >= 3000 && var1.b < 4000) {
         this.Q = var1.b - 3000;
         if (!this.R && this.Q >= 0) {
            this.k = b(this, var1, this.a[this.Q]);
            vdtt_aa.gI().n();
         }
      } else {
         switch(var1.b) {
         case 100:
            int var4 = Utlis.a(this.a.length);
            if (Char.gI().D() > 0 && Char.gI().f(this.V) >= 40) {
               this.R = true;
               this.S = true;
               this.U = Utlis.a() + (long)Utlis.a(4000, 8000);
               boolean var5 = true;
               this.d.a(true);
               return;
            }

            w();
            break;
         case 1000:
            if (!this.R && this.b != null) {
               this.k = c(this, var1, this.b);
               vdtt_aa.gI().n();
               return;
            }
            break;
         case 1206:
            if (!this.R) {
               this.k();
            }
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();

      int var2;
      for(var2 = 0; var2 < this.M.length; ++var2) {
         vdtt_nh var3 = this.M[var2];
         var1.add(new vdtt_hi(3000 + var2, this.N + var3.a * this.P, this.O + var3.b * this.P, this.N + var3.a * this.P + this.P - 3, this.O + var3.b * this.P + this.P - 3, (vdtt_hp)null, this));
      }

      var2 = this.width / 2 - 14;
      int var4 = this.height / 2 - 14;
      var1.add(new vdtt_hi(1000, var2, var4, var2 + 28, var4 + 28, (vdtt_hp)null, this));
      return var1;
   }

   private static void w() {
      try {
         Message.c((byte)-35).send();
      } catch (Exception var1) {
         Utlis.a(var1);
      }

   }
}

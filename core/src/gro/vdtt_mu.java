package gro;

import java.util.Vector;

public final class vdtt_mu extends vdtt_jo {
   private vdtt_hq W;
   private vdtt_hq X;
   private vdtt_ay Y;
   private vdtt_ay Z;
   private vdtt_ay al;
   public int N = 0;
   public int O = 0;
   public int P = 0;
   public int Q = 0;
   private int am = 32;
   public Item[] R = new Item[12];
   public Item[] S = new Item[12];
   public String T = "";
   public long U = Utlis.a() + 6000L;
   public int V;

   public vdtt_mu(MainScreen var1, String var2) {
      super(var1, new String[]{Caption.bZ});
      this.T = var2;
      this.Y = this.a(this.width / 2 - 29, this.height - 31, Caption.cd, this, 1001, -8);
      this.Z = this.a(this.af.cx - 17, this.af.cy, Caption.ca, this, 1002, -8);
      this.W = new vdtt_hq((byte)1, 13, this.f() + 22, this.am * 4, this.am * 3, this.am, Utlis.c(this.R.length, 4), 4);
      this.X = new vdtt_hq((byte)1, this.width + 3 - 13 - 4 * this.am, this.f() + 22, this.am * 4, this.am * 3, this.am, Utlis.c(this.S.length, 4), 4);
      this.al = this.a(this.W.cx + this.W.width - 19, this.W.cy + this.W.height + 7, "", this, 1002, 52);
      this.a(this.al, 0);
      this.a(this.Y, 0);
      this.a(this.Z, this.w());
      this.f(0);
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (super.a.b != 0) {
         if (super.a.b == this.w()) {
            switch(var1.b) {
            case 1002:
               this.H.a((vdtt_w)(new vdtt_kz(this.H, this)));
            }
         }

      } else {
         switch(var1.b) {
         case 1001:
            vdtt_mu var4 = this;

            try {
               if (var4.N == 0) {
                  var4.N = 1;
                  Vector var9 = new Vector();

                  int var6;
                  for(var6 = 0; var6 < var4.R.length; ++var6) {
                     if (var4.R[var6] != null) {
                        var9.add(var4.R[var6]);
                     }
                  }

                  Message var7;
                  (var7 = new Message((byte)82)).writeInt(var4.P);
                  var7.writeByte(var9.size());

                  for(var6 = 0; var6 < var9.size(); ++var6) {
                     var7.writeShort(((Item)var9.elementAt(var6)).index);
                  }

                  var7.send();
                  if (var4.N == var4.O) {
                     var4.U = Utlis.a() + 5999L;
                  }

                  return;
               }

               if (var4.N == 1 && var4.O > 0 && var4.U < Utlis.a() + 999L) {
                  var4.N = 2;
                  (new Message((byte)81)).send();
               }
               break;
            } catch (Exception var8) {
               Utlis.a(var8);
               return;
            }
         case 1002:
            if (this.N == 0 && this.P > 0) {
               Char var5 = Char.gI();
               var5.bac += this.P;
               this.P = 0;
            }

            return;
         case 5001:
            this.V = 1;
            this.k = a(var1, this, this.R[var1.j.k]);
            return;
         case 5002:
            this.V = 2;
            this.k = a(var1, this, this.S[var1.j.k]);
         }

      }
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && !var1[var2].isLock) {
            this.aj.add(var1[var2]);
         }
      }

   }

   public final void f(int var1) {
      super.f(var1);
      this.b(this.Z);
      if (var1 == this.w()) {
         if (this.N == 0) {
            this.a(this.Z);
         }

         this.b(this.af);
         this.b(this.ag);
      }

   }

   public final void d() {
      super.d();

      for(int var1 = 0; var1 < this.R.length; ++var1) {
         if (this.R[var1] != null) {
            int var2 = this.R[var1].index;
            Char.gI().arrItemBag[var2] = this.R[var1];
            this.R[var1] = null;
         }
      }

      try {
         (new Message((byte)83)).send();
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      super.b(var1);
      if (super.a.b == 0) {
         this.a(var1, this.W);

         int var2;
         int var3;
         for(var2 = 0; var2 < this.W.i; ++var2) {
            for(var3 = 0; var3 < this.W.O; ++var3) {
               b(var1, var3 * this.W.h, var2 * this.W.h, this.R[var2 * this.W.O + var3], var2 * this.W.O + var3 == this.W.k);
               if (this.N > 0) {
                  vdtt_y.a(var1, -13, 0, var3 * this.W.h + 2, var2 * this.W.h + 2, 25, (int)25);
               }
            }
         }

         this.a(var1);
         this.a(var1, this.X);

         for(var2 = 0; var2 < this.X.i; ++var2) {
            for(var3 = 0; var3 < this.X.O; ++var3) {
               b(var1, var3 * this.X.h, var2 * this.X.h, this.S[var2 * this.X.O + var3], var2 * this.X.O + var3 == this.X.k);
               if (this.O > 0) {
                  vdtt_y.a(var1, -13, 0, var3 * this.X.h + 2, var2 * this.X.h + 2, 25, (int)25);
               }
            }
         }

         this.a(var1);
         short var4 = this.W.cx;
         var3 = this.W.cy + this.W.height + 5;
         int var5 = var4 + this.W.width / 2;
         int var6 = var3 - this.W.height - 15;
         vdtt_dd.b(vdtt_dd.d, var1, Char.gI().name, var5, var6, 2, -1, -16777216);
         this.a(var1, var4, var3, this.W.width - 3, 18, 46, 22, 23, 1, 1, 180);
         a(var1, var4 + 2, var3 + 9, "", (byte)0);

         int var7;
         for(var7 = 0; var7 < 3; ++var7) {
            vdtt_cz.a(var1, 10, 0, var4 + 24 + var7 * 30, var3 + 44, 6);
            if (this.N >= var7) {
               vdtt_cz.a(var1, 11, 0, var4 + 28 + var7 * 30, var3 + 44, 6);
            }
         }

         vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(this.P), var4 + 30, var3 + 9, 20, -3089954, -16777216);
         if (this.P > 0) {
            vdtt_dd.b(vdtt_dd.d, var1, Caption.ho + " 1%", var4 + 2, var3 + 27, 0, -3089954, -16777216);
            a(var1, var4 + 2, var3 + 27, Caption.ho + " 1%", (byte)0);
         }

         var4 = this.X.cx;
         var3 = this.X.cy + this.X.height + 5;
         vdtt_dd.b(vdtt_dd.d, var1, this.T, var4 + this.X.width / 2, var3 - this.X.height - 15, 2, -1, -16777216);
         this.a(var1, var4, var3, this.X.width - 3, 18, 46, 22, 23, 1, 1, 180);
         a(var1, var4 + 2, var3 + 9, "", (byte)0);

         for(var7 = 0; var7 < 3; ++var7) {
            vdtt_cz.a(var1, 10, 0, var4 + 24 + var7 * 30, var3 + 44, 6);
            if (this.O >= var7) {
               vdtt_cz.a(var1, 11, 0, var4 + 28 + var7 * 30, var3 + 44, 6);
            }
         }

         vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(this.Q), var4 + 30, var3 + 9, 20, -3089954, -16777216);
         if (this.Q > 0) {
            vdtt_dd.b(vdtt_dd.d, var1, Caption.ho + " 1%", var4 + 2, var3 + 27, 0, -3089954, -16777216);
            a(var1, var4 + 2, var3 + 27, Caption.ho + " 1%", (byte)0);
         }
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         if (this.N > 0) {
            this.b(this.al);
            this.b(this.Z);
         }

         this.W.a();
         this.X.a();
      } else {
         this.B();
      }

      if (this.N > 0 && this.O > 0) {
         long var1 = Utlis.a();
         String var3;
         if (this.U > var1 + 1000L) {
            vdtt_ay var4 = this.Y;
            var3 = Utlis.b(Caption.ce, "" + (this.U - var1) / 1000L);
            var4.l = var3;
            this.Y.a(true);
         } else {
            var3 = Caption.bi;
            this.Y.l = var3;
            this.Y.a(false);
         }
      } else if (this.N > 0) {
         this.Y.a(true);
      }

      if (this.N >= 2) {
         this.Y.c = true;
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         var1.addElement(this.W.a(5001, this));
         var1.addElement(this.X.a(5002, this));
      }

      return var1;
   }

   public final int C() {
      return super.a.b;
   }
}

package gro;

import java.util.Vector;

public final class vdtt_jw extends vdtt_jx {
   private vdtt_hq P;
   private vdtt_ay Q;
   public Item[] N = new Item[16];
   public byte O;

   public vdtt_jw(MainScreen var1, String[] var2, byte var3) {
      super(var1, var2);
      this.O = var3;
      this.Q = this.a(this.width / 2 - 35, this.height - 33, Caption.bi, this, 5002, -8);
      this.a(this.Q, 0);
      this.P = new vdtt_hq((byte)1, 7, this.f() + 3, 128, 128, 32, Utlis.c(this.N.length, 4), 4);
   }

   public final void a(Item[] var1) {
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (super.a.b == this.w() && var1.b == 0) {
         this.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         switch(var1.b) {
         case 5001:
            try {
               this.k = a(var1, this, this.N[var1.j.k]);
               return;
            } catch (Exception var7) {
               return;
            }
         case 5002:
            vdtt_jw var4 = this;

            try {
               Message var5 = null;
               if (var4.O == 78) {
                  var5 = new Message((byte)-20);
               } else if (var4.O == 106) {
                  var5 = new Message((byte)-34);
               }

               var3 = 0;

               int var6;
               for(var6 = 0; var6 < var4.N.length; ++var6) {
                  if (var4.N[var6] != null) {
                     ++var3;
                  }
               }

               var5.writeByte(var3);

               for(var6 = 0; var6 < var4.N.length; ++var6) {
                  if (var4.N[var6] != null) {
                     var5.writeByte(var4.N[var6].w);
                     var5.writeShort(var4.N[var6].index);
                  }
               }

               var5.send();
               return;
            } catch (Exception var8) {
               Utlis.a(var8);
            }
         }
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      super.b(var1);
      if (super.a.b == 0) {
         this.a(var1, this.P);

         int var2;
         int var3;
         for(var2 = 0; var2 < this.P.i; ++var2) {
            for(var3 = 0; var3 < this.P.O; ++var3) {
               if (this.P.b(var2)) {
                  b(var1, var3 * this.P.h, var2 * this.P.h, this.N[var2 * this.P.O + var3], var2 * this.P.O + var3 == this.P.k);
               }
            }
         }

         this.a(var1);
         this.a(var1, this.cx + 4, this.cy + this.f());
         var2 = 11;
         if (this.O == 78) {
            var3 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;

            for(int var7 = 0; var7 < this.N.length; ++var7) {
               if (this.N[var7] != null) {
                  if (this.N[var7].Q()) {
                     var3 += 400;
                  }

                  if (this.N[var7].P()) {
                     var4 += 400;
                  }

                  if (this.N[var7].R()) {
                     var5 += 400;
                  }

                  if (this.N[var7].S()) {
                     var6 += 400;
                  }
               }
            }

            vdtt_dd.b(vdtt_dd.d, var1, Caption.lO, this.P.width + 10, 11, 0, -1, -16777216);
            String var8;
            int var9;
            vdtt_dd var10;
            if (var3 > 0) {
               var10 = vdtt_dd.d;
               var8 = "- " + Utlis.c(var3) + " " + DataCenter.gI().itemTemplate[353].name + " " + Caption.pS;
               var9 = this.P.width + 10;
               var2 += 15;
               vdtt_dd.b(var10, var1, var8, var9, 26, 0, -1, -16777216);
            }

            if (var4 > 0) {
               var10 = vdtt_dd.d;
               var8 = "- " + Utlis.c(var4) + " " + DataCenter.gI().itemTemplate[565].name + " " + Caption.pS;
               var9 = this.P.width + 10;
               var2 += 15;
               vdtt_dd.b(var10, var1, var8, var9, var2, 0, -1, -16777216);
            }

            if (var5 > 0) {
               var10 = vdtt_dd.d;
               var8 = "- " + Utlis.c(var5) + " " + DataCenter.gI().itemTemplate[563].name + " " + Caption.pS;
               var9 = this.P.width + 10;
               var2 += 15;
               vdtt_dd.b(var10, var1, var8, var9, var2, 0, -1, -16777216);
            }

            if (var6 > 0) {
               var10 = vdtt_dd.d;
               var8 = "- " + Utlis.c(var6) + " " + DataCenter.gI().itemTemplate[567].name + " " + Caption.pS;
               var9 = this.P.width + 10;
               var2 += 15;
               vdtt_dd.b(var10, var1, var8, var9, var2, 0, -1, -16777216);
            }

            return;
         }

         if (this.O == 106) {
            vdtt_dd.b(vdtt_dd.d, var1, Caption.si, this.P.width + 10, 11, 0, -1, -16777216);
         }
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         this.P.a();
      } else {
         this.B();
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         var1.addElement(this.P.a(5001, this));
      }

      return var1;
   }

   public final void d() {
      super.d();

      for(int var1 = 0; var1 < this.N.length; ++var1) {
         if (this.N[var1] != null) {
            Char.gI().i(this.N[var1].w)[this.N[var1].index] = this.N[var1];
            this.N[var1] = null;
         }
      }

   }
}

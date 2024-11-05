package gro;

import java.util.Vector;

public final class vdtt_nf extends vdtt_ap {
   public Vector a = new Vector();
   private vdtt_in b;
   private vdtt_hp c;
   private int d;
   private long M;
   private String N;
   private int O;

   public vdtt_nf(MainScreen var1, Message var2) {
      try {
         this.H = var1;
         this.a(316, 213);
         this.J = false;
         this.M = Utlis.a();
         this.d = var2.readInt();
         this.N = var2.readUTF();
         byte var3 = var2.readByte();

         for(int var4 = 0; var4 < var3; ++var4) {
            vdtt_fz var5;
            (var5 = new vdtt_fz()).a = var2.readUTF();
            var5.b = var2.readUTF();
            var5.e = var2.readByte();
            this.a.add(var5);
         }

         this.b = new vdtt_in(new vdtt_hm(1001, new String[]{this.N}), this);
         this.c = new vdtt_hp((byte)1, 4, this.b.i() + 28, super.width - 8, 108, 18, this.a.size());
         boolean var7 = false;
         this.b.a(0);
      } catch (Exception var6) {
      }

   }

   public final void a_() {
      this.b.e();
      this.c.a();
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      vdtt_nf var4;
      vdtt_hm var5;
      vdtt_fz var6;
      String var7;
      switch(var1) {
      case 1002:
         return;
      case 2002:
         var5 = (vdtt_hm)var2;
         var4 = this;

         try {
            var6 = (vdtt_fz)var4.a.get(var5.a);
            var7 = "";
            if (var4.O >= 70 && var4.O <= 150) {
               var7 = var6.a;
            } else if (var4.O >= 180 && var4.O <= 260) {
               var7 = var6.b;
            }

            GameSrc.gI().h(var7);
            break;
         } catch (Exception var11) {
            return;
         }
      case 2003:
         var5 = (vdtt_hm)var2;
         var4 = this;

         try {
            var6 = (vdtt_fz)var4.a.get(var5.a);
            var7 = "";
            if (var4.O >= 70 && var4.O <= 150) {
               var7 = var6.a;
            } else if (var4.O >= 180 && var4.O <= 260) {
               var7 = var6.b;
            }

            GameSrc.gI();
            GameSrc.g(var7);
            break;
         } catch (Exception var10) {
            return;
         }
      case 2004:
         var5 = (vdtt_hm)var2;
         var4 = this;

         try {
            var6 = (vdtt_fz)var4.a.get(var5.a);
            var7 = "";
            if (var4.O >= 70 && var4.O <= 150) {
               var7 = var6.a;
            } else if (var4.O >= 180 && var4.O <= 260) {
               var7 = var6.b;
            }

            vdtt_ba.J = var7;
            vdtt_kb var13 = new vdtt_kb(GameSrc.gI(), 5);
            GameSrc.gI().a((String)var7, (vdtt_ka)var13);
            break;
         } catch (Exception var9) {
            return;
         }
      case 2005:
         var1 = ((vdtt_hm)var2).a;

         try {
            if (var1 == GameSrc.gI().zoneID) {
               return;
            }

            GameSrc.d = true;
            Message var8;
            (var8 = new Message((byte)-7)).writeByte(var1);
            var8.send();
            return;
         } catch (Exception var12) {
            Utlis.a(var12);
         }
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final Vector g() {
      Vector var1;
      (var1 = super.g()).addElement(this.b.f());
      var1.addElement(this.c.a(1003, this));
      return var1;
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.cK, (byte)2, this.J);
      this.b.a(var1);
      this.b(var1, this.c);
      this.a(var1, 8, -24, this.c.width - 16, 21, -11, 55, 56);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.lo, 40, -15, 2, -10831436, -16777216);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.kD, 110, -15, 2, -10831436, -16777216);
      vdtt_dd.b(vdtt_dd.e, var1, Caption.kD, 210, -15, 2, -10831436, -16777216);
      this.a(var1, this.c);

      int var2;
      for(var2 = 0; var2 < this.c.i; ++var2) {
         if (this.c.b(var2)) {
            vdtt_fz var3 = (vdtt_fz)this.a.get(var2);
            if (var2 == this.c.k) {
               vdtt_cz.a(var1, 3, var2 * this.c.h, this.c.width - 6, this.c.h);
            }

            vdtt_dd.b(vdtt_dd.d, var1, "" + (var2 + 1), 40, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, var3.a, 110, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, var3.b, 210, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            if (var3.e == 1) {
               vdtt_dd.b(vdtt_dd.d, var1, Caption.lp, 160, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            } else if (var3.e == 2) {
               vdtt_dd.b(vdtt_dd.d, var1, Caption.lq, 160, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            } else {
               vdtt_dd.b(vdtt_dd.d, var1, "VS", 160, 8 + var2 * this.c.h, 2, -3604601, -16777216);
            }
         }
      }

      this.a(var1);
      var2 = this.d - (int)((Utlis.a() - this.M) / 1000L);
      vdtt_dd.b(vdtt_dd.d, var1, Caption.lr + this.N + Caption.ls + Utlis.g(var2), this.width / 2, this.height - 18, 2, -1, -16777216);
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 1001:
         return;
      case 1003:
         if (var1.j.k >= 0) {
            int var4 = var3;
            var3 = var2;
            var2 = var1.j.k;
            this.O = var3;
            if (var3 >= 70 && var3 <= 150 || var3 >= 180 && var3 <= 260) {
               Vector var5;
               (var5 = new Vector()).addElement(new vdtt_ir(2002, Caption.cR));
               var5.addElement(new vdtt_ir(2003, Caption.cS));
               var5.addElement(new vdtt_ir(2004, Caption.cT));
               var5.addElement(new vdtt_ir(2005, Caption.pM));
               if (var5.size() > 0) {
                  String[] var6 = new String[var5.size()];
                  short[] var7 = new short[var5.size()];

                  for(int var8 = 0; var8 < var5.size(); ++var8) {
                     vdtt_ir var9 = (vdtt_ir)var5.elementAt(var8);
                     var6[var8] = var9.b;
                     var7[var8] = (short)var9.a;
                  }

                  this.k = a(this, var3 + 25, var4, new vdtt_hm(var2, var7, var6));
               }
            }
         }
      default:
      }
   }
}

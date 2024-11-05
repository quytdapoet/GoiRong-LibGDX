package gro;

import java.util.Vector;

public class vdtt_jo extends vdtt_ao {
   public Item[] aa;
   public Item[] ab;
   public int ac;
   protected vdtt_hp[] ad = new vdtt_hp[3];
   protected vdtt_hq[] ae = new vdtt_hq[1];
   private int N;
   public vdtt_ay af;
   public vdtt_ay ag;
   public vdtt_bb ah;
   public Item[] ai;
   private String[] O;
   public Vector aj = new Vector();
   public boolean ak;

   public vdtt_jo(MainScreen var1, String[] var2) {
      super(var1);
      this.O = var2;

      int var3;
      try {
         int var4 = 0;

         for(var3 = 0; var3 < Char.gI().arrItemBag.length; ++var3) {
            if (Char.gI().arrItemBag[var3] != null) {
               ++var4;
               var4 += Char.gI().arrItemBag[var3].strData.length();
            }
         }

         for(var3 = 0; var3 < Char.gI().arrItemBody.length; ++var3) {
            if (Char.gI().arrItemBody[var3] != null) {
               ++var4;
               var4 += Char.gI().arrItemBody[var3].strData.length();
            }
         }

         for(var3 = 0; var3 < Char.gI().arrItemBody2.length; ++var3) {
            if (Char.gI().arrItemBody2[var3] != null) {
               ++var4;
               var4 += Char.gI().arrItemBody2[var3].strData.length();
            }
         }
      } catch (Exception var7) {
      }

      try {
         this.ai = Char.gI().arrItemBag;
         this.J = false;
         this.a(299);
         vdtt_hm var8 = new vdtt_hm(-1000);
         if (var2 == null) {
            var8.c = new String[]{Caption.y};
         } else if (this.C()) {
            var8.c = var2;
         } else {
            var8.c = new String[var2.length + 1];

            for(var3 = 0; var3 < var2.length; ++var3) {
               var8.c[var3] = var2[var3];
            }

            var8.c[var2.length] = Caption.y;
         }

         if (var8.c.length <= 3) {
            this.a(var8, 170, 92, var8.c.length);
         } else {
            this.a(var8, 170, 66, var8.c.length);
         }

         if (!this.C()) {
            if (this.af == null) {
               this.af = this.a(this.width - 52, this.height - 28, Caption.C, this, 0, -8);
               this.af.setSize(45, this.af.height);
               this.a(this.af, this.w());
            }

            if (this.ah == null) {
               this.ah = this.a(85, this.af.cy + 3, Caption.xE, 1093);
               this.a(this.ah, this.w());
            }

            if (this.ag == null) {
               this.ag = this.a(this.width - 100, this.height - 28, Caption.qv, this, 5000, -28);
               this.ag.setSize(45, this.af.height);
               this.a(this.ag, this.w());
            }

            this.A();
            this.ad[0] = new vdtt_hp((byte)0, 103, this.f() + 3, 93, 18, 93, 1);
            this.ad[1] = new vdtt_hp((byte)0, 7, this.f() + 3, 93, 18, 93, 1);
            this.ad[2] = new vdtt_hp((byte)0, 199, this.f() + 3, 93, 18, 93, 1);
            if (!(this instanceof vdtt_ll) && !(this instanceof vdtt_jm)) {
               this.f(var8.b);
            }
         }

         if (DataCenter.k()) {
            this.ag.b(true);
            this.af.b(true);
            boolean var5 = true;
            this.ah.d = var5;
            this.ad[0] = new vdtt_hp((byte)0, 12, this.f() + 8, 78, 18, 78, 1);
            this.ad[1] = new vdtt_hp((byte)0, 12, this.f() + 16 + 18, 78, 18, 78, 1);
            this.ad[2] = new vdtt_hp((byte)0, 12, this.f() + 24 + 36, 78, 18, 78, 1);
         }
      } catch (Exception var6) {
      }

   }

   private boolean C() {
      return this instanceof vdtt_me && DataCenter.k();
   }

   public int z() {
      return this.N;
   }

   public final void A() {
      this.B();
      this.D();
   }

   public final void B() {
      this.aj.clear();
      this.ak = false;
      this.a(Char.gI().arrItemBag);
      if (!this.ak) {
         this.ai = new Item[Char.gI().arrItemBag.length];

         for(int var1 = 0; var1 < this.aj.size(); ++var1) {
            this.ai[var1] = (Item)this.aj.get(var1);
         }
      }

      this.a(Char.gI().arrItemBody);
      this.a(Char.gI().arrItemBody2);
      this.a(Char.gI().aT);
   }

   public void a(Item[] var1) {
      if (var1.equals(Char.gI().arrItemBag)) {
         this.ai = var1;
         this.ak = true;
      }

   }

   private void D() {
      if (!DataCenter.k()) {
         this.ae[0] = new vdtt_hq((byte)1, 7, this.f() + 24, 288, 160, 32, Utlis.c(this.ai.length, 9), 9);
      } else {
         this.ae[0] = new vdtt_hq((byte)1, 97, this.f() + 8, 192, 192, 32, Utlis.c(this.ai.length, 6), 6);
      }

   }

   public void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      if (super.a.b == this.w()) {
         switch(var1.b) {
         case 0:
            GameSrc.gI();
            GameSrc.n(0);
            return;
         case 5000:
            GameSrc.gI();
            GameSrc.o(97);
            return;
         case 5001:
            this.N = 0;
            this.a(var1.j, var1.j.k);
            if (var1.j.k >= 0 && this.ai.length > var1.j.k) {
               this.k = a(var1, this, this.ai[var1.j.k]);
               return;
            }
            break;
         case 5002:
            this.N = 1;
            this.a(var1.j, var1.j.k);
            if (var1.j.k >= 0) {
               this.k = a(var1, this, Char.gI().arrItemExtra[var1.j.k]);
               return;
            }
            break;
         case 5003:
            this.a(var1.j, var1.j.k);
            if (var1.j.k >= 0) {
               this.k = b(Caption.yK[0], this, var1.j.cx + 30, var1.j.cy, 30);
            }

            this.k.width = 60;
            return;
         case 5004:
            this.a(var1.j, var1.j.k);
            this.k = b("c#yellow" + Caption.yR[0], this, var1.j.cx + 30, var1.j.cy, 30);
            this.k.width = 60;
            return;
         case 5005:
            this.a(var1.j, var1.j.k);
            this.k = b(Caption.yK[1], this, var1.j.cx + 30, var1.j.cy, 30);
            this.k.width = 60;
            return;
         case 5006:
            this.a(var1.j, var1.j.k);
            this.k = b("c#yellow" + Caption.yR[1], this, var1.j.cx + 30, var1.j.cy, 30);
            this.k.width = 60;
         }
      }

   }

   public void b(int var1, Object var2, vdtt_x var3) {
      try {
         if (var1 >= 30000) {
            vdtt_hm var4 = (vdtt_hm)var2;
            var1 -= 30000;
            Message var5;
            (var5 = new Message((byte)-25)).writeShort(var4.a);
            var5.writeByte(var1);
            var5.writeByte(var4.e);
            var5.send();
            if (Char.gI().arrItemBag[var4.a] != null && Char.gI().arrItemBag[var4.a].af()) {
               Char.gI().S();
               GameSrc.gI().pointMoveMap = null;
            }
         }
      } catch (Exception var6) {
         Utlis.a(var6);
      }

   }

   public void b(int var1, Object var2) {
   }

   public void b(Graphics var1) {
      Vector var2;
      Vector var3;
      int var4;
      if (DataCenter.k() && !this.C()) {
         Graphics var5 = var1;
         vdtt_jo var6 = this;
         this.a(var1, this.cx, this.cy, this.width, this.height, Caption.aZ, (byte)2, this.J);
         if (super.a.b == this.w()) {
            int var7 = var1.e;
            int var8 = var1.f;
            this.a(var1, this.ae[0]);
            var2 = new Vector();
            Vector var9 = new Vector();
            var3 = new Vector();
            Vector var10 = new Vector();

            int var11;
            int var12;
            Item var13;
            for(var11 = 0; var11 < var6.ae[0].i; ++var11) {
               for(var12 = 0; var12 < var6.ae[0].O; ++var12) {
                  var4 = var11 * var6.ae[0].O + var12;
                  if ((var13 = var6.ai[var4]) != null) {
                     var2.add(var13);
                  }

                  Item var14;
                  if ((var14 = Char.gI().arrItemBag[var4]) != null) {
                     var9.add(var14);
                  } else {
                     var3.add(var14);
                  }

                  if (var6.ae[0].b(var11)) {
                     if (var13 != null && var13.v != null) {
                        if (var13.v.q()) {
                           var13.v = null;
                        } else {
                           var13.v.n();
                           var13.v.setXY(var12 * var6.ae[0].h, var11 * var6.ae[0].h);
                           var10.add(var13.v);
                        }
                     }

                     b(var5, var12 * var6.ae[0].h, var11 * var6.ae[0].h, var13, var4 == var6.ae[0].k);
                     if (var4 >= Char.gI().ac) {
                        vdtt_y.a(var5, -23, 0, var12 * var6.ae[0].h + 1, var11 * var6.ae[0].h + 1, 27, (int)27);
                     }
                  }
               }
            }

            if (var9.size() != var2.size()) {
               var9.addAll(var3);
            }

            var9.removeAll(var2);

            for(var11 = 0; var11 < var6.ae[0].i; ++var11) {
               for(var12 = 0; var12 < var6.ae[0].O; ++var12) {
                  var4 = var11 * var6.ae[0].O + var12;
                  if (var6.ai[var4] == null && var9.size() > 0) {
                     var13 = (Item)var9.remove(0);
                     if (var6.ae[0].b(var11)) {
                        if (var13 != null && var13.v != null) {
                           if (var13.v.q()) {
                              var13.v = null;
                           } else {
                              var13.v.n();
                              var13.v.setXY(var12 * var6.ae[0].h, var11 * var6.ae[0].h);
                              var10.add(var13.v);
                           }
                        }

                        b(var5, var12 * var6.ae[0].h, var11 * var6.ae[0].h, var13, var4 == var6.ae[0].k);
                        vdtt_y.a(var5, -23, 0, var12 * var6.ae[0].h + 1, var11 * var6.ae[0].h + 1, 27, (int)27);
                     }
                  }
               }
            }

            for(var11 = 0; var11 < var10.size(); ++var11) {
               ((vdtt_es)var10.get(var11)).b(var5, 14, 14);
            }

            var6.a((Graphics)var5);
            var6.ae[0].b(var5, var6);
            var6.a(var5, var6.cx + 4, var6.cy + var6.f());
            var5.f(5014425);

            for(var12 = 0; var12 < Char.gI().arrItemBag.length; ++var12) {
               Char.gI();
            }

            for(var12 = 0; var12 < var6.ad.length; ++var12) {
               var6.a(var5, var6.cx + var6.ad[var12].cx, var6.cy + var6.ad[var12].cy);
               var5.c(-2965602);
               var6.a(var5, 0, 0, var6.ad[var12].width, var6.ad[var12].height, 61, 55, 56);
               var5.f();
               switch(var12) {
               case 0:
                  a(var5, 0, 10, "", (byte)0);
                  vdtt_dd.b(vdtt_dd.d, var5, Utlis.c(Char.gI().bac), 30, 9, 20, -3089954, -16777216);
                  break;
               case 1:
                  a(var5, 0, 8, "", (byte)2);
                  vdtt_dd.b(vdtt_dd.d, var5, Utlis.c(Char.gI().vang), 30, 9, 20, -2560, -16777216);
                  break;
               case 2:
                  a(var5, 0, 10, "", (byte)1);
                  vdtt_dd.b(vdtt_dd.d, var5, Utlis.c(Char.gI().bacKhoa), 30, 9, 20, -3089954, -16777216);
                  break;
               case 3:
                  a(var5, 0, 8, "", (byte)3);
                  vdtt_dd.b(vdtt_dd.d, var5, Utlis.c(Char.gI().vangKhoa), 30, 9, 20, -2560, -16777216);
               }
            }

            var6.a(var5, var7, var8);
         }
      }

      super.b(var1);
      if (super.a.b == this.w() && !this.C()) {
         int var15 = var1.e;
         int var16 = var1.f;
         this.a(var1, this.ae[0]);
         Vector var17 = new Vector();
         Vector var18 = new Vector();
         var2 = new Vector();
         var3 = new Vector();

         int var19;
         int var20;
         Item var21;
         for(var4 = 0; var4 < this.ae[0].i; ++var4) {
            for(var20 = 0; var20 < this.ae[0].O; ++var20) {
               var19 = var4 * this.ae[0].O + var20;
               if ((var21 = this.ai[var19]) != null) {
                  var17.add(var21);
               }

               Item var22;
               if ((var22 = Char.gI().arrItemBag[var19]) != null) {
                  var18.add(var22);
               } else {
                  var2.add(var22);
               }

               if (this.ae[0].b(var4)) {
                  if (var21 != null && var21.v != null) {
                     if (var21.v.q()) {
                        var21.v = null;
                     } else {
                        var21.v.n();
                        var21.v.setXY(var20 * this.ae[0].h, var4 * this.ae[0].h);
                        var3.add(var21.v);
                     }
                  }

                  b(var1, var20 * this.ae[0].h, var4 * this.ae[0].h, var21, var19 == this.ae[0].k);
                  if (var19 >= Char.gI().ac) {
                     vdtt_y.a(var1, -23, 0, var20 * this.ae[0].h + 1, var4 * this.ae[0].h + 1, 27, (int)27);
                  }
               }
            }
         }

         if (var18.size() != var17.size()) {
            var18.addAll(var2);
         }

         var18.removeAll(var17);

         for(var4 = 0; var4 < this.ae[0].i; ++var4) {
            for(var20 = 0; var20 < this.ae[0].O; ++var20) {
               var19 = var4 * this.ae[0].O + var20;
               if (this.ai[var19] == null && var18.size() > 0) {
                  var21 = (Item)var18.remove(0);
                  if (this.ae[0].b(var4)) {
                     if (var21 != null && var21.v != null) {
                        if (var21.v.q()) {
                           var21.v = null;
                        } else {
                           var21.v.n();
                           var21.v.setXY(var20 * this.ae[0].h, var4 * this.ae[0].h);
                           var3.add(var21.v);
                        }
                     }

                     b(var1, var20 * this.ae[0].h, var4 * this.ae[0].h, var21, var19 == this.ae[0].k);
                     vdtt_y.a(var1, -23, 0, var20 * this.ae[0].h + 1, var4 * this.ae[0].h + 1, 27, (int)27);
                  }
               }
            }
         }

         for(var4 = 0; var4 < var3.size(); ++var4) {
            ((vdtt_es)var3.get(var4)).b(var1, 14, 14);
         }

         this.a((Graphics)var1);
         this.ae[0].b(var1, this);
         this.a(var1, this.cx + 4, this.cy + this.f());
         var1.f(5014425);
         var4 = 0;

         for(var20 = 0; var20 < Char.gI().arrItemBag.length; ++var20) {
            if (Char.gI().arrItemBag[var20] != null) {
               ++var4;
            }
         }

         if (!DataCenter.k()) {
            vdtt_dd.b(vdtt_dd.d, var1, Caption.bq + " " + var4 + "/" + Char.gI().ac, 3, this.af.cy - 19, 0, -1, -16777216);
         }

         for(var20 = 0; var20 < this.ad.length; ++var20) {
            this.a(var1, this.cx + this.ad[var20].cx, this.cy + this.ad[var20].cy);
            var1.c(-2965602);
            this.a(var1, 0, 0, this.ad[var20].width, this.ad[var20].height, 61, 55, 56);
            var1.f();
            switch(var20) {
            case 0:
               a(var1, 0, 10, "", (byte)0);
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(Char.gI().bac), 30, 9, 20, -3089954, -16777216);
               break;
            case 1:
               a(var1, 0, 8, "", (byte)2);
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(Char.gI().vang), 30, 9, 20, -2560, -16777216);
               break;
            case 2:
               a(var1, 0, 10, "", (byte)1);
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(Char.gI().bacKhoa), 30, 9, 20, -3089954, -16777216);
               break;
            case 3:
               a(var1, 0, 8, "", (byte)3);
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.c(Char.gI().vangKhoa), 30, 9, 20, -2560, -16777216);
            }
         }

         this.a(var1, var15, var16);
      }

   }

   public void a_() {
      super.a_();
      if (this.ae[0].i * this.ae[0].O != Char.gI().arrItemBag.length) {
         this.A();
      }

      if (super.a.b == this.w()) {
         for(int var1 = 0; var1 < this.ae.length; ++var1) {
            this.ae[var1].a();
         }
      }

   }

   public Vector g() {
      Vector var1 = super.g();
      if (this.w() <= 0) {
         var1.removeElementAt(0);
      }

      if (super.a.b == this.w() && !this.C()) {
         var1.addElement(this.ae[0].a(5001, this));

         for(int var2 = 0; var2 < this.ad.length; ++var2) {
            var1.addElement(this.ad[var2].a(5003 + var2, this));
         }
      }

      return var1;
   }

   private void a(vdtt_hp var1, int var2) {
      for(int var3 = 0; var3 < this.ae.length; ++var3) {
         this.ae[var3].k = -1;
      }

      var1.k = var2;
   }

   public final void i(int var1) {
      this.a(this.ae[0], var1);
   }

   public final void a(Item var1, String var2) {
      vdtt_hm var3 = new vdtt_hm(var1.index);
      String[] var4 = Utlis.a(var2, ";");
      var3.c = new String[var4.length];
      var3.d = new short[var4.length];

      for(int var5 = 0; var5 < var4.length; ++var5) {
         var3.c[var5] = var4[var5];
         var3.d[var5] = (short)(30000 + var5);
      }

      vdtt_hq var8;
      (var8 = this.ae[0]).k = var1.index;
      if (var8.k >= 0 && var8.k < var8.i * var8.O) {
         var8.e();
         int var6 = var8.k % var8.O;
         int var7 = var8.k / var8.O - (var8.j >= 0 ? var8.j : 0);
         if (var8.n == 0) {
            var6 = var8.k % var8.i - (var8.j >= 0 ? var8.j : 0);
            var7 = var8.k / var8.i;
         }

         var6 = var6 * var8.h + var8.h + var8.cx;
         var7 = var7 * var8.h + var8.cy;
         this.k = a(this, var6, var7, var3);
      }

   }

   public void d() {
      super.d();
      if (this.aa != null) {
         for(int var1 = 0; var1 < this.aa.length; ++var1) {
            if (this.aa[var1] != null) {
               Char.gI().i(this.aa[var1].w)[this.aa[var1].index] = this.aa[var1];
               this.aa[var1] = null;
            }
         }
      }

      if (this.ab != null && this.ab[0] != null && (this instanceof vdtt_mz || this instanceof vdtt_mi)) {
         Char.gI().i(this.ab[0].w)[this.ab[0].index] = this.ab[0];
         this.ab[0] = null;
      }

   }

   public Item[] a(Item var1) {
      return Char.gI().arrItemBag;
   }
}

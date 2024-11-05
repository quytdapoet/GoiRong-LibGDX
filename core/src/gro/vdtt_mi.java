package gro;

import java.util.Vector;

public final class vdtt_mi extends vdtt_jx {
   public Item[] N = new Item[16];
   private vdtt_hq[] V;
   private vdtt_ay W;
   public boolean O;
   public vdtt_hf P;
   private int X;
   public vdtt_bd Q;
   public Vector R = new Vector();
   public int[] S = new int[2];
   private String Y = "";

   public vdtt_mi(MainScreen var1) {
      super(var1, new String[]{Caption.yT[5], Caption.P});
      this.ab = new Item[2];
      this.V = new vdtt_hq[3];
      this.V[0] = new vdtt_hq((byte)1, 14, this.f() + 20, 30, 30, 30, 1, 1);
      this.V[1] = new vdtt_hq((byte)1, 104, this.f() + 20, 30, 30, 30, 1, 1);
      this.V[2] = new vdtt_hq((byte)1, 162, this.f() + 20, 128, 128, 32, 4, 4);
      this.W = this.a(this.width - 70, this.height - 33, Caption.B, this, 0, -8);
      this.a(this.W, 0);
      vdtt_hm var2 = new vdtt_hm(1004, new String[]{""});
      this.Q = this.a(14, this.f() + 178, 100, var2.c.length, var2, this, 1);
      this.Q.b(true);
      this.Q.a(0);
      this.a(this.Q, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].C()) {
            this.aj.add(var1[var2]);
         }
      }

   }

   public final void f(int var1) {
      super.f(var1);
      if (this.O) {
         this.O = false;

         for(var1 = 0; var1 < this.aa.length; ++var1) {
            this.ab[var1] = null;
         }
      }

   }

   private void C() {
      int var1;
      for(var1 = 0; var1 < this.N.length; ++var1) {
         this.N[var1] = null;
      }

      this.X = 0;
      this.Y = this.ab[0].strData;
      this.ab[1] = this.ab[0].a();
      ItemOption[] var2;
      if ((var2 = this.ab[1].L()) != null) {
         Vector var3 = new Vector();
         Vector var4 = new Vector();

         int var5;
         ItemOption var6;
         for(var5 = 0; var5 < var2.length; ++var5) {
            if ((var6 = var2[var5]).m()) {
               var4.add(var6);
            }
         }

         ItemOption var7 = null;
         var6 = null;
         ItemOption var8 = null;
         int var9;
         int var10;
         ItemOption var11;
         if (this.Q.n.b == 0) {
            var3.addAll(this.R);

            for(var9 = 0; var9 < var2.length; ++var9) {
               ItemOption var12;
               if ((var12 = var2[var9]).k()) {
                  var12.c(0);
                  var4.add(var12);
               } else if (!var12.l()) {
                  var4.add(var12);
               }
            }
         } else {
            var3.add(this.R.get(this.Q.n.b - 1));
            var9 = 0;

            for(var10 = 0; var10 < var2.length; ++var10) {
               if ((var11 = var2[var10]).getItemOptionTemplate().id == 349) {
                  var7 = var11;
               } else if (var11.getItemOptionTemplate().id == 350) {
                  var6 = var11;
               } else if (var11.getItemOptionTemplate().id == 298) {
                  var8 = var11;
               }

               if (var11.l()) {
                  ++var9;
                  if (var9 != this.Q.n.b) {
                     var4.add(var11);
                  } else if (var11.getItemOptionTemplate().type == 17) {
                     var7.c(var7.option[1] - 1);
                  } else if (var11.j()) {
                     var6.c(var6.option[1] - 1);
                  } else if (var11.getItemOptionTemplate().type == 8) {
                     var8.c(var8.option[1] - 1);
                  }
               } else if (!var4.contains(var11)) {
                  var4.add(var11);
               }
            }
         }

         for(var9 = 0; var9 < var2.length; ++var9) {
            if (((var7 = var2[var9]).option[0] == 370 || var7.getItemOptionTemplate().type == 18) && !var4.contains(var2[var9])) {
               var4.add(var2[var9]);
            }
         }

         Vector var15 = new Vector();

         int var16;
         for(var10 = 0; var10 < var3.size(); ++var10) {
            if ((var1 = (var11 = (ItemOption)var3.get(var10)).h()) >= 0) {
               if (var11.getItemOptionTemplate().type != 17 && !var11.j()) {
                  if (var11.getItemOptionTemplate().type == 8) {
                     var5 = var11.option[3];
                     var16 = 0;

                     for(int var14 = 0; var14 <= var5; ++var14) {
                        var16 += DataCenter.gI().ar[var14];
                     }

                     var15.add(new Item(var1, true, var16));
                  }
               } else {
                  Item var13;
                  (var13 = new Item(var1, true)).strData = var11.g();
                  var15.add(var13);
               }
            }
         }

         this.ab[1].strData = Item.a(var4);
         var10 = 0;

         for(var16 = 0; var16 < var15.size(); ++var16) {
            Item var17;
            if ((var17 = (Item)var15.get(var16)).getItemTemplate().type == 32) {
               this.X += var17.M();
            } else {
               var10 += var17.M();
            }

            if (var16 >= this.N.length) {
               break;
            }

            this.N[var16] = var17;
         }

         this.X = this.X / 200 + var10;
      }

   }

   public final void a_() {
      super.a_();
      int var1;
      if (super.a.b == 0) {
         label54: {
            if (!this.O) {
               if (this.ab[0] != null) {
                  if (this.ab[1] == null || !this.Y.equals(this.ab[0].strData)) {
                     this.C();
                  }
                  break label54;
               }

               for(var1 = 0; var1 < this.N.length; ++var1) {
                  this.N[var1] = null;
               }

               this.X = 0;
               this.ab[1] = null;
            }

            this.Q.b(true);
         }

         for(var1 = 0; var1 < this.V.length; ++var1) {
            this.V[var1].a();
         }
      }

      if (this.P != null) {
         this.P.o();
         if (this.P.p()) {
            this.P = null;
         }
      }

      for(var1 = 0; var1 < this.S.length; ++var1) {
         if (this.S[var1] > 0) {
            int var10003 = this.S[var1]--;
         }
      }

   }

   public final void b(Graphics var1) {
      if (this.w() <= 0) {
         this.a(var1, this.cx, this.cy, this.width, this.height, Caption.y, (byte)2, this.J);
      } else {
         super.b(var1);
      }

      if (super.a.b == 0) {
         if (this.S[1] == 0 || this.S[1] % 12 > 5) {
            vdtt_dd.b(vdtt_dd.d, var1, Caption.ee, 14, this.f() + 11, 0, -10831436, -16777216);
         }

         a(var1, this.V[0].cx, this.V[0].cy, this.ab[0], this.V[0].k >= 0, Caption.bD);
         a(var1, this.V[1].cx, this.V[1].cy, this.ab[1], this.V[1].k >= 0, Caption.Q);
         vdtt_cz.a(var1, 95, 0, 65 - DataCenter.gI().h / 3 % 3, this.f() + 25, 20);
         if (this.O) {
            if (this.S[0] == 0 || this.S[0] % 12 > 5) {
               vdtt_dd.b(vdtt_dd.d, var1, Caption.ps, this.Q.cx, this.f() + 70, 0, -2560, -16777216);
            }
         } else if (this.ab[0] != null && (this.S[0] == 0 || this.S[0] % 12 > 5)) {
            if (Char.gI().vang < this.X) {
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.qN, Utlis.c(this.X)), this.Q.cx, this.f() + 70, 0, -65536, -16777216);
            } else {
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.qN, Utlis.c(this.X)), this.Q.cx, this.f() + 70, 0, -30976, -16777216);
            }
         }

         this.a(var1, this.V[2]);

         for(int var2 = 0; var2 < this.V[2].i; ++var2) {
            for(int var3 = 0; var3 < this.V[2].O; ++var3) {
               b(var1, var3 * this.V[2].h, var2 * this.V[2].h, this.N[var2 * this.V[2].O + var3], var2 * this.V[2].i + var3 == this.V[2].k, "");
            }
         }

         this.a(var1);
         if (this.P != null) {
            this.P.b(var1, this.V[1].cx + this.V[1].h / 2, this.V[1].cy + this.V[1].h / 2);
            return;
         }
      } else {
         this.B();
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         for(int var2 = 0; var2 < this.V.length; ++var2) {
            var1.addElement(this.V[var2].a(1001 + var2, this));
         }
      }

      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (super.a.b == this.w() && var1.b == 0) {
         super.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         switch(var1.b) {
         case 0:
            this.a(true);
            return;
         case 1001:
            this.ac = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.ab[0]);
            if (this.ab[0] == null) {
               this.f(2);
               DataCenter.gI().currentScreen.c(Caption.nV, -1);
               return;
            }
            break;
         case 1002:
            this.ac = 10;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.ab[1]);
            return;
         case 1003:
            try {
               this.ac = 10;
               this.a(var1.j, var1.j.k);
               this.k = a(var1, this, this.N[var1.j.k]);
               return;
            } catch (Exception var5) {
               return;
            }
         case 2001:
            this.a(false);
         }
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      super.b(var1, var2, var3);
      if (var1 == 1004) {
         this.C();
      }

   }

   private void a(vdtt_hp var1, int var2) {
      for(int var3 = 0; var3 < this.V.length; ++var3) {
         this.V[var3].k = -1;
      }

      var1.k = var2;
   }

   public final void d() {
      super.d();
   }

   private void a(boolean var1) {
      try {
         if (!this.O && Char.gI().vang >= this.X) {
            if (this.ab[0] == null) {
               this.S[1] = 50;
            } else if (this.ab[0] == null) {
               DataCenter.gI().currentScreen.c(Caption.ee, -65536);
            } else if (var1) {
               DataCenter.gI().currentScreen.a(Utlis.b(Caption.jT, this.Q.f().toLowerCase()) + Utlis.b(Caption.ke, Utlis.c(this.X)), 2001, this);
            } else {
               Message var2;
               (var2 = new Message((byte)-47)).writeByte(this.ab[0].w);
               var2.writeShort(this.ab[0].index);
               var2.writeByte(this.Q.n.b);
               var2.send();
            }
         } else {
            this.S[0] = 50;
         }
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }
}

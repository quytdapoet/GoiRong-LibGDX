package gro;

import java.util.Vector;

public final class vdtt_ks extends vdtt_jx {
   public Item[] N = new Item[1];
   public Item[] O = new Item[25];
   private vdtt_hq[] X = new vdtt_hq[3];
   private vdtt_ay Y;
   public int P;
   public vdtt_hf Q;
   public Item R;
   public boolean S;
   public int V;
   public int[] W = new int[2];

   public vdtt_ks(MainScreen var1) {
      super(var1, new String[]{Caption.yT[6], Caption.P});
      this.X[0] = new vdtt_hq((byte)1, 222, this.f() + 20, 30, 30, 30, 1, 1);
      this.X[1] = new vdtt_hq((byte)1, 242, this.f() + 20, 30, 30, 30, 1, 1);
      this.X[2] = new vdtt_hq((byte)0, 14, this.f() + 20, 160, 160, 32, 5, 5);
      this.Y = this.a(this.width - 70, this.height - 33, Caption.bF, this, 0, -8);
      this.a(this.Y, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].q()) {
            this.aj.add(var1[var2]);
         }
      }

   }

   public final void f(int var1) {
      super.f(var1);
      if (this.S) {
         this.S = false;
         this.R = null;
      }

   }

   public final void a_() {
      super.a_();
      int var1;
      if (super.a.b == 0) {
         for(var1 = 0; var1 < this.X.length; ++var1) {
            this.X[var1].a();
         }
      } else {
         this.B();
      }

      if (this.Q != null) {
         this.Q.o();
         if (this.Q.p()) {
            this.Q = null;
         }
      }

      for(var1 = 0; var1 < this.W.length; ++var1) {
         if (this.W[var1] > 0) {
            int var10003 = this.W[var1]--;
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
         if (this.W[1] == 0 || this.W[1] % 12 > 5) {
            vdtt_dd.b(vdtt_dd.d, var1, Caption.ph, 14, this.f() + 11, 0, -10831436, -16777216);
         }

         vdtt_cz.a(var1, 95, 0, this.X[0].cx - 35 - DataCenter.gI().h / 3 % 3, this.f() + 25, 20);
         if (this.S) {
            if (this.W[0] == 0 || this.W[0] % 12 > 5) {
               vdtt_dd.b(vdtt_dd.d, var1, Caption.pl, 179, this.f() + 108, 0, -2560, -16777216);
            }
         } else if (this.R != null && this.V > 0 && (this.W[0] == 0 || this.W[0] % 12 > 5)) {
            if (Char.gI().bac < this.V) {
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.pj, Utlis.c(this.V)), 179, this.f() + 108, 0, -65536, -16777216);
            } else {
               vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.pj, Utlis.c(this.V)), 179, this.f() + 108, 0, -3089954, -16777216);
            }
         }

         vdtt_dd.b(vdtt_dd.b, var1, Caption.pm, this.X[2].cx, this.f() + 185, 0, -6488, -16777216);
         vdtt_dd.b(vdtt_dd.b, var1, Caption.xt, this.X[2].cx, this.f() + 196, 0, -6488, -16777216);
         a(var1, this.X[0].cx, this.X[0].cy, this.R, this.X[0].k >= 0, Caption.Q);
         this.a(var1, this.X[2]);

         for(int var2 = 0; var2 < this.X[2].i; ++var2) {
            for(int var3 = 0; var3 < this.X[2].O; ++var3) {
               b(var1, var3 * this.X[2].h, var2 * this.X[2].h, this.O[var2 * this.X[2].O + var3], var2 * this.X[2].i + var3 == this.X[2].k, "");
            }
         }

         this.a(var1);
         if (this.Q != null) {
            this.Q.b(var1, this.X[0].cx + this.X[0].h / 2, this.X[0].cy + this.X[0].h / 2);
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         for(int var2 = 0; var2 < this.X.length; ++var2) {
            if (var2 != 1) {
               var1.addElement(this.X[var2].a(1001 + var2, this));
            }
         }
      }

      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (super.a.b == this.w() && var1.b == 0) {
         this.d();
      }

      super.a(var1, var2, var3);
      if (super.a.b == 0) {
         switch(var1.b) {
         case 0:
            this.a(false);
            return;
         case 1001:
            if (this.N[0] == null) {
               this.f(2);
               DataCenter.gI().currentScreen.c(Caption.ph, -1);
               return;
            }

            this.P = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.R);
            return;
         case 1002:
            this.P = 0;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.N[1]);
            return;
         case 1003:
            try {
               this.P = 0;
               this.a(var1.j, var1.j.k);
               var2 = var1.j.k / 4;
               var3 = var1.j.k % 4;
               this.k = b(var1, this, this.O[var2 * 4 + var3]);
               return;
            } catch (Exception var5) {
               return;
            }
         case 2001:
            this.a(false);
         }
      }

   }

   private void a(vdtt_hp var1, int var2) {
      for(int var3 = 0; var3 < this.X.length; ++var3) {
         this.X[var3].k = -1;
      }

      var1.k = var2;
   }

   public final void d() {
      super.d();

      for(int var1 = 0; var1 < this.O.length; ++var1) {
         if (this.O[var1] != null) {
            Char.gI().i(this.O[var1].w)[this.O[var1].index] = this.O[var1];
            this.O[var1] = null;
         }
      }

   }

   private void a(boolean var1) {
      try {
         if (!this.S && Char.gI().bac >= this.V) {
            if (this.N[0] != null && this.V > 0) {
               if (this.R == null) {
                  DataCenter.gI().currentScreen.c(Caption.ph, -65536);
               } else {
                  Vector var2 = new Vector();

                  for(int var3 = 0; var3 < this.O.length; ++var3) {
                     if (this.O[var3] != null) {
                        if (this.O[var3].id == this.R.id) {
                           var2.insertElementAt(this.O[var3], 0);
                        } else {
                           var2.add(this.O[var3]);
                        }
                     }
                  }

                  if (var2.size() < 2) {
                     DataCenter.gI().currentScreen.c(Caption.ph, -65536);
                  } else {
                     Message var6;
                     (var6 = new Message((byte)-50)).writeByte(var2.size());

                     for(int var4 = 0; var4 < var2.size(); ++var4) {
                        var6.writeByte(((Item)var2.get(var4)).w);
                        var6.writeShort(((Item)var2.get(var4)).index);
                     }

                     var6.send();
                  }
               }
            } else {
               this.W[1] = 50;
            }
         } else {
            this.W[0] = 50;
         }
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }

   public final void b(Item var1) {
      this.N[0] = var1;
      if (this.N[0] == null) {
         this.R = null;
         this.V = 0;
      } else {
         this.R = this.N[0].a();
         this.R.level = 0;
         Vector var2 = new Vector();
         Vector var3 = new Vector();
         long var4 = -1L;

         for(int var6 = 0; var6 < this.O.length; ++var6) {
            if (this.O[var6] != null) {
               if (this.O[var6].h > var4) {
                  var4 = this.O[var6].h;
               }

               ItemOption[] var7;
               if ((var7 = this.O[var6].L()) != null) {
                  int var8;
                  if (!this.O[var6].equals(this.N[0])) {
                     for(var8 = 0; var8 < DataCenter.gI().itemOptionTemplate.length; ++var8) {
                        if (DataCenter.gI().itemOptionTemplate[var8].text.trim().toLowerCase().equals(this.O[var6].getItemTemplate().name.trim().toLowerCase())) {
                           var3.add(new ItemOption(DataCenter.gI().itemOptionTemplate[var8].id + ",0,0"));
                           break;
                        }
                     }
                  }

                  for(var8 = 0; var8 < var7.length; ++var8) {
                     boolean var9 = true;

                     for(int var10 = 0; var10 < var2.size(); ++var10) {
                        if (((ItemOption)var2.get(var10)).option[0] == var7[var8].option[0]) {
                           ((ItemOption)var2.get(var10)).c(((ItemOption)var2.get(var10)).option[1] + var7[var8].option[1]);
                           var9 = false;
                           break;
                        }
                     }

                     if (var9) {
                        var2.add(var7[var8]);
                     }
                  }
               }
            }
         }

         var2.addAll(var3);
         this.R.strData = Item.a(var2);
         this.R.isLock = true;
         this.R.h = var4;
      }

   }

   public final void C() {
      try {
         Vector var1 = new Vector();

         for(int var2 = 0; var2 < this.O.length; ++var2) {
            if (this.O[var2] != null) {
               if (this.R != null && this.O[var2].id == this.R.id) {
                  var1.insertElementAt(this.O[var2], 0);
               } else {
                  var1.add(this.O[var2]);
               }
            }
         }

         if (var1.size() <= 0) {
            this.R = null;
            this.V = 0;
            return;
         }

         Message var5;
         (var5 = Message.c((byte)-47)).writeByte(var1.size());

         for(int var3 = 0; var3 < var1.size(); ++var3) {
            var5.writeByte(((Item)var1.get(var3)).w);
            var5.writeShort(((Item)var1.get(var3)).index);
         }

         var5.send();
      } catch (Exception var4) {
         Utlis.a(var4);
      }

   }
}

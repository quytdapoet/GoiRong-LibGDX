package gro;

import java.util.Vector;

public final class vdtt_mh extends vdtt_jx {
   public Item[] N = new Item[1];
   public Item[] O = new Item[25];
   public Item[] P;
   private vdtt_hq[] W = new vdtt_hq[3];
   private vdtt_ay X;
   public int Q;
   public vdtt_hf R;
   public boolean S;
   public vdtt_bd V;

   public vdtt_mh(MainScreen var1) {
      super(var1, new String[]{Caption.xq, Caption.P});
      this.W[0] = new vdtt_hq((byte)1, 222, this.f() + 20, 30, 30, 30, 1, 1);
      this.W[1] = new vdtt_hq((byte)1, 242, this.f() + 20, 30, 30, 30, 1, 1);
      this.W[2] = new vdtt_hq((byte)0, 14, this.f() + 20, 160, 160, 32, 5, 5);
      this.X = this.a(this.width - 70, this.height - 33, Caption.B, this, 0, -8);
      this.a(this.X, 0);
      vdtt_hm var2 = new vdtt_hm(1000, new String[]{Caption.ru});
      this.V = this.a(13, this.f() + this.h() - 26, 150, var2.c.length, var2, this, 1);
      this.a(this.V, 0);
   }

   public final void a(Item[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].s()) {
            this.aj.add(var1[var2]);
         }
      }

   }

   public final void f(int var1) {
      super.f(var1);
      if (this.S) {
         this.S = false;
         this.N[0] = null;
      }

   }

   public final void a_() {
      super.a_();
      if (super.a.b == 0) {
         this.V.b(true);

         int var1;
         for(var1 = 0; var1 < this.O.length; ++var1) {
            this.O[var1] = null;
         }

         if (!this.S) {
            if (this.N[0] == null) {
               this.P = null;
            } else {
               this.V.b(false);
               if (this.P != null) {
                  for(var1 = 0; var1 < this.P.length; ++var1) {
                     this.O[var1] = this.P[var1];
                  }
               } else {
                  this.O[0] = new Item(this.N[0].id);
                  ItemOption[] var2;
                  if ((var2 = this.N[0].L()) != null) {
                     label78:
                     for(int var3 = 0; var3 < var2.length; ++var3) {
                        if (var2[var3].getItemOptionTemplate().type == 14) {
                           for(int var4 = 0; var4 < this.O.length; ++var4) {
                              if (this.O[var4] == null) {
                                 int var5 = 0;

                                 while(true) {
                                    if (var5 >= DataCenter.gI().itemTemplate.length) {
                                       continue label78;
                                    }

                                    if (DataCenter.gI().itemTemplate[var5].name.trim().toLowerCase().equals(var2[var3].getItemOptionTemplate().text.trim().toLowerCase())) {
                                       this.O[var4] = new Item(DataCenter.gI().itemTemplate[var5].id);
                                       this.O[var4].am();
                                       continue label78;
                                    }

                                    ++var5;
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         for(var1 = 0; var1 < this.W.length; ++var1) {
            this.W[var1].a();
         }
      } else {
         this.B();
      }

      if (this.R != null) {
         this.R.o();
         if (this.R.p()) {
            this.R = null;
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
         vdtt_dd.b(vdtt_dd.d, var1, Caption.po, 14, this.f() + 11, 0, -10831436, -16777216);
         vdtt_cz.a(var1, 95, -360, this.W[0].cx - 40 - DataCenter.gI().h / 3 % 3, this.f() + 25, 20);
         if (this.S) {
            if (DataCenter.gI().h % 20 > 12) {
               vdtt_dd.b(vdtt_dd.d, var1, Caption.ps, 179, this.f() + 108, 0, -2560, -16777216);
            }
         } else {
            vdtt_dd.b(vdtt_dd.d, var1, Caption.xv, 172, this.f() + 68, 0, -1, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, Caption.pt, 172, this.f() + 82, 0, -1, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, Caption.xu, 172, this.f() + 96, 0, -2560, -16777216);
         }

         a(var1, this.W[0].cx, this.W[0].cy, this.N[0], this.W[0].k >= 0, Caption.bb);
         this.a(var1, this.W[2]);

         for(int var2 = 0; var2 < this.W[2].i; ++var2) {
            for(int var3 = 0; var3 < this.W[2].O; ++var3) {
               if (this.O[var2 * this.W[2].O + var3] != null) {
                  this.O[var2 * this.W[2].O + var3].am();
               }

               b(var1, var3 * this.W[2].h, var2 * this.W[2].h, this.O[var2 * this.W[2].O + var3], var2 * this.W[2].i + var3 == this.W[2].k, "");
            }
         }

         this.a(var1);
         if (this.R != null) {
            this.R.b(var1, this.W[0].cx + this.W[0].h / 2, this.W[0].cy + this.W[0].h / 2);
         }
      }

   }

   public final Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 0) {
         for(int var2 = 0; var2 < this.W.length; ++var2) {
            if (var2 != 1) {
               var1.addElement(this.W[var2].a(1001 + var2, this));
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
            this.a(true);
            return;
         case 1001:
            if (this.N[0] == null) {
               this.f(2);
               DataCenter.gI().currentScreen.c(Caption.pq, -1);
               return;
            }

            this.Q = 1;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.N[0]);
            return;
         case 1002:
            this.Q = 0;
            this.a(var1.j, var1.j.k);
            this.k = a(var1, this, this.N[1]);
            return;
         case 1003:
            try {
               this.Q = 0;
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
      for(int var3 = 0; var3 < this.W.length; ++var3) {
         this.W[var3].k = -1;
      }

      var1.k = var2;
   }

   public final void d() {
      super.d();

      for(int var1 = 0; var1 < this.N.length; ++var1) {
         if (this.N[var1] != null && this.N[var1].index >= 0) {
            Char.gI().i(this.N[var1].w)[this.N[var1].index] = this.N[var1];
            this.N[var1] = null;
         }
      }

   }

   private void a(boolean var1) {
      try {
         if (this.N[0] != null && this.N[0].level > 0) {
            if (var1) {
               DataCenter.gI().currentScreen.a(Caption.pp, 2001, this);
            } else {
               Message var2;
               (var2 = new Message((byte)-51)).writeByte(this.N[0].w);
               var2.writeShort(this.N[0].index);
               var2.writeByte(this.V.n.b);
               var2.send();
            }
         } else {
            DataCenter.gI().currentScreen.c(Caption.po, -65536);
         }
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }

   public final void C() {
      try {
         Message var1;
         (var1 = new Message((byte)-52)).writeByte(this.N[0].w);
         var1.writeShort(this.N[0].index);
         var1.send();
      } catch (Exception var2) {
      }

   }
}

package gro;

import java.util.Vector;

public class vdtt_jx extends vdtt_jo {
   private int N = 32;
   private vdtt_hq[][] O;
   protected vdtt_in T;
   public int U;

   public vdtt_jx(MainScreen var1, String[] var2) {
      super(var1, var2);
      vdtt_hm var3;
      (var3 = new vdtt_hm(500)).c = Caption.Al;
      this.T = new vdtt_in(var3, this);
      this.O = new vdtt_hq[Caption.yt.length][];
      this.O[0] = new vdtt_hq[2];
      this.O[0][0] = new vdtt_hq((byte)1, 49, this.f() + 40, this.N, this.N * 5, this.N, 5, 1);
      this.O[0][1] = new vdtt_hq((byte)1, 221, this.f() + 40, this.N, this.N * 5, this.N, 5, 1);
      this.O[1] = new vdtt_hq[1];
      this.O[1][0] = new vdtt_hq((byte)1, 70, this.f() + 40 + this.N * 4, this.N * 5, this.N, this.N, this.N, 1, 5);
      if (DataCenter.k()) {
         this.M[1] = true;
      }

   }

   public void a_() {
      super.a_();
   }

   public void b(Graphics var1) {
      try {
         super.b(var1);
         if (super.a.b == 1) {
            this.T.a(var1);
            this.T.a(var1, this.cx, this.cy);
            Graphics var2;
            Char var3;
            vdtt_jx var4;
            Item var5;
            int var6;
            switch(this.T.h()) {
            case 0:
               var2 = var1;
               var4 = this;

               try {
                  var3 = Char.gI();
                  var5 = null;

                  String var7;
                  for(var6 = 0; var6 < var4.O[var4.T.h()][0].i; ++var6) {
                     var7 = Caption.yg[var6];
                     switch(var6) {
                     case 0:
                        var5 = var3.arrItemBody[2];
                        break;
                     case 1:
                        if (var3.sys == 4) {
                           var7 = Caption.yg[5];
                        }

                        var5 = var3.arrItemBody[4];
                        break;
                     case 2:
                        var5 = var3.arrItemBody[6];
                        break;
                     case 3:
                        var5 = var3.arrItemBody[8];
                        break;
                     case 4:
                        var5 = var3.arrItemBody[14];
                     }

                     short var8 = var4.O[var4.T.h()][0].cx;
                     a(var2, var8, var4.O[var4.T.h()][0].cy + var6 * var4.O[var4.T.h()][0].h, var5, var6 == var4.O[var4.T.h()][0].k, var7);
                     if (!var4.ak && !var4.aj.contains(var5)) {
                        vdtt_y.a(var2, -23, 0, var8 + 1, var4.O[var4.T.h()][0].cy + var6 * var4.O[var4.T.h()][0].h + 1, 27, (int)27);
                     }
                  }

                  for(var6 = 0; var6 < var4.O[var4.T.h()][1].i; ++var6) {
                     var7 = Caption.yg[var6];
                     switch(var6) {
                     case 0:
                        var5 = var3.arrItemBody2[2];
                        break;
                     case 1:
                        if (var3.sys == 4) {
                           var7 = Caption.yg[5];
                        }

                        var5 = var3.arrItemBody2[4];
                        break;
                     case 2:
                        var5 = var3.arrItemBody2[6];
                        break;
                     case 3:
                        var5 = var3.arrItemBody2[8];
                        break;
                     case 4:
                        var5 = var3.arrItemBody2[14];
                     }

                     a(var2, var4.O[var4.T.h()][1].cx, var4.O[var4.T.h()][1].cy + var6 * var4.O[var4.T.h()][1].h, var5, var6 == var4.O[var4.T.h()][1].k, var7);
                     if (!var4.ak && !var4.aj.contains(var5)) {
                        vdtt_y.a(var2, -23, 0, var4.O[var4.T.h()][1].cx + 1, var4.O[var4.T.h()][1].cy + var6 * var4.O[var4.T.h()][1].h + 1, 27, (int)27);
                     }
                  }

                  Char.gI().a(var2, var4.width / 2, 170, var3.a(var3.arrItemBody), DataCenter.gI().h / 4 % 6, var3.typeGiaoDich, false, false);
                  Char.gI().b(var2, var4.width / 2, 115);
                  break;
               } catch (Exception var9) {
                  Utlis.a(var9);
                  return;
               }
            case 1:
               var2 = var1;
               var4 = this;
               var3 = Char.gI();
               var5 = null;

               for(var6 = 0; var6 < var4.O[var4.T.h()][0].O; ++var6) {
                  switch(var6) {
                  case 0:
                     var5 = var3.arrItemBody[0];
                     break;
                  case 1:
                     var5 = var3.arrItemBody[3];
                     break;
                  case 2:
                     var5 = var3.arrItemBody[7];
                     break;
                  case 3:
                     var5 = var3.arrItemBody[5];
                     break;
                  case 4:
                     var5 = var3.arrItemBody[9];
                  }

                  a(var2, var4.O[var4.T.h()][0].cx + var6 * var4.O[var4.T.h()][0].h, var4.O[var4.T.h()][0].cy, var5, var6 == var4.O[var4.T.h()][0].k, Caption.BP[var6]);
                  if (!var4.ak && !var4.aj.contains(var5)) {
                     vdtt_y.a(var2, -23, 0, var4.O[var4.T.h()][0].cx + var6 * var4.O[var4.T.h()][0].h + 1, var4.O[var4.T.h()][0].cy + 1, 27, (int)27);
                  }
               }
            }
         }
      } catch (Exception var10) {
         Utlis.a(var10);
      }

   }

   public Vector g() {
      Vector var1 = super.g();
      if (super.a.b == 1) {
         var1.addElement(this.T.f());
         int var2;
         switch(this.T.h()) {
         case 0:
            if (this.O[this.T.h()] != null) {
               for(var2 = 0; var2 < this.O[this.T.h()].length; ++var2) {
                  if (this.O[this.T.h()][var2] != null) {
                     var1.addElement(this.O[this.T.h()][var2].a(1010 + var2, this));
                  }
               }
            }
         case 1:
            if (this.O[this.T.h()] != null) {
               for(var2 = 0; var2 < this.O[this.T.h()].length; ++var2) {
                  if (this.O[this.T.h()][var2] != null) {
                     var1.addElement(this.O[this.T.h()][var2].a(1020 + var2, this));
                  }
               }
            }
         }
      }

      return var1;
   }

   public void a(vdtt_hi var1, int var2, int var3) {
      try {
         super.a(var1, var2, var3);
         if (super.a.b == 1) {
            Item var4 = null;
            switch(var1.b) {
            case 500:
               if (var1.j.k >= 0) {
                  this.T.a(var1.j.k);
               }
               break;
            case 1010:
               this.U = 0;
               this.a(var1.j, var1.j.k);
               switch(var1.j.k) {
               case 0:
                  var4 = Char.gI().arrItemBody[2];
                  break;
               case 1:
                  var4 = Char.gI().arrItemBody[4];
                  break;
               case 2:
                  var4 = Char.gI().arrItemBody[6];
                  break;
               case 3:
                  var4 = Char.gI().arrItemBody[8];
                  break;
               case 4:
                  var4 = Char.gI().arrItemBody[14];
               }

               if (!this.ak && !this.aj.contains(var4)) {
                  break;
               }

               this.k = a(var1, this, var4);
               return;
            case 1011:
               this.U = 1;
               this.a(var1.j, var1.j.k);
               switch(var1.j.k) {
               case 0:
                  var4 = Char.gI().arrItemBody2[2];
                  break;
               case 1:
                  var4 = Char.gI().arrItemBody2[4];
                  break;
               case 2:
                  var4 = Char.gI().arrItemBody2[6];
                  break;
               case 3:
                  var4 = Char.gI().arrItemBody2[8];
                  break;
               case 4:
                  var4 = Char.gI().arrItemBody2[14];
               }

               if (!this.ak && !this.aj.contains(var4)) {
                  break;
               }

               this.k = a(var1, this, var4);
               return;
            case 1020:
               this.U = 3;
               this.a(var1.j, var1.j.k);
               switch(var1.j.k) {
               case 0:
                  var4 = Char.gI().arrItemBody[0];
                  break;
               case 1:
                  var4 = Char.gI().arrItemBody[3];
                  break;
               case 2:
                  var4 = Char.gI().arrItemBody[7];
                  break;
               case 3:
                  var4 = Char.gI().arrItemBody[5];
                  break;
               case 4:
                  var4 = Char.gI().arrItemBody[9];
               }

               if (this.ak || this.aj.contains(var4)) {
                  this.k = a(var1, this, var4);
                  return;
               }
            }
         }
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }

   private void a(vdtt_hp var1, int var2) {
      for(int var3 = 0; var3 < this.O.length; ++var3) {
         if (this.O[var3] != null) {
            for(int var4 = 0; var4 < this.O[var3].length; ++var4) {
               if (this.O[var3][var4] != null) {
                  this.O[var3][var4].k = -1;
               }
            }
         }
      }

      var1.k = var2;
   }

   public final Item[] a(Item var1) {
      Item[] var2 = Char.gI().arrItemBag;
      if (super.a.b == 1) {
         if (this.T.h() == 0 && this.U != 0) {
            var2 = Char.gI().arrItemBody2;
            var1.w = 3;
         } else {
            var2 = Char.gI().arrItemBody;
            var1.w = 2;
         }

         for(int var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] != null) {
               var2[var3].index = var1.getItemTemplate().type;
            }
         }
      } else if (super.a.b == this.w()) {
         var1.w = 0;
      }

      return var2;
   }

   public final int z() {
      return super.a.b == 1 ? 0 : super.z();
   }
}

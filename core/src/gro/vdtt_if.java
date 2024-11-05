package gro;

import java.util.Vector;

public final class vdtt_if {
   public int a = -1;
   public int b;
   public vdtt_ic c;
   public Skill d;
   public Char e;
   public Entity f;
   public boolean g;
   public vdtt_eo h;
   private int k;
   private boolean l;
   public boolean i;
   private int m;
   private int n;
   private XYEntity o;
   private XYEntity p;
   public Skill j;

   public vdtt_if(Skill var1, Char var2, Entity var3) {
      this.d = var1;
      this.c = (vdtt_ic)DataCenter.gI().D.get(var1.d);
      this.e = var2;
      Char var4;
      if (var3 instanceof Char && (var4 = (Char)var3).bS != null) {
         var3 = var4.bS;
      }

      this.f = (Entity)var3;
      if (var2.p() && var1.l() && GameSrc.gI().focusEntity != null) {
         var2.bc.clear();
         this.o = XYEntity.create(var2.cx, var2.cy);
         this.p = XYEntity.create(GameSrc.gI().focusEntity.cx, GameSrc.gI().focusEntity.cy);
         this.n = Utlis.a(this.o.cx, this.o.cy, this.p.cx, this.p.cy);
      }

      if (var2.U() != null) {
         this.b = 1;
      } else {
         this.b = 0;
      }

      try {
         if (var2.p() && (var1.e() || var1.i >= 100)) {
            Skill var5 = var1;
            Object var6 = var3;
            var4 = var2;

            try {
               if (var4.p()) {
                  if (var6 != null) {
                     if (var6 instanceof Char) {
                        Session.gI().c(var5.b, ((Entity)var6).idEntity);
                     } else {
                        Session.gI().b(var5.b, ((Entity)var6).idEntity);
                     }
                  } else if (var5.e()) {
                     Session.gI().b((int)var5.b, (int)-1);
                  }
               }
            } catch (Exception var8) {
               Utlis.a(var8);
            }
         }
      } catch (Exception var9) {
      }

      if (var3 != null && var3.equals(Char.gI())) {
         vdtt_aa.gI().a(((Char)var3).sys, var1.d, false);
      } else if (var2.equals(Char.gI())) {
         vdtt_aa.gI().a(Char.gI().sys, var1.d, true);
      }

   }

   public final void a(Vector var1, Vector var2) {
      vdtt_if var3;
      try {
         Char var4;
         if (this.d.l() && this.e.p()) {
            Char.gI().S();
            XYEntity var5 = Utlis.b(this.o, this.p, this.m * 15);
            Char.gI().cx = var5.cx;
            Char.gI().cy = var5.cy;
            this.e.setDir(this.p);
            ++this.m;
            if (Utlis.a((XYEntity)this.e, (XYEntity)this.p) < 30) {
               this.a = this.c.e[this.b].length;
               if (this.j != null) {
                  var4 = Char.gI();
                  var3 = null;
                  var4.aU = var3;
                  Char.gI().a(this.j, GameSrc.gI().focusEntity, false);
                  return;
               }
            }
         }

         if (this.f != null && this.f.isDie()) {
            this.a = this.c.e[this.b].length;
         }

         if (this.h != null && this.h.p()) {
            if (this.h.n()) {
               this.a();
            }
         } else {
            this.e.setDir(this.f);
         }

         ++this.a;
         if (this.a >= this.c.e[this.b].length && this.h != null) {
            if (!this.h.n()) {
               this.a = this.c.e[this.b].length - 1;
            } else if (this.e.p() && this.h.m().a == 20) {
               this.e.a(this.f, this.d);
            }
         }

         if (this.e.p() && this.h != null && this.h.p() && this.h.n() && this.h.J < 2) {
            this.h.J = 2;
            this.e.a(this.f, this.d);
         }

         Char var19;
         if (this.a < this.c.e[this.b].length) {
            short var21 = this.c.e[this.b][this.a].a;
            this.e.J = var21;
            int var7;
            if (this.i) {
               var7 = this.e.J + 1;
               this.e.J = (short)var7;
            }

            try {
               if (this.e.p() && (this.a == 16 && this.d.d == 11 || this.a == 16 && this.d.d == 9)) {
                  this.e.a(this.f, this.d);
               }
            } catch (Exception var16) {
            }

            try {
               if (this.e.p() && this.a == 10 && this.d.j()) {
                  this.e.a(this.f, this.d);
               }
            } catch (Exception var15) {
            }

            if (this.d.d == 11 && this.a == 15) {
               this.e.a(this.f);
            }

            if (this.d.d == 9 && this.a == 16 && this.e.cy > this.f.cy) {
               Entity var8 = this.f;
               var19 = this.e;
               Mob var9;
               if (!(var8 instanceof Mob) || (var9 = (Mob)var8).id != 213) {
                  var19.aX = new vdtt_eb(var19.aY, var8);
                  GameSrc.gI().av.add(new vdtt_hf(337, var19.cx, var19.cy, 1));
                  if (var19.p()) {
                     GameSrc.gI().cF = var8;
                     GameSrc.gI().cG = 100;
                  }
               }
            }

            short[] var22 = new short[]{59, 66, 74, 83, 114, 121, 129, 138};
            if (this.h != null && this.h.m().a != 20) {
               for(var7 = 0; var7 < 8; ++var7) {
                  if (this.e.J >= var22[var7] && this.e.J < var22[var7] + 7) {
                     if (this.h.n >= 25 && this.h.n < 155) {
                        var21 = var22[var7];
                        this.e.J = var21;
                        break;
                     }

                     if (this.h.n >= 205 && this.h.n < 335) {
                        var21 = (short)(var22[var7] + 6);
                        this.e.J = var21;
                        break;
                     }

                     if (this.h.n >= 165 && this.h.n < 175 || this.h.n >= 15 && this.h.n < 25) {
                        var21 = (short)(var22[var7] + 2);
                        this.e.J = var21;
                        break;
                     }

                     if (this.h.n >= 155 && this.h.n < 165 || this.h.n >= 5 && this.h.n < 15) {
                        var21 = (short)(var22[var7] + 1);
                        this.e.J = var21;
                        break;
                     }

                     if ((this.h.n < 345 || this.h.n >= 355) && (this.h.n < 185 || this.h.n >= 195)) {
                        if (this.h.n >= 335 && this.h.n < 345 || this.h.n >= 195 && this.h.n < 205) {
                           var21 = (short)(var22[var7] + 5);
                           this.e.J = var21;
                           break;
                        }

                        var21 = (short)(var22[var7] + 3);
                        this.e.J = var21;
                        break;
                     }

                     var21 = (short)(var22[var7] + 4);
                     this.e.J = var21;
                     break;
                  }
               }
            }

            if (this.d.d == 11 && this.a == 15) {
               this.e.a(this.f);
            }

            var22 = new short[]{59, 66, 74, 83, 114, 121, 129, 138};
            if (this.h != null) {
               for(var7 = 0; var7 < 8; ++var7) {
                  if (this.e.J >= var22[var7] && this.e.J < var22[var7] + 7) {
                     if (this.h.n >= 25 && this.h.n < 155) {
                        var21 = var22[var7];
                        this.e.J = var21;
                        break;
                     }

                     if (this.h.n >= 205 && this.h.n < 335) {
                        var21 = (short)(var22[var7] + 6);
                        this.e.J = var21;
                        break;
                     }

                     if (this.h.n >= 165 && this.h.n < 175 || this.h.n >= 15 && this.h.n < 25) {
                        var21 = (short)(var22[var7] + 2);
                        this.e.J = var21;
                        break;
                     }

                     if ((this.h.n < 155 || this.h.n >= 165) && (this.h.n < 5 || this.h.n >= 15)) {
                        if (this.h.n >= 345 && this.h.n < 355 || this.h.n >= 185 && this.h.n < 195) {
                           var21 = (short)(var22[var7] + 4);
                           this.e.J = var21;
                           break;
                        }

                        if (this.h.n >= 335 && this.h.n < 345 || this.h.n >= 195 && this.h.n < 205) {
                           var21 = (short)(var22[var7] + 5);
                           this.e.J = var21;
                           break;
                        }

                        var21 = (short)(var22[var7] + 3);
                        this.e.J = var21;
                        break;
                     }

                     var21 = (short)(var22[var7] + 1);
                     this.e.J = var21;
                     break;
                  }
               }
            }

            int var10;
            int var23;
            if (this.c.e[this.b][this.a].b > 0) {
               if (this.e.p() && !this.e.bM && (this.d.d == 11 || this.d.d == 5) && GameSrc.gI().c instanceof GameSrc) {
                  GameSrc.gI().cO = 15;
               }

               var10 = this.c.e[this.b][this.a].c;
               var7 = this.c.e[this.b][this.a].d;
               if ((var23 = this.c.e[this.b][this.a].b) == 376 && this.d.e == 2) {
                  var23 = 12;
               }

               if (var23 == 394 && this.d.k()) {
                  if (this.e.sys == 5) {
                     switch(this.e.aA) {
                     case 0:
                     case 1:
                     case 2:
                        var23 = 464;
                        break;
                     case 3:
                        var23 = 463;
                        break;
                     case 4:
                        var23 = 465;
                        break;
                     case 5:
                        var23 = 466;
                     }
                  } else if (this.e.sys == 4) {
                     switch(this.e.aA) {
                     case 0:
                        var23 = 403;
                        break;
                     case 1:
                        var23 = 460;
                        break;
                     case 2:
                        var23 = 461;
                        break;
                     case 3:
                        var23 = 476;
                        break;
                     case 4:
                        var23 = 477;
                        break;
                     case 5:
                        var23 = 462;
                     }
                  } else if (this.e.aA == 2 && this.e.sys == 3) {
                     var23 = 395;
                  } else if ((this.e.aA == 3 || this.e.aA == 4) && this.e.sys == 3) {
                     var23 = 400;
                  } else if (this.e.aA == 5 && this.e.sys == 2) {
                     var23 = 401;
                  } else {
                     var23 += this.e.aA;
                  }
               }

               if (this.e.bt != null) {
                  if (var23 == 427) {
                     var23 = 431;
                  } else if (var23 == 430) {
                     var23 = 436;
                  } else if (var23 == 428) {
                     var23 = 437;
                  } else if (this.e.bt.id == 86 && this.d.d == 18) {
                     var10 = (int)((float)var10 + (float)var10 * 5.4F / 10.0F);
                     var7 = (int)((float)var7 + (float)var7 * 5.4F / 10.0F);
                  } else {
                     var10 = (int)((float)var10 + (float)var10 * 4.6F / 10.0F);
                     var7 = (int)((float)var7 + (float)var7 * 4.6F / 10.0F);
                  }
               } else if (this.e.ae()) {
                  var10 = (int)((float)var10 + (float)var10 * 1.8F / 10.0F);
                  var7 = (int)((float)var7 + (float)var7 * 1.8F / 10.0F);
                  if (var23 == 427) {
                     var10 += 2;
                     var7 -= 4;
                  }
               }

               vdtt_hf var11;
               if (this.e.aE == 3) {
                  (var11 = new vdtt_hf(var23, this.e.cx - var10, this.e.cy + var7)).p = true;
               } else {
                  var11 = new vdtt_hf(var23, this.e.cx + var10, this.e.cy + var7);
               }

               if (this.d.d >= 30 && this.d.d <= 36 && this.e.ad()) {
                  var11.L = 95;
               }

               var2.add(var11);
            }

            short var24 = this.c.e[this.b][this.a].e;
            vdtt_ep var12 = DataCenter.gI().B[var24];
            if (this.c.e[this.b][this.a].e > 0 && (this.f != null || var12.a == 15 || var12.a == 23)) {
               this.g = true;
               var10 = this.c.e[this.b][this.a].f;
               var7 = this.c.e[this.b][this.a].g;
               if (this.e.bt != null) {
                  var10 = (int)((float)var10 + (float)var10 * 3.5F / 10.0F);
                  var7 = (int)((float)var7 + (float)var7 * 3.5F / 10.0F);
               }

               if (this.e.aE == 3) {
                  var23 = this.e.cx - var10;
                  var10 = this.e.cy + var7;
               } else {
                  var23 = this.e.cx + var10;
                  var10 = this.e.cy + var7;
               }

               var7 = this.c.d;
               if (this.f == null) {
                  this.f = new vdtt_ey(var23, var10);
               }

               Char var13;
               label335: {
                  (var13 = new Char()).bu = this.e.bu;
                  var13.bt = this.e.bt;
                  var13.bp = this.e.bp;
                  var13.V = this.e.V;
                  var13.sys = this.e.sys;
                  var13.idCharSys = this.e.idCharSys;
                  var13.hp = var13.hpFull = 1;
                  var13.arrItemBody = (Item[])this.e.arrItemBody.clone();
                  var13.dir = this.e.dir;
                  var13.aE = this.e.aE;
                  var13.status = 7;
                  var24 = this.c.e[this.b][this.a].e;
                  if (DataCenter.gI().B[var24].a != 21) {
                     var24 = this.c.e[this.b][this.a].e;
                     if (DataCenter.gI().B[var24].a != 24) {
                        break label335;
                     }
                  }

                  var13 = this.e;
               }

               vdtt_eo var14;
               if (var7 != 2 && var7 != 3) {
                  var14 = new vdtt_eo(this.c.e[this.b][this.a].e, var23, var10, this.f, this.c.b, var7, false, var1, var2, var13, this.e, this.k);
                  this.k = var14.m;
                  var1.add(var14);
               } else {
                  var7 -= 2;
                  if (Utlis.b()) {
                     var14 = new vdtt_eo(this.c.e[this.b][this.a].e, var23, var10, this.f, -1, var7, false, var1, var2, var13, this.e, this.k);
                     this.k = var14.m;
                     var1.add(var14);
                  } else {
                     var14 = new vdtt_eo(this.c.e[this.b][this.a].e, var23, var10, this.f, this.c.b, var7, false, var1, var2, var13, this.e, this.k);
                     this.k = var14.m;
                     var1.add(var14);
                  }
               }

               if (var14.p() || var14.m().a == 20) {
                  this.h = var14;
               }
            }

            return;
         }

         var3 = null;
         this.e.aU = var3;
         if (this.e.aV.size() > 0) {
            var4 = this.e;
            var3 = (vdtt_if)this.e.aV.remove(0);
            var4.aU = var3;
            this.e.status = 3;
         } else if (this.e.p()) {
            if ((var19 = this.e).aU != null) {
               var19.status = 3;
               var19.G();
            } else {
               var19.status = 0;
            }
         } else {
            this.e.status = 0;
         }

         if (this.f != null) {
            if (this.c.b > 0 && !this.g) {
               vdtt_hf var6 = new vdtt_hf(this.c.b, this.f.cx, this.f.cy);
               if (this.c.d == 1) {
                  var6 = new vdtt_hf(this.c.b, this.f.k(), this.f.l());
               }

               if (this.d.d >= 30 && this.d.d <= 36 && this.e.ad()) {
                  var6.L = 95;
               }

               var2.add(var6);
            }

            if (this.c.c > 0) {
               vdtt_eo var20 = new vdtt_eo(this.c.c, this.f.cx, this.f.cy, this.f, -1, 0, false, var1, var2);
               var1.add(var20);
            }
         }

         this.a();

         try {
            if (this.e.p() && !this.d.i() && !this.d.j() && this.d.d != 58 && (this.h == null || !this.h.p() || this.h.J == 1)) {
               if (this.h != null) {
                  this.h.J = 2;
               }

               this.e.a(this.f, this.d);
            }
         } catch (Exception var17) {
         }
      } catch (Exception var18) {
         var3 = null;
         this.e.aU = var3;
         this.e.j();
      }

   }

   private void a() {
      if (!this.l && this.f != null) {
         this.l = true;
         Mob var1 = null;
         if (this.f instanceof Mob) {
            if ((var1 = (Mob)this.f).getMobTemplate().type == 7) {
               new vdtt_eo(13, var1.k(), var1.l(), var1, -1, 0, false, GameSrc.gI().at, GameSrc.gI().av);
            } else {
               this.f.setDir(this.e);
            }

            if (var1.getMobTemplate().type == 7 || !var1.o()) {
               int var2 = 2;
               if (var1.getMobTemplate().type == 7) {
                  if (Utlis.a((int)10) == 0) {
                     var2 = Utlis.a(5, 15);
                  } else {
                     var2 = Utlis.a(1, 5);
                  }
               }

               if (this.f.cx < this.e.cx) {
                  var1.au = -var2;
               } else {
                  var1.au = var2;
               }

               if (this.f.cy < this.e.cy) {
                  var1.av = -1;
               } else {
                  var1.av = 1;
               }
            }
         }

         if (this.f.status != 3 && !this.d.e()) {
            this.f.i();
            if (this.g && var1 != null && var1.aA == 0) {
               var1.aA = 1;
            }
         }
      }

   }
}

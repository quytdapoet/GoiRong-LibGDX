package gro;

import java.util.Vector;

public final class vdtt_bl extends vdtt_al {
   public vdtt_bm l;
   private int K;
   vdtt_ay[] m;
   vdtt_hp[] n;
   private vdtt_hp L;
   public Item H;
   private ItemCho M;
   private Vector N = new Vector();
   private boolean O;
   private int P = -1;
   private vdtt_ay Q;
   public boolean I;
   public static String J = null;

   public vdtt_bl(int var1, int var2, int var3, vdtt_w var4, Item var5) {
      this.a(var1, var2, 1044, var4, var5);
   }

   public vdtt_bl(int var1, int var2, int var3, vdtt_w var4, ItemCho var5) {
      this.M = var5;
      this.a(var1, var2, 1044, var4, var5.item);
   }

   public final void d() {
      this.N.clear();
      this.a(this.cx, this.cy, this.K, this.a, this.H);
   }

   private void a(int var1, int var2, int var3, vdtt_w var4, Item var5) {
      Vector var6 = new Vector();
      if (var5 != null) {
         try {
            this.K = var3;
            this.a = var4;
            this.H = var5;
            this.setXY(var1, var2);
            this.setSize(250, 142);
            Vector var7;
            (var7 = new Vector()).add(new vdtt_ay(0, 3, 0, 0, "", var4, 100, 52));
            if (var4 instanceof vdtt_jo) {
               vdtt_jo var8;
               if ((var8 = (vdtt_jo)var4).x() == var8.w()) {
                  this.a(var7, var4, var8);
               } else if (var8.x() == 0 && var8.ac > 0 && var8.ac < 5) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 164, 15));
               }
            }

            if (var4 instanceof vdtt_me) {
               vdtt_me var18;
               if ((var18 = (vdtt_me)var4).x() == 0) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 0, 0, Caption.aL, var4, 101, 15));
               } else if (var18.z() == 0) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 0, 0, Caption.aK, var4, 103, 15));
               }
            } else if (var4 instanceof vdtt_jy) {
               vdtt_jy var19;
               if ((var19 = (vdtt_jy)var4).D() == 0 && var19.E() == 0 && var5.i() && var19.U.p()) {
                  if (var19.X == 0) {
                     var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bk, var4, 105, 15));
                     if (var5.getItemTemplate().type == 10) {
                        if (var5.al()) {
                           var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bG, var4, 170, 15));
                        } else {
                           var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.tN, var4, 170, 15));
                        }

                        var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.xg, var4, 171, 15));
                     }

                     if (var5.r()) {
                        var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.tK, var4, 168, 15));
                     }
                  } else if (var19.X == 1) {
                     var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bk, var4, 128, 15));
                     if (var5.r()) {
                        var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.tK, var4, 169, 15));
                     }
                  }
               }

               if (var19.D() == 1 && var5.i() && var19.U.p()) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bk, var4, 105, 15));
               }
            } else if (var4 instanceof vdtt_jr) {
               vdtt_jr var20;
               if ((var20 = (vdtt_jr)var4).C() == 0) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 107, 15));
               } else if (var20.z() == 0) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bm, var4, 106, 15));
               }
            } else if (var4 instanceof vdtt_mu) {
               vdtt_mu var21;
               if ((var21 = (vdtt_mu)var4).N == 0) {
                  if (var21.C() == 0) {
                     if (var21.V == 1) {
                        var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 126, 15));
                     }
                  } else if (var21.z() == 0 && !var5.isLock) {
                     var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 125, 15));
                  }
               }
            } else if (var4 instanceof vdtt_nd) {
               vdtt_nd var23;
               if ((var23 = (vdtt_nd)var4).x() == 0) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 111, 15));
               } else if (var23.z() == 0 && var5.p()) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 110, 15));
               }
            } else if (var4 instanceof vdtt_na) {
               vdtt_na var24;
               if ((var24 = (vdtt_na)var4).x() == 0) {
                  if (var24.P == 1 || var24.P == 3 || var24.P == 4) {
                     var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 113, 15));
                  }
               } else if (var24.z() == 0 && var5.t()) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 112, 15));
               }
            } else if (var4 instanceof vdtt_mj) {
               vdtt_mj var26;
               if ((var26 = (vdtt_mj)var4).x() == 0) {
                  if (var26.P == 1) {
                     var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 115, 15));
                  }
               } else if (var26.z() == 0 && var5.B()) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 114, 15));
               }
            } else if (var4 instanceof vdtt_kj) {
               vdtt_kj var28;
               if ((var28 = (vdtt_kj)var4).x() == 0) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 117, 15));
               } else if (var28.z() == 0 && var5.E()) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 116, 15));
               }
            } else if (var4 instanceof vdtt_nb) {
               vdtt_nb var30;
               if ((var30 = (vdtt_nb)var4).x() == 0) {
                  if (var30.P == 1 || var30.P == 2) {
                     var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 119, 15));
                  }
               } else if (var30.z() == 0 && var5.G()) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 118, 15));
               }
            } else if (var4 instanceof vdtt_ky) {
               vdtt_ky var32;
               if ((var32 = (vdtt_ky)var4).x() == 0) {
                  if (var32.P == 1 || var32.P == 3) {
                     var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 167, 15));
                  }
               } else if (var32.z() == 0 && var5.y() && var5.level >= 14) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 166, 15));
               }
            } else if (var4 instanceof vdtt_lo) {
               vdtt_lo var33;
               if ((var33 = (vdtt_lo)var4).x() == 0) {
                  if (var33.P == 1 || var33.P == 3) {
                     var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 146, 15));
                  }
               } else if (var33.z() == 0 && var5.A()) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 145, 15));
               }
            } else if (var4 instanceof vdtt_mw) {
               vdtt_mw var34;
               if ((var34 = (vdtt_mw)var4).x() == 0) {
                  if (var34.P == 1 || var34.P == 2) {
                     var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 144, 15));
                  }
               } else if (var34.z() == 0 && var5.H()) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 143, 15));
               }
            } else if (var4 instanceof vdtt_mv) {
               vdtt_mv var36;
               if ((var36 = (vdtt_mv)var4).x() == 0) {
                  if (var36.P == 1 || var36.P == 2) {
                     var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 158, 15));
                  }
               } else if (var36.z() == 0 && var5.I()) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 157, 15));
               }
            } else if (var4 instanceof vdtt_my) {
               vdtt_my var37;
               if ((var37 = (vdtt_my)var4).x() == 0) {
                  if (var37.P == 1 || var37.P == 2) {
                     var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 160, 15));
                  }
               } else if (var37.z() == 0 && var5.J()) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 159, 15));
               }
            } else if (var4 instanceof vdtt_mx) {
               vdtt_mx var38;
               if ((var38 = (vdtt_mx)var4).x() == 0) {
                  if (var38.P == 1 || var38.P == 2) {
                     var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 162, 15));
                  }
               } else if (var38.z() == 0 && var5.K()) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 161, 15));
               }
            } else if (var4 instanceof vdtt_ll) {
               vdtt_ll var39;
               if ((var39 = (vdtt_ll)var4).x() < 2) {
                  if (var39.P != 1 && var39.P != 2) {
                     if (var39.P == 3) {
                        var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 121, 15));
                     }
                  } else {
                     var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.aL, var4, 122, 15));
                     if (var39.E() == 1) {
                        var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.gr, var4, 132, 15));
                     }
                  }
               } else if (var39.x() == 2) {
                  vdtt_ll var9;
                  if (!(var9 = (vdtt_ll)var4).J()) {
                     var7.add(new vdtt_ay(this.width - 51, this.height - 26, 0, 0, Caption.aL, var4, 101, 15));
                  }
               } else if (var39.x() == var39.w() && var39.z() == 0 && var5.ac()) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 120, 15));
               }
            } else if (var4 instanceof vdtt_lj) {
               vdtt_lj var40;
               if ((var40 = (vdtt_lj)var4).x() == 1) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 124, 15));
               } else if (var40.x() == var40.w() && var40.z() == 0 && !var5.isLock) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 123, 15));
               }
            } else if (var4 instanceof vdtt_ml) {
               vdtt_ml var41;
               if ((var41 = (vdtt_ml)var4).x() == 0) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 130, 15));
               } else if (var41.z() == 0) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 129, 15));
               }
            } else if (var4 instanceof vdtt_le) {
               vdtt_le var42;
               if ((var42 = (vdtt_le)var4).x() == 0) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 156, 15));
               } else if (var42.z() == 0) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 155, 15));
               }
            } else if (var4 instanceof vdtt_jw) {
               vdtt_jw var43;
               if ((var43 = (vdtt_jw)var4).x() == 0) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 136, 15));
               } else if ((var43.O == 61 || var43.O == 69) && var43.z() == 0 && var5.P() || (var43.O == 60 || var43.O == 68) && var43.z() == 0 && var5.Q() || (var43.O == 62 || var43.O == 71) && var43.z() == 0 && var5.R() || (var43.O == 63 || var43.O == 70) && var43.z() == 0 && var5.S()) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 135, 15));
               }
            } else if (var4 instanceof vdtt_ks) {
               vdtt_ks var44;
               if ((var44 = (vdtt_ks)var4).x() == 0) {
                  if (var44.P == 0) {
                     var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 151, 15));
                     var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.u, var4, 152, 15));
                  }
               } else if (var44.z() == 0 && var5.q()) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 150, 15));
               }
            } else if (var4 instanceof vdtt_mh) {
               vdtt_mh var45;
               if ((var45 = (vdtt_mh)var4).x() == 0) {
                  if (var45.Q == 1) {
                     var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bn, var4, 154, 15));
                  }
               } else if (var45.z() == 0 && var5.s()) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 153, 15));
               }
            } else if (var4 instanceof vdtt_mz) {
               vdtt_mz var46;
               if ((var46 = (vdtt_mz)var4).x() != 0 && var46.z() == 0 && var5.F()) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 163, 15));
               }
            } else if (var4 instanceof vdtt_kl) {
               vdtt_kl var47;
               if ((var47 = (vdtt_kl)var4).x() != 0 && var47.z() == 0 && var5.id == 683) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 163, 15));
               }
            } else if (var4 instanceof vdtt_kp) {
               vdtt_kp var48;
               if ((var48 = (vdtt_kp)var4).x() != 0 && var48.z() == 0 && var5.id == 310) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 163, 15));
               }
            } else if (var4 instanceof vdtt_kk) {
               vdtt_kk var49;
               if ((var49 = (vdtt_kk)var4).x() != 0 && var49.z() == 0 && var5.D()) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 165, 15));
               }
            } else if (var4 instanceof vdtt_km) {
               vdtt_km var50;
               if ((var50 = (vdtt_km)var4).x() != 0 && var50.z() == 0 && var5.ab()) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 163, 15));
               }
            } else if (var4 instanceof vdtt_mi) {
               vdtt_mi var51;
               if ((var51 = (vdtt_mi)var4).x() != 0 && var51.z() == 0 && var5.C()) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 163, 15));
               }
            } else if (var4 instanceof vdtt_ly) {
               vdtt_ly var52;
               if ((var52 = (vdtt_ly)var4).x() != 0 && var52.z() == 0 && var5.getItemTemplate().type == 12 && var5.h != -1L) {
                  var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 163, 15));
               }
            } else if (!(var4 instanceof vdtt_kr)) {
               if (var4 instanceof vdtt_kf) {
                  vdtt_kf var53;
                  if ((var53 = (vdtt_kf)var4).U == 5 && var53.B() == 0) {
                     if (var53.C() == 4) {
                        var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.aL, var4, 141, 15));
                     } else if (var53.C() == 3 && var5.id != 160) {
                        var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.gs, var4, 140, 15));
                     }
                  }
               } else if (var4 instanceof vdtt_nc) {
                  vdtt_nc var54;
                  if ((var54 = (vdtt_nc)var4).x() != 0 && var54.z() == 0 && var5.n()) {
                     var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 138, 15));
                  }
               } else {
                  vdtt_jh var55;
                  if (var4 instanceof vdtt_jh && (var55 = (vdtt_jh)var4).x() != 0 && var55.z() == 0 && var5.o()) {
                     var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.bI, var4, 139, 15));
                  }
               }
            }

            if (this.M != null) {
               var7.add(new vdtt_ay(this.width - 51, this.height - 26, 100, 0, Caption.aL, var4, 134, 15));
            }

            if (var7.size() > 6 && this.Q != null) {
               var7.remove(this.Q);
            }

            this.m = new vdtt_ay[var7.size()];

            for(var2 = 0; var2 < var7.size(); ++var2) {
               this.m[var2] = (vdtt_ay)var7.elementAt(var2);
               if (var2 > 0) {
                  this.m[var2].setSize(42, 22);
                  this.m[var2].setXY(this.width - 3 - 47 * var2, this.height - 26);
               }
            }

            if (var4 instanceof vdtt_jt || this.m.length <= 1 && !var5.i()) {
               this.setSize(220, 120);
            }

            this.m[0].setXY(this.width - 17, 3);
            this.n = a(this.m);
            if (var5.i() || var5.level > 0) {
               this.N.addElement(new vdtt_ft("", -1, -16777216));
            }

            String var56;
            if (var5.h >= 0L) {
               var56 = Caption.gt;
               if (var5.id == 655) {
                  var56 = Caption.qP;
               }

               vdtt_jo var22;
               if (var4 instanceof vdtt_me) {
                  if ((var22 = (vdtt_jo)var4).x() == 0) {
                     this.N.addElement(new vdtt_ft(var56 + var5.N(), -2560, -16777216));
                  } else {
                     this.N.addElement(new vdtt_ft(var56 + var5.O(), -2560, -16777216));
                  }
               } else if (var4 instanceof vdtt_ll) {
                  if ((var22 = (vdtt_jo)var4).x() == 2) {
                     this.N.addElement(new vdtt_ft(var56 + var5.N(), -2560, -16777216));
                  } else {
                     this.N.addElement(new vdtt_ft(var56 + var5.O(), -2560, -16777216));
                  }
               } else if (!(var4 instanceof vdtt_jt) && !(var4 instanceof vdtt_js) && !(var4 instanceof vdtt_lq) && !(var4 instanceof PhucLoiScreen) && !(var4 instanceof vdtt_ms) && !(var4 instanceof vdtt_mm) && !(var4 instanceof vdtt_mt) && !(var4 instanceof vdtt_mk)) {
                  if (var4 instanceof vdtt_kf) {
                     vdtt_kf var10;
                     if ((var10 = (vdtt_kf)var4).C() == 4) {
                        this.N.addElement(new vdtt_ft(var56 + var5.N(), -2560, -16777216));
                     } else {
                        this.N.addElement(new vdtt_ft(var56 + var5.O(), -2560, -16777216));
                     }
                  } else {
                     this.N.addElement(new vdtt_ft(var56 + var5.O(), -2560, -16777216));
                  }
               } else {
                  this.N.addElement(new vdtt_ft(var56 + var5.N(), -2560, -16777216));
               }
            }

            if (var5.getItemTemplate().typeChar > 0 && var5.getItemTemplate().typeChar != Char.gI().sys) {
               this.N.addElement(new vdtt_ft(Caption.gu + DataCenter.gI().dataNameChar[var5.getItemTemplate().typeChar].name, -65536, -16777216));
            }

            if (var5.getItemTemplate().levelNeed > 1 && !var5.aa()) {
               if (Char.gI().w() < var5.getItemTemplate().levelNeed) {
                  this.N.addElement(new vdtt_ft(Caption.bu + DataCenter.gI().a((int)var5.getItemTemplate().levelNeed), -65536, -16777216));
               } else {
                  this.N.addElement(new vdtt_ft(Caption.bu + DataCenter.gI().a((int)var5.getItemTemplate().levelNeed), -1, -16777216));
               }
            }

            if (var5.getItemTemplate().phamChatNeed > 0) {
               if (Char.gI().an < var5.getItemTemplate().phamChatNeed) {
                  this.N.addElement(new vdtt_ft(Caption.gx + var5.getItemTemplate().phamChatNeed, -65536, -16777216));
               } else {
                  this.N.addElement(new vdtt_ft(Caption.gx + var5.getItemTemplate().phamChatNeed, -1, -16777216));
               }
            }

            if (var5.getItemTemplate().gioiTinh < 2 && var5.getItemTemplate().gioiTinh != Char.gI().gioiTinh) {
               this.N.addElement(new vdtt_ft(Caption.gy + Caption.yN[var5.getItemTemplate().gioiTinh], -65536, -16777216));
            }

            if (!var5.aa()) {
               if (var5.isLock) {
                  this.N.addElement(new vdtt_ft(Caption.gA, -1, -16777216));
               } else {
                  this.N.addElement(new vdtt_ft(Caption.gB, -1, -16777216));
               }

               if (var5.getItemTemplate().isXepChong && var5.h == -1L) {
                  this.N.addElement(new vdtt_ft(Caption.gE, -1, -16777216));
               } else if (!var5.i()) {
                  this.N.addElement(new vdtt_ft(Caption.qU, -9942667, -16777216));
               }
            }

            boolean var25;
            if (var5.r > 0) {
               var56 = "";
               if (var4 instanceof vdtt_jt) {
                  vdtt_jt var27 = (vdtt_jt)var4;
                  var25 = true;
                  switch(var27.a) {
                  case 18:
                     var56 = Caption.lF;
                     break;
                  case 32:
                     var56 = Caption.lH;
                     break;
                  case 33:
                     var56 = Caption.lI;
                     break;
                  case 35:
                     var56 = Caption.xa;
                     break;
                  case 36:
                     var56 = Caption.lG;
                     break;
                  case 38:
                     var56 = Caption.lJ;
                     break;
                  default:
                     var25 = false;
                  }

                  if (var25) {
                     this.N.addElement(new vdtt_ft(Utlis.b(var56, Utlis.c(var5.r)), -16711681, -16777216));
                  }
               } else if (var4 instanceof vdtt_me) {
                  vdtt_me var29 = (vdtt_me)var4;
                  var25 = true;
                  switch(var29.O) {
                  case 18:
                     var56 = Caption.lF;
                     break;
                  case 19:
                  case 20:
                  case 21:
                  case 22:
                  case 23:
                  case 24:
                  case 25:
                  case 26:
                  case 27:
                  case 28:
                  case 29:
                  case 31:
                  case 34:
                  case 37:
                  default:
                     var25 = false;
                     break;
                  case 30:
                     var56 = Caption.xR;
                     break;
                  case 32:
                     var56 = Caption.lH;
                     break;
                  case 33:
                     var56 = Caption.lI;
                     break;
                  case 35:
                     var56 = Caption.xa;
                     break;
                  case 36:
                     var56 = Caption.lG;
                     break;
                  case 38:
                     var56 = Caption.lJ;
                  }

                  if (var25) {
                     this.N.addElement(new vdtt_ft(Utlis.b(var56, Utlis.c(var5.r)), -16711681, -16777216));
                  }
               }
            }

            if (this.M != null) {
               this.N.addElement(new vdtt_ft(Caption.gF + Utlis.c(this.M.bac), -2560, -16777216));
            } else if (var5.c() > 0) {
               this.N.addElement(new vdtt_ft(Caption.gF + Utlis.c(var5.e()), -16711681, -16777216));
            } else {
               this.N.addElement(new vdtt_ft(Caption.gG + var5.g(), -16711681, -16777216));
            }

            if (var5.getItemTemplate().detail.length() > 0) {
               String[] var35;
               if (var5.getItemTemplate().type == 34) {
                  var35 = vdtt_dd.c(vdtt_dd.d, Caption.nP + " " + var5.getItemTemplate().name, this.width - 30);
               } else {
                  var35 = vdtt_dd.c(vdtt_dd.d, var5.getItemTemplate().detail, this.width - 30);
               }

               for(var3 = 0; var3 < var35.length; ++var3) {
                  this.N.addElement(new vdtt_ft(var35[var3], -1, -16777216));
               }
            }

            if (var5.getItemTemplate().type == 15) {
               this.N.addElement(new vdtt_ft(Caption.vD, -16751509, -16777216));
            }

            if (var5.nameCreate.length() > 0) {
               this.N.addElement(new vdtt_ft(Caption.sx + " " + var5.nameCreate, -13139234, -16777216));
            }

            var25 = false;
            Item var31 = Char.gI().arrItemBody[2];
            Item var11 = Char.gI().arrItemBody[4];
            Item var12 = Char.gI().arrItemBody[6];
            Item var13 = Char.gI().arrItemBody[8];
            if (var31 != null && var11 != null && var12 != null && var13 != null && (var31.id == 923 || var31.id == 609) && (var11.id == 924 || var11.id == 624) && (var12.id == 925 || var12.id == 639) && (var13.id == 926 || var13.id == 654)) {
               for(var1 = 0; var1 < Char.gI().arrItemBody.length; ++var1) {
                  if (Char.gI().arrItemBody[var1] != null && Char.gI().arrItemBody[var1].equals(var5)) {
                     var25 = true;
                     break;
                  }
               }
            }

            ItemOption[] var14 = var5.L();
            this.a(var14, var6, var25);
            if (var5.id == 295 || var5.id == 296 || var5.id == 297 || var5.id == 771 || var5.id == 776 || var5.id == 781 || var5.id == 786 || var5.id == 1002) {
               try {
                  Message var15;
                  (var15 = Message.c((byte)20)).writeShort(var5.id);
                  var15.send();
                  return;
               } catch (Exception var16) {
               }
            }
         } catch (Exception var17) {
            Utlis.a(var17);
         }
      }

   }

   public final void f() {
      this.O = true;
      if (this.H.getItemTemplate().type == 100) {
         this.setSize(220, 120);
      } else {
         this.setSize(250, 120);
      }

      this.L = new vdtt_hp((byte)1, 4, 4, this.width - 22, 105, 15, 1 + this.N.size());
   }

   public final void b(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      this.c(var1);
      this.a(var1, this.L);
      if (this.M != null) {
         b(var1, this.width - 58, 3, this.M.item, false);
      } else if (this.I) {
         b(var1, this.width - 58, 3, this.H, false);
      }

      this.b(var1, 5, 7);
      int var4;
      int var5;
      if (this.H.i() || this.H.level > 0) {
         var4 = 7;
         if (this.H.level >= 14) {
            var4 = this.H.level - 7;
         }

         for(var5 = 0; var5 < var4; ++var5) {
            vdtt_cz.a(var1, 440, 0, 6 + var5 * 20, 22, 6);
            if (this.H.level > 0) {
               if (this.H.level >= 15) {
                  if (var5 == this.P) {
                     vdtt_cz.a(var1, 420, 0, 6 + var5 * 20, 22, 6);
                  } else {
                     vdtt_cz.a(var1, 440, 0, 6 + var5 * 20 + 1, 23, 6);
                     var1.c(180.0F);
                     vdtt_cz.a(var1, 432 + DataCenter.gI().h / 8 % 4, 0, 6 + var5 * 20, 22, 6);
                     var1.r();
                  }
               } else {
                  if (this.H.level >= 2 && this.H.level / 2 > var5) {
                     if (var5 == this.P) {
                        vdtt_cz.a(var1, 420, 0, 6 + var5 * 20, 22, 6);
                     } else if (this.H.level >= 14) {
                        vdtt_cz.a(var1, 432 + DataCenter.gI().h / 8 % 4, 0, 6 + var5 * 20, 22, 6);
                     } else if (this.H.level >= 12) {
                        vdtt_cz.a(var1, 430, 0, 6 + var5 * 20, 22, 6);
                     } else if (this.H.level >= 10) {
                        vdtt_cz.a(var1, 428, 0, 6 + var5 * 20, 22, 6);
                     } else if (this.H.level >= 8) {
                        vdtt_cz.a(var1, 426, 0, 6 + var5 * 20, 22, 6);
                     } else if (this.H.level >= 6) {
                        vdtt_cz.a(var1, 424, 0, 6 + var5 * 20, 22, 6);
                     } else if (this.H.level >= 4) {
                        vdtt_cz.a(var1, 422, 0, 6 + var5 * 20, 22, 6);
                     } else {
                        vdtt_cz.a(var1, 420, 0, 6 + var5 * 20, 22, 6);
                     }
                  }

                  if (this.H.level % 2 > 0 && this.H.level / 2 == var5) {
                     if (var5 == this.P) {
                        vdtt_cz.a(var1, 421, 0, 6 + var5 * 20, 22, 6);
                     } else if (this.H.level >= 16) {
                        vdtt_cz.a(var1, 433, 0, 6 + var5 * 20, 22, 6);
                     } else if (this.H.level >= 14) {
                        vdtt_cz.a(var1, 433, 0, 6 + var5 * 20, 22, 6);
                     } else if (this.H.level >= 12) {
                        vdtt_cz.a(var1, 431, 0, 6 + var5 * 20, 22, 6);
                     } else if (this.H.level >= 10) {
                        vdtt_cz.a(var1, 429, 0, 6 + var5 * 20, 22, 6);
                     } else if (this.H.level >= 8) {
                        vdtt_cz.a(var1, 427, 0, 6 + var5 * 20, 22, 6);
                     } else if (this.H.level >= 6) {
                        vdtt_cz.a(var1, 425, 0, 6 + var5 * 20, 22, 6);
                     } else if (this.H.level >= 4) {
                        vdtt_cz.a(var1, 423, 0, 6 + var5 * 20, 22, 6);
                     } else {
                        vdtt_cz.a(var1, 421, 0, 6 + var5 * 20, 22, 6);
                     }
                  }
               }
            }
         }
      }

      this.a(var1, 0, false);
      ItemOption var6;
      if (this.H.getItemTemplate().type == 99 && this.H.strData != null && this.H.strData.length() > 0 && (var6 = this.H.L()[0]).option != null && var6.option.length > 4) {
         vdtt_cz.a(var1, var6.option[4], 0, 40, (this.N.size() - 2) * this.L.h, 0);
      }

      this.a(var1);
      this.a(var1, var2, var3);
      this.L.a(var1);
      this.a(var1, this.m, var2, var3);
      Graphics var7 = var1;
      vdtt_bl var8 = this;
      var3 = var1.e;
      var4 = var1.f;
      this.a(var1, super.cx, super.cy);
      var1.f(-65536);
      if (super.p != null) {
         for(var5 = 0; var5 < var8.p.a.length; ++var5) {
            if (var8.p.a[var5] != null) {
               var7.b(var8.p.a[var5].c, var8.p.a[var5].d, var8.p.a[var5].e - var8.p.a[var5].c, var8.p.a[var5].f - var8.p.a[var5].d);
            }
         }
      }

      var8.a(var7, var3, var4);
   }

   public final void a(Graphics var1, int var2, boolean var3) {
      int var4 = this.L.h + 8;
      if (var2 > 0) {
         var4 = this.L.h + 12;
      }

      int var5 = 0;

      for(int var6 = 0; var6 < this.N.size(); ++var6) {
         if (this.L.b(var6)) {
            vdtt_ft var7 = (vdtt_ft)this.N.elementAt(var6);
            if (var2 > 0) {
               if (var7.b == -1 || var7.a.startsWith(Caption.iL + " ") || var7.a.contains(Caption.qU)) {
                  continue;
               }

               if (var5 >= var2) {
                  return;
               }
            }

            if (var3 && var7.a.toLowerCase().startsWith(Caption.uX) || !var3) {
               ++var5;
               if (var7.d) {
                  vdtt_dd.c(vdtt_dd.e, var1, var7.a, 5, var4, 0, var7.b, var7.c);
               } else {
                  vdtt_dd.c(vdtt_dd.d, var1, var7.a, 5, var4, 0, var7.b, var7.c);
               }

               if (var3) {
                  var4 += this.L.h;
               }
            }
         }

         if (!var3) {
            var4 += this.L.h;
         }
      }

   }

   private void a(Vector var1, vdtt_w var2, vdtt_jo var3) {
      if (this.H.getItemTemplate().levelNeed <= Char.gI().w() && (this.H.getItemTemplate().gioiTinh == 2 || this.H.getItemTemplate().gioiTinh == Char.gI().gioiTinh)) {
         if (var3.z() == 0) {
            if (!this.H.m() || Char.gI().an >= this.H.getItemTemplate().phamChatNeed) {
               if (this.H.T()) {
                  if (this.H.getItemTemplate().type != 99 || this.H.strData != null && this.H.strData.length() != 0) {
                     if (this.H.z()) {
                        var1.add(new vdtt_ay(this.width - 51, this.height - 26, 0, 0, Caption.xS, var2, 174, 15));
                     } else if (!this.H.i() || !(var2 instanceof vdtt_jx)) {
                        var1.add(new vdtt_ay(this.width - 51, this.height - 26, 0, 0, Caption.z, var2, 104, 15));
                     }
                  } else {
                     var1.add(new vdtt_ay(this.width - 51, this.height - 26, 0, 0, Caption.gM, var2, 131, 15));
                  }
               }

               label101: {
                  if (!this.H.y()) {
                     byte var4 = this.H.getItemTemplate().type;
                     GameSrc.gI();
                     if (var4 != 14) {
                        var4 = this.H.getItemTemplate().type;
                        GameSrc.gI();
                        if (var4 != 15) {
                           var4 = this.H.getItemTemplate().type;
                           GameSrc.gI();
                           if (var4 != 10) {
                              break label101;
                           }
                        }
                     }
                  }

                  if (!this.H.x() && !(var2 instanceof vdtt_jx)) {
                     var1.add(new vdtt_ay(this.width - 51, this.height - 26, 0, 0, Caption.gN, var2, 127, 15));
                  }
               }

               if ((this.H.id == 923 || this.H.id == 609) && Char.gI().arrItemBody[2] != null || (this.H.id == 924 || this.H.id == 624) && Char.gI().arrItemBody[4] != null || (this.H.id == 925 || this.H.id == 639) && Char.gI().arrItemBody[6] != null || (this.H.id == 926 || this.H.id == 654) && Char.gI().arrItemBody[8] != null) {
                  var1.add(new vdtt_ay(this.width - 51, this.height - 26, 0, 0, Caption.hC, var2, 173, 15));
               }
            }
         } else if (var3.z() == 1) {
            var1.add(new vdtt_ay(this.width - 51, this.height - 26, 105, 0, Caption.bm, var2, 108, 15));
         }
      }

      if (!this.H.isLock) {
         var1.add(new vdtt_ay(this.width - 51, this.height - 26, 0, 0, Caption.A, var2, 109, 15));
      }

      if (this.H.M() >= 2 && this.H.id != 826) {
         var1.add(new vdtt_ay(this.width - 51, this.height - 26, 0, 0, Caption.B, var2, 102, 15));
      }

      if (this.H.T() && this.H.id != GameSrc.gI().bY) {
         var1.add(this.Q = new vdtt_ay(this.width - 51, this.height - 26, 0, 0, Caption.cy_, var2, 137, 15));
      }

      if (this.H.id == 910 && this.H.isLock) {
         var1.add(new vdtt_ay(this.width - 51, this.height - 26, 0, 0, Caption.qC, var2, 172, 15));
      }

   }

   public final void a_() {
      if (this.O) {
         for(int var1 = 1; var1 < this.m.length; ++var1) {
            this.m[var1].b(true);
         }
      }

      a(this.m, this.n);
      this.L.a();
      if (DataCenter.gI().h % 5 == 0) {
         if ((this.H.level < 8 || this.H.level > 11) && (this.H.level < 12 || this.H.level > 16)) {
            if (this.H.level >= 17) {
               ++this.P;
               if (this.P > this.H.level - 8) {
                  this.P = 0;
               }
            }
         } else {
            ++this.P;
            if (this.P > this.H.level / 2) {
               this.P = 0;
            }
         }
      }

      if (J != null) {
         Item var5;
         (var5 = new Item()).strData = J;
         this.a(var5.L(), new Vector(), true);
         J = null;
      }

      DataCenter.gI();
      if (!DataCenter.b() && (!(this.a instanceof vdtt_ao) || ((vdtt_ao)this.a).a.b != 0) && this.a.k.equals(this)) {
         vdtt_ii var6 = GameSrc.gI().T();
         int var2 = this.a.cx + this.cx + this.width + AppListener.gI().m() / 2;
         int var3 = this.a.cy + this.cy + this.height;
         switch(GameSrc.gI().idTask) {
         case 1:
            if (GameSrc.gI().idStep == 1 && this.H.id == 378) {
               DataCenter.gI().pointHelper.a(var2 - 70, var3 - 12);
               DataCenter.gI().pointHelper.b = true;
               return;
            }
         case 2:
         case 3:
         case 5:
         case 7:
         default:
            break;
         case 4:
            if (GameSrc.gI().idStep == 0) {
               DataCenter.gI().pointHelper.a(var2 - 70, var3 - 12);
               DataCenter.gI().pointHelper.b = true;
               return;
            }
            break;
         case 6:
            if (GameSrc.gI().idStep >= 0 && this.H.id == 380 && var6 != null && Char.gI().cx == var6.g && Char.gI().cy == var6.h) {
               DataCenter.gI().pointHelper.a(var2 - 35, var3 - 12);
               DataCenter.gI().pointHelper.b = true;
               return;
            }
            break;
         case 8:
            Item var4 = Char.gI().C();
            if (GameSrc.gI().idStep == 9 && var4 != null && this.H.id == var4.id) {
               DataCenter.gI().pointHelper.a(var2 - 35, var3 - 12);
               DataCenter.gI().pointHelper.b = true;
               return;
            }
            break;
         case 9:
            if (GameSrc.gI().idStep == 10 && this.a instanceof vdtt_na) {
               label90: {
                  if (((vdtt_na)this.a).a.b == ((vdtt_na)this.a).w()) {
                     if (this.H.getItemTemplate().type != 1 && this.H.getItemTemplate().type != 21) {
                        break label90;
                     }

                     if (GameSrc.gI().bY != this.H.id) {
                        if (this.H.T()) {
                           if (this.H.isLock) {
                              DataCenter.gI().pointHelper.a(var2 - 70, var3 - 12);
                           } else {
                              DataCenter.gI().pointHelper.a(var2 - 105, var3 - 12);
                           }
                           break label90;
                        }

                        if (!this.H.isLock) {
                           DataCenter.gI().pointHelper.a(var2 - 70, var3 - 12);
                           break label90;
                        }
                     }
                  }

                  DataCenter.gI().pointHelper.a(var2 - 35, var3 - 12);
               }

               DataCenter.gI().pointHelper.b = true;
               return;
            }
            break;
         case 10:
            if (GameSrc.gI().idStep == 5 && this.a instanceof vdtt_ml) {
               DataCenter.gI().pointHelper.a(var2 - 70, var3 - 12);
               DataCenter.gI().pointHelper.b = true;
               return;
            }
            break;
         case 11:
            if (this.a instanceof vdtt_jy) {
               DataCenter.gI().pointHelper.a(var2 - 35, var3 - 12);
               DataCenter.gI().pointHelper.b = true;
            }
         }
      }

   }

   public final Vector g() {
      Vector var1 = new Vector();
      if (this.O) {
         var1.addElement(this.n[0].a(this.m[0].m, this));
      } else {
         for(int var2 = 0; var2 < this.n.length; ++var2) {
            var1.addElement(this.n[var2].a(this.m[var2].m, this));
         }
      }

      var1.addElement(new vdtt_hi(1010, this.L.cx, this.L.cy, this.L.cx + this.L.width, this.L.cy + this.L.height, this.L, this));
      var1.addElement(new vdtt_hi(1011, 0, 0, this.width, this.height, this.L, this));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      Message var4;
      vdtt_bl var5;
      Message var6;
      Item[] var7;
      boolean var9;
      vdtt_lj var10;
      vdtt_ll var11;
      vdtt_jo var12;
      vdtt_ll var13;
      switch(var1.b) {
      case 100:
         this.n();
         break;
      case 101:
         this.n();
         if (this.a instanceof vdtt_me) {
            (var12 = (vdtt_jo)this.a).H.a((vdtt_w)(new vdtt_jt(var12.H, this.H, ((vdtt_me)this.a).O)));
         } else if (this.a instanceof vdtt_ll) {
            if ((var11 = (vdtt_ll)this.a).a.b == 3) {
               var11.H.a((vdtt_w)(new vdtt_jt(var11.H, this.H, (byte)40)));
            } else {
               var11.H.a((vdtt_w)(new vdtt_jt(var11.H, this.H, (byte)6)));
            }
         }
         break;
      case 102:
         this.n();
         (var12 = (vdtt_jo)this.a).H.a((vdtt_w)(new vdtt_mg(var12.H, this.H)));
         break;
      case 103:
         this.n();
         if (this.H.level > 9 && this.H.y()) {
            DataCenter.gI().currentScreen.c(Caption.bg, -65536);
         } else {
            vdtt_jo var44;
            if (this.a instanceof vdtt_jo && (var44 = (vdtt_jo)this.a).ah != null && var44.ah.m) {
               GameSrc.gI();
               GameSrc.a(this.H, false);
            } else {
               DataCenter.gI().currentScreen.a(Caption.bh, 2000, this);
            }
         }
         break;
      case 104:
         this.n();
         this.l();
         break;
      case 105:
         this.n();
         var5 = this;

         try {
            (var6 = new Message((byte)113)).writeByte(var5.H.getItemTemplate().type);
            var6.send();
         } catch (Exception var43) {
            Utlis.a(var43);
         }
         break;
      case 106:
         this.n();
         var5 = this;

         try {
            (var6 = new Message((byte)115)).writeShort(var5.H.index);
            var6.send();
         } catch (Exception var42) {
            Utlis.a(var42);
         }
         break;
      case 107:
         this.n();
         var5 = this;

         try {
            (var6 = new Message((byte)114)).writeShort(var5.H.index);
            var6.send();
         } catch (Exception var41) {
            Utlis.a(var41);
         }
         break;
      case 108:
         this.n();
         var5 = this;

         try {
            (var6 = new Message((byte)112)).writeByte(var5.H.index);
            var6.send();
         } catch (Exception var40) {
            Utlis.a(var40);
         }
         break;
      case 109:
         this.n();
         Item var14;
         if (((var14 = this.H).id < 5 || var14.id > 11) && var14.id != 231 && var14.id != 176 && var14.id != 160 && var14.id != 161 && var14.id != 169 && var14.id != 170 && var14.id != 156 && var14.id != 157 && var14.id != 158 && var14.id != 159 && var14.id != 162 && var14.id != 823 && var14.id != 166 && var14.id != 168 && var14.id != 182 && var14.id != 183 && var14.id != 184 && var14.id != 177) {
            this.m();
         } else {
            DataCenter.gI().currentScreen.a(Caption.gO + this.H.getItemTemplate().name + Caption.eu, 2005, this);
         }
         break;
      case 110:
         this.n();
         this.N();
         break;
      case 111:
         this.n();
         this.O();
         break;
      case 112:
         this.n();
         this.x();
         break;
      case 113:
         this.n();
         this.y();
         break;
      case 114:
         this.n();
         var5 = this;

         try {
            vdtt_mj var47;
            var7 = (var47 = (vdtt_mj)var5.a).a(var5.H);
            a(var47.N[0]);
            var47.N[0] = var5.H;
            var7[var5.H.index] = null;
         } catch (Exception var39) {
            Utlis.a(var39);
         }
         break;
      case 115:
         this.n();
         this.z();
         break;
      case 116:
         this.n();
         var5 = this;

         try {
            vdtt_kj var46;
            var7 = (var46 = (vdtt_kj)var5.a).a(var5.H);
            if (var5.H.getItemTemplate().type == 25) {
               a(var46.N[2]);
               var46.N[2] = var5.H;
               var7[var5.H.index] = null;
            } else if (var5.H.level > 0) {
               a(var46.N[0]);
               var46.N[0] = var5.H;
               var7[var5.H.index] = null;
            } else {
               a(var46.N[1]);
               var46.N[1] = var5.H;
               var7[var5.H.index] = null;
            }
         } catch (Exception var38) {
            Utlis.a(var38);
         }
         break;
      case 117:
         this.n();
         this.A();
         break;
      case 118:
         this.n();
         this.D();
         break;
      case 119:
         this.n();
         this.E();
         break;
      case 120:
         this.n();
         var5 = this;

         try {
            if ((var11 = (vdtt_ll)var5.a).N != null) {
               Char.gI().arrItemBag[var11.N.index] = var11.N;
            }

            var11.N = var5.H;
            Char.gI().arrItemBag[var5.H.index] = null;
            var9 = true;
            var11.f(1);
         } catch (Exception var37) {
            Utlis.a(var37);
         }
         break;
      case 121:
         this.n();
         var11 = (vdtt_ll)this.a;
         Char.gI().arrItemBag[var11.N.index] = var11.N;
         var11.N = null;
         break;
      case 122:
         this.n();
         var13 = (vdtt_ll)this.a;
         var9 = true;
         var13.b(true, var13.V[var13.W]);
         break;
      case 123:
         this.n();
         var5 = this;

         try {
            if ((var10 = (vdtt_lj)var5.a).S != null) {
               Char.gI().arrItemBag[var10.S.index] = var10.S;
            }

            var10.S = var5.H;
            Char.gI().arrItemBag[var5.H.index] = null;
         } catch (Exception var36) {
            Utlis.a(var36);
         }
         break;
      case 124:
         this.n();
         var10 = (vdtt_lj)this.a;
         Char.gI().arrItemBag[var10.S.index] = var10.S;
         var10.S = null;
         break;
      case 125:
         this.n();
         this.P();
         break;
      case 126:
         this.n();
         this.Q();
         break;
      case 127:
         this.n();
         if (this.H.i() && !this.H.isLock) {
            DataCenter.gI().currentScreen.a(Caption.ch, 2002, this);
         } else {
            this.R();
         }
         break;
      case 128:
         this.n();
         var5 = this;

         try {
            (var6 = new Message((byte)37)).writeByte(var5.H.getItemTemplate().type);
            var6.send();
         } catch (Exception var35) {
            Utlis.a(var35);
         }
         break;
      case 129:
         this.n();
         this.S();
         break;
      case 130:
         this.n();
         this.U();
         break;
      case 131:
         this.n();
         var5 = this;

         try {
            (var6 = new Message((byte)-3)).writeShort(var5.H.index);
            var6.send();
         } catch (Exception var34) {
            Utlis.a(var34);
         }
         break;
      case 132:
         this.n();
         var13 = (vdtt_ll)this.a;
         var9 = true;
         var13.a(true, var13.V[var13.W]);
         break;
      case 134:
         this.n();
         DataCenter.gI().currentScreen.a(Caption.gQ + Utlis.c(this.M.bac) + Caption.eu, Caption.bY, 2003, 2004, this);
         break;
      case 135:
         this.n();
         this.T();
         break;
      case 136:
         this.n();
         this.V();
         break;
      case 137:
         this.n();
         GameSrc.gI().a(this.H.id, true);
         break;
      case 138:
         this.n();
         this.B();
         break;
      case 139:
         this.n();
         this.C();
         break;
      case 140:
         this.n();
         var5 = this;

         try {
            vdtt_kf var45 = (vdtt_kf)var5.a;
            (var4 = Message.c((byte)-90)).writeShort(var45.X.indexOf(var5.H));
            var4.send();
         } catch (Exception var33) {
         }
         break;
      case 141:
         this.n();
         var5 = this;

         try {
            ((vdtt_kf)var5.a).a(var5.H);
         } catch (Exception var32) {
         }
         break;
      case 143:
         this.n();
         this.F();
         break;
      case 144:
         this.n();
         this.G();
         break;
      case 145:
         this.n();
         this.X();
         break;
      case 146:
         this.n();
         this.Y();
         break;
      case 149:
         this.n();
         this.l();
         break;
      case 150:
         this.n();
         this.o();
         break;
      case 151:
         this.n();
         this.p();
         break;
      case 152:
         this.n();
         vdtt_ks var15;
         (var15 = (vdtt_ks)this.a).b(this.H);
         var15.C();
         break;
      case 153:
         this.n();
         var5 = this;

         try {
            vdtt_mh var50;
            var7 = (var50 = (vdtt_mh)var5.a).a(var5.H);
            a(var50.N[0]);
            var50.N[0] = var5.H;
            var50.C();
            var7[var5.H.index] = null;
         } catch (Exception var31) {
            Utlis.a(var31);
         }
         break;
      case 154:
         this.n();
         this.q();
         break;
      case 155:
         this.n();
         this.Z();
         break;
      case 156:
         this.n();
         this.aa();
         break;
      case 157:
         this.n();
         this.H();
         break;
      case 158:
         this.n();
         this.I();
         break;
      case 159:
         this.n();
         this.J();
         break;
      case 160:
         this.n();
         this.K();
         break;
      case 161:
         this.n();
         this.L();
         break;
      case 162:
         this.n();
         this.M();
         break;
      case 163:
         this.n();
         this.v();
         break;
      case 164:
         this.n();
         this.w();
         break;
      case 165:
         this.n();
         var5 = this;

         try {
            vdtt_kk var49;
            var7 = (var49 = (vdtt_kk)var5.a).a(var5.H);
            if (var5.H.id == 684) {
               a(var49.aa[2]);
               var49.aa[2] = var5.H;
               var7[var5.H.index] = null;
            } else if (var5.H.level > 0) {
               a(var49.aa[0]);
               var49.aa[0] = var5.H;
            } else {
               a(var49.aa[1]);
               var49.aa[1] = var5.H;
            }

            var7[var5.H.index] = null;
         } catch (Exception var30) {
            Utlis.a(var30);
         }
         break;
      case 166:
         this.n();
         var5 = this;

         try {
            vdtt_ky var48;
            var7 = (var48 = (vdtt_ky)var5.a).a(var5.H);
            if (var5.H.y() && var5.H.level >= 14) {
               if (var48.N[0] == null) {
                  var48.N[0] = var5.H;
               } else if (var48.O[0] == null) {
                  var48.O[0] = var5.H;
               } else {
                  Char.gI().i(var48.O[0].w)[var48.O[0].index] = var48.O[0];
                  var48.O[0] = var5.H;
               }
            }

            var7[var5.H.index] = null;
         } catch (Exception var29) {
            Utlis.a(var29);
         }
         break;
      case 167:
         this.n();
         this.W();
         break;
      case 168:
         this.H.w = 2;
         GameSrc.gI().a((vdtt_w)(new vdtt_ju(GameSrc.gI(), this.H)));
         break;
      case 169:
         this.H.w = 3;
         GameSrc.gI().a((vdtt_w)(new vdtt_ju(GameSrc.gI(), this.H)));
         break;
      case 170:
         this.n();
         if (!this.H.al()) {
            if (this.H.id == 189) {
               DataCenter.gI().currentScreen.a(Utlis.b(Caption.xj, Utlis.k(250)), 2007, this);
               return;
            }

            DataCenter.gI().currentScreen.a(Utlis.b(Caption.xj, Utlis.k(500)), 2007, this);
            return;
         }

         ItemOption[] var16 = this.H.L();

         for(var3 = 0; var3 < var16.length; ++var3) {
            if (var16[var3].option[0] == 413 && var16[var3].option[1] != var16[var3].f()) {
               DataCenter.gI().currentScreen.c(Caption.xd, -65536);
               return;
            }
         }

         short var17 = 0;
         switch(this.H.id) {
         case 189:
            var17 = 150;
            break;
         case 276:
            var17 = 300;
            break;
         case 306:
            var17 = 450;
            break;
         case 476:
            var17 = 600;
            break;
         case 477:
            var17 = 800;
            break;
         case 478:
            var17 = 1000;
            break;
         case 479:
            var17 = 1200;
            break;
         case 480:
            var17 = 1400;
            break;
         case 481:
            var17 = 1600;
            break;
         case 482:
            var17 = 1800;
            break;
         case 483:
            var17 = 2000;
            break;
         case 484:
            DataCenter.gI().currentScreen.c(Caption.xf, -2560);
            return;
         }

         DataCenter.gI().currentScreen.a(Utlis.b(Caption.xe, Utlis.k(var17)), 2007, this);
         break;
      case 171:
         this.n();

         try {
            Message.c((byte)12).send();
         } catch (Exception var28) {
         }
         break;
      case 172:
         this.n();
         var2 = this.H.M() / 70;
         if (this.H.M() % 70 != 0) {
            ++var2;
         }

         DataCenter.gI().currentScreen.a(Caption.qC + " " + this.H.M() + " " + this.H.getItemTemplate().name.toLowerCase() + " " + Utlis.b(Caption.xh, Utlis.c(var2)), 2001, this);
         break;
      case 173:
         this.n();
         DataCenter.gI().currentScreen.a(Caption.xi, 2008, this);
         break;
      case 174:
         String var18 = "";
         ItemOption var19 = this.H.L()[0];

         Item var21;
         for(int var20 = 0; var20 < Char.gI().arrItemBody.length; ++var20) {
            if ((var21 = Char.gI().arrItemBody[var20]) != null && (var21.getItemTemplate().type == 2 || var21.getItemTemplate().type == 4 || var21.getItemTemplate().type == 6 || var21.getItemTemplate().type == 8)) {
               ItemOption[] var22 = var21.L();
               String var23 = "";

               for(int var24 = 0; var24 < var22.length; ++var24) {
                  if (var22[var24].getItemOptionTemplate().type == var19.getItemOptionTemplate().type) {
                     var23 = var23 + Caption.xT + " " + var22[var24].d() + ",";
                  }
               }

               if (var23.endsWith(",")) {
                  var23 = var23.substring(0, var23.length() - 1);
               }

               if (var23.length() > 0) {
                  var18 = var18 + Caption.xT + " " + var21.getItemTemplate().name + "," + var23 + ";";
               }
            }
         }

         if (var18.endsWith(";")) {
            var18 = var18.substring(0, var18.length() - 1);
         }

         if (var18.length() > 0) {
            GameSrc var51 = GameSrc.gI();
            var21 = this.H;
            vdtt_w var52;
            if ((var52 = var51.c) instanceof vdtt_jo) {
               vdtt_jo var53;
               (var53 = (vdtt_jo)var52).a(var21, var18);
            }
         } else {
            this.n();
            DataCenter.gI().currentScreen.c(this.H.getItemTemplate().detail, -1);
         }
         break;
      case 2000:
         GameSrc.gI();
         GameSrc.a(this.H, false);
         break;
      case 2001:
         GameSrc.gI().a(this.H);
         break;
      case 2002:
         this.R();
         break;
      case 2003:
         var5 = this;

         try {
            (var6 = new Message((byte)98)).writeLong(var5.M.id);
            var6.send();
         } catch (Exception var27) {
            Utlis.a(var27);
         }
      case 2004:
      default:
         break;
      case 2005:
         this.m();
         break;
      case 2006:
         this.k();
         break;
      case 2007:
         try {
            Message.c((byte)11).send();
         } catch (Exception var26) {
         }
         break;
      case 2008:
         try {
            (var4 = new Message((byte)104)).writeShort(this.H.index);
            var4.send();
         } catch (Exception var25) {
         }
      }

      if (var1.b != 1010 && var1.b == 1011) {
      }

   }

   private void k() {
      if (!GameSrc.gI().ac()) {
         SettingsTab.K().b(false);

         try {
            Message var1;
            (var1 = new Message((byte)111)).writeShort(this.H.index);
            var1.send();
         } catch (Exception var2) {
            Utlis.a(var2);
         }
      }

   }

   public final void b(Graphics var1, int var2, int var3) {
      if (this.H.level > 0) {
         String var4 = this.H.getItemTemplate().name + " (" + this.H.ah() + ")";
         if (this.H.level >= 15) {
            vdtt_dd.a(vdtt_dd.f, var1, var4, var2 + 1, var3 + 1, 0, -16777216, 2, 1, 2, 1);
            vdtt_dd.a(vdtt_dd.f, var1, var4, var2, var3, 0, a(this.H.level), 2, 1, 2, 1);
         } else if (this.H.level == 14) {
            vdtt_dd.a(vdtt_dd.f, var1, var4, var2 + 1, var3, 0, -10026109, 2, 1, 0, 1);
            vdtt_dd.a(vdtt_dd.f, var1, var4, var2, var3, 0, a(this.H.level), 2, 0, 2, 1);
         } else if (this.H.level >= 12) {
            vdtt_dd.a(vdtt_dd.f, var1, var4, var2 + 1, var3, 0, -16702647, 2, 1, 0, 1);
            vdtt_dd.a(vdtt_dd.f, var1, var4, var2, var3, 0, a(this.H.level), 3, 0);
         } else {
            if (this.H.level < 8) {
               vdtt_dd.b(vdtt_dd.f, var1, var4, var2, var3, 0, a(this.H.level), 0);
               return;
            }

            vdtt_dd.a(vdtt_dd.f, var1, var4, var2, var3, 0, a(this.H.level), 3, 0);
         }
      } else {
         if (this.H.id == 826 && this.H.isLock) {
            vdtt_dd.b(vdtt_dd.f, var1, Utlis.b(Caption.vP, Utlis.c(this.H.M())), var2, var3, 0, -1, -16777216);
            return;
         }

         if (this.H.ae()) {
            vdtt_dd.b(vdtt_dd.f, var1, Utlis.c(this.H.M()) + " " + this.H.getItemTemplate().name, var2, var3, 0, -1, -16777216);
            return;
         }

         vdtt_dd.b(vdtt_dd.f, var1, this.H.getItemTemplate().name, var2, var3, 0, -1, -16777216);
      }

   }

   private static int a(int var0) {
      if (var0 >= 15) {
         return -8323328;
      } else if (var0 >= 14) {
         return -2531077;
      } else if (var0 >= 12) {
         return -10901507;
      } else if (var0 >= 10) {
         return -59610;
      } else if (var0 >= 8) {
         return -130396;
      } else if (var0 >= 6) {
         return -1909717;
      } else {
         return var0 >= 4 ? -286419 : -1;
      }
   }

   private static String a(int var0, int var1) {
      try {
         switch(var0) {
         case 0:
            return Caption.yM[3] + " (" + Caption.yJ[var1 - 1] + "), " + Caption.yM[4] + " (" + Caption.yJ[var1 - 1] + ")";
         case 1:
            return Caption.aJ + " (" + Caption.yJ[var1 - 1] + ") " + Caption.aP + " (" + Caption.yJ[var1 - 1] + ")";
         case 2:
            return Caption.yM[7] + " (" + Caption.yJ[var1 - 1] + "), " + Caption.yM[8] + " (" + Caption.yJ[var1 - 1] + ")";
         case 3:
            return Caption.yM[0] + " (" + Caption.yJ[var1 - 1] + "), " + Caption.yM[4] + " (" + Caption.yJ[var1 - 1] + ")";
         case 4:
            return Caption.yM[0] + " (" + Caption.yJ[var1 - 1] + "), " + Caption.yM[3] + " (" + Caption.yJ[var1 - 1] + ")";
         case 5:
            return Caption.yM[6] + " (" + Caption.yJ[var1 - 1] + "), " + Caption.yM[9] + " (" + Caption.yJ[var1 - 1] + ")";
         case 6:
            return Caption.yM[5] + " (" + Caption.yJ[var1 - 1] + "), " + Caption.yM[9] + " (" + Caption.yJ[var1 - 1] + ")";
         case 7:
            return Caption.yM[2] + " (" + Caption.yJ[var1 - 1] + "), " + Caption.yM[8] + " (" + Caption.yJ[var1 - 1] + ")";
         case 8:
            return Caption.yM[2] + " (" + Caption.yJ[var1 - 1] + "), " + Caption.yM[7] + " (" + Caption.yJ[var1 - 1] + ")";
         case 9:
            return Caption.yM[6] + " (" + Caption.yJ[var1 - 1] + "), " + Caption.yM[5] + " (" + Caption.yJ[var1 - 1] + ")";
         }
      } catch (Exception var3) {
         Utlis.a(var3);
      }

      return "";
   }

   private void l() {
      if (this.H.ad()) {
         vdtt_jo var1;
         (var1 = (vdtt_jo)this.a).H.a((vdtt_w)(new vdtt_ne(var1.H, this.H)));
      } else if (this.H.i() && !this.H.isLock) {
         DataCenter.gI().currentScreen.a(Caption.bl, 2001, this);
      } else if (this.H.getItemTemplate().type == 37) {
         Item var7;
         if ((var7 = Char.gI().arrItemBody[13]) == null) {
            DataCenter.gI().currentScreen.c(Caption.xW, -1);
            return;
         }

         short var2 = 0;
         switch(this.H.id) {
         case 1058:
         case 1059:
         case 1060:
         case 1061:
         case 1062:
            var2 = 465;
            break;
         case 1063:
         case 1064:
         case 1065:
         case 1066:
         case 1067:
            var2 = 466;
            break;
         case 1068:
         case 1069:
         case 1070:
         case 1071:
         case 1072:
            var2 = 467;
            break;
         case 1073:
         case 1074:
         case 1075:
         case 1076:
         case 1077:
            var2 = 468;
         }

         ItemOption var3 = this.H.L()[0];
         ItemOption[] var4 = var7.L();
         ItemOption var5 = null;
         if (var4 != null) {
            for(int var6 = 0; var6 < var4.length; ++var6) {
               if (var4[var6].option[0] == var2) {
                  var5 = var4[var6];
                  break;
               }
            }
         }

         if (var5 == null || var3.option[0] == var5.f()) {
            GameSrc.gI().a(this.H);
            return;
         }

         String var8 = this.H.getItemTemplate().name.split(":")[0];
         DataCenter.gI().currentScreen.a(var8 + Utlis.b(Caption.xX, var8), 2001, this);
      } else {
         GameSrc.gI().a(this.H);
      }

   }

   private void m() {
      if (!SettingsTab.K().G()) {
         this.k();
      } else {
         DataCenter.gI().currentScreen.a(Caption.mT, 2006, 2004, this);
      }

   }

   private void n() {
      this.a.b((vdtt_k)this);
      if (this.l != null) {
         this.a.b((vdtt_k)this.l);
      }

   }

   private void o() {
      try {
         vdtt_ks var1;
         Item[] var2 = (var1 = (vdtt_ks)this.a).a(this.H);
         int var3 = 0;

         for(int var4 = 0; var4 < var1.O.length; ++var4) {
            if (var1.O[var4] != null) {
               ++var3;
               if (var1.O[var4].id == this.H.id) {
                  DataCenter.gI().currentScreen.c(this.H.getItemTemplate().name + " " + Caption.pr, -65536);
                  return;
               }
            }
         }

         boolean var7 = false;

         int var5;
         for(var5 = 0; var5 < var1.O.length; ++var5) {
            if (var1.O[var5] == null) {
               var7 = true;
               break;
            }
         }

         if (var7 && var3 < 22) {
            for(var5 = 0; var5 < var1.O.length; ++var5) {
               if (var1.O[var5] == null) {
                  var1.O[var5] = this.H;
                  break;
               }
            }

            var1.b(var1.N[0]);
            var1.C();
            var2[this.H.index] = null;
         } else {
            DataCenter.gI().currentScreen.c(Caption.qp, -65536);
         }
      } catch (Exception var6) {
         Utlis.a(var6);
      }

   }

   private void p() {
      vdtt_ks var1;
      Item[] var2 = (var1 = (vdtt_ks)this.a).O;

      for(int var3 = 0; var3 < var2.length; ++var3) {
         if (var2[var3] != null && var2[var3].equals(this.H)) {
            Char.gI().i(this.H.w)[this.H.index] = this.H;
            var2[var3] = null;
            break;
         }
      }

      var1.b(var1.R);
      var1.C();
   }

   private void q() {
      Item[] var1 = ((vdtt_mh)this.a).N;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].equals(this.H)) {
            Char.gI().i(this.H.w)[this.H.index] = this.H;
            var1[var2] = null;
            return;
         }
      }

   }

   private void v() {
      try {
         Item[] var1;
         vdtt_jo var2;
         int var3;
         if ((!(this.a instanceof vdtt_mz) || this.H.getItemTemplate().type != 12) && (!(this.a instanceof vdtt_mi) || !this.H.C())) {
            var1 = (var2 = (vdtt_jo)this.a).a(this.H);
            if (this.H.i()) {
               a(var2.aa[0]);
               var2.aa[0] = this.H;
            } else {
               boolean var4 = false;
               var3 = 0;

               while(true) {
                  if (var3 < var2.aa.length) {
                     if (var2.aa[var3] != null) {
                        ++var3;
                        continue;
                     }

                     var2.aa[var3] = this.H;
                     var4 = true;
                  }

                  if (!var4) {
                     DataCenter.gI().currentScreen.c(Caption.gR, -65536);
                     return;
                  }
                  break;
               }
            }
         } else {
            var1 = (var2 = (vdtt_jo)this.a).a(this.H);
            a(var2.ab[0]);
            var2.ab[0] = this.H;
         }

         var1[this.H.index] = null;
         if (!(this.a instanceof vdtt_ju)) {
            if (this.a instanceof vdtt_mi) {
               vdtt_mi var12;
               if ((var12 = (vdtt_mi)this.a).ab[0] != null) {
                  var12.R.clear();
                  Item var5;
                  (var5 = var12.ab[0].a()).a(0);
                  ItemOption[] var6 = var5.L();
                  Vector var7 = new Vector();

                  for(var3 = 0; var3 < var6.length; ++var3) {
                     if (var6[var3].l()) {
                        var12.R.add(var6[var3]);
                        var7.add(DataCenter.gI().itemTemplate[var6[var3].h()].name);
                     }
                  }

                  String[] var8;
                  (var8 = new String[var7.size() + 1])[0] = Caption.ru;

                  int var9;
                  for(var9 = 0; var9 < var7.size(); ++var9) {
                     var8[var9 + 1] = (String)var7.get(var9);
                  }

                  if ((var9 = var8.length) > 8) {
                     var9 = 8;
                  }

                  vdtt_hm var10 = new vdtt_hm(1004, var8);
                  var12.Q.a(var10, var9);
                  var12.Q.a(0);
                  var12.Q.b(false);
                  return;
               }

               var12.Q.b(true);
            }

            return;
         }

         ((vdtt_ju)this.a).w();
      } catch (Exception var11) {
         Utlis.a(var11);
      }

   }

   private void w() {
      try {
         vdtt_jo var1;
         Item[] var2;
         int var3;
         if ((var2 = (var1 = (vdtt_jo)this.a).aa) != null) {
            for(var3 = 0; var3 < var2.length; ++var3) {
               if (var2[var3] != null && var2[var3].equals(this.H)) {
                  Char.gI().i(this.H.w)[this.H.index] = this.H;
                  var2[var3] = null;
                  break;
               }
            }
         }

         if (this.a instanceof vdtt_mz || this.a instanceof vdtt_mi) {
            var2 = var1.ab;

            for(var3 = 0; var3 < var2.length; ++var3) {
               if (var2[var3] != null && var2[var3].equals(this.H)) {
                  Char.gI().i(this.H.w)[this.H.index] = this.H;
                  var2[var3] = null;
                  return;
               }
            }
         }
      } catch (Exception var4) {
      }

   }

   private void x() {
      try {
         vdtt_na var1;
         Item[] var2 = (var1 = (vdtt_na)this.a).a(this.H);
         boolean var3 = false;
         if (this.H.id != 162 && this.H.id != 823) {
            if (this.H.i()) {
               a(var1.N[0]);
               var1.N[0] = this.H;
            } else {
               int var4 = 0;

               while(true) {
                  if (var4 < var1.O.length) {
                     if (var1.O[var4] != null) {
                        ++var4;
                        continue;
                     }

                     var1.O[var4] = this.H;
                     var3 = true;
                  }

                  if (!var3) {
                     DataCenter.gI().currentScreen.c(Caption.bJ, -65536);
                     return;
                  }
                  break;
               }
            }
         } else {
            a(var1.N[2]);
            var1.N[2] = this.H;
         }

         var2[this.H.index] = null;
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }

   private void y() {
      vdtt_na var1;
      Item[] var2 = (var1 = (vdtt_na)this.a).N;

      int var3;
      for(var3 = 0; var3 < var2.length; ++var3) {
         if (var2[var3] != null && var2[var3].equals(this.H)) {
            Char.gI().i(this.H.w)[this.H.index] = this.H;
            var2[var3] = null;
            break;
         }
      }

      var2 = var1.O;

      for(var3 = 0; var3 < var2.length; ++var3) {
         if (var2[var3] != null && var2[var3].equals(this.H)) {
            Char.gI().arrItemBag[this.H.index] = this.H;
            var2[var3] = null;
            return;
         }
      }

   }

   private void z() {
      Item[] var1 = ((vdtt_mj)this.a).N;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].equals(this.H)) {
            Char.gI().i(this.H.w)[this.H.index] = this.H;
            var1[var2] = null;
            return;
         }
      }

   }

   private void A() {
      Item[] var1 = ((vdtt_kj)this.a).N;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].equals(this.H)) {
            Char.gI().i(this.H.w)[this.H.index] = this.H;
            var1[var2] = null;
            return;
         }
      }

   }

   private void B() {
      try {
         boolean var1 = false;
         vdtt_nc var2;
         Item[] var3 = (var2 = (vdtt_nc)this.a).a(this.H);
         if (this.H.getItemTemplate().type == 11) {
            a(var2.aa[0]);
            var2.aa[0] = this.H;
            var3[this.H.index] = null;
         } else if (this.H.id == 310) {
            a(var2.aa[1]);
            var2.aa[1] = this.H;
            var3[this.H.index] = null;
         } else {
            int var4;
            for(var4 = 0; var4 < var2.aa.length; ++var4) {
               if (var2.aa[var4] != null && var2.aa[var4].id == this.H.id) {
                  var3[var2.aa[var4].index] = var2.aa[var4];
                  var2.aa[var4] = this.H;
                  var3[this.H.index] = null;
                  return;
               }
            }

            for(var4 = 0; var4 < var2.aa.length; ++var4) {
               if (var2.aa[var4] == null) {
                  var2.aa[var4] = this.H;
                  var1 = true;
                  break;
               }
            }

            if (!var1) {
               DataCenter.gI().currentScreen.c(Caption.gP, -65536);
            } else {
               var3[this.H.index] = null;
            }
         }
      } catch (Exception var5) {
      }

   }

   private void C() {
      try {
         boolean var1 = false;
         vdtt_jh var2;
         Item[] var3 = (var2 = (vdtt_jh)this.a).a(this.H);
         if (this.H.getItemTemplate().type == 13) {
            a(var2.aa[0]);
            var2.aa[0] = this.H;
            var3[this.H.index] = null;
         } else if (this.H.id == 685) {
            a(var2.aa[1]);
            var2.aa[1] = this.H;
            var3[this.H.index] = null;
         } else {
            int var4;
            for(var4 = 0; var4 < var2.aa.length; ++var4) {
               if (var2.aa[var4] != null && var2.aa[var4].id == this.H.id) {
                  var3[var2.aa[var4].index] = var2.aa[var4];
                  var2.aa[var4] = this.H;
                  var3[this.H.index] = null;
                  return;
               }
            }

            for(var4 = 0; var4 < var2.aa.length; ++var4) {
               if (var2.aa[var4] == null) {
                  var2.aa[var4] = this.H;
                  var1 = true;
                  break;
               }
            }

            if (!var1) {
               DataCenter.gI().currentScreen.c(Caption.gP, -65536);
            } else {
               var3[this.H.index] = null;
            }
         }
      } catch (Exception var5) {
      }

   }

   private void D() {
      try {
         vdtt_nb var1;
         Item[] var2 = (var1 = (vdtt_nb)this.a).a(this.H);
         if (this.H.getItemTemplate().type == 13) {
            a(var1.N[0]);
            var1.N[0] = this.H;
            var2[this.H.index] = null;
         } else {
            boolean var3 = false;
            int var4 = 0;

            while(true) {
               if (var4 < var1.O.length) {
                  if (var1.O[var4] != null) {
                     ++var4;
                     continue;
                  }

                  var1.O[var4] = this.H;
                  var3 = true;
               }

               if (!var3) {
                  DataCenter.gI().currentScreen.c(Caption.bT, -65536);
                  return;
               }
               break;
            }
         }

         var2[this.H.index] = null;
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }

   private void E() {
      vdtt_nb var1;
      Item[] var2 = (var1 = (vdtt_nb)this.a).N;

      int var3;
      for(var3 = 0; var3 < var2.length; ++var3) {
         if (var2[var3] != null && var2[var3].equals(this.H)) {
            Char.gI().i(this.H.w)[this.H.index] = this.H;
            var2[var3] = null;
            break;
         }
      }

      var2 = var1.O;

      for(var3 = 0; var3 < var2.length; ++var3) {
         if (var2[var3] != null && var2[var3].equals(this.H)) {
            Char.gI().arrItemBag[this.H.index] = this.H;
            var2[var3] = null;
            return;
         }
      }

   }

   private void F() {
      try {
         vdtt_mw var1;
         Item[] var2 = (var1 = (vdtt_mw)this.a).a(this.H);
         if (this.H.i()) {
            a(var1.N[0]);
            var1.N[0] = this.H;
         } else {
            boolean var3 = false;
            int var4 = 0;

            while(true) {
               if (var4 < var1.O.length) {
                  if (var1.O[var4] != null) {
                     ++var4;
                     continue;
                  }

                  var1.O[var4] = this.H;
                  var3 = true;
               }

               if (!var3) {
                  DataCenter.gI().currentScreen.c(Caption.qi, -65536);
                  return;
               }
               break;
            }
         }

         var2[this.H.index] = null;
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }

   private void G() {
      vdtt_mw var1;
      Item[] var2 = (var1 = (vdtt_mw)this.a).N;

      int var3;
      for(var3 = 0; var3 < var2.length; ++var3) {
         if (var2[var3] != null && var2[var3].equals(this.H)) {
            Char.gI().i(this.H.w)[this.H.index] = this.H;
            var2[var3] = null;
            break;
         }
      }

      var2 = var1.O;

      for(var3 = 0; var3 < var2.length; ++var3) {
         if (var2[var3] != null && var2[var3].equals(this.H)) {
            Char.gI().arrItemBag[this.H.index] = this.H;
            var2[var3] = null;
            return;
         }
      }

   }

   private void H() {
      try {
         vdtt_mv var1;
         Item[] var2 = (var1 = (vdtt_mv)this.a).a(this.H);
         if (this.H.i()) {
            a(var1.N[0]);
            var1.N[0] = this.H;
         } else {
            boolean var3 = false;
            int var4 = 0;

            while(true) {
               if (var4 < var1.O.length) {
                  if (var1.O[var4] != null) {
                     ++var4;
                     continue;
                  }

                  var1.O[var4] = this.H;
                  var3 = true;
               }

               if (!var3) {
                  DataCenter.gI().currentScreen.c(Caption.qi, -65536);
                  return;
               }
               break;
            }
         }

         var2[this.H.index] = null;
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }

   private void I() {
      vdtt_mv var1;
      Item[] var2 = (var1 = (vdtt_mv)this.a).N;

      int var3;
      for(var3 = 0; var3 < var2.length; ++var3) {
         if (var2[var3] != null && var2[var3].equals(this.H)) {
            Char.gI().i(this.H.w)[this.H.index] = this.H;
            var2[var3] = null;
            break;
         }
      }

      var2 = var1.O;

      for(var3 = 0; var3 < var2.length; ++var3) {
         if (var2[var3] != null && var2[var3].equals(this.H)) {
            Char.gI().arrItemBag[this.H.index] = this.H;
            var2[var3] = null;
            return;
         }
      }

   }

   private void J() {
      try {
         vdtt_my var1;
         Item[] var2 = (var1 = (vdtt_my)this.a).a(this.H);
         if (this.H.i()) {
            a(var1.N[0]);
            var1.N[0] = this.H;
         } else {
            boolean var3 = false;
            int var4 = 0;

            while(true) {
               if (var4 < var1.O.length) {
                  if (var1.O[var4] != null) {
                     ++var4;
                     continue;
                  }

                  var1.O[var4] = this.H;
                  var3 = true;
               }

               if (!var3) {
                  DataCenter.gI().currentScreen.c(Caption.qi, -65536);
                  return;
               }
               break;
            }
         }

         var2[this.H.index] = null;
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }

   private void K() {
      vdtt_my var1;
      Item[] var2 = (var1 = (vdtt_my)this.a).N;

      int var3;
      for(var3 = 0; var3 < var2.length; ++var3) {
         if (var2[var3] != null && var2[var3].equals(this.H)) {
            Char.gI().i(this.H.w)[this.H.index] = this.H;
            var2[var3] = null;
            break;
         }
      }

      var2 = var1.O;

      for(var3 = 0; var3 < var2.length; ++var3) {
         if (var2[var3] != null && var2[var3].equals(this.H)) {
            Char.gI().arrItemBag[this.H.index] = this.H;
            var2[var3] = null;
            return;
         }
      }

   }

   private void L() {
      try {
         vdtt_mx var1;
         Item[] var2 = (var1 = (vdtt_mx)this.a).a(this.H);
         if (this.H.i()) {
            a(var1.N[0]);
            var1.N[0] = this.H;
         } else {
            boolean var3 = false;
            int var4 = 0;

            while(true) {
               if (var4 < var1.O.length) {
                  if (var1.O[var4] != null) {
                     ++var4;
                     continue;
                  }

                  var1.O[var4] = this.H;
                  var3 = true;
               }

               if (!var3) {
                  DataCenter.gI().currentScreen.c(Caption.qi, -65536);
                  return;
               }
               break;
            }
         }

         var2[this.H.index] = null;
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }

   private void M() {
      vdtt_mx var1;
      Item[] var2 = (var1 = (vdtt_mx)this.a).N;

      int var3;
      for(var3 = 0; var3 < var2.length; ++var3) {
         if (var2[var3] != null && var2[var3].equals(this.H)) {
            Char.gI().i(this.H.w)[this.H.index] = this.H;
            var2[var3] = null;
            break;
         }
      }

      var2 = var1.O;

      for(var3 = 0; var3 < var2.length; ++var3) {
         if (var2[var3] != null && var2[var3].equals(this.H)) {
            Char.gI().arrItemBag[this.H.index] = this.H;
            var2[var3] = null;
            return;
         }
      }

   }

   private void N() {
      try {
         boolean var1 = false;
         vdtt_nd var2 = (vdtt_nd)this.a;

         for(int var3 = 0; var3 < var2.O.length; ++var3) {
            if (var2.O[var3] == null) {
               var2.O[var3] = this.H;
               var1 = true;
               break;
            }
         }

         if (!var1) {
            DataCenter.gI().currentScreen.c(Caption.bJ, -65536);
         } else {
            Char.gI().arrItemBag[this.H.index] = null;
         }
      } catch (Exception var4) {
         Utlis.a(var4);
      }

   }

   private void O() {
      vdtt_nd var1;
      if ((var1 = (vdtt_nd)this.a).N != null && this.H.equals(var1.N)) {
         var1.i(this.H.index);
         var1.N = null;
      } else {
         Item[] var2 = var1.O;

         for(int var3 = 0; var3 < var2.length; ++var3) {
            if (var2[var3] != null && var2[var3].equals(this.H)) {
               Char.gI().arrItemBag[this.H.index] = this.H;
               var2[var3] = null;
               return;
            }
         }
      }

   }

   private void P() {
      try {
         boolean var1 = false;
         vdtt_mu var2 = (vdtt_mu)this.a;

         for(int var3 = 0; var3 < var2.R.length; ++var3) {
            if (var2.R[var3] == null) {
               var2.R[var3] = this.H;
               var1 = true;
               break;
            }
         }

         if (!var1) {
            DataCenter.gI().currentScreen.c(Caption.cc, -65536);
         } else {
            Char.gI().arrItemBag[this.H.index] = null;
         }
      } catch (Exception var4) {
         Utlis.a(var4);
      }

   }

   private void Q() {
      Item[] var1 = ((vdtt_mu)this.a).R;

      for(int var2 = 0; var2 < var1.length; ++var2) {
         if (var1[var2] != null && var1[var2].equals(this.H)) {
            Char.gI().arrItemBag[this.H.index] = this.H;
            var1[var2] = null;
            return;
         }
      }

   }

   private void R() {
      try {
         Message var1;
         (var1 = new Message((byte)36)).writeShort(this.H.index);
         var1.send();
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   private void S() {
      try {
         boolean var1 = false;
         vdtt_ml var2 = (vdtt_ml)this.a;

         for(int var3 = 0; var3 < var2.N.length; ++var3) {
            if (var2.N[var3] == null) {
               var2.N[var3] = this.H;
               var1 = true;
               break;
            }
         }

         if (!var1) {
            DataCenter.gI().currentScreen.c(Caption.gR, -65536);
         } else {
            Char.gI().arrItemBag[this.H.index] = null;
         }
      } catch (Exception var4) {
         Utlis.a(var4);
      }

   }

   private void T() {
      try {
         boolean var1 = false;
         vdtt_jw var2;
         Item[] var3 = (var2 = (vdtt_jw)this.a).a(this.H);
         if (var2.O != 68 && var2.O != 69 && var2.O != 70 && var2.O != 71) {
            int var4 = 0;

            while(true) {
               if (var4 < var2.N.length) {
                  if (var2.N[var4] != null) {
                     ++var4;
                     continue;
                  }

                  var2.N[var4] = this.H;
                  var1 = true;
               }

               if (!var1) {
                  DataCenter.gI().currentScreen.c(Caption.gR, -65536);
                  return;
               }
               break;
            }
         } else {
            a(var2.N[0]);
            var2.N[0] = this.H;
         }

         var3[this.H.index] = null;
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }

   private void U() {
      try {
         Item[] var1 = ((vdtt_ml)this.a).N;
         int var2 = 0;

         while(true) {
            if (var2 >= var1.length) {
               return;
            }

            if (var1[var2] != null && var1[var2].equals(this.H)) {
               Char.gI().arrItemBag[this.H.index] = this.H;
               var1[var2] = null;
               break;
            }

            ++var2;
         }
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }

   private void V() {
      try {
         Item[] var1 = ((vdtt_jw)this.a).N;
         int var2 = 0;

         while(true) {
            if (var2 >= var1.length) {
               return;
            }

            if (var1[var2] != null && var1[var2].equals(this.H)) {
               Char.gI().i(this.H.w)[this.H.index] = this.H;
               var1[var2] = null;
               break;
            }

            ++var2;
         }
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }

   private void W() {
      vdtt_ky var1;
      Item[] var2 = (var1 = (vdtt_ky)this.a).N;

      int var3;
      for(var3 = 0; var3 < var2.length; ++var3) {
         if (var2[var3] != null && var2[var3].equals(this.H)) {
            Char.gI().i(this.H.w)[this.H.index] = this.H;
            var2[var3] = null;
            break;
         }
      }

      var2 = var1.O;

      for(var3 = 0; var3 < var2.length; ++var3) {
         if (var2[var3] != null && var2[var3].equals(this.H)) {
            Char.gI().i(this.H.w)[this.H.index] = this.H;
            var2[var3] = null;
            return;
         }
      }

   }

   private void X() {
      try {
         vdtt_lo var1;
         Item[] var2 = (var1 = (vdtt_lo)this.a).a(this.H);
         if (this.H.y()) {
            a(var1.N[0]);
            var1.N[0] = this.H;
         } else {
            int var3;
            if (this.H.getItemTemplate().type == 32 && var1.O[0] != null && var1.O[0].id == this.H.id && var1.O[0].isLock != this.H.isLock) {
               for(var3 = 0; var3 < var1.O.length; ++var3) {
                  if (var1.O[var3] == null) {
                     var1.O[var3] = this.H;
                     break;
                  }
               }
            } else {
               var3 = 0;

               while(true) {
                  if (var3 >= var1.O.length) {
                     var1.O[0] = this.H;
                     break;
                  }

                  if (var1.O[var3] != null) {
                     int var4 = var1.O[var3].index;
                     Char.gI().arrItemBag[var4] = var1.O[var3];
                     var1.O[var3] = null;
                  }

                  ++var3;
               }
            }
         }

         var2[this.H.index] = null;
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }

   private void Y() {
      vdtt_lo var1;
      Item[] var2 = (var1 = (vdtt_lo)this.a).N;

      int var3;
      for(var3 = 0; var3 < var2.length; ++var3) {
         if (var2[var3] != null && var2[var3].equals(this.H)) {
            Char.gI().i(this.H.w)[this.H.index] = this.H;
            var2[var3] = null;
            break;
         }
      }

      for(var3 = 0; var3 < var1.O.length; ++var3) {
         if (var1.O[var3] != null) {
            int var4 = var1.O[var3].index;
            Char.gI().arrItemBag[var4] = var1.O[var3];
            var1.O[var3] = null;
         }
      }

   }

   private void Z() {
      try {
         boolean var1 = false;
         vdtt_le var2 = (vdtt_le)this.a;

         for(int var3 = 0; var3 < var2.N.length; ++var3) {
            if (var2.N[var3] == null) {
               var2.N[var3] = this.H;
               var1 = true;
               break;
            }
         }

         if (!var1) {
            DataCenter.gI().currentScreen.c(Caption.gR, -65536);
         } else {
            Char.gI().arrItemBag[this.H.index] = null;
         }
      } catch (Exception var4) {
         Utlis.a(var4);
      }

   }

   private void aa() {
      try {
         Item[] var1 = ((vdtt_le)this.a).N;
         int var2 = 0;

         while(true) {
            if (var2 >= var1.length) {
               return;
            }

            if (var1[var2] != null && var1[var2].equals(this.H)) {
               Char.gI().arrItemBag[this.H.index] = this.H;
               var1[var2] = null;
               break;
            }

            ++var2;
         }
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }

   public final vdtt_ay h() {
      for(int var1 = 0; var1 < this.m.length; ++var1) {
         if (this.m[var1].l.equals(Caption.bI) || this.m[var1].l.equals(Caption.bm) || this.m[var1].l.equals(Caption.bn)) {
            return this.m[var1];
         }
      }

      return null;
   }

   public final vdtt_ay i() {
      for(int var1 = 0; var1 < this.m.length; ++var1) {
         if (this.m[var1].l.equals(Caption.u) || this.m[var1].l.equals(Caption.B)) {
            return this.m[var1];
         }
      }

      return null;
   }

   public final vdtt_ay j() {
      for(int var1 = 0; var1 < this.m.length; ++var1) {
         if (this.m[var1].l.equals(Caption.z)) {
            return this.m[var1];
         }
      }

      return null;
   }

   private static void a(Item var0) {
      if (var0 != null) {
         Char.gI().i(var0.w)[var0.index] = var0;
      }

   }

   private void a(ItemOption[] var1, Vector var2, boolean var3) {
      if (var1 != null) {
         boolean var4 = false;
         int var5 = 1;

         for(int var6 = 0; var6 < var1.length; ++var6) {
            if (var1[var6].getItemOptionTemplate().text.length() == 0) {
               try {
                  Message var16 = new Message((byte)-68);
                  if (this.M != null) {
                     var16.writeByte(6);
                     var16.writeLong(this.M.id);
                  } else if (this.a instanceof vdtt_ll && this.H.equals(((vdtt_ll)this.a).I().item)) {
                     var16.writeByte(6);
                     var16.writeLong(((vdtt_ll)this.a).I().id);
                  } else if (this.a instanceof vdtt_lj && this.a.k instanceof vdtt_bn && this.H.equals(((vdtt_bn)this.a.k).l.e)) {
                     var16.writeByte(8);
                     var16.writeShort(((vdtt_bn)this.a.k).l.a);
                  } else if (this.H.c() > 0) {
                     var16.writeByte(7);
                     var16.writeShort(this.H.idBuy);
                  } else {
                     vdtt_bl var17 = this;
                     int var19 = 0;

                     byte var21;
                     label264:
                     while(true) {
                        if (var19 >= Char.gI().arrItemBody.length) {
                           for(var19 = 0; var19 < Char.gI().arrItemBody2.length; ++var19) {
                              if (Char.gI().arrItemBody2[var19] != null && Char.gI().arrItemBody2[var19].equals(var17.H)) {
                                 var21 = 5;
                                 break label264;
                              }
                           }

                           for(var19 = 0; var19 < Char.gI().arrItemBag.length; ++var19) {
                              if (Char.gI().arrItemBag[var19] != null && Char.gI().arrItemBag[var19].equals(var17.H)) {
                                 var21 = 2;
                                 break label264;
                              }
                           }

                           if (Char.gI().arrItemBox != null) {
                              for(var19 = 0; var19 < Char.gI().arrItemBox.length; ++var19) {
                                 if (Char.gI().arrItemBox[var19] != null && Char.gI().arrItemBox[var19].equals(var17.H)) {
                                    var21 = 3;
                                    break label264;
                                 }
                              }
                           }

                           var21 = 9;
                           break;
                        }

                        if (Char.gI().arrItemBody[var19] != null && Char.gI().arrItemBody[var19].equals(var17.H)) {
                           var21 = 4;
                           break;
                        }

                        ++var19;
                     }

                     var16.writeByte(var21);
                     if (var21 == 9) {
                        var16.writeShort(this.H.id);
                     } else {
                        var16.writeShort(this.H.index);
                     }
                  }

                  var16.send();
               } catch (Exception var15) {
               }
               break;
            }

            if (var1[var6].j()) {
               if (var1[var6].getItemOptionTemplate().type == 19 && this.H.level >= 2 || var1[var6].getItemOptionTemplate().type == 3 && this.H.level >= 4 || var1[var6].getItemOptionTemplate().type == 11 && this.H.level >= 6 || var1[var6].getItemOptionTemplate().type == 4 && this.H.level >= 8 || var1[var6].getItemOptionTemplate().type == 12 && this.H.level >= 10 || var1[var6].getItemOptionTemplate().type == 5 && this.H.level >= 12 || var1[var6].getItemOptionTemplate().type == 6 && this.H.level >= 14 || var1[var6].getItemOptionTemplate().type == 7 && this.H.level >= 15 || var1[var6].getItemOptionTemplate().type == 10 && this.H.level >= 17) {
                  this.N.addElement(new vdtt_ft(var1[var6].d(), -29436, -16777216));
               } else {
                  this.N.addElement(new vdtt_ft(var1[var6].d(), -7631732, -16777216));
               }
            } else if (var1[var6].getItemOptionTemplate().type == 2) {
               if (!var4) {
                  var4 = true;
                  this.N.addElement(new vdtt_ft(Caption.gJ + a(this.H.getItemTemplate().type, this.H.g), -4654333, -11184811));
               }

               if (var3) {
                  this.N.addElement(new vdtt_ft(var1[var6].d(), -1, -16777216));
               } else {
                  this.N.addElement(new vdtt_ft(var1[var6].d(), -7631732, -16777216));
               }
            } else if (var1[var6].getItemOptionTemplate().type == 8) {
               this.N.addElement(new vdtt_ft("(" + DataCenter.gI().itemTemplate[var1[var6].h()].name + " " + Caption.ed + " " + var1[var6].i() + ") " + var1[var6].d(), -49561, -16777216));
            } else {
               ItemOption var7;
               Vector var8;
               if (var1[var6].getItemOptionTemplate().type == 17) {
                  var8 = this.N;
                  ItemOption var18 = var1[var6];
                  byte var20 = this.H.level;
                  String[] var11;
                  String var12;
                  if (var18.option[1] >= 0 && var18.f() >= 0 && var18.option[1] != var18.f()) {
                     var12 = (var11 = var18.b()) != null ? Utlis.b(DataCenter.gI().itemOptionTemplate[var18.option[0]].text, "(" + var11[0] + "-" + var11[1] + ")") : Utlis.b(DataCenter.gI().itemOptionTemplate[var18.option[0]].text, "(" + var18.option[1] + "-" + var18.f() + ")");
                  } else if (var18.option[1] >= 0) {
                     Item var13;
                     String var14;
                     if ((var11 = var18.b()) != null) {
                        var14 = Utlis.b(DataCenter.gI().itemOptionTemplate[var18.option[0]].text, var11[0]);
                        if (var20 > 0) {
                           (var13 = new Item(314)).level = var20;
                           var13.strData = var18.g();
                           var13.a(0);
                           if ((var7 = var13.L()[0]).option[1] % 10 == 0) {
                              var14 = var14 + " (" + Caption.tJ + " +" + var7.option[1] / 10 + "%)";
                           } else {
                              var14 = var14 + " (" + Caption.tJ + " +" + (float)var7.option[1] / 10.0F + "%)";
                           }
                        }
                     } else {
                        var14 = Utlis.b(DataCenter.gI().itemOptionTemplate[var18.option[0]].text, "" + var18.option[1]);
                        if (var20 > 0) {
                           (var13 = new Item(314)).level = var20;
                           var13.strData = var18.g();
                           var13.a(0);
                           var7 = var13.L()[0];
                           var14 = var14 + " (" + Caption.tJ + " +" + var7.option[1] + ")";
                        }
                     }

                     var12 = var14;
                  } else {
                     var12 = var18.f() >= 0 ? Utlis.b(DataCenter.gI().itemOptionTemplate[var18.option[0]].text, "" + var18.f()) : "";
                  }

                  vdtt_ft var22 = new vdtt_ft(var12, -6488, -16777216);
                  var8.addElement(var22);
               } else if (var1[var6].getItemOptionTemplate().type == 14) {
                  this.N.addElement(new vdtt_ft(var5 + ". " + var1[var6].d(), -16742145, -16777216));
                  ++var5;
               } else if (var1[var6].getItemOptionTemplate().type == 18) {
                  var2.addElement(new vdtt_ft(var1[var6].d(), -16711681, -16777216));
               } else if (var1[var6].getItemOptionTemplate().type != 55 && var1[var6].getItemOptionTemplate().id != 399 && var1[var6].getItemOptionTemplate().id != 400 && var1[var6].getItemOptionTemplate().id != 403 && var1[var6].getItemOptionTemplate().id != 427) {
                  if (var1[var6].getItemOptionTemplate().id >= 53 && var1[var6].getItemOptionTemplate().id <= 62) {
                     this.N.addElement(new vdtt_ft(var1[var6].e(), -6488, -16777216));
                  } else if (var1[var6].getItemOptionTemplate().id == 128) {
                     this.N.addElement(new vdtt_ft(var1[var6].e(), -2560, -16777216));
                  } else if (var1[var6].getItemOptionTemplate().id == 285) {
                     var7 = var1[var6];
                     this.N.addElement(new vdtt_ft(Utlis.b(DataCenter.gI().itemOptionTemplate[var7.option[0]].text, Utlis.c(var7.option[1]) + " / " + DataCenter.gI().a(var7.f())), -2560, -16777216));
                  } else if (var1[var6].getItemOptionTemplate().id == 413) {
                     this.N.addElement(new vdtt_ft(var1[var6].e(), -2560, -16777216));
                  } else if (var1[var6].getItemOptionTemplate().id == 407) {
                     this.N.addElement(new vdtt_ft(var1[var6].e(), -6488, -16777216));
                  } else if (var1[var6].k()) {
                     this.N.addElement(new vdtt_ft(var1[var6].e(), -4654333, -16777216));
                  } else if (var1[var6].getItemOptionTemplate().id == 370) {
                     var2.addElement(new vdtt_ft(var1[var6].e(), -4654333, -16777216));
                  } else if (var1[var6].getItemOptionTemplate().id == 293) {
                     if (this.H.h != -1L && this.H.h - System.currentTimeMillis() < 864000000L) {
                        this.N.addElement(new vdtt_ft(var1[var6].d(), -7631732, -16777216));
                     } else {
                        this.N.addElement(new vdtt_ft(var1[var6].d(), -7812062, -16777216));
                     }
                  } else if (var1[var6].getItemOptionTemplate().id == 294) {
                     if (this.H.h != -1L && this.H.h - System.currentTimeMillis() < 2592000000L) {
                        this.N.addElement(new vdtt_ft(var1[var6].d(), -7631732, -16777216));
                     } else {
                        this.N.addElement(new vdtt_ft(var1[var6].d(), -7812062, -16777216));
                     }
                  } else if (var1[var6].getItemOptionTemplate().id == 469 || var1[var6].getItemOptionTemplate().id >= 465 && var1[var6].getItemOptionTemplate().id <= 468 && var1[var6].f() == 469) {
                     this.N.addElement(new vdtt_ft(var1[var6].d(), -16532489, -16777216));
                  } else if (var1[var6].getItemOptionTemplate().id != 470 && (var1[var6].getItemOptionTemplate().id < 465 || var1[var6].getItemOptionTemplate().id > 468 || var1[var6].f() != 470)) {
                     if (var1[var6].getItemOptionTemplate().id == 471 || var1[var6].getItemOptionTemplate().id >= 465 && var1[var6].getItemOptionTemplate().id <= 468 && var1[var6].f() == 471) {
                        this.N.addElement(new vdtt_ft(var1[var6].d(), -6085890, -16777216));
                     } else if (var1[var6].getItemOptionTemplate().id != 472 && (var1[var6].getItemOptionTemplate().id < 465 || var1[var6].getItemOptionTemplate().id > 468 || var1[var6].f() != 472)) {
                        if (var1[var6].getItemOptionTemplate().id == 473 || var1[var6].getItemOptionTemplate().id >= 465 && var1[var6].getItemOptionTemplate().id <= 468 && var1[var6].f() == 473) {
                           this.N.addElement(new vdtt_ft(var1[var6].d(), -243953, -16777216));
                        } else if (var1[var6].getItemOptionTemplate().id >= 481 && var1[var6].getItemOptionTemplate().id <= 485) {
                           this.N.addElement(new vdtt_ft(var1[var6].d(), -16712913, -16777216));
                        } else if (var1[var6].option[0] == 105) {
                           var8 = this.N;
                           StringBuilder var9 = (new StringBuilder()).append(Caption.gK).append("c#yellow");
                           int[] var10 = var1[var6].option;
                           var8.addElement(new vdtt_ft(var9.append(DataCenter.gI().mapTemplate[var10[1]].name).toString(), -1, -16777216));
                           this.N.addElement(new vdtt_ft(Caption.gL, -1, -16777216));
                        } else if (var1[var6].option[0] == 148) {
                           if (var1[var6].option[1] == 1) {
                              this.N.addElement(new vdtt_ft("Trang bị chiến binh", -14066190, -16777216));
                           } else if (var1[var6].option[1] == 2) {
                              this.N.addElement(new vdtt_ft("Trang bị siêu cấp", -196483, -16777216));
                           }
                        } else if (var1[var6].option[0] == 159) {
                           this.N.addElement(new vdtt_ft(var1[var6].d(), -196483, -16777216));
                        } else if (var1[var6].option[0] == 163) {
                           this.N.addElement(new vdtt_ft(var1[var6].d(), -48128, -16777216));
                        } else if (var1[var6].option[0] == 164) {
                           this.N.addElement(new vdtt_ft(var1[var6].d(), -4588032, -16777216));
                        } else if (var1[var6].option[0] == 165) {
                           this.N.addElement(new vdtt_ft(var1[var6].d(), -16712186, -16777216));
                        } else {
                           this.N.addElement(new vdtt_ft(var1[var6].d(), -6488, -16777216));
                        }
                     } else {
                        this.N.addElement(new vdtt_ft(var1[var6].d(), -14953132, -16777216));
                     }
                  } else {
                     this.N.addElement(new vdtt_ft(var1[var6].d(), -1788155, -16777216));
                  }
               } else if (var1[var6].getItemOptionTemplate().type == 55 && this.H.x()) {
                  if (var1[var6].option[1] >= 0 && var1[var6].f() >= 0) {
                     this.N.addElement(new vdtt_ft(var1[var6].c(), -623877, -16777216));
                  } else {
                     this.N.addElement(new vdtt_ft(var1[var6].c(), -7631732, -16777216));
                  }
               } else {
                  this.N.addElement(new vdtt_ft(var1[var6].d(), -623877, -16777216));
               }
            }
         }
      }

      this.N.addAll(var2);
      if (this.H.getItemTemplate().type == 99 && this.H.strData.length() > 0) {
         this.N.addElement(new vdtt_ft("", -6488, -16777216));
         this.N.addElement(new vdtt_ft("", -6488, -16777216));
      }

      this.L = new vdtt_hp((byte)1, 4, 4, this.width - 22, 105, 15, 1 + this.N.size());
   }
}

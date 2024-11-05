package gro;

import java.util.Vector;

public final class vdtt_eo extends Entity {
   public short k;
   private byte U = -1;
   private byte V = -1;
   private int W = 0;
   public Entity l;
   private Entity X;
   private Entity Y;
   private int Z;
   private int aa;
   private int ab;
   private int ac;
   private int ad;
   public int m;
   public int n;
   public int o;
   private boolean ae;
   private boolean af;
   private Vector ag = new Vector();
   private Vector ah = new Vector();
   private Vector ai = new Vector();
   private vdtt_ey aj;
   private int ak;
   private int al;
   private Vector am;
   private Vector an;
   public int p;
   public int H;
   public int I;
   public int J;
   public XYEntity K;
   public XYEntity L;
   public Char M;
   public Char N;
   private boolean ao;
   public static byte[] O = new byte[]{0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1};
   public static int[] P = new int[]{0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370};
   public static int[] Q = new int[]{0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1};
   public static int[] R = new int[]{0, 17, 34, 52, 69, 87, 104, 121, 139, 156, 173, 190, 207, 224, 241, 258, 275, 292, 309, 325, 342, 358, 374, 390, 406, 422, 438, 453, 469, 484, 499, 515, 529, 544, 559, 573, 587, 601, 615, 629, 642, 656, 669, 681, 694, 707, 719, 731, 743, 754, 766, 777, 788, 798, 809, 819, 829, 838, 848, 857, 866, 874, 882, 891, 898, 906, 913, 920, 927, 933, 939, 945, 951, 956, 961, 965, 970, 974, 978, 981, 984, 987, 990, 992, 994, 996, 997, 998, 999, 999, 1000};
   public static int[] S = new int[]{1000, 999, 999, 998, 997, 996, 994, 992, 990, 987, 984, 981, 978, 974, 970, 965, 961, 956, 951, 945, 939, 933, 927, 920, 913, 906, 898, 891, 882, 874, 866, 857, 848, 838, 829, 819, 809, 798, 788, 777, 766, 754, 743, 731, 719, 707, 694, 681, 669, 656, 642, 629, 615, 601, 587, 573, 559, 544, 529, 515, 500, 484, 469, 453, 438, 422, 406, 390, 374, 358, 342, 325, 309, 292, 275, 258, 241, 224, 207, 190, 173, 156, 139, 121, 104, 87, 69, 52, 34, 17, 0};
   public static int[] T = new int[]{0, 17, 34, 52, 69, 87, 105, 122, 140, 158, 176, 194, 212, 230, 249, 267, 286, 305, 324, 344, 363, 383, 404, 424, 445, 466, 487, 509, 531, 554, 577, 600, 624, 649, 674, 700, 726, 753, 781, 809, 839, 869, 900, 932, 965, 999, 1035, 1072, 1110, 1150, 1191, 1234, 1279, 1327, 1376, 1428, 1482, 1539, 1600, 1664, 1732, 1804, 1880, 1962, 2050, 2144, 2246, 2355, 2475, 2605, 2747, 2904, 3077, 3270, 3487, 3732, 4010, 4331, 4704, 5144, 5671, 6313, 7115, 8144, 9514, 11430, 14300, 19081, 28636, 57289, Integer.MAX_VALUE};

   public final vdtt_ep m() {
      if (this.k < 0 || this.k >= DataCenter.gI().B.length) {
         this.k = 0;
      }

      return DataCenter.gI().B[this.k];
   }

   public vdtt_eo(int var1, int var2, int var3, Entity var4, int var5, int var6, boolean var7, Vector var8, Vector var9, Char var10, Char var11, int var12) {
      this.M = var10;
      this.N = var11;
      this.a(var1, var2, var3, var4, var5, var6, false, var8, var9, var12);
   }

   public vdtt_eo(int var1, int var2, int var3, Entity var4, int var5, int var6, boolean var7, Vector var8, Vector var9) {
      this.a(var1, var2, var3, var4, var5, var6, var7, var8, var9, 0);
   }

   private void a(int var1, int var2, int var3, Entity var4, int var5, int var6, boolean var7, Vector var8, Vector var9, int var10) {
      this.K = XYEntity.create(var2, var3);
      this.L = XYEntity.create(var2, var3);
      this.am = var8;
      this.an = var9;
      this.af = var7;
      this.k = (short)var1;
      this.l = var4;
      this.Y = var4;
      this.ac = var5;
      this.ad = var6;
      this.aa = var2;
      this.ab = var3;
      this.p = this.m().c;
      int var11;
      if (this.m().a == 1) {
         while(true) {
            if ((var11 = Utlis.a(new int[]{0, -1, -2})) != var10) {
               this.m = var11;
               break;
            }
         }
      } else if (this.m().a == 8) {
         while(true) {
            if ((var11 = Utlis.a(new int[]{0, 6, 7})) != var10) {
               this.m = var11;
               break;
            }
         }
      } else {
         this.m = this.m().a;
      }

      this.setXY(var2, var3);
      var11 = var4.cx - var2;
      var10 = var4.cy - var3;
      int var12 = b(var11, var10);
      vdtt_ey var13;
      vdtt_ey var14;
      if (this.m == 25) {
         for(var10 = 0; var10 < 20; ++var10) {
            this.ah.add(new vdtt_ey(var2, var3, true));
         }
      } else if (this.m == 3 && !var7) {
         if (var4.cx > var2) {
            this.aa = var4.cx - this.m().h;
         } else {
            this.aa = var4.cx + this.m().h;
         }

         this.ab = var4.cy - 200 - Utlis.a((int)200);
         this.setXY(this.aa, this.ab);
      } else if (this.m == 10) {
         this.X = var4;
         this.l = new Char();
         this.l.setXY(var2, var3);
      } else if (this.m != -1 && this.m != -2) {
         int var15;
         Vector var16;
         if (this.m == 7) {
            var10 = this.m().g;
            var16 = new Vector();
            if (var4.cx > var2) {
               for(var12 = 305; var12 > 45; var12 -= this.p) {
                  var13 = Utlis.a(new vdtt_ey(var2, var3), new vdtt_ey(var2 + var10, var3), var12);
                  this.ah.addElement(var13);
               }

               var14 = (vdtt_ey)this.ah.firstElement();
               var13 = new vdtt_ey(var2 + Utlis.b(var14.cx - var2) / 2, var3 + Utlis.b(var14.cy - var3) / 2);

               for(var15 = 360; var15 > 180; var15 -= this.p) {
                  var16.add(Utlis.a(var13, new vdtt_ey(var2, var3), var15));
               }
            } else {
               for(var12 = 225; var12 < 485; var12 += this.p) {
                  var13 = Utlis.a(new vdtt_ey(var2, var3), new vdtt_ey(var2 + var10, var3), var12);
                  this.ah.addElement(var13);
               }

               var14 = (vdtt_ey)this.ah.firstElement();
               var13 = new vdtt_ey(var2 - Utlis.b(var14.cx - var2) / 2, var3 + Utlis.b(var14.cy - var3) / 2);

               for(var15 = 0; var15 < 180; var15 += this.p) {
                  var16.add(Utlis.a(var13, new vdtt_ey(var2, var3), var15));
               }
            }

            var16.addAll(this.ah);
            this.ah = var16;
         } else if (this.m == 6) {
            var10 = this.m().g;
            var16 = new Vector();
            if (var4.cx > var2) {
               for(var12 = 45; var12 < 305; var12 += this.p) {
                  var13 = Utlis.a(new vdtt_ey(var2, var3), new vdtt_ey(var2 + var10, var3), var12);
                  this.ah.addElement(var13);
               }

               var14 = (vdtt_ey)this.ah.firstElement();
               var13 = new vdtt_ey(var2 + Utlis.b(var14.cx - var2) / 2, var3 - Utlis.b(var14.cy - var3) / 2);

               for(var15 = 180; var15 < 360; var15 += this.p) {
                  var16.add(Utlis.a(var13, var14, var15));
               }
            } else {
               for(var12 = 135; var12 > -135; var12 -= this.p) {
                  var13 = Utlis.a(new vdtt_ey(var2, var3), new vdtt_ey(var2 + var10, var3), var12);
                  this.ah.addElement(var13);
               }

               var14 = (vdtt_ey)this.ah.firstElement();
               var13 = new vdtt_ey(var2 - Utlis.b(var14.cx - var2) / 2, var3 - Utlis.b(var14.cy - var3) / 2);

               for(var15 = 180; var15 > 0; var15 -= this.p) {
                  var16.add(Utlis.a(var13, var14, var15));
               }
            }

            var16.addAll(this.ah);
            this.ah = var16;
         } else if (this.m == 2) {
            this.X = new vdtt_ey(var2, var3 - this.m().g);
         }
      } else {
         if (var11 > var10) {
            this.Z = b(var11, -var10);
         } else {
            this.Z = b(-var11, var10);
         }

         this.X = new Char();
         if (this.m == -1) {
            this.X.setXY(var4.cx, var3 - 100);
            if (var12 >= 90 && var12 < 270) {
               if (var11 > var10) {
                  this.Z = b(-var11, var10);
               } else {
                  this.Z = b(var11, -var10);
               }

               this.X.setXY(var4.cx, var3 + 100);
            }
         } else if (this.m == -2) {
            this.X.setXY(var4.cx, var3 + 100);
            if (var12 >= 90 && var12 < 270) {
               if (var11 > var10) {
                  this.Z = b(-var11, var10);
               } else {
                  this.Z = b(var11, -var10);
               }

               this.X.setXY(var4.cx, var3 - 100);
            }
         }
      }

      Vector var21 = new Vector();
      if (!var7) {
         vdtt_eo var20;
         if (this.m == 13) {
            for(var11 = 0; var11 < this.m().g; ++var11) {
               var14 = new vdtt_ey(var4.cx, var4.cy);
               (var20 = new vdtt_eo(var1, var14.cx, var14.cy, var4, -1, 0, true, var8, var9)).U = (byte)Utlis.a(this.m().l[0].length);
               if (var11 % 2 == 0) {
                  var20.X = new vdtt_ey(var14.cx + Utlis.a(30, 70), var14.cy - Utlis.a(30, 70));
                  var20.l = new vdtt_ey(var20.X.cx + Utlis.a(40, 80), var20.X.cy + Utlis.a(50, 150));
               } else {
                  var20.X = new vdtt_ey(var14.cx - Utlis.a(30, 70), var14.cy - Utlis.a(30, 70));
                  var20.l = new vdtt_ey(var20.X.cx - Utlis.a(40, 80), var20.X.cy + Utlis.a(50, 150));
               }

               var21.add(var20);
            }

            var8.addAll(var21);
         } else if (this.m == 3) {
            for(var11 = 0; var11 < this.m().g; ++var11) {
               var12 = Utlis.a((int)100) - 50;
               var13 = new vdtt_ey(var4.cx + var12, var4.cy - 200 - Utlis.a((int)200));
               (var20 = new vdtt_eo(var1, var13.cx + (var4.cx > var2 ? -this.m().h : this.m().h), var13.cy, var4, var5, var6, true, var8, var9)).al = var12;
               var8.add(var20);
            }
         } else {
            int var17;
            if (this.m == 16) {
               if (this.m().h == 0) {
                  this.m().h = 30;
               }

               for(var11 = 0; var11 < 360; var11 += this.m().h) {
                  var13 = Utlis.a(var14 = new vdtt_ey(var2, var3), new vdtt_ey(var14.cx + this.m().g, var14.cy), var11);
                  (var20 = new vdtt_eo(var1, var14.cx, var14.cy, var13, var5, var6, true, var8, var9)).af = true;
                  var20.p += Utlis.a((int)5);
                  var8.add(var20);
                  var21.add(var20);
               }

               var11 = Utlis.a(10, 50);
               this.p += Utlis.a((int)5);

               for(var12 = 0; var12 < var11; ++var12) {
                  this.ah.add(new vdtt_ey(var2, var3, false));
               }

               for(var12 = 0; var12 < var21.size(); ++var12) {
                  var11 = Utlis.a(10, 40);

                  for(var17 = 0; var17 < var11; ++var17) {
                     (var20 = (vdtt_eo)var21.get(var12)).ah.add(new vdtt_ey(var20.cx, var20.cy, false));
                  }
               }
            } else {
               vdtt_ey var18;
               if (this.m().a == 11) {
                  var11 = 0;

                  for(var12 = 0; var12 < 360; var12 += this.m().h) {
                     ++var11;
                     if (var11 != 4) {
                        var18 = Utlis.a(var13 = new vdtt_ey(var4.cx, var4.cy), new vdtt_ey(var13.cx + this.m().g + Utlis.a((int)100), var13.cy), var12);
                        if (var12 == 0) {
                           this.X = new vdtt_ey(var18.cx, var18.cy);
                           this.p += 3;
                           var21.add(this);
                        } else {
                           vdtt_eo var19;
                           (var19 = new vdtt_eo(var1, var2, var3, var4, var5, var6, true, var8, var9)).X = new vdtt_ey(var18.cx, var18.cy);
                           var19.p += 3;
                           var21.add(var19);
                           var8.add(var19);
                        }
                     }
                  }

                  for(var12 = 0; var12 < var21.size(); ++var12) {
                     for(var17 = var12; var17 < var21.size(); ++var17) {
                        (var20 = (vdtt_eo)var21.get(var17)).N = this.N;
                        var20.ah.add(new vdtt_ey(var20.cx, var20.cy, false));
                        var20.ah.add(new vdtt_ey(var20.cx, var20.cy, false));
                        var20.ah.add(new vdtt_ey(var20.cx, var20.cy, false));
                        var20.ah.add(new vdtt_ey(var20.cx, var20.cy, false));
                        var20.ah.add(new vdtt_ey(var20.cx, var20.cy, false));
                     }
                  }

                  for(var12 = 0; var12 < var21.size(); ++var12) {
                     for(var17 = 0; var17 < var21.size(); ++var17) {
                        var20 = (vdtt_eo)var21.get(var17);

                        for(int var22 = 0; var22 < 8; ++var22) {
                           var20.ai.add(new vdtt_ey(var20.X.cx, var20.X.cy));
                        }
                     }
                  }
               } else if (this.m().a == 12) {
                  var18 = new vdtt_ey(var4.cx, var4.cy);

                  for(var12 = 0; var12 < 360; var12 += this.m().h) {
                     var13 = Utlis.a(var18, new vdtt_ey(var18.cx + this.m().g, var18.cy), var12);
                     if (var12 == 0) {
                        this.aa = var13.cx;
                        this.ab = var13.cy;
                        this.setXY(var13.cx, var13.cy);
                        this.X = var4;
                        this.l = var13;
                     } else {
                        (var20 = new vdtt_eo(var1, var13.cx, var13.cy, var4, var5, var6, true, var8, var9)).X = var4;
                        var20.l = var13;
                        var21.add(var20);
                     }
                  }

                  var8.addAll(var21);
               } else if (this.m().a == 5) {
                  for(var11 = 0; var11 < 360; var11 += this.m().h) {
                     var13 = Utlis.a(var14 = new vdtt_ey(var4.cx, var4.cy), new vdtt_ey(var14.cx + this.m().g, var14.cy), var11);
                     var8.add(new vdtt_eo(var1, var13.cx, var13.cy, var4, var5, var6, true, var8, var9));
                  }
               } else if (this.m().a == 15) {
                  var18 = new vdtt_ey(var2, var3);

                  for(var12 = 0; var12 < 360; var12 += this.m().h) {
                     var13 = Utlis.a(var18, new vdtt_ey(var18.cx + this.m().g, var18.cy), var12);
                     var8.add(new vdtt_eo(var1, var13.cx, var13.cy, var18, var5, var6, true, var8, var9));
                  }

                  this.l = var18;
               } else if (this.m().a == 23) {
                  var18 = new vdtt_ey(var2, var3 - this.m().g);
                  this.l = var18;
                  this.I = this.m().h;
               } else if (this.m().a == 20) {
                  for(var11 = 0; var11 < 40; ++var11) {
                     this.ah.add(new vdtt_ey(var2, var3));
                  }
               } else if (this.m().a == 22) {
                  if (this.m().g == 0) {
                     this.m().g = 50;
                  }

                  if (this.m().h == 0) {
                     this.m().h = 72;
                  }

                  var18 = new vdtt_ey(var2, var3);

                  for(var12 = 0; var12 < 360; var12 += this.m().h) {
                     var13 = Utlis.a(var18, new vdtt_ey(var18.cx - this.m().g, var18.cy), var12);
                     var20 = new vdtt_eo(var1, var13.cx, var13.cy, var4, var5, var6, true, var8, var9);
                     var8.add(var20);
                  }
               } else if (this.m().a == 21) {
                  if (this.m().g == 0) {
                     this.m().g = 50;
                  }

                  if (this.m().h == 0) {
                     this.m().h = 72;
                  }

                  this.I = 50;

                  for(var11 = 0; var11 < 360; var11 += this.m().h) {
                     var13 = Utlis.a(var14 = new vdtt_ey(var2, var3), new vdtt_ey(var14.cx - this.m().g, var14.cy), var11);
                     if (var11 == 0) {
                        this.X = var13;
                        this.L = var13;
                     } else {
                        (var20 = new vdtt_eo(var1, var2, var3, var4, var5, var6, true, var8, var9)).X = var13;
                        var20.M = this.M;
                        var20.I = this.I;
                        var20.L = var13;
                        var8.add(var20);
                     }
                  }
               } else if (this.m().a == 9) {
                  var14 = Utlis.a(var18 = new vdtt_ey(var2, var3), var4, 0);
                  this.X = var14;
                  this.l = var4;

                  for(var17 = 0; var17 < this.m().g; ++var17) {
                     var14 = Utlis.a(var18, this.X, this.m().h * (var17 + 1));
                     (var20 = new vdtt_eo(var1, var2, var3, var14, var5, var6, true, var8, var9)).X = var14;
                     var20.l = this.l;
                     var8.add(var20);
                     var14 = Utlis.a(var18, this.X, -this.m().h * (var17 + 1));
                     (var20 = new vdtt_eo(var1, var2, var3, var14, var5, var6, true, var8, var9)).X = var14;
                     var20.l = this.l;
                     var8.add(var20);
                  }
               } else if (this.m().a == 17) {
                  if (this.m().g == 0) {
                     this.m().g = 200;
                  }

                  this.l = new vdtt_ey(var2, var3 - this.m().g);
               }
            }
         }
      }

      if (this.ah.size() > 0) {
         this.ag.add(new vdtt_ey(var3, var3));
         this.ag.addAll(this.ah);
      }

      if (this.p() && this.N != null) {
         for(var11 = 0; var11 < 40; ++var11) {
            this.o();
         }

         this.X = (Entity)this.ag.get(this.ag.size() - 1);
         this.o = this.n;
         this.H = this.n = this.ak = 0;
         this.aa = this.cx = (short)var2;
         this.ab = this.cy = (short)var3;
         if (var1 == 81) {
            this.H = 8;
         }
      }

   }

   public final int minX() {
      return this.cx - this.width / 2;
   }

   public final int maxX() {
      return this.cx + this.width / 2;
   }

   public final int minY() {
      return this.cy - this.height / 2;
   }

   public final int maxY() {
      return this.cy + this.height / 2;
   }

   public final boolean n() {
      boolean var1;
      if (var1 = this.q()) {
         this.v();
         if (!this.ao && this.ac > 0 && !this.r() && !this.af && !this.ao) {
            this.ao = true;
            vdtt_hf var2 = new vdtt_hf(this.ac, this.l.cx + this.al, this.l.cy);
            if (this.ad == 1) {
               (var2 = new vdtt_hf(this.ac, this.l.k() + this.al, this.l.l())).I = true;
            }

            var2.K = this.al;
            if (this.m().a != 21) {
               if (this.l instanceof Char) {
                  ((Char)this.l).be.add(var2);
               } else if (this.l instanceof Mob) {
                  this.an.add(var2);
               }
            }
         }
      }

      return var1;
   }

   private boolean q() {
      if (this.ae) {
         return this.ae;
      } else {
         Entity var1;
         Char var2;
         if ((var1 = this.l) instanceof Char && (var2 = (Char)var1).hp == 0 && var2.mp == 0 && this.H < 20) {
            return false;
         } else {
            if (this.X != null) {
               var1 = this.X;
            }

            if (var1 == null) {
               this.ae = true;
               return this.ae;
            } else {
               boolean var3 = false;
               if (this.m().a == 21 && this.X != null) {
                  if (var3 = this.cx == this.X.cx && this.cy == this.X.cy) {
                     this.p = this.m().c;
                  }
               } else if (this.I > 0) {
                  --this.I;
                  if (this.I == 0) {
                     var3 = true;
                  }
               } else if (this.m().a != 2 && this.m().a != 3) {
                  if (!(var3 = Utlis.a(this.cx - this.m().i, this.cy - this.m().i, this.cx + this.m().i, this.cy + this.m().i, var1.k() + this.al - 5, var1.l() - 5, var1.k() + this.al + 5, var1.l() + 5)) && this.p() && this.N != null && this.l != null && Utlis.a(this.N.k(), this.N.l(), this.l.k(), this.l.l()) < 70 && this.m().g < 120) {
                     var3 = true;
                  }
               } else {
                  var3 = Utlis.a(this.cx - this.m().i, this.cy - this.m().i, this.cx + this.m().i, this.cy + this.m().i, var1.k() + this.al - 5, var1.cy - 5, var1.k() + this.al + 5, var1.cy + 5);
               }

               vdtt_hf var4;
               if (var3) {
                  if (this.m().a == 11 && this.X != null) {
                     this.p = this.m().c;
                     this.ah = this.ai;
                  } else if (this.ac > 0 && !this.r() && (!this.af || this.m().a == 11) && ((this.m().a == 10 || this.m().a == 12) && this.X != null || this.m().a != 10 && this.m().a != 12 && this.m().a != 17 && this.m().a != 15 && this.m().a != 21 && this.X == null) && !this.ao) {
                     var4 = new vdtt_hf(this.ac, var1.cx + this.al, var1.cy);
                     if (this.ad == 1) {
                        (var4 = new vdtt_hf(this.ac, var1.k() + this.al, var1.l())).I = true;
                     }

                     var4.K = this.al;
                     if (var1 instanceof Char) {
                        ((Char)var1).be.add(var4);
                     } else {
                        this.an.add(var4);
                     }

                     this.ao = true;
                  }

                  this.ae = true;
                  vdtt_ey var5;
                  vdtt_eo var6;
                  int var7;
                  if (this.m().a == 4 && !this.af) {
                     for(var7 = 0; var7 < 360; var7 += this.m().h) {
                        var5 = Utlis.a(var5 = new vdtt_ey(var1.cx + this.al, var1.cy), new vdtt_ey(var5.cx + this.m().g, var5.cy), var7);
                        var6 = new vdtt_eo(this.k, var1.cx, var1.cy, var5, -1, 0, true, this.am, this.an);
                        this.am.add(var6);
                     }
                  }

                  if (this.m().a == 17 && !this.af) {
                     if (this.m().g == 0) {
                        this.m().g = 200;
                     }

                     if (this.m().h == 0) {
                        this.m().h = 30;
                     }

                     for(var7 = 0; var7 < 360; var7 += this.m().h) {
                        var5 = Utlis.a(var5 = new vdtt_ey(var1.cx + this.al, var1.cy), new vdtt_ey(var5.cx + 180, var5.cy), var7);
                        int var8 = var7 == 0 ? -1 : this.ac;
                        (var6 = new vdtt_eo(this.m().f, var1.cx, var1.cy, this.Y, var8, 0, var7 == 0, this.am, this.an)).X = new vdtt_ey(var5.cx, var5.cy);
                        this.am.add(var6);
                     }
                  }

                  if (this.p()) {
                     return true;
                  }
               } else if (Utlis.a(this.cx, this.cy, var1.k(), var1.l()) > 1000) {
                  if (this.p()) {
                     return true;
                  }

                  this.ae = true;
               }

               if (this.p() && Utlis.a(this.cx - this.m().i, this.cy - this.m().i, this.cx + this.m().i, this.cy + this.m().i, this.l.k() + this.al - 5, this.l.l() - 5, this.l.k() + this.al + 5, this.l.l() + 5) && this.ac > 0 && !this.r() && !this.af && !this.ao) {
                  this.ao = true;
                  var4 = new vdtt_hf(this.ac, this.l.cx + this.al, this.l.cy);
                  if (this.ad == 1) {
                     (var4 = new vdtt_hf(this.ac, this.l.k() + this.al, this.l.l())).I = true;
                  }

                  var4.K = this.al;
                  if (this.l instanceof Char) {
                     ((Char)this.l).be.add(var4);
                  } else {
                     this.an.add(var4);
                  }

                  if (this.k == 79 || this.k == 81 || this.k == 82) {
                     this.J = 1;
                  }
               }

               if (this.ae && this.X != null) {
                  this.X = null;
                  this.ae = false;
                  if (this.m == 2) {
                     this.cx = this.l.cx;
                  }
               }

               return this.ae;
            }
         }
      }
   }

   public final void o() {
      ++this.H;
      int var1;
      if (this.p() && ((var1 = Utlis.a(this.K.cx, this.K.cy, this.l.k(), this.l.l())) >= 120 || this.X == null)) {
         if (var1 < this.m().g) {
            var1 = this.m().g;
         }

         Char var2;
         if (var1 < 250 && this.l instanceof Char && (var2 = (Char)this.l).hp == 0 && var2.mp == 0) {
            var1 = 250;
         }

         int var3 = this.l.k();
         int var4 = this.l.l();
         if (this.m().g > 120) {
            byte var5 = 50;
            if (Utlis.b(this.N.cy, this.l.cy) < 3) {
               var5 = 120;
            }

            if (this.N.cx > this.l.cx && this.N.cx - this.l.cx < var5) {
               var3 = (short)(this.N.cx - var5);
            } else if (this.N.cx < this.l.cx && this.l.cx - this.N.cx < var5) {
               var3 = (short)(this.N.cx + var5);
            }
         }

         XYEntity var6;
         if ((var6 = Utlis.a(this.K, XYEntity.create(var3, var4), (double)var1)) != null) {
            this.X = new vdtt_ey(var6.cx, var6.cy);
            this.X.setSize(this.l.width, this.l.height);
         }
      }

      this.aa = this.cx;
      this.ab = this.cy;
      this.s();
      this.W += this.m().e;
      if (this.W >= 360) {
         this.W = 0;
      }

      if (this.m == 2 || this.m == 3) {
         ++this.ak;
         if (this.ak > 50) {
            this.ak = 50;
         }
      }

      if (this.m == 27 && DataCenter.gI().h % 3 > 0) {
         ++this.ak;
         if (this.ak > 40) {
            this.ak = 40;
         }
      }

      if (this.p()) {
         this.ak += this.m().h;
         if (this.ak > 50) {
            this.ak = 50;
         }
      }

      if (this.m().l != null && this.m().l.length > 0 && this.m().l[0] != null) {
         var1 = this.m().l[0].length;
         if (this.m != 13) {
            ++this.U;
         }

         if (this.U >= var1) {
            this.U = 0;
         }
      }

   }

   private boolean r() {
      return this.m().a == 13 && !this.af || this.aj != null && !this.aj.k;
   }

   private int[] a(int var1, int var2, int var3) {
      var1 = this.K.cx - var1;
      var2 = this.K.cy - var2;
      if (Utlis.b(this.K.cy, this.l.l()) < 5 && Utlis.b(this.K.cx, this.l.cx) < 30) {
         var2 = 0;
      }

      var1 = b(var1, var2);
      this.n = var1;
      int var4 = 0;
      int var5 = 0;
      int[] var6;
      byte var7;
      byte var8;
      if (this.m().a != 14 && this.m().a != 26) {
         if (this.m().a == 18) {
            var1 = var1;
            var7 = 0;
            var8 = 0;
            if (var1 < 355 && var1 >= 5) {
               if (var1 >= 175 && var1 < 185) {
                  var7 = 58;
                  var8 = -3;
               } else if (var1 >= 185 && var1 < 195) {
                  var7 = 59;
                  var8 = 9;
               } else if (var1 >= 195 && var1 < 205) {
                  var7 = 57;
                  var8 = 22;
               } else if (var1 >= 205 && var1 < 215) {
                  var7 = 55;
                  var8 = 30;
               } else if (var1 >= 215 && var1 < 225) {
                  var7 = 51;
                  var8 = 35;
               } else if (var1 >= 225 && var1 < 235) {
                  var7 = 48;
                  var8 = 39;
               } else if (var1 >= 235 && var1 < 245) {
                  var7 = 43;
                  var8 = 43;
               } else if (var1 >= 245 && var1 < 255) {
                  var7 = 39;
                  var8 = 46;
               } else if (var1 >= 255 && var1 < 265) {
                  var7 = 31;
                  var8 = 49;
               } else if (var1 >= 265 && var1 < 270) {
                  var7 = 25;
                  var8 = 51;
               } else if (var1 >= 345 && var1 < 355) {
                  var7 = -59;
                  var8 = 9;
               } else if (var1 >= 335 && var1 < 345) {
                  var7 = -57;
                  var8 = 22;
               } else if (var1 >= 325 && var1 < 335) {
                  var7 = -55;
                  var8 = 30;
               } else if (var1 >= 315 && var1 < 325) {
                  var7 = -51;
                  var8 = 35;
               } else if (var1 >= 305 && var1 < 315) {
                  var7 = -48;
                  var8 = 39;
               } else if (var1 >= 295 && var1 < 305) {
                  var7 = -43;
                  var8 = 43;
               } else if (var1 >= 285 && var1 < 295) {
                  var7 = -39;
                  var8 = 46;
               } else if (var1 >= 275 && var1 < 285) {
                  var7 = -31;
                  var8 = 49;
               } else if (var1 > 270 && var1 < 275) {
                  var7 = -25;
                  var8 = 51;
               } else if (var1 >= 5 && var1 < 15) {
                  var7 = -54;
                  var8 = -16;
               } else if (var1 >= 15 && var1 < 25) {
                  var7 = -54;
                  var8 = -18;
               } else if (var1 >= 25 && var1 < 35) {
                  var7 = -48;
                  var8 = -30;
               } else if (var1 >= 35 && var1 < 45) {
                  var7 = -44;
                  var8 = -34;
               } else if (var1 >= 45 && var1 < 55) {
                  var7 = -40;
                  var8 = -40;
               } else if (var1 >= 55 && var1 < 65) {
                  var7 = -36;
                  var8 = -43;
               } else if (var1 >= 65 && var1 < 75) {
                  var7 = -31;
                  var8 = -46;
               } else if (var1 >= 75 && var1 < 85) {
                  var7 = -24;
                  var8 = -49;
               } else if (var1 >= 85 && var1 < 90) {
                  var7 = -20;
                  var8 = -50;
               } else if (var1 >= 165 && var1 < 175) {
                  var7 = 54;
                  var8 = -13;
               } else if (var1 >= 155 && var1 < 165) {
                  var7 = 54;
                  var8 = -18;
               } else if (var1 >= 145 && var1 < 155) {
                  var7 = 48;
                  var8 = -30;
               } else if (var1 >= 135 && var1 < 145) {
                  var7 = 44;
                  var8 = -34;
               } else if (var1 >= 125 && var1 < 135) {
                  var7 = 40;
                  var8 = -40;
               } else if (var1 >= 115 && var1 < 125) {
                  var7 = 36;
                  var8 = -43;
               } else if (var1 >= 105 && var1 < 115) {
                  var7 = 31;
                  var8 = -46;
               } else if (var1 >= 95 && var1 < 105) {
                  var7 = 24;
                  var8 = -49;
               } else if (var1 > 90 && var1 < 95) {
                  var7 = 20;
                  var8 = -50;
               } else if (var1 == 90) {
                  if (var3 < 90) {
                     var7 = -20;
                     var8 = -50;
                     --var1;
                  } else {
                     var7 = 20;
                     var8 = -50;
                     ++var1;
                  }
               } else if (var1 == 270) {
                  if (var3 < 270) {
                     var7 = -25;
                     var8 = 52;
                     --var1;
                  } else {
                     var7 = 25;
                     var8 = 52;
                     ++var1;
                  }
               }
            } else {
               var7 = -60;
               var8 = -2;
            }

            var4 = (var6 = new int[]{var7, var8, var1})[0];
            var5 = var6[1];
            this.n = var6[2];
         } else if (this.m().a == 24) {
            var4 = 0;
            var5 = 0;
            this.n = var1;
            if (this.M != null) {
               var3 = 66;
               if (this.n < 25 || this.n >= 155) {
                  if (this.n >= 205 && this.n < 335) {
                     var3 += 6;
                  } else if (this.n >= 165 && this.n < 175 || this.n >= 15 && this.n < 25) {
                     var3 += 2;
                  } else if (this.n >= 155 && this.n < 165 || this.n >= 5 && this.n < 15) {
                     ++var3;
                  } else if (this.n >= 345 && this.n < 355 || this.n >= 185 && this.n < 195) {
                     var3 += 4;
                  } else if (this.n >= 335 && this.n < 345 || this.n >= 195 && this.n < 205) {
                     var3 += 5;
                  } else {
                     var3 += 3;
                  }
               }

               Vector var9 = this.M.bd;

               for(int var10 = 0; var10 < var9.size(); ++var10) {
                  vdtt_gz var11;
                  if ((var11 = (vdtt_gz)var9.get(var10)).d == 3) {
                     var4 = var11.h[var3].d;
                     var5 = var11.h[var3].e + 17;
                     if (this.M.bt != null) {
                        var5 = var11.h[var3].e + 20;
                     }

                     if (var1 < 90 || var1 >= 270) {
                        var4 = -var4;
                     }
                  }
               }
            }
         }
      } else {
         var1 = var1;
         var7 = 0;
         var8 = 0;
         if (var1 < 355 && var1 >= 5) {
            if (var1 >= 175 && var1 < 185) {
               var7 = 58;
               var8 = 0;
            } else if (var1 >= 185 && var1 < 195) {
               var7 = 59;
               var8 = 10;
            } else if (var1 >= 195 && var1 < 205) {
               var7 = 57;
               var8 = 22;
            } else if (var1 >= 205 && var1 < 215) {
               var7 = 53;
               var8 = 32;
            } else if (var1 >= 215 && var1 < 225) {
               var7 = 50;
               var8 = 38;
            } else if (var1 >= 225 && var1 < 235) {
               var7 = 46;
               var8 = 43;
            } else if (var1 >= 235 && var1 < 245) {
               var7 = 41;
               var8 = 46;
            } else if (var1 >= 245 && var1 < 255) {
               var7 = 37;
               var8 = 49;
            } else if (var1 >= 255 && var1 < 265) {
               var7 = 30;
               var8 = 52;
            } else if (var1 >= 265 && var1 < 270) {
               var7 = 25;
               var8 = 52;
            } else if (var1 >= 345 && var1 < 355) {
               var7 = -59;
               var8 = 10;
            } else if (var1 >= 335 && var1 < 345) {
               var7 = -57;
               var8 = 22;
            } else if (var1 >= 325 && var1 < 335) {
               var7 = -53;
               var8 = 32;
            } else if (var1 >= 315 && var1 < 325) {
               var7 = -50;
               var8 = 38;
            } else if (var1 >= 305 && var1 < 315) {
               var7 = -46;
               var8 = 43;
            } else if (var1 >= 295 && var1 < 305) {
               var7 = -41;
               var8 = 46;
            } else if (var1 >= 285 && var1 < 295) {
               var7 = -37;
               var8 = 49;
            } else if (var1 >= 275 && var1 < 285) {
               var7 = -30;
               var8 = 52;
            } else if (var1 > 270 && var1 < 275) {
               var7 = -25;
               var8 = 52;
            } else if (var1 >= 5 && var1 < 15) {
               var7 = -57;
               var8 = -7;
            } else if (var1 >= 15 && var1 < 25) {
               var7 = -54;
               var8 = -16;
            } else if (var1 >= 25 && var1 < 35) {
               var7 = -50;
               var8 = -25;
            } else if (var1 >= 35 && var1 < 45) {
               var7 = -48;
               var8 = -28;
            } else if (var1 >= 45 && var1 < 55) {
               var7 = -46;
               var8 = -34;
            } else if (var1 >= 55 && var1 < 65) {
               var7 = -41;
               var8 = -38;
            } else if (var1 >= 65 && var1 < 75) {
               var7 = -38;
               var8 = -40;
            } else if (var1 >= 75 && var1 < 85) {
               var7 = -36;
               var8 = -42;
            } else if (var1 >= 85 && var1 < 90) {
               var7 = -30;
               var8 = -44;
            } else if (var1 >= 165 && var1 < 175) {
               var7 = 57;
               var8 = -7;
            } else if (var1 >= 155 && var1 < 165) {
               var7 = 54;
               var8 = -16;
            } else if (var1 >= 145 && var1 < 155) {
               var7 = 50;
               var8 = -25;
            } else if (var1 >= 135 && var1 < 145) {
               var7 = 48;
               var8 = -28;
            } else if (var1 >= 125 && var1 < 135) {
               var7 = 46;
               var8 = -34;
            } else if (var1 >= 115 && var1 < 125) {
               var7 = 41;
               var8 = -38;
            } else if (var1 >= 105 && var1 < 115) {
               var7 = 38;
               var8 = -40;
            } else if (var1 >= 95 && var1 < 105) {
               var7 = 36;
               var8 = -42;
            } else if (var1 > 90 && var1 < 95) {
               var7 = 30;
               var8 = -44;
            } else if (var1 == 90) {
               if (var3 < 90) {
                  var7 = -30;
                  var8 = -44;
                  --var1;
               } else {
                  var7 = 30;
                  var8 = -44;
                  ++var1;
               }
            } else if (var1 == 270) {
               if (var3 < 270) {
                  var7 = -25;
                  var8 = 52;
                  --var1;
               } else {
                  var7 = 25;
                  var8 = 52;
                  ++var1;
               }
            }
         } else {
            var7 = -58;
            var8 = 5;
         }

         var4 = (var6 = new int[]{var7, var8, var1})[0];
         var5 = var6[1];
         this.n = var6[2];
      }

      if (var2 == 0) {
         var5 = 0;
      }

      return new int[]{var4, var5};
   }

   public final void paintTop(Graphics var1) {
      if (!Utlis.e() && !mConfig.gI().a(11) && !this.r() && (this.H >= 2 || this.m != 6 && this.m != 7)) {
         int var2 = 0;
         int var3 = 0;
         boolean var4 = true;
         int[] var5 = null;
         if (this.k == 63 || this.k == 65 || this.k == 66) {
            var1.c(179.0F);
         }

         int var6;
         boolean var7;
         short var9;
         int var11;
         if (this.m().m != null && this.m().m.length > 0) {
            ++this.V;
            int var8 = 0;
            var6 = this.m().b + this.m().d;
            var9 = this.cx;
            short var10 = this.cy;

            for(var11 = this.ag.size() - 1; var11 >= 0; --var11) {
               if (var6 > 0) {
                  var6 -= this.p;
               } else {
                  if (var8 >= this.m().m.length) {
                     break;
                  }

                  vdtt_ey var12 = (vdtt_ey)this.ag.get(var11);
                  int var13 = var9 - var12.cx;
                  int var14 = var10 - var12.cy;
                  var9 = var12.cx;
                  var10 = var12.cy;
                  var13 = b(var13, var14);
                  if (this.m().k) {
                     var13 = this.W;
                  }

                  var7 = true;
                  var1.k = var7;
                  short var15 = this.m().m[var8][0];

                  try {
                     var15 = this.m().m[var8][this.U];
                  } catch (Exception var17) {
                  }

                  if (this.p() || this.m().a == 17) {
                     var4 = false;
                     int[] var16;
                     var2 = (var16 = this.a(this.X.cx, this.X.cy, this.o))[0];
                     if ((var3 = var16[1]) != 0) {
                        this.n = this.o;
                     }

                     if (this.m().a == 24) {
                        if (this.V < this.m().m[var8].length) {
                           vdtt_cz.b(var1, this.m().m[var8][this.V], 0, this.K.cx + var2, this.K.cy + var3, 3);
                        }
                     } else {
                        var8 = Utlis.a(this.K.cx + var2, this.K.cy + var3, ((vdtt_ey)this.ag.get(this.H)).cx, ((vdtt_ey)this.ag.get(this.H)).cy);
                        if (this.k == 81 && var8 < 70) {
                           var8 = 70;
                        }

                        if (var8 > 0) {
                           var5 = vdtt_y.b(var1, var15, this.n, this.K.cx + var2, this.K.cy + var3, var8);
                        }
                     }
                     break;
                  }

                  vdtt_cz.b(var1, var15, c(var13), var12.cx, var12.cy, 3);
                  var7 = false;
                  var1.k = var7;
                  ++var8;
                  if (var6 <= 0) {
                     var6 = this.m().b;
                  }
               }
            }
         }

         Vector var18;
         if (this.m().a == 21) {
            var18 = this.M.aa();
            var9 = this.M.J;
            if (this.X != null) {
               var1.d(50);
               this.M.a(var1, this.cx, this.cy, var18, var9, var9, this.M.aE == 3);
               var1.m = 1.0F;
            } else {
               this.M.a(var1, this.L.cx, this.L.cy, var18, var9, var9, this.M.aE == 3);
            }
         } else if (this.m().a != 19 && this.m().a != 20) {
            if (this.m().l != null && this.m().l.length > 0 && this.m().l[0] != null && this.m().l[0].length > 0 && this.U >= 0 && this.U < this.m().l[0].length) {
               var9 = this.m().l[0][this.U];
               var6 = this.cx - this.aa;
               int var19 = this.cy - this.ab;
               var7 = true;
               var1.k = var7;
               var11 = b(var6, var19) + this.m().e;
               if (this.m().a == 11 && this.aj != null) {
                  var6 = this.l.cx - this.cx;
                  var19 = this.l.cy - this.cy;
                  var11 = b(var6, var19) + this.m().e;
               }

               if (this.m().j) {
                  var11 = this.W;
               }

               short[] var20 = null;
               if (!this.p() && this.m().a != 17) {
                  var20 = vdtt_cz.b(var1, var9, c(var11), this.cx, this.cy, 3);
               } else if (!var4) {
                  if (this.N.cx < this.K.cx + var2) {
                     this.N.dir = 2;
                  } else {
                     this.N.dir = 3;
                  }

                  this.N.aE = this.N.dir;
                  if (this.m().a == 24) {
                     vdtt_y.b(var1, var9, this.n, this.K.cx + var2, this.K.cy + var3, Utlis.a(this.K.cx, this.K.cy, this.cx, this.cy));
                  } else {
                     if (var5 != null) {
                        vdtt_cz.b(var1, var9, this.n + 180, var5[0], var5[1], 3);
                     }

                     var9 = this.m().l[1][this.U];
                     var20 = vdtt_cz.b(var1, var9, this.n, this.K.cx + var2, this.K.cy + var3, 3);
                  }
               }

               var7 = false;
               var1.k = var7;
               if (var20 != null) {
                  this.setSize(var20[0], var20[1]);
               }
            }
         } else {
            var18 = this.M.aa();
            if (this.cx == this.L.cx && this.cy == this.L.cy) {
               var6 = DataCenter.gI().h / 4 % 2 + 150;
               this.M.a(var1, this.cx, this.cy, var18, var6, var6, this.M.aE == 3, true);
            } else {
               var6 = DataCenter.gI().h / 4 % 2 + 152;
               this.M.a(var1, this.cx, this.cy, var18, var6, var6, this.cx - this.aa < 0, true);
            }
         }

         if (this.k == 63 || this.k == 65 || this.k == 66) {
            var1.r();
         }
      }

   }

   private void s() {
      int var1 = this.p + this.ak;
      this.aj = null;
      if (this.ah.size() > 0) {
         this.aj = (vdtt_ey)this.ah.remove(0);
         if (this.m == 25) {
            this.cx = this.N.cx;
            this.cy = (short)(this.N.cy - 80);
         } else {
            this.cx = this.aj.cx;
            this.cy = this.aj.cy;
         }
      } else {
         if (this.m == 25 && this.N.aU != null) {
            this.N.aU.i = true;
         }

         Entity var2 = this.l;
         if (this.X != null) {
            var2 = this.X;
         }

         if (var2 != null) {
            int var3;
            int var4;
            int var5;
            int var6;
            if (this.m != -1 && this.m != -2) {
               var3 = Utlis.b(var2.k() + this.al - this.cx);
               var4 = Utlis.b(var2.l() - this.cy);
               var5 = var1;
               var6 = var1;
               if (var4 > var3) {
                  if (var4 / var1 == 0) {
                     var5 = var4;
                  } else {
                     var5 = var3 / (var4 / var1);
                  }
               } else if (var3 / var1 == 0) {
                  var6 = var3;
               } else {
                  var6 = var4 / (var3 / var1);
               }

               if (var5 <= 0) {
                  var5 = 1;
               }

               if (var6 <= 0) {
                  var6 = 1;
               }

               if (this.cx > var2.k() + this.al) {
                  this.cx = (short)(this.cx - var5);
               } else if (this.cx < var2.k() + this.al) {
                  this.cx = (short)(this.cx + var5);
               }

               if (this.cy > var2.l()) {
                  this.cy = (short)(this.cy - var6);
               } else if (this.cy < var2.l()) {
                  this.cy = (short)(this.cy + var6);
               }
            } else {
               var3 = var2.k() + this.al - this.cx;
               var4 = var2.l() - this.cy;
               this.Z = this.b(var3, var4, this.Z);
               var5 = var1 * this.a(S, this.Z, -1) >> 10;
               var6 = var1 * this.a(R, this.Z, 1) >> 10;
               this.cx = (short)(this.cx + var5);
               this.cy = (short)(this.cy + var6);
            }
         }

         XYEntity var9 = XYEntity.create(this.aa, this.ab);
         XYEntity var10 = XYEntity.create(this.cx, this.cy);
         XYEntity var11 = XYEntity.create(var2.k() + this.al - 5, var2.l() - 5);
         XYEntity var12 = XYEntity.create(var2.k() + this.al + 5, var2.l() + 5);
         if (Utlis.a(var9, var10, var11, var12) != null) {
            this.cx = (short)(var2.cx + this.al);
            this.cy = var2.cy;
            if (this.m == 2 && this.X == null) {
               this.cy = (short)(var2.cy - this.m().i);
            }
         }

         if (this.p()) {
            var1 = this.K.cx - var2.k();
            int var7 = this.K.cy - var2.l();
            this.n = b(var1, var7);
            if (this.H <= 1) {
               var1 = b(var1, var7);
               int[] var8 = this.a(this.cx, this.cy, var1);
               this.cx = (short)(this.K.cx + var8[0]);
               this.cy = (short)(this.K.cy + var8[1]);
            }
         }

         this.ag.add(new vdtt_ey(this.cx, this.cy, true));
      }

   }

   public static int b(int var0, int var1) {
      if (var0 == 0 && var1 == 0) {
         return 0;
      } else {
         int var2;
         if (var0 != 0) {
            var2 = a(Math.abs((var1 << 10) / var0));
            if (var1 >= 0 && var0 < 0) {
               var2 = 180 - var2;
            }

            if (var1 < 0 && var0 < 0) {
               var2 += 180;
            }

            if (var1 < 0 && var0 >= 0) {
               var2 = 360 - var2;
            }
         } else {
            var2 = var1 > 0 ? 90 : 270;
         }

         return var2;
      }
   }

   private static int a(int var0) {
      for(int var1 = 0; var1 <= 90; ++var1) {
         if (T[var1] >= var0) {
            return var1;
         }
      }

      return 0;
   }

   private static int b(int var0) {
      if (var0 >= 360) {
         var0 -= 360;
      }

      if (var0 < 0) {
         var0 += 360;
      }

      return var0;
   }

   private int a(int[] var1, int var2, int var3) {
      if ((var2 = b(var2)) >= 0 && var2 < 90) {
         return var1[var2];
      } else if (var2 >= 90 && var2 < 180) {
         return var3 * var1[180 - var2];
      } else {
         return var2 >= 180 && var2 < 270 ? -var1[var2 - 180] : var3 * -var1[360 - var2];
      }
   }

   private int b(int var1, int var2, int var3) {
      int var4;
      if (var1 != 0) {
         var4 = a(Math.abs((var2 << 10) / var1));
         if (var2 >= 0 && var1 < 0) {
            var4 = 180 - var4;
         }

         if (var2 < 0 && var1 < 0) {
            var4 += 180;
         }

         if (var2 < 0 && var1 >= 0) {
            var4 = 360 - var4;
         }
      } else {
         var4 = var2 > 0 ? 90 : 270;
      }

      if (Math.abs(var4 - var3) >= 90 && var1 * var1 + var2 * var2 <= 4096) {
         return var4;
      } else if (Math.abs(var4 - var3) < 15) {
         return var4;
      } else {
         return (var4 - var3 < 0 || var4 - var3 >= 180) && var4 - var3 >= -180 ? b(var3 - 15) : b(var3 + 15);
      }
   }

   public final String strTop() {
      return null;
   }

   public final String strBottom() {
      return null;
   }

   public final void paintBottom(Graphics var1) {
   }

   public final int prioritize() {
      return this.k == 78 ? 7 : 1;
   }

   private static int c(int var0) {
      if (var0 >= 91 && var0 < 180) {
         var0 = -(180 - var0);
      } else if (var0 >= 180 && var0 < 270) {
         var0 = -(540 - var0);
      }

      return var0;
   }

   public final boolean p() {
      return this.m().a == 14 || this.m().a == 18 || this.m().a == 24 || this.m().a == 26;
   }

   private void v() {
      if (this.l instanceof Mob) {
         ((Mob)this.l).aA = 20;
      }

   }
}

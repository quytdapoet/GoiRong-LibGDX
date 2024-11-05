package gro;

import java.util.Vector;

public final class vdtt_ba extends vdtt_k {
   public static vdtt_eg[] l = new vdtt_eg[6];
   public static byte[] m = new byte[9];
   public Vector n = new Vector();
   public Vector H = new Vector();
   private Vector M = new Vector();
   public vdtt_hp I;
   private vdtt_hp N;
   private byte O;
   private int P;
   private int Q;
   public static String J = "";
   public static vdtt_ir K;
   public int L = 16;
   private int R = -1;
   private int S;

   public vdtt_ba(int var1, int var2, int var3, int var4, vdtt_w var5, byte var6, int var7, int var8) {
      this.a = var5;
      this.O = var6;
      this.P = var7;
      this.L = Utlis.n(16);
      this.setXY(var1, var2);
      this.setSize(var3, var4);
      if (var6 == 1) {
         if (mConfig.gI().b(29) == 2) {
            this.N = new vdtt_hp((byte)1, -97, 30, 90, var4 - 30, 15, this.H.size());
         } else {
            this.N = new vdtt_hp((byte)1, var3 + 9, 30, 90, var4 - 30, 15, this.H.size());
         }
      } else {
         this.N = new vdtt_hp((byte)1, 0, 0, 0, var4, var8, this.H.size());
      }

      this.I = new vdtt_hp((byte)1, 0, 0, var3, var4, var8, this.n.size());
      vdtt_jz.w();
   }

   public static void a(int var0, String var1, String var2, ItemCho var3) {
      boolean var4 = false;

      try {
         for(int var5 = 0; var5 < m.length; ++var5) {
            if (m[var5] != -1 && vdtt_jz.a[m[var5]] == 1) {
               vdtt_ej var6;
               (var6 = new vdtt_ej(m[1], var1, var2)).f = var3;
               l[0].a(var6);
               var4 = true;
               break;
            }
         }
      } catch (Exception var7) {
         Utlis.a(var7);
      }

      GameSrc.gI().c(var4);
   }

   public static void a(int var0, String var1, String var2) {
      boolean var3 = false;

      try {
         for(int var4 = 0; var4 < m.length; ++var4) {
            if (m[var4] != -1 && vdtt_jz.a[m[var4]] == var0) {
               l[0].a(new vdtt_ej(var0, var1, var2));
               var3 = true;
               break;
            }
         }

         switch(var0) {
         case 2:
            l[4].a(new vdtt_ej(2, var1, var2));
            break;
         case 3:
            l[2].a(new vdtt_ej(3, var1, var2));
            break;
         case 4:
            l[3].a(new vdtt_ej(4, var1, var2));
         case 5:
         case 6:
         case 7:
         case 8:
         default:
            break;
         case 9:
            l[5].a(new vdtt_ej(9, var1, var2));
         }
      } catch (Exception var5) {
      }

      GameSrc.gI().c(var3);
   }

   public static void a(int var0, String var1, String var2, String var3) {
      boolean var4 = false;

      try {
         for(int var5 = 0; var5 < m.length; ++var5) {
            if (m[var5] != -1 && vdtt_jz.a[m[var5]] == 5) {
               l[0].a(new vdtt_ej(5, var1, var2, var3));
               var4 = true;
               break;
            }
         }

         l[1].a.addElement(new vdtt_ej(5, var1, var2, var3));
      } catch (Exception var6) {
         Utlis.a(var6);
      }

      GameSrc.gI().c(var4);
   }

   public final void d() {
      this.H.clear();
      this.n.clear();
      this.R = -1;
      this.M.clear();
      Vector var1 = new Vector();

      vdtt_ej var2;
      int var3;
      int var4;
      for(var3 = 0; var3 < l[this.O].a.size(); ++var3) {
         String var5 = "";
         switch((var2 = (vdtt_ej)l[this.O].a.elementAt(var3)).a) {
         case 0:
            if (var2.b.equals(Char.gI().name)) {
               var5 = var5 + ":-lc c#ME" + var2.b + ": c#white";
            } else {
               var5 = var5 + ":-lc c#LC" + var2.b + ": c#white";
            }
            break;
         case 1:
            String var6 = ":-tg";
            String var7 = "c#TG";
            if (var2.d.startsWith(":-loa")) {
               var6 = ":-tt";
               var7 = "c#TT";
            }

            if (var2.b.equals(Char.gI().name)) {
               var5 = var5 + var6 + " c#ME" + var2.b + ": c#white";
            } else if (var2.b.equals(Caption.ep)) {
               var5 = var5 + var6 + " c#yellow" + var2.b + ": c#white";
            } else {
               var5 = var5 + var6 + " " + var7 + var2.b + ": c#white";
            }
            break;
         case 2:
            if (var2.b.equals(Char.gI().name)) {
               var5 = var5 + ":-mp c#ME" + var2.b + ": c#white";
            } else {
               var5 = var5 + ":-mp c#MP" + var2.b + ": c#white";
            }
            break;
         case 3:
            if (var2.b.equals(Char.gI().name)) {
               var5 = var5 + ":-b c#ME" + var2.b + ": c#white";
            } else {
               var5 = var5 + ":-b c#BG" + var2.b + ": c#white";
            }
            break;
         case 4:
            if (var2.b.equals(Char.gI().name)) {
               var5 = var5 + ":-n c#ME" + var2.b + ": c#white";
            } else {
               var5 = var5 + ":-n c#NM" + var2.b + ": c#white";
            }
            break;
         case 5:
            if (var2.b.equals(Char.gI().name)) {
               var5 = var5 + ":-r c#ME" + var2.b + ": c#white";
            } else {
               var5 = var5 + ":-r c#RG" + var2.b + ": c#white";
            }
            break;
         case 6:
            if (var2.b.equals(Char.gI().name)) {
               var5 = var5 + ":-sv c#ME" + var2.b + ": c#white";
            } else if (var2.b.equals(Caption.ep)) {
               var5 = var5 + ":-sv c#yellow" + var2.b + ": c#white";
            } else {
               var5 = var5 + ":-sv c#SV" + var2.b + ": c#white";
            }
         case 7:
         default:
            break;
         case 8:
            if (var2.b.equals(Char.gI().name)) {
               var5 = var5 + ":-tt c#ME" + var2.b + ": c#white";
            } else {
               var5 = var5 + ":-tt c#TT" + var2.b + ": c#white";
            }
            break;
         case 9:
            if (var2.b.equals(Char.gI().name)) {
               var5 = var5 + ":-ht c#ME" + var2.b + ": c#white";
            } else {
               var5 = var5 + ":-ht c#HT" + var2.b + ": c#white";
            }
         }

         var5 = var5 + var2.d;
         if (this.O != 1 || J.length() <= 0 || J.equals(var2.c) || J.equals(var2.b)) {
            Vector var8;
            if (!(this.a instanceof vdtt_ka)) {
               (var8 = new Vector()).add(var5);
               this.R = this.n.size();
               this.S = 0;
            } else {
               var8 = vdtt_dd.a(vdtt_dd.d, var5, this.I.width - 15);
            }

            Utlis.a(this.n, var8);

            for(var4 = 0; var4 < var8.size(); ++var4) {
               if (((String)var8.elementAt(var4)).contains("c#item")) {
                  this.M.addElement(var2.f);
               }
            }
         }

         if (this.O == 1) {
            if (J.equals(Caption.eq) || var2.c.equals(J) || var2.b.equals(J)) {
               var2.e = true;
            }
         } else {
            var2.e = true;
         }

         if (var2.c.length() > 0) {
            if (!var1.contains(var2.c) && !var2.c.equals(Char.gI().name)) {
               var1.addElement(var2.c);
               this.H.addElement(new vdtt_ir(0, var2.c));
            }

            if (!var1.contains(var2.b) && !var2.b.equals(Char.gI().name)) {
               var1.addElement(var2.b);
               this.H.addElement(new vdtt_ir(0, var2.b));
            }
         }
      }

      this.N.a(this.N.g, this.N.h, this.H.size());
      this.I.a(this.I.g, this.I.h, this.n.size());

      for(var3 = 0; var3 < this.H.size(); ++var3) {
         vdtt_ir var10 = (vdtt_ir)this.H.elementAt(var3);
         var4 = 0;

         for(int var9 = 0; var9 < l[this.O].a.size(); ++var9) {
            if (!(var2 = (vdtt_ej)l[this.O].a.elementAt(var9)).e && (var9 == 0 && var2.c.length() == 0 || var2.b.equals(var10.b) || var2.c.equals(var10.b))) {
               ++var4;
            }
         }

         var10.a = var4;
      }

   }

   public final short f() {
      short var1 = 0;

      for(int var2 = 0; var2 < l[this.O].a.size(); ++var2) {
         if (!((vdtt_ej)l[this.O].a.elementAt(var2)).e) {
            ++var1;
         }
      }

      return var1;
   }

   public final void b(Graphics var1) {
      try {
         if (!this.d) {
            int var2 = var1.e;
            int var3 = var1.f;
            int var4 = -1;
            if (this.Q > 0) {
               --this.Q;
            }

            int var5;
            String var6;
            int var7;
            int var8;
            int var9;
            int var10;
            int var11;
            if (!(this.a instanceof vdtt_ka)) {
               try {
                  var8 = this.I.width - 2;
                  var11 = this.I.height;
                  var5 = var8;
                  vdtt_hp var12 = this.I;
                  Graphics var13 = var1;
                  vdtt_ba var14 = this;

                  try {
                     var14.f = var13.e;
                     var14.g = var13.f;
                     var14.h = var13.k();
                     var14.i = var13.l();
                     var14.j = var13.h;
                     var14.k = var13.i;
                     if (var5 > var14.j) {
                        var5 = var14.j;
                     }

                     if (var11 > var14.k) {
                        var11 = var14.k;
                     }

                     var12.a(var13, var14.a(), var14.b(), var5, var11);
                  } catch (Exception var17) {
                  }

                  for(var7 = 0; var7 < this.n.size(); ++var7) {
                     var6 = (String)this.n.elementAt(var7);
                     if (this.Q == 0 && var6.contains("c#select")) {
                        var6 = var6.replaceAll("c#select", "");
                        this.n.set(var7, var6);
                     }
                  }

                  if ((var7 = this.n.size() - 1) < 0) {
                     var7 = 0;
                  }

                  for(var10 = var7; var10 < this.n.size(); ++var10) {
                     var6 = (String)this.n.elementAt(var10);
                     var5 = this.width / 2;
                     if (var10 == this.R) {
                        if (this.S > 160) {
                           var4 = vdtt_dd.c(vdtt_dd.d, var1, var6, 0 - (this.S - 160), this.L / 2, 0, var4, -16777216);
                        } else {
                           var4 = vdtt_dd.c(vdtt_dd.d, var1, var6, 0, this.L / 2, 0, var4, -16777216);
                        }
                     } else {
                        var4 = vdtt_dd.c(vdtt_dd.d, var1, var6, var5, this.L / 2, 2, var4, -16777216);
                     }
                  }

                  this.a(var1);
                  this.a(var1, var2, var3);
                  var9 = 1;

                  boolean var15;
                  label177:
                  while(true) {
                     if (var9 >= l.length) {
                        var15 = false;
                        break;
                     }

                     for(var7 = 0; var7 < l[var9].a.size(); ++var7) {
                        vdtt_ej var16;
                        if (!(var16 = (vdtt_ej)l[var9].a.elementAt(var7)).e && var16.a == 5) {
                           var15 = true;
                           break label177;
                        }
                     }

                     ++var9;
                  }

                  if (var15) {
                     vdtt_cz.a(var1, 713, 0, -2, -2, 3);
                  }
               } catch (Exception var18) {
               }
            } else {
               this.a(var1, this.I);

               for(var7 = 0; var7 < this.n.size(); ++var7) {
                  var6 = (String)this.n.elementAt(var7);
                  if (this.I.b(var7)) {
                     var4 = vdtt_dd.c(vdtt_dd.d, var1, var6, 5, 8 + var7 * 16, 20, var4, -16777216);
                  }

                  if (this.Q == 0 && var6.contains("c#select")) {
                     var6 = var6.replaceAll("c#select", "");
                     this.n.set(var7, var6);
                  }
               }

               this.a(var1);
               this.a(var1, var2, var3);
               this.I.a(var1, -8, -10, -16313837);
            }

            if (this.O == 1) {
               this.a(var1, var2, var3);
               if (this.H.size() > 0) {
                  if (mConfig.gI().b(29) == 2) {
                     vdtt_y.a(var1, 14, -360, this.N.cx + 2, this.N.cy - 1, this.N.width + 1, (int)(this.N.height + 4));
                     var11 = this.N.cx + 1;
                     var8 = this.N.cy - 3;
                     int var20 = this.N.height + 8;
                     boolean var23 = true;
                     var23 = true;
                     var23 = false;
                     var23 = true;
                     var23 = true;
                     var23 = true;
                     var23 = false;
                     short var24 = this.N.width;
                     int var25 = var1.e;
                     int var26 = var1.f;
                     var1.a(var11, var8);
                     var10 = vdtt_cz.d(3).c / DataCenter.gI().r;
                     if (vdtt_cz.a(4)) {
                        var5 = var10;
                     } else {
                        var5 = vdtt_cz.d(4).c / DataCenter.gI().r;
                     }

                     vdtt_y.a(var1, 0, 90, 0, 1, var24 - 0, (int)(var20 - 2));
                     vdtt_y.a(var1, 4, 0, var10, 0, var24 - var10 + 1, (int)var5);
                     vdtt_y.a(var1, 4, 180, var10, var20 - var5, var24 - var10 + 1, (int)var5);
                     vdtt_y.a(var1, 4, -90, 0, var10, var5, (int)(var20 - var10 * 2));
                     vdtt_cz.a(var1, 3, 0, var5, 0, 24);
                     vdtt_cz.a(var1, 3, 270, var5, var20, 40);
                     this.a(var1, var25, var26);
                  } else {
                     vdtt_y.a(var1, 14, 0, this.N.cx - 2, this.N.cy - 1, this.N.width + 1, (int)(this.N.height + 4));
                     this.a(var1, this.N.cx - 1, this.N.cy - 3, this.N.width, this.N.height + 8, 0, 3, 4, 4, 0, 1, 90);
                  }
               }

               this.a(var1, this.N);

               for(var7 = 0; var7 < this.H.size(); ++var7) {
                  if (this.N.b(var7)) {
                     vdtt_ir var21;
                     String var22 = (var21 = (vdtt_ir)this.H.elementAt(var7)).b;
                     var5 = 5;
                     var9 = 8 + var7 * 16;
                     if (var7 == this.N.l && !this.N.o) {
                        ++var5;
                        ++var9;
                     }

                     if (mConfig.gI().b(29) == 2) {
                        if (var22.equals(J)) {
                           vdtt_dd.b(vdtt_dd.d, var1, var22 + (var21.a > 0 ? " (" + var21.a + ")" : ""), var5 - 1 + 20, var9 - 1, 0, -2560, -10275328);
                        } else {
                           vdtt_dd.b(vdtt_dd.d, var1, var22 + (var21.a > 0 ? " (" + var21.a + ")" : ""), var5 - 1 + 20, var9 - 1, 0, -6488, -10275328);
                        }

                        if (var7 == this.N.l && this.N.o) {
                           var1.e(30);
                           vdtt_cz.a(var1, 52, 0, 20, 8 + var7 * 16 + 1, 10);
                           var1.h();
                        } else {
                           vdtt_cz.a(var1, 52, 0, 20, 8 + var7 * 16, 10);
                        }
                     } else {
                        if (var22.equals(J)) {
                           vdtt_dd.b(vdtt_dd.d, var1, var22 + (var21.a > 0 ? " (" + var21.a + ")" : ""), var5 - 1 + this.N.width - 30, var9 - 1, 1, -2560, -10275328);
                        } else {
                           vdtt_dd.b(vdtt_dd.d, var1, var22 + (var21.a > 0 ? " (" + var21.a + ")" : ""), var5 - 1 + this.N.width - 30, var9 - 1, 1, -6488, -10275328);
                        }

                        if (var7 == this.N.l && this.N.o) {
                           var1.e(30);
                           vdtt_cz.a(var1, 52, 0, this.N.width - 5 + 1, 8 + var7 * 16 + 1, 10);
                           var1.h();
                        } else {
                           vdtt_cz.a(var1, 52, 0, this.N.width - 5, 8 + var7 * 16, 10);
                        }
                     }
                  }
               }

               this.a(var1);
               this.a(var1, var2, var3);
               this.I.a(var1, -8, -10, -16313837);
            }
         }
      } catch (Exception var19) {
         Utlis.a(var19);
      }

   }

   public final void a_() {
      this.N.a();
      this.I.a();
      if (this.R >= 0) {
         this.S += 2;
      }

   }

   public final Vector g() {
      Vector var1 = new Vector();

      try {
         if (this.d) {
            return var1;
         }

         if (!(this.a instanceof vdtt_ka)) {
            var1.add(new vdtt_hi(5011, 0, 0, this.width, this.height, (vdtt_hp)null, this));
            return var1;
         }

         int var2;
         for(var2 = 0; var2 < this.H.size(); ++var2) {
            if (this.N.b(var2)) {
               vdtt_ir var3 = (vdtt_ir)this.H.elementAt(var2);
               vdtt_hi var4 = new vdtt_hi(5009, this.N.cx + this.N.width - 20, this.N.cy + var2 * 16 - this.N.f, this.N.cx + this.N.width, this.N.cy + var2 * 16 + 16 - this.N.f, this.N, this, new vdtt_ir(0, var3.b));
               if (mConfig.gI().b(29) == 2) {
                  var4 = new vdtt_hi(5009, this.N.cx + 5, this.N.cy + var2 * 16 - this.N.f, this.N.cx + 21, this.N.cy + var2 * 16 + 16 - this.N.f, this.N, this, new vdtt_ir(0, var3.b));
               }

               if (Utlis.a(this.N.cx, this.N.cy, this.N.cx + this.N.width, this.N.cy + this.N.height, var4.a(), var4.b())) {
                  var1.addElement(var4);
               }
            }
         }

         var2 = -1;

         for(int var12 = 0; var12 < this.n.size(); ++var12) {
            vdtt_ik var5;
            vdtt_hi var6;
            String[] var7;
            String var13;
            if ((var13 = (String)this.n.elementAt(var12)).contains(":-") && (var7 = var13.split(": ")).length > 0 && (var7 = (var13 = var7[0]).split(" c#")).length > 1) {
               var5 = vdtt_df.c(var13 = "c#" + var7[1]);
               if (!(var13 = var13.substring(var5.d.length(), var13.length())).equals(Caption.er) && !var13.equals(Caption.ep) && !var13.equals(Caption.h) && !var13.equals(Char.gI().name)) {
                  var6 = new vdtt_hi(5008, 20, var12 * 16 - this.I.f, 23 + vdtt_dd.b(vdtt_dd.d, var13), var12 * 16 + 16 - this.I.f, this.I, this, new vdtt_ir(0, var13));
                  if (this.I.b(var12) && Utlis.a(this.I.cx, this.I.cy, this.I.cx + this.I.width, this.I.cy + this.I.height, var6.a(), var6.b())) {
                     var1.addElement(var6);
                  }
               }
            }

            boolean var8 = (var13 = (String)this.n.elementAt(var12)).contains(Caption.wH);
            if (var13.contains("c#item")) {
               ++var2;
               var7 = var13.split("c#item");
               int var9 = this.I.cx + 3 + vdtt_dd.c(vdtt_dd.d, var7[0]);
               int var10 = this.I.cy + var12 * this.I.h - this.I.f;
               if ((var5 = vdtt_df.d(var13 = var7[1])) != null) {
                  var13 = var13.split(var5.d)[0];
               }

               if (var8) {
                  var6 = new vdtt_hi(5010, var9, var10, var9 + vdtt_dd.c(vdtt_dd.d, var13) + 2, var10 + this.I.h, this.I, this, new vdtt_ir(var2, var13));
               } else {
                  var6 = new vdtt_hi(5012, var9, var10, var9 + vdtt_dd.c(vdtt_dd.d, var13) + 2, var10 + this.I.h, this.I, this, new vdtt_ir(var2, var13));
               }

               if (this.I.b(var12) && Utlis.a(this.I.cx, this.I.cy, this.I.cx + this.I.width, this.I.cy + this.I.height, var6.a(), var6.b())) {
                  var1.addElement(var6);
               }
            }
         }

         if (this.H.size() > 0) {
            var1.addElement(this.N.a(5007, this));
         }

         var1.addElement(this.I.a(this.P, this));
      } catch (Exception var11) {
      }

      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (!this.d) {
         int var4;
         vdtt_ir var5;
         Vector var6;
         int var7;
         int var8;
         switch(var1.b) {
         case 2001:
            String var9 = J;
            vdtt_ba var10 = this;

            for(var3 = 0; var3 < var10.H.size() && !((vdtt_ir)var10.H.elementAt(var3)).b.equals(var9); ++var3) {
            }

            --var3;
            if (var3 < 0) {
               var3 = 0;
            }

            for(var4 = l[var10.O].a.size() - 1; var4 >= 0; --var4) {
               vdtt_ej var13;
               if ((var13 = (vdtt_ej)l[var10.O].a.elementAt(var4)).b.equals(var9) || var13.c.equals(var9)) {
                  l[var10.O].a.remove(var13);
               }
            }

            var10.a(var3);
            return;
         case 5007:
            if (var1.j.k >= 0) {
               this.a(var1.j.k);
               return;
            }
            break;
         case 5008:
            if (var1.j.k >= 0) {
               var7 = this.cx + var2;
               var8 = this.cy + var3;
               var5 = (vdtt_ir)var1.k;
               var4 = var1.j.k;
               String var12 = ((String)this.n.elementAt(var4)).replaceAll(var5.b, "c#select" + var5.b);
               this.n.set(var4, var12);
               this.Q = 6;
               K = var5;
               var6 = new Vector();
               if (GameSrc.gI().bq != null && !GameSrc.gI().bq.isEmpty()) {
                  if (GameSrc.gI().bq.isLeader() && !GameSrc.gI().bq.isMember(var5.b)) {
                     var6.addElement(new vdtt_ir(6008, Caption.ex));
                  }
               } else {
                  var6.addElement(new vdtt_ir(6008, Caption.ew));
               }

               vdtt_w.a(var6, var5.b);
               this.a.a(var6, var5.b, var4, var7, var8);
               return;
            }
            break;
         case 5009:
            this.a(((vdtt_ir)var1.k).b);
            DataCenter.gI().currentScreen.a(Caption.et + ((vdtt_ir)var1.k).b + Caption.eu, 2001, this);
            return;
         case 5010:
            if (var1.j.k >= 0) {
               this.a(this.cx + var2, this.cy + var3, (vdtt_ir)var1.k);
               return;
            }
            break;
         case 5011:
            vdtt_aa.gI().n();
            vdtt_aa.gI().w();
            GameSrc var11;
            if ((var11 = GameSrc.gI()).D()) {
               var11.a((vdtt_w)(new vdtt_kb(var11, var11.aR.j())));
            }

            return;
         case 5012:
            if (var1.j.k >= 0) {
               var7 = this.cx + var2;
               var8 = this.cy + var3;
               var5 = (vdtt_ir)var1.k;
               var4 = var1.j.k;
               (var6 = new Vector()).addElement(new vdtt_ir(4004, Caption.dR));
               this.a.a(var6, var5.b, var4, var7, var8);
            }
         }
      }

   }

   private void a(int var1, int var2, vdtt_ir var3) {
      try {
         ItemCho var4 = (ItemCho)this.M.elementAt(var3.a);
         vdtt_w var5 = this.a;
         boolean var6 = false;
         vdtt_w var7 = this.a;
         vdtt_bm var8;
         if (var4 == null) {
            var8 = null;
         } else {
            vdtt_bl var9;
            if ((var9 = new vdtt_bl(var1, var2, 1044, var7, var4)).cx > DataCenter.gI().n - var9.width - var7.cx) {
               var9.cx = (short)(DataCenter.gI().n - var9.width - var7.cx);
            }

            if (var9.cx < var1 - 0) {
               var9.cx = (short)(var1 - (var9.width + 3));
            }

            if (var9.cx < -var7.cx) {
               var9.cx = (short)(-var7.cx);
            }

            if (var9.cy > DataCenter.gI().o - var9.height - var7.cy) {
               var9.cy = (short)(DataCenter.gI().o - var9.height - var7.cy);
            }

            vdtt_bm var10 = new vdtt_bm(var1 - 32, var2 + 32, var9);
            var7.a(var10);
            var8 = var10;
         }

         var5.k = var8;
         var2 = -1;
         int var12 = 0;

         while(true) {
            if (var12 >= this.n.size()) {
               return;
            }

            String var13;
            if ((var13 = (String)this.n.elementAt(var12)).contains("c#item")) {
               ++var2;
               if (var2 == var3.a) {
                  this.Q = 6;
                  var13 = var13.replaceAll(var3.b, "c#select" + var3.b);
                  this.n.set(var12, var13);
                  break;
               }
            }

            ++var12;
         }
      } catch (Exception var11) {
         Utlis.a(var11);
      }

   }

   public final void h() {
      this.I.j = this.I.i;
      this.I.e();
      vdtt_hp var1;
      (var1 = this.I).c = var1.j * var1.h;
      if (var1.c < var1.d) {
         var1.c = var1.d;
      }

      if (var1.c > var1.e) {
         var1.c = var1.e;
      }

      var1.f = var1.c;
   }

   private void a(int var1) {
      try {
         J = ((vdtt_ir)this.H.elementAt(var1)).b;
      } catch (Exception var3) {
         J = "";
      }

      this.d();
      if (this.a instanceof vdtt_ka) {
         vdtt_ka var2;
         (var2 = (vdtt_ka)this.a).O.b.d[var2.O.h()] = this.f();
         if (var2.Q.m) {
            this.h();
         }
      }

   }

   public final void a(String var1) {
      J = var1;
      this.d();
      if (this.a instanceof vdtt_ka) {
         vdtt_ka var2;
         (var2 = (vdtt_ka)this.a).O.b.d[var2.O.h()] = this.f();
         if (var2.Q.m) {
            this.h();
         }
      }

   }

   static {
      for(int var0 = 0; var0 < l.length; ++var0) {
         l[var0] = new vdtt_eg();
      }

   }
}

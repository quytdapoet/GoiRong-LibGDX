package gro;

import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public final class vdtt_jf extends vdtt_ao {
   private static Vector T = new Vector();
   private static vdtt_ds U;
   private static vdtt_ds V;
   private static vdtt_ds W;
   private static vdtt_ds X;
   public vdtt_hp[][] N;
   private vdtt_hp[] Y;
   private vdtt_hp Z;
   private int aa;
   private int ab;
   private int ac;
   private int ad;
   private int ae;
   private int af;
   private Vector ag = new Vector();
   public Vector O = new Vector();
   private Vector ah = new Vector();
   public static String[][] P;
   public boolean Q;
   private boolean ai;
   public int R;
   private vdtt_ay aj;
   private vdtt_in ak;
   private vdtt_fe al;
   private String[][] am;
   private Vector an;
   private int ao;
   private int[] ap = new int[]{49, 61, 28, 92, 22, 21, 102, 59, 98, 32};
   public Item[][] S;
   private vdtt_hp[][] aq;
   private Item ar;

   public vdtt_jf(MainScreen var1, Message var2) {
      super(var1);

      try {
         this.a(348);
         vdtt_hm var3;
         (var3 = new vdtt_hm(5000)).c = Caption.Ao;
         this.a(var3, 170, 80, 4);
         this.J = false;
         this.aa = Utlis.f();
         this.ak = new vdtt_in(new vdtt_hm(1001, Caption.Am), this);
         this.ab = (this.width - 20) / 6;
         this.ac = this.h() - 30;
         this.ad = 35;
         this.ae = 6;
         this.af = this.f() + 2;
         this.N = new vdtt_hp[3][];
         this.N[0] = new vdtt_hp[1];
         this.N[0][0] = new vdtt_hp((byte)0, this.ae, this.af, this.ab * 7, 18, this.ab, 7);

         String[] var4;
         int var5;
         vdtt_ds var6;
         for(var5 = 0; var5 < 7; ++var5) {
            for(Iterator var7 = g(var5).iterator(); var7.hasNext(); var6.g = var4) {
               vdtt_ds var8;
               var6 = var8 = (vdtt_ds)var7.next();
               var4 = vdtt_dd.c(vdtt_dd.b, var8.d, this.ab - 12);
            }
         }

         Collections.sort(T, vdtt_ds.h);
         this.B();

         try {
            String[] var15 = Utlis.a(var2.readUTF(), "\\n");
            this.ag.clear();

            for(int var17 = 0; var17 < var15.length; ++var17) {
               this.ag.addAll(vdtt_dd.a(vdtt_dd.d, var15[var17], super.width - 8 - 46));
            }
         } catch (Exception var13) {
         }

         this.N[1] = new vdtt_hp[1];
         this.N[1][0] = new vdtt_hp((byte)1, 13, this.f() + 11, super.width - 8 - 18, 182, 14, this.ag.size());
         this.N[2] = new vdtt_hp[3];
         this.N[2][0] = new vdtt_hp((byte)1, 13, this.f() + 11, super.width - 8 - 18, 189, 27, P[0].length);
         this.N[2][1] = new vdtt_hp((byte)1, 13, this.f() + 45, super.width - 8 - 18, 120, 15, 0);
         this.N[2][2] = new vdtt_hp((byte)1, 13, this.f() + 11, super.width - 8 - 18, 27, 27, 1);
         this.A();
         GameSrc.gI().co = z() == null;
         this.aj = this.a(this.width - 72, this.height - 30, Caption.nz, this, 1011, -8);
         this.a(this.aj, 3);
         this.an = new Vector();

         for(var5 = 0; var5 < this.ap.length; ++var5) {
            if (this.ap[var5] == 61) {
               this.an.addElement(new vdtt_ir(this.ap[var5], String.format("%s", Caption.xK)));
            } else {
               int var16 = this.ap[var5];
               Vector var9;
               int var10;
               Object[] var11;
               int var12;
               String var18;
               if ((var18 = DataCenter.gI().npcTemplate[var16].detail) != null && !var18.isEmpty()) {
                  var9 = this.an;
                  var10 = this.ap[var5];
                  var11 = new Object[2];
                  var12 = this.ap[var5];
                  var11[0] = DataCenter.gI().npcTemplate[var12].name;
                  var11[1] = var18;
                  var9.addElement(new vdtt_ir(var10, String.format("%s (%s)", var11)));
               } else {
                  var9 = this.an;
                  var10 = this.ap[var5];
                  var11 = new Object[1];
                  var12 = this.ap[var5];
                  var11[0] = DataCenter.gI().npcTemplate[var12].name;
                  var9.addElement(new vdtt_ir(var10, String.format("%s", var11)));
               }
            }
         }

         this.am = new String[this.ap.length][];
         this.am[0] = Caption.By;
         this.am[1] = Caption.Cb;
         this.am[2] = Caption.Bw;
         this.am[3] = Caption.Bx;
         this.am[4] = Caption.Bz;
         this.am[5] = Caption.BA;
         this.am[6] = Caption.BB;
         this.am[7] = Caption.BD;
         this.am[8] = Caption.BF;
         this.am[9] = Caption.BG;
         this.Y = new vdtt_hp[3];
         this.Y[0] = new vdtt_hp((byte)1, 13, this.f() + 11, super.width - 8 - 18, 189, 27, this.an.size());
         this.Y[1] = new vdtt_hp((byte)1, 13, this.f() + 11, super.width - 8 - 18, 27, 27, 1);
         this.f(0);
         this.ak.a(this.aa);
      } catch (Exception var14) {
         Utlis.a(var14);
      }

   }

   public final void f(int var1) {
      super.f(var1);
   }

   private void A() {
      if (!DataCenter.k()) {
         int[][] var1 = new int[P[0].length][];
         boolean[][] var2 = new boolean[P[0].length][];
         var1[4] = new int[]{566, 160, 191, 4, 404, 818};
         var2[4] = new boolean[]{false, true, false, false, false, false};
         var1[5] = new int[]{163, 697, 813, 164};
         var2[5] = new boolean[]{true, true, false, false};
         var1[6] = new int[]{562, 838, 163, 697, 814, 164};
         var2[6] = new boolean[]{false, true, true, true, false, false};
         var1[7] = new int[]{191, 4, 817, 816, 164};
         var2[7] = new boolean[]{false, false, false, false, false};
         var1[8] = new int[]{5, 163, 697, 815, 164, 853};
         var2[8] = new boolean[]{false, true, true, false, false, false};
         var1[9] = new int[]{5, 163, 697, 815, 164, 853};
         var2[9] = new boolean[]{false, true, true, false, false, false};
         var1[10] = new int[]{4, 711};
         var2[10] = new boolean[]{true, true};
         var1[12] = new int[]{891, 189, 931, 191};
         var2[12] = new boolean[]{true, true, true, false};
         var1[14] = new int[]{354, 4, 838, 910};
         var2[14] = new boolean[]{false, false, true, true};
         var1[15] = new int[]{734, 745, 756, 767};
         var2[15] = new boolean[]{true, true, true, true};
         var1[17] = new int[]{829, 163, 160, 177};
         var2[17] = new boolean[]{true, true, true, true};
         var1[18] = new int[]{5, 163, 697, 815, 164, 853};
         var2[18] = new boolean[]{false, true, true, false, false, true};
         var1[19] = new int[]{353, 564, 4, 406, 938, 771};
         var2[19] = new boolean[]{false, false, false, false, true, false};
         var1[20] = new int[]{1058, 1063, 1068, 1073, 6};
         var2[20] = new boolean[]{false, true, false, true, true};
         var1[21] = new int[]{909, 177, 922};
         var2[21] = new boolean[]{true, true, false};
         this.S = new Item[var1.length][];
         this.aq = new vdtt_hp[var1.length][];

         for(int var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3] != null) {
               this.S[var3] = new Item[var1[var3].length];
               this.aq[var3] = new vdtt_hp[var1[var3].length];

               for(int var4 = 0; var4 < var1[var3].length; ++var4) {
                  this.S[var3][var4] = new Item(var1[var3][var4], var2[var3][var4]);
                  this.aq[var3][var4] = new vdtt_hp((byte)1, 75 + var4 * 35, this.f() + this.height - 68, 28, 28, 1, 1);
               }
            }
         }
      }

   }

   public static vdtt_ds z() {
      Vector var0 = g(Utlis.f());

      for(int var1 = 0; var1 < var0.size(); ++var1) {
         vdtt_ds var2;
         if ((var2 = (vdtt_ds)var0.get(var1)).a()) {
            return var2;
         }
      }

      return null;
   }

   private static Vector g(int var0) {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < T.size(); ++var2) {
         if (((vdtt_ds)T.get(var2)).a == var0) {
            var1.add(T.get(var2));
         }
      }

      return var1;
   }

   public final Vector g() {
      Vector var1 = super.g();
      int var2;
      switch(super.a.b) {
      case 0:
         var1.addElement(this.ak.f());
         break;
      case 1:
         for(var2 = 0; var2 < this.N[super.a.b].length; ++var2) {
            var1.addElement(this.N[super.a.b][var2].a(1030, this));
         }

         return var1;
      case 2:
         if (!this.Q) {
            var1.addElement(this.N[super.a.b][0].a(9980, this));
         } else {
            var1.addElement(this.N[super.a.b][2].a(9981, this));
            var1.addElement(this.N[super.a.b][1].a(1030, this));
         }

         if (this.aq != null && this.aq[this.R] != null && this.Q) {
            for(var2 = 0; var2 < this.aq[this.R].length; ++var2) {
               if (this.aq[this.R][var2] != null) {
                  var1.addElement(this.aq[this.R][var2].a(3000, this, this.S[this.R][var2]));
               }
            }
         }
         break;
      case 3:
         if (!this.ai) {
            var1.addElement(this.Y[0].a(9982, this));
         } else {
            var1.addElement(this.Y[1].a(9983, this));
            if (this.Y[2] != null) {
               var1.addElement(this.Y[2].a(9984, this));
            }
         }
      }

      return var1;
   }

   public final void b(Graphics var1) {
      super.b(var1);
      switch(super.a.b) {
      case 0:
         this.ak.a(var1);
         Graphics var2 = var1;
         vdtt_jf var3 = this;
         Vector var4 = g(this.aa);
         int var5 = 0;
         vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, Caption.wr, 5 + this.Z.cx, this.Z.cy - this.Z.h * 2 + vdtt_dd.a(vdtt_dd.d) / 2, 0, -1, -16777216);
         vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, Caption.ws, 5 + this.Z.cx, this.Z.cy - this.Z.h + vdtt_dd.a(vdtt_dd.d) / 2, 0, -1, -16777216);
         if (var4.size() > 0) {
            this.a(var1, this.Z);

            for(int var6 = 0; var6 < var3.Z.i; ++var6) {
               if (var5 < var4.size()) {
                  vdtt_ds var7 = (vdtt_ds)var4.get(var5);
                  if (var3.Z.b(var6)) {
                     try {
                        short var8 = -1;
                        if (var7.a() && var7.a == Utlis.f()) {
                           var8 = -2560;
                        }

                        vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var2, "- " + var7.d + Caption.wq + Utlis.l(var7.b) + " - " + Utlis.l(var7.c), 5, var6 * var3.Z.h + vdtt_dd.a(vdtt_dd.d) / 2, 0, var8, -16777216);
                     } catch (Exception var9) {
                     }
                  }
               }

               ++var5;
            }

            var3.a(var2);
         }

         return;
      case 1:
         this.f(var1);
         return;
      case 2:
         this.g(var1);
         return;
      case 3:
         this.h(var1);
      default:
      }
   }

   private void f(Graphics var1) {
      this.a(var1, this.N[super.a.b][0]);

      for(int var2 = 0; var2 < this.N[super.a.b][0].i; ++var2) {
         if (this.N[super.a.b][0].b(var2)) {
            vdtt_dd.a(var1, (String)this.ag.get(var2), 5, var2 * this.N[super.a.b][0].h + 6, 0, -1);
         }
      }

      this.a(var1);
      this.N[super.a.b][0].a(var1, this);
   }

   private void g(Graphics var1) {
      int var2;
      int var3;
      if (!this.Q) {
         this.a(var1, this.N[super.a.b][0]);

         for(var2 = 0; var2 < this.N[super.a.b][0].i; ++var2) {
            if (this.N[super.a.b][0].b(var2)) {
               this.a(var1, 0, var2 * this.N[super.a.b][0].h, this.N[super.a.b][0].width, 26, 46, 22, 23, 1, 1);
               if (P[0][var2].equals(Caption.wK)) {
                  vdtt_cz.a(var1, 638, 0, 15, var2 * this.N[super.a.b][0].h + 13, 3);
               } else {
                  vdtt_cz.a(var1, 395, 0, 15, var2 * this.N[super.a.b][0].h + 13, 3);
               }

               if (this.N[super.a.b][0].l == var2) {
                  vdtt_dd.c(vdtt_dd.d, var1, P[0][var2], 26, 13 + var2 * this.N[super.a.b][0].h, 0, -1, 0);
               } else {
                  vdtt_dd.c(vdtt_dd.d, var1, P[0][var2], 26, 12 + var2 * this.N[super.a.b][0].h, 0, -1, 0);
               }

               if (this.S != null && this.S[var2] != null) {
                  for(var3 = 0; var3 < this.S[var2].length; ++var3) {
                     if (this.S[var2][var3] != null) {
                        vdtt_y.a(var1, 53, 0, this.N[super.a.b][0].width - this.S[var2].length * 25 + var3 * 25, 1 + var2 * this.N[super.a.b][0].h, 24, (int)24);
                        vdtt_y.a(var1, this.S[var2][var3].an(), 0, this.N[super.a.b][0].width - this.S[var2].length * 25 + var3 * 25 + 12, var2 * this.N[super.a.b][0].h + 12, 95, (byte)3);
                        if (this.S[var2][var3].isLock) {
                           vdtt_y.a(var1, 44, 0, this.N[super.a.b][0].width - this.S[var2].length * 25 + var3 * 25 + 2, var2 * this.N[super.a.b][0].h + 2, 80);
                        }
                     }
                  }
               }
            }
         }

         this.a(var1);
         this.N[super.a.b][0].b(var1, this);
      } else {
         this.a(var1, this.N[super.a.b][2]);
         this.a(var1, 0, 0 * this.N[super.a.b][2].h, this.N[super.a.b][2].width, 26, 46, 22, 23, 1, 1);
         if (this.N[super.a.b][2].l == 0) {
            vdtt_dd.c(vdtt_dd.d, var1, P[0][this.R], 26, 13, 0, -1, 0);
            var1.e(30);
            vdtt_cz.a(var1, 398, 0, this.N[super.a.b][2].width - 21, 5, 20);
            var1.h();
         } else {
            vdtt_dd.c(vdtt_dd.d, var1, P[0][this.R], 26, 12, 0, -1, 0);
            vdtt_cz.a(var1, 398, 0, this.N[super.a.b][2].width - 22, 4, 20);
         }

         if (P[0][this.R].equals(Caption.wK)) {
            vdtt_cz.a(var1, 638, 0, 15, 13, 3);
            this.a(var1);
            vdtt_cz.a(var1, 41, 0, this.width / 2, this.height / 2 + 30, 3);
         } else {
            vdtt_cz.a(var1, 396, 0, 15, 13, 3);
            this.a(var1);
            this.a(var1, this.N[super.a.b][1]);
            var2 = 0;

            for(var3 = 0; var3 < this.N[super.a.b][1].i; ++var3) {
               String var4 = (String)this.O.get(var3);
               vdtt_dd.c(vdtt_dd.d, var1, var4, 2, 6 + var3 * this.N[super.a.b][1].h, 0, -1, 0);
               if (this.R == 0) {
                  if (var4.contains("-space:-space:-space:-space")) {
                     ++var2;
                     switch(var2) {
                     case 1:
                        vdtt_cz.a(var1, 1, 3 + var3 * this.N[super.a.b][1].h, 30, 7, -8492991, 22, 23, 1, 1, 90);
                        vdtt_y.a(var1, 32, 0, 2, 4 + var3 * this.N[super.a.b][1].h, 28, (int)5);
                        break;
                     case 2:
                        var1.f(-65536);
                        var1.c(2, 4 + var3 * this.N[super.a.b][1].h, 28, 5);
                        var1.f(-16777216);
                        var1.b(2, 4 + var3 * this.N[super.a.b][1].h, 28, 5);
                        break;
                     case 3:
                        var1.f(-9942667);
                        var1.c(2, 4 + var3 * this.N[super.a.b][1].h, 28, 5);
                        var1.f(-16777216);
                        var1.b(2, 4 + var3 * this.N[super.a.b][1].h, 28, 5);
                        break;
                     case 4:
                        var1.f(-16711681);
                        var1.c(2, 4 + var3 * this.N[super.a.b][1].h, 28, 5);
                        var1.f(-16777216);
                        var1.b(2, 4 + var3 * this.N[super.a.b][1].h, 28, 5);
                     }
                  }
               } else if (this.R == 2 && var4.contains("-space:-space")) {
                  ++var2;
                  switch(var2) {
                  case 1:
                     vdtt_cz.a(var1, 751, 0, 4, 1 + var3 * this.N[super.a.b][1].h, 0);
                     break;
                  case 2:
                     vdtt_cz.a(var1, 750, 0, 4, 1 + var3 * this.N[super.a.b][1].h, 0);
                     break;
                  case 3:
                     vdtt_cz.a(var1, 749, 0, 4, 1 + var3 * this.N[super.a.b][1].h, 0);
                  }
               }
            }

            this.a(var1);
            this.N[super.a.b][1].a(var1, this);
            if (this.S != null && this.S.length > 0 && this.S[this.R] != null) {
               vdtt_dd.a(var1, Caption.oo, 16, this.f() + this.height - 52, 0, -1);

               for(var3 = 0; var3 < this.S[this.R].length; ++var3) {
                  if (this.S[this.R][var3] != null) {
                     b(var1, 75 + var3 * 35, this.f() + this.height - 68, this.S[this.R][var3], this.ar != null && this.ar.equals(this.S[this.R][var3]));
                  }
               }
            }
         }
      }

   }

   private void h(Graphics var1) {
      int var2;
      if (!this.ai) {
         this.a(var1, this.Y[0]);

         for(var2 = 0; var2 < this.Y[0].i; ++var2) {
            if (this.Y[0].b(var2)) {
               this.a(var1, 0, var2 * this.Y[0].h, this.Y[0].width, 26, 46, 22, 23, 1, 1);
               if (this.ap[var2] == 61) {
                  vdtt_cz.a(var1, 897, 0, 15, var2 * this.Y[0].h + 13, 3);
               } else {
                  vdtt_cz.a(var1, 395, 0, 15, var2 * this.Y[0].h + 13, 3);
               }

               if (this.Y[0].l == var2) {
                  vdtt_dd.a(var1, ((vdtt_ir)this.an.get(var2)).b, 26, 13 + var2 * this.Y[0].h, 0, -1);
               } else {
                  vdtt_dd.a(var1, ((vdtt_ir)this.an.get(var2)).b, 26, 12 + var2 * this.Y[0].h, 0, -1);
               }
            }
         }

         this.a(var1);
         this.Y[0].b(var1, this);
      } else {
         this.a(var1, this.Y[1]);
         this.a(var1, 0, 0 * this.Y[1].h, this.Y[1].width, 26, 46, 22, 23, 1, 1);
         if (this.Y[1].l == 0) {
            if (this.ap[this.ao] == 61) {
               vdtt_dd.a(var1, Caption.xL, 26, 13, 0, -1);
            } else {
               vdtt_dd.a(var1, ((vdtt_ir)this.an.get(this.ao)).b, 26, 13, 0, -1);
            }

            var1.e(30);
            vdtt_cz.a(var1, 398, 0, this.Y[1].width - 21, 5, 20);
            var1.h();
         } else {
            if (this.ap[this.ao] == 61) {
               vdtt_dd.a(var1, Caption.xL, 26, 12, 0, -1);
            } else {
               vdtt_dd.c(vdtt_dd.d, var1, ((vdtt_ir)this.an.get(this.ao)).b, 26, 12, 0, -1, 0);
            }

            vdtt_cz.a(var1, 398, 0, this.Y[1].width - 22, 4, 20);
         }

         if (this.ap[this.ao] == 61) {
            vdtt_cz.a(var1, 897, 0, 15, 13, 3);
         } else {
            vdtt_cz.a(var1, 396, 0, 15, 13, 3);
         }

         this.a(var1);
         boolean var3 = true;
         var1.k = var3;

         for(var2 = 0; var2 < this.al.a.length; ++var2) {
            byte var4 = 0;
            if (this.ao == 0) {
               if (GameSrc.gI().capCayTao > 15) {
                  var4 = 40;
               } else if (GameSrc.gI().capCayTao > 10) {
                  var4 = 20;
               }
            }

            vdtt_cz.b(var1, this.al.a[var2].a, this.al.a[var2].a(false), this.width / 2 + this.al.a[var2].c + 90, this.f() + 122 + this.al.a[var2].d + var4, 33);
         }

         var3 = false;
         var1.k = var3;
         this.a(var1, this.Y[2]);

         for(var2 = 0; var2 < this.Y[2].i; ++var2) {
            if (var2 < 2) {
               vdtt_dd.a(var1, (String)this.ah.get(var2), 7, 7 + var2 * this.Y[2].h, 0, -1);
            } else {
               vdtt_dd.a(var1, "-  " + (String)this.ah.get(var2), 7, 7 + var2 * this.Y[2].h, 0, -1);
            }
         }

         this.a(var1);
         this.Y[2].a(var1);
      }

   }

   public final void a_() {
      this.ak.e();

      int var1;
      int var2;
      for(var1 = 0; var1 < this.N.length; ++var1) {
         for(var2 = 0; var2 < this.N[var1].length; ++var2) {
            if (this.N[var1][var2] != null) {
               this.N[var1][var2].a();
            }
         }
      }

      if (this.Y != null) {
         for(var1 = 0; var1 < this.Y.length; ++var1) {
            if (this.Y[var1] != null) {
               this.Y[var1].a();
            }
         }
      }

      if (this.aq != null) {
         for(var1 = 0; var1 < this.aq.length; ++var1) {
            if (this.aq[var1] != null) {
               for(var2 = 0; var2 < this.aq[var1].length; ++var2) {
                  if (this.aq[var1][var2] != null) {
                     this.aq[var1][var2].a();
                  }
               }
            }
         }
      }

      if (this.Z != null) {
         this.Z.a();
      }

      if (this.ai && this.ao < 9) {
         this.aj.b(false);
      } else {
         this.aj.b(true);
      }

      if (GameSrc.gI().idTask == 5 && GameSrc.gI().idStep == 0) {
         this.y();
      }

   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      Vector var4 = g(this.aa);
      String[] var5;
      switch(var1.b) {
      case 1001:
         if (var1.j.k >= 0) {
            this.ak.a(var1.j.k);
            this.aa = var1.j.k;
            this.B();
            return;
         }
         break;
      case 1010:
         if (this.Z.k >= 0 && this.Z.k < var4.size()) {
            if (Char.gI().sys <= 0) {
               this.k = a(Caption.nA, this, var2, var3, 180);
               return;
            }

            switch(((vdtt_ds)var4.get(this.Z.k)).e) {
            case 54:
               this.k = a(Caption.nx, this, var2, var3, 150);
               break;
            case 57:
               boolean var11 = true;
               (var4 = new Vector()).addElement(new vdtt_ir(2001, Caption.Az[0]));
               var4.addElement(new vdtt_ir(2002, Caption.Az[1]));
               var4.addElement(new vdtt_ir(2003, Caption.Az[2]));
               var4.addElement(new vdtt_ir(2004, Caption.Az[3]));
               var4.addElement(new vdtt_ir(2005, Caption.Az[4]));
               if (var4.size() > 0) {
                  String[] var12 = new String[var4.size()];
                  short[] var8 = new short[var4.size()];

                  for(int var9 = 0; var9 < var4.size(); ++var9) {
                     vdtt_ir var10 = (vdtt_ir)var4.elementAt(var9);
                     var12[var9] = var10.b;
                     var8[var9] = (short)var10.a;
                  }

                  this.k = a(this, var2, var3, new vdtt_hm(3000, var8, var12));
               }
               break;
            default:
               this.k = a(Caption.uz, this, var2, var3, 150);
               return;
            }
         }
         break;
      case 1011:
         if (this.ap[this.ao] == 61) {
            GameSrc.gI();
            if (GameSrc.f(GameSrc.gI().mapID) != 1) {
               DataCenter.gI().currentScreen.c(Caption.xM, -2560);
               return;
            }
         }

         GameSrc.gI();
         GameSrc.h(this.ap[this.ao]);
         if (GameSrc.gI().pointMoveMap.a == 98) {
            if (GameSrc.gI().mapID != 54) {
               if (GameSrc.gI().cd) {
                  DataCenter.gI().currentScreen.c(Caption.xy, -2560);
                  return;
               }

               GameSrc.gI().pointMoveMap.a = 40;
               GameSrc.gI();
               GameSrc.h(40);
            }

            if (GameSrc.gI().mapID != 86 && GameSrc.gI().mapID != 87 && GameSrc.gI().mapID != 54) {
               GameSrc.gI().bx = GameSrc.gI().pointMoveMap;
               GameSrc.gI();
               GameSrc.q(86);
            }
         } else if (GameSrc.gI().pointMoveMap.a == 32) {
            if (GameSrc.gI().mapID != 53) {
               if (GameSrc.gI().cd) {
                  DataCenter.gI().currentScreen.c(Caption.xz, -2560);
                  return;
               }

               GameSrc.gI().pointMoveMap.a = 40;
               GameSrc.gI();
               GameSrc.h(40);
            }

            if (GameSrc.gI().mapID != 86 && GameSrc.gI().mapID != 87 && GameSrc.gI().mapID != 53) {
               GameSrc.gI().bx = GameSrc.gI().pointMoveMap;
               GameSrc.gI();
               GameSrc.q(86);
            }
         } else if (GameSrc.gI().pointMoveMap.a == 59) {
            if (GameSrc.gI().mapID != 56 && GameSrc.gI().mapID != 58 && GameSrc.gI().mapID != 86) {
               GameSrc.gI().bx = GameSrc.gI().pointMoveMap;
               GameSrc.gI();
               GameSrc.q(86);
            }
         } else if (GameSrc.gI().mapID != GameSrc.gI().pointMoveMap.d) {
            GameSrc.gI().bx = GameSrc.gI().pointMoveMap;
            GameSrc.gI();
            GameSrc.q(GameSrc.gI().bx.d);
         }

         this.k();
         return;
      case 2001:
         vdtt_ds var6;
         if ((var6 = (vdtt_ds)var4.get(this.Z.k)).e >= 0) {
            GameSrc.gI().pointMoveMap = new vdtt_dv(var6.f, -1, -1, var6.e, 0, 0);
         } else if (var6.f >= 0) {
            if (var6.f == 4) {
               if (!U.a()) {
                  GameSrc.gI().c(Caption.nL, -1);
                  return;
               }

               GameSrc.gI();
               GameSrc.h(var6.f);
            } else {
               GameSrc.gI();
               GameSrc.h(var6.f);
            }
         }

         this.k();
      case 2006:
      default:
         break;
      case 3000:
         this.ar = (Item)var1.k;
         this.k = c(this, var1, this.ar);
         vdtt_aa.gI().n();
         return;
      case 9980:
         if (var1.j.k >= 0) {
            this.R = var1.j.k;
            var5 = Utlis.a(P[1][this.R], "\\n");
            this.O.clear();

            for(var2 = 0; var2 < var5.length; ++var2) {
               this.O.addAll(vdtt_dd.a(vdtt_dd.d, var5[var2], super.width - 8 - 35));
            }

            if (this.S != null && this.S[this.R] != null) {
               this.N[2][1] = new vdtt_hp((byte)1, 13, this.f() + 45, super.width - 8 - 18, 120, 15, this.O.size());
            } else {
               this.N[2][1] = new vdtt_hp((byte)1, 13, this.f() + 45, super.width - 8 - 18, 150, 15, this.O.size());
            }

            this.Q = true;
            return;
         }
         break;
      case 9981:
         this.Q = false;
         return;
      case 9982:
         if (var1.j.k >= 0) {
            this.ao = var1.j.k;
            var5 = this.am[this.ao];
            this.ah.clear();
            if (var5 != null) {
               for(var2 = 0; var2 < var5.length; ++var2) {
                  this.ah.addAll(vdtt_dd.a(vdtt_dd.d, var5[var2], super.width - 8 - 160));
               }

               this.Y[2] = new vdtt_hp((byte)1, 20, this.f() + 45, super.width - 8 - 150, 135, 15, this.ah.size());
            } else {
               this.Y[2] = null;
            }

            Npc var7 = new Npc((byte)0, this.ap[this.ao], 0, 0);
            this.al = var7.getNpcTemplate().b[0];
            this.ai = true;
            return;
         }
         break;
      case 9983:
         this.ai = false;
         return;
      }

   }

   private void B() {
      this.Z = new vdtt_hp((byte)1, 9, this.f() + 77, super.width - 8 - 10, 90, 15, g(this.aa).size());
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      switch(var1) {
      case 2001:
         b(57, 1286, 239);
         this.k();
         return;
      case 2002:
         b(65, 525, 766);
         this.k();
         return;
      case 2003:
         b(87, 199, 309);
         this.k();
         return;
      case 2004:
         b(79, 519, 268);
         this.k();
         return;
      case 2005:
         b(76, 192, 522);
         this.k();
      default:
      }
   }

   public final void b(int var1, Object var2) {
   }

   private static void b(int var0, int var1, int var2) {
      if (!V.a() && !W.a() && !X.a()) {
         GameSrc.gI().c(Caption.nN, -1);
      } else if (GameSrc.gI().mapID == var0) {
         GameSrc.gI().c(Caption.nO, -2560);
      } else {
         GameSrc.gI().pointMoveMap = new vdtt_dv(var0, var1, var2);
      }

   }

   static {
      for(int var0 = 0; var0 < 7; ++var0) {
         if (var0 < 6) {
            if (var0 % 2 == 0) {
               T.add(new vdtt_ds(var0, Caption.AB[3], 75600, 76200, -1, 32));
               T.add(new vdtt_ds(var0, Caption.AB[6], 68400, 69000, -1, 32));
            } else {
               T.add(new vdtt_ds(var0, Caption.AB[4], 75600, 76200, -1, 32));
               T.add(new vdtt_ds(var0, Caption.AB[5], 70500, 71999, -1, 32));
            }
         }

         if (var0 == 6) {
            T.add(new vdtt_ds(var0, Caption.AB[7], 75600, 76200, -1, 32));
         }
      }

      Collections.sort(T, vdtt_ds.h);
   }
}

package gro;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import java.util.Vector;

public final class vdtt_v extends vdtt_ak {
   private boolean M;
   private boolean N;
   private boolean O;
   private boolean P;
   private vdtt_by Q;
   private int R;
   private int S;
   private vdtt_ay[] T;
   private int U = -1;
   private int V = -1;
   private int W = 0;
   private int X = 0;
   private int Y = 0;
   private int Z;
   private int aa;
   private int ab;
   private vdtt_dd ac;
   public String a = "";
   private char[][] ad = new char[2][];
   private char[][] ae = new char[6][];
   private vdtt_w af;
   private short ag;
   private short ah;
   private short ai;
   private short aj;
   public vdtt_s b;
   private static mImage ak;
   private int al;
   public boolean c;
   private long am;
   public boolean d;

   public vdtt_v(MainScreen var1, vdtt_by var2, boolean var3, boolean var4) {
      try {
         this.c = false;
         this.J = false;
         this.e = 5;
         this.H = var1;
         this.N = DataCenter.gI().n > 400;
         this.Q = var2;
         this.w();
         this.O = var2.m == 2;
         this.W = this.O ? 1 : 0;
         this.ac = vdtt_dd.f;
         if (var2.b() + var2.height > this.cy) {
            this.R = this.cy - var2.b() - var2.height - 1;
         }

         if (!var4) {
            this.R = 0;
         }

         this.f(this.R);
         this.ag = var2.cx;
         this.ah = var2.cy;
         this.ai = (short)var2.a();
         this.aj = (short)var2.b();
         this.af = var2.a;
         this.af.b((vdtt_k)var2);
         this.Q = var2;
         var2.a = this;
         var2.cx = (short)(this.aa + this.ai - this.aa);
         if (this.ah + var2.height > this.cy) {
            var2.cy = (short)(-var2.height);
         } else {
            var2.cy = (short)(-(DataCenter.gI().o - this.height - this.aj));
         }

         this.a(var2);
         if (this.af instanceof vdtt_s) {
            vdtt_s var5 = (vdtt_s)this.af;
            this.b = var5;
            this.b.a(var2);
         }

         var2.a.l = null;
      } catch (Exception var6) {
         Utlis.a(var6);
      }

   }

   private void w() {
      if (this.N) {
         this.setSize(DataCenter.gI().n, 145);
         this.setXY(0, DataCenter.gI().o - this.height);
         this.Y = 25;
      } else {
         this.setSize(DataCenter.gI().n, 120);
         this.setXY(0, DataCenter.gI().o - this.height);
         this.Y = 20;
      }

      this.X = (DataCenter.gI().n - 32) / 11;
      this.Z = 2;
      this.aa = DataCenter.gI().n / 2 - 6 * (this.X + this.Z) + (this.X + this.Z) / 2;
      this.ab = 5;
      this.T = new vdtt_ay[46];

      int var1;
      for(var1 = 0; var1 < 10; ++var1) {
         this.T[var1] = this.a(this.aa + (this.X + this.Z) / 2 + var1 * (this.X + this.Z), this.ab, "", this, 1000 + var1, -1);
         this.T[var1].setSize(this.X, this.Y);
      }

      for(var1 = 0; var1 < 11; ++var1) {
         this.T[10 + var1] = this.a(this.aa + var1 * (this.X + this.Z), this.ab + this.Y + this.Z, "", this, 1010 + var1, -1);
         this.T[10 + var1].setSize(this.X, this.Y);
      }

      for(var1 = 0; var1 < 10; ++var1) {
         this.T[21 + var1] = this.a(this.aa + (this.X + this.Z) / 2 + var1 * (this.X + this.Z), this.ab + 2 * (this.Y + this.Z), "", this, 1021 + var1, -1);
         this.T[21 + var1].setSize(this.X, this.Y);
      }

      this.T[31] = this.a(this.aa, this.ab + 3 * (this.Y + this.Z), "", this, 1031, -1);
      this.T[31].setSize(this.T[22].cx + this.T[22].width / 2 - this.aa - this.Z, this.Y);

      for(var1 = 0; var1 < 7; ++var1) {
         this.T[32 + var1] = this.a(this.aa + this.T[31].width + this.Z + var1 * (this.X + this.Z), this.ab + 3 * (this.Y + this.Z), "", this, 1032 + var1, -1);
         this.T[32 + var1].setSize(this.X, this.Y);
      }

      this.T[39] = this.a(this.T[38].cx + this.T[38].width + this.Z, this.ab + 3 * (this.Y + this.Z), "", this, 1039, -1);
      this.T[39].setSize(this.T[22].cx + this.T[22].width / 2 - this.aa, this.Y);
      this.T[40] = this.a(this.aa, this.ab + 4 * (this.Y + this.Z), "", this, 1040, -1);
      this.T[40].setSize(this.T[22].cx + this.T[22].width / 2 - this.aa - this.Z, this.Y);
      this.T[41] = this.a(this.T[40].cx + this.T[40].width + this.Z, this.ab + 4 * (this.Y + this.Z), "", this, 1041, -1);
      this.T[41].setSize(this.X, this.Y);
      this.T[42] = this.a(this.T[41].cx + this.T[41].width + this.Z, this.ab + 4 * (this.Y + this.Z), "", this, 1042, -1);
      this.T[42].setSize(this.T[36].cx + this.T[36].width + this.X + this.Z - this.T[34].cx, this.Y);
      this.T[43] = this.a(this.T[42].cx + this.T[42].width + this.Z, this.ab + 4 * (this.Y + this.Z), "", this, 1043, -1);
      this.T[43].setSize(this.X, this.Y);
      this.T[44] = this.a(this.T[43].cx + this.T[43].width + this.Z, this.ab + 4 * (this.Y + this.Z), "", this, 1044, -1);
      this.T[44].setSize(this.X, this.Y);
      this.T[45] = this.a(this.T[44].cx + this.T[44].width + this.Z, this.ab + 4 * (this.Y + this.Z), "", this, 1045, -1);
      this.T[45].setSize(this.T[22].cx + this.T[22].width / 2 - this.aa, this.Y);
      this.ad[0] = new char[]{'ă', 'â', 'ê', 'ô', 'ˋ', 'ˊ', '~', 'ˀ', '.', 'đ', 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'ư', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'ơ', ' ', 'z', 'x', 'c', 'v', 'b', 'n', 'm', ' ', ' ', '@', ' ', ',', '.', ' '};
      this.ad[1] = new char[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '@', '#', '$', '%', '&', '-', '+', '(', ')', '_', '*', '"', '\'', ':', ';', '!', '?', '\\', '/', '{', '}', ' ', '~', '[', ']', '=', '<', '>', '|', ' ', ' ', '_', ' ', ',', '.', ' '};
      this.ae[0] = new char[]{'a', 'ă', 'â', 'o', 'ơ', 'ô', 'ê', 'e', 'ư', 'u', 'i', 'y', 'A', 'Ă', 'Â', 'O', 'Ơ', 'Ô', 'Ê', 'E', 'Ư', 'U', 'I', 'Y'};
      this.ae[1] = new char[]{'á', 'ắ', 'ấ', 'ó', 'ớ', 'ố', 'ế', 'é', 'ứ', 'ú', 'í', 'ý', 'Á', 'Ắ', 'Ấ', 'Ó', 'Ớ', 'Ố', 'Ế', 'É', 'Ứ', 'Ú', 'Í', 'Ý'};
      this.ae[2] = new char[]{'ả', 'ẳ', 'ẩ', 'ỏ', 'ở', 'ổ', 'ể', 'ẻ', 'ử', 'ủ', 'ỉ', 'ỷ', 'Ả', 'Ẳ', 'Ẩ', 'Ỏ', 'Ở', 'Ổ', 'Ể', 'Ẻ', 'Ử', 'Ủ', 'Ỉ', 'Ỷ'};
      this.ae[3] = new char[]{'ã', 'ẵ', 'ẫ', 'õ', 'ỡ', 'ỗ', 'ễ', 'ẽ', 'ữ', 'ũ', 'ĩ', 'ỹ', 'Ã', 'Ẵ', 'Ẫ', 'Õ', 'Ỡ', 'Ỗ', 'Ễ', 'Ẽ', 'Ữ', 'Ũ', 'Ĩ', 'Ỹ'};
      this.ae[4] = new char[]{'à', 'ằ', 'ầ', 'ò', 'ờ', 'ồ', 'ề', 'è', 'ừ', 'ù', 'ì', 'ỳ', 'À', 'Ằ', 'Ầ', 'Ò', 'Ờ', 'Ồ', 'Ề', 'È', 'Ừ', 'Ù', 'Ì', 'Ỳ'};
      this.ae[5] = new char[]{'ạ', 'ặ', 'ậ', 'ọ', 'ợ', 'ộ', 'ệ', 'ẹ', 'ự', 'ụ', 'ị', 'ỵ', 'Ạ', 'Ặ', 'Ậ', 'Ọ', 'Ợ', 'Ộ', 'Ệ', 'Ẹ', 'Ự', 'Ụ', 'Ị', 'Ỵ'};
   }

   public final void d() {
      if (this.U == -2) {
         GameSrc.gI().a(this.Q);
      }

      this.f(-this.R);
      this.Q.a = this.af;
      this.Q.cx = this.ag;
      this.Q.cy = this.ah;
      if (this.Q.m == 2) {
         this.Q.a(String.valueOf(this.Q.h()));
      }

      this.b(this.Q);
      this.af.a(this.Q);
      if (this.b != null) {
         this.b.b(this.Q);
      } else {
         if (this.Q.R != Integer.MIN_VALUE && this.Q.h() < this.Q.R) {
            this.Q.a("" + this.Q.R);
         }

         if (this.Q.S != Integer.MAX_VALUE && this.Q.h() > this.Q.S) {
            this.Q.a("" + this.Q.S);
         }
      }

      if (ak != null) {
         ak.a();
         ak = null;
      }

      this.Q.b = false;
      vdtt_by var1 = this.Q;
      if (GameSrc.gI().aQ != null && GameSrc.gI().aQ.equals(var1)) {
         var1.setXY(-200, -200);
         var1.b(true);
      }

      if (SettingsTab.K().U != null && SettingsTab.K().U.equals(var1)) {
         var1.setXY(-200, -200);
         var1.b(true);
      }

      vdtt_y.a = null;
      if (this.c) {
         Gdx.input.setOnscreenKeyboardVisible(false);
      }

   }

   private void f(int var1) {
      for(int var2 = 0; var2 < this.H.b.size(); ++var2) {
         vdtt_w var3;
         if (!((var3 = (vdtt_w)this.H.b.elementAt(var2)) instanceof vdtt_v) && !(var3 instanceof GameSrc)) {
            var3.setXY(var3.cx, var3.cy + var1);
         }
      }

   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      this.V = var1.b;
      if (this.V != 5000 && this.V != 1045) {
         if (this.c) {
            this.k();
         } else {
            this.V -= 1000;
            if (this.V == 39) {
               if (!this.d) {
                  this.U = 8;
               }

               this.d = false;
            } else {
               this.U = this.ad[this.W][this.V];
               if (!this.O || this.U >= 48 && this.U <= 57) {
                  if (this.W == 0 && this.M) {
                     this.U = String.valueOf(this.ad[0][this.V]).toUpperCase().charAt(0);
                  }

                  if (this.V == 31) {
                     if (this.W == 0) {
                        this.M = !this.M;
                        this.al = 0;
                     }

                     this.U = -1;
                  } else if (this.V == 40 && !this.O) {
                     this.W = this.W == 0 ? 1 : 0;
                     this.al = 0;
                     this.w();
                     this.U = -1;
                  } else if (this.V == 41) {
                     if (this.Q.T && this.W == 0) {
                        if (Utlis.c() > GameSrc.gI().timeChatColor) {
                           this.H.c(Caption.sq, -1);
                        } else {
                           this.k = new vdtt_bj(var1.a.cx - 44, var1.a.cy - 88, 8001, this);
                           this.a(this.k);
                        }
                     } else {
                        String var4 = this.Q.i();
                        if ((var4 = var4 + ".com").length() <= this.Q.l) {
                           this.Q.a(var4);
                        }
                     }

                     this.U = -1;
                  }
               } else {
                  this.U = -1;
               }
            }
         }
      } else {
         this.U = -1;
         if (this.V == 1045 && this.Q.T) {
            this.U = -2;
         }

         this.k();
      }

   }

   public final void a(int var1, Object var2) {
      long var3 = Utlis.a();
      if (this.am == 0L) {
         this.am = var3;
      } else if (var3 - this.am > 100L) {
         switch(var1) {
         case 1039:
            this.d = true;
            this.am = 0L;
            this.Q.o.a((int)8);
            return;
         default:
            this.am = 0L;
         }
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      if (!this.c && var1 == 8001) {
         this.Q.d(var2.toString());
         this.c(this.Q);
      }

   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      try {
         int var2;
         for(var2 = 0; var2 < this.f.size(); ++var2) {
            vdtt_k var3;
            if (!((var3 = (vdtt_k)this.f.elementAt(var2)) instanceof vdtt_bj)) {
               var3.d(var1);
            }
         }

         if (!this.c) {
            var1.f(-10205144);
            var1.c(0, 0, this.width, this.height);

            for(int var7 = 0; var7 < this.T.length; ++var7) {
               var2 = 0;
               var1.f(1066371711);
               var1.c(this.T[var7].cx, this.T[var7].cy, this.T[var7].width, this.T[var7].height);
               var1.f(10695177);
               var1.b(this.T[var7].cx, this.T[var7].cy, this.T[var7].width, this.T[var7].height);
               String var4 = String.valueOf(this.ad[this.W][var7]);
               if (var7 == 31) {
                  if (this.O) {
                     var1.c(-11184811);
                  }

                  vdtt_cz.a(var1, 98, 0, this.T[var7].cx + this.T[var7].width / 2, this.T[var7].cy + this.T[var7].height / 2 + (this.T[var7].e(0) ? 1 : 0), 3);
                  if (this.O) {
                     var1.f();
                  }
               } else if (var7 == 39) {
                  vdtt_cz.a(var1, 99, 0, this.T[var7].cx + this.T[var7].width / 2, this.T[var7].cy + this.T[var7].height / 2 + (this.T[var7].e(0) ? 1 : 0), 3);
               } else {
                  if (var7 == 40) {
                     var4 = this.W == 0 ? "?123" : "ABC";
                  } else {
                     label134: {
                        String var5;
                        if (var7 == 41) {
                           if (this.Q.T && this.W == 0) {
                              vdtt_cz.a(var1, 38, 0, this.T[var7].cx + this.T[var7].width / 2 + 1, this.T[var7].cy + this.T[var7].height / 2, 3);
                              continue;
                           }

                           var5 = ".com";
                        } else {
                           if (var7 != 45) {
                              break label134;
                           }

                           var5 = this.Q.T ? Caption.gS : Caption.gT;
                        }

                        var4 = var5;
                     }
                  }

                  if (this.M) {
                     var4 = var4.toUpperCase();
                  }

                  if (this.T[var7].e(0)) {
                     ++var2;
                  }

                  int var8 = -1;
                  if (this.O && var7 >= 10 && var7 != 45) {
                     var8 = -11184811;
                  }

                  if (var4.equals("ˀ")) {
                     vdtt_dd.a((BitmapFont)Graphics.b(), (Graphics)var1, "?", this.T[var7].cx + this.T[var7].width / 2, this.T[var7].cy + this.T[var7].height / 2 + 1 + var2 - 1, 2, var8, 0);
                     var1.f(-7370113);
                     var1.c(this.T[var7].cx - 3 + this.T[var7].width / 2, this.T[var7].cy + this.T[var7].height / 2 + 1 + var2 - 4 + 5, 6, 3);
                  } else if (var4.equals("ˊ")) {
                     vdtt_dd.a((BitmapFont)Graphics.b(), (Graphics)var1, "/", this.T[var7].cx + this.T[var7].width / 2, this.T[var7].cy + this.T[var7].height / 2 + 1 + var2 - 1, 2, var8, 0);
                     var1.f(-7370113);
                     var1.c(this.T[var7].cx - 3 + this.T[var7].width / 2, this.T[var7].cy + this.T[var7].height / 2 + 1 + var2 - 4 + 3, 6, 5);
                  } else if (var4.equals("ˋ")) {
                     vdtt_dd.a((BitmapFont)Graphics.b(), (Graphics)var1, "\\", this.T[var7].cx + this.T[var7].width / 2, this.T[var7].cy + this.T[var7].height / 2 + 1 + var2 - 1, 2, var8, 0);
                     var1.f(-7370113);
                     var1.c(this.T[var7].cx - 3 + this.T[var7].width / 2, this.T[var7].cy + this.T[var7].height / 2 + 1 + var2 - 4 + 3, 6, 5);
                  } else {
                     vdtt_dd.a((vdtt_dd)this.ac, (Graphics)var1, var4, this.T[var7].cx + this.T[var7].width / 2, this.T[var7].cy + this.T[var7].height / 2 + 1 + var2, 2, var8, 0);
                  }

                  if (this.T[var7].e(0) && this.T[var7].e(0) && (!this.O && var7 != 40 && var7 != 42 && var7 != 45 || this.O && var7 < 10)) {
                     var1.f(10695177);
                     var1.c(this.T[var7].cx, this.T[var7].cy - this.T[var7].height - 2, this.T[var7].width, this.T[var7].height);
                     var1.f(10695177);
                     var1.b(this.T[var7].cx, this.T[var7].cy - this.T[var7].height - 2, this.T[var7].width, this.T[var7].height);
                     if (var4.equals("ˀ")) {
                        vdtt_dd.a((BitmapFont)Graphics.b(), (Graphics)var1, "?", this.T[var7].cx + this.T[var7].width / 2, this.T[var7].cy + this.T[var7].height / 2 - this.T[var7].height - 2 - 2, 2, var8, 0);
                        var1.c(this.T[var7].cx - 3 + this.T[var7].width / 2, this.T[var7].cy + this.T[var7].height / 2 - this.T[var7].height - 2 - 4 + 5, 6, 3);
                     } else if (var4.equals("ˊ")) {
                        vdtt_dd.a((BitmapFont)Graphics.b(), (Graphics)var1, "/", this.T[var7].cx + this.T[var7].width / 2, this.T[var7].cy + this.T[var7].height / 2 - this.T[var7].height - 2 - 2, 2, var8, 0);
                        var1.c(this.T[var7].cx - 3 + this.T[var7].width / 2, this.T[var7].cy + this.T[var7].height / 2 - this.T[var7].height - 2 - 4 + 3, 6, 5);
                     } else if (var4.equals("ˋ")) {
                        vdtt_dd.a((BitmapFont)Graphics.b(), (Graphics)var1, "\\", this.T[var7].cx + this.T[var7].width / 2, this.T[var7].cy + this.T[var7].height / 2 - this.T[var7].height - 2 - 2, 2, var8, 0);
                        var1.c(this.T[var7].cx - 3 + this.T[var7].width / 2, this.T[var7].cy + this.T[var7].height / 2 - this.T[var7].height - 2 - 4 + 3, 6, 5);
                     } else {
                        vdtt_dd.a((vdtt_dd)vdtt_dd.f, (Graphics)var1, var4, this.T[var7].cx + this.T[var7].width / 2, this.T[var7].cy + this.T[var7].height / 2 - this.T[var7].height - 2, 2, -1, 0);
                     }
                  }
               }
            }

            if (this.k != null) {
               this.a(var1, this.k.a(), this.k.b());
               this.k.b(var1);
            }
         }
      } catch (Exception var6) {
         Utlis.a(var6);
      }

   }

   public final void a_() {
      String var1;
      if ((var1 = this.Q.i()).length() >= this.Q.l) {
         if (!this.Q.V || this.U == -1) {
            return;
         }

         this.Q.a("");
         var1 = "";
      }

      if (this.U >= 0) {
         if (this.U >= 32) {
            vdtt_by var2 = this.Q;
            String var3 = var1;
            vdtt_v var4 = this;
            if (this.U >= 0) {
               this.a = "";
               this.S = 0;
               int var5;
               if (var1.length() > 0) {
                  int var6;
                  for(var5 = (var6 = var2.d()) + var2.I - 1; var5 >= 0; --var5) {
                     if (var3.charAt(var5) == ' ') {
                        this.S = var5 + 1 - var6;
                        break;
                     }
                  }

                  this.a = var3.substring(var6 + this.S, var6 + var2.I);
               }

               if (this.W == 0 && this.a.length() > 0) {
                  boolean var14 = false;
                  var5 = 0;
                  int var7 = -1;
                  int var8 = 0;
                  boolean var9 = false;
                  int var10 = 0;

                  while(true) {
                     int var11;
                     int var12;
                     if (var10 >= var4.a.length()) {
                        if (var4.W != 0 || var4.U != var4.ad[0][4] && var4.U != var4.ad[0][5] && var4.U != var4.ad[0][6] && var4.U != var4.ad[0][7] && (var4.V == 44 || var4.U != var4.ad[0][8])) {
                           if (var5 >= 2 && var4.U != 32 && var4.U != 46 && var4.U != 44 && var8 > 0) {
                              label268:
                              for(var10 = 0; var10 < var4.a.length(); ++var10) {
                                 for(var11 = 0; var11 < var4.ae.length; ++var11) {
                                    for(var12 = 0; var12 < var4.ae[var11].length; ++var12) {
                                       if (var4.a.charAt(var10) == var4.ae[var11][var12]) {
                                          if (var10 == var7) {
                                             var4.a = var4.a.replace(var4.a.charAt(var10), var4.ae[var8][var12]);
                                             break label268;
                                          }

                                          var4.a = var4.a.replace(var4.a.charAt(var10), var4.ae[0][var12]);
                                          var14 = true;
                                       }
                                    }
                                 }
                              }
                           }

                           if (var14) {
                              var2.a(var4.a + (char)var4.U, var4.S, var2.I + 1);
                           } else {
                              if (var4.U == 32 && !var4.P && var3.endsWith(".")) {
                                 var4.P = true;
                                 var4.M = true;
                              } else if (var4.P && var4.U != 32) {
                                 var4.P = var4.M = false;
                              }

                              var4.a = var4.a + (char)var4.U;
                              var2.a("" + (char)var4.U, var2.I, var2.I + 1);
                           }
                        } else {
                           if (var5 == 1 || var5 == 2 && var7 == var4.a.length() - 1) {
                              label222:
                              for(var10 = 0; var10 < var4.a.length(); ++var10) {
                                 for(var11 = 0; var11 < var4.ae.length; ++var11) {
                                    for(var12 = 0; var12 < var4.ae[var11].length; ++var12) {
                                       if (var4.a.charAt(var10) == var4.ae[var11][var12]) {
                                          if (var4.U == var4.ad[0][4]) {
                                             var4.a = var4.a.replace(var4.a.charAt(var10), var4.ae[4][var12]);
                                          } else if (var4.U == var4.ad[0][5]) {
                                             var4.a = var4.a.replace(var4.a.charAt(var10), var4.ae[1][var12]);
                                          } else if (var4.U == var4.ad[0][6]) {
                                             var4.a = var4.a.replace(var4.a.charAt(var10), var4.ae[3][var12]);
                                          } else if (var4.U == var4.ad[0][7]) {
                                             var4.a = var4.a.replace(var4.a.charAt(var10), var4.ae[2][var12]);
                                          } else if (var4.U == var4.ad[0][8]) {
                                             var4.a = var4.a.replace(var4.a.charAt(var10), var4.ae[5][var12]);
                                          }

                                          var14 = true;
                                          break label222;
                                       }
                                    }
                                 }
                              }
                           } else {
                              int var13 = 0;

                              label207:
                              for(var10 = 0; var10 < var4.a.length(); ++var10) {
                                 for(var11 = 0; var11 < var4.ae.length; ++var11) {
                                    for(var12 = 0; var12 < var4.ae[var11].length; ++var12) {
                                       if (var4.a.charAt(var10) == var4.ae[var11][var12]) {
                                          if (var5 == 2 && var13 > var5 - 2 && var7 == var10 || var5 == 3 && var13 > 0 && !var9 || var5 == 3 && var13 > 1 && var9) {
                                             if (var4.U == var4.ad[0][4]) {
                                                var4.a = var4.a.replace(var4.a.charAt(var10), var4.ae[4][var12]);
                                             } else if (var4.U == var4.ad[0][5]) {
                                                var4.a = var4.a.replace(var4.a.charAt(var10), var4.ae[1][var12]);
                                             } else if (var4.U == var4.ad[0][6]) {
                                                var4.a = var4.a.replace(var4.a.charAt(var10), var4.ae[3][var12]);
                                             } else if (var4.U == var4.ad[0][7]) {
                                                var4.a = var4.a.replace(var4.a.charAt(var10), var4.ae[2][var12]);
                                             } else if (var4.U == var4.ad[0][8]) {
                                                var4.a = var4.a.replace(var4.a.charAt(var10), var4.ae[5][var12]);
                                             }

                                             var14 = true;
                                             break label207;
                                          }

                                          ++var13;
                                       }
                                    }
                                 }
                              }
                           }

                           if (!var14) {
                              break;
                           }

                           var2.a(var4.a, var4.S, var2.I);
                        }

                        var4.U = -1;
                        break;
                     }

                     for(var11 = 0; var11 < var4.ae.length; ++var11) {
                        for(var12 = 0; var12 < var4.ae[var11].length; ++var12) {
                           if (var4.a.charAt(var10) == var4.ae[var11][var12]) {
                              ++var5;
                              if (var4.ae[var11][var12] == 'y' || var4.ae[var11][var12] == 'Y') {
                                 var9 = true;
                              }

                              if (var11 > 0) {
                                 var8 = var11;
                              }

                              var7 = var10;
                           }
                        }
                     }

                     ++var10;
                  }
               } else {
                  if (this.W == 0 && (this.V < 4 || this.V > 8) || this.W == 1) {
                     if (this.U == 32 && !this.P && var3.endsWith(".")) {
                        this.P = true;
                        this.M = true;
                     } else if (this.P && this.U != 32) {
                        this.P = this.M = false;
                     }

                     var2.a("" + (char)this.U, var2.I, var2.I + 1);
                  }

                  this.U = -1;
               }
            }
         } else {
            this.Q.o.a(this.U);
         }

         this.U = -1;
      }

      this.Q.b = true;
      if (this.c) {
         Gdx.input.setOnscreenKeyboardVisible(true);
      }

   }

   public final Vector g() {
      Vector var1 = new Vector();
      if (this.c) {
         var1.add(new vdtt_hi(5000, 0, -DataCenter.gI().o, DataCenter.gI().n, DataCenter.gI().o * 2, (vdtt_hp)null, this));
      } else {
         var1.add(new vdtt_hi(5000, 0, -this.cy, DataCenter.gI().n, DataCenter.gI().o - DataCenter.gI().o, (vdtt_hp)null, this));
      }

      return var1;
   }
}

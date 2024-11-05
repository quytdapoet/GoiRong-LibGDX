package gro;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;

public final class vdtt_bw extends vdtt_by {
   private int W;
   private int X;
   private String[] Y;

   public vdtt_bw(int var1, int var2, int var3, String var4, vdtt_w var5, int var6, int var7) {
      super(var1, var2, var3, var4, var5, -11, 0);
      this.L = var4;
      this.a = var5;
      this.O = -11;
      this.W = var7;
      this.X = var7 == 1 ? 18 : 14;
      this.setXY(var1, var2);
      this.setSize(var3, var7 * this.X + 4);
      this.N = new vdtt_hp((byte)1, 0, 2, this.width, this.X * var7, this.X, var7);
      this.Y = vdtt_dd.c(vdtt_dd.d, var4, this.width - 10);
      this.a("");
   }

   public final int d() {
      int var1 = 0;

      for(int var2 = 0; var2 < this.J; ++var2) {
         var1 += this.Y[var2].length() + 1;
      }

      return var1;
   }

   public final void a(String var1) {
      if (var1.equals("")) {
         this.I = 0;
         this.M = "";
         this.Y = vdtt_dd.c(vdtt_dd.d, this.L, this.width - 10);
         this.N.j = 0;
         this.N.e();
      } else {
         this.M = var1;
         if (!var1.equals("")) {
            this.Y = vdtt_dd.c(vdtt_dd.d, var1, this.width - 10);
            this.N.j = this.J;
            this.f();
            this.N.e();
         } else {
            this.Y = vdtt_dd.c(vdtt_dd.d, this.L, this.width - 10);
            this.N.j = 0;
            this.N.e();
         }
      }

   }

   public final void a(String var1, int var2, int var3) {
      if (var1.equals("")) {
         this.I = 0;
         this.M = "";
         this.Y = vdtt_dd.c(vdtt_dd.d, this.L, this.width - 10);
         this.N.j = 0;
         this.N.e();
      } else {
         var1 = this.M.substring(0, this.d() + var2) + var1 + this.M.substring(this.d() + this.I, this.M.length());
         this.M = var1;
         if (!this.M.equals("")) {
            this.Y = vdtt_dd.c(vdtt_dd.d, this.M, this.width - 10);
            this.I = var3;
            if (this.I > this.Y[this.J].length()) {
               this.I = this.I - this.Y[this.J].length() - 1;
               ++this.J;
            }

            this.N.j = this.J;
            this.f();
            this.N.e();
         } else {
            this.Y = vdtt_dd.c(vdtt_dd.d, this.L, this.width - 10);
            this.N.j = 0;
            this.N.e();
         }
      }

   }

   public final void c() {
      byte var1 = 0;
      boolean var2 = false;

      label347: {
         label351: {
            label352: {
               label344: {
                  try {
                     label358: {
                        var2 = true;
                        int var3;
                        if ((var3 = this.o.c()) != Integer.MIN_VALUE) {
                           var1 = 2;
                           char var12 = (char)var3;
                           if (var3 == 22) {
                              Clipboard var5 = Toolkit.getDefaultToolkit().getSystemClipboard();
                              DataFlavor var6 = DataFlavor.stringFlavor;
                              if (var5.isDataFlavorAvailable(var6)) {
                                 this.e((String)var5.getData(var6));
                                 this.J = this.Y.length - 1;
                                 this.I = this.Y[this.J].length();
                                 var2 = false;
                              } else {
                                 var2 = false;
                              }
                           } else if (var12 == 127) {
                              this.c(false);
                              var2 = false;
                           } else if (var12 == '\b') {
                              this.c(true);
                              var2 = false;
                           } else if (this.M.length() >= 0) {
                              if (this.M.length() < this.l) {
                                 this.e(String.valueOf(var12));
                                 var2 = false;
                              } else {
                                 var2 = false;
                              }
                           } else {
                              var2 = false;
                           }
                           break label347;
                        }

                        int var4;
                        if ((var4 = this.o.d) == Integer.MIN_VALUE) {
                           var2 = false;
                           break label352;
                        }

                        var1 = 1;
                        if (var4 == 10) {
                           this.a.a(this.O, (Object)null, this);
                           this.o.b();
                        } else if (var4 == 127) {
                           this.c(false);
                           var1 = 2;
                        } else {
                           if (var4 == 3) {
                              this.J = 0;
                              this.I = 0;
                              var2 = false;
                              break label351;
                           }

                           if (var4 == 132) {
                              this.J = this.Y.length - 1;
                              this.I = this.Y[this.J].length();
                              var2 = false;
                              break label358;
                           }
                        }

                        if (var4 == 8 || var4 == -8 || var4 == 204) {
                           this.c(true);
                           var1 = 2;
                        }

                        if (var4 >= 32) {
                           if (this.M.length() > 0 && this.M.length() < this.l) {
                              this.e(String.valueOf((char)var4));
                           }

                           var1 = 2;
                        }

                        this.K = Integer.MIN_VALUE;
                        if (this.o.b[4]) {
                           if (this.I > 0) {
                              --this.I;
                              var2 = false;
                           } else if (this.J > 0) {
                              --this.J;
                              this.I = this.Y[this.J].length();
                              var2 = false;
                           } else {
                              var2 = false;
                           }
                        } else if (this.o.b[6]) {
                           if (this.I < this.Y[this.J].length()) {
                              ++this.I;
                              var2 = false;
                           } else if (this.J < this.Y.length - 1) {
                              ++this.J;
                              this.I = 0;
                              var2 = false;
                           } else {
                              var2 = false;
                           }
                        } else if (this.o.b[2]) {
                           --this.J;
                           var2 = false;
                        } else if (this.o.b[8]) {
                           ++this.J;
                           var2 = false;
                        } else if (var4 == 19) {
                           this.c(true);
                           var1 = 2;
                           var2 = false;
                        } else {
                           this.K = var4;
                           var2 = false;
                        }
                        break label352;
                     }
                  } catch (Exception var10) {
                     var2 = false;
                     break label344;
                  } finally {
                     if (var2) {
                        if (var1 == 2) {
                           this.a(this.M);
                           this.k();
                           this.o.b();
                        } else if (var1 == 1) {
                           this.a(this.M);
                           this.k();
                        }
                     }

                  }

                  this.a(this.M);
                  this.k();
                  return;
               }

               if (var1 == 2) {
                  this.a(this.M);
                  this.k();
                  this.o.b();
                  return;
               }

               if (var1 == 1) {
                  this.a(this.M);
                  this.k();
                  return;
               }

               return;
            }

            if (var1 == 2) {
               this.a(this.M);
               this.k();
               this.o.b();
               return;
            }

            if (var1 == 1) {
               this.a(this.M);
               this.k();
               return;
            }

            return;
         }

         this.a(this.M);
         this.k();
         return;
      }

      this.a(this.M);
      this.k();
      this.o.b();
   }

   private void k() {
      if (this.J <= 0 || this.Y == null) {
         this.J = 0;
      }

      if (this.J >= this.Y.length) {
         this.J = this.Y.length - 1;
      }

      if (this.I <= 0) {
         this.I = 0;
      }

      if (this.I >= this.Y[this.J].length()) {
         this.I = this.Y[this.J].length();
      }

   }

   private void e(String var1) {
      int var2 = 0;
      String var3 = "";
      String[] var4 = new String[]{""};
      if (this.M.length() > 0) {
         var4 = this.Y;
      }

      for(int var5 = 0; var5 < var4.length; ++var5) {
         String var6 = var4[var5];
         if (var5 < var4.length - 1 && !var6.endsWith(" ")) {
            var6 = var6 + " ";
         }

         if (this.J == var5) {
            var6 = var6.substring(0, this.I) + var1 + var6.substring(this.I, var6.length());
            var2 += this.I + var1.length();
         } else if (var5 < this.J) {
            var2 += var6.length();
         }

         var3 = var3 + var6;
      }

      this.a(var3, var2);
   }

   private String f(String var1) {
      if (var1 != null && var1.length() > this.l) {
         var1 = var1.substring(0, this.l);
      }

      if (this.m == 2) {
         try {
            var1 = "" + Integer.parseInt(var1);
         } catch (Exception var3) {
            var1 = "";
         }
      }

      return var1;
   }

   protected final void f() {
      this.N.a(this.N.g, this.X, this.Y.length);
   }

   private void a(String var1, int var2) {
      var1 = this.f(var1);
      this.a(var1);

      for(int var3 = 0; var3 < this.Y.length; ++var3) {
         String var4 = this.Y[var3];
         if (var3 < this.Y.length - 1 && !var4.endsWith(" ")) {
            var4 = var4 + " ";
         }

         if (var2 < var4.length()) {
            this.J = var3;
            this.I = var2;
            return;
         }

         var2 -= var4.length();
         this.J = var3;
         this.I = var4.length();
      }

   }

   protected final void c(boolean var1) {
      try {
         if (this.M.equals("")) {
            return;
         }

         String var2;
         String[] var3;
         int var4;
         String var5;
         int var6;
         if (!var1) {
            var6 = 0;
            var2 = "";
            var3 = new String[]{""};
            if (this.M.length() > 0) {
               var3 = this.Y;
            }

            for(var4 = 0; var4 < var3.length; ++var4) {
               var5 = var3[var4];
               if (var4 < var3.length - 1 && !var5.endsWith(" ")) {
                  var5 = var5 + " ";
               }

               if (this.J == var4) {
                  var5 = var5.substring(0, this.I) + var5.substring(this.I + 1, var5.length());
                  var6 += this.I;
               } else if (var4 < this.J) {
                  var6 += var5.length();
               }

               var2 = var2 + var5;
            }

            var2 = this.f(var2);
            this.a(var2, var6);
            return;
         }

         var6 = 0;
         var2 = "";
         var3 = new String[]{""};
         if (this.M.length() > 0) {
            var3 = this.Y;
         }

         for(var4 = 0; var4 < var3.length; ++var4) {
            var5 = var3[var4];
            if (var4 < var3.length - 1 && !var5.endsWith(" ")) {
               var5 = var5 + " ";
            }

            if (this.J == var4) {
               if (this.I > 0) {
                  var5 = var5.substring(0, this.I - 1) + var5.substring(this.I, var5.length());
               }

               var6 += this.I - 1;
            } else if (var4 < this.J) {
               var6 += var5.length();
            }

            var2 = var2 + var5;
         }

         if (var6 < 0) {
            var6 = 0;
         }

         this.a(var2, var6);
      } catch (Exception var7) {
      }

   }

   public final void a_() {
      this.N.a();
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      var2 -= 5;

      try {
         switch(var1.b) {
         case -1001:
            if (this.M.equals("")) {
               vdtt_y.a(this, this.M, this.L, this.l, this.m, false);
               return;
            }

            if (var1.j.k >= 0) {
               this.J = var1.j.k;
               var3 = 0;
               String var4 = this.Y[this.J];

               for(int var5 = 0; var5 < var4.length(); ++var5) {
                  int var6 = var3;
                  var3 = vdtt_dd.b(vdtt_dd.d, var4.substring(0, var5)) + vdtt_dd.b(vdtt_dd.d, "" + var4.charAt(var5)) / 2;
                  if (var6 <= var2 && var2 <= var3) {
                     this.I = var5;
                     break;
                  }

                  if (var5 == var4.length() - 1) {
                     this.I = var4.length();
                  }
               }
            }

            vdtt_y.a(this, this.M, this.L, this.l, this.m, false);
         }
      } catch (Exception var7) {
         Utlis.a(var7);
      }

   }

   public final void b(Graphics var1) {
      this.a(var1, 0, 0, this.width, this.height, 46, 22, 23, 1, 1);
      if (this.b) {
         vdtt_cz.a(var1, 1, 1, this.width - 2, this.height - 2);
      }

      this.a(var1, this.N);
      int var2;
      if (!this.M.equals("")) {
         for(var2 = 0; var2 < this.Y.length; ++var2) {
            if (this.N.b(var2)) {
               vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, this.Y[var2], 6, this.X / 2 + var2 * this.X - 1, 0, -1, -16777216);
            }
         }
      } else if (!this.b) {
         for(var2 = 0; var2 < this.Y.length; ++var2) {
            if (this.N.b(var2)) {
               vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, this.Y[var2], 6, this.X / 2 + var2 * this.X - 1, 0, -6255769, 0);
            }
         }
      }

      if (this.b && (DataCenter.gI().h % 20 > 15 || this.o.b[4] || this.o.b[6] || this.o.b[2] || this.o.b[8])) {
         try {
            var1.f(11382189);
            String var3 = this.Y[this.J];
            if ((var2 = vdtt_dd.a(vdtt_dd.d, var3.substring(0, this.I))) < 0) {
               var2 = 0;
            }

            var1.c(var2 + 1 + 5, this.J * this.X + this.X / 2 - 7 - 1, 1, 16);
         } catch (Exception var4) {
         }
      }

      this.a(var1);
   }
}

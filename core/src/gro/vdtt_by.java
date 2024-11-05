package gro;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.util.Vector;

public class vdtt_by extends vdtt_k {
   public int l = 999;
   public int m;
   private String W = "";
   protected String n = "";
   protected int H = 0;
   public int I;
   public int J;
   protected int K = Integer.MIN_VALUE;
   private int X = 11;
   protected String L = "";
   protected String M = "";
   public vdtt_hp N;
   protected int O;
   protected boolean P = true;
   protected boolean Q = false;
   private int Y = 50;
   public int R = Integer.MIN_VALUE;
   public int S = Integer.MAX_VALUE;
   private int Z;
   public boolean T;
   public boolean U;
   public boolean V;
   private String aa = "";

   public vdtt_by(int var1, int var2, int var3, String var4, vdtt_w var5, int var6, int var7) {
      this.L = var4;
      this.a = var5;
      this.O = var6;
      this.m = var7;
      this.setXY(var1, var2);
      this.setSize(var3, 22);
      if (var7 == 1) {
         this.Z = 22;
         this.Q = true;
      }

      this.N = new vdtt_ht((byte)0, 5, 2, this.width - 10 - this.Z, this.height - 4, this.width, 0);
   }

   public final void b(String var1) {
      this.L = var1;
   }

   public int d() {
      return 0;
   }

   protected void f() {
      int var1;
      if ((var1 = vdtt_dd.b(vdtt_dd.d, this.n)) < this.N.width) {
         var1 = this.N.width;
      }

      this.N.a(5, var1, 0);
      var1 = 0;
      if (this.M.length() > 0) {
         var1 = vdtt_dd.b(vdtt_dd.d, this.M.substring(0, this.I));
      }

      vdtt_hp var2 = this.N;
      var2.j = var1 - var2.width / 2;
   }

   private boolean k() {
      return this.m == 1 && this.Q;
   }

   private void l() {
      this.m();
      if (this.k()) {
         this.n = this.W;
      } else {
         this.n = this.M;
      }

      if (this.H < 0 && vdtt_dd.b(vdtt_dd.d, this.n) + this.H < this.width - this.Z - 4 - 13) {
         this.H = this.width - this.Z - 10 - vdtt_dd.b(vdtt_dd.d, this.n);
      }

      if (this.H + vdtt_dd.b(vdtt_dd.d, this.n.substring(0, this.I)) <= 0) {
         this.H = -vdtt_dd.b(vdtt_dd.d, this.n.substring(0, this.I));
         this.H += 40;
      } else if (this.H + vdtt_dd.b(vdtt_dd.d, this.n.substring(0, this.I)) >= this.width - this.Z - 12) {
         this.H = this.width - this.Z - 10 - vdtt_dd.b(vdtt_dd.d, this.n.substring(0, this.I)) - 8;
      }

      if (this.H > 0) {
         this.H = 0;
      }

   }

   private void m() {
      if (this.I >= this.M.length()) {
         this.I = this.M.length();
      }

      if (this.I <= 0) {
         this.I = 0;
      }

   }

   protected void c(boolean var1) {
      if (var1) {
         if (this.I > 0 && this.M.length() > 0) {
            this.e(this.M.substring(0, this.I - 1) + this.M.substring(this.I, this.M.length()));
            --this.I;
            return;
         }
      } else if (this.I < this.M.length() && this.M.length() > 0) {
         this.e(this.M.substring(0, this.I) + this.M.substring(this.I + 1, this.M.length()));
      }

   }

   private void n() {
      if (this.k()) {
         this.W = "";

         for(int var1 = 0; var1 < this.M.length(); ++var1) {
            this.W = this.W + "*";
         }
      }

   }

   public final void a(int var1) {
      this.a("" + var1);
   }

   public final int h() {
      try {
         return Integer.parseInt(this.M);
      } catch (Exception var2) {
         return 0;
      }
   }

   public final String i() {
      return this.M;
   }

   public final void d(String var1) {
      this.a(this.M + var1);
   }

   public void a(String var1, int var2, int var3) {
      if ((var1 = this.M.substring(0, var2) + var1 + this.M.substring(this.I, this.M.length())).length() > this.l) {
         var1 = var1.substring(0, this.l);
      }

      this.M = this.n = var1;
      this.I = var3;
      this.K = Integer.MIN_VALUE;
      this.n();
      this.l();
      this.f();
   }

   public void a(String var1) {
      if (var1 != null) {
         var1 = this.f(var1);
         this.I = var1.length();
         this.M = this.n = var1;
         this.K = Integer.MIN_VALUE;
         this.n();
         this.l();
         this.f();
      }

   }

   private void e(String var1) {
      var1 = this.f(var1);
      this.M = var1;
   }

   private String f(String var1) {
      if (var1 != null && var1.length() > this.l) {
         var1 = var1.substring(0, this.l);
      }

      if (this.m == 2) {
         try {
            int var2;
            if ((var2 = Integer.parseInt(var1)) < this.R) {
               var2 = this.R;
            }

            if (var2 > this.S) {
               var2 = this.S;
            }

            var1 = "" + var2;
         } catch (Exception var3) {
            var1 = "";
         }
      }

      return var1;
   }

   public void b(Graphics var1) {
      if (!this.d) {
         if (this.P) {
            this.a(var1, 0, 1, this.width, 20, 46, 22, 23, 1, 1);
         } else {
            vdtt_y.a(var1, 46, 0, 0, 1, this.width, (int)(this.height - 1));
         }

         if (this.b) {
            vdtt_cz.a(var1, 1, 2, this.width - 2, 18);
         }

         if (this.k()) {
            this.n = this.W;
         } else {
            this.n = this.M;
         }

         if (this.m == 1) {
            if (this.e(0)) {
               var1.e(30);
            }

            vdtt_cz.a(var1, this.Y, 0, this.width - this.Z + this.Z / 2, this.height / 2, 3);
            var1.h();
         }

         this.a(var1, this.N);
         if (this.n.equals("") && !this.b) {
            if (this.T) {
               vdtt_dd.c(vdtt_dd.d, var1, this.L, 1, this.height / 2 - 3, 0, -6255769, 0);
            } else {
               vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, this.L, 1, this.height / 2 - 3, 0, -6255769, 0);
            }
         } else {
            if (this.m == 1 && this.Q) {
               if (this.T) {
                  vdtt_dd.c(vdtt_dd.d, var1, this.n, 1, this.height / 2, 0, -1, -16777216);
               } else {
                  vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, this.n, 1, this.height / 2, 0, -1, -16777216);
               }
            } else if (this.T) {
               vdtt_dd.c(vdtt_dd.d, var1, this.n, 1, this.height / 2 - 3, 0, -1, -16777216);
            } else {
               vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, this.n, 1, this.height / 2 - 3, 0, -1, -16777216);
            }

            if (this.b && DataCenter.gI().h % 20 > 15) {
               var1.f(11382189);
               int var2 = 0;

               try {
                  if (this.n.length() > 0) {
                     var2 = vdtt_dd.a(vdtt_dd.d, this.n.substring(0, this.I));
                  }

                  if (var2 < 0) {
                     var2 = 0;
                  }
               } catch (Exception var4) {
               }

               var1.c(var2 + 1, (this.height - 16) / 2 - 2, 1, 16);
            }
         }

         this.a(var1);
      }

   }

   public void a_() {
      try {
         this.m();
         this.N.a();
         if (!this.aa.equals(this.M)) {
            this.aa = this.M;
            this.j();
         }
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   public void c() {
      byte var1 = 0;
      boolean var2 = false;

      label483: {
         label478: {
            label477: {
               label476: {
                  try {
                     label494: {
                        var2 = true;
                        int var3;
                        String var4;
                        if ((var3 = this.o.c()) != Integer.MIN_VALUE) {
                           var1 = 2;
                           char var16 = (char)var3;
                           if (var3 == 22) {
                              try {
                                 Clipboard var6 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                 DataFlavor var7 = DataFlavor.stringFlavor;
                                 if (var6.isDataFlavorAvailable(var7)) {
                                    var4 = (String)var6.getData(var7);
                                    String var8 = this.M.substring(0, this.I) + var4;
                                    if (this.I < this.M.length()) {
                                       var8 = var8 + this.M.substring(this.I, this.M.length());
                                    }

                                    this.e(var8);
                                    this.I += var4.length();
                                    var2 = false;
                                 } else {
                                    var2 = false;
                                 }
                              } catch (Exception var13) {
                                 var2 = false;
                              }
                              break label477;
                           }

                           if (this.V) {
                              this.e(String.valueOf(var16));
                              var2 = false;
                              break label477;
                           }

                           if (var16 == 127) {
                              this.c(false);
                              var2 = false;
                              break label477;
                           }

                           if (var16 == '\b') {
                              this.c(true);
                              var2 = false;
                              break label477;
                           }

                           if (this.M.length() >= 0) {
                              if (this.M.length() < this.l) {
                                 if (this.m == 2) {
                                    if (var16 < '0') {
                                       var2 = false;
                                       break label477;
                                    }

                                    if (var16 > '9') {
                                       var2 = false;
                                       break label477;
                                    }
                                 }

                                 var4 = this.M.substring(0, this.I) + var16;
                                 if (this.I < this.M.length()) {
                                    var4 = var4 + this.M.substring(this.I, this.M.length());
                                 }

                                 this.e(var4);
                                 ++this.I;
                                 var2 = false;
                                 break label477;
                              }

                              var2 = false;
                              break label477;
                           }

                           var2 = false;
                           break label477;
                        }

                        int var5;
                        if ((var5 = this.o.d) == Integer.MIN_VALUE) {
                           var2 = false;
                           break label483;
                        }

                        var1 = 1;
                        if (var5 == 10) {
                           this.a.a(this.O, (Object)null, this);
                           this.o.b();
                        } else if (var5 == 127) {
                           this.c(false);
                           var1 = 2;
                        } else {
                           if (var5 == 3) {
                              this.I = 0;
                              var2 = false;
                              break label476;
                           }

                           if (var5 == 132) {
                              this.I = this.M.length();
                              var2 = false;
                              break label494;
                           }
                        }

                        if (var5 == 8 || var5 == -8 || var5 == 204) {
                           this.c(true);
                           var1 = 2;
                        }

                        if (var5 >= 32) {
                           if (this.M.length() > 0 && this.M.length() < this.l) {
                              var4 = this.M.substring(0, this.I) + (char)var5;
                              if (this.I < this.M.length()) {
                                 var4 = var4 + this.M.substring(this.I, this.M.length());
                              }

                              this.e(var4);
                              ++this.I;
                           }

                           var1 = 2;
                        }

                        this.K = Integer.MIN_VALUE;
                        if (this.o.b[4]) {
                           --this.I;
                           var2 = false;
                        } else if (this.o.b[6]) {
                           ++this.I;
                           var2 = false;
                        } else if (var5 == 19) {
                           this.c(true);
                           var1 = 2;
                           var2 = false;
                        } else {
                           this.K = var5;
                           var2 = false;
                        }
                        break label483;
                     }
                  } catch (Exception var14) {
                     var2 = false;
                     break label478;
                  } finally {
                     if (var2) {
                        if (var1 == 2) {
                           this.n();
                           this.l();
                           this.f();
                           this.o.b();
                        } else if (var1 == 1) {
                           this.n();
                           this.l();
                           this.f();
                        }
                     }

                  }

                  this.n();
                  this.l();
                  this.f();
                  return;
               }

               this.n();
               this.l();
               this.f();
               return;
            }

            this.n();
            this.l();
            this.f();
            this.o.b();
            return;
         }

         if (var1 == 2) {
            this.n();
            this.l();
            this.f();
            this.o.b();
            return;
         }

         if (var1 == 1) {
            this.n();
            this.l();
            this.f();
            return;
         }

         return;
      }

      if (var1 == 2) {
         this.n();
         this.l();
         this.f();
         this.o.b();
      } else if (var1 == 1) {
         this.n();
         this.l();
         this.f();
      }
   }

   public final Vector g() {
      if (this.c) {
         return null;
      } else {
         Vector var1 = new Vector();
         if (this.m == 1) {
            var1.addElement(new vdtt_hi(-1000, this.width - this.Z, 0, this.width, this.height, (vdtt_hp)null, this));
         }

         var1.addElement(new vdtt_hi(-1001, 0, 0, this.width, this.height, this.N, this));
         return var1;
      }
   }

   public void a(vdtt_hi var1, int var2, int var3) {
      if (!this.c && !this.d) {
         var3 = this.N.j + (var2 - this.N.cx);

         try {
            switch(var1.b) {
            case -1001:
               if (this.a instanceof vdtt_ka && ((vdtt_ka)this.a).P.j() == 5 && vdtt_ba.J.length() > 0 && !this.M.startsWith("/" + vdtt_ba.J + ": ")) {
                  this.a("/" + vdtt_ba.J + ": ");
               }

               if (var3 <= 1) {
                  this.I = 0;
               } else {
                  var2 = 0;

                  for(int var4 = 0; var4 < this.M.length(); ++var4) {
                     int var5 = var2;
                     var2 = vdtt_dd.b(vdtt_dd.d, this.M.substring(0, var4)) + vdtt_dd.b(vdtt_dd.d, "" + this.M.charAt(var4)) / 2;
                     if (var5 <= var3 && var3 <= var2) {
                        this.I = var4;
                        break;
                     }

                     if (var4 == this.M.length() - 1) {
                        this.I = this.M.length();
                     }
                  }
               }

               this.f();
               vdtt_y.a(this, this.M, this.L, this.l, this.m, false);
               break;
            case -1000:
               if (!this.M.equals("")) {
                  this.Q = !this.Q;
                  this.n();
                  this.l();
                  this.f();
                  vdtt_aa.gI().n();
                  return;
               }
            }
         } catch (Exception var6) {
            Utlis.a(var6);
         }
      }

   }

   public void j() {
   }
}

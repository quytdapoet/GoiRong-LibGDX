package gro;

import java.util.Vector;

public abstract class MainScreen extends vdtt_w {
   public static Vector a = new Vector();
   public Vector b = new Vector();
   public vdtt_w c;
   private long d;

   public MainScreen() {
      this.e = 0;
      this.setXY(0, 0);
      this.setSize(DataCenter.gI().n, DataCenter.gI().o);
      this.a((vdtt_w)this);
   }

   public final vdtt_w d() {
      return this.c;
   }

   public final void a(vdtt_w var1) {
      if (!(this.c instanceof vdtt_kv)) {
         if (this instanceof GameSrc) {
            ((GameSrc)this).I();
         }

         if (var1 instanceof SettingsTab) {
            ((SettingsTab)var1).a(var1.width);
         }

         int var2;
         for(var2 = 0; var2 < this.f.size(); ++var2) {
            if (this.f.get(var2) instanceof vdtt_ay) {
               vdtt_ay var3;
               (var3 = (vdtt_ay)this.f.get(var2)).M = false;
               if (var3.p != null) {
                  var3.p.b = -1;
               }

               if (this.f.get(var2) instanceof vdtt_az) {
                  ((vdtt_az)this.f.get(var2)).r();
               }
            }
         }

         if (!this.b.contains(var1)) {
            if (this.c != null && this.c.e == 5) {
               ((vdtt_ak)this.c).d();
               this.a(5);
            }

            if (var1.e != 0) {
               this.a(var1.e);
            }

            this.b.addElement(var1);
            this.f();

            for(var2 = 0; var2 < this.b.size(); ++var2) {
               vdtt_w var5;
               for(int var4 = (var5 = (vdtt_w)this.b.get(var2)).f.size() - 1; var4 >= 0; --var4) {
                  if (var5.f.get(var4) instanceof vdtt_al) {
                     var5.f.remove(var4);
                  }
               }
            }
         }
      }

   }

   private void b(vdtt_w var1) {
      var1.n = 0;
      this.b.removeElement(var1);
      this.f();
   }

   public final void a(mImage var1) {
      vdtt_bf var2;
      (var2 = new vdtt_bf(Caption.ax, this, 0)).M = var1;
      var2.f.removeElementAt(var2.f.size() - 1);
      var2.b(Caption.i, 10004);
      var2.c(Caption.ay, 10005);
      boolean var3 = false;
      String var4 = "";
      var3 = true;
      var3 = true;
      var3 = true;
      vdtt_by var5 = var2.a(74, 75, 50, var4, var2, 0);
      byte var6 = 4;
      var5.l = var6;
      this.a((vdtt_w)var2);
   }

   public final void a(String var1, int var2, vdtt_x var3) {
      vdtt_bf var4;
      (var4 = new vdtt_bf(var1, this, 0)).N = var3;
      var4.f.removeElementAt(var4.f.size() - 1);
      var4.b(Caption.bi, var2);
      var4.c(Caption.D, 10003);
      this.a((vdtt_w)var4);
   }

   public final void a(String var1, int var2, int var3, vdtt_x var4) {
      vdtt_bf var5;
      (var5 = new vdtt_bf(var1, this, 0)).N = var4;
      var5.f.clear();
      var5.b(Caption.bi, var2);
      var5.c(Caption.D, var3);
      this.a((vdtt_w)var5);
   }

   public final void a(String var1, String var2, int var3, int var4, vdtt_x var5) {
      vdtt_bf var6;
      (var6 = new vdtt_bf(var1, this, 0)).O = var2;
      var6.N = var5;
      var6.f.removeElementAt(var6.f.size() - 1);
      var6.b(Caption.bi, var3);
      var6.c(Caption.D, var4);
      this.a((vdtt_w)var6);
   }

   public final vdtt_bf b(String var1) {
      vdtt_bf var2 = new vdtt_bf(var1, this, 0);
      this.a((vdtt_w)var2);
      return var2;
   }

   public final void a(String var1, int var2) {
      vdtt_bf var3;
      (var3 = new vdtt_bf(var1, this, 3)).c = var2;
      var3.f.clear();
      var3.a(Caption.sl, 10010);
      this.a((vdtt_w)var3);
   }

   public final void e() {
      this.a(5);
      this.a(4);
      this.a(3);
      this.a(2);
      this.a(1);
   }

   public final void a(int var1) {
      try {
         for(int var2 = this.b.size() - 1; var2 >= 0; --var2) {
            vdtt_w var3;
            if ((var3 = (vdtt_w)this.b.elementAt(var2)).e == var1) {
               var3.n = 0;
               this.b.removeElementAt(var2);
            }
         }

         this.f();
      } catch (Exception var4) {
      }
   }

   public final void f() {
      a((Vector)this.b);
      this.c = (vdtt_w)this.b.lastElement();
   }

   public void a(int var1, int var2) {
      vdtt_w var3 = this.c;
      int var4 = var2;
      var2 = var1;
      vdtt_w var5 = var3;
      if (var3.p != null) {
         var3.p.e = XYEntity.create(var1, var4);
      }

      vdtt_k var6 = null;
      boolean var7 = false;

      label539: {
         label540: {
            label541: {
               try {
                  var7 = true;

                  int var8;
                  for(var8 = var5.f.size() - 1; var8 >= 0; --var8) {
                     (var6 = (vdtt_k)var5.f.elementAt(var8)).b = false;
                  }

                  for(var8 = var5.f.size() - 1; var8 >= 0; --var8) {
                     if ((var6 = (vdtt_k)var5.f.elementAt(var8)).p != null && var6.p.a(var2 - var6.cx, var4 - var6.cy) >= 0) {
                        var5.c(var6);
                        var7 = false;
                        break label539;
                     }
                  }

                  if (var5.p == null) {
                     var7 = false;
                  } else {
                     if (var5.p.a(var2 - var5.cx, var4 - var5.cy) >= 0) {
                        var7 = false;
                        break label540;
                     }

                     var7 = false;
                  }
                  break label541;
               } catch (Exception var12) {
                  var7 = false;
               } finally {
                  if (var7) {
                     if (var5.k != null && (var6 == null || !var5.k.equals(var6))) {
                        var5.b((vdtt_k)var5.k);
                     }

                     if (var5.h != null && (var6 == null || !var5.h.equals(var6))) {
                        var5.p();
                     }

                     if (var5.j != null) {
                        var5.j.d();
                     }

                     var5.h = null;
                     var5.i = null;
                     var5.g = null;
                     var5.j = null;
                  }

               }

               if (var5.k != null && (var6 == null || !var5.k.equals(var6))) {
                  var5.b((vdtt_k)var5.k);
               }

               if (var5.h != null && (var6 == null || !var5.h.equals(var6))) {
                  var5.p();
               }

               if (var5.j != null) {
                  var5.j.d();
               }

               var5.h = null;
               var5.i = null;
               var5.g = null;
               var5.j = null;
               return;
            }

            var6 = null;
            if (var5.k != null) {
               var5.b((vdtt_k)var5.k);
            }

            if (var5.h != null) {
               var5.p();
            }

            if (var5.j != null) {
               var5.j.d();
            }

            var5.h = null;
            var5.i = null;
            var5.g = null;
            var5.j = null;
            return;
         }

         if (var5.k != null && (var6 == null || !var5.k.equals(var6))) {
            var5.b((vdtt_k)var5.k);
         }

         if (var5.h != null && (var6 == null || !var5.h.equals(var6))) {
            var5.p();
         }

         if (var5.j != null) {
            var5.j.d();
         }

         var5.h = null;
         var5.i = null;
         var5.g = null;
         var5.j = null;
         return;
      }

      if (var5.k != null && (var6 == null || !var5.k.equals(var6))) {
         var5.b((vdtt_k)var5.k);
      }

      if (var5.h != null && (var6 == null || !var5.h.equals(var6))) {
         var5.p();
      }

      if (var5.j != null) {
         var5.j.d();
      }

      var5.h = null;
      var5.i = null;
      var5.g = null;
      var5.j = null;
   }

   public void b(int var1, int var2) {
      int var3 = var2;
      var2 = var1;
      vdtt_w var4 = this.c;

      try {
         if (var4.p != null) {
            var4.p.f = XYEntity.create(var2, var3);
         }

         boolean var5 = false;
         var4.o.e = var5;

         vdtt_hi var6;
         for(int var7 = var4.f.size() - 1; var7 >= 0; --var7) {
            vdtt_k var8;
            if ((var8 = (vdtt_k)var4.f.elementAt(var7)).p != null && var8.p.b >= 0) {
               var6 = var8.p.b(var2 - var8.cx, var3 - var8.cy);
               if (var8 instanceof vdtt_cc) {
                  var4.a(var6, var2 - var4.cx, var3 - var4.cy);
                  return;
               }

               if (var6 != null && (var6.j == null || !var6.j.c())) {
                  var8.a(var6, var2 - var8.a(), var3 - var8.b());
               }

               if (var8 instanceof vdtt_bd && ((vdtt_bd)var8).N) {
                  var4.h = var8;
               } else if (var8 instanceof vdtt_by) {
                  var4.i = var8;
               }

               var8.r();
               return;
            }
         }

         if (var4.p == null || var4.p.b < 0) {
            var4.r();
            return;
         }

         if ((var6 = var4.p.b(var2 - var4.cx, var3 - var4.cy)) != null && (var6.j == null || !var6.j.c())) {
            var4.a(var6, var2 - var4.cx, var3 - var4.cy);
         }
      } catch (Exception var12) {
         Utlis.a(var12);
         return;
      } finally {
         if (var4.j != null) {
            var4.j.d();
         }

         var4.g = null;
         var4.j = null;
      }

   }

   public void c(int var1, int var2) {
      int var3 = var2;
      var2 = var1;
      vdtt_w var4 = this.c;

      try {
         if (var4.g != null) {
            var4.g.p.a(var4.j, var2 - var4.g.cx, var3 - var4.g.cy);
         } else {
            vdtt_hi var5;
            for(int var6 = var4.f.size() - 1; var6 >= 0; --var6) {
               vdtt_x var7;
               if ((var7 = (vdtt_x)var4.f.elementAt(var6)).p != null && var7.p.b >= 0) {
                  if ((var5 = var7.p.c(var2 - var7.cx, var3 - var7.cy)) != null && var5.j != null) {
                     var4.g = var7;
                     var4.j = var5.j;
                  }

                  return;
               }
            }

            if (var4.p != null && var4.p.b >= 0 && (var5 = var4.p.c(var2 - var4.cx, var3 - var4.cy)) != null && var5.j != null) {
               var4.g = var4;
               var4.j = var5.j;
            }
         }
      } catch (Exception var8) {
         Utlis.a(var8);
      }

   }

   public final void a(int var1, Object var2, vdtt_x var3) {
      try {
         switch(var1) {
         case -11:
            this.q();
            break;
         case -10:
         case -9:
         default:
            this.b(var1, var2, var3);
            return;
         case -8:
            vdtt_hm var4 = (vdtt_hm)var2;
            this.a((vdtt_w)(new vdtt_bo(var4, this, (byte)0, true)));
            break;
         case -7:
            this.b((vdtt_w)var2);
            break;
         case -6:
            this.a(1);
            break;
         case -5:
            this.a(2);
            break;
         case -4:
            this.a(3);
            break;
         case -3:
            this.a(4);
            break;
         case -2:
            this.a(5);
            break;
         case -1:
            this.e();
         }
      } catch (Exception var5) {
      }

   }

   public final void a(int var1, Object var2) {
      this.b(var1, var2);
   }

   public Vector g() {
      return null;
   }

   public final void b(String var1, int var2) {
      this.h();
      vdtt_go var3 = vdtt_go.gI();
      int var4 = var2;
      vdtt_dd var5 = vdtt_dd.e;
      String var6 = var1;
      vdtt_go var7 = var3;
      if (var3.a.size() <= 0) {
         if (var5 == null) {
            var5 = vdtt_dd.d;
         }

         int var8 = 0;

         while(true) {
            if (var8 >= var7.a.size()) {
               if (var7.a.size() > 15) {
                  var7.a.removeElementAt(0);
               }

               var7.a.addElement(new vdtt_gp(var7, var6, var5, var4));
               break;
            }

            vdtt_gp var9;
            String var10;
            if ((var9 = (vdtt_gp)var7.a.elementAt(var8)).b.equals(var5) && var9.d == var4 && var9.a != null && var9.a.length() < 80 && var9.a.startsWith(Caption.q) && var6.startsWith(Caption.q)) {
               int var17 = Caption.q.length() + 1;
               int var18 = 0;
               int var13 = 0;
               var10 = var9.a + " ";
               var6 = var6 + " ";

               for(var4 = var17; var4 < var10.length(); ++var4) {
                  try {
                     var18 = Integer.parseInt(vdtt_go.a(var10.substring(var17, var4), ".", "").trim());
                  } catch (Exception var16) {
                  }

                  if (var10.charAt(var4) == ' ') {
                     break;
                  }
               }

               if (var18 <= 0) {
                  var18 = 1;
               }

               var10 = var10.substring(var4).trim();

               for(var4 = var17; var4 < var6.length(); ++var4) {
                  try {
                     var13 = Integer.parseInt(vdtt_go.a(var6.substring(var17, var4), ".", "").trim());
                  } catch (Exception var15) {
                  }

                  if (var6.charAt(var4) == ' ') {
                     break;
                  }
               }

               if (var13 <= 0) {
                  var13 = 1;
               }

               if ((var6 = var6.substring(var4).trim()).equals(var10)) {
                  var9.a = Caption.q + " " + Utlis.c(var18 + var13) + " " + var6;
               } else {
                  var9.a = var9.a + ", " + Utlis.c(var13) + " " + var6;
               }

               if (var8 == 0) {
                  var7.c();
               }

               return;
            }

            if (var9.b.equals(var5) && var9.d == var4 && var9.a != null && var9.a.length() < 80) {
               if (var9.a.equals(var6) || var9.a.indexOf(var6) >= 0) {
                  if (var8 == 0) {
                     var7.c();
                  }

                  return;
               }

               if (var9.a.length() >= 8) {
                  String var11 = var6.substring(0, 8);
                  String var12 = var9.a.substring(0, 8);
                  if (var11.equals(var12)) {
                     for(var4 = 7; var4 < var6.length() && var4 < var9.a.length() && var6.charAt(var4) == var9.a.charAt(var4); ++var4) {
                     }

                     var10 = var6.substring(var4, var6.length());
                     var9.a = var9.a + ", " + var10;
                     if (var8 == 0) {
                        var7.c();
                     }

                     return;
                  }
               }
            }

            ++var8;
         }
      }

   }

   public final void c(String var1, int var2) {
      long var3 = System.currentTimeMillis();
      if ((!var1.contains(Caption.wD) || var3 - this.d >= 300000L || !mConfig.gI().a(10)) && (!var1.contains(Caption.mB.substring(0, Caption.mB.length() - 5)) || !vdtt_gq.gI().a(var1)) && (!var1.contains(Caption.bf) || !vdtt_gq.gI().a(var1))) {
         this.d = var3;
         this.h();
         vdtt_gq.gI().a(var1, vdtt_dd.d, var2);
      }

   }

   public static void d(String var0, int var1) {
      if (!mConfig.gI().a(16)) {
         vdtt_gs var2 = vdtt_gs.gI();
         int var3 = -7812062;
         vdtt_dd var4 = vdtt_dd.d;
         String var5 = var0;
         vdtt_gs var6 = var2;
         if (var2.a.size() == 0) {
            var2.c = 10;
         }

         if (var4 == null) {
            var4 = vdtt_dd.d;
         }

         int var7 = 0;

         while(true) {
            if (var7 >= var6.a.size()) {
               if (var6.a.size() > 15) {
                  var6.a.removeElementAt(0);
               }

               var6.a.addElement(new vdtt_it(var5, var4, var3));
               break;
            }

            vdtt_it var8;
            String var9;
            if ((var8 = (vdtt_it)var6.a.elementAt(var7)).b.equals(var4) && var8.d == var3 && var8.a != null && var8.a.length() < 80 && var8.a.startsWith(Caption.q) && var5.startsWith(Caption.q)) {
               int var16 = Caption.q.length() + 1;
               int var17 = 0;
               int var12 = 0;
               var9 = var8.a + " ";
               var5 = var5 + " ";

               for(var3 = var16; var3 < var9.length(); ++var3) {
                  try {
                     var17 = Integer.parseInt(vdtt_gs.a(var9.substring(var16, var3), ".", "").trim());
                  } catch (Exception var15) {
                  }

                  if (var9.charAt(var3) == ' ') {
                     break;
                  }
               }

               if (var17 <= 0) {
                  var17 = 1;
               }

               var9 = var9.substring(var3).trim();

               for(var3 = var16; var3 < var5.length(); ++var3) {
                  try {
                     var12 = Integer.parseInt(vdtt_gs.a(var5.substring(var16, var3), ".", "").trim());
                  } catch (Exception var14) {
                  }

                  if (var5.charAt(var3) == ' ') {
                     break;
                  }
               }

               if (var12 <= 0) {
                  var12 = 1;
               }

               if ((var5 = var5.substring(var3).trim()).equals(var9)) {
                  var8.a = Caption.q + " " + Utlis.c(var17 + var12) + " " + var5;
               } else {
                  var8.a = var8.a + ", " + Utlis.c(var12) + " " + var5;
               }

               if (var7 == 0) {
                  var6.c();
               }

               return;
            }

            if (var8.b.equals(var4) && var8.d == var3 && var8.a != null && var8.a.length() < 80) {
               if (var8.a.equals(var5) || var8.a.indexOf(var5) >= 0) {
                  if (var7 == 0) {
                     var6.c();
                  }

                  return;
               }

               if (var8.a.length() >= 8) {
                  String var10 = var5.substring(0, 8);
                  String var11 = var8.a.substring(0, 8);
                  if (var10.equals(var11)) {
                     for(var3 = 7; var3 < var5.length() && var3 < var8.a.length() && var5.charAt(var3) == var8.a.charAt(var3); ++var3) {
                     }

                     var9 = var5.substring(var3, var5.length());
                     var8.a = var8.a + ", " + var9;
                     if (var7 == 0) {
                        var6.c();
                     }

                     return;
                  }
               }
            }

            ++var7;
         }
      }

   }

   public final void e(String var1, int var2) {
      this.h();
      vdtt_gt var3 = vdtt_gt.gI();
      short var4 = -2560;
      vdtt_dd var5 = vdtt_dd.d;
      String var6 = var1;
      vdtt_gt var7 = var3;
      if (var5 == null) {
         var5 = vdtt_dd.d;
      }

      for(int var8 = 0; var8 < var7.a.size(); ++var8) {
         vdtt_it var9;
         String var10;
         int var11;
         if ((var9 = (vdtt_it)var7.a.elementAt(var8)).b.equals(var5) && var9.d == var4 && var9.a != null && var9.a.length() < 80 && var9.a.startsWith(Caption.q) && var6.startsWith(Caption.q)) {
            int var18 = Caption.q.length() + 1;
            int var19 = 0;
            int var14 = 0;
            var10 = var9.a + " ";
            var6 = var6 + " ";

            for(var11 = var18; var11 < var10.length(); ++var11) {
               try {
                  var19 = Integer.parseInt(vdtt_gt.a(var10.substring(var18, var11), ".", "").trim());
               } catch (Exception var17) {
               }

               if (var10.charAt(var11) == ' ') {
                  break;
               }
            }

            if (var19 <= 0) {
               var19 = 1;
            }

            var10 = var10.substring(var11).trim();

            for(var11 = var18; var11 < var6.length(); ++var11) {
               try {
                  var14 = Integer.parseInt(vdtt_gt.a(var6.substring(var18, var11), ".", "").trim());
               } catch (Exception var16) {
               }

               if (var6.charAt(var11) == ' ') {
                  break;
               }
            }

            if (var14 <= 0) {
               var14 = 1;
            }

            if ((var6 = var6.substring(var11).trim()).equals(var10)) {
               var9.a = Caption.q + " " + Utlis.c(var19 + var14) + " " + var6;
            } else {
               var9.a = var9.a + ", " + Utlis.c(var14) + " " + var6;
            }

            if (var8 == 0) {
               var7.c();
            }

            return;
         }

         if (var9.b.equals(var5) && var9.d == var4 && var9.a != null && var9.a.length() < 80) {
            if (var9.a.equals(var6) || var9.a.indexOf(var6) >= 0) {
               if (var8 == 0) {
                  var7.c();
               }

               return;
            }

            if (var9.a.length() >= 8) {
               String var12 = var6.substring(0, 8);
               String var13 = var9.a.substring(0, 8);
               if (var12.equals(var13)) {
                  for(var11 = 7; var11 < var6.length() && var11 < var9.a.length() && var6.charAt(var11) == var9.a.charAt(var11); ++var11) {
                  }

                  var10 = var6.substring(var11, var6.length());
                  var9.a = var9.a + ", " + var10;
                  if (var8 == 0) {
                     var7.c();
                  }

                  return;
               }
            }
         }
      }

      if (var7.a.size() > 15) {
         var7.a.removeElementAt(0);
      }

      var7.a.addElement(new vdtt_it(var6, var5, var4));
   }

   public final void h() {
      vdtt_w var1;
      if ((var1 = this.c) instanceof vdtt_nj) {
         this.b(var1);
      }

   }

   public final void i() {
      this.a((vdtt_w)(new vdtt_nj(this)));
   }

   public abstract void j();

   public abstract void k();

   public static void a(String var0, byte[] var1, byte var2) {
      GameSrc.gI().dI = true;
      AppListener.gI();
      AppListener.a(var0);
   }
}

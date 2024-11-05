package gro;

import java.util.Iterator;

public final class InputCanvas extends Canvas {
   public static long a;
   private XYEntity k = new XYEntity();
   private boolean l;
   public int num;
   private long lastTime;

   public final void keyTyped(char var1) {
      try {
         a = System.currentTimeMillis();
         if (DataCenter.gI().currentScreen != null) {
            MainScreen var2 = DataCenter.gI().currentScreen;
            if (!var2.c.a(var1)) {
               var2.c.o.a(var1);
            }
         }
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }

   public final void keyDown(int var1) {
      try {
         a = System.currentTimeMillis();
         if (DataCenter.gI().currentScreen != null) {
            MainScreen var2 = DataCenter.gI().currentScreen;
            if (!var2.c.c(var1)) {
               var2.c.o.a(var1);
            }
         }
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }

   public final void keyUp(int var1) {
      try {
         a = System.currentTimeMillis();
         if (DataCenter.gI().currentScreen != null) {
            MainScreen var2 = DataCenter.gI().currentScreen;
            if (!var2.c.d(var1)) {
               var2.c.o.b(var1);
            }
         }
      } catch (Exception var5) {
         Utlis.a(var5);
      }

   }

   public final void update() {
      try {
         if (DataCenter.gI().currentScreen != null) {
            MainScreen var1 = DataCenter.gI().currentScreen;

            try {
               vdtt_go.gI().d();
               vdtt_gq var2;
               (var2 = vdtt_gq.gI()).setSize(DataCenter.gI().n - 200, 70);
               var2.setXY(DataCenter.gI().n / 2 - var2.width / 2, DataCenter.gI().o - 120);
               if (var2.c.size() > 0 && System.currentTimeMillis() - var2.e > 150L && var2.a.size() < 10) {
                  var2.e = System.currentTimeMillis();
                  var2.a.add(var2.c.firstElement());
                  var2.c.remove(var2.c.firstElement());
               }

               var2.d = 25 - var2.c.size() / 2;
               if (var2.d < 2) {
                  var2.d = 2;
               }

               (var2 = var2).b.clear();
               Iterator var3 = var2.a.iterator();

               while(var3.hasNext()) {
                  vdtt_gr var4;
                  if ((var4 = (vdtt_gr)var3.next()).a.length() > 100) {
                     var2.d += 5;
                  }

                  if (var2.d > 30) {
                     var2.d = 30;
                  }

                  int var5 = var2.d;
                  if (var4.f > 0) {
                     --var4.f;
                     if (vdtt_gq.a(var4.g).size() > 5) {
                        --var4.f;
                     }
                  } else {
                     var4.d -= var4.d / var5;
                     if (var4.d / var5 == 0 && var4.d > 0) {
                        var4.d -= vdtt_gq.a(var4.g).size() > 5 ? 2 : 1;
                     }

                     var4.e = 100;
                     if (var4.d <= var4.g.height / 3) {
                        var4.e = (int)((float)var4.d / ((float)var4.g.height / 3.0F) * 100.0F);
                     }
                  }

                  if (var4.d <= 0) {
                     var2.b.add(var4);
                  }
               }

               var2.a.removeAll(var2.b);
               vdtt_gs.gI().d();
               vdtt_gt.gI().d();
               var1.j();

               for(int var8 = 0; var8 < var1.b.size(); ++var8) {
                  vdtt_w var9;
                  (var9 = (vdtt_w)var1.b.elementAt(var8)).l();
                  var9.m();
                  var9.o();
               }

               if (!(var1.c instanceof vdtt_v) && vdtt_y.a != null) {
                  vdtt_y.a.k();
               }

               return;
            } catch (Exception var6) {
               Utlis.a(var6);
            }
         }
      } catch (Exception var7) {
         Utlis.a(var7);
      }

   }

   public final void paint(Graphics var1) {
      try {
         if (DataCenter.gI().currentScreen != null) {
            Graphics var2 = var1;
            MainScreen var3 = DataCenter.gI().currentScreen;

            try {
               for(int var4 = 0; var4 < var3.b.size(); ++var4) {
                  ((vdtt_w)var3.b.elementAt(var4)).c(var2);
               }

               if (System.currentTimeMillis() - this.lastTime > 600000L) {
                  String var7 = "- Chào mừng bạn đến tới Gọi Rồng Plus. Hãy theo dõi Fanpage : Gọi Rồng Plus để nhận các phần quà và các event từ Admin nha!";
                  this.num += 2;
                  vdtt_dd.a(var1, var7, var3.width - this.num, var3.height - 8, 0, -1);
                  if (this.num % (var7.length() * 50) == 0) {
                     this.num = 0;
                  }

                  this.lastTime = System.currentTimeMillis();
                  System.err.println("paint");
               }

               if (!(var3 instanceof GameSrc)) {
                  if (!(var3 instanceof vdtt_ce)) {
                     vdtt_go.gI().a(var2);
                     vdtt_gq.gI().a(var2);
                     vdtt_gs.gI().a(var2);
                  }

                  return;
               }

               if (!GameSrc.gI().D()) {
                  return;
               }

               vdtt_go.gI().a(var2);
               vdtt_gq.gI().a(var2);
               vdtt_gs.gI().a(var2);
               vdtt_gt.gI().a(var2);
            } catch (Exception var5) {
               Utlis.a(var5);
            }
         }
      } catch (Exception var6) {
         Utlis.a(var6);
      }

   }

   public final void touchDragged(int var1, int var2) {
      try {
         a = System.currentTimeMillis();
         if (DataCenter.gI().currentScreen != null) {
            DataCenter.gI().currentScreen.c(var1, var2);
         }
      } catch (Exception var4) {
         Utlis.a(var4);
      }

   }

   public final void touchDown(int var1, int var2) {
      try {
         a = System.currentTimeMillis();
         if (this.l) {
            this.touchUp(this.k.cx, this.k.cy);
         }

         this.l = true;
         this.k.setXY(var1, var2);
         if (DataCenter.gI().currentScreen != null) {
            DataCenter.gI().currentScreen.a(var1, var2);
         }
      } catch (Exception var4) {
         Utlis.a(var4);
      }

   }

   public final void touchUp(int var1, int var2) {
      try {
         a = System.currentTimeMillis();
         this.l = false;
         if (DataCenter.gI().currentScreen != null) {
            DataCenter.gI().currentScreen.b(var1, var2);
         }
      } catch (Exception var4) {
         Utlis.a(var4);
      }

   }

   public final void resume() {
      super.resume();
      a = System.currentTimeMillis();
   }
}

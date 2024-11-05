package gro;

import java.util.Vector;

public final class vdtt_mc extends vdtt_ap {
   private vdtt_ge a;
   private vdtt_hp[] b;
   private int c = 1005;
   private int d;
   private ArrayServer[] M;

   public vdtt_mc(Server var1, MainScreen var2, int var3) {
      this.H = var2;
      this.a(300, 215);
      var1 = DataCenter.gI().server;
      this.M = new ArrayServer[DataCenter.gI().arrayServer.length + 1];
      this.M[0] = new ArrayServer();
      this.M[0].name = Caption.mS;
      Vector var4 = new Vector();

      int var5;
      String[] var6;
      try {
         var6 = Binary.h("arr_server").split(":");
         Vector var7 = new Vector();

         for(var5 = 0; var5 < DataCenter.gI().arrayServer.length; ++var5) {
            for(int var8 = 0; var8 < DataCenter.gI().arrayServer[var5].server.length; ++var8) {
               Server var9;
               if ((var9 = DataCenter.gI().arrayServer[var5].server[var8]).ipServer.toLowerCase().equals(var6[0].toLowerCase()) && var9.portServer == Integer.parseInt(var6[1])) {
                  Server var17;
                  (var17 = var9.a()).text = var9.text = Caption.AG[0];
                  a(var4, var17);
               } else {
                  for(int var10 = 0; var10 < Caption.AG.length; ++var10) {
                     if (var9.text.toUpperCase().equals(Caption.AG[var10])) {
                        var9 = var9.a();
                        var7.add(var9);
                        break;
                     }
                  }
               }
            }
         }

         if (DataCenter.gI().ah != null) {
            var7.add(DataCenter.gI().ah);
         }

         for(var5 = 0; var5 < var7.size(); ++var5) {
            a(var4, (Server)var7.get(var5));
         }
      } catch (Exception var11) {
      }

      if (DataCenter.gI().server != null) {
         Server var12 = DataCenter.gI().server.a();
         a(var4, var12);
      }

      DataCenter.gI().server = var1;
      this.M[0].server = new Server[var4.size()];

      for(var3 = 0; var3 < var4.size(); ++var3) {
         this.M[0].server[var3] = (Server)var4.get(var3);
      }

      for(var3 = 0; var3 < DataCenter.gI().arrayServer.length; ++var3) {
         ArrayServer var13 = DataCenter.gI().arrayServer[DataCenter.gI().arrayServer.length - 1 - var3];
         this.M[var3 + 1] = new ArrayServer();
         this.M[var3 + 1].name = var13.name;
         this.M[var3 + 1].server = new Server[var13.server.length];

         for(var5 = 0; var5 < var13.server.length; ++var5) {
            this.M[var3 + 1].server[var5] = var13.server[var13.server.length - 1 - var5];
         }
      }

      var6 = new String[this.M.length];

      for(int var14 = 0; var14 < this.M.length; ++var14) {
         var6[var14] = this.M[var14].name;
      }

      vdtt_hm var15;
      (var15 = new vdtt_hm(1001)).c = var6;
      this.a = new vdtt_ge(var15, this.width, 1, this.f() - 3, 87, this.h() + 6, 33, this);
      this.b = new vdtt_hp[this.a.b.c.length];

      for(var5 = 0; var5 < this.M.length; ++var5) {
         vdtt_ge var16;
         this.b[var5] = new vdtt_hp((byte)1, (var16 = this.a).cx + var16.width + 8, this.f() + 10, this.width - 110, 162, 27, this.M[var5].server.length);
      }

      this.w();
   }

   private static void a(Vector var0, Server var1) {
      for(int var2 = 0; var2 < var0.size(); ++var2) {
         if (((Server)var0.get(var2)).ipServer.equals(var1.ipServer) && ((Server)var0.get(var2)).portServer == var1.portServer) {
            return;
         }
      }

      var0.add(var1);
   }

   public final void b(Graphics var1) {
      this.a(var1, this.cx, this.cy, this.width, this.height, Caption.g, (byte)2, this.J);
      boolean var2 = true;
      Graphics var3 = var1;
      vdtt_ge var4 = this.a;
      int var5 = var1.e;
      int var6 = var1.f;
      var4.a(var1, var4.e.cx + var4.cx, var4.e.cy + var4.cy);
      if (!var4.c.a && var4.b.c.length * var4.a.h <= var4.height - 20) {
         var4.a.b(var1, var4.e.cx + var4.cx, var4.e.cy + var4.cy, var4.a.width + 6, var4.a.height);
      } else {
         var4.a.a(var1, var4.e.cx + var4.cx, var4.e.cy + var4.cy, var4.a.width + 6, var4.a.height);
      }

      int var7;
      int var9;
      for(var7 = 0; var7 < var4.b.c.length; ++var7) {
         if (var4.a.b(var7) && !var4.h[var7]) {
            int var8 = var7 * var4.a.h + var4.a.h / 2;
            if (var7 == var4.b.b) {
               var3.c(-7812062);
               var4.a(var3, 2, var7 * var4.a.h + 2, var4.a.width - 4, var4.a.h - 4, 7, 3, 4, 1, 1);
               var3.f();
               var4.a(var3, 2, var7 * var4.a.h + 2, var4.a.width - 4, var4.a.h - 4, 0, 3, 4, 1, 1);
            } else {
               var4.a(var3, 2, var7 * var4.a.h + 2, var4.a.width - 4, var4.a.h - 4, 7, 3, 4, 1, 1);
            }

            var9 = var4.f[var7].length >= 2 ? -5 : 0;

            for(int var10 = 0; var10 < var4.f[var7].length; ++var10) {
               if (var7 == var4.b.b) {
                  vdtt_dd.a((vdtt_dd)vdtt_dd.e, (Graphics)var3, var4.f[var7][var10], var4.a.width / 2, var8 + var9 + var10 * 10 - 1, 2, -2560, 0);
               } else if (var4.a.l == var7) {
                  vdtt_dd.a((vdtt_dd)vdtt_dd.e, (Graphics)var3, var4.f[var7][var10], var4.a.width / 2 + 1, var8 + var9 + var10 * 10 - 1 + 1, 2, -2560, 0);
               } else {
                  vdtt_dd.a((vdtt_dd)vdtt_dd.e, (Graphics)var3, var4.f[var7][var10], var4.a.width / 2, var8 + var9 + var10 * 10 - 1, 2, -1, 0);
               }
            }

            if (var4.g[var7]) {
               vdtt_cz.a(var3, 713, 0, var4.c.a(var7) - 8, var8 - 4, 0);
            }
         }
      }

      if (var4.c.a || var4.b.c.length * var4.a.h > var4.height - 20) {
         var4.a(var3, 0, 0);
         var3.d(0, 0, DataCenter.gI().n, DataCenter.gI().o);
      }

      var4.a(var3, var5, var6);
      this.a.a(var1, this.cx, this.cy);
      this.a(var1, this.b[this.a.b.b]);

      for(var7 = 0; var7 < this.b[this.a.b.b].i; ++var7) {
         if (var7 == this.b[this.a.b.b].k) {
            var1.c(-48128);
         }

         this.a(var1, 0, var7 * this.b[this.a.b.b].h, this.b[this.a.b.b].width, this.b[this.a.b.b].h - 1, 46, 22, 23, 1, 1);
         if (var7 == this.b[this.a.b.b].k) {
            var1.f();
         }

         String var11 = this.M[this.a.b.b].server[var7].b();
         if (var7 == this.b[this.a.b.b].l) {
            vdtt_dd.a(vdtt_dd.d, var1, var11, 16, 1 + var7 * this.b[this.a.b.b].h + this.b[this.a.b.b].h / 2, 0, -1);
         } else {
            vdtt_dd.a(vdtt_dd.d, var1, var11, 15, var7 * this.b[this.a.b.b].h + this.b[this.a.b.b].h / 2, 0, -1);
         }

         for(var9 = 0; var9 < Caption.AG.length; ++var9) {
            if (this.M[this.a.b.b].server[var7].text.toUpperCase().equals(Caption.AG[var9])) {
               var5 = -1;
               switch(var9) {
               case 0:
                  var5 = -16711681;
                  break;
               case 1:
                  var5 = -2560;
                  break;
               case 2:
                  var5 = -3407617;
               }

               vdtt_dd.c(vdtt_dd.d, var1, this.M[this.a.b.b].server[var7].text, this.b[this.a.b.b].width - 10, var7 * this.b[this.a.b.b].h + this.b[this.a.b.b].h / 2, 1, var5, -10275328);
               break;
            }
         }
      }

      this.a(var1);
   }

   public final void a_() {
      vdtt_ge var1;
      (var1 = this.a).a.a();
      var1.c.a();
      this.b[this.a.b.b].a();
      if (this.d > 0) {
         --this.d;
         if (this.d == 0) {
            this.k();

            for(int var2 = 0; var2 < DataCenter.gI().arrayServer.length; ++var2) {
               for(int var3 = 0; var3 < DataCenter.gI().arrayServer[var2].server.length; ++var3) {
                  DataCenter.gI().arrayServer[var2].server[var3].text = "";
               }
            }

            Server var4 = this.M[this.a.b.b].server[this.c];
            this.H.a(1005, var4, this);
         }
      }

   }

   public final Vector g() {
      Vector var1;
      vdtt_ge var2;
      (var1 = super.g()).addElement((var2 = this.a).a.a(var2.b.a, var2.cx, var2.cy, var2.e));
      var1.addElement(this.b[this.a.b.b].a(1002, this));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (this.d <= 0) {
         super.a(var1, var2, var3);
         switch(var1.b) {
         case 1001:
            if (var1.j.k >= 0) {
               vdtt_ge var4 = this.a;
               var2 = var1.j.k;
               vdtt_ge var5 = var4;
               if (!var4.h[var2]) {
                  var4.b.b = var2;

                  for(var2 = 0; var2 < var5.d.length; ++var2) {
                     for(var3 = 0; var3 < var5.d[var2].size(); ++var3) {
                        var5.e.f.removeElement(var5.d[var2].elementAt(var3));
                     }
                  }

                  for(var2 = 0; var2 < var5.d[var5.b.b].size(); ++var2) {
                     var5.e.f.addElement(var5.d[var5.b.b].elementAt(var2));
                  }

                  for(var2 = 0; var2 < var5.e.f.size(); ++var2) {
                     if (var5.e.f.get(var2) instanceof vdtt_al) {
                        var5.e.f.remove(var2);
                        break;
                     }
                  }
               }

               this.w();
               return;
            }
            break;
         case 1002:
            if (var1.j.k >= 0) {
               this.d = 4;
               this.c = var1.j.k;
            }
         }
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   private void w() {
      (new Thread(new vdtt_md(this))).start();
   }

   static ArrayServer[] a(vdtt_mc var0) {
      return var0.M;
   }

   static vdtt_ge b(vdtt_mc var0) {
      return var0.a;
   }
}

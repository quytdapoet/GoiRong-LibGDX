package gro;

import java.util.Vector;

public final class vdtt_in extends EntityPanel {
   public vdtt_hp a;
   public vdtt_hm b;
   private vdtt_gd h;
   private Vector[] i;
   private vdtt_w j;
   private short k = 21;
   public int c;
   public boolean[] d;
   public boolean[] e;
   public boolean f;
   public vdtt_in g;
   private vdtt_ap l;

   public vdtt_in(vdtt_hm var1, vdtt_ap var2) {
      this.l = var2;
      this.a(var1, 10, var2.f() + 6, var2.width - 8 - 12, 23, 33, var2, false);
      this.c = var2.h() - 12;
   }

   public vdtt_in(vdtt_hm var1, int var2, int var3, int var4, int var5, int var6, vdtt_w var7) {
      this.a(var1, var2, var3, var4, 23, var6, var7, false);
   }

   public final void a() {
      int var1 = this.h();
      Vector var2 = new Vector();

      for(int var3 = 0; var3 < this.e.length; ++var3) {
         if (!this.e[var3]) {
            var2.add(this.b.c[var3]);
         }
      }

      String[] var5 = new String[var2.size()];

      for(int var4 = 0; var4 < var5.length; ++var4) {
         var5[var4] = (String)var2.get(var4);
      }

      this.g = new vdtt_in(new vdtt_hm(this.b.a, var5), this.l);
      this.g.a(var1);
   }

   public final void b() {
      if (this.g != null) {
         Vector var1 = new Vector();

         int var2;
         for(var2 = 0; var2 < this.e.length; ++var2) {
            if (!this.e[var2]) {
               var1.add(this.d[var2]);
            }
         }

         this.g.d = new boolean[var1.size()];

         for(var2 = 0; var2 < this.g.d.length; ++var2) {
            this.g.d[var2] = (Boolean)var1.get(var2);
         }
      }

   }

   private void a(vdtt_hm var1, int var2, int var3, int var4, int var5, int var6, vdtt_w var7, boolean var8) {
      var6 = var4 / var1.c.length;
      this.setXY(var2, var3);
      this.setSize(var4, var5);
      this.j = var7;
      this.b = var1;
      this.a = new vdtt_hp((byte)0, 0, 2, var4, var5 - 3, var6, var1.c.length);
      byte var9 = -1;
      this.a.H = var9;
      this.h = new vdtt_gd(0, 0, 0, 2, (byte)7, var1.c.length);
      this.i = new Vector[var1.c.length];

      for(var2 = 0; var2 < this.i.length; ++var2) {
         this.i[var2] = new Vector();
      }

      this.d = new boolean[var1.c.length];
      this.e = new boolean[var1.c.length];
   }

   public final void c() {
      for(int var1 = 0; var1 < this.i.length; ++var1) {
         for(int var2 = 0; var2 < this.i[var1].size(); ++var2) {
            this.j.f.removeElement(this.i[var1].elementAt(var2));
         }
      }

   }

   public final void d() {
      this.h = new vdtt_gd(0, 0, 0, 0, (byte)7, this.b.c.length);
   }

   public final void e() {
      this.a.a();
      this.h.a();
      if (this.g != null) {
         this.g.e();
      }
   }

   public final vdtt_hi f() {
      if (this.g != null) {
         return this.g.f();
      } else {
         return this.f ? this.a.a(this.b.a, -10000, -10000, this.j) : this.a.a(this.b.a, this.cx, this.cy, this.j);
      }
   }

   public final int g() {
      return this.g != null ? this.g.b.b : this.b.b;
   }

   public final int h() {
      try {
         return this.b.b;
      } catch (Exception var2) {
         return 0;
      }
   }

   public final void a(int var1) {
      if (this.g != null) {
         this.g.b.b = var1;
         String var2 = this.g.b.c[this.g.h()];

         for(int var3 = 0; var3 < this.b.c.length; ++var3) {
            if (var2.equals(this.b.c[var3])) {
               this.b(var3);
               return;
            }
         }
      } else {
         this.b(var1);
      }

   }

   private void b(int var1) {
      if (var1 < 0 || var1 >= this.e.length || !this.e[var1]) {
         this.b.b = var1;

         for(var1 = 0; var1 < this.i.length; ++var1) {
            for(int var2 = 0; var2 < this.i[var1].size(); ++var2) {
               this.j.f.removeElement(this.i[var1].elementAt(var2));
            }
         }

         for(var1 = 0; var1 < this.i[this.b.b].size(); ++var1) {
            this.j.f.addElement(this.i[this.b.b].elementAt(var1));
         }

         for(var1 = 0; var1 < this.j.f.size(); ++var1) {
            if (this.j.f.get(var1) instanceof vdtt_al) {
               this.j.f.remove(var1);
               return;
            }
         }
      }

   }

   public final void a(Graphics var1) {
      if (this.g != null) {
         this.g.a(var1);
      } else {
         boolean var2 = false;
         Graphics var3 = var1;
         vdtt_in var4 = this;
         if (!this.f) {
            int var5 = var1.e;
            int var6 = var1.f;
            this.a(var1, this.j.cx + this.cx, this.j.cy + this.cy);
            vdtt_cz.b(var1, 87, 88, 0, -1, this.width, 29);
            if (this.a.i < 2) {
               vdtt_cz.b(var1, 47, 48, 0, -1, this.width, 29);
            } else if (this.h() == 0) {
               vdtt_cz.c(var1, 47, 48, this.h() * this.a.h, -1, this.a.h, 29);
            } else if (this.h() == this.a.i - 1) {
               vdtt_cz.e(var1, 47, 48, this.h() * this.a.h, -1, this.width - this.h() * this.a.h, 29);
            } else {
               vdtt_cz.d(var1, 47, 48, this.h() * this.a.h, -1, this.a.h, 29);
            }

            this.a.b(var1, this.j.cx + this.cx, this.j.cy + this.cy, this.a.width, this.a.height);

            for(int var7 = 0; var7 < var4.a.i; ++var7) {
               if (var4.a.b(var7) && (var7 < 0 || var7 >= var4.e.length || !var4.e[var7])) {
                  String var8 = var4.b.c[var7];
                  byte var9 = 0;
                  if (var7 == 0) {
                     var9 = 2;
                  }

                  if (var7 == var4.a.i - 1) {
                     var9 = -2;
                  }

                  if (var7 == var4.h()) {
                     vdtt_dd.b(vdtt_dd.e, var3, var8, var9 + var7 * var4.a.h + var4.a.h / 2 - 1, 11 + var4.h.b(var7) - 2, 2, -2560, -11184811);
                  } else if (var7 == var4.a.l) {
                     vdtt_dd.b(vdtt_dd.e, var3, var8, var9 + var7 * var4.a.h + var4.a.h / 2, 12 + var4.h.b(var7) - 2, 2, -1, -11184811);
                  } else {
                     vdtt_dd.b(vdtt_dd.e, var3, var8, var9 + var7 * var4.a.h + var4.a.h / 2 - 1, 11 + var4.h.b(var7) - 2, 2, -1, -11184811);
                  }

                  if (var4.d[var7]) {
                     vdtt_cz.a(var3, 713, 0, var9 + var7 * var4.a.h + var4.a.h / 2 - 2, 11 + var4.h.b(var7) + 5, 0);
                  }

                  if (var4.j instanceof vdtt_ka && var4.b.d != null && var4.b.d[var7] > 0) {
                     int var10 = vdtt_dd.b(vdtt_dd.e, var8);
                     vdtt_cz.a(var3, 713, 0, var9 + var7 * var4.a.h + var4.a.h / 2 - 2 + var10 / 2, 5 + var4.h.b(var7) - 2, 0);
                  }
               }
            }

            if (var4.h.a || var4.b.c.length * var4.a.h > var4.width - 4) {
               var4.a(var3, 0, 0);
               var3.d(0, 0, DataCenter.gI().n, DataCenter.gI().o);
            }

            var4.a(var3, var5, var6);
         }

      }
   }

   public final void a(vdtt_k var1, int var2) {
      this.i[var2].addElement(var1);
   }

   public final void a(Vector var1) {
      for(int var2 = 0; var2 < this.i.length; ++var2) {
         for(int var3 = 0; var3 < this.i[var2].size(); ++var3) {
            var1.addElement(this.i[var2].elementAt(var3));
         }
      }

   }

   public final int i() {
      return this.cy + this.height;
   }

   public final int j() {
      return this.b.c.length;
   }
}

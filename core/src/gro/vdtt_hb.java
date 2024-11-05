package gro;

import java.util.Vector;

public final class vdtt_hb {
   public short[] a;
   public short[] b;
   public int c = 0;

   public final vdtt_hb a(int var1) {
      vdtt_hb var2;
      (var2 = new vdtt_hb()).a = this.a;
      var2.b = this.b;
      var2.c = var1;
      return var2;
   }

   public final void a(Vector var1, boolean var2) {
      try {
         for(int var3 = this.a.length - 1; var3 >= 0; --var3) {
            short var4 = this.a[var3];
            vdtt_gz var5 = DataCenter.gI().y[var4].a();
            if (!var2 || (var5.c < 325 || var5.c > 330) && (var5.c < 335 || var5.c > 337)) {
               var5.f = this.c;
               var1.add(var5);
            }
         }
      } catch (Exception var6) {
      }

   }

   public final void a(Vector var1, int var2) {
      try {
         if (this.b.length > 0 && var2 != 2) {
            short var3 = this.b[var2 - 1];
            vdtt_gz var4 = DataCenter.gI().y[var3].a();

            for(int var5 = 0; var5 < var1.size(); ++var5) {
               if (((vdtt_gz)var1.get(var5)).c == var4.c) {
                  return;
               }
            }

            var1.add(var4);
         }
      } catch (Exception var6) {
      }

   }

   public final void a() {
      try {
         Vector var1 = new Vector();

         int var2;
         for(var2 = this.a.length - 1; var2 >= 0; --var2) {
            short var3 = this.a[var2];
            vdtt_gz var4;
            short var5;
            if ((var5 = (var4 = DataCenter.gI().y[var3]).h[0].a) == 0) {
               var5 = var4.h[30].a;
            }

            if (var4.h != null && var4.h.length > 0 && DataCenter.aR.contains(var5)) {
               var1.add(this.a[var2]);
            }
         }

         this.a = new short[var1.size()];

         for(var2 = 0; var2 < var1.size(); ++var2) {
            this.a[var2] = (Short)var1.get(var2);
         }
      } catch (Exception var6) {
      }

   }

   public final void b() {
      try {
         Vector var1 = new Vector();

         int var2;
         for(var2 = this.a.length - 1; var2 >= 0; --var2) {
            short var3 = this.a[var2];
            vdtt_gz var4;
            short var5;
            if ((var5 = (var4 = DataCenter.gI().y[var3]).h[0].a) == 0) {
               var5 = var4.h[30].a;
            }

            if (var4.d != 1 && var4.d != 7 || var4.h != null && var4.h.length > 0 && DataCenter.aR.contains(var5)) {
               var1.add(this.a[var2]);
            }
         }

         this.a = new short[var1.size()];

         for(var2 = 0; var2 < var1.size(); ++var2) {
            this.a[var2] = (Short)var1.get(var2);
         }
      } catch (Exception var6) {
      }

   }

   public final void c() {
      try {
         Vector var1 = new Vector();

         int var2;
         for(var2 = this.a.length - 1; var2 >= 0; --var2) {
            short var3 = this.a[var2];
            vdtt_gz var4;
            if ((var4 = DataCenter.gI().y[var3]).d != 1 && var4.d != 7) {
               var1.add(this.a[var2]);
            }
         }

         this.a = new short[var1.size()];

         for(var2 = 0; var2 < var1.size(); ++var2) {
            this.a[var2] = (Short)var1.get(var2);
         }
      } catch (Exception var5) {
      }

   }

   public final void d() {
      try {
         Vector var1 = new Vector();

         int var2;
         for(var2 = this.a.length - 1; var2 >= 0; --var2) {
            short var3 = this.a[var2];
            vdtt_gz var4;
            if ((var4 = DataCenter.gI().y[var3]).d != 1 && var4.d != 7 || var4.e == 12) {
               var1.add(this.a[var2]);
            }
         }

         this.a = new short[var1.size()];

         for(var2 = 0; var2 < var1.size(); ++var2) {
            this.a[var2] = (Short)var1.get(var2);
         }
      } catch (Exception var5) {
      }

   }

   public final void e() {
      try {
         Vector var1 = new Vector();

         int var2;
         for(var2 = this.a.length - 1; var2 >= 0; --var2) {
            short var3 = this.a[var2];
            vdtt_gz var4;
            if (((var4 = DataCenter.gI().y[var3]).c < 325 || var4.c > 330) && (var4.c < 335 || var4.c > 337) && var4.d != 8) {
               var1.add(this.a[var2]);
            }
         }

         this.a = new short[var1.size()];

         for(var2 = 0; var2 < var1.size(); ++var2) {
            this.a[var2] = (Short)var1.get(var2);
         }
      } catch (Exception var5) {
      }

   }

   public final boolean f() {
      try {
         new Vector();

         for(int var1 = this.a.length - 1; var1 >= 0; --var1) {
            short var10001 = this.a[var1];
            vdtt_gz var2 = DataCenter.gI().y[var10001];
            if (var2.d == 1 || var2.d == 7) {
               return true;
            }
         }
      } catch (Exception var3) {
      }

      return false;
   }

   public final void g() {
      try {
         Vector var1 = new Vector();

         int var2;
         for(var2 = this.a.length - 1; var2 >= 0; --var2) {
            short var3 = this.a[var2];
            vdtt_gz var4;
            if ((var4 = DataCenter.gI().y[var3]).d == 1 || var4.d == 7) {
               var1.add(this.a[var2]);
            }
         }

         this.a = new short[var1.size()];

         for(var2 = 0; var2 < var1.size(); ++var2) {
            this.a[var2] = (Short)var1.get(var2);
         }
      } catch (Exception var5) {
      }

   }

   public final void a(Char var1) {
      try {
         Vector var2 = new Vector();

         int var3;
         for(var3 = this.a.length - 1; var3 >= 0; --var3) {
            short var4 = this.a[var3];
            vdtt_gz var5;
            if ((var5 = DataCenter.gI().y[var4]).d == 1 || var5.d == 7) {
               var2.add(this.a[var3]);
            }
         }

         if (var2.size() != 0) {
            this.a = new short[var2.size()];

            for(var3 = 0; var3 < var2.size(); ++var3) {
               this.a[var3] = (Short)var2.get(var3);
            }

            return;
         }

         this.a = new short[]{vdtt_ha.a(7, var1.sys, false)};
      } catch (Exception var6) {
      }

   }

   public final void h() {
      try {
         Vector var1 = new Vector();

         int var2;
         for(var2 = this.a.length - 1; var2 >= 0; --var2) {
            short var3 = this.a[var2];
            if (DataCenter.gI().y[var3].d == 1) {
               var1.add(this.a[var2]);
            }
         }

         var1.add((short)238);
         var1.add((short)239);
         var1.add((short)241);
         var1.add((short)242);
         this.a = new short[var1.size()];

         for(var2 = 0; var2 < var1.size(); ++var2) {
            this.a[var2] = (Short)var1.get(var2);
         }
      } catch (Exception var4) {
      }

   }
}

package gro;

import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Blending;
import com.badlogic.gdx.graphics.Pixmap.Format;
import com.badlogic.gdx.graphics.Texture;

public final class mImage {
   public Texture a;
   public Pixmap b;
   public int c;
   public int d;
   public long e;

   public static mImage a(mImage var0, int var1, int var2, int var3, int var4, int var5) {
      try {
         mImage var6;
         (var6 = new mImage()).b = new Pixmap(var3, var4, Format.RGBA8888);
         var6.h();
         vdtt_y.a(var6.b, var0, 0, 0, 0, 0, var3, var4, Blending.None);
         return var6;
      } catch (Exception var7) {
         Utlis.a(var7);
         return null;
      }
   }

   public static mImage a(byte[] var0, int var1, int var2) {
      try {
         mImage var3;
         (var3 = new mImage()).b = new Pixmap(var0, 0, var0.length);
         var3.h();
         return var3;
      } catch (Exception var4) {
         Utlis.a(var4);
         return null;
      }
   }

   public static mImage a(int var0, int var1) {
      try {
         mImage var2;
         (var2 = new mImage()).b = new Pixmap(var0, var1, Format.RGBA8888);
         var2.h();
         return var2;
      } catch (Exception var3) {
         Utlis.a(var3);
         return null;
      }
   }

   public final void a() {
      try {
         if (!this.equals(vdtt_cz.a)) {
            if (this.b != null) {
               this.b.dispose();
               this.b = null;
            }

            if (this.a != null) {
               Canvas.vTexture.addElement(this.a);
               this.a = null;
            }
         }
      } catch (Exception var2) {
      }

   }

   private void h() {
      this.c = this.b.getWidth();
      this.d = this.b.getHeight();
   }

   public final Texture b() {
      try {
         if (this.a == null) {
            this.a = new Texture(this.b);
            Canvas.vImage.add(this);
         }

         this.e = System.currentTimeMillis();
         return this.a;
      } catch (Exception var2) {
         return null;
      }
   }

   public final void c() {
      try {
         if (!this.equals(vdtt_cz.a) && this.b != null) {
            if (this.a == null) {
               this.a = new Texture(this.b);
            }

            this.b.dispose();
            this.b = null;
         }
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   public final boolean d() {
      if (this.equals(vdtt_cz.a)) {
         return false;
      } else if (this.b == null) {
         return false;
      } else {
         try {
            this.a.dispose();
         } catch (Exception var2) {
         }

         this.a = null;
         return true;
      }
   }

   public final Pixmap e() {
      return this.b;
   }

   public final int f() {
      return this.c;
   }

   public final int g() {
      return this.d;
   }

   public static mImage b(mImage var0, int var1, int var2, int var3, int var4, int var5) {
      var1 = 0;
      var2 = 0;
      mImage var6 = null;
      if (var5 == 0) {
         vdtt_y.a((var6 = a(var3, var4)).b, var0, 0, 0, 0, 0, var3, var4, Blending.None);
         return var6;
      } else {
         int var7;
         if (var5 == -360) {
            var6 = a(var3, var4);

            for(var5 = 0; var5 < var4; ++var5) {
               for(var7 = var3 - 1; var7 >= 0; --var7) {
                  vdtt_y.a(var6, var1, var2, var0.b.getPixel(0 + var7, 0 + var5));
                  ++var1;
               }

               var1 = 0;
               ++var2;
            }
         } else if (var5 == -180) {
            var6 = a(var3, var4);

            for(var5 = 0; var5 < var4; ++var5) {
               for(var7 = 0; var7 < var3; ++var7) {
                  vdtt_y.a(var6, var1, var2, var0.b.getPixel(0 + var7, 0 + var4 - 1 - var5));
                  ++var1;
               }

               var1 = 0;
               ++var2;
            }
         } else if (var5 == 180) {
            var6 = a(var3, var4);

            for(var5 = 0; var5 < var4; ++var5) {
               for(var7 = 0; var7 < var3; ++var7) {
                  vdtt_y.a(var6, var1, var2, var0.b.getPixel(0 + var3 - 1 - var7, 0 + var4 - 1 - var5));
                  ++var1;
               }

               var1 = 0;
               ++var2;
            }
         } else if (var5 == 270) {
            var6 = a(var4, var3);

            for(var5 = 0; var5 < var3; ++var5) {
               for(var7 = 0; var7 < var4; ++var7) {
                  vdtt_y.a(var6, var1, var2, var0.b.getPixel(0 + var3 - 1 - var5, 0 + var7));
                  ++var1;
               }

               var1 = 0;
               ++var2;
            }
         } else if (var5 == -270) {
            var6 = a(var4, var3);

            for(var5 = 0; var5 < var3; ++var5) {
               for(var7 = 0; var7 < var4; ++var7) {
                  vdtt_y.a(var6, var1, var2, var0.b.getPixel(0 + var3 - 1 - var5, 0 + var4 - 1 - var7));
                  ++var1;
               }

               var1 = 0;
               ++var2;
            }
         } else if (var5 == 90) {
            var6 = a(var4, var3);

            for(var5 = 0; var5 < var3; ++var5) {
               for(var7 = 0; var7 < var4; ++var7) {
                  vdtt_y.a(var6, var1, var2, var0.b.getPixel(0 + var5, 0 + var4 - 1 - var7));
                  ++var1;
               }

               var1 = 0;
               ++var2;
            }
         } else if (var5 == -270) {
            var6 = a(var4, var3);

            for(var5 = 0; var5 < var3; ++var5) {
               for(var7 = 0; var7 < var4; ++var7) {
                  vdtt_y.a(var6, var1, var2, var0.b.getPixel(0 + var5, 0 + var4 - 1 - var7));
                  ++var1;
               }

               var1 = 0;
               ++var2;
            }
         } else if (var5 == -90) {
            var6 = a(var4, var3);

            for(var5 = 0; var5 < var3; ++var5) {
               for(var7 = 0; var7 < var4; ++var7) {
                  vdtt_y.a(var6, var1, var2, var0.b.getPixel(0 + var5, 0 + var7));
                  ++var1;
               }

               var1 = 0;
               ++var2;
            }
         }

         return var6;
      }
   }
}

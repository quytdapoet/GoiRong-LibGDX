package gro;

import java.util.Vector;

public final class vdtt_gd extends XYEntity {
   public boolean a;
   public Vector b = new Vector();
   private int c;
   private int d;
   private int e;
   private int f;
   private int g;
   private int h = 5;
   private int i;

   public vdtt_gd(int var1, int var2, int var3, int var4, byte var5, int var6) {
      for(var1 = 0; var1 < var6; ++var1) {
         this.b.addElement(new EntityPanel());
      }

      this.setXY(0, 0);
      this.g = var3;
      this.e = var5;
      this.c = var4;
      this.b();
   }

   private void b() {
      this.d = 0;
      this.f = 0;
      this.a = true;
      this.i = 0;

      for(int var1 = 0; var1 < this.b.size(); ++var1) {
         EntityPanel var2 = (EntityPanel)this.b.elementAt(var1);
         switch(this.e) {
         case 0:
            var2.setXY(this.cx - this.g, this.cy + var1 * (var2.height + this.h));
            break;
         case 1:
            var2.setXY(this.cx + this.g, this.cy + var1 * (var2.height + this.h));
            break;
         case 2:
         case 4:
            var2.setXY(this.cx - this.g, this.cy);
            break;
         case 3:
         case 5:
            var2.setXY(this.cx + this.g, this.cy);
         case 6:
         default:
            break;
         case 7:
            var2.setXY(this.cx + var1 * (var2.width + this.h), this.cy - this.g);
            break;
         case 8:
            var2.setXY(this.cx + var1 * (var2.width + this.h), this.cy + this.g);
         }
      }

   }

   public final int a(int var1) {
      return ((EntityPanel)this.b.elementAt(var1)).cx;
   }

   public final int b(int var1) {
      return ((EntityPanel)this.b.elementAt(var1)).cy;
   }

   public final void a() {
      if (this.a) {
         this.d += this.c;
         ++this.i;
         EntityPanel var1;
         if (this.i > 100) {
            for(int var2 = 0; var2 < this.b.size(); ++var2) {
               (var1 = (EntityPanel)this.b.elementAt(var2)).cx = this.cx;
               var1.cy = this.cy;
            }

            this.d = 0;
            this.f = this.b.size();
            this.a = false;
         }

         int var3;
         EntityPanel var4;
         EntityPanel var5;
         switch(this.e) {
         case 0:
            var5 = var1 = (EntityPanel)this.b.elementAt(this.f);
            var5.cx = (short)(var5.cx + this.d);
            if (var1.cx >= this.cx) {
               var1.cx = this.cx;
               this.d = 0;
               ++this.f;
               if (this.f >= this.b.size()) {
                  this.a = false;
               }
            }

            return;
         case 1:
            var5 = var1 = (EntityPanel)this.b.elementAt(this.f);
            var5.cx = (short)(var5.cx - this.d);
            if (var1.cx <= this.cx) {
               var1.cx = this.cx;
               this.d = 0;
               ++this.f;
               if (this.f >= this.b.size()) {
                  this.a = false;
               }
            }

            return;
         case 2:
         case 5:
            var1 = (EntityPanel)this.b.elementAt(this.f);
            var3 = this.cx;
            if (this.f > 0) {
               var3 = (var4 = (EntityPanel)this.b.elementAt(this.f - 1)).cx - var4.width - this.h;
            }

            var1.cx = (short)(var1.cx + this.d);
            if (var1.cx >= var3) {
               var1.cx = (short)var3;
               this.d = 0;
               ++this.f;
               if (this.f >= this.b.size()) {
                  this.a = false;
               }
            }

            return;
         case 3:
         case 4:
            var1 = (EntityPanel)this.b.elementAt(this.f);
            var3 = this.cx;
            if (this.f > 0) {
               var3 = (var4 = (EntityPanel)this.b.elementAt(this.f - 1)).cx + var4.width + this.h;
            }

            var1.cx = (short)(var1.cx - this.d);
            if (var1.cx <= var3) {
               var1.cx = (short)var3;
               this.d = 0;
               ++this.f;
               if (this.f >= this.b.size()) {
                  this.a = false;
               }
            }

            return;
         case 6:
         default:
            break;
         case 7:
            var5 = var1 = (EntityPanel)this.b.elementAt(this.f);
            var5.cy = (short)(var5.cy + this.d);
            if (var1.cy >= this.cy) {
               var1.cy = this.cy;
               this.d = 0;
               ++this.f;
               if (this.f >= this.b.size()) {
                  this.a = false;
               }
            }

            return;
         case 8:
            var5 = var1 = (EntityPanel)this.b.elementAt(this.f);
            var5.cy = (short)(var5.cy - this.d);
            if (var1.cy <= this.cy) {
               var1.cy = this.cy;
               this.d = 0;
               ++this.f;
               if (this.f >= this.b.size()) {
                  this.a = false;
               }
            }
         }
      }

   }
}

package gro;

public final class vdtt_ih {
   private EntityPanel c;
   private byte d;
   private byte e;
   private int f;
   private int g;
   private int h;
   private int i;
   public boolean a;
   public int b;

   public vdtt_ih(EntityPanel var1, byte var2, int var3) {
      this.c = var1;
      this.d = var2;
      this.f = this.g = var3;
   }

   public vdtt_ih(EntityPanel var1, byte var2, int var3, int var4) {
      this.c = var1;
      this.d = var2;
      this.f = var3;
      this.g = var4;
   }

   public final boolean a() {
      if (this.b > 0) {
         --this.b;
         if (this.b == 0) {
            this.e = 0;
            return true;
         }
      }

      EntityPanel var1;
      switch(this.d) {
      case 0:
         if (this.c.cx != this.f) {
            this.h = this.f - this.c.cx << 2;
            this.i += this.h;
            var1 = this.c;
            var1.cx = (short)(var1.cx + (this.i >> 4));
            this.i &= 15;
            this.e = 1;
            if (DataCenter.k()) {
               this.c.cx = (short)this.f;
            }
         } else if (this.g != 0 && this.g != this.f) {
            this.f = this.g;
         } else if (this.e > 0) {
            this.e = 2;
         }
         break;
      case 1:
         if (this.c.cy != this.f) {
            this.h = this.f - this.c.cy << 2;
            this.i += this.h;
            var1 = this.c;
            var1.cy = (short)(var1.cy + (this.i >> 4));
            this.i &= 15;
            this.e = 1;
            if (DataCenter.k()) {
               this.c.cy = (short)this.f;
            }
         } else if (this.g != 0 && this.g != this.f) {
            this.f = this.g;
         } else if (this.e > 0) {
            this.e = 2;
         }
         break;
      case 2:
         if (this.c.width != this.f) {
            this.h = this.f - this.c.width << 2;
            this.i += this.h;
            var1 = this.c;
            var1.width = (short)(var1.width + (this.i >> 4));
            this.i &= 15;
            this.e = 1;
            if (DataCenter.k()) {
               this.c.width = (short)this.f;
            }
         } else if (this.e > 0) {
            this.e = 2;
         }
         break;
      case 3:
         if (this.c.height != this.f) {
            this.h = this.f - this.c.height << 2;
            this.i += this.h;
            var1 = this.c;
            var1.height = (short)(var1.height + (this.i >> 4));
            this.i &= 15;
            this.e = 1;
            if (DataCenter.k()) {
               this.c.height = (short)this.f;
            }
         } else if (this.e > 0) {
            this.e = 2;
         }
      }

      if (this.e == 2) {
         this.e = 0;
         return true;
      } else {
         return false;
      }
   }

   public final void a(int var1) {
      this.h = this.i = 0;
      this.e = 0;
      this.f = this.g = var1;
   }

   public final boolean b() {
      switch(this.d) {
      case 0:
         if (this.c.cx != this.f) {
            return true;
         }
         break;
      case 1:
         if (this.c.cy != this.f) {
            return true;
         }
         break;
      case 2:
         if (this.c.width != this.f) {
            return true;
         }
         break;
      case 3:
         if (this.c.height != this.f) {
            return true;
         }
      }

      return this.e == 1;
   }
}

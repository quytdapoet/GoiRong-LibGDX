package gro;

public final class vdtt_dj {
   public vdtt_hi[] a;
   public short b = -1;
   public int c;
   public int d;
   public XYEntity e;
   public XYEntity f;
   private int g = 5;

   public final short a(int var1, int var2) {
      this.b = -1;
      this.c = var1;
      this.d = var2;

      for(short var3 = 0; var3 < this.a.length; ++var3) {
         if (this.a[var3] != null) {
            if (Utlis.a(this.a[var3].c, this.a[var3].d, this.a[var3].e, this.a[var3].f, var1, var2)) {
               this.b = var3;
               this.a[var3].i = Utlis.a();
               if (this.a[var3].j != null) {
                  if (this.a[var3].c() == this.a[var3].j.width && this.a[var3].d() == this.a[var3].j.height) {
                     this.a[var3].j.a(var1 - this.a[var3].c, var2 - this.a[var3].d);
                     this.a[var3].j.o = false;
                  } else {
                     this.a[var3].j.a(var1 - (this.a[var3].c - this.a[var3].g), var2 - (this.a[var3].d - this.a[var3].h));
                     this.a[var3].j.o = true;
                  }
               }
               break;
            }

            this.a[var3].i = 0L;
         }
      }

      return this.b;
   }

   public final vdtt_hi b(int var1, int var2) {
      vdtt_hi var3 = null;

      try {
         if (this.a[this.b] != null) {
            if (this.a[this.b].j != null) {
               if (this.a[this.b].c() == this.a[this.b].j.width && this.a[this.b].d() == this.a[this.b].j.height) {
                  this.a[this.b].j.c(var1 - this.a[this.b].c, var2 - this.a[this.b].d);
               } else {
                  this.a[this.b].j.c(var1 - (this.a[this.b].c - this.a[this.b].g), var2 - (this.a[this.b].d - this.a[this.b].h));
               }
            }

            if (Utlis.a(this.a[this.b].c, this.a[this.b].d, this.a[this.b].e, this.a[this.b].f, var1, var2)) {
               var3 = this.a[this.b];
            }

            this.a[this.b].i = 0L;
         }

         this.b = -1;
      } catch (Exception var5) {
      }

      return var3;
   }

   public final vdtt_hi c(int var1, int var2) {
      vdtt_hi var3 = null;

      try {
         if (this.a[this.b] != null && (Utlis.b(var1 - this.c) >= this.g || Utlis.b(var2 - this.d) >= this.g)) {
            var3 = this.a[this.b];
            if (this.a[this.b].j != null) {
               this.a[this.b].j.b(var1 - this.c, var2 - this.d);
            }
         }
      } catch (Exception var5) {
      }

      return var3;
   }

   public final void a(vdtt_hp var1, int var2, int var3) {
      try {
         if (var1 == null) {
            if (this.a[this.b] != null && this.a[this.b].j != null) {
               this.a[this.b].j.b(var2 - this.c, var3 - this.d);
            }

            return;
         }

         var1.b(var2 - this.c, var3 - this.d);
      } catch (Exception var5) {
      }

   }

   public final boolean a(int var1) {
      return this.b == var1 && Utlis.a() - this.a[var1].i >= 100L;
   }
}

package gro;

public final class vdtt_ma extends EntityPanel {
   int a = 16;
   int b = 16;
   int c = 16;
   int d = 16;

   public final void a(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      var1.a(this.cx, this.cy);
      vdtt_y.a(var1, -30, 0, this.c, this.d, this.width - this.c * 2, (int)(this.height - this.d * 2));
      vdtt_y.a(var1, 108, 0, this.a, 0, this.width - this.a * 2, (int)this.b);
      vdtt_y.a(var1, 108, 180, this.a, this.height - this.b, this.width - this.a * 2, (int)this.b);
      vdtt_y.a(var1, 108, -90, 0, this.a, this.b, (int)(this.height - this.a * 2));
      vdtt_y.a(var1, 108, 90, this.width - this.b, this.a, this.b, (int)(this.height - this.a * 2));
      vdtt_cz.a(var1, 106, 0, 0, 0, 20);
      vdtt_cz.a(var1, 107, -90, this.width, 0, 24);
      vdtt_cz.a(var1, 107, 0, 0, this.height, 36);
      vdtt_cz.a(var1, 106, 180, this.width, this.height, 40);
      this.a(var1, var2, var3);
   }
}

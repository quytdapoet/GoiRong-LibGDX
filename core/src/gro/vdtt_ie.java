package gro;

public final class vdtt_ie {
   public Char a;
   public Entity b;
   public Skill c;

   public final boolean a() {
      Char var1;
      if (Utlis.b(this.a.cx, this.a.cy, this.b.cx, this.b.cy) <= 50) {
         this.a.j();
         this.a.status = 3;
         this.a.setDir(this.b);
         var1 = this.a;
         vdtt_if var3 = new vdtt_if(this.c, this.a, this.b);
         var1.aU = var3;
         this.a.aw = -1;
         return false;
      } else {
         this.a.status = 2;
         if (this.a.pointMove == null) {
            var1 = this.a;
            vdtt_gj var2 = new vdtt_gj(this.b.cx, this.b.cy, 1);
            var1.pointMove = var2;
         }

         this.a.pointMove.cx = this.b.cx;
         this.a.pointMove.cy = this.b.cy;
         Utlis.b(this.a.cx, this.b.cx);
         Utlis.b(this.a.cy, this.b.cy);
         return true;
      }
   }
}

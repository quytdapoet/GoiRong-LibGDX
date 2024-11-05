package gro;

public final class vdtt_ey extends Entity {
   public boolean k = true;

   public vdtt_ey(int var1, int var2) {
      this.setXY(var1, var2);
   }

   public vdtt_ey(int var1, int var2, boolean var3) {
      this.setXY(var1, var2);
      this.k = var3;
   }

   public final int minX() {
      return this.cx - this.width / 2;
   }

   public final int maxX() {
      return this.cx + this.width / 2;
   }

   public final int minY() {
      return this.cy - this.height / 2;
   }

   public final int maxY() {
      return this.cy + this.height / 2;
   }

   public final void paintTop(Graphics var1) {
   }

   public final String strTop() {
      return null;
   }

   public final String strBottom() {
      return null;
   }

   public final void paintBottom(Graphics var1) {
   }

   public final int prioritize() {
      return 2;
   }
}

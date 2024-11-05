package gro;

public final class vdtt_hy extends Entity {
   public boolean k;
   public boolean l;
   private Entity m;

   public vdtt_hy(boolean var1, int var2, int var3, Entity var4) {
      this.setXY(var2, var3);
      this.k = var1;
      this.m = var4;
   }

   public final int minX() {
      return 0;
   }

   public final int maxX() {
      return 0;
   }

   public final int minY() {
      return 0;
   }

   public final int maxY() {
      return 0;
   }

   public final void paintTop(Graphics var1) {
      Char var2;
      if (!Utlis.e() && (GameSrc.gI().mapID != 67 || this.cy >= 300) && (!(this.m instanceof Char) || ((var2 = (Char)this.m).p() || !var2.U) && !var2.ab() && !var2.af())) {
         XYEntity var3;
         if (!this.l && (var3 = Char.b(this.cx, this.cy)) != null) {
            this.cy = var3.cy;
         }

         var1.d((int)((1.0F - ((float)this.cy - (float)this.m.cy) / 120.0F) * 100.0F));
         int var4 = vdtt_gz.a;
         int var5 = vdtt_gz.b;
         if (this.m instanceof Npc) {
            Npc var6;
            if ((var6 = (Npc)this.m).o()) {
               return;
            }

            var4 = var6.getNpcTemplate().g;
            var5 = var6.getNpcTemplate().h;
            if (var6.id == 48) {
               return;
            }
         } else if (this.m instanceof Mob) {
            Mob var7;
            var4 = (var7 = (Mob)this.m).getMobTemplate().j;
            var5 = var7.getMobTemplate().idIcon;
         } else if (this.m instanceof Char) {
            Char var8;
            if ((var8 = (Char)this.m).ah()) {
               return;
            }

            if (var8.bt != null) {
               var4 = 207;
               var5 = 79;
            } else if (var8.ae()) {
               var4 = 208;
               var5 = 92;
            }
         }

         vdtt_y.a(var1, var4, 0, this.cx, this.cy + 0, var5, Graphics.s(), 3);
         var1.m = 1.0F;
      }

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
      return 4;
   }
}

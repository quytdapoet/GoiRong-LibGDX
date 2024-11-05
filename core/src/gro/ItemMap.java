package gro;

public final class ItemMap extends Entity {
   public Item item;
   public short l;
   public short m;
   public short n;
   public short o;
   public boolean p;
   private byte J = 70;
   private int[] K = new int[]{41, 42, 43};
   private int L = 0;
   public int H = 0;
   public int I;

   public ItemMap() {
      this.setSize(25, 25);
      this.height = 17;
   }

   public final void a(int var1, int var2, int var3, int var4) {
      this.l = (short)var1;
      this.m = (short)var2;
      this.setXY(var3, var4);
      var1 = Utlis.b(var1 - var3);
      var2 = Utlis.b(var2 - var4);
      this.n = (short)(var1 / 6);
      this.o = (short)(var2 / 6);
      if (this.n <= 0) {
         this.n = 1;
      }

      if (this.o <= 0) {
         this.o = 1;
      }

   }

   public final int minX() {
      return this.cx - this.width / 2;
   }

   public final int maxX() {
      return this.cx + this.width / 2;
   }

   public final int minY() {
      return this.cy - this.height;
   }

   public final int maxY() {
      return this.cy;
   }

   public final void m() {
      if (this.H > 0) {
         --this.H;
         if (this.H == 1) {
            GameSrc.gI().vItemMap.remove(this);
         }
      }

      if (this.cx != this.l) {
         if (Utlis.b(this.cx - this.l) < this.n) {
            this.cx = this.l;
         } else if (this.cx > this.l) {
            this.cx -= this.n;
         } else {
            this.cx += this.n;
         }
      }

      if (this.cy != this.m) {
         if (Utlis.b(this.cy - this.m) < this.o) {
            this.cy = this.m;
         } else if (this.cy > this.m) {
            this.cy -= this.o;
         } else {
            this.cy += this.o;
         }
      }

      if (this.p) {
         if (this.cx == this.l && this.cy == this.m) {
            GameSrc.gI().vItemMap.remove(this);
         } else {
            this.J = (byte)(this.J + 5);
            if (this.J > 100) {
               this.J = 100;
            }
         }
      }

      if (this.item != null && this.item.getItemTemplate().id == 224 && DataCenter.gI().h % 3 == 0) {
         ++this.L;
         if (this.L >= this.K.length) {
            this.L = 0;
         }
      }

   }

   public final void paintTop(Graphics var1) {
      if (this.item.id == 725 || this.item.id == 726) {
         this.J = 80;
      }

      vdtt_y.a(var1, this.item.an(), 0, this.cx, this.cy, this.J, (byte)33);
      if (this.item.getItemTemplate().id == 224) {
         vdtt_cz.a(var1, this.K[this.L], 0, this.cx, this.cy, 33);
      }

   }

   public final String strTop() {
      return null;
   }

   public final String strBottom() {
      return null;
   }

   public final void paintBottom(Graphics var1) {
      if (GameSrc.gI().focusEntity != null && GameSrc.gI().focusEntity.equals(this)) {
         vdtt_dd.b(vdtt_dd.d, var1, this.item.getItemTemplate().name, this.cx, this.cy - this.height - 8, 2, -271475, -10275328);
         int var2 = this.cy - this.height;
         GameSrc.gI().bn.setXY(this.cx, var2 - 20);
         GameSrc.gI().bn.paintTop(var1);
      }

   }

   public final int prioritize() {
      return 3;
   }
}

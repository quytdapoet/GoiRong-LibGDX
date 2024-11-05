package gro;

import java.util.Vector;

public final class vdtt_hf extends Entity {
   public short k;
   public byte l = -1;
   public byte m = -1;
   public Vector n = new Vector();
   public int o = 0;
   public boolean p;
   public boolean H;
   public boolean I;
   public boolean J;
   public int K;
   public int L;

   public final vdtt_hh m() {
      return DataCenter.gI().E[this.k];
   }

   public vdtt_hf(int var1, int var2, int var3) {
      this.a(var1, var2, var3, 1);
      vdtt_aa var4;
      if (var1 == 114 && !(var4 = vdtt_aa.gI()).a) {
         var4.a(var4.b[65]);
      }

   }

   public vdtt_hf(int var1, int var2, int var3, int var4) {
      this.a(var1, var2, var3, var4);
   }

   private void a(short var1) {
      this.k = var1;
      if (var1 == 51) {
         GameSrc.gI().cO = 20;
      }

   }

   private void a(int var1, int var2, int var3, int var4) {
      this.l = (byte)var4;
      this.a((short)var1);
      this.setXY(var2, var3);
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

   public final void a(short var1, short var2) {
      for(int var3 = 0; var3 < this.n.size(); ++var3) {
         vdtt_es var4;
         (var4 = (vdtt_es)this.n.get(var3)).cx = (short)(var4.cx - this.cx + var1);
         var4.cy = (short)(var4.cy - this.cy + var2);
      }

      this.cx = var1;
      this.cy = var2;
   }

   public final void n() {
      ++this.m;
      if (this.o > 0 && this.m >= this.o) {
         this.m = 0;
         if (this.l > 0) {
            --this.l;
         }
      }

      vdtt_es var1;
      int var2;
      for(var2 = 0; var2 < this.m().b.length; ++var2) {
         if (this.p) {
            var1 = new vdtt_es(this.m().b[var2].a, this.cx - this.m().b[var2].c, this.cy + this.m().b[var2].d);
         } else {
            var1 = new vdtt_es(this.m().b[var2].a, this.cx + this.m().b[var2].c, this.cy + this.m().b[var2].d);
         }

         var1.p = this.J;
         var1.o = this.p;
         if (this.L > 0) {
            var1.H = this.L;
         }

         if (this.m == this.m().b[var2].b) {
            this.n.addElement(var1);
         }

         if (this.m().b[var2].b + var1.p().b.length > this.o) {
            this.o = this.m().b[var2].b + var1.p().b.length;
         }
      }

      if (this.H) {
         for(var2 = this.n.size() - 1; var2 >= 0; --var2) {
            (var1 = (vdtt_es)this.n.elementAt(var2)).n();
            if (this.L > 0) {
               var1.H = this.L;
            }

            if (var1.q()) {
               this.n.removeElement(var1);
            }
         }
      } else {
         if (this.l != 0) {
            GameSrc.gI().au.addAll(this.n);
         }

         this.n.clear();
      }

   }

   public final void o() {
      ++this.m;
      if (this.o > 0 && this.l == -1 && this.m >= this.o) {
         this.m = 0;
      }

      vdtt_es var1;
      int var2;
      for(var2 = 0; var2 < this.m().b.length; ++var2) {
         if (this.p) {
            var1 = new vdtt_es(this.m().b[var2].a, this.cx - this.m().b[var2].c, this.cy + this.m().b[var2].d);
         } else {
            var1 = new vdtt_es(this.m().b[var2].a, this.cx + this.m().b[var2].c, this.cy + this.m().b[var2].d);
         }

         var1.p = this.J;
         var1.o = this.p;
         if (this.m == this.m().b[var2].b) {
            this.n.addElement(var1);
         }

         if (this.m().b[var2].b + var1.p().b.length > this.o) {
            this.o = this.m().b[var2].b + var1.p().b.length;
         }
      }

      for(var2 = this.n.size() - 1; var2 >= 0; --var2) {
         (var1 = (vdtt_es)this.n.elementAt(var2)).n();
         if (var1.q()) {
            this.n.removeElement(var1);
         }
      }

      if (this.m >= this.o) {
         this.m = -1;
         if (this.l > 0) {
            --this.l;
         }
      }

   }

   public final void a(Entity var1) {
      short var2 = (short)(var1.cx + this.K);
      short var3 = var1.cy;
      if (this.I) {
         var2 = (short)(var1.k() + this.K);
         var3 = (short)var1.l();
         if (this.k == 442) {
            if (var1.dir == 3) {
               var2 = (short)(var2 - 5);
               this.p = false;
            } else {
               var2 = (short)(var2 + 5);
               this.p = true;
            }
         }
      }

      if (this.k == 453 && var1 instanceof Char && !var1.isDie()) {
         var3 = (short)(var3 + DataCenter.gI().h / 5 % 2);
      }

      if (this.k == 112 || this.k == 113) {
         var3 = (short)(var3 - (var1.height + 14));
         Npc var4;
         if (var1 instanceof Npc && (var4 = (Npc)var1).getNpcTemplate().detail.length() > 0) {
            var3 = (short)(var3 - 10);
         }
      }

      int var9 = var2 - this.cx;
      int var5 = var3 - this.cy;
      this.cx = var2;
      this.cy = var3;
      ++this.m;
      if (this.o > 0 && this.l == -1 && this.m >= this.o) {
         this.m = 0;
      }

      vdtt_es var6;
      int var7;
      for(var7 = this.n.size() - 1; var7 >= 0; --var7) {
         vdtt_es var8 = var6 = (vdtt_es)this.n.elementAt(var7);
         var8.cx = (short)(var8.cx + var9);
         var6.cy = (short)(var6.cy + var5);
         var6.n();
         if (var6.q()) {
            this.n.removeElement(var6);
         }
      }

      for(var7 = 0; var7 < this.m().b.length; ++var7) {
         if (this.p) {
            var6 = new vdtt_es(this.m().b[var7].a, this.cx - this.m().b[var7].c, this.cy + this.m().b[var7].d);
         } else {
            var6 = new vdtt_es(this.m().b[var7].a, this.cx + this.m().b[var7].c, this.cy + this.m().b[var7].d);
         }

         var6.p = this.J;
         var6.o = this.p;
         if (this.m().b[var7].a == 167) {
            var6.I = var1.height * 100 / 85 + 15;
            var6.o = this.p;
         }

         if (this.m == this.m().b[var7].b) {
            this.n.addElement(var6);
         }

         if (this.m().b[var7].b + var6.p().b.length > this.o) {
            this.o = this.m().b[var7].b + var6.p().b.length;
         }
      }

      for(var7 = this.n.size() - 1; var7 >= 0; --var7) {
         this.n.elementAt(var7);
         GameSrc.gI().a((Entity)this.n.elementAt(var7));
      }

      GameSrc.gI().Q();
      if (this.m >= this.o) {
         this.m = -1;
         if (this.l > 0) {
            --this.l;
         }
      }

   }

   public final boolean p() {
      return this.l == 0;
   }

   public final void paintTop(Graphics var1) {
      if (!this.p()) {
         for(int var2 = 0; var2 < this.n.size(); ++var2) {
            ((vdtt_es)this.n.elementAt(var2)).paintTop(var1);
         }
      }

   }

   public final void b(Graphics var1, int var2, int var3) {
      if (!this.p()) {
         for(int var4 = 0; var4 < this.n.size(); ++var4) {
            ((vdtt_es)this.n.elementAt(var4)).b(var1, var2, var3);
         }
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
      return this.m().a;
   }
}

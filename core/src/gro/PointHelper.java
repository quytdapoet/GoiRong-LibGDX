package gro;

public final class PointHelper {
   private final int i = 35;
   private final int j = 65;
   public final int a;
   public boolean b;
   public int c;
   public int d;
   private int k;
   private int l;
   private int m;
   public int e;
   public boolean f;
   public int g;
   public float h;

   public PointHelper() {
      this.a = DataCenter.gI().n;
      this.e = 1;
   }

   public final boolean a() {
      return this.e == 1;
   }

   public final boolean b() {
      return this.b && (DataCenter.gI().currentScreen instanceof GameSrc || DataCenter.gI().currentScreen instanceof vdtt_ce);
   }

   public final void a(int var1, int var2) {
      DataCenter.gI();
      if (!DataCenter.b()) {
         if (this.k != var1 + GameSrc.gI().idTask + GameSrc.gI().idStep && GameSrc.gI().idTask <= 5 && (GameSrc.gI().idTask != this.l || GameSrc.gI().idStep != this.m || GameSrc.gI().idTask == this.l && GameSrc.gI().idStep == this.m && this.c != var1 && this.d != var2)) {
            this.k = var1 + GameSrc.gI().idTask + GameSrc.gI().idStep;
            this.l = GameSrc.gI().idTask;
            this.m = GameSrc.gI().idStep;
         }

         this.c = var1;
         this.d = var2;
      }

   }

   public final void b(int var1, int var2) {
      this.a(var1, var2);
      this.b = true;
   }
}

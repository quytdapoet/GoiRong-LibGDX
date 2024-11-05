package gro;

public final class vdtt_eb {
   public Skill a;
   public Entity b;
   public int c;
   public static int d = 20;

   public vdtt_eb(Skill var1, Entity var2) {
      this.a = var1;
      this.b = var2;
      this.c = d;
   }

   public final boolean a() {
      --this.c;
      return this.c <= 0;
   }
}

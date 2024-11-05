package gro;

public final class SkillClan {
   public int a;
   public String b;
   public String c;
   public int d;
   public String e;
   public int f;
   public int g;
   public int h;

   public final ItemOption[] a() {
      if (this.e != null && this.e.length() > 0) {
         String[] var1;
         ItemOption[] var2 = new ItemOption[(var1 = Utlis.a(this.e, ";")).length];

         for(int var3 = 0; var3 < var1.length; ++var3) {
            var2[var3] = new ItemOption(var1[var3]);
         }

         return var2;
      } else {
         return null;
      }
   }

   public final String b() {
      return Utlis.f((long)this.h * 1000L);
   }
}

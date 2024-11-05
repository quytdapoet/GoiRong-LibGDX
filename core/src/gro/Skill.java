package gro;

import java.util.Comparator;

public final class Skill implements Cloneable {
   public static final Comparator a = new vdtt_ia();
   public int b;
   public short c;
   public short d;
   public byte e;
   public short f;
   public short g;
   public int h;
   public short i;
   public short j;
   public byte k;
   public long l;
   public String m;
   public long n;
   public boolean o;
   public boolean p;

   public final Skill a() {
      try {
         return (Skill)super.clone();
      } catch (Exception var2) {
         Utlis.a(var2);
         return null;
      }
   }

   public final SkillTemplate getSkillTemplate() {
      return DataCenter.gI().skillTemplate[this.d];
   }

   public final boolean c() {
      return this.getSkillTemplate().type == 5;
   }

   public final boolean d() {
      return this.getSkillTemplate().type < 5 || this.getSkillTemplate().type == 6;
   }

   public final boolean e() {
      return this.getSkillTemplate().type == 1;
   }

   public final boolean a(Char var1, boolean var2) {
      if (var1.p()) {
         if (this.n < Utlis.a() && var1.mp >= this.g) {
            if (this.l()) {
               if (GameSrc.gI().dd == 0) {
                  if (var2) {
                     DataCenter.gI().currentScreen.c(Caption.xN, -1);
                  }

                  return false;
               }

               if (GameSrc.gI().focusEntity == null) {
                  return false;
               }
            }

            return true;
         } else {
            return false;
         }
      } else {
         return true;
      }
   }

   public final void f() {
      if (this.d >= 30 && this.d <= 36 && Char.gI().ad()) {
         this.n = Utlis.a() + (long)(this.h * 80 / 100);
      } else {
         this.n = Utlis.a() + (long)this.h;
      }

   }

   public final float g() {
      return (float)(this.n - Utlis.a());
   }

   public final ItemOption[] h() {
      if (this.m != null && this.m.length() > 0) {
         String[] var1;
         ItemOption[] var2 = new ItemOption[(var1 = Utlis.a(this.m, ";")).length];

         for(int var3 = 0; var3 < var1.length; ++var3) {
            var2[var3] = new ItemOption(var1[var3]);
         }

         return var2;
      } else {
         return null;
      }
   }

   public final float a(int var1) {
      float var2 = (float)((int)(this.n - Utlis.a()));
      float var3 = (float)(this.h / var1);
      return !(var2 <= 0.0F) && var3 != 0.0F ? var2 / var3 : (float)(var1 + 1);
   }

   public final boolean i() {
      return this.d == 11 || this.d == 9;
   }

   public final boolean j() {
      return this.d == 5;
   }

   public final short a(Char var1) {
      if (DataCenter.k()) {
         if (this.getSkillTemplate().id >= 30 && this.getSkillTemplate().id <= 36) {
            return (short)(this.getSkillTemplate().idIcon - 12);
         }

         if (this.getSkillTemplate().levelNeed == 5) {
            return (short)(730 + Char.gI().sys - 1);
         }

         if (this.getSkillTemplate().levelNeed == 10) {
            return 390;
         }

         if (this.getSkillTemplate().levelNeed == 30) {
            return 391;
         }

         if (this.getSkillTemplate().levelNeed == 40) {
            return 392;
         }

         if (this.getSkillTemplate().levelNeed == 50) {
            return 393;
         }

         if (this.getSkillTemplate().levelNeed == 1 && this.getSkillTemplate().levelMax == 1) {
            return 366;
         }

         if (this.l()) {
            return 81;
         }
      }

      if (this.getSkillTemplate().id >= 30 && this.getSkillTemplate().id <= 36) {
         if (var1.sys == 5) {
            return (short)(this.getSkillTemplate().idIcon - 419);
         } else {
            int var2 = var1.sys - 1;
            return (short)(this.getSkillTemplate().idIcon + var2 * 7);
         }
      } else if (this.getSkillTemplate().id != 8 && this.getSkillTemplate().id != 3 && this.getSkillTemplate().id != 15 && this.getSkillTemplate().id != 21 && this.getSkillTemplate().id != 24) {
         return this.getSkillTemplate().idIcon;
      } else {
         return this.e > 0 ? (short)(this.getSkillTemplate().idIcon + this.e - 1) : (short)(this.getSkillTemplate().idIcon + this.e);
      }
   }

   public final boolean k() {
      return this.d == 3 || this.d == 8 || this.d == 15 || this.d == 21 || this.d == 24;
   }

   public final void a(Graphics var1, Char var2, int var3, int var4) {
      if (!mConfig.gI().d() && !this.l()) {
         vdtt_cz.a(var1, 646, 0, var3, var4, 20);
         vdtt_cz.a(var1, this.a(var2), 0, var3, var4, 20);
      } else {
         vdtt_cz.a(var1, this.a(var2), 0, var3, var4, 20);
         vdtt_cz.a(var1, 647, 0, var3, var4, 20);
      }

   }

   public final boolean l() {
      return this.d == 1 || this.d == 7 || this.d == 13 || this.d == 19 || this.d == 25;
   }

   public final boolean b(Char var1) {
      return this.getSkillTemplate().i == 0 || var1.bG == this.getSkillTemplate().id || var1.bH == this.getSkillTemplate().id;
   }

   public final boolean m() {
      return this.d >= 84 && this.d <= 86;
   }

   public final Object clone() {
      return this.a();
   }
}

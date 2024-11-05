package gro;

import java.util.Comparator;

public final class ItemOption {
   public static final Comparator a = new vdtt_gx();
   public int[] option;

   public ItemOption(String var1) {
      String[] var2 = Utlis.a(var1, ",");
      this.option = new int[var2.length];

      for(int var3 = 0; var3 < var2.length; ++var3) {
         this.option[var3] = Integer.parseInt(var2[var3]);
      }

   }

   public ItemOption(int... var1) {
      this.option = var1;
   }

   public final ItemOptionTemplate getItemOptionTemplate() {
      return DataCenter.gI().itemOptionTemplate[this.option[0]];
   }

   public final String[] b() {
      if (this.getItemOptionTemplate().id != 344 && this.getItemOptionTemplate().id != 369 && this.getItemOptionTemplate().id != 375 && this.getItemOptionTemplate().id != 267 && this.getItemOptionTemplate().id != 343 && this.getItemOptionTemplate().id != 368 && this.getItemOptionTemplate().id != 412) {
         return null;
      } else {
         String var1 = "" + (float)this.option[1] / 10.0F;
         if (this.option[1] % 10 == 0) {
            var1 = "" + this.option[1] / 10;
         }

         String var2 = "" + (float)this.f() / 10.0F;
         if (this.f() % 10 == 0) {
            var2 = "" + this.f() / 10;
         }

         return new String[]{var1, var2};
      }
   }

   public final String a(int var1) {
      if (this.option[0] == 310) {
         return Utlis.b(DataCenter.gI().itemOptionTemplate[this.option[0]].text, DataCenter.gI().skillTemplate[this.option[1]].name);
      } else if (this.getItemOptionTemplate().type == 54) {
         return Utlis.b(DataCenter.gI().itemOptionTemplate[this.option[0]].text, Utlis.j(this.option[1]));
      } else if (this.getItemOptionTemplate().type == 52) {
         String var5 = Utlis.b(DataCenter.gI().itemOptionTemplate[this.option[0]].text, "" + this.option[1]);

         for(int var3 = 0; var3 < DataCenter.gI().skillTemplate.length; ++var3) {
            if (DataCenter.gI().skillTemplate[var3].idChar == var1 && DataCenter.gI().skillTemplate[var3].levelNeed == this.getItemOptionTemplate().level) {
               String var4 = DataCenter.gI().skillTemplate[var3].name;
               return var5.replaceAll("@", var4);
            }
         }

         return null;
      } else if (this.getItemOptionTemplate().id == 98) {
         return Utlis.b(DataCenter.gI().itemOptionTemplate[this.option[0]].text, "" + (float)this.option[1] / 100.0F);
      } else {
         String[] var2;
         return (var2 = this.b()) != null ? Utlis.b(DataCenter.gI().itemOptionTemplate[this.option[0]].text, var2[0]) : Utlis.b(DataCenter.gI().itemOptionTemplate[this.option[0]].text, "" + this.option[1]);
      }
   }

   public final String c() {
      if (this.option[1] == -1) {
         return Caption.wR;
      } else {
         return this.f() == -1 ? Utlis.b(DataCenter.gI().itemOptionTemplate[this.option[0]].text, DataCenter.gI().skillTemplate[this.option[1]].name + Caption.wS) : Utlis.b(DataCenter.gI().itemOptionTemplate[this.option[0]].text, DataCenter.gI().skillTemplate[this.option[1]].name + Caption.io + this.f());
      }
   }

   public final String d() {
      String[] var1;
      if ((var1 = this.b()) == null) {
         if (this.option[0] == 481) {
            return Utlis.b(DataCenter.gI().itemOptionTemplate[this.option[0]].text, DataCenter.gI().dataNameChar[this.option[1]].name);
         } else if (this.option[0] == 464) {
            short var2 = 50;
            if (this.f() == 469) {
               var2 = 600;
            }

            int var3 = (this.option[1] + var2) / (var2 * 4);
            return Utlis.b(Utlis.a(DataCenter.gI().itemOptionTemplate[this.option[0]].text, (long)var3), (long)(var3 + 1));
         } else if (this.option[0] >= 465 && this.option[0] <= 468) {
            return Utlis.b(DataCenter.gI().itemOptionTemplate[this.option[0]].text, Utlis.b(DataCenter.gI().itemOptionTemplate[this.f()].text, Utlis.c(this.option[1])));
         } else if (this.option[0] == 436 && this.option[1] > 0) {
            return Utlis.b(DataCenter.gI().itemOptionTemplate[this.option[0]].text, DataCenter.gI().itemTemplate[this.option[1]].name.replaceAll(Caption.bb, "").trim());
         } else if (this.option[0] == 427 && this.option[1] > 0) {
            return Caption.xk + " " + DataCenter.gI().itemTemplate[this.option[1]].name;
         } else if (this.getItemOptionTemplate().type == 55) {
            return Utlis.b(DataCenter.gI().itemOptionTemplate[this.option[0]].text, DataCenter.gI().skillTemplate[this.option[1]].name);
         } else if (this.option[1] >= 0 && this.f() >= 0 && this.option[1] != this.f()) {
            return Utlis.b(DataCenter.gI().itemOptionTemplate[this.option[0]].text, "(" + this.option[1] + "-" + this.f() + ")");
         } else if (this.option[1] >= 0) {
            return Utlis.b(DataCenter.gI().itemOptionTemplate[this.option[0]].text, "" + this.option[1]);
         } else {
            return this.f() >= 0 ? Utlis.b(DataCenter.gI().itemOptionTemplate[this.option[0]].text, "" + this.f()) : "";
         }
      } else {
         return this.option[1] >= 0 && this.f() >= 0 && this.option[1] != this.f() && this.option[0] == 412 ? Utlis.b(DataCenter.gI().itemOptionTemplate[this.option[0]].text, "(" + var1[0] + "-" + var1[1] + ")") : Utlis.b(DataCenter.gI().itemOptionTemplate[this.option[0]].text, var1[0]);
      }
   }

   public final String e() {
      return this.option[0] == 349 ? Utlis.b(DataCenter.gI().itemOptionTemplate[this.option[0]].text, "") : Utlis.b(DataCenter.gI().itemOptionTemplate[this.option[0]].text, Utlis.c(this.option[1])).replaceAll("@", Utlis.c(this.f()));
   }

   public final String b(int var1) {
      var1 = var1;
      if (this.option.length > 3) {
         var1 += this.option[3];
      }

      if ((var1 = this.option[1] + var1 / 10) > this.f()) {
         var1 = this.f();
      }

      return Utlis.b(DataCenter.gI().itemOptionTemplate[this.option[0]].text, "" + var1).replaceAll("@", "" + this.f());
   }

   public final int c(int var1) {
      return this.option[1] = var1;
   }

   public final int d(int var1) {
      int[] var2 = this.option;
      return var2[1] += var1;
   }

   public final int e(int var1) {
      return this.option[2] = var1;
   }

   public final int f() {
      return this.option.length < 3 ? -1 : this.option[2];
   }

   public final String g() {
      String var1 = "";

      for(int var2 = 0; var2 < this.option.length; ++var2) {
         var1 = var1 + this.option[var2];
         if (var2 < this.option.length - 1) {
            var1 = var1 + ",";
         }
      }

      return var1;
   }

   public final boolean a(boolean var1) {
      try {
         return this.option[3] >= (var1 ? 17 : 16);
      } catch (Exception var3) {
         return false;
      }
   }

   public static int f(int var0) {
      switch(var0) {
      case 406:
         return 199;
      case 407:
         return 200;
      case 408:
         return 201;
      case 409:
         return 202;
      case 410:
         return 203;
      case 411:
         return 204;
      case 412:
         return 205;
      case 413:
         return 206;
      default:
         return -1;
      }
   }

   public final int h() {
      switch(this.getItemOptionTemplate().type) {
      case 3:
         return 793;
      case 4:
         return 795;
      case 5:
         return 797;
      case 6:
         return 798;
      case 7:
      case 8:
      case 9:
      case 10:
      case 13:
      case 14:
      case 15:
      case 16:
      case 18:
      default:
         switch(this.option[0]) {
         case 199:
            return 406;
         case 200:
            return 407;
         case 201:
            return 408;
         case 202:
            return 409;
         case 203:
            return 410;
         case 204:
            return 411;
         case 205:
            return 412;
         case 206:
            return 413;
         default:
            return -1;
         }
      case 11:
         return 794;
      case 12:
         return 796;
      case 17:
         return 791;
      case 19:
         return 792;
      }
   }

   public final int i() {
      try {
         return this.option[3];
      } catch (Exception var2) {
         return 0;
      }
   }

   public static ItemOption g(int var0) {
      return new ItemOption(f(var0) + ",0,-1,0");
   }

   public final boolean j() {
      return this.getItemOptionTemplate().type == 19 || this.getItemOptionTemplate().type == 3 || this.getItemOptionTemplate().type == 11 || this.getItemOptionTemplate().type == 4 || this.getItemOptionTemplate().type == 12 || this.getItemOptionTemplate().type == 5 || this.getItemOptionTemplate().type == 6 || this.getItemOptionTemplate().type == 7 || this.getItemOptionTemplate().type == 10;
   }

   public final boolean k() {
      return this.getItemOptionTemplate().id == 349 || this.getItemOptionTemplate().id == 350 || this.getItemOptionTemplate().id == 298;
   }

   public final boolean l() {
      return this.getItemOptionTemplate().type == 8;
   }

   public final boolean m() {
      return this.getItemOptionTemplate().type == 2 || this.getItemOptionTemplate().type == 50 || this.n();
   }

   public final boolean n() {
      return this.getItemOptionTemplate().type == 7;
   }
}

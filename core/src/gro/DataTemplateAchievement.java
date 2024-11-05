package gro;

public final class DataTemplateAchievement {
   public int a;
   public String b;
   public int c;
   public int d;
   public int e;
   public int f;
   public int g;
   public String h;

   public final Item a() {
      try {
         if (this.h != null && this.h.length() > 0) {
            String[] var1 = this.h.split("@");
            Item var2;
            (var2 = new Item()).id = Short.parseShort(var1[0]);
            var2.isLock = Boolean.parseBoolean(var1[1]);
            var2.h = Long.parseLong(var1[2]);
            var2.c(Integer.parseInt(var1[3]));
            var2.g = Byte.parseByte(var1[4]);
            var2.level = Byte.parseByte(var1[5]);
            if (var1.length > 6) {
               var2.strData = var1[6];
               if (var2.getItemTemplate().gioiTinh != 2 && var2.getItemTemplate().gioiTinh != Char.gI().gioiTinh) {
                  for(int var3 = 0; var3 < DataCenter.gI().itemTemplate.length; ++var3) {
                     ItemTemplate var4;
                     if ((var4 = DataCenter.gI().itemTemplate[var3]).gioiTinh == Char.gI().gioiTinh && var4.type == var2.getItemTemplate().type && var4.levelNeed == var2.getItemTemplate().levelNeed) {
                        var2.id = var4.id;
                        break;
                     }
                  }
               }

               if (var2.getItemTemplate().type == 13) {
                  var2.g = Char.gI().he;
                  switch(var2.g) {
                  case 1:
                     var2.strData = "54,0,500;62,0,500";
                     break;
                  case 2:
                     var2.strData = "55,0,500;58,0,500";
                     break;
                  case 3:
                     var2.strData = "56,0,500;59,0,500";
                     break;
                  case 4:
                     var2.strData = "57,0,500;60,0,500";
                     break;
                  case 5:
                     var2.strData = "53,0,500;61,0,500";
                  }
               }
            }

            return var2;
         }
      } catch (Exception var5) {
         Utlis.a(var5);
      }

      return null;
   }
}

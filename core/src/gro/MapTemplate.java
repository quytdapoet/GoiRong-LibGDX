package gro;

public final class MapTemplate {
   public short id;
   public String name;
   public short typeArr;
   public byte type;
   public byte e;

   public MapTemplate(int var1) {
      this.id = (short)var1;
   }

   public final boolean a() {
      try {
         if (this.type == 4 || this.type == 14 || this.type == 15 || this.type == 5 || this.type == 7 || this.type == 8 || this.type == 6 || this.type == 9 || this.type == 10 || this.type == 12 || this.type == 13 || this.type == 16 || this.type == 17 || this.type == 19 || this.type == 20 || this.type == 21 || this.type == 23 || this.type == 24) {
            return true;
         }
      } catch (Exception var2) {
      }

      return false;
   }
}

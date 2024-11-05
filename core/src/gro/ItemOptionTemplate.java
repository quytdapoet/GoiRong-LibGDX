package gro;

public final class ItemOptionTemplate {
   public short id;
   public String text;
   public byte type;
   public byte level;
   public String strOption;

   public String toString() {
      return "ItemOptionTemplate{id=" + this.id + ", text=" + this.text + ", type=" + this.type + ", level=" + this.level + ", strOption=" + this.strOption + '}';
   }

   public ItemOptionTemplate(int var1) {
      this.id = (short)var1;
   }

   public final int[] a() {
      if (this.strOption.length() == 0) {
         return new int[0];
      } else {
         String[] var1;
         int[] var2 = new int[(var1 = this.strOption.split(";")).length];

         for(int var3 = 0; var3 < var2.length; ++var3) {
            var2[var3] = Integer.parseInt(var1[var3]);
         }

         return var2;
      }
   }
}

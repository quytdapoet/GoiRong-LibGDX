package gro;

public final class MobTemplate {
   public short[][] a;
   public vdtt_fe[] b;
   public short id;
   public short width;
   public short height;
   public short indexData;
   public short idIcon;
   public short timeThuHoach;
   public short i;
   public short j;
   public String name;
   public String detail;
   public int[] m;
   public int[] n;
   public short speedMove;
   public byte type;
   public byte speedMoveByte;
   public byte typeMob2;
   public vdtt_ff s;

   public MobTemplate(int var1) {
      this.id = (short)var1;
   }

   public final void a(String var1, String var2) {
      try {
         String[] var3 = Utlis.a(var1, ",");
         this.m = new int[var3.length];

         int var4;
         for(var4 = 0; var4 < var3.length; ++var4) {
            this.m[var4] = Integer.parseInt(var3[var4]);
         }

         var3 = Utlis.a(var2, ",");
         this.n = new int[var3.length];

         for(var4 = 0; var4 < var3.length; ++var4) {
            this.n[var4] = Integer.parseInt(var3[var4]);
         }
      } catch (Exception var5) {
      }

   }
}

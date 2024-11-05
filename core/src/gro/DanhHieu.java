package gro;

public final class DanhHieu {
   public String a;
   public int b = -1;
   public int c = -16711681;
   public int d = -1;
   public int e = 0;
   public int f = -1;
   public int g = 1;

   public final void a() {
      this.a = this.a.trim();
      String var1 = (Caption.nQ + " " + this.a).toLowerCase();

      for(int var2 = 0; var2 < DataCenter.gI().itemTemplate.length; ++var2) {
         if (DataCenter.gI().itemTemplate[var2].name.toLowerCase().equals(var1)) {
            this.a(DataCenter.gI().itemTemplate[var2].detail);
            return;
         }
      }

   }

   private void a(String var1) {
      try {
         String[] var2;
         if ((var2 = var1.split(";")).length < 2) {
            var2 = var1.split(",");
         }

         if (var2.length > 1) {
            this.f = Integer.parseInt(var2[0]);
            this.c = Integer.parseInt(var2[1]);
            this.d = Integer.parseInt(var2[2]);
            this.g = Integer.parseInt(var2[3]);
            if (this.g > this.a.length() - 3) {
               this.g = this.a.length() - 3;
            }

            if (this.g <= 0) {
               this.g = 1;
            }

            this.e = Integer.parseInt(var2[3]);
            if (this.e > 3) {
               this.e = 3;
               return;
            }
         } else {
            this.c = Integer.parseInt(var2[0]);
         }
      } catch (Exception var3) {
      }

   }
}

package gro;

public final class Server {
   public short id;
   public String name;
   public String ipServer;
   public short portServer;
   public short portCheckOnline;
   public String strSttaus = "";
   public String text = "";
   public boolean isFocus;

   public final Server a() {
      Server var1;
      (var1 = new Server()).id = this.id;
      var1.name = this.name;
      var1.ipServer = this.ipServer;
      var1.portServer = this.portServer;
      var1.portCheckOnline = this.portCheckOnline;
      var1.strSttaus = this.strSttaus;
      var1.text = this.text;
      return var1;
   }

   public final String b() {
      String var1 = this.name.trim();
      if (this.strSttaus.length() > 0) {
         var1 = var1 + " (" + this.strSttaus + ")";
      }

      return var1;
   }

   public final Object clone() {
      return this.a();
   }
}

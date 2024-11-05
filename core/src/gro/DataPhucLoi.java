package gro;

public final class DataPhucLoi {
   public int id;
   public String name;
   public int type;
   public Item item;
   public int status;

   public final boolean a() {
      return this.status == 1;
   }
}

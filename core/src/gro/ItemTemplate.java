package gro;

public final class ItemTemplate {
   public short id;
   public String name;
   public String detail;
   public boolean isXepChong;
   public byte gioiTinh;
   public byte type;
   public byte typeChar;
   public short idIcon;
   public short levelNeed;
   public int phamChatNeed;
   public short width;
   public short height;

   public String toString() {
      return "ItemTemplate{id=" + this.id + ", name=" + this.name + ", detail=" + this.detail + ", isXepChong=" + this.isXepChong + ", gioiTinh=" + this.gioiTinh + ", type=" + this.type + ", typeChar=" + this.typeChar + ", idIcon=" + this.idIcon + ", levelNeed=" + this.levelNeed + ", phamChatNeed=" + this.phamChatNeed + ", width=" + this.width + ", height=" + this.height + '}';
   }

   public ItemTemplate(int var1) {
      this.id = (short)var1;
   }

   public final short a() {
      return DataCenter.k() ? 0 : this.height;
   }

   public final short b() {
      return DataCenter.k() ? this.height : this.width;
   }
}

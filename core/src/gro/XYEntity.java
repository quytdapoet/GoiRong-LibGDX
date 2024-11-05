package gro;

import java.util.Comparator;

public class XYEntity {
   public static final Comparator C = new vdtt_ah();
   public static final Comparator D = new vdtt_ai();
   public static final Comparator E = new vdtt_aj();
   public short cx;
   public short cy;

   public static XYEntity create(int var0, int var1) {
      XYEntity var2;
      (var2 = new XYEntity()).setXY(var0, var1);
      return var2;
   }

   public final void setXY(int var1, int var2) {
      this.cx = (short)var1;
      this.cy = (short)var2;
   }

   public static XYEntity c(String var0) {
      String[] var1 = var0.split("_");
      XYEntity var2;
      (var2 = new XYEntity()).setXY(Integer.parseInt(var1[0]), Integer.parseInt(var1[1]));
      return var2;
   }

   public XYEntity u() {
      return create(this.cx, this.cy);
   }

   public Object clone() {
      return this.u();
   }
}

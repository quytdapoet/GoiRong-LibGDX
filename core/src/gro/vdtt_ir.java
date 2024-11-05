package gro;

import java.util.Comparator;
import java.util.Vector;

public final class vdtt_ir {
   public int a;
   public String b;
   public String c;
   public Vector d;
   public int e;
   public static final Comparator f = new vdtt_is();

   public vdtt_ir(int var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public vdtt_ir(int var1, String var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.e = var3;
   }

   public vdtt_ir(int var1, String var2, Vector var3) {
      this.a = 1;
      this.b = var2;
      this.d = var3;
   }
}

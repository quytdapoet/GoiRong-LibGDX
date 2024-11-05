package gro;

import com.badlogic.gdx.files.FileHandle;

public final class vdtt_dp {
   public FileHandle a;

   public final byte[] a(int var1) {
      return this.a != null && this.a.exists() ? this.a.readBytes() : null;
   }

   public final int a() {
      return this.a != null && this.a.exists() ? (int)this.a.length() : 0;
   }

   public final void a(int var1, byte[] var2, int var3, int var4) {
      this.a.writeBytes(var2, false);
   }

   public final void a(byte[] var1, int var2, int var3) {
      this.a.writeBytes(var1, false);
   }

   public static vdtt_dp a(String var0, boolean var1) {
      try {
         vdtt_dp var2;
         (var2 = new vdtt_dp()).a = Utlis.i(var0);
         return var2;
      } catch (Exception var3) {
         return null;
      }
   }

   public static vdtt_dp b(String var0, boolean var1) {
      try {
         vdtt_dp var2;
         (var2 = new vdtt_dp()).a = Utlis.h(var0);
         return var2;
      } catch (Exception var3) {
         return null;
      }
   }
}

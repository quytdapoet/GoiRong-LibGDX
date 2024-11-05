package gro;

import java.util.Vector;

public final class vdtt_fk {
   public Vector a = new Vector();

   public vdtt_fk(vdtt_fw[] var1) {
      for(int var2 = 0; var2 < var1.length; ++var2) {
         this.a.add(var1[var2]);
      }

   }

   public final boolean a(int var1, int var2) {
      for(int var3 = 0; var3 < this.a.size(); ++var3) {
         if (((vdtt_fw)this.a.get(var3)).a(var1, var2)) {
            return true;
         }
      }

      return false;
   }

   public final XYEntity a(XYEntity var1, XYEntity var2) {
      for(int var3 = 0; var3 < this.a.size(); ++var3) {
         XYEntity var4;
         if ((var4 = ((vdtt_fw)this.a.get(var3)).a(var1, var2)) != null) {
            return var4;
         }
      }

      return null;
   }

   public final XYEntity b(int var1, int var2) {
      if (!this.a(var1, var2)) {
         return XYEntity.create(var1, var2);
      } else {
         for(int var3 = 1; var3 < 1000; ++var3) {
            if (!this.a(var1 + var3, var2)) {
               return XYEntity.create(var1 + var3, var2);
            }

            if (!this.a(var1, var2 + var3)) {
               return XYEntity.create(var1, var2 + var3);
            }

            if (!this.a(var1 - var3, var2)) {
               return XYEntity.create(var1 - var3, var2);
            }

            if (!this.a(var1, var2 - var3)) {
               return XYEntity.create(var1, var2 - var3);
            }

            if (!this.a(var1 + var3, var2 + var3)) {
               return XYEntity.create(var1 + var3, var2 + var3);
            }

            if (!this.a(var1 - var3, var2 + var3)) {
               return XYEntity.create(var1 - var3, var2 + var3);
            }

            if (!this.a(var1 + var3, var2 - var3)) {
               return XYEntity.create(var1 + var3, var2 - var3);
            }

            if (!this.a(var1 - var3, var2 - var3)) {
               return XYEntity.create(var1 - var3, var2 - var3);
            }
         }

         return XYEntity.create(var1, var2);
      }
   }

   public static XYEntity c(int var0, int var1) {
      int var3 = 16;

      try {
         int var4 = var0 > GameSrc.gI().maxX + -17 ? GameSrc.gI().maxX - 17 : var0;
         if (var4 >= 16) {
            var3 = var4;
         }

         XYEntity var5 = XYEntity.create(var3, var1);
         XYEntity var6 = XYEntity.create(var5.cx, GameSrc.gI().maxY + 10);

         for(int var7 = 0; var7 < GameSrc.gI().X.size(); ++var7) {
            XYEntity var2;
            if (((vdtt_fw)GameSrc.gI().X.get(var7)).d[0].cy >= var5.cy && (var2 = ((vdtt_fw)GameSrc.gI().X.get(var7)).a(var5, var6)) != null) {
               return var2;
            }
         }
      } catch (Exception var8) {
      }

      return null;
   }

   public static XYEntity[] d(int var0, int var1) {
      if (var0 > GameSrc.gI().maxX - 17) {
         var0 = GameSrc.gI().maxX - 17;
      }

      if (var0 < 16) {
         var0 = 16;
      }

      XYEntity var2 = XYEntity.create(var0, var1 - 5);
      XYEntity var3 = XYEntity.create(var0, var1 + GameSrc.gI().maxY);

      for(var1 = 0; var1 < GameSrc.gI().dM.size(); ++var1) {
         try {
            if (((vdtt_fw)GameSrc.gI().dM.get(var1)).d[0].cy >= var2.cy && Utlis.a(((vdtt_fw)GameSrc.gI().dM.get(var1)).d[0], ((vdtt_fw)GameSrc.gI().dM.get(var1)).d[1], var2, var3) != null) {
               return ((vdtt_fw)GameSrc.gI().dM.get(var1)).d;
            }
         } catch (Exception var5) {
         }
      }

      return null;
   }

   public static XYEntity[] a(int var0, int var1, int var2, int var3) {
      if (var0 > GameSrc.gI().maxX - 17) {
         var0 = GameSrc.gI().maxX - 17;
      }

      if (var0 < 16) {
         var0 = 16;
      }

      if (var2 > GameSrc.gI().maxX - 17) {
         var2 = GameSrc.gI().maxX - 17;
      }

      if (var2 < 16) {
         var2 = 16;
      }

      XYEntity var4 = XYEntity.create(var0, var1);
      XYEntity var5 = XYEntity.create(var2, var3);

      for(var2 = 0; var2 < GameSrc.gI().dM.size(); ++var2) {
         try {
            if (((vdtt_fw)GameSrc.gI().dM.get(var2)).d[0].cy >= var4.cy && Utlis.a(((vdtt_fw)GameSrc.gI().dM.get(var2)).d[0], ((vdtt_fw)GameSrc.gI().dM.get(var2)).d[1], var4, var5) != null) {
               return ((vdtt_fw)GameSrc.gI().dM.get(var2)).d;
            }
         } catch (Exception var7) {
         }
      }

      return null;
   }
}

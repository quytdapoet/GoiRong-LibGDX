package gro;

import java.util.Comparator;
import java.util.Vector;

public abstract class Entity extends EntityPanel {
   public int a = 10;
   public int idEntity;
   public short c;
   public byte dir;
   public byte status;
   public byte f;
   public boolean g;
   public boolean h;
   public Vector i = new Vector();
   public static final Comparator j = new vdtt_m();

   public abstract int minX();

   public abstract int maxX();

   public abstract int minY();

   public abstract int maxY();

   public abstract void paintTop(Graphics var1);

   public abstract void paintBottom(Graphics var1);

   public abstract int prioritize();

   public abstract String strTop();

   public abstract String strBottom();

   public final boolean isDie() {
      return this.status == 4 || this.status == 5 || this.status == 8 || this.status == 6;
   }

   public void setDir(XYEntity var1) {
      if (var1 != null) {
         if (this.cx < var1.cx) {
            this.dir = 2;
         } else {
            this.dir = 3;
         }
      }

   }

   public void i() {
      if (this.status != 4 && this.status != 5 || this.status != 8 && this.status != 6) {
         this.c = 0;
         this.status = 1;
      }

   }

   public void j() {
   }

   public final int k() {
      return this.minX() + (this.maxX() - this.minX()) / 2;
   }

   public final int l() {
      return this.minY() + (this.maxY() - this.minY()) / 2;
   }

   public final boolean a(int var1, int var2) {
      Char var3;
      if ((var3 = (Char)this).aW == null && var3.p() && (!SettingsTab.K().V || GameSrc.gI().focusEntity == null)) {
         return !GameSrc.gI().V.a(var1, var2);
      } else {
         return true;
      }
   }
}

package gro;

import java.util.Vector;

public final class vdtt_gg extends EntityPanel {
   public vdtt_hp a;
   public vdtt_hm b;
   public vdtt_gd c;
   private Vector[] i;
   public vdtt_w d;
   private int j;
   public String[][] e;
   public boolean[] f;
   public boolean[] g;
   public boolean h;

   public vdtt_gg(vdtt_hm var1, int var2, int var3, int var4, int var5, int var6, int var7, vdtt_w var8) {
      boolean var9 = false;
      var9 = true;
      byte var10 = 87;
      byte var11 = 1;
      vdtt_hm var12 = var1;
      vdtt_gg var13 = this;
      this.setXY(var11, var4);
      this.setSize(var10, var6);
      this.j = var2;
      this.d = var8;
      this.b = var1;
      if (var1.c.length * 31 > var6 - 20) {
         var7 = (var6 - 20) / 31 * 31;
      } else {
         var7 = var1.c.length * 31;
      }

      this.a = new vdtt_hp((byte)1, var8.width - 4, 10, var10 - 40, var7, 31, var1.c.length);
      byte var14 = -1;
      this.a.H = var14;
      this.c = new vdtt_gd(0, 0, 0, 16, (byte)0, var1.c.length);
      this.i = new Vector[var1.c.length];
      this.e = new String[var1.c.length][];
      this.f = new boolean[var1.c.length];
      this.g = new boolean[var1.c.length];

      for(var3 = 0; var3 < var13.i.length; ++var3) {
         var13.i[var3] = new Vector();
         String[] var15;
         if ((var15 = var12.c[var3].trim().split(" ")).length >= 3 && !var12.c[var3].contains("\n")) {
            var13.e[var3] = new String[2];
            StringBuilder var16;
            String[] var17;
            if (var15.length >= 4) {
               var13.e[var3][0] = var15[0] + " " + var15[1];
               var13.e[var3][1] = "";

               for(var5 = 2; var5 < var15.length; ++var5) {
                  var16 = new StringBuilder();
                  var17 = var13.e[var3];
                  var17[1] = var16.append(var17[1]).append(var15[var5]).append(" ").toString();
               }

               var13.e[var3][1] = var13.e[var3][1].trim();
            } else {
               var13.e[var3][0] = var15[0];
               var13.e[var3][1] = "";

               for(var5 = 1; var5 < var15.length; ++var5) {
                  var16 = new StringBuilder();
                  var17 = var13.e[var3];
                  var17[1] = var16.append(var17[1]).append(var15[var5]).append(" ").toString();
               }

               var13.e[var3][1] = var13.e[var3][1].trim();
            }
         } else {
            var13.e[var3] = vdtt_dd.c(vdtt_dd.e, var12.c[var3], var10 - 10);
         }
      }

   }

   public final void a() {
      this.a.a();
      this.c.a();
   }

   public final void a(int var1) {
      if (!this.g[var1]) {
         this.b.b = var1;

         for(var1 = 0; var1 < this.i.length; ++var1) {
            for(int var2 = 0; var2 < this.i[var1].size(); ++var2) {
               this.d.f.removeElement(this.i[var1].elementAt(var2));
            }
         }

         for(var1 = 0; var1 < this.i[this.b.b].size(); ++var1) {
            this.d.f.addElement(this.i[this.b.b].elementAt(var1));
         }

         for(var1 = 0; var1 < this.d.f.size(); ++var1) {
            if (this.d.f.get(var1) instanceof vdtt_al) {
               this.d.f.remove(var1);
               return;
            }
         }
      }

   }

   public final void a(vdtt_k var1, int var2) {
      this.i[var2].addElement(var1);
   }

   public final void a(Vector var1, int var2) {
      for(int var3 = 0; var3 < var1.size(); ++var3) {
         this.i[var2].addElement((vdtt_k)var1.elementAt(var3));
      }

   }

   public final void b() {
      for(int var1 = 0; var1 < this.i.length; ++var1) {
         for(int var2 = 0; var2 < this.i[var1].size(); ++var2) {
            this.d.f.removeElement(this.i[var1].elementAt(var2));
         }
      }

   }
}

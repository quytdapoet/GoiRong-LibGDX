package gro;

import java.util.Vector;

public abstract class vdtt_w extends vdtt_x {
   public static boolean m;
   public byte e;
   public Vector f = new Vector();
   public vdtt_x g;
   public vdtt_x h;
   public vdtt_x i;
   public vdtt_hp j;
   public vdtt_al k;
   public vdtt_ih l;
   public int n;

   public static vdtt_be a(int var0, int var1, int var2, vdtt_w var3, int var4) {
      vdtt_hm var5 = new vdtt_hm(var4);
      var5.c = Caption.yq;
      var5.d = new short[9];

      for(int var6 = 0; var6 < var5.d.length; ++var6) {
         var5.d[var6] = (short)(var6 + 873);
         switch(var6) {
         case 0:
            var5.d[var6] = 873;
            break;
         case 1:
            var5.d[var6] = 874;
            break;
         case 2:
            var5.d[var6] = 876;
            break;
         case 3:
            var5.d[var6] = 877;
            break;
         case 4:
            var5.d[var6] = 878;
            break;
         case 5:
            var5.d[var6] = 879;
            break;
         case 6:
            var5.d[var6] = 881;
            break;
         case 7:
            var5.d[var6] = 875;
         }
      }

      return new vdtt_be(var0, var1, 100, 20, var2, var5, var3, true);
   }

   public static String a(Vector var0, String var1) {
      if (!GameSrc.gI().k(var1)) {
         var0.addElement(new vdtt_ir(4001, Caption.N));
      }

      var0.addElement(new vdtt_ir(4002, Caption.J));
      var0.addElement(new vdtt_ir(4003, Caption.cT));
      var0.addElement(new vdtt_ir(4004, Caption.dR));
      return var1;
   }

   private static void b(Vector var0) {
      for(int var1 = 0; var1 < var0.size() - 1; ++var1) {
         try {
            int var2 = var1 + 1;

            vdtt_k var4;
            for(vdtt_k var3 = (vdtt_k)var0.elementAt(var1); var2 < var0.size(); var3 = var4) {
               var4 = (vdtt_k)var0.elementAt(var2);
               if (var4.cy < var3.cy) {
                  var0.setElementAt(var4, var1);
                  var0.setElementAt(var3, var2);
               } else if (var4.cy == var3.cy && var4.cx < var3.cx) {
                  var0.setElementAt(var4, var1);
                  var0.setElementAt(var3, var2);
               } else {
                  var4 = var3;
               }

               ++var2;
            }
         } catch (Exception var5) {
            return;
         }
      }

   }

   private void d() {
      if (this.l != null) {
         if (this.l.a()) {
            this.l = null;
         } else if (this.l.a && this.l.a()) {
            this.l = null;
         }

      }
   }

   public final vdtt_ay a(int var1, int var2, String var3, vdtt_w var4, int var5, int var6) {
      vdtt_ay var7 = new vdtt_ay(var1, var2, 0, 0, var3, var4, var5, var6);
      this.a(var7);
      return var7;
   }

   public final vdtt_az a(int var1, int var2, String var3, vdtt_w var4, int var5, int var6, int var7) {
      vdtt_az var8 = new vdtt_az(var1, var2, 0, 0, var3, var4, 1011, 20, 19);
      this.a(var8);
      return var8;
   }

   public final vdtt_bb a(int var1, int var2, String var3, vdtt_w var4, int var5) {
      vdtt_bb var6 = new vdtt_bb(var1, var2, var3, var4, var5);
      this.a(var6);
      return var6;
   }

   public final vdtt_bd a(int var1, int var2, int var3, int var4, vdtt_hm var5, vdtt_w var6, int var7) {
      vdtt_bd var8 = new vdtt_bd(var1, var2, var3, var4, var5, var6, var7, true);
      this.a(var8);
      return var8;
   }

   public final vdtt_bs a(int var1, int var2, String var3, vdtt_w var4, vdtt_hl var5) {
      vdtt_bs var6 = new vdtt_bs(var1, var2, var3, var4, var5);
      this.a(var6);
      return var6;
   }

   public final vdtt_by a(int var1, int var2, int var3, String var4, vdtt_w var5, int var6) {
      vdtt_by var7 = new vdtt_by(var1, var2, var3, var4, var5, -11, var6);
      this.a(var7);
      return var7;
   }

   public final vdtt_by a(int var1, int var2, int var3, String var4, vdtt_w var5, int var6, int var7) {
      vdtt_by var8 = new vdtt_by(var1, var2, var3, var4, var5, var6, var7);
      this.a(var8);
      return var8;
   }

   public final void a(int var1, int var2, int var3) {
      short var4 = this.cx;
      short var5 = this.cy;
      this.setXY(var2, var3);
      switch(var1) {
      case 0:
      case 1:
         this.l = new vdtt_ih(this, (byte)0, this.cx);
         this.cx = var4;
         return;
      case 2:
      case 3:
         this.l = new vdtt_ih(this, (byte)1, this.cy);
         this.cy = var5;
         return;
      default:
      }
   }

   public final void a(int var1, int var2, int var3, int var4) {
      this.setXY(var2, var3);
      switch(var1) {
      case 0:
         this.l = new vdtt_ih(this, (byte)0, var2 + var4, var2);
         this.cx = (short)(-DataCenter.gI().n);
         break;
      case 1:
         this.l = new vdtt_ih(this, (byte)0, var2 - var4, var2);
         this.cx = (short)DataCenter.gI().n;
         break;
      case 2:
         this.l = new vdtt_ih(this, (byte)1, var3 + var4, var3);
         this.cy = (short)(-DataCenter.gI().o);
         break;
      case 3:
         this.l = new vdtt_ih(this, (byte)1, var3 - var4, var3);
         this.cy = (short)DataCenter.gI().o;
      }

      this.l.b = 100;
   }

   public abstract void a(int var1, Object var2);

   public abstract void a(int var1, Object var2, vdtt_x var3);

   public final void a(vdtt_k var1) {
      if (var1 != null && !this.f.contains(var1)) {
         for(int var2 = 0; var2 < this.f.size(); ++var2) {
            if (this.f.get(var2) instanceof vdtt_al && !(this.f.get(var2) instanceof vdtt_bn)) {
               this.f.remove(var2);
               break;
            }
         }

         this.f.addElement(var1);
      }

   }

   public final void a(String var1, int var2, int var3, int var4) {
      Vector var5 = new Vector();
      if (!GameSrc.gI().k(var1)) {
         var5.addElement(new vdtt_ir(4001, Caption.N));
      }

      var5.addElement(new vdtt_ir(4002, Caption.J));
      var5.addElement(new vdtt_ir(4003, Caption.cT));
      var5.addElement(new vdtt_ir(4004, Caption.dR));
      this.a(var5, var1, var2, var3, var4);
   }

   public final void a(Vector var1, String var2, int var3, int var4, int var5) {
      if (var1.size() > 0) {
         String[] var6 = new String[var1.size()];
         short[] var7 = new short[var1.size()];
         String[] var8 = new String[var1.size()];

         for(int var9 = 0; var9 < var1.size(); ++var9) {
            vdtt_ir var10 = (vdtt_ir)var1.elementAt(var9);
            var6[var9] = var10.b;
            var8[var9] = var10.c;
            var7[var9] = (short)var10.a;
         }

         this.k = a(this, var4 + 25, var5, new vdtt_hm(var3, var7, var6, var2));
      }

   }

   public final boolean a(char var1) {
      for(int var2 = 0; var2 < this.f.size(); ++var2) {
         try {
            try {
               vdtt_k var3 = (vdtt_k)this.f.elementAt(var2);
               if (var3.b && var3 instanceof vdtt_by) {
                  var3.o.a(var1);
                  return true;
               }
            } catch (Exception var4) {
            }
         } catch (Exception var5) {
         }
      }

      return false;
   }

   public final vdtt_bw b(int var1, int var2, int var3, String var4, vdtt_w var5, int var6) {
      vdtt_bw var7 = new vdtt_bw(var1, var2, var3, var4, var5, -11, var6);
      this.a(var7);
      return var7;
   }

   public final void b(int var1) {
      switch((byte)Utlis.a((int)4)) {
      case 0:
         this.l = new vdtt_ih(this, (byte)0, this.cx);
         this.cx = 1000;
         break;
      case 1:
         this.l = new vdtt_ih(this, (byte)0, this.cx);
         this.cx = -1000;
         break;
      case 2:
         this.l = new vdtt_ih(this, (byte)1, this.cy);
         this.cy = 1000;
         break;
      case 3:
         this.l = new vdtt_ih(this, (byte)1, this.cy);
         this.cy = -1000;
      }

      this.l.b = 100;
   }

   public abstract void b(int var1, Object var2);

   public abstract void b(int var1, Object var2, vdtt_x var3);

   public final void b(vdtt_k var1) {
      if (var1 != null) {
         this.f.removeElement(var1);
         if (this.k != null && var1.equals(this.k)) {
            this.k = null;
         }
      }

   }

   public final void c(Graphics var1) {
      this.d(var1);
      if (!m) {
         for(int var2 = 0; var2 < this.f.size(); ++var2) {
            try {
               vdtt_k var3 = (vdtt_k)this.f.elementAt(var2);
               if (var3.e == null && !(var3.a instanceof vdtt_v)) {
                  var3.d(var1);
               }
            } catch (Exception var4) {
               Utlis.a(var4);
               return;
            }
         }
      }

   }

   public final void c(vdtt_k var1) {
      if (var1 != null) {
         this.f.removeElement(var1);
         this.f.addElement(var1);
         var1.b = true;
         if (var1.e != null) {
            var1.e.c(var1);
            vdtt_k var2 = var1.e.a();
            this.f.removeElement(var2);
            this.f.addElement(var2);
         }
      }

   }

   public final boolean c(int var1) {
      for(int var2 = 0; var2 < this.f.size(); ++var2) {
         try {
            try {
               vdtt_k var3 = (vdtt_k)this.f.elementAt(var2);
               if (var3.b && var3 instanceof vdtt_by) {
                  var3.o.a(var1);
                  return true;
               }
            } catch (Exception var4) {
            }
         } catch (Exception var5) {
         }
      }

      return false;
   }

   public final boolean d(int var1) {
      for(int var2 = 0; var2 < this.f.size(); ++var2) {
         try {
            try {
               vdtt_k var3 = (vdtt_k)this.f.elementAt(var2);
               if (var3.b && var3 instanceof vdtt_by) {
                  var3.o.b(var1);
                  return true;
               }
            } catch (Exception var4) {
            }
         } catch (Exception var5) {
         }
      }

      return false;
   }

   public final void l() {
      for(int var1 = 0; var1 < this.f.size(); ++var1) {
         try {
            try {
               ((vdtt_k)this.f.elementAt(var1)).s();
            } catch (Exception var3) {
            }
         } catch (Exception var4) {
            return;
         }
      }

      this.s();
   }

   public final void m() {
      try {
         this.d();

         for(int var1 = 0; var1 < this.f.size(); ++var1) {
            try {
               ((vdtt_k)this.f.elementAt(var1)).a_();
            } catch (Exception var3) {
            }
         }

         this.a_();
      } catch (Exception var4) {
      }

   }

   public final boolean n() {
      return this.l != null && this.l.b();
   }

   public final void o() {
      for(int var1 = 0; var1 < this.f.size(); ++var1) {
         try {
            try {
               vdtt_k var2 = (vdtt_k)this.f.elementAt(var1);
               var2.c();
               var2.o.a();
            } catch (Exception var3) {
            }
         } catch (Exception var4) {
            return;
         }
      }

      this.c();
      this.o.a();
   }

   public final void p() {
      if (this.h != null) {
         ((vdtt_bd)this.h).h();
         this.h = null;
      }

   }

   public final void q() {
      int var1 = 0;
      vdtt_k var2 = null;

      while(true) {
         while(true) {
            label24:
            while(var1 < this.f.size()) {
               var2 = (vdtt_k)this.f.elementAt(var1);
               if (var2.b) {
                  var2.b = false;
                  b(this.f);
                  int var3 = this.f.indexOf(var2);

                  do {
                     ++var3;
                     if (var3 >= this.f.size()) {
                        var3 = 0;
                     }

                     if (this.f.elementAt(var3).equals(var2)) {
                        var2 = null;
                        continue label24;
                     }
                  } while(!(this.f.elementAt(var3) instanceof vdtt_by));

                  var2 = (vdtt_k)this.f.elementAt(var3);
               } else {
                  ++var1;
               }
            }

            this.c(var2);
            return;
         }
      }
   }

   public final void setSize(int var1, int var2) {
      super.setSize(var1, var2);
   }
}

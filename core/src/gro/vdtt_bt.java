package gro;

import java.util.Collections;
import java.util.Vector;

public final class vdtt_bt extends vdtt_al {
   public static vdtt_bt l;
   public Char m;
   public Vector n = new Vector();
   public Vector H = new Vector();
   public Vector I = new Vector();
   public Vector J = new Vector();
   private vdtt_hp[] L;
   private vdtt_ay[] M = new vdtt_ay[3];
   private Skill N;
   private Mob O;
   private int P;
   private int Q;
   public static vdtt_es K;

   public vdtt_bt(int var1, int var2, int var3, int var4, vdtt_w var5, Skill var6, Char var7) {
      l = this;
      this.a = var5;
      var1 = -var5.cx;
      var2 = -var5.cy;
      var3 = DataCenter.gI().n - AppListener.gI().m;
      var4 = DataCenter.gI().o;
      this.setXY(var1, var2);
      this.setSize(var3, var4);
      this.m = new Char(Integer.MIN_VALUE);
      this.m.arrItemBody = var7.arrItemBody;
      this.m.idCharSys = var7.idCharSys;
      this.m.sys = var7.sys;
      this.m.bp = var7.bp;
      this.m.hpFull = this.m.hp = 1;
      this.m.ba.addAll(var7.ba);
      this.O = new Mob(213);
      this.O.dir = 3;
      this.O.hpFull = this.O.hp = 1;
      this.m.setXY(var3 / 2 - 100, var4 / 2 + 50);
      this.O.c(this.m.cx + 200, this.m.cy);
      this.N = var6;
      this.M[0] = new vdtt_ay(var3 - 17 - AppListener.gI().m / 2, 3, 0, 0, "", var5, 2001, 52);
      this.M[1] = new vdtt_ay(var3 / 2 - 38, var4 - 28, 0, 0, Caption.qt, var5, 2002, 7);
      this.M[2] = new vdtt_ay(var3 / 2 + 8, var4 - 28, 0, 0, Caption.l, var5, 2001, 7);
      this.M[1].setSize(40, 23);
      this.M[2].setSize(40, 23);
      this.L = a(this.M);
      if (this.a instanceof SelectCharScreen && K == null && !DataCenter.k()) {
         K = new vdtt_es(460, 0, 0, 2);
      }

   }

   public final void a(int var1, int var2) {
      this.m.setXY(var1, var2);
      this.O.c(this.m.cx + 200, this.m.cy);
      this.O.id = 1;
   }

   private void a(Skill var1) {
      Char var2 = this.m;
      vdtt_if var3 = new vdtt_if(var1, this.m, this.O);
      var2.aU = var3;
      vdtt_aa.gI().a(this.m.sys, var1.d, true);
   }

   public final void b(Graphics var1) {
      int var2 = var1.e;
      int var3 = var1.f;
      int var4;
      if (this.a instanceof SelectCharScreen) {
         for(var4 = 0; var4 < this.J.size(); ++var4) {
            if (!DataCenter.k() || !(this.J.get(var4) instanceof Mob)) {
               ((Entity)this.J.get(var4)).paintTop(var1);
            }
         }
      } else {
         this.c(var1);

         for(var4 = 0; var4 < this.J.size(); ++var4) {
            ((Entity)this.J.get(var4)).paintTop(var1);
         }

         this.a(var1, this.M, var2, var3);
      }

   }

   public final void a_() {
      ++this.Q;
      a(this.M, this.L);
      this.J.clear();
      this.m.B();
      if (this.a instanceof SelectCharScreen) {
         this.O.status = 0;
      }

      this.O.r();
      if (this.m.aU != null) {
         this.m.aU.a(this.I, this.n);
      } else if (this.a instanceof SelectCharScreen && this.P < 2 && this.Q > 20 && this.N.k()) {
         ++this.P;
         this.a(this.N);
         this.m.aU.a = 8;
         this.m.aU.a(this.I, this.n);
      }

      int var1;
      for(var1 = this.n.size() - 1; var1 >= 0; --var1) {
         vdtt_hf var2;
         if ((var2 = (vdtt_hf)this.n.elementAt(var1)) != null) {
            vdtt_hf var3 = var2;
            ++var2.m;
            if (var2.o > 0 && var2.m >= var2.o) {
               var2.m = 0;
               if (var2.l > 0) {
                  --var2.l;
               }
            }

            vdtt_es var4;
            int var5;
            for(var5 = 0; var5 < var3.m().b.length; ++var5) {
               if (var3.p) {
                  var4 = new vdtt_es(var3.m().b[var5].a, var3.cx - var3.m().b[var5].c, var3.cy + var3.m().b[var5].d);
               } else {
                  var4 = new vdtt_es(var3.m().b[var5].a, var3.cx + var3.m().b[var5].c, var3.cy + var3.m().b[var5].d);
               }

               var4.p = var3.J;
               var4.o = var3.p;
               if (var3.m == var3.m().b[var5].b) {
                  var3.n.addElement(var4);
               }

               if (var3.m().b[var5].b + var4.p().b.length > var3.o) {
                  var3.o = var3.m().b[var5].b + var4.p().b.length;
               }
            }

            if (var3.H) {
               for(var5 = var3.n.size() - 1; var5 >= 0; --var5) {
                  (var4 = (vdtt_es)var3.n.elementAt(var5)).n();
                  if (var4.q()) {
                     var3.n.removeElement(var4);
                  }
               }
            } else {
               if (var3.l != 0) {
                  l.H.addAll(var3.n);
               }

               var3.n.clear();
            }

            if (!(this.a instanceof SelectCharScreen) && this.N.d >= 30 && this.N.d <= 36 && Char.gI().ad()) {
               var2.L = 95;
            }

            if (var2.p()) {
               this.n.removeElement(var2);
            }
         }
      }

      for(int var6 = 0; var6 < this.H.size(); ++var6) {
         vdtt_es var8 = (vdtt_es)this.H.get(var6);
         if (!(this.a instanceof SelectCharScreen) && this.N.d >= 30 && this.N.d <= 36 && Char.gI().ad()) {
            var8.H = 95;
         }

         if (var8 != null) {
            var8.n();
         }

         if (var8.q()) {
            this.H.remove(var8);
         }
      }

      for(var1 = this.I.size() - 1; var1 >= 0; --var1) {
         vdtt_eo var7;
         (var7 = (vdtt_eo)this.I.elementAt(var1)).o();
         if (var7.n()) {
            this.I.removeElement(var7);
         }
      }

      this.J.add(this.m);
      if (!(this.a instanceof SelectCharScreen)) {
         this.J.add(this.O);
      }

      this.J.addAll(this.H);
      this.J.addAll(this.n);
      this.J.addAll(this.I);
      Collections.sort(this.J, XYEntity.E);
   }

   public final Vector g() {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < this.M.length; ++var2) {
         if (this.M[var2] != null && !this.M[var2].d && !this.M[var2].c) {
            var1.addElement(this.L[var2].a(this.M[var2].m, this));
         }
      }

      var1.addElement(new vdtt_hi(3000, 0, 0, DataCenter.gI().n, DataCenter.gI().o, (vdtt_hp)null, this));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      switch(var1.b) {
      case 2000:
         return;
      case 2001:
         this.a.b((vdtt_k)this);
         l = null;
         return;
      case 2002:
         if (this.m.aU == null) {
            this.a(this.N);
         }
      default:
      }
   }
}

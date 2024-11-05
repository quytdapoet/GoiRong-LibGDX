package gro;

import java.util.Vector;

public final class Effect extends XYEntity {
   public int id;
   public int b;
   public int c;
   public long d;
   public int e;
   public vdtt_hf f;
   public Vector g = new Vector();
   public Mob h;
   private int l;
   public boolean i;
   public int j;
   public int k;

   public Effect(int var1, int var2, long var3, int var5, Entity var6) {
      this.id = var1;
      this.b = this.c = var2;
      this.d = var3;
      this.e = var5;
      EffectTemplate var7;
      if (this.getEffectTemplate().idAura > 0 && this.getEffectTemplate().type != 138 && this.getEffectTemplate().type != 167 && this.getEffectTemplate().type != 81 && this.getEffectTemplate().type != 160 && this.getEffectTemplate().type != 165 && (var7 = this.getEffectTemplate()).type != 128 && var7.type != 132 && var7.type != 128 && var7.type != 153 && this.getEffectTemplate().type != 76 && this.getEffectTemplate().type != 77 && this.getEffectTemplate().type != 90 && !this.e() && !this.f()) {
         this.f = new vdtt_hf(this.getEffectTemplate().idAura, var6.cx, var6.cy, -1);
      } else {
         this.j = this.getEffectTemplate().idAura;
      }

   }

   public final boolean a() {
      switch(this.id) {
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 35:
      case 36:
      case 38:
      case 55:
      case 73:
      case 76:
      case 78:
      case 79:
      case 80:
      case 81:
      case 82:
      case 103:
      case 104:
      case 105:
      case 109:
      case 132:
      case 146:
      case 154:
      case 160:
      case 176:
      case 177:
      case 186:
      case 199:
         return true;
      default:
         return false;
      }
   }

   public final String b() {
      if (this.id == 113) {
         int var1;
         if ((var1 = (int)((long)this.c - (Utlis.a() - this.d) / 200L)) <= 0) {
            var1 = 1;
         }

         return Utlis.a(this.getEffectTemplate().detail, (long)var1);
      } else {
         return this.id == 67 ? Utlis.b(this.getEffectTemplate().detail, Utlis.i(this.b)) : Utlis.b(this.getEffectTemplate().detail, "" + this.b);
      }
   }

   public final void a(Entity var1) {
      if (this.f != null) {
         this.f.a(var1);
      }

      if (this.id == 57 || this.id == 62) {
         Char var2 = (Char)var1;
         if (this.h == null) {
            switch(this.id) {
            case 57:
               this.h = new Mob(217);
               break;
            case 62:
               this.h = new Mob(219);
               break;
            case 64:
               this.h = new Mob(220);
            }

            this.h.hp = 1;
            this.h.c(this.cx, this.cy);
            this.h.rangeMove = this.h.getMobTemplate().speedMoveByte;
            this.h.dir = var2.aE;
            this.h.cx = (short)(var2.cx + (var2.aE == 3 ? 35 : -35));
            this.h.cy = this.cy;
            this.h.ac = 14;
         }

         short var3 = this.h.cx;
         this.h.r();
         this.h.H = (short)var1.k();
         this.h.I = (short)var1.l();
         Mob var4 = this.h;
         var4.dir = (byte)(var3 > var4.cx ? 3 : 2);
         if (var2.U) {
            if (var2.p()) {
               this.h.aq = 1;
            } else {
               this.h.aq = 2;
            }
         } else {
            this.h.aq = 0;
         }

         vdtt_iw var5 = new vdtt_iw(0);
         if (this.h.getMobTemplate().type == 4) {
            this.h.dir = var2.aE;
            this.h.cx = (short)(var2.cx + (var2.aE == 3 ? 35 : -35));
         }

         var5.setXY(this.h.cx, this.h.cy);
         var5.p = this.h;
         GameSrc.gI().a((Entity)var5);
      }

   }

   public final EffectTemplate getEffectTemplate() {
      return DataCenter.gI().effectTemplate[this.id];
   }

   public final Effect a(int var1) {
      if (this.id == var1) {
         return this;
      } else {
         for(int var2 = 0; var2 < this.g.size(); ++var2) {
            if (((Effect)this.g.get(var2)).id == var1) {
               return (Effect)this.g.get(var2);
            }
         }

         return null;
      }
   }

   public final void a(Graphics var1, int var2, int var3, int var4, boolean var5) {
      try {
         if (DataCenter.k()) {
            return;
         }

         if (this.getEffectTemplate().id == 42) {
            if (this.b >= 200) {
               var4 = 501;
            } else if (this.b >= 100) {
               var4 = 564;
            } else if (this.b >= 75) {
               var4 = 563;
            }
         }

         if (var5) {
            this.l = var2;
         } else {
            this.l = Utlis.n(var2 + AppListener.gI().m / 2);
         }

         var2 = 0;
         if (this.id == 145 && Char.gI().arrItemBody[10] != null) {
            var2 = (new int[]{-2, -159, -5, -20, 0, 25, 70, 71, -112, -107, -71, -60})[Char.gI().arrItemBody[10].getItemTemplate().levelNeed - 10];
         }

         if (var2 != 0) {
            var1.c((float)var2);
            vdtt_cz.a(var1, var4, 0, this.l, var3, 20);
            var1.r();
         } else {
            vdtt_cz.a(var1, var4, 0, this.l, var3, 20);
         }

         var2 = this.e - (int)(Utlis.a() - this.d);
         if ((var4 = this.e / 4) == 0) {
            var4 = 1;
         }

         if (this.e == -1) {
            return;
         }

         if (var2 <= var4 * 3) {
            if (var2 > var4 * 2) {
               if ((var2 = (var2 - var4 * 2) * 14 / var4) > 14) {
                  var2 = 14;
               }

               vdtt_cz.a(var1, 315, -360, this.l, var3, 20);
               vdtt_cz.a(var1, 315, 90, this.l, var3 + 13, 20);
               if (var2 > 0) {
                  vdtt_cz.a(var1, 315, 0, this.l + 13, var3 + (14 - var2), 1 * DataCenter.gI().r, var2 * DataCenter.gI().r, 0, 14 - var2, 1, var2, 20);
                  return;
               }
            } else if (var2 > var4) {
               if ((var2 = (var2 - var4) * 14 / var4) > 14) {
                  var2 = 14;
               }

               vdtt_cz.a(var1, 315, -360, this.l, var3, 20);
               if (var2 > 0) {
                  vdtt_cz.a(var1, 315, 90, this.l, var3 + 13, var2 * DataCenter.gI().r, 1 * DataCenter.gI().r, 0, 14 - var2, 1, var2, 20);
                  return;
               }
            } else {
               if ((var2 = var2 * 14 / var4) > 14) {
                  var2 = 14;
               }

               if (var2 > 0) {
                  vdtt_cz.a(var1, 315, -360, this.l, var3, 1 * DataCenter.gI().r, var2 * DataCenter.gI().r, 0, 0, 1, var2, 20);
               }
            }

            return;
         }

         if ((var2 = (var2 - var4 * 3) * 14 / var4) > 14) {
            var2 = 14;
         }

         vdtt_cz.a(var1, 315, -360, this.l, var3, 20);
         if (var2 > 0) {
            vdtt_cz.a(var1, 315, -270, this.l + (14 - var2), var3, var2 * DataCenter.gI().r, 1 * DataCenter.gI().r, 0, 0, 1, var2, 20);
         }

         vdtt_cz.a(var1, 315, 90, this.l, var3 + 13, 20);
         vdtt_cz.a(var1, 315, 0, this.l + 13, var3, 20);
      } catch (Exception var7) {
         Utlis.a(var7);
      }

   }

   public final int d() {
      return (int)(Utlis.a() - this.d);
   }

   public final boolean e() {
      switch(this.getEffectTemplate().type) {
      case 92:
      case 93:
      case 94:
      case 95:
      case 101:
      case 102:
      case 103:
      case 117:
      case 118:
      case 152:
         return true;
      default:
         return false;
      }
   }

   public final boolean a(Char var1) {
      return this.id == 102 || this.getEffectTemplate().type == 117 || this.id == 172 || (this.j == 9 || this.j == 10) && var1.sys == 5 || this.j == 20 && var1.sys == 4 || this.j == 10 && var1.sys == 2;
   }

   public final boolean f() {
      return this.getEffectTemplate().type == 78 || this.getEffectTemplate().type == 159 || this.getEffectTemplate().type == 166;
   }

   public final boolean g() {
      return this.id == 153 || this.getEffectTemplate().type == 129 || this.getEffectTemplate().type == 161;
   }
}

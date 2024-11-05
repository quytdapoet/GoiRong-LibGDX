package gro;

import java.util.Vector;

public final class Npc extends Entity {
   public short id;
   public byte l;
   public Vector m = new Vector();
   public vdtt_ho n;
   public short o;
   private vdtt_hf H = new vdtt_hf(112, 0, 0, -1);
   private vdtt_hf I = new vdtt_hf(113, 0, 0, -1);
   public int p;

   public Npc(byte var1, int var2, int var3, int var4) {
      try {
         this.status = var1;
         this.id = (short)var2;
         this.setXY(var3, var4);
         this.setSize(this.getNpcTemplate().width, this.getNpcTemplate().height);
         if (Utlis.a((int)2) == 0) {
            this.dir = 3;
         } else {
            this.dir = 2;
         }

         if (!this.o()) {
            this.c = (short)Utlis.a(this.getNpcTemplate().a[0].length);
            return;
         }

         this.c = (short)Utlis.a(this.getNpcTemplate().a[0].length);
      } catch (Exception var6) {
      }

   }

   public final NpcTemplate getNpcTemplate() {
      if (this.o()) {
         GameSrc.gI();
         NpcTemplate var1;
         if (x() == 0) {
            short var2 = this.id;
            if (GameSrc.gI().capCayTao > 15) {
               var2 = 52;
            } else if (GameSrc.gI().capCayTao > 10) {
               var2 = 51;
            } else if (GameSrc.gI().capCayTao > 5) {
               var2 = 50;
            }

            var1 = DataCenter.gI().npcTemplate[var2];
         } else {
            short var3 = 106;
            if (GameSrc.gI().capCayTao > 15) {
               var3 = 151;
            } else if (GameSrc.gI().capCayTao > 10) {
               var3 = 131;
            } else if (GameSrc.gI().capCayTao > 5) {
               var3 = 116;
            }

            var1 = DataCenter.gI().npcTemplate[var3 + x() - 1];
         }

         this.setSize(var1.width, var1.height);
         return var1;
      } else {
         return DataCenter.gI().npcTemplate[this.id];
      }
   }

   public final void n() {
      XYEntity var1;
      if (this.status != 6 && (var1 = Char.b(this.cx, this.cy)) != null) {
         this.cy = var1.cy;
      }

      if (this.id == 48) {
         this.setXY(this.cx, this.cy - 3);
         this.setSize(40, 22);
      } else {
         this.setXY(this.cx, this.cy);
      }

      this.o = this.cy;
   }

   public final int minX() {
      return this.cx - this.width / 2;
   }

   public final int maxX() {
      return this.cx + this.width / 2;
   }

   public final int minY() {
      if (this.id == 48) {
         return this.cy - this.height - 26;
      } else {
         return this.w() && GameSrc.gI().mapID == 87 && this.cy > 330 ? 330 : this.cy - this.height;
      }
   }

   public final int maxY() {
      if (this.id == 48) {
         return this.cy - 26;
      } else {
         return this.w() && GameSrc.gI().mapID == 87 && this.cy > 380 ? 380 : this.cy;
      }
   }

   public final boolean o() {
      return this.id >= 49 && this.id <= 52;
   }

   public final void p() {
      try {
         if (this.status == 9) {
            this.cy = (short)(this.cy - 30);
            if (this.cy < -5000) {
               this.status = 0;
               this.cy = this.o;
            }
         }

         if (this.getNpcTemplate().hp <= 0) {
            this.getNpcTemplate().hp = 100;
         }

         if (this.getNpcTemplate().mp <= 0) {
            this.getNpcTemplate().mp = 100;
         }

         if (this.status != 6) {
            if (this.n != null && this.n.a(this.k(), this.cy - this.height + 2)) {
               this.n = null;
            }

            ++this.c;
            if (this.c >= this.getNpcTemplate().a[this.status].length) {
               this.c = 0;
            }

            this.l = (byte)this.getNpcTemplate().a[this.status][this.c];
            if (this.id == 38) {
               this.m.clear();
               if (Char.gI().w() >= 20 && Char.gI().w() < 30) {
                  if (GameSrc.gI().bA != null && GameSrc.gI().bA.a()) {
                     this.m.add(this.I);
                  } else if (GameSrc.gI().bA == null) {
                     this.m.add(this.H);
                  }
               }
            } else if (this.id == 36) {
               this.m.clear();
               if (Char.gI().w() >= 30 && Char.gI().w() < 40) {
                  if (GameSrc.gI().bB != null && GameSrc.gI().bB.a()) {
                     this.m.add(this.I);
                  } else if (GameSrc.gI().bB == null) {
                     this.m.add(this.H);
                  }
               }
            } else if (this.id == 23) {
               this.m.clear();
               if (Char.gI().w() >= 10) {
                  if (GameSrc.gI().bD != null && GameSrc.gI().bD.a()) {
                     this.m.add(this.I);
                  } else if (GameSrc.gI().bB == null) {
                     this.m.add(this.H);
                  }
               }
            } else if (this.id == 60) {
               this.m.clear();
               byte var4 = 0;
               if (Char.gI().sys == 1) {
                  var4 = 8;
               } else if (Char.gI().sys == 2) {
                  var4 = 3;
               } else if (Char.gI().sys == 3) {
                  var4 = 15;
               } else if (Char.gI().sys == 4) {
                  var4 = 21;
               }

               Skill var2;
               if ((var2 = GameSrc.gI().g(var4)) != null && var2.f >= 5 && var2.f < 70) {
                  if (GameSrc.gI().bC != null && GameSrc.gI().bC.a()) {
                     this.m.add(this.I);
                  } else if (GameSrc.gI().bC == null) {
                     this.m.add(this.H);
                  }
               }
            } else if (this.id == 61 && GameSrc.gI().ct <= 8) {
               if (GameSrc.gI().ct == -1) {
                  if (!this.m.contains(this.H)) {
                     this.m.add(this.H);
                  }
               } else {
                  Effect var1;
                  if ((var1 = Char.gI().h(162)) != null) {
                     if (var1.b < 8) {
                        if (!this.m.contains(this.H)) {
                           this.m.add(this.H);
                        }
                     } else if (var1.b == 8 && !this.m.contains(this.I)) {
                        this.m.remove(this.H);
                        this.m.add(this.I);
                     }
                  }
               }
            }

            for(int var6 = this.m.size() - 1; var6 >= 0; --var6) {
               vdtt_hf var5;
               (var5 = (vdtt_hf)this.m.elementAt(var6)).a(this);
               if (var5.p()) {
                  this.m.removeElement(var5);
               }
            }

            if (this.id > 2) {
               if (this.dir == 2) {
                  this.g = true;
                  return;
               }

               this.g = false;
            }
         }
      } catch (Exception var3) {
      }

   }

   public final void paintTop(Graphics var1) {
      try {
         if (this.status != 6 && !Utlis.e()) {
            if (this.p > 0) {
               if (this.p % 2 == 0) {
                  var1.a(1.2F, 0.5F);
               }

               --this.p;
            }

            int var2 = this.cy;
            if (this.id == 48) {
               vdtt_cz.a(var1, 5, 0, this.cx, var2, 33);
               vdtt_dd.b(vdtt_dd.d, var1, Caption.sH + " " + GameSrc.gI().zoneID, this.cx, var2 - 38, 2, -6488, -10275328);
            } else {
               if (this.o()) {
                  var2 -= 3;
                  short var3 = this.getNpcTemplate().g;
                  short var4 = this.getNpcTemplate().h;
                  vdtt_y.a(var1, var3, 0, this.cx, var2, var4, Graphics.s(), 3);
               }

               vdtt_fe var7 = this.getNpcTemplate().b[this.l];
               if (this.v()) {
                  this.g = false;
               }

               boolean var8 = true;
               var1.k = var8;

               for(int var5 = 0; var5 < var7.a.length; ++var5) {
                  if (this.g) {
                     vdtt_cz.b(var1, var7.a[var5].a, var7.a[var5].a(this.g), this.cx - var7.a[var5].c, var2 + var7.a[var5].d, 33);
                  } else {
                     vdtt_cz.b(var1, var7.a[var5].a, var7.a[var5].a(this.g), this.cx + var7.a[var5].c, var2 + var7.a[var5].d, 33);
                  }
               }

               var8 = false;
               var1.k = var8;
               var1.r();
            }
         }
      } catch (Exception var6) {
      }

   }

   public final vdtt_ff q() {
      try {
         return this.getNpcTemplate().b[this.getNpcTemplate().a[4][0]].a[0];
      } catch (Exception var2) {
         return null;
      }
   }

   public final String strTop() {
      return Utlis.c(this.getNpcTemplate().hp);
   }

   public final String strBottom() {
      return this.getNpcTemplate().name;
   }

   public final void paintBottom(Graphics var1) {
      if (this.id != 48 && GameSrc.gI().bQ <= 0 && this.status != 4 && this.status != 6) {
         short var2 = -1;
         if (this.equals(GameSrc.gI().focusEntity)) {
            var2 = -6488;
         }

         int var3 = this.cy - this.height + 2;
         if (this.id >= 2) {
            if (!DataCenter.aj) {
               if (this.w()) {
                  var3 -= 10;
                  vdtt_dd.a(var1, this.getNpcTemplate().name, this.cx, var3, 2, -2560);
               } else if (this.o()) {
                  String var4 = this.getNpcTemplate().name + Caption.io + (GameSrc.gI().capCayTao + 1);
                  var3 -= 10;
                  vdtt_dd.a(var1, var4, this.cx, var3, 2, var2);
                  int var5 = 5 + GameSrc.gI().capCayTao;
                  int var6 = x();
                  var4 = Caption.sX + var6 + "/" + var5;
                  var3 -= 10;
                  vdtt_dd.a(var1, var4, this.cx, var3, 2, -2560);
                  int var7;
                  if ((var7 = var5 * 60 - (Utlis.c() - GameSrc.gI().timeCayTao)) < 0) {
                     var7 = 0;
                  }

                  if (var6 < var5) {
                     var4 = Utlis.f(var7);
                     var3 -= 10;
                     vdtt_dd.a(var1, var4, this.cx, var3, 2, -16711681);
                  }
               } else {
                  var3 -= 10;
                  vdtt_dd.a(var1, this.getNpcTemplate().name, this.cx, var3, 2, var2);
               }
            }

            if (this.getNpcTemplate().detail != null && this.getNpcTemplate().detail.length() > 0) {
               var3 -= 10;
               vdtt_dd.a(var1, this.getNpcTemplate().detail, this.cx, var3, 2, -16712072);
            }
         }

         if (GameSrc.gI().focusEntity != null && GameSrc.gI().focusEntity.equals(this) || this.w()) {
            var3 -= 10;
            GameSrc.gI().bn.setXY(this.cx, var3);
            GameSrc.gI().bn.paintTop(var1);
         }

         if (this.n != null) {
            this.n.a(var1);
         }
      }

   }

   public final int prioritize() {
      if (this.id != 48 && !this.o()) {
         if (this.s()) {
            return 6;
         } else {
            return this.r() ? 4 : 3;
         }
      } else {
         return 4;
      }
   }

   public final boolean r() {
      return this.id == 47;
   }

   public final boolean s() {
      return this.id == 48 || this.w();
   }

   private boolean w() {
      return this.id == 40 || this.id == 42 || this.id == 43 || this.id == 44 || this.id == 45 || this.id == 46;
   }

   public final boolean v() {
      return this.o() || this.id == 47 || this.id == 48 || this.w();
   }

   private static int x() {
      int var0 = 5 + GameSrc.gI().capCayTao;
      int var1;
      if ((var1 = (Utlis.c() - GameSrc.gI().timeCayTao) / 60) > var0) {
         var1 = var0;
      }

      return var1;
   }
}

package gro;

import java.util.Vector;

public final class vdtt_ju extends vdtt_ap {
   public Item[] a;
   public vdtt_hq[] b;
   private vdtt_ay Q;
   private vdtt_ay R;
   public int c = 0;
   public vdtt_hf d;
   public vdtt_bd M;
   public vdtt_bd N;
   public Item O;
   public boolean P;
   private String S = "";
   private int T;
   private int U = 60;

   public vdtt_ju(MainScreen var1, Item var2) {
      this.H = var1;
      this.e = 2;
      this.a(240, 180);
      this.a = new Item[1];
      this.a[0] = var2;
      this.b = new vdtt_hq[2];
      this.b[0] = new vdtt_hq((byte)1, 14, this.f() - 5, 30, 30, 30, 1, 1);
      this.b[1] = new vdtt_hq((byte)1, 104, this.f() - 5, 30, 30, 30, 1, 1);
      this.Q = this.a(this.width - 70, this.height - 29, Caption.tK, this, 300, -8);
      this.R = this.a(this.width - 70, this.height - 29, Caption.tN, this, 301, -8);
      vdtt_hm var3 = new vdtt_hm(1003, new String[]{""});
      this.M = this.a(44, this.f() + 35, 180, var3.c.length, var3, this, 0);
      this.M.b(true);
      this.M.a(0);
      this.N = this.a(44, this.f() + 57, 180, var3.c.length, var3, this, 0);
      this.N.b(true);
      this.N.a(0);
      this.w();
   }

   public final void w() {
      if (this.a[0] != null) {
         ItemOption[] var1 = this.a[0].L();
         Vector var2;
         (var2 = new Vector()).add(this.a[0].getItemTemplate());

         for(int var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3].getItemOptionTemplate().type == 14) {
               DataCenter.gI();
               var2.add(DataCenter.b(var1[var3].getItemOptionTemplate().text));
            }
         }

         Vector var9 = new Vector();
         String[] var4 = new String[var2.size()];
         short[] var5 = new short[var2.size()];

         int var6;
         for(var6 = 0; var6 < var2.size(); ++var6) {
            var4[var6] = ((ItemTemplate)var2.get(var6)).name;
            var5[var6] = ((ItemTemplate)var2.get(var6)).id;
            DataCenter.gI();
            ItemTemplate var7;
            if ((var7 = DataCenter.b(var4[var6])) != null && (var7.detail.trim().length() == 0 || !var7.detail.equals("Cải trang không có kỹ năng"))) {
               var9.add(var7);
            }
         }

         if ((var6 = var4.length) > 5) {
            var6 = 5;
         }

         vdtt_hm var10 = new vdtt_hm(1003, var5, var4);
         this.M.O = true;
         this.M.a(var10, var6);
         this.M.a(0);
         this.M.b(false);
         if (var9.size() != 0) {
            var4 = new String[var9.size()];
            var5 = new short[var9.size()];

            for(int var8 = 0; var8 < var9.size(); ++var8) {
               var4[var8] = Caption.vr + ((ItemTemplate)var9.get(var8)).name;
               var5[var8] = ((ItemTemplate)var9.get(var8)).id;
            }

            if ((var6 = var4.length) > 5) {
               var6 = 5;
            }

            var10 = new vdtt_hm(1003, var5, var4);
            this.N.O = true;
            this.N.a(var10, var6);
            this.N.a(0);
            this.N.b(false);
            return;
         }

         this.N.b(true);
      } else {
         this.N.b(true);
         this.M.b(true);
      }

   }

   public final void a_() {
      if (Utlis.c() > GameSrc.gI().cW) {
         this.Q.b(true);
         this.R.b(false);
      } else {
         this.Q.b(false);
         this.R.b(true);
      }

      if (this.a[0] != null) {
         this.M.b(false);
      } else {
         this.M.b(true);
      }

      for(int var1 = 0; var1 < this.b.length; ++var1) {
         this.b[var1].a();
      }

      if (this.d != null) {
         this.d.o();
         if (this.d.p()) {
            this.d = null;
         }
      }

      if (this.c > 0) {
         --this.c;
      }

   }

   public final void b(Graphics var1) {
      this.e(var1);
      if (this.P && (this.c > 0 && DataCenter.gI().h % 12 > 6 || this.c == 0)) {
         vdtt_dd.b(vdtt_dd.d, var1, Caption.qZ, this.b[0].cx, this.M.cy, 0, -2560, -16777216);
      }

      if (this.a[0] != null) {
         vdtt_dd.b(vdtt_dd.d, var1, Caption.bI, this.b[0].cx - 5, this.M.cy + 9, 0, -10831436, -16777216);
         vdtt_dd.b(vdtt_dd.d, var1, Caption.vq, this.b[0].cx - 5, this.N.cy + 9, 0, -10831436, -16777216);
         int var2 = Utlis.c();
         if (GameSrc.gI().cW > var2) {
            vdtt_dd.b(vdtt_dd.d, var1, Caption.tP + Utlis.e((long)GameSrc.gI().cW * 1000L), this.M.cx, this.M.cy + 52, 0, -2560, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, Caption.tQ, this.M.cx, this.M.cy + 66, 0, -30976, -16777216);
            if (GameSrc.gI().cX > var2) {
               vdtt_dd.b(vdtt_dd.d, var1, Caption.tR + Utlis.f(GameSrc.gI().cX - var2), this.M.cx, this.M.cy + 80, 0, -30976, -16777216);
            }
         } else {
            vdtt_dd.b(vdtt_dd.d, var1, Utlis.b(Caption.tL, Utlis.c(this.U)), this.M.cx, this.M.cy + 52, 0, -30976, -16777216);
            vdtt_dd.b(vdtt_dd.d, var1, Caption.tM, this.M.cx, this.M.cy + 66, 0, -30976, -16777216);
         }

         try {
            if (this.O == null || !this.S.equals(this.a[0].strData)) {
               this.S = this.a[0].strData;
               this.O = this.a[0].a();
               String var3 = this.M.M[this.M.n.b].toLowerCase();
               Vector var4 = new Vector();
               ItemOption[] var5 = this.O.L();

               int var6;
               for(var6 = 0; var6 < var5.length; ++var6) {
                  if (!var5[var6].getItemOptionTemplate().text.toLowerCase().equals(var3)) {
                     var4.add(var5[var6]);
                  }
               }

               for(var6 = 0; var6 < DataCenter.gI().itemOptionTemplate.length; ++var6) {
                  if (DataCenter.gI().itemOptionTemplate[var6].text.toLowerCase().equals(this.O.getItemTemplate().name.toLowerCase())) {
                     var4.add(new ItemOption(DataCenter.gI().itemOptionTemplate[var6].id + ",0,0"));
                  }
               }

               for(var6 = 0; var6 < DataCenter.gI().itemTemplate.length; ++var6) {
                  if (DataCenter.gI().itemTemplate[var6].name.toLowerCase().equals(var3)) {
                     this.O.id = DataCenter.gI().itemTemplate[var6].id;
                     break;
                  }
               }

               this.O.strData = Item.a(var4);
            }
         } catch (Exception var7) {
         }
      } else if (!this.P) {
         this.O = null;
      }

      vdtt_cz.a(var1, 95, 0, 65 - DataCenter.gI().h / 3 % 3, this.f(), 20);
      a(var1, this.b[0].cx, this.b[0].cy, this.a[0], this.b[0].k >= 0, Caption.bb);
      a(var1, this.b[1].cx, this.b[1].cy, this.O, this.b[1].k >= 0, Caption.qt);
      if (this.d != null) {
         this.d.b(var1, this.b[1].cx + this.b[1].h / 2, this.b[1].cy + this.b[1].h / 2);
      }

   }

   public final Vector g() {
      Vector var1 = super.g();

      for(int var2 = 0; var2 < this.b.length; ++var2) {
         var1.addElement(this.b[var2].a(1001 + var2, this));
      }

      var1.addElement(new vdtt_hi(0, 0, 0, this.width, this.height, this.I, this));
      return var1;
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      super.a(var1, var2, var3);
      switch(var1.b) {
      case 300:
         this.a(false);
         return;
      case 301:
         DataCenter.gI().currentScreen.a(Utlis.b(Caption.tO, "" + this.U), 2002, this);
         return;
      case 1001:
         this.T = 1;
         this.a(var1.j, var1.j.k);
         this.k = a(var1, this, this.a[0]);
         if (this.a[0] == null) {
            boolean var7 = true;
            if (this.P) {
               this.P = false;
               this.O = null;
            }

            DataCenter.gI().currentScreen.c(Caption.po, -1);
            return;
         }
         break;
      case 1002:
         this.T = 10;
         this.a(var1.j, var1.j.k);

         try {
            Message var4;
            (var4 = Message.c((byte)13)).writeByte(this.a[0].w);
            var4.writeShort(this.a[0].index);
            var4.writeShort(this.M.d());
            var4.writeShort(this.N.d());
            var4.send();
            return;
         } catch (Exception var5) {
            return;
         }
      case 2001:
         this.a(false);
         return;
      case 2002:
         try {
            Message.c((byte)-24).send();
            return;
         } catch (Exception var6) {
         }
      }

   }

   public final void b(int var1, Object var2, vdtt_x var3) {
      if (var1 == 1003) {
         this.O = null;
      }

   }

   private void a(vdtt_hp var1, int var2) {
      for(int var3 = 0; var3 < this.b.length; ++var3) {
         this.b[var3].k = -1;
      }

      var1.k = var2;
   }

   private void a(boolean var1) {
      try {
         if (this.P) {
            this.c = 50;
         } else if (this.O == null) {
            DataCenter.gI().currentScreen.c(Caption.po, -65536);
         } else {
            Message var2;
            (var2 = Message.c((byte)14)).writeByte(this.a[0].w);
            var2.writeShort(this.a[0].index);
            var2.writeShort(this.M.d());
            var2.writeShort(this.N.d());
            var2.send();
         }
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }

   public final void b(int var1, Object var2) {
   }
}

package gro;

import java.util.Vector;

public final class vdtt_ce extends MainScreen {
   private final int H = 25;
   private int I = 625;
   private int J = 344;
   private float K = 1.0F;
   public int d;
   private int L;
   private final vdtt_mb M;
   private int N;
   private float O;
   private int P;
   private int Q;

   public vdtt_ce(int var1, String var2, String var3) {
      this.d = var1;
      float var4 = (float)DataCenter.gI().n / (float)this.I;
      float var5 = (float)DataCenter.gI().o / (float)this.J;
      this.K = var4 > var5 ? var4 : var5;
      Vector var6 = new Vector();
      String[] var7 = Utlis.a(var3, "\\n");
      String var8 = "";
      var8 = "c#yellow" + var2 + "\nc#white" + var8;
      var6.addElement(new vdtt_hn(new Vector(), var8, (byte)2, ""));

      for(int var9 = 0; var9 < var7.length; ++var9) {
         String[] var10;
         if ((var10 = var7[var9].split("@")).length == 1) {
            var8 = var7[var9].replaceAll("#", "c#green" + Char.gI().name + "c#white").replaceAll("\\$", "c#blue" + DataCenter.gI().dataNameChar[Char.gI().sys].name + "c#white").replaceAll("\\*", Caption.Ac[Char.gI().gioiTinh]).replaceAll("\\&", Caption.Ad[Char.gI().gioiTinh]).replaceAll("\\^", Caption.Ae[Char.gI().gioiTinh]).replaceAll("\\%", Caption.Af[Char.gI().gioiTinh]).replaceAll("\\~", Caption.Ag[Char.gI().gioiTinh]).replaceAll("\\_", Caption.Ah[Char.gI().gioiTinh]);
            var6.addElement(new vdtt_hn(Char.gI().bd, var8, (byte)2, ""));
         } else {
            var8 = (var8 = var10[1]).replaceAll("#", "c#green" + Char.gI().name + "c#white").replaceAll("\\$", "c#blue" + DataCenter.gI().dataNameChar[Char.gI().sys].name + "c#white").replaceAll("\\*", Caption.Ac[Char.gI().gioiTinh]).replaceAll("\\&", Caption.Ad[Char.gI().gioiTinh]).replaceAll("\\^", Caption.Ae[Char.gI().gioiTinh]).replaceAll("\\%", Caption.Af[Char.gI().gioiTinh]).replaceAll("\\~", Caption.Ag[Char.gI().gioiTinh]).replaceAll("\\_", Caption.Ah[Char.gI().gioiTinh]);
            int var11;
            if ((var11 = Integer.parseInt(var10[0])) >= 0) {
               Npc var12 = new Npc((byte)0, var11, 0, 0);
               var6.addElement(new vdtt_hn(var12.getNpcTemplate().b[0], var8, (byte)0, var12.getNpcTemplate().name));
            } else {
               var6.addElement(new vdtt_hn(Char.gI().aa(), var8, (byte)1, Char.gI().name));
            }
         }
      }

      this.M = new vdtt_mb(this, var6, -3);
      this.a(this.M);
      this.N = 0;
   }

   public final void j() {
   }

   public final void k() {
   }

   public final void b(int var1, Object var2, vdtt_x var3) {
   }

   public final void b(int var1, Object var2) {
   }

   public final void b(Graphics var1) {
      if (AppListener.gI().f > 0) {
         --AppListener.gI().f;
         if (AppListener.gI().f == 0) {
            DataCenter.gI().g();
            return;
         }
      }

      if (this.d == 0) {
         ++this.N;
         this.O = (float)this.N / 25.0F;
         if (this.O > 1.0F) {
            this.O = 1.0F;
         }

         mImage var2;
         if ((var2 = (mImage)AppListener.e.get(7)) != null) {
            this.P = (int)(this.O * (float)DataCenter.gI().n);
            this.Q = (int)(this.O * (float)DataCenter.gI().o);
            var1.a(var2, 0, 0, var2.c, var2.d, DataCenter.gI().n - this.P, DataCenter.gI().n / 2, DataCenter.gI().o / 2, this.P * DataCenter.gI().r, this.Q * DataCenter.gI().r, 3);
         }
      }

   }

   public final void a_() {
      if (this.N == 1) {
         vdtt_aa.gI().a(86);
         vdtt_aa var1;
         if (!(var1 = vdtt_aa.gI()).a) {
            var1.a(var1.b[6]);
         }
      }

      GameSrc.gI().a_();
      if (this.L > 0) {
         --this.L;
         if (this.L == 0) {
            DataCenter var5 = DataCenter.gI();
            GameSrc var2 = GameSrc.gI();
            var5.currentScreen = var2;

            try {
               if (this.d == 0) {
                  Message.c((byte)-123).send();
               }
            } catch (Exception var4) {
               Utlis.a(var4);
            }
         }
      } else if (!(super.c instanceof vdtt_mb)) {
         this.L = 1;
      }

      DataCenter.gI().pointHelper.b = false;
   }

   public final void c() {
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
   }
}

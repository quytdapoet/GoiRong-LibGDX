package gro;

public abstract class vdtt_ap extends vdtt_ak {
   public vdtt_ap() {
      this.e = 1;
   }

   public final void e(Graphics var1) {
      this.a(var1, 0, 0, this.width, this.height, 61, 22, 23, 1, 1);
   }

   public void d() {
      super.d();
      if ((this instanceof vdtt_jo || this instanceof vdtt_ka || this instanceof SettingsTab || this instanceof vdtt_kf || this instanceof vdtt_mm || this instanceof vdtt_ms || this instanceof PhucLoiScreen || this instanceof vdtt_jf || this instanceof vdtt_lw) && !this.K) {
         vdtt_aa.gI().w();

         try {
            vdtt_ii var1;
            if ((var1 = GameSrc.gI().T()) != null && var1.a == 43 && (GameSrc.gI().idTask == 1 && this instanceof vdtt_jy || GameSrc.gI().idTask == 3 && GameSrc.gI().idStep == 0 && this instanceof SettingsTab || GameSrc.gI().idTask == 5 && (GameSrc.gI().idStep == 0 && (this instanceof vdtt_jf || this instanceof vdtt_je) || GameSrc.gI().idStep == 3 && this instanceof vdtt_jy))) {
               GameSrc.gI();
               GameSrc.o(92);
            }

            return;
         } catch (Exception var2) {
         }
      }

   }

   public final void c() {
      super.c();
      if (this.o.a[24]) {
         GameSrc.gI();
         GameSrc.N();
      }

   }

   protected final void y() {
      if (this.L != null) {
         int var1 = this.cx + this.L.cx + 5;
         int var2 = this.cy + this.L.cy;
         DataCenter.gI().pointHelper.b(var1, var2 + 5);
      }

   }
}

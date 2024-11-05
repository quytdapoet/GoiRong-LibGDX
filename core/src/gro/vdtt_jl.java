package gro;

import com.badlogic.gdx.Input.Keys;

final class vdtt_jl implements vdtt_s {
   final vdtt_hi a;
   final SettingsTab b;

   vdtt_jl(SettingsTab var1, vdtt_hi var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void a(vdtt_by var1) {
   }

   public final void b(vdtt_by var1) {
      SettingsTab.a(this.b, -1);
      if (var1.i().trim() != "") {
         char var2;
         if ((var2 = var1.i().toUpperCase().charAt(0)) < 'A' || var2 > 'Z') {
            vdtt_gq.gI().a(Caption.pw, vdtt_dd.d, -2560);
            return;
         }

         short var3 = (short)Keys.valueOf(var1.i().toUpperCase());
         String var4 = var1.i().toUpperCase();

         for(int var5 = 0; var5 < SettingsTab.a(this.b).length; ++var5) {
            if (var5 != this.a.b && SettingsTab.a(this.b)[var5] == var3) {
               vdtt_gq.gI().a(Utlis.b(Caption.uA, var4), vdtt_dd.d, -65536);
               return;
            }
         }

         SettingsTab.a(this.b)[this.a.b] = var3;
         SettingsTab.b(this.b)[this.a.b].l = var4;
         SettingsTab.c(this.b);
         SettingsTab.d(this.b);
         mInputProcessor.a();
         SettingsTab.a(this.b, -1);
      }

   }
}

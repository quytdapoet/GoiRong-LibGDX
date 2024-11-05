package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.TextInputListener;
import com.badlogic.gdx.utils.StringBuilder;

final class vdtt_z implements TextInputListener {

    final vdtt_by a;

    vdtt_z(vdtt_by var1) {
        this.a = var1;
    }

    public final void input(String var1) {
        vdtt_y.a(false);
        if (Gdx.app.getType() == ApplicationType.Android && !var1.equals(this.a.i())) {
            StringBuilder var2 = new StringBuilder();

            for (int var3 = 0; var3 < var1.length(); ++var3) {
                int var4 = -1;
                int var5 = -1;

                int var6;
                for (var6 = 0; var6 < vdtt_y.b().length; ++var6) {
                    if (var1.charAt(var3) == vdtt_y.b()[var6]) {
                        var5 = var6;
                        break;
                    }
                }

                try {
                    if (var5 >= 0) {
                        for (var6 = 0; var6 < vdtt_y.c().length; ++var6) {
                            if (var1.charAt(var3 + 1) == vdtt_y.c()[var6]) {
                                var4 = var6;
                            }
                        }
                    }

                    if (var5 != -1 && var4 != -1) {
                        var2.append(vdtt_y.d()[var5][var4]);
                        ++var3;
                    } else {
                        var2.append(var1.charAt(var3));
                    }
                } catch (Exception var9) {
                    var2.append(var1.charAt(var1.length() - 1));
                }
            }

            var1 = var2.toString();
        }

        this.a.a(var1);
        if (this.a.U) {
            GameSrc.gI();
            vdtt_by var10 = this.a;

            try {
                if ((var1 = var10.i()).length() > 0) {
                    var10.a("");
                    GameSrc.a(var1);
                }

                return;
            } catch (Exception var8) {
                Utlis.a(var8);
            }
        }

    }

    public final void canceled() {
        vdtt_y.a(false);
    }
}

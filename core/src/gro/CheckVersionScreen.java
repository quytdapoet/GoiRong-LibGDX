package gro;

import com.badlogic.gdx.*;
import com.badlogic.gdx.Application.ApplicationType;

import java.io.IOException;
import java.util.Vector;

public final class CheckVersionScreen extends vdtt_cd {

    public vdtt_lg I;
    private String M;
    public static boolean J;
    public static boolean K;
    private Vector N = new Vector();
    private long O = 0L;
    public boolean[] L = new boolean[3];
    private boolean P = true;
    private int Q;
    private static boolean R = false;
    private boolean S;

    public CheckVersionScreen() {
        vdtt_aa.gI();
        AppListener.d();
        if (DataCenter.k()) {
            byte[] var1 = vdtt_y.d("gad");
            Binary.a("gad", var1);
            Binary.a(vdtt_y.d("z" + (DataCenter.gI().r - 2)), false);
            DataCenter.gI().b(true);
        }

        Graphics.e();
        this.M = Utlis.e(DataCenter.gI().ver2);
        boolean var2 = Binary.g("arr_savemap");
        Binary.j("arr_savemap" + vdtt_y.a());
        DataCenter.gI().a(var2);
    }

    private static boolean a(Vector var0, int var1, String[] var2) {
        vdtt_ek var3 = new vdtt_ek();

        try {
            String[] var4 = var2[var1].split(";");
            var3.a = Short.parseShort(var4[0]);
            var3.d = var4[1].trim();
            var3.e = var4[2].trim();
            long var5 = (long) Binary.f("arr_check_" + var3.a);
            var3.c = var5;
            var5 = 1L;
            var3.b = var5;
            if (!var3.b() && !var3.c() && !var3.d() && !var3.e()) {
                if (var3.a()) {
                    var5 = (long) Integer.parseInt(var4[3].trim());
                    var3.b = var5;
                } else {
                    DataCenter.gI();
                    var5 = (long) Integer.parseInt(var4[3 + DataCenter.a(var3.d)].trim());
                    var3.b = var5;
                }

                var0.add(var3);
            } else {
                var5 = var3.b;
                var3.c = var5;
            }
        } catch (Exception var7) {
        }

        return true;
    }

    public static Vector v() {
        Vector var0 = new Vector();
        String var1;
        if (null == Gdx.app.getType()) {
            var1 = DataCenter.gI().URL_IMG;
        } else {
            switch (Gdx.app.getType()) {
                case Android:
                    var1 = DataCenter.gI().URL_CHECK_IOS;
                    break;
                case iOS:
                    var1 = DataCenter.gI().URL_CHECK_PC;
                    break;
                default:
                    var1 = DataCenter.gI().URL_IMG;
                    break;
            }
        }

        var1 = Binary.a(var1, 20);
        String[] var2 = new String[2];
        if (var1 == null) {
            if (Gdx.app.getType() == ApplicationType.Desktop) {
                (var2 = new String[8])[2] = "1;font.zip;font_zip";
                var2[3] = "2;mapmini.zip;map_mini_zip";
                var2[4] = "3;map.zip;map_zip";
                var2[5] = "4;mapscale.zip;mapscale_zip";
                var2[6] = "5;iconTree.zip;tree_zip";
                var2[7] = "6;iconClient.zip;client_zip";
                var2[8] = "7;iconChar.zip;char_zip";
            }

            var2[0] = DataCenter.gI().ver2 + ";" + DataCenter.gI().ver2 + ";" + DataCenter.gI().ver2;
            var2[1] = "0;arr_data_game.bin;arr_data_game";
        } else {
            var2 = var1.split("\r\n");
        }

        int var3 = Integer.parseInt(var2[0].split(";")[0]);
        DataCenter.gI().c(DataCenter.gI().ver2 > var3);
        if (DataCenter.aj) {
            Utlis.b = 120000;
        }

        var0.clear();
        if (!DataCenter.k()) {
            for (var3 = 1; var3 < var2.length; ++var3) {
                a(var0, var3, var2);
            }
        }

        return var0;
    }

    private void w() {
        vdtt_bg var1;
        (var1 = new vdtt_bg(Caption.AX, this, 0, 2112)).a = this;
        var1.a(Caption.fG);
        var1.w();
        this.a(var1);
    }

    private void x() {
        for (int var1 = 0; var1 < this.N.size(); ++var1) {
            if (!((vdtt_ek) this.N.get(var1)).f) {
                return;
            }
        }

        this.y();
    }

    public final void a(vdtt_hi var1, int var2, int var3) {
        super.a(var1, var2, var3);
        if (var1.b == 2112) {
            this.P = true;
            DataCenter.gI().a(false);
            if (Utlis.b < 120000) {
                Utlis.b += 20000;
                return;
            }
        } else if (var1.b == 2111) {
            this.update();
        }

    }

    public void update() {
        this.I = new vdtt_lg(this);
        long var1 = this.O;
        int var3 = (int) (var1 / 1024L);
        vdtt_lh var4 = this.I.a;
        if (var3 < 100) {
            var3 = 100;
        }

        var4.d = var3;
        Session.gI().countSend = 0;

        for (var3 = 0; var3 < this.N.size(); ++var3) {
            vdtt_ek var5;
            if (!(var5 = (vdtt_ek) this.N.get(var3)).f) {
                if (var5.d.contains("iconTreeZip") && !this.L[1] || var5.d.contains("iconCharZip") && !this.L[2]) {
                    var5.f = true;
                    this.x();
                } else if (var5.a()) {
                    (new Thread(new vdtt_cl(this, var5))).start();
                } else {
                    (new Thread(new vdtt_cm(this, var5))).start();
                }
            }
        }

    }

    private void y() {
        this.S = true;
        if (this.I != null) {
            this.I.a(true);
        }

    }

    public final void a_() {
        super.a_();
        if (this.I != null) {
            if (!this.S) {
                if (this.b.size() == 1 && !this.P) {
                    vdtt_lh var1 = this.I.a;
                    int var2 = Session.gI().countSend / 1024;
                    if (var1.c < var2) {
                        var1.c = var2;
                    } else {
                        var1.c += var1.d / 10000;
                    }

                    if (var1.c > var1.d * 99 / 100) {
                        var1.c = var1.d * 99 / 100;
                    }
                }
            } else {
                this.I.a_();
            }
        }

        if (this.P) {
            DataCenter.gI();
            if (DataCenter.a()) {
                this.P = false;
                (new Thread(new vdtt_cn(this))).start();
            }
        }

    }

    public final void b(Graphics var1) {
        DataCenter.n();
        if (d.size() == 0) {
            if (AppListener.e.size() > 2) {
                ++this.Q;
                if (this.Q == DataCenter.gI().n) {
                    this.Q = 0;
                }

                mImage var2 = (mImage) AppListener.e.get(1);
                var1.a(var2, 0, 0, var2.c, var2.d, 0, 0 - this.Q, 0, DataCenter.gI().n * DataCenter.gI().r, DataCenter.gI().o * DataCenter.gI().r, 0);
                var1.a(var2, 0, 0, var2.c, var2.d, 0, DataCenter.gI().n - this.Q, 0, DataCenter.gI().n * DataCenter.gI().r, DataCenter.gI().o * DataCenter.gI().r, 0);
            }
        } else {
            super.b(var1);
        }

        if (this.I != null) {
            this.I.b(var1);
        }

        this.a(var1, 0, 0);
        if (this.I != null && this.O > 0L) {
            StringBuilder var4 = (new StringBuilder()).append(Caption.fK);
            int var3 = Session.gI().countSend / 1024;
            vdtt_dd.a(var1, var4.append(var3 / 1024 + "." + var3 % 1024 / 102 + "MB").toString(), 8 + AppListener.gI().m / 2, 8, 0, -1);
        } else if (super.c instanceof CheckVersionScreen) {
            DataCenter.n();
            vdtt_dd.a(var1, Caption.vT, this.width / 2, this.height - 35, 2, -2560);
        }

        if (!DataCenter.k()) {
            vdtt_dd.a(var1, Caption.fL + this.M, this.width - 8 - AppListener.gI().m / 2, 8, 1, -1);
        }

    }

    static void a(CheckVersionScreen var0) {
        var0.w();
    }

    static void b(CheckVersionScreen var0) {
        var0.x();
    }

    static void c(CheckVersionScreen var0) {
        var0 = var0;

        try {
            Utlis.g();
            Session.gI().countSend = 0;
            var0.O = 0L;
            var0.N = v();
            if (R) {
                R = false;
                AppListener.gI().a(false);
            }

            for (int var1 = 0; var1 < var0.N.size(); ++var1) {
                vdtt_ek var2;
                if ((var2 = (vdtt_ek) var0.N.get(var1)).c != -1L && var2.b != 0L && var2.b != var2.c) {
                    System.out.println(var2);
                    var0.O += var2.b;
                    if (var2.a()) {
                        DataCenter.gI().aO = false;
                    }
                } else {
                    var2.f = true;
                }
            }

            if (var0.O <= 0L) {
                var0.I = new vdtt_lg(var0);
                var0.y();
                return;
            }

            long var7 = var0.O / 1024L;
            boolean var3 = true;
            String[] var4;
            (var4 = new String[Caption.AW.length])[0] = Utlis.b(Caption.AW[0], var7 / 1024L + "." + var7 % 1024L / 102L + "MB");
            var4[1] = Caption.AW[1];
            (new vdtt_bg(var4, var0, 0, 2111)).a = var0;
            var0.update();
        } catch (Exception var6) {
            var0.w();
        }

    }
}

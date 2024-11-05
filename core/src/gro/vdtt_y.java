package gro;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Pixmap.Blending;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Vector;

public final class vdtt_y {

    private static final int[] c = new int[]{768, 769, 771, 777, 803};
    private static final char[] d = new char[]{'a', 'ă', 'â', 'e', 'ê', 'i', 'y', 'o', 'ô', 'ơ', 'u', 'ư'};
    private static final char[][] e = new char[][]{{'à', 'á', 'ã', 'ả', 'ạ'}, {'ằ', 'ắ', 'ẵ', 'ẳ', 'ặ'}, {'ầ', 'ấ', 'ẫ', 'ẩ', 'ậ'}, {'è', 'é', 'ẽ', 'ẻ', 'ẹ'}, {'ề', 'ế', 'ễ', 'ể', 'ệ'}, {'ì', 'í', 'ĩ', 'ỉ', 'ị'}, {'ỳ', 'ý', 'ỹ', 'ỷ', 'ỵ'}, {'ò', 'ó', 'õ', 'ỏ', 'ọ'}, {'ồ', 'ố', 'ỗ', 'ổ', 'ộ'}, {'ờ', 'ớ', 'ỡ', 'ở', 'ợ'}, {'ù', 'ú', 'ũ', 'ủ', 'ụ'}, {'ừ', 'ứ', 'ữ', 'ử', 'ự'}};
    public static vdtt_v a;
    private static boolean f;
    private static Object g = new Object();
    public static boolean b;

    public static String a() {
        return "";
    }

    public static String a(String var0) {
        var0 = b(var0);
        return Binary.a + var0;
    }

    public static String b(String var0) {
        if (var0.startsWith("char_icon_")) {
            var0 = "ca" + var0.substring(10);
        } else if (var0.startsWith("client_icon_")) {
            var0 = "ci" + var0.substring(12);
        } else if (var0.startsWith("mapmini_")) {
            var0 = "mi" + var0.substring(8);
        } else if (var0.startsWith("mapsmall_")) {
            var0 = "ms" + var0.substring(9);
        } else if (var0.startsWith("tree_")) {
            var0 = "tr" + var0.substring(5);
        } else if (var0.startsWith("arr_check_")) {
            var0 = "ar" + var0.substring(10);
        } else if (var0.startsWith("arr_acc")) {
            var0 = "aa" + var0.substring(7);
        } else if (var0.startsWith("arr_binary")) {
            var0 = "ab" + var0.substring(10);
        } else if (var0.startsWith("arr_config")) {
            var0 = "ac" + var0.substring(10);
        } else if (var0.startsWith("arr_data_game")) {
            var0 = "gad" + var0.substring(13);
        } else if (var0.startsWith("arr_map_")) {
            var0 = "am" + var0.substring(8);
        } else if (var0.startsWith("arr_server")) {
            var0 = "as" + var0.substring(10);
        } else if (var0.startsWith("arr_auto")) {
            var0 = "at" + var0.substring(8);
        } else if (var0.startsWith("arr_skill_")) {
            var0 = "al" + var0.substring(10);
        } else if (var0.startsWith("shortcutItem")) {
            var0 = "st" + var0.substring(12);
        }

        return var0;
    }

    public static Reader c(String var0) {
        var0 = var0.substring(1);
        return new Reader(Utlis.h(var0).read());
    }

    private static mImage a(mImage var0, int var1) {
        var0 = mImage.a(var0, 0, 0, var0.c, var0.d, 0);
        if (var1 == -1) {
            return var0;
        } else {
            Color var2 = new Color();
            Color var3 = new Color();
            Color.argb8888ToColor(var2, var1);

            for (var1 = 0; var1 < var0.d; ++var1) {
                for (int var4 = 0; var4 < var0.c; ++var4) {
                    Color.rgba8888ToColor(var3, var0.b.getPixel(var4, var1));
                    if (var3.a > 0.0F) {
                        var2.a = var3.a;
                        a(var0, var4, var1, Color.rgba8888(var2));
                    }
                }
            }

            return var0;
        }
    }

    public static mImage a(mImage var0, int var1, int var2) {
        mImage var3;
        mImage var4;
        if (var2 == 0) {
            var3 = Binary.a(var0.c, var0.d);
            var4 = a(var0, var1);
            a(var3.b, var4, 0, 0, Blending.SourceOver);
            var4.a();
            return var3;
        } else {
            var3 = Binary.a(var0.c + 2, var0.d + 2);
            var4 = a(var0, var2);
            var0 = a(var0, var1);
            Pixmap var5;
            a(var5 = var3.b, var4, 1, 0, Blending.SourceOver);
            a(var5, var4, 0, 1, Blending.SourceOver);
            a(var5, var4, 1, 2, Blending.SourceOver);
            a(var5, var4, 2, 1, Blending.SourceOver);
            a(var5, var0, 1, 1, Blending.SourceOver);
            var4.a();
            var0.a();
            return var3;
        }
    }

    public static mImage b(mImage var0, int var1, int var2) {
        try {
            mImage var3;
            a((var3 = Binary.a(var1, var2)).b, var0, 0, 0, var0.c, var0.d, 0, 0, var1, var2, Blending.None);
            mImage var5 = var3;
            return var5;
        } catch (Exception var9) {
        } finally {
            var0.a();
        }

        return null;
    }

    public static void a(Graphics var0, mImage var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, boolean var14) {
        var6 = var4;
        var4 = DataCenter.gI().r;
        if (var14) {
            DataCenter.gI();
            var4 = DataCenter.j();
        }

        var6 *= var4;
        var7 = var5 * var4;
        var0.a(var1, var2, var3, var6, var7, var8, var9, var10, var11, var12, var13);
    }

    public static void a(Graphics var0, mImage var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        a(var0, var1, 0, 0, var4, 25, 0, 0, 0, 2, 2, var9, var10, 20, false);
    }

    public static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        vdtt_cz.a(var0, var1, var2, var3, var4, var5 * DataCenter.gI().r, var6 * DataCenter.gI().r, 0, 0, 0, 0, 20);
    }

    public static void b(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        vdtt_cz.a(var0, var1, var2, var3, var4, var5 * DataCenter.gI().r, var6 * DataCenter.gI().r, 0, 0, 0, 0, 20);
    }

    public static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
        vdtt_cz.a(var0, var1, var2, var3, var4, var5, 20);
    }

    public static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, byte var6) {
        vdtt_cz.a(var0, var1, var2, var3, var4, var5, var6);
    }

    public static int[] b(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
        return vdtt_cz.c(var0, var1, var2, var3, var4, var5 * DataCenter.gI().r, 0, 0, 0, 0, 0, 20);
    }

    public static void a(Graphics var0, int var1, int var2, int var3, int var4, int var5, float var6, int var7) {
        vdtt_cz.a(var0, var1, 0, var3, var4, var5, var6, 3);
    }

    public static void c(Graphics var0, int var1, int var2, int var3, int var4, int var5) {
        vdtt_cz.a(var0, 208, 0, var3, var4, 90, Graphics.s(), 20);
    }

    public static void c(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6) {
        vdtt_cz.a(var0, var1, var2, var3, var4, var5, Graphics.s(), 33);
    }

    public static void a(vdtt_by var0, String var1, String var2, int var3, int var4, boolean var5) {
        if (mConfig.gI().b(9) == 1) {
            if (!f) {
                f = true;
                Gdx.input.getTextInput(new vdtt_z(var0), var2, var1, "");
            }
        } else if (mConfig.gI().b(9) == 0) {
            if (DataCenter.gI().currentScreen.c instanceof vdtt_v) {
                return;
            }

            a = new vdtt_v(DataCenter.gI().currentScreen, var0, false, true);
            DataCenter.gI().currentScreen.a((vdtt_w) a);
            f = false;
        }

    }

    public static void a(vdtt_by var0, String var1, String var2, int var3, int var4) {
        a = new vdtt_v(DataCenter.gI().currentScreen, var0, false, false);
        DataCenter.gI().currentScreen.a((vdtt_w) a);
    }

    public static byte[] d(String var0) {
        Reader var1 = null;
        boolean var2 = false;

        byte[] var3;
        label107:
        {
            try {
                var2 = true;
                var3 = (var1 = c("/" + var0)).readFully();
                var2 = false;
                break label107;
            } catch (Exception var17) {
                Utlis.b("not found: " + var0);
                var2 = false;
            } finally {
                if (var2) {
                    try {
                        if (var1 != null) {
                            var1.close();
                        }
                    } catch (Exception var15) {
                        Utlis.a(var15);
                    }
                }

            }

            try {
                if (var1 != null) {
                    var1.close();
                }
            } catch (Exception var14) {
                Utlis.a(var14);
            }

            return null;
        }

        try {
            var1.close();
        } catch (Exception var16) {
            Utlis.a(var16);
        }

        return var3;
    }

    public static byte[] e(String var0) {
        Reader var1 = null;
        boolean var2 = false;

        byte[] var3;
        label107:
        {
            try {
                var2 = true;
                var3 = Utlis.a((var1 = c("/" + var0)).readFully());
                var2 = false;
                break label107;
            } catch (Exception var17) {
                Utlis.b("not found: " + var0);
                var2 = false;
            } finally {
                if (var2) {
                    try {
                        if (var1 != null) {
                            var1.close();
                        }
                    } catch (Exception var14) {
                        Utlis.a(var14);
                    }
                }

            }

            try {
                if (var1 != null) {
                    var1.close();
                }
            } catch (Exception var15) {
                Utlis.a(var15);
            }

            return null;
        }

        try {
            var1.close();
        } catch (Exception var16) {
            Utlis.a(var16);
        }

        return var3;
    }

    public static mImage f(String var0) {
        Reader var1 = null;
        boolean var2 = false;

        mImage var3;
        label107:
        {
            try {
                var2 = true;
                byte[] var4;
                Utlis.a(var4 = (var1 = c("/" + var0)).readFully());
                var3 = Binary.a(var4);
                MainScreen.a.addElement(var3);
                var3 = var3;
                var2 = false;
                break label107;
            } catch (Exception var18) {
                var2 = false;
            } finally {
                if (var2) {
                    try {
                        if (var1 != null) {
                            var1.close();
                        }
                    } catch (Exception var15) {
                        Utlis.a(var15);
                    }
                }

            }

            try {
                if (var1 != null) {
                    var1.close();
                }
            } catch (Exception var16) {
                Utlis.a(var16);
            }

            return null;
        }

        try {
            var1.close();
        } catch (Exception var17) {
            Utlis.a(var17);
        }

        return var3;
    }

    public static void a(Vector var0) {
        try {
            for (int var1 = 0; var1 < var0.size(); ++var1) {
                try {
                    mImage var2;
                    if ((var2 = (mImage) var0.get(var1)) != null) {
                        var2.a();
                    }
                } catch (Exception var3) {
                }
            }

            var0.clear();
        } catch (Exception var4) {
        }

    }

    public static void a(Hashtable var0) {
        try {
            Iterator var1 = var0.keySet().iterator();

            while (var1.hasNext()) {
                Object var2 = var1.next();

                try {
                    mImage var3;
                    if ((var3 = (mImage) var0.get(var2)) != null) {
                        var3.a();
                    }
                } catch (Exception var4) {
                }
            }

            var0.clear();
        } catch (Exception var5) {
        }

    }

    public static void a(mImage var0, int var1, int var2, int var3) {
        if (var0 != null && var0.b != null) {
            if (!b) {
                synchronized (g) {
                    var0.b.setBlending(Blending.None);
                    var0.b.drawPixel(var1, var2, var3);
                }
            } else {
                var0.b.drawPixel(var1, var2, var3);
            }
        }

    }

    public static void a(mImage var0, mImage var1, int var2, int var3, int var4, int var5) {
        Pixmap var6;
        if (var1 != null && var0 != null && (var6 = var1.b) != null && !var6.isDisposed()) {
            int var7 = var6.getWidth();
            int var8 = var6.getHeight();
            int var9 = (int) ((float) var7 * (float) var4 / 100.0F);
            var4 = (int) ((float) var8 * (float) var4 / 100.0F);
            if (0 + var7 > var6.getWidth()) {
                var7 = var6.getWidth() - 0;
            }

            if (0 + var8 > var6.getHeight()) {
                var8 = var6.getHeight() - 0;
            }

            if ((var5 & 2) != 0) {
                var3 -= var9 / 2;
            } else if ((var5 & 32) != 0) {
                var3 -= var4;
            }

            if ((var5 & 8) != 0) {
                var2 -= var9;
            } else if ((var5 & 1) != 0) {
                var2 -= var4 / 2;
            }

            a(var0.b, var1, 0, 0, var7, var8, var2, var3, var9, var4, Blending.SourceOver);
        }

    }

    public static void a(Pixmap var0, mImage var1, int var2, int var3, Blending var4) {
        Pixmap var5;
        if (var0 != null && !var0.isDisposed() && var1 != null && (var5 = var1.b) != null && !var5.isDisposed()) {
            if (!b) {
                synchronized (g) {
                    var0.setBlending(var4);
                    var0.drawPixmap(var5, var2, var3, 0, 0, var5.getWidth(), var5.getHeight());
                }
            } else {
                var0.drawPixmap(var5, var2, var3, 0, 0, var5.getWidth(), var5.getHeight());
            }
        }

    }

    public static void a(Pixmap var0, mImage var1, int var2, int var3, int var4, int var5, int var6, int var7, Blending var8) {
        Pixmap var9;
        if (var0 != null && !var0.isDisposed() && var1 != null && (var9 = var1.b) != null && !var9.isDisposed()) {
            if (var4 + var6 > var9.getWidth()) {
                var6 = var9.getWidth() - var4;
            }

            if (var5 + var7 > var9.getHeight()) {
                var7 = var9.getHeight() - var5;
            }

            if (!b) {
                synchronized (g) {
                    var0.setBlending(var8);
                    var0.drawPixmap(var9, var2, var3, var4, var5, var6, var7);
                }
            } else {
                var0.drawPixmap(var9, var2, var3, var4, var5, var6, var7);
            }
        }

    }

    public static void a(Pixmap var0, mImage var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Blending var10) {
        Pixmap var11;
        if (var0 != null && !var0.isDisposed() && var1 != null && (var11 = var1.b) != null && !var11.isDisposed()) {
            if (0 + var4 > var11.getWidth()) {
                var4 = var11.getWidth() - 0;
            }

            if (0 + var5 > var11.getHeight()) {
                var5 = var11.getHeight() - 0;
            }

            if (!b) {
                synchronized (g) {
                    var0.setBlending(var10);
                    var0.drawPixmap(var11, 0, 0, var4, var5, var6, var7, var8, var9);
                }
            } else {
                var0.drawPixmap(var11, 0, 0, var4, var5, var6, var7, var8, var9);
            }
        }

    }

    public static void b(Pixmap var0, mImage var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, Blending var10) {
        Pixmap var11;
        if (var0 != null && !var0.isDisposed() && var1 != null && (var11 = var1.b) != null && !var11.isDisposed()) {
            if (0 + var4 > var11.getWidth()) {
                var4 = var11.getWidth() - 0;
            }

            if (0 + var5 > var11.getHeight()) {
                var5 = var11.getHeight() - 0;
            }

            if (!b) {
                synchronized (g) {
                    var0.setBlending(var10);
                    var0.drawPixmap(var11, 0, 0, var4, var5, var6, var7, var8, var9);
                }
            } else {
                var0.drawPixmap(var11, 0, 0, var4, var5, var6, var7, var8, var9);
            }
        }

    }

    public static void a(Pixmap var0, Pixmap var1, int var2, int var3, int var4, int var5, Blending var6) {
        if (var0 != null && !var0.isDisposed() && var1 != null && !var1.isDisposed()) {
            if (!b) {
                synchronized (g) {
                    var0.setBlending(var6);
                    int var8;
                    if (var4 == 0) {
                        for (var8 = var3; var8 < var5 + var3; var8 += var1.getHeight()) {
                            if (var8 + var1.getHeight() >= var5 + var3) {
                                var8 = var5 + var3 - var1.getHeight();
                                var0.drawPixmap(var1, var2, var8);
                                break;
                            }

                            var0.drawPixmap(var1, var2, var8);
                        }
                    } else {
                        for (var8 = var2; var8 < var4 + var2; var8 += var1.getWidth()) {
                            if (var8 + var1.getWidth() >= var4 + var2) {
                                var8 = var4 + var2 - var1.getWidth();
                                var0.drawPixmap(var1, var8, var3);
                                break;
                            }

                            var0.drawPixmap(var1, var8, var3);
                        }
                    }
                }
            } else {
                int var7;
                if (var4 == 0) {
                    var7 = var3;

                    while (true) {
                        if (var7 >= var5 + var3) {
                            return;
                        }

                        if (var7 + var1.getHeight() >= var5 + var3) {
                            var7 = var5 + var3 - var1.getHeight();
                            var0.drawPixmap(var1, var2, var7);
                            break;
                        }

                        var0.drawPixmap(var1, var2, var7);
                        var7 += var1.getHeight();
                    }
                } else {
                    for (var7 = var2; var7 < var4 + var2; var7 += var1.getWidth()) {
                        if (var7 + var1.getWidth() >= var4 + var2) {
                            var7 = var4 + var2 - var1.getWidth();
                            var0.drawPixmap(var1, var7, var3);
                            return;
                        }

                        var0.drawPixmap(var1, var7, var3);
                    }
                }
            }
        }

    }

    static boolean a(boolean var0) {
        f = false;
        return false;
    }

    static char[] b() {
        return d;
    }

    static int[] c() {
        return c;
    }

    static char[][] d() {
        return e;
    }
}

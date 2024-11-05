package gro;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.GlyphLayout.GlyphRun;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator;
import com.badlogic.gdx.graphics.g2d.freetype.FreeTypeFontGenerator.FreeTypeFontParameter;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.scenes.scene2d.utils.ScissorStack;
import java.util.Hashtable;
import java.util.Vector;

public final class Graphics {

    private static int r = 100;
    private static Hashtable s = new Hashtable();
    public Rectangle a = new Rectangle();
    public SpriteBatch b;
    ShapeRenderer c;
    Rectangle d;
    public int e = 0;
    public int f = 0;
    Canvas g;
    private int t;
    private int u;
    private int v;
    private int w;
    public int h;
    public int i;
    boolean j;
    public boolean k;
    public boolean l;
    private boolean x = true;
    private int y;
    private Color z;
    public float m;
    private static boolean A = false;
    public static int n = -1;
    private static GlyphLayout B = new GlyphLayout();
    private static Vector C = new Vector();
    private static Vector D = new Vector();
    public static Hashtable o = new Hashtable();
    private static BitmapFont E;
    private static BitmapFont F;
    private static BitmapFont G;
    private static BitmapFont H;
    private static BitmapFont I;
    private static BitmapFont J;
    private static BitmapFont[] K;
    public static String p = " 0123456789+-*='\"\\/_?.,~:;|<>[]{}!@#$%^&()aáàảãạâấầẩẫậăắằẳẵặbcdđeéèẻẽẹêếềểễệfghiíìỉĩịjklmnoóòỏõọôốồổỗộơớờởỡợpqrstuúùủũụưứừửữựvxyýỳỷỹỵzwAÁÀẢÃẠÂẤẦẨẪẬĂẮẰẲẴẶBCDĐEÉÈẺẼẸÊẾỀỂỄỆFGHIÍÌỈĨỊJKLMNOÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢPQRSTUÚÙỦŨỤƯỨỪỬỮỰVXYÝỲỶỸỴZW";
    public static boolean q;

    public Graphics(Canvas var1) {
        this.z = Color.CLEAR;
        this.m = 1.0F;

        try {
            this.g = var1;
            this.c();
            this.c = new ShapeRenderer();
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public static void a() {
        try {
            if (A) {
                A = false;
                w();
                vdtt_dd.b();
            }
        } catch (Exception var1) {
        }

    }

    public static BitmapFont a(int var0) {
        BitmapFont var1 = F;
        switch (var0) {
            case 0:
                return c(var1);
            case 1:
                return d(var1);
            case 2:
                return b();
            case 3:
                return u();
            case 4:
                return t();
            case 5:
                return a(var1);
            case 6:
                return b(var1);
            case 7:
                return v();
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return g(var0 - 8);
            default:
                return c(var1);
        }
    }

    private static void a(BitmapFont var0, float var1, float var2) {
        if (DataCenter.gI().r == 1) {
            var0.getData().setScale(1.0F, 1.0F);
        } else {
            byte var3;
            if ((var3 = mConfig.gI().b(25)) == 1) {
                var0.getData().setScale(var1 * 90.0F / 100.0F, var2);
            } else if (var3 == 5) {
                var0.getData().setScale(var1 * 96.0F / 100.0F, var2);
            } else {
                var0.getData().setScale(var1, var2);
            }
        }

    }

    public static BitmapFont b(int var0) {
        BitmapFont var1 = F;
        switch (DataCenter.gI().r) {
            case 1:
                a(var1, (float) var0 / 100.0F, (float) var0 / 100.0F);
                break;
            case 2:
                a(var1, (float) var0 / 100.0F, (float) var0 / 100.0F);
                break;
            case 3:
                a(var1, (float) var0 / 100.0F, (float) var0 / 100.0F);
                break;
            case 4:
                a(var1, (float) var0 / 100.0F, (float) var0 / 100.0F);
        }

        return var1;
    }

    private static BitmapFont a(BitmapFont var0) {
        switch (DataCenter.gI().r) {
            case 1:
                a(var0, 0.88F, 0.88F);
                break;
            case 2:
                a(var0, 0.88F, 0.88F);
                break;
            case 3:
                a(var0, 0.88F, 0.88F);
                break;
            case 4:
                a(var0, 0.88F, 0.88F);
        }

        return var0;
    }

    private static BitmapFont b(BitmapFont var0) {
        switch (DataCenter.gI().r) {
            case 1:
                a(var0, 0.88F, 0.88F);
                break;
            case 2:
                a(var0, 0.88F, 0.88F);
                break;
            case 3:
                a(var0, 0.88F, 0.88F);
                break;
            case 4:
                a(var0, 0.88F, 0.88F);
        }

        return var0;
    }

    private static BitmapFont c(BitmapFont var0) {
        mConfig.gI().b(25);
        switch (DataCenter.gI().r) {
            case 1:
                a(var0, 0.975F, 0.975F);
                break;
            case 2:
                a(var0, 0.975F, 0.975F);
                break;
            case 3:
                a(var0, 0.975F, 0.975F);
                break;
            case 4:
                a(var0, 0.975F, 0.975F);
        }

        return var0;
    }

    private static BitmapFont d(BitmapFont var0) {
        switch (DataCenter.gI().r) {
            case 1:
                a(var0, 1.16F, 1.2F);
                break;
            case 2:
                a(var0, 1.16F, 1.2F);
                break;
            case 3:
                a(var0, 1.16F, 1.2F);
                break;
            case 4:
                a(var0, 1.16F, 1.2F);
        }

        return var0;
    }

    public static BitmapFont b() {
        if (DataCenter.k()) {
            return a(0);
        } else {
            switch (DataCenter.gI().r) {
                case 1:
                    G.getData().setScale(0.25F, 0.25F);
                    break;
                case 2:
                    G.getData().setScale(0.5F, 0.5F);
                    break;
                case 3:
                    G.getData().setScale(0.5F, 0.5F);
                    break;
                case 4:
                    G.getData().setScale(0.5F, 0.5F);
            }

            return G;
        }
    }

    public static BitmapFont a(float var0) {
        switch (DataCenter.gI().r) {
            case 1:
            case 2:
            case 3:
                G.getData().setScale(0.78F * var0, 0.78F * var0);
                break;
            case 4:
                G.getData().setScale(0.88F * var0, 0.88F * var0);
        }

        return G;
    }

    private static BitmapFont t() {
        switch (DataCenter.gI().r) {
            case 1:
                H.getData().setScale(0.25F, 0.25F);
                break;
            case 2:
                H.getData().setScale(0.5F, 0.5F);
                break;
            case 3:
                H.getData().setScale(0.75F, 0.75F);
                break;
            case 4:
                H.getData().setScale(1.0F, 1.0F);
        }

        return H;
    }

    private static BitmapFont u() {
        switch (DataCenter.gI().r) {
            case 1:
                I.getData().setScale(0.25F, 0.25F);
                break;
            case 2:
                I.getData().setScale(0.5F, 0.5F);
                break;
            case 3:
                I.getData().setScale(0.75F, 0.75F);
                break;
            case 4:
                I.getData().setScale(1.0F, 1.0F);
        }

        return I;
    }

    public static BitmapFont b(float var0) {
        I.getData().setScale(var0 * (float) DataCenter.gI().r / 100.0F, var0 * (float) DataCenter.gI().r / 100.0F);
        return I;
    }

    private static BitmapFont v() {
        switch (DataCenter.gI().r) {
            case 1:
                J.getData().setScale(0.25F, 0.25F);
                break;
            case 2:
                J.getData().setScale(0.5F, 0.5F);
                break;
            case 3:
                J.getData().setScale(0.75F, 0.75F);
                break;
            case 4:
                J.getData().setScale(1.0F, 1.0F);
        }

        return J;
    }

    private static BitmapFont g(int var0) {
        switch (DataCenter.gI().r) {
            case 1:
                K[var0].getData().setScale(0.25F, 0.25F);
                break;
            case 2:
                K[var0].getData().setScale(0.5F, 0.5F);
                break;
            case 3:
                K[var0].getData().setScale(0.75F, 0.75F);
                break;
            case 4:
                K[var0].getData().setScale(1.0F, 1.0F);
        }

        return K[var0];
    }

    public static int a(int var0, String var1) {
        try {
            BitmapFont var2 = E;
            BitmapFont var3;
            switch (var0) {
                case 0:
                    var3 = c(var2);
                    break;
                case 1:
                    var3 = d(var2);
                    break;
                case 2:
                    var3 = b();
                    break;
                case 3:
                    var3 = u();
                    break;
                case 4:
                    var3 = t();
                    break;
                case 5:
                    var3 = a(var2);
                    break;
                case 6:
                    var3 = b(var2);
                    break;
                case 7:
                    var3 = v();
                    break;
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                    var3 = g(var0 - 8);
                    break;
                default:
                    var3 = c(var2);
            }

            return (int) a(var0, var3, var1).width;
        } catch (Exception var4) {
            return 0;
        }
    }

    public static int b(int var0, String var1) {
        try {
            return (int) a(var0, a(var0), var1).height;
        } catch (Exception var3) {
            return 0;
        }
    }

    private static String a(String var0) {
        String var1 = "";

        for (int var2 = 0; var2 < var0.length(); ++var2) {
            if (p.indexOf(var0.charAt(var2)) >= 0) {
                var1 = var1 + var0.charAt(var2);
            }
        }

        if (o.size() > 5000) {
            o.clear();
        }

        o.put(var0, var1);
        return var1;
    }

    public static GlyphLayout a(int var0, BitmapFont var1, String var2) {
        return a(var0, var1, var2, j(var0));
    }

    private static GlyphLayout a(int var0, BitmapFont var1, String var2, Vector var3) {
        String var4;
        if ((var4 = (String) o.get(var2)) != null) {
            var2 = var4;
        }

        if (var2.length() == 0) {
            return B;
        } else {
            while (true) {
                GlyphLayout var5 = null;

                try {
                    if (var3.size() == 0) {
                        var5 = new GlyphLayout();
                    } else {
                        (var5 = (GlyphLayout) var3.remove(0)).reset();
                    }

                    var5.setText(var1, var2);
                    String var6;
                    if ((var6 = ((GlyphRun) var5.runs.get(0)).toString()).length() > var2.length()) {
                        if (var6.substring(0, var2.length()).equals(var2)) {
                            var3.add(var5);

                            for (int var7 = var3.size(); var7 < 5; ++var7) {
                                var3.add(new GlyphLayout());
                            }

                            return var5;
                        }

                        if (var4 == null && (var2 = a(var2)).length() == 0) {
                            return B;
                        }
                    }
                } catch (Exception var8) {
                    if (var4 == null && (var2 = a(var2)).length() == 0) {
                        return B;
                    }
                }

                if (var5 != null) {
                    var5.reset();
                }
            }
        }
    }

    public final SpriteBatch c() {
        try {
            if (this.b == null) {
                this.b = new SpriteBatch();
            }
        } catch (Exception var2) {
            Utlis.a(var2);
        }

        return this.b;
    }

    private static void w() {
        try {
            if (E != null) {
                E.dispose();
            }
        } catch (Exception var8) {
        }

        try {
            if (F != null) {
                F.dispose();
            }
        } catch (Exception var7) {
        }

        try {
            if (G != null) {
                G.dispose();
            }
        } catch (Exception var6) {
        }

        try {
            if (I != null) {
                I.dispose();
            }
        } catch (Exception var5) {
        }

        try {
            if (J != null) {
                J.dispose();
            }
        } catch (Exception var4) {
        }

        try {
            if (H != null) {
                H.dispose();
            }
        } catch (Exception var3) {
        }

        J = null;
        H = null;
        I = null;
        F = null;
        E = null;
        if (K != null) {
            for (int var0 = 0; var0 < K.length; ++var0) {
                try {
                    if (K[var0] != null) {
                        K[var0].dispose();
                    }

                    K[var0] = null;
                } catch (Exception var2) {
                }
            }
        }

    }

    public static void d() {
        try {
            vdtt_dd.b();
            w();
            e();
        } catch (Exception var1) {
        }

    }

    private static void a(Vector var0) {
        int var1;
        for (var1 = 0; var1 < var0.size(); ++var1) {
            for (int var2 = 0; var2 < ((Vector) var0.get(var1)).size(); ++var2) {
                ((GlyphLayout) ((Vector) var0.get(var1)).get(var2)).reset();
            }
        }

        var0.clear();

        for (var1 = 0; var1 < 8; ++var1) {
            Vector var4 = new Vector();

            for (int var3 = 0; var3 < 5; ++var3) {
                var4.add(new GlyphLayout());
            }

            var0.add(var4);
        }

    }

    public static void e() {
        if (n != DataCenter.gI().r) {
            w();
        }

        if (F == null || G == null || I == null || J == null || H == null || K == null) {
            a(C);
            a(D);
            n = DataCenter.gI().r;
            FreeTypeFontParameter var0;
            (var0 = new FreeTypeFontParameter()).characters = p;
            var0.flip = true;
            var0.borderColor = Utlis.b(-10275328L);
            var0.borderWidth = 0.0F;
            var0.spaceX = 0;
            var0.color = Color.WHITE;
            var0.borderColor = Utlis.b(-14013910L);
            var0.size = 8 * DataCenter.gI().r;
            var0.borderWidth = 0.0F;
            var0.shadowColor = Utlis.b(-16708448L);
            var0.shadowOffsetX = 1;
            var0.shadowOffsetY = 1;
            FreeTypeFontGenerator var1 = null;
            if (DataCenter.k()) {
                F = E = G = (var1 = new FreeTypeFontGenerator(Utlis.g("tffdata"))).generateFont(var0);
                var0.size = 30 * DataCenter.gI().r;
                H = I = J = var1.generateFont(var0);
                return;
            }

            if (DataCenter.gI().r == 1) {
                var1 = new FreeTypeFontGenerator(Utlis.g("tff6"));
                var0.size = 9;
            } else {
                byte var2;
                switch (var2 = mConfig.gI().b(25)) {
                    case 0:
                        var1 = new FreeTypeFontGenerator(Utlis.g("tff3"));
                        break;
                    case 1:
                        var1 = new FreeTypeFontGenerator(Utlis.g("tff1"));
                        break;
                    case 2:
                        var1 = new FreeTypeFontGenerator(Utlis.g("tff2"));
                        break;
                    case 3:
                        var1 = new FreeTypeFontGenerator(Utlis.g("tff4"));
                        break;
                    case 4:
                        var1 = new FreeTypeFontGenerator(Utlis.g("tff6"));
                        break;
                    case 5:
                        var1 = new FreeTypeFontGenerator(Utlis.g("tff5"));
                }

                var0.size = DataCenter.gI().r * 8;
                if (var2 == 4) {
                    var0.size += DataCenter.gI().r / 2;
                }
            }

            F = var1.generateFont(var0);
            E = var1.generateFont(var0);
            var0.size = 21 * DataCenter.gI().r;
            var0.borderWidth = 0.0F;
            var0.shadowOffsetX = 0;
            var0.shadowOffsetY = 0;
            G = (var1 = new FreeTypeFontGenerator(Utlis.g("tff3"))).generateFont(var0);
            var1.dispose();
            (K = new BitmapFont[7])[0] = H = new BitmapFont(Utlis.g("font1"), true);
            K[1] = I = new BitmapFont(Utlis.g("font3"), true);
            K[2] = J = new BitmapFont(Utlis.g("font5"), true);
            K[3] = new BitmapFont(Utlis.h("font7"), true);
            K[4] = new BitmapFont(Utlis.h("font9"), true);
            K[5] = new BitmapFont(Utlis.h("font5"), true);
            K[6] = new BitmapFont(Utlis.h("font5"), true);

            for (int var3 = 0; var3 < vdtt_dd.k.length; ++var3) {
                vdtt_dd.k[var3].b();
            }
        }

    }

    public final void c(int var1) {
        this.z = Utlis.b((long) var1);
    }

    public final void f() {
        try {
            this.z = Color.CLEAR;
            this.c().setColor(Color.WHITE);
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public final void d(int var1) {
        if (var1 > 100) {
            this.m = 1.0F;
        } else {
            this.m = (float) var1 / 100.0F;
        }

    }

    public final void g() {
        this.m = 1.0F;
    }

    public final void e(int var1) {
        try {
            if (DataCenter.gI().s()) {
                this.c(-6645094);
                return;
            }

            ((vdtt_am) this.c()).a(30);
        } catch (Exception var3) {
        }

    }

    public final void h() {
        try {
            if (DataCenter.gI().s()) {
                this.f();
                return;
            }

            ((vdtt_am) this.c()).a();
        } catch (Exception var2) {
        }

    }

    public static boolean i() {
        return q;
    }

    public final boolean j() {
        if (i()) {
            return true;
        } else {
            return this.h == 0 || this.i == 0;
        }
    }

    private void x() {
        try {
            ScissorStack.calculateScissors(this.g.camera, this.c().getTransformMatrix(), this.d, this.a);
            ScissorStack.pushScissors(this.a);
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    private void y() {
        try {
            if (!this.j()) {
                this.c().flush();
                ScissorStack.popScissors();
            }
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public final void a(int var1, int var2, int var3, int var4) {
        try {
            this.x = false;
            if (!this.j()) {
                mImage var5 = h(this.y);
                if (var1 == var3) {
                    this.a(var5, 0, 0, 1, 1, 0, var1, var2, DataCenter.gI().r, (var4 - var2) * DataCenter.gI().r, 0);
                } else {
                    this.a(var5, 0, 0, 1, 1, 0, var1, var2, (var3 - var1) * DataCenter.gI().r, DataCenter.gI().r, 0);
                }

                this.x = true;
            }
        } catch (Exception var6) {
        }

    }

    private static mImage h(int var0) {
        mImage var1 = null;

        try {
            if ((var1 = (mImage) s.get(var0)) == null) {
                Pixmap var2;
                (var2 = (var1 = Binary.a(1, 1)).b).setColor(Utlis.b((long) var0));
                var2.fill();
                var1.c();
                s.put(var0, var1);
            }
        } catch (Exception var3) {
        }

        return var1;
    }

    public final void a(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        this.x = false;
        switch (var2) {
            case -39:
                var3 = -1560281088;
                break;
            case -38:
            case -37:
            case -36:
            case -35:
            case -34:
            case -33:
            case -32:
            case -31:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
            case 69:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            default:
                var3 = var2;
                break;
            case -30:
                var3 = -398256362;
                break;
            case -29:
                var3 = -1275058924;
                break;
            case -28:
                var3 = -13355973;
                break;
            case -27:
                var3 = -1769577835;
                break;
            case -26:
                var3 = -595765745;
                break;
            case -25:
                var3 = -1442245870;
                break;
            case -24:
                var3 = -14399156;
                break;
            case -23:
                var3 = -1427649639;
                break;
            case -22:
                var3 = -1278446549;
                break;
            case -21:
                var3 = -851931;
                break;
            case -20:
                var3 = -11456235;
                break;
            case -19:
                var3 = -6200792;
                break;
            case -18:
                var3 = -429507045;
                break;
            case -17:
                var3 = -3640790;
                break;
            case -16:
                var3 = -10076645;
                break;
            case -15:
                var3 = -7978471;
                break;
            case -14:
                var3 = -435612910;
                break;
            case -13:
                var3 = 1526368273;
                break;
            case -12:
                var3 = -1;
                break;
            case -11:
            case 80:
                var3 = -5332328;
                break;
            case -10:
                var3 = -518501300;
                break;
            case -9:
                var3 = -11197433;
                break;
            case -8:
                var3 = -15323092;
                break;
            case -7:
            case -5:
                var3 = 1677721600;
                break;
            case -6:
                var3 = -1290201339;
                break;
            case -4:
                var3 = -868916617;
                break;
            case -3:
                var3 = -934343646;
                break;
            case -2:
                var3 = -1290123955;
                break;
            case -1:
                var3 = 0;
        }

        if (var3 == var2) {
            var1.f();
        }

        mImage var8 = h(var3);
        this.a(var8, 0, 0, 1, 1, 0, var4, var5, var6, var7, 0);
        this.x = true;
    }

    public final void b(int var1, int var2, int var3, int var4) {
        if (!this.j() && var3 != 0 && var4 != 0) {
            this.x = false;
            int var5 = var3;
            int var6 = var4;
            var3 *= DataCenter.gI().r;
            var4 *= DataCenter.gI().r;
            mImage var7 = h(this.y);
            this.a(var7, 0, 0, 1, 1, 0, var1, var2, var3, DataCenter.gI().r, 0);
            this.a(var7, 0, 0, 1, 1, 0, var1, var2, DataCenter.gI().r, var4, 0);
            this.a(var7, 0, 0, 1, 1, 0, var1, var2 + var6, var3 + DataCenter.gI().r, DataCenter.gI().r, 0);
            this.a(var7, 0, 0, 1, 1, 0, var1 + var5, var2, DataCenter.gI().r, var4 + DataCenter.gI().r, 0);
            this.x = true;
        }

    }

    public final void c(int var1, int var2, int var3, int var4) {
        if (!this.j() && var3 != 0 && var4 != 0) {
            try {
                this.x = false;
                var3 *= DataCenter.gI().r;
                var4 *= DataCenter.gI().r;
                mImage var5 = h(this.y);
                this.a(var5, 0, 0, 1, 1, 0, var1, var2, var3, var4, 0);
                this.x = true;
            } catch (Exception var6) {
                Utlis.a(var6);
            }
        }

    }

    public final void a(mImage var1, int var2, int var3) {
        if (var1 != null) {
            this.a(var1, 0, 0, var1.c, var1.d, 0, var2, var3, 0);
        }

    }

    public final void a(mImage var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        this.a(var1, var2, var3, var4, var5, var6, var7, var8, var4, var5, var9);
    }

    public final void a(mImage var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        try {
            if (var1 == null || this.j()) {
                return;
            }

            var7 += this.e;
            var8 += this.f;
            var7 *= DataCenter.gI().r;
            var8 *= DataCenter.gI().r;
            if (var4 > 1 && var5 > 1) {
                var2 *= DataCenter.gI().r;
                var3 *= DataCenter.gI().r;
            }

            if ((var11 & 2) != 0) {
                if (!this.k && (var6 == 90 || var6 == 270 || var6 == -270 || var6 == -90)) {
                    var8 -= var9 / 2;
                } else {
                    var8 -= var10 / 2;
                }
            } else if ((var11 & 32) != 0) {
                if (!this.k && (var6 == 90 || var6 == 270 || var6 == -270 || var6 == -90)) {
                    var8 -= var9;
                } else {
                    var8 -= var10;
                }
            }

            if ((var11 & 8) != 0) {
                if (!this.k && (var6 == 90 || var6 == 270 || var6 == -270 || var6 == -90)) {
                    var7 -= var10;
                } else {
                    var7 -= var9;
                }
            } else if ((var11 & 1) != 0) {
                if (!this.k && (var6 == 90 || var6 == 270 || var6 == -270 || var6 == -90)) {
                    var7 -= var10 / 2;
                } else {
                    var7 -= var9 / 2;
                }
            }

            var9 = var9 == 0 ? var4 : var9;
            var10 = var10 == 0 ? var5 : var10;
            Texture var12;
            if ((var12 = var1.b()) == null) {
                return;
            }

            Color var13;
            TextureFilter var14;
            if (this.k) {
                if (var12 != null) {
                    var13 = this.c().getColor();
                    this.c().setColor(var13.r, var13.g, var13.b, this.m);
                    if (!this.z.equals(Color.CLEAR)) {
                        this.c().setColor(this.z.r, this.z.g, this.z.b, this.z.a);
                    }

                    if (this.x) {
                        var14 = TextureFilter.Linear;
                        var12.setFilter(var14, var14);
                    }

                    this.c().draw(var12, (float) var7, (float) var8, (float) (var9 / 2), (float) (var10 / 2), (float) var9, (float) var10, 1.0F, 1.0F, (float) var6, var2, var3, var4, var5, var6 < 0, true);
                }

                return;
            }

            if (var6 != 180 && var6 != -180) {
                if (var6 == 270) {
                    var8 += var9;
                } else {
                    int var15;
                    if (var6 == -90) {
                        if (var1.c == this.i(var9) && var1.d == this.i(var10)) {
                            var8 += var9;
                        } else {
                            var15 = var9;
                            var9 = var10;
                            var10 = var15;
                            var8 += var9;
                        }
                    } else if (var6 == 90) {
                        if (var1.c == this.i(var9) && var1.d == this.i(var10)) {
                            var7 += var10;
                        } else {
                            var15 = var9;
                            var9 = var10;
                            var10 = var15;
                            var7 += var15;
                        }
                    } else if (var6 == -270) {
                        if (var1.c == this.i(var9) && var1.d == this.i(var10)) {
                            var7 += var10;
                        } else {
                            var15 = var9;
                            var9 = var10;
                            var10 = var15;
                            var7 += var15;
                        }
                    }
                }
            } else {
                var7 += var9;
                var8 += var10;
            }

            var13 = this.c().getColor();
            this.c().setColor(var13.r, var13.g, var13.b, this.m);
            if (!this.z.equals(Color.CLEAR)) {
                this.c().setColor(this.z.r, this.z.g, this.z.b, this.z.a);
            }

            if (var12 != null) {
                if (this.x) {
                    var14 = TextureFilter.Linear;
                    var12.setFilter(var14, var14);
                }

                this.c().draw(var12, (float) var7, (float) var8, 0.0F, 0.0F, (float) var9, (float) var10, 1.0F, 1.0F, (float) var6, var2, var3, var4, var5, var6 < 0, true);
            }
        } catch (Exception var16) {
            Utlis.a(var16);
        }

    }

    public final void a(mImage var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13) {
        try {
            if (var1 != null && !this.j()) {
                var7 += this.e;
                var8 += this.f;
                var7 *= DataCenter.gI().r;
                var8 *= DataCenter.gI().r;
                if (var4 > 1 && var5 > 1) {
                    var2 = 0 * DataCenter.gI().r;
                    var3 *= DataCenter.gI().r;
                }

                if ((var13 & 2) != 0) {
                    if (!this.k && (var6 == 90 || var6 == 270 || var6 == -270 || var6 == -90)) {
                        var8 -= var9 / 2;
                    } else {
                        var8 -= var10 / 2;
                    }
                } else if ((var13 & 32) != 0) {
                    if (!this.k && (var6 == 90 || var6 == 270 || var6 == -270 || var6 == -90)) {
                        var8 -= var9;
                    } else {
                        var8 -= var10;
                    }
                }

                if ((var13 & 8) != 0) {
                    if (!this.k && (var6 == 90 || var6 == 270 || var6 == -270 || var6 == -90)) {
                        var7 -= var10;
                    } else {
                        var7 -= var9;
                    }
                } else if ((var13 & 1) != 0) {
                    if (!this.k && (var6 == 90 || var6 == 270 || var6 == -270 || var6 == -90)) {
                        var7 -= var10 / 2;
                    } else {
                        var7 -= var9 / 2;
                    }
                }

                var9 = var9 == 0 ? var4 : var9;
                var10 = var10 == 0 ? var5 : var10;
                Texture var14;
                if ((var14 = var1.b()) != null) {
                    Color var15 = this.c().getColor();
                    this.c().setColor(var15.r, var15.g, var15.b, this.m);
                    if (!this.z.equals(Color.CLEAR)) {
                        this.c().setColor(this.z.r, this.z.g, this.z.b, this.z.a);
                    }

                    TextureFilter var16 = TextureFilter.Linear;
                    var14.setFilter(var16, var16);
                    if (var11 == 0) {
                        var11 = var9 / 2;
                    }

                    if (var12 == 0) {
                        var12 = var10 / 2;
                    }

                    this.c().draw(var14, (float) var7, (float) var8, (float) var11, (float) var12, (float) var9, (float) var10, 1.0F, 1.0F, (float) (180 + var6), var2, var3, var4, var5, false, false);
                }
            }
        } catch (Exception var17) {
            Utlis.a(var17);
        }

    }

    public final int[] b(mImage var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
        try {
            if (var1 == null || this.j()) {
                return null;
            }

            var7 += this.e;
            var8 += this.f;
            var7 *= DataCenter.gI().r;
            var8 *= DataCenter.gI().r;
            if (var4 > 1 && var5 > 1) {
                var2 *= DataCenter.gI().r;
                var3 *= DataCenter.gI().r;
            }

            var9 = var9 == 0 ? var4 : var9;
            var10 = var10 == 0 ? var5 : var10;
            Texture var12;
            if ((var12 = var1.b()) != null) {
                Color var13 = this.c().getColor();
                this.c().setColor(var13.r, var13.g, var13.b, this.m);
                if (!this.z.equals(Color.CLEAR)) {
                    this.c().setColor(this.z.r, this.z.g, this.z.b, this.z.a);
                }

                TextureFilter var14 = TextureFilter.Linear;
                var12.setFilter(var14, var14);
                this.c().draw(var12, (float) var7, (float) (var8 - var10 / 2), 0.0F, (float) (var10 / 2), (float) var9, (float) var10, 1.0F, 1.0F, (float) (180 + var6), var2, var3, var4, var5, false, false);
                float var15 = (float) var7;
                float var16 = (float) (var8 - var10 / 2);
                float var17 = (float) (var10 / 2);
                float var18 = (float) var9;
                float var19 = (float) var10;
                float var20 = (float) (180 + var6);
                float var21 = 1.0F;
                var21 = 1.0F;
                var21 = 0.0F;
                float var26 = var15 + 0.0F;
                float var25 = var16 + var17;
                float var27 = -var17;
                float var23 = var18 - 0.0F;
                float var24 = var19 - var17;
                float var28 = var23;
                float var22;
                float var29;
                if (var20 != 0.0F) {
                    float var30 = MathUtils.cosDeg(var20);
                    float var31 = MathUtils.sinDeg(var20);
                    var23 = var30 * -0.0F - var31 * var27;
                    var22 = var31 * -0.0F + var30 * var27;
                    var20 = var30 * -0.0F - var31 * var24;
                    var27 = var31 * -0.0F + var30 * var24;
                    var29 = var30 * var28 - var31 * var24;
                    var24 = var31 * var28 + var30 * var24;
                    var23 += var29 - var20;
                    var22 = var24 - (var27 - var22);
                } else {
                    var29 = var23;
                    var24 = var24;
                    var23 = var23;
                    var22 = var27;
                }

                var29 += var26;
                var24 += var25;
                var23 += var26;
                var22 += var25;
                DataCenter.gI();
                DataCenter.gI();
                var29 /= (float) DataCenter.gI().r;
                var23 /= (float) DataCenter.gI().r;
                DataCenter.gI();
                DataCenter.gI();
                var24 /= (float) DataCenter.gI().r;
                var22 /= (float) DataCenter.gI().r;
                var29 -= (float) this.e;
                var23 -= (float) this.e;
                var24 -= (float) this.f;
                var22 -= (float) this.f;
                return new int[]{(int) (var29 + (var23 - var29) / 2.0F), (int) (var24 + (var22 - var24) / 2.0F)};
            }
        } catch (Exception var32) {
            Utlis.a(var32);
        }

        return null;
    }

    private int i(int var1) {
        return this.l ? var1 : (int) ((float) var1 * (1.0F / DataCenter.gI().w));
    }

    public final void b(mImage var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
        try {
            if (var1 != null && !this.j()) {
                var7 += this.e * DataCenter.gI().r;
                var8 = 0 + this.f * DataCenter.gI().r - var5 / 2;
                Color var10 = this.c().getColor();
                this.c().setColor(var10.r, var10.g, var10.b, this.m);
                if (!this.z.equals(Color.CLEAR)) {
                    this.c().setColor(this.z.r, this.z.g, this.z.b, this.z.a);
                }

                Texture var11;
                if ((var11 = var1.b()) != null) {
                    TextureFilter var12 = TextureFilter.Linear;
                    var11.setFilter(var12, var12);
                    this.c().draw(var11, (float) var7, (float) var8, 0.0F, 0.0F, (float) var4, (float) var5, 1.0F, 1.0F, 0.0F, 0, 0, var4, var5, false, true);
                }
            }
        } catch (Exception var13) {
            Utlis.a(var13);
        }

    }

    public final void a(int var1, BitmapFont var2, String var3, float var4, float var5, int var6, int var7, float var8) {
        try {
            if (!this.j()) {
                if ((var3 = Caption.a(var3)) == null) {
                    var3 = "";
                }

                var3 = var3.replaceAll("\n", "").trim();
                if (var7 == Color.BLACK.toIntBits()) {
                    Graphics var9 = this;

                    try {
                        ShaderProgram var10;
                        if ((var10 = vdtt_an.c()).isCompiled()) {
                            var9.c().end();
                            var9.c().setShader(var10);
                            var9.c().begin();
                        }
                    } catch (Exception var14) {
                    }
                } else {
                    var2.setColor(Utlis.b((long) var7));
                }

                int var16 = var1;
                if (var1 >= D.size()) {
                    var16 = 0;
                }

                GlyphLayout var17;
                int var11 = (int) (var17 = a(var1, var2, var3, (Vector) D.get(var16))).width;
                var16 = (int) var17.height;
                var4 = (var4 + (float) this.e) * (float) DataCenter.gI().r;
                var5 = (var5 + (float) this.f) * (float) DataCenter.gI().r;
                if (var6 == 1) {
                    var4 -= (float) var11;
                } else if (var6 == 2) {
                    var4 -= (float) (var11 / 2);
                }

                var5 -= (float) (var16 / 2);
                if (var7 != Color.BLACK.toIntBits()) {
                    var2.setColor(Utlis.b((long) var7));
                    Color var12 = this.c().getColor();
                    this.c().setColor(var12.r, var12.g, var12.b, this.m);
                    if (!this.z.equals(Color.CLEAR)) {
                        this.c().setColor(this.z.r, this.z.g, this.z.b, this.z.a);
                    }
                }

                Texture var18 = var2.getRegion().getTexture();
                TextureFilter var13 = TextureFilter.Linear;
                var18.setFilter(var13, var13);
                var2.draw(this.c(), (GlyphLayout) var17, var4 + var8, var5);
                if (var7 == Color.BLACK.toIntBits()) {
                    this.r();
                }
            }
        } catch (Exception var15) {
        }

    }

    public final int k() {
        return this.v + this.t;
    }

    public final int l() {
        return this.w + this.u;
    }

    public final int m() {
        return this.e;
    }

    public final int n() {
        return this.f;
    }

    public final void d(int var1, int var2, int var3, int var4) {
        try {
            this.t = var1 + this.e;
            this.u = var2 + this.f;
            this.v = var1;
            this.w = var2;
            var1 += this.e;
            var2 += this.f;
            this.h = var3;
            this.i = var4;
            var1 *= DataCenter.gI().r;
            var2 *= DataCenter.gI().r;
            var3 *= DataCenter.gI().r;
            var4 *= DataCenter.gI().r;
            this.d = new Rectangle((float) var1, (float) var2, (float) var3, (float) var4);
            if (this.j) {
                this.y();
            }

            this.x();
            this.j = true;
        } catch (Exception var6) {
        }

    }

    public final void f(int var1) {
        this.y = -16777216 | var1;
    }

    public final void a(int var1, int var2) {
        this.e += var1;
        this.f += var2;
        this.v = -var1;
        this.w = -var2;
    }

    public final void o() {
        this.e = 0;
        this.f = 0;
    }

    public final void c(float var1) {
        try {
            ShaderProgram var2;
            if (!mConfig.gI().a(36) && (var2 = vdtt_an.d()).isCompiled()) {
                this.c().end();
                var2.begin();
                var2.setUniformf("hue", var1);
                var2.end();
                this.c().setShader(var2);
                this.c().begin();
            }
        } catch (Exception var3) {
        }

    }

    public final void p() {
        try {
            ShaderProgram var1;
            if ((var1 = vdtt_an.e()).isCompiled()) {
                this.c().end();
                this.c().setShader(var1);
                this.c().begin();
            }
        } catch (Exception var2) {
        }

    }

    public final void a(float var1, float var2) {
        try {
            ShaderProgram var3;
            if (!mConfig.gI().a(36) && (var3 = vdtt_an.b()).isCompiled()) {
                this.c().end();
                var3.begin();
                var3.setUniformf("contrast", var1);
                var3.setUniformf("brightness", var2);
                var3.end();
                this.c().setShader(var3);
                this.c().begin();
            }
        } catch (Exception var4) {
        }

    }

    public final void q() {
        try {
            ShaderProgram var1;
            if (!mConfig.gI().a(36) && (var1 = vdtt_an.f()).isCompiled()) {
                this.c().end();
                this.c().setShader(var1);
                this.c().begin();
            }
        } catch (Exception var2) {
        }

    }

    public final void r() {
        this.c().end();
        this.c().setShader((ShaderProgram) null);
        this.c().begin();
    }

    public static float s() {
        float var0 = 1.0F;
        if (DataCenter.gI().r == 2 && DataCenter.gI().p == 3 && (mConfig.gI().b(2) == 0 || mConfig.gI().b(2) == 3)) {
            var0 = 1.0F;
        } else if (DataCenter.gI().r == 2 && mConfig.gI().b(2) != 1 || (DataCenter.gI().r == 3 || DataCenter.gI().r == 4) && mConfig.gI().b(2) == 1) {
            var0 = (float) DataCenter.gI().r / ((float) DataCenter.gI().r - 1.0F);
        }

        return var0;
    }

    private static Vector j(int var0) {
        if (var0 >= C.size()) {
            var0 = 0;
        }

        return (Vector) C.get(var0);
    }
}

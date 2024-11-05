package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import core.listener.AppEventListener;
import core.listener.LogoutCallback;
import core.listener.SDKEventListener;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Vector;
import vn.system.DialogText;

public class AppListener extends Game {

    public InputCanvas inputcanvas;
    public static String b = (new vdtt_c()).toString();
    public static String c = "e9cc855dfdabaad44a69d3fa1f4837df";
    public static String d = "dbd8264c2628b783c4cd6c361d8e7057";
    private static AppListener r;
    public static Hashtable e = new Hashtable();
    public int f;
    public SDKEventListener g;
    public AppEventListener h;
    public String i = null;
    public Vector j = new Vector();
    private static boolean s = true;
    public String k;
    public String l;
    public int m = 0;
    public static byte[] n = new byte[200];
    private int t = 3;
    private int u;
    private int v;
    public static boolean o;
    public boolean p;
    public static String q = "id = Vũ trụ\r\nVõ Đài = 100:s1.vodaitoithuong.vn:3847:4848";

    public AppListener() {
        n[0] = 62;
        n[1] = 21;
        n[2] = -115;
        n[3] = 72;
        n[4] = 22;
        n[5] = 5;
        n[6] = 31;
        n[7] = 10;
    }

    public final void b() {
        this.inputcanvas.setZoomLevel();
        this.inputcanvas.create();
        DataCenter.gI().createScreen(0, this.inputcanvas.getWidth(), this.inputcanvas.getHeight());
    }

    public final AppEventListener c() {
        return this.h;
    }

    public static void d() {
        if (e.size() == 0) {
            (new Thread(new vdtt_d())).start();
        }

    }

    public static void e() {
        e.clear();
    }

    public static AppListener gI() {
        if (r == null) {
            r = new AppListener();
        }

        return r;
    }

    public void create() {
        if (Gdx.app.getGraphics().getGLVersion().getMajorVersion() < 2) {
            DialogText.a("Thông báo", "Rất tiếc! Máy tính của bạn cần hổ trợ tối thiểu phiên bản OpenGL 2.0 thì mới có thể mở được trò chơi.");
            gI();
            i();
        } else {
            MoveSmart.a();
            r = this;
            this.inputcanvas = new InputCanvas();
            if (Gdx.app.getType() == ApplicationType.Desktop) {
                short[] var1 = Utlis.h();
                System.out.println("xy: " + Arrays.toString(var1));
                this.u = var1[0];
                this.v = var1[1];
                if (this.u != this.inputcanvas.getWidth() || this.v != this.inputcanvas.height || this.v <= 240) {
                    if (Gdx.app.getType() == ApplicationType.Desktop) {
                        Gdx.graphics.setWindowedMode(this.u, this.v);
                    }

                    this.inputcanvas.setZoomLevel();
                    this.inputcanvas.create();
                }
            }

            DataCenter.gI().createScreen(0, this.inputcanvas.getWidth(), this.inputcanvas.getHeight());
            Session var3 = Session.gI();
            if (Controller.a == null) {
                Controller.a = new Controller();
            }

            Controller var2 = Controller.a;
            var3.handler = var2;
            this.setScreen(this.inputcanvas);
            this.m = 0;
        }

    }

    public static boolean g() {
        return true;
    }

    public final void h() {
        (new Thread(new vdtt_e(this))).start();
    }

    public static void i() {
        Gdx.app.exit();
        System.exit(0);
    }

    public final void j() {
        AppListener var1 = gI();
        Object var2 = null;
        var1.i = (String) var2;
        DataCenter.aD = 0;
        gI().g.a((LogoutCallback) (new vdtt_f(this)));
    }

    public final void k() {
    }

    private boolean a() {
        return this.t == 4 && this.m > 0;
    }

    public final int l() {
        return this.m;
    }

    public final int m() {
        return this.a() ? 0 : this.m;
    }

    public final int n() {
        return !this.a() ? this.m / 2 : this.m;
    }

    public final void a(boolean var1) {
        if (var1) {
            GameSrc.gI();
            GameSrc.F();
        }

        if (this.h != null) {
            this.h.a();
        }

    }

    public final boolean o() {
        InputCanvas var1;
        return (var1 = this.inputcanvas).width <= 800 || var1.height <= 320;
    }

    public static void a(String var0) {
        gI().g.a(String.valueOf(DataCenter.gI().aF), var0);
    }

    public static void p() {
        gI().j();
    }

    public static void q() {
        if (DataCenter.gI().currentScreen instanceof GameSrc && ((GameSrc) DataCenter.gI().currentScreen).V()) {
            DataCenter.gI().currentScreen.a(Caption.jB, 30000, DataCenter.gI().currentScreen);
        } else {
            System.exit(0);
        }

    }

    @Override
    public void dispose() {
        super.dispose();
        Gdx.app.exit();
        System.exit(0);
    }
}

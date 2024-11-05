package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import java.util.Hashtable;
import java.util.Vector;
import vn.system.DialogText;

public final class mInputProcessor implements InputProcessor {

    private static Hashtable c = new Hashtable();
    private static Hashtable d = new Hashtable();
    Canvas canvas;
    int lastMouse;
    private int e;
    private int f;

    public static void a() {
        c.clear();
        c.put(61, -15);
        c.put(66, -16);
        c.put(67, 8);
        c.put(62, 32);
        c.put(3, 3);
        c.put(132, 132);
        a(Binary.a());
        d.put(8, 8);
        d.put(22, 22);
        d.put(127, 127);

        for (int var0 = 0; var0 < vdtt_dd.m.length(); ++var0) {
            char var1 = vdtt_dd.m.charAt(var0);
            d.put(Integer.valueOf(var1), Integer.valueOf(var1));
        }

    }

    public mInputProcessor(Canvas var1, int var2, int var3) {
        this.canvas = var1;
        this.e = 0;
        this.f = 0;
        Gdx.input.setCatchBackKey(true);
    }

    public static void a(short[] var0) {
        c.put(Integer.valueOf(var0[0]), -1);
        c.put(Integer.valueOf(var0[1]), -2);
        c.put(Integer.valueOf(var0[2]), -3);
        c.put(Integer.valueOf(var0[3]), -4);
        c.put(Integer.valueOf(var0[4]), 15);
        c.put(Integer.valueOf(var0[5]), 16);
        c.put(Integer.valueOf(var0[6]), 17);
        c.put(Integer.valueOf(var0[7]), 18);
        c.put(Integer.valueOf(var0[8]), 19);
        c.put(Integer.valueOf(var0[9]), 20);
        c.put(Integer.valueOf(var0[10]), 21);
        c.put(Integer.valueOf(var0[11]), 22);
        c.put(Integer.valueOf(var0[12]), 23);
        c.put(Integer.valueOf(var0[13]), 24);
    }

    public final boolean keyDown(int var1) {
        if ((var1 != 4 || Gdx.app.getType() == ApplicationType.Android) && var1 != 67) {
            vdtt_w var2;
            boolean var3;
            switch (var1) {
                case 4:
                case 131:
                    if (DialogText.a(false)) {
                        return false;
                    }

                    if ((var2 = DataCenter.gI().currentScreen.c) != null) {
                        if (var2 instanceof vdtt_bg || var2 instanceof vdtt_bh || var2 instanceof vdtt_kv) {
                            return false;
                        }

                        if (var2.k != null) {
                            var2.b((vdtt_k) var2.k);
                            vdtt_aa.gI().x();
                            return true;
                        }

                        if (var2.f.size() > 0) {
                            if (var2 instanceof vdtt_gf) {
                                ((vdtt_gf) var2).w();
                                return true;
                            }

                            if (var2 instanceof vdtt_ak) {
                                ((vdtt_ak) var2).k();
                                return true;
                            }

                            DataCenter.gI().currentScreen.k();
                        }
                    }
                    break;
                case 61:
                    if (vdtt_y.a != null) {
                        vdtt_y.a.k();
                    }

                    if ((var2 = DataCenter.gI().currentScreen.c) != null) {
                        Vector var10 = new Vector();
                        vdtt_by var11 = null;

                        int var12;
                        for (var12 = 0; var12 < var2.f.size(); ++var12) {
                            vdtt_k var7;
                            if ((var7 = (vdtt_k) var2.f.elementAt(var12)) instanceof vdtt_by) {
                                vdtt_by var8 = (vdtt_by) var7;
                                var10.add(var8);
                                if (var8.b) {
                                    var11 = var8;
                                }
                            }
                        }

                        if (var10.size() > 1) {
                            var12 = 0;
                            if (var11 != null) {
                                var3 = false;
                                var11.b = var3;
                                var12 = var10.indexOf(var11);
                                ++var12;
                                if (var12 >= var10.size()) {
                                    var12 = 0;
                                }
                            }

                            vdtt_by var13 = (vdtt_by) var10.get(var12);
                            var3 = true;
                            var13.b = var3;
                            ((vdtt_by) var10.get(var12)).a((vdtt_hi) (new vdtt_hi(-1001, 0, 0, 0, 0, new vdtt_hp((byte) 0, 0, 0, 0, 0, 0, 0), var2)), 0, 0);
                        }
                    }
                    break;
                case 66:
                    if (DialogText.a(true)) {
                        return false;
                    }

                    if (vdtt_y.a != null) {
                        vdtt_y.a.k();
                    }

                    if ((var2 = DataCenter.gI().currentScreen.c) != null) {
                        if (!(var2 instanceof vdtt_kb) && !(var2 instanceof GameSrc)) {
                            if (var2 instanceof LoginPCScreen) {
                                label125:
                                {
                                    LoginPCScreen var9;
                                    if ((var9 = (LoginPCScreen) var2).I.b) {
                                        if (var9.J.i().length() <= 0) {
                                            var3 = false;
                                            var9.I.b = var3;
                                            var3 = true;
                                            var9.J.b = var3;
                                            break label125;
                                        }

                                        if (var9.I.i().length() != 0) {
                                            var9.A();
                                            break label125;
                                        }
                                    } else if (var9.I.i().length() > 0) {
                                        if (var9.J.i().length() == 0) {
                                            var3 = false;
                                            var9.I.b = var3;
                                            var3 = true;
                                            var9.J.b = var3;
                                        } else {
                                            var9.A();
                                        }
                                        break label125;
                                    }

                                    var3 = true;
                                    var9.I.b = var3;
                                    var3 = false;
                                    var9.J.b = var3;
                                }
                            } else if (var2 instanceof SelectCharScreen) {
                                ((SelectCharScreen) var2).v();
                            }
                        } else {
                            for (int var4 = 0; var4 < var2.f.size(); ++var4) {
                                vdtt_k var5;
                                if ((var5 = (vdtt_k) var2.f.elementAt(var4)) instanceof vdtt_by) {
                                    vdtt_by var6 = (vdtt_by) var5;
                                    if (Gdx.app.getType() == ApplicationType.Desktop) {
                                        var3 = false;
                                        var6.b = var3;
                                        if (GameSrc.gI().aQ != null && GameSrc.gI().aQ.equals(var6)) {
                                            var6.setXY(-200, -200);
                                            var6.b(true);
                                        }
                                    }

                                    if (var6.T) {
                                        GameSrc.gI().a(var6);

                                        for (var1 = 0; var1 < DataCenter.gI().currentScreen.f.size(); ++var1) {
                                            ((vdtt_k) DataCenter.gI().currentScreen.f.elementAt(var1)).b = false;
                                        }

                                        return true;
                                    }
                                }
                            }
                        }
                    }
            }

            this.canvas.keyDown(c(var1));
            return true;
        } else {
            return false;
        }
    }

    public final boolean keyUp(int var1) {
        this.canvas.keyUp(c(var1));
        return false;
    }

    public final boolean keyTyped(char var1) {
        if (d.get(Integer.valueOf(var1)) != null) {
            this.canvas.keyTyped(var1);
        }

        return false;
    }

    private int a(int var1) {
        return (var1 + this.e) / DataCenter.gI().p;
    }

    private int b(int var1) {
        return (var1 + this.f) / DataCenter.gI().p;
    }

    public final boolean touchDown(int n, int n2, int n3, int n4) {
        this.lastMouse = n3;
        if (DataCenter.gI().pointHelper != null && DataCenter.gI().pointHelper.a()) {
            PointHelper pointHelper = DataCenter.gI().pointHelper;
            if (Utlis.a(pointHelper.c, pointHelper.d, pointHelper.c + 50, pointHelper.d + 50, n / DataCenter.gI().r + 25, n2 / DataCenter.gI().r + 25)) {
                pointHelper.f = false;
            } else if (pointHelper.a()) {
                pointHelper.f = true;
                pointHelper.g = pointHelper.a;
                pointHelper.e = 2;
                pointHelper.h = 0.0f;
            }
        }
        this.canvas.touchDown(this.a(n), this.b(n2));
        return true;
    }


    public final boolean touchUp(int var1, int var2, int var3, int var4) {
        if (this.lastMouse != var3) {
            return false;
        } else {
            this.canvas.touchUp(this.a(var1), this.b(var2));
            return true;
        }
    }

    public boolean touchCancelled(int var1, int var2, int var3, int var4) {
        return false;
    }

    public final boolean touchDragged(int var1, int var2, int var3) {
        if (this.lastMouse != var3) {
            return false;
        } else {
            this.canvas.touchDragged(this.a(var1), this.b(var2));
            return true;
        }
    }

    public final boolean mouseMoved(int var1, int var2) {
        return false;
    }

    public boolean scrolled(float var1, float var2) {
        return false;
    }

    public final boolean scrolled(int var1) {
        return false;
    }

    private static int c(int var0) {
        Integer var1;
        return (var1 = (Integer) c.get(var0)) == null ? Integer.MIN_VALUE : var1;
    }

    static {
        a();
    }
}

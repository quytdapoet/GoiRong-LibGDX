package gro;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputMultiplexer;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.*;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.utils.ScissorStack;
import com.badlogic.gdx.utils.Scaling;
import com.badlogic.gdx.utils.viewport.FillViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import java.util.Vector;

public abstract class Canvas implements Screen {

    public Graphics graphics;
    public OrthographicCamera camera;
    public int width;
    public int height;
    public Viewport viewport;
    private InputMultiplexer input;
    public Stage stage;
    public static Vector vTexture = new Vector();
    public static Vector vImage = new Vector();
    private boolean isPause = false;
    public static boolean isReload = false;

    public Canvas() {
        try {
            this.create();
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public final void create() {
        try {
            short[] var1 = Utlis.h(); 
            if (Gdx.app.getType() == ApplicationType.Desktop) {
                this.width = var1[0];
                this.height = var1[1];
            } else {
                this.width = Gdx.graphics.getWidth();
                this.height = Gdx.graphics.getHeight();
            }

            this.width = Gdx.graphics.getWidth();
            this.height = Gdx.graphics.getHeight();
            if (this.camera == null) {
                this.camera = new OrthographicCamera((float) this.width, (float) this.height);
            }

            this.camera.setToOrtho(true, (float) this.width, (float) this.height);
            if (this.graphics == null) {
                this.graphics = new Graphics(this);
            }

            this.setZoomLevel();
            if (Gdx.app.getType() == ApplicationType.Desktop) {
                this.viewport = new vdtt_ab(Scaling.fill, (float) (this.width * DataCenter.gI().r / DataCenter.gI().p - this.width % DataCenter.gI().p), (float) (this.height * DataCenter.gI().r / DataCenter.gI().p - this.height % DataCenter.gI().p), this.camera);
            } else {
                this.viewport = new FillViewport((float) (this.width * DataCenter.gI().r / DataCenter.gI().p - this.width % DataCenter.gI().p), (float) (this.height * DataCenter.gI().r / DataCenter.gI().p - this.height % DataCenter.gI().p), this.camera);
            }

            this.stage = new Stage(this.viewport, this.graphics.c());
            this.input = new InputMultiplexer();
            this.input.addProcessor(new mInputProcessor(this, 0, 0));
            this.input.addProcessor(this.stage);
            Gdx.input.setInputProcessor(this.input);
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public final void setZoomLevel() {
        if (Gdx.app.getType() != ApplicationType.Android && Gdx.app.getType() != ApplicationType.iOS) {
            if (this.width >= 640 && this.height >= 480) {
                DataCenter.gI().r = 2;
            } else {
                DataCenter.gI().r = 1;
            }
        } else if (this.width >= 2560 && this.height >= 1440) {
            DataCenter.gI().r = 6;
        } else if (this.width >= 1920 && this.height >= 1200) {
            DataCenter.gI().r = 5;
        } else if (this.width >= 1280 && this.height >= 960) {
            DataCenter.gI().r = 4;
        } else if (this.width >= 960 && this.height >= 720) {
            DataCenter.gI().r = 3;
        } else if (this.width >= 640 && this.height >= 480) {
            DataCenter.gI().r = 2;
        } else {
            DataCenter.gI().r = 2;
        }

        if (mConfig.gI().a(15)) {
            --DataCenter.gI().r;
        }

        DataCenter.gI().p = DataCenter.gI().r;
        if (DataCenter.gI().p == 3 && (mConfig.gI().b(2) == 0 || mConfig.gI().b(2) == 3)) {
            DataCenter.gI().r = 2;
        } else if ((DataCenter.gI().p == 4 || DataCenter.gI().p == 5 || DataCenter.gI().p == 6) && mConfig.gI().b(2) == 0) {
            DataCenter.gI().r = 3;
        }

        if (DataCenter.gI().r > 4) {
            DataCenter.gI().r = 4;
        }

    }

    private void render(boolean var1) {
        long var2 = System.currentTimeMillis();

        int var4;
        try {
            Graphics var5;
            if (isReload) {
                isReload = false;
                var5 = this.graphics;

                try {
                    if (var5.b != null) {
                        var5.b.getShader().dispose();
                        var5.b.dispose();
                        var5.b = null;
                    }

                    var5.c().setProjectionMatrix(var5.g.camera.combined);
                    var5.c.dispose();
                    var5.c = new ShapeRenderer();
                    var5.c.setProjectionMatrix(var5.g.camera.combined);
                } catch (Exception var17) {
                    Utlis.a(var17);
                }
            }

            byte[] var6 = AppListener.n;
            var6[var6.length - 1] = (byte) Utlis.a((int) 256);
            ++DataCenter.gI().h;
            ++DataCenter.gI().g;
            this.camera.update();
            this.update();
            if (var1) {
                if (!Graphics.i()) {
                    Gdx.gl.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
                    Gdx.gl.glClear(16384);
                    Gdx.gl.glEnable(3042);
                    Gdx.gl20.glLineWidth((float) DataCenter.gI().r);
                    var5 = this.graphics;

                    try {
                        var5.c().setProjectionMatrix(var5.g.camera.combined);
                        var5.c.setProjectionMatrix(var5.g.camera.combined);
                    } catch (Exception var16) {
                        Utlis.a(var16);
                    }

                    var5 = this.graphics;

                    try {
                        var5.c().begin();
                        var5.c().enableBlending();
                        var5.c.begin(ShapeRenderer.ShapeType.Line);
                    } catch (Exception var15) {
                        Utlis.a(var15);
                    }

                    this.graphics.o();
                    this.graphics.d(0, 0, DataCenter.gI().n, DataCenter.gI().o);
                    this.paint(this.graphics);
                    PointHelper var7;
                    if ((var7 = DataCenter.gI().pointHelper).f) {
                        if (var7.e == 2) {
                            var7.g -= var7.g / 6;
                            if (var7.g < 65) {
                                var7.g = 65;
                                var7.e = 3;
                            }
                        } else if (var7.e == 5) {
                            var7.g -= var7.g / 15;
                            var7.h = (float) (65 - var7.g) / 30.0F;
                            if (var7.g < 35) {
                                var7.g = 35;
                                var7.f = false;
                                var7.e = 1;
                            }
                        } else {
                            ++var7.e;
                        }
                    }

                    PointHelper var8 = DataCenter.gI().pointHelper;
                    Graphics var9 = this.graphics;
                    GameSrc var10;
                    if (var8.b() && GameSrc.gI().D() && ((var10 = GameSrc.gI()).k == null || !(var10.k instanceof vdtt_bp)) && GameSrc.gI().bQ <= 0) {
                        DataCenter.n();
                        if (var8.f) {
                            var9.d((int) ((1.0F - var8.h) * 100.0F));
                            vdtt_cz.a(var9, 857, 0, var8.c - var8.g / 2, var8.d - var8.g / 2, var8.g * DataCenter.gI().r, var8.g * DataCenter.gI().r, 0, 0, 50, 50, 0);
                            var9.m = 1.0F;
                        }

                        if (DataCenter.gI().h % 6 >= 3) {
                            vdtt_cz.a(var9, 419, 0, var8.c + 1, var8.d + 1, 20);
                        } else {
                            vdtt_cz.a(var9, 419, 0, var8.c, var8.d, 20);
                        }
                    }

                    var5 = this.graphics;

                    try {
                        var5.j = false;
                        var5.c().end();
                        var5.c.end();
                        if (!var5.j()) {
                            var5.c().flush();
                            ScissorStack.popScissors();
                        }
                    } catch (Exception var14) {
                    }
                } else {
                    Gdx.gl.glClear(16384);
                }
            }

            while (vTexture.size() > 0) {
                try {
                    ((Texture) vTexture.elementAt(0)).dispose();
                    vTexture.remove(0);
                } catch (Exception var13) {
                    Utlis.b("khong xoa dc textures");
                }
            }

            for (var4 = vImage.size() - 1; var4 >= 0; --var4) {
                try {
                    mImage var20 = (mImage) vImage.get(var4);
                    if (var2 - var20.e > 10000L) {
                        vImage.remove(var20);
                        var20.d();
                    }
                } catch (Exception var12) {
                    Utlis.b("khong xoa dc textures");
                }
            }
        } catch (Exception var18) {
            Utlis.a(var18);
        }

        long var19 = System.currentTimeMillis();
        if ((var4 = 25 - (int) (var19 - var2)) <= 0) {
            var4 = 1;
        }

        Utlis.a((long) var4);
    }

    public void render(float var1) {
        try {
            this.render(true);
            this.stage.act(Math.min(Gdx.graphics.getDeltaTime(), 0.033333335F));
            this.stage.draw();
        } catch (Exception var3) {
        }

    }

    public final int getWidth() {
        return DataCenter.gI().r != DataCenter.gI().p ? this.width / DataCenter.gI().p : this.width / DataCenter.gI().r;
    }

    public final int getHeight() {
        return DataCenter.gI().r != DataCenter.gI().p ? this.height / DataCenter.gI().p : this.height / DataCenter.gI().r;
    }

    public abstract void update();

    public abstract void paint(Graphics var1);

    public abstract void keyDown(int var1);

    public abstract void keyTyped(char var1);

    public abstract void keyUp(int var1);

    public abstract void touchDragged(int var1, int var2);

    public abstract void touchDown(int var1, int var2);

    public abstract void touchUp(int var1, int var2);

    public void show() {
    }

    public void resize(int var1, int var2) {
        this.stage.getViewport().update(this.width, this.height, true);
    }

    public void pause() {
        vdtt_aa var1;
        (var1 = vdtt_aa.gI()).a = true;
        var1.c();
        this.isPause = true;
        if (Gdx.app.getType() != ApplicationType.Android.Desktop && Gdx.app.getType() != ApplicationType.iOS) {
            (new Thread(new vdtt_q(this))).start();
        }

    }

    public void resume() {
        this.isPause = false;
        vdtt_aa var1;
        (var1 = vdtt_aa.gI()).a = false;
        var1.f = false;

        try {
            if (mConfig.gI().a(1)) {
                var1.k();
            }

            if (var1.d != null && var1.d.isPlaying()) {
                var1.d.setVolume(vdtt_aa.g());
            }
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }

    public void hide() {
    }

    public void dispose() {
        vdtt_aa var1;
        (var1 = vdtt_aa.gI()).h();
        var1.i();
        if (var1.d != null) {
            var1.d.dispose();
            var1.d = null;
        }

    }

    static boolean a(Canvas var0) {
        return var0.isPause;
    }

    static void a(Canvas var0, boolean var1) {
        var0.render(false);
    }
}

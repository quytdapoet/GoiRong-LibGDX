package gro;

import java.io.IOException;
import java.util.Comparator;
import java.util.Vector;

public final class Item implements Cloneable {

    public static final Comparator comparator = new vdtt_fo();
    public int idBuy;
    public int id;
    public int amount;
    public int e = -1;
    public int index;
    public byte g;
    public long h = -1L;
    public String strData = "";
    public String nameCreate = "";
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public byte level;
    public boolean isLock;
    private vdtt_es x;
    public vdtt_es u;
    public vdtt_es v;
    public int w;

    public final Item a() {
        try {
            Item var1;
            (var1 = (Item) super.clone()).u = null;
            var1.x = null;
            return var1;
        } catch (Exception var2) {
            Utlis.a(var2);
            return null;
        }
    }

    public final Item b() {
        try {
            Item var1 = (Item) super.clone();
            if (this.u != null) {
                var1.u = this.u.o();
            }

            if (this.x != null) {
                var1.x = this.x.o();
            }

            return var1;
        } catch (Exception var2) {
            return null;
        }
    }

    public Item() {
    }

    public Item(int var1) {
        this.id = var1;
    }

    public Item(int var1, boolean var2) {
        this.id = (short) var1;
        this.isLock = var2;
    }

    public Item(int var1, boolean var2, int var3) {
        this.id = (short) var1;
        this.isLock = true;
        this.amount = var3;
    }

    public final void a(Graphics var1) {
        if (this.id == 160) {
            this.isLock = true;
        }

        if (Char.gI().sys == 1) {
            if (this.id == 830) {
                this.getItemTemplate().idIcon = 772;
            } else if (this.id == 831) {
                this.getItemTemplate().idIcon = 329;
            } else if (this.id == 832) {
                this.getItemTemplate().idIcon = 798;
            } else if (this.id == 835) {
                this.getItemTemplate().idIcon = 771;
            }
        } else if (Char.gI().sys == 2) {
            if (this.id == 830) {
                this.getItemTemplate().idIcon = 779;
            } else if (this.id == 831) {
                this.getItemTemplate().idIcon = 330;
            } else if (this.id == 832) {
                this.getItemTemplate().idIcon = 804;
            } else if (this.id == 835) {
                this.getItemTemplate().idIcon = 778;
            }
        } else if (Char.gI().sys == 3) {
            if (this.id == 830) {
                this.getItemTemplate().idIcon = 786;
            } else if (this.id == 831) {
                this.getItemTemplate().idIcon = 340;
            } else if (this.id == 832) {
                this.getItemTemplate().idIcon = 810;
            } else if (this.id == 835) {
                this.getItemTemplate().idIcon = 785;
            }
        } else if (Char.gI().sys == 4) {
            if (this.id == 830) {
                this.getItemTemplate().idIcon = 793;
            } else if (this.id == 831) {
                this.getItemTemplate().idIcon = 327;
            } else if (this.id == 832) {
                this.getItemTemplate().idIcon = 816;
            } else if (this.id == 835) {
                this.getItemTemplate().idIcon = 792;
            }
        }

        short var2 = this.an();
        if (this.id == 435 && this.level == 15) {
            var2 = 998;
        }

        if (this.strData != null && this.strData.startsWith("436,") && !DataCenter.k()) {
            var2 = DataCenter.gI().itemTemplate[this.L()[0].option[1]].idIcon;
            vdtt_y.a(var1, var2, 0, 0, 0, 80, (byte) 3);
        } else {
            if (this.getItemTemplate() != null) {
                switch (this.id) {
                    case 295:
                        this.level = 6;
                        break;
                    case 296:
                        this.level = 8;
                        break;
                    case 297:
                        this.level = 10;
                }
            }

            if (this.u != null) {
                this.u.n();
                this.u.paintTop(var1);
            }

            if (this.getItemTemplate() != null) {
                if (this.id == 655 && DataCenter.gI().h % 100 == Utlis.a(0, 20)) {
                    vdtt_cz.a(var1, var2, 0, Utlis.a(-1, 1), Utlis.a(-1, 1), 3);
                } else if (this.id == 9) {
                    vdtt_cz.a(var1, var2 + DataCenter.gI().h / 7 % 4, 0, 0, 0, 3);
                } else if (this.getItemTemplate().type == 10) {
                    int[] var3 = new int[]{-2, -159, -5, -20, 0, 25, 70, 71, -112, -107, -71, -60};
                    var1.c((float) var3[this.getItemTemplate().levelNeed - 10]);
                    vdtt_cz.a(var1, var2, 0, 0, 0, 3);
                    var1.r();
                } else if (this.getItemTemplate().type == 100 && this.getItemTemplate().name.startsWith(Caption.vq)) {
                    if (mConfig.gI().d()) {
                        vdtt_cz.a(var1, var2, 0, 0, 0, 3);
                        vdtt_cz.a(var1, 647, 0, 0, 0, 3);
                    } else {
                        vdtt_cz.a(var1, 646, 0, 0, 0, 3);
                        vdtt_cz.a(var1, var2, 0, 0, 0, 3);
                    }
                } else {
                    vdtt_cz.a(var1, var2, 0, 0, 0, 3);
                }
            }

            this.ar();
            if (this.x != null) {
                this.x.n();
                this.x.paintTop(var1);
            }
        }

    }

    private void ar() {
        if (this.x == null) {
            this.x = new vdtt_es(0, 0, 0, -1);
            this.u = new vdtt_es(0, 0, 0, -1);
            if (this.level >= 4) {
                this.x.k = 365;
                this.u.k = 366;
                if (this.level >= 4 && this.level <= 5) {
                    this.x.H = 0;
                    this.u.H = 0;
                } else if (this.level >= 6 && this.level <= 7) {
                    this.x.H = 25;
                    this.u.H = 25;
                } else if (this.level >= 8 && this.level <= 9) {
                    this.x.H = -112;
                    this.u.H = -112;
                } else if (this.level >= 10 && this.level <= 11) {
                    this.x.H = -107;
                    this.u.H = -107;
                } else if (this.level >= 12 && this.level <= 13) {
                    this.x.H = -160;
                    this.u.H = -160;
                } else if (this.level == 14) {
                    this.x.H = -71;
                    this.u.H = -71;
                } else if (this.level == 15) {
                    this.x.H = 70;
                    this.u.H = 70;
                } else if (this.level >= 16) {
                    this.x.H = 65;
                    this.u.H = 65;
                }
            }

            int var1 = Utlis.a((int) 36);

            int var2;
            for (var2 = 0; var2 < var1; ++var2) {
                this.x.n();
            }

            var1 = Utlis.a((int) 36);

            for (var2 = 0; var2 < var1; ++var2) {
                this.u.n();
            }
        }

        if (this.level >= 4) {
            this.x.k = 365;
            this.u.k = 366;
            if (this.level >= 4 && this.level <= 5) {
                this.x.H = 0;
                this.u.H = 0;
                return;
            }

            if (this.level >= 6 && this.level <= 7) {
                this.x.H = 25;
                this.u.H = 25;
                return;
            }

            if (this.level >= 8 && this.level <= 9) {
                this.x.H = -112;
                this.u.H = -112;
                return;
            }

            if (this.level >= 10 && this.level <= 11) {
                this.x.H = -107;
                this.u.H = -107;
                return;
            }

            if (this.level >= 12 && this.level <= 13) {
                this.x.H = -160;
                this.u.H = -160;
                return;
            }

            if (this.level == 14) {
                this.x.H = -71;
                this.u.H = -71;
                return;
            }

            if (this.level == 15) {
                this.x.H = 70;
                this.u.H = 70;
                return;
            }

            if (this.level >= 16) {
                this.x.H = 65;
                this.u.H = 65;
                return;
            }
        } else {
            this.x = null;
            this.u = null;
        }

    }

    public final int c() {
        if (this.m > 0) {
            return this.m;
        } else if (this.n > 0) {
            return this.n;
        } else if (this.k > 0) {
            return this.k;
        } else if (this.l > 0) {
            return this.l;
        } else {
            return this.o > 0 ? this.o : 0;
        }
    }

    public final int d() {
        if (this.m > 0) {
            return -3;
        } else if (this.n > 0) {
            return -4;
        } else if (this.k > 0) {
            return -5;
        } else if (this.l > 0) {
            return -6;
        } else if (this.p > 0) {
            return -32;
        } else {
            return this.o > 0 ? -9 : 0;
        }
    }

    public final String e() {
        if (this.m > 0) {
            return Utlis.c(this.m) + " " + Caption.yO[0];
        } else if (this.n > 0) {
            return Utlis.c(this.n) + " " + Caption.yO[1];
        } else if (this.k > 0) {
            return Utlis.c(this.k) + " " + Caption.yO[2];
        } else if (this.l > 0) {
            return Utlis.c(this.l) + " " + Caption.yO[3];
        } else if (this.p > 0) {
            return Utlis.c(this.p) + " " + Caption.yO[5];
        } else {
            return this.o > 0 ? Utlis.c(this.o) + " " + Caption.yO[4] : "";
        }
    }

    public final String f() {
        if (this.m > 0) {
            return Caption.yO[0];
        } else if (this.n > 0) {
            return Caption.yO[1];
        } else if (this.k > 0) {
            return Caption.yO[2];
        } else if (this.l > 0) {
            return Caption.yO[3];
        } else if (this.p > 0) {
            return Caption.yO[5];
        } else {
            return this.o > 0 ? Caption.yO[4] : "";
        }
    }

    public final String g() {
        ItemOption[] var1 = this.L();
        int var2 = 0;
        if (this.i() && var1 != null) {
            var2 = 0 + var1.length;
        }

        if (this.getItemTemplate().type == 34) {
            var2 = 100000;
        }

        if (this.id == 185) {
            var2 = 50000;
        }

        if (this.id == 186) {
            var2 = 100000;
        } else if (this.id == 187) {
            var2 = 200000;
        }

        return this.i() && !this.isLock ? Utlis.c(var2) + Caption.fh : Utlis.c(var2) + Caption.da;
    }

    public final ItemTemplate getItemTemplate() {
        try {
            if (this.id >= 0) {
                return DataCenter.gI().itemTemplate[this.id];
            }
        } catch (Exception var2) {
            Utlis.a(var2);
        }

        return null;
    }

    public final boolean i() {
        if (this.ai()) {
            return false;
        } else {
            for (int var1 = 0; var1 < DataCenter.gI().dataTypeItemBody.length; ++var1) {
                if (DataCenter.gI().dataTypeItemBody[var1].type == this.getItemTemplate().type) {
                    return true;
                }
            }

            return false;
        }
    }

    public final boolean j() {
        return this.getItemTemplate().type == 1 && !this.ai();
    }

    public final boolean k() {
        return this.getItemTemplate().type == 0 || this.getItemTemplate().type == 2 || this.getItemTemplate().type == 4 || this.getItemTemplate().type == 6 || this.getItemTemplate().type == 8;
    }

    public final boolean l() {
        return this.getItemTemplate().type == 3 || this.getItemTemplate().type == 5 || this.getItemTemplate().type == 7 || this.getItemTemplate().type == 9;
    }

    public final boolean m() {
        return this.getItemTemplate().type == 12;
    }

    public final boolean n() {
        return this.as() || this.id == 310;
    }

    private boolean as() {
        try {
            ItemOption[] var1;
            if (this.getItemTemplate().type == 11 && (var1 = this.L()) != null) {
                for (int var2 = 0; var2 < var1.length; ++var2) {
                    if (var1[var2].option[0] == 128 && var1[var2].option[1] == var1[var2].f() && var1[var2].f() < 16000) {
                        return true;
                    }
                }
            }
        } catch (Exception var3) {
        }

        return false;
    }

    public final boolean o() {
        return this.at() || this.id == 685;
    }

    private boolean at() {
        try {
            if (this.getItemTemplate().type == 13) {
                ItemOption[] var1 = this.L();
                int var2 = 0;
                if (var1 != null) {
                    for (int var3 = 0; var3 < var1.length; ++var3) {
                        if (var1[var3].option[0] >= 53 && var1[var3].option[0] <= 62 && var1[var3].option[1] == var1[var3].f() && var1[var3].f() < 16000) {
                            ++var2;
                            if (var2 == 2) {
                                return true;
                            }
                        }
                    }
                }
            }
        } catch (Exception var4) {
        }

        return false;
    }

    public final boolean p() {
        return this.getItemTemplate().type == 21;
    }

    public final boolean q() {
        return this.getItemTemplate().type == 14 && this.getItemTemplate().levelNeed <= Char.gI().w();
    }

    public final boolean r() {
        ItemOption[] var1;
        if (this.getItemTemplate().type == 14 && (var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].getItemOptionTemplate().type == 14) {
                    return true;
                }
            }
        }

        return false;
    }

    public final boolean s() {
        return this.getItemTemplate().type == 14 && this.h == -1L && this.level > 0;
    }

    public final boolean t() {
        return this.p() || this.v() || this.id == 162 || this.id == 823;
    }

    public final boolean u() {
        ItemOption[] var1;
        if (this.getItemTemplate().levelNeed >= 50 && (var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].option[0] == 159 || var1[var2].option[0] == 163 || var1[var2].option[0] == 164 || var1[var2].option[0] == 165) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean au() {
        if (!this.ai() && !this.x()) {
            if (!this.y()) {
                return false;
            } else if (this.id != 609 && this.id != 624 && this.id != 639 && this.id != 654) {
                ItemOption[] var1;
                if ((var1 = this.L()) != null) {
                    for (int var2 = 0; var2 < var1.length; ++var2) {
                        if (var1[var2].n()) {
                            return true;
                        }
                    }
                }

                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public final boolean v() {
        if (!this.ai() && !this.w()) {
            return this.getItemTemplate().type >= 0 && this.getItemTemplate().type <= 9 && (this.level < 14 || this.au() && this.level < 15);
        } else {
            return false;
        }
    }

    public final boolean w() {
        return this.getItemTemplate().type == 0;
    }

    public final boolean x() {
        return this.getItemTemplate().type == 0 || this.getItemTemplate().type == 3 || this.getItemTemplate().type == 5 || this.getItemTemplate().type == 7 || this.getItemTemplate().type == 9 || this.getItemTemplate().type == 11;
    }

    public final boolean y() {
        return this.k() || this.l() || this.j();
    }

    public final boolean z() {
        return this.id >= 1037 && this.id <= 1044;
    }

    public final boolean A() {
        if (this.z()) {
            return false;
        } else {
            return this.getItemTemplate().type == 35 || this.getItemTemplate().type == 36 || this.getItemTemplate().type == 32 || this.az();
        }
    }

    public final boolean B() {
        if (!this.ai() && !this.x()) {
            return this.getItemTemplate().type >= 0 && this.getItemTemplate().type <= 9 && this.level > 0;
        } else {
            return false;
        }
    }

    public final boolean C() {
        if (!this.ai() && !this.x()) {
            if (!this.y()) {
                return false;
            } else {
                ItemOption[] var1;
                if ((var1 = this.L()) != null) {
                    for (int var2 = 0; var2 < var1.length; ++var2) {
                        if (var1[var2].l()) {
                            return true;
                        }
                    }
                }

                return false;
            }
        } else {
            return false;
        }
    }

    public final boolean D() {
        return this.getItemTemplate().type == 12 || this.id == 684;
    }

    public final boolean E() {
        if (!this.ai() && !this.x()) {
            return this.getItemTemplate().type >= 0 && this.getItemTemplate().type <= 9 || this.getItemTemplate().type == 25;
        } else {
            return false;
        }
    }

    public final boolean F() {
        return this.getItemTemplate().type == 12 && this.level < 16 || this.id == 683;
    }

    public final boolean G() {
        if (this.id == 160) {
            return true;
        } else {
            ItemOption[] var1;
            if (this.getItemTemplate().type == 13 && (var1 = this.L()) != null) {
                int var2 = 0;

                for (int var3 = 0; var3 < var1.length; ++var3) {
                    if (var1[var3].option[0] >= 53 && var1[var3].option[0] <= 62 && var1[var3].option[1] == var1[var3].f()) {
                        ++var2;
                        if (var2 == 2) {
                            return false;
                        }
                    }
                }

                return true;
            } else {
                return false;
            }
        }
    }

    public final boolean H() {
        return this.getItemTemplate().type == 1 && this.getItemTemplate().levelNeed >= 50 && this.ay() || this.id == 353;
    }

    private boolean av() {
        return this.getItemTemplate().type == 6 || this.getItemTemplate().type == 5 || this.getItemTemplate().type == 9;
    }

    private boolean aw() {
        return this.getItemTemplate().type == 0 || this.getItemTemplate().type == 4 || this.getItemTemplate().type == 3;
    }

    private boolean ax() {
        if (!this.ai() && !this.x()) {
            if (!this.y()) {
                return false;
            } else if ((this.id < 923 || this.id > 926) && !this.au()) {
                ItemOption[] var1;
                if ((var1 = this.L()) != null) {
                    for (int var2 = 0; var2 < var1.length; ++var2) {
                        if (var1[var2].m()) {
                            return true;
                        }
                    }
                }

                return false;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public final boolean I() {
        if (!this.ai() && !this.x()) {
            return this.ax() && !this.au() || this.id == 353 || this.id == 354 || this.id == 562 || this.id == 564 || this.id == 566;
        } else {
            return false;
        }
    }

    public final boolean J() {
        return this.av() && this.getItemTemplate().levelNeed >= 50 && this.ay() || this.id == 563;
    }

    public final boolean K() {
        return this.aw() && this.getItemTemplate().levelNeed >= 50 && this.ay() || this.id == 567;
    }

    public final void a(int var1) {
        ItemOption[] var2;
        if ((var2 = this.L()) != null) {
            int var3;
            int var4;
            int[] var5;
            if (var1 >= this.level) {
                for (var3 = this.level + 1; var3 <= var1; ++var3) {
                    for (var4 = 0; var4 < var2.length; ++var4) {
                        if (var2[var4].getItemOptionTemplate().type != 8) {
                            var5 = var2[var4].getItemOptionTemplate().a();
                            if (var3 <= var5.length) {
                                var2[var4].d(var5[var3 - 1]);
                            }
                        }
                    }
                }
            } else {
                for (var3 = this.level; var3 > var1; --var3) {
                    for (var4 = 0; var4 < var2.length; ++var4) {
                        if (var2[var4].getItemOptionTemplate().type != 8) {
                            var5 = var2[var4].getItemOptionTemplate().a();
                            if (var3 <= var5.length) {
                                var2[var4].d(-var5[var3 - 1]);
                            }
                        }
                    }
                }
            }
        }

        this.level = (byte) var1;
        this.strData = a(var2);
    }

    public final ItemOption[] L() {
        if (this.strData != null && this.strData.length() > 0) {
            String[] var1;
            ItemOption[] var2 = new ItemOption[(var1 = Utlis.a(this.strData, ";")).length];

            for (int var3 = 0; var3 < var1.length; ++var3) {
                var2[var3] = new ItemOption(var1[var3]);
            }

            return var2;
        } else {
            return null;
        }
    }

    public static String a(Vector var0) {
        ItemOption[] var1 = new ItemOption[var0.size()];

        for (int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = (ItemOption) var0.get(var2);
        }

        return a(var1);
    }

    public static String a(ItemOption[] var0) {
        String var1 = "";
        if (var0 != null) {
            for (int var2 = 0; var2 < var0.length; ++var2) {
                var1 = var1 + var0[var2].g();
                if (var2 < var0.length - 1) {
                    var1 = var1 + ";";
                }
            }
        }

        return var1;
    }

    public static String b(int var0) {
        if (var0 >= 1000000000) {
            return Utlis.c(var0 / 1000000) + "M";
        } else {
            return var0 >= 1000000 ? Utlis.c(var0 / 1000) + "K" : Utlis.c(var0);
        }
    }

    public final int M() {
        if (this.id == 190) {
            return this.amount / 10;
        } else if (this.id == 826) {
            return this.amount <= 0 ? 0 : this.amount - 1;
        } else {
            return this.amount <= 0 ? 1 : this.amount;
        }
    }

    public final void c(int var1) {
        if (var1 <= 0) {
            this.amount = 1;
        }

        this.amount = var1;
    }

    public final String N() {
        if (this.h >= 2592000000L) {
            return this.h / 2592000000L + " " + Caption.yS[0];
        } else if (this.h >= 604800000L) {
            return this.h / 604800000L + " " + Caption.yS[1];
        } else if (this.h >= 86400000L) {
            return this.h / 86400000L + " " + Caption.yS[2];
        } else if (this.h >= 3600000L) {
            return this.h / 3600000L + " " + Caption.yS[3];
        } else {
            return this.h >= 60000L ? this.h / 60000L + " " + Caption.yS[4] : this.h / 1000L + " " + Caption.yS[5];
        }
    }

    public final String O() {
        return this.h == -1L ? Caption.mJ : Utlis.g(this.h);
    }

    public final void a(Message var1) throws IOException {
        this.id = var1.readShort();
        if (this.id >= 0) {
            this.isLock = var1.readBoolean();
            this.h = var1.readLong();
            if (!this.i() && !this.ai()) {
                this.c(var1.readInt());
            } else {
                this.g = var1.readByte();
                this.level = var1.readByte();
                this.strData = var1.reader.readUTF();
                this.nameCreate = var1.reader.readUTF();
            }

            if (this.aA()) {
                this.strData = var1.reader.readUTF();
            }

            this.index = var1.readShort();
        }

    }

    public final boolean P() {
        ItemOption[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].option[0] == 159) {
                    return true;
                }
            }
        }

        return false;
    }

    public final boolean Q() {
        ItemOption[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].option[0] == 165) {
                    return true;
                }
            }
        }

        return false;
    }

    public final boolean R() {
        ItemOption[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].option[0] == 163) {
                    return true;
                }
            }
        }

        return false;
    }

    public final boolean S() {
        ItemOption[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].option[0] == 164) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean ay() {
        ItemOption[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].option[0] == 148) {
                    return true;
                }
            }
        }

        return false;
    }

    public final boolean T() {
        if (this.z()) {
            return true;
        } else {
            return this.getItemTemplate().type != 21 && this.getItemTemplate().type != 32 && this.getItemTemplate().type != 35 && this.getItemTemplate().type != 36 && this.getItemTemplate().type != 98 && this.getItemTemplate().type != 25 && this.id != 162 && this.id != 823 && this.id != 176;
        }
    }

    public final ItemOption a(Vector var1, int var2) {
        var2 = ItemOption.f(var2);
        ItemOption[] var3 = this.L();
        ItemOption var4 = null;
        if (var3 != null) {
            for (int var5 = 0; var5 < var3.length; ++var5) {
                if (var3[var5].getItemOptionTemplate().type == 8) {
                    var1.add(var3[var5]);
                    if (var3[var5].option[0] == var2) {
                        var4 = var3[var5];
                    }
                }
            }
        }

        return var4;
    }

    public final int[] a(int var1, int var2) {
        ItemOption[] var3;
        if ((var3 = this.L()) == null) {
            return null;
        } else {
            int var4 = ItemOption.f(var2);
            int[] var5 = null;
            boolean var6 = this.U();

            for (int var7 = 0; var7 < var3.length; ++var7) {
                if (var3[var7].getItemOptionTemplate().type == 8 && var3[var7].option[0] == var4) {
                    int var8 = var3[var7].i();
                    (var5 = new int[4])[0] = var2;
                    var5[1] = var8;
                    var5[2] = var8;
                    int[] var9 = var3[var7].getItemOptionTemplate().a();

                    for (int var10 = var8 + 1; var10 <= var9.length; ++var10) {
                        if (var1 >= DataCenter.gI().ar[var10]) {
                            if (var6) {
                                if (var10 > 17) {
                                    continue;
                                }
                            } else if (var10 > 16) {
                                continue;
                            }

                            var5[1] = var8;
                            var5[2] = var10;
                            var5[3] += DataCenter.gI().ar[var10];
                            var1 -= DataCenter.gI().ar[var10];
                            var3[var7].d(var9[var10 - 1]);
                            var3[var7].option[3] = var10;
                        }
                    }
                }
            }

            this.strData = a(var3);
            return var5;
        }
    }

    public final boolean U() {
        ItemOption[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].option[0] == 165 || var1[var2].option[0] == 164 || var1[var2].option[0] == 163 || var1[var2].option[0] == 159) {
                    return true;
                }
            }
        }

        return false;
    }

    public final int V() {
        ItemOption[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].option[0] == 349) {
                    return var1[var2].option[1];
                }
            }
        }

        return 0;
    }

    public final int W() {
        ItemOption[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].option[0] == 350) {
                    return var1[var2].f();
                }
            }
        }

        return 0;
    }

    public final int X() {
        ItemOption[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].option[0] == 350) {
                    return var1[var2].option[1];
                }
            }
        }

        return 0;
    }

    public final int Y() {
        ItemOption[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].option[0] == 298) {
                    return var1[var2].f();
                }
            }
        }

        return 0;
    }

    public final boolean Z() {
        long var1 = Utlis.a();
        return this.h != -1L && this.h < var1;
    }

    public final boolean aa() {
        return this.id >= 670 && this.id <= 681;
    }

    public final boolean ab() {
        if (!this.ai() && !this.x()) {
            if (!this.y()) {
                return false;
            } else {
                ItemOption[] var1;
                if ((var1 = this.L()) != null) {
                    int var2 = 0;

                    for (int var3 = 0; var3 < var1.length; ++var3) {
                        if (var1[var3].option[0] == 298 && var1[var3].f() >= 5) {
                            ++var2;
                        }
                    }

                    if (var2 >= 3) {
                        return false;
                    }
                }

                return true;
            }
        } else {
            return false;
        }
    }

    private boolean az() {
        ItemOption[] var1;
        if (this.y() && (var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].k()) {
                    return true;
                }
            }
        }

        return false;
    }

    public final boolean ac() {
        return !this.isLock;
    }

    public final boolean ad() {
        return this.amount > 1 && this.getItemTemplate().type != 24 && this.id != 499 && this.id != 500 && this.id != 927 && this.id != 952 && this.id != 938 && this.id != 1047 && (this.id < 901 || this.id > 907) && !this.getItemTemplate().detail.toLowerCase().contains(Caption.rS.toLowerCase()) && !this.getItemTemplate().detail.contains("1.000");
    }

    public final boolean ae() {
        return this.getItemTemplate().isXepChong && this.amount > 1;
    }

    public final boolean af() {
        return this.id == 168 || d(this.id);
    }

    public static boolean d(int var0) {
        if (var0 == 569 || var0 >= 716 && var0 <= 720) {
            return Char.gI().w() >= DataCenter.gI().itemTemplate[var0].levelNeed;
        } else {
            return false;
        }
    }

    public final boolean ag() {
        return this.id == 430 || this.id == 377 || this.id == 520 || this.id == 525 || this.id == 922 || this.id == 960;
    }

    public final String ah() {
        if (this.level > 14) {
            return 7 + this.level - 14 + Caption.sY;
        } else {
            return this.level % 2 == 0 ? this.level / 2 + Caption.sY : this.level / 2 + Caption.sZ;
        }
    }

    private boolean aA() {
        return this.getItemTemplate().type == 99 || this.getItemTemplate().type == 35 || this.getItemTemplate().type == 36 || this.getItemTemplate().type == 37;
    }

    public final boolean ai() {
        return this.id >= 799 && this.id <= 806;
    }

    public final boolean aj() {
        return this.id == 724;
    }

    public final boolean ak() {
        return this.getItemTemplate().name.toLowerCase().startsWith(Caption.uW);
    }

    public final boolean al() {
        ItemOption[] var1;
        if ((var1 = this.L()) != null) {
            for (int var2 = 0; var2 < var1.length; ++var2) {
                if (var1[var2].option[0] == 413) {
                    return true;
                }
            }
        }

        return false;
    }

    public final void am() {
        this.isLock = this.id == 529 || this.id == 461 || this.id == 466 || this.id == 959 || this.id >= 1025 && this.id <= 1036;
    }

    public final short an() {
        if (DataCenter.k()) {
            if (this.getItemTemplate().type == 0) {
                return (short) (68 + this.getItemTemplate().typeChar - 1);
            }

            if (this.getItemTemplate().type == 2 || this.getItemTemplate().type == 3) {
                return 735;
            }

            if (this.getItemTemplate().type == 6 || this.getItemTemplate().type == 7) {
                return 736;
            }

            if (this.getItemTemplate().type == 11) {
                return 450;
            }

            if (this.getItemTemplate().type == 15) {
                return 449;
            }

            if (this.getItemTemplate().type == 14) {
                return 451;
            }

            if (this.id >= 771 && this.id <= 790 || this.id == 1002) {
                return 102;
            }

            if (this.id >= 727 && this.id <= 770 || this.id >= 1008 && this.id <= 1018) {
                switch (this.getItemTemplate().levelNeed) {
                    case 5:
                        return (short) (730 + this.getItemTemplate().typeChar - 1);
                    case 10:
                        return 390;
                    case 15:
                        return 760;
                    case 20:
                        return 759;
                    case 25:
                        return 761;
                    case 30:
                        return 391;
                    case 35:
                        return 762;
                    case 40:
                        return 392;
                    case 45:
                        return 763;
                    case 50:
                        return 393;
                    case 55:
                        return 764;
                }
            }
        }

        if (this.ap()) {
            switch (this.id) {
                case 871:
                    return 848;
                case 872:
                    return 985;
                case 873:
                    return 986;
                case 874:
                    return 987;
                default:
                    return 859;
            }
        } else {
            return this.getItemTemplate().idIcon;
        }
    }

    public final boolean ao() {
        return this.id == 309 || this.id == 1089;
    }

    public final boolean ap() {
        return this.strData.contains(";481,");
    }

    public final int aq() {
        return this.ap() ? 135 : this.getItemTemplate().a();
    }

    public final Object clone() {
        return this.a();
    }
}

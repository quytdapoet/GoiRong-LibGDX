package gro;

import java.io.IOException;
import java.util.Vector;

public final class Session {

    public static int countRecv;
    private long r;
    boolean isConnected;
    boolean isConnecting;
    mSocket socket;
    Writer writer;
    Reader reader;
    public Vector vecMessage = new Vector();
    Object lockSendMessage = new Object();
    Object lockTimeOut = new Object();
    public int countSend;
    public int k;
    public int l;
    public IMessageHandler handler;
    private static Session s;
    private short t = -1;
    boolean waitThreadSend;
    boolean waitThreadRecv;
    private Thread threadSendTypeClient;
    private Thread threadWaitTimeOut;
    Thread threadSendMessage;
    Thread threadRecvMessage;

    public static Session gI() {
        if (s == null) {
            s = new Session();
        }

        return s;
    }

    public final void connect(String var1, int var2) {
        try {
            Utlis.a(var1 + ":" + var2);
            this.waitThreadSend = this.waitThreadRecv = true;
            this.r = Utlis.a();
            this.isConnecting = this.isConnected = true;
            this.vecMessage.removeAllElements();
            this.f();
            this.g();
            this.b(var1, var2);
            this.e();

            for (int var3 = 0; var3 < 50 && this.waitThreadSend && this.waitThreadRecv; ++var3) {
                Utlis.a(100L);
            }
        } catch (Exception var4) {
            Utlis.a(var4);
        }

    }

    private void b(String var1, int var2) {
        this.threadSendTypeClient = new Thread(new RSendTypeClient(this, var1, var2));
        this.threadSendTypeClient.start();
    }

    private void e() {
        this.threadWaitTimeOut = new Thread(new RWaitTimeOut(this));
        this.threadWaitTimeOut.start();
    }

    private void f() {
        this.threadSendMessage = new Thread(new RSendMessage(this));
        this.threadSendMessage.start();
    }

    public final void a(int var1) {
        try {
            if (countRecv <= 0) {
                Writer var2;
                (var2 = new Writer()).writeByte(125);
                var2.writeByte(var1);
                this.vecMessage.add(var2.baos.toByteArray());
                synchronized (this.lockSendMessage) {
                    this.lockSendMessage.notify();
                }

                var2.close();
            }
        } catch (Exception var6) {
        }

    }

    public final void b(int var1) {
        try {
            if (countRecv <= 0) {
                Writer var2;
                (var2 = new Writer()).writeByte(124);
                var2.writeByte(var1);
                this.vecMessage.add(var2.baos.toByteArray());
                synchronized (this.lockSendMessage) {
                    this.lockSendMessage.notify();
                }

                var2.close();
            }
        } catch (Exception var6) {
        }

    }

    public final void a(short var1, short var2) {
        try {
            if (countRecv <= 0) {
                int var3 = GameSrc.gI().maxX / 255;
                if (GameSrc.gI().maxX % 255 != 0) {
                    ++var3;
                }

                Writer var4;
                (var4 = new Writer()).writeByte(123);
                var4.writeByte(var2 / 255 * var3 + var1 / 255);
                var4.writeByte(var1 % 255);
                var4.writeByte(var2 % 255);
                this.vecMessage.add(var4.baos.toByteArray());
                synchronized (this.lockSendMessage) {
                    this.lockSendMessage.notify();
                }

                var4.close();
            }
        } catch (Exception var8) {
        }

    }

    public final void b(short var1, short var2) {
        try {
            if (countRecv <= 0) {
                int var3 = GameSrc.gI().maxX / 255;
                if (GameSrc.gI().maxX % 255 != 0) {
                    ++var3;
                }

                Writer var4;
                (var4 = new Writer()).writeByte(-84);
                var4.writeByte(var2 / 255 * var3 + var1 / 255);
                var4.writeByte(var1 % 255);
                var4.writeByte(var2 % 255);
                this.vecMessage.add(var4.baos.toByteArray());
                synchronized (this.lockSendMessage) {
                    this.lockSendMessage.notify();
                }

                var4.close();
            }
        } catch (Exception var8) {
        }

    }

    public final void c(int var1) {
        try {
            if (countRecv <= 0) {
                Writer var2;
                (var2 = new Writer()).writeByte(-82);
                var2.writeByte(var1);
                this.vecMessage.add(var2.baos.toByteArray());
                synchronized (this.lockSendMessage) {
                    this.lockSendMessage.notify();
                }

                var2.close();
            }
        } catch (Exception var6) {
        }

    }

    public final void d(int var1) {
        try {
            if (countRecv <= 0) {
                Writer var2;
                (var2 = new Writer()).writeByte(-83);
                var2.writeByte(var1);
                this.vecMessage.add(var2.baos.toByteArray());
                synchronized (this.lockSendMessage) {
                    this.lockSendMessage.notify();
                }

                var2.close();
            }
        } catch (Exception var6) {
        }

    }

    public final void e(int var1) {
        try {
            Writer var2;
            (var2 = new Writer()).writeByte(61);
            var2.writeByte(var1);
            this.vecMessage.add(var2.baos.toByteArray());
            synchronized (this.lockSendMessage) {
                this.lockSendMessage.notify();
            }

            var2.close();
        } catch (Exception var6) {
        }

    }

    public final void a(int var1, int var2) {
        try {
            Writer var3 = new Writer();
            if (var2 < 127) {
                var3.writeByte(-65);
                var3.writeByte(var1);
                var3.writeByte(var2);
            } else {
                var3.writeByte(-60);
                var3.writeByte(var1);
                var3.writeShort(var2);
            }

            this.vecMessage.add(var3.baos.toByteArray());
            synchronized (this.lockSendMessage) {
                this.lockSendMessage.notify();
            }

            var3.close();
            if (((Mob) GameSrc.gI().focusEntity).x()) {
                GameSrc.gI().c(Caption.wz, -16711681);
            }
        } catch (Exception var7) {
        }

    }

    public final void b(int var1, int var2) {
        try {
            Writer var3 = new Writer();
            if (var2 < 127) {
                var3.writeByte(-64);
                var3.writeByte(var1);
                var3.writeByte(var2);
            } else {
                var3.writeByte(-87);
                var3.writeByte(var1);
                var3.writeShort(var2);
            }

            this.vecMessage.add(var3.baos.toByteArray());
            synchronized (this.lockSendMessage) {
                this.lockSendMessage.notify();
            }

            var3.close();
            if (((Mob) GameSrc.gI().focusEntity).x()) {
                GameSrc.gI().c(Caption.wz, -16711681);
            }
        } catch (Exception var7) {
        }

    }

    public final void c(int var1, int var2) {
        try {
            Writer var3;
            (var3 = new Writer()).writeByte(-81);
            var3.writeByte(var1);
            var3.writeInt(var2);
            this.vecMessage.add(var3.baos.toByteArray());
            synchronized (this.lockSendMessage) {
                this.lockSendMessage.notify();
            }

            var3.close();
        } catch (Exception var7) {
        }

    }

    public final void d(int var1, int var2) {
        try {
            Writer var3;
            (var3 = new Writer()).writeByte(20);
            var3.writeByte(var1);
            var3.writeInt(var2);
            this.vecMessage.add(var3.baos.toByteArray());
            synchronized (this.lockSendMessage) {
                this.lockSendMessage.notify();
            }

            var3.close();
        } catch (Exception var7) {
        }

    }

    private void a(Reader var1, boolean var2) throws IOException {
        byte var3 = var1.dis.readByte();
        byte var4 = 0;
        short var5 = 0;
        GameSrc var6;
        int var7;
        short var8;
        GameSrc var9;
        Char var10;
        int var11;
        short var12;
        int var13;
        Skill var14;
        int var15;
        int var18;
        switch (var3) {
            case -128:
                var3 = var1.dis.readByte();
                var15 = var1.dis.readInt();
                ++this.countSend;
                break;
            case -92:
                var9 = GameSrc.gI();
                var11 = var1.dis.readInt();
                var12 = var1.dis.readShort();
                short var16 = var1.dis.readShort();
                var15 = var1.dis.readUnsignedShort();
                short var17 = var16;
                var8 = var12;
                var7 = var11;
                var6 = var9;

                try {
                    (var10 = var6.m(var7)).aq = var15;
                    if (var10.bT == null) {
                        return;
                    }

                    (var10 = var10.bT).mp = var15;
                    if ((var14 = DataCenter.gI().skill[var8].a()) == null) {
                        return;
                    }

                    Mob var29;
                    if ((var29 = var6.j(var17)) != null) {
                        var29.Y = var10;
                    }

                    if (var10.idEntity != Char.gI().idEntity) {
                        if (var10.bc.size() > 0) {
                            vdtt_gj var31 = (vdtt_gj) var10.bc.lastElement();
                            var10.pointMove = var31;
                            var10.ae = var10.pointMove;
                            var10.bc.clear();
                        } else {
                            var10.ae = var10.pointMove;
                        }

                        var10.a(var14, var29, false);
                        if (var6.bq != null && var6.bq.a(var10)) {
                            var6.bq.a = var29;
                        }
                    }

                    if (var14.i()) {
                        var10.o();
                    }

                    return;
                } catch (Exception var26) {
                    Utlis.a(var26);
                    return;
                }
            case -91:
                var9 = GameSrc.gI();
                var11 = var1.dis.readInt();
                var12 = var1.dis.readShort();
                var18 = var1.dis.readInt();
                var15 = var1.dis.readUnsignedShort();
                var13 = var18;
                var8 = var12;
                var7 = var11;
                var6 = var9;

                try {
                    (var10 = var6.m(var7)).aq = var15;
                    if (var10.bT == null) {
                        return;
                    }

                    (var10 = var10.bT).mp = var15;
                    var14 = DataCenter.gI().skill[var8].a();
                    Char var30 = var6.m(var13);
                    if (var10.idEntity != Char.gI().idEntity) {
                        var10.a(var14, var30, false);
                    }

                    return;
                } catch (Exception var25) {
                    Utlis.a(var25);
                    return;
                }
            case -87:
                GameSrc.gI().a(var1.dis.readInt(), (short) var1.dis.readByte(), (short) -1);
                return;
            case -86:
                this.vecMessage.clear();
                gI().close();
                DataCenter var19 = DataCenter.gI();
                vdtt_cd var20 = LoginPCScreen.v();
                var19.currentScreen = var20;
                return;
            case -84:
                GameSrc.gI().a(var1.dis.readInt(), var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readUnsignedByte(), true);
                return;
            case -81:
                GameSrc.gI().a(var1.dis.readInt(), var1.dis.readShort(), (short) -1);
                return;
            case -80:
                var4 = var1.dis.readByte();
                var15 = var1.dis.readShort();
                break;
            case -79:
                var5 = var1.dis.readShort();
                var15 = var1.dis.readShort();
                break;
            case -65:
                GameSrc.gI().a(var1.dis.readInt(), var1.readUnsignedByte(), var1.readUnsignedByte());
                return;
            case -64:
                GameSrc.gI().a(var1.dis.readInt(), var1.readUnsignedByte(), var1.dis.readShort());
                return;
            case -63:
                GameSrc.gI().a(var1.dis.readInt(), var1.dis.readShort(), var1.readUnsignedByte());
                return;
            case -41:
                GameSrc.gI();
                GameSrc.p(var1.dis.readInt());
                return;
            case 20:
                var9 = GameSrc.gI();
                var11 = var1.dis.readInt();
                var12 = var1.dis.readShort();
                var13 = var1.dis.readInt();
                var8 = var12;
                var7 = var11;
                var6 = var9;

                try {
                    Char var21 = var6.m(var7);
                    Skill var22 = DataCenter.gI().skill[var8].a();
                    Char var23 = var6.m(var13);
                    if (var21.idEntity != Char.gI().idEntity) {
                        var21.a(var22, var23, false);
                    }

                    return;
                } catch (Exception var24) {
                    Utlis.a(var24);
                    return;
                }
            case 61:
                GameSrc.gI().a(var1.dis.readInt(), var1.dis.readShort(), var1.dis.readShort());
                return;
            case 123:
                GameSrc.gI().a(var1.dis.readInt(), var1.readUnsignedByte(), var1.readUnsignedByte(), var1.readUnsignedByte(), false);
                return;
            default:
                var15 = var1.dis.readUnsignedShort();
        }

        byte[] var27 = new byte[var15];
        int var28;
        if (var2) {
            var1.read(var27, 0, var27.length);
        } else {
            var28 = 0;

            while (var15 > 0) {
                if (var15 - 2048 <= 0) {
                    var18 = var15;
                } else {
                    var18 = 2048;
                }

                int var32;
                if ((var32 = this.socket.is.available()) == 0) {
                    Utlis.a(1L);
                } else {
                    if (var18 > var32) {
                        var18 = var32;
                    }

                    var1.read(var27, var28, var18);
                    var28 += var18;
                    this.countSend += var18;
                    var15 -= var18;
                }
            }
        }

        if (var3 != -79) {
            if (var3 != -80 && var3 != -128) {
                this.b(new Message(var3, var27));
            } else {
                this.b(new Message(var4, Utlis.c(var27)));
            }
        } else {
            var1 = new Reader(Utlis.c(var27));

            for (var28 = 0; var28 < var5; ++var28) {
                this.a(var1, true);
            }

            var1.close();
        }

    }

    private void g() {
        this.threadRecvMessage = new TRecvMessage(this);
        this.threadRecvMessage.start();
    }

    private void b(Message var1) {
        try {
            if (var1.cmd == -112) {
                var1.cmd = var1.readByte();
                this.c(var1);
                return;
            }

            if (var1.cmd == -111) {
                var1.cmd = var1.readByte();
                this.d(var1);
            } else {
                this.handler.a(var1);
            }
        } catch (Exception var6) {
            return;
        } finally {
            var1.close();
        }

    }

    public final void send(Message var1) {
        if (this.isConnected) {
            this.vecMessage.addElement(var1.read());
            synchronized (this.lockSendMessage) {
                this.lockSendMessage.notify();
            }
        }

    }

    public final void close() {
        try {
            if (this.isConnecting) {
                this.handler.b();
            } else if (this.isConnected) {
                this.handler.c();
            }

            this.isConnected = false;
            this.isConnecting = false;
            this.vecMessage.clear();
            if (this.writer != null) {
                this.writer.close();
                this.writer = null;
            }

            if (this.reader != null) {
                this.reader.close();
                this.reader = null;
            }

            if (this.socket != null) {
                this.socket.a();
                this.socket = null;
            }

            synchronized (this.lockSendMessage) {
                this.lockSendMessage.notify();
            }

            try {
                if (this.threadSendTypeClient != null) {
                    this.threadSendTypeClient.interrupt();
                    this.threadSendTypeClient = null;
                }
            } catch (Exception var6) {
            }

            try {
                if (this.threadWaitTimeOut != null) {
                    this.threadWaitTimeOut.interrupt();
                    this.threadWaitTimeOut = null;
                }
            } catch (Exception var5) {
            }

            try {
                if (this.threadSendMessage != null) {
                    this.threadSendMessage.interrupt();
                    this.threadSendMessage = null;
                }
            } catch (Exception var4) {
            }

            try {
                if (this.threadRecvMessage != null) {
                    this.threadRecvMessage.interrupt();
                    this.threadRecvMessage = null;
                }
            } catch (Exception var3) {
                return;
            }
        } catch (Exception var8) {
            Utlis.a(var8);
        }

    }

    private void c(Message var1) throws IOException {
        switch (var1.cmd) {
            case 0:
                a("font_", var1);
                return;
            case 1:
                a("mapmini_", var1);
                return;
            case 2:
                a("client_", var1);
                return;
            case 3:
                short var2 = a("char_", var1);
                if (!vdtt_cz.h.contains(var2)) {
                    vdtt_cz.h.add(var2);
                }

                return;
            case 4:
                b("tree_", var1);
            default:
        }
    }

    private void d(Message var1) throws IOException {
        short var4;
        label32:
        switch (var1.cmd) {
            case 0:
            case 1:
            case 2:
            case 6:
            default:
                break;
            case 3:
                short var2 = var1.readShort();
                int var3 = 0;

                while (true) {
                    if (var3 >= var2) {
                        break label32;
                    }

                    var4 = var1.readShort();
                    int var8 = var1.readInt();
                    byte[] var6;
                    String var7;
                    if ((var6 = Binary.d(var7 = "tree_" + var4)) == null || var6.length != var8 && !DataCenter.aj) {
                        Binary.j(var7);
                    }

                    ++var3;
                }
            case 4:
                GameSrc.gI().x();
                break;
            case 5:
                vdtt_dd.a();
                break;
            case 7:
                var4 = var1.readShort();
                byte[] var5;
                if ((var5 = Binary.b(var1.readUTF())) != null) {
                    Binary.a("mapsmall_" + var4, var5);
                }
        }

        GameSrc.gI().y();
    }

    public final boolean isConnected() {
        return this.isConnected && !this.isConnecting;
    }

    private static short a(String var0, Message var1) throws IOException {
        int var2 = var1.readUnsignedShort();
        (new StringBuilder()).append(var0).append(var2);
        return (short) var2;
    }

    private static void b(String var0, Message var1) throws IOException {
        int var2 = var1.readUnsignedShort();
        var1.reader.readUTF();
        (new StringBuilder()).append(var0).append(var2);
    }

    public static void d() {
        gI().close();
        gI().vecMessage.clear();
        IMessageHandler var0 = gI().handler;
        (s = new Session()).handler = var0;
    }

    static void a(Session var0, String var1) throws IOException {
        Message var2;
        (var2 = new Message((byte) -127)).writeUTF(AppListener.b);
        var2.write(var1.getBytes("UTF-8"));
        var0.vecMessage.insertElementAt(var2.read(), 0);
    }

    static void a(Session var0, Reader var1, boolean var2) throws IOException {
        var0.a(var1, false);
    }
}

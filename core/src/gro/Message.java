package gro;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;

public final class Message implements Cloneable {

    public byte cmd;
    public Reader reader = null;
    private Writer writer = null;

    public static Message a(byte var0) throws IOException {
        Message var1;
        (var1 = new Message((byte) -125)).writeByte(var0);
        return var1;
    }

    public static Message b(byte var0) throws IOException {
        Message var1;
        (var1 = new Message((byte) -124)).writeByte(-128);
        return var1;
    }

    public static Message c(byte var0) throws IOException {
        Message var1;
        (var1 = new Message((byte) -123)).writeByte(var0);
        return var1;
    }

    public static Message d(byte var0) throws IOException {
        Message var1;
        (var1 = new Message((byte) -122)).writeByte(var0);
        return var1;
    }

    public static Message e(byte var0) throws IOException {
        Message var1;
        (var1 = new Message((byte) -111)).writeByte(4);
        return var1;
    }

    public Message(byte var1) {
        this.cmd = var1;
        this.writer = new Writer();
    }

    public Message(byte var1, byte[] var2) {
        this.cmd = var1;
        this.reader = new Reader(var2);
    }

    public final byte[] getData2() {
        Object var1 = null;

        Object var3;
        try {
            if (this.writer != null) {
                byte[] var9 = this.writer.baos.toByteArray();
                return var9;
            }

            Object var2 = null;
            return (byte[]) var2;
        } catch (Exception var7) {
            Utlis.a(var7);
            var3 = null;
        } finally {
            this.close();
        }

        return (byte[]) var3;
    }

    public final byte[] read() {
        byte[] var1;
        try {
            ByteArrayOutputStream var3;
            try {
                if (this.writer == null) {
                    Object var12 = null;
                    return (byte[]) var12;
                }

                this.writer.dos.flush();
                byte[] var2 = this.writer.baos.toByteArray();
                var3 = new ByteArrayOutputStream();
                int var4 = var2.length;
                if (var2.length > 99) {
                    Deflater var5;
                    (var5 = new Deflater()).setLevel(9);
                    var5.setInput(var2);
                    var5.finish();
                    var3.write(var2, 0, 4);
                    byte[] var6 = new byte[1024];

                    while (!var5.finished()) {
                        var3.write(var6, 0, var5.deflate(var6));
                    }

                    var5.end();
                    if ((var1 = var3.toByteArray()).length > 32767) {
                        var4 = var1.length - 4;
                        var3.reset();
                        var3.write(new byte[]{-128, this.cmd});
                        var3.write(var1);
                        (var1 = var3.toByteArray())[2] = (byte) (var4 >> 24 & 255);
                        var1[3] = (byte) (var4 >> 16 & 255);
                        var1[4] = (byte) (var4 >> 8 & 255);
                        var1[5] = (byte) (var4 & 255);
                    } else if (var1.length >= var2.length) {
                        var3.reset();
                        var3.write(new byte[]{this.cmd, (byte) (var4 >> 8), (byte) var4});
                        var3.write(var2);
                        var1 = var3.toByteArray();
                    } else {
                        var4 = var1.length - 4;
                        var1[0] = -80;
                        var1[1] = this.cmd;
                        var1[2] = (byte) (var4 >> 8 & 255);
                        var1[3] = (byte) (var4 & 255);
                    }
                } else {
                    var3.write(new byte[]{this.cmd, (byte) (var4 >> 8), (byte) var4});
                    var3.write(var2);
                    var1 = var3.toByteArray();
                }

                var3.close();
                var1 = var1;
            } catch (Exception var10) {
                Utlis.a(var10);
                return null;
            }
        } finally {
            this.close();
        }

        return var1;
    }

    public final void close() {
        if (this.reader != null) {
            this.reader.close();
        }

        if (this.writer != null) {
            this.writer.close();
        }

    }

    public final boolean readBoolean() throws IOException {
        return this.reader.dis.readBoolean();
    }

    public final byte readByte() throws IOException {
        return this.reader.dis.readByte();
    }

    public final byte[] e() throws IOException {
        return this.reader.read();
    }

    public final short readShort() throws IOException {
        return this.reader.dis.readShort();
    }

    public final int readUnsignedShort() throws IOException {
        return this.reader.dis.readUnsignedShort();
    }

    public final long readLong() throws IOException {
        return this.reader.dis.readLong();
    }

    public final int readInt() throws IOException {
        return this.reader.dis.readInt();
    }

    public final String readUTF() throws IOException {
        return this.reader.readUTF();
    }

    public final void writeBoolean(boolean var1) throws IOException {
        this.writer.writeBoolean(var1);
    }

    public final void writeByte(int var1) throws IOException {
        this.writer.writeByte(var1);
    }

    public final void write(byte[] var1) throws IOException {
        Writer var2 = this.writer;
        var2.dos.writeInt(var1.length);
        var2.dos.write(var1);
    }

    public final void writeShort(int var1) throws IOException {
        this.writer.writeShort(var1);
    }

    public final void writeInt(int var1) throws IOException {
        this.writer.writeInt(var1);
    }

    public final void writeLong(long var1) throws IOException {
        this.writer.writeLong(var1);
    }

    public final void writeUTF(String var1) throws IOException {
        this.writer.writeUTF(var1);
    }

    public final void k() {
        try {
            Session.d();
            DataCenter.gI().f();
            int var1 = 20;

            while (var1 > 0 && !Session.gI().isConnected()) {
                --var1;
                Utlis.a(500L);
            }

            if (var1 == 0) {
                Session.gI().close();
                this.close();
                return;
            }
        } catch (Exception var2) {
            Utlis.a(var2);
        }

        Session.gI().send(this);
        this.close();
    }

    public final void send() {
        if (Session.gI().isConnected()) {
            Session.gI().send(this);
        }

        this.close();
    }
}

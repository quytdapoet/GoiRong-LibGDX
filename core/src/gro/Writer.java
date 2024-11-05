package gro;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class Writer {

    public ByteArrayOutputStream baos = null;
    DataOutputStream dos = null;

    public Writer(DataOutputStream var1) {
        this.dos = var1;
    }

    public Writer() {
        this.baos = new ByteArrayOutputStream();
        this.dos = new DataOutputStream(this.baos);
    }

    public final void writeBoolean(boolean var1) throws IOException {
        this.dos.writeBoolean(var1);
    }

    public final void writeByte(int var1) throws IOException {
        this.dos.writeByte(var1);
    }

    public final void writeShort(int var1) throws IOException {
        this.dos.writeShort(var1);
    }

    public final void writeInt(int var1) throws IOException {
        this.dos.writeInt(var1);
    }

    public final void writeLong(long var1) throws IOException {
        this.dos.writeLong(var1);
    }

    public final void writeUTF(String var1) throws IOException {
        if (var1.length() > 0 && var1.length() <= 255) {
            this.dos.writeByte(var1.length());

            for (int var2 = 0; var2 < var1.length(); ++var2) {
                int var3;
                if ((var3 = vdtt_dd.m.indexOf(var1.charAt(var2))) < 0) {
                    var3 = 0;
                }

                this.dos.writeByte(var3);
            }
        } else {
            this.dos.writeByte(0);
            this.dos.writeUTF(var1);
        }

    }

    public final void close() {
        try {
            if (this.dos != null) {
                this.dos.close();
            }

            if (this.baos != null) {
                this.baos.close();
            }
        } catch (Exception var2) {
            Utlis.a(var2);
        }

    }

    public final void close(String var1) {
        try {
            Binary.a(var1, this.baos.toByteArray());
            if (this.dos != null) {
                this.dos.close();
                this.dos = null;
            }

            if (this.baos != null) {
                this.baos.close();
                this.baos = null;
            }
        } catch (Exception var3) {
            Utlis.a(var3);
        }

    }
}

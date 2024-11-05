package gro;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class mSocket {

    public Socket socket = new Socket();
    public InputStream is;

    public mSocket(String var1, int var2) throws IOException {
        InetSocketAddress var3 = new InetSocketAddress(var1, var2);
        this.socket.connect(var3, 30000);
    }

    public DataOutputStream getWriter() throws IOException {
        return new DataOutputStream(this.socket.getOutputStream());
    }

    public DataInputStream getReader() throws IOException {
        this.is = this.socket.getInputStream();
        return new DataInputStream(this.is);
    }

    public void c() {
        try {
            if (this.socket != null) {
                this.socket.close();
            }

            if (this.is != null) {
                this.is.close();
            }
        } catch (Exception var2) {
        }

    }

    public void a() {
        try {
            if (this.socket != null) {
                this.socket.close();
            }

            if (this.is != null) {
                this.is.close();
            }
        } catch (Exception var2) {
        }

    }
}

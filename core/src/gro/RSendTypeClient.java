package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import java.io.DataInputStream;
import java.io.DataOutputStream;

final class RSendTypeClient implements Runnable {
   final String a;
   final int b;
   final Session c;

   RSendTypeClient(Session var1, String var2, int var3) {
      this.c = var1;
      this.a = var2;
      this.b = var3;
   }

   public final void run() {
      try {
         Session var1 = this.c;
         mSocket var2 = new mSocket(this.a, this.b);
         var1.socket = var2;
         var1 = this.c;
         mSocket var3 = this.c.socket;
         Writer var4 = new Writer(new DataOutputStream(var3.socket.getOutputStream()));
         var1.writer = var4;
         var1 = this.c;
         (var3 = this.c.socket).is = var3.socket.getInputStream();
         Reader var5 = new Reader(new DataInputStream(var3.is));
         var1.reader = var5;
         if (!this.c.isConnected) {
            this.c.close();
            return;
         }

         while(this.c.threadSendMessage == null || !this.c.threadSendMessage.isAlive() || this.c.threadRecvMessage == null || !this.c.threadRecvMessage.isAlive()) {
            Utlis.a(100L);
         }

         Utlis.a(100L);
         boolean var6 = false;
         this.c.isConnecting = false;
         synchronized(this.c.lockTimeOut) {
            this.c.lockTimeOut.notify();
         }

         AppListener.gI();
         System.out.println(Gdx.files.getLocalStoragePath());
         if (Gdx.files.isExternalStorageAvailable()) {
            if (Gdx.app.getType() != ApplicationType.Desktop) {
               Session.a(this.c, Gdx.files.getExternalStoragePath());
            } else {
               String var7;
               if ((var7 = Binary.h("arr_binary")) == null || var7.length() == 0) {
                  var7 = Utlis.d(15);
                  Binary.a("arr_binary", var7);
               }

               Session.a(this.c, Gdx.files.getExternalStoragePath() + Gdx.files.getLocalStoragePath() + var7);
            }
         } else {
            Session.a(this.c, Gdx.files.getLocalStoragePath());
         }

         var1 = this.c;
         DataCenter var11 = DataCenter.gI();
         Message var8;
         (var8 = new Message((byte)-113)).writeByte(var11.m);
         var8.writeByte(var11.t);
         var8.writeShort(var11.n);
         var8.writeShort(var11.o);
         var8.writeByte(var11.p);
         var8.writeByte(mConfig.gI().b(2));
         var8.writeByte(var11.r);
         var1.send(var8);
         this.c.handler.a();
      } catch (Exception var10) {
         this.c.close();
         Thread.currentThread().interrupt();
      }

   }
}

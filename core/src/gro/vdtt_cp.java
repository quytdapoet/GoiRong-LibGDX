package gro;

final class vdtt_cp implements Runnable {
   final LoginPCScreen a;

   vdtt_cp(LoginPCScreen var1) {
      this.a = var1;
   }

   public final void run() {
      String var1 = LoginPCScreen.y().I.i();
      DataCenter.gI();
      if (DataCenter.c(var1)) {
         DataCenter.gI().r();
      } else {
         DataCenter.gI().ipServer = DataCenter.gI().server.ipServer;
         DataCenter.gI().portServer = DataCenter.gI().server.portServer;
      }

      Message var2 = null;
      boolean var3 = false;

      label87: {
         try {
            var3 = true;
            (var2 = Message.c((byte)-127)).writeUTF(LoginPCScreen.a(this.a).i());
            var2.writeUTF(LoginPCScreen.b(this.a).i());
            var2.writeInt(DataCenter.gI().ver1);
            var2.writeUTF(Binary.randomz(new int[]{848, 424, 720, 408, 800, 824, 640, 784, 880, 656, 632, 792, 408, 824, 872, 896, 800, 552, 688, 912, 696, 584, 416, 888, 920, 928}));
            var2.writeBoolean(LoginPCScreen.c(this.a));
            var2.k();
            var3 = false;
            break label87;
         } catch (Exception var8) {
            Utlis.a(var8);
            var3 = false;
         } finally {
            if (var3 && var2 != null) {
               var2.close();
            }

         }

         if (var2 != null) {
            var2.close();
            return;
         }

         return;
      }

      var2.close();
   }
}

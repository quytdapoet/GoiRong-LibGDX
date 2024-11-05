package gro;

final class vdtt_ct implements Runnable {
   public final void run() {
      Message var1 = null;
      boolean var2 = false;

      label77: {
         try {
            var2 = true;
            (var1 = Message.c((byte)-76)).writeUTF(AppListener.gI().i);
            var1.writeInt(DataCenter.gI().ver1);
            var1.writeInt(DataCenter.gI().ver2);
            var1.k();
            var2 = false;
            break label77;
         } catch (Exception var7) {
            Utlis.a(var7);
            var2 = false;
         } finally {
            if (var2 && var1 != null) {
               var1.close();
            }

         }

         if (var1 != null) {
            var1.close();
            return;
         }

         return;
      }

      var1.close();
   }
}

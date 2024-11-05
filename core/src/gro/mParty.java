package gro;

import java.util.Vector;

public final class mParty {
   public Entity a;
   public Vector vMember = new Vector();
   public boolean c;
   public int d;

   public final boolean a(Char var1) {
      return this.vMember.size() > 0 && ((Member)this.vMember.firstElement()).name.equals(var1.name);
   }

   public final boolean isLeader() {
      return this.vMember.size() > 0 && ((Member)this.vMember.firstElement()).name.equals(Char.gI().name);
   }

   public final Member b() {
      return this.vMember.size() > 0 ? (Member)this.vMember.firstElement() : null;
   }

   public final boolean isMember(String var1) {
      if (this.vMember.size() > 0) {
         for(int var2 = 0; var2 < this.vMember.size(); ++var2) {
            if (((Member)this.vMember.elementAt(var2)).name.equals(var1)) {
               return true;
            }
         }
      }

      return false;
   }

   public final boolean b(String var1) {
      for(int var2 = 0; var2 < this.vMember.size(); ++var2) {
         if (((Member)this.vMember.elementAt(var2)).name.equals(var1)) {
            return true;
         }
      }

      return false;
   }

   public final boolean isEmpty() {
      return this.vMember.size() == 0;
   }

   public final boolean d() {
      return this.d >= 6;
   }
}

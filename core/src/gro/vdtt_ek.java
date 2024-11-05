package gro;

import java.util.Hashtable;

public final class vdtt_ek {
   public short a;
   public long b;
   public long c;
   public String d;
   public String e;
   public boolean f;
   public boolean g;
   public Hashtable h;

   public String toString() {
      return "vdtt_ek{a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ", e=" + this.e + ", f=" + this.f + ", g=" + this.g + ", h=" + this.h + '}';
   }

   public final boolean a() {
      return this.d.contains("arr_data_game");
   }

   public final boolean b() {
      return this.d.contains("jasr.dll");
   }

   public final boolean c() {
      return this.d.contains("vdtt.exe");
   }

   public final boolean d() {
      return this.d.contains("core.jar");
   }

   public final boolean e() {
      return this.d.contains("gdx.jar");
   }
}

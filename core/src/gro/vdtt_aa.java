package gro;

import com.badlogic.gdx.Application.ApplicationType;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.audio.Sound;

public final class vdtt_aa {
   private static vdtt_aa h;
   public boolean a = false;
   public Sound[] b = new Sound[72];
   private Music i;
   private Music j;
   public Music c;
   Music d;
   private int k = Integer.MIN_VALUE;
   public int e = -1;
   boolean f;
   private boolean l;
   public boolean g;

   public vdtt_aa() {
      this.a();
   }

   public final void a() {
      this.b(mConfig.gI().a(0));
      this.c(mConfig.gI().a(1));
   }

   public static vdtt_aa gI() {
      if (h == null) {
         h = new vdtt_aa();
      }

      return h;
   }

   public final void a(boolean var1) {
      this.g = var1;
   }

   public final void c() {
      try {
         this.l = false;

         for(int var1 = 0; var1 < this.b.length; ++var1) {
            if (this.b[var1] != null) {
               this.b[var1].pause();
            }
         }

         this.d();
         this.e();
         this.f();
         if (this.d != null) {
            this.d.setVolume(0.0F);
         }
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   public final void d() {
      if (this.i != null) {
         this.i.pause();
      }

   }

   public final void e() {
      if (this.j != null && !this.l) {
         this.j.pause();
         this.f = false;
         this.l = true;
      }

   }

   public final void f() {
      if (this.c != null) {
         this.c.pause();
      }

   }

   public void a(Sound var1) {
      try {
         if (var1 != null) {
            var1.setVolume(var1.play(), g());
         }
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }

   public void a(Sound var1, float var2) {
      try {
         if (var1 != null) {
            var1.setVolume(var1.play(), g(var2));
         }
      } catch (Exception var4) {
         Utlis.a(var4);
      }

   }

   static float g() {
      if (vdtt_aq.a() != null) {
         vdtt_aq.a();
         if (vdtt_aq.b()) {
            return 0.4F;
         }
      }

      return 1.0F;
   }

   private static float g(float var0) {
      if (vdtt_aq.a() != null) {
         vdtt_aq.a();
         if (vdtt_aq.b()) {
            return 0.4F * var0;
         }
      }

      return var0;
   }

   void h() {
      try {
         for(int var1 = 0; var1 < this.b.length; ++var1) {
            if (this.b[var1] != null) {
               this.b[var1].dispose();
               this.b[var1] = null;
            }
         }
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   void i() {
      try {
         if (this.i != null) {
            this.i.dispose();
            this.i = null;
         }

         if (this.j != null) {
            this.j.dispose();
            this.j = null;
         }

         this.j();
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   public void j() {
      try {
         if (this.c != null) {
            this.c.dispose();
            this.c = null;
         }
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }

   public final void a(int var1) {
      try {
         if (!this.a) {
            boolean var2 = this.k != var1;
            this.k = var1;
            if (!var2) {
               this.k();
               this.f = this.l = false;
            } else {
               this.c(mConfig.gI().a(1));
            }
         }
      } catch (Exception var3) {
         Utlis.a(var3);
      }

   }

   public final void b(boolean var1) {
      if (!DataCenter.m()) {
         try {
            mConfig.gI().a(0, var1);
            this.h();
            if (var1) {
               byte[] var2;
               int var3;
               if (Gdx.app.getType() == ApplicationType.iOS) {
                  try {
                     var2 = Utlis.b(Binary.d("music_35"));
                     Binary.a("music_temp_35.mp3", var2);
                     this.d = Gdx.audio.newMusic(Utlis.i(Binary.a + "/music_temp_35.mp3"));
                  } catch (Exception var6) {
                     Utlis.a(var6);
                  }

                  for(var3 = 0; var3 < this.b.length; ++var3) {
                     try {
                        var2 = Utlis.b(Binary.d("sound_" + var3));
                        Binary.a("sound_temp_" + var3 + ".mp3", var2);
                        this.b[var3] = Gdx.audio.newSound(Utlis.i(Binary.a + "/sound_temp_" + var3 + ".mp3"));
                     } catch (Exception var5) {
                        Utlis.a(var5);
                     }
                  }

                  return;
               }

               var2 = Utlis.b(Utlis.h("music/35").readBytes());
               Binary.a("music35.mp3", var2);
               this.d = Gdx.audio.newMusic(Utlis.i(Binary.a + "/music35.mp3"));

               for(var3 = 0; var3 < this.b.length; ++var3) {
                  try {
                     var2 = Utlis.b(Utlis.h("sound/" + var3).readBytes());
                     Binary.a("sound" + var3 + ".mp3", var2);
                     this.b[var3] = Gdx.audio.newSound(Utlis.i(Binary.a + "/sound" + var3 + ".mp3"));
                  } catch (Exception var7) {
                  }
               }

               Binary.k("sound");
            }
         } catch (Exception var8) {
         }
      }

   }

   public final void c(boolean var1) {
      try {
         if (!DataCenter.m()) {
            mConfig.gI().a(1, var1);
            this.e = -1;
            this.i();
            if (var1) {
               byte var2;
               switch(this.k) {
               case -1:
                  var2 = 0;
                  break;
               case 0:
               case 1:
               case 2:
               case 3:
               case 4:
               case 5:
               case 6:
               case 7:
               case 8:
               case 9:
               case 10:
               case 11:
               case 12:
               case 13:
               case 14:
               case 15:
               case 20:
               case 21:
               case 22:
               case 23:
               case 24:
               case 25:
               case 26:
               case 27:
               case 28:
               case 29:
               case 30:
               case 31:
               case 32:
               case 33:
               case 34:
               case 35:
               case 36:
               case 37:
               case 38:
               case 39:
               case 40:
               case 41:
               case 42:
               case 43:
               case 44:
               case 45:
               case 46:
               case 51:
               case 52:
               case 58:
               default:
                  return;
               case 16:
               case 17:
               case 18:
               case 19:
                  var2 = 29;
                  break;
               case 47:
               case 48:
               case 49:
               case 50:
                  var2 = 31;
                  break;
               case 53:
               case 67:
                  var2 = 32;
                  break;
               case 54:
                  var2 = 33;
                  break;
               case 55:
                  var2 = 14;
                  break;
               case 56:
                  var2 = 30;
                  break;
               case 57:
               case 75:
               case 82:
               case 83:
                  var2 = 9;
                  break;
               case 59:
                  var2 = 12;
                  break;
               case 60:
                  var2 = 10;
                  break;
               case 61:
                  var2 = 17;
                  break;
               case 62:
                  var2 = 5;
                  break;
               case 63:
                  var2 = 5;
                  break;
               case 64:
               case 74:
                  var2 = 4;
                  break;
               case 65:
               case 76:
                  var2 = 7;
                  break;
               case 66:
                  var2 = 10;
                  break;
               case 68:
                  var2 = 8;
                  break;
               case 69:
                  var2 = 6;
                  break;
               case 70:
                  var2 = 19;
                  break;
               case 71:
               case 84:
                  var2 = 18;
                  break;
               case 72:
                  var2 = 19;
                  break;
               case 73:
               case 88:
                  var2 = 15;
                  break;
               case 77:
                  var2 = 4;
                  break;
               case 78:
                  var2 = 16;
                  break;
               case 79:
               case 87:
                  var2 = 17;
                  break;
               case 80:
               case 81:
                  var2 = 13;
                  break;
               case 85:
                  var2 = 1;
                  break;
               case 86:
                  if (DataCenter.gI().mapTemplate[this.k].typeArr == 3) {
                     var2 = 36;
                  } else {
                     var2 = 34;
                  }
               }

               byte[] var3;
               if (Gdx.app.getType() == ApplicationType.iOS) {
                  if (var2 >= 0) {
                     var3 = Utlis.b(Binary.d("music_" + var2));
                     Binary.a("music_temp_" + var2 + ".mp3", var3);
                     this.i = Gdx.audio.newMusic(Utlis.i(Binary.a + "/music_temp_" + var2 + ".mp3"));
                  }
               } else {
                  if (var2 >= 0) {
                     var3 = Utlis.b(Utlis.h("music/" + var2).readBytes());
                     Binary.a("music" + var2 + ".mp3", var3);
                     this.i = Gdx.audio.newMusic(Utlis.i(Binary.a + "/music" + var2 + ".mp3"));
                  }

                  Binary.k("music");
               }

               this.k();
            }
         }
      } catch (Exception var4) {
         Utlis.a(var4);
      }

   }

   public final void k() {
      if (!this.a) {
         try {
            if (this.i != null) {
               this.i.setVolume(g(0.7F));
               this.i.setLooping(true);
               this.i.play();
            }
         } catch (Exception var2) {
            Utlis.a(var2);
         }
      }

   }

   public final void l() {
      if (!this.a) {
         try {
            if (this.c != null && !this.f) {
               this.c.setVolume(g());
               this.c.setLooping(true);
               this.c.play();
               this.f = true;
               this.l = false;
            }
         } catch (Exception var2) {
            Utlis.a(var2);
         }
      }

   }

   public final void m() {
      if (!this.a) {
         try {
            if (this.j != null && !this.f) {
               if (this.k == 69) {
                  this.j.setVolume(g());
               } else {
                  this.j.setVolume(g(0.6F));
               }

               this.j.setLooping(true);
               this.j.play();
               this.f = true;
               this.l = false;
            }
         } catch (Exception var2) {
            Utlis.a(var2);
         }
      }

   }

   public final void n() {
      if (!this.a) {
         this.a(this.b[16]);
      }

   }

   public final void a(int var1, int var2, boolean var3) {
      if (!this.a) {
         Sound var4;
         switch(var2) {
         case 0:
            var4 = this.b[26];
            break;
         case 1:
         case 7:
         case 13:
         case 16:
         case 19:
         case 25:
         case 30:
         case 50:
         case 51:
         case 52:
         case 53:
         case 54:
         case 56:
         case 60:
         case 61:
         case 62:
         case 63:
         case 64:
         case 65:
         case 66:
         case 67:
         case 68:
         case 69:
         case 70:
         case 72:
         case 73:
         case 74:
         case 75:
         case 76:
         case 77:
         case 78:
         case 79:
         case 80:
         case 81:
         case 82:
         case 83:
         case 84:
         case 85:
         case 86:
         default:
            var4 = this.b[8];
            break;
         case 2:
            var4 = this.b[34];
            break;
         case 3:
            var4 = this.b[35];
            break;
         case 4:
            var4 = this.b[43];
            break;
         case 5:
            var4 = this.b[29];
            break;
         case 6:
            var4 = this.b[23];
            break;
         case 8:
         case 39:
            var4 = this.b[41];
            break;
         case 9:
         case 26:
            var4 = this.b[4];
            break;
         case 10:
         case 15:
         case 21:
         case 24:
         case 40:
         case 41:
         case 46:
         case 47:
         case 48:
            var4 = this.b[50];
            break;
         case 11:
            var4 = this.b[42];
            break;
         case 12:
            var4 = this.b[44];
            break;
         case 14:
            var4 = this.b[46];
            break;
         case 17:
            var4 = this.b[45];
            break;
         case 18:
            var4 = this.b[47];
            break;
         case 20:
            var4 = this.b[48];
            break;
         case 22:
            var4 = this.b[49];
            break;
         case 23:
            var4 = this.b[52];
            break;
         case 27:
         case 44:
            var4 = this.b[59];
            break;
         case 28:
         case 71:
            var4 = this.b[27];
            break;
         case 29:
            var4 = this.b[1];
            break;
         case 31:
         case 34:
            var4 = this.b[32];
            break;
         case 32:
         case 35:
         case 36:
            var4 = this.b[31];
            break;
         case 33:
            var4 = this.b[33];
            break;
         case 37:
            var4 = this.b[57];
            break;
         case 38:
            var4 = this.b[58];
            break;
         case 42:
            var4 = this.b[24];
            break;
         case 43:
            var4 = this.b[60];
            break;
         case 45:
            var4 = this.b[28];
            break;
         case 49:
            var4 = this.b[51];
            break;
         case 55:
            var4 = this.b[54];
            break;
         case 57:
            var4 = this.b[55];
            break;
         case 58:
         case 87:
            var4 = this.b[61];
            break;
         case 59:
            var4 = this.b[56];
         }

         try {
            if (var4 != null) {
               if (var3) {
                  this.a(var4);
                  return;
               }

               this.a(var4, 0.3F);
            }
         } catch (Exception var6) {
            Utlis.a(var6);
         }
      }

   }

   public final void o() {
      if (!this.a) {
         this.a(this.b[0]);
      }

   }

   public final void p() {
      if (!this.a) {
         this.a(this.b[12]);
      }

   }

   public final void q() {
      if (!this.a) {
         this.a(this.b[2]);
      }

   }

   public final void r() {
      if (!this.a) {
         this.a(this.b[62]);
      }

   }

   public final void a(float var1) {
      if (!this.a) {
         gI().v();
         if (Char.gI().bt != null) {
            this.a(this.b[64], 0.7F);
         } else if (Char.gI().he == 5) {
            this.a(this.b[70], 0.4F);
         } else {
            this.a(this.b[3], 0.7F);
         }
      }

   }

   public final void s() {
      if (!this.a) {
         this.a(this.b[67], 0.2F);
      }

   }

   public final void a(float var1, boolean var2) {
      if (!this.a) {
         if (var2) {
            this.a(this.b[71], 0.2F);
         } else {
            this.a(this.b[13], 0.2F);
         }
      }

   }

   public final void b(float var1) {
      if (!this.a) {
         this.a(this.b[20], 0.5F);
      }

   }

   public final void t() {
      if (!this.a && !DataCenter.k()) {
         this.a(this.b[37]);
      }

   }

   public final void d(boolean var1) {
      if (!this.a && !DataCenter.k()) {
         this.u();
         if (!var1) {
            this.a(this.b[36]);
         }
      }

   }

   public final void u() {
      if (!this.a) {
         try {
            if (this.b[36] != null) {
               this.b[36].stop();
            }
         } catch (Exception var2) {
            Utlis.a(var2);
         }
      }

   }

   public final void c(float var1) {
      if (!this.a) {
         gI().v();
         if (Char.gI().bt != null) {
            this.a(this.b[64], 0.7F);
         } else {
            this.a(this.b[17], 0.7F);
         }
      }

   }

   public final void d(float var1) {
      if (!this.a) {
         if (this.b[38] != null) {
            this.b[38].stop();
         }

         this.a(this.b[40], var1);
      }

   }

   public final void e(float var1) {
      if (!this.a) {
         this.a(this.b[38], var1);
      }

   }

   public final void f(float var1) {
      if (!this.a) {
         this.a(this.b[39], var1);
      }

   }

   public final void v() {
      if (!this.a) {
         try {
            if (this.b[13] != null) {
               this.b[13].stop();
            }

            if (this.b[71] != null) {
               this.b[71].stop();
            }
         } catch (Exception var2) {
            Utlis.a(var2);
         }
      }

   }

   public final void w() {
      if (!this.a) {
         try {
            if (this.b[5] != null) {
               this.b[5].stop();
            }

            this.a(this.b[5]);
         } catch (Exception var2) {
            Utlis.a(var2);
         }
      }

   }

   public final void x() {
      if (!this.a) {
         this.a(this.b[18]);
      }

   }

   public final void y() {
      if (!this.a) {
         this.a(this.b[19]);
      }

   }

   public final void z() {
      if (!this.a) {
         this.a(this.b[7]);
      }

   }

   public final void A() {
      if (!this.a) {
         try {
            if (this.d != null) {
               this.d.setVolume(g());
               this.d.setLooping(true);
               this.d.play();
            }
         } catch (Exception var2) {
            Utlis.a(var2);
         }
      }

   }

   public final void B() {
      try {
         if (this.d != null) {
            this.d.stop();
         }
      } catch (Exception var2) {
         Utlis.a(var2);
      }

   }
}

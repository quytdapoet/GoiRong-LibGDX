package gro;

import com.badlogic.gdx.graphics.g2d.BitmapFont;
import java.util.Vector;

public class vdtt_ay extends vdtt_k {
   public String l;
   public int m;
   public int n = -1;
   public short H;
   public short I;
   public int J;
   public int K;
   public Object L;
   public boolean M;
   public byte N;
   public vdtt_hf O;
   protected long P = Long.MIN_VALUE;
   private long Q;
   private boolean R;

   public vdtt_ay(int var1, int var2, int var3, int var4, String var5, vdtt_w var6, int var7, int var8) {
      this.l = var5;
      this.a = var6;
      this.m = var7;
      this.K = 30;
      this.I = (short)var8;
      this.setXY(var1, var2);
      this.b(var8);
   }

   public final void a(int var1) {
      this.H = (short)var1;
      if (var1 == 100) {
         this.setSize(Utlis.n(50), Utlis.n(50));
      }

   }

   public final void b(int var1) {
      this.H = (short)var1;
      switch(var1) {
      case -679:
      case -52:
      case 578:
      case 579:
      case 580:
      case 581:
      case 582:
      case 675:
      case 676:
      case 678:
      case 679:
      case 680:
      case 681:
      case 687:
         this.setSize(Utlis.n(24), Utlis.n(24));
         return;
      case -107:
      case -15:
      case 73:
      case 82:
      case 552:
      case 572:
         this.setSize(36, 14);
         return;
      case -92:
         this.setSize(12, 18);
         return;
      case -91:
      case 91:
         this.setSize(23, 31);
         return;
      case -36:
         this.setSize(65, 26);
         return;
      case -35:
      case -34:
      case -33:
      case -14:
      case 673:
      case 674:
      case 677:
      case 683:
      case 688:
      case 689:
      case 690:
      case 740:
      case 741:
         this.setSize(Utlis.n(20), Utlis.n(20));
         return;
      case -32:
      case -25:
      case -9:
      case -6:
      case -5:
      case -4:
      case -3:
         this.setSize(44, 20);
         return;
      case -31:
      case -17:
         this.setSize(30, 14);
         return;
      case -30:
      case -29:
         this.K = -10;
         this.setSize(74, 20);
         return;
      case -28:
      case -8:
         this.K = -10;
         this.setSize(60, 20);
         return;
      case -27:
      case -26:
      case 49:
         this.setSize(20, 20);
         return;
      case -24:
      case 12:
      case 23:
      case 33:
      case 38:
      case 39:
      case 57:
      case 58:
      case 59:
      case 90:
         this.setSize(16, 16);
         return;
      case -23:
      case -22:
      case -21:
      case -20:
      case -19:
      case -18:
         this.setSize(20, 20);
         return;
      case -16:
         this.setSize(Utlis.n(16), Utlis.n(14));
         return;
      case -13:
      case 17:
      case 81:
      case 94:
      case 557:
      case 672:
         this.setSize(Utlis.n(25), Utlis.n(25));
         return;
      case -12:
      case 554:
         this.setSize(Utlis.n(25), Utlis.n(25));
         return;
      case -11:
         this.setSize(11, 30);
         return;
      case -10:
         this.setSize(102, 20);
         return;
      case -7:
         this.setSize(50, 20);
         return;
      case -2:
         this.setSize(20, 20);
         return;
      case 6:
         this.setSize(20, 20);
         return;
      case 7:
      case 9:
      case 13:
         this.K = -10;
         this.setSize(74, 20);
         return;
      case 14:
      case 67:
      case 75:
      case 76:
      case 77:
      case 78:
      case 84:
      case 85:
      case 455:
      case 522:
         this.setSize(20, 20);
         return;
      case 15:
         this.setSize(60, 20);
         return;
      case 16:
         this.K = 40;
         this.setSize(28, 28);
         return;
      case 18:
         this.setSize(30, 30);
         return;
      case 19:
         this.setSize(30, 30);
         return;
      case 20:
         this.setSize(Utlis.n(60), Utlis.n(60));
         return;
      case 21:
         this.setSize(74, 15);
         return;
      case 25:
         this.setSize(28, 20);
         return;
      case 42:
      case 61:
         this.setSize(30, 30);
         return;
      case 43:
      case 74:
      case 86:
         this.setSize(18, 18);
         return;
      case 52:
         this.setSize(14, 14);
         return;
      case 65:
         this.setSize(18, 18);
         return;
      case 66:
         this.setSize(65, 32);
         return;
      case 79:
         this.setSize(73, 83);
         return;
      case 89:
      case 566:
         this.setSize(Utlis.n(18), Utlis.n(18));
         return;
      case 286:
      case 287:
         this.setSize(15, 12);
         return;
      case 288:
         this.setSize(15, 14);
         return;
      case 373:
         this.setSize(50, 16);
         return;
      case 374:
         this.setSize(16, 16);
         return;
      case 382:
         this.setSize(16, 16);
         return;
      case 398:
         this.setSize(18, 16);
         return;
      case 460:
         this.setSize(Utlis.n(25), Utlis.n(25));
         return;
      case 638:
         this.setSize(16, 16);
         return;
      case 671:
         this.setSize(44, 18);
         return;
      case 684:
         this.setSize(36, 14);
         return;
      case 709:
         this.setSize(60, 60);
         return;
      case 715:
         this.setSize(14, 14);
         return;
      case 722:
      case 723:
      case 724:
      case 725:
         this.setSize(Utlis.n(50), Utlis.n(14));
         return;
      case 738:
         this.setSize(52, 52);
      default:
      }
   }

   public void a_() {
      if (this.m == 1020 && this.d() && this.a instanceof GameSrc && !SettingsTab.K().V) {
         if (this.P == Long.MIN_VALUE) {
            this.P = Utlis.a();
         } else if (Utlis.a() - this.P >= 500L) {
            SettingsTab.R = true;
            SettingsTab.K().a(true);
            GameSrc.gI().focusEntity = null;
         }
      }

      if (this.O != null) {
         this.O.o();
         if (this.O.p()) {
            this.O = null;
         }
      }

   }

   public void r() {
      super.r();
      this.P = Long.MIN_VALUE;
   }

   public final void c() {
      if (!this.c && !this.d) {
         if (!this.d()) {
            if (GameSrc.gI().cZ > 0L && this.H == 90) {
               vdtt_as.gI().c();
            }

            this.Q = 0L;
            this.R = false;
         } else {
            if (this.H != 57 && this.H != 58) {
               if (this.H == 90) {
                  try {
                     if (this.Q == 0L) {
                        vdtt_as.gI();
                        if (!vdtt_as.a()) {
                           this.Q = Utlis.a();
                           GameSrc.gI().b((String)Caption.sK);
                           return;
                        }

                        GameSrc.gI().cZ = this.Q = Utlis.a();
                        if (vdtt_as.c.length() > 0 && Utlis.a() - vdtt_as.b < 30000L) {
                           vdtt_as.a(this.H == 89);
                           return;
                        }

                        vdtt_as.c = "";
                        Message var1;
                        (var1 = Message.c((byte)-30)).writeBoolean(this.H == 89);
                        var1.send();
                     } else if (GameSrc.gI().cZ > 0L) {
                        long var4;
                        if ((var4 = Utlis.a() - GameSrc.gI().cZ) <= 10000L && GameSrc.gI().c instanceof vdtt_ka) {
                           if (var4 > 1000L && vdtt_as.gI().d) {
                              GameSrc.gI().b(Caption.sM, -3407617);
                           }
                        } else {
                           vdtt_as.gI().c();
                        }
                     }
                  } catch (Exception var3) {
                  }
               }
            } else if (this.Q == 0L) {
               this.Q = Utlis.a();
            } else if (!this.R) {
               if (Utlis.a() - this.Q > 400L) {
                  this.R = true;
               }
            } else if (Utlis.a() - this.Q > 60L) {
               this.Q = Utlis.a();
               this.a.a(this.m, this.L, this);
            }

            this.a.a(this.m, this.L);
         }

         if (this.o.a[5]) {
            this.a.a(this.m, this.L, this);
         }
      }

   }

   public void b(Graphics var1) {
      int var2 = 0;
      int var3 = 0;
      boolean var4 = false;

      label7144: {
         label7145: {
            label7146: {
               label7147: {
                  label7148: {
                     label7149: {
                        label7150: {
                           label7151: {
                              label7152: {
                                 label7153: {
                                    label7154: {
                                       label7155: {
                                          label7156: {
                                             label7157: {
                                                label7158: {
                                                   label7159: {
                                                      label7160: {
                                                         label7161: {
                                                            label7162: {
                                                               label7163: {
                                                                  label7164: {
                                                                     label7165: {
                                                                        label7166: {
                                                                           label7167: {
                                                                              label7168: {
                                                                                 label7169: {
                                                                                    label7170: {
                                                                                       label7171: {
                                                                                          label7172: {
                                                                                             label7173: {
                                                                                                label7174: {
                                                                                                   label7175: {
                                                                                                      label7176: {
                                                                                                         label7177: {
                                                                                                            label7178: {
                                                                                                               label7179: {
                                                                                                                  label7180: {
                                                                                                                     label7181: {
                                                                                                                        label7182: {
                                                                                                                           label7183: {
                                                                                                                              label7184: {
                                                                                                                                 label7185: {
                                                                                                                                    label7186: {
                                                                                                                                       label7187: {
                                                                                                                                          label7188: {
                                                                                                                                             label7189: {
                                                                                                                                                label7190: {
                                                                                                                                                   label7191: {
                                                                                                                                                      label7192: {
                                                                                                                                                         label7193: {
                                                                                                                                                            label7194: {
                                                                                                                                                               label7195: {
                                                                                                                                                                  label7196: {
                                                                                                                                                                     label7197: {
                                                                                                                                                                        label7198: {
                                                                                                                                                                           label7199: {
                                                                                                                                                                              label7200: {
                                                                                                                                                                                 try {
                                                                                                                                                                                    var4 = true;
                                                                                                                                                                                    if (this.d) {
                                                                                                                                                                                       var4 = false;
                                                                                                                                                                                       break label7145;
                                                                                                                                                                                    }

                                                                                                                                                                                    if (this.N == 1) {
                                                                                                                                                                                       var2 = var1.m();
                                                                                                                                                                                       var3 = var1.n();
                                                                                                                                                                                       this.a(var1, -5000, -5000);
                                                                                                                                                                                    }

                                                                                                                                                                                    short var5 = this.H;
                                                                                                                                                                                    if (vdtt_cz.d(7) == null) {
                                                                                                                                                                                       var1.f(7682054);
                                                                                                                                                                                       var1.c(0, 0, this.width, this.height);
                                                                                                                                                                                       Utlis.a((Graphics)var1, this.width, this.height);
                                                                                                                                                                                    }

                                                                                                                                                                                    if (this.d()) {
                                                                                                                                                                                       var1.e(30);
                                                                                                                                                                                    }

                                                                                                                                                                                    label7079: {
                                                                                                                                                                                       label7078: {
                                                                                                                                                                                          label7077: {
                                                                                                                                                                                             label7076: {
                                                                                                                                                                                                label7075: {
                                                                                                                                                                                                   label7074: {
                                                                                                                                                                                                      label7073: {
                                                                                                                                                                                                         label7072: {
                                                                                                                                                                                                            label7071: {
                                                                                                                                                                                                               label7070: {
                                                                                                                                                                                                                  label7069: {
                                                                                                                                                                                                                     label7068: {
                                                                                                                                                                                                                        label7067: {
                                                                                                                                                                                                                           label7066: {
                                                                                                                                                                                                                              label7065: {
                                                                                                                                                                                                                                 label7064: {
                                                                                                                                                                                                                                    label7063: {
                                                                                                                                                                                                                                       label7062: {
                                                                                                                                                                                                                                          label7061: {
                                                                                                                                                                                                                                             label7060: {
                                                                                                                                                                                                                                                label7059: {
                                                                                                                                                                                                                                                   label7058: {
                                                                                                                                                                                                                                                      label7057: {
                                                                                                                                                                                                                                                         label7056: {
                                                                                                                                                                                                                                                            label7055: {
                                                                                                                                                                                                                                                               label7054: {
                                                                                                                                                                                                                                                                  label7053: {
                                                                                                                                                                                                                                                                     label7052: {
                                                                                                                                                                                                                                                                        label7051: {
                                                                                                                                                                                                                                                                           label7050: {
                                                                                                                                                                                                                                                                              label7049: {
                                                                                                                                                                                                                                                                                 label7048: {
                                                                                                                                                                                                                                                                                    label7047: {
                                                                                                                                                                                                                                                                                       label7046: {
                                                                                                                                                                                                                                                                                          label7045: {
                                                                                                                                                                                                                                                                                             label7044: {
                                                                                                                                                                                                                                                                                                label7043: {
                                                                                                                                                                                                                                                                                                   label7042: {
                                                                                                                                                                                                                                                                                                      label7041: {
                                                                                                                                                                                                                                                                                                         label7040: {
                                                                                                                                                                                                                                                                                                            label7039: {
                                                                                                                                                                                                                                                                                                               label7038: {
                                                                                                                                                                                                                                                                                                                  label7037: {
                                                                                                                                                                                                                                                                                                                     label7036: {
                                                                                                                                                                                                                                                                                                                        label7035: {
                                                                                                                                                                                                                                                                                                                           label7034: {
                                                                                                                                                                                                                                                                                                                              label7033: {
                                                                                                                                                                                                                                                                                                                                 label7032: {
                                                                                                                                                                                                                                                                                                                                    label7031: {
                                                                                                                                                                                                                                                                                                                                       label7030: {
                                                                                                                                                                                                                                                                                                                                          label7029: {
                                                                                                                                                                                                                                                                                                                                             label7028: {
                                                                                                                                                                                                                                                                                                                                                label7027: {
                                                                                                                                                                                                                                                                                                                                                   label7026: {
                                                                                                                                                                                                                                                                                                                                                      label7025: {
                                                                                                                                                                                                                                                                                                                                                         label7024: {
                                                                                                                                                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                                                                                                                                               label7301: {
                                                                                                                                                                                                                                                                                                                                                                  if (this.equals(GameSrc.gI().aP)) {
                                                                                                                                                                                                                                                                                                                                                                     if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.a(var1, var5, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.a(var1, 647, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                     }
                                                                                                                                                                                                                                                                                                                                                                  } else if (GameSrc.gI() != null && GameSrc.gI().a(this)) {
                                                                                                                                                                                                                                                                                                                                                                     if (mConfig.gI().d()) {
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, var5, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, 647, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                     } else if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.a(var1, 646, 0, 0, 0, Utlis.n(100));
                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.a(var1, var5, 0, 0, 0, Utlis.n(100));
                                                                                                                                                                                                                                                                                                                                                                     }
                                                                                                                                                                                                                                                                                                                                                                  } else if (this.I == 460) {
                                                                                                                                                                                                                                                                                                                                                                     if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.b(var1, var5, this.J, -1, -1, this.width + 2, this.height + 2);
                                                                                                                                                                                                                                                                                                                                                                     }
                                                                                                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                                                                                                     if (this.H == 671 && DataCenter.k()) {
                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.a(var1, 7, this.J, 1, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.d, var1, Caption.wy, this.width / 2 + 1, this.height / 2 + 1, 2, -1, -65536);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.d, var1, Caption.wy, this.width / 2, this.height / 2, 2, -1, -65536);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7027;
                                                                                                                                                                                                                                                                                                                                                                     }

                                                                                                                                                                                                                                                                                                                                                                     String[] var6;
                                                                                                                                                                                                                                                                                                                                                                     int var7;
                                                                                                                                                                                                                                                                                                                                                                     switch(this.H) {
                                                                                                                                                                                                                                                                                                                                                                     case -679:
                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.a(var1, 679, this.J, this.width / 2, this.height / 2, Utlis.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        if (mConfig.gI().b()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, this.l, this.width / 2, this.height - Utlis.n(6), 2, -1, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((vdtt_dd)vdtt_dd.c, (Graphics)var1, this.l, this.width / 2, this.height - 6, 2, -1, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7301;
                                                                                                                                                                                                                                                                                                                                                                     case -107:
                                                                                                                                                                                                                                                                                                                                                                        var1.p();
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 2, this.width, this.height - 3, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        var1.r();
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.b, var1, this.l, this.width / 2 + 1, this.height / 2 + 1, 2, -6908266, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.b, var1, this.l, this.width / 2, this.height / 2, 2, -1, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7061;
                                                                                                                                                                                                                                                                                                                                                                     case -92:
                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.a(var1, 91, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                        break label7042;
                                                                                                                                                                                                                                                                                                                                                                     case -91:
                                                                                                                                                                                                                                                                                                                                                                        vdtt_cz.a(var1, 91, this.J, 0, 0, 20);
                                                                                                                                                                                                                                                                                                                                                                        break label7036;
                                                                                                                                                                                                                                                                                                                                                                     case -52:
                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.a(var1, 52, this.J, this.width / 2, this.height / 2, Utlis.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        if (mConfig.gI().b()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, this.l, this.width / 2, this.height - Utlis.n(6), 2, -1, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((vdtt_dd)vdtt_dd.c, (Graphics)var1, this.l, this.width / 2, this.height - 6, 2, -1, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7063;
                                                                                                                                                                                                                                                                                                                                                                     case -36:
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, -1, this.width, this.height + 2, 7, 3, 4, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        if ((var6 = this.l.split("\n")).length == 1) {
                                                                                                                                                                                                                                                                                                                                                                           if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, var6[0], this.width / 2 + 1, this.height / 2, 2, -1, -16742145);
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, var6[0], this.width / 2, this.height / 2 - 1, 2, -1, 0);
                                                                                                                                                                                                                                                                                                                                                                           }
                                                                                                                                                                                                                                                                                                                                                                        } else if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, var6[0], this.width / 2 + 1, this.height / 2 - 4, 2, -1, -16742145);
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, var6[1], this.width / 2 + 1, this.height / 2 + 4, 2, -1, -16742145);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, var6[0], this.width / 2, this.height / 2 - 4 - 1, 2, -1, 0);
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, var6[1], this.width / 2, this.height / 2 + 4 - 1, 2, -1, 0);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7059;
                                                                                                                                                                                                                                                                                                                                                                     case -35:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d() || GameSrc.gI().aB.e()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.b(var1, 689, this.J, 0, 0, this.width, this.height);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (GameSrc.gI().aV) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, DataCenter.gI().h % 24 < 12 ? 713 : 454, this.J, this.width / 2 - Utlis.n(5), this.height / 2 - Utlis.n(5), Utlis.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (mConfig.gI().b()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, this.l, this.width / 2, this.height - Utlis.n(6), 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((vdtt_dd)vdtt_dd.c, (Graphics)var1, this.l, this.width / 2, this.height - 6, 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -34:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d() || GameSrc.gI().aB.e()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.b(var1, 673, this.J, 0, 0, this.width, this.height);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -33:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d() || GameSrc.gI().aB.e()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.b(var1, 674, this.J, 0, 0, this.width, this.height);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -32:
                                                                                                                                                                                                                                                                                                                                                                        if (this.c) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, 370, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                           var1.e(30);
                                                                                                                                                                                                                                                                                                                                                                           var7 = this.width / 2 - 13;
                                                                                                                                                                                                                                                                                                                                                                           if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                              a(var1, var7 + 1, this.height / 2 + 2, "", (byte)7);
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              a(var1, var7, this.height / 2 - 1 + 2, "", (byte)7);
                                                                                                                                                                                                                                                                                                                                                                           }

                                                                                                                                                                                                                                                                                                                                                                           var1.h();
                                                                                                                                                                                                                                                                                                                                                                           break label7032;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.a(var1, 7, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                        var1.h();
                                                                                                                                                                                                                                                                                                                                                                        var7 = this.width / 2 - 13;
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           a(var1, var7 + 1, this.height / 2 + 2, "", (byte)7);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           a(var1, var7, this.height / 2 - 1 + 2, "", (byte)7);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -31:
                                                                                                                                                                                                                                                                                                                                                                        var1.h();
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.c(vdtt_dd.b, var1, this.l, this.width / 2 + 1, this.height / 2 + 1, 2, -9457905, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.c(vdtt_dd.b, var1, this.l, this.width / 2 + 1, this.height / 2, 2, -9457905, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7062;
                                                                                                                                                                                                                                                                                                                                                                     case -30:
                                                                                                                                                                                                                                                                                                                                                                        var1.c(199.0F);
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, -1, this.width, this.height + 2, 7, 3, 4, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        var1.r();
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.d, var1, this.l, this.width / 2 + 1, this.height / 2, 2, -1, 0);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.d, var1, this.l, this.width / 2, this.height / 2 - 1, 2, -1, 0);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7041;
                                                                                                                                                                                                                                                                                                                                                                     case -29:
                                                                                                                                                                                                                                                                                                                                                                        var1.c(-18.0F);
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, -1, this.width, this.height + 2, 7, 3, 4, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        var1.r();
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.d, var1, this.l, this.width / 2 + 1, this.height / 2, 2, -1, 0);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.d, var1, this.l, this.width / 2, this.height / 2 - 1, 2, -1, 0);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7052;
                                                                                                                                                                                                                                                                                                                                                                     case -28:
                                                                                                                                                                                                                                                                                                                                                                        if (this.c) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, 370, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.d, var1, this.l, this.width / 2, this.height / 2, 2, -11184811, 0);
                                                                                                                                                                                                                                                                                                                                                                           break label7074;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.a(var1, 7, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                        var7 = 0;
                                                                                                                                                                                                                                                                                                                                                                        byte var8 = 0;
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           var7 = 1;
                                                                                                                                                                                                                                                                                                                                                                           var8 = 1;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (GameSrc.gI().cY == 1) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, 44, 0, 2 + var7, 2 + var8, 88);
                                                                                                                                                                                                                                                                                                                                                                           var7 += 3;
                                                                                                                                                                                                                                                                                                                                                                        } else if (GameSrc.gI().cY == 2) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, 65, 0, 2 + var7, 2 + var8, 88);
                                                                                                                                                                                                                                                                                                                                                                           var7 += 3;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        vdtt_dd.a(var1, this.l, this.width / 2 + var7, this.height / 2 + var8, 2, -1);
                                                                                                                                                                                                                                                                                                                                                                        break label7066;
                                                                                                                                                                                                                                                                                                                                                                     case -27:
                                                                                                                                                                                                                                                                                                                                                                        vdtt_cz.a(var1, 49, this.J, this.width / 2, this.height / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -26:
                                                                                                                                                                                                                                                                                                                                                                        vdtt_cz.a(var1, 52, this.J, this.width / 2, this.height / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -25:
                                                                                                                                                                                                                                                                                                                                                                        if (this.c) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, 370, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                           var1.e(30);
                                                                                                                                                                                                                                                                                                                                                                           var7 = this.width / 2 - 13;
                                                                                                                                                                                                                                                                                                                                                                           if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                              a(var1, var7 + 1, this.height / 2 + 2, "", (byte)0);
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              a(var1, var7, this.height / 2 - 1 + 2, "", (byte)0);
                                                                                                                                                                                                                                                                                                                                                                           }

                                                                                                                                                                                                                                                                                                                                                                           var1.h();
                                                                                                                                                                                                                                                                                                                                                                           break label7053;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.a(var1, 7, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                        var1.h();
                                                                                                                                                                                                                                                                                                                                                                        var7 = this.width / 2 - 13;
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           a(var1, var7 + 1, this.height / 2 + 2, "", (byte)0);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           a(var1, var7, this.height / 2 - 1 + 2, "", (byte)0);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -24:
                                                                                                                                                                                                                                                                                                                                                                        var1.f(GameSrc.gI().cJ);
                                                                                                                                                                                                                                                                                                                                                                        var1.c(0, 0, 16, 16);
                                                                                                                                                                                                                                                                                                                                                                        var1.f(GameSrc.gI().cJ == -11184811 ? -1 : -11184811);
                                                                                                                                                                                                                                                                                                                                                                        var1.b(0, 0, 16, 16);
                                                                                                                                                                                                                                                                                                                                                                        var1.f();
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -23:
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 1, this.width, 20, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 1, this.width, 20, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        if (this.b) {
                                                                                                                                                                                                                                                                                                                                                                           var1.f(-1);
                                                                                                                                                                                                                                                                                                                                                                           var1.b(0, 0, this.width - 1, this.height);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        vdtt_dd.b(vdtt_dd.d, var1, this.l, this.width / 2, this.height / 2, 2, -1, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        break label7038;
                                                                                                                                                                                                                                                                                                                                                                     case -22:
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 1, this.width, 20, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 1, this.width, 20, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        if (this.b) {
                                                                                                                                                                                                                                                                                                                                                                           var1.f(-1);
                                                                                                                                                                                                                                                                                                                                                                           var1.b(0, 0, this.width - 1, this.height);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        vdtt_cz.a(var1, 98, 270, this.width / 2, this.height / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                        break label7040;
                                                                                                                                                                                                                                                                                                                                                                     case -21:
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 1, this.width, 20, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 1, this.width, 20, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        if (this.b) {
                                                                                                                                                                                                                                                                                                                                                                           var1.f(-1);
                                                                                                                                                                                                                                                                                                                                                                           var1.b(0, 0, this.width - 1, this.height);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        vdtt_cz.a(var1, 98, 90, this.width / 2, this.height / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                        break label7056;
                                                                                                                                                                                                                                                                                                                                                                     case -20:
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 1, this.width, 20, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 1, this.width, 20, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        if (this.b) {
                                                                                                                                                                                                                                                                                                                                                                           var1.f(-1);
                                                                                                                                                                                                                                                                                                                                                                           var1.b(0, 0, this.width - 1, this.height);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        vdtt_cz.a(var1, 98, 180, this.width / 2, this.height / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                        break label7049;
                                                                                                                                                                                                                                                                                                                                                                     case -19:
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 1, this.width, 20, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        if (this.b) {
                                                                                                                                                                                                                                                                                                                                                                           var1.f(-1);
                                                                                                                                                                                                                                                                                                                                                                           var1.b(0, 0, this.width - 1, this.height);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        vdtt_cz.a(var1, 98, 0, this.width / 2, this.height / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                        break label7045;
                                                                                                                                                                                                                                                                                                                                                                     case -18:
                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.a(var1, -10, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -17:
                                                                                                                                                                                                                                                                                                                                                                        var1.h();
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.c(vdtt_dd.b, var1, this.l, this.width / 2 + 1, this.height / 2 + 1, 2, -2559, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.c(vdtt_dd.b, var1, this.l, this.width / 2 + 1, this.height / 2, 2, -2559, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7076;
                                                                                                                                                                                                                                                                                                                                                                     case -16:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, f(), this.J, Utlis.n(4), Utlis.n(3), Utlis.n(100));
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -15:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           if (mConfig.gI().b()) {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_y.a(var1, 82, this.J, 0, 1, Utlis.n(36), (int)Utlis.n(14));
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_cz.a(var1, 82, this.J, 0, 1, 20);
                                                                                                                                                                                                                                                                                                                                                                           }

                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((BitmapFont)Graphics.a(Utlis.a(0.5F)), (Graphics)var1, SettingsTab.K().z() ? Caption.xI : Caption.xJ, this.width / 2 + (mConfig.gI().b() ? 10 : 0), this.height / 2 - (mConfig.gI().b() ? -3 : 1), 2, -9737365, 0);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((BitmapFont)Graphics.a(Utlis.a(0.5F)), (Graphics)var1, SettingsTab.K().z() ? Caption.xI : Caption.xJ, this.width / 2 + (mConfig.gI().b() ? 10 : 0), this.height / 2 - (mConfig.gI().b() ? -3 : 1), 2, -5855836, 0);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7058;
                                                                                                                                                                                                                                                                                                                                                                     case -14:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d() || GameSrc.gI().aB.e()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.b(var1, 672, this.J, 0, 0, this.width, this.height);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7029;
                                                                                                                                                                                                                                                                                                                                                                     case -13:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_cz.a(var1, 604, this.J, this.width / 2, this.height / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        float var9;
                                                                                                                                                                                                                                                                                                                                                                        if ((var9 = (float)(Utlis.a() - GameSrc.gI().dl) / 1000.0F) <= 30.0F && var9 > 0.0F) {
                                                                                                                                                                                                                                                                                                                                                                           if ((var7 = (int)((1.0F - var9 / 30.0F) * (float)this.height)) == 0 || var7 > this.height) {
                                                                                                                                                                                                                                                                                                                                                                              var7 = 1;
                                                                                                                                                                                                                                                                                                                                                                           }

                                                                                                                                                                                                                                                                                                                                                                           vdtt_cz.a(var1, 64, 0, 0, Utlis.n(this.height), Utlis.n(this.width) * DataCenter.gI().r, Utlis.n(var7) * DataCenter.gI().r, 0, this.height - var7, this.width, var7, 36);
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.d(vdtt_dd.b, var1, String.format("%.2f", 30.0F - var9), this.width / 2, this.height / 2, 2, -6488, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        vdtt_dd.d(vdtt_dd.b, var1, Item.b(GameSrc.gI().bT), this.width / 2, this.height / 2 + 9, 2, -6488, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        break label7043;
                                                                                                                                                                                                                                                                                                                                                                     case -12:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.b(var1, 81, this.J, 0, 0, this.width, this.height);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -11:
                                                                                                                                                                                                                                                                                                                                                                        vdtt_cz.a(var1, 59, 90, 0, 0, 20);
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -10:
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, 1, this.width, 20, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        vdtt_dd.b(vdtt_dd.d, var1, this.l, 7, this.height / 2, 0, -1, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        break label7057;
                                                                                                                                                                                                                                                                                                                                                                     case -9:
                                                                                                                                                                                                                                                                                                                                                                     case -6:
                                                                                                                                                                                                                                                                                                                                                                     case -5:
                                                                                                                                                                                                                                                                                                                                                                     case -4:
                                                                                                                                                                                                                                                                                                                                                                     case -3:
                                                                                                                                                                                                                                                                                                                                                                        if (this.c) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, 370, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                           if (this.l.equals(Caption.xD)) {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_dd.b(vdtt_dd.d, var1, this.l, this.width / 2, this.height / 2, 2, -3089954, 0);
                                                                                                                                                                                                                                                                                                                                                                           } else if (this.l.equals(Caption.iJ)) {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_dd.b(vdtt_dd.d, var1, this.l, this.width / 2, this.height / 2, 2, -7812062, 0);
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_dd.b(vdtt_dd.d, var1, Caption.oI, this.width / 2, this.height / 2, 2, -3089954, 0);
                                                                                                                                                                                                                                                                                                                                                                           }
                                                                                                                                                                                                                                                                                                                                                                           break label7044;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.a(var1, 7, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                        var1.h();
                                                                                                                                                                                                                                                                                                                                                                        byte var10 = 0;
                                                                                                                                                                                                                                                                                                                                                                        int var11 = this.width / 2 - 13;
                                                                                                                                                                                                                                                                                                                                                                        if (this.H == -3) {
                                                                                                                                                                                                                                                                                                                                                                           var10 = 2;
                                                                                                                                                                                                                                                                                                                                                                        } else if (this.H == -4) {
                                                                                                                                                                                                                                                                                                                                                                           var10 = 3;
                                                                                                                                                                                                                                                                                                                                                                        } else if (this.H == -5) {
                                                                                                                                                                                                                                                                                                                                                                           var10 = 0;
                                                                                                                                                                                                                                                                                                                                                                        } else if (this.H == -6) {
                                                                                                                                                                                                                                                                                                                                                                           var10 = 1;
                                                                                                                                                                                                                                                                                                                                                                        } else if (this.H == -9) {
                                                                                                                                                                                                                                                                                                                                                                           var10 = 4;
                                                                                                                                                                                                                                                                                                                                                                           var11 += 3;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (var10 != 4 && var10 != 5) {
                                                                                                                                                                                                                                                                                                                                                                           if (var10 != 0 && var10 != 1) {
                                                                                                                                                                                                                                                                                                                                                                              if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                                 a(var1, var11 + 1, this.height / 2 - 1, "", var10);
                                                                                                                                                                                                                                                                                                                                                                              } else {
                                                                                                                                                                                                                                                                                                                                                                                 a(var1, var11, this.height / 2 - 2, "", var10);
                                                                                                                                                                                                                                                                                                                                                                              }
                                                                                                                                                                                                                                                                                                                                                                           } else if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                              a(var1, var11 + 1, this.height / 2 + 1, "", var10);
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              a(var1, var11, this.height / 2 - 1 + 1, "", var10);
                                                                                                                                                                                                                                                                                                                                                                           }
                                                                                                                                                                                                                                                                                                                                                                        } else if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           a(var1, var11 + 1, this.height / 2 + 1, "", var10);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           a(var1, var11, this.height / 2 - 1 + 1, "", var10);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -8:
                                                                                                                                                                                                                                                                                                                                                                     case 7:
                                                                                                                                                                                                                                                                                                                                                                     case 15:
                                                                                                                                                                                                                                                                                                                                                                        if (this.c) {
                                                                                                                                                                                                                                                                                                                                                                           if (this.width <= 67 && this.height <= 40) {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_y.a(var1, 370, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              this.a(var1, 0, -1, this.width, this.height + 2, 370, 3, 4, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                           }

                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.d, var1, this.l, this.width / 2, this.height / 2, 2, -11184811, 0);
                                                                                                                                                                                                                                                                                                                                                                           break label7030;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (this.width <= 67 && this.height <= 40) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, 7, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                           break;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 0, -1, this.width, this.height + 2, 7, 3, 4, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case -7:
                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.a(var1, 15, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                        var1.h();
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.d, var1, this.l, this.width / 2 + 1, this.height / 2 + 1, 2, -6908266, -15191233);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.d, var1, this.l, this.width / 2, this.height / 2, 2, -6908266, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7026;
                                                                                                                                                                                                                                                                                                                                                                     case -2:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.d, var1, this.l, this.width / 2 + 1, this.height / 2 + 1, 2, -2560, -15191233);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.d, var1, this.l, this.width / 2, this.height / 2, 2, -2560, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           var1.h();
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        var1.f(-2560);
                                                                                                                                                                                                                                                                                                                                                                        var1.a(0, 15, this.width, 1);
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           var1.e(30);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7047;
                                                                                                                                                                                                                                                                                                                                                                     case 9:
                                                                                                                                                                                                                                                                                                                                                                        if (!this.c) {
                                                                                                                                                                                                                                                                                                                                                                           break label7065;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.a(var1, 370, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                        var7 = (this.width - vdtt_dd.b(vdtt_dd.d, this.l)) / 2 - 9;
                                                                                                                                                                                                                                                                                                                                                                        vdtt_cz.a(var1, 9, 0, var7, this.height / 2, 6);
                                                                                                                                                                                                                                                                                                                                                                        vdtt_dd.b(vdtt_dd.d, var1, this.l, var7 + 16, this.height / 2, 0, -3089954, 0);
                                                                                                                                                                                                                                                                                                                                                                        break label7050;
                                                                                                                                                                                                                                                                                                                                                                     case 13:
                                                                                                                                                                                                                                                                                                                                                                        if (this.c) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, 370, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, var5, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7025;
                                                                                                                                                                                                                                                                                                                                                                     case 14:
                                                                                                                                                                                                                                                                                                                                                                     case 78:
                                                                                                                                                                                                                                                                                                                                                                     case 522:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_cz.a(var1, var5, this.J, 2, 2, 20);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case 17:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.b(var1, 17, this.J, 0, 0, this.width, this.height);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case 25:
                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.a(var1, 7, this.J, 1, 1, this.width - 2, (int)(this.height - 2));
                                                                                                                                                                                                                                                                                                                                                                        vdtt_cz.a(var1, 7, this.J, 14, 10, 3);
                                                                                                                                                                                                                                                                                                                                                                        var1.h();
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case 33:
                                                                                                                                                                                                                                                                                                                                                                     case 38:
                                                                                                                                                                                                                                                                                                                                                                        vdtt_cz.a(var1, var5, this.J, 0, 0, 20);
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case 42:
                                                                                                                                                                                                                                                                                                                                                                        vdtt_cz.a(var1, var5, this.J, 0, 0, 20);
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.f, var1, this.l, this.width / 2, this.height / 2, 2, -1, -65536);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.e, var1, this.l, this.width / 2, this.height / 2, 2, -1, -65536);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7077;
                                                                                                                                                                                                                                                                                                                                                                     case 49:
                                                                                                                                                                                                                                                                                                                                                                        var1.h();
                                                                                                                                                                                                                                                                                                                                                                        this.a(var1, 1, -5, 19, 30, 67, 3, 4, 4, 0, 1, 0);
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           var1.e(30);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        vdtt_cz.a(var1, var5, this.J, this.width / 2, this.height / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case 66:
                                                                                                                                                                                                                                                                                                                                                                        vdtt_cz.a(var1, var5, this.J, 0, this.height, 36);
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a(var1, this.l, this.width / 2 + 4 + 1, this.height / 2 - 1 + 1, 2, -1);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a(var1, this.l, this.width / 2 + 4, this.height / 2 - 1, 2, -1);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7048;
                                                                                                                                                                                                                                                                                                                                                                     case 73:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           if (mConfig.gI().b()) {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_y.a(var1, var5, this.J, 0, 1, Utlis.n(36), (int)Utlis.n(14));
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_cz.a(var1, var5, this.J, 0, 1, 20);
                                                                                                                                                                                                                                                                                                                                                                           }

                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((BitmapFont)Graphics.a(Utlis.a(0.5F)), (Graphics)var1, this.l, this.width / 2 + (mConfig.gI().b() ? 17 : 6), this.height / 2 - (mConfig.gI().b() ? -3 : 1), 2, -9737365, 0);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((BitmapFont)Graphics.a(Utlis.a(0.5F)), (Graphics)var1, this.l, this.width / 2 + (mConfig.gI().b() ? 17 : 6), this.height / 2 - (mConfig.gI().b() ? -3 : 1), 2, -5855836, 0);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7039;
                                                                                                                                                                                                                                                                                                                                                                     case 79:
                                                                                                                                                                                                                                                                                                                                                                        var6 = this.l.split(" ");
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, 79, 0, -2, -2, 105);
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.g, var1, var6[0], this.width / 2 + 1, this.height / 2 + 1 - 3, 2, -1, -16742145);
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.g, var1, var6[1], this.width / 2 + 1, this.height / 2 + 1 + 10, 2, -1, -16742145);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_cz.a(var1, var5, this.J, 0, 0, 20);
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.g, var1, var6[0], this.width / 2, this.height / 2 - 3, 2, -1, 0);
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.g, var1, var6[1], this.width / 2, this.height / 2 + 10, 2, -1, 0);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7079;
                                                                                                                                                                                                                                                                                                                                                                     case 81:
                                                                                                                                                                                                                                                                                                                                                                     case 100:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, var5, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7071;
                                                                                                                                                                                                                                                                                                                                                                     case 82:
                                                                                                                                                                                                                                                                                                                                                                     case 572:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           if (mConfig.gI().b()) {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_y.a(var1, var5, this.J, 0, 1, Utlis.n(36), (int)Utlis.n(14));
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_cz.a(var1, var5, this.J, 0, 1, 20);
                                                                                                                                                                                                                                                                                                                                                                           }

                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((BitmapFont)Graphics.a(Utlis.a(0.5F)), (Graphics)var1, this.l, this.width / 2 + (mConfig.gI().b() ? 10 : 0), this.height / 2 - (mConfig.gI().b() ? -3 : 1), 2, -9737365, 0);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((BitmapFont)Graphics.a(Utlis.a(0.5F)), (Graphics)var1, this.l, this.width / 2 + (mConfig.gI().b() ? 10 : 0), this.height / 2 - (mConfig.gI().b() ? -3 : 1), 2, -5855836, 0);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7037;
                                                                                                                                                                                                                                                                                                                                                                     case 89:
                                                                                                                                                                                                                                                                                                                                                                     case 566:
                                                                                                                                                                                                                                                                                                                                                                     case 740:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d() || GameSrc.gI().aB.e()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.b(var1, var5, this.J, 0, 0, this.width, this.height);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case 94:
                                                                                                                                                                                                                                                                                                                                                                     case 672:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           if (mConfig.gI().d()) {
                                                                                                                                                                                                                                                                                                                                                                              DataCenter.n();
                                                                                                                                                                                                                                                                                                                                                                              vdtt_y.a(var1, var5, this.J, this.width / 2, this.height / 2, Utlis.n(80), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_cz.a(var1, var5, this.J, this.width / 2, this.height / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                           }
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           DataCenter.n();
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case 286:
                                                                                                                                                                                                                                                                                                                                                                     case 287:
                                                                                                                                                                                                                                                                                                                                                                     case 288:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_cz.a(var1, var5, this.J, 1, 1, 20);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_cz.a(var1, var5, this.J, 0, 0, 20);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case 373:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.b, var1, this.l, this.width / 2 + 1, this.height / 2 + 1, 2, -3476028, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.b, var1, this.l, this.width / 2, this.height / 2, 2, -3476028, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7070;
                                                                                                                                                                                                                                                                                                                                                                     case 374:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_cz.a(var1, var5, this.J, 0, 0, 20);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7075;
                                                                                                                                                                                                                                                                                                                                                                     case 398:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_cz.a(var1, var5, this.J, -1, 1, 20);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_cz.a(var1, var5, this.J, 0, 0, 20);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7034;
                                                                                                                                                                                                                                                                                                                                                                     case 552:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           if (mConfig.gI().b()) {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_y.a(var1, var5, this.J, 0, 1, Utlis.n(36), (int)Utlis.n(14));
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_cz.a(var1, var5, this.J, 0, 1, 20);
                                                                                                                                                                                                                                                                                                                                                                           }
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7060;
                                                                                                                                                                                                                                                                                                                                                                     case 557:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           if (GameSrc.gI().bY >= 0 && GameSrc.gI().bY < DataCenter.gI().itemTemplate.length) {
                                                                                                                                                                                                                                                                                                                                                                              var5 = DataCenter.gI().itemTemplate[GameSrc.gI().bY].idIcon;
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              var5 = 81;
                                                                                                                                                                                                                                                                                                                                                                           }

                                                                                                                                                                                                                                                                                                                                                                           vdtt_cz.a(var1, var5, this.J, this.width / 2, this.height / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (GameSrc.gI().bY >= 0 && GameSrc.gI().bY < DataCenter.gI().itemTemplate.length) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(vdtt_dd.b, var1, Item.b(GameSrc.gI().bX), this.width / 2, this.height / 2 + 9, 2, -6488, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7031;
                                                                                                                                                                                                                                                                                                                                                                     case 577:
                                                                                                                                                                                                                                                                                                                                                                     case 578:
                                                                                                                                                                                                                                                                                                                                                                     case 579:
                                                                                                                                                                                                                                                                                                                                                                     case 580:
                                                                                                                                                                                                                                                                                                                                                                     case 581:
                                                                                                                                                                                                                                                                                                                                                                     case 584:
                                                                                                                                                                                                                                                                                                                                                                     case 675:
                                                                                                                                                                                                                                                                                                                                                                     case 676:
                                                                                                                                                                                                                                                                                                                                                                     case 678:
                                                                                                                                                                                                                                                                                                                                                                     case 679:
                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.a(var1, var5, this.J, this.width / 2, this.height / 2, Utlis.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        if (mConfig.gI().b()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, this.l, this.width / 2, this.height - Utlis.n(6), 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((vdtt_dd)vdtt_dd.c, (Graphics)var1, this.l, this.width / 2, this.height - 6, 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7064;
                                                                                                                                                                                                                                                                                                                                                                     case 638:
                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.a(var1, var5, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                        break label7068;
                                                                                                                                                                                                                                                                                                                                                                     case 673:
                                                                                                                                                                                                                                                                                                                                                                     case 674:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, var5, this.J, this.width / 2, this.height / 2, Utlis.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     case 677:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, var5, this.J, this.width / 2, this.height / 2, Utlis.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7055;
                                                                                                                                                                                                                                                                                                                                                                     case 680:
                                                                                                                                                                                                                                                                                                                                                                     case 681:
                                                                                                                                                                                                                                                                                                                                                                        if (DataCenter.gI().e() instanceof GameSrc) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, var5, this.J, this.width / 2, this.height / 2, Utlis.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                           if (mConfig.gI().b()) {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, this.l, this.width / 2, this.height - Utlis.n(6), 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_dd.a((vdtt_dd)vdtt_dd.c, (Graphics)var1, this.l, this.width / 2, this.height - 6, 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                           }
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, var5, this.J, this.width / 2, this.height / 2, Utlis.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                           if (mConfig.gI().b()) {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, this.l, this.width / 2, this.height - Utlis.n(6), 2, -1, -10275328);
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_dd.a((vdtt_dd)vdtt_dd.c, (Graphics)var1, this.l, this.width / 2, this.height - 6, 2, -1, -10275328);
                                                                                                                                                                                                                                                                                                                                                                           }
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7033;
                                                                                                                                                                                                                                                                                                                                                                     case 684:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.d(vdtt_dd.b, var1, this.l, this.width / 2 + 1, this.height / 2, 2, -2560, -10275328);
                                                                                                                                                                                                                                                                                                                                                                           break label7028;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (GameSrc.gI().dB.b && this.m == 1102 || GameSrc.gI().dw.b && this.m == 3010) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.d(vdtt_dd.b, var1, this.l, this.width / 2, this.height / 2 - 1, 2, -2560, -10275328);
                                                                                                                                                                                                                                                                                                                                                                           break label7028;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        vdtt_dd.d(vdtt_dd.b, var1, this.l, this.width / 2, this.height / 2 - 1, 2, -1, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        break label7028;
                                                                                                                                                                                                                                                                                                                                                                     case 687:
                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.a(var1, var5, this.J, this.width / 2, this.height / 2, Utlis.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        GameSrc.gI();
                                                                                                                                                                                                                                                                                                                                                                        if (GameSrc.P() > 0) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, DataCenter.gI().h % 24 < 12 ? 713 : 454, this.J, this.width / 2 - Utlis.n(5), this.height / 2 - Utlis.n(5), Utlis.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (mConfig.gI().b()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, this.l, this.width / 2, this.height - Utlis.n(6), 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((vdtt_dd)vdtt_dd.c, (Graphics)var1, this.l, this.width / 2, this.height - 6, 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7073;
                                                                                                                                                                                                                                                                                                                                                                     case 688:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, var5, this.J, this.width / 2, this.height / 2, Utlis.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (GameSrc.gI().aZ) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, DataCenter.gI().h % 24 < 12 ? 713 : 454, this.J, this.width / 2 - Utlis.n(5), this.height / 2 - Utlis.n(5), Utlis.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (mConfig.gI().b()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, this.l, this.width / 2, this.height - Utlis.n(6), 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((vdtt_dd)vdtt_dd.c, (Graphics)var1, this.l, this.width / 2, this.height - 6, 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7024;
                                                                                                                                                                                                                                                                                                                                                                     case 689:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, var5, this.J, this.width / 2, this.height / 2, Utlis.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (GameSrc.gI().aV) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, DataCenter.gI().h % 24 < 12 ? 713 : 454, this.J, this.width / 2 - Utlis.n(5), this.height / 2 - Utlis.n(5), Utlis.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (mConfig.gI().b()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, this.l, this.width / 2, this.height - Utlis.n(6), 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((vdtt_dd)vdtt_dd.c, (Graphics)var1, this.l, this.width / 2, this.height - 6, 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7051;
                                                                                                                                                                                                                                                                                                                                                                     case 690:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, var5, this.J, this.width / 2, this.height / 2, Utlis.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (vdtt_jf.z() != null && GameSrc.gI().co) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, DataCenter.gI().h % 24 < 12 ? 713 : 454, this.J, this.width / 2 - Utlis.n(5), this.height / 2 - Utlis.n(5), Utlis.n(100), (byte)3);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (mConfig.gI().b()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((vdtt_dd)vdtt_dd.d, (Graphics)var1, this.l, this.width / 2, this.height - Utlis.n(6), 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.a((vdtt_dd)vdtt_dd.c, (Graphics)var1, this.l, this.width / 2, this.height - 6, 2, -19945, -10275328);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7046;
                                                                                                                                                                                                                                                                                                                                                                     case 715:
                                                                                                                                                                                                                                                                                                                                                                        if (DataCenter.k()) {
                                                                                                                                                                                                                                                                                                                                                                           var1.p();
                                                                                                                                                                                                                                                                                                                                                                           this.a(var1, 0, 2, this.width, this.height - 3, 46, 22, 23, 1, 1);
                                                                                                                                                                                                                                                                                                                                                                           var1.r();
                                                                                                                                                                                                                                                                                                                                                                           if (GameSrc.gI().aA.d()) {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.dE, this.width / 2, this.height / 2, 2, this.d() ? -2560 : -1, -10275328);
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_dd.a((vdtt_dd)vdtt_dd.b, (Graphics)var1, Caption.jW, this.width / 2, this.height / 2, 2, this.d() ? -2560 : -1, -10275328);
                                                                                                                                                                                                                                                                                                                                                                           }
                                                                                                                                                                                                                                                                                                                                                                           break label7072;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, var5, this.J, 0, 0, this.width, (int)this.height);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (this.m != 1100 || GameSrc.gI().aB.d()) {
                                                                                                                                                                                                                                                                                                                                                                           break label7078;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (!GameSrc.gI().aV && (vdtt_jf.z() == null || !GameSrc.gI().co) && !GameSrc.gI().aZ) {
                                                                                                                                                                                                                                                                                                                                                                           GameSrc.gI();
                                                                                                                                                                                                                                                                                                                                                                           if (GameSrc.P() <= 0) {
                                                                                                                                                                                                                                                                                                                                                                              break label7078;
                                                                                                                                                                                                                                                                                                                                                                           }
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        vdtt_y.a(var1, DataCenter.gI().h % 24 < 12 ? 713 : 454, this.J, this.width, 0, Utlis.n(100), (byte)24);
                                                                                                                                                                                                                                                                                                                                                                        break label7078;
                                                                                                                                                                                                                                                                                                                                                                     case 722:
                                                                                                                                                                                                                                                                                                                                                                     case 723:
                                                                                                                                                                                                                                                                                                                                                                     case 724:
                                                                                                                                                                                                                                                                                                                                                                     case 725:
                                                                                                                                                                                                                                                                                                                                                                        if (var5 == 725) {
                                                                                                                                                                                                                                                                                                                                                                           if (Char.gI().giatoc != null && Char.gI().giatoc.d > 0) {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_y.a(var1, Char.gI().giatoc.d, this.J, Utlis.n(4), Utlis.n(3), Utlis.n(100));
                                                                                                                                                                                                                                                                                                                                                                           } else {
                                                                                                                                                                                                                                                                                                                                                                              vdtt_y.a(var1, var5, this.J, Utlis.n(4), Utlis.n(3), Utlis.n(100));
                                                                                                                                                                                                                                                                                                                                                                           }
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.a(var1, var5, this.J, Utlis.n(4), Utlis.n(3), Utlis.n(100));
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        vdtt_dd var12 = mConfig.gI().b() ? vdtt_dd.d : vdtt_dd.b;
                                                                                                                                                                                                                                                                                                                                                                        if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(var12, var1, this.l, Utlis.n(20), Utlis.n(7), 0, -1, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_dd.b(var12, var1, this.l, Utlis.n(20), Utlis.n(6), 0, -1, -16777216);
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                        break label7067;
                                                                                                                                                                                                                                                                                                                                                                     case 741:
                                                                                                                                                                                                                                                                                                                                                                        if (this.d() || GameSrc.gI().aB.e()) {
                                                                                                                                                                                                                                                                                                                                                                           vdtt_y.b(var1, var5, this.J, 0, 0, this.width, this.height);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        vdtt_cz.a(var1, 742 + DataCenter.gI().h / 5 % 5, 0, this.width / 2, this.height / 2, 3);
                                                                                                                                                                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                                                                                                                                                                     default:
                                                                                                                                                                                                                                                                                                                                                                        if (this.n == 0) {
                                                                                                                                                                                                                                                                                                                                                                           break label7054;
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        if (this.n > 0) {
                                                                                                                                                                                                                                                                                                                                                                           var1.d(this.n);
                                                                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                                                                        vdtt_cz.a(var1, var5, this.J, 0, 0, 20);
                                                                                                                                                                                                                                                                                                                                                                        if (this.n > 0) {
                                                                                                                                                                                                                                                                                                                                                                           var1.g();
                                                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                                                     }
                                                                                                                                                                                                                                                                                                                                                                  }

                                                                                                                                                                                                                                                                                                                                                                  if (this.c) {
                                                                                                                                                                                                                                                                                                                                                                     vdtt_dd.b(vdtt_dd.d, var1, this.l, this.width / 2, this.height / 2, 2, -11184811, 0);
                                                                                                                                                                                                                                                                                                                                                                  } else if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                     vdtt_dd.a(var1, this.l, this.width / 2 + 1, this.height / 2 + 1, 2, -1);
                                                                                                                                                                                                                                                                                                                                                                  } else {
                                                                                                                                                                                                                                                                                                                                                                     vdtt_dd.a(var1, this.l, this.width / 2, this.height / 2, 2, -1);
                                                                                                                                                                                                                                                                                                                                                                  }
                                                                                                                                                                                                                                                                                                                                                                  break label7035;
                                                                                                                                                                                                                                                                                                                                                               }
                                                                                                                                                                                                                                                                                                                                                            } catch (Exception var23) {
                                                                                                                                                                                                                                                                                                                                                               Utlis.a(var23);
                                                                                                                                                                                                                                                                                                                                                               break label7069;
                                                                                                                                                                                                                                                                                                                                                            } finally {
                                                                                                                                                                                                                                                                                                                                                               if (this.O != null) {
                                                                                                                                                                                                                                                                                                                                                                  this.O.b(var1, this.width / 2, this.height / 2);
                                                                                                                                                                                                                                                                                                                                                               }

                                                                                                                                                                                                                                                                                                                                                               if (this.d()) {
                                                                                                                                                                                                                                                                                                                                                                  var1.h();
                                                                                                                                                                                                                                                                                                                                                               }

                                                                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                                                            var4 = false;
                                                                                                                                                                                                                                                                                                                                                            break label7178;
                                                                                                                                                                                                                                                                                                                                                         }

                                                                                                                                                                                                                                                                                                                                                         var4 = false;
                                                                                                                                                                                                                                                                                                                                                         break label7187;
                                                                                                                                                                                                                                                                                                                                                      }

                                                                                                                                                                                                                                                                                                                                                      var4 = false;
                                                                                                                                                                                                                                                                                                                                                      break label7149;
                                                                                                                                                                                                                                                                                                                                                   }

                                                                                                                                                                                                                                                                                                                                                   var4 = false;
                                                                                                                                                                                                                                                                                                                                                   break label7153;
                                                                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                                                                var4 = false;
                                                                                                                                                                                                                                                                                                                                                break label7181;
                                                                                                                                                                                                                                                                                                                                             }

                                                                                                                                                                                                                                                                                                                                             var4 = false;
                                                                                                                                                                                                                                                                                                                                             break label7189;
                                                                                                                                                                                                                                                                                                                                          }

                                                                                                                                                                                                                                                                                                                                          var4 = false;
                                                                                                                                                                                                                                                                                                                                          break label7158;
                                                                                                                                                                                                                                                                                                                                       }

                                                                                                                                                                                                                                                                                                                                       var4 = false;
                                                                                                                                                                                                                                                                                                                                       break label7154;
                                                                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                                                                    var4 = false;
                                                                                                                                                                                                                                                                                                                                    break label7194;
                                                                                                                                                                                                                                                                                                                                 }

                                                                                                                                                                                                                                                                                                                                 var4 = false;
                                                                                                                                                                                                                                                                                                                                 break label7172;
                                                                                                                                                                                                                                                                                                                              }

                                                                                                                                                                                                                                                                                                                              var4 = false;
                                                                                                                                                                                                                                                                                                                              break label7190;
                                                                                                                                                                                                                                                                                                                           }

                                                                                                                                                                                                                                                                                                                           var4 = false;
                                                                                                                                                                                                                                                                                                                           break label7196;
                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                        var4 = false;
                                                                                                                                                                                                                                                                                                                        break label7180;
                                                                                                                                                                                                                                                                                                                     }

                                                                                                                                                                                                                                                                                                                     var4 = false;
                                                                                                                                                                                                                                                                                                                     break label7175;
                                                                                                                                                                                                                                                                                                                  }

                                                                                                                                                                                                                                                                                                                  var4 = false;
                                                                                                                                                                                                                                                                                                                  break label7199;
                                                                                                                                                                                                                                                                                                               }

                                                                                                                                                                                                                                                                                                               var4 = false;
                                                                                                                                                                                                                                                                                                               break label7165;
                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                            var4 = false;
                                                                                                                                                                                                                                                                                                            break label7146;
                                                                                                                                                                                                                                                                                                         }

                                                                                                                                                                                                                                                                                                         var4 = false;
                                                                                                                                                                                                                                                                                                         break label7164;
                                                                                                                                                                                                                                                                                                      }

                                                                                                                                                                                                                                                                                                      var4 = false;
                                                                                                                                                                                                                                                                                                      break label7170;
                                                                                                                                                                                                                                                                                                   }

                                                                                                                                                                                                                                                                                                   var4 = false;
                                                                                                                                                                                                                                                                                                   break label7176;
                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                var4 = false;
                                                                                                                                                                                                                                                                                                break label7157;
                                                                                                                                                                                                                                                                                             }

                                                                                                                                                                                                                                                                                             var4 = false;
                                                                                                                                                                                                                                                                                             break label7155;
                                                                                                                                                                                                                                                                                          }

                                                                                                                                                                                                                                                                                          var4 = false;
                                                                                                                                                                                                                                                                                          break label7161;
                                                                                                                                                                                                                                                                                       }

                                                                                                                                                                                                                                                                                       var4 = false;
                                                                                                                                                                                                                                                                                       break label7185;
                                                                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                                                                    var4 = false;
                                                                                                                                                                                                                                                                                    break label7152;
                                                                                                                                                                                                                                                                                 }

                                                                                                                                                                                                                                                                                 var4 = false;
                                                                                                                                                                                                                                                                                 break label7147;
                                                                                                                                                                                                                                                                              }

                                                                                                                                                                                                                                                                              var4 = false;
                                                                                                                                                                                                                                                                              break label7162;
                                                                                                                                                                                                                                                                           }

                                                                                                                                                                                                                                                                           var4 = false;
                                                                                                                                                                                                                                                                           break label7151;
                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                        var4 = false;
                                                                                                                                                                                                                                                                        break label7186;
                                                                                                                                                                                                                                                                     }

                                                                                                                                                                                                                                                                     var4 = false;
                                                                                                                                                                                                                                                                     break label7169;
                                                                                                                                                                                                                                                                  }

                                                                                                                                                                                                                                                                  var4 = false;
                                                                                                                                                                                                                                                                  break label7166;
                                                                                                                                                                                                                                                               }

                                                                                                                                                                                                                                                               var4 = false;
                                                                                                                                                                                                                                                               break label7179;
                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                            var4 = false;
                                                                                                                                                                                                                                                            break label7191;
                                                                                                                                                                                                                                                         }

                                                                                                                                                                                                                                                         var4 = false;
                                                                                                                                                                                                                                                         break label7163;
                                                                                                                                                                                                                                                      }

                                                                                                                                                                                                                                                      var4 = false;
                                                                                                                                                                                                                                                      break label7156;
                                                                                                                                                                                                                                                   }

                                                                                                                                                                                                                                                   var4 = false;
                                                                                                                                                                                                                                                   break label7159;
                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                var4 = false;
                                                                                                                                                                                                                                                break label7173;
                                                                                                                                                                                                                                             }

                                                                                                                                                                                                                                             var4 = false;
                                                                                                                                                                                                                                             break label7195;
                                                                                                                                                                                                                                          }

                                                                                                                                                                                                                                          var4 = false;
                                                                                                                                                                                                                                          break label7177;
                                                                                                                                                                                                                                       }

                                                                                                                                                                                                                                       var4 = false;
                                                                                                                                                                                                                                       break label7171;
                                                                                                                                                                                                                                    }

                                                                                                                                                                                                                                    var4 = false;
                                                                                                                                                                                                                                    break label7174;
                                                                                                                                                                                                                                 }

                                                                                                                                                                                                                                 var4 = false;
                                                                                                                                                                                                                                 break label7193;
                                                                                                                                                                                                                              }

                                                                                                                                                                                                                              var4 = false;
                                                                                                                                                                                                                              break label7150;
                                                                                                                                                                                                                           }

                                                                                                                                                                                                                           var4 = false;
                                                                                                                                                                                                                           break label7168;
                                                                                                                                                                                                                        }

                                                                                                                                                                                                                        var4 = false;
                                                                                                                                                                                                                        break label7182;
                                                                                                                                                                                                                     }

                                                                                                                                                                                                                     var4 = false;
                                                                                                                                                                                                                     break label7192;
                                                                                                                                                                                                                  }

                                                                                                                                                                                                                  var4 = false;
                                                                                                                                                                                                                  break label7180;
                                                                                                                                                                                                               }

                                                                                                                                                                                                               var4 = false;
                                                                                                                                                                                                               break label7198;
                                                                                                                                                                                                            }

                                                                                                                                                                                                            var4 = false;
                                                                                                                                                                                                            break label7200;
                                                                                                                                                                                                         }

                                                                                                                                                                                                         var4 = false;
                                                                                                                                                                                                         break label7183;
                                                                                                                                                                                                      }

                                                                                                                                                                                                      var4 = false;
                                                                                                                                                                                                      break label7188;
                                                                                                                                                                                                   }

                                                                                                                                                                                                   var4 = false;
                                                                                                                                                                                                   break label7167;
                                                                                                                                                                                                }

                                                                                                                                                                                                var4 = false;
                                                                                                                                                                                                break label7197;
                                                                                                                                                                                             }

                                                                                                                                                                                             var4 = false;
                                                                                                                                                                                             break label7160;
                                                                                                                                                                                          }

                                                                                                                                                                                          var4 = false;
                                                                                                                                                                                          break label7148;
                                                                                                                                                                                       }

                                                                                                                                                                                       var4 = false;
                                                                                                                                                                                       break label7184;
                                                                                                                                                                                    }

                                                                                                                                                                                    var4 = false;
                                                                                                                                                                                 } catch (Exception var25) {
                                                                                                                                                                                    Utlis.a(var25);
                                                                                                                                                                                    var4 = false;
                                                                                                                                                                                    break label7144;
                                                                                                                                                                                 } finally {
                                                                                                                                                                                    if (var4) {
                                                                                                                                                                                       if (this.N == 0) {
                                                                                                                                                                                          this.N = 1;
                                                                                                                                                                                          this.b(var1);
                                                                                                                                                                                       } else if (this.N == 1) {
                                                                                                                                                                                          this.N = 2;
                                                                                                                                                                                          this.a(var1, var2, var3);
                                                                                                                                                                                       }
                                                                                                                                                                                    }

                                                                                                                                                                                 }

                                                                                                                                                                                 if (this.N == 0) {
                                                                                                                                                                                    this.N = 1;
                                                                                                                                                                                    this.b(var1);
                                                                                                                                                                                    return;
                                                                                                                                                                                 }

                                                                                                                                                                                 if (this.N == 1) {
                                                                                                                                                                                    this.N = 2;
                                                                                                                                                                                    this.a(var1, var2, var3);
                                                                                                                                                                                 }

                                                                                                                                                                                 return;
                                                                                                                                                                              }

                                                                                                                                                                              if (this.N == 0) {
                                                                                                                                                                                 this.N = 1;
                                                                                                                                                                                 this.b(var1);
                                                                                                                                                                                 return;
                                                                                                                                                                              }

                                                                                                                                                                              if (this.N == 1) {
                                                                                                                                                                                 this.N = 2;
                                                                                                                                                                                 this.a(var1, var2, var3);
                                                                                                                                                                              }

                                                                                                                                                                              return;
                                                                                                                                                                           }

                                                                                                                                                                           if (this.N == 0) {
                                                                                                                                                                              this.N = 1;
                                                                                                                                                                              this.b(var1);
                                                                                                                                                                              return;
                                                                                                                                                                           }

                                                                                                                                                                           if (this.N == 1) {
                                                                                                                                                                              this.N = 2;
                                                                                                                                                                              this.a(var1, var2, var3);
                                                                                                                                                                           }

                                                                                                                                                                           return;
                                                                                                                                                                        }

                                                                                                                                                                        if (this.N == 0) {
                                                                                                                                                                           this.N = 1;
                                                                                                                                                                           this.b(var1);
                                                                                                                                                                           return;
                                                                                                                                                                        }

                                                                                                                                                                        if (this.N == 1) {
                                                                                                                                                                           this.N = 2;
                                                                                                                                                                           this.a(var1, var2, var3);
                                                                                                                                                                        }

                                                                                                                                                                        return;
                                                                                                                                                                     }

                                                                                                                                                                     if (this.N == 0) {
                                                                                                                                                                        this.N = 1;
                                                                                                                                                                        this.b(var1);
                                                                                                                                                                        return;
                                                                                                                                                                     }

                                                                                                                                                                     if (this.N == 1) {
                                                                                                                                                                        this.N = 2;
                                                                                                                                                                        this.a(var1, var2, var3);
                                                                                                                                                                     }

                                                                                                                                                                     return;
                                                                                                                                                                  }

                                                                                                                                                                  if (this.N == 0) {
                                                                                                                                                                     this.N = 1;
                                                                                                                                                                     this.b(var1);
                                                                                                                                                                     return;
                                                                                                                                                                  }

                                                                                                                                                                  if (this.N == 1) {
                                                                                                                                                                     this.N = 2;
                                                                                                                                                                     this.a(var1, var2, var3);
                                                                                                                                                                  }

                                                                                                                                                                  return;
                                                                                                                                                               }

                                                                                                                                                               if (this.N == 0) {
                                                                                                                                                                  this.N = 1;
                                                                                                                                                                  this.b(var1);
                                                                                                                                                                  return;
                                                                                                                                                               }

                                                                                                                                                               if (this.N == 1) {
                                                                                                                                                                  this.N = 2;
                                                                                                                                                                  this.a(var1, var2, var3);
                                                                                                                                                               }

                                                                                                                                                               return;
                                                                                                                                                            }

                                                                                                                                                            if (this.N == 0) {
                                                                                                                                                               this.N = 1;
                                                                                                                                                               this.b(var1);
                                                                                                                                                               return;
                                                                                                                                                            }

                                                                                                                                                            if (this.N == 1) {
                                                                                                                                                               this.N = 2;
                                                                                                                                                               this.a(var1, var2, var3);
                                                                                                                                                            }

                                                                                                                                                            return;
                                                                                                                                                         }

                                                                                                                                                         if (this.N == 0) {
                                                                                                                                                            this.N = 1;
                                                                                                                                                            this.b(var1);
                                                                                                                                                            return;
                                                                                                                                                         }

                                                                                                                                                         if (this.N == 1) {
                                                                                                                                                            this.N = 2;
                                                                                                                                                            this.a(var1, var2, var3);
                                                                                                                                                         }

                                                                                                                                                         return;
                                                                                                                                                      }

                                                                                                                                                      if (this.N == 0) {
                                                                                                                                                         this.N = 1;
                                                                                                                                                         this.b(var1);
                                                                                                                                                         return;
                                                                                                                                                      }

                                                                                                                                                      if (this.N == 1) {
                                                                                                                                                         this.N = 2;
                                                                                                                                                         this.a(var1, var2, var3);
                                                                                                                                                      }

                                                                                                                                                      return;
                                                                                                                                                   }

                                                                                                                                                   if (this.N == 0) {
                                                                                                                                                      this.N = 1;
                                                                                                                                                      this.b(var1);
                                                                                                                                                      return;
                                                                                                                                                   }

                                                                                                                                                   if (this.N == 1) {
                                                                                                                                                      this.N = 2;
                                                                                                                                                      this.a(var1, var2, var3);
                                                                                                                                                   }

                                                                                                                                                   return;
                                                                                                                                                }

                                                                                                                                                if (this.N == 0) {
                                                                                                                                                   this.N = 1;
                                                                                                                                                   this.b(var1);
                                                                                                                                                   return;
                                                                                                                                                }

                                                                                                                                                if (this.N == 1) {
                                                                                                                                                   this.N = 2;
                                                                                                                                                   this.a(var1, var2, var3);
                                                                                                                                                }

                                                                                                                                                return;
                                                                                                                                             }

                                                                                                                                             if (this.N == 0) {
                                                                                                                                                this.N = 1;
                                                                                                                                                this.b(var1);
                                                                                                                                                return;
                                                                                                                                             }

                                                                                                                                             if (this.N == 1) {
                                                                                                                                                this.N = 2;
                                                                                                                                                this.a(var1, var2, var3);
                                                                                                                                             }

                                                                                                                                             return;
                                                                                                                                          }

                                                                                                                                          if (this.N == 0) {
                                                                                                                                             this.N = 1;
                                                                                                                                             this.b(var1);
                                                                                                                                             return;
                                                                                                                                          }

                                                                                                                                          if (this.N == 1) {
                                                                                                                                             this.N = 2;
                                                                                                                                             this.a(var1, var2, var3);
                                                                                                                                          }

                                                                                                                                          return;
                                                                                                                                       }

                                                                                                                                       if (this.N == 0) {
                                                                                                                                          this.N = 1;
                                                                                                                                          this.b(var1);
                                                                                                                                          return;
                                                                                                                                       }

                                                                                                                                       if (this.N == 1) {
                                                                                                                                          this.N = 2;
                                                                                                                                          this.a(var1, var2, var3);
                                                                                                                                       }

                                                                                                                                       return;
                                                                                                                                    }

                                                                                                                                    if (this.N == 0) {
                                                                                                                                       this.N = 1;
                                                                                                                                       this.b(var1);
                                                                                                                                       return;
                                                                                                                                    }

                                                                                                                                    if (this.N == 1) {
                                                                                                                                       this.N = 2;
                                                                                                                                       this.a(var1, var2, var3);
                                                                                                                                    }

                                                                                                                                    return;
                                                                                                                                 }

                                                                                                                                 if (this.N == 0) {
                                                                                                                                    this.N = 1;
                                                                                                                                    this.b(var1);
                                                                                                                                    return;
                                                                                                                                 }

                                                                                                                                 if (this.N == 1) {
                                                                                                                                    this.N = 2;
                                                                                                                                    this.a(var1, var2, var3);
                                                                                                                                 }

                                                                                                                                 return;
                                                                                                                              }

                                                                                                                              if (this.N == 0) {
                                                                                                                                 this.N = 1;
                                                                                                                                 this.b(var1);
                                                                                                                                 return;
                                                                                                                              }

                                                                                                                              if (this.N == 1) {
                                                                                                                                 this.N = 2;
                                                                                                                                 this.a(var1, var2, var3);
                                                                                                                              }

                                                                                                                              return;
                                                                                                                           }

                                                                                                                           if (this.N == 0) {
                                                                                                                              this.N = 1;
                                                                                                                              this.b(var1);
                                                                                                                              return;
                                                                                                                           }

                                                                                                                           if (this.N == 1) {
                                                                                                                              this.N = 2;
                                                                                                                              this.a(var1, var2, var3);
                                                                                                                           }

                                                                                                                           return;
                                                                                                                        }

                                                                                                                        if (this.N == 0) {
                                                                                                                           this.N = 1;
                                                                                                                           this.b(var1);
                                                                                                                           return;
                                                                                                                        }

                                                                                                                        if (this.N == 1) {
                                                                                                                           this.N = 2;
                                                                                                                           this.a(var1, var2, var3);
                                                                                                                        }

                                                                                                                        return;
                                                                                                                     }

                                                                                                                     if (this.N == 0) {
                                                                                                                        this.N = 1;
                                                                                                                        this.b(var1);
                                                                                                                        return;
                                                                                                                     }

                                                                                                                     if (this.N == 1) {
                                                                                                                        this.N = 2;
                                                                                                                        this.a(var1, var2, var3);
                                                                                                                     }

                                                                                                                     return;
                                                                                                                  }

                                                                                                                  if (this.N == 0) {
                                                                                                                     this.N = 1;
                                                                                                                     this.b(var1);
                                                                                                                     return;
                                                                                                                  }

                                                                                                                  if (this.N == 1) {
                                                                                                                     this.N = 2;
                                                                                                                     this.a(var1, var2, var3);
                                                                                                                     return;
                                                                                                                  }

                                                                                                                  return;
                                                                                                               }

                                                                                                               if (this.N == 0) {
                                                                                                                  this.N = 1;
                                                                                                                  this.b(var1);
                                                                                                                  return;
                                                                                                               }

                                                                                                               if (this.N == 1) {
                                                                                                                  this.N = 2;
                                                                                                                  this.a(var1, var2, var3);
                                                                                                               }

                                                                                                               return;
                                                                                                            }

                                                                                                            if (this.N == 0) {
                                                                                                               this.N = 1;
                                                                                                               this.b(var1);
                                                                                                               return;
                                                                                                            }

                                                                                                            if (this.N == 1) {
                                                                                                               this.N = 2;
                                                                                                               this.a(var1, var2, var3);
                                                                                                            }

                                                                                                            return;
                                                                                                         }

                                                                                                         if (this.N == 0) {
                                                                                                            this.N = 1;
                                                                                                            this.b(var1);
                                                                                                            return;
                                                                                                         }

                                                                                                         if (this.N == 1) {
                                                                                                            this.N = 2;
                                                                                                            this.a(var1, var2, var3);
                                                                                                         }

                                                                                                         return;
                                                                                                      }

                                                                                                      if (this.N == 0) {
                                                                                                         this.N = 1;
                                                                                                         this.b(var1);
                                                                                                         return;
                                                                                                      }

                                                                                                      if (this.N == 1) {
                                                                                                         this.N = 2;
                                                                                                         this.a(var1, var2, var3);
                                                                                                      }

                                                                                                      return;
                                                                                                   }

                                                                                                   if (this.N == 0) {
                                                                                                      this.N = 1;
                                                                                                      this.b(var1);
                                                                                                   } else if (this.N == 1) {
                                                                                                      this.N = 2;
                                                                                                      this.a(var1, var2, var3);
                                                                                                   }

                                                                                                   return;
                                                                                                }

                                                                                                if (this.N == 0) {
                                                                                                   this.N = 1;
                                                                                                   this.b(var1);
                                                                                                   return;
                                                                                                }

                                                                                                if (this.N == 1) {
                                                                                                   this.N = 2;
                                                                                                   this.a(var1, var2, var3);
                                                                                                }

                                                                                                return;
                                                                                             }

                                                                                             if (this.N == 0) {
                                                                                                this.N = 1;
                                                                                                this.b(var1);
                                                                                                return;
                                                                                             }

                                                                                             if (this.N == 1) {
                                                                                                this.N = 2;
                                                                                                this.a(var1, var2, var3);
                                                                                             }

                                                                                             return;
                                                                                          }

                                                                                          if (this.N == 0) {
                                                                                             this.N = 1;
                                                                                             this.b(var1);
                                                                                             return;
                                                                                          }

                                                                                          if (this.N == 1) {
                                                                                             this.N = 2;
                                                                                             this.a(var1, var2, var3);
                                                                                          }

                                                                                          return;
                                                                                       }

                                                                                       if (this.N == 0) {
                                                                                          this.N = 1;
                                                                                          this.b(var1);
                                                                                          return;
                                                                                       }

                                                                                       if (this.N == 1) {
                                                                                          this.N = 2;
                                                                                          this.a(var1, var2, var3);
                                                                                       }

                                                                                       return;
                                                                                    }

                                                                                    if (this.N == 0) {
                                                                                       this.N = 1;
                                                                                       this.b(var1);
                                                                                       return;
                                                                                    }

                                                                                    if (this.N == 1) {
                                                                                       this.N = 2;
                                                                                       this.a(var1, var2, var3);
                                                                                    }

                                                                                    return;
                                                                                 }

                                                                                 if (this.N == 0) {
                                                                                    this.N = 1;
                                                                                    this.b(var1);
                                                                                    return;
                                                                                 }

                                                                                 if (this.N == 1) {
                                                                                    this.N = 2;
                                                                                    this.a(var1, var2, var3);
                                                                                 }

                                                                                 return;
                                                                              }

                                                                              if (this.N == 0) {
                                                                                 this.N = 1;
                                                                                 this.b(var1);
                                                                                 return;
                                                                              }

                                                                              if (this.N == 1) {
                                                                                 this.N = 2;
                                                                                 this.a(var1, var2, var3);
                                                                              }

                                                                              return;
                                                                           }

                                                                           if (this.N == 0) {
                                                                              this.N = 1;
                                                                              this.b(var1);
                                                                              return;
                                                                           }

                                                                           if (this.N == 1) {
                                                                              this.N = 2;
                                                                              this.a(var1, var2, var3);
                                                                           }

                                                                           return;
                                                                        }

                                                                        if (this.N == 0) {
                                                                           this.N = 1;
                                                                           this.b(var1);
                                                                           return;
                                                                        }

                                                                        if (this.N == 1) {
                                                                           this.N = 2;
                                                                           this.a(var1, var2, var3);
                                                                        }

                                                                        return;
                                                                     }

                                                                     if (this.N == 0) {
                                                                        this.N = 1;
                                                                        this.b(var1);
                                                                        return;
                                                                     }

                                                                     if (this.N == 1) {
                                                                        this.N = 2;
                                                                        this.a(var1, var2, var3);
                                                                     }

                                                                     return;
                                                                  }

                                                                  if (this.N == 0) {
                                                                     this.N = 1;
                                                                     this.b(var1);
                                                                     return;
                                                                  }

                                                                  if (this.N == 1) {
                                                                     this.N = 2;
                                                                     this.a(var1, var2, var3);
                                                                  }

                                                                  return;
                                                               }

                                                               if (this.N == 0) {
                                                                  this.N = 1;
                                                                  this.b(var1);
                                                                  return;
                                                               }

                                                               if (this.N == 1) {
                                                                  this.N = 2;
                                                                  this.a(var1, var2, var3);
                                                               }

                                                               return;
                                                            }

                                                            if (this.N == 0) {
                                                               this.N = 1;
                                                               this.b(var1);
                                                               return;
                                                            }

                                                            if (this.N == 1) {
                                                               this.N = 2;
                                                               this.a(var1, var2, var3);
                                                            }

                                                            return;
                                                         }

                                                         if (this.N == 0) {
                                                            this.N = 1;
                                                            this.b(var1);
                                                            return;
                                                         }

                                                         if (this.N == 1) {
                                                            this.N = 2;
                                                            this.a(var1, var2, var3);
                                                         }

                                                         return;
                                                      }

                                                      if (this.N == 0) {
                                                         this.N = 1;
                                                         this.b(var1);
                                                         return;
                                                      }

                                                      if (this.N == 1) {
                                                         this.N = 2;
                                                         this.a(var1, var2, var3);
                                                      }

                                                      return;
                                                   }

                                                   if (this.N == 0) {
                                                      this.N = 1;
                                                      this.b(var1);
                                                      return;
                                                   }

                                                   if (this.N == 1) {
                                                      this.N = 2;
                                                      this.a(var1, var2, var3);
                                                   }

                                                   return;
                                                }

                                                if (this.N == 0) {
                                                   this.N = 1;
                                                   this.b(var1);
                                                   return;
                                                }

                                                if (this.N == 1) {
                                                   this.N = 2;
                                                   this.a(var1, var2, var3);
                                                }

                                                return;
                                             }

                                             if (this.N == 0) {
                                                this.N = 1;
                                                this.b(var1);
                                                return;
                                             }

                                             if (this.N == 1) {
                                                this.N = 2;
                                                this.a(var1, var2, var3);
                                             }

                                             return;
                                          }

                                          if (this.N == 0) {
                                             this.N = 1;
                                             this.b(var1);
                                             return;
                                          }

                                          if (this.N == 1) {
                                             this.N = 2;
                                             this.a(var1, var2, var3);
                                          }

                                          return;
                                       }

                                       if (this.N == 0) {
                                          this.N = 1;
                                          this.b(var1);
                                          return;
                                       }

                                       if (this.N == 1) {
                                          this.N = 2;
                                          this.a(var1, var2, var3);
                                       }

                                       return;
                                    }

                                    if (this.N == 0) {
                                       this.N = 1;
                                       this.b(var1);
                                       return;
                                    }

                                    if (this.N == 1) {
                                       this.N = 2;
                                       this.a(var1, var2, var3);
                                    }

                                    return;
                                 }

                                 if (this.N == 0) {
                                    this.N = 1;
                                    this.b(var1);
                                    return;
                                 }

                                 if (this.N == 1) {
                                    this.N = 2;
                                    this.a(var1, var2, var3);
                                 }

                                 return;
                              }

                              if (this.N == 0) {
                                 this.N = 1;
                                 this.b(var1);
                                 return;
                              }

                              if (this.N == 1) {
                                 this.N = 2;
                                 this.a(var1, var2, var3);
                              }

                              return;
                           }

                           if (this.N == 0) {
                              this.N = 1;
                              this.b(var1);
                              return;
                           }

                           if (this.N == 1) {
                              this.N = 2;
                              this.a(var1, var2, var3);
                           }

                           return;
                        }

                        if (this.N == 0) {
                           this.N = 1;
                           this.b(var1);
                           return;
                        }

                        if (this.N == 1) {
                           this.N = 2;
                           this.a(var1, var2, var3);
                        }

                        return;
                     }

                     if (this.N == 0) {
                        this.N = 1;
                        this.b(var1);
                        return;
                     }

                     if (this.N == 1) {
                        this.N = 2;
                        this.a(var1, var2, var3);
                     }

                     return;
                  }

                  if (this.N == 0) {
                     this.N = 1;
                     this.b(var1);
                     return;
                  }

                  if (this.N == 1) {
                     this.N = 2;
                     this.a(var1, var2, var3);
                  }

                  return;
               }

               if (this.N == 0) {
                  this.N = 1;
                  this.b(var1);
                  return;
               }

               if (this.N == 1) {
                  this.N = 2;
                  this.a(var1, var2, var3);
               }

               return;
            }

            if (this.N == 0) {
               this.N = 1;
               this.b(var1);
               return;
            }

            if (this.N == 1) {
               this.N = 2;
               this.a(var1, var2, var3);
            }

            return;
         }

         if (this.N == 0) {
            this.N = 1;
            this.b(var1);
            return;
         }

         if (this.N == 1) {
            this.N = 2;
            this.a(var1, 0, 0);
         }

         return;
      }

      if (this.N == 0) {
         this.N = 1;
         this.b(var1);
      } else if (this.N == 1) {
         this.N = 2;
         this.a(var1, var2, var3);
      }
   }

   public final void a(vdtt_hi var1, int var2, int var3) {
      if (!this.c && !this.d && (var1.j == null || !(var1.j instanceof vdtt_hr))) {
         this.a.a(var1.b, this.L, this);
         if (var1.b >= 1020 && var1.b < 1030) {
            return;
         }

         switch(this.H) {
         case -91:
            return;
         case -16:
         case -15:
         case 73:
         case 552:
         case 572:
         case 684:
         case 715:
         case 722:
         case 723:
         case 724:
         case 725:
            vdtt_aa.gI().o();
            return;
         case -13:
         case -12:
         case 17:
            vdtt_aa.gI().n();
            return;
         case -11:
         case 91:
            vdtt_aa.gI().w();
            return;
         case 6:
            vdtt_aa.gI().x();
            return;
         default:
            vdtt_aa.gI().n();
         }
      }

   }

   public Vector g() {
      Vector var1 = new Vector();
      if (!this.c && !this.d) {
         if (this.H != -15 && this.H != 552 && this.H != 572 && this.H != 73 && this.H != 82) {
            GameSrc var2;
            if (this.H != -12 && this.H != -13 && this.H != 460 && this.H != 557 && ((var2 = GameSrc.gI()).dt == null || var2.dt.b == null || !var2.dt.b.contains(this)) && !this.equals(GameSrc.gI().aP)) {
               var1.addElement(new vdtt_hi(this.m, 0, 0, this.width, this.height, (vdtt_hp)null, this));
            } else {
               var1.addElement(new vdtt_hi(this.m, -2, -2, this.width + 1, this.height + 2, (vdtt_hp)null, this));
            }
         } else {
            var1.addElement(new vdtt_hi(this.m, 0, 0, Utlis.n(this.width), Utlis.n(this.height), (vdtt_hp)null, this));
         }
      }

      return var1;
   }

   public final boolean d() {
      if (!this.c && !this.d) {
         if (this.N == 1) {
            return true;
         } else {
            return this.M ? true : this.e(0);
         }
      } else {
         return false;
      }
   }

   public static int f() {
      switch(Char.gI().m) {
      case 0:
         return 722;
      case 1:
      default:
         return 0;
      case 2:
         return 723;
      case 3:
         return 724;
      case 4:
         return Char.gI().giatoc != null && Char.gI().giatoc.d > 0 ? Char.gI().giatoc.d : 725;
      }
   }
}

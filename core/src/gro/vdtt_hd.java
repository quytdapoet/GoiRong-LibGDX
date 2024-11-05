package gro;

public final class vdtt_hd extends Entity {
   private int l = 40;
   private int m;
   private int n;
   public Char k;
   private int o;
   private int p;
   private int H;
   private vdtt_hf I;
   private vdtt_hf J;
   private vdtt_hf K;
   private vdtt_hf L;
   private boolean M;
   private int N;
   private int O;
   private boolean P;
   private boolean Q;
   private boolean R;
   private int S = 200;

   public vdtt_hd(int var1, Char var2, int var3) {
      var2.bC = true;
      this.m = var1;
      this.n = var3;
      this.k = var2;
      var2.S();
      this.setXY(var2.cx, -50);
      this.status = 2;
      this.dir = 0;
      XYEntity var4;
      if ((var4 = Char.b(var2.cx, var2.cy)) != null && var1 == 1) {
         this.p = this.H = var4.cy - 1;
      } else {
         this.p = this.H = var2.cy - 1;
      }

      this.N = this.l;
      switch(var3) {
      case 1:
         this.O = 22;
         this.I = new vdtt_hf(369, 0, 0, -1);
         this.J = new vdtt_hf(369, 0, 0, -1);
         this.K = new vdtt_hf(370, 0, 0, -1);
         break;
      case 2:
         this.O = 26;
         this.I = new vdtt_hf(367, 0, 0, -1);
         this.J = new vdtt_hf(367, 0, 0, -1);
         this.K = new vdtt_hf(368, 0, 0, -1);
         break;
      case 3:
         this.O = 28;
         this.I = new vdtt_hf(363, 0, 0, -1);
         this.J = new vdtt_hf(373, 0, 0, -1);
         this.K = new vdtt_hf(364, 0, 0, -1);
         break;
      case 4:
         this.O = 20;
         this.I = new vdtt_hf(361, 0, 0, -1);
         this.J = new vdtt_hf(361, 0, 0, -1);
         this.K = new vdtt_hf(362, 0, 0, -1);
         break;
      case 5:
         this.O = 24;
         this.I = new vdtt_hf(371, 0, 0, -1);
         this.J = new vdtt_hf(371, 0, 0, -1);
         this.K = new vdtt_hf(372, 0, 0, -1);
         break;
      case 6:
         this.O = 18;
         this.I = new vdtt_hf(365, 0, 0, -1);
         this.J = new vdtt_hf(365, 0, 0, -1);
         this.K = new vdtt_hf(366, 0, 0, -1);
         break;
      case 7:
         this.O = 26;
         this.I = new vdtt_hf(359, 0, 0, -1);
         this.J = new vdtt_hf(359, 0, 0, -1);
         this.K = new vdtt_hf(360, 0, 0, -1);
      }

      this.I.J = this.J.J = this.K.J = true;
      if (var2.p()) {
         SettingsTab.K().a(false);
         GameSrc.gI().i(500);
      }

   }

   public final int minX() {
      return this.cx - this.width / 2;
   }

   public final int maxX() {
      return this.cx + this.width / 2;
   }

   public final int minY() {
      return this.cy - this.height / 2;
   }

   public final int maxY() {
      return this.cy + this.height / 2;
   }

   public final boolean m() {
      if (this.M && this.k.p()) {
         this.k.bB = false;
         if (this.m == 1) {
            Canvas.isReload = true;
            DataCenter.gI().aQ = false;
            GameSrc.gI().J();
            GameSrc.N = Utlis.a();
            vdtt_aa.gI().f();
            (new Message((byte)-61)).send();
         }
      }

      if (this.M) {
         this.k.bC = false;
      }

      return this.M;
   }

   public final void n() {
      --this.S;
      if (this.S < 0) {
         this.M = true;
      }

      switch(this.status) {
      case 0:
         this.dir = 1;
         if (this.m == 0) {
            --this.N;
            if (this.N == this.l - 10) {
               this.k.bB = false;
               if (this.k.p()) {
                  GameSrc.gI().L();
               }
            }

            if (this.N == 0) {
               this.status = 2;
            }
         } else if (GameSrc.gI().mapID != 67 && this.k.cy != 288 && (this.k.cx != this.cx - 25 || this.k.cy != this.cy + 1)) {
            if (this.N > this.l - 11) {
               --this.N;
            }

            if (this.N == this.l - 10) {
               this.k.a((short)(this.cx - 25), (short)(this.cy + 1), true);
            }
         } else {
            --this.N;
            if (this.N == this.l - 30) {
               this.k.bB = true;
            }

            if (this.N == 0) {
               this.status = 2;
            }
         }
         break;
      case 2:
         switch(this.dir) {
         case 0:
            this.o = this.p - this.cy >> 2;
            if (this.o > this.O) {
               this.o = this.O;
            }

            this.cy = (short)(this.cy + this.o);
            if (this.cy > this.p) {
               this.cy = (short)this.p;
            }

            if (this.m == 0) {
               this.k.bB = true;
            }

            if (this.o == 0) {
               if (this.k.p()) {
                  switch(this.n) {
                  case 1:
                     GameSrc.gI().cO = 25;
                     break;
                  case 2:
                     GameSrc.gI().cO = 15;
                     break;
                  case 3:
                     GameSrc.gI().cO = 20;
                     break;
                  case 4:
                     GameSrc.gI().cO = 25;
                     break;
                  case 5:
                     GameSrc.gI().cO = 35;
                  case 6:
                  default:
                     break;
                  case 7:
                     GameSrc.gI().cO = 15;
                  }
               }

               this.status = 0;
               this.setXY(this.cx, this.p);
               this.N = this.l;
               this.p = -100;
            }
            break;
         case 1:
            this.o = this.p - this.cy >> 2;
            if (this.o < -this.O) {
               this.o = -this.O;
            }

            this.cy = (short)(this.cy + this.o);
            if (this.o == 0) {
               this.status = 6;
               this.M = true;
            }
         }
      }

      if (this.cy != this.H) {
         if (this.dir == 1) {
            if (!this.P) {
               this.P = true;
               if (this.k.p()) {
                  vdtt_aa.gI().f(1.0F);
               } else if (this.o()) {
                  vdtt_aa.gI().f(0.5F);
               }
            }

            this.I.a(this);
         } else {
            if (!this.Q) {
               this.Q = true;
               if (this.k.p()) {
                  vdtt_aa.gI().e(1.0F);
               } else if (this.o()) {
                  vdtt_aa.gI().e(0.5F);
               }
            }

            this.J.a(this);
         }

         this.L = null;
      } else {
         if (!this.R) {
            this.R = true;
            if (this.k.p()) {
               vdtt_aa.gI().d(1.0F);
            } else if (this.o()) {
               vdtt_aa.gI().d(0.5F);
            }
         }

         this.K.a(this);
         if (this.L == null) {
            if (this.n == 3 && (GameSrc.gI().mapID != 67 || this.H >= 300)) {
               this.L = new vdtt_hf(439, this.cx, this.H, 1);
            } else {
               this.L = new vdtt_hf(358, this.cx, this.H, 1);
            }
         }

         if (!this.L.p()) {
            this.L.n();
         }
      }

   }

   private boolean o() {
      return GameSrc.gI().cL.size() > 0 && ((vdtt_hd)GameSrc.gI().cL.firstElement()).equals(this);
   }

   public final void paintTop(Graphics var1) {
   }

   public final void paintBottom(Graphics var1) {
   }

   public final int prioritize() {
      return 6;
   }

   public final String strTop() {
      return null;
   }

   public final String strBottom() {
      return null;
   }
}

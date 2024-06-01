package fishing4.game;

import javax.microedition.khronos.opengles.GL10;

import fishing4.a.RGBColor;

public final class i {
   public static int b;
   public static boolean c;
   private static fishing4.a.e m;
   private float A;
   private int B;
   private final float C = 30.0F;
   private fishing4.a.w D;
   private fishing4.a.w E;
   private boolean F;
   private boolean G;
   private boolean H;
   private boolean I;
   private boolean J;
   private long K;
   private long L;
   private final long M = 20000L;
   private final int N = 500;
   private int O;
   private final int P = 2;
   private final float Q = 50.0F;
   public fishing4.a.o a;
   private bi d;
   private int e;
   private int f;
   private aj g;
   private int h;
   private int i;
   private long j;
   private long k;
   private final float l = 1500.0F;
   private long n;
   private boolean o;
   private fishing4.a.e p;
   private final float q = 500.0F;
   private int r;
   private int s;
   private float t;
   private float u;
   private float v;
   private float w;
   private float x;
   private float y;
   private float z;

   private i(GL10 var1, int var2) {
      this.d = bi.a(var1, fishing4.a.m.getWidthPixels() / 128 + 2, fishing4.a.m.getHeightPixels() / 128 + 2, fishing4.a.f.a(fishing4.a.e.a(), fishing4.a.h.a((float)fishing4.a.m.getWidthPixels(), (float)fishing4.a.m.getHeightPixels())));
      this.f = 0;
      this.e = 0;
      b = var2;
      this.g = aj.a(fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels());
      this.g.c = fishing4.a.z.a(4) + 0;
      this.g.d = 1.0F;
      this.h = 0;
      this.i = fishing4.game.m.d(b);
      this.j = fishing4.a.y.a();
      this.k = fishing4.a.y.a();
      this.a = fishing4.a.o.a(fishing4.a.e.a(OptionsManager.k, OptionsManager.l));
      m = fishing4.a.e.a(fishing4.a.m.getHalfWidthPixels(), 0.0F);
      this.n = 0L;
      this.o = false;
      this.p = fishing4.a.e.a();
      this.r = 0;
      this.s = 0;
      float var3 = (float)(fishing4.game.x.g() + ac.l(ad.b(3)));
      this.x = var3;
      this.t = var3;
      var3 = (float)fishing4.game.m.j(b);
      this.y = var3;
      this.u = var3;
      var3 = (float)(fishing4.game.m.k(b) * (ac.k(ad.b(4)) + 100) / 100);
      this.A = var3;
      this.w = var3;
      this.v = 0.0F;
      this.z = (float)ac.i(ad.b(2));
      this.B = 0;
      c = false;
      this.D = fishing4.a.w.a(var1, "img/battle/pause0.png");
      this.E = fishing4.a.w.a(var1, "img/battle/pause1.png");
      this.F = false;
      this.G = false;
      this.H = false;
      this.I = false;
      this.J = false;
      this.K = 0L;
      this.L = System.currentTimeMillis();
      this.O = 0;
   }

   public static i a(GL10 var0, int var1) {
      return new i(var0, var1);
   }

   public static void a() {
      // $FF: Couldn't be decompiled
   }

   private static void c() {
      // $FF: Couldn't be decompiled
   }

   public final void a(fishing4.a.e var1) {
      if (!bh.a() || bh.a == 51) {
         if (this.a.b == -1 && (float)(fishing4.a.y.a() - this.n) < 500.0F) {
            this.o = true;
            if (c && fishing4.a.e.d(var1, this.p) < this.a.c()) {
               this.a.b(fishing4.a.e.a(132.0F, 120.0F));
               OptionsManager.j = 1.0F;
            }
         } else {
            this.o = false;
         }

         this.n = fishing4.a.y.a();
         this.p.a(var1);
         this.a.d();
      }

   }

   public final void a(GL10 var1) {
      this.d.a(var1);
      this.d = null;
      this.a.a();
      this.a = null;
      this.g.a();
      this.g = null;
      m = null;
      fishing4.a.w.a(var1, this.D);
      this.D = null;
      fishing4.a.w.a(var1, this.E);
      this.E = null;
   }

   public final void a(GL10 var1, fishing4.a.w var2, fishing4.a.w var3, fishing4.a.w var4, fishing4.a.w var5, fishing4.a.w var6, int var7) {
      if (c) {
         this.d.a(var1, 0, 0, var7);
      } else {
         this.d.a(var1, this.e, this.f, var7);
      }

      float var8;
      int var9;
      if (!bh.a() || bh.a == 51 || bh.a >= 44 && bh.a <= 46) {
         boolean var10;
         aj var11;
         switch (this.h) {
            case 0:
               var11 = this.g;
               if (c) {
                  var10 = false;
               } else {
                  var10 = true;
               }

               var11.a(var1, var2, var7, var10);
            case 1:
            default:
               break;
            case 2:
               if (fishing4.a.y.a() - this.k > 500L) {
                  this.g.c();
                  this.k = fishing4.a.y.a();
               }

               if (this.g.d > 1.0F) {
                  this.g.d *= 0.9F;
               } else {
                  this.g.d *= 1.1F;
               }

               var11 = this.g;
               if (c) {
                  var10 = false;
               } else {
                  var10 = true;
               }

               var11.a(var1, var2, var7, var10);
         }

         if (this.h == 0) {
            var8 = this.g.h + 180.0F;
            if (av.a == 3) {
               fishing4.a.m.a(var1, var5, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), (float)(this.r % 3 * 252), (float)(this.r / 3 * 240), 252.0F, 240.0F, fishing4.a.g.a(), '\u0005', RGBColor.getColor(1.0F, 1.0F, 1.0F, 0.75F), fishing4.a.d.a(0.533F, 0.99F, var8));
               fishing4.a.m.a(var1, var3, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 1.0F, 1.0F, 160.0F, 160.0F, '\u0002', fishing4.a.d.a(0.5F, 1.24F, var8));
               this.r = (this.r + 1) % 6;
            } else {
               fishing4.a.m.a(var1, var3, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 322.0F, 87.0F, 66.0F, 66.0F, '\u0001', fishing4.a.d.a(0.5F, 2.25F, var8));
            }
         } else if (this.h == 1) {
            var9 = this.s / 2;
            if (var9 == 0) {
               fishing4.a.m.a(var1, var4, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 104.0F, 138.0F, 26.0F, 42.0F, '\u0002', fishing4.a.d.a(this.g.h));
            } else if (var9 == 1) {
               fishing4.a.m.a(var1, var4, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 104.0F, 185.0F, 24.0F, 28.0F, '\u0002', fishing4.a.d.a(this.g.h));
            } else if (var9 % 2 == 0) {
               fishing4.a.m.a(var1, var4, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 100.0F, 216.0F, 38.0F, 38.0F, fishing4.a.g.a(), '\u0002');
            } else {
               fishing4.a.m.a(var1, var4, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 100.0F, 216.0F, 38.0F, 38.0F, fishing4.a.g.a(0.8F), '\u0002');
            }

            switch (var9 % 5) {
               case 0:
                  fishing4.a.m.a(var1, var4, fishing4.a.e.a(fishing4.a.m.getHalfWidthPixels() - 100.0F, fishing4.a.m.getHalfHeightPixels()), fishing4.a.f.a(2.0F, 103.0F, 12.0F, 72.0F), fishing4.a.d.a(0.0F, 0.6F));
                  fishing4.a.m.a(var1, var4, fishing4.a.m.getHalfWidthPixels() + 100.0F, fishing4.a.m.getHalfHeightPixels(), 2.0F, 103.0F, 12.0F, 72.0F, fishing4.a.g.b(), fishing4.a.d.a(1.0F, 0.6F));
                  break;
               case 1:
                  fishing4.a.m.a(var1, var4, fishing4.a.e.a(fishing4.a.m.getHalfWidthPixels() - 50.0F, fishing4.a.m.getHalfHeightPixels()), fishing4.a.f.a(15.0F, 103.0F, 85.0F, 72.0F), fishing4.a.d.a(0.0F, 0.6F));
                  fishing4.a.m.a(var1, var4, fishing4.a.m.getHalfWidthPixels() + 50.0F, fishing4.a.m.getHalfHeightPixels(), 15.0F, 103.0F, 85.0F, 72.0F, fishing4.a.g.b(), fishing4.a.d.a(1.0F, 0.6F));
                  break;
               case 2:
                  fishing4.a.m.a(var1, var4, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 102.0F, 103.0F, 56.0F, 32.0F, '\u0005', 128);
                  fishing4.a.m.a(var1, var4, fishing4.a.e.a(fishing4.a.m.getHalfWidthPixels() - 50.0F, fishing4.a.m.getHalfHeightPixels()), fishing4.a.f.a(0.0F, 177.0F, 85.0F, 74.0F), fishing4.a.d.a(0.0F, 0.6F));
                  fishing4.a.m.a(var1, var4, fishing4.a.m.getHalfWidthPixels() + 50.0F, fishing4.a.m.getHalfHeightPixels(), 0.0F, 177.0F, 85.0F, 74.0F, fishing4.a.g.b(), fishing4.a.d.a(1.0F, 0.6F));
                  break;
               case 3:
                  fishing4.a.m.a(var1, var4, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 168.0F, 92.0F, 88.0F, 52.0F, '\u0005', 128);
                  break;
               case 4:
                  fishing4.a.m.a(var1, var4, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 122.0F, 0.0F, 134.0F, 92.0F, '\u0005', 128);
            }

            ++this.s;
         } else {
            switch (this.s / 2) {
               case 0:
                  fishing4.a.m.a(var1, var4, fishing4.a.m.e(), fishing4.a.f.a(0.0F, 0.0F, 121.0F, 101.0F), fishing4.a.d.a(0.25F, 0.25F));
                  break;
               case 1:
                  fishing4.a.m.a(var1, var4, fishing4.a.m.e(), fishing4.a.f.a(142.0F, 144.0F, 114.0F, 112.0F), fishing4.a.d.a(0.25F, 0.75F));
                  break;
               case 2:
                  fishing4.a.m.a(var1, var4, fishing4.a.m.e(), fishing4.a.f.a(0.0F, 0.0F, 121.0F, 101.0F), fishing4.a.d.a(0.25F, 0.25F, 180.0F));
                  break;
               case 3:
                  fishing4.a.m.a(var1, var4, fishing4.a.m.e(), fishing4.a.f.a(142.0F, 144.0F, 114.0F, 112.0F), fishing4.a.d.a(0.25F, 0.75F, 180.0F));
            }

            this.s = (this.s + 1) % 8;
         }

         fishing4.a.e var12;
         if (this.h == 1) {
            var12 = fishing4.a.m.e();
         } else {
            var12 = this.g.g;
         }

         fishing4.a.m.a(var1, m, var12, RGBColor.white());
      }

      if (globalConfig.j) {
         fishing4.a.m.a(var1, var6, fishing4.a.m.getHalfWidthPixels(), (float)(fishing4.a.m.getHeightPixels() - globalConfig.k / 2), fishing4.a.g.c((float) globalConfig.k / var6.c.b));
      }

      var8 = (float)fishing4.a.m.getHeightPixels();
      if (globalConfig.j) {
         var8 -= (float) globalConfig.k;
      }

      fishing4.a.m.a(var1, var3, 223.0F, var8 - 42.0F, 0.0F, 164.0F, 446.0F, 84.0F, '\b');
      if (bh.a() && bh.a != 51) {
         if (bh.a == 40) {
            if (bh.b % 20 < 10 && !be.a) {
               fishing4.a.m.a(var1, var3, 7.0F, var8 - 5.0F, 0.0F, 408.0F, 262.0F, 18.0F, '\b', fishing4.a.d.a(1.0F, 0.0F));
            }
         } else if (bh.a == 41) {
            if (bh.b % 20 < 10 && !be.a) {
               fishing4.a.m.a(var1, var3, 7.0F, var8 - 27.0F, 0.0F, 430.0F, 248.0F, 18.0F, '\b', fishing4.a.d.a(1.0F, 0.0F));
            }
         } else if (bh.a == 42) {
            if (bh.b % 20 < 10 && !be.a) {
               fishing4.a.m.a(var1, var3, 7.0F, var8 - 49.0F, 0.0F, 452.0F, 190.0F, 18.0F, '\b', fishing4.a.d.a(1.0F, 0.0F));
            }
         } else if (bh.a == 43) {
            if (bh.b % 20 < 10 && !be.a) {
               fishing4.a.m.a(var1, var3, 86.0F, var8 - 4.0F - 0.0F, 0.0F, 334.0F, 330.0F, 72.0F, '\b', fishing4.a.d.a(1.0F, 0.0F));
            }
         } else if (bh.a == 44) {
            if (bh.b == 0) {
               this.h = 0;
               this.g.d = 1.0F;
               this.s = 0;
            }
         } else if (bh.a == 45) {
            if (bh.b == 0) {
               this.h = 1;
            }
         } else if (bh.a == 46 && bh.b == 0) {
            this.h = 2;
            this.g.d = 1.0F;
            this.s = 0;
         }
      } else {
         var9 = (int)((this.x - this.t) * 262.0F / this.x);
         fishing4.a.m.a(var1, var3, (float)(262 - var9 + 7), var8 - 5.0F, (float)(262 - var9), 408.0F, (float)var9, 18.0F, '\b', fishing4.a.d.a(1.0F, 0.0F));
         var9 = (int)((this.y - this.u) * 248.0F / this.y);
         fishing4.a.m.a(var1, var3, (float)(248 - var9 + 7), var8 - 27.0F, (float)(248 - var9), 430.0F, (float)var9, 18.0F, '\b', fishing4.a.d.a(1.0F, 0.0F));
         var9 = (int)((this.A - this.w) * 190.0F / this.A);
         fishing4.a.m.a(var1, var3, (float)(190 - var9 + 7), var8 - 49.0F, (float)(190 - var9), 452.0F, (float)var9, 18.0F, '\b', fishing4.a.d.a(1.0F, 0.0F));
         if (this.z == -1.0F) {
            fishing4.a.m.a(var1, var3, 86.0F, var8 - 4.0F - 72.0F, 0.0F, 406.0F, 330.0F, 0.0F, '\b', fishing4.a.d.a(1.0F, 0.0F));
         } else {
            var9 = (int)(this.v * 72.0F / this.z);
            if (this.v == this.z && var7 / 5 % 2 == 0) {
               fishing4.a.m.a(var1, var3, 86.0F, var8 - 4.0F - (float)(72 - var9), 0.0F, (float)(406 - var9), 330.0F, (float)var9, fishing4.a.g.a(), '\u0000', RGBColor.getColor(1.0F, 0.5F, 0.5F, 1.0F), fishing4.a.d.a(1.0F, 0.0F));
            } else {
               fishing4.a.m.a(var1, var3, 86.0F, var8 - 4.0F - (float)(72 - var9), 0.0F, (float)(406 - var9), 330.0F, (float)var9, '\b', fishing4.a.d.a(1.0F, 0.0F));
            }
         }
      }

      if (this.B > 0) {
         if (this.B > 0 && (float)this.B <= 10.0F) {
            fishing4.a.m.a(var1, var3, 9.0F, var8 - 70.0F, 237.0F, 472.0F, 8.0F, 8.0F, '\b', fishing4.a.d.a(1.0F, 0.0F));
         } else if ((float)this.B > 10.0F && (float)this.B <= 20.0F) {
            fishing4.a.m.a(var1, var3, 9.0F, var8 - 70.0F, 237.0F, 472.0F, 16.0F, 8.0F, '\b', fishing4.a.d.a(1.0F, 0.0F));
         } else {
            fishing4.a.m.a(var1, var3, 9.0F, var8 - 70.0F, 237.0F, 472.0F, 24.0F, 8.0F, '\b', fishing4.a.d.a(1.0F, 0.0F));
         }
      }

      switch (var7 / 4 % 6) {
         case 0:
            fishing4.a.m.a(var1, var3, 27.0F, var8 - 5.0F - 9.0F, 332.0F, 382.0F, 22.0F, 18.0F, '\u0001', 175);
            fishing4.a.m.a(var1, var3, 31.0F, var8 - 27.0F - 10.0F, 403.0F, 382.0F, 26.0F, 26.0F, '\u0001', 175);
            fishing4.a.m.a(var1, var3, 87.0F, var8 - 49.0F - 7.0F, 332.0F, 334.0F, 164.0F, 14.0F, '\u0001', 175);
            break;
         case 1:
            fishing4.a.m.a(var1, var3, 27.0F, var8 - 5.0F - 9.0F, 356.0F, 382.0F, 22.0F, 18.0F, '\u0001', 175);
            fishing4.a.m.a(var1, var3, 31.0F, var8 - 27.0F - 10.0F, 431.0F, 382.0F, 26.0F, 26.0F, '\u0001', 175);
            fishing4.a.m.a(var1, var3, 87.0F, var8 - 49.0F - 7.0F, 332.0F, 350.0F, 164.0F, 14.0F, '\u0001', 175);
            break;
         case 2:
            fishing4.a.m.a(var1, var3, 27.0F, var8 - 5.0F - 9.0F, 380.0F, 382.0F, 22.0F, 18.0F, '\u0001', 175);
            fishing4.a.m.a(var1, var3, 31.0F, var8 - 27.0F - 10.0F, 459.0F, 382.0F, 26.0F, 26.0F, '\u0001', 175);
            fishing4.a.m.a(var1, var3, 87.0F, var8 - 49.0F - 7.0F, 332.0F, 366.0F, 164.0F, 14.0F, '\u0001', 175);
            break;
         case 3:
            fishing4.a.m.a(var1, var3, 27.0F, var8 - 5.0F - 9.0F, 332.0F, 382.0F, 22.0F, 18.0F, '\u0001', 175);
            fishing4.a.m.b(var1, var3, 31.0F, var8 - 27.0F - 10.0F, 403.0F, 382.0F, 26.0F, 26.0F, fishing4.a.g.c(), 175);
            fishing4.a.m.a(var1, var3, 87.0F, var8 - 49.0F - 7.0F, 332.0F, 334.0F, 164.0F, 14.0F, '\u0001', 175);
            break;
         case 4:
            fishing4.a.m.a(var1, var3, 27.0F, var8 - 5.0F - 9.0F, 356.0F, 382.0F, 22.0F, 18.0F, '\u0001', 175);
            fishing4.a.m.b(var1, var3, 31.0F, var8 - 27.0F - 10.0F, 431.0F, 382.0F, 26.0F, 26.0F, fishing4.a.g.c(), 175);
            fishing4.a.m.a(var1, var3, 87.0F, var8 - 49.0F - 7.0F, 332.0F, 350.0F, 164.0F, 14.0F, '\u0001', 175);
            break;
         case 5:
            fishing4.a.m.a(var1, var3, 27.0F, var8 - 5.0F - 9.0F, 380.0F, 382.0F, 22.0F, 18.0F, '\u0001', 175);
            fishing4.a.m.b(var1, var3, 31.0F, var8 - 27.0F - 10.0F, 459.0F, 382.0F, 26.0F, 26.0F, fishing4.a.g.c(), 175);
            fishing4.a.m.a(var1, var3, 87.0F, var8 - 49.0F - 7.0F, 332.0F, 366.0F, 164.0F, 14.0F, '\u0001', 175);
      }

   }

   public final void b() {
      if (!c && (!bh.a() || bh.a == 51)) {
         if ((float)(fishing4.a.y.a() - this.j) > 1500.0F) {
            int var7 = this.h;
            int var8 = fishing4.a.z.a(10);
            if (var8 >= 4) {
               if (var8 < 8) {
                  this.h = 0;
                  this.g.d = 1.0F;
                  if (this.i < 5) {
                     this.g.c = fishing4.a.z.a(4);
                  } else {
                     this.g.c = fishing4.a.z.a(8);
                  }

                  this.s = 0;
               } else if (var8 < 9) {
                  this.h = 1;
                  if (var7 != 1) {
                     this.s = 0;
                  }
               } else {
                  this.h = 2;
                  this.g.d = 1.0F;
                  this.s = 0;
               }

               if (this.h == 0) {
                  if (fishing4.a.z.a(10) < 7) {
                     if (this.i < 5) {
                        this.g.c = (this.g.c + fishing4.a.z.a(3)) % 4;
                     } else {
                        this.g.c = (this.g.c + fishing4.a.z.a(7)) % 8;
                     }
                  } else if ((this.g.c < 0 || this.g.c > 3) && this.i < 5) {
                     this.g.c = fishing4.a.z.a(4);
                  }
               }
            }

            this.j = fishing4.a.y.a();
         }

         if (this.h == 0) {
            switch (this.g.c) {
               case 0:
                  this.e = 14;
                  this.f = 0;
                  break;
               case 1:
                  this.e = -14;
                  this.f = 0;
                  break;
               case 2:
                  this.e = 0;
                  this.f = -14;
                  break;
               case 3:
                  this.e = 0;
                  this.f = 14;
                  break;
               case 4:
                  this.e = 10;
                  this.f = -10;
                  break;
               case 5:
                  this.e = 10;
                  this.f = 10;
                  break;
               case 6:
                  this.e = -10;
                  this.f = -10;
                  break;
               case 7:
                  this.e = -10;
                  this.f = 10;
            }
         } else {
            this.e = 0;
            this.f = 0;
         }

         if ((float)(fishing4.a.y.a() - this.n) > 500.0F) {
            this.o = false;
         }

         if (this.h != 0) {
            if (this.h == 1 && this.o) {
               av.a = 3;
            } else if (this.h == 2 && !this.a.a) {
               av.a = 4;
            } else {
               av.a = 5;
            }
         } else if ((this.g.c != 0 || this.a.b != 1) && (this.g.c != 1 || this.a.b != 0) && (this.g.c != 2 || this.a.b != 3) && (this.g.c != 3 || this.a.b != 2) && (this.g.c != 4 || this.a.b != 7) && (this.g.c != 5 || this.a.b != 6) && (this.g.c != 6 || this.a.b != 5) && (this.g.c != 7 || this.a.b != 4)) {
            if (this.a.b == -1) {
               av.a = 4;
            } else {
               av.a = 5;
            }
         } else {
            av.a = 3;
         }

         float var6 = ((aw.i - 1.0F) * 0.5F + 1.0F) * (float)fishing4.game.m.l(b);
         float var3 = (float)((ac)ad.i.get(ad.a)).q();
         if (ad.d != -1) {
            var3 += (float)((ac)ad.n.get(ad.d)).q();
         }

         float var1;
         float var2;
         float var4;
         float var5;
         if (this.h == 0) {
            if (!this.a.a) {
               var2 = 1.5F * var6 * (1.5F - this.v / this.z);
               var1 = var2;
               if (var2 > this.z * 0.1F) {
                  var1 = this.z * 0.1F;
               }

               var4 = this.y * 0.01F;
               var2 = -2.0F;
               ++this.O;
               var3 = var1 * -1.0F;
               var1 = 0.0F;
            } else {
               if (this.g.c == 0 && this.a.b == 1 || this.g.c == 1 && this.a.b == 0 || this.g.c == 2 && this.a.b == 3 || this.g.c == 3 && this.a.b == 2 || this.g.c == 4 && this.a.b == 7 || this.g.c == 5 && this.a.b == 6 || this.g.c == 6 && this.a.b == 5 || this.g.c == 7 && this.a.b == 4) {
                  OptionsManager.a(500);
                  var2 = (var3 + var6) * 3.0F * (1.5F - this.v / this.z);
                  var1 = var2;
                  if (var2 > this.z * 0.1F) {
                     var1 = this.z * 0.1F;
                  }

                  var4 = var3 - var6;
                  if (fishing4.game.m.d(b) >= 6) {
                     var2 = var4;
                     if (var4 < this.y * 0.01F / 1.0F) {
                        var2 = this.y * 0.01F / 1.0F;
                     }
                  } else {
                     var2 = var4;
                     if (var4 < this.y * 0.015F / 1.0F) {
                        var2 = this.y * 0.015F / 1.0F;
                     }
                  }

                  var4 = var3 - var6;
                  var3 = var4;
                  if (var4 < 5.0F) {
                     var3 = 5.0F;
                  }

                  var4 = var3;
                  if (var3 > this.x * 0.1F / 1.0F) {
                     var4 = this.x * 0.1F / 1.0F;
                  }

                  var3 = var2 * -1.0F;
                  var5 = var4 * -1.0F;
                  var2 = 0.0F;
                  var4 = var3;
                  var3 = var1;
                  var1 = var5;
               } else if (this.g.c == 0 && this.a.b == 0 || this.g.c == 1 && this.a.b == 1 || this.g.c == 2 && this.a.b == 2 || this.g.c == 3 && this.a.b == 3 || this.g.c == 4 && this.a.b == 4 || this.g.c == 5 && this.a.b == 5 || this.g.c == 6 && this.a.b == 6 || this.g.c == 7 && this.a.b == 7) {
                  var2 = 2.0F * var6 * (1.5F - this.v / this.z);
                  var1 = var2;
                  if (var2 > this.z * 0.1F) {
                     var1 = this.z * 0.1F;
                  }

                  var3 = this.y;
                  var2 = this.x;
                  ++this.O;
                  var4 = 0.02F * var3;
                  var3 = var1 * -1.0F;
                  var1 = var2 * 0.02F;
                  var2 = -1.0F;
               } else {
                  var2 = (var3 + var6) * 1.5F * (1.5F - this.v / this.z);
                  var1 = var2;
                  if (var2 > this.z * 0.1F) {
                     var1 = this.z * 0.1F;
                  }

                  var4 = (var3 - var6) * 0.8F;
                  if (fishing4.game.m.d(b) >= 6) {
                     var2 = var4;
                     if (var4 < this.y * 0.01F / 1.0F) {
                        var2 = this.y * 0.01F / 1.0F;
                     }
                  } else {
                     var2 = var4;
                     if (var4 < this.y * 0.015F / 1.0F) {
                        var2 = this.y * 0.015F / 1.0F;
                     }
                  }

                  var4 = (var3 - var6) * 0.9F;
                  var3 = var4;
                  if (var4 < 5.0F) {
                     var3 = 5.0F;
                  }

                  var4 = var3;
                  if (var3 > this.x * 0.1F / 1.0F) {
                     var4 = this.x * 0.1F / 1.0F;
                  }

                  ++this.O;
                  var5 = var2 * -1.0F;
                  var3 = var1;
                  var1 = var4 * -1.0F;
                  var2 = -1.0F;
                  var4 = var5;
               }

               c();
            }
         } else if (this.h == 1) {
            if (this.o) {
               OptionsManager.a(750);
               var2 = (var3 + var6) * 3.0F * (1.5F - this.v / this.z);
               var1 = var2;
               if (var2 > this.z * 0.1F) {
                  var1 = this.z * 0.1F;
               }

               var4 = (var3 - var6) * 1.2F;
               if (fishing4.game.m.d(b) >= 6) {
                  var2 = var4;
                  if (var4 < this.y * 0.01F / 1.0F) {
                     var2 = this.y * 0.01F / 1.0F;
                  }
               } else {
                  var2 = var4;
                  if (var4 < this.y * 0.015F / 1.0F) {
                     var2 = this.y * 0.015F / 1.0F;
                  }
               }

               var5 = var2 * -1.0F;
               var3 = (var3 - var6) * 1.1F;
               var2 = var3;
               if (var3 < 5.0F) {
                  var2 = 5.0F;
               }

               var4 = var2;
               if (var2 > this.x * 0.1F / 1.0F) {
                  var4 = this.x * 0.1F / 1.0F;
               }

               c();
               var3 = var1;
               var1 = var4 * -1.0F;
               var2 = 0.0F;
               var4 = var5;
            } else if (this.a.a) {
               var2 = (var3 + var6) * 1.5F * (1.5F - this.v / this.z);
               var1 = var2;
               if (var2 > this.z * 0.1F) {
                  var1 = this.z * 0.1F;
               }

               var4 = (var3 - var6) * 0.6F;
               if (fishing4.game.m.d(b) >= 6) {
                  var2 = var4;
                  if (var4 < this.y * 0.01F / 1.0F) {
                     var2 = this.y * 0.01F / 1.0F;
                  }
               } else {
                  var2 = var4;
                  if (var4 < this.y * 0.015F / 1.0F) {
                     var2 = this.y * 0.015F / 1.0F;
                  }
               }

               var5 = var2 * -1.0F;
               var3 = (var3 - var6) * 0.7F;
               var2 = var3;
               if (var3 < 5.0F) {
                  var2 = 5.0F;
               }

               var4 = var2;
               if (var2 > this.x * 0.1F / 1.0F) {
                  var4 = this.x * 0.1F / 1.0F;
               }

               c();
               ++this.O;
               var3 = var1;
               var1 = var4 * -1.0F;
               var2 = -1.0F;
               var4 = var5;
            } else {
               var2 = 1.5F * var6 * (1.5F - this.v / this.z);
               var1 = var2;
               if (var2 > this.z * 0.1F) {
                  var1 = this.z * 0.1F;
               }

               var2 = -2.0F;
               ++this.O;
               var3 = var1 * -1.0F;
               var4 = 0.0F;
               var1 = 0.0F;
            }
         } else if (this.h == 2) {
            if (this.a.a) {
               var2 = (var3 + var6) * 3.0F * (1.5F - this.v / this.z);
               var1 = var2;
               if (var2 > this.z * 0.1F) {
                  var1 = this.z * 0.1F;
               }

               var4 = (var3 - var6) * 0.4F;
               if (fishing4.game.m.d(b) >= 6) {
                  var2 = var4;
                  if (var4 < this.y * 0.01F / 1.0F) {
                     var2 = this.y * 0.01F / 1.0F;
                  }
               } else {
                  var2 = var4;
                  if (var4 < this.y * 0.015F / 1.0F) {
                     var2 = this.y * 0.015F / 1.0F;
                  }
               }

               var5 = var2 * -1.0F;
               var3 = (var3 - var6) * 0.7F;
               var2 = var3;
               if (var3 < 5.0F) {
                  var2 = 5.0F;
               }

               var4 = var2;
               if (var2 > this.x * 0.1F / 1.0F) {
                  var4 = this.x * 0.1F / 1.0F;
               }

               var2 = -2.0F;
               c();
               ++this.O;
               var3 = var1;
               var1 = var4 * -1.0F;
               var4 = var5;
            } else {
               var2 = 3.0F * var6 * (2.0F - this.v / this.z);
               var1 = var2;
               if (var2 > this.z * 0.1F) {
                  var1 = this.z * 0.1F;
               }

               var3 = var1 * -1.0F;
               var1 = 0.01F * this.x;
               var2 = 0.0F;
               var4 = 0.0F;
            }
         } else {
            var2 = 0.0F;
            var1 = 0.0F;
            var3 = 0.0F;
            var4 = 0.0F;
         }

         if (this.z != -1.0F) {
            if (this.v < this.z) {
               this.v += var3 * 0.175F;
               if (this.v < 0.0F) {
                  this.v = 0.0F;
               } else {
                  this.K = System.currentTimeMillis();
               }
            } else if (var3 < 0.0F) {
               this.v += var3 * 0.175F;
               this.B = 0;
               this.K = 0L;
               this.G = false;
            } else {
               this.v = this.z;
               if (!((float)this.B < 30.0F)) {
                  fishing4.game.l.a(30);
                  aw.a(4);
                  return;
               }

               ++this.B;
            }
         }

         if (this.u > 0.0F) {
            this.u += var4 * 0.175F;
            if (this.u > this.y) {
               this.u = this.y;
            }

            if (this.t > 0.0F) {
               var3 = var1;
               if (var1 < 0.0F) {
                  var3 = var1;
                  if (var1 > -5.0F) {
                     var3 = -5.0F;
                  }
               }

               this.t += var3 * 0.175F;
               if (this.t > this.x) {
                  this.t = this.x;
               }

               if (this.w > 0.0F) {
                  this.w += var2 * 0.175F;
                  if (this.w > this.A) {
                     this.w = this.A;
                  }

                  if (this.t * 100.0F / this.x < 30.0F && !this.F) {
                     this.F = true;
                     fishing4.game.l.a(20);
                  } else if (this.z != -1.0F && this.v >= this.z && System.currentTimeMillis() - this.K > 1000L && !this.G) {
                     this.G = true;
                     fishing4.game.l.a(21);
                  } else if (this.w * 100.0F / this.A < 30.0F && !this.H) {
                     this.H = true;
                     fishing4.game.l.a(22);
                  } else if (System.currentTimeMillis() - this.L > 20000L && !this.I) {
                     this.I = true;
                     fishing4.game.l.a(23);
                  } else if (this.O > 500 && !this.J) {
                     this.J = true;
                     fishing4.game.l.a(24);
                  }
               } else {
                  fishing4.game.l.a(31);
                  aw.a(4);
               }
            } else {
               fishing4.game.l.a(32);
               aw.a(4);
            }
         } else {
            av.a = 0;
            fishing4.game.l.a(40);
            aw.a(4);
         }
      }

   }

   public final void b(GL10 var1, int var2) {
      if (c) {
         fishing4.a.m.a(var1, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), (float)fishing4.a.m.getWidthPixels(), (float)fishing4.a.m.getHeightPixels(), RGBColor.getColor(0.0F, 0.0F, 0.0F, 0.75F));
         fishing4.a.m.a(var1, this.E, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels());
         if (var2 % 60 < 30) {
            fishing4.a.m.a(var1, this.D, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), var2 % 30 * 5 + 105);
         } else {
            fishing4.a.m.a(var1, this.D, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 255 - var2 % 30 * 5);
         }

         if (this.a.b != -1) {
            this.a.d();
         }

         fishing4.a.ae.a(var1, fishing4.a.y.a(2131165324), fishing4.a.m.getHalfWidthPixels(), 200.0F + fishing4.a.m.getHalfHeightPixels(), 360.0F, 100.0F, 26.0F, 4);
      }

   }
}

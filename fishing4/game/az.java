package fishing4.game;

import javax.microedition.khronos.opengles.GL10;

public final class az {
   public static fishing4.a.w A;
   public static fishing4.a.w B;
   public static fishing4.a.w C;
   public static fishing4.a.w D;
   public static fishing4.a.w E;
   public static fishing4.a.w F;
   public static fishing4.a.w G;
   public static int H;
   public static boolean I = false;
   public static String J = "";
   public static long K = 0L;
   private static final fishing4.a.h L = fishing4.a.h.a(174.0F, 150.0F);
   private static fishing4.a.ad M;
   private static fishing4.a.e[] N;
   private static boolean O;
   private static final int P;
   public static fishing4.a.e a;
   public static fishing4.a.e b;
   public static fishing4.a.e c;
   public static fishing4.a.e d;
   public static boolean e = false;
   public static boolean f = false;
   public static int g;
   public static int h;
   public static int i;
   public static int j;
   public static int k;
   public static int l;
   public static int m;
   public static int n;
   public static int o;
   public static int p;
   public static int q;
   public static fishing4.a.e[] r;
   public static fishing4.a.w s;
   public static fishing4.a.w t;
   public static fishing4.a.w u;
   public static fishing4.a.w v;
   public static fishing4.a.w w;
   public static fishing4.a.w x;
   public static int y;
   public static int z;

   static {
      byte var0;
      if (globalConfig.languageId == 0) {
         fishing4.game.k.q();
         var0 = 21;
      } else {
         fishing4.game.k.q();
         var0 = 19;
      }

      P = var0;
   }

   private static fishing4.a.e a(int var0, int var1) {
      float var5 = (float)((fishing4.a.m.a() - 330) / 2);
      float var2 = fishing4.a.m.d();
      float var3 = (float)(var0 % 12 % 6 * 66);
      float var4 = (float)(var0 % 12 / 6 * 76);
      return fishing4.a.e.a(var5 + var3 + (float)((var0 / 12 - var1) * fishing4.a.m.a()), var2 + 130.0F - var4);
   }

   public static void a() {
      byte var1 = 0;
      if (!am.e()) {
         am.b();
      } else {
         int var0;
         if (e) {
            if (g == 1) {
               e = false;
               fishing4.b.d.a().d();
            } else if (g == 5 && i == 1 && (j >= 10 && j <= 12 || j >= 20 && j <= 22)) {
               n = 0;
               o = 0;
               q = 0;
            } else if (g == 3 && O) {
               O = false;
               e = false;
               fishing4.b.d.a().d();
            } else {
               for(var0 = 0; var0 < r.length; ++var0) {
                  r[var0].b(fishing4.a.m.c(), fishing4.a.m.d());
               }

               h = -1;
               g = 0;
            }
         } else {
            g = 0;
            h = -1;
            p = 0;
            k = 0;
            j = 0;
            i = 0;
            H = -1;
            q = -1;
            o = -1;
            n = -1;
            m = -1;
            l = -1;
            e = true;
            fishing4.b.d.a().c();
            var0 = var1;
            if (fishing4.game.z.b() == 4) {
               fishing4.b.d var2 = fishing4.b.d.a();
               fishing4.a.s.a();
               var2.a(2131034123);
               var2 = fishing4.b.d.a();
               fishing4.a.s.a();
               var2.a(2131034121);
               var2 = fishing4.b.d.a();
               fishing4.a.s.a();
               var2.a(2131034122);
               var0 = var1;
            }

            while(var0 < r.length) {
               r[var0].b(fishing4.a.m.c(), fishing4.a.m.d());
               ++var0;
            }
         }
      }

   }

   public static void a(float var0, fishing4.a.e var1) {
      if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 160.0F, var0 + 220.0F), fishing4.a.h.a(75.0F, 75.0F), var1)) {
         n = (j + P - 1) % P;
         y = 0;
         z = 0;
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 160.0F, var0 + 220.0F), fishing4.a.h.a(75.0F, 75.0F), var1)) {
         n = (j + 1) % P;
         y = 0;
         z = 0;
      }

   }

   public static void a(int var0) {
      h = -1;
      i = var0;
      p = 0;
      k = 0;
      j = 0;
      H = -1;
      q = -1;
      o = -1;
      n = -1;
      m = -1;
      l = -1;
      g = 6;
      fishing4.b.d.a().c();
      e = true;
      O = true;
   }

   public static void a(fishing4.a.e var0) {
      int var1 = 0;
      switch (g) {
         case 0:
         default:
            break;
         case 1:
            while(var1 < r.length) {
               if (fishing4.a.f.a(r[var1], L, var0)) {
                  l = var1;
                  return;
               }

               ++var1;
            }

            return;
         case 2:
         case 3:
         case 4:
         case 5:
            if (am.e) {
               if (am.b == 150) {
                  if (!am.c.a(var0, false)) {
                     am.d.a(var0, false);
                  }
               } else {
                  am.c.a(var0, false);
               }
            } else if (g == 2 && (i == 0 || i == 1) || g == 3) {
               M.a(var0, false);
            }
      }

   }

   public static void a(GL10 var0) {
      r = new fishing4.a.e[4];

      for(int var1 = 0; var1 < r.length; ++var1) {
         r[var1] = fishing4.a.e.a();
      }

      s = fishing4.a.w.a(var0, "img/town/ui_01.png");
      t = fishing4.a.w.a(var0, "img/town/ui_text.png");
      u = fishing4.a.w.a(var0, "img/town/fish_ui_01.png");
      v = fishing4.a.w.a(var0, "img/town/fish_ui_02.png");
      w = fishing4.a.w.a(var0, "img/town/coinshop.png");
      x = fishing4.a.w.a(var0, "img/fish4_tapjoy.png");
      fishing4.b.d.a().a(fishing4.a.s.a(), 2131034130);
      fishing4.b.d.a().a(fishing4.a.s.a(), 2131034131);
      fishing4.b.d.a().a(fishing4.a.s.a(), 2131034120);
      fishing4.b.d.a().a(fishing4.a.s.a(), 2131034119);
      M = fishing4.a.ad.a(0);
   }

   public static void a(GL10 var0, float var1) {
      fishing4.a.m.a(var0, s, fishing4.a.m.c() - 80.0F, var1 + 150.0F, 587.0F, 689.0F, 66.0F, 68.0F);
      fishing4.a.m.a(var0, s, fishing4.a.m.c() + 80.0F, var1 + 170.0F, 662.0F, 501.0F, 52.0F, 18.0F);
      if (OptionsManager.a) {
         fishing4.a.m.a(var0, s, fishing4.a.m.c() + 80.0F, var1 + 130.0F, 0.0F, 719.0F, 78.0F, 52.0F, fishing4.a.aa.c());
         fishing4.a.m.a(var0, s, fishing4.a.m.c() + 80.0F, var1 + 130.0F, 928.0F, 814.0F, 42.0F, 22.0F, '\u0001');
      } else {
         fishing4.a.m.a(var0, s, fishing4.a.m.c() + 80.0F, var1 + 130.0F, 0.0F, 719.0F, 78.0F, 52.0F);
         fishing4.a.m.a(var0, s, fishing4.a.m.c() + 80.0F, var1 + 130.0F, 973.0F, 814.0F, 48.0F, 22.0F, '\u0001');
      }

      fishing4.a.m.a(var0, s, fishing4.a.m.c() - 80.0F, var1 + 50.0F, 587.0F, 689.0F, 66.0F, 68.0F);
      fishing4.a.m.a(var0, s, fishing4.a.m.c() + 80.0F, var1 + 70.0F, 680.0F, 478.0F, 118.0F, 16.0F);
      if (OptionsManager.b) {
         fishing4.a.m.a(var0, s, fishing4.a.m.c() + 80.0F, var1 + 30.0F, 0.0F, 719.0F, 78.0F, 52.0F, fishing4.a.aa.c());
         fishing4.a.m.a(var0, s, fishing4.a.m.c() + 80.0F, var1 + 30.0F, 928.0F, 814.0F, 42.0F, 22.0F, '\u0001');
      } else {
         fishing4.a.m.a(var0, s, fishing4.a.m.c() + 80.0F, var1 + 30.0F, 0.0F, 719.0F, 78.0F, 52.0F);
         fishing4.a.m.a(var0, s, fishing4.a.m.c() + 80.0F, var1 + 30.0F, 973.0F, 814.0F, 48.0F, 22.0F, '\u0001');
      }

      fishing4.a.m.a(var0, s, fishing4.a.m.c() - 80.0F, var1 - 50.0F, 497.0F, 689.0F, 88.0F, 58.0F);
      fishing4.a.m.a(var0, s, fishing4.a.m.c() + 80.0F, var1 - 30.0F, 727.0F, 886.0F, 122.0F, 18.0F);
      if (OptionsManager.c) {
         fishing4.a.m.a(var0, s, fishing4.a.m.c() + 80.0F, var1 - 70.0F, 0.0F, 719.0F, 78.0F, 52.0F, fishing4.a.aa.c());
         fishing4.a.m.a(var0, s, fishing4.a.m.c() + 80.0F, var1 - 70.0F, 928.0F, 814.0F, 42.0F, 22.0F, '\u0001');
      } else {
         fishing4.a.m.a(var0, s, fishing4.a.m.c() + 80.0F, var1 - 70.0F, 0.0F, 719.0F, 78.0F, 52.0F);
         fishing4.a.m.a(var0, s, fishing4.a.m.c() + 80.0F, var1 - 70.0F, 973.0F, 814.0F, 48.0F, 22.0F, '\u0001');
      }

   }

   public static void a(GL10 var0, float var1, int var2) {
      if (j == 0) {
         fishing4.a.m.a(var0, s, fishing4.a.m.c(), var1 + 150.0F, 794.0F, 577.0F, 140.0F, 64.0F);
         if (globalConfig.languageId == 0) {
            fishing4.a.m.a(var0, t, fishing4.a.m.c() - 25.0F, var1 + 100.0F, 385.0F, 488.0F, 46.0F, 20.0F);
            fishing4.a.m.a(var0, t, 25.0F + fishing4.a.m.c(), var1 + 100.0F, 523.0F, 488.0F, 46.0F, 20.0F);
         } else {
            fishing4.a.m.a(var0, t, fishing4.a.m.c() - 25.0F, var1 + 100.0F, 752.0F, 487.0F, 42.0F, 20.0F);
            fishing4.a.m.a(var0, t, 25.0F + fishing4.a.m.c(), var1 + 100.0F, 882.0F, 486.0F, 52.0F, 20.0F);
         }

         fishing4.a.m.a(var0, s, fishing4.a.m.c(), var1 - 50.0F, 821.0F, 645.0F, 112.0F, 86.0F);
         if (globalConfig.languageId == 0) {
            fishing4.a.m.a(var0, t, fishing4.a.m.c() - 35.0F, var1 - 120.0F, 441.0F, 488.0F, 70.0F, 20.0F);
            fishing4.a.m.a(var0, t, 30.0F + fishing4.a.m.c(), var1 - 120.0F, 523.0F, 488.0F, 46.0F, 20.0F);
         } else {
            fishing4.a.m.a(var0, t, fishing4.a.m.c() - 35.0F, var1 - 120.0F, 803.0F, 486.0F, 60.0F, 20.0F);
            fishing4.a.m.a(var0, t, 30.0F + fishing4.a.m.c(), var1 - 120.0F, 882.0F, 486.0F, 52.0F, 20.0F);
         }
      } else {
         float var3;
         int var4;
         int var5;
         int var6;
         fishing4.a.aa var7;
         fishing4.a.w var8;
         String var9;
         if (j >= 10 && j <= 12) {
            if (globalConfig.languageId == 0) {
               fishing4.a.m.a(var0, t, fishing4.a.m.c() - 25.0F, var1 + 220.0F, 385.0F, 488.0F, 46.0F, 20.0F);
               fishing4.a.m.a(var0, t, 25.0F + fishing4.a.m.c(), var1 + 220.0F, 523.0F, 488.0F, 46.0F, 20.0F);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 10) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, var3 - 120.0F, var1 + 180.0F, 581.0F, 488.0F, 46.0F, 20.0F, var7);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 11) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, var3, var1 + 180.0F, 639.0F, 488.0F, 46.0F, 20.0F, var7);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 12) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, 120.0F + var3, var1 + 180.0F, 696.0F, 488.0F, 46.0F, 20.0F, var7);
            } else {
               fishing4.a.m.a(var0, t, fishing4.a.m.c() - 25.0F, var1 + 220.0F, 752.0F, 487.0F, 42.0F, 20.0F);
               fishing4.a.m.a(var0, t, 25.0F + fishing4.a.m.c(), var1 + 220.0F, 882.0F, 486.0F, 52.0F, 20.0F);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 10) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, var3 - 120.0F, var1 + 180.0F, 765.0F, 467.0F, 30.0F, 16.0F, var7);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 11) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, var3, var1 + 180.0F, 837.0F, 465.0F, 32.0F, 18.0F, var7);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 12) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, 120.0F + var3, var1 + 180.0F, 911.0F, 466.0F, 42.0F, 18.0F, var7);
            }

            for(var4 = 0; var4 < 5; ++var4) {
               var6 = var4 + k;
               if (j - 10 == 2) {
                  var5 = var6 + 1 - 144;
               } else {
                  var5 = var6 + 1;
               }

               if (fishing4.game.s.a[var6] == 0.0F) {
                  var9 = var5 + ". ?????";
               } else if (fishing4.game.m.c(var6).length() > 13) {
                  var9 = var5 + ". " + fishing4.game.m.c(var6).substring(0, 13) + "...";
               } else {
                  var9 = var5 + ". " + fishing4.game.m.c(var6);
               }

               fishing4.a.ae.a(var0, var9, fishing4.a.m.c(), 70.0F + var1 - (float)(var4 * 50), 300.0F, 50.0F, 26.0F, 0);
               fishing4.a.m.a(var0, s, fishing4.a.m.c(), 70.0F + var1 - 22.0F - (float)(var4 * 50), 493.0F, 496.0F, 352.0F, 4.0F, '\u0001');
            }

            fishing4.game.k.b(var0, fishing4.a.e.a(fishing4.a.m.c(), var1 - 40.0F), 160.0F, var2);
            fishing4.a.ae.a(var0, fishing4.game.s.c + " / 187", fishing4.a.m.c(), var1 - 200.0F, 330.0F, 50.0F, 26.0F, 1, fishing4.a.aa.d());
         } else if (j >= 20 && j <= 22) {
            if (globalConfig.languageId == 0) {
               fishing4.a.m.a(var0, t, fishing4.a.m.c() - 35.0F, var1 + 220.0F, 441.0F, 488.0F, 70.0F, 20.0F);
               fishing4.a.m.a(var0, t, 30.0F + fishing4.a.m.c(), var1 + 220.0F, 523.0F, 488.0F, 46.0F, 20.0F);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 20) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, var3 - 120.0F, var1 + 180.0F, 581.0F, 488.0F, 46.0F, 20.0F, var7);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 21) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, var3, var1 + 180.0F, 639.0F, 488.0F, 46.0F, 20.0F, var7);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 22) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, 120.0F + var3, var1 + 180.0F, 696.0F, 488.0F, 46.0F, 20.0F, var7);
            } else {
               fishing4.a.m.a(var0, t, fishing4.a.m.c() - 35.0F, var1 + 220.0F, 803.0F, 486.0F, 60.0F, 20.0F);
               fishing4.a.m.a(var0, t, 30.0F + fishing4.a.m.c(), var1 + 220.0F, 882.0F, 486.0F, 52.0F, 20.0F);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 20) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, var3 - 120.0F, var1 + 180.0F, 765.0F, 467.0F, 30.0F, 16.0F, var7);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 21) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, var3, var1 + 180.0F, 837.0F, 465.0F, 32.0F, 18.0F, var7);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 22) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, 120.0F + var3, var1 + 180.0F, 911.0F, 466.0F, 42.0F, 18.0F, var7);
            }

            for(var4 = 0; var4 < 5; ++var4) {
               var6 = var4 + k;
               if (j - 20 == 2) {
                  var5 = var6 + 1 - 144;
               } else {
                  var5 = var6 + 1;
               }

               if (fishing4.game.s.b[var6] == 0.0F) {
                  var9 = var5 + ". ?????";
               } else if (fishing4.game.m.c(var6).length() > 13) {
                  var9 = var5 + ". " + fishing4.game.m.c(var6).substring(0, 13) + "...";
               } else {
                  var9 = var5 + ". " + fishing4.game.m.c(var6);
               }

               fishing4.a.ae.a(var0, var9, fishing4.a.m.c(), 70.0F + var1 - (float)(var4 * 50), 300.0F, 50.0F, 26.0F, 0);
               fishing4.a.m.a(var0, s, fishing4.a.m.c(), 70.0F + var1 - 22.0F - (float)(var4 * 50), 493.0F, 496.0F, 352.0F, 4.0F, '\u0001');
            }

            fishing4.game.k.b(var0, fishing4.a.e.a(fishing4.a.m.c(), var1 - 40.0F), 160.0F, var2);
            fishing4.a.ae.a(var0, fishing4.game.s.d + " / 187", fishing4.a.m.c(), var1 - 200.0F, 330.0F, 50.0F, 26.0F, 1, fishing4.a.aa.d());
         }
      }

   }

   public static void a(GL10 var0, float var1, int var2, int var3) {
      float var4;
      float var5;
      if (globalConfig.languageId == 0) {
         if (var2 == 0) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165921), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165922), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 1) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165923), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165924), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 2) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165925), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165926), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 3) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165927), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165928), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 4) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165929), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165930), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 5) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165931), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165932), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 6) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165933), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165934), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 7) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165935), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165936), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 8) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165937), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165938), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 9) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165939), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165940), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 10) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165941), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165942), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 11) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165943), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165944), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 12) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165945), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165946), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 13) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165947), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165948), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 14) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165949), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165951), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 15) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165952), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165953), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 16) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165954), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165955), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 17) {
            fishing4.game.k.q();
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165957), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165958), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 18) {
            fishing4.game.k.q();
            fishing4.game.k.q();
            if (F == null) {
               F = fishing4.a.w.a(var0, "img/ui/info.png");
            }

            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165959), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.m.a(var0, F, fishing4.a.m.c(), var1);
         } else if (var2 == 19) {
            fishing4.game.k.q();
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165960), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165961) + "1.0.5", fishing4.a.m.c(), var1, 24.0F, 4);
         } else if (var2 == 20) {
            fishing4.game.k.q();
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165962), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165963), fishing4.a.m.c(), var1 + 160.0F, 20.0F, 9);
         }

         if (z == 0 && fishing4.a.ae.k * fishing4.a.ae.a(24.0F) > 390 || z < 350) {
            z = fishing4.a.ae.k * fishing4.a.ae.a(24.0F) - 350;
         }

         if (z > 0) {
            if (fishing4.a.ae.k * fishing4.a.ae.a(24.0F) <= 390) {
               z = 0;
            } else {
               var5 = (float)(y * 390 / z);
               var4 = var5;
               if (var5 > 390.0F) {
                  var4 = 390.0F;
               }

               var5 = fishing4.a.m.c() + 200.0F;
               var4 = 190.0F + var1 - var4;
               fishing4.a.m.a(var0, var5, var4, 6.0F, 10.0F, fishing4.a.aa.a(0.75F, 0.75F, 0.75F, 1.0F));
               fishing4.a.m.a(var0, var5, var4, 4.0F, 12.0F, fishing4.a.aa.a(0.75F, 0.75F, 0.75F, 1.0F));
            }
         }

         fishing4.game.k.a(var0, fishing4.a.e.a(fishing4.a.m.c(), 220.0F + var1), 160.0F, var3);
         fishing4.game.k.a(var0, var2 + 1, fishing4.a.e.a(fishing4.a.m.c(), var1 - 220.0F), 4);
      } else {
         if (var2 == 0) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165921), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165922), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 1) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165923), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165924), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 2) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165925), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165926), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 3) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165927), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165928), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 4) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165929), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165930), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 5) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165931), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165932), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 6) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165933), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165934), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 7) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165935), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165936), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 8) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165937), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165938), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 9) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165939), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165940), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 10) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165941), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165942), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 11) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165943), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165944), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 12) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165945), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165946), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 13) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165947), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165948), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 14) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165949), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165951), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 15) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165952), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165953), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 16) {
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165954), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165955), fishing4.a.m.c(), var1 + 160.0F, 24.0F, 5);
         } else if (var2 == 17) {
            fishing4.game.k.q();
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165960), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165961) + "1.0.5", fishing4.a.m.c(), var1, 24.0F, 4);
         } else if (var2 == 18) {
            fishing4.game.k.q();
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165962), fishing4.a.m.c(), var1 + 220.0F, 350.0F, 390.0F, 26.0F, 4);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165963), fishing4.a.m.c(), var1 + 160.0F, 20.0F, 9);
         }

         if (z == 0 && fishing4.a.ae.k * fishing4.a.ae.a(24.0F) > 390 || z < 350) {
            z = fishing4.a.ae.k * fishing4.a.ae.a(24.0F) - 350;
         }

         if (z > 0) {
            if (fishing4.a.ae.k * fishing4.a.ae.a(24.0F) <= 390) {
               z = 0;
            } else {
               var5 = (float)(y * 390 / z);
               var4 = var5;
               if (var5 > 390.0F) {
                  var4 = 390.0F;
               }

               var5 = fishing4.a.m.c() + 200.0F;
               var4 = 190.0F + var1 - var4;
               fishing4.a.m.a(var0, var5, var4, 6.0F, 10.0F, fishing4.a.aa.a(0.75F, 0.75F, 0.75F, 1.0F));
               fishing4.a.m.a(var0, var5, var4, 4.0F, 12.0F, fishing4.a.aa.a(0.75F, 0.75F, 0.75F, 1.0F));
            }
         }

         fishing4.game.k.a(var0, fishing4.a.e.a(fishing4.a.m.c(), 220.0F + var1), 160.0F, var3);
         fishing4.game.k.a(var0, var2 + 1, fishing4.a.e.a(fishing4.a.m.c(), var1 - 220.0F), 4);
      }

   }

   public static void a(GL10 glContext, int var1) {
      fishing4.a.m.a(glContext, fishing4.a.m.c(), fishing4.a.m.d(), (float)fishing4.a.m.a(), (float)fishing4.a.m.b(), fishing4.a.aa.a(0.0F, 0.0F, 0.0F, 0.75F));
      fishing4.game.k.c();
      c();
      if (g == 6) {
         if (A != null) {
            fishing4.a.w.a(glContext, A);
            A = null;
         }

         if (B != null) {
            fishing4.a.w.a(glContext, B);
            B = null;
         }

         if (C != null) {
            fishing4.a.w.a(glContext, C);
            C = null;
         }

         if (D != null) {
            fishing4.a.w.a(glContext, D);
            D = null;
         }

         if (E != null) {
            fishing4.a.w.a(glContext, E);
            E = null;
         }

         if (F != null) {
            fishing4.a.w.a(glContext, F);
            F = null;
         }

         g();
         g = 3;
      } else {
         int var5;
         fishing4.a.e var8;
         if (g == 7 || g == 8) {
            boolean var6 = true;

            for(var5 = 0; var5 < N.length; ++var5) {
               var8 = a(var5, j);
               var8 = fishing4.a.e.a(var8.a, var8.b);
               fishing4.a.e var9 = N[var5];
               if (!fishing4.a.y.a(var9, var8)) {
                  var6 = false;
               }

               N[var5].a(var9);
            }

            if (var6) {
               c(j * 12 + k % 12);
               g = 3;
            }
         }

         float var3 = fishing4.a.m.d() - 70.0F;
         if (g == 2 || g == 3 || g == 4 || g == 5 || g == 7 || g == 8) {
            b(glContext, var3);
         }

         float var2;
         int var11;
         fishing4.a.aa var12;
         fishing4.a.w var13;
         ae var15;
         switch (g) {
            case 0:
               for(var5 = 0; var5 < r.length; ++var5) {
                  fishing4.a.m.a(glContext, s, r[var5], fishing4.a.f.a(317.0F, 372.0F, 174.0F, 150.0F));
               }

               if (fishing4.a.y.a(r[2], a) || fishing4.a.y.a(r[0], c) || fishing4.a.y.a(r[1], d) || fishing4.a.y.a(r[3], b)) {
                  if (A != null) {
                     fishing4.a.w.a(glContext, A);
                     A = null;
                  }

                  if (B != null) {
                     fishing4.a.w.a(glContext, B);
                     B = null;
                  }

                  if (C != null) {
                     fishing4.a.w.a(glContext, C);
                     C = null;
                  }

                  if (D != null) {
                     fishing4.a.w.a(glContext, D);
                     D = null;
                  }

                  if (E != null) {
                     fishing4.a.w.a(glContext, E);
                     E = null;
                  }

                  if (F != null) {
                     fishing4.a.w.a(glContext, F);
                     F = null;
                  }

                  h = -1;
                  p = 0;
                  k = 0;
                  j = 0;
                  i = 0;
                  g = 1;
               }
               break;
            case 1:
               fishing4.a.m.a(glContext, s, a, fishing4.a.f.a(317.0F, 372.0F, 174.0F, 150.0F));
               fishing4.a.m.a(glContext, s, a, fishing4.a.f.a(493.0F, 354.0F, 162.0F, 140.0F), '\u0002');
               fishing4.a.m.a(glContext, s, c, fishing4.a.f.a(317.0F, 372.0F, 174.0F, 150.0F));
               fishing4.a.m.a(glContext, s, c, fishing4.a.f.a(493.0F, 354.0F, 162.0F, 140.0F), '\u0002');
               fishing4.a.m.a(glContext, s, d, fishing4.a.f.a(317.0F, 372.0F, 174.0F, 150.0F));
               fishing4.a.m.a(glContext, s, d, fishing4.a.f.a(493.0F, 354.0F, 162.0F, 140.0F), '\u0002');
               fishing4.a.m.a(glContext, s, b, fishing4.a.f.a(317.0F, 372.0F, 174.0F, 150.0F));
               fishing4.a.m.a(glContext, s, b, fishing4.a.f.a(493.0F, 354.0F, 162.0F, 140.0F), '\u0002');
               if (h >= 0 && h < 4) {
                  if (h == 2) {
                     fishing4.a.m.a(glContext, s, a, fishing4.a.f.a(736.0F, 0.0F, 194.0F, 170.0F), '\u0001');
                  } else if (h == 0) {
                     fishing4.a.m.a(glContext, s, c, fishing4.a.f.a(736.0F, 0.0F, 194.0F, 170.0F), '\u0001');
                  } else if (h == 1) {
                     fishing4.a.m.a(glContext, s, d, fishing4.a.f.a(736.0F, 0.0F, 194.0F, 170.0F), '\u0001');
                  } else if (h == 3) {
                     fishing4.a.m.a(glContext, s, b, fishing4.a.f.a(736.0F, 0.0F, 194.0F, 170.0F), '\u0001');
                  }
               }

               fishing4.a.m.a(glContext, s, a, fishing4.a.f.a(762.0F, 796.0F, 68.0F, 20.0F));
               fishing4.a.m.a(glContext, s, c, fishing4.a.f.a(831.0F, 793.0F, 84.0F, 22.0F));
               fishing4.a.m.a(glContext, s, d.a, d.b + 11.0F, fishing4.a.f.a(802.0F, 818.0F, 102.0F, 22.0F));
               fishing4.a.m.a(glContext, s, d.a, d.b - 11.0F, fishing4.a.f.a(756.0F, 842.0F, 124.0F, 20.0F));
               fishing4.a.m.a(glContext, s, b, fishing4.a.f.a(917.0F, 793.0F, 104.0F, 20.0F));
               break;
            case 2:
               fishing4.a.m.a(glContext, t, fishing4.a.m.c(), var3 + 352.0F, 0.0F, 300.0F, 70.0F, 32.0F);
               var13 = s;
               var2 = fishing4.a.m.c();
               if (i == 0) {
                  var12 = fishing4.a.aa.d();
               } else {
                  var12 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(glContext, var13, var2 - 138.0F, var3 + 280.0F, 57.0F, 843.0F, 76.0F, 18.0F, var12);
               var13 = s;
               var2 = fishing4.a.m.c();
               if (i == 1) {
                  var12 = fishing4.a.aa.d();
               } else {
                  var12 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(glContext, var13, var2, var3 + 280.0F, 705.0F, 796.0F, 50.0F, 20.0F, var12);
               var13 = s;
               var2 = fishing4.a.m.c();
               if (i == 2) {
                  var12 = fishing4.a.aa.d();
               } else {
                  var12 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(glContext, var13, 138.0F + var2, var3 + 280.0F, 218.0F, 843.0F, 86.0F, 18.0F, var12);
               fishing4.a.w var17;
               if (i == 0) {
                  if (globalConfig.languageId == 0) {
                     fishing4.a.ae.a(glContext, fishing4.game.x.j(), fishing4.a.m.c(), var3 + 220.0F, 400.0F, 50.0F, 26.0F, 4, fishing4.a.aa.d());
                     fishing4.a.ae.a(glContext, "명성 Exp", fishing4.a.m.c() - 115.0F, var3 + 185.0F, 400.0F, 40.0F, 24.0F, 4, fishing4.a.aa.e());
                     fishing4.a.ae.a(glContext, fishing4.game.x.e(), 70.0F + fishing4.a.m.c(), var3 + 185.0F, 400.0F, 40.0F, 24.0F, 4, fishing4.a.aa.e());
                     fishing4.a.ae.a(glContext, "숙련 Lv." + Integer.toString(fishing4.game.x.b(true)), fishing4.a.m.c() - 115.0F, var3 + 150.0F, 400.0F, 40.0F, 24.0F, 4, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                  } else {
                     fishing4.a.ae.a(glContext, fishing4.game.x.j(), fishing4.a.m.c(), var3 + 220.0F, 400.0F, 50.0F, 26.0F, 4, fishing4.a.aa.d());
                     fishing4.a.ae.a(glContext, "Reputation ", fishing4.a.m.c() - 115.0F, var3 + 185.0F, 400.0F, 40.0F, 24.0F, 4, fishing4.a.aa.e());
                     fishing4.a.ae.a(glContext, fishing4.game.x.e(), 70.0F + fishing4.a.m.c(), var3 + 185.0F, 400.0F, 40.0F, 24.0F, 4, fishing4.a.aa.e());
                     fishing4.a.ae.a(glContext, "Experience Lv." + Integer.toString(fishing4.game.x.b(true)), fishing4.a.m.c() - 105.0F, var3 + 150.0F, 400.0F, 40.0F, 24.0F, 4, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                  }

                  if (fishing4.game.x.f() > 0) {
                     if (fishing4.game.x.b(true) > 1) {
                        var5 = (fishing4.game.x.d() - fishing4.game.x.e(fishing4.game.x.b(true) - 1)) * 196 / (fishing4.game.x.e(fishing4.game.x.b(true)) - fishing4.game.x.e(fishing4.game.x.b(true) - 1));
                     } else {
                        var5 = fishing4.game.x.d() * 196 / fishing4.game.x.f();
                     }

                     fishing4.a.m.a(glContext, 95.0F + fishing4.a.m.c(), var3 + 150.0F, 200.0F, 10.0F, fishing4.a.aa.a(1.0F, 1.0F, 1.0F, 1.0F));
                     fishing4.a.m.a(glContext, fishing4.a.m.c() + 95.0F - (float)((196 - var5) / 2), var3 + 150.0F, (float)var5, 6.0F, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                  } else {
                     fishing4.a.m.a(glContext, 95.0F + fishing4.a.m.c(), var3 + 150.0F, 200.0F, 10.0F, fishing4.a.aa.a(1.0F, 1.0F, 1.0F, 1.0F));
                     fishing4.a.m.a(glContext, 95.0F + fishing4.a.m.c(), var3 + 150.0F, 196.0F, 6.0F, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                  }

                  fishing4.a.m.a(glContext, s, fishing4.a.m.c(), var3 + 120.0F, 493.0F, 496.0F, 352.0F, 4.0F, '\u0001');
                  if (C == null) {
                     C = fishing4.a.w.a(glContext, "img/town/item.png");
                  }

                  if (ad.a == -1) {
                     ac.a(glContext, C, fishing4.a.m.c() - 160.0F, 75.0F + var3, -1);
                  } else {
                     var5 = ((ac)ad.i.get(ad.a)).h() * 100 / ((ac)ad.i.get(ad.a)).j();
                     ac.a(glContext, C, fishing4.a.m.c() - 160.0F, var3 + 75.0F, ((ac)ad.i.get(ad.a)).f(), var5);
                     if (globalConfig.languageId == 0) {
                        fishing4.a.ae.a(glContext, ((ac)ad.i.get(ad.a)).u(), fishing4.a.m.c() - 60.0F, var3 + 75.0F, 120.0F, 60.0F, 22.0F, 4);
                     } else {
                        fishing4.a.ae.a(glContext, "FISHING ROD", fishing4.a.m.c() - 60.0F, var3 + 75.0F, 120.0F, 60.0F, 19.0F, 4);
                     }
                  }

                  if (ad.c == -1) {
                     ac.a(glContext, C, fishing4.a.m.c() - 160.0F, var3 - 5.0F, -1);
                  } else {
                     ac.a(glContext, C, fishing4.a.m.c() - 160.0F, var3 - 5.0F, ((ac)ad.j.get(ad.c)).f());
                     if (globalConfig.languageId == 0) {
                        fishing4.a.ae.a(glContext, ((ac)ad.j.get(ad.c)).u(), fishing4.a.m.c() - 60.0F, var3 - 5.0F, 120.0F, 60.0F, 22.0F, 4);
                     } else {
                        fishing4.a.ae.a(glContext, "LURE", fishing4.a.m.c() - 60.0F, var3 - 5.0F, 120.0F, 60.0F, 22.0F, 4);
                     }
                  }

                  if (ad.b == -1) {
                     ac.a(glContext, C, fishing4.a.m.c() - 160.0F, var3 - 85.0F, -1);
                  } else {
                     var5 = ((ac)ad.k.get(ad.b)).h() * 100 / ((ac)ad.k.get(ad.b)).j();
                     ac.a(glContext, C, fishing4.a.m.c() - 160.0F, var3 - 85.0F, ((ac)ad.k.get(ad.b)).f(), var5);
                     if (globalConfig.languageId == 0) {
                        fishing4.a.ae.a(glContext, ((ac)ad.k.get(ad.b)).u(), fishing4.a.m.c() - 60.0F, var3 - 85.0F, 120.0F, 60.0F, 22.0F, 4);
                     } else {
                        fishing4.a.ae.a(glContext, "FISHING LINE", fishing4.a.m.c() - 60.0F, var3 - 85.0F, 120.0F, 60.0F, 19.0F, 4);
                     }
                  }

                  if (ad.f == -1) {
                     ac.a(glContext, C, fishing4.a.m.c() + 40.0F, 75.0F + var3, -1);
                  } else {
                     var5 = ((ac)ad.m.get(ad.f)).h() * 100 / ((ac)ad.m.get(ad.f)).j();
                     ac.a(glContext, C, 40.0F + fishing4.a.m.c(), var3 + 75.0F, ((ac)ad.m.get(ad.f)).f(), var5);
                     if (globalConfig.languageId == 0) {
                        fishing4.a.ae.a(glContext, ((ac)ad.m.get(ad.f)).u(), 140.0F + fishing4.a.m.c(), var3 + 75.0F, 120.0F, 60.0F, 22.0F, 4);
                     } else {
                        fishing4.a.ae.a(glContext, "CAP", 140.0F + fishing4.a.m.c(), var3 + 75.0F, 120.0F, 60.0F, 22.0F, 4);
                     }
                  }

                  if (ad.e == -1) {
                     ac.a(glContext, C, fishing4.a.m.c() + 40.0F, var3 - 5.0F, -1);
                  } else {
                     var5 = ((ac)ad.l.get(ad.e)).h() * 100 / ((ac)ad.l.get(ad.e)).j();
                     ac.a(glContext, C, 40.0F + fishing4.a.m.c(), var3 - 5.0F, ((ac)ad.l.get(ad.e)).f(), var5);
                     if (globalConfig.languageId == 0) {
                        fishing4.a.ae.a(glContext, ((ac)ad.l.get(ad.e)).u(), 140.0F + fishing4.a.m.c(), var3 - 5.0F, 120.0F, 60.0F, 22.0F, 4);
                     } else {
                        fishing4.a.ae.a(glContext, "SHIRT", 140.0F + fishing4.a.m.c(), var3 - 5.0F, 120.0F, 60.0F, 22.0F, 4);
                     }
                  }

                  if (ad.d == -1) {
                     ac.a(glContext, C, fishing4.a.m.c() + 40.0F, var3 - 85.0F, -1);
                  } else {
                     var5 = ((ac)ad.n.get(ad.d)).h() * 100 / ((ac)ad.n.get(ad.d)).j();
                     ac.a(glContext, C, 40.0F + fishing4.a.m.c(), var3 - 85.0F, ((ac)ad.n.get(ad.d)).f(), var5);
                     if (globalConfig.languageId == 0) {
                        fishing4.a.ae.a(glContext, ((ac)ad.n.get(ad.d)).u(), 140.0F + fishing4.a.m.c(), var3 - 85.0F, 120.0F, 60.0F, 22.0F, 4);
                     } else {
                        fishing4.a.ae.a(glContext, "VEST", 140.0F + fishing4.a.m.c(), var3 - 85.0F, 120.0F, 60.0F, 22.0F, 4);
                     }
                  }

                  fishing4.a.m.a(glContext, s, fishing4.a.m.c(), var3 - 130.0F, 493.0F, 496.0F, 352.0F, 4.0F, '\u0001');
                  var15 = ad.o;
                  fishing4.a.e var14 = fishing4.a.e.a(fishing4.a.m.c(), var3 - 160.0F);
                  var17 = s;
                  var15.a(glContext, var14, t);
                  M.a(glContext, s, t, fishing4.a.e.a(fishing4.a.m.c(), var3 - 215.0F));
               } else if (i == 1) {
                  ag var18 = (ag)ad.h.get(k);
                  if (A == null) {
                     A = fishing4.a.w.a(glContext, "img/town/ship.png");
                  }

                  if (B == null) {
                     B = fishing4.a.w.a(glContext, "img/town/radar.png");
                  }

                  if (E == null) {
                     E = fishing4.a.w.a(glContext, "img/town/choice_icon.png");
                  }

                  fishing4.a.ae.a(glContext, var18.u(), fishing4.a.m.c(), fishing4.a.m.d() - 70.0F, (float)fishing4.a.m.a(), 28.0F, 26.0F, 4, fishing4.a.aa.a(1.0F, 1.0F, 0.0F, 1.0F));
                  fishing4.a.ae.a(glContext, fishing4.a.y.a(2131165235), 40.0F + fishing4.a.m.c(), fishing4.a.m.d() - 130.0F, 220.0F, 28.0F, 26.0F, 0);
                  fishing4.a.ae.a(glContext, fishing4.a.y.a(2131165236), 40.0F + fishing4.a.m.c(), fishing4.a.m.d() - 160.0F, 220.0F, 28.0F, 26.0F, 0);
                  fishing4.a.ae.a(glContext, var18.g(), 90.0F + fishing4.a.m.c(), fishing4.a.m.d() - 130.0F, 220.0F, 28.0F, 26.0F, 1, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                  fishing4.a.ae.a(glContext, var18.h(), 90.0F + fishing4.a.m.c(), fishing4.a.m.d() - 160.0F, 220.0F, 28.0F, 26.0F, 1, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                  fishing4.a.m.a(glContext, A, fishing4.a.m.c(), 60.0F + fishing4.a.m.d(), 2.0F, 2.0F, 306.0F, 192.0F);
                  var18.a(glContext, A, E, fishing4.a.m.c(), fishing4.a.m.d() + 20.0F);
                  if (var1 % 150 < 50) {
                     var5 = var1 % 50 * 255 / 50;
                  } else if (var1 % 150 < 100) {
                     var5 = 255 - var1 % 50 * 255 / 50;
                  } else {
                     var5 = 0;
                  }

                  fishing4.a.m.a(glContext, A, fishing4.a.m.c() - 40.0F, 80.0F + fishing4.a.m.d(), 0.0F, 194.0F, 270.0F, 200.0F, '\u0005', var5);
                  var18.a(glContext, B, fishing4.a.m.c() - 130.0F, fishing4.a.m.d() - 140.0F, var1);
                  if (ad.h.size() > 1) {
                     fishing4.game.k.a(glContext, fishing4.a.e.a(fishing4.a.m.c(), fishing4.a.m.d() + 60.0F), 180.0F, var1);
                  }

                  M.a(glContext, s, t, fishing4.a.e.a(fishing4.a.m.c(), var3 - 215.0F));
               } else if (i == 2) {
                  if (D == null) {
                     fishing4.a.ae.a(glContext, "Loading..", fishing4.a.m.c(), var3, 400.0F, 50.0F, 26.0F, 4);
                     D = fishing4.a.w.a(glContext, "img/archive/archive.png");
                  } else {
                     for(var5 = 0; var5 < 24; ++var5) {
                        if (k == var5) {
                           var17 = s;
                           var2 = fishing4.a.m.c();
                           fishing4.a.m.a(glContext, var17, (float)(var5 % 5 * 75) + (var2 - 150.0F), 200.0F + var3 - (float)(var5 / 5 * 70), 701.0F, 587.0F, 76.0F, 76.0F, '\u0001');
                        }

                        if (fishing4.game.q.b[var5]) {
                           fishing4.a.m.a(glContext, D, fishing4.a.m.c() - 150.0F + (float)(var5 % 5 * 75), 200.0F + var3 - (float)(var5 / 5 * 70), fishing4.a.f.a((float)(var5 % 6 * 64), (float)(var5 / 6 * 66), 56.0F, 56.0F));
                        } else {
                           var17 = D;
                           var2 = fishing4.a.m.c();
                           fishing4.a.m.a(glContext, var17, (float)(var5 % 5 * 75) + (var2 - 150.0F), 200.0F + var3 - (float)(var5 / 5 * 70), fishing4.a.f.a((float)(var5 % 6 * 64), (float)(var5 / 6 * 66), 56.0F, 56.0F), fishing4.a.aa.a(0.35F, 0.35F, 0.35F, 1.0F));
                        }
                     }

                     fishing4.a.ae.a(glContext, fishing4.game.q.a(k), fishing4.a.m.c(), var3 - 180.0F, 350.0F, 300.0F, 24.0F, 4);
                  }
               }
               break;
            case 3:
            case 7:
            case 8:
               fishing4.a.m.a(glContext, t, fishing4.a.m.c(), var3 + 352.0F, 73.0F, 300.0F, 86.0F, 32.0F);
               var13 = t;
               var2 = fishing4.a.m.c();
               if (i == 0) {
                  var12 = fishing4.a.aa.d();
               } else {
                  var12 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(glContext, var13, var2 - 34.0F - 68.0F - 68.0F, var3 + 280.0F, 343.0F, 140.0F, 36.0F, 34.0F, var12);
               var13 = t;
               var2 = fishing4.a.m.c();
               if (i == 1) {
                  var12 = fishing4.a.aa.d();
               } else {
                  var12 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(glContext, var13, var2 - 34.0F - 68.0F, var3 + 280.0F, 381.0F, 140.0F, 38.0F, 26.0F, var12);
               var13 = t;
               var2 = fishing4.a.m.c();
               if (i == 2) {
                  var12 = fishing4.a.aa.d();
               } else {
                  var12 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(glContext, var13, var2 - 34.0F, var3 + 280.0F, 503.0F, 141.0F, 36.0F, 32.0F, var12);
               var13 = t;
               var2 = fishing4.a.m.c();
               if (i == 3) {
                  var12 = fishing4.a.aa.d();
               } else {
                  var12 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(glContext, var13, 34.0F + var2, var3 + 280.0F, 421.0F, 140.0F, 34.0F, 26.0F, var12);
               var13 = t;
               var2 = fishing4.a.m.c();
               if (i == 4) {
                  var12 = fishing4.a.aa.d();
               } else {
                  var12 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(glContext, var13, 68.0F + var2 + 34.0F, var3 + 280.0F, 456.0F, 140.0F, 22.0F, 28.0F, var12);
               var13 = t;
               var2 = fishing4.a.m.c();
               if (i == 5) {
                  var12 = fishing4.a.aa.d();
               } else {
                  var12 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(glContext, var13, 68.0F + var2 + 34.0F + 68.0F, var3 + 280.0F, 479.0F, 140.0F, 22.0F, 26.0F, var12);
               if (C == null) {
                  C = fishing4.a.w.a(glContext, "img/town/item.png");
               }

               fishing4.a.m.a(glContext, fishing4.a.f.a(fishing4.a.m.c() - 206.0F, 0.0F, 412.0F, (float)fishing4.a.m.b()));

               for(var5 = 0; var5 < N.length; ++var5) {
                  float var4 = N[var5].a;
                  var2 = N[var5].b;
                  if (k == var5 && g == 3) {
                     fishing4.a.m.a(glContext, s, fishing4.a.e.a(var4, var2), bg.c, '\u0001');
                  }

                  if (i == 0) {
                     if (var5 < ad.i.size()) {
                        var11 = ((ac)ad.i.get(var5)).h() * 100 / ((ac)ad.i.get(var5)).j();
                        ac.a(glContext, C, var4, var2, ((ac)ad.i.get(var5)).f(), var11);
                     } else {
                        ac.a(glContext, C, var4, var2, -1);
                     }

                     if (var5 == ad.a) {
                        fishing4.a.m.a(glContext, s, 10.0F + (var4 - 28.0F), 28.0F + var2 - 10.0F, 920.0F, 354.0F, 20.0F, 20.0F);
                     }
                  } else if (i == 1) {
                     if (var5 < ad.j.size()) {
                        ac.a(glContext, C, var4, var2, ((ac)ad.j.get(var5)).f());
                     } else {
                        ac.a(glContext, C, var4, var2, -1);
                     }

                     if (var5 == ad.c) {
                        fishing4.a.m.a(glContext, s, var4 - 28.0F + 10.0F, 28.0F + var2 - 10.0F, 920.0F, 354.0F, 20.0F, 20.0F);
                     }

                     if (var5 < ad.j.size()) {
                        fishing4.game.k.a(glContext, ((ac)ad.j.get(var5)).c(), fishing4.a.e.a(28.0F + var4 - 10.0F, var2 - 28.0F + 10.0F), 1);
                     }
                  } else if (i == 2) {
                     if (var5 < ad.k.size()) {
                        var11 = ((ac)ad.k.get(var5)).h() * 100 / ((ac)ad.k.get(var5)).j();
                        ac.a(glContext, C, var4, var2, ((ac)ad.k.get(var5)).f(), var11);
                     } else {
                        ac.a(glContext, C, var4, var2, -1);
                     }

                     if (var5 == ad.b) {
                        fishing4.a.m.a(glContext, s, 10.0F + (var4 - 28.0F), 28.0F + var2 - 10.0F, 920.0F, 354.0F, 20.0F, 20.0F);
                     }
                  } else if (i == 3) {
                     if (var5 < ad.m.size()) {
                        var11 = ((ac)ad.m.get(var5)).h() * 100 / ((ac)ad.m.get(var5)).j();
                        ac.a(glContext, C, var4, var2, ((ac)ad.m.get(var5)).f(), var11);
                     } else {
                        ac.a(glContext, C, var4, var2, -1);
                     }

                     if (var5 == ad.f) {
                        fishing4.a.m.a(glContext, s, 10.0F + (var4 - 28.0F), 28.0F + var2 - 10.0F, 920.0F, 354.0F, 20.0F, 20.0F);
                     }
                  } else if (i == 4) {
                     if (var5 < ad.l.size()) {
                        var11 = ((ac)ad.l.get(var5)).h() * 100 / ((ac)ad.l.get(var5)).j();
                        ac.a(glContext, C, var4, var2, ((ac)ad.l.get(var5)).f(), var11);
                     } else {
                        ac.a(glContext, C, var4, var2, -1);
                     }

                     if (var5 == ad.e) {
                        fishing4.a.m.a(glContext, s, 10.0F + (var4 - 28.0F), 28.0F + var2 - 10.0F, 920.0F, 354.0F, 20.0F, 20.0F);
                     }
                  } else if (i == 5) {
                     if (var5 < ad.n.size()) {
                        var11 = ((ac)ad.n.get(var5)).h() * 100 / ((ac)ad.n.get(var5)).j();
                        ac.a(glContext, C, var4, var2, ((ac)ad.n.get(var5)).f(), var11);
                     } else {
                        ac.a(glContext, C, var4, var2, -1);
                     }

                     if (var5 == ad.d) {
                        fishing4.a.m.a(glContext, s, 10.0F + (var4 - 28.0F), 28.0F + var2 - 10.0F, 920.0F, 354.0F, 20.0F, 20.0F);
                     }
                  }
               }

               fishing4.a.m.b(glContext);
               ac var16;
               if (i == 0) {
                  if (k < ad.i.size() && g == 3 && o == -1) {
                     var16 = (ac)ad.i.get(k);
                     fishing4.a.ae.a(glContext, var16.u(), fishing4.a.m.c(), 75.0F + var3 - 45.0F, 400.0F, 50.0F, 26.0F, 4, fishing4.a.aa.d());

                     for(var5 = 0; var5 < ab.e(0) - 1; ++var5) {
                        fishing4.a.m.a(glContext, s, fishing4.a.m.c(), var3 - (float)(var5 * 40) - 45.0F, 493.0F, 496.0F, 352.0F, 4.0F, '\u0001');
                        fishing4.a.ae.a(glContext, ab.a(0, var5), fishing4.a.m.c(), 22.0F + var3 - (float)(var5 * 40) - 45.0F, 300.0F, 50.0F, 24.0F, 0, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                        fishing4.a.ae.a(glContext, ab.a(var16, var5, false), fishing4.a.m.c(), 22.0F + var3 - (float)(var5 * 40) - 45.0F, 300.0F, 50.0F, 24.0F, 1);
                     }
                  }
               } else if (i == 1) {
                  if (k < ad.j.size() && g == 3 && o == -1) {
                     var16 = (ac)ad.j.get(k);
                     fishing4.a.ae.a(glContext, var16.u(), fishing4.a.m.c(), 75.0F + var3 - 45.0F, 400.0F, 50.0F, 26.0F, 4, fishing4.a.aa.d());

                     for(var5 = 0; var5 < ab.e(1) - 1; ++var5) {
                        fishing4.a.m.a(glContext, s, fishing4.a.m.c(), var3 - (float)(var5 * 40) - 45.0F, 493.0F, 496.0F, 352.0F, 4.0F, '\u0001');
                        fishing4.a.ae.a(glContext, ab.a(1, var5), fishing4.a.m.c(), 22.0F + var3 - (float)(var5 * 40) - 45.0F, 300.0F, 50.0F, 24.0F, 0, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                        fishing4.a.ae.a(glContext, ab.a(var16, var5, false), fishing4.a.m.c(), 22.0F + var3 - (float)(var5 * 40) - 45.0F, 300.0F, 50.0F, 24.0F, 1);
                     }
                  }
               } else if (i == 2) {
                  if (k < ad.k.size() && g == 3 && o == -1) {
                     var16 = (ac)ad.k.get(k);
                     fishing4.a.ae.a(glContext, var16.u(), fishing4.a.m.c(), 75.0F + var3 - 45.0F, 400.0F, 50.0F, 26.0F, 4, fishing4.a.aa.d());

                     for(var5 = 0; var5 < ab.e(2) - 1; ++var5) {
                        fishing4.a.m.a(glContext, s, fishing4.a.m.c(), 20.0F + var3 - (float)(var5 * 40) - 45.0F, 493.0F, 496.0F, 352.0F, 4.0F, '\u0001');
                        fishing4.a.ae.a(glContext, ab.a(2, var5), fishing4.a.m.c(), 20.0F + var3 + 22.0F - (float)(var5 * 40) - 45.0F, 300.0F, 50.0F, 24.0F, 0, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                        fishing4.a.ae.a(glContext, ab.a(var16, var5, false), fishing4.a.m.c(), 20.0F + var3 + 22.0F - (float)(var5 * 40) - 45.0F, 300.0F, 50.0F, 24.0F, 1);
                     }
                  }
               } else if (i == 3) {
                  if (k < ad.m.size() && g == 3 && o == -1) {
                     var16 = (ac)ad.m.get(k);
                     fishing4.a.ae.a(glContext, var16.u(), fishing4.a.m.c(), 75.0F + var3 - 45.0F, 400.0F, 50.0F, 26.0F, 4, fishing4.a.aa.d());

                     for(var5 = 0; var5 < ab.e(4) - 1; ++var5) {
                        fishing4.a.m.a(glContext, s, fishing4.a.m.c(), var3 - (float)(var5 * 40) - 45.0F, 493.0F, 496.0F, 352.0F, 4.0F, '\u0001');
                        fishing4.a.ae.a(glContext, ab.a(4, var5), fishing4.a.m.c(), 22.0F + var3 - (float)(var5 * 40) - 45.0F, 300.0F, 50.0F, 24.0F, 0, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                        fishing4.a.ae.a(glContext, ab.a(var16, var5, false), fishing4.a.m.c(), 22.0F + var3 - (float)(var5 * 40) - 45.0F, 300.0F, 50.0F, 24.0F, 1);
                     }
                  }
               } else if (i == 4) {
                  if (k < ad.l.size() && g == 3 && o == -1) {
                     var16 = (ac)ad.l.get(k);
                     fishing4.a.ae.a(glContext, var16.u(), fishing4.a.m.c(), 75.0F + var3 - 45.0F, 400.0F, 50.0F, 26.0F, 4, fishing4.a.aa.d());

                     for(var5 = 0; var5 < ab.e(3) - 1; ++var5) {
                        fishing4.a.m.a(glContext, s, fishing4.a.m.c(), var3 - (float)(var5 * 40) - 45.0F, 493.0F, 496.0F, 352.0F, 4.0F, '\u0001');
                        fishing4.a.ae.a(glContext, ab.a(3, var5), fishing4.a.m.c(), 22.0F + var3 - (float)(var5 * 40) - 45.0F, 300.0F, 50.0F, 24.0F, 0, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                        fishing4.a.ae.a(glContext, ab.a(var16, var5, false), fishing4.a.m.c(), 22.0F + var3 - (float)(var5 * 40) - 45.0F, 300.0F, 50.0F, 24.0F, 1);
                     }
                  }
               } else if (i == 5 && k < ad.n.size() && g == 3 && o == -1) {
                  var16 = (ac)ad.n.get(k);
                  fishing4.a.ae.a(glContext, var16.u(), fishing4.a.m.c(), 75.0F + var3 - 45.0F, 400.0F, 50.0F, 26.0F, 4, fishing4.a.aa.d());

                  for(var5 = 0; var5 < ab.e(5) - 1; ++var5) {
                     fishing4.a.m.a(glContext, s, fishing4.a.m.c(), var3 - (float)(var5 * 40) - 45.0F, 493.0F, 496.0F, 352.0F, 4.0F, '\u0001');
                     fishing4.a.ae.a(glContext, ab.a(5, var5), fishing4.a.m.c(), 22.0F + var3 - (float)(var5 * 40) - 45.0F, 300.0F, 50.0F, 24.0F, 0, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                     fishing4.a.ae.a(glContext, ab.a(var16, var5, false), fishing4.a.m.c(), 22.0F + var3 - (float)(var5 * 40) - 45.0F, 300.0F, 50.0F, 24.0F, 1);
                  }
               }

               switch (var1 / 4 % 8) {
                  case 2:
                  case 7:
                     var2 = 1.0F;
                     break;
                  case 3:
                  case 6:
                     var2 = 2.0F;
                     break;
                  case 4:
                  case 5:
                     var2 = 3.0F;
                     break;
                  default:
                     var2 = 0.0F;
               }

               if (j > 0) {
                  fishing4.a.m.a(glContext, s, 25.0F - var2, fishing4.a.m.d() + 130.0F - 38.0F, 910.0F, 937.0F, 34.0F, 48.0F, '\u0001');
               }

               if (j < 2) {
                  fishing4.a.m.a(glContext, s, (float)(fishing4.a.m.a() - 25) + var2, fishing4.a.m.d() + 130.0F - 38.0F, 910.0F, 937.0F, 34.0F, 48.0F, fishing4.a.g.b(), '\u0001');
               }

               fishing4.game.k.a(glContext, k / 12, 3, 75.0F + var3);
               var15 = ad.o;
               var8 = fishing4.a.e.a(fishing4.a.m.c(), var3 - 175.0F);
               fishing4.a.w var10 = s;
               var15.a(glContext, var8, t);
               M.a(glContext, s, t, fishing4.a.e.a(fishing4.a.m.c(), var3 - 215.0F));
               break;
            case 4:
               fishing4.a.m.a(glContext, t, fishing4.a.m.c() - 65.0F, var3 + 352.0F, 162.0F, 300.0F, 90.0F, 32.0F);
               fishing4.a.m.a(glContext, t, fishing4.a.m.c() - 10.0F, var3 + 352.0F, 372.0F, 300.0F, 30.0F, 32.0F);
               fishing4.a.m.a(glContext, t, 63.0F + fishing4.a.m.c(), var3 + 352.0F, 0.0F, 335.0F, 126.0F, 32.0F);
               if (globalConfig.languageId == 0) {
                  var13 = s;
                  var2 = fishing4.a.m.c();
                  if (i == 0) {
                     var12 = fishing4.a.aa.d();
                  } else {
                     var12 = fishing4.a.aa.b();
                  }

                  fishing4.a.m.a(glContext, var13, var2 - 138.0F, 12.0F + 280.0F + var3, 0.0F, 772.0F, 102.0F, 22.0F, var12);
                  var13 = s;
                  var2 = fishing4.a.m.c();
                  if (i == 0) {
                     var12 = fishing4.a.aa.d();
                  } else {
                     var12 = fishing4.a.aa.b();
                  }

                  fishing4.a.m.a(glContext, var13, var2 - 138.0F, 280.0F + var3 - 12.0F, 331.0F, 843.0F, 72.0F, 20.0F, var12);
                  var13 = s;
                  var2 = fishing4.a.m.c();
                  if (i == 1) {
                     var12 = fishing4.a.aa.d();
                  } else {
                     var12 = fishing4.a.aa.b();
                  }

                  fishing4.a.m.a(glContext, var13, var2, 12.0F + 280.0F + var3, 0.0F, 796.0F, 100.0F, 20.0F, var12);
                  var13 = s;
                  var2 = fishing4.a.m.c();
                  if (i == 1) {
                     var12 = fishing4.a.aa.d();
                  } else {
                     var12 = fishing4.a.aa.b();
                  }

                  fishing4.a.m.a(glContext, var13, var2, 280.0F + var3 - 12.0F, 331.0F, 843.0F, 72.0F, 20.0F, var12);
                  var13 = s;
                  var2 = fishing4.a.m.c();
                  if (i == 2) {
                     var12 = fishing4.a.aa.d();
                  } else {
                     var12 = fishing4.a.aa.b();
                  }

                  fishing4.a.m.a(glContext, var13, 138.0F + var2, var3 + 280.0F, 486.0F, 820.0F, 48.0F, 20.0F, var12);
               } else {
                  var13 = s;
                  var2 = fishing4.a.m.c();
                  if (i == 0) {
                     var12 = fishing4.a.aa.d();
                  } else {
                     var12 = fishing4.a.aa.b();
                  }

                  fishing4.a.m.a(glContext, var13, var2 - 138.0F, 12.0F + 280.0F + var3, 110.0F, 772.0F, 70.0F, 22.0F, var12);
                  var13 = s;
                  var2 = fishing4.a.m.c();
                  if (i == 0) {
                     var12 = fishing4.a.aa.d();
                  } else {
                     var12 = fishing4.a.aa.b();
                  }

                  fishing4.a.m.a(glContext, var13, var2 - 138.0F, 280.0F + var3 - 12.0F, 415.0F, 843.0F, 65.0F, 20.0F, var12);
                  var13 = s;
                  var2 = fishing4.a.m.c();
                  if (i == 1) {
                     var12 = fishing4.a.aa.d();
                  } else {
                     var12 = fishing4.a.aa.b();
                  }

                  fishing4.a.m.a(glContext, var13, var2, 12.0F + 280.0F + var3, 110.0F, 796.0F, 87.0F, 20.0F, var12);
                  var13 = s;
                  var2 = fishing4.a.m.c();
                  if (i == 1) {
                     var12 = fishing4.a.aa.d();
                  } else {
                     var12 = fishing4.a.aa.b();
                  }

                  fishing4.a.m.a(glContext, var13, var2, 280.0F + var3 - 12.0F, 415.0F, 843.0F, 65.0F, 20.0F, var12);
                  var13 = s;
                  var2 = fishing4.a.m.c();
                  if (i == 2) {
                     var12 = fishing4.a.aa.d();
                  } else {
                     var12 = fishing4.a.aa.b();
                  }

                  fishing4.a.m.a(glContext, var13, 138.0F + var2, var3 + 280.0F, 545.0F, 820.0F, 90.0F, 20.0F, var12);
               }

               var8 = fishing4.a.e.a(fishing4.a.m.c(), 520.0F);
               int var7;
               if (i == 0) {
                  var5 = 0;

                  for(var11 = 0; var11 < fishing4.game.w.c.size(); ++var11) {
                     if (j - fishing4.game.w.b.size() <= var11) {
                        fishing4.a.m.a(glContext, s, var8.a, var8.b - (float)(var5 * 54), 0.0F, 527.0F, 332.0F, 46.0F);
                        if (fishing4.game.w.a((Integer)fishing4.game.w.c.get(var11)).length() >= 17) {
                           fishing4.a.ae.a(glContext, fishing4.game.w.a((Integer)fishing4.game.w.c.get(var11)).substring(0, 17) + "...", var8.a, var8.b - (float)(var5 * 54), 300.0F, 54.0F, 26.0F, 4);
                        } else {
                           fishing4.a.ae.a(glContext, fishing4.game.w.a((Integer)fishing4.game.w.c.get(var11)), var8.a, var8.b - (float)(var5 * 54), 300.0F, 54.0F, 26.0F, 4);
                        }

                        fishing4.a.m.a(glContext, s, 20.0F + (var8.a - 166.0F), 12.0F + (var8.b - (float)(var5 * 54)), 145.0F, 726.0F, 52.0F, 36.0F);
                        var7 = var5 + 1;
                        var5 = var7;
                        if (var7 >= 10) {
                           if (j == 0) {
                              fishing4.game.k.a(glContext, fishing4.a.e.a(var8.a, var8.b - 243.0F), 297.0F, var1, 3);
                              return;
                           } else {
                              if (j == fishing4.game.w.b.size() + fishing4.game.w.c.size() + fishing4.game.w.d.size() - 10) {
                                 fishing4.game.k.a(glContext, fishing4.a.e.a(var8.a, var8.b - 243.0F), 297.0F, var1, 2);
                              } else {
                                 fishing4.game.k.b(glContext, fishing4.a.e.a(var8.a, var8.b - 243.0F), 297.0F, var1);
                              }

                              return;
                           }
                        }
                     }
                  }

                  for(var11 = 0; var11 < fishing4.game.w.d.size(); ++var11) {
                     if (j - fishing4.game.w.b.size() - fishing4.game.w.c.size() <= var11) {
                        fishing4.a.m.a(glContext, s, var8.a, var8.b - (float)(var5 * 54), 334.0F, 527.0F, 332.0F, 46.0F, (int)140);
                        if (fishing4.game.w.a((Integer)fishing4.game.w.d.get(var11)).length() >= 17) {
                           fishing4.a.ae.a(glContext, fishing4.game.w.a((Integer)fishing4.game.w.d.get(var11)).substring(0, 17) + "...", var8.a, var8.b - (float)(var5 * 54), 300.0F, 54.0F, 26.0F, 4);
                        } else {
                           fishing4.a.ae.a(glContext, fishing4.game.w.a((Integer)fishing4.game.w.d.get(var11)), var8.a, var8.b - (float)(var5 * 54), 300.0F, 54.0F, 26.0F, 4);
                        }

                        fishing4.a.m.a(glContext, s, 20.0F + (var8.a - 166.0F), 12.0F + (var8.b - (float)(var5 * 54)), 208.0F, 677.0F, 56.0F, 36.0F);
                        var7 = var5 + 1;
                        var5 = var7;
                        if (var7 >= 10) {
                           if (j == 0) {
                              fishing4.game.k.a(glContext, fishing4.a.e.a(var8.a, var8.b - 243.0F), 297.0F, var1, 3);
                              return;
                           } else {
                              if (j == fishing4.game.w.b.size() + fishing4.game.w.c.size() + fishing4.game.w.d.size() - 10) {
                                 fishing4.game.k.a(glContext, fishing4.a.e.a(var8.a, var8.b - 243.0F), 297.0F, var1, 2);
                              } else {
                                 fishing4.game.k.b(glContext, fishing4.a.e.a(var8.a, var8.b - 243.0F), 297.0F, var1);
                              }

                              return;
                           }
                        }
                     }
                  }

                  if (var5 == 0) {
                     fishing4.a.ae.a(glContext, fishing4.a.y.a(2131165306), fishing4.a.m.c(), fishing4.a.m.d() - 35.0F, 400.0F, 50.0F, 26.0F, 4);
                  }
               } else if (i == 1) {
                  var5 = 0;

                  for(var11 = 0; var11 < fishing4.game.v.c.size(); ++var11) {
                     if (j - fishing4.game.v.b.size() <= var11) {
                        fishing4.a.m.a(glContext, s, var8.a, var8.b - (float)(var5 * 54), 0.0F, 527.0F, 332.0F, 46.0F);
                        if (fishing4.game.v.a((Integer)fishing4.game.v.c.get(var11)).length() >= 17) {
                           fishing4.a.ae.a(glContext, fishing4.game.v.a((Integer)fishing4.game.v.c.get(var11)).substring(0, 17) + "...", var8.a, var8.b - (float)(var5 * 54), 300.0F, 54.0F, 26.0F, 4);
                        } else {
                           fishing4.a.ae.a(glContext, fishing4.game.v.a((Integer)fishing4.game.v.c.get(var11)), var8.a, var8.b - (float)(var5 * 54), 300.0F, 54.0F, 26.0F, 4);
                        }

                        fishing4.a.m.a(glContext, s, 20.0F + (var8.a - 166.0F), 12.0F + (var8.b - (float)(var5 * 54)), 145.0F, 726.0F, 52.0F, 36.0F);
                        var7 = var5 + 1;
                        var5 = var7;
                        if (var7 >= 10) {
                           if (j == 0) {
                              fishing4.game.k.a(glContext, fishing4.a.e.a(var8.a, var8.b - 243.0F), 297.0F, var1, 3);
                              return;
                           } else {
                              if (j == fishing4.game.v.b.size() + fishing4.game.v.c.size() + fishing4.game.v.d.size() - 10) {
                                 fishing4.game.k.a(glContext, fishing4.a.e.a(var8.a, var8.b - 243.0F), 297.0F, var1, 2);
                              } else {
                                 fishing4.game.k.b(glContext, fishing4.a.e.a(var8.a, var8.b - 243.0F), 297.0F, var1);
                              }

                              return;
                           }
                        }
                     }
                  }

                  for(var11 = 0; var11 < fishing4.game.v.d.size(); ++var11) {
                     if (j - fishing4.game.v.b.size() - fishing4.game.v.c.size() <= var11) {
                        fishing4.a.m.a(glContext, s, var8.a, var8.b - (float)(var5 * 54), 334.0F, 527.0F, 332.0F, 46.0F, (int)140);
                        if (fishing4.game.v.a((Integer)fishing4.game.v.d.get(var11)).length() >= 17) {
                           fishing4.a.ae.a(glContext, fishing4.game.v.a((Integer)fishing4.game.v.d.get(var11)).substring(0, 17) + "...", var8.a, var8.b - (float)(var5 * 54), 300.0F, 54.0F, 26.0F, 4);
                        } else {
                           fishing4.a.ae.a(glContext, fishing4.game.v.a((Integer)fishing4.game.v.d.get(var11)), var8.a, var8.b - (float)(var5 * 54), 300.0F, 54.0F, 26.0F, 4);
                        }

                        fishing4.a.m.a(glContext, s, 20.0F + (var8.a - 166.0F), 12.0F + (var8.b - (float)(var5 * 54)), 208.0F, 677.0F, 56.0F, 36.0F);
                        var7 = var5 + 1;
                        var5 = var7;
                        if (var7 >= 10) {
                           if (j == 0) {
                              fishing4.game.k.a(glContext, fishing4.a.e.a(var8.a, var8.b - 243.0F), 297.0F, var1, 3);
                              return;
                           } else {
                              if (j == fishing4.game.v.b.size() + fishing4.game.v.c.size() + fishing4.game.v.d.size() - 10) {
                                 fishing4.game.k.a(glContext, fishing4.a.e.a(var8.a, var8.b - 243.0F), 297.0F, var1, 2);
                              } else {
                                 fishing4.game.k.b(glContext, fishing4.a.e.a(var8.a, var8.b - 243.0F), 297.0F, var1);
                              }

                              return;
                           }
                        }
                     }
                  }

                  if (var5 == 0) {
                     fishing4.a.ae.a(glContext, fishing4.a.y.a(2131165306), fishing4.a.m.c(), fishing4.a.m.d() - 35.0F, 400.0F, 50.0F, 26.0F, 4);
                  }
               } else if (i == 2) {
                  if (fishing4.game.r.a == 0) {
                     fishing4.a.ae.a(glContext, fishing4.a.y.a(2131165307), fishing4.a.m.c(), fishing4.a.m.d() - 35.0F, 400.0F, 50.0F, 26.0F, 4);
                  } else if (fishing4.game.r.b <= 0 && fishing4.game.z.b() != 4) {
                     fishing4.a.m.a(glContext, s, var8.a, var8.b, 334.0F, 527.0F, 332.0F, 46.0F, (int)140);
                     if (fishing4.game.r.b().length() >= 17) {
                        fishing4.a.ae.a(glContext, fishing4.game.r.b().substring(0, 17) + "...", var8.a, var8.b, 300.0F, 54.0F, 26.0F, 4);
                     } else {
                        fishing4.a.ae.a(glContext, fishing4.game.r.b(), var8.a, var8.b, 300.0F, 54.0F, 26.0F, 4);
                     }

                     fishing4.a.m.a(glContext, s, 20.0F + (var8.a - 166.0F), 12.0F + var8.b, 208.0F, 677.0F, 56.0F, 36.0F);
                  } else {
                     fishing4.a.m.a(glContext, s, var8.a, var8.b, 0.0F, 527.0F, 332.0F, 46.0F);
                     if (fishing4.game.r.b().length() >= 17) {
                        fishing4.a.ae.a(glContext, fishing4.game.r.b().substring(0, 17) + "...", var8.a, var8.b, 300.0F, 54.0F, 26.0F, 4);
                     } else {
                        fishing4.a.ae.a(glContext, fishing4.game.r.b(), var8.a, var8.b, 300.0F, 54.0F, 26.0F, 4);
                     }

                     fishing4.a.m.a(glContext, s, 20.0F + (var8.a - 166.0F), 12.0F + var8.b, 145.0F, 726.0F, 52.0F, 36.0F);
                  }
               }
               break;
            case 5:
               fishing4.a.m.a(glContext, t, fishing4.a.m.c(), var3 + 352.0F, 259.0F, 300.0F, 110.0F, 32.0F);
               if (globalConfig.languageId == 0) {
                  var13 = t;
                  var2 = fishing4.a.m.c();
                  if (i == 0) {
                     var12 = fishing4.a.aa.d();
                  } else {
                     var12 = fishing4.a.aa.b();
                  }

                  fishing4.a.m.a(glContext, var13, var2 - 52.0F - 104.0F, var3 + 280.0F, 443.0F, 345.0F, 82.0F, 18.0F, var12);
                  var13 = t;
                  var2 = fishing4.a.m.c();
                  if (i == 1) {
                     var12 = fishing4.a.aa.d();
                  } else {
                     var12 = fishing4.a.aa.b();
                  }

                  fishing4.a.m.a(glContext, var13, var2 - 52.0F, var3 + 280.0F, 443.0F, 364.0F, 84.0F, 18.0F, var12);
                  var13 = t;
                  var2 = fishing4.a.m.c();
                  if (i == 2) {
                     var12 = fishing4.a.aa.d();
                  } else {
                     var12 = fishing4.a.aa.b();
                  }

                  fishing4.a.m.a(glContext, var13, 52.0F + var2, var3 + 280.0F, 443.0F, 383.0F, 64.0F, 16.0F, var12);
                  var13 = t;
                  var2 = fishing4.a.m.c();
                  if (i == 3) {
                     var12 = fishing4.a.aa.d();
                  } else {
                     var12 = fishing4.a.aa.b();
                  }

                  fishing4.a.m.a(glContext, var13, 104.0F + var2 + 52.0F, var3 + 280.0F, 443.0F, 401.0F, 82.0F, 18.0F, var12);
               } else {
                  var13 = t;
                  var2 = fishing4.a.m.c();
                  if (i == 0) {
                     var12 = fishing4.a.aa.d();
                  } else {
                     var12 = fishing4.a.aa.b();
                  }

                  fishing4.a.m.a(glContext, var13, var2 - 52.0F - 104.0F, var3 + 280.0F, 530.0F, 345.0F, 73.0F, 18.0F, var12);
                  var13 = t;
                  var2 = fishing4.a.m.c();
                  if (i == 1) {
                     var12 = fishing4.a.aa.d();
                  } else {
                     var12 = fishing4.a.aa.b();
                  }

                  fishing4.a.m.a(glContext, var13, var2 - 55.0F, var3 + 280.0F, 530.0F, 364.0F, 105.0F, 18.0F, var12);
                  var13 = t;
                  var2 = fishing4.a.m.c();
                  if (i == 2) {
                     var12 = fishing4.a.aa.d();
                  } else {
                     var12 = fishing4.a.aa.b();
                  }

                  fishing4.a.m.a(glContext, var13, 52.0F + var2, var3 + 280.0F, 510.0F, 383.0F, 53.0F, 16.0F, var12);
                  var13 = t;
                  var2 = fishing4.a.m.c();
                  if (i == 3) {
                     var12 = fishing4.a.aa.d();
                  } else {
                     var12 = fishing4.a.aa.b();
                  }

                  fishing4.a.m.a(glContext, var13, 104.0F + var2 + 52.0F, var3 + 280.0F, 530.0F, 401.0F, 58.0F, 18.0F, var12);
               }

               if (i == 0) {
                  a(glContext, var3);
               } else if (i == 1) {
                  a(glContext, var3, var1);
               } else if (i == 2) {
                  a(glContext, var3, j, var1);
               }
            case 6:
         }

         am.displayMessageBox(glContext, var1);
      }

   }

   public static void b() {
      m = 2;
   }

   public static void b(float var0, fishing4.a.e var1) {
      boolean var2 = false;
      boolean var3 = false;
      boolean var4 = false;
      if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), 150.0F + var0), fishing4.a.h.a(400.0F, 70.0F), var1)) {
         if (OptionsManager.a) {
            var2 = var4;
         } else {
            var2 = true;
         }

         OptionsManager.a = var2;
         if (var2) {
            fishing4.b.d.a().b(0.5F);
         } else {
            fishing4.b.d.a().b(0.0F);
         }

         OptionsManager.saveOptions();
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), 50.0F + var0), fishing4.a.h.a(400.0F, 70.0F), var1)) {
         if (!OptionsManager.b) {
            var2 = true;
         }

         OptionsManager.b = var2;
         if (var2) {
            fishing4.b.d.a().a(1.0F);
         } else {
            fishing4.b.d.a().a(0.0F);
         }

         OptionsManager.saveOptions();
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), var0 - 50.0F), fishing4.a.h.a(400.0F, 70.0F), var1)) {
         if (OptionsManager.c) {
            var2 = var3;
         } else {
            var2 = true;
         }

         OptionsManager.c = var2;
         if (var2) {
            OptionsManager.a(500);
         }

         OptionsManager.saveOptions();
      } else {
         fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), var0 - 150.0F), fishing4.a.h.a(400.0F, 70.0F), var1);
      }

   }

   public static void b(int var0) {
      n = var0;
   }

   public static void b(fishing4.a.e var0) {
      int var2 = 0;
      byte var4 = 0;
      byte var3 = 0;
      if (fishing4.game.z.d) {
         fishing4.game.z.d = false;
      } else {
         float var1 = fishing4.a.m.d() - 70.0F;
         fishing4.game.k.d();
         switch (g) {
            case 0:
            default:
               break;
            case 1:
               for(var2 = 0; var2 < r.length; ++var2) {
                  if (fishing4.a.f.a(r[var2], L, var0)) {
                     if (h == 2) {
                        g = 2;
                     } else if (h == 3) {
                        g = 5;
                     } else if (h == 0) {
                        g();
                        g = 3;
                     } else if (h == 1) {
                        fishing4.game.w.a();
                        fishing4.game.v.a();
                        g = 4;
                     }

                     m = 0;
                     return;
                  }
               }

               if (h == -1) {
                  a();
               }

               h = -1;
               break;
            case 2:
               if (!am.e()) {
                  if (am.c.a(var0, true)) {
                     am.b();
                  } else if (i == 1) {
                     var2 = ((ag)ad.h.get(k)).b.size();
                     if (var2 > 1) {
                        if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 190.0F, fishing4.a.m.d() - 35.0F), fishing4.a.h.a(50.0F, 50.0F), var0)) {
                           fishing4.game.m.g = false;
                           q = (p + 1) % var2;
                        } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 190.0F, fishing4.a.m.d() - 35.0F), fishing4.a.h.a(50.0F, 50.0F), var0)) {
                           fishing4.game.m.g = false;
                           q = (p + var2 - 1) % var2;
                        }
                     }
                  }
               } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 120.0F, var1 + 280.0F), fishing4.a.h.a(136.0F, 70.0F), var0)) {
                  o = 0;
                  m = 0;
               } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), var1 + 280.0F), fishing4.a.h.a(136.0F, 70.0F), var0)) {
                  o = 0;
                  m = 1;
               } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 120.0F, var1 + 280.0F), fishing4.a.h.a(136.0F, 70.0F), var0)) {
                  o = 0;
                  m = 2;
               } else if (i == 0) {
                  if (M.a(var0, true)) {
                     a();
                  }
               } else if (i == 1) {
                  if (M.a(var0, true)) {
                     fishing4.game.m.g = false;
                     q = 0;
                     H = 40;
                  } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 180.0F, fishing4.a.m.d() + 60.0F), fishing4.a.h.a(50.0F, 50.0F), var0)) {
                     o = (k + 1) % ad.h.size();
                  } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 180.0F, fishing4.a.m.d() + 60.0F), fishing4.a.h.a(50.0F, 50.0F), var0)) {
                     o = (k + ad.h.size() - 1) % ad.h.size();
                  }
               } else if (i == 2) {
                  for(var2 = var3; var2 < 24; ++var2) {
                     if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 150.0F + (float)(var2 % 5 * 75), 200.0F + var1 - (float)(var2 / 5 * 70)), fishing4.a.h.a(70.0F, 70.0F), var0)) {
                        o = var2;
                        return;
                     }
                  }
               }
               break;
            case 3:
               if (!am.e()) {
                  if (am.c.a(var0, true)) {
                     am.b();
                  }
               } else if (M.a(var0, true)) {
                  a();
               } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 32.0F - 68.0F - 68.0F, var1 + 280.0F), fishing4.a.h.a(68.0F, 70.0F), var0)) {
                  m = 0;
                  if (j > 0) {
                     n = 0;
                     g = 7;
                  }
               } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 32.0F - 68.0F, var1 + 280.0F), fishing4.a.h.a(68.0F, 70.0F), var0)) {
                  m = 1;
                  if (j > 0) {
                     n = 0;
                     g = 7;
                  }
               } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 32.0F, var1 + 280.0F), fishing4.a.h.a(68.0F, 70.0F), var0)) {
                  m = 2;
                  if (j > 0) {
                     n = 0;
                     g = 7;
                  }
               } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 32.0F, var1 + 280.0F), fishing4.a.h.a(68.0F, 70.0F), var0)) {
                  m = 3;
                  if (j > 0) {
                     n = 0;
                     g = 7;
                  }
               } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 32.0F + 68.0F, var1 + 280.0F), fishing4.a.h.a(68.0F, 70.0F), var0)) {
                  m = 4;
                  if (j > 0) {
                     n = 0;
                     g = 7;
                  }
               } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 32.0F + 68.0F + 68.0F, var1 + 280.0F), fishing4.a.h.a(68.0F, 70.0F), var0)) {
                  m = 5;
                  if (j > 0) {
                     n = 0;
                     g = 7;
                  }
               } else if (fishing4.a.f.a(fishing4.a.e.a(25.0F, fishing4.a.m.d() + 130.0F - 38.0F), fishing4.a.h.a(50.0F, 50.0F), var0)) {
                  if (j > 0) {
                     n = j - 1;
                     g = 7;
                  }
               } else if (fishing4.a.f.a(fishing4.a.e.a((float)(fishing4.a.m.a() - 25), fishing4.a.m.d() + 130.0F - 38.0F), fishing4.a.h.a(50.0F, 50.0F), var0)) {
                  if (j < 2) {
                     n = j + 1;
                     g = 8;
                  }
               } else {
                  for(var2 = 0; var2 < 12; ++var2) {
                     if (fishing4.a.f.a(fishing4.a.e.a(N[j * 12 + var2].a, N[j * 12 + var2].b), fishing4.a.h.a(60.0F, 60.0F), var0)) {
                        if (k == j * 12 + var2) {
                           if (i == 0) {
                              if (ad.a == k) {
                                 ad.a = -1;
                                 H = 101;
                              } else if (k < ad.i.size()) {
                                 if (fishing4.game.x.a(false) >= ((ac)ad.i.get(k)).r()) {
                                    ad.a = k;
                                    am.i = 2131034120;
                                    H = 100;
                                 } else {
                                    H = 102;
                                 }

                                 return;
                              }

                              return;
                           } else if (i == 1) {
                              if (ad.c == k) {
                                 ad.c = -1;
                                 H = 101;
                              } else if (k < ad.j.size()) {
                                 if (fishing4.game.x.a(false) >= ((ac)ad.j.get(k)).r()) {
                                    ad.c = k;
                                    am.i = 2131034120;
                                    H = 100;
                                 } else {
                                    H = 102;
                                 }

                                 return;
                              }

                              return;
                           } else if (i == 2) {
                              if (ad.b == k) {
                                 ad.b = -1;
                                 H = 101;
                              } else if (k < ad.k.size()) {
                                 if (fishing4.game.x.a(false) >= ((ac)ad.k.get(k)).r()) {
                                    ad.b = k;
                                    am.i = 2131034120;
                                    H = 100;
                                 } else {
                                    H = 102;
                                 }

                                 return;
                              }

                              return;
                           } else if (i == 3) {
                              if (ad.f == k) {
                                 av.f = -1;
                                 H = 103;
                              } else if (k < ad.m.size()) {
                                 if (fishing4.game.x.a(false) >= ((ac)ad.m.get(k)).r()) {
                                    av.f = k;
                                    H = 103;
                                 } else {
                                    H = 102;
                                 }

                                 return;
                              }

                              return;
                           } else if (i == 4) {
                              if (ad.e == k) {
                                 av.g = -1;
                                 H = 104;
                              } else if (k < ad.l.size()) {
                                 if (fishing4.game.x.a(false) >= ((ac)ad.l.get(k)).r()) {
                                    av.g = k;
                                    H = 104;
                                 } else {
                                    H = 102;
                                 }

                                 return;
                              }

                              return;
                           } else {
                              if (i == 5) {
                                 if (ad.d == k) {
                                    av.h = -1;
                                    H = 105;
                                 } else if (k < ad.n.size()) {
                                    if (fishing4.game.x.a(false) >= ((ac)ad.n.get(k)).r()) {
                                       av.h = k;
                                       H = 105;
                                    } else {
                                       H = 102;
                                    }

                                    return;
                                 }

                                 return;
                              }

                              return;
                           }
                        } else {
                           o = var2 + j * 12;
                           return;
                        }
                     }
                  }

                  return;
               }
               break;
            case 4:
               if (am.e) {
                  if (am.c.a(var0, true)) {
                     am.b();
                  }
               } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 120.0F, var1 + 280.0F), fishing4.a.h.a(136.0F, 70.0F), var0)) {
                  m = 0;
               } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), var1 + 280.0F), fishing4.a.h.a(136.0F, 70.0F), var0)) {
                  m = 1;
               } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 120.0F, var1 + 280.0F), fishing4.a.h.a(136.0F, 70.0F), var0)) {
                  m = 2;
               } else {
                  fishing4.a.e var5 = fishing4.a.e.a(fishing4.a.m.c(), 520.0F);
                  if (i != 0) {
                     if (i == 1) {
                        for(var2 = var4; var2 < fishing4.game.v.c.size(); ++var2) {
                           if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), var5.b - (float)(var2 * 54)), fishing4.a.h.a(332.0F, 46.0F), var0)) {
                              o = var2;
                              H = 112;
                              return;
                           }
                        }

                        for(var2 = fishing4.game.v.c.size(); var2 < fishing4.game.v.c.size() + fishing4.game.v.d.size(); ++var2) {
                           if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), var5.b - (float)(var2 * 54)), fishing4.a.h.a(332.0F, 46.0F), var0)) {
                              o = var2;
                              H = 113;
                              return;
                           }
                        }

                        return;
                     } else if (i == 2 && fishing4.game.r.a != 0 && fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), var5.b), fishing4.a.h.a(332.0F, 46.0F), var0)) {
                        H = 114;
                     }
                  } else {
                     while(var2 < fishing4.game.w.c.size()) {
                        if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), var5.b - (float)(var2 * 54)), fishing4.a.h.a(332.0F, 46.0F), var0)) {
                           o = var2;
                           H = 110;
                           return;
                        }

                        ++var2;
                     }

                     for(var2 = fishing4.game.w.c.size(); var2 < fishing4.game.w.c.size() + fishing4.game.w.d.size(); ++var2) {
                        if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), var5.b - (float)(var2 * 54)), fishing4.a.h.a(332.0F, 46.0F), var0)) {
                           o = var2;
                           H = 111;
                           return;
                        }
                     }

                     return;
                  }
               }
               break;
            case 5:
               if (am.e) {
                  if (am.b == 150) {
                     if (am.c.a(var0, true)) {
                        am.b();
                        e = false;
                        fishing4.game.z.a(2);
                     } else if (am.d.a(var0, true)) {
                        am.b();
                     }
                  } else if (am.b == 121) {
                     e(var0);
                  } else if (am.b == 123) {
                     f(var0);
                  } else if (am.c.a(var0, true)) {
                     am.b();
                  }
               } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 150.0F, var1 + 280.0F), fishing4.a.h.a(102.0F, 70.0F), var0)) {
                  m = 0;
                  n = 0;
                  o = 0;
                  q = 0;
               } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 50.0F, var1 + 280.0F), fishing4.a.h.a(102.0F, 70.0F), var0)) {
                  m = 1;
                  n = 0;
                  o = 0;
                  q = 0;
               } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 50.0F, var1 + 280.0F), fishing4.a.h.a(102.0F, 70.0F), var0)) {
                  m = 2;
                  n = 0;
                  o = 0;
                  q = 0;
                  y = 0;
                  z = 0;
               } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 150.0F, var1 + 280.0F), fishing4.a.h.a(102.0F, 70.0F), var0)) {
                  H = 150;
               } else if (i == 0) {
                  b(var1, var0);
               } else if (i == 1) {
                  c(var1, var0);
               } else if (i == 2) {
                  a(var1, var0);
               }
         }
      }

   }

   private static void b(GL10 var0, float var1) {
      am.a(var0, s, fishing4.a.e.a(fishing4.a.m.c(), 35.0F + var1), fishing4.a.g.b(18.9F, 22.0F));
      fishing4.a.m.a(var0, s, fishing4.a.m.c(), var1 + 352.0F, 359.0F, 865.0F, 366.0F, 68.0F, fishing4.a.g.c());
      fishing4.a.m.a(var0, s, fishing4.a.m.c(), var1 + 352.0F, 0.0F, 866.0F, 356.0F, 64.0F, fishing4.a.g.c(), '\u0002');
      fishing4.a.m.a(var0, s, fishing4.a.m.c(), var1 + 352.0F, 0.0F, 866.0F, 356.0F, 64.0F, fishing4.a.g.c(), '\u0002');
      fishing4.a.m.a(var0, s, fishing4.a.m.c(), var1 + 352.0F, 0.0F, 866.0F, 356.0F, 64.0F, fishing4.a.g.c(), '\u0002');
      fishing4.a.m.a(var0, s, fishing4.a.m.c() - 201.0F, var1 - 6.0F, 948.0F, 6.0F, 10.0F, 492.0F, (int)150);
      fishing4.a.m.a(var0, s, 201.0F + fishing4.a.m.c(), var1 - 6.0F, 1014.0F, 6.0F, 10.0F, 492.0F, (int)150);
      fishing4.a.m.a(var0, s, fishing4.a.m.c(), var1 - 6.0F, 958.0F, 6.0F, 56.0F, 492.0F, fishing4.a.g.b(7.0F), (int)150);
      float var2;
      float var3;
      int var4;
      short var5;
      fishing4.a.w var6;
      fishing4.a.g var7;
      fishing4.a.g var8;
      fishing4.a.w var9;
      switch (g) {
         case 2:
         case 4:
            for(var4 = 0; var4 < 3; ++var4) {
               var9 = s;
               var2 = fishing4.a.m.c();
               var3 = (float)((var4 - 1) * 138);
               var8 = fishing4.a.g.c(1.6521739F);
               if (var4 == i) {
                  var5 = 150;
               } else {
                  var5 = 80;
               }

               fishing4.a.m.a(var0, var9, var3 + (var2 - 64.0F), var1 + 278.0F, 105.0F, 677.0F, 10.0F, 46.0F, var8, (int)var5);
               var6 = s;
               var3 = fishing4.a.m.c();
               var2 = (float)((var4 - 1) * 138);
               var7 = fishing4.a.g.c(1.6521739F);
               if (var4 == i) {
                  var5 = 150;
               } else {
                  var5 = 80;
               }

               fishing4.a.m.a(var0, var6, var2 + var3 + 64.0F, var1 + 278.0F, 196.0F, 677.0F, 10.0F, 46.0F, var7, (int)var5);
               var9 = s;
               var3 = fishing4.a.m.c();
               var2 = (float)((var4 - 1) * 138);
               var8 = fishing4.a.g.b(1.475F, 1.6521739F);
               if (var4 == i) {
                  var5 = 150;
               } else {
                  var5 = 80;
               }

               fishing4.a.m.a(var0, var9, var2 + var3, var1 + 278.0F, 116.0F, 677.0F, 80.0F, 46.0F, var8, (int)var5);
            }

            return;
         case 3:
         case 7:
         case 8:
            for(var4 = 0; var4 < 6; ++var4) {
               var6 = s;
               var3 = fishing4.a.m.c();
               var2 = (float)((var4 - 1) * 69);
               var7 = fishing4.a.g.c(1.6521739F);
               if (var4 == i) {
                  var5 = 150;
               } else {
                  var5 = 80;
               }

               fishing4.a.m.a(var0, var6, var2 + (var3 - 68.0F - 35.0F - 29.0F), var1 + 278.0F, 105.0F, 677.0F, 10.0F, 46.0F, var7, (int)var5);
               var6 = s;
               var3 = fishing4.a.m.c();
               var2 = (float)((var4 - 1) * 69);
               var7 = fishing4.a.g.c(1.6521739F);
               if (var4 == i) {
                  var5 = 150;
               } else {
                  var5 = 80;
               }

               fishing4.a.m.a(var0, var6, var2 + var3 - 68.0F - 35.0F + 29.0F, var1 + 278.0F, 196.0F, 677.0F, 10.0F, 46.0F, var7, (int)var5);
               var6 = s;
               var3 = fishing4.a.m.c();
               var2 = (float)((var4 - 1) * 69);
               var7 = fishing4.a.g.b(0.6F, 1.6521739F);
               if (var4 == i) {
                  var5 = 150;
               } else {
                  var5 = 80;
               }

               fishing4.a.m.a(var0, var6, var2 + (var3 - 68.0F - 35.0F), var1 + 278.0F, 116.0F, 677.0F, 80.0F, 46.0F, var7, (int)var5);
            }

            return;
         case 5:
            for(var4 = 0; var4 < 4; ++var4) {
               var6 = s;
               var3 = fishing4.a.m.c();
               var2 = (float)((var4 - 1) * 104);
               var7 = fishing4.a.g.c(1.6521739F);
               if (var4 == i) {
                  var5 = 150;
               } else {
                  var5 = 80;
               }

               fishing4.a.m.a(var0, var6, var2 + (var3 - 52.0F - 46.0F), var1 + 278.0F, 105.0F, 677.0F, 10.0F, 46.0F, var7, (int)var5);
               var9 = s;
               var2 = fishing4.a.m.c();
               var3 = (float)((var4 - 1) * 104);
               var8 = fishing4.a.g.c(1.6521739F);
               if (var4 == i) {
                  var5 = 150;
               } else {
                  var5 = 80;
               }

               fishing4.a.m.a(var0, var9, var3 + var2 - 52.0F + 46.0F, var1 + 278.0F, 196.0F, 677.0F, 10.0F, 46.0F, var8, (int)var5);
               var9 = s;
               var3 = fishing4.a.m.c();
               var2 = (float)((var4 - 1) * 104);
               var8 = fishing4.a.g.b(1.025F, 1.6521739F);
               if (var4 == i) {
                  var5 = 150;
               } else {
                  var5 = 80;
               }

               fishing4.a.m.a(var0, var9, var2 + (var3 - 52.0F), var1 + 278.0F, 116.0F, 677.0F, 80.0F, 46.0F, var8, (int)var5);
            }
         case 6:
      }

   }

   public static void b(GL10 var0, float var1, int var2) {
      if (j == 0) {
         fishing4.a.m.a(var0, s, fishing4.a.m.c(), var1 + 150.0F, 794.0F, 577.0F, 140.0F, 64.0F);
         if (globalConfig.languageId == 0) {
            fishing4.a.m.a(var0, t, fishing4.a.m.c() - 25.0F, var1 + 100.0F, 385.0F, 488.0F, 46.0F, 20.0F);
            fishing4.a.m.a(var0, t, 25.0F + fishing4.a.m.c(), var1 + 100.0F, 523.0F, 488.0F, 46.0F, 20.0F);
         } else {
            fishing4.a.m.a(var0, t, fishing4.a.m.c() - 25.0F, var1 + 100.0F, 752.0F, 487.0F, 42.0F, 20.0F);
            fishing4.a.m.a(var0, t, 25.0F + fishing4.a.m.c(), var1 + 100.0F, 882.0F, 486.0F, 52.0F, 20.0F);
         }

         fishing4.a.m.a(var0, s, fishing4.a.m.c(), var1 - 50.0F, 821.0F, 645.0F, 112.0F, 86.0F);
         if (globalConfig.languageId == 0) {
            fishing4.a.m.a(var0, t, fishing4.a.m.c() - 35.0F, var1 - 120.0F, 441.0F, 488.0F, 70.0F, 20.0F);
            fishing4.a.m.a(var0, t, 30.0F + fishing4.a.m.c(), var1 - 120.0F, 523.0F, 488.0F, 46.0F, 20.0F);
         } else {
            fishing4.a.m.a(var0, t, fishing4.a.m.c() - 35.0F, var1 - 120.0F, 803.0F, 486.0F, 60.0F, 20.0F);
            fishing4.a.m.a(var0, t, 30.0F + fishing4.a.m.c(), var1 - 120.0F, 882.0F, 486.0F, 52.0F, 20.0F);
         }
      } else {
         float var3;
         int var4;
         int var5;
         int var6;
         fishing4.a.aa var7;
         fishing4.a.w var8;
         if (j >= 10 && j <= 12) {
            if (globalConfig.languageId == 0) {
               fishing4.a.m.a(var0, t, fishing4.a.m.c() - 25.0F, var1 + 220.0F, 385.0F, 488.0F, 46.0F, 20.0F);
               fishing4.a.m.a(var0, t, 25.0F + fishing4.a.m.c(), var1 + 220.0F, 523.0F, 488.0F, 46.0F, 20.0F);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 10) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, var3 - 120.0F, var1 + 180.0F, 581.0F, 488.0F, 46.0F, 20.0F, var7);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 11) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, var3, var1 + 180.0F, 639.0F, 488.0F, 46.0F, 20.0F, var7);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 12) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, 120.0F + var3, var1 + 180.0F, 696.0F, 488.0F, 46.0F, 20.0F, var7);
            } else {
               fishing4.a.m.a(var0, t, fishing4.a.m.c() - 25.0F, var1 + 220.0F, 752.0F, 487.0F, 42.0F, 20.0F);
               fishing4.a.m.a(var0, t, 25.0F + fishing4.a.m.c(), var1 + 220.0F, 882.0F, 486.0F, 52.0F, 20.0F);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 10) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, var3 - 120.0F, var1 + 180.0F, 765.0F, 467.0F, 30.0F, 16.0F, var7);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 11) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, var3, var1 + 180.0F, 837.0F, 465.0F, 32.0F, 18.0F, var7);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 12) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, 120.0F + var3, var1 + 180.0F, 911.0F, 466.0F, 42.0F, 18.0F, var7);
            }

            for(var4 = 0; var4 < 5; ++var4) {
               var5 = fishing4.a.r.Z[k + var4];
               var6 = fishing4.a.r.Z[k + var4];
               if (j - 10 == 2) {
                  var5 = var5 + 1 - 144;
               } else {
                  ++var5;
               }

               if (!fishing4.a.r.aa[k + var4].equals("11111111111") && !fishing4.a.r.aa[k + var4].equals("1111")) {
                  if (fishing4.game.m.c(var6).length() > 13) {
                     fishing4.a.ae.a(var0, var5 + ". " + fishing4.game.m.c(var6).substring(0, 13) + "...", fishing4.a.m.c(), 70.0F + var1 - (float)(var4 * 50), 300.0F, 50.0F, 26.0F, 0);
                  } else {
                     fishing4.a.ae.a(var0, var5 + ". " + fishing4.game.m.c(var6), fishing4.a.m.c(), 70.0F + var1 - (float)(var4 * 50), 300.0F, 50.0F, 26.0F, 0);
                  }
               } else {
                  fishing4.a.ae.a(var0, var5 + ". ?????", fishing4.a.m.c(), 70.0F + var1 - (float)(var4 * 50), 300.0F, 50.0F, 26.0F, 0);
               }

               fishing4.a.m.a(var0, s, fishing4.a.m.c(), 70.0F + var1 - 22.0F - (float)(var4 * 50), 493.0F, 496.0F, 352.0F, 4.0F, '\u0001');
            }

            fishing4.game.k.b(var0, fishing4.a.e.a(fishing4.a.m.c(), var1 - 40.0F), 160.0F, var2);
            fishing4.game.k.b();
         } else if (j >= 20 && j <= 22) {
            if (globalConfig.languageId == 0) {
               fishing4.a.m.a(var0, t, fishing4.a.m.c() - 35.0F, var1 + 220.0F, 441.0F, 488.0F, 70.0F, 20.0F);
               fishing4.a.m.a(var0, t, 30.0F + fishing4.a.m.c(), var1 + 220.0F, 523.0F, 488.0F, 46.0F, 20.0F);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 20) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, var3 - 120.0F, var1 + 180.0F, 581.0F, 488.0F, 46.0F, 20.0F, var7);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 21) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, var3, var1 + 180.0F, 639.0F, 488.0F, 46.0F, 20.0F, var7);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 22) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, 120.0F + var3, var1 + 180.0F, 696.0F, 488.0F, 46.0F, 20.0F, var7);
            } else {
               fishing4.a.m.a(var0, t, fishing4.a.m.c() - 35.0F, var1 + 220.0F, 803.0F, 486.0F, 60.0F, 20.0F);
               fishing4.a.m.a(var0, t, 30.0F + fishing4.a.m.c(), var1 + 220.0F, 882.0F, 486.0F, 52.0F, 20.0F);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 20) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, var3 - 120.0F, var1 + 180.0F, 765.0F, 467.0F, 30.0F, 16.0F, var7);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 21) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, var3, var1 + 180.0F, 837.0F, 465.0F, 32.0F, 18.0F, var7);
               var8 = t;
               var3 = fishing4.a.m.c();
               if (j == 22) {
                  var7 = fishing4.a.aa.d();
               } else {
                  var7 = fishing4.a.aa.b();
               }

               fishing4.a.m.a(var0, var8, 120.0F + var3, var1 + 180.0F, 911.0F, 466.0F, 42.0F, 18.0F, var7);
            }

            for(var4 = 0; var4 < 5; ++var4) {
               var5 = fishing4.a.r.Z[k + var4];
               var6 = fishing4.a.r.Z[k + var4];
               if (j - 20 == 2) {
                  var5 = var5 + 1 - 144;
               } else {
                  ++var5;
               }

               if (!fishing4.a.r.aa[k + var4].equals("11111111111") && !fishing4.a.r.aa[k + var4].equals("1111")) {
                  if (fishing4.game.m.c(var6).length() > 13) {
                     fishing4.a.ae.a(var0, var5 + ". " + fishing4.game.m.c(var6).substring(0, 13) + "...", fishing4.a.m.c(), 70.0F + var1 - (float)(var4 * 50), 300.0F, 50.0F, 26.0F, 0);
                  } else {
                     fishing4.a.ae.a(var0, var5 + ". " + fishing4.game.m.c(var6), fishing4.a.m.c(), 70.0F + var1 - (float)(var4 * 50), 300.0F, 50.0F, 26.0F, 0);
                  }
               } else {
                  fishing4.a.ae.a(var0, var5 + ". ?????", fishing4.a.m.c(), 70.0F + var1 - (float)(var4 * 50), 300.0F, 50.0F, 26.0F, 0);
               }

               fishing4.a.m.a(var0, s, fishing4.a.m.c(), 70.0F + var1 - 22.0F - (float)(var4 * 50), 493.0F, 496.0F, 352.0F, 4.0F, '\u0001');
            }

            fishing4.game.k.b(var0, fishing4.a.e.a(fishing4.a.m.c(), var1 - 40.0F), 160.0F, var2);
            fishing4.game.k.b();
         }
      }

   }

   public static void c() {
      if (l != -1) {
         h = l;
      }

      if (m != -1) {
         i = m;
      }

      if (n != -1) {
         j = n;
      }

      if (o != -1) {
         k = o;
      }

      if (q != -1) {
         p = q;
      }

      if (H != -1) {
         am.a(H);
      }

      H = -1;
      q = -1;
      o = -1;
      n = -1;
      m = -1;
      l = -1;
   }

   public static void c(float var0, fishing4.a.e var1) {
      int var2 = 0;
      if (j == 0) {
         if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), 150.0F + var0), fishing4.a.h.a(180.0F, 110.0F), var1)) {
            n = 10;
         } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), var0 - 50.0F), fishing4.a.h.a(180.0F, 120.0F), var1)) {
            n = 20;
         }
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 120.0F, var0 + 180.0F), fishing4.a.h.a(136.0F, 50.0F), var1)) {
         o = 0;
         n = j / 10 * 10;
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), var0 + 180.0F), fishing4.a.h.a(136.0F, 50.0F), var1)) {
         o = 0;
         n = j / 10 * 10 + 1;
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 120.0F, var0 + 180.0F), fishing4.a.h.a(136.0F, 50.0F), var1)) {
         o = 144;
         n = j / 10 * 10 + 2;
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), var0 - 40.0F + 160.0F), fishing4.a.h.a(50.0F, 50.0F), var1)) {
         if (j % 10 == 0) {
            if (k > 4) {
               o = k - 5;
            } else if (k == 0) {
               o = 182;
            } else {
               o = 0;
            }
         } else if (j % 10 == 1) {
            if (k > 4) {
               o = k - 5;
            } else if (k == 0) {
               o = 139;
            } else {
               o = 0;
            }
         } else if (j % 10 == 2) {
            if (k > 148) {
               o = k - 5;
            } else if (k == 144) {
               o = 182;
            } else {
               o = 144;
            }
         }
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), var0 - 40.0F - 160.0F), fishing4.a.h.a(50.0F, 50.0F), var1)) {
         if (j % 10 == 0) {
            if (k + 5 < 182) {
               o = k + 5;
            } else if (k == 182) {
               o = 0;
            } else {
               o = 182;
            }
         } else if (j % 10 == 1) {
            if (k + 5 < 139) {
               o = k + 5;
            } else if (k == 139) {
               o = 0;
            } else {
               o = 139;
            }
         } else if (j % 10 == 2) {
            if (k + 5 < 182) {
               o = k + 5;
            } else if (k == 182) {
               o = 144;
            } else {
               o = 182;
            }
         }
      } else {
         while(var2 < 5) {
            if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), 70.0F + var0 - (float)(var2 * 50)), fishing4.a.h.a(300.0F, 50.0F), var1)) {
               if (j >= 10 && j <= 12) {
                  if (fishing4.game.s.a[k + var2] != 0.0F) {
                     q = var2 + k;
                     H = 120;
                  }
               } else if (j >= 20 && j <= 22 && fishing4.game.s.b[k + var2] != 0.0F) {
                  q = var2 + k;
                  H = 122;
               }
               break;
            }

            ++var2;
         }
      }

   }

   public static void c(int var0) {
      o = var0;
   }

   public static void c(fishing4.a.e var0) {
      if (!am.e || am.b == 40 || am.b == 121 || am.b == 123) {
         switch (g) {
            case 0:
            case 1:
            case 4:
            default:
               break;
            case 2:
               if (!fishing4.game.z.d && i == 1) {
                  if (am.e && am.b == 40) {
                     int var1 = ((ag)ad.h.get(k)).b.size();
                     if (var1 > 0) {
                        if (fishing4.game.z.c.a < var0.a && fishing4.game.z.c.a + 70.0F < var0.a) {
                           fishing4.game.m.g = false;
                           q = (p + var1 - 1) % var1;
                           fishing4.game.z.d = true;
                        } else if (var0.a < fishing4.game.z.c.a && var0.a + 70.0F < fishing4.game.z.c.a) {
                           fishing4.game.m.g = false;
                           q = (p + 1) % var1;
                           fishing4.game.z.d = true;
                        }
                     }
                  } else if (fishing4.game.z.c.a < var0.a && fishing4.game.z.c.a + 70.0F < var0.a) {
                     o = (k + ad.h.size() - 1) % ad.h.size();
                     fishing4.game.z.d = true;
                  } else if (var0.a < fishing4.game.z.c.a && var0.a + 70.0F < fishing4.game.z.c.a) {
                     o = (k + 1) % ad.h.size();
                     fishing4.game.z.d = true;
                  }
               }
               break;
            case 3:
               if (!fishing4.game.z.d) {
                  if (fishing4.game.z.c.a < var0.a && fishing4.game.z.c.a + 70.0F < var0.a) {
                     if (j > 0) {
                        n = j - 1;
                        g = 7;
                     }

                     fishing4.game.z.d = true;
                  } else if (var0.a < fishing4.game.z.c.a && var0.a + 70.0F < fishing4.game.z.c.a) {
                     if (j < 2) {
                        n = j + 1;
                        g = 8;
                     }

                     fishing4.game.z.d = true;
                  }
               }
               break;
            case 5:
               if (i == 1) {
                  g(var0);
               } else if (i == 2) {
                  d(var0);
               }
         }
      }

   }

   public static void d() {
      if (fishing4.game.k.l != null) {
         fishing4.game.k.l.dismiss();
         fishing4.game.k.l = null;
      }

      f = true;
      K = fishing4.a.y.a();
   }

   public static void d(float var0, fishing4.a.e var1) {
      int var2 = 0;
      if (j == 0) {
         if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), 150.0F + var0), fishing4.a.h.a(180.0F, 110.0F), var1)) {
            fishing4.a.r.Y = 0;
            am.a(60);
         } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), var0 - 50.0F), fishing4.a.h.a(180.0F, 120.0F), var1)) {
            fishing4.a.r.Y = 1;
            am.a(60);
         }
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 120.0F, var0 + 180.0F), fishing4.a.h.a(136.0F, 50.0F), var1)) {
         o = 0;
         n = j / 10 * 10;
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), var0 + 180.0F), fishing4.a.h.a(136.0F, 50.0F), var1)) {
         o = 0;
         n = j / 10 * 10 + 1;
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 120.0F, var0 + 180.0F), fishing4.a.h.a(136.0F, 50.0F), var1)) {
         o = 144;
         n = j / 10 * 10 + 2;
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), var0 - 40.0F + 160.0F), fishing4.a.h.a(50.0F, 50.0F), var1)) {
         if (j % 10 == 0) {
            if (k > 4) {
               o = k - 5;
            } else if (k == 0) {
               o = 182;
            } else {
               o = 0;
            }
         } else if (j % 10 == 1) {
            if (k > 4) {
               o = k - 5;
            } else if (k == 0) {
               o = 139;
            } else {
               o = 0;
            }
         } else if (j % 10 == 2) {
            if (k > 148) {
               o = k - 5;
            } else if (k == 144) {
               o = 182;
            } else {
               o = 144;
            }
         }
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), var0 - 40.0F - 160.0F), fishing4.a.h.a(50.0F, 50.0F), var1)) {
         if (j % 10 == 0) {
            if (k + 5 < 182) {
               o = k + 5;
            } else if (k == 182) {
               o = 0;
            } else {
               o = 182;
            }
         } else if (j % 10 == 1) {
            if (k + 5 < 139) {
               o = k + 5;
            } else if (k == 139) {
               o = 0;
            } else {
               o = 139;
            }
         } else if (j % 10 == 2) {
            if (k + 5 < 182) {
               o = k + 5;
            } else if (k == 182) {
               o = 144;
            } else {
               o = 182;
            }
         }
      } else {
         while(var2 < 5) {
            if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), 70.0F + var0 - (float)(var2 * 50)), fishing4.a.h.a(300.0F, 50.0F), var1)) {
               if (j >= 10 && j <= 12) {
                  if (!fishing4.a.r.aa[k + var2].equals("11111111111") && !fishing4.a.r.aa[k + var2].equals("1111")) {
                     q = var2 + k;
                     H = 61;
                  }
               } else if (j >= 20 && j <= 22 && !fishing4.a.r.aa[k + var2].equals("11111111111") && !fishing4.a.r.aa[k + var2].equals("1111")) {
                  q = var2 + k;
                  H = 63;
               }
               break;
            }

            ++var2;
         }
      }

   }

   public static void d(int var0) {
      q = var0;
   }

   public static void d(fishing4.a.e var0) {
      if (fishing4.game.z.c.b < var0.b && fishing4.game.z.c.b + 10.0F < var0.b) {
         fishing4.game.z.c.a(var0);
         fishing4.game.z.d = true;
         if (y < z) {
            y += 10;
         }
      } else if (var0.b < fishing4.game.z.c.b && var0.b + 10.0F < fishing4.game.z.c.b) {
         fishing4.game.z.c.a(var0);
         fishing4.game.z.d = true;
         if (y > 0) {
            y -= 10;
         }
      }

   }

   public static void e(fishing4.a.e var0) {
      if (am.c.a(var0, true)) {
         am.b();
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 190.0F, fishing4.a.m.d() - 35.0F), fishing4.a.h.a(50.0F, 50.0F), var0)) {
         h();
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 190.0F, fishing4.a.m.d() - 35.0F), fishing4.a.h.a(50.0F, 50.0F), var0)) {
         i();
      }

   }

   public static boolean e() {
      boolean var0;
      if (f && fishing4.a.y.a() - K > 5000L) {
         var0 = true;
      } else {
         var0 = false;
      }

      return var0;
   }

   public static void f() {
      fishing4.game.k.b();
      System.exit(0);
   }

   public static void f(fishing4.a.e var0) {
      if (am.c.a(var0, true)) {
         am.b();
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 190.0F, fishing4.a.m.d() - 35.0F), fishing4.a.h.a(50.0F, 50.0F), var0)) {
         j();
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 190.0F, fishing4.a.m.d() - 35.0F), fishing4.a.h.a(50.0F, 50.0F), var0)) {
         k();
      }

   }

   private static void g() {
      N = null;
      N = new fishing4.a.e[36];

      for(int var0 = 0; var0 < N.length; ++var0) {
         fishing4.a.e var1 = a(var0, 0);
         N[var0] = fishing4.a.e.a(var1.a, var1.b);
      }

   }

   public static void g(fishing4.a.e var0) {
      if (j >= 10 && j <= 12 || j >= 20 && j <= 22) {
         if (am.e) {
            if (!fishing4.game.z.d) {
               if (fishing4.game.z.c.a < var0.a && fishing4.game.z.c.a + 70.0F < var0.a) {
                  if (j >= 10 && j <= 12) {
                     h();
                     fishing4.game.z.d = true;
                  } else if (j >= 20 && j <= 22) {
                     j();
                     fishing4.game.z.d = true;
                  }
               } else if (var0.a < fishing4.game.z.c.a && var0.a + 70.0F < fishing4.game.z.c.a) {
                  if (j >= 10 && j <= 12) {
                     i();
                     fishing4.game.z.d = true;
                  } else if (j >= 20 && j <= 22) {
                     k();
                     fishing4.game.z.d = true;
                  }
               }
            }
         } else if (fishing4.game.z.c.b < var0.b && fishing4.game.z.c.b + 50.0F < var0.b) {
            if (j % 10 == 0) {
               o = (k + 1) % 183;
            } else if (j % 10 == 1) {
               o = (k + 1) % 140;
            } else if (j % 10 == 2) {
               if (k < 182) {
                  o = k + 1;
               } else {
                  o = 144;
               }
            }

            fishing4.game.z.c.a(var0);
            fishing4.game.z.d = true;
         } else if (var0.b < fishing4.game.z.c.b && var0.b + 50.0F < fishing4.game.z.c.b) {
            if (j % 10 == 0) {
               o = (k + 183 - 1) % 183;
            } else if (j % 10 == 1) {
               o = (k + 140 - 1) % 140;
            } else if (j % 10 == 2) {
               if (k > 144) {
                  o = k - 1;
               } else {
                  o = 182;
               }
            }

            fishing4.game.z.c.a(var0);
            fishing4.game.z.d = true;
         }
      }

   }

   private static void h() {
      if (fishing4.game.s.c > 1) {
         int var1 = p;

         int var0;
         do {
            if (j % 10 == 0) {
               var0 = (var1 + 187 - 1) % 187;
            } else if (j % 10 == 1) {
               var0 = (var1 + 144 - 1) % 144;
            } else {
               var0 = var1;
               if (j % 10 == 2) {
                  if (var1 > 144) {
                     var0 = var1 - 1;
                  } else {
                     var0 = 186;
                  }
               }
            }

            var1 = var0;
         } while(fishing4.game.s.a[var0] == 0.0F);

         q = var0;
         fishing4.game.m.g = false;
      }

   }

   public static void h(fishing4.a.e var0) {
      if (j >= 10 && j <= 12 || j >= 20 && j <= 22) {
         if (am.e) {
            if (!fishing4.game.z.d) {
               if (fishing4.game.z.c.a < var0.a && fishing4.game.z.c.a + 70.0F < var0.a) {
                  l();
                  fishing4.game.z.d = true;
               } else if (var0.a < fishing4.game.z.c.a && var0.a + 70.0F < fishing4.game.z.c.a) {
                  m();
                  fishing4.game.z.d = true;
               }
            }
         } else if (fishing4.game.z.c.b < var0.b && fishing4.game.z.c.b + 50.0F < var0.b) {
            if (j % 10 == 0) {
               o = (k + 1) % 183;
            } else if (j % 10 == 1) {
               o = (k + 1) % 140;
            } else if (j % 10 == 2) {
               if (k < 182) {
                  o = k + 1;
               } else {
                  o = 144;
               }
            }

            fishing4.game.z.c.a(var0);
            fishing4.game.z.d = true;
         } else if (var0.b < fishing4.game.z.c.b && var0.b + 50.0F < fishing4.game.z.c.b) {
            if (j % 10 == 0) {
               o = (k + 183 - 1) % 183;
            } else if (j % 10 == 1) {
               o = (k + 140 - 1) % 140;
            } else if (j % 10 == 2) {
               if (k > 144) {
                  o = k - 1;
               } else {
                  o = 182;
               }
            }

            fishing4.game.z.c.a(var0);
            fishing4.game.z.d = true;
         }
      }

   }

   private static void i() {
      if (fishing4.game.s.c > 1) {
         int var1 = p;

         int var0;
         do {
            if (j % 10 == 0) {
               var0 = (var1 + 1) % 187;
            } else if (j % 10 == 1) {
               var0 = (var1 + 1) % 144;
            } else {
               var0 = var1;
               if (j % 10 == 2) {
                  if (var1 + 1 < 187) {
                     var0 = var1 + 1;
                  } else {
                     var0 = 144;
                  }
               }
            }

            var1 = var0;
         } while(fishing4.game.s.a[var0] == 0.0F);

         q = var0;
         fishing4.game.m.g = false;
      }

   }

   public static void i(fishing4.a.e var0) {
      if (am.c.a(var0, true)) {
         am.b();
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 190.0F, fishing4.a.m.d() - 35.0F), fishing4.a.h.a(50.0F, 50.0F), var0)) {
         l();
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 190.0F, fishing4.a.m.d() - 35.0F), fishing4.a.h.a(50.0F, 50.0F), var0)) {
         m();
      }

   }

   private static void j() {
      if (fishing4.game.s.d > 1) {
         int var1 = p;

         int var0;
         do {
            if (j % 10 == 0) {
               var0 = (var1 + 187 - 1) % 187;
            } else if (j % 10 == 1) {
               var0 = (var1 + 144 - 1) % 144;
            } else {
               var0 = var1;
               if (j % 10 == 2) {
                  if (var1 > 144) {
                     var0 = var1 - 1;
                  } else {
                     var0 = 186;
                  }
               }
            }

            var1 = var0;
         } while(fishing4.game.s.b[var0] == 0.0F);

         q = var0;
         fishing4.game.m.g = false;
      }

   }

   private static void k() {
      if (fishing4.game.s.d > 1) {
         int var1 = p;

         int var0;
         do {
            if (j % 10 == 0) {
               var0 = (var1 + 1) % 187;
            } else if (j % 10 == 1) {
               var0 = (var1 + 1) % 144;
            } else {
               var0 = var1;
               if (j % 10 == 2) {
                  if (var1 + 1 < 187) {
                     var0 = var1 + 1;
                  } else {
                     var0 = 144;
                  }
               }
            }

            var1 = var0;
         } while(fishing4.game.s.b[var0] == 0.0F);

         q = var0;
         fishing4.game.m.g = false;
      }

   }

   private static void l() {
      int var1 = p;

      while(true) {
         int var0;
         if (j % 10 == 0) {
            var0 = (var1 + 187 - 1) % 187;
         } else if (j % 10 == 1) {
            var0 = (var1 + 144 - 1) % 144;
         } else {
            var0 = var1;
            if (j % 10 == 2) {
               if (var1 > 144) {
                  var0 = var1 - 1;
               } else {
                  var0 = 186;
               }
            }
         }

         var1 = var0;
         if (!fishing4.a.r.aa[var0].equals("11111111111")) {
            var1 = var0;
            if (!fishing4.a.r.aa[var0].equals("1111")) {
               q = var0;
               fishing4.game.m.g = false;
               return;
            }
         }
      }
   }

   private static void m() {
      int var1 = p;

      while(true) {
         int var0;
         if (j % 10 == 0) {
            var0 = (var1 + 1) % 187;
         } else if (j % 10 == 1) {
            var0 = (var1 + 1) % 144;
         } else {
            var0 = var1;
            if (j % 10 == 2) {
               if (var1 + 1 < 187) {
                  var0 = var1 + 1;
               } else {
                  var0 = 144;
               }
            }
         }

         var1 = var0;
         if (!fishing4.a.r.aa[var0].equals("11111111111")) {
            var1 = var0;
            if (!fishing4.a.r.aa[var0].equals("1111")) {
               q = var0;
               fishing4.game.m.g = false;
               return;
            }
         }
      }
   }
}

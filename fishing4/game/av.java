package fishing4.game;

import javax.microedition.khronos.opengles.GL10;

public final class av {
   public static int a;
   public static o b;
   public static o c;
   public static o d;
   public static o e;
   public static int f = -1;
   public static int g = -1;
   public static int h = -1;
   private static int i;
   private static int j;
   private static o k;
   private static fishing4.a.w l;
   private static fishing4.a.w m;
   private static fishing4.a.w n;
   private static fishing4.a.w[] o;
   private static fishing4.a.w p;

   public static void a(int var0) {
      if (var0 == 1) {
         fishing4.b.d.a().b(fishing4.a.s.a(), 2131034127);
      }

      a = var0;
      i = 0;
   }

   public static void a(GL10 var0) {
      b(var0);
      c(var0);
      d(var0);
   }

   public static void a(GL10 var0, int var1) {
      a = 0;
      i = 0;
      j = -5;
      int var2 = ((ag)ad.h.get(ad.g)).a;
      if (var2 >= 80 && var2 <= 88) {
         m = fishing4.a.w.a(var0, "img/ship/ship_b_" + (var2 - 80 + 1) + ".png");
         l = fishing4.a.w.a(var0, "img/ship/ship_" + (var2 - 80 + 1) + ".png");
      }

      switch (var1) {
         case 0:
            n = fishing4.a.w.a(var0, "img/battleSea/yangzi.png");
            break;
         case 1:
            n = fishing4.a.w.a(var0, "img/battleSea/plit.png");
            break;
         case 2:
            n = fishing4.a.w.a(var0, "img/battleSea/baikal.png");
            break;
         case 3:
            n = fishing4.a.w.a(var0, "img/battleSea/eastsea.png");
            break;
         case 4:
            n = fishing4.a.w.a(var0, "img/battleSea/moldive.png");
            break;
         case 5:
            n = fishing4.a.w.a(var0, "img/battleSea/asawa.png");
            break;
         case 6:
            n = fishing4.a.w.a(var0, "img/battleSea/capehorn.png");
            break;
         case 7:
            n = fishing4.a.w.a(var0, "img/battleSea/polarsea.png");
         case 8:
         case 9:
         default:
            break;
         case 10:
            n = fishing4.a.w.a(var0, "img/battleSea/network.png");
      }

      k = fishing4.game.o.a(var0, "gscript/000.gs");
      a(var0);
      f(var0);
      fishing4.b.d.a().a(fishing4.a.s.a(), 2131034127);
   }

   public static void b(GL10 var0) {
      int var1 = ad.b(3);
      if (c != null) {
         c.a(var0);
         c = null;
      }

      if (var1 == -1) {
         c = fishing4.game.o.a(var0, "gscript/100.gs");
      } else {
         c = fishing4.game.o.a(var0, "gscript/10" + (var1 - 500 + 1) + ".gs");
      }

      if (e != null) {
         e.a(var0);
         e = null;
      }

      if (var1 == 501 || var1 == 503 || var1 == 504 || var1 == 505 || var1 == 506 || var1 == 508) {
         e = fishing4.game.o.a(var0, "gscript/40" + (var1 - 500 + 1) + ".gs");
      }

   }

   public static void b(GL10 var0, int var1) {
      int var2;
      int var3;
      if (aw.c == 3) {
         fishing4.a.m.a(var0, n, (float)fishing4.a.m.a() - n.c.a / 2.0F, n.c.b / 2.0F);
         fishing4.a.m.a(var0, m, (float)fishing4.a.m.a() - m.c.a / 2.0F, m.c.b / 2.0F, '\b');
         int var4;
         if (a == 3) {
            var2 = i;
            var3 = ad.b(3);
            var4 = ad.b(4);
            k.a(var0, 1, (float)fishing4.a.m.a(), 0.0F, var2);
            b.a(var0, 1, (float)fishing4.a.m.a(), 0.0F, var2);
            c.a(var0, 1, (float)fishing4.a.m.a(), 0.0F, var2);
            if (d != null && ad.b(5) != -1) {
               d.a(var0, 1, (float)fishing4.a.m.a(), 0.0F, var2);
            }

            if (var3 == 501 || var3 == 503 || var3 == 504 || var3 == 505 || var3 == 506 || var3 == 508) {
               e.a(var0, 1, (float)fishing4.a.m.a(), 0.0F, var2);
            }

            if (var4 == 601) {
               b.a(var0, 1, (float)fishing4.a.m.a(), 0.0F, var2);
            }
         } else if (a == 5) {
            var4 = i;
            var2 = ad.b(3);
            var3 = ad.b(4);
            k.a(var0, 3, (float)fishing4.a.m.a(), 0.0F, var4);
            b.a(var0, 3, (float)fishing4.a.m.a(), 0.0F, var4);
            c.a(var0, 3, (float)fishing4.a.m.a(), 0.0F, var4);
            if (d != null && ad.b(5) != -1) {
               d.a(var0, 3, (float)fishing4.a.m.a(), 0.0F, var4);
            }

            if (var2 == 501 || var2 == 503 || var2 == 504 || var2 == 505 || var2 == 506 || var2 == 508) {
               e.a(var0, 3, (float)fishing4.a.m.a(), 0.0F, var4);
            }

            if (var3 == 601) {
               b.a(var0, 3, (float)fishing4.a.m.a(), 0.0F, var4);
            }
         } else {
            var4 = i;
            var3 = ad.b(3);
            var2 = ad.b(4);
            k.a(var0, 2, (float)fishing4.a.m.a(), 0.0F, var4);
            b.a(var0, 2, (float)fishing4.a.m.a(), 0.0F, var4);
            c.a(var0, 2, (float)fishing4.a.m.a(), 0.0F, var4);
            if (d != null && ad.b(5) != -1) {
               d.a(var0, 2, (float)fishing4.a.m.a(), 0.0F, var4);
            }

            if (var3 == 501 || var3 == 503 || var3 == 504 || var3 == 505 || var3 == 506 || var3 == 508) {
               e.a(var0, 2, (float)fishing4.a.m.a(), 0.0F, var4);
            }

            if (var2 == 601) {
               b.a(var0, 2, (float)fishing4.a.m.a(), 0.0F, var4);
            }
         }
      } else {
         fishing4.a.m.a(var0, l, (float)fishing4.a.m.a() - l.c.a / 2.0F, l.c.b / 2.0F + (float)j, '\b');
         if (a == 0) {
            d(var0, 0);
         } else if (a == 1) {
            d(var0, i);
            c(var0, i);
         } else {
            d(var0, 33);
            c(var0, 33);
         }
      }

      var3 = i;
      switch (a) {
         case 1:
            var2 = k.a(0);
            break;
         case 2:
         default:
            var2 = 0;
            break;
         case 3:
            var2 = k.a(1);
            break;
         case 4:
            var2 = k.a(2);
            break;
         case 5:
            var2 = k.a(3);
      }

      if (var3 < var2) {
         if (aw.c != 3 || !fishing4.game.i.c) {
            ++i;
         }
      } else {
         if (a == 1) {
            aw.a(2);
            a = 2;
         } else if (a == 3) {
            a = 4;
         } else if (a == 5) {
            a = 4;
         }

         i = 0;
      }

      switch (var1 / 4 % 10) {
         case 0:
         case 1:
         case 2:
         case 3:
            j = var1 / 4 % 10 + 1 - 5;
            break;
         case 4:
         case 5:
            j = 0;
            break;
         case 6:
         case 7:
         case 8:
         case 9:
            j = 10 - var1 / 4 % 10 - 5;
      }

   }

   public static void c(GL10 var0) {
      int var1 = ad.b(4);
      if (b != null) {
         b.a(var0);
         b = null;
      }

      if (var1 == -1) {
         b = fishing4.game.o.a(var0, "gscript/200.gs");
      } else {
         b = fishing4.game.o.a(var0, "gscript/20" + (var1 - 600 + 1) + ".gs");
      }

   }

   private static void c(GL10 var0, int var1) {
      float var2;
      float var3;
      if (var1 >= 8) {
         fishing4.a.f var5;
         switch (var1) {
            case 8:
               var5 = fishing4.a.f.a(0.0F, 0.0F, 420.0F, 400.0F);
               break;
            case 9:
               var5 = fishing4.a.f.a(420.0F, 0.0F, 420.0F, 400.0F);
               break;
            case 10:
               var5 = fishing4.a.f.a(0.0F, 400.0F, 420.0F, 400.0F);
               break;
            case 11:
               var5 = fishing4.a.f.a(420.0F, 400.0F, 420.0F, 400.0F);
               break;
            case 12:
               var5 = fishing4.a.f.a(0.0F, 0.0F, 420.0F, 400.0F);
               break;
            case 13:
               var5 = fishing4.a.f.a(420.0F, 0.0F, 420.0F, 400.0F);
               break;
            case 14:
               var5 = fishing4.a.f.a(0.0F, 400.0F, 420.0F, 400.0F);
               break;
            case 15:
               var5 = fishing4.a.f.a(420.0F, 400.0F, 420.0F, 400.0F);
               break;
            case 16:
               var5 = fishing4.a.f.a(0.0F, 0.0F, 420.0F, 400.0F);
               break;
            case 17:
               var5 = fishing4.a.f.a(420.0F, 0.0F, 420.0F, 400.0F);
               break;
            case 18:
               var5 = fishing4.a.f.a(0.0F, 400.0F, 420.0F, 400.0F);
               break;
            case 19:
            case 20:
               var5 = fishing4.a.f.a(420.0F, 400.0F, 420.0F, 400.0F);
               break;
            case 21:
            case 22:
               var5 = fishing4.a.f.a(0.0F, 0.0F, 420.0F, 400.0F);
               break;
            case 23:
            case 24:
               var5 = fishing4.a.f.a(420.0F, 0.0F, 420.0F, 400.0F);
               break;
            case 25:
            case 26:
               var5 = fishing4.a.f.a(0.0F, 400.0F, 420.0F, 400.0F);
               break;
            case 27:
            case 28:
               var5 = fishing4.a.f.a(420.0F, 400.0F, 420.0F, 400.0F);
               break;
            case 29:
            case 30:
               var5 = fishing4.a.f.a(0.0F, 0.0F, 420.0F, 400.0F);
               break;
            case 31:
            case 32:
               var5 = fishing4.a.f.a(420.0F, 0.0F, 420.0F, 400.0F);
               break;
            default:
               var5 = fishing4.a.f.a(0.0F, 400.0F, 420.0F, 400.0F);
         }

         float var4 = (float)fishing4.a.m.a() - var5.b.a / 2.0F;
         var3 = (800.0F - (float)k.b[k.a(0)][6]) / 2.0F + 104.0F + (float)j;
         if (var1 >= 21 && var1 <= 22) {
            var2 = var3 - 2.0F;
         } else if (var1 == 23) {
            var2 = var3 + 2.0F;
         } else {
            var2 = var3;
            if (var1 >= 24) {
               var2 = var3;
               if (var1 <= 30) {
                  var2 = var3 + 4.0F;
               }
            }
         }

         if (var1 >= 8 && var1 < 12) {
            fishing4.a.m.a(var0, o[0], var4, var2, var5, '\u0001');
         } else if (var1 >= 12 && var1 < 16) {
            fishing4.a.m.a(var0, o[1], var4, var2, var5, '\u0001');
         } else if (var1 >= 16 && var1 < 21) {
            fishing4.a.m.a(var0, o[2], var4, var2, var5, '\u0001');
         } else if (var1 >= 21 && var1 < 29) {
            fishing4.a.m.a(var0, o[3], var4, var2, var5, '\u0001');
         } else if (var1 >= 29) {
            fishing4.a.m.a(var0, o[4], var4, var2, var5, '\u0001');
         }
      }

      if (var1 >= 20 && var1 <= 30) {
         var2 = (float)(fishing4.a.m.a() - 374);
         var3 = (float)(j + 386);
         switch (var1) {
            case 20:
            case 21:
               fishing4.a.m.a(var0, p, var2, var3, fishing4.a.f.a(0.0F, 0.0F, 100.0F, 20.0F), '\u0001');
               break;
            case 22:
               fishing4.a.m.a(var0, p, var2, var3, fishing4.a.f.a(100.0F, 0.0F, 100.0F, 20.0F), '\u0001');
               break;
            case 23:
               fishing4.a.m.a(var0, p, var2, var3, fishing4.a.f.a(200.0F, 0.0F, 100.0F, 20.0F), '\u0001');
               break;
            case 24:
            case 25:
               fishing4.a.m.a(var0, p, var2, var3, fishing4.a.f.a(300.0F, 0.0F, 100.0F, 20.0F), '\u0001');
               fishing4.a.m.a(var0, p, var2, var3, fishing4.a.f.a(0.0F, 0.0F, 100.0F, 20.0F), '\u0001');
               break;
            case 26:
               fishing4.a.m.a(var0, p, var2, var3, fishing4.a.f.a(400.0F, 0.0F, 100.0F, 20.0F), '\u0001');
               fishing4.a.m.a(var0, p, var2, var3, fishing4.a.f.a(100.0F, 0.0F, 100.0F, 20.0F), '\u0001');
               break;
            case 27:
               fishing4.a.m.a(var0, p, var2, var3, fishing4.a.f.a(500.0F, 0.0F, 100.0F, 20.0F), '\u0001');
               fishing4.a.m.a(var0, p, var2, var3, fishing4.a.f.a(200.0F, 0.0F, 100.0F, 20.0F), '\u0001');
               break;
            case 28:
               fishing4.a.m.a(var0, p, var2, var3, fishing4.a.f.a(0.0F, 0.0F, 0.0F, 0.0F), '\u0001');
               fishing4.a.m.a(var0, p, var2, var3, fishing4.a.f.a(300.0F, 0.0F, 100.0F, 20.0F), '\u0001');
               break;
            case 29:
               fishing4.a.m.a(var0, p, var2, var3, fishing4.a.f.a(400.0F, 0.0F, 100.0F, 20.0F), '\u0001');
               break;
            case 30:
               fishing4.a.m.a(var0, p, var2, var3, fishing4.a.f.a(500.0F, 0.0F, 100.0F, 20.0F), '\u0001');
         }
      }

   }

   public static void d(GL10 var0) {
      int var1 = ad.b(5);
      if (d != null) {
         d.a(var0);
         d = null;
      }

      if (var1 != -1) {
         d = fishing4.game.o.a(var0, "gscript/30" + (var1 - 700 + 1) + ".gs");
      }

   }

   private static void d(GL10 var0, int var1) {
      int var2 = ad.b(3);
      int var3 = ad.b(4);
      k.a(var0, 0, (float)fishing4.a.m.a(), (float)(-j), var1);
      b.a(var0, 0, (float)fishing4.a.m.a(), (float)(-j), var1);
      c.a(var0, 0, (float)fishing4.a.m.a(), (float)(-j), var1);
      if (d != null && ad.b(5) != -1) {
         d.a(var0, 0, (float)fishing4.a.m.a(), (float)(-j), var1);
      }

      if (e != null && (var2 == 501 || var2 == 503 || var2 == 504 || var2 == 505 || var2 == 506 || var2 == 508)) {
         e.a(var0, 0, (float)fishing4.a.m.a(), (float)(-j), var1);
      }

      if (var3 == 601) {
         b.a(var0, 0, (float)fishing4.a.m.a(), (float)(-j), var1);
      }

   }

   public static void e(GL10 var0) {
      for(int var1 = 0; var1 < o.length; ++var1) {
         fishing4.a.w.a(var0, o[var1]);
         o[var1] = null;
      }

      o = null;
      fishing4.a.w.a(var0, p);
      p = null;
      fishing4.a.w.a(var0, l);
      l = null;
      fishing4.a.w.a(var0, m);
      m = null;
      fishing4.a.w.a(var0, n);
      n = null;
      k.a(var0);
      k = null;
      c.a(var0);
      c = null;
      b.a(var0);
      b = null;
      if (d != null) {
         d.a(var0);
         d = null;
      }

      if (e != null) {
         e.a(var0);
         e = null;
      }

   }

   private static void f(GL10 var0) {
      o = new fishing4.a.w[5];

      for(int var1 = 0; var1 < o.length; ++var1) {
         o[var1] = fishing4.a.w.a(var0, "img/player/Casting_00" + (var1 + 2) + ".png");
      }

      p = fishing4.a.w.a(var0, "img/player/Casting_Surfaceani.png");
   }
}

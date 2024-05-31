package fishing4.game;

import java.text.DecimalFormat;
import java.util.ArrayList;

import fishing4.a.AESUtils;

public final class x {
   public static int a;
   public static int b;
   public static long c;
   public static long d = 0L;
   private static AESUtils e = AESUtils.a();
   private static AESUtils f = AESUtils.a();

   public static final int a(boolean var0) {
      byte var1 = 0;
      if (var0) {
         if (e.c() >= 200L) {
            if (e.c() < 500L) {
               var1 = 1;
            } else if (e.c() < 1000L) {
               var1 = 2;
            } else if (e.c() < 1700L) {
               var1 = 3;
            } else if (e.c() < 2700L) {
               var1 = 4;
            } else if (e.c() < 4000L) {
               var1 = 5;
            } else if (e.c() < 6000L) {
               var1 = 6;
            } else if (e.c() < 10000L) {
               var1 = 7;
            } else if (e.c() < 16000L) {
               var1 = 8;
            } else if (e.c() < 26000L) {
               var1 = 9;
            } else if (e.c() < 37000L) {
               var1 = 10;
            } else if (e.c() < 55000L) {
               var1 = 11;
            } else if (e.c() < 75000L) {
               var1 = 12;
            } else if (e.c() < 105000L) {
               var1 = 13;
            } else if (e.c() < 140000L) {
               var1 = 14;
            } else if (e.c() < 180000L) {
               var1 = 15;
            } else if (e.c() < 230000L) {
               var1 = 16;
            } else if (e.c() < 290000L) {
               var1 = 17;
            } else if (e.c() < 400000L) {
               var1 = 18;
            } else {
               var1 = 19;
            }
         }
      } else if (e.encrypt() >= 200L) {
         if (e.encrypt() < 500L) {
            var1 = 1;
         } else if (e.encrypt() < 1000L) {
            var1 = 2;
         } else if (e.encrypt() < 1700L) {
            var1 = 3;
         } else if (e.encrypt() < 2700L) {
            var1 = 4;
         } else if (e.encrypt() < 4000L) {
            var1 = 5;
         } else if (e.encrypt() < 6000L) {
            var1 = 6;
         } else if (e.encrypt() < 10000L) {
            var1 = 7;
         } else if (e.encrypt() < 16000L) {
            var1 = 8;
         } else if (e.encrypt() < 26000L) {
            var1 = 9;
         } else if (e.encrypt() < 37000L) {
            var1 = 10;
         } else if (e.encrypt() < 55000L) {
            var1 = 11;
         } else if (e.encrypt() < 75000L) {
            var1 = 12;
         } else if (e.encrypt() < 105000L) {
            var1 = 13;
         } else if (e.encrypt() < 140000L) {
            var1 = 14;
         } else if (e.encrypt() < 180000L) {
            var1 = 15;
         } else if (e.encrypt() < 230000L) {
            var1 = 16;
         } else if (e.encrypt() < 290000L) {
            var1 = 17;
         } else if (e.encrypt() < 400000L) {
            var1 = 18;
         } else {
            var1 = 19;
         }
      }

      return var1;
   }

   public static void a() {
      s.a = new float[187];
      s.b = new float[187];
      q.a = new int[24];
      q.b = new boolean[24];
      q.c = System.currentTimeMillis();
      ad.a();
      w.a = new y[35];
      w.b = new ArrayList();
      w.c = new ArrayList();
      w.d = new ArrayList();
      v.a = new y[33];
      v.b = new ArrayList();
      v.c = new ArrayList();
      v.d = new ArrayList();
   }

   public static void a(int var0) {
      e.encryptLong((long)var0);
   }

   public static boolean a(int var0, int var1) {
      int var2 = -2;
      boolean var6 = false;
      int var4 = m.f(var1);
      int var5 = c(false);
      int var3 = m.g(var1);
      if (var0 < 4) {
         var1 = var0;
      } else {
         var1 = var0 + 1;
      }

      byte var7;
      if (var4 - var5 <= -3) {
         var7 = -9;
      } else if (var4 - var5 == -2) {
         var7 = -7;
      } else {
         var7 = (byte)var2;
         if (var4 - var5 != -1) {
            if (var4 - var5 >= 0) {
               var7 = 0;
            } else {
               var7 = 0;
            }
         }
      }

      var2 = a(false);
      e.b((long)((var7 + var1 + 10) * var3 / 10));
      if (var2 < a(false)) {
         q.c(18);
         var6 = true;
      }

      return var6;
   }

   public static final int b(boolean var0) {
      byte var1 = 1;
      if (var0) {
         if (f.c() >= 200L) {
            if (f.c() < 500L) {
               var1 = 2;
            } else if (f.c() < 1000L) {
               var1 = 3;
            } else if (f.c() < 1700L) {
               var1 = 4;
            } else if (f.c() < 2700L) {
               var1 = 5;
            } else if (f.c() < 4000L) {
               var1 = 6;
            } else if (f.c() < 6000L) {
               var1 = 7;
            } else if (f.c() < 10000L) {
               var1 = 8;
            } else if (f.c() < 16000L) {
               var1 = 9;
            } else if (f.c() < 26000L) {
               var1 = 10;
            } else if (f.c() < 37000L) {
               var1 = 11;
            } else if (f.c() < 55000L) {
               var1 = 12;
            } else if (f.c() < 75000L) {
               var1 = 13;
            } else if (f.c() < 105000L) {
               var1 = 14;
            } else if (f.c() < 140000L) {
               var1 = 15;
            } else if (f.c() < 180000L) {
               var1 = 16;
            } else if (f.c() < 230000L) {
               var1 = 17;
            } else if (f.c() < 290000L) {
               var1 = 18;
            } else if (f.c() < 400000L) {
               var1 = 19;
            } else {
               var1 = 20;
            }
         }
      } else if (f.encrypt() >= 200L) {
         if (f.encrypt() < 500L) {
            var1 = 2;
         } else if (f.encrypt() < 1000L) {
            var1 = 3;
         } else if (f.encrypt() < 1700L) {
            var1 = 4;
         } else if (f.encrypt() < 2700L) {
            var1 = 5;
         } else if (f.encrypt() < 4000L) {
            var1 = 6;
         } else if (f.encrypt() < 6000L) {
            var1 = 7;
         } else if (f.encrypt() < 10000L) {
            var1 = 8;
         } else if (f.encrypt() < 16000L) {
            var1 = 9;
         } else if (f.encrypt() < 26000L) {
            var1 = 10;
         } else if (f.encrypt() < 37000L) {
            var1 = 11;
         } else if (f.encrypt() < 55000L) {
            var1 = 12;
         } else if (f.encrypt() < 75000L) {
            var1 = 13;
         } else if (f.encrypt() < 105000L) {
            var1 = 14;
         } else if (f.encrypt() < 140000L) {
            var1 = 15;
         } else if (f.encrypt() < 180000L) {
            var1 = 16;
         } else if (f.encrypt() < 230000L) {
            var1 = 17;
         } else if (f.encrypt() < 290000L) {
            var1 = 18;
         } else if (f.encrypt() < 400000L) {
            var1 = 19;
         } else {
            var1 = 20;
         }
      }

      return var1;
   }

   public static void b() {
      byte var1 = 0;
      e.encryptLong(0L);
      f.encryptLong(0L);
      a = 0;
      b = 0;
      c = 0L;
      bh.a = 0;
      s.d = 0;
      s.c = 0;

      int var0;
      for(var0 = 0; var0 < s.a.length; ++var0) {
         s.a[var0] = 0.0F;
         s.b[var0] = 0.0F;
      }

      for(var0 = 0; var0 < 24; ++var0) {
         q.a[var0] = 0;
         q.b[var0] = false;
      }

      q.c = System.currentTimeMillis();
      ad.b();

      for(var0 = 0; var0 < 35; ++var0) {
         w.a[var0] = y.a(0, var0);
      }

      for(var0 = var1; var0 < 33; ++var0) {
         v.a[var0] = y.a(1, var0);
      }

      r.a();
   }

   public static void b(int var0) {
      e.b((long)var0);
   }

   public static final int c() {
      return (int)e.encrypt();
   }

   public static final int c(boolean var0) {
      // $FF: Couldn't be decompiled
   }

   public static void c(int var0) {
      f.encryptLong((long)var0);
   }

   public static final int d() {
      return (int)f.encrypt();
   }

   public static void d(int var0) {
      f.b((long)var0);
   }

   public static final int e(int var0) {
      switch (var0) {
         case 1:
            var0 = 200;
            break;
         case 2:
            var0 = 500;
            break;
         case 3:
            var0 = 1000;
            break;
         case 4:
            var0 = 1700;
            break;
         case 5:
            var0 = 2700;
            break;
         case 6:
            var0 = 4000;
            break;
         case 7:
            var0 = 6000;
            break;
         case 8:
            var0 = 10000;
            break;
         case 9:
            var0 = 16000;
            break;
         case 10:
            var0 = 26000;
            break;
         case 11:
            var0 = 37000;
            break;
         case 12:
            var0 = 55000;
            break;
         case 13:
            var0 = 75000;
            break;
         case 14:
            var0 = 105000;
            break;
         case 15:
            var0 = 140000;
            break;
         case 16:
            var0 = 180000;
            break;
         case 17:
            var0 = 230000;
            break;
         case 18:
            var0 = 290000;
            break;
         case 19:
            var0 = 400000;
            break;
         default:
            var0 = -1;
      }

      return var0;
   }

   public static String e() {
      DecimalFormat var0 = new DecimalFormat();
      String var1;
      if (l() < 0) {
         if (globalConfig.languageId == 0) {
            var1 = var0.format(e.c()) + " / 없음";
         } else {
            var1 = var0.format(e.c()) + " / None";
         }
      } else {
         var1 = var0.format(e.c()) + " / " + var0.format((long)l());
      }

      return var1;
   }

   public static final int f() {
      return e(b(true));
   }

   public static boolean f(int var0) {
      int var1 = -2;
      boolean var5 = false;
      int var3 = m.f(var0);
      int var4 = c(false);
      int var2 = m.h(var0);
      byte var6;
      if (var3 - var4 <= -3) {
         var6 = -9;
      } else if (var3 - var4 == -2) {
         var6 = -7;
      } else {
         var6 = (byte)var1;
         if (var3 - var4 != -1) {
            if (var3 - var4 == 0) {
               var6 = 0;
            } else if (var3 - var4 > 0) {
               var6 = 5;
            } else {
               var6 = 0;
            }
         }
      }

      var1 = b(false);
      f.b((long)((var6 + 10) * var2 / 10));
      if (var1 < b(false)) {
         q.c(19);
         var5 = true;
      }

      return var5;
   }

   public static final int g() {
      // $FF: Couldn't be decompiled
   }

   public static final float h() {
      // $FF: Couldn't be decompiled
   }

   public static final float i() {
      // $FF: Couldn't be decompiled
   }

   public static String j() {
      return t.a(a(true), true);
   }

   public static final int k() {
      // $FF: Couldn't be decompiled
   }

   private static int l() {
      // $FF: Couldn't be decompiled
   }
}

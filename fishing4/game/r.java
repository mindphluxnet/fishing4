package fishing4.game;

public final class r {
   public static int a;
   public static int b;
   public static int c;
   public static float d;
   public static float e;

   public static int a(int var0, int var1) {
      if (a == 0) {
         var0 = c(b(var0, var1));
      } else {
         var0 = c(a);
      }

      return var0;
   }

   public static void a() {
      a = 0;
      b = 0;
      d = 0.0F;
      e = 0.0F;
      c = 0;
   }

   public static void a(int var0) {
      a = var0;
      b = 7;
      d = 0.0F;
      if (e() == 0) {
         var0 = j();
         if (fishing4.a.z.a(2) != 0 && var0 != 1) {
            c = m.n(var0);
         } else {
            c = m.m(var0);
         }
      } else {
         var0 = j();
         if (fishing4.a.z.a(2) != 0 && var0 != 1) {
            c = m.n(var0);
         } else {
            c = m.m(var0);
         }
      }

      switch (a) {
         case 1:
            e = 1.06F + (float)fishing4.a.z.a(3) / 100.0F;
            break;
         case 2:
         case 4:
         case 6:
            e = (float)(fishing4.a.z.a(2) + 2);
            break;
         case 3:
            e = 1.08F + (float)fishing4.a.z.a(3) / 100.0F;
            break;
         case 5:
            e = 1.1F + (float)fishing4.a.z.a(6) / 100.0F;
            break;
         case 7:
            e = 1.15F + (float)fishing4.a.z.a(6) / 100.0F;
            break;
         case 8:
         case 10:
            e = (float)(fishing4.a.z.a(3) + 2);
            break;
         case 9:
            e = 1.2F + (float)fishing4.a.z.a(6) / 100.0F;
            break;
         case 11:
            e = 1.25F + (float)fishing4.a.z.a(6) / 100.0F;
            break;
         case 12:
         case 14:
            e = (float)(fishing4.a.z.a(4) + 2);
            break;
         case 13:
         case 17:
            e = (float)fishing4.a.z.a(11) / 100.0F + 1.3F;
            break;
         case 15:
         case 19:
            e = (float)fishing4.a.z.a(16) / 100.0F + 1.3F;
            break;
         case 16:
         case 18:
            e = (float)(fishing4.a.z.a(3) + 3);
            break;
         case 20:
            e = (float)(fishing4.a.z.a(4) + 3);
      }

   }

   public static int b(int var0, int var1) {
      if (var0 == 0) {
         var0 = var1 * 2 + 1;
      } else {
         var0 = var1 * 2 + 1 + 1;
      }

      return var0;
   }

   public static String b() {
      return b(a);
   }

   public static String b(int var0) {
      String var1;
      switch (var0) {
         case 1:
         case 2:
            var1 = fishing4.a.y.a(2131165907);
            break;
         case 3:
         case 4:
            var1 = fishing4.a.y.a(2131165908);
            break;
         case 5:
         case 6:
            var1 = fishing4.a.y.a(2131165909);
            break;
         case 7:
         case 8:
            var1 = fishing4.a.y.a(2131165910);
            break;
         case 9:
         case 10:
            var1 = fishing4.a.y.a(2131165911);
            break;
         case 11:
         case 12:
            var1 = fishing4.a.y.a(2131165912);
            break;
         case 13:
         case 14:
            var1 = fishing4.a.y.a(2131165913);
            break;
         case 15:
         case 16:
            var1 = fishing4.a.y.a(2131165914);
            break;
         case 17:
         case 18:
            var1 = fishing4.a.y.a(2131165915);
            break;
         case 19:
         case 20:
            var1 = fishing4.a.y.a(2131165916);
            break;
         default:
            var1 = "";
      }

      return var1;
   }

   public static float c() {
      return e * (float)(100 - b) / 100.0F;
   }

   private static int c(int var0) {
      int var1 = 20000;
      switch (var0) {
         case 1:
            var1 = 4000;
            break;
         case 2:
            var1 = 8000;
            break;
         case 3:
            var1 = 10000;
         case 4:
         case 5:
            break;
         case 6:
            var1 = 40000;
            break;
         case 7:
            var1 = 40000;
            break;
         case 8:
            var1 = 80000;
            break;
         case 9:
            k.g();
            var1 = 63000;
            break;
         case 10:
            k.g();
            var1 = 126000;
            break;
         case 11:
            k.g();
            var1 = 90000;
            break;
         case 12:
            k.g();
            var1 = 180000;
            break;
         case 13:
            k.g();
            var1 = 170000;
            break;
         case 14:
            k.g();
            var1 = 340000;
            break;
         case 15:
            k.g();
            var1 = 255000;
            break;
         case 16:
            k.g();
            var1 = 510000;
            break;
         case 17:
            k.g();
            var1 = 320000;
            break;
         case 18:
            k.g();
            var1 = 640000;
            break;
         case 19:
            k.g();
            var1 = 400000;
            break;
         case 20:
            k.g();
            var1 = 800000;
            break;
         default:
            var1 = 0;
      }

      return var1;
   }

   public static String d() {
      String var0;
      if (e() == 1) {
         if (a <= 4) {
            if (globalConfig.languageId == 0) {
               var0 = "희귀도 ★★이상 ";
            } else {
               var0 = "Rarty ★★ and over ";
            }
         } else if (a <= 10) {
            if (globalConfig.languageId == 0) {
               var0 = "희귀도 ★★★이상 ";
            } else {
               var0 = "Rarty ★★★ and over ";
            }
         } else if (globalConfig.languageId == 0) {
            var0 = "희귀도 ★★★★이상 ";
         } else {
            var0 = "Rarty ★★★★ and over ";
         }
      } else {
         var0 = "";
      }

      return var0;
   }

   public static int e() {
      byte var0;
      switch (a) {
         case 1:
         case 3:
         case 5:
         case 7:
         case 9:
         case 11:
         case 13:
         case 15:
         case 17:
         case 19:
            var0 = 0;
            break;
         case 2:
         case 4:
         case 6:
         case 8:
         case 10:
         case 12:
         case 14:
         case 16:
         case 18:
         default:
            var0 = 1;
      }

      return var0;
   }

   public static boolean f() {
      boolean var0;
      if (a != 0 && b > 0) {
         var0 = true;
      } else {
         var0 = false;
      }

      return var0;
   }

   public static boolean g() {
      boolean var0;
      if (a != 0 && b <= 0) {
         var0 = true;
      } else {
         var0 = false;
      }

      return var0;
   }

   public static boolean h() {
      boolean var0;
      if (b <= 0 && !(d < e)) {
         var0 = true;
      } else {
         var0 = false;
      }

      return var0;
   }

   public static boolean i() {
      return ad.o.c((long)c(a));
   }

   private static int j() {
      byte var0 = 7;
      if (a >= 17 && a <= 20) {
         var0 = 8;
      } else if (a < 13 || a > 16) {
         if (a >= 11 && a <= 12) {
            var0 = 6;
         } else if (a >= 9 && a <= 10) {
            var0 = 5;
         } else if (a >= 7 && a <= 8) {
            var0 = 4;
         } else if (a >= 5 && a <= 6) {
            var0 = 3;
         } else if (a >= 3 && a <= 4) {
            var0 = 2;
         } else {
            var0 = 1;
         }
      }

      return var0;
   }
}

package fishing4.game;

import java.util.ArrayList;

public final class v {
   public static y[] a;
   public static ArrayList b;
   public static ArrayList c;
   public static ArrayList d;

   public static String a(int var0) {
      String var1;
      if (var0 > 0 && var0 < 33) {
         var1 = fishing4.a.y.a(2131165778 + (var0 - 1));
      } else {
         var1 = "";
      }

      return var1;
   }

   public static void a() {
      b.clear();
      c.clear();
      d.clear();

      for(int var0 = 1; var0 < 33; ++var0) {
         boolean var1;
         switch (var0) {
            case 0:
               var1 = false;
               break;
            case 1:
            case 2:
               var1 = true;
               break;
            case 3:
               var1 = d(1);
               break;
            case 4:
               var1 = d(2);
               break;
            case 5:
               var1 = d(3);
               break;
            case 6:
               var1 = d(5);
               break;
            case 7:
               var1 = d(4);
               break;
            case 8:
               var1 = d(6);
               break;
            case 9:
               var1 = d(8);
               break;
            case 10:
               var1 = d(7);
               break;
            case 11:
               var1 = d(9);
               break;
            case 12:
               var1 = d(9);
               break;
            case 13:
               var1 = d(10);
               break;
            case 14:
               var1 = d(11);
               break;
            case 15:
               var1 = d(12);
               break;
            case 16:
               var1 = d(13);
               break;
            case 17:
               var1 = d(14);
               break;
            case 18:
               var1 = d(15);
               break;
            case 19:
               var1 = d(16);
               break;
            case 20:
               var1 = d(17);
               break;
            case 21:
               var1 = d(18);
               break;
            case 22:
               var1 = d(19);
               break;
            case 23:
               var1 = d(20);
               break;
            case 24:
               var1 = d(21);
               break;
            case 25:
               var1 = d(22);
               break;
            case 26:
               var1 = d(24);
               break;
            case 27:
               var1 = d(23);
               break;
            case 28:
               var1 = d(27);
               break;
            case 29:
               var1 = d(25);
               break;
            case 30:
               var1 = d(28);
               break;
            case 31:
               var1 = d(30);
               break;
            case 32:
               var1 = d(31);
               break;
            default:
               var1 = false;
         }

         if (var1) {
            if (a[var0].c == 0) {
               a[var0].c = 1;
               b.add(var0);
            } else if (a[var0].c == 1) {
               b.add(var0);
            } else if (a[var0].c == 2) {
               c.add(var0);
            } else if (a[var0].c == 3) {
               d.add(var0);
            }
         }
      }

   }

   public static String b(int var0) {
      String var1;
      if (var0 > 0 && var0 < 33) {
         var1 = fishing4.a.y.a(2131165810 + (var0 - 1));
      } else {
         var1 = "";
      }

      return var1;
   }

   public static boolean b() {
      boolean var1 = true;

      for(int var0 = 1; var0 < 33; ++var0) {
         if (!d(var0)) {
            var1 = false;
            break;
         }
      }

      return var1;
   }

   public static String c(int var0) {
      String var1;
      if (var0 > 0 && var0 < 33) {
         var1 = fishing4.a.y.a(2131165842 + (var0 - 1));
      } else {
         var1 = "";
      }

      return var1;
   }

   private static boolean d(int var0) {
      boolean var2 = false;
      boolean var1 = var2;
      if (var0 > 0) {
         var1 = var2;
         if (var0 < 33) {
            var1 = var2;
            if (a[var0].c == 4) {
               var1 = true;
            }
         }
      }

      return var1;
   }
}

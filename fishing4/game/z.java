package fishing4.game;

import javax.microedition.khronos.opengles.GL10;

public final class z {
   public static aa[] a;
   public static boolean b = false;
   public static fishing4.a.e c;
   public static boolean d = false;
   private static int e = -1;
   private static int f = -1;
   private static int g = -1;

   public static void a() {
      g = -1;
      f = -1;
      e = -1;
      a = new aa[5];
   }

   public static void a(int var0) {
      g = var0;
   }

   public static void a(fishing4.a.e var0) {
      c = var0;
      q.c = System.currentTimeMillis();
      if (f != -1 && a[f] != null) {
         if (az.e) {
            az.a(var0);
         } else {
            a[f].a(var0);
         }

         b = true;
      }

   }

   public static void a(aa var0, int var1) {
      a[var1] = var0;
   }

   public static void a(GL10 glContext) {
      if (f != -1 && a[f] != null) {
         a[f].e(glContext);
         if (az.e) {
            az.a(glContext, aa.e);
         }
      }

   }

   public static void a(GL10 glContext, int var1) {
      f = var1;
      a[f].b(glContext);
      a[f].c(glContext);
   }

   public static int b() {
      return f;
   }

   public static void b(int var0) {
      if (f != -1 && a[f] != null) {
         a[f].b(var0);
      }

   }

   public static void b(fishing4.a.e var0) {
      q.c = System.currentTimeMillis();
      if (f != -1 && a[f] != null) {
         if (az.e) {
            az.b(var0);
         } else if (a[f] != null) {
            a[f].c(var0);
         }

         b = false;
      }

   }

   public static void b(GL10 glContext) {
      if (f != -1 && a[f] != null) {
         ++aa.e;
         a[f].f(glContext);
         if (g != -1) {
            int var1 = g;
            e = f;
            a[e].d(glContext);
            a(glContext, var1);
            g = -1;
         }
      }

   }

   public static void c(int var0) {
      if (f != -1 && a[f] != null) {
         a[f].c(var0);
      }

   }

   public static void c(fishing4.a.e var0) {
      if (f != -1 && a[f] != null) {
         if (az.e) {
            az.c(var0);
         } else {
            a[f].b(var0);
         }
      }

   }
}

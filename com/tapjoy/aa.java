package com.tapjoy;

import android.util.Log;

public final class aa {
   private static boolean a = false;

   public static void a(String var0, String var1) {
      if (a) {
         if (var1.length() > 4096) {
            for(int var2 = 0; var2 <= var1.length() / 4096; ++var2) {
               int var4 = (var2 + 1) * 4096;
               int var3 = var4;
               if (var4 > var1.length()) {
                  var3 = var1.length();
               }

               Log.i(var0, var1.substring(var2 * 4096, var3));
            }
         } else {
            Log.i(var0, var1);
         }
      }

   }

   public static void b(String var0, String var1) {
      if (a) {
         Log.e(var0, var1);
      }

   }

   public static void c(String var0, String var1) {
      if (a) {
         Log.w(var0, var1);
      }

   }
}

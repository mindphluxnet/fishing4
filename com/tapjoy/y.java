package com.tapjoy;

import android.os.Build;
import java.lang.reflect.Field;

public final class y {
   public static String a() {
      String var0;
      Exception var1;
      label25: {
         try {
            Field var4 = Class.forName("android.os.Build").getDeclaredField("SERIAL");
            if (!var4.isAccessible()) {
               var4.setAccessible(true);
            }

            var0 = var4.get(Build.class).toString();
         } catch (Exception var3) {
            var1 = var3;
            var0 = null;
            break label25;
         }

         try {
            StringBuilder var5 = new StringBuilder("serial: ");
            aa.a("TapjoyHardwareUtil", var5.append(var0).toString());
            return var0;
         } catch (Exception var2) {
            var1 = var2;
         }
      }

      aa.b("TapjoyHardwareUtil", var1.toString());
      return var0;
   }
}

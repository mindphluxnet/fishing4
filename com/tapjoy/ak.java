package com.tapjoy;

import android.os.Environment;

final class ak implements Runnable {
   final ai a;

   ak(ai var1) {
      this.a = var1;
   }

   public final void run() {
      aa.a("TapjoyVideo", "--- cacheAllVideos called ---");
      int var1 = 0;

      while(true) {
         if (ai.f(this.a)) {
            aa.a("TapjoyVideo", "cacheVideos connection_type: " + TapjoyConnectCore.g());
            aa.a("TapjoyVideo", "cache3g: " + ai.g(this.a));
            aa.a("TapjoyVideo", "cacheWifi: " + ai.h(this.a));
            if (ai.g(this.a) && TapjoyConnectCore.g().equals("mobile") || ai.h(this.a) && TapjoyConnectCore.g().equals("wifi")) {
               if (!"mounted".equals(Environment.getExternalStorageState())) {
                  aa.a("TapjoyVideo", "Media storage unavailable.  Aborting caching videos.");
                  ai.c();
                  break;
               }

               while(ai.i(this.a).size() < ai.j(this.a) && ai.k(this.a).size() > 0) {
                  String var6 = ((am)ai.l(this.a).get(ai.k(this.a).elementAt(0))).c;
                  ai.b(this.a, var6);
               }
            } else {
               aa.a("TapjoyVideo", " * Skipping caching videos because of video flags and connection_type...");
            }

            ai.m(this.a);
            break;
         }

         int var2 = var1;

         Exception var10000;
         label71: {
            boolean var10001;
            try {
               Thread.sleep(500L);
            } catch (Exception var5) {
               var10000 = var5;
               var10001 = false;
               break label71;
            }

            var2 = var1 + 500;
            var1 = var2;
            if ((long)var2 <= 10000L) {
               continue;
            }

            try {
               aa.b("TapjoyVideo", "Error during cacheVideos.  Timeout while waiting for initVideos to finish.");
               break;
            } catch (Exception var4) {
               var10000 = var4;
               var10001 = false;
            }
         }

         Exception var3 = var10000;
         aa.b("TapjoyVideo", "Exception in cacheAllVideos: " + var3.toString());
         var1 = var2;
      }

   }
}

package com.tapjoy;

import android.graphics.BitmapFactory;
import java.net.URL;
import java.net.URLConnection;

final class aj implements Runnable {
   final ai a;

   aj(ai var1) {
      this.a = var1;
   }

   public final void run() {
      boolean var2 = false;
      String var3 = TapjoyConnectCore.c() + "&publisher_user_id=" + TapjoyConnectCore.getUserId();
      new ag();
      var3 = ag.b("https://ws.tapjoyads.com/videos?", var3);
      boolean var1 = var2;
      if (var3 != null) {
         var1 = var2;
         if (var3.length() > 0) {
            var1 = ai.a(this.a, var3);
         }
      }

      if (var1) {
         ai.a(this.a);

         try {
            URL var4 = new URL("https://s3.amazonaws.com/tapjoy/videos/assets/watermark.png");
            URLConnection var6 = var4.openConnection();
            var6.setConnectTimeout(15000);
            var6.setReadTimeout(25000);
            var6.connect();
            ai.a(BitmapFactory.decodeStream(var4.openConnection().getInputStream()));
         } catch (Exception var5) {
            aa.b("TapjoyVideo", "e: " + var5.toString());
         }

         ai.b(this.a);
         ai.c(this.a);
         ai.d();
         if (ai.d(this.a)) {
            aa.a("TapjoyVideo", "trying to cache because of cache_auto flag...");
            ai.e(this.a);
         }

         aa.a("TapjoyVideo", "------------------------------");
         aa.a("TapjoyVideo", "------------------------------");
         aa.a("TapjoyVideo", "INIT DONE!");
         aa.a("TapjoyVideo", "------------------------------");
      } else {
         ai.c();
      }

   }
}

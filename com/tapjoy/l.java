package com.tapjoy;

final class l implements Runnable {
   final k a;

   l(k var1) {
      this.a = var1;
   }

   public final void run() {
      k.c();
      String var1 = ag.b("https://ws.tapjoyads.com/display_ad?", k.a);
      if (var1 != null && var1.length() != 0) {
         if (!k.a(this.a, var1)) {
            k.b();
         }
      } else {
         k.b();
      }

   }
}

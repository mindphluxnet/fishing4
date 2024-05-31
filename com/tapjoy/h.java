package com.tapjoy;

public final class h implements Runnable {
   final g a;

   public h(g var1) {
      this.a = var1;
   }

   public final void run() {
      aa.a("TapjoyConnect", "starting connect call...");
      String var3 = g.c();
      g.j();
      z var5 = ag.a("https://ws.tapjoyads.com/connect?", var3);
      if (var5 != null && var5.a == 200) {
         g.f(var5.c);
         aa.a("TapjoyConnect", "Successfully connected to tapjoy site.");
         if (g.k().length() > 0) {
            var3 = g.d() + "&package_names=" + g.k() + "&";
            long var1 = System.currentTimeMillis() / 1000L;
            String var4 = g.a(var1, g.k());
            var3 = var3 + "timestamp=" + var1 + "&" + "verifier=" + var4;
            g.j();
            var5 = ag.a("https://ws.tapjoyads.com/apps_installed?", var3);
            if (var5 != null && var5.a == 200) {
               aa.a("TapjoyConnect", "Successfully pinged sdkless api.");
            }
         }
      }

   }
}

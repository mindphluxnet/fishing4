package com.tapjoy;

public final class h implements Runnable {
   final TapjoyConnectCore a;

   public h(TapjoyConnectCore var1) {
      this.a = var1;
   }

   public final void run() {
      aa.a("TapjoyConnect", "starting connect call...");
      String var3 = TapjoyConnectCore.c();
      TapjoyConnectCore.j();
      z var5 = ag.a("https://ws.tapjoyads.com/connect?", var3);
      if (var5 != null && var5.a == 200) {
         TapjoyConnectCore.f(var5.c);
         aa.a("TapjoyConnect", "Successfully connected to tapjoy site.");
         if (TapjoyConnectCore.k().length() > 0) {
            var3 = TapjoyConnectCore.d() + "&package_names=" + TapjoyConnectCore.k() + "&";
            long var1 = System.currentTimeMillis() / 1000L;
            String var4 = TapjoyConnectCore.a(var1, TapjoyConnectCore.k());
            var3 = var3 + "timestamp=" + var1 + "&" + "verifier=" + var4;
            TapjoyConnectCore.j();
            var5 = ag.a("https://ws.tapjoyads.com/apps_installed?", var3);
            if (var5 != null && var5.a == 200) {
               aa.a("TapjoyConnect", "Successfully pinged sdkless api.");
            }
         }
      }

   }
}

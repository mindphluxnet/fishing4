package com.tapjoy;

public final class i implements Runnable {
   final TapjoyConnectCore a;
   private String b;

   public i(TapjoyConnectCore var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void run() {
      TapjoyConnectCore.j();
      String var2 = ag.b("https://ws.tapjoyads.com/connect?", this.b);
      if (var2 != null) {
         TapjoyConnectCore var1 = this.a;
         TapjoyConnectCore.g(var2);
      }

   }
}

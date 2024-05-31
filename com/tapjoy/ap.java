package com.tapjoy;

final class ap implements Runnable {
   final TapjoyVideoView a;

   ap(TapjoyVideoView var1) {
      this.a = var1;
   }

   public final void run() {
      aa.a("VIDEO", "SENDING CLICK...");
      new ag();
      String var1 = ag.b(TapjoyVideoView.a().b, "");
      if (var1 != null && var1.contains("OK")) {
         aa.a("VIDEO", "CLICK REQUEST SUCCESS!");
         TapjoyVideoView.d(this.a);
      }

   }
}

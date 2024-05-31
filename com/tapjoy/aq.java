package com.tapjoy;

final class aq implements Runnable {
   final TapjoyVideoView a;

   aq(TapjoyVideoView var1) {
      this.a = var1;
   }

   public final void run() {
      if (TapjoyVideoView.e(this.a)) {
         TapjoyConnectCore.a().d(TapjoyVideoView.a().a);
      }

   }
}

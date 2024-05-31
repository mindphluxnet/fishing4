package com.tapjoy;

final class an implements Runnable {
   final TapjoyVideoView a;

   an(TapjoyVideoView var1) {
      this.a = var1;
   }

   public final void run() {
      TapjoyVideoView.a(this.a).setText(TapjoyVideoView.b(this.a) + " seconds");
   }
}

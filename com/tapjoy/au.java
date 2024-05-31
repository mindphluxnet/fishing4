package com.tapjoy;

import java.util.TimerTask;

final class au extends TimerTask {
   final TapjoyVideoView a;

   private au(TapjoyVideoView var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   au(TapjoyVideoView var1, byte var2) {
      this(var1);
   }

   public final void run() {
      this.a.e.post(this.a.g);
   }
}

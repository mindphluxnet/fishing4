package com.android.vending.licensing;

import android.util.Log;

final class i implements Runnable {
   final h a;

   i(h var1) {
      this.a = var1;
   }

   public final void run() {
      Log.i("LicenseChecker", "Check timed out.");
      g.a(h.c(this.a), h.a(this.a));
      g.b(h.c(this.a), h.a(this.a));
   }
}

package com.android.vending.licensing;

import android.util.Log;

final class j implements Runnable {
   final h a;
   private final int b;
   private final String c;
   private final String d;

   j(h var1, int var2, String var3, String var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final void run() {
      Log.i("LicenseChecker", "Received response.");
      if (g.b(h.c(this.a)).contains(h.a(this.a))) {
         h.b(this.a);
         h.a(this.a).a(g.c(h.c(this.a)), this.b, this.c, this.d);
         g.b(h.c(this.a), h.a(this.a));
      }

   }
}

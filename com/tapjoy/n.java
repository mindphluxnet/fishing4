package com.tapjoy;

import java.util.TimerTask;

final class n extends TimerTask {
   final k a;

   private n(k var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   n(k var1, byte var2) {
      this(var1);
   }

   public final void run() {
      k var1 = this.a;
      var1.e += 10000L;
      aa.a("Banner Ad", "banner elapsed_time: " + this.a.e + " (" + this.a.e / 1000L / 60L + "m " + this.a.e / 1000L % 60L + "s)");
      if (this.a.b == null) {
         this.cancel();
      } else {
         aa.a("Banner Ad", "adView.isShown: " + this.a.b.isShown());
         if (this.a.b.isShown() && g.a() != null) {
            aa.a("Banner Ad", "call connect");
            g.a().b();
            this.cancel();
         }

         if (this.a.e >= 1200000L) {
            this.cancel();
         }
      }

   }
}

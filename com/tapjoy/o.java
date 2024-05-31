package com.tapjoy;

import java.util.TimerTask;

final class o extends TimerTask {
   final k a;

   private o(k var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   o(k var1, byte var2) {
      this(var1);
   }

   public final void run() {
      aa.a("Banner Ad", "refreshing banner ad...");
      this.a.a(k.b());
      if (this.a.c != null) {
         this.a.c.cancel();
         this.a.c = null;
      }

   }
}

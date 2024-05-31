package com.tapjoy;

final class c implements Runnable {
   final a a;

   c(a var1) {
      this.a = var1;
   }

   public final void run() {
      boolean var1 = false;
      String var2 = g.c() + "&tap_points=" + this.a.a + "&publisher_user_id=" + g.e();
      new ag();
      var2 = ag.b("https://ws.tapjoyads.com/points/spend?", var2);
      if (var2 != null) {
         a var3 = this.a;
         var1 = com.tapjoy.a.a(var2);
      }

      if (!var1) {
         com.tapjoy.a.b().a();
      }

   }
}

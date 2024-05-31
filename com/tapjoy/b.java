package com.tapjoy;

final class b implements Runnable {
   final a a;

   b(a var1) {
      this.a = var1;
   }

   public final void run() {
      boolean var1 = false;
      String var2 = g.c() + "&publisher_user_id=" + g.e();
      new ag();
      var2 = ag.b("https://ws.tapjoyads.com/get_vg_store_items/user_account?", var2);
      if (var2 != null) {
         var1 = com.tapjoy.a.a(this.a, var2);
      }

      if (!var1) {
         com.tapjoy.a.a().a("Failed to retrieve points from server");
      }

   }
}

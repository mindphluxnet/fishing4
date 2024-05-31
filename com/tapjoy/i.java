package com.tapjoy;

public final class i implements Runnable {
   final g a;
   private String b;

   public i(g var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void run() {
      g.j();
      String var2 = ag.b("https://ws.tapjoyads.com/connect?", this.b);
      if (var2 != null) {
         g var1 = this.a;
         g.g(var2);
      }

   }
}

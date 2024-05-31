package com.android.vending.licensing;

import android.util.Log;

final class h extends c {
   final g a;
   private final m b;
   private Runnable c;

   public h(g var1, m var2) {
      this.a = var1;
      this.b = var2;
      this.c = new i(this);
      Log.i("LicenseChecker", "Start monitoring timeout.");
      g.a(this.a).postDelayed(this.c, 10000L);
   }

   // $FF: synthetic method
   static m a(h var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static void b(h var0) {
      Log.i("LicenseChecker", "Clearing timeout.");
      g.a(var0.a).removeCallbacks(var0.c);
   }

   // $FF: synthetic method
   static g c(h var0) {
      return var0.a;
   }

   public final void a(int var1, String var2, String var3) {
      g.a(this.a).post(new j(this, var1, var2, var3));
   }
}

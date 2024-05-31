package pnjmobile.fishing4.google_free;

import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

abstract class a {
   protected long a;
   final BillingService b;
   private final int c;

   public a(BillingService var1, int var2) {
      this.b = var1;
      this.c = var2;
   }

   protected static void a(Bundle var0) {
      h.a(var0.getInt("RESPONSE_CODE"));
   }

   public final int a() {
      return this.c;
   }

   protected final Bundle a(String var1) {
      Bundle var2 = new Bundle();
      var2.putString("BILLING_REQUEST", var1);
      var2.putInt("API_VERSION", 2);
      var2.putString("PACKAGE_NAME", this.b.getPackageName());
      return var2;
   }

   protected void a(RemoteException var1) {
      Log.w("BillingService", "remote billing service crashed");
      BillingService.f();
   }

   protected void a(h var1) {
   }

   public final boolean b() {
      boolean var1 = true;
      if (!this.c()) {
         if (BillingService.a(this.b)) {
            BillingService.c().add(this);
         } else {
            var1 = false;
         }
      }

      return var1;
   }

   public final boolean c() {
      boolean var1;
      if (BillingService.d() != null) {
         label27: {
            try {
               this.a = this.d();
               if (this.a >= 0L) {
                  BillingService.e().put(this.a, this);
               }
            } catch (RemoteException var3) {
               this.a(var3);
               break label27;
            }

            var1 = true;
            return var1;
         }
      }

      var1 = false;
      return var1;
   }

   protected abstract long d();
}

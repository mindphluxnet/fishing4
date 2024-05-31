package pnjmobile.fishing4.google_free;

import android.os.Bundle;

final class c extends a {
   final String[] c;
   final BillingService d;

   public c(BillingService var1, int var2, String[] var3) {
      super(var1, var2);
      this.d = var1;
      this.c = var3;
   }

   protected final long d() {
      Bundle var1 = this.a("CONFIRM_NOTIFICATIONS");
      var1.putStringArray("NOTIFY_IDS", this.c);
      var1 = BillingService.d().a(var1);
      a(var1);
      return var1.getLong("REQUEST_ID", f.a);
   }
}

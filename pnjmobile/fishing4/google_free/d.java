package pnjmobile.fishing4.google_free;

import android.os.Bundle;
import android.os.RemoteException;

final class d extends a {
   long c;
   final String[] d;
   final BillingService e;

   public d(BillingService var1, int var2, String[] var3) {
      super(var1, var2);
      this.e = var1;
      this.d = var3;
   }

   protected final void a(RemoteException var1) {
      super.a(var1);
      bj.a(this.c);
   }

   protected final long d() {
      this.c = bj.a();
      Bundle var1 = this.a("GET_PURCHASE_INFORMATION");
      var1.putLong("NONCE", this.c);
      var1.putStringArray("NOTIFY_IDS", this.d);
      var1 = BillingService.d().a(var1);
      a(var1);
      return var1.getLong("REQUEST_ID", f.a);
   }
}

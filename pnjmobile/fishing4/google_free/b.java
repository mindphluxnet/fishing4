package pnjmobile.fishing4.google_free;

import android.os.Bundle;

final class b extends a {
   public String c;
   final BillingService d;

   public b(BillingService var1) {
      super(var1, -1);
      this.d = var1;
      this.c = null;
   }

   protected final long d() {
      Bundle var1 = this.a("CHECK_BILLING_SUPPORTED");
      if (this.c != null) {
         var1.putString("ITEM_TYPE", this.c);
      }

      BillingService.d().a(var1).getInt("RESPONSE_CODE");
      h.a.ordinal();
      String var2 = this.c;
      bh.b();
      return f.a;
   }
}

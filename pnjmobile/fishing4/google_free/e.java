package pnjmobile.fishing4.google_free;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

final class e extends a {
   public final String c;
   public final String d;
   public final String e;
   final BillingService f;

   public e(BillingService var1, String var2, String var3) {
      super(var1, -1);
      this.f = var1;
      this.c = var2;
      this.d = null;
      this.e = var3;
   }

   protected final void a(h var1) {
      BillingService var2 = this.f;
      bh.a(var1);
   }

   protected final long d() {
      Bundle var3 = this.a("REQUEST_PURCHASE");
      var3.putString("ITEM_ID", this.c);
      var3.putString("ITEM_TYPE", this.e);
      if (this.d != null) {
         var3.putString("DEVELOPER_PAYLOAD", this.d);
      }

      Bundle var4 = BillingService.d().a(var3);
      PendingIntent var5 = (PendingIntent)var4.getParcelable("PURCHASE_INTENT");
      long var1;
      if (var5 == null) {
         Log.e("BillingService", "Error with requestPurchase");
         var1 = pnjmobile.fishing4.google_free.f.a;
      } else {
         bh.a(var5, new Intent());
         var1 = var4.getLong("REQUEST_ID", pnjmobile.fishing4.google_free.f.a);
      }

      return var1;
   }
}

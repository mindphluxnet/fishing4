package pnjmobile.fishing4.google_free;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BillingReceiver extends BroadcastReceiver {
   public void onReceive(Context var1, Intent var2) {
      String var6 = var2.getAction();
      if ("com.android.vending.billing.PURCHASE_STATE_CHANGED".equals(var6)) {
         var6 = var2.getStringExtra("inapp_signed_data");
         String var8 = var2.getStringExtra("inapp_signature");
         Intent var7 = new Intent("com.android.vending.billing.PURCHASE_STATE_CHANGED");
         var7.setClass(var1, BillingService.class);
         var7.putExtra("inapp_signed_data", var6);
         var7.putExtra("inapp_signature", var8);
         var1.startService(var7);
      } else if ("com.android.vending.billing.IN_APP_NOTIFY".equals(var6)) {
         var6 = var2.getStringExtra("notification_id");
         var2 = new Intent("fishing4.google_free.GET_PURCHASE_INFORMATION");
         var2.setClass(var1, BillingService.class);
         var2.putExtra("notification_id", var6);
         var1.startService(var2);
      } else if ("com.android.vending.billing.RESPONSE_CODE".equals(var6)) {
         long var4 = var2.getLongExtra("request_id", -1L);
         int var3 = var2.getIntExtra("response_code", h.g.ordinal());
         var2 = new Intent("com.android.vending.billing.RESPONSE_CODE");
         var2.setClass(var1, BillingService.class);
         var2.putExtra("request_id", var4);
         var2.putExtra("response_code", var3);
         var1.startService(var2);
      } else {
         Log.w("BillingReceiver", "unexpected action: " + var6);
      }

   }
}

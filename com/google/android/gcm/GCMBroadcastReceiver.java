package com.google.android.gcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class GCMBroadcastReceiver extends BroadcastReceiver {
   private static boolean a = false;

   public final void onReceive(Context var1, Intent var2) {
      Log.v("GCMBroadcastReceiver", "onReceive: " + var2.getAction());
      String var3;
      if (!a) {
         a = true;
         var3 = this.getClass().getName();
         if (!var3.equals(GCMBroadcastReceiver.class.getName())) {
            com.google.android.gcm.a.a(var3);
         }
      }

      var3 = var1.getPackageName() + ".GCMIntentService";
      Log.v("GCMBroadcastReceiver", "GCM IntentService class: " + var3);
      GCMBaseIntentService.a(var1, var2, var3);
      this.setResult(-1, (String)null, (Bundle)null);
   }
}

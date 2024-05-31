package com.google.android.gcm;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public abstract class GCMBaseIntentService extends IntentService {
   private static PowerManager.WakeLock a;
   private static final Object b = GCMBaseIntentService.class;
   private static int d = 0;
   private static final Random e = new Random();
   private static final int f;
   private static final String g;
   private final String[] c;

   static {
      f = (int)TimeUnit.SECONDS.toMillis(3600L);
      g = Long.toBinaryString(e.nextLong());
   }

   protected GCMBaseIntentService() {
      this(d("DynamicSenderIds"), (String[])null);
   }

   private GCMBaseIntentService(String var1, String[] var2) {
      super(var1);
      this.c = var2;
   }

   protected GCMBaseIntentService(String... var1) {
      this(d(com.google.android.gcm.a.a(var1)), var1);
   }

   static void a(Context var0, Intent var1, String var2) {
      Object var3 = b;
      synchronized(var3) {
         if (a == null) {
            a = ((PowerManager)var0.getSystemService("power")).newWakeLock(1, "GCM_LIB");
         }
      }

      Log.v("GCMBaseIntentService", "Acquiring wakelock");
      a.acquire();
      var1.setClassName(var0, var2);
      var0.startService(var1);
   }

   private static String d(String var0) {
      StringBuilder var2 = (new StringBuilder("GCMIntentService-")).append(var0).append("-");
      int var1 = d + 1;
      d = var1;
      var0 = var2.append(var1).toString();
      Log.v("GCMBaseIntentService", "Intent service name: " + var0);
      return var0;
   }

   protected abstract void a(Context var1, Intent var2);

   protected abstract void a(String var1);

   protected abstract void b(String var1);

   protected abstract void c(String var1);

   public final void onHandleIntent(Intent param1) {
      // $FF: Couldn't be decompiled
   }
}

package pnjmobile.fishing4.google_free;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public class BillingService extends Service implements ServiceConnection {
   private static com.android.vending.a.a a;
   private static LinkedList b = new LinkedList();
   private static HashMap c = new HashMap();

   private boolean a(int var1, String[] var2) {
      return (new c(this, var1, var2)).b();
   }

   // $FF: synthetic method
   static boolean a(BillingService var0) {
      return var0.g();
   }

   // $FF: synthetic method
   static LinkedList c() {
      return b;
   }

   // $FF: synthetic method
   static com.android.vending.a.a d() {
      return a;
   }

   // $FF: synthetic method
   static HashMap e() {
      return c;
   }

   // $FF: synthetic method
   static void f() {
      a = null;
   }

   private boolean g() {
      boolean var1 = true;

      try {
         Intent var2 = new Intent("com.android.vending.billing.MarketBillingService.BIND");
         if (this.bindService(var2, this, 1)) {
            return var1;
         }

         Log.e("BillingService", "Could not bind to service.");
      } catch (SecurityException var3) {
         Log.e("BillingService", "Security exception: " + var3);
      }

      var1 = false;
      return var1;
   }

   public final void a(Context var1) {
      this.attachBaseContext(var1);
   }

   public final boolean a() {
      return (new b(this)).b();
   }

   public final boolean a(String var1, String var2) {
      return (new e(this, var1, var2)).b();
   }

   public final void b() {
      try {
         this.unbindService(this);
      } catch (IllegalArgumentException var2) {
      }

   }

   public IBinder onBind(Intent var1) {
      return null;
   }

   public void onServiceConnected(ComponentName var1, IBinder var2) {
      a = com.android.vending.a.b.a(var2);
      int var3 = -1;

      while(true) {
         a var4 = (a)b.peek();
         if (var4 == null) {
            if (var3 >= 0) {
               this.stopSelf(var3);
            }
            break;
         }

         if (!var4.c()) {
            this.g();
            break;
         }

         b.remove();
         if (var3 < var4.a()) {
            var3 = var4.a();
         }
      }

   }

   public void onServiceDisconnected(ComponentName var1) {
      Log.w("BillingService", "Billing service disconnected");
      a = null;
   }

   public void onStart(Intent var1, int var2) {
      if (var1 != null) {
         String var5 = var1.getAction();
         if ("fishing4.google_free.CONFIRM_NOTIFICATION".equals(var5)) {
            this.a(var2, var1.getStringArrayExtra("notification_id"));
         } else if ("fishing4.google_free.GET_PURCHASE_INFORMATION".equals(var5)) {
            (new d(this, var2, new String[]{var1.getStringExtra("notification_id")})).b();
         } else if ("com.android.vending.billing.PURCHASE_STATE_CHANGED".equals(var5)) {
            ArrayList var9 = bj.a(var1.getStringExtra("inapp_signed_data"), var1.getStringExtra("inapp_signature"));
            if (var9 != null) {
               ArrayList var7 = new ArrayList();

               bk var10;
               for(Iterator var6 = var9.iterator(); var6.hasNext(); bh.a(this, var10.a, var10.c, var10.d, var10.e, var10.f)) {
                  var10 = (bk)var6.next();
                  if (var10.b != null) {
                     var7.add(var10.b);
                  }
               }

               if (!var7.isEmpty()) {
                  this.a(var2, (String[])var7.toArray(new String[var7.size()]));
               }
            }
         } else if ("com.android.vending.billing.RESPONSE_CODE".equals(var5)) {
            long var3 = var1.getLongExtra("request_id", -1L);
            h var11 = h.a(var1.getIntExtra("response_code", h.g.ordinal()));
            a var8 = (a)c.get(var3);
            if (var8 != null) {
               var8.a(var11);
            }

            c.remove(var3);
         }
      }

   }
}

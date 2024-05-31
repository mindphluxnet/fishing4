package pnjmobile.fishing4.google_free;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Handler;
import android.util.Log;
import java.lang.reflect.Method;

public abstract class bf {
   private static final Class[] e;
   private final Activity a;
   private final Handler b;
   private Method c;
   private Object[] d = new Object[5];

   static {
      e = new Class[]{IntentSender.class, Intent.class, Integer.TYPE, Integer.TYPE, Integer.TYPE};
   }

   public bf(Activity var1, Handler var2) {
      this.a = var1;
      this.b = var2;

      try {
         this.c = this.a.getClass().getMethod("startIntentSender", e);
      } catch (SecurityException var3) {
         this.c = null;
      } catch (NoSuchMethodException var4) {
         this.c = null;
      }

   }

   public abstract void a();

   final void a(PendingIntent var1, Intent var2) {
      if (this.c != null) {
         try {
            this.d[0] = var1.getIntentSender();
            this.d[1] = var2;
            this.d[2] = 0;
            this.d[3] = 0;
            this.d[4] = 0;
            this.c.invoke(this.a, this.d);
         } catch (Exception var4) {
            Log.e("PurchaseObserver", "error starting activity", var4);
         }
      } else {
         try {
            var1.send(this.a, 0, var2);
         } catch (PendingIntent.CanceledException var3) {
            Log.e("PurchaseObserver", "error starting activity", var3);
         }
      }

   }

   public abstract void a(g var1);

   final void a(g var1, String var2, int var3, long var4, String var6) {
      this.b.post(new bg(this, var1, var2, var3, var4, var6));
   }

   public abstract void a(h var1);
}

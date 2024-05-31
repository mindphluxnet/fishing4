package com.android.vending.licensing;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Queue;
import java.util.Set;

public final class g implements ServiceConnection {
   private static final SecureRandom a = new SecureRandom();
   private ILicensingService b;
   private PublicKey c;
   private final Context d;
   private final n e;
   private Handler f;
   private final Set g;
   private final Queue h;

   // $FF: synthetic method
   static Handler a(g var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static void a(g var0, m var1) {
      var0.b(var1);
   }

   private void a(m var1) {
      synchronized(this){}

      try {
         this.g.remove(var1);
         if (this.g.isEmpty()) {
            this.b();
         }
      } finally {
         ;
      }

   }

   // $FF: synthetic method
   static Set b(g var0) {
      return var0.g;
   }

   private void b() {
      if (this.b != null) {
         try {
            this.d.unbindService(this);
         } catch (IllegalArgumentException var2) {
            Log.e("LicenseChecker", "Unable to unbind from licensing service (already unbound)");
         }

         this.b = null;
      }

   }

   // $FF: synthetic method
   static void b(g var0, m var1) {
      var0.a(var1);
   }

   private void b(m var1) {
      synchronized(this){}

      try {
         n var2 = this.e;
         o var5 = o.c;
         if (this.e.a()) {
            var1.a();
         } else {
            var1.a();
         }
      } finally {
         ;
      }

   }

   // $FF: synthetic method
   static PublicKey c(g var0) {
      return var0.c;
   }

   public final void a() {
      synchronized(this){}

      try {
         this.b();
         this.f.getLooper().quit();
      } finally {
         ;
      }

   }

   public final void onServiceConnected(ComponentName param1, IBinder param2) {
      // $FF: Couldn't be decompiled
   }

   public final void onServiceDisconnected(ComponentName var1) {
      synchronized(this){}

      try {
         Log.w("LicenseChecker", "Service unexpectedly disconnected.");
         this.b = null;
      } finally {
         ;
      }

   }
}

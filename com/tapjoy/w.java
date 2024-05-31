package com.tapjoy;

import android.os.AsyncTask;

final class w extends AsyncTask {
   final TapjoyFeaturedAppWebView a;

   private w(TapjoyFeaturedAppWebView var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   w(TapjoyFeaturedAppWebView var1, byte var2) {
      this(var1);
   }

   private static Boolean a() {
      try {
         Thread.sleep(200L);
      } catch (InterruptedException var1) {
         var1.printStackTrace();
      }

      return true;
   }

   // $FF: synthetic method
   protected final Object doInBackground(Object... var1) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   protected final void onPostExecute(Object var1) {
      if (TapjoyFeaturedAppWebView.a(this.a) != null) {
         TapjoyFeaturedAppWebView.a(this.a).loadUrl("javascript:window.onorientationchange();");
      }

   }
}

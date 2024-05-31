package com.tapjoy;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

final class ao extends WebViewClient {
   final TapjoyVideoView a;

   ao(TapjoyVideoView var1) {
      this.a = var1;
   }

   public final boolean shouldOverrideUrlLoading(WebView var1, String var2) {
      aa.a("VIDEO", "URL = [" + var2 + "]");
      if (var2.contains("offer_wall")) {
         aa.a("VIDEO", "back to offers");
         this.a.finish();
      } else if (var2.contains("tjvideo")) {
         aa.a("VIDEO", "replay");
         TapjoyVideoView.c(this.a);
      } else if (var2.contains("ws.tapjoyads.com")) {
         aa.a("VIDEO", "Open redirecting URL = [" + var2 + "]");
         var1.loadUrl(var2);
      } else {
         aa.a("VIDEO", "Opening URL in new browser = [" + var2 + "]");
         Intent var3 = new Intent("android.intent.action.VIEW", Uri.parse(var2));
         this.a.startActivity(var3);
      }

      return true;
   }
}

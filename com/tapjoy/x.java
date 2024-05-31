package com.tapjoy;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

final class x extends WebViewClient {
   final TapjoyFeaturedAppWebView a;

   private x(TapjoyFeaturedAppWebView var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   x(TapjoyFeaturedAppWebView var1, byte var2) {
      this(var1);
   }

   public final void onPageFinished(WebView var1, String var2) {
      TapjoyFeaturedAppWebView.b(this.a).setVisibility(8);
   }

   public final void onPageStarted(WebView var1, String var2, Bitmap var3) {
      TapjoyFeaturedAppWebView.b(this.a).setVisibility(0);
      TapjoyFeaturedAppWebView.b(this.a).bringToFront();
   }

   public final boolean shouldOverrideUrlLoading(WebView var1, String var2) {
      aa.a("Full Screen Ad", "URL = [" + var2 + "]");
      if (var2.contains("showOffers")) {
         aa.a("Full Screen Ad", "show offers");
         TapjoyFeaturedAppWebView.c(this.a);
      } else if (var2.contains("dismiss")) {
         aa.a("Full Screen Ad", "dismiss");
         TapjoyFeaturedAppWebView.d(this.a);
      } else if (var2.contains("ws.tapjoyads.com")) {
         aa.a("Full Screen Ad", "Open redirecting URL = [" + var2 + "]");
         var1.loadUrl(var2);
      } else {
         aa.a("Full Screen Ad", "Opening URL in new browser = [" + var2 + "]");
         Intent var3 = new Intent("android.intent.action.VIEW", Uri.parse(var2));
         this.a.startActivity(var3);
      }

      return true;
   }
}

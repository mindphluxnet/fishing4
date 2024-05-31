package com.tapjoy;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;

final class ae extends WebViewClient {
   final TapjoyReEngagementAdWebView a;

   private ae(TapjoyReEngagementAdWebView var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   ae(TapjoyReEngagementAdWebView var1, byte var2) {
      this(var1);
   }

   public final void onPageFinished(WebView var1, String var2) {
      TapjoyReEngagementAdWebView.b(this.a).setVisibility(8);
   }

   public final void onPageStarted(WebView var1, String var2, Bitmap var3) {
      TapjoyReEngagementAdWebView.b(this.a).setVisibility(0);
      TapjoyReEngagementAdWebView.b(this.a).bringToFront();
   }

   public final boolean shouldOverrideUrlLoading(WebView var1, String var2) {
      aa.a("Re-engagement Ad", "URL = [" + var2 + "]");
      if (var2.startsWith("http://ok")) {
         aa.a("Re-engagement Ad", "dismiss");
         TapjoyReEngagementAdWebView.c(this.a);
      }

      return true;
   }
}

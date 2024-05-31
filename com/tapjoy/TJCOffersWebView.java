package com.tapjoy;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

public class TJCOffersWebView extends Activity {
   final String a = "Offers";
   private WebView b = null;
   private String c = null;
   private ProgressBar d;
   private Dialog e = null;
   private String f = "";
   private String g = "";
   private String h = "";
   private boolean i = false;
   private boolean j = false;

   // $FF: synthetic method
   static ProgressBar a(TJCOffersWebView var0) {
      return var0.d;
   }

   // $FF: synthetic method
   static void a(TJCOffersWebView var0, Dialog var1) {
      var0.e = var1;
   }

   // $FF: synthetic method
   static Dialog b(TJCOffersWebView var0) {
      return var0.e;
   }

   // $FF: synthetic method
   static boolean c(TJCOffersWebView var0) {
      return var0.i;
   }

   protected void onCreate(Bundle var1) {
      Bundle var2 = this.getIntent().getExtras();
      if (var2 != null) {
         if (var2.getString("DISPLAY_AD_URL") != null) {
            this.i = true;
            this.c = var2.getString("DISPLAY_AD_URL");
         } else {
            this.i = false;
            this.g = var2.getString("URL_PARAMS");
            this.h = var2.getString("USER_ID");
            this.g = this.g + "&publisher_user_id=" + this.h;
            if (TapjoyConnectCore.f().length() > 0) {
               this.g = this.g + "&" + TapjoyConnectCore.f();
            }

            aa.a("Offers", "urlParams: [" + this.g + "]");
            this.c = "https://ws.tapjoyads.com/get_offers/webpage?" + this.g;
         }
      } else {
         aa.b("Offers", "Tapjoy offers meta data initialization fail.");
      }

      this.c = this.c.replaceAll(" ", "%20");
      this.f = TapjoyConnectCore.h();
      aa.a("Offers", "clientPackage: [" + this.f + "]");
      super.onCreate(var1);
      this.requestWindowFeature(1);
      RelativeLayout var3 = new RelativeLayout(this);
      this.b = new WebView(this);
      this.b.setWebViewClient(new d(this, (byte)0));
      this.b.getSettings().setJavaScriptEnabled(true);
      this.d = new ProgressBar(this, (AttributeSet)null, 16842874);
      this.d.setVisibility(0);
      RelativeLayout.LayoutParams var4 = new RelativeLayout.LayoutParams(-2, -2);
      var4.addRule(13);
      this.d.setLayoutParams(var4);
      var3.addView(this.b, -1, -1);
      var3.addView(this.d);
      this.setContentView(var3);
      this.b.loadUrl(this.c);
      aa.a("Offers", "Opening URL = [" + this.c + "]");
   }

   protected void onDestroy() {
      super.onDestroy();
      if (this.b != null) {
         this.b.clearCache(true);
         this.b.destroyDrawingCache();
         this.b.destroy();
      }

   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      boolean var3;
      if (var1 == 4 && this.b.canGoBack()) {
         this.b.goBack();
         var3 = true;
      } else {
         var3 = super.onKeyDown(var1, var2);
      }

      return var3;
   }

   protected void onResume() {
      super.onResume();
      if (this.c != null && this.b != null) {
         this.b.loadUrl(this.c);
      }

      if (this.j && TapjoyConnectCore.a() != null) {
         aa.a("Offers", "call connect");
         TapjoyConnectCore.a().b();
      }

      this.j = true;
   }
}

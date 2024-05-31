package com.tapjoy;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

public class TapjoyFeaturedAppWebView extends Activity {
   final String a = "Full Screen Ad";
   private WebView b = null;
   private ProgressBar c;
   private String d = "";
   private String e = "";
   private String f = "";
   private boolean g = false;

   // $FF: synthetic method
   static WebView a(TapjoyFeaturedAppWebView var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static ProgressBar b(TapjoyFeaturedAppWebView var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static void c(TapjoyFeaturedAppWebView var0) {
      aa.a("Full Screen Ad", "Showing offers, userID: " + var0.e);
      aa.a("Full Screen Ad", "Showing offers, URL PARAMS: " + var0.f);
      Intent var1 = new Intent(var0, TJCOffersWebView.class);
      var1.putExtra("USER_ID", var0.e);
      var1.putExtra("URL_PARAMS", var0.f);
      var0.startActivity(var1);
   }

   // $FF: synthetic method
   static void d(TapjoyFeaturedAppWebView var0) {
      var0.finish();
   }

   public void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      if (this.b != null) {
         (new w(this, (byte)0)).execute(new Void[0]);
      }

   }

   protected void onCreate(Bundle var1) {
      Bundle var2 = this.getIntent().getExtras();
      this.e = var2.getString("USER_ID");
      this.f = var2.getString("URL_PARAMS");
      this.d = var2.getString("FULLSCREEN_AD_URL");
      this.d = this.d.replaceAll(" ", "%20");
      super.onCreate(var1);
      this.requestWindowFeature(1);
      RelativeLayout var4 = new RelativeLayout(this);
      this.b = new WebView(this);
      this.b.setWebViewClient(new x(this, (byte)0));
      this.b.getSettings().setJavaScriptEnabled(true);
      this.c = new ProgressBar(this, (AttributeSet)null, 16842874);
      this.c.setVisibility(0);
      RelativeLayout.LayoutParams var3 = new RelativeLayout.LayoutParams(-2, -2);
      var3.addRule(13);
      this.c.setLayoutParams(var3);
      var4.addView(this.b, -1, -1);
      var4.addView(this.c);
      this.setContentView(var4);
      this.b.loadUrl(this.d);
      aa.a("Full Screen Ad", "Opening Full Screen AD URL = [" + this.d + "]");
   }

   protected void onResume() {
      super.onResume();
      if (this.g && TapjoyConnectCore.a() != null) {
         aa.a("Full Screen Ad", "call connect");
         TapjoyConnectCore.a().b();
      }

      this.g = true;
   }
}

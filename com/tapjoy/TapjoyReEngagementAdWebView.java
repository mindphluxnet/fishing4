package com.tapjoy;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

public class TapjoyReEngagementAdWebView extends Activity {
   final String a = "Re-engagement Ad";
   private WebView b = null;
   private ProgressBar c;
   private String d = "";

   // $FF: synthetic method
   static WebView a(TapjoyReEngagementAdWebView var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static ProgressBar b(TapjoyReEngagementAdWebView var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static void c(TapjoyReEngagementAdWebView var0) {
      var0.finish();
   }

   public void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      if (this.b != null) {
         (new ad(this, (byte)0)).execute(new Void[0]);
      }

   }

   protected void onCreate(Bundle var1) {
      this.d = this.getIntent().getExtras().getString("RE_ENGAGEMENT_HTML_DATA");
      super.onCreate(var1);
      this.requestWindowFeature(1);
      RelativeLayout var3 = new RelativeLayout(this);
      this.b = new WebView(this);
      this.b.setWebViewClient(new ae(this, (byte)0));
      this.b.getSettings().setJavaScriptEnabled(true);
      this.c = new ProgressBar(this, (AttributeSet)null, 16842874);
      this.c.setVisibility(0);
      RelativeLayout.LayoutParams var2 = new RelativeLayout.LayoutParams(-2, -2);
      var2.addRule(13);
      this.c.setLayoutParams(var2);
      var3.addView(this.b, -1, -1);
      var3.addView(this.c);
      this.setContentView(var3);
      this.b.loadDataWithBaseURL("https://ws.tapjoyads.com/", this.d, "text/html", "utf-8", (String)null);
      aa.a("Re-engagement Ad", "Opening Re-engagement ad = [" + this.d + "]");
   }
}

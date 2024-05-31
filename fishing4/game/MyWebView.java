package fishing4.game;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.webkit.WebView;

public class MyWebView extends Activity implements View.OnTouchListener {
   private static String c = new String();
   private WebView a;
   private ProgressDialog b;
   private final Handler d = new Handler();

   // $FF: synthetic method
   static ProgressDialog a(MyWebView var0) {
      return var0.b;
   }

   public static void a(String var0) {
      c = new String(var0);
   }

   public void onBackPressed() {
      this.finish();
      this.overridePendingTransition(2130968576, 2130968577);
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      Window var2 = this.getWindow();
      var2.setFlags(1024, 1024);
      var2.addFlags(128);
      this.requestWindowFeature(2);
      this.setRequestedOrientation(1);
      this.setContentView(2130903044);
      this.a = (WebView)this.findViewById(2131099664);
      this.a.getSettings().setAppCacheEnabled(true);
      this.a.getSettings().setJavaScriptEnabled(true);
      this.a.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
      this.a.setVerticalScrollbarOverlay(true);
      this.a.addJavascriptInterface(new ap(this, (byte)0), "MyWebView");
      this.a.loadUrl(c);
      this.b = new ProgressDialog(this);
      this.b.requestWindowFeature(1);
      this.b.setMessage("Loading...");
      this.b.setCancelable(false);
      this.a.setWebViewClient(new ao(this));
   }

   public boolean onTouch(View var1, MotionEvent var2) {
      return false;
   }
}

package fishing4.game;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

final class ao extends WebViewClient {
   final MyWebView a;

   ao(MyWebView var1) {
      this.a = var1;
   }

   public final void onPageFinished(WebView var1, String var2) {
      super.onPageFinished(var1, var2);

      try {
         MyWebView.a(this.a).dismiss();
      } catch (Exception var3) {
      }

   }

   public final void onPageStarted(WebView var1, String var2, Bitmap var3) {
      super.onPageStarted(var1, var2, var3);
      MyWebView.a(this.a).show();
   }

   public final boolean shouldOverrideUrlLoading(WebView var1, String var2) {
      if (var2.startsWith("mailto")) {
         this.a.startActivity(new Intent("android.intent.action.SENDTO", Uri.parse("mailto:help@pnjmobile.co.kr?subject=[원조낚시광4-NEW이벤트1 당첨자]")));
      } else {
         var1.loadUrl(var2);
      }

      return true;
   }
}

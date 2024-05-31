package com.facebook.android;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

final class e extends WebViewClient {
   final FbDialog a;

   private e(FbDialog var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   e(FbDialog var1, byte var2) {
      this(var1);
   }

   public final void onPageFinished(WebView var1, String var2) {
      super.onPageFinished(var1, var2);
      String var4 = FbDialog.c(this.a).getTitle();
      if (var4 != null && var4.length() > 0) {
         FbDialog.d(this.a).setText(var4);
      }

      try {
         FbDialog.b(this.a).dismiss();
      } catch (Exception var3) {
      }

   }

   public final void onPageStarted(WebView var1, String var2, Bitmap var3) {
      Log.d("Facebook-WebView", "Webview loading URL: " + var2);
      super.onPageStarted(var1, var2, var3);
      FbDialog.b(this.a).show();
   }

   public final void onReceivedError(WebView var1, int var2, String var3, String var4) {
      super.onReceivedError(var1, var2, var3, var4);
      FbDialog.a(this.a).a(new DialogError(var3, var2, var4));
      this.a.dismiss();
   }

   public final boolean shouldOverrideUrlLoading(WebView var1, String var2) {
      boolean var3 = true;
      Log.d("Facebook-WebView", "Redirect URL: " + var2);
      if (var2.startsWith("fbconnect://success")) {
         Bundle var4 = FbUtil.a(var2);
         var2 = var4.getString("error");
         String var5 = var2;
         if (var2 == null) {
            var5 = var4.getString("error_type");
         }

         if (var5 == null) {
            FbDialog.a(this.a).a(var4);
         } else if (!var5.equals("access_denied") && !var5.equals("OAuthAccessDeniedException")) {
            FbDialog.a(this.a).a(new FacebookError(var5));
         } else {
            FbDialog.a(this.a).a();
         }

         this.a.dismiss();
      } else if (var2.startsWith("fbconnect://cancel")) {
         FbDialog.a(this.a).a();
         this.a.dismiss();
      } else if (var2.contains("touch")) {
         var3 = false;
      } else {
         this.a.getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(var2)));
      }

      return var3;
   }
}

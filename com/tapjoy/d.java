package com.tapjoy;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Hashtable;

final class d extends WebViewClient {
   final TJCOffersWebView a;

   private d(TJCOffersWebView var1) {
      this.a = var1;
   }

   // $FF: synthetic method
   d(TJCOffersWebView var1, byte var2) {
      this(var1);
   }

   public final void onPageFinished(WebView var1, String var2) {
      TJCOffersWebView.a(this.a).setVisibility(8);
   }

   public final void onPageStarted(WebView var1, String var2, Bitmap var3) {
      TJCOffersWebView.a(this.a).setVisibility(0);
      TJCOffersWebView.a(this.a).bringToFront();
   }

   public final boolean shouldOverrideUrlLoading(WebView var1, String var2) {
      aa.a("Offers", "URL = [" + var2 + "]");
      if (var2.startsWith("tjvideo://")) {
         Hashtable var10 = new Hashtable();
         int var4 = var2.indexOf("://");
         String var9 = "";
         String var7 = "";
         int var5 = var4 + 3;

         boolean var6;
         String var8;
         String var12;
         boolean var14;
         for(var6 = false; var5 < var2.length() && var5 != -1; var6 = var14) {
            char var3 = var2.charAt(var5);
            if (!var6) {
               if (var3 == '=') {
                  var8 = Uri.decode(var9);
                  var12 = "";
                  var14 = true;
               } else {
                  var12 = var9 + var3;
                  var8 = var7;
                  var14 = var6;
               }
            } else {
               var8 = var7;
               var12 = var9;
               var14 = var6;
               if (var6) {
                  if (var3 == '&') {
                     var8 = Uri.decode(var9);
                     var12 = "";
                     aa.a("Offers", "k:v: " + var7 + ", " + var8);
                     var10.put(var7, var8);
                     var14 = false;
                     var8 = var7;
                  } else {
                     var12 = var9 + var3;
                     var8 = var7;
                     var14 = var6;
                  }
               }
            }

            ++var5;
            var7 = var8;
            var9 = var12;
         }

         if (var6 && var9.length() > 0) {
            var12 = Uri.decode(var9);
            aa.a("Offers", "k:v: " + var7 + ", " + var12);
            var10.put(var7, var12);
         }

         var8 = (String)var10.get("video_id");
         var9 = (String)var10.get("amount");
         var7 = (String)var10.get("currency_name");
         var2 = (String)var10.get("click_url");
         var12 = (String)var10.get("video_complete_url");
         String var15 = (String)var10.get("video_url");
         aa.a("Offers", "videoID: " + var8);
         aa.a("Offers", "currencyAmount: " + var9);
         aa.a("Offers", "currencyName: " + var7);
         aa.a("Offers", "clickURL: " + var2);
         aa.a("Offers", "webviewURL: " + var12);
         aa.a("Offers", "videoURL: " + var15);
         if (ai.a().a(var8, var7, var9, var2, var12, var15)) {
            aa.a("Offers", "VIDEO");
         } else {
            aa.b("Offers", "Unable to play video: " + var8);
            TJCOffersWebView.a(this.a, (new AlertDialog.Builder(this.a)).setTitle("").setMessage("Unable to play video.").setPositiveButton("OK", new e(this)).create());

            try {
               TJCOffersWebView.b(this.a).show();
            } catch (Exception var11) {
               aa.b("Offers", "e: " + var11.toString());
            }
         }
      } else if (var2.contains("ws.tapjoyads.com")) {
         aa.a("Offers", "Open redirecting URL = [" + var2 + "]");
         var1.loadUrl(var2);
      } else {
         aa.a("Offers", "Opening URL in new browser = [" + var2 + "]");
         Intent var13 = new Intent("android.intent.action.VIEW", Uri.parse(var2));
         this.a.startActivity(var13);
         aa.a("Offers", "skipOfferWall: " + TJCOffersWebView.c(this.a));
         if (TJCOffersWebView.c(this.a)) {
            this.a.finish();
         }
      }

      return true;
   }
}

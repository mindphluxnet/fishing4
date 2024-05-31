package com.facebook.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieSyncManager;
import fishing4.game.p;

public class Facebook {
   public static String a = "";
   protected static String b = "https://m.facebook.com/dialog/";
   protected static String c = "https://graph.facebook.com/";
   protected static String d = "https://api.facebook.com/restserver.php";
   private String e = null;
   private long f = 0L;
   private String g;
   private Activity h;
   private String[] i;
   private int j;
   private Facebook$DialogListener k;

   public Facebook(String var1) {
      if (var1 == null) {
         throw new IllegalArgumentException("You must specify your application ID when instantiating a Facebook object. See README for details.");
      } else {
         this.g = var1;
      }
   }

   // $FF: synthetic method
   static Facebook$DialogListener a(Facebook var0) {
      return var0.k;
   }

   private void a(Activity var1, String[] var2) {
      a = "access_token";
      Bundle var3 = new Bundle();
      if (var2.length > 0) {
         var3.putString("scope", TextUtils.join(",", var2));
      }

      CookieSyncManager.createInstance(var1);
      this.a(var1, "oauth", var3, new b(this));
   }

   private void a(Context var1, String var2, Bundle var3, Facebook$DialogListener var4) {
      String var6 = b + var2;
      var3.putString("display", "touch");
      var3.putString("redirect_uri", "fbconnect://success");
      if (var2.equals("oauth")) {
         var3.putString("type", "user_agent");
         var3.putString("client_id", this.g);
      } else {
         var3.putString("app_id", this.g);
         int var5 = p.a;
         var3.putString("link", "http://pnjmobile.co.kr/l/s.php?g=200&k=fk");
         var3.putString("picture", "http://www.pnjmobile.com/icon_img/Fish4.png");
         if (p.a == 0) {
            var3.putString("name", "리얼한 낚시!! 원조낚시광4의 매력 속으로~");
         } else {
            var3.putString("name", "Real Fishing!! Fall in the charm of Extreme Fishing 2.");
         }

         var3.putString("caption", "www.pnjmobile.com");
         var3.putString("description", p.n);
      }

      if (this.a()) {
         var3.putString(a, this.e);
      }

      var2 = var6 + "?" + FbUtil.a(var3);
      if (var1.checkCallingOrSelfPermission("android.permission.INTERNET") != 0) {
         FbUtil.a(var1, "Error", "Application requires permission to access the Internet");
      } else {
         (new FbDialog(var1, var2, var4)).show();
      }

   }

   public final String a(String var1, Bundle var2, String var3) {
      var2.putString("format", "json");
      if (this.a()) {
         var2.putString(a, this.e);
      }

      if (var1 != null) {
         var1 = c + var1;
      } else {
         var1 = d;
      }

      return FbUtil.a(var1, var3, var2);
   }

   public final void a(int var1, int var2, Intent var3) {
      if (var1 == this.j) {
         if (var2 == -1) {
            String var5 = var3.getStringExtra("error");
            String var4 = var5;
            if (var5 == null) {
               var4 = var3.getStringExtra("error_type");
            }

            if (var4 != null) {
               if (!var4.equals("service_disabled") && !var4.equals("AndroidAuthKillSwitchException")) {
                  if (!var4.equals("access_denied") && !var4.equals("OAuthAccessDeniedException")) {
                     Log.d("Facebook-authorize", "Login failed: " + var4);
                     this.k.a(new FacebookError(var4));
                  } else {
                     Log.d("Facebook-authorize", "Login canceled by user.");
                     this.k.a();
                  }
               } else {
                  Log.d("Facebook-authorize", "Hosted auth currently disabled. Retrying dialog auth...");
                  this.a(this.h, this.i);
               }
            } else {
               this.e = var3.getStringExtra(a);
               this.b(var3.getStringExtra("expires_in"));
               if (this.a()) {
                  Log.d("Facebook-authorize", "Login Success! access_token=" + this.e + " expires=" + this.f);
                  this.k.a(var3.getExtras());
               } else {
                  this.k.a(new FacebookError("Failed to receive access token."));
               }
            }
         } else if (var2 == 0) {
            if (var3 != null) {
               Log.d("Facebook-authorize", "Login failed: " + var3.getStringExtra("error"));
               this.k.a(new DialogError(var3.getStringExtra("error"), var3.getIntExtra("error_code", -1), var3.getStringExtra("failing_url")));
            } else {
               Log.d("Facebook-authorize", "Login canceled by user.");
               this.k.a();
            }
         }
      }

   }

   public final void a(Activity var1, String[] var2, Facebook$DialogListener var3) {
      this.k = var3;
      this.a(var1, var2);
   }

   public final void a(Context var1, String var2, Facebook$DialogListener var3) {
      this.a(var1, var2, new Bundle(), var3);
   }

   public final void a(String var1) {
      this.e = var1;
   }

   public final boolean a() {
      boolean var1;
      if (this.e == null || this.f != 0L && System.currentTimeMillis() >= this.f) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public final String b() {
      return this.e;
   }

   public final void b(String var1) {
      if (var1 != null && !var1.equals("0")) {
         this.f = System.currentTimeMillis() + (long)(Integer.parseInt(var1) * 1000);
      }

   }

   public final long c() {
      return this.f;
   }
}

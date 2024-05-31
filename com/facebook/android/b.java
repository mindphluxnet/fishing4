package com.facebook.android;

import android.os.Bundle;
import android.util.Log;
import android.webkit.CookieSyncManager;

final class b implements Facebook$DialogListener {
   final Facebook a;

   b(Facebook var1) {
      this.a = var1;
   }

   public final void a() {
      Log.d("Facebook-authorize", "Login canceled");
      Facebook.a(this.a).a();
   }

   public final void a(Bundle var1) {
      CookieSyncManager.getInstance().sync();
      this.a.a(var1.getString(Facebook.a));
      this.a.b(var1.getString("expires_in"));
      if (this.a.a()) {
         Log.d("Facebook-authorize", "Login Success! access_token=" + this.a.b() + " expires=" + this.a.c());
         Facebook.a(this.a).a(var1);
      } else {
         Facebook.a(this.a).a(new FacebookError("Failed to receive access token."));
      }

   }

   public final void a(DialogError var1) {
      Log.d("Facebook-authorize", "Login failed: " + var1);
      Facebook.a(this.a).a(var1);
   }

   public final void a(FacebookError var1) {
      Log.d("Facebook-authorize", "Login failed: " + var1);
      Facebook.a(this.a).a(var1);
   }
}

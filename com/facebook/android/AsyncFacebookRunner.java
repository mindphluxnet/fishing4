package com.facebook.android;

import android.os.Bundle;

public class AsyncFacebookRunner {
   Facebook a;

   public AsyncFacebookRunner(Facebook var1) {
      this.a = var1;
   }

   public final void a(String var1, AsyncFacebookRunner$RequestListener var2) {
      (new a(this, var1, new Bundle(), "GET", var2)).start();
   }
}

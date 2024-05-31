package com.facebook.android;

import android.os.Bundle;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

final class a extends Thread {
   final AsyncFacebookRunner a;
   private final String b;
   private final Bundle c;
   private final String d;
   private final AsyncFacebookRunner$RequestListener e;
   private final Object f;

   a(AsyncFacebookRunner var1, String var2, Bundle var3, String var4, AsyncFacebookRunner$RequestListener var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = null;
      super();
   }

   public final void run() {
      AsyncFacebookRunner$RequestListener var1;
      Object var3;
      AsyncFacebookRunner$RequestListener var9;
      try {
         String var8 = this.a.a.a(this.b, this.c, this.d);
         var9 = this.e;
         var3 = this.f;
         var9.a(var8);
      } catch (FileNotFoundException var4) {
         var9 = this.e;
         Object var7 = this.f;
         var9.a(var4);
      } catch (MalformedURLException var5) {
         var1 = this.e;
         Object var2 = this.f;
         var1.a(var5);
      } catch (IOException var6) {
         var1 = this.e;
         var3 = this.f;
         var1.a(var6);
      }

   }
}

package com.facebook.android;

import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;

public abstract class BaseRequestListener implements AsyncFacebookRunner$RequestListener {
   public final void a(FileNotFoundException var1) {
      Log.e("Facebook", var1.getMessage());
      var1.printStackTrace();
   }

   public final void a(IOException var1) {
      Log.e("Facebook", var1.getMessage());
      var1.printStackTrace();
   }

   public final void a(MalformedURLException var1) {
      Log.e("Facebook", var1.getMessage());
      var1.printStackTrace();
   }
}

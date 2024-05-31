package com.facebook.android;

import android.util.Log;
import org.json.JSONException;

public class FacebookMainView$SampleRequestListener extends BaseRequestListener {
   final FacebookMainView a;

   // $FF: synthetic method
   static FacebookMainView a(FacebookMainView$SampleRequestListener var0) {
      return var0.a;
   }

   public final void a(String var1) {
      try {
         StringBuilder var2 = new StringBuilder("Response: ");
         Log.d("Facebook-Example", var2.append(var1.toString()).toString());
         var1 = FbUtil.b(var1).getString("name");
         FacebookMainView var6 = this.a;
         c var3 = new c(this, var1);
         var6.runOnUiThread(var3);
      } catch (JSONException var4) {
         Log.w("Facebook-Example", "JSON Error in response");
      } catch (FacebookError var5) {
         Log.w("Facebook-Example", "Facebook Error: " + var5.getMessage());
      }

   }
}

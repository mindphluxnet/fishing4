package com.facebook.android;

import android.os.Bundle;

public class FacebookMainView$SampleDialogListener extends BaseDialogListener {
   final FacebookMainView a;

   public FacebookMainView$SampleDialogListener(FacebookMainView var1) {
      this.a = var1;
   }

   public final void a(Bundle var1) {
      String var2 = var1.getString("post_id");
      if (var2 != null) {
         FacebookMainView.b(this.a).a(var2, new FacebookMainView$WallPostRequestListener(this.a));
      } else {
         this.a.a();
      }

   }
}

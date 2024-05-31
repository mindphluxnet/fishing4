package com.facebook.android;

public abstract class BaseDialogListener implements Facebook$DialogListener {
   public final void a() {
   }

   public final void a(DialogError var1) {
      var1.printStackTrace();
   }

   public final void a(FacebookError var1) {
      var1.printStackTrace();
   }
}

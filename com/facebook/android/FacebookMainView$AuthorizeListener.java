package com.facebook.android;

import android.os.Bundle;

public class FacebookMainView$AuthorizeListener implements Facebook$DialogListener {
   final FacebookMainView a;

   public FacebookMainView$AuthorizeListener(FacebookMainView var1) {
      this.a = var1;
   }

   public final void a() {
      this.a.a();
   }

   public final void a(Bundle var1) {
      if (FacebookMainView.b == 0) {
         this.a.b();
      } else if (FacebookMainView.b == 1) {
         this.a.c();
      } else {
         this.a.a();
      }

   }

   public final void a(DialogError var1) {
      this.a.a();
   }

   public final void a(FacebookError var1) {
      this.a.a();
   }
}

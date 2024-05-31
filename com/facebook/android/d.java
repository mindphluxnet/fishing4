package com.facebook.android;

import android.view.MotionEvent;
import android.view.View;

final class d implements View.OnTouchListener {
   final FbDialog a;

   d(FbDialog var1) {
      this.a = var1;
   }

   public final boolean onTouch(View var1, MotionEvent var2) {
      boolean var3 = true;
      switch (var2.getAction()) {
         case 0:
            FbDialog.d(this.a).setBackgroundColor(FbDialog.a());
            break;
         case 1:
            FbDialog.d(this.a).setBackgroundColor(FbDialog.b());
            this.a.a.finish();
            break;
         default:
            var3 = false;
      }

      return var3;
   }
}

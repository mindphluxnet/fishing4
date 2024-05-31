package com.pnjmobile.tnk;

import android.view.MotionEvent;
import android.view.View;

final class b implements View.OnTouchListener {
   final Pnjtnk a;

   b(Pnjtnk var1) {
      this.a = var1;
   }

   public final boolean onTouch(View var1, MotionEvent var2) {
      switch (var2.getAction()) {
         case 0:
            var1.setBackgroundDrawable(Pnjtnk.a(this.a, var1.getId()));
            break;
         case 1:
         default:
            var1.setBackgroundDrawable(Pnjtnk.b(this.a, var1.getId()));
         case 2:
      }

      return false;
   }
}

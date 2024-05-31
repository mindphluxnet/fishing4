package com.tapjoy;

import android.content.DialogInterface;

final class e implements DialogInterface.OnClickListener {
   final d a;

   e(d var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      var1.dismiss();
   }
}

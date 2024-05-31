package com.pnjmobile.tnk;

import android.content.DialogInterface;

final class f implements DialogInterface.OnClickListener {
   final Pnjtnk a;

   f(Pnjtnk var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      this.a.finish();
      var1.dismiss();
   }
}

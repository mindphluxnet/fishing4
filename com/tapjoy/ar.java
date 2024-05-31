package com.tapjoy;

import android.content.DialogInterface;

final class ar implements DialogInterface.OnClickListener {
   final TapjoyVideoView a;

   ar(TapjoyVideoView var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      this.a.finish();
   }
}

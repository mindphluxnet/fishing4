package com.tapjoy;

import android.content.DialogInterface;

final class at implements DialogInterface.OnCancelListener {
   final TapjoyVideoView a;

   at(TapjoyVideoView var1) {
      this.a = var1;
   }

   public final void onCancel(DialogInterface var1) {
      aa.a("VIDEO", "dialog onCancel");
      var1.dismiss();
      TapjoyVideoView.f(this.a).seekTo(TapjoyVideoView.g(this.a));
      TapjoyVideoView.f(this.a).start();
      TapjoyVideoView.h(this.a);
   }
}

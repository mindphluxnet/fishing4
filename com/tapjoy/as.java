package com.tapjoy;

import android.content.DialogInterface;

final class as implements DialogInterface.OnClickListener {
   final TapjoyVideoView a;

   as(TapjoyVideoView var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      var1.dismiss();
      TapjoyVideoView.f(this.a).seekTo(TapjoyVideoView.g(this.a));
      TapjoyVideoView.f(this.a).start();
      TapjoyVideoView.h(this.a);
      aa.a("VIDEO", "RESUME VIDEO time: " + TapjoyVideoView.g(this.a));
      aa.a("VIDEO", "currentPosition: " + TapjoyVideoView.f(this.a).getCurrentPosition());
      aa.a("VIDEO", "duration: " + TapjoyVideoView.f(this.a).getDuration() + ", elapsed: " + (TapjoyVideoView.f(this.a).getDuration() - TapjoyVideoView.f(this.a).getCurrentPosition()));
   }
}

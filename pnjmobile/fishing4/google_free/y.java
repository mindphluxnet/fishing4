package pnjmobile.fishing4.google_free;

import android.content.DialogInterface;

final class y implements DialogInterface.OnClickListener {
   final Main a;

   y(Main var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      var1.dismiss();
      Main var3 = this.a;
      var2 = Main.m();
      fishing4.game.ad.o.c((long)var2);
      var3 = this.a;
      Main.postGoogleAttendanceLog(var2);
      Main.l = 0;
      fishing4.game.k.f();
      this.a.displayGoldReceivedDialog(var2).show();
   }
}

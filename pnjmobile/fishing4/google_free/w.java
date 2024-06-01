package pnjmobile.fishing4.google_free;

import android.content.DialogInterface;

final class w implements DialogInterface.OnClickListener {
   final Main a;

   w(Main var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      var1.dismiss();
      Main var3 = this.a;
      Main.m();
      fishing4.game.k.f();
      this.a.displayAttendanceDialog(Main.l).show();
   }
}

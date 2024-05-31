package pnjmobile.fishing4.google_free;

import android.content.DialogInterface;

final class o implements DialogInterface.OnClickListener {
   final Main a;

   o(Main var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      fishing4.a.r.J = 0;
      var1.dismiss();
   }
}

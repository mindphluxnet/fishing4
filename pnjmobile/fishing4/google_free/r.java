package pnjmobile.fishing4.google_free;

import android.content.DialogInterface;

final class r implements DialogInterface.OnClickListener {
   final Main a;

   r(Main var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      var1.dismiss();
      if (fishing4.a.r.J > 0) {
         this.a.h().show();
      }

   }
}

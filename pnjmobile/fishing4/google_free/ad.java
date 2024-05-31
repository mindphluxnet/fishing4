package pnjmobile.fishing4.google_free;

import android.content.DialogInterface;

final class ad implements DialogInterface.OnClickListener {
   final Main a;

   ad(Main var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      var1.cancel();
   }
}

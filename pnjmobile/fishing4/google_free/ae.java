package pnjmobile.fishing4.google_free;

import android.content.DialogInterface;

final class ae implements DialogInterface.OnClickListener {
   final Main a;

   ae(Main var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      var1.dismiss();
   }
}

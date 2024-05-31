package pnjmobile.fishing4.google_free;

import android.content.DialogInterface;

final class q implements DialogInterface.OnClickListener {
   final Main a;

   q(Main var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      this.a.j().show();
   }
}

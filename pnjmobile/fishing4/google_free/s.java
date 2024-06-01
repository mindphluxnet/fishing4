package pnjmobile.fishing4.google_free;

import android.content.DialogInterface;

final class s implements DialogInterface.OnClickListener {
   final Main a;

   s(Main var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      var1.dismiss();
      if (fishing4.a.r.numGiftsWaiting > 0) {
         this.a.displayReceivedGiftsDialog().show();
      }

   }
}

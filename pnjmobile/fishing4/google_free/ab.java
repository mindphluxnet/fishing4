package pnjmobile.fishing4.google_free;

import android.content.DialogInterface;

final class ab implements DialogInterface.OnClickListener {
   final Main a;

   ab(Main var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      var1.dismiss();
      if (Main.m) {
         this.a.i().show();
      } else {
         var1.dismiss();
         if (fishing4.a.r.numGiftsWaiting > 0) {
            this.a.displayReceivedGiftsDialog().show();
         }
      }

   }
}

package pnjmobile.fishing4.google_free;

import android.content.DialogInterface;

final class bb implements DialogInterface.OnClickListener {
   final MainLGU a;

   bb(MainLGU var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      var1.dismiss();
      if (fishing4.a.r.numGiftsWaiting > 0) {
         this.a.b().show();
      }

   }
}

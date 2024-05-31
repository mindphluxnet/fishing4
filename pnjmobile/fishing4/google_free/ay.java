package pnjmobile.fishing4.google_free;

import android.content.DialogInterface;

final class ay implements DialogInterface.OnClickListener {
   final MainLGU a;

   ay(MainLGU var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      fishing4.a.r.J = 0;
      var1.dismiss();
   }
}

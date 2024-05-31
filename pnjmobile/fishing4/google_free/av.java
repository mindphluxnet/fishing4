package pnjmobile.fishing4.google_free;

import android.content.DialogInterface;

final class av implements DialogInterface.OnClickListener {
   final MainKT a;

   av(MainKT var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      var1.dismiss();
      if (fishing4.a.r.J > 0) {
         this.a.b().show();
      }

   }
}

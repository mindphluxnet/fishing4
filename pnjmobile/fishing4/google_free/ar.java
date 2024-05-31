package pnjmobile.fishing4.google_free;

import android.content.DialogInterface;

final class ar implements DialogInterface.OnClickListener {
   final MainKT a;

   ar(MainKT var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      var1.dismiss();
      System.exit(0);
   }
}

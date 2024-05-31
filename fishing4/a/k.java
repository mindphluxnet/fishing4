package fishing4.a;

import android.content.DialogInterface;

final class k implements DialogInterface.OnClickListener {
   final j a;

   k(j var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      var1.dismiss();
      System.exit(0);
   }
}

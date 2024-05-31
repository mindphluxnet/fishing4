package fishing4.game;

import android.content.DialogInterface;

final class bm implements DialogInterface.OnClickListener {
   final userIDview a;

   bm(userIDview var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      var1.cancel();
   }
}

package fishing4.game;

import android.content.DialogInterface;

final class bl implements DialogInterface.OnClickListener {
   final userIDview a;

   bl(userIDview var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      az.f = true;
      this.a.finish();
   }
}

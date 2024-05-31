package fishing4.game;

import android.content.DialogInterface;

final class d implements DialogInterface.OnClickListener {
   final AgreementView a;

   d(AgreementView var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      var1.cancel();
   }
}

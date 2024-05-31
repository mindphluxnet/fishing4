package fishing4.game;

import android.content.DialogInterface;

final class e implements DialogInterface.OnClickListener {
   final AgreementView a;

   e(AgreementView var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      p.d = true;
      az.f = true;
      this.a.finish();
   }
}

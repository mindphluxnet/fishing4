package fishing4.game;

import android.content.DialogInterface;

final class c implements DialogInterface.OnClickListener {
   final AgreementView a;

   c(AgreementView var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      globalConfig.d = true;
      az.f = true;
      this.a.finish();
   }
}

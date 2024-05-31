package fishing4.Push;

import android.content.DialogInterface;

final class b implements DialogInterface.OnClickListener {
   final WakeUpActivity a;

   b(WakeUpActivity var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      var1.dismiss();
      this.a.finish();
   }
}

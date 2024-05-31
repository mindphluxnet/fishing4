package fishing4.Push;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import pnjmobile.fishing4.google_free.Main;

final class a implements DialogInterface.OnClickListener {
   final WakeUpActivity a;
   private final Context b;

   a(WakeUpActivity var1, Context var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void onClick(DialogInterface var1, int var2) {
      Intent var3 = new Intent(this.b, Main.class);
      var3.addFlags(805306368);
      this.b.startActivity(var3);
      var1.dismiss();
      this.a.finish();
   }
}

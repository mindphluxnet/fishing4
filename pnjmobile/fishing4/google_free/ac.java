package pnjmobile.fishing4.google_free;

import android.content.DialogInterface;

final class ac implements DialogInterface.OnCancelListener {
   final Main a;

   ac(Main var1) {
      this.a = var1;
   }

   public final void onCancel(DialogInterface var1) {
      if (fishing4.game.k.e()) {
         Main var2 = this.a;
         Main.n();
      }

      if (Main.m) {
         this.a.i().show();
      } else {
         var1.dismiss();
         if (fishing4.a.r.J > 0) {
            this.a.h().show();
         }
      }

   }
}

package pnjmobile.fishing4.google_free;

import android.content.DialogInterface;
import android.view.KeyEvent;

final class ax implements DialogInterface.OnKeyListener {
   final MainLGU a;

   ax(MainLGU var1) {
      this.a = var1;
   }

   public final boolean onKey(DialogInterface var1, int var2, KeyEvent var3) {
      System.exit(0);
      return false;
   }
}

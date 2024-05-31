package pnjmobile.fishing4.google_free;

import android.app.Dialog;
import android.content.Context;
import android.view.ViewGroup;
import android.widget.ProgressBar;

public final class k {
   private static Dialog a = null;

   public static void a() {
      if (a != null) {
         a.dismiss();
         a = null;
      }

   }

   public static void a(Context var0) {
      if (a == null) {
         a = new Dialog(var0, 2131230721);
         ProgressBar var1 = new ProgressBar(var0);
         ViewGroup.LayoutParams var2 = new ViewGroup.LayoutParams(-2, -2);
         a.addContentView(var1, var2);
         a.setCancelable(false);
      }

      a.show();
   }
}

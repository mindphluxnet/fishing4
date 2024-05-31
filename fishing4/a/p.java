package fishing4.a;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.ViewGroup;
import android.widget.ProgressBar;

public final class p extends Dialog {
   private p(Context var1) {
      super(var1, 2131230720);
   }

   public static p a(Context var0, CharSequence var1) {
      p var2 = new p(var0);
      var2.setTitle(var1);
      var2.setCancelable(false);
      var2.setOnCancelListener((DialogInterface.OnCancelListener)null);
      var2.addContentView(new ProgressBar(var0), new ViewGroup.LayoutParams(-2, -2));
      var2.show();
      return var2;
   }

   public final boolean onKeyUp(int var1, KeyEvent var2) {
      return true;
   }
}

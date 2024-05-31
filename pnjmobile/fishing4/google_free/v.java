package pnjmobile.fishing4.google_free;

import android.os.Handler;
import android.os.Message;

final class v extends Handler {
   final Main a;

   v(Main var1) {
      this.a = var1;
   }

   public final void handleMessage(Message var1) {
      if (fishing4.game.k.l != null) {
         try {
            fishing4.game.k.l.dismiss();
         } catch (Exception var3) {
         }

         fishing4.game.k.l = null;
      }

      try {
         fishing4.game.k.l = fishing4.a.p.a(this.a, "");
      } catch (Exception var2) {
      }

   }
}

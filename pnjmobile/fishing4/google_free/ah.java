package pnjmobile.fishing4.google_free;

import android.os.Handler;
import android.os.Message;

final class ah extends Handler {
   public final void handleMessage(Message var1) {
      if (fishing4.game.k.m != null && fishing4.game.k.m.isShowing()) {
         try {
            fishing4.game.k.m.dismiss();
         } catch (Exception var2) {
         }

         fishing4.game.k.m = null;
      }

      if (Main.h) {
         fishing4.a.r.h();
         Main.h = false;
      }

   }
}

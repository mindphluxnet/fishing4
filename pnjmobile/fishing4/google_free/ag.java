package pnjmobile.fishing4.google_free;

import android.app.ProgressDialog;
import android.os.Handler;
import android.os.Message;

import fishing4.game.globalConfig;

final class ag extends Handler {
   public final void handleMessage(Message var1) {
      if (fishing4.game.k.m != null) {
         try {
            fishing4.game.k.m.dismiss();
         } catch (Exception var3) {
         }

         fishing4.game.k.m = null;
      }

      try {
         if (globalConfig.a == 0) {
            fishing4.game.k.m = ProgressDialog.show(Main.context, "로딩중", "Loading. Please wait...", true, false);
         } else {
            fishing4.game.k.m = ProgressDialog.show(Main.context, "Loading...", "Loading. Please wait...", true, false);
         }
      } catch (Exception var2) {
      }

   }
}

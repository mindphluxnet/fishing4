package pnjmobile.fishing4.google_free;

import android.os.Handler;
import android.os.Message;

final class ap extends Handler {
   final MainKT a;

   ap(MainKT var1) {
      this.a = var1;
   }

   public final void handleMessage(Message var1) {
      if (fishing4.game.k.l != null) {
         fishing4.game.k.l = null;
      }

      fishing4.game.k.l = fishing4.a.p.a(this.a, "");
   }
}

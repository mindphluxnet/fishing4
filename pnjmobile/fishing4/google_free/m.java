package pnjmobile.fishing4.google_free;

import android.os.Handler;
import android.os.Message;

final class m extends Handler {
   final Main a;

   m(Main var1) {
      this.a = var1;
   }

   public final void handleMessage(Message var1) {
      switch (var1.what) {
         case 1:
            new String();
            String var2 = var1.obj.toString();
            this.a.b(var2);
         default:
      }
   }
}

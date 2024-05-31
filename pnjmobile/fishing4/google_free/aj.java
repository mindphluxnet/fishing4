package pnjmobile.fishing4.google_free;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.LinearLayout;

final class aj extends Handler {
   public final void handleMessage(Message var1) {
      Log.i("", "sms50:애드뷰 온.");
      Main.A.setVisibility(0);
      if (Main.C) {
         Log.i("EASY_APP", "sms50:지우기.");
         Main.z.removeView(Main.B);
         Main.C = false;
      } else {
         Main.z.addView(Main.B, 0, new LinearLayout.LayoutParams(-1, -1));
         Main.C = true;
         Log.i("EASY_APP", "sms50:추가하기. ");
      }

      Log.i("", "sms50:애드뷰 온.");
   }
}

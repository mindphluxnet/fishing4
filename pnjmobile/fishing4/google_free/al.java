package pnjmobile.fishing4.google_free;

import android.app.AlertDialog;
import android.os.Handler;
import android.os.Message;
import java.util.Locale;

final class al extends Handler {
   public final void handleMessage(Message var1) {
      String var2;
      String var3;
      String var4;
      if (Locale.getDefault().toString().substring(0, 2).equals("ko")) {
         var4 = "알림";
         var2 = "네트워크 접속이 원활하지않아 게임이 종료 됩니다.";
         var3 = "확인";
      } else {
         var4 = "Notice";
         var2 = "Unstable Network Connection. Closing the app.";
         var3 = "Confirm";
      }

      AlertDialog var5 = (new AlertDialog.Builder(Main.context)).setCancelable(false).setTitle(var4).setMessage(var2).setPositiveButton(var3, new am(this)).create();
      Main.a = var5;
      var5.show();
   }
}

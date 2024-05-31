package fishing4.a;

import android.app.AlertDialog;
import android.os.Handler;
import android.os.Message;
import java.util.Locale;

final class j extends Handler {
   final SaveLoadManager a;

   j(SaveLoadManager var1) {
      this.a = var1;
   }

   public final void handleMessage(Message var1) {
      String var2;
      String var3;
      if (Locale.getDefault().toString().substring(0, 2).equals("ko")) {
         var2 = "확인";
         switch (var1.what) {
            case 0:
               var3 = "네트워크 초기화에 실패하였습니다. \n네트워크 상태를 확인후 다시 시도하여 주십시요.";
               break;
            case 1:
               var3 = "불법프로그램이 감지되었습니다. \n 불법프로그램을 삭제후 다시 시도하여주세요.";
               break;
            default:
               var3 = "ERROR UNKNOWN";
         }
      } else {
         var2 = "confirm";
         switch (var1.what) {
            case 0:
               var3 = "Unstable Network Connection. Closing the app.";
               break;
            case 1:
               var3 = "Cheating program was activated. The game shut down.";
               break;
            default:
               var3 = "ERROR UNKNOWN";
         }
      }

      (new AlertDialog.Builder(SaveLoadManager.d())).setCancelable(false).setMessage(var3).setPositiveButton(var2, new k(this)).create().show();
   }
}

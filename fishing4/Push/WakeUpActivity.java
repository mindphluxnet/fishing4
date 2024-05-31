package fishing4.Push;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Window;
import android.widget.LinearLayout;
import java.util.Locale;
import pnjmobile.fishing4.google_free.GCMIntentService;

public class WakeUpActivity extends Activity {
   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      Window var2 = this.getWindow();
      var2.addFlags(128);
      var2.setFlags(1024, 1024);
      this.requestWindowFeature(1);
      this.requestWindowFeature(2);
      this.getWindow().addFlags(6815872);
      this.setContentView(new LinearLayout(this));
      if (Locale.getDefault().toString().equals("ko")) {
         (new AlertDialog.Builder(this)).setIcon(2130837517).setCancelable(false).setTitle(2131165184).setMessage(GCMIntentService.a).setPositiveButton("확인", new a(this, this)).setNegativeButton("취소", new b(this)).show();
      } else {
         (new AlertDialog.Builder(this)).setIcon(2130837517).setCancelable(false).setTitle(2131165184).setMessage(GCMIntentService.a).setPositiveButton("YES", new c(this, this)).setNegativeButton("NO", new d(this)).show();
      }

   }

   protected void onStop() {
      super.onStop();
      this.finish();
   }
}

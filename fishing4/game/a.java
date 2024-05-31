package fishing4.game;

import android.net.ConnectivityManager;
import android.view.View;
import android.widget.Toast;

final class a implements View.OnClickListener {
   final AgreementView a;
   private final g b;

   a(AgreementView var1, g var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void onClick(View var1) {
      ConnectivityManager var2 = (ConnectivityManager)this.a.getApplicationContext().getSystemService("connectivity");
      AgreementView.b(this.a);
      fishing4.a.r.a();
      if (var2.getActiveNetworkInfo() != null && var2.getActiveNetworkInfo().isConnectedOrConnecting()) {
         this.a.a = 0;
         this.a.setContentView(this.b);
      } else {
         String var3;
         if (p.a == 0) {
            var3 = "인터넷 연결 상태를 확인하세요.";
         } else {
            var3 = "Check network connection.";
         }

         Toast.makeText(this.a.getApplicationContext(), var3, 0).show();
      }

   }
}

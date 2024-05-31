package fishing4.game;

import android.net.ConnectivityManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

final class bj implements View.OnClickListener {
   final userIDview a;
   private final EditText b;
   private final bp c;

   bj(userIDview var1, EditText var2, bp var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final void onClick(View var1) {
      String var3 = this.b.getText().toString();
      userIDview var2 = this.a;
      if (userIDview.a(var3)) {
         this.a.a = 0;
         globalConfig.b = var3;
         userIDview.b(this.a);
         fishing4.a.r.a();
         ConnectivityManager var4 = (ConnectivityManager)this.a.getApplicationContext().getSystemService("connectivity");
         if (var4.getActiveNetworkInfo() != null && var4.getActiveNetworkInfo().isConnectedOrConnecting()) {
            this.a.setContentView(this.c);
         } else {
            if (globalConfig.languageId == 0) {
               var3 = "인터넷 연결 상태를 확인하세요.";
            } else {
               var3 = "Check network connection.";
            }

            Toast.makeText(this.a.getApplicationContext(), var3, 0).show();
         }
      } else {
         if (globalConfig.languageId == 0) {
            var3 = "영문 20자 이내로 입력해 주세요.";
         } else {
            var3 = "ID must be lesser than 20 characters, in alphabet.";
         }

         Toast.makeText(this.a.getApplicationContext(), var3, 0).show();
      }

   }
}

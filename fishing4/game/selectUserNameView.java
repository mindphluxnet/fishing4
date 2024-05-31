package fishing4.game;

import android.net.ConnectivityManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

final class selectUserNameView implements View.OnClickListener {
   final userIDview userIdView;
   private final EditText editText;
   private final bp c;

   selectUserNameView(userIDview view, EditText editText, bp var3) {
      this.userIdView = view;
      this.editText = editText;
      this.c = var3;
   }

   public final void onClick(View view) {
      String userName = this.editText.getText().toString();
      userIDview userIdView = this.userIdView;
      if (userIDview.isValidUserName(userName)) {
         this.userIdView.a = 0;
         globalConfig.userName = userName;
         userIDview.b(this.userIdView);
         fishing4.a.r.a();
         ConnectivityManager connectivityManager = (ConnectivityManager)this.userIdView.getApplicationContext().getSystemService("connectivity");
         if (connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting()) {
            this.userIdView.setContentView(this.c);
         } else {
            if (globalConfig.languageId == 0) {
               userName = "인터넷 연결 상태를 확인하세요.";
            } else {
               userName = "Check network connection.";
            }

            Toast.makeText(this.userIdView.getApplicationContext(), userName, 0).show();
         }
      } else {
         if (globalConfig.languageId == 0) {
            userName = "영문 20자 이내로 입력해 주세요.";
         } else {
            userName = "ID must be lesser than 20 characters, in alphabet.";
         }

         Toast.makeText(this.userIdView.getApplicationContext(), userName, 0).show();
      }

   }
}

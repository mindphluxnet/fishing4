package pnjmobile.fishing4.google_free;

import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.widget.Toast;

final class aa implements DialogInterface.OnClickListener {
   final Main a;

   aa(Main var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      ConnectivityManager var3 = (ConnectivityManager)this.a.getSystemService("connectivity");
      if (var3.getActiveNetworkInfo() != null && var3.getActiveNetworkInfo().isConnectedOrConnecting()) {
         this.a.b();
      } else {
         String var4;
         if (fishing4.game.p.a == 0) {
            var4 = "인터넷 연결 상태를 확인하세요.";
         } else {
            var4 = "Check network connection.";
         }

         Toast.makeText(this.a, var4, 0).show();
      }

   }
}

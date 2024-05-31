package pnjmobile.fishing4.google_free;

import android.content.DialogInterface;
import android.net.ConnectivityManager;
import android.widget.Toast;

final class at implements DialogInterface.OnClickListener {
   final MainKT a;

   at(MainKT var1) {
      this.a = var1;
   }

   public final void onClick(DialogInterface var1, int var2) {
      ConnectivityManager var3 = (ConnectivityManager)this.a.getSystemService("connectivity");
      if (var3.getActiveNetworkInfo() != null && var3.getActiveNetworkInfo().isConnectedOrConnecting()) {
         this.a.a();
      } else {
         Toast.makeText(this.a, "인터넷 연결 상태를 확인하세요.", 0).show();
      }

   }
}

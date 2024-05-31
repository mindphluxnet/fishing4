package fishing4.game;

import android.app.Activity;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.Window;
import pnjmobile.fishing4.google_free.Main;

public class AppStart extends Activity {
   int a = 0;
   private fishing4.a.r b = new fishing4.a.r();
   private fishing4.a.p c;

   // $FF: synthetic method
   static fishing4.a.r a(AppStart var0) {
      return var0.b;
   }

   public final void a() {
      if (this.c != null) {
         this.c.dismiss();
         this.c = null;
      }

      this.finish();
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      Window var4 = this.getWindow();
      this.setRequestedOrientation(1);
      var4.setFlags(1024, 1024);
      var4.addFlags(128);
      this.requestWindowFeature(1);
      this.requestWindowFeature(2);
      fishing4.a.r.E = 0;
      h var3 = new h(this, this);
      ConnectivityManager var2 = (ConnectivityManager)this.getApplicationContext().getSystemService("connectivity");
      fishing4.a.r var5 = this.b;
      fishing4.a.r.a();
      if (!az.f && var2.getActiveNetworkInfo() != null) {
         this.setContentView(var3);
      } else {
         this.setContentView(var3);
         if (!az.f) {
            Main.O.sendEmptyMessageDelayed(0, 1000L);
            this.finish();
         }
      }

   }
}

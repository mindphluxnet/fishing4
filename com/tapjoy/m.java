package com.tapjoy;

import android.content.Intent;
import android.view.View;
import java.util.Timer;

final class m implements View.OnClickListener {
   final k a;

   m(k var1) {
      this.a = var1;
   }

   public final void onClick(View var1) {
      aa.a("Banner Ad", "Opening URL in new browser = [" + k.d() + "]");
      Intent var2 = new Intent(k.a(this.a), TJCOffersWebView.class);
      var2.putExtra("DISPLAY_AD_URL", k.d());
      var2.setFlags(268435456);
      k.a(this.a).startActivity(var2);
      if (this.a.d != null) {
         this.a.d.cancel();
      }

      this.a.e = 0L;
      this.a.d = new Timer();
      this.a.d.schedule(new n(this.a, (byte)0), 10000L, 10000L);
   }
}

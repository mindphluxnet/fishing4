package com.facebook.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import fishing4.a.y;
import fishing4.game.MyWebView;
import fishing4.game.am;
import fishing4.game.p;
import fishing4.game.u;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class FacebookMainView extends Activity {
   public static Activity a;
   public static int b = -1;
   public static String c;
   private TextView d;
   private Facebook e;
   private AsyncFacebookRunner f;

   // $FF: synthetic method
   static TextView a(FacebookMainView var0) {
      return var0.d;
   }

   private static boolean a(String var0) {
      boolean var1;
      label18: {
         try {
            StringBuilder var3 = new StringBuilder("https://api.facebook.com/method/fql.query?query=SELECT%20page_id%20FROM%20page_fan%20WHERE%20uid%3Dme()%20and%20page_id%3D125832847486521&access_token=");
            URL var2 = new URL(var3.append(var0).toString());
            var1 = y.a(var2).contains("<page_id>125832847486521</page_id>");
         } catch (MalformedURLException var4) {
            var4.printStackTrace();
            break label18;
         } catch (IOException var5) {
            var5.printStackTrace();
            break label18;
         }

         if (var1) {
            var1 = true;
            return var1;
         }
      }

      var1 = false;
      return var1;
   }

   // $FF: synthetic method
   static AsyncFacebookRunner b(FacebookMainView var0) {
      return var0.f;
   }

   public final void a() {
      this.finish();
      this.overridePendingTransition(2130968576, 2130968577);
      b = -1;
   }

   public final void b() {
      this.e.a((Context)this, (String)"feed", (Facebook$DialogListener)(new FacebookMainView$SampleDialogListener(this)));
   }

   public final void c() {
      String var1 = this.e.b();
      c = var1;
      if (a(var1)) {
         if (u.i == 0) {
            u.i = 1;
            u.b();
            am.a(92);
         } else {
            am.a(93);
         }
      } else {
         MyWebView.a("file:///android_asset/fblike_ko.htm");
         this.startActivity(new Intent(this, MyWebView.class));
      }

      this.a();
   }

   protected void onActivityResult(int var1, int var2, Intent var3) {
      this.e.a(var1, var2, var3);
   }

   public void onBackPressed() {
      this.a();
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      Window var3 = this.getWindow();
      this.setRequestedOrientation(1);
      var3.setFlags(1024, 1024);
      var3.addFlags(128);
      this.requestWindowFeature(1);
      this.requestWindowFeature(2);
      this.setContentView(2130903043);
      a = this;
      if (p.a == 0) {
         this.e = new Facebook("242780459104417");
      } else {
         this.e = new Facebook("271037549653898");
      }

      this.f = new AsyncFacebookRunner(this.e);
      if (!this.e.a()) {
         Facebook var2 = this.e;
         FacebookMainView$AuthorizeListener var4 = new FacebookMainView$AuthorizeListener(this);
         var2.a((Activity)this, (String[])(new String[]{"publish_stream, user_photos, email, read_stream"}), (Facebook$DialogListener)var4);
      }

   }
}

package fishing4.game;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import java.util.regex.Pattern;

public class userIDview extends Activity {
   int a = -3;
   private fishing4.a.r b = new fishing4.a.r();
   private fishing4.a.p c;

   // $FF: synthetic method
   static fishing4.a.p a(userIDview var0) {
      return var0.c;
   }

   // $FF: synthetic method
   static void a(userIDview var0, fishing4.a.p var1) {
      var0.c = var1;
   }

   // $FF: synthetic method
   static boolean a(String var0) {
      boolean var1 = Pattern.matches("^[a-zA-Z0-9]*$", var0);
      if (var0.length() > 3 && var1 && var0.length() < 21) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   // $FF: synthetic method
   static fishing4.a.r b(userIDview var0) {
      return var0.b;
   }

   private void b() {
      if (this.c != null) {
         this.c.dismiss();
         this.c = null;
      }

      this.finish();
   }

   private void c() {
      AlertDialog.Builder var1;
      if (globalConfig.languageId == 0) {
         var1 = new AlertDialog.Builder(this);
         var1.setMessage("종료하시겠습니까?").setCancelable(false).setPositiveButton("예", new bl(this)).setNegativeButton("아니오", new bm(this));
         var1.create().show();
      } else {
         var1 = new AlertDialog.Builder(this);
         var1.setMessage("Do you want to quit?").setCancelable(false).setPositiveButton("Yes", new bn(this)).setNegativeButton("No", new bo(this));
         var1.create().show();
      }

   }

   // $FF: synthetic method
   static void c(userIDview var0) {
      var0.b();
   }

   // $FF: synthetic method
   static void d(userIDview var0) {
      u.g = true;
      u.d();
      var0.b();
   }

   // $FF: synthetic method
   static void e(userIDview var0) {
      var0.c();
   }

   public final void a() {
      ImageButton var3 = (ImageButton)this.findViewById(2131099668);
      ImageButton var5 = (ImageButton)this.findViewById(2131099669);
      bp var2 = new bp(this, this);
      EditText var4 = (EditText)this.findViewById(2131099667);
      ImageView var1 = (ImageView)this.findViewById(2131099666);
      if (this.getResources().getConfiguration().locale.getCountry().equals("KR")) {
         var1.setImageResource(2130837519);
      }

      var3.setOnClickListener(new bj(this, var4, var2));
      var5.setOnClickListener(new bk(this));
   }

   public void onBackPressed() {
      this.c();
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      Window var2 = this.getWindow();
      this.setRequestedOrientation(1);
      var2.setFlags(1024, 1024);
      var2.addFlags(128);
      this.requestWindowFeature(1);
      this.requestWindowFeature(2);
      this.setRequestedOrientation(1);
      this.setContentView(2130903046);
      this.a = 0;
      fishing4.a.r var3 = this.b;
      fishing4.a.r.a();
      this.getApplicationContext().getSystemService("connectivity");
      this.a();
   }
}

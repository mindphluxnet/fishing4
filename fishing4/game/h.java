package fishing4.game;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import pnjmobile.fishing4.google_free.Main;

final class h extends View implements Runnable {
   Thread a;
   final AppStart b;

   public h(AppStart var1, Context var2) {
      super(var2);
      this.b = var1;
      this.a = new Thread(this);
      this.a.start();
   }

   protected final void onDraw(Canvas var1) {
      super.onDraw(var1);
      if (this.b.a == 0) {
         fishing4.a.r.E = 0;
         fishing4.a.r.F = 1;
         AppStart.a(this.b).a(102);
         this.b.a = 1;
      } else if (this.b.a == 1) {
         Log.i("", "sms20;네트워크 다꺼진 상태?그럼 종료 해야지.. ?");
         AppStart.a(this.b);
         if (fishing4.a.r.b()) {
            AppStart.a(this.b).b(102);
            this.b.a = 2;
         }

         if (fishing4.a.y.a() - fishing4.a.r.u > 30000L) {
            fishing4.a.r.l = 99;
            Log.i("", "sms30:네트워크 시간.초과. 액티비티 종료?");
            Main.O.sendEmptyMessageDelayed(0, 1000L);
            this.b.finish();
            this.b.a = -1;
         }
      } else if (this.b.a == 2) {
         if (AppStart.a(this.b).c()) {
            AppStart.a(this.b);
            if (fishing4.a.r.f() == 99) {
               String var2;
               if (p.a == 0) {
                  var2 = "비정상적인 게임 진행 이력이 발견되었습니다. 프로그램을 종료합니다.";
               } else {
                  var2 = "Suspicious record detected. Closing the app.";
               }

               Toast.makeText(this.b.getApplicationContext(), Html.fromHtml("<font color=red>" + var2 + "</font>"), 0).show();
               az.d();
               this.b.a();
            } else if (fishing4.a.r.E == 0) {
               fishing4.a.r.E = 1;
               this.b.a = 0;
            } else {
               this.b.a();
               this.b.a = 3;
            }
         }

         if (fishing4.a.y.a() - fishing4.a.r.u > 30000L) {
            fishing4.a.r.l = 99;
            Main.O.sendEmptyMessageDelayed(0, 1000L);
            this.b.finish();
         }
      }

      AppStart.a(this.b);
      if (fishing4.a.r.d() != 99) {
         AppStart.a(this.b);
         if (fishing4.a.r.d() != 100) {
            return;
         }
      }

      if (!AppStart.a(this.b).c()) {
         this.b.a();
      }

   }

   public final void run() {
      while(true) {
         try {
            this.postInvalidate();
            Thread.yield();
         } catch (Exception var2) {
         }
      }
   }
}

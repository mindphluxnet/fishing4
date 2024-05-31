package pnjmobile.fishing4.google_free;

import android.util.Log;

final class n implements Runnable {
   final Main a;

   n(Main var1) {
      this.a = var1;
   }

   public final void run() {
      int var1 = 0;

      do {
         label25: {
            Exception var10000;
            label24: {
               ++var1;
               boolean var10001;
               if (var1 > 1) {
                  try {
                     Main.b(this.a);
                  } catch (Exception var4) {
                     var10000 = var4;
                     var10001 = false;
                     break label24;
                  }
               }

               try {
                  Thread.sleep(3000L);
                  StringBuilder var5 = new StringBuilder("SLEEP:");
                  Log.i("THREAD SLEEP", var5.append(Integer.toString(var1)).toString());
                  break label25;
               } catch (Exception var3) {
                  var10000 = var3;
                  var10001 = false;
               }
            }

            Exception var2 = var10000;
            var2.printStackTrace();
         }

         Log.i("THREAD SLEEP", Boolean.toString(Main.c(this.a)));
      } while(Main.c(this.a));

      Main.d(this.a).sendEmptyMessage(0);
   }
}

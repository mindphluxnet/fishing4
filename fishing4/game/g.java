package fishing4.game;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;

final class g extends View implements Runnable {
   Thread a;
   final AgreementView b;

   public g(AgreementView var1, Context var2) {
      super(var2);
      this.b = var1;
      this.a = new Thread(this);
      this.a.start();
   }

   protected final void onDraw(Canvas var1) {
      // $FF: Couldn't be decompiled
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

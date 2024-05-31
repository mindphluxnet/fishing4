package fishing4.game;

import android.content.Context;
import android.view.View;
import javax.microedition.khronos.opengles.GL10;

public abstract class aa extends View {
   public static int c;
   public static int d = -1;
   public static int e;
   protected boolean a;
   protected int b;

   public aa(int var1, Context var2) {
      super(var2);
      this.b = var1;
      this.a = true;
   }

   public static void a(int var0) {
      d = var0;
   }

   public abstract void a(fishing4.a.e var1);

   public final void a(GL10 var1) {
      if (d != -1) {
         this.a(var1, d);
         d = -1;
      }

   }

   public abstract void a(GL10 var1, int var2);

   public abstract void b(int var1);

   public abstract void b(fishing4.a.e var1);

   public abstract void b(GL10 var1);

   public abstract void c(int var1);

   public abstract void c(fishing4.a.e var1);

   public abstract void c(GL10 var1);

   public abstract void d(GL10 var1);

   public abstract void e(GL10 var1);

   public abstract void f(GL10 var1);
}

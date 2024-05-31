package pnjmobile.fishing4.google_free;

import android.os.Handler;

final class ao extends bf {
   final Main a;

   public ao(Main var1, Handler var2) {
      super(var1, var2);
      this.a = var1;
   }

   public final void a() {
   }

   public final void a(g var1) {
      if (var1.toString().equals("PURCHASED")) {
         if (Main.h) {
            fishing4.a.r.g = "";
            fishing4.a.r.h();
            fishing4.game.k.o();
            Main.h = false;
         }
      } else {
         fishing4.a.r.g = "";
         fishing4.a.r.h();
      }

   }

   public final void a(h var1) {
      if (var1 == h.a) {
         if (Main.h) {
            fishing4.a.r.g = "";
            fishing4.a.r.h();
            fishing4.game.k.o();
            Main.h = false;
         }
      } else {
         var1 = h.b;
         fishing4.a.r.g = "";
         fishing4.a.r.h();
      }

      Main.b(this.a);
   }
}

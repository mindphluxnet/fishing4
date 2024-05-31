package pnjmobile.fishing4.google_free;

import android.content.Context;

final class bi implements Runnable {
   private final Context a;
   private final String b;
   private final String c;
   private final g d;
   private final long e;
   private final String f;

   bi(Context var1, String var2, String var3, g var4, long var5, String var7) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
      this.f = var7;
   }

   public final void run() {
      bd var2 = new bd(this.a);
      int var1 = var2.a(this.b, this.c, this.d, this.e, this.f);
      var2.a();
      synchronized(bh.class) {
         if (bh.c() != null) {
            bh.c().a(this.d, this.c, var1, this.e, this.f);
         }

      }
   }
}

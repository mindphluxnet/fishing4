package fishing4.game;

import android.content.Context;
import javax.microedition.khronos.opengles.GL10;

public final class au extends aa {
   private int f = 0;
   private long g;
   private fishing4.a.w h;

   public au(Context var1) {
      super(1, var1);
   }

   public final void a(fishing4.a.e var1) {
   }

   public final void a(GL10 var1, int var2) {
      c = var2;
      e = 0;
      switch (var2) {
         case 0:
            try {
               fishing4.a.w.a(var1, this.h);
               this.h = null;
               this.h = fishing4.a.w.a(var1, "img/pnj.png");
            } catch (Exception var4) {
            }

            this.f = 0;
            this.g = System.currentTimeMillis();
            break;
         case 1:
            try {
               fishing4.a.w.a(var1, this.h);
               this.h = null;
               this.h = fishing4.a.w.a(var1, "img/All.png");
            } catch (Exception var3) {
            }

            this.f = 0;
            this.g = System.currentTimeMillis();
         case 2:
         default:
            break;
         case 3:
            this.g = System.currentTimeMillis();
            aa.d = 0;
      }

   }

   public final void b(int var1) {
   }

   public final void b(fishing4.a.e var1) {
   }

   public final void b(GL10 var1) {
      this.a(var1, 3);
   }

   public final void c(int var1) {
   }

   public final void c(fishing4.a.e var1) {
   }

   public final void c(GL10 var1) {
   }

   public final void d(GL10 var1) {
      fishing4.a.w.a(var1, this.h);
      this.h = null;
   }

   public final void e(GL10 var1) {
      byte var3 = 0;
      var1.glLoadIdentity();
      var1.glTranslatef(0.0F, 0.0F, 0.0F);
      int var2 = this.f;
      if (c != 3) {
         if (System.currentTimeMillis() - this.g > 3000L) {
            if (var2 > 11) {
               this.f = 0;
               var2 = var3;
            } else if (var2 == 11) {
               if (c == 0) {
                  if (p.a == 0) {
                     this.a(var1, 1);
                  } else {
                     z.a(2);
                  }
               } else {
                  z.a(2);
               }
            }

            var2 = 255 - var2 * 25;
            if (c == 0) {
               fishing4.a.m.a(var1, this.h, fishing4.a.m.c(), fishing4.a.m.d(), var2);
            } else {
               fishing4.a.m.a(var1, this.h, fishing4.a.m.c(), fishing4.a.m.d(), 1.0F, 1.0F, this.h.c.a - 2.0F, this.h.c.b - 2.0F, var2);
            }
         } else if (var2 < 10) {
            if (c == 0) {
               fishing4.a.m.a(var1, this.h, fishing4.a.m.c(), fishing4.a.m.d(), var2 * 25);
            } else {
               fishing4.a.m.a(var1, this.h, fishing4.a.m.c(), fishing4.a.m.d(), 1.0F, 1.0F, this.h.c.a - 2.0F, this.h.c.b - 2.0F, var2 * 25);
            }
         } else if (c == 0) {
            fishing4.a.m.a(var1, this.h, fishing4.a.m.c(), fishing4.a.m.d());
         } else {
            fishing4.a.m.a(var1, this.h, fishing4.a.m.c(), fishing4.a.m.d(), 1.0F, 1.0F, this.h.c.a - 2.0F, this.h.c.b - 2.0F);
         }
      }

   }

   public final void f(GL10 var1) {
      ++this.f;
      this.a(var1);
   }
}

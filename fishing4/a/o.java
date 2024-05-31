package fishing4.a;

import javax.microedition.khronos.opengles.GL10;

public final class o {
   public static e d = fishing4.a.e.a();
   public static e e = fishing4.a.e.a();
   public static float f = 0.0F;
   public static boolean g = false;
   public boolean a;
   public int b;
   public int c;
   private final f h;
   private final f i;
   private final f j;
   private f k;
   private final e l;
   private e m;
   private float n;
   private int[] o;

   private o(e var1) {
      int var2 = 0;
      super();
      this.h = fishing4.a.f.a(322.0F, 5.0F, 78.0F, 80.0F);
      this.i = fishing4.a.f.a(402.0F, 6.0F, 96.0F, 96.0F);
      this.j = fishing4.a.f.a(164.0F, 6.0F, 156.0F, 156.0F);
      this.a = false;
      this.b = -1;
      this.c = 0;
      this.k = this.i;
      this.l = fishing4.a.e.a(var1.a, var1.b);
      this.m = fishing4.a.e.a(var1.a, var1.b);
      this.n = 0.0F;
      this.o = null;

      for(this.o = new int[8]; var2 < this.o.length; ++var2) {
         this.o[var2] = -1;
      }

   }

   public static o a(e var0) {
      return new o(var0);
   }

   public static void b() {
      float var0 = 1.5F;
      if (g) {
         float var2 = fishing4.a.e.d(d, e);
         float var1 = var2 / f * fishing4.game.u.j;
         if (!(var1 > 1.5F)) {
            if (var1 < 0.5F) {
               var0 = 0.5F;
            } else {
               var0 = var1;
            }
         }

         fishing4.game.u.j = var0;
         f = var2;
      }

   }

   private float e(e var1) {
      return fishing4.a.e.b(fishing4.a.e.b(var1, this.l));
   }

   public final void a() {
      this.k = null;
      this.o = null;
   }

   public final void a(GL10 var1, w var2) {
      fishing4.a.m.b(var1, var2, this.l.a, this.l.b, this.j.a.a, this.j.a.b, this.j.b.a, this.j.b.b, fishing4.a.g.a(fishing4.game.u.j), 100);
      fishing4.a.m.a(var1, var2, this.m, this.h, fishing4.a.g.a(fishing4.game.u.j));
      if (this.a) {
         fishing4.a.m.a(var1, var2, this.m, this.i, fishing4.a.g.a(fishing4.game.u.j));
         if (this.c == 0) {
            fishing4.a.m.a(var1, var2, this.m, fishing4.a.f.a(264.0F, 410.0F, 92.0F, 92.0F), fishing4.a.g.a(fishing4.game.u.j));
         } else {
            fishing4.a.m.a(var1, var2, this.m, fishing4.a.f.a(358.0F, 410.0F, 92.0F, 92.0F), fishing4.a.g.a(fishing4.game.u.j));
         }
      }

   }

   public final void b(e var1) {
      this.l.a(var1);
      this.m.a(var1);
      fishing4.game.u.k = var1.a;
      fishing4.game.u.l = var1.b;
   }

   public final float c() {
      return this.k.b.a / 2.0F * fishing4.game.u.j;
   }

   public final boolean c(e var1) {
      boolean var2;
      if (this.e(var1) < this.c()) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public final void d() {
      this.a = false;
      this.b = -1;
      this.m.a(this.l);
   }

   public final void d(e var1) {
      float var2 = this.c();
      e var7 = this.m;
      e var6 = fishing4.a.e.b(var1, this.l);
      var7 = fishing4.a.e.b(var6, var7);
      if (var7.a != 0.0F || var7.b != 0.0F) {
         this.n = fishing4.a.e.c(var6);
         float var3 = this.e(var1);
         var1 = var6;
         if (var3 > var2) {
            var1 = fishing4.a.e.a(fishing4.a.e.a(this.n), var2);
         }

         this.m.a(fishing4.a.e.a(var1, this.l));
         if (var3 >= 1.0F * var2) {
            var2 = (float)Math.toDegrees((double)this.n);
            if ((double)var2 >= 67.5 && (double)var2 < 112.5) {
               this.b = 2;
            } else if ((double)var2 >= 22.5 && (double)var2 < 67.5) {
               this.b = 6;
            } else if ((double)var2 >= -22.5 && (double)var2 < 22.5) {
               this.b = 1;
            } else if ((double)var2 >= -67.5 && (double)var2 < -22.5) {
               this.b = 7;
            } else if ((double)var2 >= -112.5 && (double)var2 < -67.5) {
               this.b = 3;
            } else if ((double)var2 >= -157.5 && (double)var2 < -112.5) {
               this.b = 5;
            } else if ((double)var2 >= 112.5 && (double)var2 < 157.5) {
               this.b = 4;
            } else {
               this.b = 0;
            }

            int var5 = this.b;

            for(int var4 = 1; var4 < this.o.length; ++var4) {
               this.o[var4] = this.o[var4 - 1];
            }

            this.o[this.o.length - 1] = var5;
         } else {
            this.b = -1;
         }
      }

   }

   public final void e() {
      this.a = true;
      this.c = 0;
   }
}

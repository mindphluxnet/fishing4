package fishing4.game;

import javax.microedition.khronos.opengles.GL10;

public final class ak {
   public final fishing4.a.h a;
   public int b;
   public fishing4.a.e c;
   public fishing4.a.e d;
   public fishing4.a.h e;
   public float f;
   private final fishing4.a.e g;
   private final fishing4.a.e h;
   private final float i;
   private final float j;
   private final float k;
   private final fishing4.a.f l;
   private int m;

   public ak() {
      this.g = fishing4.a.e.a(ah.a.a.a + ah.a.b.a / 2.0F, 0.0F);
      this.h = fishing4.a.e.a(ah.a.a.a + ah.a.b.a / 2.0F, ah.a.a.b + ah.a.b.b / 2.0F);
      this.i = 4.0F;
      this.j = 1.0F;
      this.k = 100.0F;
      this.l = fishing4.a.f.a(330.0F, 246.0F, 16.0F, 50.0F);
      this.a = fishing4.a.h.a(16.0F, 36.0F);
      this.m = 0;
      this.b = 0;
      this.c = fishing4.a.e.a(this.g.a, this.g.b);
      this.d = fishing4.a.e.a(this.h.a, this.h.b);
      this.e = fishing4.a.h.a(this.l.b.a, this.l.b.b);
      this.f = 0.0F;
   }

   private void a(int var1) {
      this.b = 0;
      this.m = var1;
   }

   private void a(GL10 var1, fishing4.a.w var2, int var3, int var4) {
      if (var3 == 0) {
         fishing4.a.m.a(var1, var2, this.d.a, this.d.b, (float)(var4 * 80), 0.0F, 80.0F, 80.0F, fishing4.a.g.b(), '\u0005', fishing4.a.d.a(this.f));
      } else {
         fishing4.a.m.a(var1, var2, this.d.a, this.d.b, (float)(var4 * 80), 0.0F, 80.0F, 80.0F, '\u0005', fishing4.a.d.a(this.f));
      }

   }

   private void b(GL10 var1, fishing4.a.w var2, int var3, int var4) {
      if (var3 == 0) {
         fishing4.a.m.a(var1, var2, this.d.a + this.e.a * 3.5F, this.d.b, (float)(var4 % 10 * 80), (float)(var4 / 10 * 80), 80.0F, 80.0F, fishing4.a.g.b(-1.5F, 1.5F), '\u0005', fishing4.a.d.a(0.5F, 1.1F, this.f));
      } else {
         fishing4.a.m.a(var1, var2, this.d.a - this.e.a * 3.5F, this.d.b, (float)(var4 % 10 * 80), (float)(var4 / 10 * 80), 80.0F, 80.0F, fishing4.a.g.a(1.5F), '\u0005', fishing4.a.d.a(0.5F, 1.1F, this.f));
      }

   }

   public final void a() {
      this.c.b(this.d.a - 100.0F, this.c.b);
      this.a(2);
   }

   public final void a(GL10 var1, fishing4.a.w var2, fishing4.a.w var3, fishing4.a.w var4, fishing4.a.w var5, fishing4.a.w var6, fishing4.a.w var7) {
      if (ah.o == 2) {
         fishing4.a.m.a(var1, var2, this.d, this.l, fishing4.a.aa.a(0.0F, 1.0F, 0.0F, 1.0F), fishing4.a.d.a(0.5F, 1.0F, this.f));
      } else if (ah.o == 1) {
         fishing4.a.m.a(var1, var2, this.d, this.l, fishing4.a.aa.a(1.0F, 0.0F, 0.0F, 1.0F), fishing4.a.d.a(0.5F, 1.0F, this.f));
      } else {
         fishing4.a.m.a(var1, var2, this.d, this.l, fishing4.a.d.a(0.5F, 1.0F, this.f));
      }

      int var9 = this.b;
      float var8 = fishing4.a.e.e(this.c, this.d);
      fishing4.a.m.a(var1, var3, this.d.a, this.d.b, (float)(var9 % 9 * 50), 0.0F, 50.0F, 60.0F, '\u0001', fishing4.a.d.a(var8));
      fishing4.a.m.a(var1, var3, this.d.a, this.d.b, (float)(var9 % 9 * 50), 0.0F, 50.0F, 60.0F, '\u0001', fishing4.a.d.a(var8));
      fishing4.a.m.a(var1, var3, this.d.a, this.d.b, (float)(var9 % 9 * 50), 0.0F, 50.0F, 60.0F, '\u0001', fishing4.a.d.a(var8));
      var9 = this.b;
      fishing4.a.m.a(var1, var5, this.d.a, this.d.b, (float)(var9 % 10 * 30), 0.0F, 30.0F, 70.0F, fishing4.a.g.a(2.0F), '\u0001', fishing4.a.d.a(0.5F, 1.0F, this.f));
      fishing4.a.m.a(var1, var5, this.d.a, this.d.b, (float)(var9 % 10 * 30), 0.0F, 30.0F, 70.0F, fishing4.a.g.a(2.0F), '\u0001', fishing4.a.d.a(0.5F, 1.0F, this.f));
      switch (this.m) {
         case 0:
         default:
            break;
         case 1:
            if (this.b < 7) {
               this.a(var1, var4, 1, this.b % 7);
            }

            if (this.b < 20) {
               this.b(var1, var6, 1, this.b % 20);
            }
            break;
         case 2:
            if (this.b < 7) {
               this.a(var1, var4, 0, this.b % 7);
            }

            if (this.b < 20) {
               this.b(var1, var6, 0, this.b % 20);
            }
            break;
         case 3:
            if (this.b < 18) {
               var9 = this.b % 18;
               fishing4.a.m.a(var1, var7, this.d.a, this.d.b, (float)(var9 % 9 * 60), (float)(var9 / 9 * 90), 60.0F, 90.0F, fishing4.a.g.a(2.0F), '\u0005', fishing4.a.d.a(0.5F, 1.2F, this.f));
            }
      }

      ++this.b;
   }

   public final void b() {
      this.c.b(this.d.a + 100.0F, this.c.b);
      this.a(1);
   }

   public final void c() {
      this.c.a(this.g);
      this.a(3);
   }

   public final void d() {
      float var3 = this.d.a;
      float var2 = this.d.b;
      float var1;
      if (var3 - this.h.a > -1.0F && var3 - this.h.a < 1.0F) {
         var1 = this.h.a;
      } else if (var3 > this.h.a) {
         var1 = var3 - 1.0F;
      } else {
         var1 = var3;
         if (var3 < this.h.a) {
            var1 = var3 + 1.0F;
         }
      }

      if (this.d.b <= ah.a.a.b + ah.a.b.b / 4.0F) {
         ah.n = 4;
      } else {
         var2 -= 4.0F;
         ah.n = 0;
      }

      this.d.b(var1, var2);
   }

   public final void e() {
      this.c.a(this.g);
      float var2 = this.d.a;
      float var3 = this.d.b;
      float var1;
      if (var2 - this.h.a > -1.0F && var2 - this.h.a < 1.0F) {
         var1 = this.h.a;
      } else if (var2 > this.h.a) {
         var1 = var2 - 1.0F;
      } else {
         var1 = var2;
         if (var2 < this.h.a) {
            var1 = var2 + 1.0F;
         }
      }

      if (var3 - this.h.b > -1.0F && var3 - this.h.b < 1.0F) {
         var2 = this.h.b;
      } else if (var3 > this.h.b) {
         var2 = var3 - 1.0F;
      } else {
         var2 = var3;
         if (var3 < this.h.b) {
            var2 = var3 + 1.0F;
         }
      }

      this.d.b(var1, var2);
      if (this.m == 2) {
         this.a(4);
      } else if (this.m == 1) {
         this.a(5);
      } else if (this.m == 3) {
         this.a(0);
      } else if ((this.m == 5 || this.m == 4) && var1 == this.h.a) {
         this.a(0);
      }

   }
}

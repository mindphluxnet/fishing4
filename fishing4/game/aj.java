package fishing4.game;

import javax.microedition.khronos.opengles.GL10;

public final class aj {
   public float a = 0.5F;
   public float b = 12.0F;
   protected int c = -1;
   protected float d;
   protected int e;
   protected fishing4.a.e f;
   protected fishing4.a.e g;
   protected float h;
   private int i = 0;

   private aj(float var1, float var2) {
      this.d = this.a;
      this.e = 0;
      this.f = fishing4.a.e.a(var1, var2);
      this.h = 0.0F;
   }

   private static fishing4.a.e a(int var0) {
      fishing4.a.e var1;
      switch (var0 % 10) {
         case 0:
            var1 = fishing4.a.e.a(-2.0F, -1.0F);
            break;
         case 1:
            var1 = fishing4.a.e.a(-1.0F, 0.0F);
            break;
         case 2:
            var1 = fishing4.a.e.a(-10.0F, 0.0F);
            break;
         case 3:
            var1 = fishing4.a.e.a(-6.0F, 0.0F);
            break;
         case 4:
            var1 = fishing4.a.e.a(-2.0F, 0.0F);
            break;
         case 5:
            var1 = fishing4.a.e.a(2.0F, -1.0F);
            break;
         case 6:
            var1 = fishing4.a.e.a(1.0F, 0.0F);
            break;
         case 7:
            var1 = fishing4.a.e.a(10.0F, 0.0F);
            break;
         case 8:
            var1 = fishing4.a.e.a(6.0F, 0.0F);
            break;
         case 9:
            var1 = fishing4.a.e.a(2.0F, 0.0F);
            break;
         default:
            var1 = fishing4.a.e.a();
      }

      return var1;
   }

   public static aj a(float var0, float var1) {
      return new aj(var0, var1);
   }

   private static fishing4.a.f b(int var0) {
      fishing4.a.f var1;
      switch (var0 % 5) {
         case 0:
            var1 = fishing4.a.f.a(0.0F, 0.0F, 64.0F, 110.0F);
            break;
         case 1:
            var1 = fishing4.a.f.a(66.0F, 0.0F, 50.0F, 102.0F);
            break;
         case 2:
            var1 = fishing4.a.f.a(117.0F, 0.0F, 70.0F, 98.0F);
            break;
         case 3:
            var1 = fishing4.a.f.a(188.0F, 0.0F, 78.0F, 96.0F);
            break;
         case 4:
            var1 = fishing4.a.f.a(268.0F, 0.0F, 66.0F, 106.0F);
            break;
         default:
            var1 = fishing4.a.f.a();
      }

      return var1;
   }

   public final void a() {
      this.f = null;
   }

   public final void a(GL10 var1, fishing4.a.w var2, int var3, boolean var4) {
      fishing4.a.e var11 = fishing4.a.e.a(this.f, a(this.e));
      if (var4) {
         float var5;
         if (this.c == -1) {
            if (this.f.a < fishing4.a.f.c(ah.a)) {
               this.f.a = fishing4.a.f.c(ah.a);
            } else if (this.f.a > fishing4.a.f.a(ah.a)) {
               this.f.a = fishing4.a.f.a(ah.a);
            }

            int var10 = ah.n;
            if (x.a(true) < 5) {
               var10 += 0;
            } else if (x.a(true) < 10) {
               ++var10;
            } else if (x.a(true) < 15) {
               ++var10;
            } else {
               var10 += 2;
            }

            fishing4.a.e var12 = this.f;
            var5 = var12.b;
            var12.b = (float)(var10 + this.i + fishing4.a.z.a(3) + 2) + var5;
            if (this.f.b > fishing4.a.f.b(ah.a) + 50.0F) {
               this.f = fishing4.a.e.a(fishing4.a.m.c() - ah.a.b.a / 2.0F + (float)fishing4.a.z.a((int)ah.a.b.a - 100), ah.a.a.b);
               this.i = fishing4.a.z.a(2) + 1;
            }
         } else {
            switch (this.c) {
               case 0:
                  var5 = -90.0F;
                  break;
               case 1:
                  var5 = 90.0F;
                  break;
               case 2:
                  var5 = 0.0F;
                  break;
               case 3:
                  var5 = 180.0F;
                  break;
               case 4:
                  var5 = -45.0F;
                  break;
               case 5:
                  var5 = -135.0F;
                  break;
               case 6:
                  var5 = 45.0F;
                  break;
               case 7:
                  var5 = 135.0F;
                  break;
               default:
                  var5 = 0.0F;
            }

            float var7 = this.h;
            float var6 = var5;
            if (var5 < 0.0F) {
               var6 = var5 + 360.0F;
            }

            if (var7 < 0.0F) {
               var7 += 360.0F;
            }

            var5 = var6 - var7;
            float var9 = var7 - var6;
            float var8 = var5;
            if (var5 < 0.0F) {
               var8 = var5 + 360.0F;
            }

            if (var9 < 0.0F) {
               var9 += 360.0F;
            }

            if (var8 < var9) {
               var5 = var6;
               if (!(var8 < this.b)) {
                  var5 = (var6 + var7) / 2.0F;
               }
            } else {
               var5 = var6;
               if (!(var9 < this.b)) {
                  var5 = (var6 + var7) / 2.0F;
               }
            }

            this.h = var5;
         }
      }

      if (this.e % 10 < 5) {
         fishing4.a.m.a(var1, var2, var11, b(this.e), fishing4.a.g.a(this.d), fishing4.a.d.a(this.h));
      } else {
         fishing4.a.m.a(var1, var2, var11, b(this.e), fishing4.a.g.b(-this.d, this.d), fishing4.a.d.a(this.h));
      }

      fishing4.a.e var13;
      switch (this.e % 10) {
         case 0:
            var13 = fishing4.a.e.a(var11.a + 6.0F, var11.b + 48.0F);
            break;
         case 1:
            var13 = fishing4.a.e.a(var11.a + 16.0F, var11.b + 44.0F);
            break;
         case 2:
            var13 = fishing4.a.e.a(var11.a + 24.0F, var11.b + 39.0F);
            break;
         case 3:
            var13 = fishing4.a.e.a(var11.a + 17.0F, var11.b + 39.0F);
            break;
         case 4:
            var13 = fishing4.a.e.a(var11.a + 5.0F, var11.b + 46.0F);
            break;
         case 5:
            var13 = fishing4.a.e.a(var11.a - 6.0F, var11.b + 48.0F);
            break;
         case 6:
            var13 = fishing4.a.e.a(var11.a - 16.0F, var11.b + 44.0F);
            break;
         case 7:
            var13 = fishing4.a.e.a(var11.a - 24.0F, var11.b + 39.0F);
            break;
         case 8:
            var13 = fishing4.a.e.a(var11.a - 17.0F, var11.b + 39.0F);
            break;
         default:
            var13 = fishing4.a.e.a(var11.a - 6.0F, var11.b + 48.0F);
      }

      this.g = fishing4.a.e.a(var13, var11, (float)Math.toRadians((double)(this.h * -1.0F)));
      if (var3 % 2 == 0 && var4) {
         this.e = (this.e + 1) % 10;
      }

   }

   public final fishing4.a.f b() {
      return fishing4.a.f.a(fishing4.a.e.a(this.f, a(this.e)), fishing4.a.h.a(b(this.e).b.a / 2.0F, b(this.e).b.b / 2.0F));
   }

   protected final void c() {
      switch (this.c) {
         case 0:
            this.c = 4;
            break;
         case 1:
            this.c = 7;
            break;
         case 2:
            this.c = 6;
            break;
         case 3:
            this.c = 5;
            break;
         case 4:
            this.c = 2;
            break;
         case 5:
            this.c = 0;
            break;
         case 6:
            this.c = 1;
            break;
         case 7:
            this.c = 3;
      }

   }
}

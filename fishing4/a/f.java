package fishing4.a;

public final class f {
   private static final f c = new f(0.0F, 0.0F, 0.0F, 0.0F);
   private static f d = new f();
   private static f e = new f();
   public e a;
   public h b;

   public f() {
      this(0.0F, 0.0F, 0.0F, 0.0F);
   }

   private f(float var1, float var2, float var3, float var4) {
      this.a = fishing4.a.e.c(var1, var2);
      this.b = h.a(var3, var4);
   }

   public static float a(f var0) {
      return var0.a.a + var0.b.a;
   }

   public static f a() {
      return new f(0.0F, 0.0F, 0.0F, 0.0F);
   }

   public static f a(float var0, float var1, float var2, float var3) {
      return new f(var0, var1, var2, var3);
   }

   public static f a(e var0, h var1) {
      return new f(var0.a, var0.b, var1.a, var1.b);
   }

   public static f a(e var0, h var1, float var2) {
      f var14;
      if (var2 == 0.0F) {
         var14 = a(var0, var1);
      } else {
         f var12 = a(fishing4.a.e.a(), var1);
         double var3 = (double)y.b(var2);
         c var11 = new c();
         double var5 = Math.sin(var3);
         var3 = Math.cos(var3);
         if (Math.abs(var3) < 1.0E-10) {
            if (var5 > 0.0) {
               var3 = 1.0;
            } else {
               var3 = -1.0;
            }

            double var7 = 0.0;
            var5 = var3;
            var3 = var7;
         } else if (Math.abs(var5) < 1.0E-10) {
            var5 = 0.0;
            if (var3 > 0.0) {
               var3 = 1.0;
            } else {
               var3 = -1.0;
            }
         }

         var11.d = var3;
         var11.a = var3;
         var11.c = -var5;
         var11.b = var5;
         var11.f = 0.0;
         var11.e = 0.0;
         var11.g = -1;
         var11.e = 0.5 * (1.0 - var11.a) + 1.0 * var11.b;
         var11.f = 1.0 * (1.0 - var11.a) - 0.5 * var11.b;
         var11.g = -1;
         f var10 = a(0.0F, 0.0F, 0.0F, 0.0F);
         e[] var15 = new e[4];

         int var9;
         for(var9 = 0; var9 < 4; ++var9) {
            var15[var9] = fishing4.a.e.a(var12.a.a, var12.a.b);
         }

         e var13 = var15[1];
         var13.a += var12.b.a;
         var13 = var15[2];
         var13.b += var12.b.b;
         var13 = var15[3];
         var13.a += var12.b.a;
         var13 = var15[3];
         var13.b += var12.b.b;

         for(var9 = 0; var9 < 4; ++var9) {
            var15[var9] = fishing4.a.e.a(var15[var9], var11);
         }

         e var17 = fishing4.a.e.a(var15[0].a, var15[0].b);
         e var16 = fishing4.a.e.a(var15[0].a, var15[0].b);

         for(var9 = 1; var9 < 4; ++var9) {
            var17.a = Math.min(var17.a, var15[var9].a);
            var17.b = Math.min(var17.b, var15[var9].b);
            var16.a = Math.max(var16.a, var15[var9].a);
            var16.b = Math.max(var16.b, var15[var9].b);
         }

         var10.a.a = var17.a;
         var10.a.b = var17.b;
         var10.b.a = var16.a - var17.a;
         var10.b.b = var16.b - var17.b;
         var14 = a(fishing4.a.e.a((float)((double)var0.a + Math.sin((double)y.b(var2)) * (double)var10.b.a / 2.0), var0.b), var10.b);
      }

      return var14;
   }

   public static boolean a(e var0, h var1, e var2) {
      return a(var0, var1, var2, true);
   }

   public static boolean a(e var0, h var1, e var2, boolean var3) {
      boolean var6 = true;
      f var7 = a(fishing4.a.e.a(var0.a - var1.a / 2.0F, var0.b - var1.b / 2.0F), var1);
      boolean var4;
      if (var2.a >= var7.a.a && var2.b >= var7.a.b && var2.a < a(var7) && var2.b < b(var7)) {
         var4 = true;
      } else {
         var4 = false;
      }

      boolean var5;
      if (var4) {
         var5 = var6;
         if (var3) {
            fishing4.b.d var8;
            if (fishing4.game.z.b) {
               var8 = fishing4.b.d.a();
               GLRootView.getAppContext();
               var8.a(2131034130);
               var8 = fishing4.b.d.a();
               GLRootView.getAppContext();
               var8.a(2131034131);
               fishing4.b.d.a().b(GLRootView.getAppContext(), 2131034130);
               var5 = var6;
            } else {
               var8 = fishing4.b.d.a();
               GLRootView.getAppContext();
               var8.a(2131034130);
               var8 = fishing4.b.d.a();
               GLRootView.getAppContext();
               var8.a(2131034131);
               fishing4.b.d.a().b(GLRootView.getAppContext(), 2131034131);
               var5 = var6;
            }
         }
      } else {
         var5 = false;
      }

      return var5;
   }

   public static boolean a(f var0, f var1) {
      var0.b(var0.a.a - var0.b.a / 2.0F, var0.a.b - var0.b.b / 2.0F, var0.b.a, var0.b.b);
      var1.b(var1.a.a - var1.b.a / 2.0F, var1.a.b - var1.b.b / 2.0F, var1.b.a, var1.b.b);
      boolean var2;
      if (var0.a.a >= var1.a.a - var0.b.a && var0.a.a <= var1.a.a - var0.b.a + var1.b.a + var0.b.a && var0.a.b >= var1.a.b - var0.b.b && var0.a.b <= var1.a.b - var0.b.b + var1.b.b + var0.b.b) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public static float b(f var0) {
      return var0.a.b + var0.b.b;
   }

   private void b(float var1, float var2, float var3, float var4) {
      this.a.b(var1, var2);
      this.b.b(var3, var4);
   }

   public static float c(f var0) {
      return var0.a.a;
   }

   public final String toString() {
      return "((" + this.a.a + ", " + this.a.b + "),(" + this.b.a + ", " + this.b.b + "))";
   }
}

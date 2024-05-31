package fishing4.game;

import javax.microedition.khronos.opengles.GL10;

public final class bc {
   public static final fishing4.a.f a = fishing4.a.f.a(303.0F, 0.0F, 288.0F, 84.0F);
   public static final fishing4.a.f b = fishing4.a.f.a(593.0F, 1.0F, 302.0F, 96.0F);
   public static final fishing4.a.e c = fishing4.a.e.a(324.0F, (float)(fishing4.a.m.b() - 115 - 42));
   private final int d = 4;
   private fishing4.a.e e = fishing4.a.e.a(324.0F, (float)(fishing4.a.m.b() - 115 - 42));
   private fishing4.a.e[] f = new fishing4.a.e[4];

   private bc() {
      for(int var1 = 0; var1 < 4; ++var1) {
         this.f[var1] = this.b(var1);
      }

   }

   private static fishing4.a.f a(int var0) {
      fishing4.a.f var1;
      switch (var0) {
         case 0:
            var1 = fishing4.a.f.a(253.0F, 99.0F, 24.0F, 34.0F);
            break;
         case 1:
            var1 = fishing4.a.f.a(279.0F, 99.0F, 24.0F, 34.0F);
            break;
         case 2:
            var1 = fishing4.a.f.a(305.0F, 99.0F, 24.0F, 34.0F);
            break;
         case 3:
            var1 = fishing4.a.f.a(331.0F, 99.0F, 24.0F, 34.0F);
            break;
         default:
            var1 = fishing4.a.f.a();
      }

      return var1;
   }

   public static bc a() {
      return new bc();
   }

   // $FF: synthetic method
   static void a(bc var0, GL10 var1, fishing4.a.w var2, fishing4.a.w var3, int var4) {
      short var7 = 255;
      float var5 = 0.0F;
      switch (var4 % 10) {
         case 0:
         case 1:
         case 2:
         case 3:
            var5 = (float)(var4 % 10 + 1);
            break;
         case 4:
         case 5:
            var5 = 5.0F;
            break;
         case 6:
         case 7:
         case 8:
         case 9:
            var5 = (float)(10 - var4 % 10);
      }

      int var6;
      for(var6 = 0; var6 < 4; ++var6) {
         fishing4.a.e var8 = var0.f[var6];
         if (var8.b < (float)fishing4.a.m.b() + a(var6).b.b / 2.0F) {
            var0.f[var6] = fishing4.a.e.a(var8.a, var8.b + 1.0F);
         } else {
            var0.f[var6] = var0.b(var6);
         }

         if (var0.f[var6].b > var0.e.b) {
            fishing4.a.m.a(var1, var2, var0.f[var6].a, var0.f[var6].b, a(var6));
         }
      }

      if (var4 % 20 < 10) {
         var6 = var4 % 20 * 25;
      } else {
         var6 = var7;
         if (var4 % 20 < 20) {
            var6 = 255 - (var4 % 20 - 10) * 25;
         }
      }

      fishing4.a.m.a(var1, var3, var0.e.a, var0.e.b + var5, var6);
      fishing4.a.m.a(var1, var2, var0.e.a, var0.e.b + var5, a, '\b');
   }

   private fishing4.a.e b(int var1) {
      fishing4.a.e var2;
      switch (var1) {
         case 0:
            var2 = fishing4.a.e.a(this.e.a - a.b.a / 2.0F + 24.0F + (float)fishing4.a.z.a(14), this.e.b - 10.0F + (float)fishing4.a.z.a(10));
            break;
         case 1:
            var2 = fishing4.a.e.a(this.e.a + a.b.a / 2.0F - 24.0F - (float)fishing4.a.z.a(14), this.e.b - 45.0F + (float)fishing4.a.z.a(10));
            break;
         case 2:
            var2 = fishing4.a.e.a(this.e.a - a.b.a / 2.0F + 24.0F + (float)fishing4.a.z.a(14), this.e.b - 80.0F + (float)fishing4.a.z.a(10));
            break;
         case 3:
            var2 = fishing4.a.e.a(this.e.a + a.b.a / 2.0F - 24.0F - (float)fishing4.a.z.a(14), this.e.b - 115.0F + (float)fishing4.a.z.a(10));
            break;
         default:
            var2 = fishing4.a.e.a();
      }

      return var2;
   }
}

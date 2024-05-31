package fishing4.a;

public final class e {
   private static final e c = new e(0.0F, 0.0F);
   public float a;
   public float b;

   public e() {
      this(0.0F, 0.0F);
   }

   private e(float var1, float var2) {
      this.a = var1;
      this.b = var2;
   }

   public static e a() {
      return new e(0.0F, 0.0F);
   }

   public static e a(float var0) {
      return c((float)Math.cos((double)var0), (float)Math.sin((double)var0));
   }

   public static e a(float var0, float var1) {
      return new e(var0, var1);
   }

   public static e a(e var0, float var1) {
      return c(var0.a * var1, var0.b * var1);
   }

   public static e a(e var0, c var1) {
      e var8 = a(0.0F, 0.0F);
      float var7 = var0.a;
      float var6 = var0.b;
      var8.a = (float)((double)var7 * var1.a + (double)var6 * var1.c + var1.e);
      double var4 = (double)var7;
      double var2 = var1.b;
      var8.b = (float)((double)var6 * var1.d + var4 * var2 + var1.f);
      return var8;
   }

   public static e a(e var0, e var1) {
      return c(var0.a + var1.a, var0.b + var1.b);
   }

   public static e a(e var0, e var1, float var2) {
      var0 = b(var0, var1);
      float var4 = var0.a;
      float var3 = (float)Math.cos((double)var2);
      var2 = (float)Math.sin((double)var2);
      var0.a = var4 * var3 - var0.b * var2;
      var0.b = var4 * var2 + var3 * var0.b;
      return a(var0, var1);
   }

   public static float b(e var0) {
      return (float)Math.sqrt((double)(var0.a * var0.a + var0.b * var0.b));
   }

   public static e b(e var0, e var1) {
      return c(var0.a - var1.a, var0.b - var1.b);
   }

   public static float c(e var0) {
      return (float)Math.atan2((double)var0.b, (double)var0.a);
   }

   public static e c(float var0, float var1) {
      return new e(var0, var1);
   }

   public static e c(e var0, e var1) {
      return a(a(var0, var1), 0.5F);
   }

   public static float d(e var0, e var1) {
      return b(b(var0, var1));
   }

   public static float e(e var0, e var1) {
      float var5 = var1.a - var0.a;
      float var4 = var1.b - var0.b;
      float var3 = y.a((float)Math.atan((double)(var5 / var4)));
      float var2 = var3;
      if (var4 < 0.0F) {
         if (var5 < 0.0F) {
            var2 = Math.abs(var3) + 180.0F;
         } else {
            var2 = 180.0F - Math.abs(var3);
         }
      }

      return var2;
   }

   public final void a(e var1) {
      this.a = var1.a;
      this.b = var1.b;
   }

   public final void b(float var1, float var2) {
      this.a = var1;
      this.b = var2;
   }

   public final String toString() {
      return "(" + this.a + ", " + this.b + ")";
   }
}

package fishing4.a;

public final class g {
   public float a;
   public float b;

   public g() {
      this(0.0F, 0.0F);
   }

   private g(float var1, float var2) {
      this.a = var1;
      this.b = var2;
   }

   public static g a() {
      return new g(1.0F, 1.0F);
   }

   public static g a(float var0) {
      return new g(var0, var0);
   }

   public static g b() {
      return new g(-1.0F, 1.0F);
   }

   public static g b(float var0) {
      return new g(var0, 1.0F);
   }

   public static g b(float var0, float var1) {
      return new g(var0, var1);
   }

   public static g c() {
      return new g(1.0F, -1.0F);
   }

   public static g c(float var0) {
      return new g(1.0F, var0);
   }

   public final void a(float var1, float var2) {
      this.a = var1;
      this.b = var2;
   }

   public final String toString() {
      return "(" + this.a + ", " + this.b + ")";
   }
}

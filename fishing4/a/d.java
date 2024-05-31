package fishing4.a;

public final class d {
   public float a;
   public float b;
   public float c;

   private d(float var1, float var2, float var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public static d a() {
      return new d(0.5F, 0.5F, 0.0F);
   }

   public static d a(float var0) {
      return new d(0.5F, 0.5F, var0);
   }

   public static d a(float var0, float var1) {
      return new d(var0, var1, 0.0F);
   }

   public static d a(float var0, float var1, float var2) {
      return new d(var0, var1, var2);
   }

   public static d b() {
      return new d(1.0F, 0.0F, 0.0F);
   }

   public final String toString() {
      return "(" + this.a + ", " + this.b + ", " + this.c + ")";
   }
}

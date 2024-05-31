package fishing4.a;

public final class h {
   private static h c = a();
   public float a;
   public float b;

   private h() {
      this(0.0F, 0.0F);
   }

   private h(float var1, float var2) {
      this.a = var1;
      this.b = var2;
   }

   public static h a() {
      return new h(0.0F, 0.0F);
   }

   public static h a(float var0, float var1) {
      return new h(var0, var1);
   }

   public final void a(h var1) {
      this.a = var1.a;
      this.b = var1.b;
   }

   public final float b() {
      return this.a;
   }

   public final void b(float var1, float var2) {
      this.a = var1;
      this.b = var2;
   }

   public final float c() {
      return this.b;
   }

   public final String toString() {
      return "<" + this.a + ", " + this.b + ">";
   }
}

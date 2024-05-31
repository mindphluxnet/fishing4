package fishing4.a;

public final class aa {
   public float a;
   public float b;
   public float c;
   public float d;

   public aa() {
      this.d = 1.0F;
      this.c = 1.0F;
      this.b = 1.0F;
      this.a = 1.0F;
   }

   private aa(float var1, float var2, float var3, float var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public static aa a() {
      return new aa(0.0F, 0.0F, 0.0F, 1.0F);
   }

   public static aa a(float var0, float var1, float var2, float var3) {
      return new aa(var0, var1, var2, var3);
   }

   public static aa b() {
      return new aa(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static aa c() {
      return new aa(1.0F, 0.0F, 0.0F, 1.0F);
   }

   public static aa d() {
      return new aa(1.0F, 1.0F, 0.0F, 1.0F);
   }

   public static aa e() {
      return new aa(0.0F, 1.0F, 0.0F, 1.0F);
   }

   public final String toString() {
      return "< r=" + this.a + ", g=" + this.b + ", b=" + this.c + ", a=" + this.d + " >";
   }
}

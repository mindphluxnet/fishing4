package fishing4.a;

public final class RGBColor {
   public float r;
   public float g;
   public float b;
   public float a;

   public RGBColor() {
      this.a = 1.0F;
      this.b = 1.0F;
      this.g = 1.0F;
      this.r = 1.0F;
   }

   private RGBColor(float r, float g, float b, float a) {
      this.r = r;
      this.g = g;
      this.b = b;
      this.a = a;
   }

   public static RGBColor black() {
      return new RGBColor(0.0F, 0.0F, 0.0F, 1.0F);
   }

   public static RGBColor getColor(float r, float g, float b, float a) {
      return new RGBColor(r, g, b, a);
   }

   public static RGBColor white() {
      return new RGBColor(1.0F, 1.0F, 1.0F, 1.0F);
   }

   public static RGBColor red() {
      return new RGBColor(1.0F, 0.0F, 0.0F, 1.0F);
   }

   public static RGBColor yellow() {
      return new RGBColor(1.0F, 1.0F, 0.0F, 1.0F);
   }

   public static RGBColor green() {
      return new RGBColor(0.0F, 1.0F, 0.0F, 1.0F);
   }

   public final String toString() {
      return "< r=" + this.r + ", g=" + this.g + ", b=" + this.b + ", a=" + this.a + " >";
   }
}

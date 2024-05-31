package fishing4.a;

public final class c {
   public double a = 1.0;
   public double b = 0.0;
   public double c = 0.0;
   public double d = 1.0;
   public double e = 0.0;
   public double f = 0.0;
   transient int g = 0;

   public final Object clone() {
      try {
         Object var1 = super.clone();
         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new InternalError();
      }
   }

   public final boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 != this) {
         if (var1 instanceof c) {
            c var3 = (c)var1;
            if (this.a != var3.a || this.c != var3.c || this.e != var3.e || this.b != var3.b || this.d != var3.d || this.f != var3.f) {
               var2 = false;
            }
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public final int hashCode() {
      n var3 = new n();
      double var1 = this.a;
      var3.a();
      var1 = this.c;
      var3.a();
      var1 = this.e;
      var3.a();
      var1 = this.b;
      var3.a();
      var1 = this.d;
      var3.a();
      var1 = this.f;
      var3.a();
      return var3.hashCode();
   }

   public final String toString() {
      return this.getClass().getName() + "[[" + this.a + ", " + this.c + ", " + this.e + "], [" + this.b + ", " + this.d + ", " + this.f + "]]";
   }
}

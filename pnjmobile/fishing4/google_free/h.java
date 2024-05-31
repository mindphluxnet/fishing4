package pnjmobile.fishing4.google_free;

public enum h {
   a,
   b,
   c,
   d,
   e,
   f,
   g;

   private static final h[] h = new h[]{a, b, c, d, e, f, g};

   public static h a(int var0) {
      h[] var1 = values();
      h var2;
      if (var0 >= 0 && var0 < var1.length) {
         var2 = var1[var0];
      } else {
         var2 = g;
      }

      return var2;
   }
}

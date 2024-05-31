package pnjmobile.fishing4.google_free;

public enum g {
   a,
   b,
   c;

   private static final g[] d = new g[]{a, b, c};

   public static g a(int var0) {
      g[] var1 = values();
      g var2;
      if (var0 >= 0 && var0 < var1.length) {
         var2 = var1[var0];
      } else {
         var2 = b;
      }

      return var2;
   }
}

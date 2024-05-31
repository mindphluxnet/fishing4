package fishing4.a;

public final class z {
   private static long a;

   public z() {
      System.currentTimeMillis();
      this.a();
   }

   public z(byte var1) {
      this.a();
   }

   public static int a(int var0) {
      if ((-var0 & var0) == var0) {
         var0 = (int)((long)var0 * (long)b() >> 31);
      } else {
         int var1;
         int var2;
         do {
            var2 = b();
            var1 = var2 % var0;
         } while(var2 - var1 + (var0 - 1) < 0);

         var0 = var1;
      }

      return var0;
   }

   public static int a(int var0, int var1) {
      return a(var1 - var0) + var0;
   }

   private void a() {
      synchronized(this){}
   }

   private static int b() {
      synchronized(z.class){}
      boolean var5 = false;

      long var1;
      try {
         var5 = true;
         var1 = a * 25214903917L + 11L & 281474976710655L;
         a = var1;
         var5 = false;
      } finally {
         if (var5) {
            ;
         }
      }

      int var0 = (int)(var1 >>> 17);
      return var0;
   }
}

package pnjmobile.fishing4.google_free.a;

public class a {
   static final boolean a;
   private static final byte[] b;
   private static final byte[] c;
   private static final byte[] d;
   private static final byte[] e;

   static {
      boolean var0;
      if (!a.class.desiredAssertionStatus()) {
         var0 = true;
      } else {
         var0 = false;
      }

      a = var0;
      b = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
      c = new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
      byte[] var1 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
      d = var1;
      var1 = new byte[]{-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9, -9};
      e = var1;
   }

   private a() {
   }

   private static int a(byte[] var0, byte[] var1, int var2, byte[] var3) {
      int var4 = 1;
      byte var5;
      if (var0[2] == 61) {
         var1[var2] = (byte)((var3[var0[0]] << 24 >>> 6 | var3[var0[1]] << 24 >>> 12) >>> 16);
         var5 = (byte)var4;
      } else {
         byte var6;
         if (var0[3] == 61) {
            var6 = var3[var0[0]];
            var4 = var3[var0[1]] << 24 >>> 12 | var6 << 24 >>> 6 | var3[var0[2]] << 24 >>> 18;
            var1[var2] = (byte)(var4 >>> 16);
            var1[var2 + 1] = (byte)(var4 >>> 8);
            var5 = 2;
         } else {
            var6 = var3[var0[0]];
            var4 = var3[var0[1]] << 24 >>> 12 | var6 << 24 >>> 6 | var3[var0[2]] << 24 >>> 18 | var3[var0[3]] << 24 >>> 24;
            var1[var2] = (byte)(var4 >> 16);
            var1[var2 + 1] = (byte)(var4 >> 8);
            var1[var2 + 2] = (byte)var4;
            var5 = 3;
         }
      }

      return var5;
   }

   public static byte[] a(String var0) {
      byte[] var10 = var0.getBytes();
      int var6 = var10.length;
      byte[] var9 = d;
      byte[] var11 = new byte[var6 * 3 / 4 + 2];
      byte[] var8 = new byte[4];
      int var4 = 0;
      int var3 = 0;

      int var2;
      int var5;
      for(var2 = 0; var4 < var6; var4 = var5) {
         byte var1 = (byte)(var10[var4 + 0] & 127);
         var5 = var9[var1];
         if (var5 < -5) {
            throw new b("Bad Base64 input character at " + var4 + ": " + var10[var4 + 0] + "(decimal)");
         }

         if (var5 >= -1) {
            if (var1 == 61) {
               int var7 = var6 - var4;
               byte var12 = (byte)(var10[var6 - 1 + 0] & 127);
               if (var3 != 0 && var3 != 1) {
                  if (var3 == 3 && var7 > 2 || var3 == 4 && var7 > 1) {
                     throw new b("padding byte '=' falsely signals end of encoded value at offset " + var4);
                  }

                  if (var12 != 61 && var12 != 10) {
                     throw new b("encoded value has invalid trailing byte");
                  }
                  break;
               }

               throw new b("invalid padding byte '=' at byte offset " + var4);
            }

            var5 = var3 + 1;
            var8[var3] = var1;
            if (var5 == 4) {
               var3 = a(var8, var11, var2, var9) + var2;
               var2 = 0;
            } else {
               var3 = var2;
               var2 = var5;
            }
         } else {
            var5 = var2;
            var2 = var3;
            var3 = var5;
         }

         var5 = var4 + 1;
         var4 = var3;
         var3 = var2;
         var2 = var4;
      }

      var4 = var2;
      if (var3 != 0) {
         if (var3 == 1) {
            throw new b("single trailing character at offset " + (var6 - 1));
         }

         var8[var3] = 61;
         var4 = var2 + a(var8, var11, var2, var9);
      }

      var8 = new byte[var4];
      System.arraycopy(var11, 0, var8, 0, var4);
      return var8;
   }
}

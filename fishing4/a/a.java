package fishing4.a;

public final class a {
   public static int a(byte[] var0, int var1) {
      if (var0.length < 4) {
         throw new Exception("The length of the byte array must be at least 4 bytes long.");
      } else {
         return ((var0[var1 + 3] & 255) << 24) + ((var0[var1 + 2] & 255) << 16) + ((var0[var1 + 1] & 255) << 8) + (var0[var1] & 255);
      }
   }

   public static byte[] a(int var0) {
      return new byte[]{(byte)(var0 & 255), (byte)(var0 >> 8 & 255), (byte)(var0 >> 16 & 255), (byte)(var0 >> 24 & 255)};
   }

   public static byte[] a(long var0) {
      return new byte[]{(byte)((int)(255L & var0)), (byte)((int)(var0 >> 8 & 255L)), (byte)((int)(var0 >> 16 & 255L)), (byte)((int)(var0 >> 24 & 255L)), (byte)((int)(var0 >> 32 & 255L)), (byte)((int)(var0 >> 40 & 255L)), (byte)((int)(var0 >> 48 & 255L)), (byte)((int)(var0 >> 56 & 255L))};
   }

   public static byte[] a(boolean var0) {
      byte var1 = 1;
      if (!var0) {
         var1 = 0;
      }

      return new byte[]{(byte)var1};
   }

   public static long b(byte[] var0, int var1) {
      if (var0.length < 8) {
         throw new Exception("The length of the byte array must be at least 8 bytes long.");
      } else {
         return (long)(var0[var1 + 7] & 255) << 56 | (long)(var0[var1 + 6] & 255) << 48 | (long)(var0[var1 + 5] & 255) << 40 | (long)(var0[var1 + 4] & 255) << 32 | (long)(var0[var1 + 3] & 255) << 24 | (long)(var0[var1 + 2] & 255) << 16 | (long)(var0[var1 + 1] & 255) << 8 | (long)(var0[var1] & 255);
      }
   }

   public static float c(byte[] var0, int var1) {
      if (var0.length < 4) {
         throw new Exception("The length of the byte array must be at least 4 bytes long.");
      } else {
         return Float.intBitsToFloat(a(var0, var1));
      }
   }
}

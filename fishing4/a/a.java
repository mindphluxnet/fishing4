package fishing4.a;

public final class a {
   public static int a(byte[] buffer, int var1) throws Exception {
      if (buffer.length < 4) {
         throw new Exception("The length of the byte array must be at least 4 bytes long.");
      } else {
         return ((buffer[var1 + 3] & 255) << 24) + ((buffer[var1 + 2] & 255) << 16) + ((buffer[var1 + 1] & 255) << 8) + (buffer[var1] & 255);
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

   public static long b(byte[] buffer, int var1) throws Exception {
      if (buffer.length < 8) {
         throw new Exception("The length of the byte array must be at least 8 bytes long.");
      } else {
         return (long)(buffer[var1 + 7] & 255) << 56 | (long)(buffer[var1 + 6] & 255) << 48 | (long)(buffer[var1 + 5] & 255) << 40 | (long)(buffer[var1 + 4] & 255) << 32 | (long)(buffer[var1 + 3] & 255) << 24 | (long)(buffer[var1 + 2] & 255) << 16 | (long)(buffer[var1 + 1] & 255) << 8 | (long)(buffer[var1] & 255);
      }
   }

   public static float c(byte[] buffer, int var1) throws Exception {
      if (buffer.length < 4) {
         throw new Exception("The length of the byte array must be at least 4 bytes long.");
      } else {
         return Float.intBitsToFloat(a(buffer, var1));
      }
   }
}

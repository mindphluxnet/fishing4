package fishing4.a;

import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class AESUtils {
   protected static Random random = new Random();
   protected byte[] buffer;
   protected byte[] bytesToEncrypt;
   protected long longToEncrypt;

   private AESUtils() {
      this.generateKey();
   }

   public static AESUtils a() {
      return new AESUtils();
   }

   private void generateKey() {
      this.buffer = new byte[16];

      for(int i = 0; i < 16; ++i) {
         this.buffer[i] = (byte)"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(random.nextInt(62));
      }

      this.longToEncrypt = 0L;
      this.encryptLong(0L);
   }

   public final void encryptLong(long value) { // TODO: rename function to what it actually does
      this.longToEncrypt = value;

      try {
         String longToEncrypt = Long.toString(value);
         SecretKeySpec secretKeySpec = new SecretKeySpec(this.buffer, "AES");
         Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
         cipher.init(1, secretKeySpec);
         this.bytesToEncrypt = cipher.doFinal(longToEncrypt.getBytes("UTF-8"));
      } catch (Exception ex) {
         ex.printStackTrace();
      }

   }

   public final long encrypt() { // TODO: rename function to what it actually does
      int encryptInt;
      long returnValue;
      try {
         SecretKeySpec secretKeySpec = new SecretKeySpec(this.buffer, "AES");
         Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
         cipher.init(2, secretKeySpec);
         byte[] encryptResult = cipher.doFinal(this.bytesToEncrypt);
         String encryptString = new String(encryptResult);
         encryptInt = Integer.parseInt(encryptString);
      } catch (Exception var6) {
         var6.printStackTrace();
         returnValue = 0L;
         return returnValue;
      }

      returnValue = (long)encryptInt;
      return returnValue;
   }

   public final void b(long value) {
      this.encryptLong(this.encrypt() + value);
   } // TODO: refactor function name

   public final long c() {
      return this.longToEncrypt;
   } // TODO: refactor function name
}

package fishing4.a;

import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public final class l {
   protected static Random a = new Random();
   protected byte[] b;
   protected byte[] c;
   protected long d;

   private l() {
      this.d();
   }

   public static l a() {
      return new l();
   }

   private void d() {
      this.b = new byte[16];

      for(int var1 = 0; var1 < 16; ++var1) {
         this.b[var1] = (byte)"ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(a.nextInt(62));
      }

      this.d = 0L;
      this.a(0L);
   }

   public final void a(long var1) {
      this.d = var1;

      try {
         String var3 = Long.toString(var1);
         SecretKeySpec var5 = new SecretKeySpec(this.b, "AES");
         Cipher var4 = Cipher.getInstance("AES/ECB/PKCS5Padding");
         var4.init(1, var5);
         this.c = var4.doFinal(var3.getBytes("UTF-8"));
      } catch (Exception var6) {
         var6.printStackTrace();
      }

   }

   public final long b() {
      int var1;
      long var2;
      try {
         SecretKeySpec var4 = new SecretKeySpec(this.b, "AES");
         Cipher var5 = Cipher.getInstance("AES/ECB/PKCS5Padding");
         var5.init(2, var4);
         byte[] var8 = var5.doFinal(this.c);
         String var7 = new String(var8);
         var1 = Integer.valueOf(var7);
      } catch (Exception var6) {
         var6.printStackTrace();
         var2 = 0L;
         return var2;
      }

      var2 = (long)var1;
      return var2;
   }

   public final void b(long var1) {
      this.a(this.b() + var1);
   }

   public final long c() {
      return this.d;
   }
}

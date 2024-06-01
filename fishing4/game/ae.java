package fishing4.game;

import java.text.DecimalFormat;
import javax.microedition.khronos.opengles.GL10;

import fishing4.a.AESUtils;

public class ae {
   protected AESUtils a = AESUtils.createInstance();
   public fishing4.a.h b;
   public fishing4.a.f[] c;
   public fishing4.a.e[] d;
   protected boolean e = false;

   public ae(long var1) {
      this.a.encryptLong(var1);
      this.a();
   }

   private static int a(char var0) {
      byte var1;
      switch (var0) {
         case ',':
            var1 = 6;
            break;
         case '-':
         case '.':
         case '/':
         default:
            var1 = 0;
            break;
         case '0':
         case '1':
         case '2':
         case '3':
         case '4':
         case '5':
         case '6':
         case '7':
         case '8':
         case '9':
            var1 = 16;
      }

      return var1;
   }

   public static ae a(long var0) {
      return new ae(var0);
   }

   public final void a() {
      String var8 = this.c();
      int var4 = 0;

      int var3;
      for(int var5 = 0; var5 < var8.length(); var4 = var3) {
         var3 = var4;
         switch (var8.charAt(var5)) {
            case ',':
               var3 = var4 + a(var8.charAt(var5));
            case '-':
            case '.':
            case '/':
               break;
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
               var3 = var4 + a(var8.charAt(var5));
               break;
            default:
               var3 = var4;
         }

         ++var5;
      }

      float var2 = 49.0F;
      this.c = new fishing4.a.f[var8.length() + 1];
      this.d = new fishing4.a.e[var8.length() + 1];

      for(var3 = 0; var3 < var8.length(); ++var3) {
         char var1 = var8.charAt(var3);
         fishing4.a.f[] var7 = this.c;
         fishing4.a.f var6;
         switch (var1) {
            case ',':
               var6 = fishing4.a.f.a(1008.0F, 218.0F, 6.0F, 18.0F);
               break;
            case '-':
            case '.':
            case '/':
            default:
               var6 = fishing4.a.f.a(0.0F, 0.0F, 0.0F, 0.0F);
               break;
            case '0':
               var6 = fishing4.a.f.a(781.0F, 218.0F, 16.0F, 18.0F);
               break;
            case '1':
               var6 = fishing4.a.f.a(797.0F, 218.0F, 16.0F, 18.0F);
               break;
            case '2':
               var6 = fishing4.a.f.a(814.0F, 218.0F, 16.0F, 18.0F);
               break;
            case '3':
               var6 = fishing4.a.f.a(831.0F, 218.0F, 16.0F, 18.0F);
               break;
            case '4':
               var6 = fishing4.a.f.a(847.0F, 218.0F, 16.0F, 18.0F);
               break;
            case '5':
               var6 = fishing4.a.f.a(865.0F, 218.0F, 16.0F, 18.0F);
               break;
            case '6':
               var6 = fishing4.a.f.a(882.0F, 218.0F, 16.0F, 18.0F);
               break;
            case '7':
               var6 = fishing4.a.f.a(899.0F, 218.0F, 16.0F, 18.0F);
               break;
            case '8':
               var6 = fishing4.a.f.a(915.0F, 218.0F, 16.0F, 18.0F);
               break;
            case '9':
               var6 = fishing4.a.f.a(932.0F, 218.0F, 16.0F, 18.0F);
         }

         var7[var3] = var6;
         if (var1 == ',') {
            this.d[var3] = fishing4.a.e.a(var2 - 6.0F, 0.0F);
         } else {
            this.d[var3] = fishing4.a.e.a(var2, 0.0F);
         }

         var2 += (float)a(var1);
      }

      this.c[var3] = fishing4.a.f.a(958.0F, 218.0F, 18.0F, 18.0F);
      this.d[var3] = fishing4.a.e.a(var2 + 6.0F, 0.0F);
      this.b = fishing4.a.h.a((float)(var4 + 74 + 6 + 18), 20.0F);
   }

   public void a(GL10 var1, fishing4.a.e var2, fishing4.a.w var3) {
      int var4 = 0;
      if (this.e) {
         this.e = false;
         this.a();
      }

      var2 = fishing4.a.e.c(var2.a + 37.0F - this.b.a / 2.0F, var2.b);
      if (globalConfig.languageId == 0) {
         fishing4.a.m.a(var1, var3, var2, fishing4.a.f.a(697.0F, 219.0F, 74.0F, 20.0F));
      } else {
         fishing4.a.m.a(var1, var3, var2, fishing4.a.f.a(369.0F, 402.0F, 74.0F, 20.0F));
      }

      while(var4 < this.d.length) {
         fishing4.a.m.a(var1, var3, fishing4.a.e.c(var2.a + this.d[var4].a, var2.b), this.c[var4]);
         ++var4;
      }

   }

   public final long b() {
      return this.a.encrypt();
   }

   public final void b(long var1) {
      this.a.encryptLong(var1);
      this.e = true;
   }

   public final String c() {
      return (new DecimalFormat()).format(this.a.encrypt()).toString();
   }

   public boolean c(long var1) {
      if (this.a.encrypt() + var1 > 999999999L) {
         this.a.encryptLong(999999999L);
         this.e = true;
      } else if (var1 > 0L) {
         this.a.encryptLong(this.a.encrypt() + var1);
         this.e = true;
      }

      return true;
   }

   public final String d() {
      return this.c() + "G";
   }

   public final boolean d(long var1) {
      boolean var3 = false;
      if (this.a.encrypt() - var1 >= 0L && var1 >= 0L) {
         this.a.encryptLong(this.a.encrypt() - var1);
         this.e = true;
         q.c(13);
         var3 = true;
      }

      return var3;
   }
}

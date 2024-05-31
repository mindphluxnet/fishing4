package fishing4.game;

import javax.microedition.khronos.opengles.GL10;

public final class at {
   public static void a(GL10 var0, fishing4.a.w var1, int var2, int var3, fishing4.a.e var4) {
      String.valueOf(var2).length();
      int var5 = String.valueOf(var3).length();
      a(var0, var1, var3, var4);
      fishing4.a.m.a(var0, var1, var4.a - (float)(var5 * 16) - 16.0F, var4.b, 995.0F, 191.0F, 16.0F, 18.0F);
      a(var0, var1, var2, fishing4.a.e.a(var4.a - (float)(var5 * 16) - 16.0F, var4.b));
   }

   private static void a(GL10 var0, fishing4.a.w var1, int var2, fishing4.a.e var3) {
      String var8 = String.valueOf(var2);
      int var7 = var8.length();
      float var6 = var3.a;
      float var5 = var3.b;
      float var4 = (float)(var7 * 16);
      var2 = 0;

      for(var4 = var6 - var4; var2 < var7; var4 += 17.0F) {
         fishing4.a.f var9;
         switch (var8.charAt(var2)) {
            case '0':
               var9 = fishing4.a.f.a(781.0F, 218.0F, 16.0F, 18.0F);
               break;
            case '1':
               var9 = fishing4.a.f.a(797.0F, 218.0F, 16.0F, 18.0F);
               break;
            case '2':
               var9 = fishing4.a.f.a(814.0F, 218.0F, 16.0F, 18.0F);
               break;
            case '3':
               var9 = fishing4.a.f.a(831.0F, 218.0F, 16.0F, 18.0F);
               break;
            case '4':
               var9 = fishing4.a.f.a(847.0F, 218.0F, 16.0F, 18.0F);
               break;
            case '5':
               var9 = fishing4.a.f.a(865.0F, 218.0F, 16.0F, 18.0F);
               break;
            case '6':
               var9 = fishing4.a.f.a(882.0F, 218.0F, 16.0F, 18.0F);
               break;
            case '7':
               var9 = fishing4.a.f.a(899.0F, 218.0F, 16.0F, 18.0F);
               break;
            case '8':
               var9 = fishing4.a.f.a(915.0F, 218.0F, 16.0F, 18.0F);
               break;
            case '9':
               var9 = fishing4.a.f.a(932.0F, 218.0F, 16.0F, 18.0F);
               break;
            default:
               var9 = fishing4.a.f.a(0.0F, 0.0F, 0.0F, 0.0F);
         }

         fishing4.a.m.a(var0, var1, var4, var5, var9);
         ++var2;
      }

   }
}

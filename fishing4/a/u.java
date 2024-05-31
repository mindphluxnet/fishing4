package fishing4.a;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public final class u {
   public static String[] a = new String[]{"/system/bin/su", "/system/xbin/su", "/system/app/SuperUser.apk", "/data/data/com.noshufou.android.su"};

   public static boolean a() {
      String[] var4 = a;
      File[] var3 = new File[var4.length];

      for(int var0 = 0; var0 < var4.length; ++var0) {
         var3[var0] = new File(var4[var0]);
      }

      boolean var2 = a(var3);
      boolean var1 = var2;
      if (!var2) {
         var1 = b();
      }

      return var1;
   }

   private static boolean a(File[] var0) {
      boolean var3 = false;
      int var2 = var0.length;

      for(int var1 = 0; var1 < var2; ++var1) {
         File var4 = var0[var1];
         if (var4 != null && var4.exists() && var4.isFile()) {
            var3 = true;
            break;
         }
      }

      return var3;
   }

   private static boolean b() {
      boolean var3 = true;

      boolean var2;
      label64: {
         Exception var10000;
         label69: {
            BufferedReader var14;
            boolean var10001;
            try {
               ProcessBuilder var4 = new ProcessBuilder(new String[0]);
               var4.command("ps");
               InputStream var13 = var4.start().getInputStream();
               InputStreamReader var5 = new InputStreamReader(var13);
               var14 = new BufferedReader(var5);
            } catch (Exception var12) {
               var10000 = var12;
               var10001 = false;
               break label69;
            }

            int var0 = 0;

            label59:
            while(true) {
               String var16;
               try {
                  var16 = var14.readLine();
               } catch (Exception var11) {
                  var10000 = var11;
                  var10001 = false;
                  break;
               }

               if (var16 == null) {
                  break label64;
               }

               try {
                  System.out.println(var16);
               } catch (Exception var10) {
                  var10000 = var10;
                  var10001 = false;
                  break;
               }

               if (var0 != 0) {
                  StringTokenizer var6;
                  try {
                     var6 = new StringTokenizer(var16, " ");
                  } catch (Exception var9) {
                     var10000 = var9;
                     var10001 = false;
                     break;
                  }

                  for(int var1 = 0; var1 < 8; ++var1) {
                     try {
                        var6.nextToken();
                     } catch (Exception var8) {
                        var10000 = var8;
                        var10001 = false;
                        break label59;
                     }
                  }

                  var2 = var3;

                  try {
                     if (var6.nextToken().equals("su")) {
                        return var2;
                     }
                  } catch (Exception var7) {
                     var10000 = var7;
                     var10001 = false;
                     break;
                  }
               }

               ++var0;
            }
         }

         Exception var15 = var10000;
         var15.printStackTrace();
      }

      var2 = false;
      return var2;
   }
}

package fishing4.a;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.net.ssl.HttpsURLConnection;

import fishing4.game.globalConfig;

public final class y {
   static final char[] a = new char[]{'0', 'ㄱ', 'ㄲ', 'ㄳ', 'ㄴ', 'ㄵ', 'ㄶ', 'ㄷ', 'ㄹ', 'ㄺ', 'ㄻ', 'ㄼ', 'ㄽ', 'ㄾ', 'ㄿ', 'ㅀ', 'ㅁ', 'ㅂ', 'ㅄ', 'ㅅ', 'ㅆ', 'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ'};
   private static Runtime b = Runtime.getRuntime();

   public static final float a(float var0) {
      return var0 / 3.1415927F * 180.0F;
   }

   public static int a(byte[] var0, int var1) {
      return var0[var1] & 255 | (var0[var1 + 1] & 255) << 8 | (var0[var1 + 2] & 255) << 16 | (var0[var1 + 3] & 255) << 24;
   }

   public static long a() {
      return System.currentTimeMillis();
   }

   public static String a(int var0) {
      return s.a().getString(var0);
   }

   public static String a(String var0) {
      char var1 = var0.charAt(var0.length() - 1);
      String var2 = var0;
      if (var1 >= '가') {
         if (var1 > '힣') {
            var2 = var0;
         } else if (a[(var1 - '가') % 588 % 28] == '0') {
            var2 = var0 + "를";
         } else {
            var2 = var0 + "을";
         }
      }

      return var2;
   }

   public static String a(URL var0) {
      String var12;
      IOException var10000;
      label33: {
         StringBuffer var1;
         BufferedInputStream var2;
         BufferedReader var3;
         InputStreamReader var5;
         HttpURLConnection var10;
         boolean var10001;
         try {
            var10 = (HttpURLConnection)var0.openConnection();
            var10.setConnectTimeout(3000);
            var10.setReadTimeout(3000);
            var10.setUseCaches(false);
            var2 = new BufferedInputStream(var10.getInputStream());
            var5 = new InputStreamReader(var2, Charset.forName("EUC-KR"));
            var3 = new BufferedReader(var5);
            var1 = new StringBuffer();
         } catch (IOException var9) {
            var10000 = var9;
            var10001 = false;
            break label33;
         }

         while(true) {
            String var4;
            try {
               var4 = var3.readLine();
            } catch (IOException var7) {
               var10000 = var7;
               var10001 = false;
               break;
            }

            if (var4 == null) {
               try {
                  var3.close();
                  var5.close();
                  var2.close();
                  var10.disconnect();
                  var12 = var1.toString();
                  return var12;
               } catch (IOException var6) {
                  var10000 = var6;
                  var10001 = false;
                  break;
               }
            }

            try {
               var1.append(var4);
            } catch (IOException var8) {
               var10000 = var8;
               var10001 = false;
               break;
            }
         }
      }

      IOException var11 = var10000;
      var11.printStackTrace();
      var12 = null;
      return var12;
   }

   public static boolean a(e var0, e var1) {
      boolean var5 = true;
      float var3 = var0.a;
      float var4 = var0.b;
      e var6 = e.b(var1, var0);
      e var7 = e.c(Math.abs(var6.a / 2.0F), Math.abs(var6.b / 2.0F));
      float var2;
      if (var6.a != 0.0F && Math.abs(var6.a) < 3.0F) {
         var2 = var1.a;
      } else {
         var2 = var3;
         if (var6.a != 0.0F) {
            var2 = var3 + var6.a / Math.abs(var6.a) * var7.a;
         }
      }

      if (var6.b != 0.0F && Math.abs(var6.b) < 3.0F) {
         var3 = var1.b;
      } else {
         var3 = var4;
         if (var6.b != 0.0F) {
            var3 = var6.b / Math.abs(var6.b);
            var3 = var4 + var7.b * var3;
         }
      }

      if (var6.a != 0.0F || var6.b != 0.0F) {
         var5 = false;
      }

      var0.b(var2, var3);
      return var5;
   }

   public static boolean a(e var0, e var1, e var2) {
      boolean var6 = true;
      float var4 = var0.a;
      float var5 = var0.b;
      e var7 = e.b(var1, var0);
      var2 = e.c(var2.a, var2.b);
      float var3;
      if (var7.a != 0.0F && Math.abs(var7.a) < 3.0F) {
         var3 = var1.a;
      } else {
         var3 = var4;
         if (var7.a != 0.0F) {
            var3 = var4 + var7.a / Math.abs(var7.a) * var2.a;
         }
      }

      if (var7.b != 0.0F && Math.abs(var7.b) < 3.0F) {
         var4 = var1.b;
      } else {
         var4 = var5;
         if (var7.b != 0.0F) {
            var4 = var7.b / Math.abs(var7.b);
            var4 = var5 + var2.b * var4;
         }
      }

      if (var7.a != 0.0F || var7.b != 0.0F) {
         var6 = false;
      }

      var0.b(var3, var4);
      return var6;
   }

   public static final float b(float var0) {
      return 3.1415927F * var0 / 180.0F;
   }

   public static String b(int var0) {
      DecimalFormat var1 = new DecimalFormat();
      String var2;
      if (globalConfig.a == 0) {
         var2 = var1.format((long)var0) + "원";
      } else {
         var2 = var1.format((long)var0);
      }

      return var2;
   }

   public static void postToUrl(URL url) {
      try {
         if (url.getProtocol().equals("https")) {
            HttpsURLConnection urlConnection = (HttpsURLConnection)url.openConnection();
            urlConnection.setConnectTimeout(1000);
            urlConnection.setReadTimeout(1000);
            urlConnection.setUseCaches(false);
            urlConnection.getResponseMessage();
            urlConnection.disconnect();
         } else if (url.getProtocol().equals("http")) {
            HttpURLConnection urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.setConnectTimeout(1000);
            urlConnection.setReadTimeout(1000);
            urlConnection.setUseCaches(false);
            urlConnection.getResponseMessage();
            urlConnection.disconnect();
         }
      } catch (IOException ex) {
         ex.printStackTrace();
      }

   }

   public static boolean b(String var0) {
      boolean var2 = false;
      String[] var3 = s.a().fileList();

      for(int var1 = 0; var1 < var3.length; ++var1) {
         if (var3[var1].equals(var0)) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public static String c(int var0) {
      DecimalFormat var1 = new DecimalFormat();
      String var2;
      if (globalConfig.a == 0) {
         var2 = var1.format((long)var0) + "Coin";
      } else {
         var2 = var1.format((long)var0);
      }

      return var2;
   }

   public static String c(String var0) {
      return new String(e(var0));
   }

   public static String d(int var0) {
      DecimalFormat var1 = new DecimalFormat();
      String var2;
      if (var0 <= 0) {
         if (globalConfig.a == 0) {
            var2 = "무료";
         } else {
            var2 = "Free";
         }
      } else {
         var2 = var1.format((long)var0) + "G";
      }

      return var2;
   }

   public static final String d(String var0) {
      Date var1 = new Date();
      return (new SimpleDateFormat(var0)).format(var1);
   }

   private static String e(String var0) {
      byte[] var5;
      label27: {
         IOException var1;
         label26: {
            InputStream var6;
            try {
               var6 = s.a().getAssets().open(var0);
               var5 = new byte[var6.available()];
            } catch (IOException var4) {
               var1 = var4;
               var5 = null;
               break label26;
            }

            try {
               var6.read(var5);
               var6.close();
               break label27;
            } catch (IOException var3) {
               var1 = var3;
            }
         }

         var1.printStackTrace();
      }

      String var7;
      try {
         var7 = new String(var5, "KSC5601");
      } catch (UnsupportedEncodingException var2) {
         var2.printStackTrace();
         var0 = null;
         return var0;
      }

      var0 = var7;
      return var0;
   }
}

package fishing4.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Bitmap.Config;
import android.net.ConnectivityManager;
import android.widget.Toast;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import javax.microedition.khronos.opengles.GL10;

public final class t {
   private static boolean A;
   public static Paint a = new Paint(1);
   public static Context b;
   public static int c;
   public static int d;
   public static boolean e;
   public static w f;
   public static boolean g;
   public static boolean h;
   public static boolean i;
   public static w j = new w();
   public static w k;
   public static int l;
   public static int m;
   public static int n;
   public static int o;
   public static int p;
   public static int q;
   public static int r;
   public static int s;
   public static String t;
   public static String u;
   static Bitmap v = null;
   public static boolean w = false;
   public static boolean x = false;
   public static boolean y = false;
   public static String z = "";

   private static String a(URL var0) {
      String var12;
      IOException var10000;
      label33: {
         StringBuffer var1;
         InputStreamReader var3;
         HttpURLConnection var4;
         BufferedReader var5;
         BufferedInputStream var10;
         boolean var10001;
         try {
            var4 = (HttpURLConnection)var0.openConnection();
            var4.setConnectTimeout(5000);
            var4.setReadTimeout(5000);
            var4.setUseCaches(false);
            var10 = new BufferedInputStream(var4.getInputStream());
            var3 = new InputStreamReader(var10, Charset.forName("EUC-KR"));
            var5 = new BufferedReader(var3);
            var1 = new StringBuffer();
         } catch (IOException var9) {
            var10000 = var9;
            var10001 = false;
            break label33;
         }

         while(true) {
            String var2;
            try {
               var2 = var5.readLine();
            } catch (IOException var7) {
               var10000 = var7;
               var10001 = false;
               break;
            }

            if (var2 == null) {
               try {
                  var5.close();
                  var3.close();
                  var10.close();
                  var4.disconnect();
                  var12 = var1.toString();
                  return var12;
               } catch (IOException var6) {
                  var10000 = var6;
                  var10001 = false;
                  break;
               }
            }

            try {
               var1.append(var2);
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

   public static void a() {
      if (g) {
         A = false;
      }

   }

   public static void a(Context var0, int var1, int var2) {
      b = var0;
      if (var1 == 240 && var2 == 320) {
         c = 240;
         d = 320;
      } else if (var1 == 240 && var2 == 400) {
         c = 240;
         d = 400;
      } else if (var1 == 320 && var2 == 480) {
         c = 320;
         d = 480;
      } else if ((var1 != 480 || var2 != 800) && (var1 != 800 || var2 != 480)) {
         if ((var1 != 480 || var2 != 854) && (var1 != 854 || var2 != 480)) {
            label240: {
               if (var1 == 540 && var2 == 960 || var1 == 960 && var2 == 540) {
                  c = 480;
                  d = 854;
                  return;
               }

               if (var1 == 600 && var2 == 1024 || var1 == 1024 && var2 == 600) {
                  c = 480;
                  d = 800;
                  return;
               }

               if (var1 == 720 && var2 == 1280 || var1 == 1280 && var2 == 720) {
                  c = 480;
                  d = 854;
                  return;
               }

               if ((var1 != 768 || var2 != 1280) && (var1 != 1280 || var2 != 768)) {
                  if (var1 == 800 && var2 == 1232 || var1 == 1232 && var2 == 800) {
                     c = 480;
                     d = 800;
                     return;
                  }

                  if (var1 == 800 && var2 == 1280 || var1 == 1280 && var2 == 800) {
                     c = 480;
                     d = 800;
                     return;
                  }

                  if ((var1 != 720 || var2 != 1184) && (var1 != 1184 || var2 != 720)) {
                     if ((var1 != 768 || var2 != 1024) && (var1 != 1024 || var2 != 768)) {
                        break label240;
                     }

                     c = 480;
                     d = 800;
                     return;
                  }

                  c = 480;
                  d = 800;
                  return;
               }

               c = 480;
               d = 800;
               return;
            }
         } else {
            c = 480;
            d = 854;
         }
      } else {
         c = 480;
         d = 800;
      }

      c = var1;
      d = var2;
   }

   public static void a(GL10 var0) {
      if (e) {
         fishing4.a.m.a(var0, f, 0.0F, (float)fishing4.a.m.b(), fishing4.a.d.b());
      }

   }

   public static boolean a(float var0, float var1) {
      boolean var2;
      ConnectivityManager var3;
      String var4;
      if (e && (!g || A || l == 0) && var0 >= 0.0F && var0 < 150.0F && var1 >= 0.0F && var1 <= 40.0F) {
         var3 = (ConnectivityManager)fishing4.a.s.a().getSystemService("connectivity");
         if (var3.getActiveNetworkInfo() != null && var3.getActiveNetworkInfo().isConnectedOrConnecting()) {
            x = true;
            var2 = true;
            return var2;
         }

         if (fishing4.game.p.a == 0) {
            var4 = "인터넷 연결 상태를 확인하세요.";
         } else {
            var4 = "Check network connection.";
         }

         Toast.makeText(fishing4.a.s.a(), var4, 0).show();
      }

      if (g && !A) {
         if (!h && !i) {
            if (l == 1 && var0 >= (float)m && var0 < (float)(m + o) && var1 >= (float)n && var1 <= (float)(n + p + 10)) {
               h = false;
               y = true;
               var2 = true;
            } else {
               if (var0 >= (float)(q - 5) && var0 < (float)(q + r + 5) && var1 >= (float)(n + p - 5) && var1 < (float)(n + p + s + 10)) {
                  if (l == 0) {
                     var3 = (ConnectivityManager)fishing4.a.s.a().getSystemService("connectivity");
                     if (var3.getActiveNetworkInfo() != null && var3.getActiveNetworkInfo().isConnectedOrConnecting()) {
                        w = true;
                        var2 = true;
                        return var2;
                     }

                     if (fishing4.game.p.a == 0) {
                        var4 = "인터넷 연결 상태를 확인하세요.";
                     } else {
                        var4 = "Check network connection.";
                     }

                     Toast.makeText(fishing4.a.s.a(), var4, 0).show();
                  } else if (l == 1) {
                     l = 3;
                     i = true;
                     var2 = true;
                     return var2;
                  }
               }

               var2 = false;
            }
         } else {
            var2 = true;
         }
      } else {
         var2 = false;
      }

      return var2;
   }

   public static void b(GL10 var0) {
      if (k == null) {
         k = fishing4.a.w.a(var0, "img/pnj/banner_button.png");
      }

      l = 0;
      t = null;
      u = null;
      o = c;
      p = 0;
      m = 0;
      n = 0;
      r = (int)k.c.b();
      s = (int)k.c.c();
      q = m + o - r;
      g = true;
      i = false;
      A = true;
      h = false;
      if (fishing4.game.p.l) {
         w = true;
      }

      Exception var10000;
      label93: {
         boolean var10001;
         label94: {
            StringBuilder var3;
            try {
               if (fishing4.game.p.a == 0) {
                  var3 = new StringBuilder("http://wap.pnjmobile.co.kr/news/Android/android_link.php?gameid=101442&language=ko&serialNum=");
                  z = var3.append(fishing4.a.r.a).append("&imgSize=480").toString();
                  break label94;
               }
            } catch (Exception var12) {
               var10000 = var12;
               var10001 = false;
               break label93;
            }

            try {
               var3 = new StringBuilder("http://wap.pnjmobile.co.kr/news/Android/android_link.php?gameid=101442&language=en&serialNum=");
               z = var3.append(fishing4.a.r.a).append("&imgSize=480").toString();
            } catch (Exception var11) {
               var10000 = var11;
               var10001 = false;
               break label93;
            }
         }

         String var4;
         URL var13;
         try {
            var13 = new URL(z);
            var4 = a(var13);
         } catch (Exception var10) {
            var10000 = var10;
            var10001 = false;
            break label93;
         }

         if (var4 == null) {
            try {
               j = null;
               return;
            } catch (Exception var5) {
               var10000 = var5;
               var10001 = false;
            }
         } else {
            label95: {
               int var1;
               try {
                  var1 = var4.indexOf(35);
                  String var14 = var4.substring(0, var1);
                  if (var14.equals(t)) {
                     return;
                  }

                  t = var14;
                  u = var4.substring(var1 + 1);
                  if (j != null) {
                     j = null;
                     w var15 = new w();
                     j = var15;
                  }
               } catch (Exception var9) {
                  var10000 = var9;
                  var10001 = false;
                  break label95;
               }

               int var2;
               Bitmap.Config var19;
               label96: {
                  try {
                     var13 = new URL(t);
                     URLConnection var16 = var13.openConnection();
                     var16.setConnectTimeout(5000);
                     var16.setReadTimeout(5000);
                     var16.setUseCaches(false);
                     var16.connect();
                     BufferedInputStream var18 = new BufferedInputStream(var16.getInputStream());
                     v = BitmapFactory.decodeStream(var18);
                     var18.close();
                     var1 = v.getWidth();
                     var2 = v.getHeight();
                     if (v.hasAlpha()) {
                        var19 = Config.ARGB_8888;
                        break label96;
                     }
                  } catch (Exception var8) {
                     var10000 = var8;
                     var10001 = false;
                     break label95;
                  }

                  try {
                     var19 = Config.RGB_565;
                  } catch (Exception var7) {
                     var10000 = var7;
                     var10001 = false;
                     break label95;
                  }
               }

               try {
                  Bitmap var17 = Bitmap.createBitmap(var1, var2, var19);
                  Canvas var21 = new Canvas(var17);
                  var21.drawBitmap(v, 0.0F, 0.0F, (Paint)null);
                  v.recycle();
                  v = var17;
                  j = fishing4.a.w.a(var0);
                  return;
               } catch (Exception var6) {
                  var10000 = var6;
                  var10001 = false;
               }
            }
         }
      }

      Exception var20 = var10000;
      var20.printStackTrace();
      if (v == null) {
         j = fishing4.a.w.a(var0, "img/pnj/banner.png");
      } else {
         if (j != null) {
            j = null;
            j = new w();
         } else {
            j = new w();
         }

         j = fishing4.a.w.a(var0);
      }

   }

   public static void c(GL10 var0) {
      if (w) {
         w = false;

         try {
            if (k == null) {
               k = fishing4.a.w.a(var0, "img/pnj/banner_button.png");
            }

            l = 0;
            o = (int)j.c.b();
            p = (int)j.c.c();
            m = c - o;
            n = -p;
            r = (int)k.c.a;
            s = (int)k.c.b;
            q = m + o - r;
            g = true;
            i = false;
            A = true;
            h = false;
         } catch (Exception var3) {
            var3.printStackTrace();
         }

         if (j != null) {
            l = 2;
            i = true;
            A = false;
         }
      }

      if (g && !A) {
         if (l != 0) {
            fishing4.a.m.a(var0, j, (float)m, (float)(fishing4.a.m.b() - n), fishing4.a.d.b());
         }

         fishing4.a.m.a(var0, k, (float)q, (float)(fishing4.a.m.b() - (n + p)), fishing4.a.d.b());
         int var1;
         if (l == 2) {
            var1 = n + 10;
            n = var1;
            if (var1 > 0) {
               n = 0;
               l = 1;
               i = false;
            }
         } else if (l == 3) {
            var1 = n - 10;
            n = var1;
            if (var1 < -p) {
               n = -p;
               l = 0;
               i = false;
            }
         }
      }

   }
}

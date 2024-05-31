package fishing4.a;

import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;

public final class q {
   public static byte[] a = null;
   public static Socket b = null;
   public static DataOutputStream c = null;
   public static DataInputStream d = null;
   public static byte e;
   public static String f = "0004875A";
   public static String g = "222.122.160.61";
   public static int h = 12002;
   private static boolean i;
   private static boolean j;

   public static byte a() {
      byte var0 = 0;
      j = true;
      if (i) {
         j = false;
      } else {
         Log.i("Connect:", "Connecting");

         try {
            Socket var1 = new Socket("222.122.160.61", 12002);
            b = var1;
            fishing4.game.p.c = true;
            b.setSoTimeout(20000);
            DataOutputStream var3 = new DataOutputStream(b.getOutputStream());
            c = var3;
            DataInputStream var4 = new DataInputStream(b.getInputStream());
            d = var4;
            i = true;
            j = false;
         } catch (Exception var2) {
            Log.i("Connect:", "ConnectFail");
            j = false;
            return var0;
         }

         var0 = 1;
      }

      return var0;
   }

   public static boolean a(byte[] var0) {
      boolean var1 = false;
      j = true;
      if (!i) {
         j = false;
      } else {
         try {
            c.write(var0);
         } catch (Exception var2) {
            var2.printStackTrace();
            return var1;
         }

         var1 = true;
      }

      return var1;
   }

   private static byte[] a(int var0) {
      byte[] var1 = null;
      if (i) {
         try {
            var1 = new byte[var0];
            d.readFully(var1, 0, var0);
         } catch (EOFException var2) {
            var1 = null;
         } catch (Exception var3) {
            throw new IOException(var3.getMessage());
         }
      }

      return var1;
   }

   public static boolean b() {
      boolean var1 = false;

      label37: {
         Exception var10000;
         label30: {
            int var0;
            boolean var10001;
            try {
               var0 = d();
            } catch (Exception var4) {
               var10000 = var4;
               var10001 = false;
               break label30;
            }

            if (var0 <= 0) {
               return var1;
            }

            try {
               a = a(var0);
               break label37;
            } catch (Exception var3) {
               var10000 = var3;
               var10001 = false;
            }
         }

         Exception var2 = var10000;
         var2.printStackTrace();
         return var1;
      }

      var1 = true;
      return var1;
   }

   public static void c() {
      boolean var10001;
      label49: {
         DataInputStream var0;
         try {
            if (b == null) {
               break label49;
            }

            b.close();
            b = null;
            var0 = d;
         } catch (Exception var6) {
            var10001 = false;
            return;
         }

         if (var0 != null) {
            try {
               d.close();
               d = null;
            } catch (Exception var2) {
            }
         }

         DataOutputStream var7;
         try {
            var7 = c;
         } catch (Exception var5) {
            var10001 = false;
            return;
         }

         if (var7 != null) {
            try {
               c.close();
               c = null;
            } catch (Exception var1) {
            }
         }

         try {
            i = false;
         } catch (Exception var4) {
            var10001 = false;
            return;
         }
      }

      try {
         System.gc();
         Runtime.getRuntime().gc();
      } catch (Exception var3) {
         var10001 = false;
      }

   }

   private static int d() {
      int var0 = -1;

      int var1;
      label37: {
         Exception var10000;
         label30: {
            boolean var10001;
            byte[] var2;
            try {
               var2 = a(4);
            } catch (Exception var4) {
               var10000 = var4;
               var10001 = false;
               break label30;
            }

            if (var2 == null) {
               return var0;
            }

            try {
               var1 = fishing4.a.a.a(var2, 0);
               break label37;
            } catch (Exception var3) {
               var10000 = var3;
               var10001 = false;
            }
         }

         Exception var5 = var10000;
         var5.printStackTrace();
         return var0;
      }

      var0 = var1;
      return var0;
   }
}

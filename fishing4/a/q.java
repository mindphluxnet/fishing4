package fishing4.a;

import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;

import fishing4.game.globalConfig;

public final class q {
   public static byte[] a = null;
   public static Socket socket = null;
   public static DataOutputStream dataOutputStream = null;
   public static DataInputStream dataInputStream = null;
   public static byte e;
   public static String f = "0004875A";
   private static boolean i;
   private static boolean j;

   public static byte connect() {
      byte result = 0;
      j = true;
      if (i) {
         j = false;
      } else {
         Log.i("Connect:", "Connecting");

         try {
            Socket socket = new Socket("222.122.160.61", 12002);
            q.socket = socket;
            globalConfig.isConnected = true;
            q.socket.setSoTimeout(20000);
            dataOutputStream = new DataOutputStream(q.socket.getOutputStream());
            dataInputStream = new DataInputStream(q.socket.getInputStream());
            i = true;
            j = false;
         } catch (Exception ex) {
            Log.i("Connect:", "ConnectFail");
            j = false;
            return result;
         }

         result = 1;
      }

      return result;
   }

   public static boolean a(byte[] var0) {
      boolean var1 = false;
      j = true;
      if (!i) {
         j = false;
      } else {
         try {
            dataOutputStream.write(var0);
         } catch (Exception ex) {
            ex.printStackTrace();
            return var1;
         }

         var1 = true;
      }

      return var1;
   }

   private static byte[] readBytes(int numBytes) throws IOException {
      byte[] buffer = null;
      if (i) {
         try {
            buffer = new byte[numBytes];
            dataInputStream.readFully(buffer, 0, numBytes);
         } catch (EOFException ex) {
            buffer = null;
         } catch (Exception ex) {
            throw new IOException(ex.getMessage());
         }
      }

      return buffer;
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
               a = readBytes(var0);
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

   public static void disconnect() {
      boolean var10001;
      label49: {
         DataInputStream inputStream;
         try {
            if (socket == null) {
               break label49;
            }

            socket.close();
            socket = null;
            inputStream = dataInputStream;
         } catch (Exception ex) {
            var10001 = false;
            return;
         }

         if (inputStream != null) {
            try {
               dataInputStream.close();
               dataInputStream = null;
            } catch (Exception ex) {
            }
         }

         DataOutputStream outputStream;
         try {
            outputStream = dataOutputStream;
         } catch (Exception ex) {
            var10001 = false;
            return;
         }

         if (outputStream != null) {
            try {
               dataOutputStream.close();
               dataOutputStream = null;
            } catch (Exception ex) {
            }
         }

         try {
            i = false;
         } catch (Exception ex) {
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
            byte[] buffer;
            try {
               buffer = readBytes(4);
            } catch (Exception ex) {
               var10000 = ex;
               var10001 = false;
               break label30;
            }

            if (buffer == null) {
               return var0;
            }

            try {
               var1 = fishing4.a.a.a(buffer, 0);
               break label37;
            } catch (Exception ex) {
               var10000 = ex;
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

package fishing4.a;

import android.util.Log;
import com.tapjoy.af;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;

public final class ab implements af, Runnable {
   private static int H;
   private static byte[] I;
   static boolean a;
   public static byte[] c = null;
   static Socket m = null;
   static DataOutputStream n = null;
   static DataInputStream o = null;
   int A = 101;
   int B = 1000;
   public boolean C = false;
   public boolean D = false;
   boolean E = false;
   int F;
   int G;
   boolean b;
   long d;
   int e;
   String f = "";
   String g = "";
   final byte h = 0;
   final byte i = 1;
   byte j;
   boolean k;
   byte l;
   int p = 0;
   int q = 1;
   int r = 2;
   int s = 3;
   int t = 4;
   int u = 5;
   int v = 6;
   int w = 7;
   int x = 8;
   int y = 99;
   int z = 100;

   public ab() {
      this.F = this.q;
      this.G = 0;
   }

   public ab(int var1) {
      this.F = this.q;
      this.G = var1;
   }

   private void a(boolean var1) {
      if (this.F != this.z || this.D) {
         boolean var10001;
         label97: {
            Exception var10000;
            label72: {
               if (var1) {
                  try {
                     this.F = this.z;
                  } catch (Exception var11) {
                     var10000 = var11;
                     var10001 = false;
                     break label72;
                  }
               } else {
                  try {
                     this.F = this.x;
                     this.k = true;
                  } catch (Exception var10) {
                     var10000 = var10;
                     var10001 = false;
                     break label72;
                  }
               }

               try {
                  this.D = false;
                  break label97;
               } catch (Exception var9) {
                  var10000 = var9;
                  var10001 = false;
               }
            }

            Exception var2 = var10000;
            this.g = "disconnect() : " + var2;
            return;
         }

         label81: {
            DataInputStream var12;
            try {
               if (m == null) {
                  break label81;
               }

               m.close();
               m = null;
               var12 = o;
            } catch (Exception var8) {
               var10001 = false;
               return;
            }

            if (var12 != null) {
               try {
                  o.close();
                  o = null;
               } catch (Exception var4) {
               }
            }

            DataOutputStream var13;
            try {
               var13 = n;
            } catch (Exception var7) {
               var10001 = false;
               return;
            }

            if (var13 != null) {
               try {
                  n.close();
                  n = null;
               } catch (Exception var3) {
               }
            }

            try {
               a = false;
            } catch (Exception var6) {
               var10001 = false;
               return;
            }
         }

         try {
            System.gc();
            Runtime.getRuntime().gc();
         } catch (Exception var5) {
            var10001 = false;
         }
      }

   }

   private boolean a(byte[] var1) {
      boolean var2 = false;
      this.b = true;
      if (!a) {
         this.b = false;
      } else {
         try {
            n.write(var1);
         } catch (Exception var3) {
            var3.printStackTrace();
            return var2;
         }

         var2 = true;
      }

      return var2;
   }

   private byte b() {
      byte var1 = 0;
      this.b = true;
      if (a) {
         this.b = false;
      } else {
         Log.i("Connect:", "Connecting");

         try {
            Socket var2 = new Socket("222.122.160.61", 12002);
            m = var2;
            fishing4.game.p.c = true;
            m.setSoTimeout(20000);
            DataOutputStream var4 = new DataOutputStream(m.getOutputStream());
            n = var4;
            DataInputStream var5 = new DataInputStream(m.getInputStream());
            o = var5;
            a = true;
            this.b = false;
         } catch (Exception var3) {
            Log.i("Connect:", "ConnectFail");
            this.b = false;
            return var1;
         }

         var1 = 1;
      }

      return var1;
   }

   private int c() {
      int var1 = -1;

      int var2;
      label68: {
         Exception var10000;
         label58: {
            boolean var10001;
            try {
               if (!e()) {
                  this.a(true);
                  return var1;
               }
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
               break label58;
            }

            label60: {
               byte[] var3;
               try {
                  var2 = c.length;
                  I = new byte[var2];
                  System.arraycopy(c, 0, I, 0, var2);
                  H = I[0];
                  var2 = H;
                  if (c == null) {
                     break label60;
                  }

                  var3 = c;
               } catch (Exception var7) {
                  var10000 = var7;
                  var10001 = false;
                  break label58;
               }

               try {
                  this.l = var3[1];
                  if (this.l == 1) {
                     fishing4.game.ad.p.b((long)fishing4.a.y.a(var3, 2));
                     fishing4.game.u.d();
                     com.tapjoy.f.a();
                     com.tapjoy.f.a(this.G, this);
                  }
               } catch (Exception var6) {
                  var10001 = false;
                  break label60;
               }

               try {
                  this.a(false);
               } catch (Exception var5) {
                  var10001 = false;
               }
            }

            try {
               c = null;
               var2 = H;
               break label68;
            } catch (Exception var4) {
               var10000 = var4;
               var10001 = false;
            }
         }

         Exception var9 = var10000;
         var9.printStackTrace();
         this.a(true);
         this.g = "read() : " + var9;
         return var1;
      }

      var1 = var2;
      return var1;
   }

   private static byte[] c(int var0) {
      byte[] var1 = null;
      if (a) {
         try {
            var1 = new byte[var0];
            o.readFully(var1, 0, var0);
         } catch (EOFException var2) {
            var1 = null;
         } catch (Exception var3) {
            throw new IOException(var3.getMessage());
         }
      }

      return var1;
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
               var2 = c(4);
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

   private static byte[] d(int var0) {
      return new byte[]{(byte)(var0 & 255), (byte)(var0 >> 8 & 255), (byte)(var0 >> 16 & 255), (byte)(var0 >> 24 & 255)};
   }

   private static boolean e() {
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
               c = c(var0);
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

   public final void a() {
      com.tapjoy.f.a();
      com.tapjoy.f.a(this.G, this);
   }

   public final void a(int var1) {
      if (var1 > 0) {
         com.tapjoy.f.a();
         com.tapjoy.f.a(var1, this);
      }

      this.C = false;
   }

   public final void b(int var1) {
      this.G = var1;
      this.C = true;
   }

   public final void run() {
      // $FF: Couldn't be decompiled
   }
}

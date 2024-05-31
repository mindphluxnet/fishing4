package fishing4.a;

import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;

public final class ac implements Runnable {
   private static int G;
   private static byte[] H;
   static boolean a;
   public static byte[] c = null;
   static Socket m = null;
   static DataOutputStream n = null;
   static DataInputStream o = null;
   int A = 101;
   int B = 1000;
   boolean C = false;
   boolean D = false;
   int E;
   int F;
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

   public ac() {
      this.E = this.q;
      this.F = 0;
   }

   private byte a() {
      byte var1 = 0;
      this.b = true;
      if (a) {
         this.b = false;
      } else {
         Log.i("Connect:", "Connecting");

         try {
            Socket var2 = new Socket("222.122.160.61", 12002);
            m = var2;
            var2.setSoTimeout(20000);
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

   private void a(boolean var1) {
      if (this.E != this.z || this.C) {
         boolean var10001;
         label97: {
            Exception var10000;
            label72: {
               if (var1) {
                  try {
                     this.E = this.z;
                  } catch (Exception var11) {
                     var10000 = var11;
                     var10001 = false;
                     break label72;
                  }
               } else {
                  try {
                     this.E = this.x;
                     this.k = true;
                  } catch (Exception var10) {
                     var10000 = var10;
                     var10001 = false;
                     break label72;
                  }
               }

               try {
                  this.C = false;
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

   private static byte[] a(int var0) {
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

   private int b() {
      int var1 = -1;

      int var2;
      label52: {
         Exception var10000;
         label44: {
            boolean var10001;
            try {
               if (!d()) {
                  this.a(true);
                  return var1;
               }
            } catch (Exception var7) {
               var10000 = var7;
               var10001 = false;
               break label44;
            }

            label34: {
               byte[] var3;
               try {
                  var2 = c.length;
                  H = new byte[var2];
                  System.arraycopy(c, 0, H, 0, var2);
                  G = H[0];
                  var2 = G;
                  if (c == null) {
                     break label34;
                  }

                  var3 = c;
               } catch (Exception var6) {
                  var10000 = var6;
                  var10001 = false;
                  break label44;
               }

               try {
                  this.l = var3[1];
                  this.a(false);
               } catch (Exception var4) {
               }
            }

            try {
               c = null;
               var2 = G;
               break label52;
            } catch (Exception var5) {
               var10000 = var5;
               var10001 = false;
            }
         }

         Exception var8 = var10000;
         var8.printStackTrace();
         this.a(true);
         this.g = "read() : " + var8;
         return var1;
      }

      var1 = var2;
      return var1;
   }

   private static byte[] b(int var0) {
      return new byte[]{(byte)(var0 & 255), (byte)(var0 >> 8 & 255), (byte)(var0 >> 16 & 255), (byte)(var0 >> 24 & 255)};
   }

   private static int c() {
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

   private static boolean d() {
      boolean var1 = false;

      label37: {
         Exception var10000;
         label30: {
            int var0;
            boolean var10001;
            try {
               var0 = c();
            } catch (Exception var4) {
               var10000 = var4;
               var10001 = false;
               break label30;
            }

            if (var0 <= 0) {
               return var1;
            }

            try {
               c = a(var0);
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

   public final void run() {
      Exception var14;
      Exception var10000;
      label80: {
         int var1;
         int var2;
         boolean var10001;
         try {
            var2 = this.E;
            var1 = this.q;
         } catch (Exception var13) {
            var10000 = var13;
            var10001 = false;
            break label80;
         }

         if (var2 == var1) {
            label81: {
               label70: {
                  byte[] var3;
                  try {
                     if (this.a() != 1) {
                        break label81;
                     }

                     this.E = this.r;
                     this.C = true;
                     H = new byte[70];
                     System.arraycopy("PNJNETCON".getBytes(), 0, H, 0, 9);
                     fishing4.game.k.l();
                     System.arraycopy("ADM".getBytes(), 0, H, 9, 3);
                     System.arraycopy(fishing4.a.r.p, 0, H, 12, fishing4.a.r.p.length);
                     System.arraycopy(fishing4.a.r.q, 0, H, 32, fishing4.a.r.q.length);
                     System.arraycopy(b(100), 0, H, 52, 4);
                     System.arraycopy(b(fishing4.a.r.f), 0, H, 56, 4);
                     System.arraycopy(b(6), 0, H, 60, 4);
                     H[64] = fishing4.a.r.k;
                     H[65] = 105;
                     var3 = H;
                     System.arraycopy(b(Integer.parseInt("101442")), 0, H, 66, 4);
                     this.d = fishing4.a.y.a();
                     this.j = 0;
                  } catch (Exception var12) {
                     var10000 = var12;
                     var10001 = false;
                     break label70;
                  }

                  try {
                     this.a(var3);
                     this.E = this.w;
                     break label81;
                  } catch (Exception var11) {
                     var14 = var11;

                     try {
                        var14.printStackTrace();
                        break label81;
                     } catch (Exception var10) {
                        var10000 = var10;
                        var10001 = false;
                     }
                  }
               }

               var14 = var10000;

               try {
                  StringBuilder var4 = new StringBuilder("con() : ");
                  this.g = var4.append(var14).toString();
               } catch (Exception var9) {
                  var10000 = var9;
                  var10001 = false;
                  break label80;
               }
            }

            try {
               this.e = 0;
               this.d = System.currentTimeMillis();
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
               break label80;
            }
         }

         while(true) {
            try {
               if (!this.C) {
                  this.a(true);
                  return;
               }
            } catch (Exception var6) {
               var10000 = var6;
               var10001 = false;
               break;
            }

            try {
               Thread.yield();
               if (this.E == this.w) {
                  this.b();
               }
            } catch (Exception var7) {
               var10000 = var7;
               var10001 = false;
               break;
            }

            try {
               Thread.sleep(100L);
            } catch (Exception var5) {
               var10000 = var5;
               var10001 = false;
               break;
            }
         }
      }

      var14 = var10000;
      this.g = "run() : " + var14;
   }
}

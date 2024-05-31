package pnjmobile.fishing4.google_free;

import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;

import fishing4.game.globalConfig;

public final class j implements Runnable {
   private static int E;
   private static byte[] F;
   static boolean a;
   public static byte[] c = null;
   static Socket k = null;
   static DataOutputStream l = null;
   static DataInputStream m = null;
   public boolean A = false;
   public boolean B = false;
   boolean C = false;
   int D;
   boolean b;
   long d;
   int e;
   String f = "";
   String g = "";
   final byte h = 0;
   final byte i = 1;
   byte j;
   int n = 0;
   int o = 1;
   int p = 2;
   int q = 3;
   int r = 4;
   int s = 5;
   int t = 6;
   int u = 7;
   int v = 8;
   int w = 99;
   int x = 100;
   int y = 101;
   int z = 1000;

   public j() {
      this.D = this.o;
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
            k = var2;
            globalConfig.c = true;
            k.setSoTimeout(20000);
            DataOutputStream var4 = new DataOutputStream(k.getOutputStream());
            l = var4;
            DataInputStream var5 = new DataInputStream(k.getInputStream());
            m = var5;
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

   private boolean a(byte[] var1) {
      boolean var2 = false;
      this.b = true;
      if (!a) {
         this.b = false;
      } else {
         try {
            l.write(var1);
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
            Log.i("", "sms20:데이터받기0.");
            var1 = new byte[var0];
            Log.i("", "sms20:데이터받기1.");
            m.readFully(var1, 0, var0);
            Log.i("", "sms20:데이터받기2.");
         } catch (EOFException var2) {
            Log.i("", "sms20:eofe :" + var2.toString());
            var1 = null;
         } catch (Exception var3) {
            Log.i("", "sms20:e  :" + var3.toString());
            throw new IOException(var3.getMessage());
         }

         Log.i("", "sms20:데이터값 리턴..");
      }

      return var1;
   }

   private int b() {
      int var1 = -1;
      boolean var3 = false;

      int var2;
      label76: {
         Exception var10000;
         label65: {
            boolean var10001;
            try {
               if (!d()) {
                  Log.i("", "sms20:종료?");
                  this.e();
                  return var1;
               }
            } catch (Exception var13) {
               var10000 = var13;
               var10001 = false;
               break label65;
            }

            label68: {
               byte[] var15;
               try {
                  Log.i("", "sms20:응답대기. ");
                  var2 = c.length;
                  F = new byte[var2];
                  System.arraycopy(c, 0, F, 0, var2);
                  byte var14 = F[0];
                  E = var14;
                  StringBuilder var4 = new StringBuilder("sms20:서버에서 응답이 있을까??type:");
                  Log.i("", var4.append(var14).toString());
                  if (c == null) {
                     break label68;
                  }

                  var15 = c;
               } catch (Exception var12) {
                  var10000 = var12;
                  var10001 = false;
                  break label65;
               }

               label67: {
                  try {
                     fishing4.a.r.J = fishing4.a.y.a(var15, 1);
                     if (fishing4.a.r.I) {
                        break label67;
                     }
                  } catch (Exception var11) {
                     var10001 = false;
                     break label68;
                  }

                  if (var15[5] != 1) {
                     var3 = true;
                  }

                  try {
                     fishing4.a.r.I = var3;
                  } catch (Exception var10) {
                     var10001 = false;
                     break label68;
                  }
               }

               try {
                  byte[] var6 = new byte[2000];
                  System.arraycopy(var15, 6, var6, 0, 2000);
                  String[] var7 = fishing4.a.r.D;
                  String var5 = new String(var6, "KSC5601");
                  var7[1] = var5.trim();
                  byte[] var18 = new byte[100];
                  System.arraycopy(var15, 2006, var18, 0, 100);
                  String var16 = new String(var18, "KSC5601");
                  fishing4.a.r.G = var16.trim();
               } catch (Exception var9) {
                  var10001 = false;
               }
            }

            try {
               c = null;
               var2 = E;
               break label76;
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
            }
         }

         Exception var17 = var10000;
         var17.printStackTrace();
         this.e();
         this.g = "read() : " + var17;
         return var1;
      }

      var1 = var2;
      return var1;
   }

   private static byte[] b(int var0) {
      return new byte[]{(byte)(var0 & 255), (byte)(var0 >> 8 & 255), (byte)(var0 >> 16 & 255), (byte)(var0 >> 24 & 255)};
   }

   private static int c() {
      byte var2 = 0;
      byte var1 = -1;

      int var0;
      Exception var8;
      label38: {
         Exception var10000;
         label37: {
            boolean var10001;
            byte[] var3;
            try {
               Log.i("", "sms20:종료? 데이터를 받아와보자");
               var3 = a(4);
            } catch (Exception var7) {
               var10000 = var7;
               var10001 = false;
               break label37;
            }

            if (var3 == null) {
               label50: {
                  try {
                     Log.i("", "sms20:retBuf=null");
                  } catch (Exception var4) {
                     var10000 = var4;
                     var10001 = false;
                     break label50;
                  }

                  var0 = var1;
                  return var0;
               }
            } else {
               label33: {
                  try {
                     var0 = fishing4.a.a.a(var3, 0);
                  } catch (Exception var6) {
                     var10000 = var6;
                     var10001 = false;
                     break label33;
                  }

                  try {
                     StringBuilder var9 = new StringBuilder("sms20:len :");
                     Log.i("", var9.append(var0).toString());
                     return var0;
                  } catch (Exception var5) {
                     var8 = var5;
                     break label38;
                  }
               }
            }
         }

         var8 = var10000;
         var0 = var2;
      }

      Log.i("", "sms20:예외발생. " + var0);
      var8.printStackTrace();
      var0 = var1;
      return var0;
   }

   private static boolean d() {
      boolean var1 = false;

      Exception var10000;
      label28: {
         int var0;
         boolean var10001;
         try {
            var0 = c();
            StringBuilder var2 = new StringBuilder("sms20:종료? size=");
            Log.i("", var2.append(var0).toString());
         } catch (Exception var5) {
            var10000 = var5;
            var10001 = false;
            break label28;
         }

         if (var0 <= 0) {
            try {
               Log.i("", "sms20:종료? return false");
               return var1;
            } catch (Exception var3) {
               var10000 = var3;
               var10001 = false;
            }
         } else {
            label40: {
               try {
                  c = a(var0);
               } catch (Exception var4) {
                  var10000 = var4;
                  var10001 = false;
                  break label40;
               }

               Log.i("", "sms20: exception return true");
               var1 = true;
               return var1;
            }
         }
      }

      Exception var6 = var10000;
      Log.i("", "sms20: exception return false");
      var6.printStackTrace();
      return var1;
   }

   private void e() {
      if (this.D != this.x || this.B) {
         try {
            this.D = this.x;
            this.B = false;
         } catch (Exception var8) {
            this.g = "disconnect() : " + var8;
            return;
         }

         boolean var10001;
         label63: {
            DataInputStream var1;
            try {
               if (k == null) {
                  break label63;
               }

               k.close();
               k = null;
               var1 = m;
            } catch (Exception var7) {
               var10001 = false;
               return;
            }

            if (var1 != null) {
               try {
                  m.close();
                  m = null;
               } catch (Exception var3) {
               }
            }

            DataOutputStream var9;
            try {
               var9 = l;
            } catch (Exception var6) {
               var10001 = false;
               return;
            }

            if (var9 != null) {
               try {
                  l.close();
                  l = null;
               } catch (Exception var2) {
               }
            }

            try {
               a = false;
            } catch (Exception var5) {
               var10001 = false;
               return;
            }
         }

         try {
            System.gc();
            Runtime.getRuntime().gc();
         } catch (Exception var4) {
            var10001 = false;
         }
      }

   }

   public final void run() {
      byte var2 = 0;

      Exception var10000;
      Exception var22;
      label141: {
         int var1;
         int var3;
         boolean var10001;
         try {
            var1 = this.D;
            var3 = this.o;
         } catch (Exception var20) {
            var10000 = var20;
            var10001 = false;
            break label141;
         }

         if (var1 == var3) {
            label142: {
               StringBuilder var4;
               label143: {
                  label128: {
                     try {
                        if (fishing4.a.r.a == null) {
                           this.D = this.w;
                           break label128;
                        }
                     } catch (Exception var19) {
                        var10000 = var19;
                        var10001 = false;
                        break label143;
                     }

                     try {
                        fishing4.a.r.p = fishing4.a.r.a.getBytes();
                        fishing4.a.r.q = fishing4.a.r.deviceId.getBytes();
                     } catch (Exception var18) {
                        var10000 = var18;
                        var10001 = false;
                        break label143;
                     }
                  }

                  var1 = 0;

                  while(true) {
                     try {
                        if (var1 >= fishing4.a.r.p.length) {
                           break;
                        }
                     } catch (Exception var17) {
                        var10000 = var17;
                        var10001 = false;
                        break label143;
                     }

                     try {
                        fishing4.a.r.p[var1] = (byte)(fishing4.a.r.p[var1] ^ 1559);
                     } catch (Exception var16) {
                        var10000 = var16;
                        var10001 = false;
                        break label143;
                     }

                     ++var1;
                  }

                  var1 = var2;

                  byte[] var21;
                  while(true) {
                     try {
                        if (var1 >= fishing4.a.r.q.length) {
                           if (this.a() != 1) {
                              break label142;
                           }

                           this.D = this.p;
                           this.B = true;
                           fishing4.a.r.f = Integer.parseInt("101442");
                           F = new byte[68];
                           System.arraycopy("PNJNETCON".getBytes(), 0, F, 0, 9);
                           System.arraycopy("ADM".getBytes(), 0, F, 9, 3);
                           var4 = new StringBuilder("sms20:");
                           Log.i("", var4.append(fishing4.a.r.p).toString());
                           System.arraycopy(fishing4.a.r.p, 0, F, 12, fishing4.a.r.p.length);
                           var4 = new StringBuilder("sms20:");
                           Log.i("", var4.append(fishing4.a.r.q).toString());
                           System.arraycopy(fishing4.a.r.q, 0, F, 32, fishing4.a.r.q.length);
                           System.arraycopy(b(100), 0, F, 52, 4);
                           System.arraycopy(b(fishing4.a.r.f), 0, F, 56, 4);
                           System.arraycopy(b(4), 0, F, 60, 4);
                           F[64] = fishing4.a.r.k;
                           F[65] = 102;
                           Log.i("", "sms20:서버에서 패킷을 만들어음. 던짐.2");
                           var21 = F;
                           break;
                        }
                     } catch (Exception var15) {
                        var10000 = var15;
                        var10001 = false;
                        break label143;
                     }

                     try {
                        fishing4.a.r.q[var1] = (byte)(fishing4.a.r.q[var1] ^ 1559);
                     } catch (Exception var14) {
                        var10000 = var14;
                        var10001 = false;
                        break label143;
                     }

                     ++var1;
                  }

                  var21[66] = 1;

                  try {
                     Log.i("", "sms20:서버에서 패킷을 만들어던짐.");
                     fishing4.a.r.F = 1;
                     var21[67] = fishing4.a.r.F;
                     this.d = fishing4.a.y.a();
                     this.j = 0;
                  } catch (Exception var13) {
                     var10000 = var13;
                     var10001 = false;
                     break label143;
                  }

                  try {
                     this.a(var21);
                     this.D = this.u;
                     break label142;
                  } catch (Exception var12) {
                     var22 = var12;

                     try {
                        var22.printStackTrace();
                        break label142;
                     } catch (Exception var11) {
                        var10000 = var11;
                        var10001 = false;
                     }
                  }
               }

               Exception var5 = var10000;

               try {
                  var4 = new StringBuilder("con() : ");
                  this.g = var4.append(var5).toString();
               } catch (Exception var10) {
                  var10000 = var10;
                  var10001 = false;
                  break label141;
               }
            }

            try {
               this.e = 0;
               this.d = System.currentTimeMillis();
            } catch (Exception var9) {
               var10000 = var9;
               var10001 = false;
               break label141;
            }
         }

         while(true) {
            try {
               if (!this.B) {
                  this.e();
                  return;
               }
            } catch (Exception var7) {
               var10000 = var7;
               var10001 = false;
               break;
            }

            try {
               Thread.yield();
               if (this.D == this.u) {
                  this.b();
               }
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
               break;
            }

            try {
               Thread.sleep(100L);
            } catch (Exception var6) {
               var10000 = var6;
               var10001 = false;
               break;
            }
         }
      }

      var22 = var10000;
      this.g = "run() : " + var22;
   }
}

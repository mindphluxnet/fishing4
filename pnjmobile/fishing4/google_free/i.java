package pnjmobile.fishing4.google_free;

import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;

public final class i implements Runnable {
   private static int F;
   private static byte[] G;
   static boolean a;
   public static byte[] c = null;
   static Socket l = null;
   static DataOutputStream m = null;
   static DataInputStream n = null;
   int A = 1000;
   public boolean B = false;
   public boolean C = false;
   boolean D = false;
   int E;
   boolean b;
   long d;
   int e;
   String f = "";
   String g = "";
   final byte h = 0;
   final byte i = 1;
   byte j;
   boolean k;
   int o = 0;
   int p = 1;
   int q = 2;
   int r = 3;
   int s = 4;
   int t = 5;
   int u = 6;
   int v = 7;
   int w = 8;
   int x = 99;
   int y = 100;
   int z = 101;

   public i() {
      this.E = this.p;
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
            l = var2;
            fishing4.game.p.c = true;
            l.setSoTimeout(20000);
            DataOutputStream var4 = new DataOutputStream(l.getOutputStream());
            m = var4;
            DataInputStream var5 = new DataInputStream(l.getInputStream());
            n = var5;
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
      if (this.E != this.y || this.C) {
         boolean var10001;
         label97: {
            Exception var10000;
            label72: {
               if (var1) {
                  try {
                     this.E = this.y;
                  } catch (Exception var11) {
                     var10000 = var11;
                     var10001 = false;
                     break label72;
                  }
               } else {
                  try {
                     this.E = this.w;
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
               if (l == null) {
                  break label81;
               }

               l.close();
               l = null;
               var12 = n;
            } catch (Exception var8) {
               var10001 = false;
               return;
            }

            if (var12 != null) {
               try {
                  n.close();
                  n = null;
               } catch (Exception var4) {
               }
            }

            DataOutputStream var13;
            try {
               var13 = m;
            } catch (Exception var7) {
               var10001 = false;
               return;
            }

            if (var13 != null) {
               try {
                  m.close();
                  m = null;
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
            m.write(var1);
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
            n.readFully(var1, 0, var0);
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
      label72: {
         Exception var10000;
         label60: {
            boolean var10001;
            try {
               if (!d()) {
                  Log.i("", "sms20:종료?");
                  this.a(true);
                  return var1;
               }
            } catch (Exception var12) {
               var10000 = var12;
               var10001 = false;
               break label60;
            }

            label64: {
               byte[] var13;
               try {
                  Log.i("", "sms20:응답대기. ");
                  var2 = c.length;
                  G = new byte[var2];
                  System.arraycopy(c, 0, G, 0, var2);
                  F = G[0];
                  var2 = F;
                  StringBuilder var4 = new StringBuilder("sms20:서버에서 응답이 있을까??type:");
                  Log.i("", var4.append(var2).toString());
                  if (c == null) {
                     break label64;
                  }

                  var13 = c;
               } catch (Exception var11) {
                  var10000 = var11;
                  var10001 = false;
                  break label60;
               }

               StringBuilder var5;
               try {
                  var5 = new StringBuilder("sms20:서버에서 응답이 있을까??type:");
                  Log.i("", var5.append(var2).toString());
                  fishing4.a.r.J = fishing4.a.y.a(var13, 1);
                  var5 = new StringBuilder("sms20:서버에서 응답이 있을까??NetworkManager.myPresentCount:");
                  Log.i("", var5.append(fishing4.a.r.J).toString());
               } catch (Exception var10) {
                  var10001 = false;
                  break label64;
               }

               if (var13[5] != 1) {
                  var3 = true;
               }

               try {
                  fishing4.a.r.I = var3;
                  var5 = new StringBuilder("sms20:서버에서 응답이 있을까??NetworkManager.needVersionUp:");
                  Log.i("", var5.append(fishing4.a.r.I).toString());
                  byte[] var16 = new byte[2000];
                  System.arraycopy(var13, 6, var16, 0, 2000);
                  String[] var6 = fishing4.a.r.D;
                  String var7 = new String(var16, "KSC5601");
                  var6[0] = var7.trim();
                  var16 = new byte[100];
                  System.arraycopy(var13, 2006, var16, 0, 100);
                  String var14 = new String(var16, "KSC5601");
                  fishing4.a.r.G = var14.trim();
                  this.a(false);
               } catch (Exception var9) {
                  var10001 = false;
               }
            }

            try {
               c = null;
               var2 = F;
               break label72;
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
            }
         }

         Exception var15 = var10000;
         var15.printStackTrace();
         this.a(true);
         this.g = "read() : " + var15;
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

   public final void run() {
      byte var2 = 0;

      Exception var10000;
      Exception var22;
      label141: {
         int var1;
         int var3;
         boolean var10001;
         try {
            var1 = this.E;
            var3 = this.p;
         } catch (Exception var20) {
            var10000 = var20;
            var10001 = false;
            break label141;
         }

         if (var1 == var3) {
            label142: {
               label143: {
                  label128: {
                     try {
                        if (fishing4.a.r.a == null) {
                           this.E = this.x;
                           break label128;
                        }
                     } catch (Exception var19) {
                        var10000 = var19;
                        var10001 = false;
                        break label143;
                     }

                     try {
                        fishing4.a.r.p = fishing4.a.r.a.getBytes();
                        fishing4.a.r.q = fishing4.a.r.b.getBytes();
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

                           this.E = this.q;
                           this.C = true;
                           fishing4.a.r.f = Integer.parseInt("101442");
                           G = new byte[68];
                           System.arraycopy("PNJNETCON".getBytes(), 0, G, 0, 9);
                           System.arraycopy("ADM".getBytes(), 0, G, 9, 3);
                           StringBuilder var4 = new StringBuilder("sms20:");
                           Log.i("", var4.append(fishing4.a.r.p).toString());
                           System.arraycopy(fishing4.a.r.p, 0, G, 12, fishing4.a.r.p.length);
                           var4 = new StringBuilder("sms20:");
                           Log.i("", var4.append(fishing4.a.r.q).toString());
                           System.arraycopy(fishing4.a.r.q, 0, G, 32, fishing4.a.r.q.length);
                           System.arraycopy(b(100), 0, G, 52, 4);
                           System.arraycopy(b(fishing4.a.r.f), 0, G, 56, 4);
                           System.arraycopy(b(4), 0, G, 60, 4);
                           G[64] = fishing4.a.r.k;
                           G[65] = 102;
                           Log.i("", "sms20:서버에서 패킷을 만들어음. 던짐.2");
                           var21 = G;
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

                  var21[66] = 0;

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
                     this.E = this.v;
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

               var22 = var10000;

               try {
                  StringBuilder var5 = new StringBuilder("con() : ");
                  this.g = var5.append(var22).toString();
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
               if (!this.C) {
                  this.a(true);
                  return;
               }
            } catch (Exception var7) {
               var10000 = var7;
               var10001 = false;
               break;
            }

            try {
               Thread.yield();
               if (this.E == this.v) {
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

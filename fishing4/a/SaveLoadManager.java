package fishing4.a;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.widget.Toast;
import fishing4.game.az;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public final class SaveLoadManager { // TODO: possible candidate for rename
   private static String f;
   private static String g;
   private static int h;
   private static Context context;
   private static SaveLoadManager saveLoadManager = null;
   private static final byte[] l = "18encrypt18".getBytes();
   private static String[] m;
   Handler a = new j(this);
   public boolean b;
   public boolean c;
   private final int d = 0;
   private final int e = 1;
   private String[] j = null;

   public static SaveLoadManager a() {
      if (saveLoadManager == null) {
         saveLoadManager = new SaveLoadManager();
      }

      return saveLoadManager;
   }

   public static boolean a(Context var0) {
      context = var0;

      boolean var1;
      label53: {
         boolean var10001;
         String var2;
         try {
            var2 = ((TelephonyManager)var0.getSystemService("phone")).getDeviceId();
         } catch (Exception var6) {
            var10001 = false;
            break label53;
         }

         if (var2 == null) {
            String var7;
            try {
               var7 = ((WifiManager)var0.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            } catch (Exception var4) {
               var10001 = false;
               break label53;
            }

            if (var7 == null) {
               var1 = false;
               return var1;
            }

            try {
               g = var7;
               h = 2;
            } catch (Exception var3) {
               var10001 = false;
               break label53;
            }

            var1 = true;
         } else {
            try {
               f = var2;
               h = 1;
            } catch (Exception var5) {
               var10001 = false;
               break label53;
            }

            var1 = true;
         }

         return var1;
      }

      var1 = false;
      return var1;
   }

   private static boolean a(Context var0, String[] var1) {
      boolean var5 = false;
      context = var0;
      PackageManager var8 = var0.getApplicationContext().getPackageManager();
      List var7 = var8.getInstalledApplications(8192);
      ActivityManager var24 = (ActivityManager)var0.getSystemService("activity");
      Iterator var9 = var24.getRunningTasks(Integer.MAX_VALUE).iterator();

      int var2;
      boolean var4;
      while(var9.hasNext()) {
         ActivityManager.RunningTaskInfo var10 = (ActivityManager.RunningTaskInfo)var9.next();

         for(var2 = 0; var2 < var1.length; ++var2) {
            var4 = var5;
            if (var10.topActivity.getClassName().toString().contains(var1[var2])) {
               return var4;
            }
         }
      }

      var9 = var24.getRunningAppProcesses().iterator();

      while(var9.hasNext()) {
         ActivityManager.RunningAppProcessInfo var31 = (ActivityManager.RunningAppProcessInfo)var9.next();

         for(var2 = 0; var2 < var1.length; ++var2) {
            var4 = var5;
            if (var31.processName.contains(var1[var2])) {
               return var4;
            }
         }
      }

      var9 = var24.getRunningServices(Integer.MAX_VALUE).iterator();

      while(var9.hasNext()) {
         ActivityManager.RunningServiceInfo var25 = (ActivityManager.RunningServiceInfo)var9.next();

         for(var2 = 0; var2 < var1.length; ++var2) {
            var4 = var5;
            if (var25.service.getClassName().contains(var1[var2])) {
               return var4;
            }
         }
      }

      label132: {
         Exception var10000;
         label174: {
            boolean var10001;
            BufferedReader var28;
            try {
               ProcessBuilder var26 = new ProcessBuilder(new String[0]);
               var26.command("ps");
               InputStream var27 = var26.start().getInputStream();
               InputStreamReader var30 = new InputStreamReader(var27);
               var28 = new BufferedReader(var30);
            } catch (Exception var23) {
               var10000 = var23;
               var10001 = false;
               break label174;
            }

            var2 = 0;

            label127:
            while(true) {
               String var32;
               try {
                  var32 = var28.readLine();
               } catch (Exception var18) {
                  var10000 = var18;
                  var10001 = false;
                  break;
               }

               if (var32 == null) {
                  break label132;
               }

               int var3;
               if (var2 != 0) {
                  StringTokenizer var33;
                  try {
                     var33 = new StringTokenizer(var32, " ");
                  } catch (Exception var17) {
                     var10000 = var17;
                     var10001 = false;
                     break;
                  }

                  for(var3 = 0; var3 < 8; ++var3) {
                     try {
                        var33.nextToken();
                     } catch (Exception var16) {
                        var10000 = var16;
                        var10001 = false;
                        break label127;
                     }
                  }

                  Iterator var11;
                  String var12;
                  try {
                     var12 = var33.nextToken();
                     var11 = var7.iterator();
                  } catch (Exception var15) {
                     var10000 = var15;
                     var10001 = false;
                     break;
                  }

                  label116:
                  while(true) {
                     ApplicationInfo var34;
                     while(true) {
                        try {
                           if (!var11.hasNext()) {
                              break label116;
                           }
                        } catch (Exception var20) {
                           var10000 = var20;
                           var10001 = false;
                           break label127;
                        }

                        try {
                           var34 = (ApplicationInfo)var11.next();
                           if (var34.processName != null && var34.processName.equals(var12)) {
                              break;
                           }
                        } catch (Exception var21) {
                           var10000 = var21;
                           var10001 = false;
                           break label127;
                        }
                     }

                     var3 = 0;

                     while(true) {
                        try {
                           if (var3 >= var1.length) {
                              break;
                           }
                        } catch (Exception var22) {
                           var10000 = var22;
                           var10001 = false;
                           break label127;
                        }

                        var4 = var5;

                        try {
                           if (var34.loadLabel(var8).toString().contains(var1[var3])) {
                              return var4;
                           }
                        } catch (Exception var14) {
                           var10000 = var14;
                           var10001 = false;
                           break label127;
                        }

                        ++var3;
                     }
                  }
               }

               var3 = 0;

               while(true) {
                  try {
                     if (var3 >= var1.length) {
                        break;
                     }
                  } catch (Exception var19) {
                     var10000 = var19;
                     var10001 = false;
                     break label127;
                  }

                  boolean var6;
                  try {
                     var6 = var32.contains(var1[var3]);
                  } catch (Exception var13) {
                     var10000 = var13;
                     var10001 = false;
                     break label127;
                  }

                  var4 = var5;
                  if (var6) {
                     return var4;
                  }

                  ++var3;
               }

               ++var2;
            }
         }

         Exception var29 = var10000;
         var29.printStackTrace();
      }

      var4 = true;
      return var4;
   }

   public static boolean a(String var0, byte[] var1) {
      return b(var0, var1, h);
   }

   private static boolean a(String var0, byte[] var1, int var2) {
      boolean var3 = false;
      boolean var4 = true;
      if (var2 > 0) {
         String var5 = var0;
         if (var0.charAt(0) != '/') {
            var5 = "/" + var0;
         }

         File var8 = new File("" + context.getFilesDir().getAbsolutePath() + var5);

         try {
            byte[] var9 = c(var1, l);
            byte[] var6 = makeBigEndian(b(var9));
            var1 = new byte[var9.length + 4];
            System.arraycopy(var9, 0, var1, 0, var9.length);
            System.arraycopy(var6, 0, var1, var9.length, 4);
            FileOutputStream var10 = new FileOutputStream(var8);
            var10.write(var1);
            var10.flush();
            var10.getFD().sync();
            var10.close();
         } catch (Exception var7) {
            Log.e("ERROR", "File Save Exception  : " + var7.toString());
            var7.printStackTrace();
            var3 = false;
            return var3;
         }

         var3 = var4;
      }

      return var3;
   }

   private static byte[] makeBigEndian(int value) {
      ByteBuffer buffer = ByteBuffer.allocate(4);
      buffer.putInt(value);
      buffer.order(ByteOrder.BIG_ENDIAN);
      return buffer.array();
   }

   public static byte[] loadFile(String fileName) {
      Object obj = null;
      String absolutePath = context.getFilesDir().getAbsolutePath();
      String tmpFileName = fileName;
      if (fileName.charAt(0) != '/') {
         tmpFileName = "/" + fileName;
      }

      fileName = absolutePath + tmpFileName;
      Log.w("LOADPATH", "LoadFilePath : " + fileName);
      File file = new File(fileName);
      byte[] fileData = null;
      if (file.exists()) {
         try {
            FileInputStream stream = new FileInputStream(file);
            int remainingBytes = stream.available();
            byte[] readBuf = new byte[remainingBytes - 4];
            stream.read(readBuf, 0, remainingBytes - 4);
            byte[] var10 = new byte[4];
            stream.read(var10, 0, 4);
            stream.close();
            remainingBytes = c(var10);
            if (b(readBuf) == remainingBytes) {
               fileData = c(readBuf, l);
               return fileData;
            }
         } catch (Exception ex) {
            Log.e("ERROR", "File Load Exception  : " + ex.toString());
            ex.printStackTrace();
            return fileData;
         }

      }

      return fileData;
   }

   private static byte[] a(byte[] var0) throws NoSuchAlgorithmException {
      KeyGenerator var2 = KeyGenerator.getInstance("AES");
      SecureRandom var1 = SecureRandom.getInstance("SHA1PRNG");
      var1.setSeed(var0);
      var2.init(128, var1);
      return var2.generateKey().getEncoded();
   }

   private static byte[] a(byte[] var0, byte[] var1) throws NoSuchPaddingException, NoSuchAlgorithmException, IllegalBlockSizeException, BadPaddingException, InvalidKeyException {
      SecretKeySpec var3 = new SecretKeySpec(a(var0), "AES");
      Cipher var2 = Cipher.getInstance("AES");
      var2.init(1, var3);
      return var2.doFinal(var1);
   }

   private static int b(byte[] var0) {
      int var1 = -2146889111;

      for(int var2 = 0; var2 < var0.length; ++var2) {
         var1 = var1 + (var1 << 5) + var0[var2];
      }

      return 92809079 ^ var1;
   }

   private static boolean b(Context var0) {
      boolean var3 = false;
      context = var0;

      int var1;
      int var2;
      Exception var10000;
      boolean var10001;
      label196: {
         label200: {
            StringTokenizer var33;
            try {
               byte[] var6 = c("list.dat");
               String var5 = new String(var6);
               var33 = new StringTokenizer(var5, "/");
               m = new String[var33.countTokens()];
            } catch (Exception var23) {
               var10000 = var23;
               var10001 = false;
               break label200;
            }

            var1 = 0;

            while(true) {
               try {
                  var2 = m.length;
               } catch (Exception var22) {
                  var10000 = var22;
                  var10001 = false;
                  break;
               }

               if (var1 >= var2) {
                  break label196;
               }

               try {
                  m[var1] = var33.nextToken();
                  StringBuilder var31 = new StringBuilder();
                  Log.e("i", var31.append(m[var1]).toString());
               } catch (Exception var21) {
                  var10000 = var21;
                  var10001 = false;
                  break;
               }

               ++var1;
            }
         }

         Exception var30 = var10000;
         var30.printStackTrace();
         az.d();
         Toast.makeText(context, "데이터 조작이 발견되었습니다. 프로그램을 종료합니다.", 1).show();
      }

      PackageManager var32 = var0.getApplicationContext().getPackageManager();
      List var34 = var32.getInstalledApplications(8192);
      ActivityManager var24 = (ActivityManager)var0.getSystemService("activity");
      Iterator var7 = var24.getRunningTasks(Integer.MAX_VALUE).iterator();

      while(true) {
         if (!var7.hasNext()) {
            var7 = var24.getRunningAppProcesses().iterator();

            while(var7.hasNext()) {
               ActivityManager.RunningAppProcessInfo var37 = (ActivityManager.RunningAppProcessInfo)var7.next();

               for(var1 = 0; var1 < m.length; ++var1) {
                  if (var37.processName.contains(m[var1])) {
                     var3 = true;
                     return var3;
                  }
               }
            }

            Iterator var25 = var24.getRunningServices(Integer.MAX_VALUE).iterator();

            while(var25.hasNext()) {
               ActivityManager.RunningServiceInfo var35 = (ActivityManager.RunningServiceInfo)var25.next();

               for(var1 = 0; var1 < m.length; ++var1) {
                  if (var35.service.getClassName().contains(m[var1])) {
                     var3 = true;
                     return var3;
                  }
               }
            }

            label145: {
               label205: {
                  BufferedReader var28;
                  try {
                     ProcessBuilder var26 = new ProcessBuilder(new String[0]);
                     var26.command("ps");
                     InputStream var27 = var26.start().getInputStream();
                     InputStreamReader var36 = new InputStreamReader(var27);
                     var28 = new BufferedReader(var36);
                  } catch (Exception var20) {
                     var10000 = var20;
                     var10001 = false;
                     break label205;
                  }

                  var1 = 0;

                  label140:
                  while(true) {
                     String var38;
                     try {
                        var38 = var28.readLine();
                     } catch (Exception var15) {
                        var10000 = var15;
                        var10001 = false;
                        break;
                     }

                     if (var38 == null) {
                        return var3;
                     }

                     if (var1 != 0) {
                        StringTokenizer var39;
                        try {
                           var39 = new StringTokenizer(var38, " ");
                        } catch (Exception var14) {
                           var10000 = var14;
                           var10001 = false;
                           break;
                        }

                        for(var2 = 0; var2 < 8; ++var2) {
                           try {
                              var39.nextToken();
                           } catch (Exception var13) {
                              var10000 = var13;
                              var10001 = false;
                              break label140;
                           }
                        }

                        Iterator var9;
                        String var10;
                        try {
                           var10 = var39.nextToken();
                           var9 = var34.iterator();
                        } catch (Exception var12) {
                           var10000 = var12;
                           var10001 = false;
                           break;
                        }

                        label129:
                        while(true) {
                           ApplicationInfo var40;
                           while(true) {
                              try {
                                 if (!var9.hasNext()) {
                                    break label129;
                                 }
                              } catch (Exception var17) {
                                 var10000 = var17;
                                 var10001 = false;
                                 break label140;
                              }

                              try {
                                 var40 = (ApplicationInfo)var9.next();
                                 if (var40.processName != null && var40.processName.equals(var10)) {
                                    break;
                                 }
                              } catch (Exception var18) {
                                 var10000 = var18;
                                 var10001 = false;
                                 break label140;
                              }
                           }

                           var2 = 0;

                           while(true) {
                              try {
                                 if (var2 >= m.length) {
                                    break;
                                 }

                                 if (var40.loadLabel(var32).toString().contains(m[var2])) {
                                    break label145;
                                 }
                              } catch (Exception var19) {
                                 var10000 = var19;
                                 var10001 = false;
                                 break label140;
                              }

                              ++var2;
                           }
                        }
                     }

                     var2 = 0;

                     while(true) {
                        try {
                           if (var2 >= m.length) {
                              break;
                           }
                        } catch (Exception var16) {
                           var10000 = var16;
                           var10001 = false;
                           break label140;
                        }

                        boolean var4;
                        try {
                           var4 = var38.contains(m[var2]);
                        } catch (Exception var11) {
                           var10000 = var11;
                           var10001 = false;
                           break label140;
                        }

                        if (var4) {
                           var3 = true;
                           return var3;
                        }

                        ++var2;
                     }

                     ++var1;
                  }
               }

               Exception var29 = var10000;
               var29.printStackTrace();
               break;
            }

            var3 = true;
            break;
         }

         ActivityManager.RunningTaskInfo var8 = (ActivityManager.RunningTaskInfo)var7.next();

         for(var1 = 0; var1 < m.length; ++var1) {
            if (var8.topActivity.getClassName().toString().contains(m[var1])) {
               var3 = true;
               return var3;
            }
         }
      }

      return var3;
   }

   public static boolean b(String var0, byte[] var1) {
      return a(var0, var1, h);
   }

   private static boolean b(String var0, byte[] var1, int var2) {
      boolean var3 = false;
      Log.i("", "sms99:" + var0.toString());
      if (var2 > 0) {
         String var4 = var0;
         if (var0.charAt(0) != '/') {
            var4 = "/" + var0;
         }

         label44: {
            Exception var10000;
            label34: {
               var4 = "" + context.getFilesDir().getAbsolutePath() + var4;
               Log.w("SAVEPATH", "SaveFilePath : " + var4);
               File var5 = new File(var4);
               var0 = null;
               boolean var10001;
               if (var2 == 1) {
                  try {
                     var0 = f;
                  } catch (Exception var8) {
                     var10000 = var8;
                     var10001 = false;
                     break label34;
                  }
               } else if (var2 == 2) {
                  try {
                     var0 = g;
                  } catch (Exception var7) {
                     var10000 = var7;
                     var10001 = false;
                     break label34;
                  }
               }

               try {
                  var1 = a(var0.getBytes(), var1);
                  FileOutputStream var11 = new FileOutputStream(var5);
                  var11.write(var1);
                  var11.flush();
                  var11.close();
                  byte[] var13 = makeBigEndian(var2);
                  var13 = a("588212698009923".getBytes(), var13);
                  StringBuilder var10 = new StringBuilder(String.valueOf(var4.substring(0, var4.length() - 3)));
                  var4 = var10.append("key").toString();
                  File var12 = new File(var4);
                  FileOutputStream var14 = new FileOutputStream(var12);
                  var14.write(var13);
                  var14.flush();
                  var14.close();
                  break label44;
               } catch (Exception var6) {
                  var10000 = var6;
                  var10001 = false;
               }
            }

            Exception var9 = var10000;
            Log.e("ERROR", "File Save Exception  : " + var9.toString());
            var9.printStackTrace();
            return var3;
         }

         var3 = true;
      }

      return var3;
   }

   public static byte[] b(String var0) {
      Object var4 = null;
      String var5 = context.getFilesDir().getAbsolutePath();
      String var3 = var0;
      if (var0.charAt(0) != '/') {
         var3 = "/" + var0;
      }

      var3 = var5 + var3;
      File var16 = new File(var3.substring(0, var3.length() - 3) + "key");
      byte[] var11 = (byte[])var4;
      if (var16.exists()) {
         int var1;
         FileInputStream var12;
         try {
            var12 = new FileInputStream(var16);
            byte[] var17 = new byte[var12.available()];
            var12.read(var17, 0, var17.length);
            var12.close();
            var1 = c(b("588212698009923".getBytes(), var17));
         } catch (Exception var10) {
            Log.e("ERROR", "File Load Exception  : " + var10.toString());
            var11 = (byte[])var4;
            return var11;
         }

         Log.w("LOADPATH", "LoadFilePath : " + var3);
         File var14 = new File(var3);
         var11 = (byte[])var4;
         if (var14.exists()) {
            Exception var10000;
            label53: {
               byte[] var15;
               boolean var10001;
               try {
                  var12 = new FileInputStream(var14);
                  int var2 = var12.available();
                  var15 = new byte[var2];
                  var12.read(var15, 0, var2);
                  var12.close();
               } catch (Exception var9) {
                  var10000 = var9;
                  var10001 = false;
                  break label53;
               }

               if (var1 == 1) {
                  try {
                     var0 = f;
                  } catch (Exception var8) {
                     var10000 = var8;
                     var10001 = false;
                     break label53;
                  }
               } else if (var1 == 2) {
                  try {
                     var0 = g;
                  } catch (Exception var7) {
                     var10000 = var7;
                     var10001 = false;
                     break label53;
                  }
               } else {
                  var0 = null;
               }

               try {
                  var11 = b(var0.getBytes(), var15);
                  return var11;
               } catch (Exception var6) {
                  var10000 = var6;
                  var10001 = false;
               }
            }

            Exception var13 = var10000;
            Log.e("ERROR", "File Load Exception  : " + var13.toString());
            var13.printStackTrace();
            var11 = (byte[])var4;
         }
      }

      return var11;
   }

   private static byte[] b(byte[] var0, byte[] var1) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
      SecretKeySpec var2 = new SecretKeySpec(a(var0), "AES");
      Cipher var3 = Cipher.getInstance("AES");
      var3.init(2, var2);
      return var3.doFinal(var1);
   }

   private static int c(byte[] var0) {
      ByteBuffer.allocate(4);
      byte[] var2 = new byte[4];

      for(int var1 = 0; var1 < 4; ++var1) {
         if (var0.length + var1 < 4) {
            var2[var1] = 0;
         } else {
            var2[var1] = var0[var0.length + var1 - 4];
         }
      }

      ByteBuffer var3 = ByteBuffer.wrap(var2);
      var3.order(ByteOrder.BIG_ENDIAN);
      return var3.getInt();
   }

   private static byte[] c(String var0) {
      Object var2 = null;
      AssetManager var3 = context.getAssets();

      byte[] var6;
      try {
         InputStream var7 = var3.open(var0);
         int var1 = var7.available();
         var6 = new byte[var1 - 4];
         var7.read(var6, 0, var1 - 4);
         byte[] var4 = new byte[4];
         var7.read(var4, 0, 4);
         var7.close();
         var1 = c(var4);
         if (b(var6) == var1) {
            var6 = c(var6, l);
            return var6;
         }
      } catch (Exception var5) {
         Log.e("ERROR", "File Load Exception  : " + var5.toString());
         var6 = (byte[])var2;
         return var6;
      }

      var6 = (byte[])var2;
      return var6;
   }

   private static byte[] c(byte[] var0, byte[] var1) {
      int var6 = var0.length;
      int var5 = var1.length;
      byte[] var7 = new byte[var6];
      int var2 = 0;

      int var4;
      for(int var3 = 0; var3 < var6; var2 = var4 + 1) {
         var7[var3] = (byte)(var0[var3] ^ var1[var2]);
         var4 = var2;
         if (var2 >= var5 - 1) {
            var4 = 0;
         }

         ++var3;
      }

      return var7;
   }

   // $FF: synthetic method
   static Context d() {
      return context;
   }

   public final void b() {
      this.b = false;
      this.c = true;
      if (b(context)) {
         this.c = false;
      }

      Message var1;
      if (this.c) {
         try {
            URL var4 = new URL("http://wap.pnjmobile.com/RND/greeting.php");
            HttpURLConnection var2 = (HttpURLConnection)var4.openConnection();
            var2.setConnectTimeout(30000);
            InputStreamReader var5 = new InputStreamReader(var2.getInputStream(), "EUC-KR");
            BufferedReader var6 = new BufferedReader(var5);
            this.j = var6.readLine().split("/");
            if (!a(context, this.j)) {
               this.c = false;
            }
         } catch (Exception var3) {
            Log.e("Crypto", var3.toString());
            if (this.j != null) {
               if (!a(context, this.j)) {
                  this.c = false;
               }
            } else if (this.j == null) {
               var1 = this.a.obtainMessage();
               var1.what = 0;
               this.a.sendMessage(var1);
            }
         }
      }

      this.b = true;
      if (!this.c) {
         var1 = this.a.obtainMessage();
         var1.what = 1;
         this.a.sendMessage(var1);
      }

   }

   public final void c() {
      this.b = false;
      this.c = true;
      if (this.j != null && !a(context, this.j)) {
         this.c = false;
      }

      this.b = true;
   }
}

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
   private static String deviceId;
   private static String macAddress;
   private static int h;
   private static Context context;
   private static SaveLoadManager saveLoadManager = null;
   private static final byte[] l = "18encrypt18".getBytes();
   private static String[] listEntries;
   Handler a = new j(this);
   public boolean b;
   public boolean c;
   private final int d = 0;
   private final int e = 1;
   private String[] j = null;

   public static SaveLoadManager createInstance() {
      if (saveLoadManager == null) {
         saveLoadManager = new SaveLoadManager();
      }

      return saveLoadManager;
   }

   public static boolean getDeviceId(Context _context) {
      context = _context;

      boolean hasDeviceId;
      label53: {
         boolean var10001;
         String deviceId;
         try {
            deviceId = ((TelephonyManager)_context.getSystemService("phone")).getDeviceId();
         } catch (Exception ex) {
            var10001 = false;
            break label53;
         }

         if (deviceId == null) {
            String macAddress;
            try {
               macAddress = ((WifiManager)_context.getSystemService("wifi")).getConnectionInfo().getMacAddress();
            } catch (Exception var4) {
               var10001 = false;
               break label53;
            }

            if (macAddress == null) {
               hasDeviceId = false;
               return hasDeviceId;
            }

            try {
               SaveLoadManager.macAddress = macAddress;
               h = 2;
            } catch (Exception var3) {
               var10001 = false;
               break label53;
            }

            hasDeviceId = true;
         } else {
            try {
               SaveLoadManager.deviceId = deviceId;
               h = 1;
            } catch (Exception var5) {
               var10001 = false;
               break label53;
            }

            hasDeviceId = true;
         }

         return hasDeviceId;
      }

      hasDeviceId = false;
      return hasDeviceId;
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

   public static boolean saveFile(String fileName, byte[] data) {
      return saveFile(fileName, data, h);
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
            remainingBytes = bytesToBigEndian(var10);
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

   private static boolean jailbreakCheck(Context context) {
      boolean isJailbroken = false;
      SaveLoadManager.context = context;

      int entry;
      int numEntries;
      Exception exception;
       label196: {
         label200: {
            StringTokenizer splitData;
            try {
               byte[] buffer = loadFileRaw("list.dat");
               String data = new String(buffer);
               splitData = new StringTokenizer(data, "/");
               listEntries = new String[splitData.countTokens()];
            } catch (Exception ex) {
               exception = ex;
                break label200;
            }

            entry = 0;

            while(true) {
               try {
                  numEntries = listEntries.length;
               } catch (Exception ex) {
                  exception = ex;
                   break;
               }

               if (entry >= numEntries) {
                  break label196;
               }

               try {
                  listEntries[entry] = splitData.nextToken();
                  StringBuilder sb = new StringBuilder();
                  Log.e("i", sb.append(listEntries[entry]).toString());
               } catch (Exception ex) {
                  exception = ex;
                   break;
               }

               ++entry;
            }
         }

         Exception ex = exception;
         ex.printStackTrace();
         az.d();
         Toast.makeText(SaveLoadManager.context, "데이터 조작이 발견되었습니다. 프로그램을 종료합니다.", 1).show(); // "Data manipulation has been discovered. Exit the program."
      }

      PackageManager packageManager = context.getApplicationContext().getPackageManager();
      List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(8192);
      ActivityManager activityManager = (ActivityManager)context.getSystemService("activity");
      Iterator iterator = activityManager.getRunningTasks(Integer.MAX_VALUE).iterator();

      while(true) {
         if (!iterator.hasNext()) {
            iterator = activityManager.getRunningAppProcesses().iterator();

            while(iterator.hasNext()) {
               ActivityManager.RunningAppProcessInfo var37 = (ActivityManager.RunningAppProcessInfo)iterator.next();

               for(entry = 0; entry < listEntries.length; ++entry) {
                  if (var37.processName.contains(listEntries[entry])) {
                     isJailbroken = true;
                     return isJailbroken;
                  }
               }
            }

            Iterator iterator1 = activityManager.getRunningServices(Integer.MAX_VALUE).iterator();

            while(iterator1.hasNext()) {
               ActivityManager.RunningServiceInfo runningServiceInfo = (ActivityManager.RunningServiceInfo)iterator1.next();

               for(entry = 0; entry < listEntries.length; ++entry) {
                  if (runningServiceInfo.service.getClassName().contains(listEntries[entry])) {
                     isJailbroken = true;
                     return isJailbroken;
                  }
               }
            }

            label145: {
               label205: {
                  BufferedReader bufferedReader;
                  try {
                     ProcessBuilder processBuilder = new ProcessBuilder();
                     processBuilder.command("ps");
                     InputStream inputStream = processBuilder.start().getInputStream();
                     InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                     bufferedReader = new BufferedReader(inputStreamReader);
                  } catch (Exception ex) {
                     exception = ex;
                      break label205;
                  }

                  entry = 0;

                  label140:
                  while(true) {
                     String var38;
                     try {
                        var38 = bufferedReader.readLine();
                     } catch (Exception var15) {
                        exception = var15;
                         break;
                     }

                     if (var38 == null) {
                        return isJailbroken;
                     }

                     if (entry != 0) {
                        StringTokenizer var39;
                        try {
                           var39 = new StringTokenizer(var38, " ");
                        } catch (Exception var14) {
                           exception = var14;
                            break;
                        }

                        for(numEntries = 0; numEntries < 8; ++numEntries) {
                           try {
                              var39.nextToken();
                           } catch (Exception var13) {
                              exception = var13;
                               break label140;
                           }
                        }

                        Iterator var9;
                        String var10;
                        try {
                           var10 = var39.nextToken();
                           var9 = installedApplications.iterator();
                        } catch (Exception var12) {
                           exception = var12;
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
                                 exception = var17;
                                  break label140;
                              }

                              try {
                                 var40 = (ApplicationInfo)var9.next();
                                 if (var40.processName != null && var40.processName.equals(var10)) {
                                    break;
                                 }
                              } catch (Exception var18) {
                                 exception = var18;
                                  break label140;
                              }
                           }

                           numEntries = 0;

                           while(true) {
                              try {
                                 if (numEntries >= listEntries.length) {
                                    break;
                                 }

                                 if (var40.loadLabel(packageManager).toString().contains(listEntries[numEntries])) {
                                    break label145;
                                 }
                              } catch (Exception var19) {
                                 exception = var19;
                                  break label140;
                              }

                              ++numEntries;
                           }
                        }
                     }

                     numEntries = 0;

                     while(true) {
                        try {
                           if (numEntries >= listEntries.length) {
                              break;
                           }
                        } catch (Exception var16) {
                           exception = var16;
                            break label140;
                        }

                        boolean var4;
                        try {
                           var4 = var38.contains(listEntries[numEntries]);
                        } catch (Exception var11) {
                           exception = var11;
                            break label140;
                        }

                        if (var4) {
                           isJailbroken = true;
                           return isJailbroken;
                        }

                        ++numEntries;
                     }

                     ++entry;
                  }
               }

               Exception var29 = exception;
               var29.printStackTrace();
               break;
            }

            isJailbroken = true;
            break;
         }

         ActivityManager.RunningTaskInfo var8 = (ActivityManager.RunningTaskInfo)iterator.next();

         for(entry = 0; entry < listEntries.length; ++entry) {
            if (var8.topActivity.getClassName().toString().contains(listEntries[entry])) {
               isJailbroken = true;
               return isJailbroken;
            }
         }
      }

      return isJailbroken;
   }

   public static boolean b(String var0, byte[] var1) {
      return a(var0, var1, h);
   }

   private static boolean saveFile(String fileName, byte[] data, int toFolder) {
      boolean result = false;
      Log.i("", "sms99:" + fileName.toString());
      if (toFolder > 0) {
         String tmpFileName = fileName;
         if (fileName.charAt(0) != '/') {
            tmpFileName = "/" + fileName;
         }

         label44: {
            Exception exception;
            label34: {
               tmpFileName = "" + context.getFilesDir().getAbsolutePath() + tmpFileName;
               Log.w("SAVEPATH", "SaveFilePath : " + tmpFileName);
               File file = new File(tmpFileName);
               fileName = null;
                if (toFolder == 1) {
                  try {
                     fileName = deviceId;
                  } catch (Exception ex) {
                     exception = ex;
                      break label34;
                  }
               } else if (toFolder == 2) {
                  try {
                     fileName = macAddress;
                  } catch (Exception ex) {
                     exception = ex;
                      break label34;
                  }
               }

               try {
                  data = a(fileName.getBytes(), data);
                  FileOutputStream fileOutputStream = new FileOutputStream(file);
                  fileOutputStream.write(data);
                  fileOutputStream.flush();
                  fileOutputStream.close();
                  byte[] var13 = makeBigEndian(toFolder);
                  var13 = a("588212698009923".getBytes(), var13);
                  StringBuilder stringBuilder = new StringBuilder(tmpFileName.substring(0, tmpFileName.length() - 3));
                  tmpFileName = stringBuilder.append("key").toString();
                  File file1 = new File(tmpFileName);
                  FileOutputStream outputStream = new FileOutputStream(file1);
                  outputStream.write(var13);
                  outputStream.flush();
                  outputStream.close();
                  break label44;
               } catch (Exception var6) {
                  exception = var6;
               }
            }

            Exception exception1 = exception;
            Log.e("ERROR", "File Save Exception  : " + exception1);
            exception1.printStackTrace();
            return result;
         }

         result = true;
      }

      return result;
   }

   public static byte[] b(String fileName) {
      Object empty = null;
      String absolutePath = context.getFilesDir().getAbsolutePath();
      String tmpFileName = fileName;
      if (fileName.charAt(0) != '/') {
         tmpFileName = "/" + fileName;
      }

      tmpFileName = absolutePath + tmpFileName;
      File file = new File(tmpFileName.substring(0, tmpFileName.length() - 3) + "key");
      byte[] buffer = (byte[])empty;
      if (file.exists()) {
         int var1;
         FileInputStream fileInputStream;
         try {
            fileInputStream = new FileInputStream(file);
            byte[] buf = new byte[fileInputStream.available()];
            fileInputStream.read(buf, 0, buf.length);
            fileInputStream.close();
            var1 = bytesToBigEndian(encryptData("588212698009923".getBytes(), buf));
         } catch (Exception ex) {
            Log.e("ERROR", "File Load Exception  : " + ex);
            buffer = (byte[])empty;
            return buffer;
         }

         Log.w("LOADPATH", "LoadFilePath : " + tmpFileName);
         File file1 = new File(tmpFileName);
         buffer = (byte[])empty;
         if (file1.exists()) {
            Exception exception;
            label53: {
               byte[] buf;
                try {
                  fileInputStream = new FileInputStream(file1);
                  int length = fileInputStream.available();
                  buf = new byte[length];
                  fileInputStream.read(buf, 0, length);
                  fileInputStream.close();
               } catch (Exception ex) {
                  exception = ex;
                    break label53;
               }

               if (var1 == 1) {
                  try {
                     fileName = deviceId;
                  } catch (Exception var8) {
                     exception = var8;
                      break label53;
                  }
               } else if (var1 == 2) {
                  try {
                     fileName = macAddress;
                  } catch (Exception var7) {
                     exception = var7;
                      break label53;
                  }
               } else {
                  fileName = null;
               }

               try {
                  buffer = encryptData(fileName.getBytes(), buf);
                  return buffer;
               } catch (Exception var6) {
                  exception = var6;
               }
            }

            Exception exception1 = exception;
            Log.e("ERROR", "File Load Exception  : " + exception1);
            exception1.printStackTrace();
            buffer = (byte[])empty;
         }
      }

      return buffer;
   }

   private static byte[] encryptData(byte[] key, byte[] data) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
      SecretKeySpec secretKeySpec = new SecretKeySpec(a(key), "AES");
      Cipher cipher = Cipher.getInstance("AES");
      cipher.init(2, secretKeySpec);
      return cipher.doFinal(data);
   }

   private static int bytesToBigEndian(byte[] data) {
      ByteBuffer.allocate(4);
      byte[] buffer = new byte[4];

      for(int i = 0; i < 4; ++i) {
         if (data.length + i < 4) {
            buffer[i] = 0;
         } else {
            buffer[i] = data[data.length + i - 4];
         }
      }

      ByteBuffer buf = ByteBuffer.wrap(buffer);
      buf.order(ByteOrder.BIG_ENDIAN);
      return buf.getInt();
   }

   private static byte[] loadFileRaw(String fileName) {
      Object empty = null;
      AssetManager assetManager = context.getAssets();

      byte[] buffer;
      try {
         InputStream stream = assetManager.open(fileName);
         int remaining = stream.available();
         buffer = new byte[remaining - 4];
         stream.read(buffer, 0, remaining - 4);
         byte[] buffer2 = new byte[4];
         stream.read(buffer2, 0, 4);
         stream.close();
         remaining = bytesToBigEndian(buffer2);
         if (b(buffer) == remaining) {
            buffer = c(buffer, l);
            return buffer;
         }
      } catch (Exception ex) {
         Log.e("ERROR", "File Load Exception  : " + ex.toString());
         buffer = (byte[])empty;
         return buffer;
      }

      buffer = (byte[])empty;
      return buffer;
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

   public final void b() {
      this.b = false;
       this.c = !jailbreakCheck(context);

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

package pnjmobile.fishing4.google_free;

import android.app.ActivityManager;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gcm.GCMBaseIntentService;
import fishing4.Push.WakeUpActivity;
import java.io.InputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;

public class GCMIntentService extends GCMBaseIntentService {
   public static String a = new String();

   public GCMIntentService() {
      this("286281673119");
   }

   public GCMIntentService(String var1) {
      super(var1);
   }

   private static void a(InputStream param0) {
      // $FF: Couldn't be decompiled
   }

   protected final void a(Context var1, Intent var2) {
      Bundle var4 = var2.getExtras();
      Iterator var17 = var4.keySet().iterator();

      while(true) {
         Exception var10000;
         label68:
         while(true) {
            boolean var10001;
            try {
               if (!var17.hasNext()) {
                  return;
               }
            } catch (Exception var15) {
               var10000 = var15;
               var10001 = false;
               break;
            }

            String var5;
            String[] var7;
            byte[] var19;
            try {
               var5 = (String)var17.next();
               if (!var5.equals("msg")) {
                  continue;
               }

               var7 = var4.get(var5).toString().split(" ");
               var19 = new byte[var7.length];
            } catch (Exception var14) {
               var10000 = var14;
               var10001 = false;
               break;
            }

            int var3 = 0;

            boolean var18;
            String var21;
            label59: {
               label58: {
                  while(true) {
                     try {
                        if (var3 >= var19.length) {
                           System.out.println("");
                           var21 = new String(var19, "utf-8");
                           a = var21;
                           var5 = var1.getPackageName();
                           if (!((ActivityManager.RunningTaskInfo)((ActivityManager)var1.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.getPackageName().equals(var5)) {
                              break label58;
                           }
                           break;
                        }
                     } catch (Exception var13) {
                        var10000 = var13;
                        var10001 = false;
                        break label68;
                     }

                     try {
                        PrintStream var6 = System.out;
                        StringBuilder var8 = new StringBuilder(" ");
                        var6.print(var8.append(var7[var3]).toString());
                        var19[var3] = Byte.parseByte(var7[var3]);
                     } catch (Exception var12) {
                        var10000 = var12;
                        var10001 = false;
                        break label68;
                     }

                     ++var3;
                  }

                  var18 = true;
                  break label59;
               }

               var18 = false;
            }

            if (!var18) {
               try {
                  Intent var20 = new Intent(var1, WakeUpActivity.class);
                  var20.addFlags(268435456);
                  var20.addFlags(8388608);
                  var1.startActivity(var20);
               } catch (Exception var11) {
                  var10000 = var11;
                  var10001 = false;
                  break;
               }
            }

            try {
               String var9 = a;
               var21 = var1.getString(2131165184);
               String var24 = a;
               NotificationManager var23 = (NotificationManager)var1.getSystemService("notification");
               Notification var22 = new Notification(2130837517, var9, System.currentTimeMillis());
               fishing4.game.k.l();
               fishing4.game.k.m();
               Intent var25 = new Intent(var1, MainLGU.class);
               var22.setLatestEventInfo(var1, var21, var24, PendingIntent.getActivity(var1, 0, var25, 0));
               var22.flags |= 16;
               var23.cancel(0);
               var23.notify(0, var22);
            } catch (Exception var10) {
               var10000 = var10;
               var10001 = false;
               break;
            }
         }

         Exception var16 = var10000;
         System.out.println("siput EE = " + var16.toString());
         return;
      }
   }

   protected final void a(String var1) {
      Log.d("GCMIntentService", "onError. errorId : " + var1);
   }

   protected final void b(String var1) {
      Log.d("GCMIntentService", "onRegistered. regID : " + var1);

      try {
         StringBuilder var2;
         URL var3;
         HttpURLConnection var5;
         if (fishing4.game.p.a == 0) {
            var2 = new StringBuilder("http://211.35.49.162/PNJ_programs/Android/c2dm/c2dm_ID_in.php?tokenid=");
            var3 = new URL(var2.append(var1).append("&gameid=101442&os=android&nation=ko").toString());
            var5 = (HttpURLConnection)var3.openConnection();
            var5.connect();
            a(var5.getInputStream());
         } else {
            var2 = new StringBuilder("http://211.35.49.162/PNJ_programs/Android/c2dm/c2dm_ID_in.php?tokenid=");
            var3 = new URL(var2.append(var1).append("&gameid=101442&os=android&nation=en").toString());
            var5 = (HttpURLConnection)var3.openConnection();
            var5.connect();
            a(var5.getInputStream());
         }
      } catch (Exception var4) {
      }

   }

   protected final void c(String var1) {
      Log.d("GCMIntentService", "onUnregistered. regID : " + var1);
   }
}

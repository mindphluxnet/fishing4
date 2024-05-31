package com.google.android.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class a {
   private static GCMBroadcastReceiver a;
   private static String b;

   static String a(Context var0, String var1) {
      SharedPreferences var4 = var0.getSharedPreferences("com.google.android.gcm", 0);
      String var3 = var4.getString("regId", "");
      int var2 = e(var0);
      Log.v("GCMRegistrar", "Saving regId on app version " + var2);
      SharedPreferences.Editor var5 = var4.edit();
      var5.putString("regId", var1);
      var5.putInt("appVersion", var2);
      var5.commit();
      return var3;
   }

   static String a(String... var0) {
      if (var0 != null && var0.length != 0) {
         StringBuilder var2 = new StringBuilder(var0[0]);

         for(int var1 = 1; var1 < var0.length; ++var1) {
            var2.append(',').append(var0[var1]);
         }

         return var2.toString();
      } else {
         throw new IllegalArgumentException("No senderIds");
      }
   }

   public static void a(Context var0) {
      PackageManager var5 = var0.getPackageManager();
      String var3 = var0.getPackageName();
      String var4 = var3 + ".permission.C2D_MESSAGE";

      try {
         var5.getPermissionInfo(var4, 4096);
      } catch (PackageManager.NameNotFoundException var7) {
         throw new IllegalStateException("Application does not define permission " + var4);
      }

      PackageInfo var9;
      try {
         var9 = var5.getPackageInfo(var3, 2);
      } catch (PackageManager.NameNotFoundException var6) {
         throw new IllegalStateException("Could not get receivers for package " + var3);
      }

      ActivityInfo[] var10 = var9.receivers;
      if (var10 != null && var10.length != 0) {
         if (Log.isLoggable("GCMRegistrar", 2)) {
            Log.v("GCMRegistrar", "number of receivers for " + var3 + ": " + var10.length);
         }

         HashSet var8 = new HashSet();
         int var2 = var10.length;

         for(int var1 = 0; var1 < var2; ++var1) {
            ActivityInfo var11 = var10[var1];
            if ("com.google.android.c2dm.permission.SEND".equals(var11.permission)) {
               var8.add(var11.name);
            }
         }

         if (var8.isEmpty()) {
            throw new IllegalStateException("No receiver allowed to receive com.google.android.c2dm.permission.SEND");
         } else {
            a(var0, var8, "com.google.android.c2dm.intent.REGISTRATION");
            a(var0, var8, "com.google.android.c2dm.intent.RECEIVE");
         }
      } else {
         throw new IllegalStateException("No receiver for package " + var3);
      }
   }

   static void a(Context var0, int var1) {
      SharedPreferences.Editor var2 = var0.getSharedPreferences("com.google.android.gcm", 0).edit();
      var2.putInt("backoff_ms", var1);
      var2.commit();
   }

   private static void a(Context var0, Set var1, String var2) {
      PackageManager var3 = var0.getPackageManager();
      String var5 = var0.getPackageName();
      Intent var4 = new Intent(var2);
      var4.setPackage(var5);
      List var6 = var3.queryBroadcastReceivers(var4, 32);
      if (var6.isEmpty()) {
         throw new IllegalStateException("No receivers for action " + var2);
      } else {
         if (Log.isLoggable("GCMRegistrar", 2)) {
            Log.v("GCMRegistrar", "Found " + var6.size() + " receivers for action " + var2);
         }

         Iterator var7 = var6.iterator();

         do {
            if (!var7.hasNext()) {
               return;
            }

            var5 = ((ResolveInfo)var7.next()).activityInfo.name;
         } while(var1.contains(var5));

         throw new IllegalStateException("Receiver " + var5 + " is not set with permission com.google.android.c2dm.permission.SEND");
      }
   }

   public static void a(Context var0, String... var1) {
      d(var0);
      b(var0, var1);
   }

   static void a(String var0) {
      Log.v("GCMRegistrar", "Setting the name of retry receiver class to " + var0);
      b = var0;
   }

   static void b(Context param0) {
      // $FF: Couldn't be decompiled
   }

   static void b(Context var0, String... var1) {
      String var3 = a(var1);
      Log.v("GCMRegistrar", "Registering app " + var0.getPackageName() + " of senders " + var3);
      Intent var2 = new Intent("com.google.android.c2dm.intent.REGISTER");
      var2.setPackage("com.google.android.gsf");
      var2.putExtra("app", PendingIntent.getBroadcast(var0, 0, new Intent(), 0));
      var2.putExtra("sender", var3);
      var0.startService(var2);
   }

   public static String c(Context var0) {
      SharedPreferences var3 = var0.getSharedPreferences("com.google.android.gcm", 0);
      String var4 = var3.getString("regId", "");
      int var1 = var3.getInt("appVersion", Integer.MIN_VALUE);
      int var2 = e(var0);
      String var5 = var4;
      if (var1 != Integer.MIN_VALUE) {
         var5 = var4;
         if (var1 != var2) {
            Log.v("GCMRegistrar", "App version changed from " + var1 + " to " + var2 + "; resetting registration id");
            a(var0, "");
            var5 = "";
         }
      }

      return var5;
   }

   static void d(Context var0) {
      Log.d("GCMRegistrar", "resetting backoff for " + var0.getPackageName());
      a(var0, 3000);
   }

   private static int e(Context var0) {
      try {
         int var1 = var0.getPackageManager().getPackageInfo(var0.getPackageName(), 0).versionCode;
         return var1;
      } catch (PackageManager.NameNotFoundException var2) {
         throw new RuntimeException("Coult not get package name: " + var2);
      }
   }
}

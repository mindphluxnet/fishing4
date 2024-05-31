package pnjmobile.fishing4.google_free;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

public class bh {
   private static bf a;

   public static void a() {
      synchronized(bh.class){}

      try {
         a = null;
      } finally {
         ;
      }

   }

   public static void a(PendingIntent var0, Intent var1) {
      if (a != null) {
         a.a(var0, var1);
      }

   }

   public static void a(Context var0, g var1, String var2, String var3, long var4, String var6) {
      (new Thread(new bi(var0, var3, var2, var1, var4, var6))).start();
   }

   public static void a(bf var0) {
      synchronized(bh.class){}

      try {
         a = var0;
      } finally {
         ;
      }

   }

   public static void a(h var0) {
      if (a != null) {
         a.a(var0);
      }

   }

   public static void b() {
      if (a != null) {
         a.a();
      }

   }

   // $FF: synthetic method
   static bf c() {
      return a;
   }
}

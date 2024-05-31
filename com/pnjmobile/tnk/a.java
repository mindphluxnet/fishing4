package com.pnjmobile.tnk;

import android.app.ProgressDialog;
import android.content.Context;

public final class a {
   private static boolean a = false;
   private static ProgressDialog b;
   private static String c = null;
   private static String d = null;
   private static Context e = null;

   public static final void a() {
      if (b != null) {
         b.dismiss();
         b = null;
      }

   }

   public static final void a(Context var0, String var1) {
      e = var0;
      c = var0.getPackageName();
      d = var1;
   }

   public static final String b() {
      return c;
   }
}

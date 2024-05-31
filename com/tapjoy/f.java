package com.tapjoy;

import android.content.Context;
import android.content.Intent;
import android.util.Log;

public final class f {
   private static f a = null;
   private static a b = null;
   private static u c = null;
   private static k d = null;
   private static ai e = null;
   private static t f = null;
   private static ac g = null;

   private f(Context var1, String var2, String var3) {
      TapjoyConnectCore.a(var1, var2, var3);
   }

   public static f a() {
      if (a == null) {
         Log.e("TapjoyConnect", "----------------------------------------");
         Log.e("TapjoyConnect", "ERROR -- call requestTapjoyConnect before any other Tapjoy methods");
         Log.e("TapjoyConnect", "----------------------------------------");
      }

      return a;
   }

   public static void a(int var0, af var1) {
      b.a(var0, var1);
   }

   public static void a(Context var0, String var1, String var2) {
      TapjoyConnectCore.b("offers");
      TapjoyConnectCore.a("native");
      a = new f(var0, var1, var2);
      b = new a(var0);
      c = new u(var0);
      d = new k(var0);
      e = new ai(var0);
      f = new t(var0);
      g = new ac(var0);
   }

   public static void a(ab var0) {
      b.a(var0);
   }

   public static void a(p var0) {
      d.a(var0);
   }

   public static void a(s var0) {
      a var1 = b;
      com.tapjoy.a.a(var0);
   }

   public static void b() {
      a var1 = b;
      aa.a("TapjoyOffers", "Showing offers with userID: " + TapjoyConnectCore.e());
      Intent var0 = new Intent(var1.c, TJCOffersWebView.class);
      var0.setFlags(268435456);
      var0.putExtra("USER_ID", TapjoyConnectCore.e());
      var0.putExtra("URL_PARAMS", TapjoyConnectCore.c());
      var1.c.startActivity(var0);
   }

   public static void c() {
      d.a();
   }
}

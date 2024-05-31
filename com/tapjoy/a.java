package com.tapjoy;

import android.content.Context;
import org.w3c.dom.Document;

public final class a {
   private static ab d;
   private static af e;
   private static s f;
   String a = null;
   int b = 0;
   Context c;
   private String g = "";
   private String h = "";

   public a(Context var1) {
      this.c = var1;
   }

   // $FF: synthetic method
   static ab a() {
      return d;
   }

   public static void a(s var0) {
      f = var0;
   }

   // $FF: synthetic method
   static boolean a(a var0, String var1) {
      return var0.b(var1);
   }

   // $FF: synthetic method
   static boolean a(String var0) {
      boolean var1 = true;
      Document var3 = ah.b(var0);
      if (var3 != null) {
         String var2 = ah.a(var3.getElementsByTagName("Success"));
         if (var2 != null && var2.equals("true")) {
            var2 = ah.a(var3.getElementsByTagName("TapPoints"));
            var0 = ah.a(var3.getElementsByTagName("CurrencyName"));
            if (var2 != null && var0 != null) {
               com.tapjoy.g.a(Integer.parseInt(var2));
               e.a(Integer.parseInt(var2));
               return var1;
            }

            aa.b("TapjoyPoints", "Invalid XML: Missing tags.");
         } else {
            if (var2 != null && var2.endsWith("false")) {
               aa.a("TapjoyPoints", ah.a(var3.getElementsByTagName("Message")));
               e.a();
               return var1;
            }

            aa.b("TapjoyPoints", "Invalid XML: Missing <Success> tag.");
         }
      }

      var1 = false;
      return var1;
   }

   // $FF: synthetic method
   static af b() {
      return e;
   }

   private boolean b(String param1) {
      // $FF: Couldn't be decompiled
   }

   public final void a(int var1, af var2) {
      if (var1 < 0) {
         aa.b("TapjoyPoints", "spendTapPoints error: amount must be a positive number");
      } else {
         this.a = "" + var1;
         e = var2;
         (new Thread(new c(this))).start();
      }

   }

   public final void a(ab var1) {
      d = var1;
      (new Thread(new b(this))).start();
   }
}

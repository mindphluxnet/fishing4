package com.tapjoy;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.view.View;
import android.view.ViewGroup;
import java.io.ByteArrayInputStream;
import java.util.Timer;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;

public final class k {
   public static String a;
   private static p g;
   private static ag h = null;
   private static String k;
   private static String l;
   private static Bitmap m;
   private static final byte[] n;
   View b;
   Timer c;
   Timer d;
   long e;
   final String f = "Banner Ad";
   private Context i;
   private boolean j;
   private byte[] o;
   private int p;
   private int q;
   private boolean r;
   private int s;

   static {
      byte[] var0 = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, 62, -1, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, 63, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51};
      n = var0;
   }

   public k(Context var1) {
      k = com.tapjoy.q.b;
      this.i = var1;
      h = new ag();
   }

   // $FF: synthetic method
   static Context a(k var0) {
      return var0.i;
   }

   private void a(byte[] var1, int var2, int var3) {
      int var6 = 0;
      this.o = new byte[var1.length];
      this.p = 0;
      this.r = false;
      this.q = 0;
      int var4 = var6;
      int var5 = var2;
      if (var3 < 0) {
         this.r = true;
         var5 = var2;
         var4 = var6;
      }

      while(var4 < var3) {
         byte var8 = var1[var5];
         if (var8 == 61) {
            this.r = true;
            break;
         }

         if (var8 >= 0 && var8 < n.length) {
            var8 = n[var8];
            if (var8 >= 0) {
               var6 = this.q + 1;
               this.q = var6;
               this.q = var6 % 4;
               this.s = var8 + (this.s << 6);
               if (this.q == 0) {
                  byte[] var7 = this.o;
                  var2 = this.p++;
                  var7[var2] = (byte)(this.s >> 16 & 255);
                  var7 = this.o;
                  var2 = this.p++;
                  var7[var2] = (byte)(this.s >> 8 & 255);
                  var7 = this.o;
                  var2 = this.p++;
                  var7[var2] = (byte)(this.s & 255);
               }
            }
         }

         ++var4;
         ++var5;
      }

      if (this.r && this.q != 0) {
         this.s <<= 6;
         switch (this.q) {
            case 2:
               this.s <<= 6;
               var1 = this.o;
               var2 = this.p++;
               var1[var2] = (byte)(this.s >> 16 & 255);
               break;
            case 3:
               var1 = this.o;
               var2 = this.p++;
               var1[var2] = (byte)(this.s >> 16 & 255);
               var1 = this.o;
               var2 = this.p++;
               var1[var2] = (byte)(this.s >> 8 & 255);
         }
      }

   }

   // $FF: synthetic method
   static boolean a(k var0, String var1) {
      return var0.a(var1);
   }

   private boolean a(String var1) {
      DocumentBuilderFactory var4 = DocumentBuilderFactory.newInstance();

      boolean var2;
      label23: {
         try {
            ByteArrayInputStream var3 = new ByteArrayInputStream(var1.getBytes("UTF-8"));
            Document var6 = var4.newDocumentBuilder().parse(var3);
            l = ah.a(var6.getElementsByTagName("ClickURL"));
            var1 = ah.a(var6.getElementsByTagName("Image"));
            aa.a("Banner Ad", "decoding...");
            this.a(var1.getBytes(), 0, var1.getBytes().length);
            StringBuilder var7 = new StringBuilder("pos: ");
            aa.a("Banner Ad", var7.append(this.p).toString());
            var7 = new StringBuilder("buffer_size: ");
            aa.a("Banner Ad", var7.append(this.o.length).toString());
            m = BitmapFactory.decodeByteArray(this.o, 0, this.p);
            var7 = new StringBuilder("image: ");
            aa.a("Banner Ad", var7.append(m.getWidth()).append("x").append(m.getHeight()).toString());
            View var8 = new View(this.i);
            this.b = var8;
            ViewGroup.LayoutParams var9 = new ViewGroup.LayoutParams(m.getWidth(), m.getHeight());
            this.b.setLayoutParams(var9);
            var8 = this.b;
            BitmapDrawable var10 = new BitmapDrawable(m);
            var8.setBackgroundDrawable(var10);
            View var11 = this.b;
            m var12 = new m(this);
            var11.setOnClickListener(var12);
            aa.a("Banner Ad", "notify displayAdNotifier");
            g.a(this.b);
         } catch (Exception var5) {
            aa.b("Banner Ad", "Error parsing XML: " + var5.toString());
            var2 = false;
            break label23;
         }

         var2 = true;
      }

      if (this.c != null) {
         this.c.cancel();
         this.c = null;
      }

      if (this.j && this.c == null) {
         aa.a("Banner Ad", "will refresh banner ad in 15s...");
         this.c = new Timer();
         this.c.schedule(new o(this, (byte)0), 15000L);
      }

      aa.a("Banner Ad", "return: " + var2);
      return var2;
   }

   // $FF: synthetic method
   static p b() {
      return g;
   }

   // $FF: synthetic method
   static ag c() {
      return h;
   }

   // $FF: synthetic method
   static String d() {
      return l;
   }

   public final void a() {
      this.j = true;
   }

   public final void a(p var1) {
      aa.a("Banner Ad", "Get Banner Ad");
      aa.a("Banner Ad", "Get Banner Ad, currencyID: " + null);
      g = var1;
      String var2 = TapjoyConnectCore.c();
      a = var2;
      var2 = var2 + "&publisher_user_id=" + TapjoyConnectCore.getUserId();
      a = var2;
      a = var2 + "&size=" + k;
      (new Thread(new l(this))).start();
   }
}

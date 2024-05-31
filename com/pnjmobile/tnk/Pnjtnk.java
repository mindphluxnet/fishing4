package com.pnjmobile.tnk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.Bitmap.Config;
import android.graphics.Paint.Align;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Toast;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class Pnjtnk extends Activity {
   Bitmap A;
   Bitmap B;
   Bitmap C;
   Bitmap D;
   Bitmap E;
   boolean F = false;
   String G = "이미 많이 받으셨군요? ^^ 새로운 광고가 준비될때까지 기다려주세요~";
   private Typeface H;
   private Typeface I;
   private View.OnTouchListener J = new b(this);
   private View.OnClickListener K = new c(this);
   String a = null;
   String b = null;
   String c = null;
   String[] d = null;
   String[] e = null;
   String[] f = null;
   String[] g = null;
   String[] h = null;
   String[] i = null;
   Bitmap[] j = null;
   String[] k = null;
   ArrayList l = new ArrayList();
   ArrayList m = new ArrayList();
   public String n = null;
   ScrollView o = null;
   LinearLayout p = null;
   LinearLayout q = null;
   float r = 0.0F;
   int s = 0;
   int t = 0;
   int u = 0;
   final int v = 1;
   boolean w = false;
   float x = 0.0F;
   Bitmap y;
   Bitmap z;

   private static Bitmap a(String var0) {
      Object var2 = null;
      Bitmap var1 = (Bitmap)var2;

      Bitmap var16;
      label98: {
         boolean var10001;
         URL var3;
         try {
            var3 = new URL;
         } catch (Exception var14) {
            var10001 = false;
            break label98;
         }

         var1 = (Bitmap)var2;

         try {
            var3.<init>(var0);
         } catch (Exception var13) {
            var10001 = false;
            break label98;
         }

         var1 = (Bitmap)var2;

         URLConnection var15;
         try {
            var15 = var3.openConnection();
         } catch (Exception var12) {
            var10001 = false;
            break label98;
         }

         var1 = (Bitmap)var2;

         try {
            var15.setConnectTimeout(100000);
         } catch (Exception var11) {
            var10001 = false;
            break label98;
         }

         var1 = (Bitmap)var2;

         try {
            var15.setReadTimeout(100000);
         } catch (Exception var10) {
            var10001 = false;
            break label98;
         }

         var1 = (Bitmap)var2;

         try {
            var15.setUseCaches(false);
         } catch (Exception var9) {
            var10001 = false;
            break label98;
         }

         var1 = (Bitmap)var2;

         try {
            var15.connect();
         } catch (Exception var8) {
            var10001 = false;
            break label98;
         }

         var1 = (Bitmap)var2;

         BufferedInputStream var17;
         try {
            var17 = new BufferedInputStream;
         } catch (Exception var7) {
            var10001 = false;
            break label98;
         }

         var1 = (Bitmap)var2;

         try {
            var17.<init>(var15.getInputStream());
         } catch (Exception var6) {
            var10001 = false;
            break label98;
         }

         var1 = (Bitmap)var2;

         try {
            var16 = BitmapFactory.decodeStream(var17);
         } catch (Exception var5) {
            var10001 = false;
            break label98;
         }

         var1 = var16;

         try {
            var17.close();
            return var16;
         } catch (Exception var4) {
            var10001 = false;
         }
      }

      var16 = var1;
      return var16;
   }

   // $FF: synthetic method
   static Drawable a(Pnjtnk var0, int var1) {
      BitmapDrawable var2;
      if (var1 % 2 == 0) {
         var2 = new BitmapDrawable(var0.E);
      } else {
         var2 = new BitmapDrawable(var0.D);
      }

      return var2;
   }

   private LinearLayout a() {
      Rect var5 = new Rect();
      RectF var4 = new RectF();
      int var1 = (int)(94.0F * this.r);
      Paint var6 = new Paint(1);
      Bitmap var2 = Bitmap.createBitmap(this.s, var1, Config.ARGB_4444);
      Canvas var3 = new Canvas(var2);
      var5.set(0, 0, this.y.getWidth(), this.y.getHeight());
      var4.set(11.0F * this.r, 11.0F * this.r, 11.0F * this.r + (float)this.y.getWidth() * this.r, 11.0F * this.r + (float)this.y.getHeight() * this.r);
      var3.drawBitmap(this.y, var5, var4, var6);
      var5.set(0, 0, this.z.getWidth(), this.z.getHeight());
      var4.set((float)this.s - (float)this.z.getWidth() * this.r - 11.0F * this.r, 11.0F * this.r, (float)this.s - (float)this.z.getWidth() * this.r - 11.0F * this.r + (float)this.z.getWidth() * this.r, 11.0F * this.r + (float)this.z.getHeight() * this.r);
      var3.drawBitmap(this.z, var5, var4, var6);
      ImageView var8 = new ImageView(this);
      var8.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      var8.setImageDrawable(new BitmapDrawable(var2));
      var8.setBackgroundDrawable(new BitmapDrawable(this.A));
      var8.setOnTouchListener(new d(this));
      LinearLayout var7 = new LinearLayout(this);
      var7.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
      var7.setOrientation(1);
      var7.setBackgroundColor(-14276048);
      var7.addView(var8);
      return var7;
   }

   // $FF: synthetic method
   static String a(URL var0) {
      return b(var0);
   }

   private static void a(String var0, String var1, String var2) {
      try {
         StringBuilder var4 = new StringBuilder("http://wap.pnjmobile.co.kr/PNJ_Coin/Fishing4_FlatFish_Free_Coin/index.php?mode=dbin&phoneNum=");
         URL var3 = new URL(var4.append(var0).append("&coin=").append(var1).append("&list_package=").append(var2).append("&use_package=").append(com.pnjmobile.tnk.a.b()).append("&page_kind=install").toString());
         b(var3);
      } catch (IOException var7) {
         var7.printStackTrace();
      }

      try {
         StringBuilder var8 = new StringBuilder("http://wap.pnjmobile.co.kr/PNJ_Coin/Fishing4_FlatFish_Free_Coin/index.php?mode=log_publisher&packageName=");
         URL var10 = new URL(var8.append(com.pnjmobile.tnk.a.b()).append("&countKind=install_count").toString());
         b(var10);
      } catch (IOException var6) {
         var6.printStackTrace();
      }

      try {
         StringBuilder var11 = new StringBuilder("http://wap.pnjmobile.co.kr/PNJ_Coin/Fishing4_FlatFish_Free_Coin/index.php?mode=log_advertiser&packageName=");
         URL var9 = new URL(var11.append(var2).append("&countKind=install_count").toString());
         b(var9);
      } catch (IOException var5) {
         var5.printStackTrace();
      }

   }

   private void a(ArrayList var1) {
      int var10 = var1.size();
      if (var10 == 0) {
         AlertDialog.Builder var28 = new AlertDialog.Builder(this);
         var28.setCancelable(false);
         var28.setTitle("PNJ 무료 충전소");
         var28.setMessage(this.G);
         var28.setPositiveButton("확인", new g(this));
         var28.show();
         this.F = true;
      } else {
         this.p.removeAllViews();
         LinearLayout var21 = this.p;
         Paint var22 = new Paint(1);
         Paint var23 = new Paint(1);
         var23.setFlags(var23.getFlags() | 32);
         Bitmap var20 = Bitmap.createBitmap(this.s, (int)(48.0F * this.r), Config.ARGB_4444);
         Canvas var24 = new Canvas(var20);
         var22.setTextSize(22.0F * this.r);
         var23.setTextSize(24.0F * this.r);
         var22.setColor(-2500135);
         var23.setColor(-2500135);
         int var9;
         int var11;
         int var12;
         int var13;
         int var14;
         int var15;
         int var16;
         int var17;
         int var18;
         if (this.s > this.t) {
            var12 = (int)var22.measureText("무료 어플을 설치하시면 ");
            var15 = (int)var23.measureText("PNJ");
            var13 = (int)var22.measureText("에서");
            var11 = (int)var23.measureText("게임머니");
            var14 = (int)var22.measureText("와 ");
            var9 = (int)var23.measureText("아이템");
            var16 = (int)var22.measureText("을 쏩니다!");
            var16 = this.s / 2 - (var16 + var12 + var15 + var13 + var11 + var14 + var9) / 2;
            var17 = (int)var22.getTextSize();
            var18 = (int)(48.0F * this.r) / 2;
            var17 = var17 / 2 + var18;
            var24.drawText("무료 어플을 설치하시면 ", (float)var16, (float)var17, var22);
            var23.setColor(-1);
            var24.drawText("PNJ", (float)(var16 + var12), (float)var17, var23);
            var23.setColor(-2500135);
            var24.drawText("에서", (float)(var16 + var12 + var15), (float)var17, var22);
            var24.drawText("게임머니", (float)(var16 + var12 + var15 + var13), (float)var17, var23);
            var24.drawText("와 ", (float)(var16 + var12 + var15 + var13 + var11), (float)var17, var22);
            var24.drawText("아이템", (float)(var16 + var12 + var15 + var13 + var11 + var14), (float)var17, var23);
            var24.drawText("을 쏩니다!", (float)(var16 + var12 + var15 + var13 + var11 + var14 + var9), (float)var17, var22);
         } else {
            var9 = (int)var22.measureText("무료 어플을 설치하시면 ");
            var14 = (int)var23.measureText("PNJ");
            var15 = (int)var22.measureText("에서");
            var12 = (int)var23.measureText("게임머니");
            var11 = (int)var22.measureText("와 ");
            var13 = (int)var23.measureText("아이템");
            var16 = (int)var22.measureText("을 쏩니다!");
            var15 = this.s / 2 - (var15 + var9 + var14) / 2;
            var16 = this.s / 2 - (var16 + var12 + var11 + var13) / 2;
            var18 = (int)var22.getTextSize();
            var17 = (int)var23.getTextSize() + var18;
            var24.drawText("무료 어플을 설치하시면 ", (float)var15, (float)var18, var22);
            var23.setColor(-1);
            var24.drawText("PNJ", (float)(var15 + var9), (float)var18, var23);
            var23.setColor(-2500135);
            var24.drawText("에서", (float)(var15 + var9 + var14), (float)var18, var22);
            var24.drawText("게임머니", (float)var16, (float)var17, var23);
            var24.drawText("와 ", (float)(var16 + var12), (float)var17, var22);
            var24.drawText("아이템", (float)(var16 + var12 + var11), (float)var17, var23);
            var24.drawText("을 쏩니다!", (float)(var16 + var12 + var11 + var13), (float)var17, var22);
         }

         ImageView var31 = new ImageView(this);
         var31.setLayoutParams(new ViewGroup.LayoutParams(-1, (int)(48.0F * this.r)));
         var31.setBackgroundColor(-14276048);
         var31.setImageDrawable(new BitmapDrawable(var20));
         var21.addView(var31);
         var22 = new Paint(1);
         var22.setTypeface(this.H);
         var22.setColor(-1);
         var22.setTextAlign(Align.LEFT);
         Paint var25 = new Paint(1);
         var25.setTypeface(this.H);
         var25.setColor(-8704);
         var25.setTextAlign(Align.RIGHT);
         var25.setFlags(var25.getFlags() | 32);
         var23 = new Paint(1);
         var23.setTypeface(this.I);
         var23.setColor(-8704);
         var23.setTextAlign(Align.RIGHT);
         var23.setFlags(var25.getFlags() | 32);
         var15 = (int)(40.0F * this.r);
         var14 = (int)(20.0F * this.r);
         var16 = (int)(25.0F * this.r);
         var17 = (int)(17.0F * this.r);
         var11 = (int)(28.0F * this.r);
         float var2 = this.r;
         float var4 = 7.0F * this.r;
         float var3 = 122.0F * this.r;
         float var5 = 122.0F * this.r;
         var13 = (int)(126.0F * this.r);
         var12 = (int)(88.0F * this.r);
         var22.setTextSize((float)var16);
         Rect var32 = new Rect();
         RectF var29 = new RectF();
         ImageButton[] var30 = new ImageButton[var10];
         if (this.s > this.t) {
            var16 = (int)(36.0F * this.r);
            var18 = (int)(23.0F * this.r);
            var17 = this.s / 6;
            var2 = (float)((double)(var17 / 2) - (double)var3 / 1.5);
            if (var2 < 0.0F) {
               var2 = 2.0F * this.r;
            }

            for(var9 = 0; var9 < var10; ++var9) {
               var30[var9] = new ImageButton(this);
               var30[var9].setLayoutParams(new ViewGroup.LayoutParams(-1, var12));
               Bitmap var35 = Bitmap.createBitmap(this.s, var13, Config.ARGB_4444);
               Canvas var33 = new Canvas(var35);
               if (((h)var1.get(var9)).a != null) {
                  var32.set(0, 0, ((h)var1.get(var9)).a.getWidth(), ((h)var1.get(var9)).a.getHeight());
                  var29.set(var2, var4, var2 + var3, var4 + var5);
                  var33.drawBitmap(((h)var1.get(var9)).a, var32, var29, var22);
               }

               var22.setTextSize((float)var16);
               float var10002 = (float)var17 + 20.0F * this.r;
               var33.drawText(((h)var1.get(var9)).b, var10002, 11.0F * this.r + (float)var16 + (float)var14, var22);
               var22.setTextSize((float)var18);
               var10002 = (float)var17 + 20.0F * this.r;
               var33.drawText(((h)var1.get(var9)).c, var10002, 11.0F * this.r + (float)var16 + (float)var18 + 10.0F + (float)var14, var22);
               var23.setTextSize((float)var11);
               int var19 = (int)(27.0F * this.r);
               String var34 = ((h)var1.get(var9)).f + " " + this.a;
               float var7 = (float)this.s;
               float var6 = this.r;
               float var8 = this.r;
               var33.drawText(var34, var7 - 30.0F * var6, (float)var19 + 11.0F * var8 + (float)var15, var23);
               var30[var9].setImageDrawable(new BitmapDrawable(var35));
               if (var9 % 2 == 0) {
                  var30[var9].setBackgroundDrawable(new BitmapDrawable(this.B));
               } else {
                  var30[var9].setBackgroundDrawable(new BitmapDrawable(this.C));
               }

               var30[var9].setId(var9);
               var30[var9].setOnClickListener(this.K);
               var30[var9].setOnTouchListener(this.J);
               this.p.addView(var30[var9]);
            }
         } else {
            var15 = this.s / 3;
            var2 = (float)((double)(var15 / 2) - (double)var3 / 1.5);

            for(var9 = 0; var9 < var10; ++var9) {
               var30[var9] = new ImageButton(this);
               var30[var9].setLayoutParams(new ViewGroup.LayoutParams(-1, var12));
               Bitmap var26 = Bitmap.createBitmap(this.s, var13, Config.ARGB_4444);
               Canvas var27 = new Canvas(var26);
               var32.set(0, 0, ((h)var1.get(var9)).a.getWidth(), ((h)var1.get(var9)).a.getHeight());
               var29.set(var2, var4, var2 + var3, var4 + var5);
               var27.drawBitmap(((h)var1.get(var9)).a, var32, var29, var22);
               var22.setTextSize((float)var16);
               var27.drawText(((h)var1.get(var9)).b, (float)var15, 5.0F * this.r + (float)var16 + (float)var14, var22);
               var22.setTextSize((float)var17);
               var25.setTextAlign(Align.LEFT);
               var27.drawText(((h)var1.get(var9)).c, (float)var15, 5.0F * this.r + (float)var16 + (float)var17 + 10.0F + (float)var14, var22);
               var23.setTextSize((float)var11);
               var23.setTextAlign(Align.LEFT);
               var27.drawText(((h)var1.get(var9)).f + " " + this.a, (float)var15, 11.0F * this.r + (float)var16 + (float)var17 + (float)var11 + 10.0F + (float)var14, var23);
               var30[var9].setImageDrawable(new BitmapDrawable(var26));
               if (var9 % 2 == 0) {
                  var30[var9].setBackgroundDrawable(new BitmapDrawable(this.B));
               } else {
                  var30[var9].setBackgroundDrawable(new BitmapDrawable(this.C));
               }

               var30[var9].setId(var9);
               var30[var9].setOnClickListener(this.K);
               var30[var9].setOnTouchListener(this.J);
               this.p.addView(var30[var9]);
            }
         }

         this.p.invalidate();
      }

   }

   public static boolean a(int var0, int var1, int var2, int var3, int var4) {
      boolean var5;
      if (var0 > var2 && var0 < var2 + var3 && var1 > 11 && var1 < var4 + 11) {
         var5 = true;
      } else {
         var5 = false;
      }

      return var5;
   }

   private Bitmap b(String var1) {
      Bitmap var4;
      try {
         InputStream var2 = this.getAssets().open(var1);
         var4 = BitmapFactory.decodeStream(var2);
         var2.close();
      } catch (Exception var3) {
         var4 = null;
      }

      return var4;
   }

   // $FF: synthetic method
   static Drawable b(Pnjtnk var0, int var1) {
      BitmapDrawable var2;
      if (var1 % 2 == 0) {
         var2 = new BitmapDrawable(var0.B);
      } else {
         var2 = new BitmapDrawable(var0.C);
      }

      return var2;
   }

   private static String b(URL var0) {
      String var12;
      IOException var10000;
      label33: {
         BufferedReader var1;
         InputStreamReader var2;
         StringBuffer var3;
         HttpURLConnection var4;
         BufferedInputStream var10;
         boolean var10001;
         try {
            var4 = (HttpURLConnection)var0.openConnection();
            var4.setConnectTimeout(50000);
            var4.setReadTimeout(50000);
            var4.setUseCaches(false);
            var10 = new BufferedInputStream(var4.getInputStream());
            var2 = new InputStreamReader(var10, Charset.forName("EUC-KR"));
            var1 = new BufferedReader(var2);
            var3 = new StringBuffer();
         } catch (IOException var9) {
            var10000 = var9;
            var10001 = false;
            break label33;
         }

         while(true) {
            String var5;
            try {
               var5 = var1.readLine();
            } catch (IOException var7) {
               var10000 = var7;
               var10001 = false;
               break;
            }

            if (var5 == null) {
               try {
                  var1.close();
                  var2.close();
                  var10.close();
                  var4.disconnect();
                  var12 = var3.toString();
                  return var12;
               } catch (IOException var6) {
                  var10000 = var6;
                  var10001 = false;
                  break;
               }
            }

            try {
               var3.append(var5);
            } catch (IOException var8) {
               var10000 = var8;
               var10001 = false;
               break;
            }
         }
      }

      IOException var11 = var10000;
      var11.printStackTrace();
      var12 = null;
      return var12;
   }

   private void b() {
      List var4 = this.getPackageManager().getInstalledPackages(8192);
      int var2 = var4.size();
      this.d = new String[var2];

      for(int var1 = 0; var1 < var2; ++var1) {
         String var3 = ((PackageInfo)var4.get(var1)).packageName;
         this.d[var1] = var3;
      }

   }

   private void c() {
      byte var5 = 0;

      String var7;
      URL var33;
      try {
         var33 = new URL("http://wap.pnjmobile.co.kr/PNJ_Coin/Fishing4_FlatFish_Free_Coin/index.php?mode=benefit");
         var7 = b(var33);
      } catch (MalformedURLException var29) {
         var29.printStackTrace();
         var7 = null;
      } catch (IOException var30) {
         var30.printStackTrace();
         var7 = null;
      }

      if (var7.equals("y")) {
         this.w = true;
      } else {
         this.w = false;
      }

      String var14 = com.pnjmobile.tnk.a.b();

      URL var8;
      try {
         StringBuilder var35 = new StringBuilder("http://wap.pnjmobile.co.kr/PNJ_Coin/Fishing4_FlatFish_Free_Coin/index.php?mode=packge&phoneNum=");
         var8 = new URL(var35.append(this.n).append("&packageName=").append(var14).toString());
         var7 = b(var8);
      } catch (MalformedURLException var27) {
         var27.printStackTrace();
         var7 = null;
      } catch (IOException var28) {
         var28.printStackTrace();
         var7 = null;
      }

      String var9;
      StringBuilder var34;
      try {
         var34 = new StringBuilder("http://wap.pnjmobile.co.kr/PNJ_Coin/Fishing4_FlatFish_Free_Coin/index.php?mode=gamename&phoneNum=");
         URL var36 = new URL(var34.append(this.n).append("&packageName=").append(var14).toString());
         var9 = b(var36);
      } catch (IOException var26) {
         var26.printStackTrace();
         var9 = null;
      }

      String var10;
      try {
         var34 = new StringBuilder("http://wap.pnjmobile.co.kr/PNJ_Coin/Fishing4_FlatFish_Free_Coin/index.php?mode=coin&phoneNum=");
         URL var38 = new URL(var34.append(this.n).append("&packageName=").append(var14).toString());
         var10 = b(var38);
      } catch (IOException var25) {
         var25.printStackTrace();
         var10 = null;
      }

      String var11;
      try {
         StringBuilder var41 = new StringBuilder("http://wap.pnjmobile.co.kr/PNJ_Coin/Fishing4_FlatFish_Free_Coin/index.php?mode=caption&phoneNum=");
         var8 = new URL(var41.append(this.n).append("&packageName=").append(var14).toString());
         var11 = b(var8);
      } catch (IOException var24) {
         var24.printStackTrace();
         var11 = null;
      }

      String var12;
      try {
         StringBuilder var42 = new StringBuilder("http://wap.pnjmobile.co.kr/PNJ_Coin/Fishing4_FlatFish_Free_Coin/index.php?mode=icon&phoneNum=");
         var8 = new URL(var42.append(this.n).append("&packageName=").append(var14).toString());
         var12 = b(var8);
      } catch (IOException var23) {
         var23.printStackTrace();
         var12 = null;
      }

      String var13;
      try {
         StringBuilder var43 = new StringBuilder("http://wap.pnjmobile.co.kr/PNJ_Coin/Fishing4_FlatFish_Free_Coin/index.php?mode=link&phoneNum=");
         var8 = new URL(var43.append(this.n).append("&packageName=").append(var14).toString());
         var13 = b(var8);
      } catch (IOException var22) {
         var22.printStackTrace();
         var13 = null;
      }

      String var37;
      try {
         StringBuilder var15 = new StringBuilder("http://wap.pnjmobile.co.kr/PNJ_Coin/Fishing4_FlatFish_Free_Coin/index.php?mode=exchangerate&packageName=");
         var8 = new URL(var15.append(var14).toString());
         var37 = b(var8);
      } catch (MalformedURLException var20) {
         var20.printStackTrace();
         var37 = null;
      } catch (IOException var21) {
         var21.printStackTrace();
         var37 = null;
      }

      try {
         StringBuilder var16 = new StringBuilder("http://wap.pnjmobile.co.kr/PNJ_Coin/Fishing4_FlatFish_Free_Coin/index.php?mode=exchangerate_unit&packageName=");
         URL var44 = new URL(var16.append(var14).toString());
         this.a = b(var44);
      } catch (MalformedURLException var18) {
         var18.printStackTrace();
      } catch (IOException var19) {
         var19.printStackTrace();
      }

      if (var7 != null && !var7.equals("")) {
         this.e = var7.split("#");
         this.f = var9.split("#");
         this.g = var10.split("#");
         this.h = var11.split("#");
         this.i = var12.split("#");
         this.k = var13.split("#");
         int var6 = this.e.length;
         int var4 = this.d.length;
         this.j = new Bitmap[var4];
         this.l.clear();
         int var2;
         if (var37 != null) {
            this.x = Float.parseFloat(var37);

            for(var2 = 0; var2 < var6; ++var2) {
               float var1 = Float.parseFloat(this.g[var2]);
               this.g[var2] = String.valueOf((int)(var1 * this.x));
            }
         }

         int var3;
         for(var2 = 0; var2 < var6; ++var2) {
            for(var3 = 0; var3 < var4; ++var3) {
               if (this.e[var2].equals(this.d[var3])) {
                  this.l.add(var2);
               }
            }
         }

         for(var2 = 0; var2 < var6; ++var2) {
            if (this.l.size() <= 0) {
               this.j[var2] = a(this.i[var2]);
               if (this.j[var2] == null) {
                  --var2;
               }
            } else {
               boolean var31 = false;

               for(var4 = 0; var4 < this.l.size(); ++var4) {
                  if (var2 == (Integer)this.l.get(var4)) {
                     var31 = true;
                  }
               }

               if (!var31) {
                  this.j[var2] = a(this.i[var2]);
                  if (this.j[var2] == null) {
                     --var2;
                  }
               }
            }
         }

         this.m.clear();

         for(var3 = 0; var3 < this.e.length; ++var3) {
            h var40;
            if (this.l.size() <= 0) {
               var40 = new h(this.j[var3], this.f[var3], this.h[var3], this.k[var3], this.e[var3], this.g[var3]);
               this.m.add(var40);
            } else {
               boolean var32 = false;

               for(var4 = 0; var4 < this.l.size(); ++var4) {
                  if (var3 == (Integer)this.l.get(var4)) {
                     var32 = true;
                  }
               }

               if (!var32) {
                  var40 = new h(this.j[var3], this.f[var3], this.h[var3], this.k[var3], this.e[var3], this.g[var3]);
                  this.m.add(var40);
               }
            }
         }

         for(var2 = var5; var2 < this.m.size(); ++var2) {
            try {
               var34 = new StringBuilder("http://wap.pnjmobile.co.kr/PNJ_Coin/Fishing4_FlatFish_Free_Coin/index.php?mode=log_advertiser&packageName=");
               var33 = new URL(var34.append(((h)this.m.get(var2)).e).append("&countKind=view_count").toString());
               b(var33);
            } catch (IOException var17) {
               var17.printStackTrace();
            }
         }

         this.a(this.m);
      } else {
         AlertDialog.Builder var39 = new AlertDialog.Builder(this);
         var39.setCancelable(false);
         var39.setTitle("PNJ 무료 충전소");
         var39.setMessage(this.G);
         var39.setPositiveButton("확인", new f(this));
         var39.show();
         this.F = true;
      }

   }

   private void d() {
      int var4 = this.e.length;
      int var3 = this.d.length;
      this.l.clear();

      int var2;
      for(int var1 = 0; var1 < var4; ++var1) {
         for(var2 = 0; var2 < var3; ++var2) {
            if (this.e[var1].equals(this.d[var2])) {
               this.l.add(var1);
            }
         }
      }

      this.m.clear();

      for(var2 = 0; var2 < this.e.length; ++var2) {
         h var5;
         if (this.l.size() <= 0) {
            var5 = new h(this.j[var2], this.f[var2], this.h[var2], this.k[var2], this.e[var2], this.g[var2]);
            this.m.add(var5);
         } else {
            boolean var6 = false;

            for(var3 = 0; var3 < this.l.size(); ++var3) {
               if (var2 == (Integer)this.l.get(var3)) {
                  var6 = true;
               }
            }

            if (!var6) {
               var5 = new h(this.j[var2], this.f[var2], this.h[var2], this.k[var2], this.e[var2], this.g[var2]);
               this.m.add(var5);
            }
         }
      }

      this.a(this.m);
   }

   public void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      int var2;
      if (var1.orientation == 2) {
         var2 = this.s;
         this.s = this.t;
         this.t = var2;
         this.A = this.b("bg_top_w.png");
         this.B = this.b("list_light_w.png");
         this.C = this.b("list_dark_w.png");
         this.D = this.b("list_light_w_t.png");
         this.E = this.b("list_dark_w_t.png");
         this.q.removeAllViews();
         this.q = this.a();
         this.q.addView(this.o);
         this.setContentView(this.q);
         if (this.e.length == 0) {
            this.c();
         } else {
            this.d();
         }
      } else if (var1.orientation == 1) {
         var2 = this.s;
         this.s = this.t;
         this.t = var2;
         this.A = this.b("bg_top_h.png");
         this.B = this.b("list_light_h.png");
         this.C = this.b("list_dark_h.png");
         this.D = this.b("list_light_h_t.png");
         this.E = this.b("list_dark_h_t.png");
         this.q.removeAllViews();
         this.q = this.a();
         this.q.addView(this.o);
         this.setContentView(this.q);
         if (this.e.length == 0) {
            this.c();
         } else {
            this.d();
         }
      }

   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      ConnectivityManager var3 = (ConnectivityManager)this.getSystemService("connectivity");
      NetworkInfo var4 = var3.getNetworkInfo(0);
      NetworkInfo var8 = var3.getNetworkInfo(1);
      boolean var2;
      if (!var4.isConnected() && !var8.isConnected()) {
         var2 = false;
      } else {
         var2 = true;
      }

      if (!var2) {
         com.pnjmobile.tnk.a.a();
         Toast.makeText(this, "네트워크 연결 상태 확인 후 다시 시도해 주십시오", 0).show();
         this.finish();
      } else {
         Window var5 = this.getWindow();
         var5.addFlags(128);
         var5.setFlags(1024, 1024);
         this.requestWindowFeature(1);
         this.requestWindowFeature(2);
         DisplayMetrics var6 = new DisplayMetrics();
         ((WindowManager)this.getSystemService("window")).getDefaultDisplay().getMetrics(var6);
         this.H = Typeface.createFromAsset(this.getAssets(), "sunchun.ttf");
         this.I = Typeface.createFromAsset(this.getAssets(), "af.ttf.png");
         this.r = var6.density;
         this.s = (int)((float)var6.widthPixels * this.r);
         this.t = (int)((float)var6.heightPixels * this.r);
         this.y = this.b("btn_back.png");
         this.z = this.b("btn_question.png");
         if (this.s > this.t) {
            this.A = this.b("bg_top_w.png");
            this.B = this.b("list_light_w.png");
            this.C = this.b("list_dark_w.png");
            this.D = this.b("list_light_w_t.png");
            this.E = this.b("list_dark_w_t.png");
         } else {
            this.A = this.b("bg_top_h.png");
            this.B = this.b("list_light_h.png");
            this.C = this.b("list_dark_h.png");
            this.D = this.b("list_light_h_t.png");
            this.E = this.b("list_dark_h_t.png");
         }

         this.u = (int)(72.0F * this.r);
         this.o = new ScrollView(this);
         this.o.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
         this.o.setScrollbarFadingEnabled(true);
         this.p = new LinearLayout(this);
         this.p.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
         this.p.setOrientation(1);
         this.o.addView(this.p);
         this.o.setBackgroundColor(-14276048);
         this.q = this.a();
         this.q.addView(this.o);
         this.setContentView(this.q);
         this.n = ((TelephonyManager)this.getSystemService("phone")).getLine1Number();
         if (this.n.length() == 13) {
            String var7 = this.n.substring(3);
            this.n = "0" + var7;
         }

         this.b();
         this.c();
         com.pnjmobile.tnk.a.a();
      }

   }

   protected void onDestroy() {
      byte var2 = 0;
      if (this.j != null) {
         int var1;
         for(var1 = 0; var1 < this.j.length; ++var1) {
            if (this.j[var1] != null) {
               this.j[var1].recycle();
               this.j[var1] = null;
            }
         }

         for(var1 = var2; var1 < this.m.size(); ++var1) {
            if (((h)this.m.get(var1)).a != null) {
               ((h)this.m.get(var1)).a.recycle();
               ((h)this.m.get(var1)).a = null;
            }
         }

         this.m.clear();
      }

      if (this.y != null) {
         this.y.recycle();
         this.y = null;
      }

      if (this.z != null) {
         this.z.recycle();
         this.z = null;
      }

      if (this.A != null) {
         this.A.recycle();
         this.A = null;
      }

      if (this.B != null) {
         this.B.recycle();
         this.B = null;
      }

      if (this.C != null) {
         this.C.recycle();
         this.C = null;
      }

      if (this.D != null) {
         this.D.recycle();
         this.D = null;
      }

      if (this.E != null) {
         this.E.recycle();
         this.E = null;
      }

      super.onDestroy();
   }

   protected void onResume() {
      this.b();
      if (!this.F) {
         int var4 = this.e.length;
         int var3 = this.d.length;
         this.l.clear();

         int var2;
         for(int var1 = 0; var1 < var4; ++var1) {
            for(var2 = 0; var2 < var3; ++var2) {
               if (this.e[var1].equals(this.d[var2])) {
                  this.l.add(var1);
                  if (!this.w) {
                     if (this.c != null && this.c.equals(this.e[var1])) {
                        a(this.n, this.b, this.c);
                     }
                  } else {
                     a(this.n, this.g[var1], this.e[var1]);
                  }
               }
            }
         }

         this.m.clear();

         for(var2 = 0; var2 < this.e.length; ++var2) {
            h var5;
            if (this.l.size() <= 0) {
               var5 = new h(this.j[var2], this.f[var2], this.h[var2], this.k[var2], this.e[var2], this.g[var2]);
               this.m.add(var5);
            } else {
               boolean var6 = false;

               for(var3 = 0; var3 < this.l.size(); ++var3) {
                  if (var2 == (Integer)this.l.get(var3)) {
                     var6 = true;
                  }
               }

               if (!var6) {
                  var5 = new h(this.j[var2], this.f[var2], this.h[var2], this.k[var2], this.e[var2], this.g[var2]);
                  this.m.add(var5);
               }
            }
         }

         this.a(this.m);
      }

      super.onResume();
   }
}

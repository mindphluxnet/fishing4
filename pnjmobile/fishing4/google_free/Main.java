package pnjmobile.fishing4.google_free;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.android.FacebookMainView;

import fishing4.a.SaveLoadManager;
import fishing4.game.AgreementView;
import fishing4.game.am;
import fishing4.game.aw;
import fishing4.game.globalConfig;
import fishing4.game.OptionsManager;
import fishing4.game.userIDview;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main extends Activity implements View.OnTouchListener, com.tapjoy.ab, com.tapjoy.p, com.tapjoy.s, Runnable {
   static LinearLayout A = null;
   static View B;
   static boolean C;
   static Thread H = null;
   static Thread I = null;
   public static Handler K = new ag();
   public static Handler L = new ah();
   public static Handler M = new aj();
   public static Handler N = new ak();
   public static Handler O = new al();
   static Thread Q = null;
   public static Thread R = null;
   private static final byte[] W = new byte[]{-46, 65, 30, -128, -103, -57, 74, -64, 51, 88, -95, -45, 77, -117, -36, -113, -11, 32, -64, 89};
   public static AlertDialog a;
   public static Handler b;
   public static BillingService c;
   public static boolean isPaused = false;
   public static boolean e = true;
   static boolean h;
   public static int i;
   public static int j;
   public static int k;
   public static int l;
   public static boolean m = false;
   public static String n;
   public static DecimalFormat o = new DecimalFormat("###0.0#");
   public static boolean s = false;
   public static boolean t = false;
   public static Context context;
   public static boolean w = false;
   static View view;
   static RelativeLayout z;
   LinearLayout.LayoutParams D;
   final Runnable E = new l(this);
   i F;
   j G;
   public Handler J = new v(this);
   DialogInterface.OnKeyListener P = new an(this);
   fishing4.a.ab S;
   private GLSurfaceView glSurfaceView;
   private Handler U;
   private ao V;
   private com.android.vending.licensing.g X = null;
   private String Y = "OA00273096";
   private String Z = "AQ00001110";
   private boolean aa = false;
   private int ab;
   private boolean isLoading = true;
   private Handler ad = new ai(this);
   final String f = "0faf65f6-b8ba-4387-8184-075214d63502";
   final String g = "6ahYoU1UCshal8OTIkyk";
   final int p = 101;
   final int q = 101;
   final String r = "sBNR003167";
   SaveLoadManager saveLoadManager = null;
   boolean y = false;

   private static String readFromUrl(URL url) {
      String result;
      IOException ioException;
      label33: {
         BufferedReader bufferedReader;
         StringBuffer stringBuffer;
         InputStreamReader reader;
         HttpURLConnection urlConnection;
         BufferedInputStream inputStream;
         boolean var10001;
         try {
            urlConnection = (HttpURLConnection)url.openConnection();
            urlConnection.setConnectTimeout(3000);
            urlConnection.setReadTimeout(3000);
            urlConnection.setUseCaches(false);
            inputStream = new BufferedInputStream(urlConnection.getInputStream());
            reader = new InputStreamReader(inputStream, Charset.forName("EUC-KR"));
            bufferedReader = new BufferedReader(reader);
            stringBuffer = new StringBuffer();
         } catch (IOException ex) {
            ioException = ex;
            var10001 = false;
            break label33;
         }

         while(true) {
            String input;
            try {
               input = bufferedReader.readLine();
            } catch (IOException ex) {
               ioException = ex;
               var10001 = false;
               break;
            }

            if (input == null) {
               try {
                  bufferedReader.close();
                  reader.close();
                  inputStream.close();
                  urlConnection.disconnect();
                  result = stringBuffer.toString();
                  return result;
               } catch (IOException ex) {
                  ioException = ex;
                  var10001 = false;
                  break;
               }
            }

             stringBuffer.append(input);
         }
      }

      IOException exception = ioException;
      exception.printStackTrace();
      result = null;
      return result;
   }

   public static void openPlayStoreLink() {
      globalConfig.m = false;
      ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
      if (connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting()) {
         context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://wap.pnjmobile.co.kr/Link/Google_play/?game=Fish4_google_fullversion")));
      } else {
         String var1;
         if (globalConfig.languageId == 0) {
            var1 = "인터넷 연결 상태를 확인하세요.";
         } else {
            var1 = "Check network connection.";
         }

         Toast.makeText(context, var1, 0).show();
      }

   }

   // $FF: synthetic method
   static void a(Main var0) {
      if (var0.y) {
         A.removeAllViews();
         A.addView(view, 0);
         if (C) {
            z.removeView(B);
            C = false;
         } else {
            z.addView(B, 0, new LinearLayout.LayoutParams(-1, -1));
            C = true;
         }
      }

   }

   // $FF: synthetic method
   static void b(Main var0) {
      var0.isLoading = false;
   }

   // $FF: synthetic method
   static boolean c(Main var0) {
      return var0.isLoading;
   }

   // $FF: synthetic method
   static Handler d(Main var0) {
      return var0.ad;
   }

   public static void d() {
      if (z != null) {
         M.sendEmptyMessage(0);
      }

   }

   static void postGoogleAttendanceLog(int gold) {
      byte[] var4 = fishing4.a.r.phoneNumber.getBytes();
      byte[] deviceIdBytes = fishing4.a.r.deviceId.getBytes();

      int i;
      for(i = 0; i < var4.length; ++i) {
         var4[i] = (byte)(var4[i] ^ 1559);
      }

      for(i = 0; i < deviceIdBytes.length; ++i) {
         deviceIdBytes[i] = (byte)(deviceIdBytes[i] ^ 1559);
      }

      String date = "";

      URL url;
      String input;
      label51: {
         try {
            url = new URL("http://www.pnjmobile.com/pnj_time/time.php");
            input = readFromUrl(url);
         } catch (IOException ex) {
            ex.printStackTrace();
            break label51;
         }

         date = input;
      }

      input = "";

      for(i = 0; i < fishing4.a.r.phoneNumber.length(); ++i) {
         input = input + var4[i];
      }

      i = 0;

      String deviceId;
      for(deviceId = ""; i < fishing4.a.r.deviceId.length(); ++i) {
         deviceId = deviceId + deviceIdBytes[i];
      }

      String language;
      if (globalConfig.languageId == 0) {
         language = "ko";
      } else {
         language = "en";
      }

      date = "http://wap.pnjmobile.co.kr/GameUserDataLog/Fishing4/Google/Fishing4_Google_attendance_Log.php?p=" + input + "&m=" + deviceId + "&attendance_day=" + l + "&gold=" + gold + "&d_day=" + date + "&location=" + language;

      try {
         url = new URL(date);
         fishing4.a.y.postToUrl(url);
         StringBuilder sb = new StringBuilder("sms30:");
         Log.i("", sb.append(date.toString()).toString());
      } catch (IOException ex) {
         ex.printStackTrace();
      }

   }

   public static void e() {
      if (z != null) {
         N.sendEmptyMessage(0);
      }

   }

   public static void k() {
      fishing4.game.k.l();
      if (fishing4.game.aq.b >= 10 && fishing4.game.aq.b <= 15) {
         l();
      } else if (fishing4.game.aq.b == 16) {
         l();
      }

      if (fishing4.game.aq.b != 3 && fishing4.game.aq.b != 4 && fishing4.game.aq.b != 5 && fishing4.game.aq.b != 2 && fishing4.game.aq.b != 20 && fishing4.game.aq.b != 21 && fishing4.game.l.d != 12 && fishing4.game.l.d != 55 && fishing4.game.l.d != 56 && fishing4.game.l.d != 57 && fishing4.game.l.d != 58 && fishing4.game.l.d != 59) {
         if (fishing4.game.aq.b != 17 && fishing4.game.aq.b != 18) {
            if ((fishing4.game.aq.b == 16 || fishing4.game.aq.b >= 10 && fishing4.game.aq.b <= 15) && fishing4.game.z.b() == 3 && (fishing4.game.bg.b == 71 || fishing4.game.bg.b == 76)) {
               fishing4.game.bg.d = 1;
            } else if ((fishing4.game.aq.b == 16 || fishing4.game.aq.b >= 10 && fishing4.game.aq.b <= 15) && fishing4.game.z.b() == 3 && fishing4.game.bg.b == 20) {
               fishing4.game.bg.d = 1;
            } else {
               fishing4.game.aq.d = 1;
            }
         } else {
            fishing4.game.bg.d = 1;
         }
      } else {
         fishing4.game.aw.o = 1;
      }

   }

   public static void l() {
      int var0 = 0;
      if (fishing4.game.aq.b == 3) {
         fishing4.game.k.a((int)20);
      } else if (fishing4.game.aq.b == 4) {
         fishing4.game.k.a((int)21);
      } else if (fishing4.game.aq.b == 5) {
         fishing4.game.k.a((int)22);
      } else if (fishing4.game.aq.b == 10) {
         fishing4.game.k.a((int)1001);
      } else if (fishing4.game.aq.b == 11) {
         fishing4.game.k.a((int)1002);
      } else if (fishing4.game.aq.b == 12) {
         fishing4.game.k.a((int)1003);
      } else if (fishing4.game.aq.b == 13) {
         fishing4.game.k.a((int)1004);
      } else if (fishing4.game.aq.b == 14) {
         fishing4.game.k.a((int)1005);
      } else if (fishing4.game.aq.b == 15) {
         fishing4.game.k.a((int)1006);
      } else if (fishing4.game.aq.b == 16) {
         fishing4.game.k.a((int)9000);
      } else if (fishing4.game.aq.b == 17) {
         fishing4.game.k.a((int)29);
      } else if (fishing4.game.aq.b == 18) {
         fishing4.game.k.a((int)30);
      } else if (fishing4.game.aw.p != -1) {
         if (fishing4.game.aw.p >= 101 && fishing4.game.aw.p <= 119) {
            fishing4.game.k.a((int)23);
         } else if (fishing4.game.aw.p >= 301 && fishing4.game.aw.p <= 309) {
            fishing4.game.k.a((int)24);
         } else {
            switch (fishing4.game.aw.p) {
               case 120:
                  fishing4.game.k.a((int)1);
                  break;
               case 121:
                  fishing4.game.k.a((int)2);
                  break;
               case 122:
                  fishing4.game.k.a((int)3);
                  break;
               case 507:
                  fishing4.game.k.a((int)6);
                  break;
               case 508:
                  fishing4.game.k.a((int)7);
                  break;
               case 607:
                  fishing4.game.k.a((int)4);
                  break;
               case 608:
                  fishing4.game.k.a((int)5);
                  break;
               case 707:
                  fishing4.game.k.a((int)8);
                  break;
               case 708:
                  fishing4.game.k.a((int)9);
            }
         }
      } else if (fishing4.game.aq.c != null) {
         fishing4.game.k.a(fishing4.game.aq.c[fishing4.game.az.k].a);
      }

      if (fishing4.game.aq.b != 3 && fishing4.game.aq.b != 4 && fishing4.game.aq.b != 5) {
         if ((fishing4.game.aq.b < 10 || fishing4.game.aq.b > 15) && fishing4.game.aq.b != 16) {
            if (fishing4.game.aq.b == 17) {
               if (fishing4.game.bg.b == 72) {
                  for(var0 = 0; var0 < fishing4.game.ad.h.size(); ++var0) {
                     if (((fishing4.game.ag)fishing4.game.ad.h.get(var0)).a() == 88) {
                        ((fishing4.game.ag)fishing4.game.ad.h.get(var0)).k();
                     }
                  }
               } else if (fishing4.game.bg.b == 77) {
                  for(var0 = 0; var0 < fishing4.game.ad.h.size(); ++var0) {
                     if (((fishing4.game.ag)fishing4.game.ad.h.get(var0)).a() == 88) {
                        ((fishing4.game.ag)fishing4.game.ad.h.get(var0)).i();
                     }
                  }
               }
            } else if (fishing4.game.aq.b == 18) {
               fishing4.game.bg.a().g();
               fishing4.game.am.i = 2131034116;
            } else if (fishing4.game.l.d == 55) {
               fishing4.game.ad.i.add(fishing4.game.ac.b(fishing4.game.aw.p, fishing4.game.aw.q));
            } else if (fishing4.game.l.d == 56) {
               fishing4.game.ad.k.add(fishing4.game.ac.b(fishing4.game.aw.p, fishing4.game.aw.q));
            } else if (fishing4.game.l.d == 57) {
               fishing4.game.ad.m.add(fishing4.game.ac.a(fishing4.game.aw.p, 1));
            } else if (fishing4.game.l.d == 58) {
               fishing4.game.ad.l.add(fishing4.game.ac.a(fishing4.game.aw.p, 1));
            } else if (fishing4.game.l.d == 59) {
               fishing4.game.ad.n.add(fishing4.game.ac.a(fishing4.game.aw.p, 1));
            } else if (fishing4.game.aq.c != null) {
               if (fishing4.game.aq.c[fishing4.game.az.k].b[0] == 50) {
                  ((fishing4.game.ag)fishing4.game.ad.h.get(fishing4.game.az.p)).m();
               } else if (fishing4.game.aq.c[fishing4.game.az.k].d == 60) {
                  fishing4.game.ad.o.c(20000L);
               } else if (fishing4.game.aq.c[fishing4.game.az.k].d == 61) {
                  fishing4.game.ad.o.c(1000000L);
               } else if (fishing4.game.aq.c[fishing4.game.az.k].d == 62) {
                  fishing4.game.ad.o.c(5000000L);
               } else if (fishing4.game.aq.c[fishing4.game.az.k].d != 63) {
                  while(var0 < 5 && fishing4.game.aq.c[fishing4.game.az.k].b[var0] != -1) {
                     fishing4.game.ad.a(fishing4.game.aq.c[fishing4.game.az.k].b[var0], (long)fishing4.game.aq.c[fishing4.game.az.k].c[var0], true);
                     ++var0;
                  }
               } else {
                  fishing4.game.ad.o.c(10000000L);
               }
            }
         }
      } else if (fishing4.game.ad.c == -1) {
         fishing4.game.ad.j.add(fishing4.game.ac.a(fishing4.game.aw.p, 1));
         fishing4.game.ad.c = fishing4.game.ad.j.size() - 1;
      } else {
         ((fishing4.game.ac)fishing4.game.ad.j.get(fishing4.game.ad.c)).a(1L);
      }

      if (fishing4.game.aq.b != 3 && fishing4.game.aq.b != 4 && fishing4.game.aq.b != 5) {
         if (fishing4.game.aq.b >= 10 && fishing4.game.aq.b <= 15) {
            fishing4.game.am.a(182);
         } else if (fishing4.game.aq.b == 16) {
            fishing4.game.am.a(181);
         } else if (fishing4.game.aq.b != 17 && fishing4.game.aq.b != 18) {
            if (fishing4.game.l.d == 55) {
               fishing4.game.l.a(60);
            } else if (fishing4.game.l.d == 56) {
               fishing4.game.l.a(60);
            } else if (fishing4.game.l.d == 57) {
               fishing4.game.l.a(60);
            } else if (fishing4.game.l.d == 58) {
               fishing4.game.l.a(60);
            } else if (fishing4.game.l.d == 59) {
               fishing4.game.l.a(60);
            } else {
               fishing4.game.am.a(72);
            }
         }
      } else {
         fishing4.game.l.a(13);
      }

      if (fishing4.game.aq.b >= 10 && fishing4.game.aq.b <= 15) {
         fishing4.game.q.c(20);
      }

      fishing4.game.k.f();
   }

   // $FF: synthetic method
   static int m() {
      short var0 = 0;
      if (l == 1) {
         var0 = 600;
      } else if (l == 2) {
         var0 = 1800;
      } else if (l == 3) {
         var0 = 3800;
      } else if (l == 4) {
         var0 = 6500;
      } else if (l == 5) {
         var0 = 10000;
      }

      return var0;
   }

   // $FF: synthetic method
   static void n() {
      o();
   }

   private static void o() {
      long var5 = 0L;

      try {
         URL var9 = new URL("http://www.pnjmobile.com/pnj_time/time.php");
         n = readFromUrl(var9);
      } catch (IOException var21) {
         var21.printStackTrace();
         return;
      }

      if (n != null) {
         int var2 = Integer.parseInt(n.substring(0, 4));
         int var0 = Integer.parseInt(n.substring(4, 6));
         int var1 = Integer.parseInt(n.substring(6, 8));
         if (i != var2 || j != var0 || k != var1) {
            m = true;
            SimpleDateFormat var11 = new SimpleDateFormat("yyyy-MM-dd");

            long var3;
            label91: {
               long var7;
               label90: {
                  ParseException var25;
                  label105: {
                     StringBuilder var10;
                     StringBuilder var12;
                     ParseException var10000;
                     boolean var10001;
                     StringBuilder var22;
                     String var23;
                     String var24;
                     label88: {
                        label106: {
                            var22 = new StringBuilder();
                            var23 = var22.append(j).toString();
                            var10 = new StringBuilder();
                            var24 = var10.append(k).toString();

                            if (j < 10) {
                               var22 = new StringBuilder("0");
                               var23 = var22.append(j).toString();
                            }

                            if (k < 10) {
                               var10 = new StringBuilder("0");
                               var24 = var10.append(k).toString();
                            }

                            try {
                              var12 = new StringBuilder(String.valueOf(i));
                              var3 = var11.parse(var12.append("-").append(var23).append("-").append(var24).toString()).getTime();
                              break label88;
                           } catch (ParseException var17) {
                              var10000 = var17;
                              var10001 = false;
                           }
                        }

                        var25 = var10000;
                        var3 = 0L;
                        break label105;
                     }

                     label107: {
                         var22 = new StringBuilder();
                         var23 = var22.append(var0).toString();
                         var10 = new StringBuilder();
                         var24 = var10.append(var1).toString();

                         if (var0 < 10) {
                             var22 = new StringBuilder("0");
                             var23 = var22.append(var0).toString();
                         }

                        if (var1 < 10) {
                            var10 = new StringBuilder("0");
                            var24 = var10.append(var1).toString();
                        }

                        try {
                           var12 = new StringBuilder(String.valueOf(var2));
                           var7 = var11.parse(var12.append("-").append(var23).append("-").append(var24).toString()).getTime();
                           break label90;
                        } catch (ParseException var13) {
                           var10000 = var13;
                           var10001 = false;
                        }
                     }

                     var25 = var10000;
                  }

                  var25.printStackTrace();
                  break label91;
               }

               var5 = var7;
            }

            if ((var5 - var3) / 86400000L == 1L) {
               ++l;
            } else {
               l = 1;
            }
         }

         if (var2 != 0) {
            i = var2;
            j = var0;
            k = var1;
         }
      }

   }

   public final void a(int var1) {
      Log.i("", "sms50:서버에서 받은 텝코인.. :" + var1);
      if (var1 > 0) {
         if (Q == null) {
            this.S = new fishing4.a.ab(var1);
            Q = new Thread(this.S);
         }

         if (!this.S.C) {
            this.S.b(var1);
            Q.start();
         }
      }

   }

   public final void a(View var1) {
      view = var1;
      int var3 = var1.getLayoutParams().width;
      int var5 = view.getLayoutParams().height;
      int var4 = this.getWindowManager().getDefaultDisplay().getWidth();
      this.getWindowManager().getDefaultDisplay().getHeight();
      int var2 = var4;
      if (var4 > var3) {
         var2 = var3;
      }

      this.D = new LinearLayout.LayoutParams(-1, var2 * var5 / var3);
      view.setLayoutParams(this.D);
      this.y = true;
      this.U.post(this.E);
   }

   public final void a(String var1) {
      Log.i("", "sms50:" + var1.toString());
      if (Q != null) {
         Q = null;
      }

      Log.i("", "서버에서 받은 텝코인.. 실패.");
   }

   public final AlertDialog displayGoldReceivedDialog(int goldAmount) {
      LinearLayout linearLayout = (LinearLayout)View.inflate(this, 2130903041, (ViewGroup)null);
      TextView textView = (TextView)linearLayout.findViewById(2131099658);
      String buttonText;
      if (globalConfig.languageId == 0) {
         textView.setText(goldAmount + " 골드를 얻었습니다.");
         buttonText = "확인";
      } else {
         textView.setText("You received " + goldAmount + " gold.");
         buttonText = "Confirm";
      }

      return (new AlertDialog.Builder(this)).setCancelable(false).setView(linearLayout).setPositiveButton(buttonText, new r(this)).create();
   }

   public final void b() {
      if (!fishing4.a.r.G.substring(0, 7).equals("http://")) {
         fishing4.a.r.G = "http://" + fishing4.a.r.G.substring(7);
      }

      this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(fishing4.a.r.G)));
   }

   public final void b(String var1) {
      ConnectivityManager var2 = (ConnectivityManager)this.getSystemService("connectivity");
      if (var2.getActiveNetworkInfo() != null && var2.getActiveNetworkInfo().isConnectedOrConnecting()) {
         globalConfig.n = null;
         globalConfig.n = new String(var1);
         FacebookMainView.b = 0;
         this.startActivity(new Intent(this, FacebookMainView.class));
      } else {
         if (globalConfig.languageId == 0) {
            var1 = "인터넷 연결 상태를 확인하세요.";
         } else {
            var1 = "Check network connection.";
         }

         Toast.makeText(this, var1, 0).show();
      }

   }

   public final AlertDialog displayAttendanceDialog(int day) {
      LinearLayout linearLayout = (LinearLayout)View.inflate(this, 2130903041, (ViewGroup)null);
      TextView textView = (TextView)linearLayout.findViewById(2131099658);
      String buttonText;
      if (globalConfig.languageId == 0) {
         textView.setText(day + "일차 출석하셨습니다. 내일 더 많은 골드를 받아가세요~");
         buttonText = "확인";
      } else {
         textView.setText("You attended the " + day + " day. Get more gold tomorrow!");
         buttonText = "Confirm";
      }

      return (new AlertDialog.Builder(this)).setCancelable(false).setView(linearLayout).setPositiveButton(buttonText, new s(this)).create();
   }

   public final void openGooglePlayLink() {
      this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://wap.pnjmobile.co.kr/Link/Google_play/?game=Fishing4_Google_Free")));
   }

   public final AlertDialog displayReceivedGiftsDialog() {
      String line1;
      String line2;
      String buttonText;
      if (globalConfig.languageId == 0) {
         line2 = "선물 알림";
         buttonText = "선물 " + fishing4.a.r.numGiftsWaiting + "개가 도착하였습니다.\n이벤트 메뉴에서 선물을 확인해 주세요.";
         line1 = "확인";
      } else {
         line2 = "Gift arrival!";
         buttonText = "You received " + fishing4.a.r.numGiftsWaiting + " gift(s)!\nCheck your gift in Event menu.";
         line1 = "Confirm";
      }

      return (new AlertDialog.Builder(this)).setCancelable(false).setTitle(line2).setMessage(buttonText).setPositiveButton(line1, new o(this)).create();
   }

   public final AlertDialog i() {
      TextView var1 = null;
      LinearLayout var2 = (LinearLayout)View.inflate(this, 2130903042, (ViewGroup)null);
      if (l == 1) {
         var1 = (TextView)var2.findViewById(2131099659);
      } else if (l == 2) {
         var1 = (TextView)var2.findViewById(2131099660);
      } else if (l == 3) {
         var1 = (TextView)var2.findViewById(2131099661);
      } else if (l == 4) {
         var1 = (TextView)var2.findViewById(2131099662);
      } else if (l == 5) {
         var1 = (TextView)var2.findViewById(2131099663);
      }

      if (var1 != null) {
         var1.setTextColor(-65536);
      }

      AlertDialog var3;
      if (globalConfig.languageId == 0) {
         if (l == 5) {
            var3 = (new AlertDialog.Builder(this)).setCancelable(false).setView(var2).setPositiveButton("수락", new t(this)).create();
         } else {
            var3 = (new AlertDialog.Builder(this)).setCancelable(false).setView(var2).setPositiveButton("수락", new u(this)).setNegativeButton("누적", new w(this)).create();
         }
      } else if (l == 5) {
         var3 = (new AlertDialog.Builder(this)).setCancelable(false).setView(var2).setPositiveButton("Confirm", new x(this)).create();
      } else {
         var3 = (new AlertDialog.Builder(this)).setCancelable(false).setView(var2).setPositiveButton("Confirm", new y(this)).setNegativeButton("Accumulated Gold", new z(this)).create();
      }

      return var3;
   }

   public final AlertDialog j() {
      String var1;
      AlertDialog var3;
      if (!fishing4.a.r.G.equals("")) {
         String var2;
         if (globalConfig.languageId == 0) {
            var2 = "예";
            var1 = "아니오";
         } else {
            var2 = "Confirm";
            var1 = "Decline";
         }

         var3 = (new AlertDialog.Builder(this)).setCancelable(false).setMessage(Html.fromHtml(fishing4.a.r.D[0])).setPositiveButton(var2, new aa(this)).setNegativeButton(var1, new ab(this)).create();
      } else {
         if (globalConfig.languageId == 0) {
            var1 = "예";
         } else {
            var1 = "Confirm";
         }

         var3 = (new AlertDialog.Builder(this)).setCancelable(true).setOnCancelListener(new ac(this)).setMessage(Html.fromHtml(fishing4.a.r.D[0])).setPositiveButton(var1, new ad(this)).create();
      }

      return var3;
   }

   protected void onActivityResult(int var1, int var2, Intent var3) {
   }

   public void onCreate(Bundle bundle) {
      super.onCreate(bundle);
      Window window = this.getWindow();
      view = new View(this);
      context = this;
      com.tapjoy.f.requestTapjoyConnect(this, "0faf65f6-b8ba-4387-8184-075214d63502", "6ahYoU1UCshal8OTIkyk");
      com.tapjoy.f.a();
      com.tapjoy.f.a((com.tapjoy.ab)this);
      com.tapjoy.f.a();
      com.tapjoy.f.a((com.tapjoy.s)this);
      com.tapjoy.f.a();
      com.tapjoy.f.c();
      com.tapjoy.f.a();
      com.tapjoy.f.a((com.tapjoy.p)this);
      B = new View(this);
      C = false;
      b = new m(this);
      this.U = new Handler();
      this.V = new ao(this, this.U);
      BillingService billingService = new BillingService();
      c = billingService;
      billingService.a((Context)this);
      bh.a((bf)this.V);
      c.a();
      fishing4.a.s.applicationContext = this.getApplicationContext();
      this.setRequestedOrientation(1);
      window.setFlags(1024, 1024);
      window.addFlags(128);
      this.requestWindowFeature(1);
      this.requestWindowFeature(2);
      WifiInfo wifiInfo = ((WifiManager)this.getSystemService("wifi")).getConnectionInfo();
      fishing4.a.r.deviceModel = Build.MODEL.replace(" ", "").trim();
      fishing4.a.r.deviceBuildVersion = VERSION.RELEASE;
      TelephonyManager telephonyManager = (TelephonyManager)this.getSystemService("phone");
      String phoneNumber = telephonyManager.getLine1Number();
      String deviceId = telephonyManager.getDeviceId();
      fishing4.a.r.deviceId = deviceId;
      if (deviceId == null || fishing4.a.r.deviceId.equals("")) {
         fishing4.a.r.deviceId = wifiInfo.getMacAddress();
      }

      String line1Number;
      String simCountryISO;
      if (telephonyManager.getSimState() != 1) {
         if (phoneNumber != null) {
            simCountryISO = telephonyManager.getSimCountryIso();
            line1Number = telephonyManager.getLine1Number();
         } else {
            simCountryISO = telephonyManager.getSimCountryIso();
            line1Number = "0";
         }
      } else {
         simCountryISO = telephonyManager.getSimCountryIso();
         line1Number = "0";
      }

      if (fishing4.a.r.deviceId != null && !fishing4.a.r.deviceId.equals("")) {
         fishing4.a.r.phoneNumber = simCountryISO + line1Number;
         if (simCountryISO.equals("kr") && (line1Number.charAt(0) == '+' || line1Number.length() == 13)) {
            line1Number = line1Number.substring(3);
            fishing4.a.r.phoneNumber = simCountryISO + "0" + line1Number;
         }

         com.pnjmobile.tnk.a.a(this, fishing4.a.r.phoneNumber);
         fishing4.a.r.a(fishing4.a.r.phoneNumber);
         this.setVolumeControlStream(3);
         OptionsManager.vibrator = (Vibrator)this.getSystemService("vibrator");
         if (!this.aa) {
            this.saveLoadManager = SaveLoadManager.a();
            SaveLoadManager saveLoadManager1 = this.saveLoadManager;
            SaveLoadManager.a((Context)this);
            this.aa = true;
         }

         OptionsManager.loadOptions();
         OptionsManager.c();
         OptionsManager.a();
         Thread var11;
         if (this.F == null) {
            this.F = new i();
            var11 = new Thread(this.F);
            H = var11;
            var11.start();
         }

         if (this.G == null) {
            this.G = new j();
            var11 = new Thread(this.G);
            I = var11;
            var11.start();
         }

         if (!fishing4.game.az.f && !OptionsManager.hasConfirmedAgreement) {
            this.startActivity(new Intent(this, AgreementView.class));
         } else if (!OptionsManager.hasChosenUserName) {
            this.startActivity(new Intent(this, userIDview.class));
         }

         RelativeLayout relativeLayout = new RelativeLayout(this);
         z = relativeLayout;
         relativeLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
         LinearLayout linearLayout = new LinearLayout(this);
         A = linearLayout;
         linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
         A.setOrientation(1);
         this.glSurfaceView = new GLSurfaceView(this);
         this.glSurfaceView.setRenderer(new fishing4.a.s(this));
         this.glSurfaceView.setOnTouchListener(this);
         this.setContentView(this.glSurfaceView);
         this.addContentView(z, new LinearLayout.LayoutParams(-1, -1));
         this.addContentView(A, new LinearLayout.LayoutParams(-1, -2));
         e();
      } else {
         fishing4.game.az.J = "USIM이 없거나 비행기모드일때는 실행할 수 없습니다. 게임을 종료합니다.";
         fishing4.game.az.I = true;
         this.showDialog(0);
      }

      System.currentTimeMillis();
      new fishing4.a.z((byte)0);
   }

   public Dialog onCreateDialog(int var1) {
      AlertDialog var3;
      switch (var1) {
         case 101:
            AlertDialog.Builder var2 = new AlertDialog.Builder(this);
            var2.setTitle("결제 확인");
            var2.setMessage("결제가 성공적으로 이루어졌습니다 ");
            var2.setPositiveButton("확인", new ae(this));
            var3 = var2.create();
            break;
         default:
            var3 = (new AlertDialog.Builder(this)).setIcon(2130837517).setTitle("알 림").setMessage(fishing4.game.az.J).setCancelable(false).setOnKeyListener(this.P).setNegativeButton("확인", new af(this)).create();
      }

      return var3;
   }

   protected void onDestroy() {
      super.onDestroy();
      fishing4.b.d.a().c();
      fishing4.b.d.a().e();
      fishing4.b.d.a().f();
      fishing4.b.d.b();
      if (c != null) {
         c.b();
      }

      if (this.X != null) {
         this.X.a();
      }

   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      boolean var4 = true;
      boolean var3;
      if (var1 == 57 && var2.getRepeatCount() == 0) {
         switch (fishing4.game.k.j) {
            case 0:
               var3 = globalConfig.j;
               break;
            case 1:
               if (fishing4.a.r.numGiftsWaiting > 0) {
                  this.displayReceivedGiftsDialog().show();
               }
               break;
            case 2:
               this.J.sendEmptyMessage(0);
               break;
            case 3:
               if (fishing4.a.r.D[0].equals("")) {
                  this.j().show();
               } else {
                  if (fishing4.game.k.e()) {
                     o();
                  }

                  if (m) {
                     this.i().show();
                  } else if (fishing4.a.r.numGiftsWaiting > 0) {
                     this.displayReceivedGiftsDialog().show();
                  }
               }
               break;
            case 4:
               if (fishing4.a.r.I) {
                  String var5;
                  String var6;
                  String var7;
                  String var8;
                  if (globalConfig.languageId == 0) {
                     var6 = "안내";
                     var8 = "새로운 버전이 있습니다. 버전업 하시겠습니까?";
                     var5 = "확인";
                     var7 = "취소";
                  } else {
                     var6 = "Notice";
                     var8 = "A new version of the app is available. Do you want to upgrade this app now?";
                     var5 = "Confirm";
                     var7 = "Decline";
                  }

                  (new AlertDialog.Builder(this)).setCancelable(false).setTitle(var6).setMessage(var8).setPositiveButton(var5, new p(this)).setNegativeButton(var7, new q(this)).create().show();
               } else if (fishing4.a.r.D != null && fishing4.a.r.D[0] != null && !fishing4.a.r.D[0].equals("")) {
                  this.j().show();
               } else {
                  if (fishing4.game.k.e()) {
                     o();
                  }

                  if (m) {
                     this.i().show();
                  } else if (fishing4.a.r.numGiftsWaiting > 0) {
                     this.displayReceivedGiftsDialog().show();
                  }
               }
         }

         fishing4.game.k.j = -1;
         var3 = false;
      } else {
         var3 = var4;
         if (var1 != 82) {
            var3 = var4;
            if (var1 != 64) {
               fishing4.game.z.b(var1);
               var3 = false;
            }
         }
      }

      return var3;
   }

   public boolean onKeyUp(int var1, KeyEvent var2) {
      fishing4.game.z.c(var1);
      return false;
   }

   protected void onPause() {
      isPaused = true;
      super.onPause();
      this.overridePendingTransition(2130968576, 2130968577);
      fishing4.b.d.a().c();
      if (fishing4.game.bg.b == 31) {
         fishing4.b.d var1 = fishing4.b.d.a();
         fishing4.a.s.a();
         var1.a(2131034143);
      }

      this.ab = 0;
      this.saveLoadManager = SaveLoadManager.a();
      (new Thread(this)).start();
   }

   protected void onResume() {
      super.onResume();
      this.isLoading = true;
      pnjmobile.fishing4.google_free.k.a(context);
      Thread thread = new Thread(new n(this));
      thread.setDaemon(true);
      thread.start();
      if (isPaused && !e) {
         isPaused = false;
         if (!fishing4.game.az.f && !OptionsManager.hasConfirmedAgreement) {
            this.startActivity(new Intent(this, AgreementView.class));
         } else if (!OptionsManager.hasChosenUserName) {
            this.startActivity(new Intent(this, userIDview.class));
         }
      }

      this.glSurfaceView = new GLSurfaceView(this);
      this.glSurfaceView.setRenderer(new fishing4.a.s(this));
      this.glSurfaceView.setOnTouchListener(this);
      this.setContentView(this.glSurfaceView);
      this.addContentView(z, new LinearLayout.LayoutParams(-1, -1));
      this.addContentView(A, new LinearLayout.LayoutParams(-1, -2));
      boolean var1 = globalConfig.j;
      this.glSurfaceView.onResume();
      if (fishing4.game.z.b() == 3) {
         if (fishing4.game.aa.c == 1 && fishing4.game.az.e) {
            return;
         }
      } else if (fishing4.game.z.b() == 4) {
         if (fishing4.game.aa.c == 1) {
            if (fishing4.game.j.a == 0 && fishing4.game.az.e) {
               return;
            }
         } else if (fishing4.game.aa.c == 2) {
            if (fishing4.game.am.e) {
               return;
            }
         } else if (fishing4.game.aa.c == 3 && fishing4.game.i.c) {
            return;
         }
      }

      fishing4.b.d.a().d();
      if (w) {
         this.saveLoadManager.c();
         if (!this.saveLoadManager.c) {
            O.sendEmptyMessageDelayed(0, 1000L);
         }

         if (this.saveLoadManager.b && this.saveLoadManager.c) {
            w = false;
         }
      } else {
         this.ab = 1;
         if (!this.aa) {
            this.saveLoadManager = SaveLoadManager.a();
         }

         (new Thread(this)).start();
      }

      com.tapjoy.f.a();
      com.tapjoy.f.a((com.tapjoy.ab)this);
      Log.i("", "ISLOADING FALSE!!!!!");
      this.isLoading = false;
   }

   protected void onStart() {
      super.onStart();
      bh.a((bf)this.V);
   }

   protected void onStop() {
      super.onStop();
      ao var1 = this.V;
      bh.a();
   }

   public boolean onTouch(View var1, MotionEvent var2) {
      boolean var9;
      if (!fishing4.a.r.g.equals("")) {
          if (var2.getAction() == 0) {
              fishing4.game.k.l();
              if (aw.w) {
                  am.b = -1;
                  fishing4.game.l.a(fishing4.game.l.d);
                  aw.w = false;
              } else {
                  am.b();
              }

              h = true;
              c.a(fishing4.a.r.g, "inapp");
              g = "";
          }
      } else {
         int var8 = var2.getPointerCount();
         float var3;
         float var4;
         float var5;
         int var7;
         if (var8 > 1 && fishing4.game.z.b() == 4 && fishing4.game.aw.c == 2) {
            var7 = var2.getAction();
            var4 = var2.getX(var8 - 1);
            var3 = (float)fishing4.a.m.d - var2.getY(var8 - 1);
         } else if (fishing4.game.z.b() == 4 && fishing4.game.aw.c == 3 && fishing4.game.i.c) {
            var7 = var2.getAction();
            if (var8 == 1) {
               var4 = var2.getX();
               var3 = (float)fishing4.a.m.d - var2.getY();
               fishing4.a.o.g = false;
               fishing4.a.o.f = 0.0F;
               fishing4.a.o.e.a(fishing4.a.e.a());
               fishing4.a.o.d.b(var4, var3);
            } else {
               if (var8 != 2) {
                  var9 = false;
                  return var9;
               }

               var4 = var2.getX(var8 - 2);
               var5 = (float)fishing4.a.m.d;
               var3 = var2.getY(var8 - 2);
               fishing4.a.o.d.b(var4, var5 - var3);
               var4 = var2.getX(var8 - 1);
               var3 = (float)fishing4.a.m.d - var2.getY(var8 - 1);
               fishing4.a.o.e.b(var4, var3);
               if (var7 != 2) {
                  var5 = fishing4.a.e.d(fishing4.a.o.d, fishing4.a.o.e);
                  fishing4.a.o.f = var5;
                  if (var5 <= 0.0F) {
                     var9 = false;
                     return var9;
                  }
               }

               fishing4.a.o.g = true;
            }
         } else {
            var7 = var2.getAction();
            var4 = var2.getX();
            var3 = (float)fishing4.a.m.d - var2.getY();
         }

         float var6 = var3;
         var5 = var4;
         if (fishing4.a.m.c != 480) {
            var5 = var4 * (float)fishing4.a.m.a / (float)fishing4.a.m.c;
            var6 = var3 * (float)fishing4.a.m.b / (float)fishing4.a.m.d;
         }

         if (var7 == 0 || var7 == 261) {
            fishing4.game.z.a(fishing4.a.e.a(var5, var6));
            var9 = true;
            return var9;
         }

         if (var7 == 1 || var7 == 262) {
            String var10;
            String var12;
            String var13;
            if (fishing4.game.am.e && fishing4.game.am.b == 121 && fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 175.0F, fishing4.a.m.d() - 35.0F - 240.0F), fishing4.a.h.a(60.0F, 60.0F), fishing4.a.e.a(var5, var6))) {
               var13 = new String(fishing4.game.m.c(fishing4.game.az.p));
               if (globalConfig.languageId == 0) {
                  var12 = fishing4.game.m.a(fishing4.game.s.a[fishing4.game.az.p], fishing4.game.az.p) + "cm";
               } else {
                  var12 = o.format((double)fishing4.game.m.a(fishing4.game.s.a[fishing4.game.az.p], fishing4.game.az.p) / 2.54) + "in.";
               }

               var10 = new String(fishing4.game.m.a(fishing4.game.s.a[fishing4.game.az.p]));
               if (globalConfig.languageId == 0) {
                  this.b(var13 + "(" + fishing4.game.m.e(fishing4.game.az.p) + ") / " + var12 + " / " + var10 + " / 월척도감");
               } else {
                  this.b(var13 + "(" + fishing4.game.m.e(fishing4.game.az.p) + ") / " + var12 + " / " + var10 + " / BIG FISH");
               }
            } else if (fishing4.game.am.e && fishing4.game.am.b == 123 && fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 175.0F, fishing4.a.m.d() - 35.0F - 240.0F), fishing4.a.h.a(60.0F, 60.0F), fishing4.a.e.a(var5, var6))) {
               var13 = new String(fishing4.game.m.c(fishing4.game.az.p));
               if (globalConfig.languageId == 0) {
                  var12 = fishing4.game.m.a(fishing4.game.s.b[fishing4.game.az.p], fishing4.game.az.p) + "cm";
               } else {
                  var12 = o.format((double)fishing4.game.m.a(fishing4.game.s.b[fishing4.game.az.p], fishing4.game.az.p) / 2.54) + "in.";
               }

               var10 = new String(fishing4.game.m.a(fishing4.game.s.b[fishing4.game.az.p]));
               if (globalConfig.languageId == 0) {
                  this.b(var13 + "(" + fishing4.game.m.e(fishing4.game.az.p) + ") / " + var12 + " / " + var10 + " / 희귀어도감");
               } else {
                  this.b(var13 + "(" + fishing4.game.m.e(fishing4.game.az.p) + ") / " + var12 + " / " + var10 + " / RARE FISH");
               }
            } else if (fishing4.game.am.e && fishing4.game.am.b >= 0 && fishing4.game.am.b <= 23 && fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 130.0F, fishing4.a.m.d() - 160.0F), fishing4.a.h.a(60.0F, 60.0F), fishing4.a.e.a(var5, var6))) {
               if (globalConfig.languageId == 0) {
                  var12 = fishing4.a.y.a(2131165966 + fishing4.game.am.b) + " 업적 달성!! 축하해주세요~";
               } else {
                  var12 = "[" + fishing4.a.y.a(2131165966 + fishing4.game.am.b) + "] Achievement completed!";
               }

               this.b(var12);
            } else if (fishing4.game.z.b() == 4 && fishing4.game.aw.c == 4 && fishing4.game.l.d == 43 && fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 175.0F, fishing4.a.m.d() - 35.0F - 240.0F), fishing4.a.h.a(60.0F, 60.0F), fishing4.a.e.a(var5, var6))) {
               var13 = new String(fishing4.game.m.c(fishing4.game.i.b));
               if (globalConfig.languageId == 0) {
                  var12 = fishing4.game.m.a(fishing4.game.aw.i, fishing4.game.i.b) + "cm";
               } else {
                  var12 = o.format((double)fishing4.game.m.a(fishing4.game.aw.i, fishing4.game.i.b) / 2.54) + "in.";
               }

               var10 = new String(fishing4.game.m.a(fishing4.game.aw.i));
               if (globalConfig.languageId == 0) {
                  this.b(var13 + "(" + fishing4.game.m.e(fishing4.game.i.b) + ") / " + var12 + " / " + var10 + " / 낚시 성공");
               } else {
                  this.b(var13 + "(" + fishing4.game.m.e(fishing4.game.i.b) + ") / " + var12 + " / " + var10 + " / \tSuccessful Catch!");
               }
            } else if (fishing4.game.am.e && fishing4.game.am.b == 40 && fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 175.0F, fishing4.a.m.d() - 35.0F - 240.0F), fishing4.a.h.a(60.0F, 60.0F), fishing4.a.e.a(var5, var6))) {
               var3 = ((fishing4.game.m)((fishing4.game.ag)fishing4.game.ad.h.get(fishing4.game.az.k)).b.get(fishing4.game.az.p)).a();
               var7 = ((fishing4.game.m)((fishing4.game.ag)fishing4.game.ad.h.get(fishing4.game.az.k)).b.get(fishing4.game.az.p)).b();
               var13 = new String(fishing4.game.m.c(var7));
               if (globalConfig.languageId == 0) {
                  var12 = fishing4.game.m.a(var3, var7) + "cm";
               } else {
                  var12 = o.format((double)fishing4.game.m.a(var3, var7) / 2.54) + "in.";
               }

               var10 = new String(fishing4.game.m.a(var3));
               if (globalConfig.languageId == 0) {
                  this.b(var13 + "(" + fishing4.game.m.e(var7) + ") / " + var12 + " / " + var10 + " / 선적 정보");
               } else {
                  this.b(var13 + "(" + fishing4.game.m.e(var7) + ") / " + var12 + " / " + var10 + " / Ship infomation");
               }
            } else {
               ConnectivityManager var11;
               if (fishing4.game.am.e && fishing4.game.am.b == 170) {
                  if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 72.0F, fishing4.a.m.d() - 288.0F), fishing4.a.h.a(150.0F, 50.0F), fishing4.a.e.a(var5, var6))) {
                     OptionsManager.f = true;
                     OptionsManager.saveOptions();
                     fishing4.game.am.b();
                     var11 = (ConnectivityManager)this.getSystemService("connectivity");
                     if (var11.getActiveNetworkInfo() != null && var11.getActiveNetworkInfo().isConnectedOrConnecting()) {
                        this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.pnjmobile.com/l/fishing4/fishing4_comment_event.php?kind=free")));
                     } else {
                        if (globalConfig.languageId == 0) {
                           var12 = "인터넷 연결 상태를 확인하세요.";
                        } else {
                           var12 = "Check network connection.";
                        }

                        Toast.makeText(this, var12, 0).show();
                     }
                  } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 72.0F, fishing4.a.m.d() - 288.0F), fishing4.a.h.a(150.0F, 50.0F), fishing4.a.e.a(var5, var6))) {
                     fishing4.game.am.b();
                  } else {
                     fishing4.a.e.a(var5, var6);
                     fishing4.game.k.d();
                  }

                  var9 = true;
                  return var9;
               }

               fishing4.game.z.b(fishing4.a.e.a(var5, var6));
               if (fishing4.a.t.x) {
                  fishing4.a.t.x = false;
                  var11 = (ConnectivityManager)this.getSystemService("connectivity");
                  if (var11.getActiveNetworkInfo() != null && var11.getActiveNetworkInfo().isConnectedOrConnecting()) {
                     this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://m.pnjm.com")));
                  } else {
                     if (globalConfig.languageId == 0) {
                        var12 = "인터넷 연결 상태를 확인하세요.";
                     } else {
                        var12 = "Check network connection.";
                     }

                     Toast.makeText(this, var12, 0).show();
                  }
               } else if (fishing4.a.t.y) {
                  fishing4.a.t.y = false;
                  var11 = (ConnectivityManager)this.getSystemService("connectivity");
                  if (var11.getActiveNetworkInfo() != null && var11.getActiveNetworkInfo().isConnectedOrConnecting()) {
                     this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(fishing4.a.t.u)));
                     fishing4.a.t.l = 3;
                     fishing4.a.t.i = true;
                  } else {
                     if (globalConfig.languageId == 0) {
                        var12 = "인터넷 연결 상태를 확인하세요.";
                     } else {
                        var12 = "Check network connection.";
                     }

                     Toast.makeText(this, var12, 0).show();
                  }
               } else if (t) {
                  t = false;
                  var11 = (ConnectivityManager)this.getSystemService("connectivity");
                  if (var11.getActiveNetworkInfo() != null && var11.getActiveNetworkInfo().isConnectedOrConnecting()) {
                     FacebookMainView.b = 1;
                     this.startActivity(new Intent(this, FacebookMainView.class));
                  } else {
                     if (globalConfig.languageId == 0) {
                        var12 = "인터넷 연결 상태를 확인하세요.";
                     } else {
                        var12 = "Check network connection.";
                     }

                     Toast.makeText(this, var12, 0).show();
                  }
               } else if (!s) {
                  if (globalConfig.m) {
                     openPlayStoreLink();
                  } else if (globalConfig.o) {
                     globalConfig.o = false;
                     var11 = (ConnectivityManager)this.getSystemService("connectivity");
                     if (var11.getActiveNetworkInfo() != null && var11.getActiveNetworkInfo().isConnectedOrConnecting()) {
                        this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.pnjmobile.com/l/fishing4")));
                     } else {
                        if (globalConfig.languageId == 0) {
                           var12 = "인터넷 연결 상태를 확인하세요.";
                        } else {
                           var12 = "Check network connection.";
                        }

                        Toast.makeText(this, var12, 0).show();
                     }
                  }
               }
            }

            var9 = true;
            return var9;
         }

         if (var7 == 2) {
            fishing4.game.z.c(fishing4.a.e.a(var5, var6));
            var9 = true;
            return var9;
         }
      }

      var9 = false;
      return var9;
   }

   public void run() {
      if (!this.aa) {
         SaveLoadManager var1 = this.saveLoadManager;
         SaveLoadManager.a((Context)this);
         this.aa = true;
      }

      if (this.ab == 0) {
         this.saveLoadManager.c();
      } else if (this.ab == 1) {
         this.saveLoadManager.b();
      }

      while(true) {
         while(true) {
            try {
               while(true) {
                  if (this.ab == 0) {
                     if (this.saveLoadManager.b && this.saveLoadManager.c) {
                        this.saveLoadManager.c();
                        return;
                     }

                     if (this.saveLoadManager.b && !this.saveLoadManager.c) {
                        O.sendEmptyMessageDelayed(0, 1000L);
                        return;
                     }

                     Thread.sleep(2500L);
                  } else if (this.ab == 1) {
                     if (this.saveLoadManager.b && this.saveLoadManager.c) {
                        return;
                     }

                     Thread.sleep(100L);
                  }
               }
            } catch (Exception var2) {
               Log.e("run", var2.toString());
               O.sendEmptyMessageDelayed(0, 1000L);
               return;
            }
         }
      }
   }
}

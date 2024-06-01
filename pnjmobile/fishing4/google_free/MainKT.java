package pnjmobile.fishing4.google_free;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.os.Handler;
import android.os.Vibrator;
import android.provider.Settings.System;
import android.telephony.TelephonyManager;
import android.text.Html;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.Toast;
import com.facebook.android.FacebookMainView;
import fishing4.game.AgreementView;
import fishing4.game.globalConfig;
import fishing4.game.OptionsManager;

public class MainKT extends Activity implements View.OnTouchListener {
   public static boolean d = false;
   public static boolean f = false;
   final int a = 101;
   final int b = 101;
   final String c = "sBNR003167";
   boolean e = false;
   public Handler g = new ap(this);
   public boolean h = false;
   DialogInterface.OnKeyListener i = new aq(this);
   private GLSurfaceView j;
   private String k = "8100F126";

   private void a(String var1) {
      ConnectivityManager var2 = (ConnectivityManager)this.getSystemService("connectivity");
      if (var2.getActiveNetworkInfo() != null && var2.getActiveNetworkInfo() != null && var2.getActiveNetworkInfo().isConnectedOrConnecting()) {
         globalConfig.n = null;
         globalConfig.n = new String(var1);
         b = 0;
         this.startActivity(new Intent(this, FacebookMainView.class));
      } else {
         Toast.makeText(this, "인터넷 연결 상태를 확인하세요.", 0).show();
      }

   }

   private AlertDialog c() {
      AlertDialog var1;
      if (!fishing4.a.r.G.equals("")) {
         var1 = (new AlertDialog.Builder(this)).setCancelable(false).setMessage(Html.fromHtml(fishing4.a.r.D[0])).setPositiveButton("예", new at(this)).setNegativeButton("아니오", new au(this)).create();
      } else {
         var1 = (new AlertDialog.Builder(this)).setCancelable(true).setMessage(Html.fromHtml(fishing4.a.r.D[0])).setPositiveButton("확인", new av(this)).create();
      }

      return var1;
   }

   public final void a() {
      if (!fishing4.a.r.G.substring(0, 7).equals("http://")) {
         fishing4.a.r.G = "http://" + fishing4.a.r.G.substring(7);
      }

      this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(fishing4.a.r.G)));
   }

   public final AlertDialog b() {
      return (new AlertDialog.Builder(this)).setCancelable(false).setTitle("선물 알림").setMessage("선물 " + fishing4.a.r.numGiftsWaiting + "개가 도착하였습니다.\n이벤트 메뉴에서 선물을 확인해 주세요.").setPositiveButton("확인", new as(this)).create();
   }

   protected void onActivityResult(int var1, int var2, Intent var3) {
      super.onActivityResult(var1, var2, var3);
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      fishing4.a.s.applicationContext = this.getApplicationContext();
      boolean var2;
      if (System.getInt(fishing4.a.s.a().getContentResolver(), "airplane_mode_on", 0) == 1) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.e = var2;
      if (this.e) {
         AlertDialog.Builder var3 = new AlertDialog.Builder(this);
         var3.setMessage("게임을 실행할 수 없습니다. 비행기모드 설정여부를 확인하시고 해제를 해주시기 바랍니다.");
         var3.setCancelable(false);
         var3.setOnKeyListener(this.i);
         var3.setPositiveButton("확인", new ar(this));
         var3.create();
         var3.show();
         fishing4.game.az.I = true;
      } else {
         ((ActivityManager)this.getSystemService("activity")).restartPackage(this.getPackageName());
         Window var4 = this.getWindow();
         this.setRequestedOrientation(1);
         var4.setFlags(1024, 1024);
         var4.addFlags(128);
         this.requestWindowFeature(1);
         this.requestWindowFeature(2);
         String var5 = ((TelephonyManager)this.getSystemService("phone")).getLine1Number();
         fishing4.a.r.phoneNumber = var5;
         if (var5 == null) {
            fishing4.game.az.J = "USIM이 없거나 비행기모드일때는 실행할 수 없습니다. 게임을 종료합니다.";
            fishing4.game.az.I = true;
            this.showDialog(0);
         } else {
            if (fishing4.a.r.phoneNumber.charAt(0) == '+' || fishing4.a.r.phoneNumber.length() == 13) {
               var5 = fishing4.a.r.phoneNumber.substring(3);
               fishing4.a.r.phoneNumber = "0" + var5;
            }

            com.pnjmobile.tnk.a.a(this, fishing4.a.r.phoneNumber);
            fishing4.a.r.a(fishing4.a.r.phoneNumber);
            this.setVolumeControlStream(3);
            OptionsManager.vibrator = (Vibrator)this.getSystemService("vibrator");
            OptionsManager.loadOptions();
            OptionsManager.c();
            OptionsManager.a();
            if (!fishing4.game.az.f && !OptionsManager.hasConfirmedAgreement) {
               this.startActivity(new Intent(this, AgreementView.class));
            }

            this.j = new GLSurfaceView(this);
            this.j.setRenderer(new fishing4.a.s(this));
            this.j.setOnTouchListener(this);
            this.setContentView(this.j);
         }

         java.lang.System.currentTimeMillis();
         new fishing4.a.z((byte)0);
         fishing4.game.k.l = fishing4.a.p.a(this, "");
      }

   }

   public void onDestroy() {
      super.onDestroy();
      fishing4.b.d.a().c();
      fishing4.b.d.a().e();
      fishing4.b.d.a().f();
      fishing4.b.d.b();
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      boolean var4 = false;
      boolean var3;
      if (var1 == 57 && var2.getRepeatCount() == 0) {
         switch (fishing4.game.k.j) {
            case 0:
               var3 = globalConfig.j;
               break;
            case 1:
               if (fishing4.a.r.numGiftsWaiting > 0) {
                  this.b().show();
               }
               break;
            case 2:
               this.g.sendEmptyMessage(0);
               break;
            case 3:
               if (fishing4.a.r.D[0].equals("")) {
                  this.c().show();
               } else if (fishing4.a.r.numGiftsWaiting > 0) {
                  this.b().show();
               }
               break;
            case 4:
               if (fishing4.a.r.D != null && fishing4.a.r.D[0] != null && !fishing4.a.r.D[0].equals("")) {
                  this.c().show();
               } else if (fishing4.a.r.numGiftsWaiting > 0) {
                  this.b().show();
               }
         }

         fishing4.game.k.j = -1;
         var3 = var4;
      } else if (var1 == 82) {
         var3 = true;
      } else {
         var3 = var4;
         if (var1 != 64) {
            fishing4.game.z.b(var1);
            var3 = var4;
         }
      }

      return var3;
   }

   public boolean onKeyUp(int var1, KeyEvent var2) {
      fishing4.game.z.c(var1);
      return false;
   }

   protected void onPause() {
      super.onPause();
      this.overridePendingTransition(2130968576, 2130968577);
      this.j.onPause();
      fishing4.b.d.a().c();
      if (fishing4.game.bg.b == 31) {
         fishing4.b.d var1 = fishing4.b.d.a();
         fishing4.a.s.a();
         var1.a(2131034143);
      }

   }

   protected void onResume() {
      super.onResume();
      this.j = new GLSurfaceView(this);
      this.j.setRenderer(new fishing4.a.s(this));
      this.j.setOnTouchListener(this);
      this.setContentView(this.j);
      this.j.onResume();
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
   }

   public boolean onTouch(View var1, MotionEvent var2) {
      boolean var9;
      if (!fishing4.a.r.g.equals("")) {
         if (this.h) {
            var9 = false;
            return var9;
         }

         switch (var2.getAction()) {
            case 0:
               this.h = true;
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
            ConnectivityManager var11;
            if (fishing4.game.am.e && fishing4.game.am.b == 52 && fishing4.a.r.E == 1 && fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), 100.0F), fishing4.a.h.a(118.0F, 22.0F), fishing4.a.e.a(var5, var6))) {
               var11 = (ConnectivityManager)this.getSystemService("connectivity");
               if (var11.getActiveNetworkInfo() != null && var11.getActiveNetworkInfo() != null && var11.getActiveNetworkInfo().isConnectedOrConnecting()) {
                  this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.pnjmobile.com/l/fishing4")));
               } else {
                  Toast.makeText(this, "인터넷 연결 상태를 확인하세요.", 0).show();
               }
            } else {
               String var10;
               String var12;
               String var13;
               if (fishing4.game.am.e && fishing4.game.am.b == 121 && fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 175.0F, fishing4.a.m.d() - 35.0F - 240.0F), fishing4.a.h.a(60.0F, 60.0F), fishing4.a.e.a(var5, var6))) {
                  var10 = new String(fishing4.game.m.c(fishing4.game.az.p));
                  var12 = new String(fishing4.game.m.a(fishing4.game.s.a[fishing4.game.az.p], fishing4.game.az.p) + "cm");
                  var13 = new String(fishing4.game.m.a(fishing4.game.s.a[fishing4.game.az.p]));
                  this.a(var10 + "(" + fishing4.game.m.e(fishing4.game.az.p) + ") / " + var12 + " / " + var13 + " / 월척도감");
               } else if (fishing4.game.am.e && fishing4.game.am.b == 123 && fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 175.0F, fishing4.a.m.d() - 35.0F - 240.0F), fishing4.a.h.a(60.0F, 60.0F), fishing4.a.e.a(var5, var6))) {
                  var12 = new String(fishing4.game.m.c(fishing4.game.az.p));
                  var13 = new String(fishing4.game.m.a(fishing4.game.s.b[fishing4.game.az.p], fishing4.game.az.p) + "cm");
                  var10 = new String(fishing4.game.m.a(fishing4.game.s.b[fishing4.game.az.p]));
                  this.a(var12 + "(" + fishing4.game.m.e(fishing4.game.az.p) + ") / " + var13 + " / " + var10 + " / 희귀어도감");
               } else if (fishing4.game.am.e && fishing4.game.am.b >= 0 && fishing4.game.am.b <= 23 && fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 130.0F, fishing4.a.m.d() - 160.0F), fishing4.a.h.a(60.0F, 60.0F), fishing4.a.e.a(var5, var6))) {
                  this.a(new String(fishing4.a.y.a(2131165966 + fishing4.game.am.b) + " 업적 달성!! 축하해주세요~"));
               } else if (fishing4.game.z.b() == 4 && fishing4.game.aw.c == 4 && fishing4.game.l.d == 43 && fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 175.0F, fishing4.a.m.d() - 35.0F - 240.0F), fishing4.a.h.a(60.0F, 60.0F), fishing4.a.e.a(var5, var6))) {
                  var13 = new String(fishing4.game.m.c(fishing4.game.i.b));
                  var12 = new String(fishing4.game.m.a(fishing4.game.aw.i, fishing4.game.i.b) + "cm");
                  var10 = new String(fishing4.game.m.a(fishing4.game.aw.i));
                  this.a(var13 + "(" + fishing4.game.m.e(fishing4.game.i.b) + ") / " + var12 + " / " + var10 + " / 낚시 성공");
               } else if (fishing4.game.am.e && fishing4.game.am.b == 40 && fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 175.0F, fishing4.a.m.d() - 35.0F - 240.0F), fishing4.a.h.a(60.0F, 60.0F), fishing4.a.e.a(var5, var6))) {
                  var3 = ((fishing4.game.m)((fishing4.game.ag)fishing4.game.ad.h.get(fishing4.game.az.k)).b.get(fishing4.game.az.p)).a();
                  var7 = ((fishing4.game.m)((fishing4.game.ag)fishing4.game.ad.h.get(fishing4.game.az.k)).b.get(fishing4.game.az.p)).b();
                  var12 = new String(fishing4.game.m.c(var7));
                  var13 = new String(fishing4.game.m.a(var3, var7) + "cm");
                  var10 = new String(fishing4.game.m.a(var3));
                  this.a(var12 + "(" + fishing4.game.m.e(var7) + ") / " + var13 + " / " + var10 + " / 선적 정보");
               } else {
                  if (fishing4.game.am.e && fishing4.game.am.b == 170) {
                     if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 72.0F, fishing4.a.m.d() - 288.0F), fishing4.a.h.a(150.0F, 50.0F), fishing4.a.e.a(var5, var6))) {
                        OptionsManager.f = true;
                        OptionsManager.saveOptions();
                        fishing4.game.am.b();
                        var11 = (ConnectivityManager)this.getSystemService("connectivity");
                        if (var11.getActiveNetworkInfo() != null && var11.getActiveNetworkInfo() != null && var11.getActiveNetworkInfo().isConnectedOrConnecting()) {
                           this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.pnjmobile.com/l/fishing4/fishing4_comment_event.php?kind=free")));
                        } else {
                           Toast.makeText(this, "인터넷 연결 상태를 확인하세요.", 0).show();
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
                     if (var11.getActiveNetworkInfo() != null && var11.getActiveNetworkInfo() != null && var11.getActiveNetworkInfo().isConnectedOrConnecting()) {
                        this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://m.pnjm.com")));
                     } else {
                        Toast.makeText(this, "인터넷 연결 상태를 확인하세요.", 0).show();
                     }
                  } else if (fishing4.a.t.y) {
                     fishing4.a.t.y = false;
                     var11 = (ConnectivityManager)this.getSystemService("connectivity");
                     if (var11.getActiveNetworkInfo() != null && var11.getActiveNetworkInfo() != null && var11.getActiveNetworkInfo().isConnectedOrConnecting()) {
                        this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(fishing4.a.t.u)));
                        fishing4.a.t.l = 3;
                        fishing4.a.t.i = true;
                     } else {
                        Toast.makeText(this, "인터넷 연결 상태를 확인하세요.", 0).show();
                     }
                  } else if (f) {
                     f = false;
                     var11 = (ConnectivityManager)this.getSystemService("connectivity");
                     if (var11.getActiveNetworkInfo() != null && var11.getActiveNetworkInfo() != null && var11.getActiveNetworkInfo().isConnectedOrConnecting()) {
                        b = 1;
                        this.startActivity(new Intent(this, FacebookMainView.class));
                     } else {
                        Toast.makeText(this, "인터넷 연결 상태를 확인하세요.", 0).show();
                     }
                  } else if (!d && globalConfig.m) {
                     globalConfig.m = false;
                     var11 = (ConnectivityManager)this.getSystemService("connectivity");
                     if (var11.getActiveNetworkInfo() != null && var11.getActiveNetworkInfo() != null && var11.getActiveNetworkInfo().isConnectedOrConnecting()) {
                        fishing4.game.k.l();
                        this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://wap.pnjmobile.co.kr/Link/Google_play/?game=Fish4_google_fullversionphoneNum=" + fishing4.a.r.phoneNumber + "&comm=" + "6")));
                     } else {
                        Toast.makeText(this, "인터넷 연결 상태를 확인하세요.", 0).show();
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
}

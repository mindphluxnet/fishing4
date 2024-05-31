package com.tapjoy;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.VideoView;
import java.util.Timer;

public class TapjoyVideoView extends Activity implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
   static int f = 16;
   private static boolean o = false;
   private static boolean p = false;
   private static am q;
   Dialog a;
   Timer b = null;
   int c;
   final String d = "VIDEO";
   final Handler e = new Handler();
   final Runnable g = new an(this);
   private VideoView h = null;
   private String i = null;
   private TextView j = null;
   private String k = null;
   private RelativeLayout l;
   private WebView m;
   private Bitmap n;
   private boolean r = false;
   private boolean s = false;
   private boolean t = false;
   private boolean u = false;
   private int v = 0;
   private int w = 0;
   private ImageView x;

   // $FF: synthetic method
   static TextView a(TapjoyVideoView var0) {
      return var0.j;
   }

   // $FF: synthetic method
   static am a() {
      return q;
   }

   // $FF: synthetic method
   static int b(TapjoyVideoView var0) {
      int var2 = (var0.h.getDuration() - var0.h.getCurrentPosition()) / 1000;
      int var1 = var2;
      if (var2 < 0) {
         var1 = 0;
      }

      return var1;
   }

   private void b() {
      this.l.removeAllViews();
      this.l.setBackgroundColor(-16777216);
      if (this.h == null && this.j == null) {
         this.x = new ImageView(this);
         this.n = ai.f();
         if (this.n != null) {
            this.x.setImageBitmap(this.n);
         }

         RelativeLayout.LayoutParams var1 = new RelativeLayout.LayoutParams(-2, -2);
         var1.addRule(12);
         var1.addRule(11);
         this.x.setLayoutParams(var1);
         this.h = new VideoView(this);
         this.h.setOnCompletionListener(this);
         this.h.setOnErrorListener(this);
         this.h.setOnPreparedListener(this);
         if (p) {
            aa.a("VIDEO", "streaming video: " + this.i);
            this.h.setVideoURI(Uri.parse(this.i));
         } else {
            aa.a("VIDEO", "cached video: " + this.i);
            this.h.setVideoPath(this.i);
         }

         var1 = new RelativeLayout.LayoutParams(-2, -2);
         var1.addRule(13);
         this.h.setLayoutParams(var1);
         this.v = this.h.getDuration() / 1000;
         aa.a("VIDEO", "videoView.getDuration(): " + this.h.getDuration());
         aa.a("VIDEO", "timeRemaining: " + this.v);
         this.j = new TextView(this);
         this.j.setTextSize((float)f);
         this.j.setTypeface(Typeface.create("default", 1), 1);
         var1 = new RelativeLayout.LayoutParams(-2, -2);
         var1.addRule(12);
         this.j.setLayoutParams(var1);
      }

      this.h.requestFocus();
      if (this.r) {
         this.h.seekTo(this.w);
         aa.a("VIDEO", "dialog is showing -- don't start");
      } else {
         aa.a("VIDEO", "start");
         this.h.seekTo(0);
         this.h.start();
      }

      if (this.b != null) {
         this.b.cancel();
      }

      this.b = new Timer();
      this.b.schedule(new au(this, (byte)0), 500L, 100L);
      this.m = new WebView(this);
      this.m.setWebViewClient(new ao(this));
      this.m.getSettings().setJavaScriptEnabled(true);
      this.m.loadUrl(this.k);
      this.t = false;
      if (this.s) {
         (new Thread(new ap(this))).start();
         this.s = false;
      }

      this.l.addView(this.h);
      this.l.addView(this.x);
      this.l.addView(this.j);
   }

   private void c() {
      this.l.removeAllViews();
      this.l.addView(this.m, -1, -1);
   }

   // $FF: synthetic method
   static void c(TapjoyVideoView var0) {
      var0.b();
   }

   // $FF: synthetic method
   static void d(TapjoyVideoView var0) {
      var0.t = true;
   }

   // $FF: synthetic method
   static boolean e(TapjoyVideoView var0) {
      return var0.t;
   }

   // $FF: synthetic method
   static VideoView f(TapjoyVideoView var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static int g(TapjoyVideoView var0) {
      return var0.w;
   }

   // $FF: synthetic method
   static void h(TapjoyVideoView var0) {
      var0.r = false;
   }

   public void onCompletion(MediaPlayer var1) {
      aa.a("VIDEO", "onCompletion");
      if (this.b != null) {
         this.b.cancel();
      }

      this.c();
      if (!o) {
         ai.e();
         (new Thread(new aq(this))).start();
      }

      o = false;
      this.u = true;
   }

   protected void onCreate(Bundle var1) {
      aa.a("VIDEO", "onCreate");
      super.onCreate(var1);
      if (var1 != null) {
         aa.a("VIDEO", "*** Loading saved data from bundle ***");
         this.w = var1.getInt("seek_time");
         this.r = var1.getBoolean("dialog_showing");
      }

      aa.a("VIDEO", "dialogShowing: " + this.r + ", seekTime: " + this.w);
      this.s = true;
      p = false;
      if (ai.a() == null) {
         aa.a("VIDEO", "null video");
         this.finish();
      } else {
         q = ai.a().b();
         this.i = q.i;
         this.k = q.h;
         if (this.i == null || this.i.length() == 0) {
            aa.a("VIDEO", "no cached video, try streaming video at location: " + q.c);
            this.i = q.c;
            p = true;
         }

         aa.a("VIDEO", "videoPath: " + this.i);
         this.requestWindowFeature(1);
         this.l = new RelativeLayout(this);
         RelativeLayout.LayoutParams var2 = new RelativeLayout.LayoutParams(-1, -1);
         this.l.setLayoutParams(var2);
         this.setContentView(this.l);
         if (Integer.parseInt(VERSION.SDK) > 3) {
            this.c = (new r(this)).b();
            aa.a("VIDEO", "deviceScreenLayoutSize: " + this.c);
         }

         aa.a("VIDEO", "textSize: " + f);
         this.b();
         aa.a("VIDEO", "onCreate DONE");
      }

   }

   protected Dialog onCreateDialog(int var1) {
      aa.a("VIDEO", "dialog onCreateDialog");
      Dialog var2;
      if (!this.r) {
         var2 = this.a;
      } else {
         switch (var1) {
            case 0:
               this.a = (new AlertDialog.Builder(this)).setTitle("Cancel Video?").setMessage("Currency will not be awarded, are you sure you want to cancel the video?").setNegativeButton("End", new ar(this)).setPositiveButton("Resume", new as(this)).create();
               this.a.setOnCancelListener(new at(this));
               this.a.show();
               this.r = true;
               break;
            default:
               this.a = null;
         }

         var2 = this.a;
      }

      return var2;
   }

   public boolean onError(MediaPlayer var1, int var2, int var3) {
      o = true;
      aa.a("VIDEO", "onError");
      ai.c();
      this.u = true;
      if (this.b != null) {
         this.b.cancel();
      }

      return false;
   }

   public boolean onKeyDown(int var1, KeyEvent var2) {
      boolean var4 = true;
      boolean var3;
      if (var1 == 4) {
         if (!this.u) {
            this.w = this.h.getCurrentPosition();
            this.h.pause();
            this.r = true;
            this.showDialog(0);
            aa.a("VIDEO", "PAUSE VIDEO time: " + this.w);
            aa.a("VIDEO", "currentPosition: " + this.h.getCurrentPosition());
            aa.a("VIDEO", "duration: " + this.h.getDuration() + ", elapsed: " + (this.h.getDuration() - this.h.getCurrentPosition()));
            var3 = var4;
            return var3;
         }

         if (this.h.isPlaying()) {
            this.h.stopPlayback();
            this.c();
            var3 = var4;
            if (this.b != null) {
               this.b.cancel();
               var3 = var4;
            }

            return var3;
         }
      }

      var3 = super.onKeyDown(var1, var2);
      return var3;
   }

   protected void onPause() {
      super.onPause();
      if (this.h.isPlaying()) {
         aa.a("VIDEO", "onPause");
         this.w = this.h.getCurrentPosition();
         aa.a("VIDEO", "seekTime: " + this.w);
      }

   }

   public void onPrepared(MediaPlayer var1) {
      aa.a("VIDEO", "onPrepared");
   }

   protected void onResume() {
      aa.a("VIDEO", "onResume");
      super.onResume();
      this.setRequestedOrientation(0);
      if (this.w > 0) {
         aa.a("VIDEO", "seekTime: " + this.w);
         this.h.seekTo(this.w);
         if (!this.r || this.a == null || !this.a.isShowing()) {
            this.h.start();
         }
      }

   }

   protected void onSaveInstanceState(Bundle var1) {
      super.onSaveInstanceState(var1);
      aa.a("VIDEO", "*** onSaveInstanceState ***");
      aa.a("VIDEO", "dialogShowing: " + this.r + ", seekTime: " + this.w);
      var1.putBoolean("dialog_showing", this.r);
      var1.putInt("seek_time", this.w);
   }

   public void onWindowFocusChanged(boolean var1) {
      aa.a("VIDEO", "onWindowFocusChanged");
      super.onWindowFocusChanged(var1);
   }
}

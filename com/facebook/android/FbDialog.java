package com.facebook.android;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Display;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FbDialog extends Dialog {
   static final float[] b = new float[]{20.0F, 60.0F};
   static final float[] c = new float[]{40.0F, 60.0F};
   static final FrameLayout.LayoutParams d = new FrameLayout.LayoutParams(-1, -1);
   private static final int l = a(0.42578125F, 0.515625F, 0.703125F, 1.0F);
   private static final int m = a(0.3F, 0.3F, 0.3F, 0.8F);
   Activity a;
   private String e;
   private Facebook$DialogListener f;
   private ProgressDialog g;
   private WebView h;
   private LinearLayout i;
   private TextView j;
   private ImageButton k;

   public FbDialog(Context var1, String var2, Facebook$DialogListener var3) {
      super(var1);
      this.e = var2;
      this.f = var3;
      this.a = (FacebookMainView)FacebookMainView.a;
   }

   // $FF: synthetic method
   static int a() {
      return m;
   }

   private static int a(float var0, float var1, float var2, float var3) {
      int var4 = (int)((double)(var0 * 255.0F) + 0.5);
      int var5 = (int)((double)(var1 * 255.0F) + 0.5);
      int var6 = (int)((double)(var2 * 255.0F) + 0.5);
      return (var4 & 255) << 16 | ((int)((double)(var3 * 255.0F) + 0.5) & 255) << 24 | (var5 & 255) << 8 | (var6 & 255) << 0;
   }

   // $FF: synthetic method
   static Facebook$DialogListener a(FbDialog var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static int b() {
      return l;
   }

   // $FF: synthetic method
   static ProgressDialog b(FbDialog var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static WebView c(FbDialog var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static TextView d(FbDialog var0) {
      return var0.j;
   }

   protected void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.g = new ProgressDialog(this.getContext());
      this.g.requestWindowFeature(1);
      this.g.setMessage("Loading...");
      this.g.setCancelable(false);
      this.i = new LinearLayout(this.getContext());
      this.i.setOrientation(1);
      this.requestWindowFeature(1);
      Drawable var4 = this.getContext().getResources().getDrawable(2130837516);
      Drawable var3 = this.getContext().getResources().getDrawable(2130837515);
      this.i.setBackgroundColor(l);
      this.i.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
      RelativeLayout var5 = new RelativeLayout(this.getContext());
      var5.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
      this.j = new TextView(this.getContext());
      this.j.setText("Facebook");
      this.j.setTextColor(-1);
      this.j.setTypeface(Typeface.DEFAULT_BOLD);
      this.j.setBackgroundColor(l);
      this.j.setPadding(8, 4, 8, 4);
      this.j.setCompoundDrawablePadding(5);
      this.j.setCompoundDrawablesWithIntrinsicBounds(var4, (Drawable)null, (Drawable)null, (Drawable)null);
      var5.addView(this.j);
      this.k = new ImageButton(this.getContext());
      this.k.setBackgroundColor(0);
      this.k.setImageDrawable(var3);
      this.k.setOnTouchListener(new d(this));
      RelativeLayout.LayoutParams var7 = new RelativeLayout.LayoutParams(-2, -2);
      var7.addRule(11);
      var5.addView(this.k, var7);
      this.i.addView(var5);
      this.h = new WebView(this.getContext());
      this.h.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
      this.h.setVerticalScrollBarEnabled(false);
      this.h.setHorizontalScrollBarEnabled(false);
      this.h.setWebViewClient(new e(this, (byte)0));
      this.h.getSettings().setJavaScriptEnabled(true);
      this.h.loadUrl(this.e);
      this.h.setLayoutParams(d);
      this.i.addView(this.h);
      Display var8 = this.getWindow().getWindowManager().getDefaultDisplay();
      float var2 = this.getContext().getResources().getDisplayMetrics().density;
      float[] var6;
      if (this.getContext().getResources().getConfiguration().orientation == 2) {
         var6 = b;
      } else {
         var6 = c;
      }

      this.addContentView(this.i, new LinearLayout.LayoutParams(var8.getWidth() - (int)(var6[0] * var2 + 0.5F), var8.getHeight() - (int)(var6[1] * var2 + 0.5F)));
   }

   public boolean onKeyUp(int var1, KeyEvent var2) {
      if (var1 == 4 && (this.g == null || !this.g.isShowing())) {
         this.a.finish();
      }

      return true;
   }
}

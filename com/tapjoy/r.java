package com.tapjoy;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;

public final class r {
   private Context a;
   private Configuration b;
   private DisplayMetrics c;

   public r(Context var1) {
      this.a = var1;
      this.c = new DisplayMetrics();
      ((WindowManager)this.a.getSystemService("window")).getDefaultDisplay().getMetrics(this.c);
      this.b = this.a.getResources().getConfiguration();
   }

   public final int a() {
      return this.c.densityDpi;
   }

   public final int b() {
      return this.b.screenLayout & 15;
   }
}

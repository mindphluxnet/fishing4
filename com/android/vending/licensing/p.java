package com.android.vending.licensing;

import android.text.TextUtils;

final class p {
   public int a;
   public int b;
   public String c;
   public String d;
   public String e;
   public long f;
   public String g;

   public final String toString() {
      return TextUtils.join("|", new Object[]{this.a, this.b, this.c, this.d, this.e, this.f});
   }
}

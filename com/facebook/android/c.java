package com.facebook.android;

final class c implements Runnable {
   final FacebookMainView$SampleRequestListener a;
   private final String b;

   c(FacebookMainView$SampleRequestListener var1, String var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void run() {
      FacebookMainView.a(FacebookMainView$SampleRequestListener.a(this.a)).setText("Hello there, " + this.b + "!");
   }
}

package com.facebook.android;

public class DialogError extends Throwable {
   private int a;
   private String b;

   public DialogError(String var1, int var2, String var3) {
      super(var1);
      this.a = var2;
      this.b = var3;
   }
}

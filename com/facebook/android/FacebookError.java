package com.facebook.android;

public class FacebookError extends Throwable {
   private int a = 0;
   private String b;

   public FacebookError(String var1) {
      super(var1);
   }

   public FacebookError(String var1, String var2, int var3) {
      super(var1);
      this.b = var2;
      this.a = var3;
   }
}

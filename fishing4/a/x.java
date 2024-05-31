package fishing4.a;

import java.util.Vector;

public final class x {
   private int a;
   private String b;

   public x() {
      this.b = "";
   }

   public x(String var1) {
      this.a = 0;
      this.b = var1;
   }

   public static String[] d(String var0) {
      x var1 = new x(var0);
      Vector var3 = new Vector(30);

      while(true) {
         var1.a(" \t\r\n");
         String var2 = var1.c(" \t\r\n");
         if (var2 == null) {
            String[] var4 = new String[var3.size()];
            var3.copyInto(var4);
            return var4;
         }

         var3.addElement(var2);
      }
   }

   public final String a() {
      this.a(" \t\r\n");
      return this.c(" \t\r\n");
   }

   public final String a(String var1, String var2) {
      this.b(var1);
      this.a(var1);
      return this.c(var2);
   }

   public final void a(String var1) {
      for(int var2 = this.b.length(); this.a < var2 && var1.indexOf(this.b.charAt(this.a)) >= 0; ++this.a) {
      }

   }

   public final void b(String var1) {
      for(int var2 = this.b.length(); this.a < var2 && var1.indexOf(this.b.charAt(this.a)) < 0; ++this.a) {
      }

   }

   public final String c(String var1) {
      int var3 = this.b.length();
      int var2 = this.a;
      if (this.a >= var3) {
         var1 = null;
      } else {
         while(true) {
            if (this.a >= var3 || var1.indexOf(this.b.charAt(this.a)) >= 0) {
               var1 = this.b;
               var3 = this.a++;
               var1 = var1.substring(var2, var3);
               break;
            }

            ++this.a;
         }
      }

      return var1;
   }
}

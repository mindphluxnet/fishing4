package fishing4.game;

public final class ar {
   public final int a;
   public final int[] b = new int[5];
   public final int[] c = new int[5];
   public final int d;
   public final int e;
   public final int f;
   public final String g;
   public final String h;
   public final String i;

   public ar() {
      for(int var1 = 0; var1 < 5; ++var1) {
         this.b[var1] = -1;
         this.c[var1] = -1;
      }

      this.a = -1;
      this.d = -1;
      this.e = -1;
      this.f = -1;
      this.g = new String();
      this.h = new String();
      this.i = new String();
   }

   private ar(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, String var15, String var16, String var17) {
      this.b[0] = var2;
      this.c[0] = var3;
      this.b[1] = var4;
      this.c[1] = var5;
      this.b[2] = var6;
      this.c[2] = var7;
      this.b[3] = var8;
      this.c[3] = var9;
      this.b[4] = var10;
      this.c[4] = var11;
      this.a = var1;
      this.d = var12;
      this.e = var13;
      this.f = var14;
      this.g = new String(var15);
      this.h = new String(var16);
      this.i = new String(var17);
   }

   public static ar a(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, String var14, String var15, String var16) {
      return new ar(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16);
   }
}

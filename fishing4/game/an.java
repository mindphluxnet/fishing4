package fishing4.game;

import javax.microedition.khronos.opengles.GL10;

public final class an {
   private static final fishing4.a.f a = fishing4.a.f.a(0.0F, 0.0F, 20.0F, 358.0F);
   private static final fishing4.a.f b = fishing4.a.f.a(252.0F, 0.0F, 20.0F, 358.0F);
   private static final fishing4.a.f c = fishing4.a.f.a(20.0F, 0.0F, 232.0F, 358.0F);

   public static void a(GL10 var0, fishing4.a.w var1, fishing4.a.e var2, fishing4.a.g var3) {
      fishing4.a.m.a(var0, var1, var2, c, var3, 190);
      fishing4.a.m.a(var0, var1, var2.a - (c.b.a * var3.a + a.b.a) / 2.0F, var2.b, a, (int)190);
      fishing4.a.m.a(var0, var1, var2.a + (c.b.a * var3.a + b.b.a) / 2.0F, var2.b, b, (int)190);
   }
}

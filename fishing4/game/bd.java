package fishing4.game;

import javax.microedition.khronos.opengles.GL10;

import fishing4.a.GLRootView;

public final class bd {
   public static String a;
   public static long b;

   public static void a(int var0) {
      fishing4.a.ae.j = 1;
      a = GLRootView.getAppContext().getString(var0).trim();
      b = System.currentTimeMillis();
   }

   public static void a(GL10 var0, fishing4.a.w var1) {
      if (be.a) {
         fishing4.a.m.a(var0, var1, fishing4.a.m.getHalfWidthPixels(), 74.0F, 485.0F, 224.0F, 460.0F, 128.0F);
         fishing4.a.ae.a(var0, a, fishing4.a.m.getHalfWidthPixels(), 74.0F, (float)(fishing4.a.m.getWidthPixels() - 40), (float)(fishing4.a.ae.a(26.0F) * 3), 26.0F, 0);
      }

   }
}

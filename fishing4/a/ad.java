package fishing4.a;

import javax.microedition.khronos.opengles.GL10;

public final class ad {
   public static final f a = fishing4.a.f.a(548.0F, 588.0F, 148.0F, 46.0F);
   public static final f b = fishing4.a.f.a(397.0F, 588.0F, 148.0F, 46.0F);
   public static final h c = fishing4.a.h.a(168.0F, 66.0F);
   public static final f d = fishing4.a.f.a(745.0F, 501.0F, 50.0F, 20.0F);
   public static final f e = fishing4.a.f.a(795.0F, 501.0F, 35.0F, 20.0F);
   public static final f f = fishing4.a.f.a(721.0F, 666.0F, 34.0F, 18.0F);
   public static final f g = fishing4.a.f.a(928.0F, 502.0F, 94.0F, 18.0F);
   public static final f h = fishing4.a.f.a(120.0F, 476.0F, 40.0F, 15.0F);
   public static final f i = fishing4.a.f.a(250.0F, 476.0F, 30.0F, 15.0F);
   public static final f j = fishing4.a.f.a(322.0F, 697.0F, 72.0F, 24.0F);
   public boolean k;
   protected e l;
   private int m;

   private ad(int var1) {
      this.m = var1;
      this.k = false;
   }

   public static ad a(int var0) {
      return new ad(var0);
   }

   public final void a() {
      this.l = null;
   }

   public final void a(GL10 var1, w var2, w var3, e var4) {
      if (this.l == null || !this.l.equals(var4)) {
         this.l = var4;
      }

      f var5;
      if (this.m != 4 && this.m != 5) {
         if (this.k) {
            var5 = a;
         } else {
            var5 = b;
         }

         fishing4.a.m.a(var1, var2, var4, var5, '\u0001');
      } else {
         if (this.k) {
            var5 = a;
         } else {
            var5 = b;
         }

         fishing4.a.m.a(var1, var2, var4, var5, fishing4.a.g.b(0.75F, 1.0F));
      }

      switch (this.m) {
         case 0:
            fishing4.a.m.a(var1, var2, var4, f, '\b');
            break;
         case 1:
            fishing4.a.m.a(var1, var2, var4, g, '\b');
            break;
         case 2:
            fishing4.a.m.a(var1, var2, var4, d, '\b');
            break;
         case 3:
            fishing4.a.m.a(var1, var2, var4, e, '\b');
            break;
         case 4:
            fishing4.a.m.a(var1, var3, var4, h, '\b');
            break;
         case 5:
            fishing4.a.m.a(var1, var3, var4.a + i.b.a / 2.0F + 2.0F, var4.b, i, '\b');
            fishing4.a.m.a(var1, var3, var4.a - h.b.a / 2.0F - 2.0F, var4.b, h, '\b');
            break;
         case 6:
            fishing4.a.m.a(var1, var2, var4, j, '\b');
      }

   }

   public final boolean a(e var1, boolean var2) {
      boolean var3 = true;
      if (this.l != null && fishing4.a.f.a(this.l, c, var1)) {
         fishing4.b.d var4;
         if (var2 && this.k) {
            var4 = fishing4.b.d.a();
            s.a();
            var4.a(2131034130);
            var4 = fishing4.b.d.a();
            s.a();
            var4.a(2131034131);
            fishing4.b.d.a().b(s.a(), 2131034131);
            this.k = false;
            var2 = var3;
            return var2;
         }

         if (!var2) {
            var4 = fishing4.b.d.a();
            s.a();
            var4.a(2131034130);
            var4 = fishing4.b.d.a();
            s.a();
            var4.a(2131034131);
            fishing4.b.d.a().b(s.a(), 2131034130);
            this.k = true;
            var2 = false;
            return var2;
         }
      }

      this.k = false;
      var2 = false;
      return var2;
   }

   public final void b(int var1) {
      this.m = var1;
      this.l = null;
   }
}

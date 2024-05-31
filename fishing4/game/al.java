package fishing4.game;

import javax.microedition.khronos.opengles.GL10;

public final class al {
   public fishing4.a.e a;
   private fishing4.a.e b;
   private int c;

   private al() {
      this.c();
   }

   // $FF: synthetic method
   static int a(al var0) {
      return var0.c;
   }

   public static al a() {
      return new al();
   }

   // $FF: synthetic method
   static fishing4.a.e b(al var0) {
      return var0.b;
   }

   public static fishing4.a.h b(int var0) {
      fishing4.a.h var1;
      switch (var0) {
         case 0:
            var1 = fishing4.a.h.a(74.0F, 134.0F);
            break;
         case 1:
            var1 = fishing4.a.h.a(142.0F, 74.0F);
            break;
         case 2:
            var1 = fishing4.a.h.a(98.0F, 98.0F);
            break;
         case 3:
            var1 = fishing4.a.h.a(64.0F, 58.0F);
            break;
         default:
            var1 = fishing4.a.h.a();
      }

      return var1;
   }

   private void c() {
      this.c = -1;
      this.a = fishing4.a.e.a();
      this.b = fishing4.a.e.a();
   }

   // $FF: synthetic method
   static void c(al var0) {
      var0.c();
   }

   public final void a(float var1) {
      this.a.b(ah.a.a.a + this.b.a, ah.a.a.b + this.b.b + var1);
   }

   public final void a(float var1, float var2) {
      this.b.b(var1, var2);
   }

   public final void a(int var1) {
      this.c = var1;
   }

   public final void a(int var1, int var2, int var3, int var4, int var5) {
      if (var4 > var2) {
         if (var1 - (var2 + var3) <= 0) {
            var1 = 0;
         } else {
            var1 = var2 + var3 + fishing4.a.z.a(var1 - (var2 + var3));
         }
      } else if (var4 > var1 - (var2 + var3)) {
         if (var2 - var4 <= 0) {
            var1 = var2 - var4;
         } else {
            var1 = fishing4.a.z.a(var2 - var4);
         }
      } else {
         int var6 = fishing4.a.z.a(var1 - (var3 + var4));
         var1 = var6;
         if (var6 > var2 - var4) {
            var1 = var6 + var3 + var4;
         }
      }

      this.a((float)var1, (float)var5);
   }

   public final void a(GL10 var1, fishing4.a.w var2) {
      if (this.c >= 0 && this.c <= 3) {
         fishing4.a.e var4 = this.a;
         fishing4.a.f var3;
         switch (this.c) {
            case 0:
               var3 = fishing4.a.f.a(333.0F, 300.0F, 74.0F, 135.0F);
               break;
            case 1:
               var3 = fishing4.a.f.a(350.0F, 215.0F, 138.0F, 70.0F);
               break;
            case 2:
               var3 = fishing4.a.f.a(389.0F, 112.0F, 98.0F, 98.0F);
               break;
            case 3:
               var3 = fishing4.a.f.a(411.0F, 300.0F, 64.0F, 58.0F);
               break;
            default:
               var3 = fishing4.a.f.a();
         }

         fishing4.a.m.a(var1, var2, var4, var3, '\u0002');
         fishing4.a.m.a(var1, var2, this.a, this.b(), (int)89);
      }

   }

   public final fishing4.a.f b() {
      fishing4.a.f var1;
      switch (this.c) {
         case 0:
            var1 = fishing4.a.f.a(0.0F, 110.0F, 74.0F, 136.0F);
            break;
         case 1:
            var1 = fishing4.a.f.a(242.0F, 110.0F, 138.0F, 70.0F);
            break;
         case 2:
            var1 = fishing4.a.f.a(76.0F, 110.0F, 98.0F, 98.0F);
            break;
         case 3:
            var1 = fishing4.a.f.a(176.0F, 110.0F, 64.0F, 58.0F);
            break;
         default:
            var1 = fishing4.a.f.a();
      }

      return var1;
   }
}

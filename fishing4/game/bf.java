package fishing4.game;

import javax.microedition.khronos.opengles.GL10;

public final class bf {
   private fishing4.a.e a;
   private int b;

   private bf(int var1) {
      this.b = var1;
      fishing4.a.e var2;
      switch (this.b) {
         case 0:
            var2 = fishing4.a.e.a(226.0F, 272.0F);
            break;
         case 1:
            var2 = fishing4.a.e.a(94.0F, 471.0F);
            break;
         case 2:
            var2 = fishing4.a.e.a(231.0F, 97.0F);
            break;
         case 3:
            var2 = fishing4.a.e.a(347.0F, 298.0F);
            break;
         case 4:
            var2 = fishing4.a.e.a(381.0F, 177.0F);
            break;
         case 5:
            var2 = fishing4.a.e.a(75.0F, 150.0F);
            break;
         case 6:
            var2 = fishing4.a.e.a(358.0F, 476.0F);
            break;
         default:
            var2 = fishing4.a.e.a();
      }

      this.a = var2;
   }

   // $FF: synthetic method
   static fishing4.a.e a(bf var0) {
      return var0.a;
   }

   private fishing4.a.f a() {
      fishing4.a.f var1;
      switch (this.b) {
         case 0:
            var1 = fishing4.a.f.a(499.0F, 174.0F, 78.0F, 26.0F);
            break;
         case 1:
            var1 = fishing4.a.f.a(578.0F, 152.0F, 100.0F, 36.0F);
            break;
         case 2:
            var1 = fishing4.a.f.a(343.0F, 175.0F, 68.0F, 22.0F);
            break;
         case 3:
            var1 = fishing4.a.f.a(413.0F, 169.0F, 84.0F, 28.0F);
            break;
         case 4:
            var1 = fishing4.a.f.a(461.0F, 202.0F, 112.0F, 46.0F);
            break;
         case 5:
            var1 = fishing4.a.f.a(579.0F, 190.0F, 112.0F, 58.0F);
            break;
         case 6:
            var1 = fishing4.a.f.a(585.0F, 456.0F, 86.0F, 32.0F);
            break;
         default:
            var1 = fishing4.a.f.a();
      }

      return var1;
   }

   // $FF: synthetic method
   static fishing4.a.f a(boolean var0) {
      return b(var0);
   }

   public static bf a(int var0) {
      return new bf(var0);
   }

   private static fishing4.a.f b(boolean var0) {
      fishing4.a.f var1;
      if (var0) {
         var1 = fishing4.a.f.a(896.0F, 0.0F, 82.0F, 110.0F);
      } else {
         var1 = fishing4.a.f.a(925.0F, 112.0F, 54.0F, 72.0F);
      }

      return var1;
   }

   protected final void a(GL10 var1, fishing4.a.w var2, boolean var3, int var4) {
      if (var2 != null) {
         float var5 = 0.0F;
         switch (var4 % 10) {
            case 0:
            case 1:
            case 2:
            case 3:
               var5 = (float)(var4 % 10 + 1);
               break;
            case 4:
            case 5:
               var5 = 5.0F;
               break;
            case 6:
            case 7:
            case 8:
            case 9:
               var5 = (float)(10 - var4 % 10);
         }

         float var15 = this.a.b;
         float var14 = b(var3).b.b / 2.0F;
         float var13 = this.a.b;
         float var9 = b(var3).b.b;
         float var8 = b(var3).b.a / 2.0F;
         float var11 = this.a.b;
         float var12 = b(var3).b.b;
         float var10 = this.a().b.b / 2.0F;
         float var7 = this.a.b;
         float var6 = b(var3).b.a / 2.0F;
         fishing4.a.m.a(var1, var2, this.a.a, var15 + var5 + var14, b(var3));
         var14 = this.a.a;
         fishing4.a.f var16;
         switch (this.b) {
            case 0:
               if (!var3) {
                  var16 = fishing4.a.f.a(779.0F, 150.0F, 38.0F, 40.0F);
               } else {
                  var16 = fishing4.a.f.a(680.0F, 99.0F, 46.0F, 54.0F);
               }
               break;
            case 1:
               if (!var3) {
                  var16 = fishing4.a.f.a(848.0F, 99.0F, 34.0F, 28.0F);
               } else {
                  var16 = fishing4.a.f.a(581.0F, 99.0F, 52.0F, 44.0F);
               }
               break;
            case 2:
               if (!var3) {
                  var16 = fishing4.a.f.a(730.0F, 158.0F, 48.0F, 32.0F);
               } else {
                  var16 = fishing4.a.f.a(771.0F, 98.0F, 76.0F, 50.0F);
               }
               break;
            case 3:
               if (!var3) {
                  var16 = fishing4.a.f.a(540.0F, 140.0F, 28.0F, 34.0F);
               } else {
                  var16 = fishing4.a.f.a(728.0F, 98.0F, 42.0F, 52.0F);
               }
               break;
            case 4:
               if (!var3) {
                  var16 = fishing4.a.f.a(849.0F, 129.0F, 34.0F, 34.0F);
               } else {
                  var16 = fishing4.a.f.a(525.0F, 85.0F, 54.0F, 54.0F);
               }
               break;
            case 5:
               if (!var3) {
                  var16 = fishing4.a.f.a(819.0F, 149.0F, 28.0F, 32.0F);
               } else {
                  var16 = fishing4.a.f.a(635.0F, 98.0F, 44.0F, 48.0F);
               }
               break;
            case 6:
               if (!var3) {
                  var16 = fishing4.a.f.a(585.0F, 307.0F, 42.0F, 38.0F);
               } else {
                  var16 = fishing4.a.f.a(960.0F, 412.0F, 64.0F, 60.0F);
               }
               break;
            default:
               var16 = fishing4.a.f.a();
         }

         fishing4.a.m.a(var1, var2, var14, var13 + var5 + var9 - var8, var16);
         if (var3) {
            fishing4.a.m.a(var1, var2, this.a.a, var11 + var5 + var12 + 18.0F - var10, this.a());
            if (globalConfig.languageId == 0) {
               var8 = this.a.a;
               switch (this.b) {
                  case 0:
                     var16 = fishing4.a.f.a(788.0F, 191.0F, 30.0F, 18.0F);
                     break;
                  case 1:
                     var16 = fishing4.a.f.a(944.0F, 191.0F, 44.0F, 18.0F);
                     break;
                  case 2:
                     var16 = fishing4.a.f.a(693.0F, 191.0F, 44.0F, 18.0F);
                     break;
                  case 3:
                     var16 = fishing4.a.f.a(740.0F, 191.0F, 44.0F, 18.0F);
                     break;
                  case 4:
                     var16 = fishing4.a.f.a(821.0F, 191.0F, 58.0F, 18.0F);
                     break;
                  case 5:
                     var16 = fishing4.a.f.a(883.0F, 191.0F, 58.0F, 18.0F);
                     break;
                  case 6:
                     var16 = fishing4.a.f.a(960.0F, 291.0F, 64.0F, 16.0F);
                     break;
                  default:
                     var16 = fishing4.a.f.a();
               }

               fishing4.a.m.a(var1, var2, var8, var6 + var5 + var7, var16);
            }
         }
      }

   }
}

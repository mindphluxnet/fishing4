package fishing4.game;

import javax.microedition.khronos.opengles.GL10;

public final class be {
   public static boolean a;
   public static fishing4.a.e b;
   private static final fishing4.a.f c = fishing4.a.f.a(0.0F, 0.0F, 204.0F, 472.0F);
   private static final fishing4.a.f d = fishing4.a.f.a(0.0F, 0.0F, 350.0F, 486.0F);
   private static final fishing4.a.f e = fishing4.a.f.a(0.0F, 0.0F, 286.0F, 472.0F);
   private static final fishing4.a.f f = fishing4.a.f.a(0.0F, 0.0F, 306.0F, 498.0F);
   private static final fishing4.a.f g = fishing4.a.f.a(0.0F, 0.0F, 352.0F, 474.0F);
   private static final fishing4.a.f h = fishing4.a.f.a(0.0F, 0.0F, 218.0F, 460.0F);
   private static final fishing4.a.f i = fishing4.a.f.a(0.0F, 0.0F, 230.0F, 521.0F);
   private fishing4.a.w j;
   private int k;

   private be(GL10 var1, int var2) {
      this.k = var2;
      a = false;
      fishing4.a.w var3;
      switch (this.k) {
         case 0:
            var3 = fishing4.a.w.a(var1, "img/npc/02.png");
            break;
         case 1:
            var3 = fishing4.a.w.a(var1, "img/npc/06.png");
            break;
         case 2:
            var3 = fishing4.a.w.a(var1, "img/npc/01.png");
            break;
         case 3:
            var3 = fishing4.a.w.a(var1, "img/npc/03.png");
            break;
         case 4:
            var3 = fishing4.a.w.a(var1, "img/npc/05.png");
            break;
         case 5:
            var3 = fishing4.a.w.a(var1, "img/npc/04.png");
            break;
         case 6:
            var3 = fishing4.a.w.a(var1, "img/npc/00.png");
            break;
         default:
            var3 = null;
      }

      this.j = var3;
      b = a(this.k);
      switch (var2) {
         case 0:
            if (bh.a == 3) {
               bh.a = 10;
               bd.a(2131165284);
            } else {
               bd.a(2131165205);
            }
            break;
         case 1:
            bd.a(2131165209);
            break;
         case 2:
            bd.a(2131165204);
            break;
         case 3:
            bd.a(2131165206);
            break;
         case 4:
            bd.a(2131165207);
            break;
         case 5:
            bd.a(2131165208);
      }

   }

   public static fishing4.a.e a(int var0) {
      fishing4.a.h var1;
      switch (var0) {
         case 0:
            var1 = f.b;
            break;
         case 1:
            var1 = g.b;
            break;
         case 2:
            var1 = h.b;
            break;
         case 3:
            var1 = c.b;
            break;
         case 4:
            var1 = e.b;
            break;
         case 5:
            var1 = d.b;
            break;
         default:
            var1 = i.b;
      }

      fishing4.a.e var2;
      if (var0 == 0 && bg.a != 0 && bg.a != 10) {
         var2 = fishing4.a.e.a((float)fishing4.a.m.getWidthPixels() - var1.a / 3.0F, var1.b / 3.0F);
      } else if (var0 == 4 && bg.a != 0 && bg.a != 10) {
         var2 = fishing4.a.e.a((float)fishing4.a.m.getWidthPixels() - var1.a / 3.0F, var1.b / 2.0F);
      } else if (var0 == 5 && bg.a != 0 && bg.a != 10) {
         var2 = fishing4.a.e.a((float)fishing4.a.m.getWidthPixels() - var1.a / 5.0F, var1.b / 2.0F);
      } else if (var0 == 1 && bg.a != 0 && bg.a != 10) {
         var2 = fishing4.a.e.a((float)fishing4.a.m.getWidthPixels() - var1.a / 2.0F + var1.a, var1.b / 2.0F);
      } else {
         var2 = fishing4.a.e.a((float)fishing4.a.m.getWidthPixels() - var1.a / 2.0F, var1.b / 2.0F);
      }

      return var2;
   }

   public static be a(GL10 var0, int var1) {
      return new be(var0, var1);
   }

   public static boolean a() {
      boolean var0 = false;
      if (!bh.a() || System.currentTimeMillis() - bd.b >= 1000L) {
         if (fishing4.a.ae.k > 3 && fishing4.a.ae.j + 2 < fishing4.a.ae.k) {
            fishing4.a.ae.j += 3;
         } else {
            a = false;
            var0 = true;
         }
      }

      return var0;
   }

   public final void a(GL10 var1) {
      fishing4.a.w.a(var1, this.j);
      this.j = null;
      bd.a = null;
   }

   protected final void b(GL10 var1, int var2) {
      fishing4.a.e var4;
      fishing4.a.e var5;
      fishing4.a.f var6;
      switch (this.k) {
         case 0:
            var6 = f;
            var4 = fishing4.a.e.a(-6.0F, 112.0F);
            var5 = fishing4.a.e.a(-7.0F, 148.0F);
            break;
         case 1:
            var6 = g;
            var4 = fishing4.a.e.a(-7.0F, 124.0F);
            var5 = fishing4.a.e.a(-4.0F, 163.0F);
            break;
         case 2:
            var6 = h;
            var4 = fishing4.a.e.a(-26.0F, 125.0F);
            var5 = fishing4.a.e.a(-22.0F, 160.0F);
            break;
         case 3:
            var6 = c;
            var4 = fishing4.a.e.a(3.0F, 131.0F);
            var5 = fishing4.a.e.a(3.0F, 165.0F);
            break;
         case 4:
            var6 = e;
            var4 = fishing4.a.e.a(21.0F, 131.0F);
            var5 = fishing4.a.e.a(22.0F, 166.0F);
            break;
         case 5:
            var6 = d;
            var4 = fishing4.a.e.a(-25.0F, 127.0F);
            var5 = fishing4.a.e.a();
            break;
         default:
            var6 = i;
            var4 = fishing4.a.e.a(-7.0F, 121.0F);
            var5 = fishing4.a.e.a(-9.0F, 155.0F);
      }

      fishing4.a.m.a(var1, this.j, b, var6);
      var5 = fishing4.a.e.a(var5, b);
      int var3 = var2 % 50;
      if (var3 < 20) {
         switch (this.k) {
            case 0:
               if (var3 != 0 && var3 != 2) {
                  if (var3 == 1) {
                     fishing4.a.m.a(var1, this.j, var5, fishing4.a.f.a(1.0F, 501.0F, 68.0F, 18.0F));
                  }
               } else {
                  fishing4.a.m.a(var1, this.j, var5, fishing4.a.f.a(73.0F, 501.0F, 68.0F, 18.0F));
               }
               break;
            case 1:
               if (var3 != 0 && var3 != 2) {
                  if (var3 == 1) {
                     fishing4.a.m.a(var1, this.j, var5, fishing4.a.f.a(1.0F, 477.0F, 58.0F, 14.0F));
                  }
               } else {
                  fishing4.a.m.a(var1, this.j, var5, fishing4.a.f.a(63.0F, 477.0F, 58.0F, 14.0F));
               }
               break;
            case 2:
               if (var3 != 0 && var3 != 2) {
                  if (var3 == 1) {
                     fishing4.a.m.a(var1, this.j, var5, fishing4.a.f.a(1.0F, 463.0F, 66.0F, 24.0F));
                  }
               } else {
                  fishing4.a.m.a(var1, this.j, var5, fishing4.a.f.a(71.0F, 463.0F, 66.0F, 24.0F));
               }
               break;
            case 3:
               if (var3 != 0 && var3 != 2) {
                  if (var3 == 1) {
                     fishing4.a.m.a(var1, this.j, var5, fishing4.a.f.a(1.0F, 475.0F, 66.0F, 20.0F));
                  }
               } else {
                  fishing4.a.m.a(var1, this.j, var5, fishing4.a.f.a(71.0F, 475.0F, 66.0F, 20.0F));
               }
               break;
            case 4:
               if (var3 != 0 && var3 != 2) {
                  if (var3 == 1) {
                     fishing4.a.m.a(var1, this.j, var5, fishing4.a.f.a(1.0F, 476.0F, 58.0F, 20.0F));
                  }
               } else {
                  fishing4.a.m.a(var1, this.j, var5, fishing4.a.f.a(63.0F, 476.0F, 58.0F, 20.0F));
               }
            case 5:
            default:
               break;
            case 6:
               if (var3 != 0 && var3 != 2) {
                  if (var3 == 1) {
                     fishing4.a.m.a(var1, this.j, var5, fishing4.a.f.a(1.0F, 562.0F, 66.0F, 20.0F));
                  }
               } else {
                  fishing4.a.m.a(var1, this.j, var5, fishing4.a.f.a(71.0F, 562.0F, 66.0F, 20.0F));
               }
         }
      }

      var4 = fishing4.a.e.a(var4, b);
      if (a && var2 / 4 % 2 == 0) {
         switch (this.k) {
            case 0:
               fishing4.a.m.a(var1, this.j, var4, fishing4.a.f.a(145.0F, 501.0F, 18.0F, 14.0F));
               break;
            case 1:
               fishing4.a.m.a(var1, this.j, var4, fishing4.a.f.a(125.0F, 477.0F, 40.0F, 26.0F));
               break;
            case 2:
               fishing4.a.m.a(var1, this.j, var4, fishing4.a.f.a(141.0F, 463.0F, 22.0F, 14.0F));
               break;
            case 3:
               fishing4.a.m.a(var1, this.j, var4, fishing4.a.f.a(141.0F, 475.0F, 18.0F, 16.0F));
               break;
            case 4:
               fishing4.a.m.a(var1, this.j, var4, fishing4.a.f.a(125.0F, 476.0F, 24.0F, 14.0F));
               break;
            case 5:
               fishing4.a.m.a(var1, this.j, var4, fishing4.a.f.a(3.0F, 489.0F, 48.0F, 28.0F));
               break;
            case 6:
               fishing4.a.m.a(var1, this.j, var4, fishing4.a.f.a(1.0F, 586.0F, 22.0F, 14.0F));
         }
      }

   }
}

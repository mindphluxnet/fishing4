package fishing4.game;

import java.util.ArrayList;
import javax.microedition.khronos.opengles.GL10;

public final class ay {
   public static int a;
   private static ArrayList b;
   private static fishing4.a.w c;
   private static ArrayList d;
   private static ArrayList e;

   public static void a(GL10 var0) {
      byte var2 = 0;
      fishing4.a.w.a(var0, c);
      c = null;

      int var1;
      for(var1 = 0; var1 < d.size(); ++var1) {
         fishing4.a.w.a(var0, (fishing4.a.w)d.get(var1));
      }

      d.clear();
      d = null;
      if (e != null) {
         for(var1 = var2; var1 < e.size(); ++var1) {
            fishing4.a.w.a(var0, (fishing4.a.w)e.get(var1));
         }

         e.clear();
         e = null;
      }

      if (b != null) {
         b.clear();
         b = null;
      }

   }

   public static void a(GL10 var0, int var1) {
      byte var3 = 0;
      byte var5 = 0;
      byte var2 = 0;
      byte var4 = 0;
      byte var6 = 0;
      a = var1;
      ArrayList var7;
      switch (var1) {
         case 0:
            c = fishing4.a.w.a(var0, "img/sea/Yangzi/top.png");
            d = new ArrayList(5);

            for(var1 = 0; var1 < 5; ++var1) {
               d.add(var1, fishing4.a.w.a(var0, "img/sea/Yangzi/wave" + var1 + ".png"));
            }

            var7 = new ArrayList(2);
            e = var7;
            var7.add(0, fishing4.a.w.a(var0, "img/sea/fog0.png"));
            e.add(1, fishing4.a.w.a(var0, "img/sea/fog1.png"));
            break;
         case 1:
            c = fishing4.a.w.a(var0, "img/sea/Plit/top.png");
            d = new ArrayList(20);

            for(var1 = 0; var1 < 10; ++var1) {
               d.add(var1, fishing4.a.w.a(var0, "img/sea/Plit/wave" + var1 + "b.png"));
            }

            for(var1 = 0; var1 < 10; ++var1) {
               d.add(var1 + 10, fishing4.a.w.a(var0, "img/sea/Plit/wave" + var1 + "a.png"));
            }

            var7 = new ArrayList(2);
            e = var7;
            var7.add(0, fishing4.a.w.a(var0, "img/sea/Plit/eff0.png"));
            e.add(1, fishing4.a.w.a(var0, "img/sea/Plit/eff1.png"));
            break;
         case 2:
            c = fishing4.a.w.a(var0, "img/sea/Baikal/top.png");
            d = new ArrayList(5);

            for(var1 = var4; var1 < 5; ++var1) {
               d.add(var1, fishing4.a.w.a(var0, "img/sea/Baikal/wave" + var1 + ".png"));
            }

            return;
         case 3:
            c = fishing4.a.w.a(var0, "img/sea/Eastsea/top.png");
            d = new ArrayList(5);

            for(var1 = var6; var1 < 5; ++var1) {
               d.add(var1, fishing4.a.w.a(var0, "img/sea/Eastsea/wave" + var1 + ".png"));
            }

            var7 = new ArrayList(1);
            e = var7;
            var7.add(fishing4.a.w.a(var0, "img/sea/Eastsea/sunshine.png"));
            break;
         case 4:
            c = fishing4.a.w.a(var0, "img/sea/Moldive/top.png");
            d = new ArrayList(5);

            for(var1 = 0; var1 < 5; ++var1) {
               d.add(var1, fishing4.a.w.a(var0, "img/sea/Moldive/wave" + var1 + ".png"));
            }

            var7 = new ArrayList(1);
            e = var7;
            var7.add(fishing4.a.w.a(var0, "img/sea/Moldive/eff0.png"));
            b = new ArrayList(4);

            for(var1 = var2; var1 < 4; ++var1) {
               b.add(var1, new ax());
            }

            return;
         case 5:
            c = fishing4.a.w.a(var0, "img/sea/Asawa/top.png");
            d = new ArrayList(5);

            for(var1 = var3; var1 < 5; ++var1) {
               d.add(var1, fishing4.a.w.a(var0, "img/sea/Asawa/wave" + var1 + ".png"));
            }

            var7 = new ArrayList(1);
            e = var7;
            var7.add(fishing4.a.w.a(var0, "img/sea/Asawa/eff0.png"));
            break;
         case 6:
            c = fishing4.a.w.a(var0, "img/sea/Capehorn/top.png");
            d = new ArrayList(5);

            for(var1 = var5; var1 < 5; ++var1) {
               d.add(var1, fishing4.a.w.a(var0, "img/sea/Capehorn/wave" + var1 + ".png"));
            }

            return;
         case 7:
            c = fishing4.a.w.a(var0, "img/sea/Polarsea/top.png");
            d = new ArrayList(5);

            for(var1 = 0; var1 < 5; ++var1) {
               d.add(var1, fishing4.a.w.a(var0, "img/sea/Polarsea/wave" + var1 + ".png"));
            }

            var7 = new ArrayList(3);
            e = var7;
            var7.add(0, fishing4.a.w.a(var0, "img/sea/fog0.png"));
            e.add(1, fishing4.a.w.a(var0, "img/sea/fog1.png"));
            e.add(2, fishing4.a.w.a(var0, "img/sea/Polarsea/eff0.png"));
      }

   }

   private static void a(GL10 var0, fishing4.a.w var1, fishing4.a.w var2, float var3, int var4) {
      float var5 = (float)var4 % (var1.c.a + var2.c.a);
      if (var5 < var1.c.a / 2.0F) {
         fishing4.a.m.a(var0, var1, -var5, var3, '\u0001');
         fishing4.a.m.a(var0, var2, -var5 + var1.c.a / 2.0F + var2.c.a / 2.0F, var3, '\u0001');
      } else {
         fishing4.a.m.a(var0, var1, -var5 + var1.c.a + var2.c.a, var3, '\u0001');
         fishing4.a.m.a(var0, var2, -var5 + var1.c.a / 2.0F + var2.c.a / 2.0F, var3, '\u0001');
      }

   }

   public static void b(GL10 var0, int var1) {
      int var3;
      label184: {
         var3 = var1 % 10;
         float var2;
         if (fishing4.a.m.width != 600 && fishing4.a.m.height != 600) {
            if (fishing4.a.m.height == 1232) {
               if (aw.f == 1) {
                  var2 = ((fishing4.a.w)d.get(var3)).c.b;
                  fishing4.a.m.a(var0, c, fishing4.a.m.getHalfWidthPixels(), 768.0F - c.c.b / 7.0F - 10.5F - 2.315F);
                  fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 + 10), fishing4.a.m.getHalfWidthPixels(), ((fishing4.a.w)d.get(var3 + 10)).c.b / 2.0F + var2 * 2.0F - 2.315F);
                  fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3), fishing4.a.m.getHalfWidthPixels(), var2 - 2.315F, fishing4.a.g.a(2.0F));
               } else if (aw.f == 2) {
                  var2 = ((fishing4.a.w)d.get(var3 / 2)).c.b / 2.0F;
                  fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 / 2), fishing4.a.m.getHalfWidthPixels(), var2 - 0.787F + 0.0F, 0.0F, (float)(var3 % 2) * var2, ((fishing4.a.w)d.get(var3 / 2)).c.a, var2, fishing4.a.g.a(2.01F));
                  fishing4.a.m.a(var0, c, fishing4.a.m.getHalfWidthPixels(), 854.0F - c.c.b / 2.0F - 0.787F, fishing4.a.g.a(1.001F));
               } else if (aw.f == 3) {
                  var2 = ((fishing4.a.w)d.get(var3 / 2)).c.b / 2.0F;
                  fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 / 2), fishing4.a.m.getHalfWidthPixels(), var2 - 0.9215F, 0.0F, (float)(var3 % 2) * var2, ((fishing4.a.w)d.get(var3 / 2)).c.a, var2, fishing4.a.g.a(2.01F));
                  fishing4.a.m.a(var0, c, fishing4.a.m.getHalfWidthPixels(), 854.0F - c.c.b / 2.0F - 0.9215F, fishing4.a.g.a(1.001F));
               } else if (aw.f == 4) {
                  var2 = ((fishing4.a.w)d.get(var3 / 2)).c.b / 2.0F;
                  fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 / 2), fishing4.a.m.getHalfWidthPixels(), var2 - 1.0F, 0.0F, (float)(var3 % 2) * var2, ((fishing4.a.w)d.get(var3 / 2)).c.a, var2, fishing4.a.g.a(2.01F));
                  fishing4.a.m.a(var0, c, fishing4.a.m.getHalfWidthPixels(), 854.0F - c.c.b / 2.0F - 1.5F, fishing4.a.g.a(1.001F));
               } else if (aw.f == 10) {
                  var2 = ((fishing4.a.w)d.get(var3 / 2)).c.b / 2.0F;
                  fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 / 2), fishing4.a.m.getHalfWidthPixels(), var2 - 0.0F, 0.0F, (float)(var3 % 2) * var2, ((fishing4.a.w)d.get(var3 / 2)).c.a, var2, fishing4.a.g.a(2.01F));
                  fishing4.a.m.a(var0, c, fishing4.a.m.getHalfWidthPixels(), 854.0F - c.c.b / 2.0F + 2.0F, fishing4.a.g.a(1.001F));
               } else {
                  var2 = ((fishing4.a.w)d.get(var3 / 2)).c.b / 2.0F;
                  fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 / 2), fishing4.a.m.getHalfWidthPixels(), var2, 0.0F, (float)(var3 % 2) * var2, ((fishing4.a.w)d.get(var3 / 2)).c.a, var2, fishing4.a.g.a(2.01F));
                  fishing4.a.m.a(var0, c, fishing4.a.m.getHalfWidthPixels(), 854.0F - c.c.b / 2.0F - 2.0F);
               }
               break label184;
            }

            if (fishing4.a.m.width != 540 && fishing4.a.m.height != 540) {
               if (fishing4.a.m.width != 720 && fishing4.a.m.height != 720) {
                  if (fishing4.a.m.width == 800 && fishing4.a.m.height == 1280 || fishing4.a.m.width == 1280 && fishing4.a.m.height == 800) {
                     if (aw.f == 1) {
                        var2 = ((fishing4.a.w)d.get(var3)).c.b;
                        fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3), fishing4.a.m.getHalfWidthPixels(), var2, fishing4.a.g.a(2.01F));
                        fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 + 10), fishing4.a.m.getHalfWidthPixels(), ((fishing4.a.w)d.get(var3 + 10)).c.b / 2.0F + var2 * 2.0F);
                     } else {
                        if (aw.f == 7) {
                           var2 = ((fishing4.a.w)d.get(var3 / 2)).c.b / 2.0F;
                           fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 / 2), fishing4.a.m.getHalfWidthPixels(), var2, 0.0F, (float)(var3 % 2) * var2, ((fishing4.a.w)d.get(var3 / 2)).c.a, var2, fishing4.a.g.a(2.01F));
                           fishing4.a.m.a(var0, c, fishing4.a.m.getHalfWidthPixels(), 854.0F - c.c.b / 2.0F, fishing4.a.g.a(1.001F));
                           break label184;
                        }

                        if (aw.f == 6) {
                           var2 = ((fishing4.a.w)d.get(var3 / 2)).c.b / 2.0F;
                           fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 / 2), fishing4.a.m.getHalfWidthPixels(), var2, 0.0F, (float)(var3 % 2) * var2, ((fishing4.a.w)d.get(var3 / 2)).c.a, var2, fishing4.a.g.a(2.01F));
                           fishing4.a.m.a(var0, c, fishing4.a.m.getHalfWidthPixels(), 854.0F - c.c.b / 2.0F, fishing4.a.g.a(1.01F));
                           break label184;
                        }

                        if (aw.f == 10) {
                           var2 = ((fishing4.a.w)d.get(var3 / 2)).c.b / 2.0F;
                           fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 / 2), fishing4.a.m.getHalfWidthPixels(), var2, 0.0F, (float)(var3 % 2) * var2, ((fishing4.a.w)d.get(var3 / 2)).c.a, var2, fishing4.a.g.a(2.01F));
                           fishing4.a.m.a(var0, c, fishing4.a.m.getHalfWidthPixels(), 854.0F - c.c.b / 2.0F, fishing4.a.g.a(1.024F));
                           break label184;
                        }

                        var2 = ((fishing4.a.w)d.get(var3 / 2)).c.b / 2.0F;
                        fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 / 2), fishing4.a.m.getHalfWidthPixels(), var2, 0.0F, (float)(var3 % 2) * var2, ((fishing4.a.w)d.get(var3 / 2)).c.a, var2, fishing4.a.g.a(2.01F));
                     }
                  } else if (aw.f == 1) {
                     var2 = ((fishing4.a.w)d.get(var3)).c.b;
                     fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3), fishing4.a.m.getHalfWidthPixels(), var2, fishing4.a.g.a(2.01F));
                     fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 + 10), fishing4.a.m.getHalfWidthPixels(), ((fishing4.a.w)d.get(var3 + 10)).c.b / 2.0F + var2 * 2.0F);
                  } else {
                     var2 = ((fishing4.a.w)d.get(var3 / 2)).c.b / 2.0F;
                     fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 / 2), fishing4.a.m.getHalfWidthPixels(), var2, 0.0F, (float)(var3 % 2) * var2, ((fishing4.a.w)d.get(var3 / 2)).c.a, var2, fishing4.a.g.a(2.01F));
                  }
               } else {
                  if (aw.f == 1) {
                     var2 = ((fishing4.a.w)d.get(var3)).c.b;
                     fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3), fishing4.a.m.getHalfWidthPixels(), var2, fishing4.a.g.a(2.01F));
                     fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 + 10), fishing4.a.m.getHalfWidthPixels(), ((fishing4.a.w)d.get(var3 + 10)).c.b / 2.0F + var2 * 2.0F);
                     fishing4.a.m.a(var0, c, fishing4.a.m.getHalfWidthPixels(), 854.0F - c.c.b / 2.0F, fishing4.a.g.a(1.0075F));
                     break label184;
                  }

                  if (aw.f == 0 || aw.f == 5) {
                     var2 = ((fishing4.a.w)d.get(var3 / 2)).c.b / 2.0F;
                     fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 / 2), fishing4.a.m.getHalfWidthPixels(), var2, 0.0F, (float)(var3 % 2) * var2, ((fishing4.a.w)d.get(var3 / 2)).c.a, var2, fishing4.a.g.a(2.01F));
                     fishing4.a.m.a(var0, c, fishing4.a.m.getHalfWidthPixels(), 854.0F - c.c.b / 2.0F, fishing4.a.g.a(1.01F));
                     break label184;
                  }

                  if (aw.f == 6) {
                     var2 = ((fishing4.a.w)d.get(var3 / 2)).c.b / 2.0F;
                     fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 / 2), fishing4.a.m.getHalfWidthPixels(), var2, 0.0F, (float)(var3 % 2) * var2, ((fishing4.a.w)d.get(var3 / 2)).c.a, var2, fishing4.a.g.a(2.01F));
                     fishing4.a.m.a(var0, c, fishing4.a.m.getHalfWidthPixels(), 854.0F - c.c.b / 2.0F, fishing4.a.g.a(1.07F));
                     break label184;
                  }

                  if (aw.f == 10) {
                     var2 = ((fishing4.a.w)d.get(var3 / 2)).c.b / 2.0F;
                     fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 / 2), fishing4.a.m.getHalfWidthPixels(), var2, 0.0F, (float)(var3 % 2) * var2, ((fishing4.a.w)d.get(var3 / 2)).c.a, var2, fishing4.a.g.a(2.01F));
                     fishing4.a.m.a(var0, c, fishing4.a.m.getHalfWidthPixels(), 854.0F - c.c.b / 2.0F, fishing4.a.g.a(1.009F));
                     break label184;
                  }

                  var2 = ((fishing4.a.w)d.get(var3 / 2)).c.b / 2.0F;
                  fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 / 2), fishing4.a.m.getHalfWidthPixels(), var2, 0.0F, (float)(var3 % 2) * var2, ((fishing4.a.w)d.get(var3 / 2)).c.a, var2, fishing4.a.g.a(2.01F));
               }
            } else if (aw.f == 1) {
               var2 = ((fishing4.a.w)d.get(var3)).c.b;
               fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3), fishing4.a.m.getHalfWidthPixels(), var2, fishing4.a.g.a(2.01F));
               fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 + 10), fishing4.a.m.getHalfWidthPixels(), ((fishing4.a.w)d.get(var3 + 10)).c.b / 2.0F + var2 * 2.0F);
            } else {
               if (aw.f == 2 || aw.f == 4) {
                  var2 = ((fishing4.a.w)d.get(var3 / 2)).c.b / 2.0F;
                  fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 / 2), fishing4.a.m.getHalfWidthPixels(), var2, 0.0F, (float)(var3 % 2) * var2, ((fishing4.a.w)d.get(var3 / 2)).c.a, var2, fishing4.a.g.a(2.01F));
                  fishing4.a.m.a(var0, c, fishing4.a.m.getHalfWidthPixels(), 854.0F - c.c.b / 2.0F, fishing4.a.g.a(1.001F));
                  break label184;
               }

               if (aw.f == 6) {
                  var2 = ((fishing4.a.w)d.get(var3 / 2)).c.b / 2.0F;
                  fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 / 2), fishing4.a.m.getHalfWidthPixels(), var2, 0.0F, (float)(var3 % 2) * var2, ((fishing4.a.w)d.get(var3 / 2)).c.a, var2, fishing4.a.g.a(2.01F));
                  fishing4.a.m.a(var0, c, fishing4.a.m.getHalfWidthPixels(), 854.0F - c.c.b / 2.0F, fishing4.a.g.a(1.0075F));
                  break label184;
               }

               if (aw.f == 10) {
                  var2 = ((fishing4.a.w)d.get(var3 / 2)).c.b / 2.0F;
                  fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 / 2), fishing4.a.m.getHalfWidthPixels(), var2, 0.0F, (float)(var3 % 2) * var2, ((fishing4.a.w)d.get(var3 / 2)).c.a, var2, fishing4.a.g.a(2.01F));
                  fishing4.a.m.a(var0, c, fishing4.a.m.getHalfWidthPixels(), 854.0F - c.c.b / 2.0F, fishing4.a.g.a(1.01F));
                  break label184;
               }

               var2 = ((fishing4.a.w)d.get(var3 / 2)).c.b / 2.0F;
               fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 / 2), fishing4.a.m.getHalfWidthPixels(), var2, 0.0F, (float)(var3 % 2) * var2, ((fishing4.a.w)d.get(var3 / 2)).c.a, var2, fishing4.a.g.a(2.01F));
            }
         } else {
            if (aw.f == 1) {
               var2 = ((fishing4.a.w)d.get(var3)).c.b;
               fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3), fishing4.a.m.getHalfWidthPixels(), var2 - 4.0F, fishing4.a.g.a(2.01F));
               fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 + 10), fishing4.a.m.getHalfWidthPixels(), ((fishing4.a.w)d.get(var3 + 10)).c.b / 2.0F + var2 * 2.0F - 3.0F);
               fishing4.a.m.a(var0, c, fishing4.a.m.getHalfWidthPixels(), 854.0F - c.c.b / 2.0F - 3.0F);
               break label184;
            }

            if (aw.f == 0 || aw.f == 7) {
               var2 = ((fishing4.a.w)d.get(var3 / 2)).c.b / 2.0F;
               fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 / 2), fishing4.a.m.getHalfWidthPixels(), var2 - 2.0F, 0.0F, (float)(var3 % 2) * var2, ((fishing4.a.w)d.get(var3 / 2)).c.a, var2 - 2.0F, fishing4.a.g.a(2.01F));
               fishing4.a.m.a(var0, c, fishing4.a.m.getHalfWidthPixels(), 854.0F - c.c.b / 2.0F - 6.0F);
               break label184;
            }

            var2 = ((fishing4.a.w)d.get(var3 / 2)).c.b / 2.0F;
            fishing4.a.m.a(var0, (fishing4.a.w)d.get(var3 / 2), fishing4.a.m.getHalfWidthPixels(), var2, 0.0F, (float)(var3 % 2) * var2, ((fishing4.a.w)d.get(var3 / 2)).c.a, var2, fishing4.a.g.a(2.01F));
         }

         fishing4.a.m.a(var0, c, fishing4.a.m.getHalfWidthPixels(), 854.0F - c.c.b / 2.0F);
      }

      switch (aw.f) {
         case 0:
            a(var0, (fishing4.a.w)e.get(0), (fishing4.a.w)e.get(1), 500.0F, var1);
            break;
         case 1:
            if (var1 % 40 < 20) {
               var3 = (int)(255.0 * (0.1 + (double)((float)(var1 % 20 * 35) * 0.001F)));
               var1 = 230 - var3;
            } else {
               var3 = 230 - (int)(255.0 * (0.1 + (double)((float)(var1 % 20 * 35) * 0.001F)));
               var1 = (int)(255.0 * (0.1 + (double)((float)(var1 % 20 * 35) * 0.001F)));
            }

            var3 /= 2;
            var1 /= 2;
            fishing4.a.m.a(var0, (fishing4.a.w)e.get(0), fishing4.a.e.a(fishing4.a.m.getHalfWidthPixels(), 854.0F - ((fishing4.a.w)e.get(0)).c.b / 2.0F), '\u0001', var3);
            fishing4.a.m.a(var0, (fishing4.a.w)e.get(1), fishing4.a.e.a(fishing4.a.m.getHalfWidthPixels(), 854.0F - ((fishing4.a.w)e.get(1)).c.b / 2.0F), '\u0001', var1);
         case 2:
         case 6:
         default:
            break;
         case 3:
            if (var1 % 50 < 25) {
               var1 = var1 % 25 * 8 + 55;
            } else {
               var1 = 255 - var1 % 25 * 8;
            }

            fishing4.a.m.a(var0, (fishing4.a.w)e.get(0), fishing4.a.e.a((float)(fishing4.a.m.getWidthPixels() - 108), 786.0F), '\u0005', var1);
            break;
         case 4:
            for(var1 = 0; var1 < b.size(); ++var1) {
               ((ax)b.get(var1)).a(var0, (fishing4.a.w)e.get(0));
            }

            return;
         case 5:
            if (var1 % 50 < 25) {
               var1 = var1 % 25 * 4 + 155;
            } else {
               var1 = 255 - var1 % 25 * 4;
            }

            fishing4.a.m.a(var0, (fishing4.a.w)e.get(0), fishing4.a.e.a(fishing4.a.m.getHalfWidthPixels(), 854.0F - ((fishing4.a.w)e.get(0)).c.b / 2.0F), '\u0005', var1);
            break;
         case 7:
            if (var1 % 50 < 25) {
               var3 = var1 % 25 * 8 + 55;
            } else {
               var3 = 255 - var1 % 25 * 8;
            }

            fishing4.a.m.a(var0, (fishing4.a.w)e.get(2), fishing4.a.e.a(fishing4.a.m.getHalfWidthPixels(), 854.0F - ((fishing4.a.w)e.get(0)).c.b / 2.0F + 30.0F), '\u0001', var3);
            a(var0, (fishing4.a.w)e.get(0), (fishing4.a.w)e.get(1), 480.0F, var1);
            a(var0, (fishing4.a.w)e.get(0), (fishing4.a.w)e.get(1), 460.0F, var1 + 500);
            a(var0, (fishing4.a.w)e.get(0), (fishing4.a.w)e.get(1), 430.0F, var1 + 1000);
            a(var0, (fishing4.a.w)e.get(0), (fishing4.a.w)e.get(1), 400.0F, var1 + 1500);
      }

   }
}

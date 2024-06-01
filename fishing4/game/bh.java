package fishing4.game;

import javax.microedition.khronos.opengles.GL10;

import fishing4.a.GLRootView;
import fishing4.a.RGBColor;

public final class bh {
   public static int a;
   public static int b;
   public static be c;

   public static void a(fishing4.a.e var0) {
      if (am.e && am.b != -1) {
         switch (a) {
            case 3:
               if (am.b == 160) {
                  if (am.c.a(var0, true)) {
                     am.b();
                     bb.a(2);
                  } else if (!am.d.a(var0, true)) {
                     k.d();
                  } else {
                     am.b();
                     bd.a(2131165305);
                     a = 4;
                     be.a = true;
                  }
               }
         }
      } else {
         be var1 = c;
         if (be.a()) {
            switch (a) {
               case 1:
                  bd.a(2131165274);
                  a = 2;
                  b = 1;
                  bb.f = 1;
                  be.a = true;
                  break;
               case 2:
                  if (b == 1) {
                     b = 0;
                     bb.f = 0;
                     bd.a(2131165275);
                     be.a = true;
                  } else if (b == 0) {
                     b = 3;
                     bb.f = 3;
                     bd.a(2131165276);
                     be.a = true;
                  } else if (b == 3) {
                     b = 4;
                     bb.f = 4;
                     bd.a(2131165277);
                     be.a = true;
                  } else if (b == 4) {
                     b = 2;
                     bb.f = 2;
                     bd.a(2131165278);
                     be.a = true;
                  } else if (b == 2) {
                     b = 5;
                     bb.f = 5;
                     bd.a(2131165279);
                     be.a = true;
                  } else if (b == 5) {
                     a = 3;
                     bb.f = 0;
                     b = 0;
                     bd.a(2131165280);
                     be.a = true;
                  } else if (b == 6) {
                     a = 3;
                     bb.f = 0;
                     b = 0;
                     bd.a(2131165280);
                     be.a = true;
                  }
               case 3:
               case 5:
               case 6:
               case 7:
               case 8:
               case 9:
               case 12:
               case 13:
               case 14:
               case 15:
               case 16:
               case 17:
               case 18:
               case 19:
               case 21:
               case 22:
               case 23:
               case 24:
               case 25:
               case 26:
               case 27:
               case 28:
               case 29:
               case 30:
               case 31:
               case 32:
               case 33:
               case 34:
               case 35:
               case 36:
               case 37:
               case 38:
               case 39:
               case 47:
               case 48:
               case 49:
               case 51:
               default:
                  break;
               case 4:
                  c();
                  break;
               case 10:
               case 11:
               case 20:
                  a = 21;
                  b = 0;
                  bd.a(2131165288);
                  break;
               case 40:
                  a = 41;
                  b = 0;
                  bd.a(2131165293);
                  break;
               case 41:
                  a = 42;
                  b = 0;
                  bd.a(2131165294);
                  break;
               case 42:
                  a = 43;
                  b = 0;
                  bd.a(2131165295);
                  break;
               case 43:
                  a = 44;
                  b = 0;
                  bd.a(2131165296);
                  break;
               case 44:
                  a = 45;
                  b = 0;
                  bd.a(2131165297);
                  break;
               case 45:
                  a = 46;
                  b = 0;
                  bd.a(2131165298);
                  break;
               case 46:
                  aw.a(4);
                  break;
               case 50:
                  b = 0;
                  aw.a(1);
                  fishing4.a.ae.j = 1;
                  break;
               case 52:
                  ad.o.c(20000L);
                  a = 100;
                  k.f();
                  am.a(162);
                  break;
               case 53:
                  ad.o.c(10000L);
                  a = 100;
                  k.f();
                  am.a(163);
            }
         }
      }

   }

   public static void a(GL10 var0, int var1) {
      if (a == 0) {
         if (c != null) {
            c.a(var0);
         }

         c = null;
         c = be.a(var0, 6);
         a = 1;
         b = 0;
         bd.a(2131165273);
         be.a = true;
      } else if (a()) {
         be var2;
         fishing4.a.w var3;
         switch (a) {
            case 1:
            case 3:
            case 4:
               if (be.a) {
                  var2 = c;
                  var3 = az.s;
                  var2.b(var0, var1);
               }

               bd.a(var0, az.s);
               break;
            case 2:
               bd.a(var0, az.s);
               break;
            case 10:
            case 11:
            case 20:
               var2 = c;
               var3 = az.s;
               var2.b(var0, var1);
               bd.a(var0, az.s);
               break;
            case 21:
               if (b < 60) {
                  if (b % 20 < 10) {
                     fishing4.a.m.a(var0, 85.0F, 180.0F, 140.0F, 200.0F, RGBColor.getColor(1.0F, 0.0F, 0.0F, 0.5F));
                  }

                  var1 = b + 1;
                  b = var1;
                  if (var1 == 60) {
                     bd.b = System.currentTimeMillis();
                     be.a = true;
                  }
               } else {
                  var2 = c;
                  var3 = az.s;
                  var2.b(var0, var1);
                  bd.a(var0, az.s);
               }
               break;
            case 22:
               if (b < 60) {
                  var1 = b + 1;
                  b = var1;
                  if (var1 == 60) {
                     bd.b = System.currentTimeMillis();
                     be.a = true;
                  }
               } else {
                  var2 = c;
                  var3 = az.s;
                  var2.b(var0, var1);
                  bd.a(var0, az.s);
               }
               break;
            case 23:
               if (b >= 60) {
                  bd.a(var0, az.s);
               }
               break;
            case 30:
               if (b < 60) {
                  if ((float)b < 19.800001F) {
                     ah.i = false;
                     ah.k = true;
                     ah.j = false;
                  } else if ((float)b < 39.600002F) {
                     ah.i = true;
                     ah.k = false;
                     ah.j = false;
                  } else if (b < 60) {
                     ah.i = false;
                     ah.k = false;
                     ah.j = true;
                  }

                  var1 = b + 1;
                  b = var1;
                  if (var1 == 60) {
                     bd.b = System.currentTimeMillis();
                     ah.i = false;
                     ah.k = false;
                     ah.j = false;
                     be.a = true;
                  }
               } else {
                  bd.a(var0, az.s);
               }
               break;
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
               if (b < 60) {
                  var1 = b + 1;
                  b = var1;
                  if (var1 == 60) {
                     bd.b = System.currentTimeMillis();
                     be.a = true;
                  }
               } else {
                  bd.a(var0, az.s);
               }
               break;
            case 50:
            case 52:
            case 53:
               var2 = c;
               var3 = az.s;
               var2.b(var0, var1);
               bd.a(var0, az.s);
         }
      }

   }

   public static boolean a() {
      boolean var0;
      if (a != 100) {
         var0 = true;
      } else {
         var0 = false;
      }

      return var0;
   }

   public static boolean b() {
      boolean var0;
      if (a == 51) {
         var0 = true;
      } else {
         var0 = false;
      }

      return var0;
   }

   public static void c() {
      am.b();
      a = 100;
      if (OptionsManager.i == 1) {
         ad.o.c(10000L);
         OptionsManager.i = 2;
         OptionsManager.b();
         fishing4.b.d.a().b(GLRootView.getAppContext(), 2131034133);
         am.a(96);
      }

      k.f();
   }
}

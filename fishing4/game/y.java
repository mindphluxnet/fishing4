package fishing4.game;

public final class y {
   protected int a;
   protected int b;
   protected int c;

   private y(int var1, int var2) {
      this.a = var1;
      this.b = var2;
      this.c = 0;
   }

   private y(int var1, int var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public static y a(int var0, int var1) {
      return new y(var0, var1);
   }

   public static y a(int var0, int var1, int var2) {
      return new y(var0, var1, var2);
   }

   public static void a() {
      for(int var0 = 0; var0 < ad.h.size(); ++var0) {
         for(int var1 = 0; var1 < ((ag)ad.h.get(var0)).b.size(); ++var1) {
            ((m)((ag)ad.h.get(var0)).b.get(var1)).d = false;
            ((m)((ag)ad.h.get(var0)).b.get(var1)).e = false;
         }
      }

   }

   public static boolean a(int var0, float var1) {
      boolean var3 = true;

      for(int var2 = 0; var2 < 35; ++var2) {
         if (w.a[var2].c == 2 || w.a[var2].c == 3) {
            switch (w.a[var2].b) {
               case 1:
                  if (m.d(var0) == 1) {
                     return var3;
                  }
               case 2:
               case 3:
               case 5:
               case 7:
               case 9:
               case 11:
               case 13:
               case 15:
               case 17:
               case 18:
               case 20:
               case 22:
               case 25:
               case 26:
               case 27:
               case 29:
               case 31:
               default:
                  break;
               case 4:
                  if (m.d(var0) == 2) {
                     return var3;
                  }
                  break;
               case 6:
                  if (var0 == 14 && m.a(var1, var0) >= 55.0F) {
                     return var3;
                  }
                  break;
               case 8:
                  if (m.d(var0) == 3) {
                     return var3;
                  }
                  break;
               case 10:
                  if (var0 == 37 && m.a(var1, var0) >= 120.0F) {
                     return var3;
                  }
                  break;
               case 12:
                  if (m.d(var0) == 4) {
                     return var3;
                  }
                  break;
               case 14:
                  if (var0 == 79 && m.a(var1, var0) <= 14.0F) {
                     return var3;
                  }
                  break;
               case 16:
                  if (m.d(var0) == 5) {
                     return var3;
                  }
                  break;
               case 19:
                  if (var0 == 101 && m.a(var1, var0) >= 440.0F) {
                     return var3;
                  }
                  break;
               case 21:
                  if (var0 == 101 && m.a(var1, var0) <= 140.0F) {
                     return var3;
                  }
                  break;
               case 23:
                  if (m.d(var0) == 6 && m.a(var1, var0) >= 150.0F) {
                     return var3;
                  }
                  break;
               case 24:
                  if (var0 == 125 && m.a(var1, var0) >= 240.0F) {
                     return var3;
                  }
                  break;
               case 28:
                  if (m.d(var0) > 0 && m.d(var0) <= 7) {
                     return var3;
                  }
                  break;
               case 30:
                  if (var0 == 137 && m.a(var1, var0) >= 80.0F) {
                     return var3;
                  }
                  break;
               case 32:
                  if (var0 == 141 && m.a(var1, var0) >= 2200.0F) {
                     return var3;
                  }
            }
         }
      }

      var3 = false;
      return var3;
   }

   private static boolean a(int var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var11 = false;
      int var8 = 0;

      int var7;
      int var10;
      for(var7 = 0; var8 < ad.h.size(); ++var8) {
         for(int var9 = 0; var9 < ((ag)ad.h.get(var8)).b.size(); var7 = var10) {
            label73: {
               m var12 = (m)((ag)ad.h.get(var8)).b.get(var9);
               if (var1 >= 0 && var1 < 187) {
                  if (var12.a != var1) {
                     var10 = var7;
                     break label73;
                  }
               } else if (var1 == -10) {
                  var10 = var7;
                  if (!var12.d()) {
                     break label73;
                  }
               } else if (var1 == -11) {
                  var10 = var7;
                  if (!var12.c()) {
                     break label73;
                  }
               }

               if (var2 > 0) {
                  var10 = var7;
                  if (var12.i() < (float)var2) {
                     break label73;
                  }
               }

               if (var3 > 0) {
                  var10 = var7;
                  if (var12.i() > (float)var3) {
                     break label73;
                  }
               }

               if (var4 != -1) {
                  var10 = var7;
                  if (var12.f() != var4) {
                     break label73;
                  }
               }

               if (var5 > 0) {
                  var10 = var7;
                  if (var12.h() < var5 - 1) {
                     break label73;
                  }
               }

               var10 = var7 + 1;
               if (var0 == 0) {
                  var12.d = true;
               } else {
                  var12.e = true;
               }
            }

            ++var9;
         }
      }

      if (var7 >= var6) {
         var11 = true;
      }

      return var11;
   }

   public static boolean a(boolean var0) {
      boolean var2 = false;

      for(int var1 = 0; var1 < 35; ++var1) {
         if (w.a[var1].c == 2 || var0 && w.a[var1].c == 3) {
            switch (w.a[var1].b) {
               case 1:
                  if (a(w.a[var1].a, -1, -1, -1, 1, -1, 5)) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 2:
                  if (x.a(false) > 0) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 3:
                  if (x.a(false) >= 2) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 4:
                  if (a(w.a[var1].a, -1, -1, -1, 2, -1, 5)) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 5:
                  if (x.a(false) >= 3) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 6:
                  if (a(w.a[var1].a, 14, 55, -1, -1, -1, 1)) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 7:
                  if (x.a(false) >= 4) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 8:
                  if (a(w.a[var1].a, -1, -1, -1, 3, -1, 5)) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 9:
                  if (x.a(false) >= 6) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 10:
                  if (a(w.a[var1].a, 37, 120, -1, -1, -1, 1)) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 11:
                  if (x.a(false) >= 7) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 12:
                  if (a(w.a[var1].a, -1, -1, -1, 4, -1, 10)) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 13:
                  if (x.a(false) >= 9) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 14:
                  if (a(w.a[var1].a, 79, -1, 14, -1, -1, 1)) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 15:
                  if (x.a(false) >= 10) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 16:
                  if (a(w.a[var1].a, -1, -1, -1, 5, -1, 10)) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 17:
                  if (b(3, -1)) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 18:
                  if (x.a(false) >= 11) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 19:
                  if (a(w.a[var1].a, 101, 440, -1, -1, -1, 1)) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 20:
                  if (x.a(false) >= 12) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 21:
                  if (a(w.a[var1].a, 91, -1, 140, -1, -1, 1)) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 22:
                  if (x.a(false) >= 13) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 23:
                  if (a(w.a[var1].a, -1, 150, -1, 6, -1, 5)) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 24:
                  if (a(w.a[var1].a, 125, 240, -1, -1, -1, 1)) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 25:
                  if (x.a(false) >= 15) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 26:
                  if (b(5, -1)) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 27:
                  if (x.a(false) >= 16) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 28:
                  boolean var9 = a(w.a[var1].a, -1, -1, -1, 7, -1, 1);
                  boolean var6 = a(w.a[var1].a, -1, -1, -1, 6, -1, 1);
                  boolean var8 = a(w.a[var1].a, -1, -1, -1, 5, -1, 1);
                  boolean var4 = a(w.a[var1].a, -1, -1, -1, 4, -1, 1);
                  boolean var7 = a(w.a[var1].a, -1, -1, -1, 3, -1, 1);
                  boolean var3 = a(w.a[var1].a, -1, -1, -1, 2, -1, 1);
                  boolean var5 = a(w.a[var1].a, -1, -1, -1, 1, -1, 1);
                  if (var9 && var6 && var8 && var4 && var7 && var3 && var5) {
                     w.a[var1].c = 3;
                     var2 = true;
                     break;
                  }

                  w.a[var1].c = 2;
                  break;
               case 29:
                  if (x.a(false) >= 17) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 30:
                  if (a(w.a[var1].a, 137, 80, -1, -1, -1, 1)) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 31:
                  if (x.a(false) >= 18) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 32:
                  if (a(w.a[var1].a, 141, 2200, -1, -1, -1, 1)) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 33:
                  if (x.a(false) >= 19) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
                  break;
               case 34:
                  if (b(8, -1)) {
                     w.a[var1].c = 3;
                     var2 = true;
                  } else {
                     w.a[var1].c = 2;
                  }
            }
         }
      }

      return var2;
   }

   public static boolean b() {
      return a(true);
   }

   public static boolean b(int var0, float var1) {
      boolean var3 = true;

      for(int var2 = 0; var2 < 33; ++var2) {
         if (v.a[var2].c == 2 || v.a[var2].c == 3) {
            switch (v.a[var2].b) {
               case 1:
                  if (m.b(var0) && m.b(var1) > 0) {
                     return var3;
                  }
               case 2:
               case 4:
               case 7:
               case 10:
               case 12:
               case 13:
               case 16:
               case 19:
               case 20:
               case 22:
               case 23:
               case 25:
               case 27:
               case 29:
               default:
                  break;
               case 3:
                  if (m.d(var0) == 2 && m.b(var1) > 0) {
                     return var3;
                  }
                  break;
               case 5:
                  if (m.a(var0) && m.b(var1) > 0) {
                     return var3;
                  }
                  break;
               case 6:
                  if (var0 == 156 && m.b(var1) > 0) {
                     return var3;
                  }
                  break;
               case 8:
                  if (var0 == 46 && m.b(var1) > 0) {
                     return var3;
                  }
                  break;
               case 9:
                  if (var0 == 161 && m.b(var1) > 0) {
                     return var3;
                  }
                  break;
               case 11:
                  if (m.b(var1) >= 2) {
                     return var3;
                  }
                  break;
               case 14:
                  if (m.d(var0) == 4 && m.b(var1) >= 2) {
                     return var3;
                  }
                  break;
               case 15:
                  if (var0 == 62 && m.b(var1) >= 2) {
                     return var3;
                  }
                  break;
               case 17:
                  if (var0 == 178 && m.b(var1) >= 3) {
                     return var3;
                  }
                  break;
               case 18:
                  if (m.a(var0) && m.b(var1) >= 3) {
                     return var3;
                  }
                  break;
               case 21:
                  if (m.d(var0) == 6 && m.b(var1) >= 3) {
                     return var3;
                  }
                  break;
               case 24:
                  if (m.d(var0) == 7 && m.b(var1) >= 4) {
                     return var3;
                  }
                  break;
               case 26:
                  if (m.d(var0) > 0 && m.d(var0) <= 6 && m.b(var1) >= 3) {
                     return var3;
                  }
                  break;
               case 28:
                  if (var0 == 139 && m.b(var1) >= 4) {
                     return var3;
                  }
                  break;
               case 30:
                  if (m.d(var0) > 0 && m.d(var0) <= 8 && m.b(var1) >= 4) {
                     return var3;
                  }
            }
         }
      }

      var3 = false;
      return var3;
   }

   private static boolean b(int var0, int var1) {
      boolean var4 = false;
      boolean var3;
      if (var1 == -1) {
         for(var1 = 0; var1 < 187; ++var1) {
            if (m.d(var1) <= var0) {
               var3 = var4;
               if (s.a[var1] == 0.0F) {
                  return var3;
               }
            }
         }
      } else {
         for(int var2 = 0; var2 < 187; ++var2) {
            if (m.d(var2) <= var0) {
               var3 = var4;
               if (s.b[var2] == 0.0F) {
                  return var3;
               }

               var3 = var4;
               if (m.b(s.b[var2]) < var1 - 1) {
                  return var3;
               }
            }
         }
      }

      var3 = true;
      return var3;
   }

   public static boolean b(boolean var0) {
      boolean var2 = false;

      for(int var1 = 0; var1 < 33; ++var1) {
         if (v.a[var1].c == 2 || var0 && v.a[var1].c == 3) {
            boolean var3;
            boolean var4;
            boolean var5;
            boolean var6;
            boolean var7;
            boolean var8;
            switch (v.a[var1].b) {
               case 1:
                  if (a(v.a[var1].a, -10, -1, -1, -1, 2, 3)) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 2:
                  if (x.b(false) >= 2) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 3:
                  if (a(v.a[var1].a, -1, -1, -1, 2, 2, 3)) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 4:
                  if (x.b(false) >= 4) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 5:
                  if (a(v.a[var1].a, -11, -1, -1, -1, 2, 3)) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 6:
                  if (a(v.a[var1].a, 156, -1, -1, -1, 2, 1)) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 7:
                  if (x.b(false) >= 6) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 8:
                  if (a(v.a[var1].a, 46, -1, -1, -1, 2, 3)) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 9:
                  if (a(v.a[var1].a, 161, -1, -1, -1, 2, 3)) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 10:
                  if (x.b(false) >= 8) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 11:
                  if (a(v.a[var1].a, -1, -1, -1, -1, 3, 3)) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 12:
                  if (b(2, 2)) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 13:
                  if (x.b(false) >= 10) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 14:
                  if (a(v.a[var1].a, -1, -1, -1, 4, 3, 3)) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 15:
                  if (a(v.a[var1].a, 62, -1, -1, -1, 3, 1)) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 16:
                  if (x.b(false) >= 12) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 17:
                  if (a(v.a[var1].a, 178, -1, -1, -1, 4, 1)) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 18:
                  if (a(v.a[var1].a, -11, -1, -1, -1, 4, 5)) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 19:
                  if (x.b(false) >= 14) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 20:
                  if (b(3, 3)) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 21:
                  if (a(v.a[var1].a, -1, -1, -1, 6, 4, 1)) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 22:
                  if (x.b(false) >= 16) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 23:
                  if (b(5, 3)) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 24:
                  if (a(v.a[var1].a, -1, -1, -1, 7, 5, 1)) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 25:
                  if (x.b(false) >= 18) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 26:
                  var3 = a(v.a[var1].a, -1, -1, -1, 6, 4, 1);
                  var5 = a(v.a[var1].a, -1, -1, -1, 5, 4, 1);
                  var6 = a(v.a[var1].a, -1, -1, -1, 4, 4, 1);
                  var8 = a(v.a[var1].a, -1, -1, -1, 3, 4, 1);
                  var7 = a(v.a[var1].a, -1, -1, -1, 2, 4, 1);
                  var4 = a(v.a[var1].a, -1, -1, -1, 1, 4, 1);
                  if (var3 && var5 && var6 && var8 && var7 && var4) {
                     v.a[var1].c = 3;
                     var2 = true;
                     break;
                  }

                  v.a[var1].c = 2;
                  break;
               case 27:
                  if (b(5, 4)) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 28:
                  if (a(v.a[var1].a, 139, -1, -1, -1, 5, 1)) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 29:
                  if (x.b(false) >= 20) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 30:
                  boolean var10 = a(v.a[var1].a, -1, -1, -1, 8, 5, 1);
                  var3 = a(v.a[var1].a, -1, -1, -1, 7, 5, 1);
                  var6 = a(v.a[var1].a, -1, -1, -1, 6, 5, 1);
                  var8 = a(v.a[var1].a, -1, -1, -1, 5, 5, 1);
                  var7 = a(v.a[var1].a, -1, -1, -1, 4, 5, 1);
                  var4 = a(v.a[var1].a, -1, -1, -1, 3, 5, 1);
                  var5 = a(v.a[var1].a, -1, -1, -1, 2, 5, 1);
                  boolean var9 = a(v.a[var1].a, -1, -1, -1, 1, 5, 1);
                  if (var10 && var3 && var6 && var8 && var7 && var4 && var5 && var9) {
                     v.a[var1].c = 3;
                     var2 = true;
                     break;
                  }

                  v.a[var1].c = 2;
                  break;
               case 31:
                  if (b(8, 4)) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
                  break;
               case 32:
                  if (b(8, 5)) {
                     v.a[var1].c = 3;
                     var2 = true;
                  } else {
                     v.a[var1].c = 2;
                  }
            }
         }
      }

      return var2;
   }

   public static boolean c() {
      return b(true);
   }

   public final boolean d() {
      boolean var2 = false;
      boolean var1;
      if (this.a == 0) {
         switch (this.b) {
            case 1:
               var1 = ad.o.c(1000L);
               break;
            case 2:
               var1 = ad.a(201, 5L, true);
               break;
            case 3:
               var1 = ad.a(102, 1L, true);
               break;
            case 4:
               var1 = ad.a(301, 1, 1L, true);
               break;
            case 5:
               var1 = ad.o.c(3000L);
               break;
            case 6:
               var1 = ad.a(500, 1L, true);
               break;
            case 7:
               var1 = ad.o.c(5000L);
               break;
            case 8:
               var1 = ad.a(106, 1, 1L, true);
               break;
            case 9:
               var1 = ad.o.c(7000L);
               break;
            case 10:
               var1 = ad.a(703, 1L, true);
               break;
            case 11:
               var1 = ad.o.c(10000L);
               break;
            case 12:
               var1 = ad.a(109, 2, 1L, true);
               break;
            case 13:
               var1 = ad.o.c(15000L);
               break;
            case 14:
               var1 = ad.a(603, 1L, true);
               break;
            case 15:
               var1 = ad.o.c(20000L);
               break;
            case 16:
               var1 = ad.a(305, 2, 1L, true);
               break;
            case 17:
               var1 = ad.o.c(50000L);
               break;
            case 18:
               var1 = ad.o.c(30000L);
               break;
            case 19:
               var1 = ad.a(112, 2, 1L, true);
               break;
            case 20:
               var1 = ad.o.c(40000L);
               break;
            case 21:
               var1 = ad.a(704, 1L, true);
               break;
            case 22:
               var1 = ad.o.c(60000L);
               break;
            case 23:
               var1 = ad.o.c(70000L);
               break;
            case 24:
               var1 = ad.a(214, 5L, true);
               break;
            case 25:
               var1 = ad.o.c(80000L);
               break;
            case 26:
               var1 = ad.a(114, 2, 1L, true);
               break;
            case 27:
               var1 = ad.o.c(100000L);
               break;
            case 28:
               var1 = ad.o.c(80000L);
               break;
            case 29:
               var1 = ad.o.c(120000L);
               break;
            case 30:
               var1 = ad.a(606, 1L, true);
               break;
            case 31:
               var1 = ad.o.c(130000L);
               break;
            case 32:
               var1 = ad.a(118, 3, 1L, true);
               break;
            case 33:
               var1 = ad.o.c(150000L);
               break;
            case 34:
               var1 = ad.o.c(700000L);
               break;
            default:
               var1 = var2;
         }
      } else {
         var1 = var2;
         if (this.a == 1) {
            switch (this.b) {
               case 1:
                  var1 = ad.o.c(3000L);
                  break;
               case 2:
                  var1 = ad.o.c(5000L);
                  break;
               case 3:
                  var1 = ad.a(203, 3L, true);
                  break;
               case 4:
                  var1 = ad.o.c(5000L);
                  break;
               case 5:
                  var1 = ad.a(105, 1, 1L, true);
                  break;
               case 6:
                  var1 = ad.o.c(8000L);
                  break;
               case 7:
                  var1 = ad.o.c(7000L);
                  break;
               case 8:
                  var1 = ad.o.c(10000L);
                  break;
               case 9:
                  var1 = ad.o.c(15000L);
                  break;
               case 10:
                  var1 = ad.o.c(10000L);
                  break;
               case 11:
                  var1 = ad.a(303, 2, 1L, true);
                  break;
               case 12:
                  var1 = ad.a(207, 5L, true);
                  break;
               case 13:
                  var1 = ad.o.c(15000L);
                  break;
               case 14:
                  var1 = ad.a(502, 1L, true);
                  break;
               case 15:
                  var1 = ad.a(108, 2, 1L, true);
                  break;
               case 16:
                  var1 = ad.o.c(30000L);
                  break;
               case 17:
                  var1 = ad.a(211, 3L, true);
                  break;
               case 18:
                  var1 = ad.o.c(30000L);
                  break;
               case 19:
                  var1 = ad.o.c(50000L);
                  break;
               case 20:
                  var1 = ad.a(115, 3, 1L, true);
                  break;
               case 21:
                  var1 = ad.o.c(40000L);
                  break;
               case 22:
                  var1 = ad.o.c(65000L);
                  break;
               case 23:
                  var1 = ad.a(604, 1L, true);
                  break;
               case 24:
                  var1 = ad.a(215, 3L, true);
                  break;
               case 25:
                  var1 = ad.o.c(80000L);
                  break;
               case 26:
                  var1 = ad.a(306, 1, 1L, true);
                  break;
               case 27:
                  var1 = ad.a(505, 1L, true);
                  break;
               case 28:
                  var1 = ad.a(308, 3, 1L, true);
                  break;
               case 29:
                  var1 = ad.o.c(100000L);
                  break;
               case 30:
                  var1 = ad.a(117, 2, 1L, true);
                  break;
               case 31:
                  var1 = ad.a(706, 1L, true);
                  break;
               case 32:
                  var1 = ad.o.c(2000000L);
                  break;
               default:
                  var1 = var2;
            }
         }
      }

      if (var1) {
         this.c = 4;
      }

      return var1;
   }

   public final void e() {
      if (this.c != 4) {
         q.c(17);
         this.c = 4;
      }

   }
}

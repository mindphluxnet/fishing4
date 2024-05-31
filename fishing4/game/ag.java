package fishing4.game;

import java.math.BigDecimal;
import java.util.ArrayList;
import javax.microedition.khronos.opengles.GL10;

public final class ag {
   int a;
   public ArrayList b;
   int c;
   int d;
   int e;

   private ag(int var1) {
      this.a = var1;
      this.b = new ArrayList();
      this.c = 0;
      this.d = 0;
      this.e = 0;
   }

   public static final int a(int var0, int var1) {
      byte var3 = 1;
      int var2;
      if (var0 == 88) {
         if (var1 == 5) {
            var2 = -1;
         } else if (var1 == 4) {
            var2 = 1500;
         } else if (var1 == 3) {
            var2 = 750;
         } else if (var1 == 2) {
            var2 = 450;
         } else if (var1 == 1) {
            var2 = 150;
         } else {
            var2 = 100;
         }
      } else {
         var2 = var3;
         if (var1 >= 0) {
            var2 = var3;
            if (var1 <= 9) {
               BigDecimal var4 = BigDecimal.valueOf(0L);
               switch (var0) {
                  case 80:
                     var4 = var4.add(BigDecimal.valueOf(50L));
                     break;
                  case 81:
                     var4 = var4.add(BigDecimal.valueOf(100L));
                     break;
                  case 82:
                     var4 = var4.add(BigDecimal.valueOf(100L));
                     break;
                  case 83:
                     var4 = var4.add(BigDecimal.valueOf(300L));
                     break;
                  case 84:
                     var4 = var4.add(BigDecimal.valueOf(500L));
                     break;
                  case 85:
                     var4 = var4.add(BigDecimal.valueOf(1000L));
                     break;
                  case 86:
                     var4 = var4.add(BigDecimal.valueOf(1600L));
                     break;
                  case 87:
                     var2 = var4.add(BigDecimal.valueOf(-1L)).intValue();
                     return var2;
               }

               var2 = var4.multiply(BigDecimal.valueOf(1.0 + 0.1 * (double)var1)).setScale(0, 0).intValue();
            }
         }
      }

      return var2;
   }

   public static ag a(int var0) {
      return new ag(var0);
   }

   public static void a(GL10 var0, fishing4.a.w var1, float var2, float var3, int var4, fishing4.a.g var5, int var6) {
      if (var6 >= 0 && var6 <= 5) {
         switch (var6) {
            case 0:
               fishing4.a.m.a(var0, var1, var2, var3, 6.0F, 113.0F, 84.0F, 84.0F, var5);
               break;
            case 1:
               fishing4.a.m.a(var0, var1, var2, var3, 100.0F, 113.0F, 84.0F, 84.0F, var5);
               break;
            case 2:
               fishing4.a.m.a(var0, var1, var2, var3, 194.0F, 113.0F, 84.0F, 84.0F, var5);
               break;
            case 3:
               fishing4.a.m.a(var0, var1, var2, var3, 287.0F, 102.0F, 86.0F, 106.0F, var5);
               break;
            case 4:
               fishing4.a.m.a(var0, var1, var2, var3, 377.0F, 108.0F, 94.0F, 94.0F, var5);
               break;
            case 5:
               fishing4.a.m.a(var0, var1, var2, var3, 381.0F, 5.0F, 86.0F, 86.0F, var5);
         }

         fishing4.a.m.a(var0, var1, var2, var3, 0.0F, 0.0F, 52.0F, 52.0F, var5, '\u0001', fishing4.a.d.a((float)(var4 % 90 * 4)));
      }

   }

   public static int b() {
      int var0;
      if (ad.h != null && ad.h.size() > 0) {
         int var1 = 0;

         while(true) {
            if (var1 >= ad.h.size()) {
               var0 = -1;
               break;
            }

            var0 = var1;
            if (((ag)ad.h.get(var1)).a == 88) {
               break;
            }

            ++var1;
         }
      } else {
         var0 = -1;
      }

      return var0;
   }

   private static int b(int var0, int var1) {
      double var2 = 20.0;
      if (var0 == 88) {
         if (var1 == 5) {
            var0 = 30;
         } else if (var1 == 4) {
            var0 = 25;
         } else if (var1 == 3) {
            var0 = 20;
         } else if (var1 == 2) {
            var0 = 15;
         } else if (var1 == 1) {
            var0 = 10;
         } else {
            var0 = 5;
         }
      } else if (var1 >= 0 && var1 <= 5) {
         switch (var0) {
            case 80:
               var2 = 10.0;
               break;
            case 81:
               var2 = 15.0;
            case 82:
            case 83:
               break;
            case 84:
               var2 = 25.0;
               break;
            case 85:
               var2 = 30.0;
               break;
            case 86:
               var2 = 35.0;
               break;
            case 87:
               var2 = 40.0;
               break;
            default:
               var2 = 0.0;
         }

         var0 = (new BigDecimal(String.valueOf(var2 * (1.0 + 0.1 * (double)var1)))).setScale(0, 0).intValue();
      } else {
         var0 = 1;
      }

      return var0;
   }

   private static int c(int var0, int var1) {
      if (var0 == 88) {
         var0 = var1 * 100 + 150;
      } else {
         if (var0 == 80) {
            var0 = 30000;
         } else {
            var0 = h(var0);
         }

         var0 = var0 * var1 / 10;
      }

      return var0;
   }

   public static String e(int var0) {
      String var1;
      if (var0 < 5) {
         var1 = fishing4.a.y.a(2131165239);
      } else {
         var1 = fishing4.a.y.a(2131165240);
      }

      return var1;
   }

   public static String f(int var0) {
      return "Lv." + var0;
   }

   public static int g(int var0) {
      switch (var0) {
         case 0:
            var0 = 20000;
            break;
         case 1:
            var0 = 50000;
            break;
         case 2:
            var0 = 100000;
            break;
         case 3:
            var0 = 200000;
            break;
         default:
            var0 = 0;
      }

      return var0;
   }

   public static final int h(int var0) {
      byte var2 = 0;
      int var1 = var2;
      switch (var0) {
         case 80:
            break;
         case 81:
            var1 = 60000;
            break;
         case 82:
            var1 = 60000;
            break;
         case 83:
            var1 = 100000;
            break;
         case 84:
            var1 = 300000;
            break;
         case 85:
            var1 = 500000;
            break;
         case 86:
            var1 = 1000000;
            break;
         case 87:
            k.g();
            var1 = 2500000;
            break;
         case 88:
            var1 = 30000;
            break;
         default:
            var1 = var2;
      }

      return var1;
   }

   private fishing4.a.f v() {
      fishing4.a.f var1;
      switch (this.a) {
         case 80:
            var1 = fishing4.a.f.a(317.0F, 0.0F, 140.0F, 46.0F);
            break;
         case 81:
            var1 = fishing4.a.f.a(316.0F, 49.0F, 130.0F, 84.0F);
            break;
         case 82:
            var1 = fishing4.a.f.a(313.0F, 137.0F, 120.0F, 84.0F);
            break;
         case 83:
            var1 = fishing4.a.f.a(304.0F, 231.0F, 158.0F, 74.0F);
            break;
         case 84:
            var1 = fishing4.a.f.a(304.0F, 307.0F, 162.0F, 82.0F);
            break;
         case 85:
            var1 = fishing4.a.f.a(468.0F, 8.0F, 180.0F, 108.0F);
            break;
         case 86:
            var1 = fishing4.a.f.a(466.0F, 125.0F, 190.0F, 102.0F);
            break;
         case 87:
            var1 = fishing4.a.f.a(474.0F, 234.0F, 154.0F, 160.0F);
            break;
         case 88:
            var1 = fishing4.a.f.a(466.0F, 396.0F, 190.0F, 102.0F);
            break;
         default:
            var1 = fishing4.a.f.a();
      }

      return var1;
   }

   public final int a() {
      return this.a;
   }

   public final void a(GL10 var1, fishing4.a.w var2, float var3, float var4, int var5) {
      this.a(var1, var2, var3, var4, var5, fishing4.a.g.a(1.0F));
   }

   public final void a(GL10 var1, fishing4.a.w var2, float var3, float var4, int var5, fishing4.a.g var6) {
      a(var1, var2, var3, var4, var5, var6, this.e);
   }

   public final void a(GL10 var1, fishing4.a.w var2, fishing4.a.w var3, float var4, float var5) {
      float var7 = 0.0F;
      float var6 = 0.0F;
      switch (this.a) {
         case 80:
            var6 = 10.0F;
            break;
         case 81:
            var6 = 20.0F;
            break;
         case 82:
            var6 = 20.0F;
            break;
         case 83:
            var6 = 14.0F;
            break;
         case 84:
            var6 = 20.0F;
            break;
         case 85:
            var6 = 40.0F;
            break;
         case 86:
            var6 = 30.0F;
            break;
         case 87:
            var7 = 10.0F;
            var6 = 50.0F;
            break;
         case 88:
            var6 = 30.0F;
      }

      fishing4.a.m.a(var1, var2, var4 - var7, this.v().b.b / 2.0F + var5 - var6, this.v(), (int)255);
      if (this.a != 82 && this.a != 83 && this.a != 84 && this.a != 85 && this.a != 86) {
         if (this.a != 80 && this.a != 81) {
            if (this.a == 87) {
               if (p.a == 0) {
                  fishing4.a.m.a(var1, var3, var4 + 180.0F, var5 - 50.0F, 220.0F, 0.0F, 108.0F, 90.0F);
                  fishing4.a.m.a(var1, var3, var4 + 100.0F, var5 - 50.0F, 0.0F, 0.0F, 108.0F, 90.0F);
               } else {
                  fishing4.a.m.a(var1, var3, var4 + 180.0F, var5 - 50.0F, 328.0F, 0.0F, 108.0F, 90.0F);
                  fishing4.a.m.a(var1, var3, var4 + 100.0F, var5 - 50.0F, 108.0F, 0.0F, 108.0F, 90.0F);
               }
            } else if (this.a == 88) {
               if (p.a == 0) {
                  fishing4.a.m.a(var1, var3, var4 + 140.0F, var5 - 50.0F, 0.0F, 94.0F, 108.0F, 90.0F);
               } else {
                  fishing4.a.m.a(var1, var3, var4 + 140.0F, var5 - 50.0F, 110.0F, 94.0F, 108.0F, 90.0F);
               }
            }
         } else if (p.a == 0) {
            fishing4.a.m.a(var1, var3, var4 + 140.0F, var5 - 50.0F, 0.0F, 0.0F, 108.0F, 90.0F);
         } else {
            fishing4.a.m.a(var1, var3, var4 + 140.0F, var5 - 50.0F, 108.0F, 0.0F, 108.0F, 90.0F);
         }
      } else if (p.a == 0) {
         fishing4.a.m.a(var1, var3, var4 + 140.0F, var5 - 50.0F, 220.0F, 0.0F, 108.0F, 90.0F);
      } else {
         fishing4.a.m.a(var1, var3, var4 + 140.0F, var5 - 50.0F, 328.0F, 0.0F, 108.0F, 90.0F);
      }

   }

   public final void b(int var1) {
      int var2 = ((m)this.b.get(var1)).j();
      ad.o.c((long)var2);
      if (this.b != null && var1 >= 0 && var1 < this.j()) {
         this.b.remove(var1);
      }

   }

   public final int c() {
      int var3 = 0;

      int var1;
      int var2;
      for(var2 = 0; var3 < this.b.size(); var2 = var1) {
         var1 = var2;
         if (!((m)this.b.get(var3)).c) {
            var1 = var2 + 1;
         }

         ++var3;
      }

      return var2;
   }

   public final String c(int var1) {
      String var2;
      if (a(this.a, var1) < 0) {
         if (p.a == 0) {
            var2 = "무제한";
         } else {
            var2 = "Unlimited";
         }
      } else if (p.a == 0) {
         var2 = a(this.a, var1) + "cm";
      } else {
         var2 = ab.a.format((double)a(this.a, var1) / 2.54) + "in.";
      }

      return var2;
   }

   public final int d(int var1) {
      return b(this.a, var1);
   }

   public final String d() {
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var1 < this.b.size(); var2 = var3) {
         var3 = var2;
         if (!((m)this.b.get(var1)).c) {
            var3 = var2 + ((m)this.b.get(var1)).j();
         }

         ++var1;
      }

      return fishing4.a.y.d(var2);
   }

   public final void e() {
      byte var2 = 0;
      if (this.b.size() > 0) {
         int var1;
         for(var1 = 0; var1 < this.b.size(); ++var1) {
            if (!((m)this.b.get(var1)).c) {
               ad.o.c((long)((m)this.b.get(var1)).j());
            }
         }

         var1 = var2;

         while(var1 < this.b.size()) {
            if (!((m)this.b.get(var1)).c) {
               this.b.remove(var1);
            } else {
               ++var1;
            }
         }
      }

   }

   public final boolean f() {
      boolean var1;
      if (this.b.size() >= this.j()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final String g() {
      return this.b.size() + " / " + this.j();
   }

   public final String h() {
      String var1;
      if (a(this.a, this.d) < 0) {
         if (p.a == 0) {
            var1 = "무제한";
         } else {
            var1 = "Unlimited";
         }
      } else if (p.a == 0) {
         var1 = a(this.a, this.d) + "cm";
      } else {
         var1 = ab.a.format((double)a(this.a, this.d) / 2.54) + "in.";
      }

      return var1;
   }

   public final int i(int var1) {
      return c(this.a, var1);
   }

   public final void i() {
      ++this.d;
   }

   public final int j() {
      return b(this.a, this.c);
   }

   public final String j(int var1) {
      String var2;
      if (this.a == 88) {
         var2 = fishing4.a.y.c(c(this.a, var1));
      } else {
         var2 = fishing4.a.y.d(c(this.a, var1));
      }

      return var2;
   }

   public final void k() {
      ++this.c;
   }

   public final void l() {
      ++this.e;
   }

   public final void m() {
      this.e = 5;
   }

   public final String n() {
      return e(this.e);
   }

   public final String o() {
      return f(this.e);
   }

   public final int p() {
      return g(this.e);
   }

   public final String q() {
      return fishing4.a.y.d(g(this.e));
   }

   public final String r() {
      return fishing4.a.y.d(h(this.a));
   }

   public final int s() {
      return h(this.a) / 2;
   }

   public final String t() {
      String var1;
      if (this.a != 80 && this.a != 88) {
         var1 = fishing4.a.y.d(this.s());
      } else if (p.a == 0) {
         var1 = "|255000000|판매불가";
      } else {
         var1 = "|255000000|Untradable";
      }

      return var1;
   }

   public final String u() {
      return ab.c(this.a);
   }
}

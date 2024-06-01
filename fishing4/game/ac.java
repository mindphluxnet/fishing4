package fishing4.game;

import java.text.DecimalFormat;
import javax.microedition.khronos.opengles.GL10;

import fishing4.a.RGBColor;

public final class ac {
   private int a;
   private float b;
   private int c;
   private int d;

   private ac(int var1) {
      this.b(var1, m(var1), 0, 1);
   }

   private ac(int var1, int var2) {
      this.b(var1, m(var1), 0, var2);
   }

   private ac(int var1, int var2, int var3, int var4) {
      this.b(var1, var2, var3, var4);
   }

   public static ac a(int var0) {
      return new ac(var0);
   }

   public static ac a(int var0, int var1) {
      return new ac(var0, var1);
   }

   public static ac a(int var0, int var1, int var2, int var3) {
      return new ac(var0, var1, var2, var3);
   }

   public static String a(int var0, boolean var1, int var2) {
      DecimalFormat var3 = new DecimalFormat();
      var0 = d(var0) * var2;
      String var4;
      if (var0 <= 0 && var1) {
         if (globalConfig.languageId == 0) {
            var4 = "무료";
         } else {
            var4 = "Free";
         }
      } else {
         var4 = var3.format((long)var0) + "G";
      }

      return var4;
   }

   public static String a(ac var0) {
      DecimalFormat var2 = new DecimalFormat();
      int var1 = b(var0);
      String var3;
      if (var0.a != 120 && var0.a != 121 && var0.a != 122) {
         if (var1 <= 0) {
            if (globalConfig.languageId == 0) {
               var3 = "무료";
            } else {
               var3 = "Free";
            }
         } else {
            var3 = var2.format((long)var1) + "G";
         }
      } else {
         var3 = var2.format((long)var1) + "Coin";
      }

      return var3;
   }

   public static String a(ac var0, long var1) {
      return (new DecimalFormat()).format((long)(d(var0.a) / 2) * var1) + "G";
   }

   public static void a(GL10 var0, fishing4.a.w var1, float var2, float var3) {
      a(var0, var1, var2, var3, -1);
   }

   public static void a(GL10 var0, fishing4.a.w var1, float var2, float var3, int var4) {
      a(var0, var1, var2, var3, var4, RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F));
   }

   public static void a(GL10 var0, fishing4.a.w var1, float var2, float var3, int var4, int var5) {
      if (var5 < 20) {
         a(var0, var1, var2, var3, var4, RGBColor.getColor(1.0F, 0.5F, 0.5F, 1.0F));
      } else {
         var5 = (100 - var5) * 56 / 100;
         a(var0, var1, var2, var3, var4, RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F));
         fishing4.a.m.a(var0, var1, var2, var3 + 28.0F, (float)var5, RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F), fishing4.a.d.a(0.5F, 0.0F, 0.0F));
      }

   }

   private static void a(GL10 var0, fishing4.a.w var1, float var2, float var3, int var4, RGBColor var5) {
      fishing4.a.m.a(var0, var1, var2, var3, n(var4), var5);
   }

   public static void a(GL10 var0, fishing4.a.w var1, float var2, float var3, int var4, fishing4.a.g var5) {
      fishing4.a.f var6 = n(var4);
      fishing4.a.m.a(var0, var1, var2, var3, var6.a.a, var6.a.b, var6.b.a, var6.b.b, var5);
   }

   public static int b(ac var0) {
      int var3 = 0;
      if (var0.a != 120 && var0.a != 121 && var0.a != 122) {
         int var4 = d(var0.a);
         if (var4 > 0) {
            var3 = m(var0.a);
            float var1 = var0.b;
            float var2;
            if (ab.d(var0.a) != 0 && ab.d(var0.a) != 2) {
               var2 = (float)var3;
               var3 = (int)((float)var4 * (var2 - var1) / (float)var3 / 4.0F);
            } else {
               var2 = (float)var3;
               var3 = (int)((float)var4 * (var2 - var1) / (float)var3 / 2.0F);
            }
         }
      } else if ((int)var0.b != m(var0.a)) {
         var3 = var0.q() * (m(var0.a) - (int)var0.b) / m(var0.a);
         if (var3 <= 0) {
            var3 = 1;
         } else {
            var3 = var3 * 20 / 100;
         }
      }

      return var3;
   }

   public static ac b(int var0, int var1) {
      return new ac(var0, m(var0), var1, 1);
   }

   private void b(int var1, int var2, int var3, int var4) {
      this.a = var1;
      this.b = (float)var2;
      this.c = var3;
      this.d = var4;
   }

   public static final int c(int var0, int var1) {
      byte var2 = 0;
      byte var3;
      switch (var0) {
         case 200:
            var3 = var2;
            if (var1 == 1) {
               var3 = 100;
            }
            break;
         case 201:
            if (var1 == 1) {
               var3 = 90;
            } else {
               var3 = var2;
               if (var1 == 2) {
                  var3 = 10;
               }
            }
            break;
         case 202:
            if (var1 == 1) {
               var3 = 70;
            } else {
               var3 = var2;
               if (var1 == 2) {
                  var3 = 30;
               }
            }
            break;
         case 203:
            if (var1 == 1) {
               var3 = 70;
            } else if (var1 == 2) {
               var3 = 20;
            } else {
               var3 = var2;
               if (var1 == 3) {
                  var3 = 10;
               }
            }
            break;
         case 204:
            if (var1 == 1) {
               var3 = 50;
            } else if (var1 == 2) {
               var3 = 30;
            } else {
               var3 = var2;
               if (var1 == 3) {
                  var3 = 20;
               }
            }
            break;
         case 205:
            if (var1 == 1) {
               var3 = 40;
            } else if (var1 == 2) {
               var3 = 20;
            } else {
               var3 = var2;
               if (var1 == 3) {
                  var3 = 40;
               }
            }
            break;
         case 206:
            if (var1 == 1) {
               var3 = 50;
            } else if (var1 == 2) {
               var3 = 20;
            } else if (var1 == 3) {
               var3 = 20;
            } else {
               var3 = var2;
               if (var1 == 4) {
                  var3 = 10;
               }
            }
            break;
         case 207:
            if (var1 == 1) {
               var3 = 40;
            } else if (var1 == 2) {
               var3 = 20;
            } else if (var1 == 3) {
               var3 = 20;
            } else {
               var3 = var2;
               if (var1 == 4) {
                  var3 = 20;
               }
            }
            break;
         case 208:
            if (var1 == 1) {
               var3 = 20;
            } else if (var1 == 2) {
               var3 = 20;
            } else if (var1 == 3) {
               var3 = 30;
            } else {
               var3 = var2;
               if (var1 == 4) {
                  var3 = 30;
               }
            }
            break;
         case 209:
            if (var1 == 1) {
               var3 = 20;
            } else if (var1 == 2) {
               var3 = 20;
            } else if (var1 == 3) {
               var3 = 20;
            } else if (var1 == 4) {
               var3 = 30;
            } else {
               var3 = var2;
               if (var1 == 5) {
                  var3 = 10;
               }
            }
            break;
         case 210:
            if (var1 == 1) {
               var3 = 10;
            } else if (var1 == 2) {
               var3 = 10;
            } else if (var1 == 3) {
               var3 = 20;
            } else if (var1 == 4) {
               var3 = 30;
            } else {
               var3 = var2;
               if (var1 == 5) {
                  var3 = 30;
               }
            }
            break;
         case 211:
            if (var1 == 1) {
               var3 = 10;
            } else if (var1 == 2) {
               var3 = 10;
            } else if (var1 == 3) {
               var3 = 10;
            } else if (var1 == 4) {
               var3 = 20;
            } else {
               var3 = var2;
               if (var1 == 5) {
                  var3 = 50;
               }
            }
            break;
         case 212:
            if (var1 == 1) {
               var3 = 10;
            } else if (var1 == 2) {
               var3 = 10;
            } else if (var1 == 3) {
               var3 = 20;
            } else if (var1 == 4) {
               var3 = 20;
            } else if (var1 == 5) {
               var3 = 30;
            } else {
               var3 = var2;
               if (var1 == 6) {
                  var3 = 10;
               }
            }
            break;
         case 213:
            if (var1 == 1) {
               var3 = 10;
            } else if (var1 == 2) {
               var3 = 10;
            } else if (var1 == 3) {
               var3 = 10;
            } else if (var1 == 4) {
               var3 = 25;
            } else if (var1 == 5) {
               var3 = 30;
            } else {
               var3 = var2;
               if (var1 == 6) {
                  var3 = 15;
               }
            }
            break;
         case 214:
            if (var1 == 1) {
               var3 = 5;
            } else if (var1 == 2) {
               var3 = 5;
            } else if (var1 == 3) {
               var3 = 5;
            } else if (var1 == 4) {
               var3 = 15;
            } else if (var1 == 5) {
               var3 = 50;
            } else {
               var3 = var2;
               if (var1 == 6) {
                  var3 = 20;
               }
            }
            break;
         case 215:
            if (var1 == 1) {
               var3 = 5;
            } else if (var1 == 2) {
               var3 = 5;
            } else if (var1 == 3) {
               var3 = 10;
            } else if (var1 == 4) {
               var3 = 20;
            } else if (var1 == 5) {
               var3 = 35;
            } else if (var1 == 6) {
               var3 = 20;
            } else {
               var3 = var2;
               if (var1 == 7) {
                  var3 = 5;
               }
            }
            break;
         case 216:
            if (var1 == 1) {
               var3 = 5;
            } else if (var1 == 2) {
               var3 = 5;
            } else if (var1 == 3) {
               var3 = 5;
            } else if (var1 == 4) {
               var3 = 15;
            } else if (var1 == 5) {
               var3 = 35;
            } else if (var1 == 6) {
               var3 = 25;
            } else {
               var3 = var2;
               if (var1 == 7) {
                  var3 = 10;
               }
            }
            break;
         case 217:
            if (var1 == 1) {
               var3 = 5;
            } else if (var1 == 2) {
               var3 = 5;
            } else if (var1 == 3) {
               var3 = 5;
            } else if (var1 == 4) {
               var3 = 15;
            } else if (var1 == 5) {
               var3 = 35;
            } else if (var1 == 6) {
               var3 = 25;
            } else if (var1 == 7) {
               var3 = 9;
            } else {
               var3 = var2;
               if (var1 == 8) {
                  var3 = 1;
               }
            }
            break;
         case 218:
            if (var1 == 1) {
               var3 = 5;
            } else if (var1 == 2) {
               var3 = 5;
            } else if (var1 == 3) {
               var3 = 5;
            } else if (var1 == 4) {
               var3 = 5;
            } else if (var1 == 5) {
               var3 = 40;
            } else if (var1 == 6) {
               var3 = 30;
            } else if (var1 == 7) {
               var3 = 7;
            } else {
               var3 = var2;
               if (var1 == 8) {
                  var3 = 3;
               }
            }
            break;
         case 219:
            if (var1 == 1) {
               var3 = 5;
            } else if (var1 == 2) {
               var3 = 5;
            } else if (var1 == 3) {
               var3 = 5;
            } else if (var1 == 4) {
               var3 = 5;
            } else if (var1 == 5) {
               var3 = 40;
            } else if (var1 == 6) {
               var3 = 30;
            } else if (var1 == 7) {
               var3 = 5;
            } else {
               var3 = var2;
               if (var1 == 8) {
                  var3 = 5;
               }
            }
            break;
         default:
            var3 = var2;
      }

      return var3;
   }

   public static String c(int var0) {
      return a(var0, true, 1);
   }

   public static String c(ac var0) {
      DecimalFormat var2 = new DecimalFormat();
      int var1 = e(var0);
      String var3;
      if (var1 <= 0) {
         if (globalConfig.languageId == 0) {
            var3 = "무료";
         } else {
            var3 = "Free";
         }
      } else {
         var3 = var2.format((long)var1) + "G";
      }

      return var3;
   }

   public static int d(int var0) {
      byte var2 = 0;
      int var1 = var2;
      switch (var0) {
         case 100:
         case 200:
         case 300:
            break;
         case 101:
            var1 = 3000;
            break;
         case 102:
            var1 = 5000;
            break;
         case 103:
            var1 = 8000;
            break;
         case 104:
            var1 = 10000;
            break;
         case 105:
            var1 = 17000;
            break;
         case 106:
            var1 = 20000;
            break;
         case 107:
            var1 = 30000;
            break;
         case 108:
            var1 = 40000;
            break;
         case 109:
            var1 = 60000;
            break;
         case 110:
            var1 = 80000;
            break;
         case 111:
            var1 = 90000;
            break;
         case 112:
            var1 = 120000;
            break;
         case 113:
            var1 = 150000;
            break;
         case 114:
            var1 = 250000;
            break;
         case 115:
            var1 = 400000;
            break;
         case 116:
            var1 = 500000;
            break;
         case 117:
            var1 = 700000;
            break;
         case 118:
            var1 = 900000;
            break;
         case 119:
            var1 = 1200000;
            break;
         case 120:
            k.g();
            var1 = 40000;
            break;
         case 121:
            k.g();
            var1 = 80000;
            break;
         case 122:
            k.g();
            var1 = 200000;
            break;
         case 123:
            var1 = 10000;
            break;
         case 124:
            var1 = 20000;
            break;
         case 125:
            var1 = 30000;
            break;
         case 201:
            var1 = 750;
            break;
         case 202:
            var1 = 1050;
            break;
         case 203:
            var1 = 1200;
            break;
         case 204:
            var1 = 1500;
            break;
         case 205:
            var1 = 2000;
            break;
         case 206:
            var1 = 2300;
            break;
         case 207:
            var1 = 3000;
            break;
         case 208:
            var1 = 3800;
            break;
         case 209:
            var1 = 6000;
            break;
         case 210:
            var1 = 10500;
            break;
         case 211:
            var1 = 15000;
            break;
         case 212:
            var1 = 20000;
            break;
         case 213:
            var1 = 23000;
            break;
         case 214:
            var1 = 30000;
            break;
         case 215:
            var1 = 40000;
            break;
         case 216:
            var1 = 50000;
            break;
         case 217:
            var1 = 60000;
            break;
         case 218:
            var1 = 70000;
            break;
         case 219:
            var1 = 100000;
            break;
         case 301:
            var1 = 2000;
            break;
         case 302:
            var1 = 5000;
            break;
         case 303:
            var1 = 10000;
            break;
         case 304:
            var1 = 15000;
            break;
         case 305:
            var1 = 40000;
            break;
         case 306:
            var1 = 80000;
            break;
         case 307:
            var1 = 150000;
            break;
         case 308:
            var1 = 300000;
            break;
         case 309:
            var1 = 500000;
            break;
         case 310:
            k.g();
            var1 = 40000;
            break;
         case 500:
            var1 = 6400;
            break;
         case 501:
            var1 = 20000;
            break;
         case 502:
            var1 = 40000;
            break;
         case 503:
            var1 = 60000;
            break;
         case 504:
            var1 = 80000;
            break;
         case 505:
            var1 = 120000;
            break;
         case 506:
            var1 = 200000;
            break;
         case 507:
            k.g();
            var1 = 20000;
            break;
         case 508:
            k.g();
            var1 = 50000;
            break;
         case 600:
            var1 = 1600;
            break;
         case 601:
            var1 = 5600;
            break;
         case 602:
            var1 = 15000;
            break;
         case 603:
            var1 = 35000;
            break;
         case 604:
            var1 = 70000;
            break;
         case 605:
            var1 = 100000;
            break;
         case 606:
            var1 = 180000;
            break;
         case 607:
            k.g();
            var1 = 20000;
            break;
         case 608:
            k.g();
            var1 = 50000;
            break;
         case 700:
            var1 = 2400;
            break;
         case 701:
            var1 = 8000;
            break;
         case 702:
            var1 = 12000;
            break;
         case 703:
            var1 = 40000;
            break;
         case 704:
            var1 = 60000;
            break;
         case 705:
            var1 = 100000;
            break;
         case 706:
            var1 = 220000;
            break;
         case 707:
            k.g();
            var1 = 20000;
            break;
         case 708:
            k.g();
            var1 = 50000;
            break;
         default:
            var1 = var2;
      }

      return var1;
   }

   // $FF: synthetic method
   static int d(ac var0) {
      return var0.a;
   }

   public static int e(int var0) {
      return d(var0) / 2;
   }

   private static int e(ac var0) {
      int var1;
      if (var0.c >= 0 && var0.c <= 9) {
         switch (var0.a) {
            case 120:
               var1 = 90000 * (var0.c + 1) / 10 / 3;
               break;
            case 121:
               var1 = 450000 * (var0.c + 1) / 10 / 3;
               break;
            case 122:
               var1 = 1200000 * (var0.c + 2) / 10;
               break;
            default:
               var1 = d(var0.a) * (var0.c + 1) / 10;
         }
      } else {
         var1 = 999999999;
      }

      return var1;
   }

   public static final int g(int var0) {
      byte var2 = 0;
      byte var1 = var2;
      switch (var0) {
         case 100:
         case 120:
         case 121:
         case 122:
         case 200:
         case 300:
         case 310:
         case 507:
         case 508:
         case 600:
         case 607:
         case 608:
         case 700:
         case 707:
         case 708:
            break;
         case 101:
            var1 = 1;
            break;
         case 102:
            var1 = 2;
            break;
         case 103:
            var1 = 3;
            break;
         case 104:
            var1 = 4;
            break;
         case 105:
            var1 = 5;
            break;
         case 106:
            var1 = 6;
            break;
         case 107:
            var1 = 7;
            break;
         case 108:
            var1 = 8;
            break;
         case 109:
            var1 = 9;
            break;
         case 110:
            var1 = 10;
            break;
         case 111:
            var1 = 11;
            break;
         case 112:
            var1 = 12;
            break;
         case 113:
            var1 = 13;
            break;
         case 114:
            var1 = 14;
            break;
         case 115:
            var1 = 15;
            break;
         case 116:
            var1 = 16;
            break;
         case 117:
            var1 = 17;
            break;
         case 118:
            var1 = 18;
            break;
         case 119:
            var1 = 19;
            break;
         case 123:
            var1 = 4;
            break;
         case 124:
            var1 = 10;
            break;
         case 125:
            var1 = 17;
            break;
         case 201:
            var1 = 1;
            break;
         case 202:
            var1 = 2;
            break;
         case 203:
            var1 = 3;
            break;
         case 204:
            var1 = 4;
            break;
         case 205:
            var1 = 5;
            break;
         case 206:
            var1 = 6;
            break;
         case 207:
            var1 = 7;
            break;
         case 208:
            var1 = 8;
            break;
         case 209:
            var1 = 9;
            break;
         case 210:
            var1 = 10;
            break;
         case 211:
            var1 = 11;
            break;
         case 212:
            var1 = 12;
            break;
         case 213:
            var1 = 13;
            break;
         case 214:
            var1 = 14;
            break;
         case 215:
            var1 = 15;
            break;
         case 216:
            var1 = 16;
            break;
         case 217:
            var1 = 17;
            break;
         case 218:
            var1 = 18;
            break;
         case 219:
            var1 = 19;
            break;
         case 301:
            var1 = 2;
            break;
         case 302:
            var1 = 4;
            break;
         case 303:
            var1 = 6;
            break;
         case 304:
            var1 = 8;
            break;
         case 305:
            var1 = 10;
            break;
         case 306:
            var1 = 12;
            break;
         case 307:
            var1 = 14;
            break;
         case 308:
            var1 = 16;
            break;
         case 309:
            var1 = 18;
            break;
         case 500:
            var1 = 3;
            break;
         case 501:
            var1 = 5;
            break;
         case 502:
            var1 = 8;
            break;
         case 503:
            var1 = 11;
            break;
         case 504:
            var1 = 14;
            break;
         case 505:
            var1 = 17;
            break;
         case 506:
            var1 = 19;
            break;
         case 601:
            var1 = 1;
            break;
         case 602:
            var1 = 6;
            break;
         case 603:
            var1 = 9;
            break;
         case 604:
            var1 = 12;
            break;
         case 605:
            var1 = 15;
            break;
         case 606:
            var1 = 17;
            break;
         case 701:
            var1 = 2;
            break;
         case 702:
            var1 = 4;
            break;
         case 703:
            var1 = 7;
            break;
         case 704:
            var1 = 10;
            break;
         case 705:
            var1 = 13;
            break;
         case 706:
            var1 = 16;
            break;
         default:
            var1 = var2;
      }

      return var1;
   }

   public static final int i(int var0) {
      short var1;
      switch (var0) {
         case 300:
            var1 = 5000;
            break;
         case 301:
            var1 = 5500;
            break;
         case 302:
            var1 = 6000;
            break;
         case 303:
            var1 = 6500;
            break;
         case 304:
            var1 = 7000;
            break;
         case 305:
            var1 = 7500;
            break;
         case 306:
            var1 = 8000;
            break;
         case 307:
            var1 = 8500;
            break;
         case 308:
            var1 = 9000;
            break;
         case 309:
            var1 = 10000;
            break;
         case 310:
            var1 = -1;
            break;
         default:
            var1 = 0;
      }

      return var1;
   }

   public static final int j(int var0) {
      short var1 = 250;
      switch (var0) {
         case 300:
            var1 = 50;
            break;
         case 301:
            var1 = 70;
            break;
         case 302:
            var1 = 90;
            break;
         case 303:
            var1 = 110;
            break;
         case 304:
            var1 = 130;
            break;
         case 305:
            var1 = 150;
            break;
         case 306:
            var1 = 170;
            break;
         case 307:
            var1 = 190;
            break;
         case 308:
            var1 = 220;
         case 309:
         case 310:
            break;
         default:
            var1 = 0;
      }

      return var1;
   }

   public static final int k(int var0) {
      byte var1 = 25;
      switch (var0) {
         case 600:
            var1 = 10;
            break;
         case 601:
            var1 = 15;
            break;
         case 602:
            var1 = 20;
         case 603:
         case 607:
            break;
         case 604:
            var1 = 30;
            break;
         case 605:
            var1 = 40;
            break;
         case 606:
            var1 = 50;
            break;
         case 608:
            var1 = 45;
            break;
         default:
            var1 = 0;
      }

      return var1;
   }

   public static final int l(int var0) {
      short var1;
      switch (var0) {
         case 500:
            var1 = 10;
            break;
         case 501:
            var1 = 20;
            break;
         case 502:
            var1 = 40;
            break;
         case 503:
            var1 = 60;
            break;
         case 504:
            var1 = 80;
            break;
         case 505:
            var1 = 110;
            break;
         case 506:
            var1 = 140;
            break;
         case 507:
            var1 = 50;
            break;
         case 508:
            var1 = 125;
            break;
         default:
            var1 = 0;
      }

      return var1;
   }

   private static int m(int var0) {
      short var1 = 900;
      switch (var0) {
         case 100:
            var1 = -1;
            break;
         case 101:
            var1 = 450;
            break;
         case 102:
            var1 = 650;
         case 103:
         case 120:
         case 302:
         case 501:
         case 602:
         case 702:
            break;
         case 104:
            var1 = 1100;
            break;
         case 105:
            var1 = 1300;
            break;
         case 106:
            var1 = 1500;
            break;
         case 107:
            var1 = 1600;
            break;
         case 108:
            var1 = 1800;
            break;
         case 109:
            var1 = 2000;
            break;
         case 110:
            var1 = 2200;
            break;
         case 111:
            var1 = 2500;
            break;
         case 112:
            var1 = 2800;
            break;
         case 113:
            var1 = 3000;
            break;
         case 114:
            var1 = 3400;
            break;
         case 115:
            var1 = 3700;
            break;
         case 116:
            var1 = 4000;
            break;
         case 117:
            var1 = 4400;
            break;
         case 118:
            var1 = 4500;
            break;
         case 119:
            var1 = 4500;
            break;
         case 121:
            var1 = 1600;
            break;
         case 122:
            var1 = 3000;
            break;
         case 123:
            var1 = 600;
            break;
         case 124:
            var1 = 1300;
            break;
         case 125:
            var1 = 2200;
            break;
         case 200:
         case 201:
         case 202:
         case 203:
         case 204:
         case 205:
         case 206:
         case 207:
         case 208:
         case 209:
         case 210:
         case 211:
         case 212:
         case 213:
         case 214:
         case 215:
         case 216:
         case 217:
         case 218:
         case 219:
            var1 = 0;
            break;
         case 300:
            var1 = -1;
            break;
         case 301:
            var1 = 450;
            break;
         case 303:
            var1 = 1300;
            break;
         case 304:
            var1 = 1800;
            break;
         case 305:
            var1 = 2500;
            break;
         case 306:
            var1 = 3000;
            break;
         case 307:
            var1 = 3700;
            break;
         case 308:
            var1 = 4400;
            break;
         case 309:
            var1 = 4400;
            break;
         case 310:
            var1 = 6000;
            break;
         case 500:
            var1 = 600;
            break;
         case 502:
            var1 = 1500;
            break;
         case 503:
            var1 = 2200;
            break;
         case 504:
            var1 = 3000;
            break;
         case 505:
            var1 = 3600;
            break;
         case 506:
            var1 = 4000;
            break;
         case 507:
            var1 = 1500;
            break;
         case 508:
            var1 = 3600;
            break;
         case 600:
            var1 = 400;
            break;
         case 601:
            var1 = 600;
            break;
         case 603:
            var1 = 1500;
            break;
         case 604:
            var1 = 2200;
            break;
         case 605:
            var1 = 3000;
            break;
         case 606:
            var1 = 4000;
            break;
         case 607:
            var1 = 1500;
            break;
         case 608:
            var1 = 3000;
            break;
         case 700:
            var1 = 400;
            break;
         case 701:
            var1 = 600;
            break;
         case 703:
            var1 = 1500;
            break;
         case 704:
            var1 = 2200;
            break;
         case 705:
            var1 = 3000;
            break;
         case 706:
            var1 = 4000;
            break;
         case 707:
            var1 = 1500;
            break;
         case 708:
            var1 = 3000;
            break;
         default:
            var1 = 0;
      }

      return var1;
   }

   private static fishing4.a.f n(int var0) {
      fishing4.a.f var1;
      switch (var0) {
         case 50:
            var1 = fishing4.a.f.a(794.0F, 61.0F, 56.0F, 56.0F);
            break;
         case 51:
            var1 = fishing4.a.f.a(332.0F, 241.0F, 56.0F, 56.0F);
            break;
         case 52:
            var1 = fishing4.a.f.a(398.0F, 241.0F, 56.0F, 56.0F);
            break;
         case 53:
            var1 = fishing4.a.f.a(464.0F, 241.0F, 56.0F, 56.0F);
            break;
         case 54:
            var1 = fishing4.a.f.a(530.0F, 241.0F, 56.0F, 56.0F);
            break;
         case 55:
            var1 = fishing4.a.f.a(596.0F, 241.0F, 56.0F, 56.0F);
            break;
         case 56:
            var1 = fishing4.a.f.a(662.0F, 241.0F, 56.0F, 56.0F);
            break;
         case 60:
            var1 = fishing4.a.f.a(728.0F, 121.0F, 56.0F, 56.0F);
            break;
         case 61:
            var1 = fishing4.a.f.a(794.0F, 121.0F, 56.0F, 56.0F);
            break;
         case 62:
            var1 = fishing4.a.f.a(860.0F, 121.0F, 56.0F, 56.0F);
            break;
         case 63:
            var1 = fishing4.a.f.a(926.0F, 121.0F, 56.0F, 56.0F);
            break;
         case 100:
            var1 = fishing4.a.f.a(2.0F, 1.0F, 56.0F, 56.0F);
            break;
         case 101:
            var1 = fishing4.a.f.a(68.0F, 1.0F, 56.0F, 56.0F);
            break;
         case 102:
            var1 = fishing4.a.f.a(134.0F, 1.0F, 56.0F, 56.0F);
            break;
         case 103:
            var1 = fishing4.a.f.a(200.0F, 1.0F, 56.0F, 56.0F);
            break;
         case 104:
            var1 = fishing4.a.f.a(266.0F, 1.0F, 56.0F, 56.0F);
            break;
         case 105:
            var1 = fishing4.a.f.a(332.0F, 1.0F, 56.0F, 56.0F);
            break;
         case 106:
            var1 = fishing4.a.f.a(398.0F, 1.0F, 56.0F, 56.0F);
            break;
         case 107:
            var1 = fishing4.a.f.a(464.0F, 1.0F, 56.0F, 56.0F);
            break;
         case 108:
            var1 = fishing4.a.f.a(530.0F, 1.0F, 56.0F, 56.0F);
            break;
         case 109:
            var1 = fishing4.a.f.a(596.0F, 1.0F, 56.0F, 56.0F);
            break;
         case 110:
            var1 = fishing4.a.f.a(662.0F, 1.0F, 56.0F, 56.0F);
            break;
         case 111:
            var1 = fishing4.a.f.a(728.0F, 1.0F, 56.0F, 56.0F);
            break;
         case 112:
            var1 = fishing4.a.f.a(794.0F, 1.0F, 56.0F, 56.0F);
            break;
         case 113:
            var1 = fishing4.a.f.a(860.0F, 1.0F, 56.0F, 56.0F);
            break;
         case 114:
            var1 = fishing4.a.f.a(926.0F, 1.0F, 56.0F, 56.0F);
            break;
         case 115:
            var1 = fishing4.a.f.a(2.0F, 61.0F, 56.0F, 56.0F);
            break;
         case 116:
            var1 = fishing4.a.f.a(68.0F, 61.0F, 56.0F, 56.0F);
            break;
         case 117:
            var1 = fishing4.a.f.a(134.0F, 61.0F, 56.0F, 56.0F);
            break;
         case 118:
            var1 = fishing4.a.f.a(200.0F, 61.0F, 56.0F, 56.0F);
            break;
         case 119:
            var1 = fishing4.a.f.a(266.0F, 61.0F, 56.0F, 56.0F);
            break;
         case 120:
            var1 = fishing4.a.f.a(332.0F, 61.0F, 56.0F, 56.0F);
            break;
         case 121:
            var1 = fishing4.a.f.a(398.0F, 61.0F, 56.0F, 56.0F);
            break;
         case 122:
            var1 = fishing4.a.f.a(464.0F, 61.0F, 56.0F, 56.0F);
            break;
         case 123:
            var1 = fishing4.a.f.a(530.0F, 61.0F, 56.0F, 56.0F);
            break;
         case 124:
            var1 = fishing4.a.f.a(596.0F, 61.0F, 56.0F, 56.0F);
            break;
         case 125:
            var1 = fishing4.a.f.a(662.0F, 61.0F, 56.0F, 56.0F);
            break;
         case 200:
            var1 = fishing4.a.f.a(2.0F, 181.0F, 56.0F, 56.0F);
            break;
         case 201:
            var1 = fishing4.a.f.a(68.0F, 181.0F, 56.0F, 56.0F);
            break;
         case 202:
            var1 = fishing4.a.f.a(134.0F, 181.0F, 56.0F, 56.0F);
            break;
         case 203:
            var1 = fishing4.a.f.a(200.0F, 181.0F, 56.0F, 56.0F);
            break;
         case 204:
            var1 = fishing4.a.f.a(266.0F, 181.0F, 56.0F, 56.0F);
            break;
         case 205:
            var1 = fishing4.a.f.a(332.0F, 181.0F, 56.0F, 56.0F);
            break;
         case 206:
            var1 = fishing4.a.f.a(398.0F, 181.0F, 56.0F, 56.0F);
            break;
         case 207:
            var1 = fishing4.a.f.a(464.0F, 181.0F, 56.0F, 56.0F);
            break;
         case 208:
            var1 = fishing4.a.f.a(530.0F, 181.0F, 56.0F, 56.0F);
            break;
         case 209:
            var1 = fishing4.a.f.a(596.0F, 181.0F, 56.0F, 56.0F);
            break;
         case 210:
            var1 = fishing4.a.f.a(662.0F, 181.0F, 56.0F, 56.0F);
            break;
         case 211:
            var1 = fishing4.a.f.a(728.0F, 181.0F, 56.0F, 56.0F);
            break;
         case 212:
            var1 = fishing4.a.f.a(794.0F, 181.0F, 56.0F, 56.0F);
            break;
         case 213:
            var1 = fishing4.a.f.a(860.0F, 181.0F, 56.0F, 56.0F);
            break;
         case 214:
            var1 = fishing4.a.f.a(926.0F, 181.0F, 56.0F, 56.0F);
            break;
         case 215:
            var1 = fishing4.a.f.a(2.0F, 241.0F, 56.0F, 56.0F);
            break;
         case 216:
            var1 = fishing4.a.f.a(68.0F, 241.0F, 56.0F, 56.0F);
            break;
         case 217:
            var1 = fishing4.a.f.a(134.0F, 241.0F, 56.0F, 56.0F);
            break;
         case 218:
            var1 = fishing4.a.f.a(200.0F, 241.0F, 56.0F, 56.0F);
            break;
         case 219:
            var1 = fishing4.a.f.a(266.0F, 241.0F, 56.0F, 56.0F);
            break;
         case 300:
            var1 = fishing4.a.f.a(2.0F, 121.0F, 56.0F, 56.0F);
            break;
         case 301:
            var1 = fishing4.a.f.a(68.0F, 121.0F, 56.0F, 56.0F);
            break;
         case 302:
            var1 = fishing4.a.f.a(134.0F, 121.0F, 56.0F, 56.0F);
            break;
         case 303:
            var1 = fishing4.a.f.a(200.0F, 121.0F, 56.0F, 56.0F);
            break;
         case 304:
            var1 = fishing4.a.f.a(266.0F, 121.0F, 56.0F, 56.0F);
            break;
         case 305:
            var1 = fishing4.a.f.a(332.0F, 121.0F, 56.0F, 56.0F);
            break;
         case 306:
            var1 = fishing4.a.f.a(398.0F, 121.0F, 56.0F, 56.0F);
            break;
         case 307:
            var1 = fishing4.a.f.a(464.0F, 121.0F, 56.0F, 56.0F);
            break;
         case 308:
            var1 = fishing4.a.f.a(530.0F, 121.0F, 56.0F, 56.0F);
            break;
         case 309:
            var1 = fishing4.a.f.a(596.0F, 121.0F, 56.0F, 56.0F);
            break;
         case 310:
            var1 = fishing4.a.f.a(860.0F, 61.0F, 56.0F, 56.0F);
            break;
         case 500:
            var1 = fishing4.a.f.a(2.0F, 301.0F, 56.0F, 56.0F);
            break;
         case 501:
            var1 = fishing4.a.f.a(68.0F, 301.0F, 56.0F, 56.0F);
            break;
         case 502:
            var1 = fishing4.a.f.a(134.0F, 301.0F, 56.0F, 56.0F);
            break;
         case 503:
            var1 = fishing4.a.f.a(200.0F, 301.0F, 56.0F, 56.0F);
            break;
         case 504:
            var1 = fishing4.a.f.a(266.0F, 301.0F, 56.0F, 56.0F);
            break;
         case 505:
            var1 = fishing4.a.f.a(332.0F, 301.0F, 56.0F, 56.0F);
            break;
         case 506:
            var1 = fishing4.a.f.a(398.0F, 301.0F, 56.0F, 56.0F);
            break;
         case 507:
            var1 = fishing4.a.f.a(464.0F, 301.0F, 56.0F, 56.0F);
            break;
         case 508:
            var1 = fishing4.a.f.a(530.0F, 301.0F, 56.0F, 56.0F);
            break;
         case 600:
            var1 = fishing4.a.f.a(2.0F, 361.0F, 56.0F, 56.0F);
            break;
         case 601:
            var1 = fishing4.a.f.a(68.0F, 361.0F, 56.0F, 56.0F);
            break;
         case 602:
            var1 = fishing4.a.f.a(134.0F, 361.0F, 56.0F, 56.0F);
            break;
         case 603:
            var1 = fishing4.a.f.a(200.0F, 361.0F, 56.0F, 56.0F);
            break;
         case 604:
            var1 = fishing4.a.f.a(266.0F, 361.0F, 56.0F, 56.0F);
            break;
         case 605:
            var1 = fishing4.a.f.a(332.0F, 361.0F, 56.0F, 56.0F);
            break;
         case 606:
            var1 = fishing4.a.f.a(398.0F, 361.0F, 56.0F, 56.0F);
            break;
         case 607:
            var1 = fishing4.a.f.a(530.0F, 361.0F, 56.0F, 56.0F);
            break;
         case 608:
            var1 = fishing4.a.f.a(464.0F, 361.0F, 56.0F, 56.0F);
            break;
         case 700:
            var1 = fishing4.a.f.a(2.0F, 421.0F, 56.0F, 56.0F);
            break;
         case 701:
            var1 = fishing4.a.f.a(68.0F, 421.0F, 56.0F, 56.0F);
            break;
         case 702:
            var1 = fishing4.a.f.a(134.0F, 421.0F, 56.0F, 56.0F);
            break;
         case 703:
            var1 = fishing4.a.f.a(200.0F, 421.0F, 56.0F, 56.0F);
            break;
         case 704:
            var1 = fishing4.a.f.a(266.0F, 421.0F, 56.0F, 56.0F);
            break;
         case 705:
            var1 = fishing4.a.f.a(332.0F, 421.0F, 56.0F, 56.0F);
            break;
         case 706:
            var1 = fishing4.a.f.a(398.0F, 421.0F, 56.0F, 56.0F);
            break;
         case 707:
            var1 = fishing4.a.f.a(464.0F, 421.0F, 56.0F, 56.0F);
            break;
         case 708:
            var1 = fishing4.a.f.a(530.0F, 421.0F, 56.0F, 56.0F);
            break;
         default:
            var1 = fishing4.a.f.a(926.0F, 61.0F, 56.0F, 56.0F);
      }

      return var1;
   }

   public final void a(float var1) {
      if (this.a != 100 && this.a != 300) {
         this.b -= var1;
         if (this.b < 0.0F) {
            this.b = 0.0F;
         }
      }

   }

   protected final boolean a() {
      boolean var1;
      if (this.a != 100 && this.a != 300 && this.a != 310 && this.a != 607 && this.a != 608 && this.a != 507 && this.a != 508 && this.a != 707 && this.a != 708 && this.a != 123 && this.a != 124 && this.a != 125 && this.c < 9) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final boolean a(long var1) {
      boolean var3;
      if ((long)this.d + var1 <= 99L) {
         this.d = (int)((long)this.d + var1);
         var3 = true;
      } else {
         this.d = 99;
         var3 = false;
      }

      return var3;
   }

   protected final boolean b() {
      k.q();
      boolean var1;
      if (this.a != 100 && this.a != 300 && this.a != 310 && this.a != 607 && this.a != 608 && this.a != 507 && this.a != 508 && this.a != 707 && this.a != 708 && this.a != 123 && this.a != 124 && this.a != 125 && (int)this.b < m(this.a)) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final boolean b(int var1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean b(long var1) {
      boolean var3 = false;
      if ((long)this.d - var1 > 0L) {
         this.d = (int)((long)this.d - var1);
         var3 = true;
      } else {
         this.d = 0;
      }

      return var3;
   }

   public final int c() {
      return this.d;
   }

   public final int d() {
      return this.c;
   }

   public final void e() {
      if (this.a != 100 && this.a != 300) {
         this.b = 0.0F;
      }

   }

   public final int f() {
      return this.a;
   }

   public final int f(int var1) {
      byte var4 = 30;
      byte var3 = 0;
      int var2 = var3;
      if (var1 >= 0) {
         if (var1 > 9) {
            var2 = var3;
         } else {
            short var5 = var4;
            switch (this.a) {
               case 100:
               case 704:
                  break;
               case 101:
                  var5 = 40;
                  break;
               case 102:
                  var5 = 55;
                  break;
               case 103:
                  var5 = 70;
                  break;
               case 104:
                  var5 = 80;
                  break;
               case 105:
                  var5 = 90;
                  break;
               case 106:
                  var5 = 100;
                  break;
               case 107:
                  var5 = 115;
                  break;
               case 108:
                  var5 = 130;
                  break;
               case 109:
                  var5 = 150;
                  break;
               case 110:
                  var5 = 160;
                  break;
               case 111:
                  var5 = 170;
                  break;
               case 112:
                  var5 = 200;
                  break;
               case 113:
                  var5 = 220;
                  break;
               case 114:
                  var5 = 260;
                  break;
               case 115:
                  var5 = 300;
                  break;
               case 116:
                  var5 = 320;
                  break;
               case 117:
                  var5 = 350;
                  break;
               case 118:
                  var5 = 380;
                  break;
               case 119:
                  var5 = 420;
                  break;
               case 120:
                  var5 = 110;
                  break;
               case 121:
                  var5 = 210;
                  break;
               case 122:
                  var5 = 450;
                  break;
               case 123:
                  var5 = 137;
                  break;
               case 124:
                  var5 = 262;
                  break;
               case 125:
                  var5 = 562;
                  break;
               case 200:
               case 201:
               case 202:
               case 203:
               case 204:
               case 205:
               case 206:
               case 207:
               case 208:
               case 209:
               case 210:
               case 211:
               case 212:
               case 213:
               case 214:
               case 215:
               case 216:
               case 217:
               case 218:
               case 219:
                  var5 = 0;
                  break;
               case 300:
               case 301:
               case 302:
               case 303:
               case 304:
               case 305:
               case 306:
               case 307:
               case 308:
               case 309:
               case 310:
                  var5 = 0;
                  break;
               case 500:
               case 501:
               case 502:
               case 503:
               case 504:
               case 505:
               case 506:
               case 507:
               case 508:
                  var5 = 0;
                  break;
               case 600:
               case 601:
               case 602:
               case 603:
               case 604:
               case 605:
               case 606:
               case 607:
               case 608:
                  var5 = 0;
                  break;
               case 700:
                  var5 = 5;
                  break;
               case 701:
                  var5 = 10;
                  break;
               case 702:
                  var5 = 15;
                  break;
               case 703:
                  var5 = 20;
                  break;
               case 705:
                  var5 = 40;
                  break;
               case 706:
                  var5 = 60;
                  break;
               case 707:
                  var5 = 25;
                  break;
               case 708:
                  var5 = 50;
                  break;
               default:
                  var5 = 0;
            }

            var2 = var5 * (var1 * 5 + 100) / 100;
         }
      }

      return var2;
   }

   public final void g() {
      this.b = (float)m(this.a);
   }

   public final int h() {
      return (int)this.b;
   }

   public final int h(int var1) {
      byte var3 = 0;
      int var2 = var3;
      if (var1 >= 0) {
         if (var1 > 9) {
            var2 = var3;
         } else {
            var2 = var3;
            if (ab.d(this.a) == 2) {
               var2 = i(this.a) * (var1 * 5 + 100) / 100;
            }
         }
      }

      return var2;
   }

   public final String i() {
      String var2;
      if (m(this.a) == -1) {
         if (globalConfig.languageId == 0) {
            var2 = "무한";
         } else {
            var2 = "Unlimited";
         }
      } else {
         int var1 = (int)this.b * 100 / m(this.a);
         if (var1 > 0) {
            var2 = Integer.toString(var1) + "%";
         } else if ((int)this.b > 0) {
            var2 = "1%";
         } else {
            var2 = "0%";
         }
      }

      return var2;
   }

   public final int j() {
      return m(this.a);
   }

   public final int k() {
      return b(this);
   }

   public final int l() {
      return e(this);
   }

   public final int m() {
      k.g();
      byte var1;
      switch (this.c) {
         case 0:
         case 1:
            var1 = 100;
            break;
         case 2:
            var1 = 80;
            break;
         case 3:
            var1 = 65;
            break;
         case 4:
            var1 = 55;
            break;
         case 5:
            var1 = 45;
            break;
         case 6:
            var1 = 30;
            break;
         case 7:
            var1 = 20;
            break;
         case 8:
            var1 = 10;
            break;
         default:
            var1 = 0;
      }

      return var1;
   }

   public final void n() {
      if (this.c < 9) {
         ++this.c;
      }

   }

   public final void o() {
      k.g();
      if (this.c > 2) {
         if (this.c <= 4) {
            --this.c;
         } else if (this.c <= 6) {
            this.c -= 2;
         } else if (this.c <= 7) {
            this.c -= 3;
         } else {
            this.c -= 4;
         }

         if (this.c < 0) {
            this.c = 0;
         }
      }

   }

   public final int p() {
      return d(this.a);
   }

   public final int q() {
      return this.f(this.c);
   }

   public final int r() {
      return g(this.a);
   }

   public final int s() {
      return ab.d(this.a);
   }

   public final int t() {
      return this.h(this.c);
   }

   public final String u() {
      String var1;
      if (this.c > 0) {
         var1 = ab.c(this.a) + " +" + Integer.toString(this.c);
      } else {
         var1 = ab.c(this.a);
      }

      return var1;
   }
}

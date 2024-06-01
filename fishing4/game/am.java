package fishing4.game;

import android.util.Log;
import java.text.DecimalFormat;
import javax.microedition.khronos.opengles.GL10;

import fishing4.a.GLRootView;
import fishing4.a.RGBColor;

public final class am {
   public static int a;
   public static int b = -1;
   public static fishing4.a.ad c = fishing4.a.ad.a(2);
   public static fishing4.a.ad d = fishing4.a.ad.a(3);
   public static boolean e = false;
   public static boolean f = false;
   public static boolean g = false;
   public static long h;
   public static int i = -1;
   public static int j = -1;
   public static DecimalFormat k = new DecimalFormat("###0.0#");
   private static fishing4.a.g l = fishing4.a.g.a();
   private static float m;
   private static float n;
   private static final fishing4.a.f o = fishing4.a.f.a(758.0F, 666.0F, 20.0F, 20.0F);
   private static final fishing4.a.f p = fishing4.a.f.a(798.0F, 666.0F, 20.0F, 20.0F);
   private static final fishing4.a.f q = fishing4.a.f.a(758.0F, 710.0F, 20.0F, 20.0F);
   private static final fishing4.a.f r = fishing4.a.f.a(798.0F, 710.0F, 20.0F, 20.0F);
   private static final fishing4.a.f s = fishing4.a.f.a(758.0F, 686.0F, 20.0F, 24.0F);
   private static final fishing4.a.f t = fishing4.a.f.a(798.0F, 686.0F, 20.0F, 24.0F);
   private static final fishing4.a.f u = fishing4.a.f.a(778.0F, 666.0F, 20.0F, 20.0F);
   private static final fishing4.a.f v = fishing4.a.f.a(778.0F, 710.0F, 20.0F, 20.0F);
   private static final fishing4.a.f w = fishing4.a.f.a(778.0F, 686.0F, 20.0F, 24.0F);

   public static void a() {
      a = 0;
      b = -1;
   }

   public static void a(int var0) {
      j = b;
      b = var0;
      switch (var0) {
         case 40:
         case 54:
         case 62:
         case 64:
         case 110:
         case 111:
         case 112:
         case 113:
         case 114:
         case 120:
         case 121:
         case 122:
         case 123:
            a(0, fishing4.a.g.b(20.0F, 22.0F));
            break;
         case 51:
         case 55:
         case 60:
         case 90:
         case 91:
         case 99:
         case 150:
         case 160:
         case 161:
         case 180:
         case 185:
         case 186:
         case 187:
         case 188:
         case 189:
         case 190:
         case 213:
         case 215:
            b(1);
            break;
         case 52:
         case 81:
         case 211:
            a(0, fishing4.a.g.b(20.0F, 20.0F));
            break;
         case 70:
            a(1, fishing4.a.g.b(20.0F, 22.0F));
            break;
         case 100:
         case 101:
         case 102:
            b(0);
            break;
         case 103:
         case 104:
         case 105:
            h = System.currentTimeMillis();
            b(2);
            break;
         case 174:
            a(0, fishing4.a.g.b(18.0F, 18.0F));
         default:
            b(0);
            break;
         case 181:
            a(5, fishing4.a.g.b(18.0F, 20.0F));
            break;
         case 184:
         case 217:
            b(2);
            break;
         case 200:
            b(1);
      }

   }

   public static void a(int var0, fishing4.a.g var1) {
      a = var0;
      if (var0 == 0) {
         c.b(0);
      } else if (a != 1 && a != 4) {
         c.b(-1);
         d.b(-1);
      } else {
         c.b(2);
         d.b(3);
      }

      m = var1.a;
      n = var1.b;
      l.a(1.0F, 1.0F);
      f = true;
      if (i == -1) {
         fishing4.b.d.a().b(GLRootView.getAppContext(), 2131034138);
      } else {
         if (i == 2131034143) {
            fishing4.b.d.a().a(GLRootView.getAppContext(), i, -1);
         } else {
            fishing4.b.d.a().b(GLRootView.getAppContext(), i);
         }

         i = -1;
      }

   }

   public static void a(GL10 var0, float var1, int var2) {
      if (fishing4.a.m.width == 720) {
         fishing4.a.m.a(var0, az.u, fishing4.a.m.getHalfWidthPixels(), var1 + 150.0F + 93.0F - 60.0F, 0.0F, 860.0F, 380.0F, 120.0F);
         fishing4.a.m.a(var0, az.u, fishing4.a.m.getHalfWidthPixels(), 2.0F + var1 + 150.0F - 93.0F + 33.0F, 0.0F, (float)(var2 * 66), 380.0F, 66.0F);
         fishing4.a.m.a(var0, az.v, fishing4.a.m.getHalfWidthPixels(), var1 + 150.0F + 93.0F - 45.0F + 1.0F, 0.0F, (float)(var2 / 2 * 90), 380.0F, 88.0F, '\u0001');
      }

      if (fishing4.a.m.height == 1232) {
         fishing4.a.m.a(var0, az.u, fishing4.a.m.getHalfWidthPixels(), var1 + 150.0F + 93.0F - 60.0F, 0.0F, 860.0F, 380.0F, 120.0F);
         fishing4.a.m.a(var0, az.u, fishing4.a.m.getHalfWidthPixels(), var1 + 150.0F - 93.0F + 33.0F + 1.0F, 0.0F, (float)(var2 * 66), 380.0F, 65.0F);
         fishing4.a.m.a(var0, az.v, fishing4.a.m.getHalfWidthPixels(), var1 + 150.0F + 93.0F - 45.0F + 1.0F, 0.0F, (float)(var2 / 2 * 90), 380.0F, 88.0F, '\u0001');
      } else {
         fishing4.a.m.a(var0, az.u, fishing4.a.m.getHalfWidthPixels(), var1 + 150.0F + 93.0F - 60.0F, 0.0F, 860.0F, 380.0F, 120.0F);
         fishing4.a.m.a(var0, az.u, fishing4.a.m.getHalfWidthPixels(), var1 + 150.0F - 93.0F + 33.0F + 1.0F, 0.0F, (float)(var2 * 66), 380.0F, 66.0F);
         fishing4.a.m.a(var0, az.v, fishing4.a.m.getHalfWidthPixels(), var1 + 150.0F + 93.0F - 45.0F + 1.0F, 0.0F, (float)(var2 / 2 * 90), 380.0F, 88.0F, '\u0001');
      }

   }

   public static void displayMessageBox(GL10 glContext, int var1) {
      int var3 = 0;
      if (!e() && b != -1) {
         if (b >= 0 && b < 24) {
            if (fishing4.game.q.b[b]) {
               if (globalConfig.languageId == 0) {
                  a(glContext, fishing4.a.y.a(2131165966 + b) + "\n\n\n" + fishing4.a.y.a(2131165990 + b) + "\n\n(완료)", fishing4.a.m.e(), az.s, az.t);
               } else {
                  a(glContext, fishing4.a.y.a(2131165966 + b) + "\n\n\n" + fishing4.a.y.a(2131165990 + b) + "\n\n(Complete)", fishing4.a.m.e(), az.s, az.t);
               }

               if (d()) {
                  if (az.D == null) {
                     az.D = fishing4.a.w.a(glContext, "img/archive/archive.png");
                  } else {
                     fishing4.a.m.a(glContext, az.D, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() + 150.0F, fishing4.a.f.a((float)(b % 6 * 64), (float)(b / 6 * 66), 56.0F, 56.0F));
                  }

                  fishing4.a.m.a(glContext, az.t, fishing4.a.m.getHalfWidthPixels() - 130.0F, fishing4.a.m.getHalfHeightPixels() - 160.0F, 585.0F, 250.0F, 56.0F, 56.0F);
               }
            } else if (globalConfig.languageId == 0) {
               a(glContext, fishing4.a.y.a(2131165966 + b) + "\n\n\n" + fishing4.a.y.a(2131165990 + b) + "\n\n(도전중)", fishing4.a.m.e(), az.s, az.t);
            } else {
               a(glContext, fishing4.a.y.a(2131165966 + b) + "\n\n\n" + fishing4.a.y.a(2131165990 + b) + "\n\n(In progress)", fishing4.a.m.e(), az.s, az.t);
            }
         } else if (b == 100) {
            a(glContext, fishing4.a.y.a(2131165308), fishing4.a.m.e(), az.s, az.t);
         } else if (b == 101) {
            a(glContext, fishing4.a.y.a(2131165309), fishing4.a.m.e(), az.s, az.t);
         } else if (b == 102) {
            a(glContext, fishing4.a.y.a(2131165310), fishing4.a.m.e(), az.s, az.t);
         } else if (b == 103) {
            a(glContext, fishing4.a.y.a(2131165311), fishing4.a.m.e(), az.s, az.t);
            if (d() && System.currentTimeMillis() - h > 500L) {
               ad.f = av.f;
               if (z.b() == 4) {
                  av.c(glContext);
               }

               if (ad.f == -1) {
                  a(101);
               } else {
                  i = 2131034119;
                  a(100);
               }
            }
         } else if (b == 104) {
            a(glContext, fishing4.a.y.a(2131165311), fishing4.a.m.e(), az.s, az.t);
            if (d() && System.currentTimeMillis() - h > 500L) {
               ad.e = av.g;
               if (z.b() == 4) {
                  av.b(glContext);
               }

               if (ad.e == -1) {
                  a(101);
               } else {
                  i = 2131034119;
                  a(100);
               }
            }
         } else if (b == 105) {
            a(glContext, fishing4.a.y.a(2131165311), fishing4.a.m.e(), az.s, az.t);
            if (d() && System.currentTimeMillis() - h > 500L) {
               ad.d = av.h;
               if (z.b() == 4) {
                  av.d(glContext);
               }

               if (ad.d == -1) {
                  a(101);
               } else {
                  i = 2131034119;
                  a(100);
               }
            }
         } else {
            String var7;
            String var8;
            String var9;
            if (b == 110) {
               var7 = fishing4.game.w.a((Integer)fishing4.game.w.c.get(az.k));
               var8 = fishing4.game.w.b((Integer)fishing4.game.w.c.get(az.k));
               var9 = fishing4.game.w.c((Integer)fishing4.game.w.c.get(az.k));
               if (globalConfig.languageId == 0) {
                  a(glContext, fishing4.game.w.c.get(az.k) + ". " + var7 + "\n\n" + var8 + "\n\n[보상]\n" + var9 + "\n\n현재 진행중인 퀘스트입니다.", fishing4.a.m.e(), az.s, az.t);
               } else {
                  a(glContext, fishing4.game.w.c.get(az.k) + ". " + var7 + "\n\n" + var8 + "\n\n[Reward]\n" + var9 + "\n\nthis quest is already in progress.", fishing4.a.m.e(), az.s, az.t);
               }
            } else if (b == 111) {
               var1 = az.k - fishing4.game.w.c.size();
               var7 = fishing4.game.w.a((Integer)fishing4.game.w.d.get(var1));
               var9 = fishing4.game.w.b((Integer)fishing4.game.w.d.get(var1));
               var8 = fishing4.game.w.c((Integer)fishing4.game.w.d.get(var1));
               if (globalConfig.languageId == 0) {
                  a(glContext, fishing4.game.w.d.get(var1) + ". " + var7 + "\n\n" + var9 + "\n\n[보상]\n" + var8 + "\n\n현재 진행중인 퀘스트입니다.", fishing4.a.m.e(), az.s, az.t);
               } else {
                  a(glContext, fishing4.game.w.d.get(var1) + ". " + var7 + "\n\n" + var9 + "\n\n[Reward]\n" + var8 + "\n\nthis quest is already in progress.", fishing4.a.m.e(), az.s, az.t);
               }
            } else if (b == 112) {
               var9 = fishing4.game.v.a((Integer)fishing4.game.v.c.get(az.k));
               var7 = fishing4.game.v.b((Integer)fishing4.game.v.c.get(az.k));
               var8 = fishing4.game.v.c((Integer)fishing4.game.v.c.get(az.k));
               if (globalConfig.languageId == 0) {
                  a(glContext, fishing4.game.v.c.get(az.k) + ". " + var9 + "\n\n" + var7 + "\n\n[보상]\n" + var8 + "\n\n현재 진행중인 퀘스트입니다.", fishing4.a.m.e(), az.s, az.t);
               } else {
                  a(glContext, fishing4.game.v.c.get(az.k) + ". " + var9 + "\n\n" + var7 + "\n\n[Reward]\n" + var8 + "\n\nthis quest is already in progress.", fishing4.a.m.e(), az.s, az.t);
               }
            } else if (b == 113) {
               var1 = az.k - fishing4.game.v.c.size();
               var8 = fishing4.game.v.a((Integer)fishing4.game.v.d.get(var1));
               var9 = fishing4.game.v.b((Integer)fishing4.game.v.d.get(var1));
               var7 = fishing4.game.v.c((Integer)fishing4.game.v.d.get(var1));
               if (globalConfig.languageId == 0) {
                  a(glContext, fishing4.game.v.d.get(var1) + ". " + var8 + "\n\n" + var9 + "\n\n[보상]\n" + var7 + "\n\n현재 진행중인 퀘스트입니다.", fishing4.a.m.e(), az.s, az.t);
               } else {
                  a(glContext, fishing4.game.v.d.get(var1) + ". " + var8 + "\n\n" + var9 + "\n\n[Reward]\n" + var7 + "\n\nthis quest is already in progress.", fishing4.a.m.e(), az.s, az.t);
               }
            } else if (b == 114) {
               if (fishing4.game.r.e() == 0) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, fishing4.game.r.b() + "\n\n가장 긴 " + fishing4.a.y.a(2131165434 + fishing4.game.r.c) + " 잡기\n(출몰지 : " + fishing4.game.m.i(fishing4.game.r.c).split("\n")[0] + ")\n\n현재 1위 : " + fishing4.game.m.a(fishing4.game.r.c(), fishing4.game.r.c) + "cm\n내 점수 : " + fishing4.game.m.a(fishing4.game.r.d, fishing4.game.r.c) + "cm\n\n남은 기간 : " + fishing4.game.r.b + "일\n상금 : " + fishing4.a.y.d(fishing4.game.r.a(0, az.k)), fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, fishing4.game.r.b() + "\n\nCatch the Longest \n" + fishing4.a.y.a(2131165434 + fishing4.game.r.c) + "\n(Habitat : " + fishing4.game.m.i(fishing4.game.r.c).split("\n")[0] + ")\n\nCurrent best scorer : " + k.format((double)fishing4.game.m.a(fishing4.game.r.c(), fishing4.game.r.c) / 2.54) + "in.\nMy score : " + k.format((double)fishing4.game.m.a(fishing4.game.r.d, fishing4.game.r.c) / 2.54) + "in.\n\nDays left : " + fishing4.game.r.b + "\nReward : " + fishing4.a.y.d(fishing4.game.r.a(0, az.k)), fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (globalConfig.languageId == 0) {
                  a(glContext, fishing4.game.r.b() + "\n\n" + fishing4.game.r.d() + fishing4.a.y.a(2131165434 + fishing4.game.r.c) + " 많이 잡기\n(출몰지 : " + fishing4.game.m.i(fishing4.game.r.c).split("\n")[0] + ")\n\n현재 1위 : " + (int)fishing4.game.r.c() + "마리\n내 점수 : " + (int)fishing4.game.r.d + "마리\n\n남은 기간 : " + fishing4.game.r.b + "일\n상금 : " + fishing4.a.y.d(fishing4.game.r.a(1, az.k)), fishing4.a.m.e(), az.s, az.t);
               } else {
                  a(glContext, fishing4.game.r.b() + "\n\n" + fishing4.game.r.d() + fishing4.a.y.a(2131165434 + fishing4.game.r.c) + " Catch most\n(Habitat : " + fishing4.game.m.i(fishing4.game.r.c).split("\n")[0] + ")\n\nCurrent best scorer : " + (int)fishing4.game.r.c() + "Quantity\nMy score : " + (int)fishing4.game.r.d + "Quantity\n\nDays left : " + fishing4.game.r.b + "\nReward : " + fishing4.a.y.d(fishing4.game.r.a(1, az.k)), fishing4.a.m.e(), az.s, az.t);
               }
            } else if (b == 120) {
               fishing4.a.w.a(glContext, fishing4.game.m.f);
               fishing4.game.m.f = null;
               a(121);
            } else if (b == 121) {
               a(glContext, az.p, fishing4.game.s.a[az.p], var1);
            } else if (b == 122) {
               fishing4.a.w.a(glContext, fishing4.game.m.f);
               fishing4.game.m.f = null;
               a(123);
            } else if (b == 123) {
               a(glContext, az.p, fishing4.game.s.b[az.p], var1);
            } else if (b == 150) {
               a(glContext, fishing4.a.y.a(2131165312), fishing4.a.m.e(), az.s, az.t);
            } else if (b == 40) {
               if (((ag)ad.h.get(az.k)).b.size() <= 0) {
                  a(glContext, fishing4.a.y.a(2131165313), fishing4.a.m.e(), az.s, az.t);
               } else {
                  var3 = ((m)((ag)ad.h.get(az.k)).b.get(az.p)).a;
                  float var2 = ((m)((ag)ad.h.get(az.k)).b.get(az.p)).b;
                  boolean var5 = ((m)((ag)ad.h.get(az.k)).b.get(az.p)).d;
                  boolean var6 = ((m)((ag)ad.h.get(az.k)).b.get(az.p)).e;
                  int var4 = az.p;
                  a(glContext, var3, var2, var5, var6, var1, true, true, true, ((ag)ad.h.get(az.k)).b.size());
               }
            } else if (b == 99) {
               a(glContext, fishing4.a.y.a(2131165315), fishing4.a.m.e(), az.s, az.t);
            } else if (b == 90) {
               a(glContext, fishing4.a.y.a(2131165316), fishing4.a.m.e(), az.s, az.t);
            } else if (b == 91) {
               a(glContext, fishing4.a.y.a(2131165317), fishing4.a.m.e(), az.s, az.t);
            } else if (b == 45) {
               a(glContext, fishing4.a.y.a(2131165319), fishing4.a.m.e(), az.s, az.t);
            } else if (b == 51) {
               a(glContext, fishing4.a.y.a(2131165320), fishing4.a.m.e(), az.s, az.t);
            } else if (b == 52) {
               if (fishing4.a.r.E == 0) {
                  a(glContext, fishing4.a.r.D[0], fishing4.a.m.e(), az.s, az.t);
               } else {
                  var7 = fishing4.a.r.D[0];
                  var3 = fishing4.a.r.ae;
                  a(glContext, var1, var7);
               }
            } else if (b == 53) {
               a(glContext, fishing4.a.y.a(2131165323), fishing4.a.m.e(), az.s, az.t);
            } else if (b != 54) {
               if (b == 55) {
                  a(glContext, fishing4.a.y.a(2131165321), fishing4.a.m.e(), az.s, az.t);
               } else if (b == 60) {
                  a(glContext, fishing4.a.y.a(2131165322), fishing4.a.m.e(), az.s, az.t);
               } else if (b == 61) {
                  fishing4.a.w.a(glContext, fishing4.game.m.f);
                  fishing4.game.m.f = null;
                  a(62);
               } else if (b == 62) {
                  a(glContext, fishing4.a.r.Z[az.p], fishing4.game.m.a(fishing4.a.r.Z[az.p], fishing4.a.r.ac[az.p]), var1);
               } else if (b == 63) {
                  fishing4.a.w.a(glContext, fishing4.game.m.f);
                  fishing4.game.m.f = null;
                  a(64);
               } else if (b == 64) {
                  a(glContext, fishing4.a.r.Z[az.p], fishing4.game.m.a(fishing4.a.r.Z[az.p], fishing4.a.r.ac[az.p]), var1);
               } else if (b == 70) {
                  a(glContext, aq.c[az.k]);
               } else if (b == 71) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "인벤토리에 공간이 부족합니다. 공간을 확보해 주세요.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "Not enough inventory space.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 72) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "구입하였습니다.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "Purchased.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 73) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "구입을 실패하였습니다.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "Purchase failed.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 74) {
                  a(glContext, "LGT임직원은 사용이 불가합니다.", fishing4.a.m.e(), az.s, az.t);
               } else if (b == 75) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "더 이상 구매할 수 없습니다.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "You cannot purchase any more.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 76) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "고객님은 월한도 초과로 인해 더 이상 구매하실 수 없습니다. 다음달에 다시 이용해 주세요.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "You have reached monthly spend limit. Try again next month.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 77) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "고객님은 일한도 초과로 인해 더 이상 구매하실 수 없습니다. 다음날에 다시 이용해 주세요.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "You have reached daily spend limit. Try again next day.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 78) {
                  a(glContext, "청소년요금제 혹은 선불한도로 인해 구매하실 수 없습니다.", fishing4.a.m.e(), az.s, az.t);
               } else if (b == 80) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "레이더를 장착할 배를 선택해 주세요.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "Select the ship you want to attach the radar to.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 81) {
                  if (az.A == null) {
                     az.A = fishing4.a.w.a(glContext, "img/town/ship.png");
                  }

                  if (az.B == null) {
                     az.B = fishing4.a.w.a(glContext, "img/town/radar.png");
                  }

                  if (az.E == null) {
                     az.E = fishing4.a.w.a(glContext, "img/town/choice_icon.png");
                  }

                  a(glContext, az.s, az.t, az.A, az.B, az.E, (ag)ad.h.get(az.p), var1, true);
               } else if (b == 82) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "이미 해당 레이더가 장착되어 있습니다.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "This ship alreadt has the selected radar.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 160) {
                  a(glContext, fishing4.a.y.a(2131165281), fishing4.a.m.e(), az.s, az.t);
               } else if (b == 161) {
                  a(glContext, fishing4.a.y.a(2131165272), fishing4.a.m.e(), az.s, az.t);
               } else if (b == 162) {
                  a(glContext, fishing4.a.y.a(2131165302), fishing4.a.m.e(), az.s, az.t);
               } else if (b == 163) {
                  a(glContext, fishing4.a.y.a(2131165303), fishing4.a.m.e(), az.s, az.t);
               } else if (b == 170) {
                  fishing4.a.m.a(glContext, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), (float)fishing4.a.m.getWidthPixels(), (float)fishing4.a.m.getHeightPixels(), RGBColor.getColor(0.0F, 0.0F, 0.0F, 0.75F));
                  fishing4.a.m.a(glContext, bb.g, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels());
               } else if (b == 171) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "전송을 실패하였습니다.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "Transfer failed.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 172) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "이미 전송하였습니다.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "You already made this transfer.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 173) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "코인이 부족합니다.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "Not enough Coins.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 174) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "|255000000|<죄송합니다>\n\n에딧프로그램 사용 로그가 발견되었습니다!\n|255255000|타 사용자의 피해를 막기 위해, 네트워크가 차단됩니다.\n문의사항은 아래의 메일로 보내주십시오.\nhelp@pnjmobile.co.kr", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "|255000000|<Sorry!>\n\nIllegal editing program detected!\n|255255000|Network connection will be blocked for safety.\nContact PNJ Support for more info.\nhelp@pnjmobile.co.kr", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 175) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "해당 기능은 게임을 업데이트를 하셔야 이용하실 수 있습니다.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "This feature is only available on the latest version. ", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 96) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "Like 버튼 클릭 보상\n\n|255255000|" + fishing4.a.y.d(10000), fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "Like' reward\n\n|255255000|" + fishing4.a.y.d(10000), fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 92) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "이미 Like하셨습니다. 게임을 시작하시면 보상을 받으실 수 있습니다.\n(튜토리얼 상태이면 튜토리얼이 끝난 후 보상이 지급됩니다)", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "You already 'Liked' this app. You'll receeive the reward when you run the game.\n(If you're playing Tutorial, you'll receive the reward after it.)", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 93) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "이미 Like하셨습니다.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "You already 'Liked' this app.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 94) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "게임을 시작하시면 보상을 받으실 수 있습니다.\n(튜토리얼 상태이면 튜토리얼이 끝난 후 보상이 지급됩니다)", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "You'll receeive the reward when you run the game.\n(If you're playing Tutorial, you'll receive the reward after it.)", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 95) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "Like에 의한 보상을 이미 받으셨습니다.\n감사합니다.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "You already got 'Like' reward.\nThank you.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 180) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "코인이 부족합니다. 충전하시겠습니까?", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "Not enough Coins. Do you want to buy more?", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 181) {
                  fishing4.a.w var10 = az.s;
                  fishing4.a.w var11 = az.t;
                  a(glContext, var10);
               } else if (b == 182) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "코인 충전을 완료하였습니다.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "Coin purchased.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 183) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "코인 충전을 실패하였습니다.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "Coin purchase failed.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 184) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "전송중입니다..", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "Transferring…", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 185) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "200 Coin 충전합니다.\n\n" + fishing4.a.y.b(2000) + "입니다.\n결제하시겠습니까?", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "200 Purchasing Coins.\n\n", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 186) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "515 Coin 충전합니다.\n\n" + fishing4.a.y.b(5000) + "입니다.\n결제하시겠습니까?", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "515 Purchasing Coins.\n\n", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 187) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "840 Coin 충전합니다.\n\n" + fishing4.a.y.b(8000) + "입니다.\n결제하시겠습니까?", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "840 Purchasing Coins.\n\n ", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 188) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "1400 Coin 충전합니다.\n\n" + fishing4.a.y.b(13000) + "입니다.\n결제하시겠습니까?", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "1400 Purchasing Coins.\n\n ", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 189) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "3300 Coin 충전합니다.\n\n" + fishing4.a.y.b(30000) + "입니다.\n결제하시겠습니까?", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "3300 Purchasing Coins.\n\n ", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 190) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "6000 Coin 충전합니다.\n\n" + fishing4.a.y.b(50000) + "입니다.\n결제하시겠습니까?", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "6000 Purchasing Coins.\n\n ", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 200) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "정식판 전환(광고 제거) 상품을 구입하시겠습니까? " + ab.b(2000), fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "Do you want to buy Premium Version with no ads? " + ab.b(2000), fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 201) {
                  a(glContext, "정식판으로 전환되었습니다.", fishing4.a.m.e(), az.s, az.t);
               } else if (b == 202) {
                  a(glContext, "정식판 전환을 실패하였습니다.", fishing4.a.m.e(), az.s, az.t);
               } else if (b == 203) {
                  a(glContext, "정식판으로 전환되었습니다.", fishing4.a.m.e(), az.s, az.t);
               } else if (b == 204) {
                  a(glContext, "LGT임직원폰은 사용이 불가합니다.", fishing4.a.m.e(), az.s, az.t);
               } else if (b == 205) {
                  a(glContext, "청소년 요금제 사용자입니다", fishing4.a.m.e(), az.s, az.t);
               } else if (b == 46) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "네트워크 사용이 원활하지 않습니다. 고객센터로 문의주시기 바랍니다.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "Your network connection is unstable. Please contact support center.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 210) {
                  a(glContext, "더 큰 물고기!\n새로운 보상!\n\n새로운 낚시터에 도전해 보세요!!\n\n|255000000|※대물 낚시터는 더 큰 코인 물고기와 고성능의 아이템을 낚을 수 있습니다.", fishing4.a.m.e(), az.s, az.t);
               } else if (b == 211) {
                  if (az.A == null) {
                     az.A = fishing4.a.w.a(glContext, "img/town/ship.png");
                  }

                  if (az.B == null) {
                     az.B = fishing4.a.w.a(glContext, "img/town/radar.png");
                  }

                  if (az.E == null) {
                     az.E = fishing4.a.w.a(glContext, "img/town/choice_icon.png");
                  }

                  a(glContext, az.s, az.t, az.A, az.B, az.E, (ag)ad.h.get(az.p), var1, false);
               } else if (b == 212) {
                  a(glContext, "대물 낚시터에 입장하기 위해서는 전용 선박이 필요합니다.\n\n|255000000|아마추어 명성이 되면 조선소에서 구입할 수 있습니다.", fishing4.a.m.e(), az.s, az.t);
               } else if (b == 213) {
                  a(glContext, "대물낚시터는 기존 낚시터보다 큰 물고기, 유료 코스튬 그리고 대물낚시터만의 특별한 낚싯대와 더 많은 코인을 얻을 수 있습니다.\n\n입장하시겠습니까?", fishing4.a.m.e(), az.s, az.t);
               } else if (b == 214) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "만선이라 출항할 수 없습니다. 선적정보를 확인해주세요.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "Your ship is full! Check your ship before departure!", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 215) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "출항하면 대회일이 1일 소요됩니다. 그래도 출항 하시겠습니까? 출항하면 " + (fishing4.game.r.b - 1) + "일이 남습니다.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "1 competition day will be spent for 1 departure. Do you want to proceed? " + (fishing4.game.r.b - 1) + " days will be left if you do.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 216) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "대회기간이 만료되어 출항이 불가능합니다. 협회를 방문해주세요.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "Competition is over. Visit the team.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 217) {
                  a(glContext, "대물 낚시터에 입장하는 중입니다..", fishing4.a.m.e(), az.s, az.t);
                  bg.a(glContext);
               } else if (b == 218) {
                  a(glContext, "입장 실패하였습니다.", fishing4.a.m.e(), az.s, az.t);
               } else if (b == 219) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "해당 기능은 게임을 업데이트를 하셔야 이용하실 수 있습니다.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "This feature is only available on the latest version. ", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 221) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "상품목록을 받아왔습니다.\n\nTIP : 유료 아이템은 착용 제한이 없습니다.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "received list of products.\n\nTIP : Cash items do not have Level restrictions.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 222) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "상품목록을 받아왔습니다.\n\nTIP : 유료 낚싯대는 강화 및 수리가 가능합니다.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "received list of \nproducts.\n\nTIP : Cash rods can be \nrepaired / upgraded.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 223) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "상품목록을 받아왔습니다.\n\nTIP : 와이어는 장력 제한이 없습니다.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "received list of products.\n\nTIP : Wire has unlimited tension.", fishing4.a.m.e(), az.s, az.t);
                  }
               } else if (b == 224) {
                  if (globalConfig.languageId == 0) {
                     a(glContext, "상품목록을 받아왔습니다.\n\nTIP : 코스튬은 부가적인 능력치를 상승시킵니다.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     a(glContext, "received list of products.\n\nTIP : Costumes increase your stats.", fishing4.a.m.e(), az.s, az.t);
                  }
               }
            } else {
               if (globalConfig.languageId == 0) {
                  var8 = new String("받은 선물 목록\n\n");
                  var1 = var3;
               } else {
                  var8 = new String("Received Gifts\n\n");
                  var1 = var3;
               }

               while(var1 < fishing4.a.r.numGiftsWaiting) {
                  if (var1 >= 7) {
                     if (globalConfig.languageId == 0) {
                        var8 = var8 + "\n..외에 " + (fishing4.a.r.numGiftsWaiting - var1) + "종류를 선물받았습니다.";
                     } else {
                        var8 = var8 + "\n..You received following item(s) " + (fishing4.a.r.numGiftsWaiting - var1);
                     }
                     break;
                  }

                  if (globalConfig.languageId == 0) {
                     var7 = var8;
                     switch (fishing4.a.r.K[var1]) {
                        case 0:
                           var7 = var8 + (var1 + 1) + ". 명성 (" + fishing4.a.r.L[var1] + ")\n";
                           break;
                        case 1:
                           var7 = var8 + (var1 + 1) + ". 골드 (" + fishing4.a.r.L[var1] + ")\n";
                           break;
                        case 2:
                           var7 = var8 + (var1 + 1) + ". 파워와인드 낚싯대 " + fishing4.a.r.L[var1] + "개\n";
                           break;
                        case 3:
                           var7 = var8 + (var1 + 1) + ". 프로페셔널 낚싯대 " + fishing4.a.r.L[var1] + "개\n";
                           break;
                        case 4:
                           var7 = var8 + (var1 + 1) + ". 에쿠스 낚싯대 " + fishing4.a.r.L[var1] + "개\n";
                           break;
                        case 5:
                           var7 = var8 + (var1 + 1) + ". 썬 캡 " + fishing4.a.r.L[var1] + "개\n";
                           break;
                        case 6:
                           var7 = var8 + (var1 + 1) + ". 고급낚시모자 " + fishing4.a.r.L[var1] + "개\n";
                           break;
                        case 7:
                           var7 = var8 + (var1 + 1) + ". 레포츠 민소매 셔츠 " + fishing4.a.r.L[var1] + "개\n";
                           break;
                        case 8:
                           var7 = var8 + (var1 + 1) + ". 고급 고어텍스 셔츠 " + fishing4.a.r.L[var1] + "개\n";
                           break;
                        case 9:
                           var7 = var8 + (var1 + 1) + ". 레포츠 조끼 " + fishing4.a.r.L[var1] + "개\n";
                           break;
                        case 10:
                           var7 = var8 + (var1 + 1) + ". 고급 고어텍스 조끼 " + fishing4.a.r.L[var1] + "개\n";
                        case 11:
                           break;
                        case 12:
                           var7 = var8 + (var1 + 1) + ". 와이어 " + fishing4.a.r.L[var1] + "개\n";
                           break;
                        case 13:
                           var7 = var8 + (var1 + 1) + ". 숙련 (" + fishing4.a.r.L[var1] + ")\n";
                           break;
                        case 14:
                           var7 = var8 + (var1 + 1) + ". 공인협회 퀘스트 완료 (" + fishing4.a.r.L[var1] + "번까지)\n";
                           break;
                        case 15:
                           var7 = var8 + (var1 + 1) + ". 민간협회 퀘스트 완료 (" + fishing4.a.r.L[var1] + "번까지)\n";
                           break;
                        case 16:
                           var7 = var8 + (var1 + 1) + ". 내구테스트용 유료아이템 세트\n";
                           break;
                        case 17:
                           var7 = var8 + (var1 + 1) + ". 코인 (" + fishing4.a.r.L[var1] + ")\n";
                           break;
                        case 18:
                           var7 = var8 + (var1 + 1) + ". 갤럭시 낚싯대 " + fishing4.a.r.L[var1] + "개\n";
                           break;
                        case 19:
                           var7 = var8 + (var1 + 1) + ". 레오파드 낚싯대 " + fishing4.a.r.L[var1] + "개\n";
                           break;
                        case 20:
                           var7 = var8 + (var1 + 1) + ". 사이버 낚싯대 " + fishing4.a.r.L[var1] + "개\n";
                           break;
                        case 21:
                           var7 = var8 + (var1 + 1) + ". 파워와인드 낚싯대 +" + fishing4.a.r.L[var1] + " 1개\n";
                           break;
                        case 22:
                           var7 = var8 + (var1 + 1) + ". 프로페셔널 낚싯대 +" + fishing4.a.r.L[var1] + " 1개\n";
                           break;
                        case 23:
                           var7 = var8 + (var1 + 1) + ". 에쿠스 낚싯대 +" + fishing4.a.r.L[var1] + " 1개\n";
                           break;
                        case 24:
                           var7 = var8 + (var1 + 1) + ". 강태공 낚싯대 +" + fishing4.a.r.L[var1] + " 1개\n";
                           break;
                        default:
                           var7 = var8;
                     }
                  } else {
                     switch (fishing4.a.r.K[var1]) {
                        case 0:
                           var7 = var8 + (var1 + 1) + ". Reputation (" + fishing4.a.r.L[var1] + ")\n";
                           break;
                        case 1:
                           var7 = var8 + (var1 + 1) + ". Gold (" + fishing4.a.r.L[var1] + ")\n";
                           break;
                        case 2:
                           var7 = var8 + (var1 + 1) + ". Power wind rod ×  " + fishing4.a.r.L[var1] + "\n";
                           break;
                        case 3:
                           var7 = var8 + (var1 + 1) + ". Professional rod ×  " + fishing4.a.r.L[var1] + "\n";
                           break;
                        case 4:
                           var7 = var8 + (var1 + 1) + ". Equus rod ×  " + fishing4.a.r.L[var1] + "\n";
                           break;
                        case 5:
                           var7 = var8 + (var1 + 1) + ". Sun cap ×  " + fishing4.a.r.L[var1] + "\n";
                           break;
                        case 6:
                           var7 = var8 + (var1 + 1) + ". EX. fishing cap ×  " + fishing4.a.r.L[var1] + "\n";
                           break;
                        case 7:
                           var7 = var8 + (var1 + 1) + ". EX. leisure sports shirt ×  " + fishing4.a.r.L[var1] + "\n";
                           break;
                        case 8:
                           var7 = var8 + (var1 + 1) + ". EX. Goretex shirt ×  " + fishing4.a.r.L[var1] + "\n";
                           break;
                        case 9:
                           var7 = var8 + (var1 + 1) + ". Leisure sport vest ×  " + fishing4.a.r.L[var1] + "\n";
                           break;
                        case 10:
                           var7 = var8 + (var1 + 1) + ". EX. Goretex vest ×  " + fishing4.a.r.L[var1] + "\n";
                           break;
                        case 11:
                        default:
                           var7 = var8;
                           break;
                        case 12:
                           var7 = var8 + (var1 + 1) + ". Wire ×  " + fishing4.a.r.L[var1] + "\n";
                           break;
                        case 13:
                           var7 = var8 + (var1 + 1) + ". Experience Level (" + fishing4.a.r.L[var1] + ")\n";
                           break;
                        case 14:
                           var7 = var8 + (var1 + 1) + ". Complete  (" + fishing4.a.r.L[var1] + " Team Private quests)\n";
                           break;
                        case 15:
                           var7 = var8 + (var1 + 1) + ". Complete  (" + fishing4.a.r.L[var1] + " Team Public quests)\n";
                           break;
                        case 16:
                           var7 = var8 + (var1 + 1) + ". 내구테스트용 유료아이템 세트\n";
                           break;
                        case 17:
                           var7 = var8 + (var1 + 1) + ". Coin (" + fishing4.a.r.L[var1] + ")\n";
                           break;
                        case 18:
                           var7 = var8 + (var1 + 1) + ". Galaxy rod ×  " + fishing4.a.r.L[var1] + "\n";
                           break;
                        case 19:
                           var7 = var8 + (var1 + 1) + ". Leopard rod ×  " + fishing4.a.r.L[var1] + "\n";
                           break;
                        case 20:
                           var7 = var8 + (var1 + 1) + ". Cyber rod ×  " + fishing4.a.r.L[var1] + "\n";
                           break;
                        case 21:
                           var7 = var8 + (var1 + 1) + ". Power wind rod +" + fishing4.a.r.L[var1] + " \n";
                           break;
                        case 22:
                           var7 = var8 + (var1 + 1) + ". Professional rod +" + fishing4.a.r.L[var1] + " \n";
                           break;
                        case 23:
                           var7 = var8 + (var1 + 1) + ". Equus rod +" + fishing4.a.r.L[var1] + " \n";
                           break;
                        case 24:
                           var7 = var8 + (var1 + 1) + ". Veteran rod +" + fishing4.a.r.L[var1] + " \n";
                     }
                  }

                  ++var1;
                  var8 = var7;
               }

               a(glContext, var8.trim(), fishing4.a.m.e(), az.s, az.t);
            }
         }

         Log.d("들어오", "" + b);
      }

   }

   private static void a(GL10 var0, int var1, float var2, int var3) {
      a(var0, var1, var2, false, false, var3, true, true, false, 0);
   }

   public static void a(GL10 var0, int var1, float var2, boolean var3, boolean var4, int var5) {
      a(var0, var1, var2, var3, var4, var5, false, false, false, 0);
   }

   private static void a(GL10 var0, int var1, float var2, boolean var3, boolean var4, int var5, boolean var6, boolean var7, boolean var8, int var9) {
      if (!e()) {
         fishing4.a.e var11 = fishing4.a.e.a(fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 35.0F);
         if (l.a < m) {
            if (l.a < m - m * 0.5F) {
               l.a(l.a + m * 0.5F, l.b);
            } else {
               l.a(m, l.b);
            }

            a(var0, az.s, var11, l);
         } else if (l.b < n) {
            if (l.b < n - n * 0.5F) {
               l.a(l.a, l.b + n * 0.5F);
            } else {
               l.a(m, n);
            }

            a(var0, az.s, var11, l);
         } else {
            a(var0, az.s, var11, l);
            int var10 = var5 / 2;
            a(var0, var11.b, var10 % 10);
            fishing4.a.m.a(var0, az.v, fishing4.a.m.getHalfWidthPixels() + 140.0F - 28.0F, 70.0F + var11.b + 150.0F, 350.0F, 458.0F, 20.0F, 44.0F, '\b');
            fishing4.a.m.a(var0, az.v, fishing4.a.m.getHalfWidthPixels() + 140.0F - 18.0F, 70.0F + var11.b + 150.0F, 372.0F, 458.0F, 20.0F, 44.0F, '\b');
            fishing4.a.m.a(var0, az.v, fishing4.a.m.getHalfWidthPixels() + 140.0F - 0.0F, 70.0F + var11.b + 150.0F, 396.0F, 458.0F, 20.0F, 44.0F, '\b');
            fishing4.a.m.a(var0, az.v, 20.0F + fishing4.a.m.getHalfWidthPixels() + 140.0F, 70.0F + var11.b + 150.0F, 420.0F, 458.0F, 24.0F, 44.0F, '\b');
            fishing4.a.m.a(var0, az.v, 34.0F + fishing4.a.m.getHalfWidthPixels() + 140.0F, 70.0F + var11.b + 150.0F, 446.0F, 458.0F, 32.0F, 44.0F, '\b');
            fishing4.a.m.a(var0, az.v, fishing4.a.m.getHalfWidthPixels(), 31.0F + (var11.b + 150.0F - 93.0F), 2.0F, 451.0F, 198.0F, 60.0F, '\u0002');
            fishing4.game.m.a(var0, var1, var2, false, var3, var4, az.s, az.v, fishing4.a.m.getHalfWidthPixels(), var11.b + 150.0F, var5);
            fishing4.a.ae.a(var0, fishing4.game.m.c(var1), fishing4.a.m.getHalfWidthPixels(), var11.b, 350.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
            fishing4.a.m.a(var0, az.s, fishing4.a.m.getHalfWidthPixels(), var11.b - 20.0F - 22.0F, 493.0F, 496.0F, 352.0F, 4.0F, '\u0001');
            if (globalConfig.languageId == 0) {
               fishing4.a.ae.a(var0, "크기 : " + fishing4.game.m.a(var2, var1) + "cm (" + fishing4.game.m.e(var1) + "등급)", fishing4.a.m.getHalfWidthPixels(), var11.b - 70.0F, 350.0F, 60.0F, 26.0F, 4);
            } else {
               fishing4.a.ae.a(var0, "Length : " + k.format((double)fishing4.game.m.a(var2, var1) / 2.54) + "in. (Grade " + fishing4.game.m.e(var1) + ")", fishing4.a.m.getHalfWidthPixels(), var11.b - 70.0F, 350.0F, 60.0F, 26.0F, 4);
            }

            if (var6) {
               fishing4.a.ae.a(var0, fishing4.a.y.a(2131165238), fishing4.a.m.getHalfWidthPixels(), var11.b - 110.0F, 300.0F, 50.0F, 24.0F, 0);
               fishing4.a.ae.a(var0, fishing4.game.m.i(var1), fishing4.a.m.getHalfWidthPixels(), var11.b - 110.0F, 300.0F, 100.0F, 24.0F, 6, RGBColor.getColor(0.0F, 1.0F, 1.0F, 1.0F));
            }

            if (var7 && (b != 40 || var9 > 1)) {
               fishing4.game.k.a(var0, var11, 190.0F, var5);
            }

            if (var8) {
               at.a(var0, az.t, az.p + 1, ((ag)ad.h.get(az.k)).b.size(), fishing4.a.e.a(fishing4.a.m.getHalfWidthPixels() + 180.0F, var11.b + 150.0F - 93.0F + 20.0F));
            }

            a(var0, az.s, az.t, var11);
            if (b != 62 && b != 64) {
               fishing4.a.m.a(var0, az.t, fishing4.a.m.getHalfWidthPixels() - 175.0F, var11.b - 240.0F, 585.0F, 250.0F, 56.0F, 56.0F);
            } else if (globalConfig.languageId == 0) {
               fishing4.a.ae.a(var0, fishing4.a.r.aa[az.p] + "님\n(" + fishing4.game.t.a(fishing4.a.r.ab[az.p], false) + ")", fishing4.a.m.getHalfWidthPixels() - 120.0F, var11.b - 160.0F, 200.0F, 60.0F, 24.0F, 4, RGBColor.yellow());
            } else {
               fishing4.a.ae.a(var0, fishing4.a.r.aa[az.p] + "\n(" + fishing4.game.t.a(fishing4.a.r.ab[az.p], false) + ")", fishing4.a.m.getHalfWidthPixels() - 120.0F, var11.b - 160.0F, 200.0F, 60.0F, 24.0F, 4, RGBColor.yellow());
            }
         }
      }

   }

   public static void a(GL10 var0, int var1, ac var2) {
      if (!e()) {
         fishing4.a.e var3 = fishing4.a.m.e();
         if (l.a < m) {
            if (l.a < m - m * 0.5F) {
               l.a(l.a + m * 0.5F, l.b);
            } else {
               l.a(m, l.b);
            }

            a(var0, az.s, var3, l);
         } else if (l.b < n) {
            if (l.b < n - n * 0.5F) {
               l.a(l.a, l.b + n * 0.5F);
            } else {
               l.a(m, n);
            }

            a(var0, az.s, var3, l);
         } else {
            a(var0, az.s, var3, l);
            if (globalConfig.languageId == 0) {
               fishing4.a.ae.a(var0, "축하합니다. 강화에 성공했습니다.", fishing4.a.m.getHalfWidthPixels(), 80.0F + fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
               fishing4.a.ae.a(var0, "[결과]", fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
               if (var1 == 0) {
                  fishing4.a.ae.a(var0, "강화\n힘", fishing4.a.m.getHalfWidthPixels() - 85.0F, fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var2.d() - 1) + "\n" + var2.f(var2.d() - 1), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var2.d()) + "\n" + var2.q(), 100.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
                  fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 65.0F, 824.0F, 477.0F, 16.0F, 16.0F);
                  fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 65.0F - 30.0F, 824.0F, 477.0F, 16.0F, 16.0F);
               } else if (var1 == 2) {
                  fishing4.a.ae.a(var0, "강화\n텐션", fishing4.a.m.getHalfWidthPixels() - 85.0F, fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var2.d() - 1) + "\n" + var2.h(var2.d() - 1), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var2.d()) + "\n" + var2.t(), 100.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
                  fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 65.0F, 824.0F, 477.0F, 16.0F, 16.0F);
                  fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 65.0F - 30.0F, 824.0F, 477.0F, 16.0F, 16.0F);
               }
            } else {
               fishing4.a.ae.a(var0, "Upgrade Successful!", fishing4.a.m.getHalfWidthPixels(), 80.0F + fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
               fishing4.a.ae.a(var0, "[Result]", fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
               if (var1 == 0) {
                  fishing4.a.ae.a(var0, "Upgrade\nPower", fishing4.a.m.getHalfWidthPixels() - 85.0F, fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var2.d() - 1) + "\n" + var2.f(var2.d() - 1), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var2.d()) + "\n" + var2.q(), 100.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
                  fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 65.0F, 824.0F, 477.0F, 16.0F, 16.0F);
                  fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 65.0F - 30.0F, 824.0F, 477.0F, 16.0F, 16.0F);
               } else if (var1 == 2) {
                  fishing4.a.ae.a(var0, "Upgrade\nTension", fishing4.a.m.getHalfWidthPixels() - 85.0F, fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var2.d() - 1) + "\n" + var2.h(var2.d() - 1), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var2.d()) + "\n" + var2.t(), 100.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
                  fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 65.0F, 824.0F, 477.0F, 16.0F, 16.0F);
                  fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 65.0F - 30.0F, 824.0F, 477.0F, 16.0F, 16.0F);
               }
            }

            a(var0, az.s, az.t, var3);
         }
      }

   }

   public static void a(GL10 var0, int var1, ag var2) {
      if (!e()) {
         fishing4.a.e var3 = fishing4.a.m.e();
         if (l.a < m) {
            if (l.a < m - m * 0.5F) {
               l.a(l.a + m * 0.5F, l.b);
            } else {
               l.a(m, l.b);
            }

            a(var0, az.s, var3, l);
         } else if (l.b < n) {
            if (l.b < n - n * 0.5F) {
               l.a(l.a, l.b + n * 0.5F);
            } else {
               l.a(m, n);
            }

            a(var0, az.s, var3, l);
         } else {
            a(var0, az.s, var3, l);
            if (var1 == 71) {
               if (globalConfig.languageId == 0) {
                  fishing4.a.ae.a(var0, "선적을 개조하시겠습니까?", fishing4.a.m.getHalfWidthPixels(), 120.0F + fishing4.a.m.getHalfHeightPixels(), 325.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "[개조]", fishing4.a.m.getHalfWidthPixels(), 50.0F + fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "레벨\n선적", fishing4.a.m.getHalfWidthPixels() - 85.0F, fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var2.c) + "\n" + var2.j(), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var2.c + 1) + "\n" + var2.d(var2.c + 1), 100.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
                  fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), 15.0F + fishing4.a.m.getHalfHeightPixels(), 824.0F, 477.0F, 16.0F, 16.0F);
                  fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 15.0F, 824.0F, 477.0F, 16.0F, 16.0F);
                  fishing4.a.ae.a(var0, "개조비용 " + var2.j(var2.c + 1), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 70.0F, 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
                  if (var2.a != 88) {
                     fishing4.a.ae.a(var0, "소지금 " + ad.o.d(), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 100.0F, 300.0F, 60.0F, 26.0F, 4);
                  }
               } else {
                  fishing4.a.ae.a(var0, "Do you want to upgrade this ship?", fishing4.a.m.getHalfWidthPixels(), 120.0F + fishing4.a.m.getHalfHeightPixels(), 325.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "[Upgrade]", fishing4.a.m.getHalfWidthPixels(), 50.0F + fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "Level\nShipment", fishing4.a.m.getHalfWidthPixels() - 85.0F, fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var2.c) + "\n" + var2.j(), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var2.c + 1) + "\n" + var2.d(var2.c + 1), 100.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
                  fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), 15.0F + fishing4.a.m.getHalfHeightPixels(), 824.0F, 477.0F, 16.0F, 16.0F);
                  fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 15.0F, 824.0F, 477.0F, 16.0F, 16.0F);
                  fishing4.a.ae.a(var0, "Upgrade cost " + var2.j(var2.c + 1), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 70.0F, 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
                  if (var2.a != 88) {
                     fishing4.a.ae.a(var0, "Gold " + ad.o.d(), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 100.0F, 300.0F, 60.0F, 26.0F, 4);
                  }
               }
            } else if (var1 == 76) {
               if (globalConfig.languageId == 0) {
                  fishing4.a.ae.a(var0, "적재길이를 개조하시겠습니까?", fishing4.a.m.getHalfWidthPixels(), 120.0F + fishing4.a.m.getHalfHeightPixels(), 325.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "[개조]", fishing4.a.m.getHalfWidthPixels(), 50.0F + fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "레벨\n길이", fishing4.a.m.getHalfWidthPixels() - 120.0F, fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "Lv." + Integer.toString(var2.d) + "\n" + var2.h(), fishing4.a.m.getHalfWidthPixels() - 20.0F, fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "Lv." + Integer.toString(var2.d + 1) + "\n" + var2.c(var2.d + 1), 120.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
                  fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), 15.0F + fishing4.a.m.getHalfHeightPixels(), 824.0F, 477.0F, 16.0F, 16.0F);
                  fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 15.0F, 824.0F, 477.0F, 16.0F, 16.0F);
                  fishing4.a.ae.a(var0, "개조비용 " + var2.j(var2.d + 1), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 70.0F, 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
                  if (var2.a != 88) {
                     fishing4.a.ae.a(var0, "소지금 " + ad.o.d(), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 100.0F, 300.0F, 60.0F, 26.0F, 4);
                  }
               } else {
                  fishing4.a.ae.a(var0, "Do you want to upgrade this ship's length?", fishing4.a.m.getHalfWidthPixels(), 120.0F + fishing4.a.m.getHalfHeightPixels(), 325.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "[Upgrade]", fishing4.a.m.getHalfWidthPixels(), 50.0F + fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "Level\nLength", fishing4.a.m.getHalfWidthPixels() - 120.0F, fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "Lv." + Integer.toString(var2.d) + "\n" + var2.h(), fishing4.a.m.getHalfWidthPixels() - 20.0F, fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "Lv." + Integer.toString(var2.d + 1) + "\n" + var2.c(var2.d + 1), 120.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
                  fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), 15.0F + fishing4.a.m.getHalfHeightPixels(), 824.0F, 477.0F, 16.0F, 16.0F);
                  fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 15.0F, 824.0F, 477.0F, 16.0F, 16.0F);
                  fishing4.a.ae.a(var0, "Upgrade cost " + var2.j(var2.d + 1), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 70.0F, 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
                  if (var2.a != 88) {
                     fishing4.a.ae.a(var0, "Gold " + ad.o.d(), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 100.0F, 300.0F, 60.0F, 26.0F, 4);
                  }
               }
            }

            if (var2.a == 88) {
               aq.b(var0, fishing4.a.m.getHalfWidthPixels());
            }

            a(var0, az.s, az.t, var3);
         }
      }

   }

   private static void a(GL10 var0, int var1, String var2) {
      if (!e()) {
         fishing4.a.e var4 = fishing4.a.m.e();
         if (l.a < m) {
            if (l.a < m - m * 0.5F) {
               l.a(l.a + m * 0.5F, l.b);
            } else {
               l.a(m, l.b);
            }

            a(var0, az.s, var4, l);
         } else if (l.b < n) {
            if (l.b < n - n * 0.5F) {
               l.a(l.a, l.b + n * 0.5F);
            } else {
               l.a(m, n);
            }

            a(var0, az.s, var4, l);
         } else {
            a(var0, az.s, var4, l);
            int var3 = var1 / 2;
            a(var0, fishing4.a.m.getHalfHeightPixels(), var3 % 10);
            fishing4.game.m.b(var0, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() + 200.0F - 93.0F + 31.0F, var1);
            fishing4.a.ae.a(var0, var2, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() + 30.0F, 380.0F, 235.0F, 24.0F, 9);
            a(var0, az.s, az.t, var4);
            fishing4.game.k.b();
         }
      }

   }

   public static void a(GL10 var0, int var1, String var2, String var3) {
      if (!e()) {
         fishing4.a.e var5 = fishing4.a.m.e();
         if (l.a < m) {
            if (l.a < m - m * 0.5F) {
               l.a(l.a + m * 0.5F, l.b);
            } else {
               l.a(m, l.b);
            }

            a(var0, az.s, var5, l);
         } else if (l.b < n) {
            if (l.b < n - n * 0.5F) {
               l.a(l.a, l.b + n * 0.5F);
            } else {
               l.a(m, n);
            }

            a(var0, az.s, var5, l);
         } else {
            a(var0, az.s, var5, l);
            int var4 = var1 / 2;
            a(var0, fishing4.a.m.getHalfHeightPixels(), var4 % 10);
            fishing4.game.m.a(var0, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() + 150.0F - 93.0F + 31.0F + 100.0F, var1);
            fishing4.a.ae.a(var0, var2, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
            fishing4.a.m.a(var0, az.s, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 20.0F - 22.0F, 493.0F, 496.0F, 352.0F, 4.0F, '\u0001');
            fishing4.a.ae.a(var0, var3, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 130.0F, 350.0F, 200.0F, 26.0F, 4);
            a(var0, az.s, az.t, var5);
         }
      }

   }

   public static void a(GL10 var0, long var1) {
      if (!e()) {
         fishing4.a.e var3 = fishing4.a.m.e();
         if (l.a < m) {
            if (l.a < m - m * 0.5F) {
               l.a(l.a + m * 0.5F, l.b);
            } else {
               l.a(m, l.b);
            }

            a(var0, az.s, var3, l);
         } else if (l.b < n) {
            if (l.b < n - n * 0.5F) {
               l.a(l.a, l.b + n * 0.5F);
            } else {
               l.a(m, n);
            }

            a(var0, az.s, var3, l);
         } else {
            a(var0, az.s, var3, l);
            if (globalConfig.languageId == 0) {
               fishing4.a.ae.a(var0, "개수를 입력하세요", fishing4.a.m.getHalfWidthPixels(), 50.0F + fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
            } else {
               fishing4.a.ae.a(var0, "Enter the quantity", fishing4.a.m.getHalfWidthPixels(), 50.0F + fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
            }

            fishing4.a.ae.a(var0, Long.toString(var1), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
            fishing4.a.m.a(var0, az.s, fishing4.a.m.getHalfWidthPixels() - 80.0F, fishing4.a.m.getHalfHeightPixels(), 736.0F, 172.0F, 16.0F, 30.0F);
            fishing4.a.m.a(var0, az.s, fishing4.a.m.getHalfWidthPixels() - 140.0F - 10.0F, fishing4.a.m.getHalfHeightPixels(), 736.0F, 172.0F, 16.0F, 30.0F);
            fishing4.a.m.a(var0, az.s, 10.0F + (fishing4.a.m.getHalfWidthPixels() - 140.0F), fishing4.a.m.getHalfHeightPixels(), 736.0F, 172.0F, 16.0F, 30.0F);
            fishing4.a.m.a(var0, az.s, 80.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 736.0F, 172.0F, 16.0F, 30.0F, fishing4.a.g.b());
            fishing4.a.m.a(var0, az.s, fishing4.a.m.getHalfWidthPixels() + 140.0F - 10.0F, fishing4.a.m.getHalfHeightPixels(), 736.0F, 172.0F, 16.0F, 30.0F, fishing4.a.g.b());
            fishing4.a.m.a(var0, az.s, 10.0F + fishing4.a.m.getHalfWidthPixels() + 140.0F, fishing4.a.m.getHalfHeightPixels(), 736.0F, 172.0F, 16.0F, 30.0F, fishing4.a.g.b());
            a(var0, az.s, az.t, var3);
         }
      }

   }

   private static void a(GL10 var0, fishing4.a.w var1) {
      if (!e()) {
         if (l.a < m) {
            if (l.a < m - m * 0.5F) {
               l.a(l.a + m * 0.5F, l.b);
            } else {
               l.a(m, l.b);
            }

            a(var0, var1, fishing4.a.m.e(), l);
         } else if (l.b < n) {
            if (l.b < n - n * 0.5F) {
               l.a(l.a, l.b + n * 0.5F);
            } else {
               l.a(m, n);
            }

            a(var0, var1, fishing4.a.m.e(), l);
         } else {
            a(var0, var1, fishing4.a.m.e(), l);
            fishing4.a.m.a(var0, az.w, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 50.0F, 0.0F, 5.0F, 288.0F, 400.0F);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165325), fishing4.a.m.getHalfWidthPixels(), 200.0F + fishing4.a.m.getHalfHeightPixels(), w.b.a * m - 30.0F, w.b.b * n - 30.0F, 26.0F, 4);
         }
      }

   }

   public static void a(GL10 var0, fishing4.a.w var1, fishing4.a.e var2, fishing4.a.g var3) {
      fishing4.a.m.a(var0, var1, fishing4.a.e.a(var2.a - (w.b.a * var3.a + s.b.a) / 2.0F, var2.b + (w.b.b * var3.b + u.b.b) / 2.0F), o, (int)230);
      fishing4.a.m.a(var0, var1, fishing4.a.e.a(var2.a + (w.b.a * var3.a + t.b.a) / 2.0F, var2.b + (w.b.b * var3.b + u.b.b) / 2.0F), p, (int)230);
      fishing4.a.m.a(var0, var1, fishing4.a.e.a(var2.a - (w.b.a * var3.a + s.b.a) / 2.0F, var2.b - (w.b.b * var3.b + v.b.b) / 2.0F), q, (int)230);
      fishing4.a.m.a(var0, var1, fishing4.a.e.a(var2.a + (w.b.a * var3.a + t.b.a) / 2.0F, var2.b - (w.b.b * var3.b + v.b.b) / 2.0F), r, (int)230);
      fishing4.a.m.a(var0, var1, var2, w, var3, 230);
      fishing4.a.m.a(var0, var1, fishing4.a.e.a(var2.a - (w.b.a * var3.a + s.b.a) / 2.0F, var2.b), s, fishing4.a.g.c(var3.b), 230);
      fishing4.a.m.a(var0, var1, fishing4.a.e.a(var2.a + (w.b.a * var3.a + t.b.a) / 2.0F, var2.b), t, fishing4.a.g.c(var3.b), 230);
      fishing4.a.m.a(var0, var1, fishing4.a.e.a(var2.a, var2.b + (w.b.b * var3.b + u.b.b) / 2.0F), u, fishing4.a.g.b(var3.a), 230);
      fishing4.a.m.a(var0, var1, fishing4.a.e.a(var2.a, var2.b - (w.b.b * var3.b + v.b.b) / 2.0F), v, fishing4.a.g.b(var3.a), 230);
   }

   private static void a(GL10 var0, fishing4.a.w var1, fishing4.a.w var2, fishing4.a.e var3) {
      if (a == 0) {
         c.a(var0, var1, var2, fishing4.a.e.a(var3.a, var3.b - w.b.b * n / 2.0F + 20.0F));
      } else if (a == 1) {
         c.a(var0, var1, var2, fishing4.a.e.a(var3.a - fishing4.a.ad.c.a / 2.0F - 4.0F, var3.b - w.b.b * n / 2.0F + 20.0F));
         d.a(var0, var1, var2, fishing4.a.e.a(var3.a + fishing4.a.ad.c.a / 2.0F + 4.0F, var3.b - w.b.b * n / 2.0F + 20.0F));
      } else if (a == 4) {
         c.a(var0, var1, var2, fishing4.a.e.a(var3.a - fishing4.a.ad.c.a / 2.0F - 4.0F, var3.b - w.b.b * n / 2.0F + 20.0F));
         d.a(var0, var1, var2, fishing4.a.e.a(var3.a + fishing4.a.ad.c.a / 2.0F + 4.0F, var3.b - w.b.b * n / 2.0F + 20.0F));
         fishing4.a.m.a(var0, var2, var3.a - fishing4.a.ad.c.a / 2.0F - 30.0F, var3.b - w.b.b * n / 2.0F + 20.0F, 981.0F, 220.0F, 20.0F, 16.0F);
      }

   }

   public static void a(GL10 var0, fishing4.a.w var1, fishing4.a.w var2, fishing4.a.w var3, fishing4.a.w var4, fishing4.a.w var5, ag var6, int var7, boolean var8) {
      if (!e()) {
         fishing4.a.e var10 = fishing4.a.m.e();
         if (l.a < m) {
            if (l.a < m - m * 0.5F) {
               l.a(l.a + m * 0.5F, l.b);
            } else {
               l.a(m, l.b);
            }

            a(var0, var1, var10, l);
         } else if (l.b < n) {
            if (l.b < n - n * 0.5F) {
               l.a(l.a, l.b + n * 0.5F);
            } else {
               l.a(m, n);
            }

            a(var0, var1, var10, l);
         } else {
            a(var0, var1, var10, l);
            fishing4.a.ae.a(var0, ab.c(var6.a), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 30.0F, (float)fishing4.a.m.getWidthPixels(), 28.0F, 26.0F, 4, RGBColor.getColor(1.0F, 1.0F, 0.0F, 1.0F));
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165235), 40.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 90.0F, 220.0F, 28.0F, 26.0F, 0);
            fishing4.a.ae.a(var0, fishing4.a.y.a(2131165236), 40.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 120.0F, 220.0F, 28.0F, 26.0F, 0);
            fishing4.a.ae.a(var0, var6.g(), 90.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 90.0F, 220.0F, 28.0F, 26.0F, 1, RGBColor.getColor(0.0F, 1.0F, 1.0F, 1.0F));
            fishing4.a.ae.a(var0, var6.h(), 90.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 120.0F, 220.0F, 28.0F, 26.0F, 1, RGBColor.getColor(0.0F, 1.0F, 1.0F, 1.0F));
            fishing4.a.m.a(var0, var3, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() + 100.0F, 2.0F, 2.0F, 306.0F, 192.0F);
            var6.a(var0, var3, var5, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() + 60.0F);
            int var9;
            if (var7 % 150 < 50) {
               var9 = var7 % 50 * 255 / 50;
            } else if (var7 % 150 < 100) {
               var9 = 255 - var7 % 50 * 255 / 50;
            } else {
               var9 = 0;
            }

            fishing4.a.m.a(var0, var3, fishing4.a.m.getHalfWidthPixels() - 40.0F, fishing4.a.m.getHalfHeightPixels() + 120.0F, 0.0F, 194.0F, 270.0F, 200.0F, '\u0005', var9);
            var6.a(var0, var4, fishing4.a.m.getHalfWidthPixels() - 130.0F, fishing4.a.m.getHalfHeightPixels() - 100.0F, var7);
            if (ad.h.size() > 1 && var8) {
               fishing4.game.k.a(var0, fishing4.a.e.a(fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() + 100.0F), 190.0F, var7);
            }

            a(var0, var1, var2, var10);
         }
      }

   }

   public static void a(GL10 var0, ac var1) {
      if (!e()) {
         fishing4.a.e var2 = fishing4.a.m.e();
         if (l.a < m) {
            if (l.a < m - m * 0.5F) {
               l.a(l.a + m * 0.5F, l.b);
            } else {
               l.a(m, l.b);
            }

            a(var0, az.s, var2, l);
         } else if (l.b < n) {
            if (l.b < n - n * 0.5F) {
               l.a(l.a, l.b + n * 0.5F);
            } else {
               l.a(m, n);
            }

            a(var0, az.s, var2, l);
         } else {
            a(var0, az.s, var2, l);
            if (globalConfig.languageId == 0) {
               fishing4.a.ae.a(var0, var1.u() + " 강화하시겠습니까?", fishing4.a.m.getHalfWidthPixels(), 120.0F + fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
               fishing4.a.ae.a(var0, "[강화]", fishing4.a.m.getHalfWidthPixels(), 50.0F + fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
               fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), 15.0F + fishing4.a.m.getHalfHeightPixels(), 824.0F, 477.0F, 16.0F, 16.0F);
               fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 15.0F, 824.0F, 477.0F, 16.0F, 16.0F);
               fishing4.a.ae.a(var0, "강화비용 " + ac.c(var1), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 70.0F, 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
               fishing4.a.ae.a(var0, "소지금 " + ad.o.d(), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 100.0F, 300.0F, 60.0F, 26.0F, 4);
               if (var1.s() == 0) {
                  fishing4.a.ae.a(var0, "강화\n힘", fishing4.a.m.getHalfWidthPixels() - 85.0F, fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var1.d()) + "\n" + var1.q(), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var1.d() + 1) + "\n" + var1.f(var1.d() + 1), 100.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
               } else if (var1.s() == 2) {
                  fishing4.a.ae.a(var0, "강화\n텐션", fishing4.a.m.getHalfWidthPixels() - 85.0F, fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var1.d()) + "\n" + var1.t(), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var1.d() + 1) + "\n" + var1.h(var1.d() + 1), 100.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
               }
            } else {
               fishing4.a.ae.a(var0, var1.u() + "\nDo you want to upgrade this?", fishing4.a.m.getHalfWidthPixels(), 150.0F + fishing4.a.m.getHalfHeightPixels(), 300.0F, 90.0F, 26.0F, 4);
               fishing4.a.ae.a(var0, "[Upgrade]", fishing4.a.m.getHalfWidthPixels(), 50.0F + fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
               fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), 15.0F + fishing4.a.m.getHalfHeightPixels(), 824.0F, 477.0F, 16.0F, 16.0F);
               fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 15.0F, 824.0F, 477.0F, 16.0F, 16.0F);
               fishing4.a.ae.a(var0, "Upgrade cost " + ac.c(var1), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 70.0F, 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
               fishing4.a.ae.a(var0, "Gold " + ad.o.d(), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 120.0F, 300.0F, 60.0F, 26.0F, 4);
               if (var1.s() == 0) {
                  fishing4.a.ae.a(var0, "Upgrade\nPower", fishing4.a.m.getHalfWidthPixels() - 85.0F, fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var1.d()) + "\n" + var1.q(), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var1.d() + 1) + "\n" + var1.f(var1.d() + 1), 100.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
               } else if (var1.s() == 2) {
                  fishing4.a.ae.a(var0, "Upgrade\nTension", fishing4.a.m.getHalfWidthPixels() - 85.0F, fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var1.d()) + "\n" + var1.t(), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var1.d() + 1) + "\n" + var1.h(var1.d() + 1), 100.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
               }
            }

            a(var0, az.s, az.t, var2);
         }
      }

   }

   private static void a(GL10 var0, ar var1) {
      if (!e()) {
         if (l.a < m) {
            if (l.a < m - m * 0.5F) {
               l.a(l.a + m * 0.5F, l.b);
            } else {
               l.a(m, l.b);
            }

            a(var0, az.s, fishing4.a.m.e(), l);
         } else if (l.b < n) {
            if (l.b < n - n * 0.5F) {
               l.a(l.a, l.b + n * 0.5F);
            } else {
               l.a(m, n);
            }

            a(var0, az.s, fishing4.a.m.e(), l);
         } else {
            a(var0, az.s, fishing4.a.m.e(), l);
            ac.a(var0, az.C, fishing4.a.m.getHalfWidthPixels() - 150.0F, fishing4.a.m.getHalfHeightPixels() + 220.0F, var1.d);
            fishing4.a.ae.a(var0, var1.g, 50.0F + fishing4.a.m.getHalfWidthPixels(), 220.0F + fishing4.a.m.getHalfHeightPixels(), 360.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
            int var2;
            if (var1.b[1] == -1 && var1.c[0] == 1) {
               if (var1.b[0] == 50) {
                  fishing4.a.ae.a(var0, "Lv : Lv.5\n\nWave. L. : 10", fishing4.a.m.getHalfWidthPixels(), 100.0F + fishing4.a.m.getHalfHeightPixels(), 300.0F, 100.0F, 24.0F, 4, RGBColor.getColor(0.0F, 1.0F, 1.0F, 1.0F));
               } else {
                  ac var4 = ac.a(var1.b[0]);
                  int var3 = ab.e(ab.d(var1.b[0]));

                  for(var2 = 0; var2 < var3 - 1; ++var2) {
                     fishing4.a.m.a(var0, az.s, fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() + 100.0F - (float)(var2 * 40) - 22.0F, 493.0F, 496.0F, 352.0F, 4.0F, fishing4.a.g.b(1.0F), '\u0001');
                     fishing4.a.ae.a(var0, ab.a(ab.d(var1.b[0]), var2), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() + 100.0F - (float)(var2 * 40), 300.0F, 200.0F, 24.0F, 0, RGBColor.getColor(0.0F, 1.0F, 1.0F, 1.0F));
                     fishing4.a.ae.a(var0, ab.a(var4, var2, true), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() + 100.0F - (float)(var2 * 40), 300.0F, 200.0F, 24.0F, 1);
                  }
               }
            } else {
               for(var2 = 0; var2 < 5 && var1.b[var2] != -1; ++var2) {
                  ac.a(var0, az.C, fishing4.a.m.getHalfWidthPixels() - 150.0F, fishing4.a.m.getHalfHeightPixels() + 150.0F - (float)(var2 * 40), var1.b[var2], fishing4.a.g.a(0.5F));
                  fishing4.a.ae.a(var0, ab.c(var1.b[var2]), 25.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() + 150.0F - (float)(var2 * 40), 280.0F, 50.0F, 24.0F, 0, RGBColor.getColor(0.0F, 1.0F, 1.0F, 1.0F));
                  fishing4.a.ae.a(var0, "x" + Integer.toString(var1.c[var2]), 25.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() + 150.0F - (float)(var2 * 40), 280.0F, 50.0F, 24.0F, 1, RGBColor.getColor(0.0F, 1.0F, 1.0F, 1.0F));
               }
            }

            fishing4.a.ae.a(var0, var1.h + ab.b(var1.f), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 130.0F, 360.0F, 200.0F, 26.0F, 4);
            a(var0, az.s, az.t, fishing4.a.m.e());
            if (var1.d == 61) {
               fishing4.a.m.a(var0, az.C, fishing4.a.m.getHalfWidthPixels(), 100.0F + fishing4.a.m.getHalfHeightPixels(), 604.0F, 388.0F, 210.0F, 124.0F);
            } else if (var1.d == 62) {
               fishing4.a.m.a(var0, az.C, fishing4.a.m.getHalfWidthPixels(), 100.0F + fishing4.a.m.getHalfHeightPixels(), 814.0F, 262.0F, 210.0F, 124.0F);
            } else if (var1.d == 63) {
               fishing4.a.m.a(var0, az.C, fishing4.a.m.getHalfWidthPixels(), 100.0F + fishing4.a.m.getHalfHeightPixels(), 814.0F, 388.0F, 210.0F, 124.0F);
            }
         }
      }

   }

   public static void a(GL10 glContext, String message, fishing4.a.e var2, fishing4.a.w var3, fishing4.a.w var4) {
      if (!e()) {
         if (l.a < m) {
            if (l.a < m - m * 0.5F) {
               l.a(l.a + m * 0.5F, l.b);
            } else {
               l.a(m, l.b);
            }

            a(glContext, var3, var2, l);
         } else if (l.b < n) {
            if (l.b < n - n * 0.5F) {
               l.a(l.a, l.b + n * 0.5F);
            } else {
               l.a(m, n);
            }

            a(glContext, var3, var2, l);
         } else {
            a(glContext, var3, var2, l);
            if (a == 3) {
               fishing4.a.m.a(glContext, var3, fishing4.a.e.a(fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() + 90.0F), fishing4.a.f.a(0.0F, 527.0F, 332.0F, 46.0F), fishing4.a.g.b(0.8F), 190);
               fishing4.a.m.a(glContext, var3, fishing4.a.e.a(fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels()), fishing4.a.f.a(0.0F, 527.0F, 332.0F, 46.0F), fishing4.a.g.b(0.8F), 190);
               fishing4.a.m.a(glContext, var3, fishing4.a.e.a(fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 90.0F), fishing4.a.f.a(0.0F, 527.0F, 332.0F, 46.0F), fishing4.a.g.b(0.8F), 190);
            }

            fishing4.a.ae.a(glContext, message, var2.a, var2.b, w.b.a * m - 40.0F, w.b.b * n - 40.0F, 26.0F, 4);
            a(glContext, var3, var4, var2);
            fishing4.game.k.b();
         }
      }

   }

   public static void b() {
      if (a != 2) {
         g = true;
         f = false;
      }

   }

   public static void b(int var0) {
      a(var0, fishing4.a.g.a(16.0F));
   }

   public static void b(GL10 var0, int var1, ag var2) {
      if (!e()) {
         fishing4.a.e var3 = fishing4.a.m.e();
         if (l.a < m) {
            if (l.a < m - m * 0.5F) {
               l.a(l.a + m * 0.5F, l.b);
            } else {
               l.a(m, l.b);
            }

            a(var0, az.s, var3, l);
         } else if (l.b < n) {
            if (l.b < n - n * 0.5F) {
               l.a(l.a, l.b + n * 0.5F);
            } else {
               l.a(m, n);
            }

            a(var0, az.s, var3, l);
         } else {
            a(var0, az.s, var3, l);
            if (globalConfig.languageId == 0) {
               if (var1 == 73) {
                  fishing4.a.ae.a(var0, "선적이 개조되었습니다.", fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() + 80.0F, 325.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "[결과]", fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "레벨\n선적", fishing4.a.m.getHalfWidthPixels() - 85.0F, fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var2.c - 1) + "\n" + var2.d(var2.c - 1), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var2.c) + "\n" + var2.j(), 100.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
                  fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 65.0F, 824.0F, 477.0F, 16.0F, 16.0F);
                  fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 65.0F - 30.0F, 824.0F, 477.0F, 16.0F, 16.0F);
               } else if (var1 == 78) {
                  fishing4.a.ae.a(var0, "적재길이가 개조되었습니다.", fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() + 80.0F, 325.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "[결과]", fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "레벨\n길이", fishing4.a.m.getHalfWidthPixels() - 120.0F, fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var2.d - 1) + "\n" + var2.c(var2.d - 1), fishing4.a.m.getHalfWidthPixels() - 20.0F, fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4);
                  fishing4.a.ae.a(var0, "+" + Integer.toString(var2.d) + "\n" + var2.h(), 120.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
                  fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 65.0F, 824.0F, 477.0F, 16.0F, 16.0F);
                  fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 65.0F - 30.0F, 824.0F, 477.0F, 16.0F, 16.0F);
               }
            } else if (var1 == 73) {
               fishing4.a.ae.a(var0, "Ship Upgrade Successful!", fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() + 80.0F, 325.0F, 60.0F, 26.0F, 4);
               fishing4.a.ae.a(var0, "[Result]", fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
               fishing4.a.ae.a(var0, "Level\nShipment", fishing4.a.m.getHalfWidthPixels() - 85.0F, fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4);
               fishing4.a.ae.a(var0, "+" + Integer.toString(var2.c - 1) + "\n" + var2.d(var2.c - 1), fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4);
               fishing4.a.ae.a(var0, "+" + Integer.toString(var2.c) + "\n" + var2.j(), 100.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
               fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 65.0F, 824.0F, 477.0F, 16.0F, 16.0F);
               fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 65.0F - 30.0F, 824.0F, 477.0F, 16.0F, 16.0F);
            } else if (var1 == 78) {
               fishing4.a.ae.a(var0, "Length Upgrade Successful!", fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() + 80.0F, 325.0F, 60.0F, 26.0F, 4);
               fishing4.a.ae.a(var0, "[Result]", fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels(), 300.0F, 60.0F, 26.0F, 4);
               fishing4.a.ae.a(var0, "Level\nLength", fishing4.a.m.getHalfWidthPixels() - 120.0F, fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4);
               fishing4.a.ae.a(var0, "+" + Integer.toString(var2.d - 1) + "\n" + var2.c(var2.d - 1), fishing4.a.m.getHalfWidthPixels() - 20.0F, fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4);
               fishing4.a.ae.a(var0, "+" + Integer.toString(var2.d) + "\n" + var2.h(), 120.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 80.0F, 300.0F, 60.0F, 26.0F, 4, RGBColor.yellow());
               fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 65.0F, 824.0F, 477.0F, 16.0F, 16.0F);
               fishing4.a.m.a(var0, az.s, 50.0F + fishing4.a.m.getHalfWidthPixels(), fishing4.a.m.getHalfHeightPixels() - 65.0F - 30.0F, 824.0F, 477.0F, 16.0F, 16.0F);
            }

            a(var0, az.s, az.t, var3);
         }
      }

   }

   public static void c() {
      g = true;
      f = false;
   }

   public static boolean d() {
      boolean var0;
      if (!(l.a < m) && !(l.b < n)) {
         var0 = true;
      } else {
         var0 = false;
      }

      return var0;
   }

   public static boolean e() {
      boolean var0 = false;
      if (f) {
         f = false;
         g = false;
         e = true;
      } else if (g) {
         g = false;
         e = false;
         b = -1;
      }

      if (!e) {
         var0 = true;
      }

      return var0;
   }
}

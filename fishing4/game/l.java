package fishing4.game;

import javax.microedition.khronos.opengles.GL10;

import fishing4.a.GLRootView;

public final class l {
   public static final fishing4.a.h a = fishing4.a.h.a(156.0F, 124.0F);
   public static final fishing4.a.e b;
   public static final fishing4.a.e c;
   public static int d;
   public static boolean e;
   public static float f;
   public static fishing4.a.w g;
   public static fishing4.a.w h;
   private static fishing4.a.e i;
   private static long j;

   static {
      b = fishing4.a.e.a((float)fishing4.a.m.getWidthPixels() + a.a * 2.0F, a.b);
      c = fishing4.a.e.a((float)fishing4.a.m.getWidthPixels() - a.a, a.b);
   }

   public static void a(int var0) {
      d = var0;
      f = 0.0F;
      i = fishing4.a.e.a((float)fishing4.a.m.getWidthPixels() + a.a, a.b);
      e = true;
      if (d == 2) {
         am.b(1);
      } else {
         switch (d) {
            case 1:
            case 12:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
               am.b(1);
               break;
            case 13:
            case 60:
            case 70:
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
               am.b(0);
               break;
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
               j = System.currentTimeMillis();
               break;
            case 43:
            case 62:
            case 81:
               am.a(0, fishing4.a.g.b(20.0F, 22.0F));
               break;
            case 61:
            case 80:
               am.a(1, fishing4.a.g.b(20.0F, 22.0F));
               break;
            case 66:
               am.a(1, fishing4.a.g.b(18.0F, 20.0F));
               break;
            default:
               am.b(0);
         }
      }

      if (d != 32 && d != 30 && d != 31) {
         if (d == 10 || d == 12) {
            OptionsManager.a(500);
         }
      } else {
         OptionsManager.a(1000);
      }

      if (d != 41 && d != 42) {
         if (d != 46 && d != 47 && d != 92) {
            if (d == 40) {
               fishing4.b.d.a().b(GLRootView.getAppContext(), 2131034118);
            } else if (d == 32 || d == 30 || d == 31) {
               fishing4.b.d.a().b(GLRootView.getAppContext(), 2131034117);
            }
         } else {
            fishing4.b.d.a().b(GLRootView.getAppContext(), 2131034133);
         }
      } else {
         fishing4.b.d.a().b(GLRootView.getAppContext(), 2131034133);
      }

      if (d == 30) {
         if (((ac)ad.k.get(ad.b)).f() == 300) {
            ad.k.remove(ad.b);
            ad.b = -1;
         } else {
            ((ac)ad.k.get(ad.b)).e();
         }

         k.f();
      } else if (d == 32) {
         if (!((ac)ad.j.get(ad.c)).b(1L)) {
            ad.j.remove(ad.c);
            ad.c = -1;
         }

         k.f();
      }

   }

   public static void a(GL10 var0) {
      fishing4.a.w.a(var0, g);
      g = null;
      fishing4.a.w.a(var0, h);
      h = null;
   }

   public static void a(GL10 var0, fishing4.a.w var1, fishing4.a.w var2, int var3) {
      if (h == null) {
         h = fishing4.a.w.a(var0, "img/cut/cut_eff.png");
      }

      if (aw.c == 3) {
         fishing4.a.m.a(var0, h, c.a + 3.0F, c.b, '\u0001');
      }

      int var4;
      switch (d) {
         case 20:
            var4 = 6;
            break;
         case 21:
            var4 = 8;
            break;
         case 22:
            var4 = 8;
            break;
         case 23:
            var4 = 7;
            break;
         case 24:
            var4 = 6;
            break;
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 43:
         case 45:
         default:
            var4 = 0;
            break;
         case 30:
            var4 = 9;
            break;
         case 31:
            var4 = 12;
            break;
         case 32:
            var4 = 11;
            break;
         case 40:
            var4 = 7;
            break;
         case 41:
         case 42:
            var4 = 11;
            break;
         case 44:
            var4 = 9;
            break;
         case 46:
         case 47:
            var4 = 12;
      }

      if (var4 != 0) {
         if (e) {
            var4 = d;
            fishing4.a.w.a(var0, g);
            g = null;
            switch (var4) {
               case 20:
                  g = fishing4.a.w.a(var0, "img/cut/cut8.png");
                  break;
               case 21:
                  g = fishing4.a.w.a(var0, "img/cut/cut3.png");
                  break;
               case 22:
                  g = fishing4.a.w.a(var0, "img/cut/cut6.png");
                  break;
               case 23:
                  g = fishing4.a.w.a(var0, "img/cut/cut5.png");
                  break;
               case 24:
                  g = fishing4.a.w.a(var0, "img/cut/cut4.png");
               case 25:
               case 26:
               case 27:
               case 28:
               case 29:
               case 33:
               case 34:
               case 35:
               case 36:
               case 37:
               case 38:
               case 39:
               case 43:
               case 45:
               case 48:
               case 49:
               case 50:
               case 51:
               case 52:
               case 53:
               case 54:
               default:
                  break;
               case 30:
                  g = fishing4.a.w.a(var0, "img/cut/cut2.png");
                  break;
               case 31:
                  g = fishing4.a.w.a(var0, "img/cut/cut7.png");
                  break;
               case 32:
                  g = fishing4.a.w.a(var0, "img/cut/cut1.png");
                  break;
               case 40:
                  g = fishing4.a.w.a(var0, "img/cut/cut9.png");
                  break;
               case 41:
               case 42:
                  g = fishing4.a.w.a(var0, "img/cut/cut10.png");
                  break;
               case 44:
               case 55:
                  g = fishing4.a.w.a(var0, "img/cut/cut11.png");
                  break;
               case 46:
               case 47:
                  g = fishing4.a.w.a(var0, "img/cut/cut12.png");
            }

            fishing4.a.w.a(var0, m.f);
            m.f = null;
            e = false;
         } else {
            int var5 = (int)f % var4;
            if (d != 20 && d != 21 && d != 22 && d != 23 && d != 24) {
               fishing4.a.y.a(i, c, fishing4.a.e.a(10.0F, 10.0F));
               fishing4.a.m.a(var0, g, i.a, i.b, (float)(var5 % 3) * (a.a + 1.0F) + 1.0F, 1.0F + (float)(var5 / 3) * (a.b + 1.0F), a.a, a.b, fishing4.a.g.a(2.0F));
            } else {
               if (System.currentTimeMillis() - j < 1500L) {
                  fishing4.a.y.a(i, c);
               } else {
                  fishing4.a.y.a(i, b);
               }

               fishing4.a.m.a(var0, g, i.a, i.b, (float)(var5 % 3) * (a.a + 1.0F) + 1.0F, 1.0F + (float)(var5 / 3) * (a.b + 1.0F), a.a, a.b, fishing4.a.g.a(2.0F));
            }

            fishing4.a.m.a(var0, h, i.a + 3.0F, i.b, '\u0001');
            if (f < (float)var4) {
               f += 0.2F;
            } else {
               f = 0.0F;
            }
         }
      }

      switch (d) {
         case 0:
            am.a(var0, fishing4.a.y.a(2131165252), fishing4.a.m.e(), var1, var2);
            break;
         case 1:
            am.a(var0, fishing4.a.y.a(2131165253), fishing4.a.m.e(), var1, var2);
            break;
         case 2:
            am.a(var0, fishing4.a.y.a(2131165254), fishing4.a.m.e(), var1, var2);
         case 3:
         case 4:
         case 5:
         case 6:
         case 7:
         case 8:
         case 9:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 21:
         case 22:
         case 23:
         case 24:
         case 25:
         case 26:
         case 27:
         case 28:
         case 29:
         case 33:
         case 34:
         case 35:
         case 36:
         case 37:
         case 38:
         case 39:
         case 62:
         case 67:
         case 68:
         case 69:
         case 76:
         case 77:
         case 78:
         case 79:
         case 86:
         case 87:
         case 88:
         case 89:
         default:
            break;
         case 10:
            am.a(var0, fishing4.a.y.a(2131165244), fishing4.a.m.e(), var1, var2);
            break;
         case 11:
            am.a(var0, fishing4.a.y.a(2131165243), fishing4.a.m.e(), var1, var2);
            break;
         case 12:
            am.a(var0, fishing4.a.y.a(2131165256) + ab.b(ab.a(aw.p)), fishing4.a.m.e(), var1, var2);
            aq.b(var0, fishing4.a.m.getHalfWidthPixels());
            break;
         case 13:
            am.a(var0, fishing4.a.y.a(2131165264), fishing4.a.m.e(), var1, var2);
            break;
         case 30:
            am.a(var0, fishing4.a.y.a(2131165246), fishing4.a.m.e(), var1, var2);
            break;
         case 31:
            am.a(var0, fishing4.a.y.a(2131165247), fishing4.a.m.e(), var1, var2);
            break;
         case 32:
            am.a(var0, fishing4.a.y.a(2131165249), fishing4.a.m.e(), var1, var2);
            break;
         case 40:
            am.a(var0, fishing4.a.y.a(2131165245), fishing4.a.m.e(), var1, var2);
            break;
         case 41:
            am.a(var0, fishing4.a.y.a(2131165250), fishing4.a.m.e(), var1, var2);
            break;
         case 42:
            am.a(var0, fishing4.a.y.a(2131165259), fishing4.a.m.e(), var1, var2);
            break;
         case 43:
            am.a(var0, fishing4.game.i.b, aw.i, aw.j, aw.k, var3);
            break;
         case 44:
            am.a(var0, fishing4.a.y.a(2131165248), fishing4.a.m.e(), var1, var2);
            break;
         case 45:
            am.a(var0, fishing4.a.y.a(2131165255), fishing4.a.m.e(), var1, var2);
            break;
         case 46:
            am.a(var0, fishing4.a.y.a(2131165258), fishing4.a.m.e(), var1, var2);
            break;
         case 47:
            am.a(var0, fishing4.a.y.a(2131165257), fishing4.a.m.e(), var1, var2);
            break;
         case 48:
            am.a(var0, fishing4.a.y.a(2131165263), fishing4.a.m.e(), var1, var2);
            break;
         case 49:
            var3 = ((ac)ad.m.get(ad.f)).f();
            aw.r = var3;
            aw.p = var3;
            ad.m.remove(ad.f);
            ad.f = -1;
            av.c(var0);
            k.f();
            if (aw.p != 607 && aw.p != 608) {
               a(52);
            } else {
               a(57);
            }
            break;
         case 50:
            var3 = ((ac)ad.l.get(ad.e)).f();
            aw.r = var3;
            aw.p = var3;
            ad.l.remove(ad.e);
            ad.e = -1;
            av.b(var0);
            k.f();
            if (aw.p != 507 && aw.p != 508) {
               a(53);
            } else {
               a(58);
            }
            break;
         case 51:
            var3 = ((ac)ad.n.get(ad.d)).f();
            aw.r = var3;
            aw.p = var3;
            ad.n.remove(ad.d);
            ad.d = -1;
            av.d(var0);
            k.f();
            if (aw.p != 707 && aw.p != 708) {
               a(54);
            } else {
               a(59);
            }
            break;
         case 52:
            am.a(var0, fishing4.a.y.a(2131165261), fishing4.a.m.e(), var1, var2);
            break;
         case 53:
            am.a(var0, fishing4.a.y.a(2131165262), fishing4.a.m.e(), var1, var2);
            break;
         case 54:
            am.a(var0, fishing4.a.y.a(2131165260), fishing4.a.m.e(), var1, var2);
            break;
         case 55:
            am.a(var0, fishing4.a.y.a(2131165265) + ab.b(ab.a(aw.p)), fishing4.a.m.e(), var1, var2);
            break;
         case 56:
            am.a(var0, fishing4.a.y.a(2131165266) + ab.b(ab.a(aw.p)), fishing4.a.m.e(), var1, var2);
            break;
         case 57:
            am.a(var0, fishing4.a.y.a(2131165267) + ab.b(ab.a(aw.p)), fishing4.a.m.e(), var1, var2);
            break;
         case 58:
            am.a(var0, fishing4.a.y.a(2131165268) + ab.b(ab.a(aw.p)), fishing4.a.m.e(), var1, var2);
            break;
         case 59:
            am.a(var0, fishing4.a.y.a(2131165269) + ab.b(ab.a(aw.p)), fishing4.a.m.e(), var1, var2);
            break;
         case 60:
            if (aw.o != 1 && aw.p != -1) {
               if (ab.d(aw.p) == 0) {
                  ad.a = ad.i.size() - 1;
               } else if (ab.d(aw.p) == 2) {
                  ad.b = ad.k.size() - 1;
               } else if (ab.d(aw.p) == 4) {
                  ad.f = ad.m.size() - 1;
               } else if (ab.d(aw.p) == 3) {
                  ad.e = ad.l.size() - 1;
               } else if (ab.d(aw.p) == 5) {
                  ad.d = ad.n.size() - 1;
               }

               av.a(var0);
               aw.p = -1;
               aw.q = 0;
            }

            am.a(var0, fishing4.a.y.a(2131165270), fishing4.a.m.e(), var1, var2);
            break;
         case 61:
            k.q();
            am.a(var0, var3, fishing4.a.y.a(2131165186), fishing4.a.y.a(2131165187));
            break;
         case 63:
            k.q();
            am.a(var0, fishing4.a.y.a(2131165189), fishing4.a.m.e(), var1, var2);
            break;
         case 64:
            k.q();
            am.a(var0, fishing4.a.y.a(2131165190), fishing4.a.m.e(), var1, var2);
            break;
         case 65:
            k.q();
            am.a(var0, fishing4.a.y.a(2131165191), fishing4.a.m.e(), var1, var2);
            break;
         case 66:
            am.a(var0, "|255255000|축하합니다.\n\n최종 포인트를 달성하였습니다.\n\n최종 당첨 확인 및 경품 수령을 위해 이벤트 페이지로 이동합니다.", fishing4.a.m.e(), var1, var2);
            break;
         case 70:
            am.a(var0, "복구를 실패하였습니다.", fishing4.a.m.e(), var1, var2);
            break;
         case 71:
            am.a(var0, "LGT임직원은 사용이 불가합니다.", fishing4.a.m.e(), var1, var2);
            break;
         case 72:
            am.a(var0, "더 이상 구매할 수 없습니다.", fishing4.a.m.e(), var1, var2);
            break;
         case 73:
            am.a(var0, "고객님은 월한도 초과로 인해 더 이상 구매하실 수 없습니다. 다음달에 다시 이용해 주세요.", fishing4.a.m.e(), var1, var2);
            break;
         case 74:
            am.a(var0, "고객님은 일한도 초과로 인해 더 이상 구매하실 수 없습니다. 다음날에 다시 이용해 주세요.", fishing4.a.m.e(), var1, var2);
            break;
         case 75:
            am.a(var0, "청소년요금제 혹은 선불한도로 인해 구매하실 수 없습니다.", fishing4.a.m.e(), var1, var2);
            break;
         case 80:
            if (am.b != 46) {
               am.a(var0, var3, fishing4.a.y.a(2131165192), fishing4.a.y.a(2131165193) + " " + Long.toString(globalConfig.h.c()) + fishing4.a.y.a(2131165194));
            }
            break;
         case 81:
            if (globalConfig.languageId == 0) {
               am.a(var0, var3, fishing4.a.y.a(2131165192), fishing4.a.y.a(2131165195) + "\n\n|255255000|보유코인 " + ad.p.b() + "Coin");
            } else {
               am.a(var0, var3, fishing4.a.y.a(2131165192), fishing4.a.y.a(2131165195) + "\n\n|255255000|Current " + ad.p.b() + "Coin");
            }
            break;
         case 82:
            am.a(var0, fishing4.a.y.a(2131165196), fishing4.a.m.e(), var1, var2);
            break;
         case 83:
            am.a(var0, fishing4.a.y.a(2131165197), fishing4.a.m.e(), var1, var2);
            break;
         case 84:
            am.a(var0, "|255000000|<죄송합니다>\n\n에딧프로그램 사용 로그가 발견되었습니다!\n|255255000|타 사용자의 피해를 막기 위해, 네트워크가 차단됩니다.\n문의사항은 아래의 메일로 보내주십시오.\nhelp@pnjmobile.co.kr", fishing4.a.m.e(), var1, var2);
            break;
         case 85:
            am.a(var0, "버전업 대상입니다.", fishing4.a.m.e(), var1, var2);
            break;
         case 90:
            am.a(var0, "아이템을 낚았습니다!!\n\n[" + ab.c((int)as.c.encrypt()) + "]", fishing4.a.m.e(), var1, var2);
            break;
         case 91:
            am.a(var0, "인벤토리가 가득 차서 추가 아이템을 획득할 수 없습니다.", fishing4.a.m.e(), var1, var2);
            break;
         case 92:
            am.a(var0, fishing4.a.y.a(2131165271), fishing4.a.m.e(), var1, var2);
      }

      switch (d) {
         case 55:
         case 56:
         case 57:
         case 58:
         case 59:
            aq.b(var0, fishing4.a.m.getHalfWidthPixels() - 120.0F);
         default:
      }
   }
}

package fishing4.game;

import javax.microedition.khronos.opengles.GL10;

public final class aq {
   public static int a;
   public static byte b;
   public static ar[] c;
   public static int d;
   private fishing4.a.r e = new fishing4.a.r();
   private int f;
   private final int g = 0;
   private final int h = 1;
   private final int i = 2;
   private final int j = 99;

   public aq() {
      a = 3;
   }

   public static void a() {
      if (d != 1) {
         if (!am.e()) {
            if (am.b >= 185 && am.b <= 190) {
               am.a(181);
            } else {
               am.b();
            }
         } else if (a == 3) {
            if (z.b() == 3) {
               ++OptionsManager.m;
            } else if (z.b() == 4) {
               ++OptionsManager.n;
            }

            OptionsManager.saveOptions();
            a = 0;
         } else if (a == 1) {
            a = 2;
         }
      }

   }

   public static void a(fishing4.a.e var0) {
      if (d != 1 && am.e && !am.c.a(var0, false)) {
         am.d.a(var0, false);
      }

   }

   private void a(GL10 var1) {
      byte var2;
      label117: {
         var2 = 1;
         byte var3 = 1;
         fishing4.a.r var4;
         if (fishing4.a.r.j) {
            if (d == 1) {
               if (this.f == 0) {
                  this.e.a(4);
                  this.f = 1;
               }

               this.e.a(var1);
               if (this.f == 1) {
                  var4 = this.e;
                  if (fishing4.a.r.b()) {
                     switch (b) {
                        case 10:
                           globalConfig.h.encryptLong(200L);
                           break;
                        case 11:
                           globalConfig.h.encryptLong(515L);
                           break;
                        case 12:
                           globalConfig.h.encryptLong(840L);
                           break;
                        case 13:
                           globalConfig.h.encryptLong(1400L);
                           break;
                        case 14:
                           globalConfig.h.encryptLong(3300L);
                           break;
                        case 15:
                           globalConfig.h.encryptLong(6000L);
                           break;
                        case 16:
                           globalConfig.h.encryptLong(0L);
                           break;
                        default:
                           globalConfig.h.encryptLong((long)(b() * -1));
                     }

                     globalConfig.i = null;
                     if (z.b() == 4) {
                        globalConfig.i = new String("바다 넷상점 이용");
                     } else {
                        globalConfig.i = new String("마을 넷상점 이용");
                     }

                     this.e.b(4);
                     if (!fishing4.a.r.j) {
                        d = 1;
                        this.f = 0;
                        return;
                     }

                     this.f = 2;
                  }
               } else if (this.f == 2 && this.e.c()) {
                  this.f = 0;
                  d = 2;
               }

               var4 = this.e;
               if (fishing4.a.r.d() != 99) {
                  var4 = this.e;
                  if (fishing4.a.r.d() != 100) {
                     return;
                  }
               }

               if (this.e.c()) {
                  return;
               }

               am.a(45);
               this.f = 0;
            } else {
               if (d != 2) {
                  return;
               }

               var4 = this.e;
               if (fishing4.a.r.f() != 99) {
                  var4 = this.e;
                  if (!fishing4.a.r.c(fishing4.a.r.e())) {
                     var2 = 0;
                  }

                  d = var2;
                  return;
               }

               am.a(46);
               this.f = 0;
            }
         } else if (d == 1) {
            if (this.f == 0) {
               if (a == 4) {
                  this.e.a(112);
               } else {
                  this.e.a(3);
               }

               this.f = 1;
            }

            this.e.a(var1);
            if (this.f == 1) {
               var4 = this.e;
               if (fishing4.a.r.b()) {
                  if (a == 4) {
                     b = 22;
                     if (!fishing4.a.r.ah) {
                        this.e.b(112);
                     } else {
                        this.e.b(3);
                     }
                  } else {
                     this.e.b(3);
                  }

                  this.f = 2;
               }
            } else if (this.f == 2 && this.e.c()) {
               this.f = 0;
               d = 2;
            }

            var4 = this.e;
            if (fishing4.a.r.d() != 99) {
               var4 = this.e;
               if (fishing4.a.r.d() != 100) {
                  return;
               }
            }

            if (this.e.c()) {
               return;
            }

            am.a(45);
            this.f = 0;
         } else {
            if (d != 2) {
               return;
            }

            var4 = this.e;
            if (fishing4.a.r.f() == 99) {
               am.a(46);
               this.f = 0;
            } else {
               var4 = this.e;
               if (fishing4.a.r.c(fishing4.a.r.e())) {
                  var2 = var3;
                  break label117;
               }
            }
         }

         var2 = 0;
      }

      d = var2;
   }

   public static void a(GL10 var0, float var1) {
      if (am.b == -1) {
         if (globalConfig.languageId == 0) {
            fishing4.a.m.a(var0, az.w, var1, 70.0F, 373.0F, 130.0F, 128.0F, 128.0F);
         } else {
            fishing4.a.m.a(var0, az.w, var1, 70.0F, 373.0F, 0.0F, 128.0F, 128.0F);
         }
      }

   }

   public static final int b() {
      int var1 = 2000;
      int var0;
      if (b != 3 && b != 4 && b != 5 && b != 20 && b != 21 && b != 2) {
         if (b >= 10 && b <= 15) {
            var0 = var1;
            switch (b) {
               case 10:
                  break;
               case 11:
                  var0 = 5000;
                  break;
               case 12:
                  var0 = 8000;
                  break;
               case 13:
                  var0 = 13000;
                  break;
               case 14:
                  var0 = 30000;
                  break;
               case 15:
                  var0 = 50000;
                  break;
               default:
                  var0 = var1;
            }
         } else if (b == 17) {
            var1 = 650;
            int var2 = 0;

            while(true) {
               var0 = var1;
               if (var2 >= ad.h.size()) {
                  break;
               }

               var0 = var1;
               if (((ag)ad.h.get(var2)).a == 88) {
                  if (bg.b == 72) {
                     var0 = ((ag)ad.h.get(var2)).i(((ag)ad.h.get(var2)).c + 1);
                  } else {
                     var0 = var1;
                     if (bg.b == 77) {
                        var0 = ((ag)ad.h.get(var2)).i(((ag)ad.h.get(var2)).d + 1);
                     }
                  }
               }

               ++var2;
               var1 = var0;
            }
         } else if (b == 18) {
            var0 = ac.b(bg.a());
         } else {
            var0 = var1;
            if (b != 22) {
               var0 = c[az.k].f;
            }
         }
      } else {
         var0 = ab.a(aw.r);
      }

      return var0;
   }

   public static void b(fishing4.a.e var0) {
      if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 80.0F, fishing4.a.m.d() + 70.0F + 64.0F - 50.0F), fishing4.a.h.a(128.0F, 128.0F), var0, true)) {
         am.a(185);
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 80.0F, fishing4.a.m.d() + 70.0F + 64.0F - 50.0F), fishing4.a.h.a(128.0F, 128.0F), var0, true)) {
         am.a(186);
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 80.0F, fishing4.a.m.d() - 50.0F), fishing4.a.h.a(128.0F, 128.0F), var0, true)) {
         am.a(187);
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 80.0F, fishing4.a.m.d() - 50.0F), fishing4.a.h.a(128.0F, 128.0F), var0, true)) {
         am.a(188);
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 80.0F, fishing4.a.m.d() - 70.0F - 64.0F - 50.0F), fishing4.a.h.a(128.0F, 128.0F), var0, true)) {
         am.a(189);
      } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 80.0F, fishing4.a.m.d() - 70.0F - 64.0F - 50.0F), fishing4.a.h.a(128.0F, 128.0F), var0, true)) {
         am.a(190);
      }

   }

   public static void b(GL10 var0, float var1) {
      if (globalConfig.languageId == 0) {
         fishing4.a.m.a(var0, az.w, var1, 70.0F, 372.0F, 387.0F, 124.0F, 124.0F);
      } else {
         fishing4.a.m.a(var0, az.w, var1, 70.0F, 372.0F, 260.0F, 124.0F, 124.0F);
      }

      af var3 = ad.p;
      fishing4.a.e var2 = fishing4.a.e.a(var1, 98.0F);
      fishing4.a.w var4 = az.s;
      var3.a(var0, var2, az.t);
   }

   public static void c(fishing4.a.e var0) {
      int var1 = 0;
      boolean var3 = false;
      if (d != 1) {
         if (am.e) {
            k.d();
            if (am.b == 181) {
               b(var0);
            } else if (am.c.a(var0, true)) {
               if (am.a != 1 && am.a != 4) {
                  if (am.a == 0) {
                     fishing4.a.r.h();
                  }
               } else if (fishing4.a.r.i) {
                  return;
               }

               if (am.b == 180) {
                  b = 16;
                  k.o();
               } else if (am.b == 70) {
                  if (c[az.k].b[0] == 50) {
                     am.a(80);
                  } else {
                     boolean var4;
                     label121: {
                        for(int var2 = 0; var2 < 5 && c[az.k].b[var2] != -1; ++var2) {
                           var4 = var3;
                           if (!ad.a(c[az.k].b[var2], c[az.k].c[var2])) {
                              break label121;
                           }
                        }

                        var4 = true;
                     }

                     if (var4) {
                        if (ad.p.b() >= 0L && c[az.k].f > 0 && ad.p.b() >= (long)c[az.k].f) {
                           b = 1;
                           k.o();
                        } else {
                           am.a(180);
                        }
                     } else {
                        am.a(71);
                     }
                  }
               } else if (am.b == 80) {
                  am.a(81);
               } else if (am.b == 81) {
                  if (((ag)ad.h.get(az.p)).e < 5) {
                     if (ad.p.b() >= 0L && c[az.k].f > 0 && ad.p.b() >= (long)c[az.k].f) {
                        b = 1;
                        k.o();
                     } else {
                        am.a(180);
                     }
                  } else {
                     am.a(82);
                  }
               } else if (am.b == 82) {
                  am.a(80);
               } else {
                  switch (am.b) {
                     case 185:
                        fishing4.a.r.g = "fish4_gg_001";
                        fishing4.a.r.g();
                        b = 10;
                        break;
                     case 186:
                        fishing4.a.r.g = "fish4_gg_002";
                        fishing4.a.r.g();
                        b = 11;
                        break;
                     case 187:
                        fishing4.a.r.g = "fish4_gg_003";
                        fishing4.a.r.g();
                        b = 12;
                        break;
                     case 188:
                        fishing4.a.r.g = "fish4_gg_004";
                        fishing4.a.r.g();
                        b = 13;
                        break;
                     case 189:
                        fishing4.a.r.g = "fish4_gg_005";
                        fishing4.a.r.g();
                        b = 14;
                        break;
                     case 190:
                        fishing4.a.r.g = "fish4_gg_006";
                        fishing4.a.r.g();
                        b = 15;
                        break;
                     default:
                        am.b();
                  }
               }
            } else if (am.d.a(var0, true)) {
               if (!fishing4.a.r.i) {
                  if (am.b >= 185 && am.b <= 190) {
                     am.a(181);
                  } else {
                     am.b();
                  }
               }
            } else if (am.b == 81) {
               if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 190.0F, fishing4.a.m.d() + 100.0F), fishing4.a.h.a(50.0F, 50.0F), var0)) {
                  az.d((az.p + ad.h.size() - 1) % ad.h.size());
               } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 190.0F, fishing4.a.m.d() + 100.0F), fishing4.a.h.a(50.0F, 50.0F), var0)) {
                  az.d((az.p + 1) % ad.h.size());
               }
            }
         } else {
            k.d();
            if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 140.0F, 70.0F), fishing4.a.h.a(130.0F, 130.0F), var0, true)) {
               b = 16;
               k.o();
            } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 140.0F, 70.0F), fishing4.a.h.a(130.0F, 130.0F), var0, true)) {
               com.tapjoy.f.a();
               com.tapjoy.f.b();
            } else {
               while(var1 < 24) {
                  if (fishing4.a.f.a(fishing4.a.e.a((float)((fishing4.a.m.a() - 330) / 2) + (float)(var1 % 6 * 66), 600.0F - (float)(var1 / 6 * 76)), bg.c.b, var0)) {
                     if (az.k == var1) {
                        if (var1 < 23) {
                           am.a(70);
                        }
                     } else {
                        az.c(var1);
                     }
                     break;
                  }

                  ++var1;
               }
            }
         }
      }

   }

   public final void a(GL10 var1, int var2) {
      // $FF: Couldn't be decompiled
   }
}

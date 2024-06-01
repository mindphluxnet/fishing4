package fishing4.game;

import android.content.Context;
import android.os.Message;
import java.text.DecimalFormat;
import javax.microedition.khronos.opengles.GL10;
import pnjmobile.fishing4.google_free.Main;

public final class ba extends aa {
   public static int f;
   private fishing4.a.w g;
   private fishing4.a.w h;
   private fishing4.a.w i;
   private fishing4.a.w j;
   private fishing4.a.w k;
   private fishing4.a.w l;
   private fishing4.a.w m;
   private fishing4.a.w n;
   private fishing4.a.w o;
   private fishing4.a.e p;
   private fishing4.a.e q;
   private fishing4.a.e r;
   private fishing4.a.e s;
   private fishing4.a.e t;
   private fishing4.a.r u = new fishing4.a.r();
   private int v;
   private final int w = 0;
   private final int x = 1;
   private final int y = 2;
   private final int z = 99;

   public ba(Context var1) {
      super(2, var1);
   }

   private void a() {
      if (fishing4.a.r.af) {
         fishing4.a.r.E = 1;
         if (globalConfig.languageId == 0) {
            fishing4.a.r.F = 0;
         } else {
            fishing4.a.r.F = 1;
         }

         am.a(52);
         this.v = 0;
         f = 0;
      } else {
         fishing4.a.r.E = 1;
         if (globalConfig.languageId == 0) {
            fishing4.a.r.F = 0;
         } else {
            fishing4.a.r.F = 1;
         }

         f = 1;
      }

   }

   private static void a(GL10 var0, float var1) {
      am.a(var0, az.s, fishing4.a.e.a(fishing4.a.m.c(), var1), fishing4.a.g.b(18.9F, 19.23F));
      fishing4.a.m.a(var0, az.s, fishing4.a.m.c() - 201.0F, var1, 948.0F, 0.0F, 10.0F, 492.0F, (int)150);
      fishing4.a.m.a(var0, az.s, 201.0F + fishing4.a.m.c(), var1, 1014.0F, 0.0F, 10.0F, 492.0F, (int)150);
      fishing4.a.m.a(var0, az.s, fishing4.a.m.c(), var1, 958.0F, 0.0F, 56.0F, 492.0F, fishing4.a.g.b(7.0F), (int)150);
   }

   private static boolean a(fishing4.a.e var0, boolean var1) {
      boolean var3 = false;
      boolean var2;
      if (c == 2) {
         var2 = fishing4.a.f.a(fishing4.a.e.a((float)(fishing4.a.m.a() - 70), 70.0F), fishing4.a.h.a(140.0F, 140.0F), var0, var1);
      } else {
         var2 = var3;
         if (fishing4.game.k.h()) {
            if (c != 0 && c != 1) {
               var2 = var3;
               if (c != 2) {
                  return var2;
               }
            }

            var2 = fishing4.a.f.a(fishing4.a.e.a((float)(fishing4.a.m.a() - 70), 70.0F), fishing4.a.h.a(140.0F, 140.0F), var0, var1);
         }
      }

      return var2;
   }

   private static void b(GL10 var0, float var1) {
      DecimalFormat var3 = new DecimalFormat();
      int var2;
      if (globalConfig.languageId == 0) {
         for(var2 = 0; var2 < 5; ++var2) {
            fishing4.a.ae.a(var0, var2 + 1 + "위\n" + fishing4.game.t.a(fishing4.a.r.U[var2], false), fishing4.a.m.c(), 200.0F + var1 - (float)(var2 * 80), 300.0F, 100.0F, 26.0F, 0);
            fishing4.a.ae.a(var0, var3.format((long)fishing4.a.r.T[var2]) + " exp\n(" + fishing4.a.r.S[var2] + ")", fishing4.a.m.c(), 200.0F + var1 - (float)(var2 * 80), 300.0F, 100.0F, 26.0F, 1);
            fishing4.a.m.a(var0, az.s, fishing4.a.m.c(), 200.0F + var1 - 40.0F - (float)(var2 * 80), 493.0F, 496.0F, 352.0F, 4.0F, '\u0001');
         }

         fishing4.a.ae.a(var0, fishing4.a.r.V + "위\n" + fishing4.game.t.a(fishing4.a.r.X, false), fishing4.a.m.c(), var1 - 200.0F, 300.0F, 100.0F, 26.0F, 0, fishing4.a.aa.d());
         fishing4.a.ae.a(var0, var3.format((long)fishing4.a.r.W) + " exp", fishing4.a.m.c(), var1 - 185.0F, 300.0F, 100.0F, 26.0F, 1, fishing4.a.aa.d());
      } else {
         for(var2 = 0; var2 < 5; ++var2) {
            if (var2 == 0) {
               fishing4.a.ae.a(var0, var2 + 1 + "st\n" + fishing4.game.t.a(fishing4.a.r.U[var2], false), fishing4.a.m.c(), 200.0F + var1 - (float)(var2 * 80), 300.0F, 100.0F, 26.0F, 0);
            } else if (var2 == 1) {
               fishing4.a.ae.a(var0, var2 + 1 + "nd\n" + fishing4.game.t.a(fishing4.a.r.U[var2], false), fishing4.a.m.c(), 200.0F + var1 - (float)(var2 * 80), 300.0F, 100.0F, 26.0F, 0);
            } else if (var2 == 2) {
               fishing4.a.ae.a(var0, var2 + 1 + "rd\n" + fishing4.game.t.a(fishing4.a.r.U[var2], false), fishing4.a.m.c(), 200.0F + var1 - (float)(var2 * 80), 300.0F, 100.0F, 26.0F, 0);
            } else {
               fishing4.a.ae.a(var0, var2 + 1 + "th\n" + fishing4.game.t.a(fishing4.a.r.U[var2], false), fishing4.a.m.c(), 200.0F + var1 - (float)(var2 * 80), 300.0F, 100.0F, 26.0F, 0);
            }

            fishing4.a.ae.a(var0, var3.format((long)fishing4.a.r.T[var2]) + " exp\n(" + fishing4.a.r.S[var2] + ")", fishing4.a.m.c(), 200.0F + var1 - (float)(var2 * 80), 300.0F, 100.0F, 26.0F, 1);
            fishing4.a.m.a(var0, az.s, fishing4.a.m.c(), 200.0F + var1 - 40.0F - (float)(var2 * 80), 493.0F, 496.0F, 352.0F, 4.0F, '\u0001');
         }

         if (fishing4.a.r.V == 1) {
            fishing4.a.ae.a(var0, fishing4.a.r.V + "st\n" + fishing4.game.t.a(fishing4.a.r.X, false), fishing4.a.m.c(), var1 - 200.0F, 300.0F, 100.0F, 26.0F, 0, fishing4.a.aa.d());
         } else if (fishing4.a.r.V == 2) {
            fishing4.a.ae.a(var0, fishing4.a.r.V + "nd\n" + fishing4.game.t.a(fishing4.a.r.X, false), fishing4.a.m.c(), var1 - 200.0F, 300.0F, 100.0F, 26.0F, 0, fishing4.a.aa.d());
         } else if (fishing4.a.r.V == 3) {
            fishing4.a.ae.a(var0, fishing4.a.r.V + "rd\n" + fishing4.game.t.a(fishing4.a.r.X, false), fishing4.a.m.c(), var1 - 200.0F, 300.0F, 100.0F, 26.0F, 0, fishing4.a.aa.d());
         } else {
            fishing4.a.ae.a(var0, fishing4.a.r.V + "th\n" + fishing4.game.t.a(fishing4.a.r.X, false), fishing4.a.m.c(), var1 - 200.0F, 300.0F, 100.0F, 26.0F, 0, fishing4.a.aa.d());
         }

         fishing4.a.ae.a(var0, var3.format((long)fishing4.a.r.W) + " exp", fishing4.a.m.c(), var1 - 185.0F, 300.0F, 100.0F, 26.0F, 1, fishing4.a.aa.d());
      }

      fishing4.game.k.b();
   }

   private void g(GL10 var1) {
      byte var7 = 0;
      int var4;
      byte var5;
      switch (e / 2 % 16) {
         case 0:
            var5 = -3;
            var4 = 0;
            break;
         case 1:
            var5 = -3;
            var4 = 0;
            break;
         case 2:
            var5 = -3;
            var4 = 0;
            break;
         case 3:
            var5 = -2;
            var4 = 0;
            break;
         case 4:
            var5 = -1;
            var4 = 0;
            break;
         case 5:
            var4 = 0;
            var5 = 0;
            break;
         case 6:
            var4 = 0;
            var5 = 1;
            break;
         case 7:
            var4 = 64;
            var5 = 2;
            break;
         case 8:
            var4 = 128;
            var5 = 3;
            break;
         case 9:
            var4 = 255;
            var5 = 3;
            break;
         case 10:
            var4 = 128;
            var5 = 3;
            break;
         case 11:
            var4 = 64;
            var5 = 2;
            break;
         case 12:
            var4 = 0;
            var5 = 1;
            break;
         case 13:
            var4 = 0;
            var5 = 0;
            break;
         case 14:
            var5 = -1;
            var4 = 0;
            break;
         case 15:
            var5 = -2;
            var4 = 0;
            break;
         default:
            var4 = 0;
            var5 = 0;
      }

      fishing4.a.m.a(var1, this.g, fishing4.a.m.c(), fishing4.a.m.d() + (float)var5);
      byte var6 = var7;
      switch (e / 4 % 16) {
         case 0:
         case 1:
         case 2:
            break;
         case 3:
            var6 = 1;
            break;
         case 4:
            var6 = 2;
            break;
         case 5:
            var6 = 3;
            break;
         case 6:
            var6 = 4;
            break;
         case 7:
            var6 = 5;
            break;
         case 8:
            var6 = 6;
            break;
         case 9:
            var6 = 6;
            break;
         case 10:
            var6 = 6;
            break;
         case 11:
            var6 = 5;
            break;
         case 12:
            var6 = 4;
            break;
         case 13:
            var6 = 3;
            break;
         case 14:
            var6 = 2;
            break;
         case 15:
            var6 = 1;
            break;
         default:
            var6 = var7;
      }

      fishing4.a.m.a(var1, this.h, -88.0F + this.h.c.a / 2.0F, (float)fishing4.a.m.b() - this.h.c.b / 2.0F + 100.0F - (float)var6);
      fishing4.a.w var8 = this.i;
      float var3 = fishing4.a.m.c();
      float var2 = fishing4.a.m.d();
      fishing4.a.m.b(var1, var8, var3, (float)var5 + var2, var4);
      if (c == 0 || c == 1 || c == 2) {
         var4 = e / 2;
         switch (var4 % 10) {
            case 0:
            case 1:
            case 2:
            case 3:
               var2 = (float)(var4 % 10 + 1);
               break;
            case 4:
            case 5:
               var2 = 5.0F;
               break;
            case 6:
            case 7:
            case 8:
            case 9:
               var2 = (float)(10 - var4 % 10);
               break;
            default:
               var2 = 0.0F;
         }

         fishing4.a.m.a(var1, this.o, (float)(fishing4.a.m.a() - 70), 70.0F + var2, 0.0F, 0.0F, 136.0F, 134.0F);
      }

   }

   private void h(GL10 var1) {
      fishing4.a.m.a(var1, az.t, fishing4.a.m.c() - 165.0F, fishing4.a.m.d() - 330.0F, 585.0F, 250.0F, 56.0F, 56.0F);
      if (aa.c == 1) {
         if (fishing4.a.y.a(this.p, fishing4.a.e.a(fishing4.a.m.c(), this.p.b)) || fishing4.a.y.a(this.q, fishing4.a.e.a(fishing4.a.m.c(), this.q.b)) || fishing4.a.y.a(this.r, fishing4.a.e.a(fishing4.a.m.c(), this.r.b)) || fishing4.a.y.a(this.s, fishing4.a.e.a(fishing4.a.m.c(), this.s.b)) || fishing4.a.y.a(this.t, fishing4.a.e.a(fishing4.a.m.c(), this.t.b))) {
            this.a(var1, 2);
         }
      } else if (aa.c == 5) {
         if (fishing4.a.y.a(this.p, fishing4.a.e.a(fishing4.a.m.c(), this.p.b)) || fishing4.a.y.a(this.q, fishing4.a.e.a(fishing4.a.m.c(), this.q.b)) || fishing4.a.y.a(this.r, fishing4.a.e.a(fishing4.a.m.c(), this.r.b))) {
            this.a(var1, 6);
         }
      } else if (aa.c == 3 && (fishing4.a.y.a(this.p, fishing4.a.e.a(fishing4.a.m.c(), this.p.b)) || fishing4.a.y.a(this.q, fishing4.a.e.a(fishing4.a.m.c(), this.q.b)))) {
         this.a(var1, 4);
      }

      byte var2;
      switch (aa.c) {
         case 1:
         case 2:
            fishing4.a.m.a(var1, this.n, this.p.a, this.p.b);
            fishing4.a.m.a(var1, this.n, this.q.a, this.q.b);
            fishing4.a.m.a(var1, this.n, this.r.a, this.r.b);
            fishing4.a.m.a(var1, this.n, this.s.a, this.s.b);
            fishing4.a.m.a(var1, this.n, this.t.a, this.t.b);
            if (globalConfig.languageId == 0) {
               fishing4.a.m.a(var1, this.l, this.p.a, this.p.b, 0.0F, 0.0F, 122.0F, 24.0F);
               fishing4.a.m.a(var1, this.l, this.q.a, this.q.b, 0.0F, 29.0F, 122.0F, 24.0F);
               fishing4.a.m.a(var1, this.l, this.r.a, this.r.b, 0.0F, 60.0F, 122.0F, 24.0F);
               fishing4.a.m.a(var1, this.l, this.s.a, this.s.b, 0.0F, 89.0F, 122.0F, 24.0F);
               fishing4.a.m.a(var1, this.l, this.t.a, this.t.b, 124.0F, 90.0F, 90.0F, 24.0F);
            } else {
               fishing4.a.m.a(var1, this.m, this.p.a, this.p.b, 0.0F, 0.0F, 108.0F, 22.0F);
               fishing4.a.m.a(var1, this.m, this.q.a, this.q.b, 0.0F, 30.0F, 168.0F, 22.0F);
               fishing4.a.m.a(var1, this.m, this.r.a, this.r.b, 0.0F, 60.0F, 82.0F, 22.0F);
               fishing4.a.m.a(var1, this.m, this.s.a, this.s.b, 0.0F, 90.0F, 130.0F, 22.0F);
               fishing4.a.m.a(var1, this.m, this.t.a, this.t.b, 170.0F, 90.0F, 102.0F, 22.0F);
            }

            fishing4.a.aa var3 = fishing4.a.aa.a(0.0F, 0.0F, 0.0F, 1.0F);
            fishing4.a.ae.a(var1, "id:" + globalConfig.userName, this.q.a + 2.0F, this.t.b - 102.0F, var3);
            var3 = fishing4.a.aa.a(1.0F, 1.0F, 1.0F, 1.0F);
            fishing4.a.ae.a(var1, "id:" + globalConfig.userName, this.q.a + 0.0F, this.t.b - 100.0F, var3);
            am.a(var1, e);
            break;
         case 3:
         case 4:
            fishing4.a.m.a(var1, this.n, this.p.a, this.p.b);
            fishing4.a.m.a(var1, this.n, this.q.a, this.q.b);
            if (globalConfig.languageId == 0) {
               fishing4.a.m.a(var1, this.l, this.p.a, this.p.b, 290.0F, 30.0F, 122.0F, 24.0F);
               fishing4.a.m.a(var1, this.l, this.q.a, this.q.b, 290.0F, 0.0F, 122.0F, 24.0F);
            } else {
               fishing4.a.m.a(var1, this.m, this.p.a, this.p.b, 174.0F, 113.0F, 172.0F, 22.0F);
               fishing4.a.m.a(var1, this.m, this.q.a, this.q.b, 0.0F, 113.0F, 172.0F, 22.0F);
            }

            am.a(var1, e);
            break;
         case 5:
         case 6:
            fishing4.a.m.a(var1, this.n, this.p.a, this.p.b);
            fishing4.a.m.a(var1, this.n, this.q.a, this.q.b);
            fishing4.a.m.a(var1, this.n, this.r.a, this.r.b);
            if (globalConfig.languageId == 0) {
               fishing4.a.m.a(var1, this.l, this.p.a, this.p.b, 124.0F, 0.0F, 122.0F, 24.0F);
               fishing4.a.m.a(var1, this.l, this.q.a, this.q.b, 124.0F, 31.0F, 122.0F, 24.0F);
               fishing4.a.m.a(var1, this.l, this.r.a, this.r.b, 124.0F, 61.0F, 164.0F, 24.0F);
            } else {
               fishing4.a.m.a(var1, this.m, this.p.a, this.p.b, 171.0F, 0.0F, 168.0F, 22.0F);
               fishing4.a.m.a(var1, this.m, this.q.a, this.q.b, 171.0F, 30.0F, 188.0F, 22.0F);
               fishing4.a.m.a(var1, this.m, this.r.a, this.r.b, 171.0F, 60.0F, 238.0F, 22.0F);
            }
            break;
         case 7:
            az.c();
            am.a(var1, az.s, fishing4.a.m.e(), fishing4.a.g.a(20.0F));
            az.a(var1, fishing4.a.m.d(), az.j, e);
            break;
         case 8:
            am.a(var1, az.s, fishing4.a.m.e(), fishing4.a.g.a(18.0F));
            az.a(var1, fishing4.a.m.d());
            break;
         case 9:
            fishing4.a.m.a(var1, this.n, fishing4.a.m.c(), (float)(fishing4.a.m.b() - 100));
            if (globalConfig.languageId == 0) {
               fishing4.a.m.a(var1, this.l, fishing4.a.m.c(), (float)(fishing4.a.m.b() - 100), 124.0F, 90.0F, 90.0F, 24.0F);
            } else {
               fishing4.a.m.a(var1, this.m, fishing4.a.m.c(), (float)(fishing4.a.m.b() - 100), 170.0F, 90.0F, 102.0F, 22.0F);
            }

            if (am.b == 52) {
               var2 = fishing4.a.r.E;
            }

            am.a(var1, e);
            break;
         case 10:
            fishing4.a.m.a(var1, this.n, fishing4.a.m.c(), (float)(fishing4.a.m.b() - 100));
            if (globalConfig.languageId == 0) {
               fishing4.a.m.a(var1, this.l, fishing4.a.m.c(), (float)(fishing4.a.m.b() - 100), 124.0F, 0.0F, 122.0F, 24.0F);
            } else {
               fishing4.a.m.a(var1, this.m, fishing4.a.m.c(), (float)(fishing4.a.m.b() - 100), 171.0F, 0.0F, 168.0F, 22.0F);
            }

            az.c();
            a(var1, fishing4.a.m.d() - 70.0F);
            az.a(var1, fishing4.a.m.d() - 70.0F, e);
            am.a(var1, e);
            break;
         case 11:
            fishing4.a.m.a(var1, this.n, fishing4.a.m.c(), (float)(fishing4.a.m.b() - 100));
            if (globalConfig.languageId == 0) {
               fishing4.a.m.a(var1, this.l, fishing4.a.m.c(), (float)(fishing4.a.m.b() - 100), 124.0F, 31.0F, 122.0F, 24.0F);
            } else {
               fishing4.a.m.a(var1, this.m, fishing4.a.m.c(), (float)(fishing4.a.m.b() - 100), 171.0F, 30.0F, 188.0F, 22.0F);
            }

            am.a(var1, e);
            break;
         case 12:
            fishing4.a.m.a(var1, this.n, fishing4.a.m.c(), (float)(fishing4.a.m.b() - 100));
            if (globalConfig.languageId == 0) {
               fishing4.a.m.a(var1, this.l, fishing4.a.m.c(), (float)(fishing4.a.m.b() - 100), 124.0F, 61.0F, 164.0F, 24.0F);
            } else {
               fishing4.a.m.a(var1, this.m, fishing4.a.m.c(), (float)(fishing4.a.m.b() - 100), 171.0F, 60.0F, 238.0F, 22.0F);
            }

            az.c();
            a(var1, fishing4.a.m.d() - 70.0F);
            az.b(var1, fishing4.a.m.d() - 70.0F, e);
            am.a(var1, e);
      }

      if (aa.c == 13 || aa.c == 9 || aa.c == 11 || aa.c == 12) {
         label234: {
            fishing4.a.r var4;
            switch (aa.c) {
               case 9:
                  if (f == 1) {
                     if (this.v == 0) {
                        fishing4.game.k.a();
                        if (globalConfig.h.encrypt() > 0L) {
                           this.u.a(4);
                        } else {
                           this.u.a(103);
                        }

                        this.v = 1;
                     }

                     this.u.a(var1);
                     if (this.v == 1) {
                        var4 = this.u;
                        if (fishing4.a.r.b()) {
                           if (globalConfig.h.encrypt() > 0L) {
                              globalConfig.i = null;
                              globalConfig.i = new String("코인선물 받기");
                              this.u.b(4);
                           } else {
                              this.u.b(103);
                           }

                           this.v = 2;
                        }
                     } else if (this.v == 2 && this.u.c()) {
                        this.v = 0;
                        f = 2;
                     }

                     var4 = this.u;
                     if (fishing4.a.r.d() != 99) {
                        var4 = this.u;
                        if (fishing4.a.r.d() != 100) {
                           return;
                        }
                     }

                     if (!this.u.c()) {
                        am.a(45);
                        this.v = 0;
                        break;
                     }
                  } else if (f == 2) {
                     if (globalConfig.h.encrypt() > 0L) {
                        globalConfig.h.encryptLong(0L);
                        return;
                     } else if (fishing4.a.r.numGiftsWaiting > 0) {
                        am.a(54);
                        this.v = 0;
                        break;
                     } else if (fishing4.a.r.E != 0) {
                        am.a(52);
                        this.v = 0;
                        break;
                     } else {
                        this.a();
                        return;
                     }
                  }

                  return;
               case 10:
               default:
                  return;
               case 11:
                  if (f != 1) {
                     if (f == 2) {
                        a(var1, fishing4.a.m.d() - 70.0F);
                        b(var1, fishing4.a.m.d() - 70.0F);
                     }

                     return;
                  }

                  if (this.v == 0) {
                     fishing4.game.k.a();
                     this.u.a(1);
                     this.v = 1;
                  }

                  this.u.a(var1);
                  if (this.v == 1) {
                     var4 = this.u;
                     if (fishing4.a.r.b()) {
                        this.u.b(1);
                        this.v = 2;
                     }
                  } else if (this.v == 2 && this.u.c()) {
                     this.v = 0;
                     f = 2;
                  }

                  var4 = this.u;
                  if (fishing4.a.r.d() != 99) {
                     var4 = this.u;
                     if (fishing4.a.r.d() != 100) {
                        return;
                     }
                  }

                  if (this.u.c()) {
                     return;
                  }

                  am.a(45);
                  this.v = 0;
                  break;
               case 12:
                  if (f != 1) {
                     if (f == 2) {
                        f = 0;
                        if (fishing4.a.r.Y == 0) {
                           az.b(10);
                        } else {
                           az.b(20);
                        }

                        return;
                     }

                     return;
                  }

                  if (this.v == 0) {
                     fishing4.game.k.a();
                     this.u.a(2);
                     this.v = 1;
                  }

                  this.u.a(var1);
                  if (this.v == 1) {
                     var4 = this.u;
                     if (fishing4.a.r.b()) {
                        this.u.b(2);
                        this.v = 2;
                     }
                  } else if (this.v == 2 && this.u.c()) {
                     this.v = 0;
                     f = 2;
                  }

                  var4 = this.u;
                  if (fishing4.a.r.d() != 99) {
                     var4 = this.u;
                     if (fishing4.a.r.d() != 100) {
                        return;
                     }
                  }

                  if (this.u.c()) {
                     return;
                  }

                  am.a(45);
                  this.v = 0;
                  break;
               case 13:
                  if (f == 1) {
                     if (this.v == 0) {
                        fishing4.game.k.a();
                        this.u.a(112);
                        this.v = 1;
                     }

                     this.u.a(var1);
                     if (this.v == 1) {
                        var4 = this.u;
                        if (fishing4.a.r.b()) {
                           if (!fishing4.a.r.ah) {
                              this.u.b(112);
                           } else {
                              this.u.b(3);
                           }

                           this.v = 2;
                        }
                     } else if (this.v == 2 && this.u.c()) {
                        this.v = 0;
                        f = 2;
                     }

                     var4 = this.u;
                     if (fishing4.a.r.d() != 99) {
                        var4 = this.u;
                        if (fishing4.a.r.d() != 100) {
                           return;
                        }
                     }

                     if (this.u.c()) {
                        return;
                     }

                     am.a(45);
                     this.v = 0;
                  } else {
                     if (f != 2) {
                        return;
                     }

                     var4 = this.u;
                     if (fishing4.a.r.c(fishing4.a.r.e())) {
                        var2 = 1;
                        break label234;
                     }
                  }
            }

            var2 = 0;
         }

         f = var2;
      }

   }

   public final void a(fishing4.a.e var1) {
      if (f != 1) {
         if (a(var1, true)) {
            Main.openPlayStoreLink();
         } else if (am.e && !am.c.a(var1, false)) {
            am.d.a(var1, false);
         }
      }

   }

   public final void a(GL10 var1, int var2) {
      c = var2;
      switch (var2) {
         case 0:
         case 2:
         case 4:
         case 6:
         case 8:
         case 9:
         default:
            break;
         case 1:
            try {
               this.p = fishing4.a.e.a(fishing4.a.m.c() - (float)fishing4.a.m.a(), fishing4.a.m.d() + 200.0F);
               this.q = fishing4.a.e.a(fishing4.a.m.c() + (float)fishing4.a.m.a(), fishing4.a.m.d() + 100.0F);
               this.r = fishing4.a.e.a(fishing4.a.m.c() - (float)fishing4.a.m.a(), fishing4.a.m.d());
               this.s = fishing4.a.e.a(fishing4.a.m.c() + (float)fishing4.a.m.a(), fishing4.a.m.d() - 100.0F);
               this.t = fishing4.a.e.a(fishing4.a.m.c() - (float)fishing4.a.m.a(), fishing4.a.m.d() - 200.0F);
               fishing4.game.m.a(var1);
               Main.g();
               fishing4.a.r.H = true;
            } catch (Exception var9) {
            }
            break;
         case 3:
            try {
               this.p = fishing4.a.e.a(fishing4.a.m.c() - (float)fishing4.a.m.a(), fishing4.a.m.d() + 50.0F);
               this.q = fishing4.a.e.a(fishing4.a.m.c() + (float)fishing4.a.m.a(), fishing4.a.m.d() - 50.0F);
            } catch (Exception var8) {
            }
            break;
         case 5:
            try {
               this.p = fishing4.a.e.a(fishing4.a.m.c() - (float)fishing4.a.m.a(), fishing4.a.m.d() + 100.0F);
               this.q = fishing4.a.e.a(fishing4.a.m.c() + (float)fishing4.a.m.a(), fishing4.a.m.d());
               this.r = fishing4.a.e.a(fishing4.a.m.c() - (float)fishing4.a.m.a(), fishing4.a.m.d() - 100.0F);
            } catch (Exception var7) {
            }
            break;
         case 7:
            try {
               y = 0;
               z = 0;
            } catch (Exception var6) {
            }
            break;
         case 10:
            try {
               az.h = -1;
               az.p = 0;
               az.k = 0;
               az.j = 0;
               az.i = 0;
               az.H = -1;
               az.q = -1;
               az.o = -1;
               az.n = -1;
               az.m = -1;
               az.l = -1;
            } catch (Exception var5) {
            }
            break;
         case 11:
            try {
               az.h = -1;
               az.p = 0;
               az.k = 0;
               az.j = 0;
               az.i = 0;
               az.H = -1;
               az.q = -1;
               az.o = -1;
               az.n = -1;
               az.m = -1;
               az.l = -1;
            } catch (Exception var4) {
            }
            break;
         case 12:
            try {
               az.h = -1;
               az.p = 0;
               az.k = 0;
               az.j = 0;
               az.i = 0;
               az.H = -1;
               az.q = -1;
               az.o = -1;
               az.n = -1;
               az.m = -1;
               az.l = -1;
            } catch (Exception var3) {
            }
      }

   }

   public final void b(int var1) {
   }

   public final void b(fishing4.a.e var1) {
      if (f != 1) {
         if (aa.c == 10) {
            az.g(var1);
         } else if (aa.c == 12) {
            az.h(var1);
         } else if (aa.c == 7) {
            az.d(var1);
         }
      }

   }

   public final void b(GL10 var1) {
      if (globalConfig.j) {
         fishing4.game.k.j();
      }

      this.a(var1, 0);
   }

   public final void c(int var1) {
      if (f != 1 && var1 == 4) {
         switch (aa.c) {
            case 0:
               if (am.e) {
                  am.b();
               } else {
                  am.a(99);
               }
            case 1:
            case 3:
            case 5:
            default:
               break;
            case 2:
               if (am.e) {
                  am.b();
               } else {
                  aa.d = 0;
               }
               break;
            case 4:
               if (am.e) {
                  am.b();
               } else {
                  aa.d = 1;
               }
               break;
            case 6:
               aa.d = 1;
               break;
            case 7:
            case 8:
               am.b();
               aa.d = 1;
               break;
            case 9:
               if (f != 1) {
                  if (am.e) {
                     am.b();
                     aa.d = 1;
                  } else if (f == 2) {
                     aa.d = 1;
                  }
               }
               break;
            case 10:
               if (am.e) {
                  am.b();
               } else if ((az.j < 10 || az.j > 12) && (az.j < 20 || az.j > 22)) {
                  aa.d = 5;
               } else {
                  az.b(0);
                  az.c(0);
                  az.d(0);
               }
               break;
            case 11:
               if (f != 1) {
                  if (am.e) {
                     am.b();
                     aa.d = 5;
                  } else if (f == 2) {
                     f = 0;
                     aa.d = 5;
                  }
               }
               break;
            case 12:
               if (am.e) {
                  am.b();
               } else if ((az.j < 10 || az.j > 12) && (az.j < 20 || az.j > 22)) {
                  if (f != 1) {
                     f = 0;
                     aa.d = 5;
                  }
               } else {
                  az.b(0);
                  az.c(0);
                  az.d(0);
               }
         }
      }

   }

   public final void c(fishing4.a.e var1) {
      if (f != 1) {
         if (fishing4.game.z.d) {
            fishing4.game.z.d = false;
         } else if (!fishing4.a.t.a(var1.a, (float)fishing4.a.m.b() - var1.b)) {
            if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 170.0F, fishing4.a.m.d() - 330.0F), fishing4.a.h.a(60.0F, 60.0F), fishing4.a.e.a(var1.a, var1.b))) {
               Message var3 = Message.obtain(Main.b, 1, "");
               Main.b.sendMessage(var3);
               Main.w = true;
            }

            if (!a(var1, false)) {
               if (c == 13) {
                  if (am.e()) {
                     aa.d = 1;
                  } else if (am.b == 200) {
                     if (am.c.a(var1, true)) {
                        fishing4.a.r.g = "Q02D10132216";
                        fishing4.a.r.g();
                     } else if (am.d.a(var1, true)) {
                        am.b();
                        aa.d = 0;
                     }
                  } else if (am.a == 0) {
                     am.b();
                     aa.d = 0;
                  }
               } else if (c == 0) {
                  if (am.e()) {
                     aa.d = 1;
                  } else if (am.a == 0) {
                     if (am.c.a(var1, true)) {
                        am.b();
                     }
                  } else if (am.c.a(var1, true)) {
                     az.f();
                  } else if (am.d.a(var1, true)) {
                     am.b();
                  }
               } else if (aa.c == 2) {
                  if (am.e()) {
                     if (fishing4.a.f.a(this.p, this.n.c, var1)) {
                        aa.d = 3;
                     } else if (fishing4.a.f.a(this.q, this.n.c, var1)) {
                        aa.d = 5;
                     } else if (fishing4.a.f.a(this.r, this.n.c, var1)) {
                        aa.d = 7;
                     } else if (fishing4.a.f.a(this.s, this.n.c, var1)) {
                        aa.d = 8;
                     } else if (fishing4.a.f.a(this.t, this.n.c, var1)) {
                        if (fishing4.game.k.e()) {
                           fishing4.a.r.M.encryptLong(0L);
                           globalConfig.h.encryptLong(0L);
                           aa.d = 9;
                           am.b();
                           fishing4.a.r.E = 0;
                           if (globalConfig.languageId == 0) {
                              fishing4.a.r.F = 0;
                           } else {
                              fishing4.a.r.F = 1;
                           }

                           f = 1;
                        } else {
                           am.a(53);
                        }
                     }
                  } else if (am.a == 0 && am.c.a(var1, true)) {
                     am.b();
                  }
               } else if (aa.c == 4) {
                  if (am.e) {
                     if (am.c.a(var1, true)) {
                        if (am.b == 91) {
                           fishing4.game.x.b();
                           fishing4.game.z.a(3);
                        } else if (am.b == 90) {
                           fishing4.game.z.a(3);
                        }

                        am.b();
                     } else if (am.d.a(var1, true)) {
                        am.b();
                     }
                  } else if (fishing4.a.f.a(this.p, this.n.c, var1)) {
                     if (fishing4.a.y.b("f4save.data")) {
                        fishing4.game.z.a(3);
                     } else {
                        am.a(90);
                     }
                  } else if (fishing4.a.f.a(this.q, this.n.c, var1)) {
                     if (fishing4.a.y.b("f4save.data")) {
                        am.a(91);
                     } else {
                        am.b();
                        fishing4.game.z.a(3);
                     }
                  }
               } else if (aa.c == 6) {
                  if (fishing4.a.f.a(this.p, this.n.c, var1)) {
                     aa.d = 10;
                     az.b();
                     az.b(0);
                     az.c(0);
                     az.d(0);
                  } else if (fishing4.a.f.a(this.q, this.n.c, var1)) {
                     aa.d = 11;
                     fishing4.a.r.Q = fishing4.game.x.c();
                     fishing4.a.r.R = (byte)fishing4.game.x.a(false);
                     f = 1;
                  } else if (fishing4.a.f.a(this.r, this.n.c, var1)) {
                     aa.d = 12;
                     az.b();
                     az.b(0);
                     az.c(0);
                     az.d(0);
                  }
               } else if (aa.c == 7) {
                  az.a(fishing4.a.m.d(), var1);
               } else if (aa.c == 8) {
                  az.b(fishing4.a.m.d(), var1);
               } else if (aa.c == 9) {
                  if (am.e) {
                     if (am.b == 51) {
                        if (am.c.a(var1, true)) {
                           am.b();
                           fishing4.a.r.E = 0;
                           fishing4.a.r.F = 0;
                           f = 1;
                        } else if (am.d.a(var1, true)) {
                           am.b();
                           aa.d = 1;
                        }
                     } else if (am.b == 54) {
                        if (am.c.a(var1, true)) {
                           am.b();
                           if (fishing4.a.r.M.encrypt() > 0L) {
                              fishing4.a.r.numGiftsWaiting = 0;
                              if (ad.p.b() + fishing4.a.r.M.encrypt() > 99999L) {
                                 globalConfig.h.encryptLong(99999L);
                              } else {
                                 globalConfig.h.encryptLong(fishing4.a.r.M.encrypt());
                              }

                              fishing4.a.r.M.encryptLong(0L);
                              f = 1;
                           } else {
                              fishing4.a.r.E = 1;
                              fishing4.a.r.F = 0;
                              f = 1;
                           }
                        }
                     } else if (am.b == 52) {
                        if (am.c.a(var1, true)) {
                           am.b();
                           if (fishing4.a.r.E == 0) {
                              this.a();
                           } else {
                              aa.d = 1;
                           }
                        }
                     } else if (am.b == 45 && am.c.a(var1, true)) {
                        am.b();
                        aa.d = 1;
                     }
                  }
               } else {
                  float var2;
                  if (aa.c == 10) {
                     var2 = fishing4.a.m.d();
                     if (am.e) {
                        if (am.b == 121) {
                           az.e(var1);
                        } else if (am.b == 123) {
                           az.f(var1);
                        } else if (am.c.a(var1, true)) {
                           am.b();
                        }
                     } else {
                        az.c(var2 - 70.0F, var1);
                     }
                  } else if (aa.c == 11) {
                     if (am.e && f != 1) {
                        if (am.c.a(var1, true)) {
                           am.b();
                           if (am.b == 55) {
                              fishing4.a.r.Q = fishing4.game.x.c();
                              fishing4.a.r.R = (byte)fishing4.game.x.a(false);
                              f = 1;
                           } else if (am.b == 56) {
                              am.b();
                              aa.d = 5;
                           } else if (am.b == 45) {
                              aa.d = 5;
                           }
                        } else if (am.d.a(var1, true)) {
                           am.b();
                           aa.d = 5;
                        }
                     }
                  } else if (aa.c == 12) {
                     var2 = fishing4.a.m.d() - 70.0F;
                     if (am.e) {
                        if (am.b == 60) {
                           if (am.c.a(var1, true)) {
                              am.b();
                              fishing4.a.r.R = (byte)fishing4.game.x.a(false);
                              f = 1;
                           } else if (am.d.a(var1, true)) {
                              am.b();
                           }
                        } else if (am.b == 45) {
                           if (am.c.a(var1, true)) {
                              am.b();
                           }
                        } else if (am.b == 62) {
                           az.i(var1);
                        } else if (am.b == 64) {
                           az.i(var1);
                        } else if (am.c.a(var1, true)) {
                           am.b();
                        }
                     } else if (az.j == 0) {
                        if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), 150.0F + var2), fishing4.a.h.a(180.0F, 110.0F), var1)) {
                           fishing4.a.r.Y = 0;
                           am.b();
                           fishing4.a.r.R = (byte)fishing4.game.x.a(false);
                           f = 1;
                        } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), var2 - 50.0F), fishing4.a.h.a(180.0F, 120.0F), var1)) {
                           fishing4.a.r.Y = 1;
                           am.b();
                           fishing4.a.r.R = (byte)fishing4.game.x.a(false);
                           f = 1;
                        }
                     } else {
                        az.d(var2, var1);
                     }
                  }
               }
            }
         }
      }

   }

   public final void c(GL10 var1) {
      e = 0;
      this.g = fishing4.a.w.a(var1, "img/title/title_back.png");
      this.h = fishing4.a.w.a(var1, "img/title/title_fish.png");
      this.i = fishing4.a.w.a(var1, "img/title/title_light.png");
      this.j = fishing4.a.w.a(var1, "img/title/title_logo.png");
      this.k = fishing4.a.w.a(var1, "img/title/title_logoen.png");
      this.l = fishing4.a.w.a(var1, "img/title/text1.png");
      this.m = fishing4.a.w.a(var1, "img/title/text2.png");
      this.n = fishing4.a.w.a(var1, "img/title/bar.png");
      if (globalConfig.languageId == 0) {
         this.o = fishing4.a.w.a(var1, "img/title/plusdown_bigfish.png");
      } else {
         this.o = fishing4.a.w.a(var1, "img/title/plusdown_bigfishen.png");
      }

      fishing4.b.d.a().a(fishing4.a.s.a());
      this.v = 0;
      f = 0;
      fishing4.a.r.af = false;
   }

   public final void d(GL10 var1) {
      fishing4.a.w.a(var1, this.g);
      this.g = null;
      fishing4.a.w.a(var1, this.h);
      this.h = null;
      fishing4.a.w.a(var1, this.i);
      this.i = null;
      fishing4.a.w.a(var1, this.j);
      this.j = null;
      fishing4.a.w.a(var1, this.k);
      this.k = null;
      fishing4.a.w.a(var1, this.l);
      this.l = null;
      fishing4.a.w.a(var1, this.m);
      this.m = null;
      fishing4.a.w.a(var1, this.n);
      this.n = null;
      fishing4.a.w.a(var1, this.o);
      this.o = null;
      fishing4.b.d.a().e();
   }

   public final void e(GL10 var1) {
      var1.glLoadIdentity();
      var1.glTranslatef(0.0F, 0.0F, 0.0F);
      if (c == 0) {
         int var2 = e % 40;
         if (e == 0) {
            fishing4.b.d.a().c(fishing4.a.s.a(), 2131034129);
         }

         this.g(var1);
         if (globalConfig.languageId == 0) {
            switch (var2) {
               case 0:
                  fishing4.a.m.a(var1, this.j, fishing4.a.m.c() - 30.0F, fishing4.a.m.d(), 0.0F, 118.0F, 400.0F, 116.0F);
                  break;
               case 1:
                  fishing4.a.m.a(var1, this.j, fishing4.a.m.c() - 30.0F, fishing4.a.m.d(), 0.0F, 236.0F, 400.0F, 116.0F);
                  break;
               case 2:
                  fishing4.a.m.a(var1, this.j, fishing4.a.m.c() - 30.0F, fishing4.a.m.d(), 0.0F, 354.0F, 400.0F, 116.0F);
                  break;
               default:
                  fishing4.a.m.a(var1, this.j, fishing4.a.m.c() - 30.0F, fishing4.a.m.d(), 0.0F, 0.0F, 400.0F, 116.0F);
            }
         } else {
            fishing4.a.m.a(var1, this.k, fishing4.a.m.c(), fishing4.a.m.d(), 0.0F, 0.0F, 462.0F, 115.0F);
         }

         if (var2 < 20) {
            fishing4.a.m.a(var1, this.j, fishing4.a.m.c(), fishing4.a.m.d() - 200.0F, 0.0F, 472.0F, 380.0F, 40.0F, e % 20 * 12);
         } else {
            fishing4.a.m.a(var1, this.j, fishing4.a.m.c(), fishing4.a.m.d() - 200.0F, 0.0F, 472.0F, 380.0F, 40.0F, 240 - e % 20 * 12);
         }

         am.a(var1, e);
      } else if (c == 13) {
         this.g(var1);
         this.h(var1);
         am.a(var1, e);
      } else {
         this.g(var1);
         this.h(var1);
      }

      fishing4.a.t.a(var1);
      fishing4.a.t.c(var1);
   }

   public final void f(GL10 var1) {
      this.a(var1);
   }
}

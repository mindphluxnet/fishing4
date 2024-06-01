package fishing4.game;

import android.content.Context;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import javax.microedition.khronos.opengles.GL10;

import fishing4.a.AESUtils;

public final class bg {
   public static int a;
   public static int b;
   public static final fishing4.a.f c = fishing4.a.f.a(701.0F, 587.0F, 78.0F, 78.0F);
   public static int d;
   private static int k;
   private static int l;
   private static int m;
   private static int n;
   private static fishing4.a.r v = new fishing4.a.r();
   private static int w;
   private fishing4.a.e[] e;
   private fishing4.a.e[] f;
   private fishing4.a.e[] g;
   private final fishing4.a.f h;
   private final fishing4.a.f i;
   private int j;
   private int o;
   private int p;
   private int q;
   private AESUtils r;
   private fishing4.a.ad s;
   private fishing4.a.ad t;
   private fishing4.a.ad u;

   private bg(int var1) {
      byte var2 = 3;
      super();
      this.h = fishing4.a.f.a(268.0F, 588.0F, 126.0F, 108.0F);
      this.i = fishing4.a.f.a(892.0F, 842.0F, 132.0F, 88.0F);
      this.r = AESUtils.a();
      a = 10;
      k = -1;
      l = 0;
      m = 0;
      n = 0;
      this.r.encryptLong(1L);
      this.o = -1;
      this.p = -1;
      this.q = -1;
      this.j = var1;
      this.s = fishing4.a.ad.a(0);
      this.t = fishing4.a.ad.a(4);
      this.u = fishing4.a.ad.a(5);
      w = 0;
      d = 0;
      byte var3 = var2;
      switch (this.j) {
         case 0:
            var3 = 2;
         case 1:
         case 3:
            break;
         case 2:
            var3 = 4;
            break;
         case 4:
         case 5:
            var3 = 2;
            break;
         default:
            var3 = 0;
      }

      this.k(var3);
   }

   public static ac a() {
      return (ac)ad.i.get(m);
   }

   public static bg a(int var0) {
      return new bg(var0);
   }

   public static void a(int var0, int var1) {
      if (fishing4.game.r.f()) {
         --fishing4.game.r.b;
      }

      if (var0 != 10) {
         x.a = var0;
      }

      c(var1);
      aw.f = var0;
      ad.g = var1;
      fishing4.b.d.a().e();
      z.a(4);
      am.c();
   }

   // $FF: synthetic method
   static void a(bg var0) {
      var0.g();
   }

   // $FF: synthetic method
   static void a(bg var0, int var1) {
      var0.o(var1);
   }

   protected static void a(GL10 var0) {
      fishing4.a.r var2;
      if (fishing4.a.r.j) {
         if (d == 1) {
            if (w == 0) {
               v.a(4);
               w = 1;
            }

            v.a(var0);
            if (w == 1) {
               var2 = v;
               if (fishing4.a.r.b()) {
                  switch (aq.b) {
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
                        globalConfig.h.encryptLong((long)(aq.b() * -1));
                  }

                  globalConfig.i = null;
                  if (b == 21) {
                     String var3 = new String("낚싯대 수리");
                     globalConfig.i = var3;
                     var3.concat(" (" + ((ac)ad.i.get(m)).u() + ")");
                  } else {
                     globalConfig.i = new String("슈퍼보트 개조");
                     if (b == 72) {
                        globalConfig.i.concat(" (선적)");
                     } else if (b == 72) {
                        globalConfig.i.concat(" (적재)");
                     }
                  }

                  v.b(4);
                  if (!fishing4.a.r.j) {
                     d = 1;
                     w = 0;
                     return;
                  }

                  w = 2;
               }
            } else if (w == 2 && v.c()) {
               w = 0;
               d = 2;
            }

            var2 = v;
            if (fishing4.a.r.d() != 99) {
               var2 = v;
               if (fishing4.a.r.d() != 100) {
                  return;
               }
            }

            if (!v.c()) {
               am.a(45);
               w = 0;
               d = 0;
            }
         } else if (d == 2) {
            var2 = v;
            if (fishing4.a.r.f() == 99) {
               am.a(46);
               w = 0;
               d = 0;
            } else {
               var2 = v;
               byte var1;
               if (fishing4.a.r.c(fishing4.a.r.e())) {
                  var1 = 1;
               } else {
                  var1 = 0;
               }

               d = var1;
            }
         }
      } else if (d == 1) {
         if (w == 0) {
            if (am.b == 217) {
               v.a(7);
            } else {
               v.a(3);
            }

            w = 1;
         }

         if (am.b != 217) {
            v.a(var0);
         }

         if (w == 1) {
            var2 = v;
            if (fishing4.a.r.b()) {
               if (am.b == 217) {
                  v.b(7);
               } else {
                  v.b(3);
               }

               w = 2;
            }
         } else if (w == 2 && v.c()) {
            w = 0;
            d = 2;
         }

         var2 = v;
         if (fishing4.a.r.d() != 99) {
            var2 = v;
            if (fishing4.a.r.d() != 100) {
               return;
            }
         }

         if (!v.c()) {
            am.a(45);
            w = 0;
            d = 0;
         }
      } else if (d == 2) {
         var2 = v;
         if (fishing4.a.r.f() == 99) {
            am.a(46);
            w = 0;
            d = 0;
         } else {
            var2 = v;
            fishing4.a.r.c(fishing4.a.r.e());
            d = 0;
         }
      }

   }

   private void a(GL10 var1, fishing4.a.w var2) {
      fishing4.a.e var5 = fishing4.a.e.a(186.0F, 570.0F);
      int var3;
      int var4;
      if (this.j == 4) {
         var3 = x.c(true);
         if (var3 == 7) {
            ++var3;
         } else if (var3 == 8) {
            var3 += 2;
         }

         for(var4 = 0; var4 < var3; ++var4) {
            if (fishing4.game.r.a == fishing4.game.r.b(0, var4)) {
               if (fishing4.game.r.b > 0) {
                  fishing4.a.m.a(var1, var2, var5.a, var5.b - (float)(var4 * 54), 0.0F, 527.0F, 332.0F, 46.0F);
                  if (fishing4.game.r.b((var4 + 1 - 1) * 2 + 1).length() >= 17) {
                     fishing4.a.ae.a(var1, fishing4.game.r.b((var4 + 1 - 1) * 2 + 1).substring(0, 17) + "...", var5.a, var5.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
                  } else {
                     fishing4.a.ae.a(var1, fishing4.game.r.b((var4 + 1 - 1) * 2 + 1), var5.a, var5.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
                  }

                  fishing4.a.m.a(var1, var2, var5.a - 166.0F + 20.0F, var5.b - (float)(var4 * 54) + 12.0F, 145.0F, 726.0F, 52.0F, 36.0F);
               } else {
                  fishing4.a.m.a(var1, var2, var5.a, var5.b - (float)(var4 * 54), 334.0F, 527.0F, 332.0F, 46.0F, (int)140);
                  if (fishing4.game.r.b((var4 + 1 - 1) * 2 + 1).length() >= 17) {
                     fishing4.a.ae.a(var1, fishing4.game.r.b((var4 + 1 - 1) * 2 + 1).substring(0, 17) + "...", var5.a, var5.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
                  } else {
                     fishing4.a.ae.a(var1, fishing4.game.r.b((var4 + 1 - 1) * 2 + 1), var5.a, var5.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
                  }

                  fishing4.a.m.a(var1, var2, var5.a - 166.0F + 20.0F, var5.b - (float)(var4 * 54) + 12.0F, 208.0F, 677.0F, 56.0F, 36.0F);
               }
            } else {
               fishing4.a.m.a(var1, var2, var5.a, var5.b - (float)(var4 * 54), 0.0F, 527.0F, 332.0F, 46.0F);
               if (fishing4.game.r.b((var4 + 1 - 1) * 2 + 1).length() >= 17) {
                  fishing4.a.ae.a(var1, fishing4.game.r.b((var4 + 1 - 1) * 2 + 1).substring(0, 17) + "...", var5.a, var5.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
               } else {
                  fishing4.a.ae.a(var1, fishing4.game.r.b((var4 + 1 - 1) * 2 + 1), var5.a, var5.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
               }

               fishing4.a.m.a(var1, var2, var5.a - 166.0F + 20.0F, var5.b - (float)(var4 * 54) + 12.0F, 80.0F, 726.0F, 62.0F, 42.0F);
            }
         }
      } else if (this.j == 5) {
         var3 = x.k();
         if (var3 == 7) {
            ++var3;
         } else if (var3 == 8) {
            var3 += 2;
         }

         for(var4 = 0; var4 < var3; ++var4) {
            if (fishing4.game.r.a == fishing4.game.r.b(1, var4)) {
               if (fishing4.game.r.b > 0) {
                  fishing4.a.m.a(var1, var2, var5.a, var5.b - (float)(var4 * 54), 0.0F, 527.0F, 332.0F, 46.0F);
                  if (fishing4.game.r.b((var4 + 1 - 1) * 2 + 1 + 1).length() >= 17) {
                     fishing4.a.ae.a(var1, fishing4.game.r.b((var4 + 1 - 1) * 2 + 1 + 1).substring(0, 17) + "...", var5.a, var5.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
                  } else {
                     fishing4.a.ae.a(var1, fishing4.game.r.b((var4 + 1 - 1) * 2 + 1 + 1), var5.a, var5.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
                  }

                  fishing4.a.m.a(var1, var2, var5.a - 166.0F + 20.0F, var5.b - (float)(var4 * 54) + 12.0F, 145.0F, 726.0F, 52.0F, 36.0F);
               } else {
                  fishing4.a.m.a(var1, var2, var5.a, var5.b - (float)(var4 * 54), 334.0F, 527.0F, 332.0F, 46.0F, (int)140);
                  if (fishing4.game.r.b((var4 + 1 - 1) * 2 + 1 + 1).length() >= 17) {
                     fishing4.a.ae.a(var1, fishing4.game.r.b((var4 + 1 - 1) * 2 + 1 + 1).substring(0, 17) + "...", var5.a, var5.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
                  } else {
                     fishing4.a.ae.a(var1, fishing4.game.r.b((var4 + 1 - 1) * 2 + 1 + 1), var5.a, var5.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
                  }

                  fishing4.a.m.a(var1, var2, var5.a - 166.0F + 20.0F, var5.b - (float)(var4 * 54) + 12.0F, 208.0F, 677.0F, 56.0F, 36.0F);
               }
            } else {
               fishing4.a.m.a(var1, var2, var5.a, var5.b - (float)(var4 * 54), 0.0F, 527.0F, 332.0F, 46.0F);
               if (fishing4.game.r.b((var4 + 1 - 1) * 2 + 1 + 1).length() >= 17) {
                  fishing4.a.ae.a(var1, fishing4.game.r.b((var4 + 1 - 1) * 2 + 1 + 1).substring(0, 17) + "...", var5.a, var5.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
               } else {
                  fishing4.a.ae.a(var1, fishing4.game.r.b((var4 + 1 - 1) * 2 + 1 + 1), var5.a, var5.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
               }

               fishing4.a.m.a(var1, var2, var5.a - 166.0F + 20.0F, var5.b - (float)(var4 * 54) + 12.0F, 80.0F, 726.0F, 62.0F, 42.0F);
            }
         }
      }

   }

   private void a(GL10 var1, fishing4.a.w var2, int var3) {
      fishing4.a.e var7 = fishing4.a.e.a(186.0F, 570.0F);
      int var4;
      int var5;
      int var6;
      if (this.j == 4) {
         var4 = 0;
         var5 = 0;

         while(true) {
            if (var5 >= fishing4.game.w.b.size()) {
               for(var6 = 0; var6 < fishing4.game.w.c.size(); var4 = var5) {
                  var5 = var4;
                  if (l - fishing4.game.w.b.size() <= var6) {
                     fishing4.a.m.a(var1, var2, var7.a, var7.b - (float)(var4 * 54), 0.0F, 527.0F, 332.0F, 46.0F);
                     if (fishing4.game.w.a((Integer)fishing4.game.w.c.get(var6)).length() >= 17) {
                        fishing4.a.ae.a(var1, fishing4.game.w.a((Integer)fishing4.game.w.c.get(var6)).substring(0, 17) + "...", var7.a, var7.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
                     } else {
                        fishing4.a.ae.a(var1, fishing4.game.w.a((Integer)fishing4.game.w.c.get(var6)), var7.a, var7.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
                     }

                     fishing4.a.m.a(var1, var2, var7.a - 166.0F + 20.0F, var7.b - (float)(var4 * 54) + 12.0F, 145.0F, 726.0F, 52.0F, 36.0F);
                     ++var4;
                     var5 = var4;
                     if (var4 >= 10) {
                        if (l == 0) {
                           fishing4.game.k.a(var1, fishing4.a.e.a(var7.a, var7.b - 243.0F), 297.0F, var3, 3);
                           return;
                        } else {
                           if (l == fishing4.game.w.b.size() + fishing4.game.w.c.size() + fishing4.game.w.d.size() - 10) {
                              fishing4.game.k.a(var1, fishing4.a.e.a(var7.a, var7.b - 243.0F), 297.0F, var3, 2);
                           } else {
                              fishing4.game.k.b(var1, fishing4.a.e.a(var7.a, var7.b - 243.0F), 297.0F, var3);
                           }

                           return;
                        }
                     }
                  }

                  ++var6;
               }

               for(var5 = 0; var5 < fishing4.game.w.d.size(); ++var5) {
                  if (l - fishing4.game.w.b.size() - fishing4.game.w.c.size() <= var5) {
                     fishing4.a.m.a(var1, var2, var7.a, var7.b - (float)(var4 * 54), 334.0F, 527.0F, 332.0F, 46.0F, (int)140);
                     if (fishing4.game.w.a((Integer)fishing4.game.w.d.get(var5)).length() >= 17) {
                        fishing4.a.ae.a(var1, fishing4.game.w.a((Integer)fishing4.game.w.d.get(var5)).substring(0, 17) + "...", var7.a, var7.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
                     } else {
                        fishing4.a.ae.a(var1, fishing4.game.w.a((Integer)fishing4.game.w.d.get(var5)), var7.a, var7.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
                     }

                     fishing4.a.m.a(var1, var2, var7.a - 166.0F + 20.0F, var7.b - (float)(var4 * 54) + 12.0F, 208.0F, 677.0F, 56.0F, 36.0F);
                     var6 = var4 + 1;
                     var4 = var6;
                     if (var6 >= 10) {
                        if (l == 0) {
                           fishing4.game.k.a(var1, fishing4.a.e.a(var7.a, var7.b - 243.0F), 297.0F, var3, 3);
                           return;
                        } else {
                           if (l == fishing4.game.w.b.size() + fishing4.game.w.c.size() + fishing4.game.w.d.size() - 10) {
                              fishing4.game.k.a(var1, fishing4.a.e.a(var7.a, var7.b - 243.0F), 297.0F, var3, 2);
                           } else {
                              fishing4.game.k.b(var1, fishing4.a.e.a(var7.a, var7.b - 243.0F), 297.0F, var3);
                           }

                           return;
                        }
                     }
                  }
               }

               return;
            }

            if (l <= var5) {
               fishing4.a.m.a(var1, var2, var7.a, var7.b - (float)(var4 * 54), 0.0F, 527.0F, 332.0F, 46.0F);
               if (fishing4.game.w.a((Integer)fishing4.game.w.b.get(var5)).length() >= 17) {
                  fishing4.a.ae.a(var1, fishing4.game.w.a((Integer)fishing4.game.w.b.get(var5)).substring(0, 17) + "...", var7.a, var7.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
               } else {
                  fishing4.a.ae.a(var1, fishing4.game.w.a((Integer)fishing4.game.w.b.get(var5)), var7.a, var7.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
               }

               fishing4.a.m.a(var1, var2, var7.a - 166.0F + 20.0F, var7.b - (float)(var4 * 54) + 12.0F, 80.0F, 726.0F, 62.0F, 42.0F);
               var6 = var4 + 1;
               var4 = var6;
               if (var6 >= 10) {
                  if (l == 0) {
                     fishing4.game.k.a(var1, fishing4.a.e.a(var7.a, var7.b - 243.0F), 297.0F, var3, 3);
                  } else if (l == fishing4.game.w.b.size() + fishing4.game.w.c.size() + fishing4.game.w.d.size() - 10) {
                     fishing4.game.k.a(var1, fishing4.a.e.a(var7.a, var7.b - 243.0F), 297.0F, var3, 2);
                  } else {
                     fishing4.game.k.b(var1, fishing4.a.e.a(var7.a, var7.b - 243.0F), 297.0F, var3);
                  }
                  break;
               }
            }

            ++var5;
         }
      } else if (this.j == 5) {
         var4 = 0;
         var5 = 0;

         while(true) {
            if (var5 >= fishing4.game.v.b.size()) {
               for(var5 = 0; var5 < fishing4.game.v.c.size(); var4 = var6) {
                  var6 = var4;
                  if (l - fishing4.game.v.b.size() <= var5) {
                     fishing4.a.m.a(var1, var2, var7.a, var7.b - (float)(var4 * 54), 0.0F, 527.0F, 332.0F, 46.0F);
                     if (fishing4.game.v.a((Integer)fishing4.game.v.c.get(var5)).length() >= 17) {
                        fishing4.a.ae.a(var1, fishing4.game.v.a((Integer)fishing4.game.v.c.get(var5)).substring(0, 17) + "...", var7.a, var7.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
                     } else {
                        fishing4.a.ae.a(var1, fishing4.game.v.a((Integer)fishing4.game.v.c.get(var5)), var7.a, var7.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
                     }

                     fishing4.a.m.a(var1, var2, var7.a - 166.0F + 20.0F, var7.b - (float)(var4 * 54) + 12.0F, 145.0F, 726.0F, 52.0F, 36.0F);
                     ++var4;
                     var6 = var4;
                     if (var4 >= 10) {
                        if (l == 0) {
                           fishing4.game.k.a(var1, fishing4.a.e.a(var7.a, var7.b - 243.0F), 297.0F, var3, 3);
                           return;
                        } else {
                           if (l == fishing4.game.v.b.size() + fishing4.game.v.c.size() + fishing4.game.v.d.size() - 10) {
                              fishing4.game.k.a(var1, fishing4.a.e.a(var7.a, var7.b - 243.0F), 297.0F, var3, 2);
                           } else {
                              fishing4.game.k.b(var1, fishing4.a.e.a(var7.a, var7.b - 243.0F), 297.0F, var3);
                           }

                           return;
                        }
                     }
                  }

                  ++var5;
               }

               for(var5 = 0; var5 < fishing4.game.v.d.size(); ++var5) {
                  if (l - fishing4.game.v.b.size() - fishing4.game.v.c.size() <= var5) {
                     fishing4.a.m.a(var1, var2, var7.a, var7.b - (float)(var4 * 54), 334.0F, 527.0F, 332.0F, 46.0F, (int)140);
                     if (fishing4.game.v.a((Integer)fishing4.game.v.d.get(var5)).length() >= 17) {
                        fishing4.a.ae.a(var1, fishing4.game.v.a((Integer)fishing4.game.v.d.get(var5)).substring(0, 17) + "...", var7.a, var7.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
                     } else {
                        fishing4.a.ae.a(var1, fishing4.game.v.a((Integer)fishing4.game.v.d.get(var5)), var7.a, var7.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
                     }

                     fishing4.a.m.a(var1, var2, var7.a - 166.0F + 20.0F, var7.b - (float)(var4 * 54) + 12.0F, 208.0F, 677.0F, 56.0F, 36.0F);
                     var6 = var4 + 1;
                     var4 = var6;
                     if (var6 >= 10) {
                        if (l == 0) {
                           fishing4.game.k.a(var1, fishing4.a.e.a(var7.a, var7.b - 243.0F), 297.0F, var3, 3);
                           return;
                        } else {
                           if (l == fishing4.game.v.b.size() + fishing4.game.v.c.size() + fishing4.game.v.d.size() - 10) {
                              fishing4.game.k.a(var1, fishing4.a.e.a(var7.a, var7.b - 243.0F), 297.0F, var3, 2);
                           } else {
                              fishing4.game.k.b(var1, fishing4.a.e.a(var7.a, var7.b - 243.0F), 297.0F, var3);
                           }

                           return;
                        }
                     }
                  }
               }

               return;
            }

            if (l <= var5) {
               fishing4.a.m.a(var1, var2, var7.a, var7.b - (float)(var4 * 54), 0.0F, 527.0F, 332.0F, 46.0F);
               if (fishing4.game.v.a((Integer)fishing4.game.v.b.get(var5)).length() >= 17) {
                  fishing4.a.ae.a(var1, fishing4.game.v.a((Integer)fishing4.game.v.b.get(var5)).substring(0, 17) + "...", var7.a, var7.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
               } else {
                  fishing4.a.ae.a(var1, fishing4.game.v.a((Integer)fishing4.game.v.b.get(var5)), var7.a, var7.b - (float)(var4 * 54), 300.0F, 54.0F, 26.0F, 4);
               }

               fishing4.a.m.a(var1, var2, var7.a - 166.0F + 20.0F, var7.b - (float)(var4 * 54) + 12.0F, 80.0F, 726.0F, 62.0F, 42.0F);
               var6 = var4 + 1;
               var4 = var6;
               if (var6 >= 10) {
                  if (l == 0) {
                     fishing4.game.k.a(var1, fishing4.a.e.a(var7.a, var7.b - 243.0F), 297.0F, var3, 3);
                  } else if (l == fishing4.game.v.b.size() + fishing4.game.v.c.size() + fishing4.game.v.d.size() - 10) {
                     fishing4.game.k.a(var1, fishing4.a.e.a(var7.a, var7.b - 243.0F), 297.0F, var3, 2);
                  } else {
                     fishing4.game.k.b(var1, fishing4.a.e.a(var7.a, var7.b - 243.0F), 297.0F, var3);
                  }
                  break;
               }
            }

            ++var5;
         }
      }

   }

   private void a(GL10 var1, fishing4.a.w var2, fishing4.a.w var3, fishing4.a.w var4, fishing4.a.w var5, fishing4.a.w var6, int var7) {
      fishing4.a.m.a(var1, var2, fishing4.a.m.c(), this.f[0].b - 184.0F, 0.0F, 0.0F, 482.0F, 368.0F);

      float var8;
      float var9;
      for(int var10 = 0; var10 < 8; ++var10) {
         int var12 = bb.e / 4;
         var8 = fishing4.a.m.c();
         var9 = (float)(fishing4.a.m.b() - 126) - 10.0F;
         fishing4.a.e var13;
         switch (var10) {
            case 0:
               var13 = fishing4.a.e.a(var8 + 140.0F, var9 - 128.0F);
               break;
            case 1:
               var13 = fishing4.a.e.a(var8 + 16.0F, var9 - 104.0F);
               break;
            case 2:
               var13 = fishing4.a.e.a(var8 + 136.0F, var9 - 96.0F);
               break;
            case 3:
               var13 = fishing4.a.e.a(var8 + 164.0F, var9 - 116.0F);
               break;
            case 4:
               var13 = fishing4.a.e.a(var8 + 82.0F, var9 - 154.0F);
               break;
            case 5:
               var13 = fishing4.a.e.a(var8 + 222.0F, var9 - 194.0F);
               break;
            case 6:
               var13 = fishing4.a.e.a(var8 - 106.0F, var9 - 246.0F);
               break;
            case 7:
               var13 = fishing4.a.e.a(var8 - 60.0F, var9 - 76.0F);
               break;
            default:
               var13 = fishing4.a.e.a();
         }

         boolean var11;
         if (l == var10) {
            var11 = true;
         } else {
            var11 = false;
         }

         fishing4.a.m.a(var1, var2, var13, fishing4.a.f.a(657.0F, 479.0F, 10.0F, 10.0F));
         if (var11) {
            fishing4.a.m.a(var1, var2, var13, fishing4.a.f.a(669.0F, 479.0F, 10.0F, 10.0F), '\u0001');
            switch (var12 % 4) {
               case 0:
               default:
                  break;
               case 1:
               case 3:
                  fishing4.a.m.a(var1, var2, var13, fishing4.a.f.a(846.0F, 458.0F, 28.0F, 28.0F), '\u0001');
                  break;
               case 2:
                  fishing4.a.m.a(var1, var2, var13, fishing4.a.f.a(877.0F, 458.0F, 36.0F, 36.0F), '\u0001');
            }
         }
      }

      fishing4.a.e var14 = fishing4.a.e.c(15.0F + var4.c.a / 2.0F, var4.c.b / 2.0F + 15.0F);
      fishing4.a.m.a(var1, var4, var14, 190);
      fishing4.a.m.a(var1, var3, var14.a, var14.b + 130.0F, this.e(l));
      fishing4.game.k.a(var1, fishing4.a.e.a(var14.a, var14.b + 130.0F), 100.0F, var7);
      var8 = var14.a;
      var9 = var14.b;
      fishing4.a.f var16;
      switch (l) {
         case 0:
            var16 = fishing4.a.f.a(210.0F, 184.0F, 208.0F, 90.0F);
            break;
         case 1:
            var16 = fishing4.a.f.a(210.0F, 0.0F, 208.0F, 90.0F);
            break;
         case 2:
            var16 = fishing4.a.f.a(0.0F, 0.0F, 208.0F, 90.0F);
            break;
         case 3:
            var16 = fishing4.a.f.a(0.0F, 184.0F, 208.0F, 90.0F);
            break;
         case 4:
            var16 = fishing4.a.f.a(0.0F, 276.0F, 208.0F, 90.0F);
            break;
         case 5:
            var16 = fishing4.a.f.a(210.0F, 276.0F, 208.0F, 90.0F);
            break;
         case 6:
            var16 = fishing4.a.f.a(0.0F, 92.0F, 208.0F, 90.0F);
            break;
         case 7:
            var16 = fishing4.a.f.a(210.0F, 92.0F, 208.0F, 90.0F);
            break;
         default:
            var16 = fishing4.a.f.a();
      }

      fishing4.a.m.a(var1, var5, var8, 40.0F + var9, var16);
      Context var15 = fishing4.a.s.a();
      switch (l) {
         case 0:
            var7 = 2131165215;
            break;
         case 1:
            var7 = 2131165216;
            break;
         case 2:
            var7 = 2131165217;
            break;
         case 3:
            var7 = 2131165210;
            break;
         case 4:
            var7 = 2131165211;
            break;
         case 5:
            var7 = 2131165212;
            break;
         case 6:
            var7 = 2131165213;
            break;
         case 7:
            var7 = 2131165214;
            break;
         default:
            var7 = 2131166038;
      }

      fishing4.a.ae.a(var1, var15.getString(var7).trim(), var14.a, var14.b - 66.0F, var4.c.a - 40.0F, var4.c.b, 24.0F, 4);
      this.s.a(var1, var2, var3, fishing4.a.e.a(var14.a, 55.0F));
      if (l != 0 && l != 1 && l != 2) {
         if (globalConfig.languageId == 0) {
            fishing4.a.m.a(var1, var6, this.f[0].a + 160.0F, this.f[0].b - 50.0F, 220.0F, 0.0F, 108.0F, 90.0F);
         } else {
            fishing4.a.m.a(var1, var6, this.f[0].a + 160.0F, this.f[0].b - 50.0F, 328.0F, 0.0F, 108.0F, 90.0F);
         }
      } else if (globalConfig.languageId == 0) {
         fishing4.a.m.a(var1, var6, this.f[0].a + 160.0F, this.f[0].b - 50.0F, 0.0F, 0.0F, 108.0F, 90.0F);
      } else {
         fishing4.a.m.a(var1, var6, this.f[0].a + 160.0F, this.f[0].b - 50.0F, 108.0F, 0.0F, 108.0F, 90.0F);
      }

   }

   // $FF: synthetic method
   static int b() {
      return n;
   }

   // $FF: synthetic method
   static int b(bg var0) {
      return var0.j;
   }

   private static fishing4.a.e b(int var0, int var1) {
      float var2 = (float)((fishing4.a.m.a() - 330) / 2);
      float var5 = (float)(fishing4.a.m.b() - 244);
      float var4 = (float)(var0 % 12 % 6 * 66);
      float var3 = (float)(var0 % 12 / 6 * 76);
      return fishing4.a.e.a(var2 + var4 + (float)((var0 / 12 - var1) * fishing4.a.m.a()), var5 - var3);
   }

   private static void b(GL10 var0, fishing4.a.w var1, fishing4.a.w var2, fishing4.a.w var3, fishing4.a.w var4, fishing4.a.w var5, int var6) {
      if (m >= 0 && m < ad.h.size()) {
         am.a(var0, var1, var2, var3, var4, var5, (ag)ad.h.get(m), var6, true);
      } else {
         m = 0;
      }

   }

   private void c() {
      if (a == 14 || a == 15) {
         boolean var2 = true;

         for(int var1 = 0; var1 < this.g.length; ++var1) {
            fishing4.a.e var3 = b(var1, n);
            fishing4.a.e var4 = fishing4.a.e.a(var3.a, var3.b);
            var3 = this.g[var1];
            if (!fishing4.a.y.a(var3, var4)) {
               var2 = false;
            }

            this.g[var1].a(var3);
         }

         if (var2) {
            this.n(m % 12);
            a = 1;
         }
      }

   }

   private static void c(int var0) {
      int var1;
      int var2;
      int var3;
      label20: {
         var2 = x.b % 10;
         var3 = x.b / 10 % 10;
         if (var0 >= 0) {
            var1 = var0;
            if (var0 < ad.h.size()) {
               break label20;
            }
         }

         var1 = 0;
      }

      switch (((ag)ad.h.get(var1)).a) {
         case 80:
         case 81:
            x.b = var1 + 10000 + var3 * 10 + var1 * 100;
            break;
         case 82:
         case 83:
         case 84:
         case 85:
         case 86:
            x.b = var2 + 10000 + var1 * 10 + var1 * 100;
            break;
         case 87:
            x.b = var1 + 10000 + var1 * 10 + var1 * 100;
            break;
         case 88:
            x.b = var2 + 10000 + var3 * 10 + var1 * 100;
      }

   }

   private void c(GL10 var1, fishing4.a.w var2, fishing4.a.w var3, fishing4.a.w var4, fishing4.a.w var5, fishing4.a.w var6, int var7) {
      if (!am.e()) {
         long var8;
         long var10;
         ac var12;
         ac var13;
         String var14;
         String var15;
         String var16;
         m var17;
         ag var18;
         if (globalConfig.languageId == 0) {
            if (this.j == 4) {
               if (b == 100) {
                  if (m < fishing4.game.w.b.size()) {
                     var7 = m;
                     var14 = fishing4.game.w.a((Integer)fishing4.game.w.b.get(var7));
                     var16 = fishing4.game.w.b((Integer)fishing4.game.w.b.get(var7));
                     var15 = fishing4.game.w.c((Integer)fishing4.game.w.b.get(var7));
                     am.a(var1, fishing4.game.w.b.get(var7) + ". " + var14 + "\n\n" + var16 + "\n\n[보상]\n|255255000|" + var15 + "\n\n퀘스트를 수락하시겠습니까?", fishing4.a.m.e(), var2, var3);
                  }
               } else if (b == 101) {
                  if (m < fishing4.game.w.b.size() + fishing4.game.w.c.size()) {
                     var7 = m - fishing4.game.w.b.size();
                     var14 = fishing4.game.w.a((Integer)fishing4.game.w.c.get(var7));
                     var15 = fishing4.game.w.b((Integer)fishing4.game.w.c.get(var7));
                     var16 = fishing4.game.w.c((Integer)fishing4.game.w.c.get(var7));
                     am.a(var1, fishing4.game.w.c.get(var7) + ". " + var14 + "\n\n" + var15 + "\n\n[보상]\n" + var16 + "\n\n현재 진행중인 퀘스트입니다.", fishing4.a.m.e(), var2, var3);
                  }
               } else if (b == 102) {
                  if (m < fishing4.game.w.b.size() + fishing4.game.w.c.size() + fishing4.game.w.d.size()) {
                     var7 = m - fishing4.game.w.b.size() - fishing4.game.w.c.size();
                     var14 = fishing4.game.w.a((Integer)fishing4.game.w.d.get(var7));
                     var15 = fishing4.game.w.b((Integer)fishing4.game.w.d.get(var7));
                     var16 = fishing4.game.w.c((Integer)fishing4.game.w.d.get(var7));
                     am.a(var1, fishing4.game.w.d.get(var7) + ". " + var14 + "\n\n" + var15 + "\n\n[보상]\n" + var16, fishing4.a.m.e(), var2, var3);
                  }
               } else if (b == 103) {
                  am.a(var1, "보상을 받을 공간이 없습니다. 인벤토리 공간을 확인해 주세요.", fishing4.a.m.e(), var2, var3);
               } else if (b == 104) {
                  am.a(var1, "모든 퀘스트를 완료하셨습니다.", fishing4.a.m.e(), var2, var3);
               } else if (b == 110) {
                  am.a(var1, fishing4.game.r.b(fishing4.game.r.b(0, m)) + "\n\n가장 긴 ??? 잡기\n\n기간 : 7일\n상금  : " + fishing4.a.y.d(fishing4.game.r.a(0, m)) + "\n\n참가하시겠습니까?", fishing4.a.m.e(), var2, var3);
               } else if (b == 111) {
                  am.a(var1, fishing4.game.r.b() + "\n\n가장 긴 " + fishing4.a.y.a(2131165434 + fishing4.game.r.c) + " 잡기\n(출몰지 : " + fishing4.game.m.i(fishing4.game.r.c).split("\n")[0] + ")\n\n현재 1위 : " + fishing4.game.m.a(fishing4.game.r.c(), fishing4.game.r.c) + "cm\n내 점수 : " + fishing4.game.m.a(fishing4.game.r.d, fishing4.game.r.c) + "cm\n\n남은 기간 : " + fishing4.game.r.b + "일\n상금  : " + fishing4.a.y.d(fishing4.game.r.a(0, m)), fishing4.a.m.e(), var2, var3);
               } else if (b == 112) {
                  am.a(var1, fishing4.game.r.b() + "\n\n축하합니다!\n우승하셨습니다.\n\n1위 : " + fishing4.game.m.a(fishing4.game.r.d, fishing4.game.r.c) + "cm\n\n상금 : " + fishing4.a.y.d(fishing4.game.r.a(0, m)), fishing4.a.m.e(), var2, var3);
               } else if (b == 113) {
                  am.a(var1, "골드 소지 한도 때문에 보상을 받을 수 없습니다.", fishing4.a.m.e(), var2, var3);
               } else if (b == 114) {
                  am.a(var1, "이미 다른 대회에 참가중입니다.", fishing4.a.m.e(), var2, var3);
               } else if (b == 115) {
                  am.a(var1, fishing4.game.r.b() + "\n\n대회가 종료되었습니다.\n\n현재 1위 : " + fishing4.game.m.a(fishing4.game.r.c(), fishing4.game.r.c) + "cm\n내 점수 : " + fishing4.game.m.a(fishing4.game.r.d, fishing4.game.r.c) + "cm", fishing4.a.m.e(), var2, var3);
               }
            } else if (this.j == 5) {
               if (b == 100) {
                  if (m < fishing4.game.v.b.size()) {
                     var7 = m;
                     var16 = fishing4.game.v.a((Integer)fishing4.game.v.b.get(var7));
                     var15 = fishing4.game.v.b((Integer)fishing4.game.v.b.get(var7));
                     var14 = fishing4.game.v.c((Integer)fishing4.game.v.b.get(var7));
                     am.a(var1, fishing4.game.v.b.get(var7) + ". " + var16 + "\n\n" + var15 + "\n\n[보상]\n|255255000|" + var14 + "\n\n퀘스트를 수락하시겠습니까?", fishing4.a.m.e(), var2, var3);
                  }
               } else if (b == 101) {
                  if (m < fishing4.game.v.b.size() + fishing4.game.v.c.size()) {
                     var7 = m - fishing4.game.v.b.size();
                     var16 = fishing4.game.v.a((Integer)fishing4.game.v.c.get(var7));
                     var14 = fishing4.game.v.b((Integer)fishing4.game.v.c.get(var7));
                     var15 = fishing4.game.v.c((Integer)fishing4.game.v.c.get(var7));
                     am.a(var1, fishing4.game.v.c.get(var7) + ". " + var16 + "\n\n" + var14 + "\n\n[보상]\n" + var15 + "\n\n현재 진행중인 퀘스트입니다.", fishing4.a.m.e(), var2, var3);
                  }
               } else if (b == 102) {
                  if (m < fishing4.game.v.b.size() + fishing4.game.v.c.size() + fishing4.game.v.d.size()) {
                     var7 = m - fishing4.game.v.b.size() - fishing4.game.v.c.size();
                     var14 = fishing4.game.v.a((Integer)fishing4.game.v.d.get(var7));
                     var16 = fishing4.game.v.b((Integer)fishing4.game.v.d.get(var7));
                     var15 = fishing4.game.v.c((Integer)fishing4.game.v.d.get(var7));
                     am.a(var1, fishing4.game.v.d.get(var7) + ". " + var14 + "\n\n" + var16 + "\n\n[보상]\n" + var15, fishing4.a.m.e(), var2, var3);
                  }
               } else if (b == 103) {
                  am.a(var1, "보상을 받을 공간이 없습니다. 인벤토리 공간을 확인해 주세요.", fishing4.a.m.e(), var2, var3);
               } else if (b == 104) {
                  am.a(var1, "모든 퀘스트를 완료하셨습니다.", fishing4.a.m.e(), var2, var3);
               } else if (b == 110) {
                  am.a(var1, fishing4.game.r.b(fishing4.game.r.b(1, m)) + "\n\n희귀한 ??? 많이 잡기\n기간 : 7일\n상금  : " + fishing4.a.y.d(fishing4.game.r.a(1, m)) + "\n\n참가하시겠습니까?", fishing4.a.m.e(), var2, var3);
               } else if (b == 111) {
                  am.a(var1, fishing4.game.r.b() + "\n\n" + fishing4.game.r.d() + fishing4.a.y.a(2131165434 + fishing4.game.r.c) + " 많이 잡기\n(출몰지 : " + fishing4.game.m.i(fishing4.game.r.c).split("\n")[0] + ")\n\n현재 1위 : " + (int)fishing4.game.r.c() + "마리\n내 점수 : " + (int)fishing4.game.r.d + "마리\n\n남은 기간 : " + fishing4.game.r.b + "일\n상금  : " + fishing4.a.y.d(fishing4.game.r.a(1, m)), fishing4.a.m.e(), var2, var3);
               } else if (b == 112) {
                  am.a(var1, fishing4.game.r.b() + "\n\n축하합니다!\n우승하셨습니다.\n\n1위 : " + (int)fishing4.game.r.d + "마리\n\n상금 : " + fishing4.a.y.d(fishing4.game.r.a(1, m)), fishing4.a.m.e(), var2, var3);
               } else if (b == 113) {
                  am.a(var1, "골드 소지 한도 때문에 보상을 받을 수 없습니다.", fishing4.a.m.e(), var2, var3);
               } else if (b == 114) {
                  am.a(var1, "이미 다른 대회에 참가중입니다.", fishing4.a.m.e(), var2, var3);
               } else if (b == 115) {
                  am.a(var1, fishing4.game.r.b() + "\n\n대회가 종료되었습니다.\n\n현재 1위 : " + (int)fishing4.game.r.c() + "마리\n내 점수 : " + (int)fishing4.game.r.d + "마리", fishing4.a.m.e(), var2, var3);
               }
            } else if (this.j == 0) {
               if (b == 40) {
                  b(var1, var2, var3, var4, var5, var6, var7);
               } else if (b == 48) {
                  am.a(var1, "출항하면 대회일이 1일 소요됩니다. 그래도 출항 하시겠습니까? 출항하면 " + (fishing4.game.r.b - 1) + "일이 남습니다.", fishing4.a.m.e(), var2, var3);
               } else if (b == 49) {
                  am.a(var1, "대회기간이 만료되어 출항이 불가능합니다. 협회를 방문해주세요.", fishing4.a.m.e(), var2, var3);
               } else if (b == 50) {
                  am.a(var1, "이 배로 출항할 수 없는 곳입니다.", fishing4.a.m.e(), var2, var3);
               } else if (b == 51) {
                  am.a(var1, "만선이라 출항할 수 없습니다. 선적정보를 확인해주세요.", fishing4.a.m.e(), var2, var3);
               } else if (b == 41) {
                  var17 = (m)((ag)ad.h.get(l)).b.get(m);
                  am.a(var1, fishing4.a.y.a(var17.e()) + " 판매하시겠습니까?\n\n판매금액 " + var17.k(), fishing4.a.m.e(), var2, var3);
               } else if (b == 42) {
                  var18 = (ag)ad.h.get(l);
                  am.a(var1, "판매잠금된 물고기를 제외한 모든 물고기를 판매하시겠습니까?\n\n총 " + var18.c() + "마리\n판매금액 " + var18.d(), fishing4.a.m.e(), var2, var3);
               } else if (b == 45) {
                  am.a(var1, "판매하였습니다.", fishing4.a.m.e(), var2, var3);
               } else if (b == 43) {
                  am.a(var1, "판매잠금된 물고기는 판매할 수 없습니다. 잠금풀기 후 다시 시도해 주세요.", fishing4.a.m.e(), var2, var3);
               } else if (b == 44) {
                  am.a(var1, "모든 물고기가 판매잠금 되어있어 판매할 수 있는 물고기가 없습니다. 잠금풀기 후 다시 시도 해 주세요.", fishing4.a.m.e(), var2, var3);
               } else if (b == 46) {
                  am.a(var1, "판매중입니다.", fishing4.a.m.e(), var2, var3);
                  ((ag)ad.h.get(l)).b(m);
                  if (m >= ((ag)ad.h.get(l)).b.size()) {
                     this.d(((ag)ad.h.get(l)).b.size() - 1);
                  }

                  am.i = 2131034116;
                  am.b(0);
                  b = 45;
                  this.b(23);
               } else if (b == 47) {
                  am.a(var1, "판매중입니다.", fishing4.a.m.e(), var2, var3);
                  ((ag)ad.h.get(l)).e();
                  am.i = 2131034116;
                  am.b(0);
                  b = 45;
                  this.d(0);
                  this.b(23);
               }
            } else if (this.j == 1) {
               if (k == 0) {
                  var18 = (ag)ad.q.get(l);
               } else {
                  var18 = (ag)ad.h.get(l);
               }

               if (!am.e() && am.b != -1) {
                  am.a(var1, var7);
                  a(var1);
               } else {
                  switch (b) {
                     case 61:
                        am.a(var1, fishing4.a.y.a(var18.u()) + " 구매하시겠습니까?\n\n|255255000|구매가 " + var18.r() + "\n|255255255|소지금 " + ad.o.d(), fishing4.a.m.e(), var2, var3);
                        break;
                     case 62:
                        am.a(var1, "소지금이 부족하여 " + fishing4.a.y.a(var18.u()) + " 구매할 수 없습니다.\n\n|255255000|구매가 " + var18.r() + "\n|255255255|소지금 " + ad.o.d(), fishing4.a.m.e(), var2, var3);
                        break;
                     case 63:
                        am.a(var1, "이미 구매한 선박입니다.", fishing4.a.m.e(), var2, var3);
                        break;
                     case 64:
                        am.a(var1, "구매하였습니다.", fishing4.a.m.e(), var2, var3);
                        break;
                     case 65:
                        am.a(var1, fishing4.a.y.a(var18.u()) + " 판매하시겠습니까?\n\n|255255000|판매가 " + var18.t() + "\n|255255255|소지금 " + ad.o.d(), fishing4.a.m.e(), var2, var3);
                        break;
                     case 66:
                        am.a(var1, "선적된 물고기가 있어 판매할 수 없습니다.", fishing4.a.m.e(), var2, var3);
                        break;
                     case 67:
                        am.a(var1, "기본 선박은 판매할 수 없습니다.", fishing4.a.m.e(), var2, var3);
                        break;
                     case 68:
                        am.a(var1, "판매중입니다.", fishing4.a.m.e(), var2, var3);
                        ad.o.c((long)((ag)ad.h.get(l)).s());
                        ad.b(6, l);
                        if (l >= ad.h.size()) {
                           l = ad.h.size() - 1;
                        }

                        if (x.b / 100 % 10 >= ad.h.size()) {
                           c(ad.h.size() - 1);
                        }

                        am.b(0);
                        b = 69;
                        break;
                     case 69:
                        am.a(var1, "판매하였습니다.", fishing4.a.m.e(), var2, var3);
                        break;
                     case 70:
                        am.a(var1, "선적 개조\n\n\n적재길이 개조\n\n\n레이더 개조", fishing4.a.m.e(), var2, var3);
                        break;
                     case 71:
                        am.a(var1, b, var18);
                        break;
                     case 72:
                        am.a(var1, "선적 개조중입니다.", fishing4.a.m.e(), var2, var3);
                        if (var18.a == 88) {
                           a(var1);
                        } else {
                           ad.o.d((long)var18.i(var18.c + 1));
                           var18.k();
                           am.i = 2131034145;
                           am.a(0, fishing4.a.g.a(20.0F));
                           b = 73;
                        }
                        break;
                     case 73:
                        am.b(var1, b, var18);
                        break;
                     case 74:
                        am.a(var1, "더 이상 개조할 수 없습니다.", fishing4.a.m.e(), var2, var3);
                        break;
                     case 75:
                        if (var18.a == 88) {
                           am.a(var1, "코인이 부족합니다.\n\n|255255000|개조비용 " + var18.j(var18.c + 1) + "\n|255255255|내 코인 " + ad.p.e(), fishing4.a.m.e(), var2, var3);
                        } else {
                           am.a(var1, "소지금이 부족합니다.\n\n|255255000|개조비용 " + var18.j(var18.c + 1) + "\n|255255255|소지금 " + ad.o.d(), fishing4.a.m.e(), var2, var3);
                        }
                        break;
                     case 76:
                        am.a(var1, b, var18);
                        break;
                     case 77:
                        am.a(var1, "길이 개조중입니다.", fishing4.a.m.e(), var2, var3);
                        if (var18.a == 88) {
                           a(var1);
                        } else {
                           ad.o.d((long)var18.i(var18.d + 1));
                           var18.i();
                           am.i = 2131034145;
                           am.a(0, fishing4.a.g.a(20.0F));
                           b = 78;
                        }
                        break;
                     case 78:
                        am.b(var1, b, var18);
                        break;
                     case 79:
                        am.a(var1, "더 이상 개조할 수 없습니다.", fishing4.a.m.e(), var2, var3);
                        break;
                     case 80:
                        if (var18.a == 88) {
                           am.a(var1, "코인이 부족합니다.\n\n|255255000|개조비용 " + var18.j(var18.d + 1) + "\n|255255255|내 코인 " + ad.p.e(), fishing4.a.m.e(), var2, var3);
                        } else {
                           am.a(var1, "소지금이 부족합니다.\n\n|255255000|개조비용 " + var18.j(var18.d + 1) + "\n|255255255|소지금 " + ad.o.d(), fishing4.a.m.e(), var2, var3);
                        }
                        break;
                     case 81:
                        am.a(var1, "레이더를 개조하시겠습니까?\n\n[개조]\n" + var18.n() + " " + var18.o() + "\n\n" + ag.e(var18.e + 1) + " " + ag.f(var18.e + 1) + "\n\n|255255000|개조비용 " + var18.q() + "\n|255255255|소지금 " + ad.o.d(), fishing4.a.m.e(), var2, var3);
                        if (am.d()) {
                           var18.a(var1, var5, fishing4.a.m.c() - 125.0F, fishing4.a.m.d() + 30.0F, var7, fishing4.a.g.a(0.5F));
                           ag.a(var1, var5, fishing4.a.m.c() - 125.0F, fishing4.a.m.d() - 35.0F, var7, fishing4.a.g.a(0.5F), var18.e + 1);
                        }
                        break;
                     case 82:
                        am.a(var1, "레이더를 개조중입니다.", fishing4.a.m.e(), var2, var3);
                        ad.o.d((long)var18.p());
                        var18.l();
                        am.i = 2131034145;
                        am.a(0, fishing4.a.g.a(20.0F));
                        b = 83;
                        break;
                     case 83:
                        am.a(var1, "레이더가 개조되었습니다.\n\n[결과]\n\n" + var18.n() + " " + var18.o(), fishing4.a.m.e(), var2, var3);
                        if (am.d()) {
                           var18.a(var1, var5, fishing4.a.m.c() - 125.0F, fishing4.a.m.d() - 65.0F, var7, fishing4.a.g.a(0.5F));
                        }
                        break;
                     case 84:
                        am.a(var1, "더 이상 개조할 수 없습니다.", fishing4.a.m.e(), var2, var3);
                        break;
                     case 85:
                        am.a(var1, "소지금이 부족합니다.\n\n|255255000|개조비용 " + var18.q() + "\n|255255255|소지금 " + ad.o.d(), fishing4.a.m.e(), var2, var3);
                     case 86:
                     case 87:
                     case 88:
                     case 89:
                     default:
                        break;
                     case 90:
                        am.a(var1, "레이더 이름\n개조 전 레이더보다는 확실히 좋은 레이더\n\n가치 높은 물고기 낚임\n안내선 없음", fishing4.a.m.e(), var2, var3);
                        break;
                     case 91:
                        am.a(var1, "이 선박은 대물 낚시터 전용 선박입니다. 구매하신 후 대물 낚시터를 제외한 다른 낚시터에서는 사용이 불가합니다.\n\n구매하시겠습니까?", fishing4.a.m.e(), var2, var3);
                        break;
                     case 92:
                        am.a(var1, "아마추어 등급 이상이 되어야 구입할 수 있습니다.", fishing4.a.m.e(), var2, var3);
                  }
               }
            } else if (this.j == 3 || this.j == 2) {
               if (!am.e() && am.b != -1) {
                  am.a(var1, var7);
                  a(var1);
               } else {
                  switch (b) {
                     case 0:
                        am.a(var1, fishing4.a.y.a(((ac)this.f().get(m)).u()) + " 구매하시겠습니까?\n\n|255255000|구매가 " + ac.a(((ac)this.f().get(m)).f(), true, (int)this.r.encrypt()) + "\n|255255255|소지금 " + ad.o.d(), fishing4.a.m.e(), var2, var3);
                        break;
                     case 1:
                        am.a(var1, "구입 중입니다..", fishing4.a.m.e(), var2, var3);
                        if (fishing4.a.y.a() - am.h > 500L) {
                           am.i = 2131034116;
                           am.b(0);
                           b = 2;
                        }
                        break;
                     case 2:
                        am.a(var1, "구매하였습니다.", fishing4.a.m.e(), var2, var3);
                        break;
                     case 3:
                        am.a(var1, "소지금이 부족해서 구매할 수 없습니다.\n\n|255255000|구매가 " + ac.c(((ac)this.f().get(m)).f()) + "\n|255255255|소지금 " + ad.o.d(), fishing4.a.m.e(), var2, var3);
                        break;
                     case 4:
                        am.a(var1, "더 이상 인벤토리에 여유공간이 없습니다. 인벤토리를 비운 후 다시 구매하세요.", fishing4.a.m.e(), var2, var3);
                        break;
                     case 5:
                        am.a(var1, this.r.encrypt());
                     case 6:
                     case 7:
                     case 8:
                     case 9:
                     case 15:
                     case 16:
                     case 17:
                     case 18:
                     case 19:
                     case 25:
                     case 26:
                     case 27:
                     case 28:
                     case 29:
                     default:
                        break;
                     case 10:
                        if (((ac)this.f().get(m)).b(m)) {
                           am.a(var1, "현재 사용중인 장비입니다. 판매하시겠습니까?\n\n|255255000|판매가 " + ac.a((ac)this.f().get(m), this.r.encrypt()) + "\n|255255255|소지금 " + ad.o.d(), fishing4.a.m.e(), var2, var3);
                        } else {
                           am.a(var1, fishing4.a.y.a(((ac)this.f().get(m)).u()) + " 판매하시겠습니까?\n\n|255255000|판매가 " + ac.a((ac)this.f().get(m), this.r.encrypt()) + "\n|255255255|소지금 " + ad.o.d(), fishing4.a.m.e(), var2, var3);
                        }
                        break;
                     case 11:
                        am.a(var1, "판매 중입니다..", fishing4.a.m.e(), var2, var3);
                        if (fishing4.a.y.a() - am.h > 500L) {
                           var12 = (ac)this.f().get(m);
                           var8 = (long)ac.e(var12.f());
                           var10 = this.r.encrypt();
                           if (var12.s() == 1 && (long)var12.c() > this.r.encrypt()) {
                              var12.b(this.r.encrypt());
                           } else {
                              ad.b(var12.s(), m);
                           }

                           ad.o.c(var8 * var10);
                           am.i = 2131034116;
                           am.b(0);
                           b = 12;
                        }
                        break;
                     case 12:
                        am.a(var1, "판매하였습니다.", fishing4.a.m.e(), var2, var3);
                        break;
                     case 13:
                        am.a(var1, "판매불가한 아이템입니다.", fishing4.a.m.e(), var2, var3);
                        break;
                     case 14:
                        am.a(var1, this.r.encrypt());
                        break;
                     case 20:
                        if (((ac)this.f().get(m)).f() != 120 && ((ac)this.f().get(m)).f() != 121 && ((ac)this.f().get(m)).f() != 122) {
                           am.a(var1, fishing4.a.y.a(((ac)this.f().get(m)).u()) + " 수리하시겠습니까?\n\n|255255000|수리비용 " + ac.a((ac)this.f().get(m)) + "\n|255255255|소지금 " + ad.o.d(), fishing4.a.m.e(), var2, var3);
                        } else {
                           am.a(var1, fishing4.a.y.a(((ac)this.f().get(m)).u()) + " 수리하시겠습니까?\n\n|255255000|수리비용 " + ac.a((ac)this.f().get(m)), fishing4.a.m.e(), var2, var3);
                           aq.b(var1, fishing4.a.m.c());
                        }
                        break;
                     case 21:
                        var13 = (ac)this.f().get(m);
                        if (var13.f() != 120 && var13.f() != 121 && var13.f() != 122) {
                           ad.o.d((long)var13.k());
                           var13.g();
                           am.i = 2131034116;
                           am.b(0);
                           b = 22;
                        } else {
                           a(var1);
                        }
                        break;
                     case 22:
                        am.a(var1, "수리하였습니다.", fishing4.a.m.e(), var2, var3);
                        break;
                     case 23:
                        am.a(var1, "소지금이 부족해서 수리할 수 없습니다.\n\n|255255000|수리비용 " + ac.a((ac)this.f().get(m)) + "\n|255255255|소지금 " + ad.o.d(), fishing4.a.m.e(), var2, var3);
                        break;
                     case 24:
                        am.a(var1, "수리할 필요가 없거나 수리할 수 없는 아이템입니다.", fishing4.a.m.e(), var2, var3);
                        break;
                     case 30:
                        am.a(var1, (ac)this.f().get(m));
                        break;
                     case 31:
                        if (bb.e % 3 == 0) {
                           var14 = ".강화중.";
                        } else if (bb.e % 3 == 1) {
                           var14 = "..강화중..";
                        } else {
                           var14 = "...강화중...";
                        }

                        am.a(var1, var14, fishing4.a.m.e(), var2, var3);
                        if (fishing4.a.y.a() - am.h > 3000L) {
                           this.i();
                        }
                        break;
                     case 32:
                        am.a(var1, ((ac)this.f().get(m)).s(), (ac)this.f().get(m));
                        break;
                     case 33:
                        am.a(var1, "강화에 실패하였습니다.", fishing4.a.m.e(), var2, var3);
                        break;
                     case 34:
                        am.a(var1, "소지금이 부족해서 강화할 수 없습니다.\n\n|255255000|강화비용 " + ac.c((ac)this.f().get(m)) + "\n|255255255|소지금 " + ad.o.d(), fishing4.a.m.e(), var2, var3);
                        break;
                     case 35:
                        am.a(var1, "더 이상 강화할 수 없습니다.", fishing4.a.m.e(), var2, var3);
                        break;
                     case 36:
                        am.a(var1, "강화할 수 없는 아이템입니다.", fishing4.a.m.e(), var2, var3);
                  }
               }
            }
         } else if (this.j == 4) {
            if (b == 100) {
               if (m < fishing4.game.w.b.size()) {
                  var7 = m;
                  var15 = fishing4.game.w.a((Integer)fishing4.game.w.b.get(var7));
                  var16 = fishing4.game.w.b((Integer)fishing4.game.w.b.get(var7));
                  var14 = fishing4.game.w.c((Integer)fishing4.game.w.b.get(var7));
                  am.a(var1, fishing4.game.w.b.get(var7) + ". " + var15 + "\n\n" + var16 + "\n\n[Reward]\n|255255000|" + var14 + "\n\nDo you want to accept the \nquest?", fishing4.a.m.e(), var2, var3);
               }
            } else if (b == 101) {
               if (m < fishing4.game.w.b.size() + fishing4.game.w.c.size()) {
                  var7 = m - fishing4.game.w.b.size();
                  var16 = fishing4.game.w.a((Integer)fishing4.game.w.c.get(var7));
                  var14 = fishing4.game.w.b((Integer)fishing4.game.w.c.get(var7));
                  var15 = fishing4.game.w.c((Integer)fishing4.game.w.c.get(var7));
                  am.a(var1, fishing4.game.w.c.get(var7) + ". " + var16 + "\n\n" + var14 + "\n\n[Reward]\n" + var15 + "\n\nthis quest is already in \nprogress.", fishing4.a.m.e(), var2, var3);
               }
            } else if (b == 102) {
               if (m < fishing4.game.w.b.size() + fishing4.game.w.c.size() + fishing4.game.w.d.size()) {
                  var7 = m - fishing4.game.w.b.size() - fishing4.game.w.c.size();
                  var16 = fishing4.game.w.a((Integer)fishing4.game.w.d.get(var7));
                  var15 = fishing4.game.w.b((Integer)fishing4.game.w.d.get(var7));
                  var14 = fishing4.game.w.c((Integer)fishing4.game.w.d.get(var7));
                  am.a(var1, fishing4.game.w.d.get(var7) + ". " + var16 + "\n\n" + var15 + "\n\n[Reward]\n" + var14, fishing4.a.m.e(), var2, var3);
               }
            } else if (b == 103) {
               am.a(var1, "Not enough inventory space. ", fishing4.a.m.e(), var2, var3);
            } else if (b == 104) {
               am.a(var1, "You completed all quests.", fishing4.a.m.e(), var2, var3);
            } else if (b == 110) {
               am.a(var1, fishing4.game.r.b(fishing4.game.r.b(0, m)) + "\n\nCatch the longest XX\n\nPeriod : 7\nReward  : " + fishing4.a.y.d(fishing4.game.r.a(0, m)) + "\n\nDo you want to \nparticipate?", fishing4.a.m.e(), var2, var3);
            } else if (b == 111) {
               am.a(var1, fishing4.game.r.b() + "\n\nCatch the longest " + fishing4.a.y.a(2131165434 + fishing4.game.r.c) + "\n(Habitat : " + fishing4.game.m.i(fishing4.game.r.c).split("\n")[0] + ")\n\nCurrent top score : " + bb.i.format((double)fishing4.game.m.a(fishing4.game.r.c(), fishing4.game.r.c) / 2.54) + "in.\nMy top score : " + bb.i.format((double)fishing4.game.m.a(fishing4.game.r.d, fishing4.game.r.c) / 2.54) + "in.\n\nRemaining days : " + fishing4.game.r.b + "\nReward : " + fishing4.a.y.d(fishing4.game.r.a(0, m)), fishing4.a.m.e(), var2, var3);
            } else if (b == 112) {
               am.a(var1, fishing4.game.r.b() + "\n\nCongratulations!\nYou Win!\n\ntop score : " + bb.i.format((double)fishing4.game.m.a(fishing4.game.r.d, fishing4.game.r.c) / 2.54) + "in.\n\nReward : " + fishing4.a.y.d(fishing4.game.r.a(0, m)), fishing4.a.m.e(), var2, var3);
            } else if (b == 113) {
               am.a(var1, "You have reached maximum gold limit; you cannot receive the reward.", fishing4.a.m.e(), var2, var3);
            } else if (b == 114) {
               am.a(var1, "You are already \nparticipating in\nanother competition.", fishing4.a.m.e(), var2, var3);
            } else if (b == 115) {
               am.a(var1, fishing4.game.r.b() + "\n\nThe competition is over.\n\nCurrent top score : " + bb.i.format((double)fishing4.game.m.a(fishing4.game.r.c(), fishing4.game.r.c) / 2.54) + "in.\nMy top score : " + bb.i.format((double)fishing4.game.m.a(fishing4.game.r.d, fishing4.game.r.c) / 2.54) + "in.", fishing4.a.m.e(), var2, var3);
            }
         } else if (this.j == 5) {
            if (b == 100) {
               if (m < fishing4.game.v.b.size()) {
                  var7 = m;
                  var16 = fishing4.game.v.a((Integer)fishing4.game.v.b.get(var7));
                  var15 = fishing4.game.v.b((Integer)fishing4.game.v.b.get(var7));
                  var14 = fishing4.game.v.c((Integer)fishing4.game.v.b.get(var7));
                  am.a(var1, fishing4.game.v.b.get(var7) + ". " + var16 + "\n\n" + var15 + "\n\n[Reward]\n|255255000|" + var14 + "\n\nDo you want to accept the \nquest?", fishing4.a.m.e(), var2, var3);
               }
            } else if (b == 101) {
               if (m < fishing4.game.v.b.size() + fishing4.game.v.c.size()) {
                  var7 = m - fishing4.game.v.b.size();
                  var14 = fishing4.game.v.a((Integer)fishing4.game.v.c.get(var7));
                  var15 = fishing4.game.v.b((Integer)fishing4.game.v.c.get(var7));
                  var16 = fishing4.game.v.c((Integer)fishing4.game.v.c.get(var7));
                  am.a(var1, fishing4.game.v.c.get(var7) + ". " + var14 + "\n\n" + var15 + "\n\n[Reward]\n" + var16 + "\n\nthis quest is already in \nprogress.", fishing4.a.m.e(), var2, var3);
               }
            } else if (b == 102) {
               if (m < fishing4.game.v.b.size() + fishing4.game.v.c.size() + fishing4.game.v.d.size()) {
                  var7 = m - fishing4.game.v.b.size() - fishing4.game.v.c.size();
                  var14 = fishing4.game.v.a((Integer)fishing4.game.v.d.get(var7));
                  var16 = fishing4.game.v.b((Integer)fishing4.game.v.d.get(var7));
                  var15 = fishing4.game.v.c((Integer)fishing4.game.v.d.get(var7));
                  am.a(var1, fishing4.game.v.d.get(var7) + ". " + var14 + "\n\n" + var16 + "\n\n[Reward]\n" + var15, fishing4.a.m.e(), var2, var3);
               }
            } else if (b == 103) {
               am.a(var1, "Not enough inventory space. ", fishing4.a.m.e(), var2, var3);
            } else if (b == 104) {
               am.a(var1, "You completed all quests.", fishing4.a.m.e(), var2, var3);
            } else if (b == 110) {
               am.a(var1, fishing4.game.r.b(fishing4.game.r.b(1, m)) + "\n\nCatch the most \nnumber of rare ???\nPeriod : 7\nReward  : " + fishing4.a.y.d(fishing4.game.r.a(1, m)) + "\n\nDo you want to \nparticipate?", fishing4.a.m.e(), var2, var3);
            } else if (b == 111) {
               am.a(var1, fishing4.game.r.b() + "\n\n" + fishing4.game.r.d() + fishing4.a.y.a(2131165434 + fishing4.game.r.c) + " Catch the most number\n(Habitat : " + fishing4.game.m.i(fishing4.game.r.c).split("\n")[0] + ")\n\nCurrent top score : " + (int)fishing4.game.r.c() + "\nMy top score : " + (int)fishing4.game.r.d + "\n\nRemaining days : " + fishing4.game.r.b + "\nReward  : " + fishing4.a.y.d(fishing4.game.r.a(1, m)), fishing4.a.m.e(), var2, var3);
            } else if (b == 112) {
               am.a(var1, fishing4.game.r.b() + "\n\nCongratulations!\nYou Win!\n\nTop score : " + (int)fishing4.game.r.d + "\n\nReward : " + fishing4.a.y.d(fishing4.game.r.a(1, m)), fishing4.a.m.e(), var2, var3);
            } else if (b == 113) {
               am.a(var1, "You have reached maximum gold limit; you cannot receive the reward.", fishing4.a.m.e(), var2, var3);
            } else if (b == 114) {
               am.a(var1, "You are already \nparticipating in\nanother competition.", fishing4.a.m.e(), var2, var3);
            } else if (b == 115) {
               am.a(var1, fishing4.game.r.b() + "\n\nThe competition is over.\n\nCurrent top score : " + (int)fishing4.game.r.c() + "\nMy top score : " + (int)fishing4.game.r.d, fishing4.a.m.e(), var2, var3);
            }
         } else if (this.j == 0) {
            if (b == 40) {
               b(var1, var2, var3, var4, var5, var6, var7);
            } else if (b == 48) {
               am.a(var1, "1 competition day \nwill be spent for \n1 departure. Do you \nwant to proceed? \n" + (fishing4.game.r.b - 1) + " days will be left if \nyou do.", fishing4.a.m.e(), var2, var3);
            } else if (b == 49) {
               am.a(var1, "Competition is over. \nVisit the team.", fishing4.a.m.e(), var2, var3);
            } else if (b == 50) {
               am.a(var1, "You need the \nappropriate ship for \nthis location.", fishing4.a.m.e(), var2, var3);
            } else if (b == 51) {
               am.a(var1, "Your ship is full! Check your ship before departure!", fishing4.a.m.e(), var2, var3);
            } else if (b == 41) {
               var17 = (m)((ag)ad.h.get(l)).b.get(m);
               am.a(var1, " Do you want to sell \nthis fish?\n\nSelling price : " + var17.k(), fishing4.a.m.e(), var2, var3);
            } else if (b == 42) {
               var18 = (ag)ad.h.get(l);
               am.a(var1, "Do you want to sell all \nyour catch, except the \nlocked ones?\n\nNumber of fish to sell : " + var18.c() + "\nSelling price : " + var18.d(), fishing4.a.m.e(), var2, var3);
            } else if (b == 45) {
               am.a(var1, "You sold your fish!", fishing4.a.m.e(), var2, var3);
            } else if (b == 43) {
               am.a(var1, "You cannot sell locked fish. Try again after \nunlocking them.", fishing4.a.m.e(), var2, var3);
            } else if (b == 44) {
               am.a(var1, "All fish are locked, and cannot be sold. Try \nagain after unlocking\nthem.", fishing4.a.m.e(), var2, var3);
            } else if (b == 46) {
               am.a(var1, "Trading…", fishing4.a.m.e(), var2, var3);
               ((ag)ad.h.get(l)).b(m);
               if (m >= ((ag)ad.h.get(l)).b.size()) {
                  this.d(((ag)ad.h.get(l)).b.size() - 1);
               }

               am.i = 2131034116;
               am.b(0);
               b = 45;
               this.b(23);
            } else if (b == 47) {
               am.a(var1, "Trading…", fishing4.a.m.e(), var2, var3);
               ((ag)ad.h.get(l)).e();
               am.i = 2131034116;
               am.b(0);
               b = 45;
               this.d(0);
               this.b(23);
            }
         } else if (this.j == 1) {
            if (k == 0) {
               var18 = (ag)ad.q.get(l);
            } else {
               var18 = (ag)ad.h.get(l);
            }

            if (!am.e() && am.b != -1) {
               am.a(var1, var7);
               a(var1);
            } else {
               switch (b) {
                  case 61:
                     am.a(var1, " Do you want to buy \nthis?\n\n|255255000|Price : " + var18.r() + "\n|255255255|Gold :" + ad.o.d(), fishing4.a.m.e(), var2, var3);
                     break;
                  case 62:
                     am.a(var1, "you haven't got \nenough money.\n\n|255255000|Price : " + var18.r() + "\n|255255255|Gold :" + ad.o.d(), fishing4.a.m.e(), var2, var3);
                     break;
                  case 63:
                     am.a(var1, "You already have this ship.", fishing4.a.m.e(), var2, var3);
                     break;
                  case 64:
                     am.a(var1, "Purchased.", fishing4.a.m.e(), var2, var3);
                     break;
                  case 65:
                     am.a(var1, " Do you want to sell \nthis?\n\n|255255000|Selling price : " + var18.t() + "\n|255255255|Gold :" + ad.o.d(), fishing4.a.m.e(), var2, var3);
                     break;
                  case 66:
                     am.a(var1, "There are some fish on board this ship!", fishing4.a.m.e(), var2, var3);
                     break;
                  case 67:
                     am.a(var1, "You cannot sell default ship.", fishing4.a.m.e(), var2, var3);
                     break;
                  case 68:
                     am.a(var1, "Trading…", fishing4.a.m.e(), var2, var3);
                     ad.o.c((long)((ag)ad.h.get(l)).s());
                     ad.b(6, l);
                     if (l >= ad.h.size()) {
                        l = ad.h.size() - 1;
                     }

                     if (x.b / 100 % 10 >= ad.h.size()) {
                        c(ad.h.size() - 1);
                     }

                     am.b(0);
                     b = 69;
                     break;
                  case 69:
                     am.a(var1, "You sold the ship.", fishing4.a.m.e(), var2, var3);
                     break;
                  case 70:
                     am.a(var1, "Shipment upgrade\n\n\nLength upgrade\n\n\nRadar upgrade", fishing4.a.m.e(), var2, var3);
                     break;
                  case 71:
                     am.a(var1, b, var18);
                     break;
                  case 72:
                     am.a(var1, "Upgrading ship…", fishing4.a.m.e(), var2, var3);
                     if (var18.a == 88) {
                        a(var1);
                     } else {
                        ad.o.d((long)var18.i(var18.c + 1));
                        var18.k();
                        am.i = 2131034145;
                        am.a(0, fishing4.a.g.a(20.0F));
                        b = 73;
                     }
                     break;
                  case 73:
                     am.b(var1, b, var18);
                     break;
                  case 74:
                     am.a(var1, "No more upgrade is \navailable.", fishing4.a.m.e(), var2, var3);
                     break;
                  case 75:
                     if (var18.a == 88) {
                        am.a(var1, "Not enough coins.\n\n|255255000|Upgrade cost " + var18.j(var18.c + 1) + "\n|255255255|My coins :" + ad.p.e(), fishing4.a.m.e(), var2, var3);
                     } else {
                        am.a(var1, "Not enough gold.\n\n|255255000|Upgrade cost " + var18.j(var18.c + 1) + "\n|255255255|Gold :" + ad.o.d(), fishing4.a.m.e(), var2, var3);
                     }
                     break;
                  case 76:
                     am.a(var1, b, var18);
                     break;
                  case 77:
                     am.a(var1, "Upgrading length…", fishing4.a.m.e(), var2, var3);
                     if (var18.a == 88) {
                        a(var1);
                     } else {
                        ad.o.d((long)var18.i(var18.d + 1));
                        var18.i();
                        am.i = 2131034145;
                        am.a(0, fishing4.a.g.a(20.0F));
                        b = 78;
                     }
                     break;
                  case 78:
                     am.b(var1, b, var18);
                     break;
                  case 79:
                     am.a(var1, "No more upgrade is \navailable.", fishing4.a.m.e(), var2, var3);
                     break;
                  case 80:
                     if (var18.a == 88) {
                        am.a(var1, "Not enough coins.\n\n|255255000|Upgrade cost " + var18.j(var18.d + 1) + "\n|255255255|My coins :" + ad.p.e(), fishing4.a.m.e(), var2, var3);
                     } else {
                        am.a(var1, "Not enough gold\n\n|255255000|Upgrade cost " + var18.j(var18.d + 1) + "\n|255255255|Gold :" + ad.o.d(), fishing4.a.m.e(), var2, var3);
                     }
                     break;
                  case 81:
                     am.a(var1, "Do you want to upgrade \nradar?\n\n[Upgrade]\n" + var18.n() + " " + var18.o() + "\n\n" + ag.e(var18.e + 1) + " " + ag.f(var18.e + 1) + "\n\n|255255000|Upgrade cost :" + var18.q() + "\n|255255255|Gold :" + ad.o.d(), fishing4.a.m.e(), var2, var3);
                     if (am.d()) {
                        var18.a(var1, var5, fishing4.a.m.c() - 125.0F, fishing4.a.m.d() + 30.0F, var7, fishing4.a.g.a(0.5F));
                        ag.a(var1, var5, fishing4.a.m.c() - 125.0F, fishing4.a.m.d() - 35.0F, var7, fishing4.a.g.a(0.5F), var18.e + 1);
                     }
                     break;
                  case 82:
                     am.a(var1, "Upgrading radar…", fishing4.a.m.e(), var2, var3);
                     ad.o.d((long)var18.p());
                     var18.l();
                     am.i = 2131034145;
                     am.a(0, fishing4.a.g.a(20.0F));
                     b = 83;
                     break;
                  case 83:
                     am.a(var1, "Radar upgrade complete.\n\n[Result]\n\n" + var18.n() + " " + var18.o(), fishing4.a.m.e(), var2, var3);
                     if (am.d()) {
                        var18.a(var1, var5, fishing4.a.m.c() - 125.0F, fishing4.a.m.d() - 65.0F, var7, fishing4.a.g.a(0.5F));
                     }
                     break;
                  case 84:
                     am.a(var1, "No more upgrade is \navailable.", fishing4.a.m.e(), var2, var3);
                     break;
                  case 85:
                     am.a(var1, "Not enough gold\n\n|255255000|Upgrade cost " + var18.q() + "\n|255255255|Gold :" + ad.o.d(), fishing4.a.m.e(), var2, var3);
                  case 86:
                  case 87:
                  case 88:
                  case 89:
                  default:
                     break;
                  case 90:
                     am.a(var1, "레이더 이름\n개조 전 레이더보다는 확실히 좋은 레이더\n\n가치 높은 물고기 낚임\n안내선 없음", fishing4.a.m.e(), var2, var3);
                     break;
                  case 91:
                     am.a(var1, "이 선박은 대물 낚시터 전용 선박입니다. 구매하신 후 대물 낚시터를 제외한 다른 낚시터에서는 사용이 불가합니다.\n\n구매하시겠습니까?", fishing4.a.m.e(), var2, var3);
                     break;
                  case 92:
                     am.a(var1, "아마추어 등급 이상이 되어야 구입할 수 있습니다.", fishing4.a.m.e(), var2, var3);
               }
            }
         } else if (this.j == 3 || this.j == 2) {
            if (!am.e() && am.b != -1) {
               am.a(var1, var7);
               a(var1);
            } else {
               switch (b) {
                  case 0:
                     am.a(var1, " Do you want to buy \nthis?\n\n|255255000|Price : " + ac.a(((ac)this.f().get(m)).f(), true, (int)this.r.encrypt()) + "\n|255255255|Gold :" + ad.o.d(), fishing4.a.m.e(), var2, var3);
                     break;
                  case 1:
                     am.a(var1, "purchasing...", fishing4.a.m.e(), var2, var3);
                     if (fishing4.a.y.a() - am.h > 500L) {
                        am.i = 2131034116;
                        am.b(0);
                        b = 2;
                     }
                     break;
                  case 2:
                     am.a(var1, "Purchased.", fishing4.a.m.e(), var2, var3);
                     break;
                  case 3:
                     am.a(var1, "you haven't got \nenough money.\n\n|255255000|Price : " + ac.c(((ac)this.f().get(m)).f()) + "\n|255255255|Gold :" + ad.o.d(), fishing4.a.m.e(), var2, var3);
                     break;
                  case 4:
                     am.a(var1, "Not enough inventory space. ", fishing4.a.m.e(), var2, var3);
                     break;
                  case 5:
                     am.a(var1, this.r.encrypt());
                  case 6:
                  case 7:
                  case 8:
                  case 9:
                  case 15:
                  case 16:
                  case 17:
                  case 18:
                  case 19:
                  case 25:
                  case 26:
                  case 27:
                  case 28:
                  case 29:
                  default:
                     break;
                  case 10:
                     if (((ac)this.f().get(m)).b(m)) {
                        am.a(var1, "This item is in use. Sell \nit anyway?\n\n|255255000|Selling price : " + ac.a((ac)this.f().get(m), this.r.encrypt()) + "\n|255255255|Gold :" + ad.o.d(), fishing4.a.m.e(), var2, var3);
                     } else {
                        am.a(var1, fishing4.a.y.a(((ac)this.f().get(m)).u()) + "\nDo you want to sell \nthis?\n\n|255255000|Selling price : " + ac.a((ac)this.f().get(m), this.r.encrypt()) + "\n|255255255|Gold :" + ad.o.d(), fishing4.a.m.e(), var2, var3);
                     }
                     break;
                  case 11:
                     am.a(var1, "Trading...", fishing4.a.m.e(), var2, var3);
                     if (fishing4.a.y.a() - am.h > 500L) {
                        var12 = (ac)this.f().get(m);
                        var8 = (long)ac.e(var12.f());
                        var10 = this.r.encrypt();
                        if (var12.s() == 1 && (long)var12.c() > this.r.encrypt()) {
                           var12.b(this.r.encrypt());
                        } else {
                           ad.b(var12.s(), m);
                        }

                        ad.o.c(var8 * var10);
                        am.i = 2131034116;
                        am.b(0);
                        b = 12;
                     }
                     break;
                  case 12:
                     am.a(var1, "You sold the item..", fishing4.a.m.e(), var2, var3);
                     break;
                  case 13:
                     am.a(var1, "This item is not tradable.", fishing4.a.m.e(), var2, var3);
                     break;
                  case 14:
                     am.a(var1, this.r.encrypt());
                     break;
                  case 20:
                     if (((ac)this.f().get(m)).f() != 120 && ((ac)this.f().get(m)).f() != 121 && ((ac)this.f().get(m)).f() != 122) {
                        am.a(var1, fishing4.a.y.a(((ac)this.f().get(m)).u()) + "\nDo you want to repair\nthis item?\n\n|255255000|Repair cost  " + ac.a((ac)this.f().get(m)) + "\n|255255255|Gold :" + ad.o.d(), fishing4.a.m.e(), var2, var3);
                     } else {
                        am.a(var1, fishing4.a.y.a(((ac)this.f().get(m)).u()) + "\nDo you want to repair\nthis item?\n\n|255255000|Repair cost  " + ac.a((ac)this.f().get(m)), fishing4.a.m.e(), var2, var3);
                        aq.b(var1, fishing4.a.m.c());
                     }
                     break;
                  case 21:
                     var13 = (ac)this.f().get(m);
                     if (var13.f() != 120 && var13.f() != 121 && var13.f() != 122) {
                        ad.o.d((long)var13.k());
                        var13.g();
                        am.i = 2131034116;
                        am.b(0);
                        b = 22;
                     } else {
                        a(var1);
                     }
                     break;
                  case 22:
                     am.a(var1, "Repaired.", fishing4.a.m.e(), var2, var3);
                     break;
                  case 23:
                     am.a(var1, "You need more money.\n\n|255255000|Repair cost  " + ac.a((ac)this.f().get(m)) + "\n|255255255|Gold : " + ad.o.d(), fishing4.a.m.e(), var2, var3);
                     break;
                  case 24:
                     am.a(var1, "This item does not \nrequire repair, or \ncannot be repaired.", fishing4.a.m.e(), var2, var3);
                     break;
                  case 30:
                     am.a(var1, (ac)this.f().get(m));
                     break;
                  case 31:
                     if (bb.e % 3 == 0) {
                        var14 = ".Upgrading.";
                     } else if (bb.e % 3 == 1) {
                        var14 = "..Upgrading..";
                     } else {
                        var14 = "...Upgrading...";
                     }

                     am.a(var1, var14, fishing4.a.m.e(), var2, var3);
                     if (fishing4.a.y.a() - am.h > 3000L) {
                        this.i();
                     }
                     break;
                  case 32:
                     am.a(var1, ((ac)this.f().get(m)).s(), (ac)this.f().get(m));
                     break;
                  case 33:
                     am.a(var1, "Upgrade failed.", fishing4.a.m.e(), var2, var3);
                     break;
                  case 34:
                     am.a(var1, "You need more money.\n\n|255255000|Upgrade cost " + ac.c((ac)this.f().get(m)) + "\n|255255255|Gold : " + ad.o.d(), fishing4.a.m.e(), var2, var3);
                     break;
                  case 35:
                     am.a(var1, "No more upgrade is \navailable.", fishing4.a.m.e(), var2, var3);
                     break;
                  case 36:
                     am.a(var1, "This item cannot be upgraded.", fishing4.a.m.e(), var2, var3);
               }
            }
         }
      }

   }

   // $FF: synthetic method
   static fishing4.a.e[] c(bg var0) {
      return var0.g;
   }

   private void d() {
      boolean var1 = true;
      fishing4.a.e var3 = this.i(1);
      fishing4.a.e var2 = this.f[0];
      if (!fishing4.a.y.a(var2, var3)) {
         var1 = false;
      }

      this.f[0].a(var2);
      if (var1) {
         if (a == 20) {
            this.b(21);
         } else {
            this.b(23);
         }
      }

   }

   private void d(int var1) {
      this.o = var1;
   }

   private fishing4.a.f e(int var1) {
      fishing4.a.f var2;
      switch (this.j) {
         case 0:
            if (globalConfig.languageId == 0) {
               if (var1 == 0) {
                  var2 = fishing4.a.f.a(840.0F, 243.0F, 64.0F, 18.0F);
                  return var2;
               }

               if (var1 == 1) {
                  var2 = fishing4.a.f.a(913.0F, 243.0F, 106.0F, 18.0F);
                  return var2;
               }

               if (var1 == 2) {
                  var2 = fishing4.a.f.a(723.0F, 244.0F, 106.0F, 18.0F);
                  return var2;
               }

               if (var1 == 3) {
                  var2 = fishing4.a.f.a(775.0F, 264.0F, 42.0F, 20.0F);
                  return var2;
               }

               if (var1 == 4) {
                  var2 = fishing4.a.f.a(827.0F, 266.0F, 62.0F, 18.0F);
                  return var2;
               }

               if (var1 == 5) {
                  var2 = fishing4.a.f.a(900.0F, 264.0F, 112.0F, 18.0F);
                  return var2;
               }

               if (var1 == 6) {
                  var2 = fishing4.a.f.a(722.0F, 286.0F, 86.0F, 18.0F);
                  return var2;
               }

               if (var1 == 7) {
                  var2 = fishing4.a.f.a(723.0F, 265.0F, 42.0F, 18.0F);
                  return var2;
               }
            } else {
               if (var1 == 0) {
                  var2 = fishing4.a.f.a(722.0F, 308.0F, 75.0F, 22.0F);
                  return var2;
               }

               if (var1 == 1) {
                  var2 = fishing4.a.f.a(795.0F, 306.0F, 80.0F, 22.0F);
                  return var2;
               }

               if (var1 == 2) {
                  var2 = fishing4.a.f.a(816.0F, 284.0F, 132.0F, 22.0F);
                  return var2;
               }

               if (var1 == 3) {
                  var2 = fishing4.a.f.a(721.0F, 328.0F, 100.0F, 22.0F);
                  return var2;
               }

               if (var1 == 4) {
                  var2 = fishing4.a.f.a(885.0F, 327.0F, 92.0F, 22.0F);
                  return var2;
               }

               if (var1 == 5) {
                  var2 = fishing4.a.f.a(722.0F, 350.0F, 158.0F, 22.0F);
                  return var2;
               }

               if (var1 == 6) {
                  var2 = fishing4.a.f.a(880.0F, 351.0F, 125.0F, 22.0F);
                  return var2;
               }

               if (var1 == 7) {
                  var2 = fishing4.a.f.a(878.0F, 306.0F, 64.0F, 22.0F);
                  return var2;
               }
            }
         case 1:
         case 4:
         case 5:
         default:
            break;
         case 2:
            if (globalConfig.languageId == 0) {
               if (k != 0 && k != 1) {
                  if (var1 == 0) {
                     var2 = fishing4.a.f.a(0.0F, 494.0F, 54.0F, 16.0F);
                     return var2;
                  }

                  if (var1 == 1) {
                     var2 = fishing4.a.f.a(185.0F, 494.0F, 54.0F, 16.0F);
                     return var2;
                  }
               } else {
                  if (var1 == 0) {
                     var2 = fishing4.a.f.a(0.0F, 494.0F, 54.0F, 16.0F);
                     return var2;
                  }

                  if (var1 == 1) {
                     var2 = fishing4.a.f.a(96.0F, 494.0F, 36.0F, 16.0F);
                     return var2;
                  }

                  if (var1 == 2) {
                     var2 = fishing4.a.f.a(185.0F, 494.0F, 54.0F, 16.0F);
                     return var2;
                  }
               }
            } else if (k != 0 && k != 1) {
               if (var1 == 0) {
                  var2 = fishing4.a.f.a(54.0F, 493.0F, 36.0F, 16.0F);
                  return var2;
               }

               if (var1 == 1) {
                  var2 = fishing4.a.f.a(242.0F, 493.0F, 40.0F, 16.0F);
                  return var2;
               }
            } else {
               if (var1 == 0) {
                  var2 = fishing4.a.f.a(54.0F, 493.0F, 36.0F, 16.0F);
                  return var2;
               }

               if (var1 == 1) {
                  var2 = fishing4.a.f.a(132.0F, 493.0F, 44.0F, 16.0F);
                  return var2;
               }

               if (var1 == 2) {
                  var2 = fishing4.a.f.a(242.0F, 493.0F, 40.0F, 16.0F);
                  return var2;
               }
            }
            break;
         case 3:
            if (var1 == 0) {
               if (globalConfig.languageId == 0) {
                  var2 = fishing4.a.f.a(264.0F, 426.0F, 38.0F, 16.0F);
               } else {
                  var2 = fishing4.a.f.a(308.0F, 425.0F, 40.0F, 16.0F);
               }

               return var2;
            }

            if (var1 == 1) {
               if (globalConfig.languageId == 0) {
                  var2 = fishing4.a.f.a(255.0F, 443.0F, 38.0F, 16.0F);
               } else {
                  var2 = fishing4.a.f.a(300.0F, 442.0F, 56.0F, 16.0F);
               }

               return var2;
            }

            if (var1 == 2) {
               if (globalConfig.languageId == 0) {
                  var2 = fishing4.a.f.a(262.0F, 460.0F, 38.0F, 16.0F);
               } else {
                  var2 = fishing4.a.f.a(307.0F, 459.0F, 48.0F, 16.0F);
               }

               return var2;
            }
      }

      var2 = fishing4.a.f.a();
      return var2;
   }

   private void e() {
      if (this.f != null) {
         for(int var1 = 0; var1 < this.f.length; ++var1) {
            this.f[var1] = null;
         }

         this.f = null;
      }

      this.f = new fishing4.a.e[1];
      this.f[0] = fishing4.a.e.a(-149.0F, (float)(fishing4.a.m.b() - 126) - 10.0F);
   }

   private static fishing4.a.f f(int var0) {
      fishing4.a.f var1;
      if (k == var0) {
         var1 = fishing4.a.f.a(658.0F, 354.0F, 140.0F, 122.0F);
      } else {
         var1 = fishing4.a.f.a(800.0F, 354.0F, 118.0F, 102.0F);
      }

      return var1;
   }

   private ArrayList f() {
      ArrayList var1;
      switch (this.j) {
         case 2:
            if (k == 0) {
               if (l == 0) {
                  var1 = ad.r;
                  return var1;
               }

               if (l == 1) {
                  var1 = ad.s;
                  return var1;
               }

               if (l == 2) {
                  var1 = ad.t;
                  return var1;
               }
            } else if (k == 1) {
               if (l == 0) {
                  var1 = ad.i;
                  return var1;
               }

               if (l == 1) {
                  var1 = ad.j;
                  return var1;
               }

               if (l == 2) {
                  var1 = ad.k;
                  return var1;
               }
            } else {
               if (l == 0) {
                  var1 = ad.i;
                  return var1;
               }

               if (l == 1) {
                  var1 = ad.k;
                  return var1;
               }
            }
            break;
         case 3:
            if (k == 0) {
               if (l == 0) {
                  var1 = ad.v;
                  return var1;
               }

               if (l == 1) {
                  var1 = ad.u;
                  return var1;
               }

               if (l == 2) {
                  var1 = ad.w;
                  return var1;
               }
            } else {
               if (l == 0) {
                  var1 = ad.m;
                  return var1;
               }

               if (l == 1) {
                  var1 = ad.l;
                  return var1;
               }

               if (l == 2) {
                  var1 = ad.n;
                  return var1;
               }
            }
      }

      var1 = null;
      return var1;
   }

   private static fishing4.a.f g(int var0) {
      fishing4.a.f var1;
      if (l == var0) {
         var1 = fishing4.a.f.a(134.0F, 588.0F, 132.0F, 88.0F);
      } else {
         var1 = fishing4.a.f.a(1.0F, 589.0F, 130.0F, 86.0F);
      }

      return var1;
   }

   private void g() {
      switch (this.j) {
         case 0:
            if (k == 0) {
               if (fishing4.game.r.g()) {
                  am.b(0);
                  b = 49;
               } else {
                  am.a(0, fishing4.a.g.b(20.0F, 20.0F));
                  b = 40;
                  switch (l) {
                     case 3:
                     case 4:
                     case 5:
                     case 6:
                     case 7:
                        this.o = x.b / 10 % 10;
                        break;
                     default:
                        this.o = x.b % 10;
                  }
               }
            }
            break;
         case 1:
            ag var1;
            if (k == 0) {
               var1 = (ag)ad.q.get(l);
               if (ad.c(var1.a)) {
                  am.b(0);
                  b = 63;
               } else if (ad.o.b() < (long)ag.h(var1.a)) {
                  am.i = 2131034135;
                  am.b(0);
                  b = 62;
               } else if (var1.a == 88) {
                  if (x.a(false) < 4) {
                     am.b(0);
                     b = 92;
                  } else {
                     am.b(1);
                     b = 91;
                  }
               } else {
                  am.b(1);
                  b = 61;
               }
            } else if (k == 1) {
               var1 = (ag)ad.h.get(l);
               if (var1.a != 80 && var1.a != 88) {
                  if (var1.b.size() > 0) {
                     am.b(0);
                     b = 66;
                  } else {
                     am.b(1);
                     b = 65;
                  }
               } else {
                  am.b(0);
                  b = 67;
               }
            } else {
               am.b(3);
               b = 70;
            }
            break;
         case 2:
         case 3:
            if (m < this.f().size() && ((ac)this.f().get(m)).f() != -1) {
               if (k == 0) {
                  if (this.j == 2 && l == 1) {
                     am.b(0);
                     b = 5;
                  } else {
                     am.b(1);
                     b = 0;
                  }
               } else if (k == 1) {
                  if (this.j == 2 && l == 1) {
                     am.b(0);
                     b = 14;
                  } else {
                     am.b(1);
                     b = 10;
                  }
               } else if (k == 2) {
                  if (!((ac)this.f().get(m)).b()) {
                     am.b(0);
                     b = 24;
                  } else {
                     am.b(1);
                     b = 20;
                  }
               } else if (k == 3) {
                  if (((ac)this.f().get(m)).a()) {
                     am.b(1);
                     b = 30;
                  } else {
                     am.b(0);
                     b = 36;
                  }
               }
            }
            break;
         case 4:
            if (m < fishing4.game.w.b.size()) {
               b = 100;
               am.a(1, fishing4.a.g.b(20.0F, 20.0F));
            } else if (m < fishing4.game.w.b.size() + fishing4.game.w.c.size()) {
               b = 101;
               am.a(0, fishing4.a.g.b(20.0F, 20.0F));
            } else {
               b = 102;
               am.a(0, fishing4.a.g.b(20.0F, 20.0F));
            }
            break;
         case 5:
            if (m < fishing4.game.v.b.size()) {
               b = 100;
               am.a(1, fishing4.a.g.b(20.0F, 20.0F));
            } else if (m < fishing4.game.v.b.size() + fishing4.game.v.c.size()) {
               b = 101;
               am.a(0, fishing4.a.g.b(20.0F, 20.0F));
            } else {
               b = 102;
               am.a(0, fishing4.a.g.b(20.0F, 20.0F));
            }
      }

   }

   private fishing4.a.e h(int var1) {
      fishing4.a.e var2;
      if (var1 == k) {
         if (!globalConfig.j || this.j != 3 && this.j != 2) {
            var2 = fishing4.a.e.a(70.0F, (float)(fishing4.a.m.b() - 126));
         } else {
            var2 = fishing4.a.e.a(70.0F, (float)(fishing4.a.m.b() - 126 - 15));
         }
      } else {
         fishing4.a.e var3 = fishing4.a.e.a();
         var2 = j(var1);
         switch (var1) {
            case 0:
               var3.b(0.0F, (float)fishing4.a.m.b());
               break;
            case 1:
               var3.b((float)(-fishing4.a.m.a()), (float)fishing4.a.m.b());
               break;
            case 2:
               var3.b((float)(-fishing4.a.m.a()), (float)(-fishing4.a.m.b()));
               break;
            case 3:
               var3.b(0.0F, (float)(-fishing4.a.m.b()));
         }

         var2 = fishing4.a.e.a(var2, var3);
      }

      return var2;
   }

   private void h() {
      if (!am.e()) {
         int var1;
         if (this.j == 4) {
            if (k == 0) {
               if (b == 100) {
                  fishing4.game.w.a[(Integer)fishing4.game.w.b.get(m)].c = 2;
                  this.b(44);
                  am.b();
               } else if (b == 101) {
                  am.b();
               } else if (b == 102) {
                  var1 = m - fishing4.game.w.b.size() - fishing4.game.w.c.size();
                  if (fishing4.game.w.a[(Integer)fishing4.game.w.d.get(var1)].d()) {
                     fishing4.game.q.c(17);
                     am.b();
                     fishing4.game.k.a(true, (Integer)fishing4.game.w.d.get(var1));
                     this.b(44);
                  } else {
                     am.a(0, fishing4.a.g.a(18.0F));
                     b = 103;
                  }
               } else if (b == 103) {
                  am.b();
               }
            } else if (k == 1) {
               if (b == 110) {
                  fishing4.game.r.a(fishing4.game.r.b(0, m));
                  am.a(0, fishing4.a.g.a(20.0F));
                  b = 111;
               } else if (b == 111) {
                  am.b();
               } else if (b == 112) {
                  if (fishing4.game.r.i()) {
                     fishing4.game.q.c(15);
                     fishing4.game.r.a();
                     am.b();
                  } else {
                     am.b(0);
                     b = 113;
                  }
               } else if (b == 113) {
                  am.b();
               } else if (b == 114) {
                  am.b();
               } else if (b == 115) {
                  fishing4.game.r.a();
                  am.b();
               }
            }
         } else if (this.j == 5) {
            if (k == 0) {
               if (b == 100) {
                  fishing4.game.v.a[(Integer)fishing4.game.v.b.get(m)].c = 2;
                  this.b(44);
                  am.b();
               } else if (b == 101) {
                  am.b();
               } else if (b == 102) {
                  var1 = m - fishing4.game.v.b.size() - fishing4.game.v.c.size();
                  if (fishing4.game.v.a[(Integer)fishing4.game.v.d.get(var1)].d()) {
                     fishing4.game.q.c(17);
                     am.b();
                     fishing4.game.k.a(false, (Integer)fishing4.game.v.d.get(var1));
                     this.b(44);
                  } else {
                     b = 103;
                     am.a(0, fishing4.a.g.a(18.0F));
                  }
               }
            } else if (k == 1) {
               if (b == 110) {
                  fishing4.game.r.a(fishing4.game.r.b(1, m));
                  am.a(0, fishing4.a.g.a(20.0F));
                  b = 111;
               } else if (b == 111) {
                  am.b();
               } else if (b == 112) {
                  if (fishing4.game.r.i()) {
                     fishing4.game.q.c(15);
                     fishing4.game.r.a();
                     am.b();
                  } else {
                     am.b(0);
                     b = 113;
                  }
               } else if (b == 113) {
                  am.b();
               } else if (b == 114) {
                  am.b();
               } else if (b == 115) {
                  fishing4.game.r.a();
                  am.b();
               }
            }
         } else if (this.j == 0) {
            if (k == 0) {
               if (b == 48) {
                  am.b();
                  a(l, m);
               }
            } else if (k == 1) {
               if (b == 41) {
                  b = 46;
                  am.b(2);
               } else if (b == 42) {
                  b = 47;
                  am.b(2);
               }
            }
         } else if (this.j == 1) {
            ag var2;
            if (k == 0) {
               var2 = (ag)ad.q.get(l);
            } else {
               var2 = (ag)ad.h.get(l);
            }

            if (k == 0) {
               if (b == 61) {
                  am.i = 2131034116;
                  am.b(0);
                  ad.d(((ag)ad.q.get(l)).a);
                  b = 64;
               } else if (b == 91) {
                  am.b(1);
                  b = 61;
               }
            } else if (b == 65) {
               am.b(2);
               b = 68;
            } else {
               ag var3;
               if (b == 71) {
                  var3 = (ag)ad.h.get(l);
                  if (var3.a == 88 && ad.p.b() < (long)var3.i(var3.c + 1)) {
                     am.a(180);
                  } else if (var3.a != 88 && ad.o.b() < (long)var3.i(var3.c + 1)) {
                     am.i = 2131034135;
                     am.b(0);
                     b = 75;
                  } else {
                     am.b(2);
                     b = 72;
                     if (var2.a == 88) {
                        aq.b = 17;
                        fishing4.game.k.o();
                     }
                  }
               } else if (b == 76) {
                  var3 = (ag)ad.h.get(l);
                  if (var3.a == 88 && ad.p.b() < (long)var3.i(var3.d + 1)) {
                     am.a(180);
                  } else if (var3.a != 88 && ad.o.b() < (long)var3.i(var3.d + 1)) {
                     am.i = 2131034135;
                     am.b(0);
                     b = 80;
                  } else {
                     am.b(2);
                     b = 77;
                     if (var2.a == 88) {
                        aq.b = 17;
                        fishing4.game.k.o();
                     }
                  }
               } else if (b == 81) {
                  var2 = (ag)ad.h.get(l);
                  if (ad.o.b() < (long)ag.g(var2.e)) {
                     am.i = 2131034135;
                     am.b(0);
                     b = 85;
                  } else {
                     am.b(2);
                     b = 82;
                  }
               }
            }
         } else if (this.j == 2 || this.j == 3) {
            ac var4 = (ac)this.f().get(m);
            if (k == 0) {
               if (ad.o.b() < (long)ac.d(var4.f()) * this.r.encrypt()) {
                  am.i = 2131034135;
                  am.b(0);
                  b = 3;
               } else if (ad.a(var4.f(), this.r.encrypt(), false)) {
                  am.b(2);
                  b = 1;
                  am.h = System.currentTimeMillis();
               } else {
                  am.b(0);
                  b = 4;
               }
            } else if (k == 1) {
               am.b(2);
               b = 11;
               am.h = System.currentTimeMillis();
            } else if (k == 2) {
               if (var4.f() != 120 && var4.f() != 121 && var4.f() != 122) {
                  if (ad.o.b() < (long)var4.k()) {
                     am.b(0);
                     b = 23;
                  } else {
                     am.b(2);
                     b = 21;
                  }
               } else if (ad.p.b() < (long)var4.k()) {
                  am.a(180);
               } else {
                  am.b(2);
                  b = 21;
                  aq.b = 18;
                  fishing4.game.k.o();
               }
            } else if (k == 3) {
               if (ad.o.b() < (long)var4.l()) {
                  am.i = 2131034135;
                  am.b(0);
                  b = 34;
               } else if (!var4.a()) {
                  am.b(0);
                  b = 36;
               } else {
                  ad.o.d((long)var4.l());
                  am.i = 2131034143;
                  am.b(2);
                  b = 31;
                  am.h = fishing4.a.y.a();
               }
            }
         }
      }

   }

   private fishing4.a.e i(int var1) {
      fishing4.a.e var4 = fishing4.a.e.a();
      fishing4.a.e var5 = this.e[k];
      float var3 = this.h.b.b;
      float var2 = this.i.b.b;
      var4.b(var5.a + 100.0F + (float)(var1 * 100), var5.b - (var3 - var2) / 2.0F);
      return var4;
   }

   private void i() {
      ac var4 = (ac)this.f().get(m);
      int var2 = fishing4.a.z.a(100);
      int var1 = var4.m();
      fishing4.b.d var3 = fishing4.b.d.a();
      fishing4.a.s.a();
      var3.a(2131034143);
      if (var1 > var2) {
         am.i = 2131034145;
         am.b(0);
         b = 32;
         var4.n();
         fishing4.game.q.c(7);
         if (var4.f() == 119 && var4.d() >= 9) {
            fishing4.game.q.c(9);
         }
      } else {
         am.i = 2131034144;
         am.b(0);
         b = 33;
         var4.o();
         fishing4.game.q.c(8);
      }

      fishing4.game.k.f();
   }

   private static fishing4.a.e j(int var0) {
      fishing4.a.e var1;
      switch (var0) {
         case 0:
            var1 = fishing4.a.e.a(217.0F, 570.0F);
            break;
         case 1:
            var1 = fishing4.a.e.a(120.0F, 512.0F);
            break;
         case 2:
            var1 = fishing4.a.e.a(120.0F, 398.0F);
            break;
         case 3:
            var1 = fishing4.a.e.a(217.0F, 338.0F);
            break;
         default:
            var1 = fishing4.a.e.a();
      }

      return var1;
   }

   private void k(int var1) {
      this.e = new fishing4.a.e[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         this.e[var2] = this.h(var2);
      }

   }

   private void l(int var1) {
      this.f = null;
      this.f = new fishing4.a.e[var1];

      for(int var2 = 0; var2 < var1; ++var2) {
         if (!globalConfig.j || this.j != 3 && this.j != 2) {
            this.f[var2] = fishing4.a.e.a(-66.0F, (float)(fishing4.a.m.b() - 126) - 10.0F);
         } else {
            this.f[var2] = fishing4.a.e.a(-66.0F, (float)(fishing4.a.m.b() - 126) - 10.0F - 15.0F);
         }
      }

   }

   private void m(int var1) {
      byte var2 = 0;
      if (var1 >= 0 && var1 < this.f.length) {
         l = var1;
         n = 0;
         m = 0;
         this.r.encryptLong(1L);
         if (this.g != null) {
            for(var1 = 0; var1 < this.g.length; ++var1) {
               this.g[var1] = null;
            }

            this.g = null;
         }

         switch (this.j) {
            case 2:
               if (k == 0) {
                  if (l == 0) {
                     this.g = new fishing4.a.e[24];
                  } else if (l == 1) {
                     this.g = new fishing4.a.e[24];
                  } else if (l == 2) {
                     this.g = new fishing4.a.e[12];
                  }
               } else if (k == 1) {
                  if (l == 0) {
                     this.g = new fishing4.a.e[36];
                  } else if (l == 1) {
                     this.g = new fishing4.a.e[36];
                  } else if (l == 2) {
                     this.g = new fishing4.a.e[36];
                  }
               } else if (l == 0) {
                  this.g = new fishing4.a.e[36];
               } else if (l == 1) {
                  this.g = new fishing4.a.e[36];
               }
               break;
            case 3:
               if (k == 0) {
                  if (l == 0) {
                     this.g = new fishing4.a.e[12];
                  } else if (l == 1) {
                     this.g = new fishing4.a.e[12];
                  } else if (l == 2) {
                     this.g = new fishing4.a.e[12];
                  }
               } else if (l == 0) {
                  this.g = new fishing4.a.e[36];
               } else if (l == 1) {
                  this.g = new fishing4.a.e[36];
               } else if (l == 2) {
                  this.g = new fishing4.a.e[36];
               }
         }

         if (this.g != null) {
            for(var1 = var2; var1 < this.g.length; ++var1) {
               fishing4.a.e var3 = b(var1, n);
               this.g[var1] = fishing4.a.e.a(var3.a, var3.b);
            }
         }
      }

   }

   private void n(int var1) {
      if (var1 >= 0 && var1 < 12) {
         this.o = n * 12 + var1;
      }

   }

   private void o(int var1) {
      boolean var2 = true;
      am.b();
      switch (this.j) {
         case 0:
            if (k == 1) {
               if (var1 == 41 && ((m)((ag)ad.h.get(l)).b.get(m)).c) {
                  am.b(0);
                  b = 43;
               } else if (var1 == 42 && ((ag)ad.h.get(l)).c() <= 0) {
                  am.b(0);
                  b = 44;
               } else {
                  am.b(1);
                  b = var1;
               }
            }
            break;
         case 1:
            if (k == 2) {
               ag var3 = (ag)ad.h.get(l);
               if (var1 == 71) {
                  if (var3.c >= 5) {
                     am.b(0);
                     b = 74;
                  } else {
                     am.a(1, fishing4.a.g.a(20.0F));
                     b = var1;
                  }
               } else if (var1 == 76) {
                  if (var3.d < 5 && var3.a != 87) {
                     am.a(1, fishing4.a.g.a(20.0F));
                     b = var1;
                  } else {
                     am.b(0);
                     b = 79;
                  }
               } else if (var1 == 81) {
                  if (var3.e >= 4) {
                     am.b(0);
                     b = 84;
                  } else {
                     am.a(1, fishing4.a.g.a(20.0F));
                     b = var1;
                  }
               }
            }
         case 2:
         case 3:
         default:
            break;
         case 4:
         case 5:
            if (k == 1) {
               if (var1 == 110) {
                  am.b(1);
                  b = var1;
               } else if (var1 == 111) {
                  am.a(0, fishing4.a.g.a(20.0F));
                  b = var1;
               } else if (var1 == 112) {
                  am.b(0);
                  b = var1;
                  if (this.j == 4) {
                     var2 = true;
                  } else {
                     var2 = false;
                  }

                  fishing4.game.k.a(var2, m + 1, true);
               } else if (var1 == 115) {
                  am.b(0);
                  b = var1;
                  if (this.j != 4) {
                     var2 = false;
                  }

                  fishing4.game.k.a(var2, m + 1, false);
               } else {
                  am.b(0);
                  b = var1;
               }
            }
      }

   }

   public final void a(fishing4.a.e var1) {
      switch (a) {
         case 0:
         case 1:
         case 21:
         case 24:
         case 31:
         case 40:
         case 41:
            if (am.e) {
               if (am.a == 1) {
                  if (!am.c.a(var1, false)) {
                     am.d.a(var1, false);
                  }
               } else {
                  am.c.a(var1, false);
               }
            } else if ((a != 1 || this.g == null || m >= this.f().size()) && a != 21 && a != 31) {
               if (a == 24 && ((ag)ad.h.get(l)).b.size() > 0 && !this.t.a(var1, false) && this.u.a(var1, false)) {
               }
            } else if (this.s.a(var1, false)) {
            }
         default:
      }
   }

   public final void a(GL10 var1, fishing4.a.w var2, fishing4.a.w var3, fishing4.a.w var4, fishing4.a.w var5, fishing4.a.w var6, fishing4.a.w var7, fishing4.a.w var8, fishing4.a.w var9, fishing4.a.w var10, int var11) {
      if (this.o != -1) {
         m = this.o;
      }

      if (this.p != -1) {
         n = this.p;
      }

      this.o = -1;
      this.p = -1;
      if (this.q != -1) {
         this.m(this.q);
         this.q = -1;
      }

      float var12;
      int var14;
      boolean var15;
      fishing4.a.e var17;
      fishing4.a.e var18;
      boolean var27;
      int var28;
      switch (a) {
         case 10:
            var27 = true;

            for(var28 = 0; var28 < this.e.length; ++var28) {
               var18 = j(var28);
               var17 = this.e[var28];
               if (!fishing4.a.y.a(var17, var18)) {
                  var27 = false;
               }

               this.e[var28].a(var17);
            }

            label523: {
               if (this.j != 0 && this.j != 1 && this.j != 4) {
                  var15 = var27;
                  if (this.j != 5) {
                     break label523;
                  }
               }

               var18 = be.a(this.j);
               var17 = be.b;
               if (!fishing4.a.y.a(var17, var18)) {
                  var27 = false;
               }

               be.b.a(var17);
               var15 = var27;
            }

            if (var15) {
               if (bb.c == 2) {
                  bb.a(3);
               }

               this.b(0);
            }
            break;
         case 11:
            var15 = true;

            for(var14 = 0; var14 < this.f.length; ++var14) {
               float var13 = this.h.b.b;
               var12 = this.i.b.b;
               var18 = fishing4.a.e.a(-this.i.b.a / 2.0F, (float)(fishing4.a.m.b() - 126) - (var13 - var12) / 2.0F);
               var17 = this.f[var14];
               if (!fishing4.a.y.a(var17, var18)) {
                  var15 = false;
               }

               this.f[var14].a(var17);
            }

            if (var15) {
               this.b(10);
            }
            break;
         case 12:
            var27 = true;

            for(var28 = 0; var28 < this.e.length; ++var28) {
               var18 = this.h(var28);
               var17 = this.e[var28];
               if (!fishing4.a.y.a(var17, var18)) {
                  var27 = false;
               }

               this.e[var28].a(var17);
            }

            label530: {
               if (this.j != 0 && this.j != 1 && this.j != 4) {
                  var15 = var27;
                  if (this.j != 5) {
                     break label530;
                  }
               }

               var18 = be.a(this.j);
               var17 = be.b;
               if (!fishing4.a.y.a(var17, var18)) {
                  var27 = false;
               }

               be.b.a(var17);
               var15 = var27;
            }

            if (var15) {
               if (this.j != 5 && this.j != 4) {
                  if (this.j == 0) {
                     if (k == 0) {
                        l = x.a;
                        this.b(20);
                     } else {
                        if (x.b < 0 || x.b / 100 % 10 >= ad.h.size()) {
                           c(ad.h.size() - 1);
                        }

                        l = x.b / 100 % 10;
                        this.b(22);
                     }
                  } else if (this.j == 1) {
                     l = 0;
                     this.b(31);
                  } else {
                     this.b(13);
                  }
               } else if (k == 0) {
                  l = 0;
                  this.b(44);
               } else {
                  l = 0;
                  this.b(41);
               }
            }

            if (bb.d(this.j)) {
               bb.e(this.j);
            }
            break;
         case 13:
            var15 = true;

            for(var14 = 0; var14 < this.f.length; ++var14) {
               var17 = this.i(var14);
               var18 = this.f[var14];
               if (!fishing4.a.y.a(var18, var17)) {
                  var15 = false;
               }

               this.f[var14].a(var18);
            }

            if (var15) {
               this.b(1);
            }
            break;
         case 14:
            this.c();
            break;
         case 15:
            this.c();
            break;
         case 20:
            this.d();
            break;
         case 22:
            this.d();
            if (fishing4.game.m.f != null) {
               fishing4.a.w.a(var1, fishing4.game.m.f);
               fishing4.game.m.f = null;
            }
            break;
         case 23:
            if (fishing4.game.m.f != null) {
               fishing4.a.w.a(var1, fishing4.game.m.f);
               fishing4.game.m.f = null;
            }

            if (((ag)ad.h.get(l)).b.size() <= 0) {
               this.b(24);
            }
            break;
         case 44:
            if (this.j == 4) {
               y.b();
               fishing4.game.w.a();
            } else if (this.j == 5) {
               y.c();
               fishing4.game.v.a();
            }

            a = 40;
      }

      var14 = bb.e;
      fishing4.game.k.c();
      if (this.f != null) {
         if (this.j == 0) {
            fishing4.a.m.a(var1, var2, this.f[0], fishing4.a.f.a(300.0F, 937.0F, 302.0F, 86.0F), '\u0002');
            fishing4.a.m.a(var1, var2, this.f[0], fishing4.a.f.a(0.0F, 937.0F, 298.0F, 88.0F), '\u0001');
            if (k == 0) {
               fishing4.a.m.a(var1, var3, this.f[0], this.e(l), '\b');
            } else if (l >= 0 && l < ad.h.size()) {
               fishing4.a.ae.a(var1, ab.c(((ag)ad.h.get(l)).a), this.f[0].a, this.f[0].b, (float)fishing4.a.m.a(), 28.0F, 26.0F, 4, fishing4.a.aa.a(1.0F, 1.0F, 0.0F, 1.0F));
            }
         } else {
            for(var14 = 0; var14 < this.f.length; ++var14) {
               if (l == var14) {
                  fishing4.a.m.a(var1, var2, this.f[var14], g(var14), '\u0001');
               } else {
                  fishing4.a.m.a(var1, var2, this.f[var14], g(var14), '\u0002');
               }

               fishing4.a.m.a(var1, var3, this.f[var14], this.e(var14), '\b');
               fishing4.a.m.a(var1, var2, this.f[var14], this.i, '\u0001');
            }
         }
      }

      for(var14 = 0; var14 < this.e.length; ++var14) {
         if (k == var14) {
            fishing4.a.m.a(var1, var2, this.e[var14].a - 1.0F, this.e[var14].b + 1.0F, f(var14), '\u0001');
         } else {
            fishing4.a.m.a(var1, var2, this.e[var14].a - 1.0F, this.e[var14].b + 1.0F, f(var14), '\u0002');
         }

         fishing4.a.f var29;
         label444: {
            var18 = this.e[var14];
            switch (this.j) {
               case 0:
                  if (var14 == 0) {
                     if (globalConfig.languageId == 0) {
                        var29 = fishing4.a.f.a(141.0F, 407.0F, 40.0F, 16.0F);
                     } else {
                        var29 = fishing4.a.f.a(189.0F, 407.0F, 90.0F, 16.0F);
                     }
                     break label444;
                  }

                  if (var14 == 1) {
                     if (globalConfig.languageId == 0) {
                        var29 = fishing4.a.f.a(0.0F, 425.0F, 106.0F, 16.0F);
                     } else {
                        var29 = fishing4.a.f.a(116.0F, 425.0F, 112.0F, 16.0F);
                     }
                     break label444;
                  }
                  break;
               case 1:
                  if (var14 == 0) {
                     if (globalConfig.languageId == 0) {
                        var29 = fishing4.a.f.a(0.0F, 443.0F, 78.0F, 16.0F);
                     } else {
                        var29 = fishing4.a.f.a(0.0F, 461.0F, 92.0F, 16.0F);
                     }
                     break label444;
                  }

                  if (var14 == 1) {
                     if (globalConfig.languageId == 0) {
                        var29 = fishing4.a.f.a(89.0F, 443.0F, 76.0F, 16.0F);
                     } else {
                        var29 = fishing4.a.f.a(105.0F, 461.0F, 106.0F, 16.0F);
                     }
                     break label444;
                  }

                  if (var14 == 2) {
                     if (globalConfig.languageId == 0) {
                        var29 = fishing4.a.f.a(177.0F, 443.0F, 76.0F, 16.0F);
                     } else {
                        var29 = fishing4.a.f.a(285.0F, 494.0F, 70.0F, 16.0F);
                     }
                     break label444;
                  }
                  break;
               case 2:
                  if (var14 == 0) {
                     if (globalConfig.languageId == 0) {
                        var29 = fishing4.a.f.a(0.0F, 369.0F, 38.0F, 16.0F);
                     } else {
                        var29 = fishing4.a.f.a(47.0F, 369.0F, 44.0F, 16.0F);
                     }
                     break label444;
                  }

                  if (var14 == 1) {
                     if (globalConfig.languageId == 0) {
                        var29 = fishing4.a.f.a(99.0F, 369.0F, 38.0F, 16.0F);
                     } else {
                        var29 = fishing4.a.f.a(146.0F, 369.0F, 54.0F, 16.0F);
                     }
                     break label444;
                  }

                  if (var14 == 2) {
                     if (globalConfig.languageId == 0) {
                        var29 = fishing4.a.f.a(208.0F, 369.0F, 38.0F, 16.0F);
                     } else {
                        var29 = fishing4.a.f.a(257.0F, 369.0F, 78.0F, 16.0F);
                     }
                     break label444;
                  }

                  if (var14 == 3) {
                     if (globalConfig.languageId == 0) {
                        var29 = fishing4.a.f.a(0.0F, 387.0F, 40.0F, 18.0F);
                     } else {
                        var29 = fishing4.a.f.a(48.0F, 388.0F, 96.0F, 16.0F);
                     }
                     break label444;
                  }
                  break;
               case 3:
                  if (var14 == 0) {
                     if (globalConfig.languageId == 0) {
                        var29 = fishing4.a.f.a(0.0F, 369.0F, 38.0F, 16.0F);
                     } else {
                        var29 = fishing4.a.f.a(47.0F, 369.0F, 44.0F, 16.0F);
                     }
                     break label444;
                  }

                  if (var14 == 1) {
                     if (globalConfig.languageId == 0) {
                        var29 = fishing4.a.f.a(99.0F, 369.0F, 38.0F, 16.0F);
                     } else {
                        var29 = fishing4.a.f.a(146.0F, 369.0F, 54.0F, 16.0F);
                     }
                     break label444;
                  }

                  if (var14 == 2) {
                     if (globalConfig.languageId == 0) {
                        var29 = fishing4.a.f.a(208.0F, 369.0F, 38.0F, 16.0F);
                     } else {
                        var29 = fishing4.a.f.a(257.0F, 369.0F, 78.0F, 16.0F);
                     }
                     break label444;
                  }
                  break;
               case 4:
               case 5:
                  if (var14 == 0) {
                     if (globalConfig.languageId == 0) {
                        var29 = fishing4.a.f.a(152.0F, 387.0F, 60.0F, 16.0F);
                     } else {
                        var29 = fishing4.a.f.a(219.0F, 388.0F, 70.0F, 16.0F);
                     }
                     break label444;
                  }

                  if (var14 == 1) {
                     if (globalConfig.languageId == 0) {
                        var29 = fishing4.a.f.a(0.0F, 407.0F, 38.0F, 16.0F);
                     } else {
                        var29 = fishing4.a.f.a(48.0F, 407.0F, 92.0F, 16.0F);
                     }
                     break label444;
                  }
            }

            var29 = fishing4.a.f.a();
         }

         fishing4.a.m.a(var1, var3, var18, var29, '\b');
         fishing4.a.m.a(var1, var2, this.e[var14], this.h, '\u0001');
      }

      fishing4.a.e var25;
      label410:
      switch (this.j) {
         case 0:
            switch (a) {
               case 20:
               case 21:
                  this.a(var1, var2, var3, var5, var6, var10, var11);
                  break label410;
               case 22:
               case 23:
               case 24:
                  if (a == 24 || a == 23) {
                     ag var24 = (ag)ad.h.get(l);
                     var14 = var11 / 2;
                     if (ad.h.size() > 1) {
                        fishing4.a.m.a(var1, var3, (float)(fishing4.a.m.a() - 30), this.f[0].b - 17.0F, 335.0F, 333.0F, 54.0F, 54.0F);
                     }

                     am.a(var1, fishing4.a.m.d() - 40.0F, var14 % 10);
                     if (var24.b.size() <= 0) {
                        if (globalConfig.languageId == 0) {
                           fishing4.a.ae.a(var1, "이 배에는 물고기가 없습니다", fishing4.a.m.c(), 110.0F + fishing4.a.m.d(), 350.0F, 28.0F, 26.0F, 4, fishing4.a.aa.a(1.0F, 1.0F, 1.0F, 1.0F));
                        } else {
                           fishing4.a.ae.a(var1, "There's no fish on board", fishing4.a.m.c(), 110.0F + fishing4.a.m.d(), 350.0F, 28.0F, 26.0F, 4, fishing4.a.aa.a(1.0F, 1.0F, 1.0F, 1.0F));
                        }
                     } else {
                        if (var24.b.get(m) != null) {
                           fishing4.a.m.a(var1, az.v, fishing4.a.m.c() + 140.0F - 28.0F, 70.0F + fishing4.a.m.d() + 110.0F, 350.0F, 458.0F, 20.0F, 44.0F, '\b');
                           fishing4.a.m.a(var1, az.v, fishing4.a.m.c() + 140.0F - 18.0F, 70.0F + fishing4.a.m.d() + 110.0F, 372.0F, 458.0F, 20.0F, 44.0F, '\b');
                           fishing4.a.m.a(var1, az.v, fishing4.a.m.c() + 140.0F - 0.0F, 70.0F + fishing4.a.m.d() + 110.0F, 396.0F, 458.0F, 20.0F, 44.0F, '\b');
                           fishing4.a.m.a(var1, az.v, 20.0F + fishing4.a.m.c() + 140.0F, 70.0F + fishing4.a.m.d() + 110.0F, 420.0F, 458.0F, 24.0F, 44.0F, '\b');
                           fishing4.a.m.a(var1, az.v, 34.0F + fishing4.a.m.c() + 140.0F, 70.0F + fishing4.a.m.d() + 110.0F, 446.0F, 458.0F, 32.0F, 44.0F, '\b');
                           fishing4.a.m.a(var1, var9, fishing4.a.m.c(), fishing4.a.m.d() + 110.0F - 93.0F + 31.0F, 2.0F, 451.0F, 198.0F, 60.0F, '\u0002');
                           ((m)var24.b.get(m)).a(var1, var2, var9, fishing4.a.m.c(), fishing4.a.m.d() + 110.0F, var11);
                           var25 = fishing4.a.e.c(15.0F + var5.c.a / 2.0F, var5.c.b / 2.0F + 15.0F);
                           fishing4.a.m.a(var1, var5, var25, 190);
                           this.t.a(var1, var2, var3, fishing4.a.e.a(var25.a - 60.0F, 55.0F));
                           this.u.a(var1, var2, var3, fishing4.a.e.a(var25.a + 60.0F, 55.0F));
                           fishing4.a.ae.a(var1, ((m)var24.b.get(m)).e(), var25.a, 140.0F + var25.b, var5.c.a - 40.0F, var5.c.b, 26.0F, 4, fishing4.a.aa.a(1.0F, 1.0F, 0.0F, 1.0F));
                           fishing4.a.m.a(var1, var2, var25.a, 290.0F, 493.0F, 496.0F, 352.0F, 4.0F, fishing4.a.g.b(0.6F), '\u0001');
                           at.a(var1, var3, m + 1, var24.b.size(), fishing4.a.e.a(fishing4.a.m.c() + 180.0F, fishing4.a.m.d() + 110.0F - 93.0F + 20.0F));
                           ad.o.a(var1, fishing4.a.e.a(var25.a, 100.0F), var3);
                           fishing4.a.m.a(var1, var2, var25.a, 130.0F, 493.0F, 496.0F, 352.0F, 4.0F, fishing4.a.g.b(0.6F), '\u0001');
                           fishing4.a.ae.a(var1, fishing4.a.y.a(2131165237), var25.a, 260.0F, var5.c.a - 50.0F, 30.0F, 24.0F, 0);
                           if (globalConfig.languageId == 0) {
                              fishing4.a.ae.a(var1, ((m)var24.b.get(m)).i() + "cm (" + ((m)var24.b.get(m)).g() + ")", var25.a, 260.0F, var5.c.a - 50.0F, 30.0F, 24.0F, 1, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                           } else {
                              fishing4.a.ae.a(var1, bb.i.format((double)((m)var24.b.get(m)).i() / 2.54) + "in. (" + ((m)var24.b.get(m)).g() + ")", var25.a, 260.0F, var5.c.a - 50.0F, 30.0F, 24.0F, 1, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                           }

                           fishing4.a.ae.a(var1, fishing4.a.y.a(2131165238), var25.a, 220.0F, var5.c.a - 50.0F, 26.0F, 24.0F, 0);
                           fishing4.a.ae.a(var1, ((m)var24.b.get(m)).l(), var25.a, 220.0F, var5.c.a - 50.0F, 90.0F, 24.0F, 6, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                        }

                        fishing4.game.k.a(var1, fishing4.a.e.a(fishing4.a.m.c(), fishing4.a.m.d() + 110.0F), 210.0F, var11);
                     }
                  }
               default:
                  break label410;
            }
         case 1:
            switch (a) {
               case 30:
               case 31:
                  var25 = fishing4.a.e.a(fishing4.a.m.c(), fishing4.a.m.d() + 140.0F);
                  fishing4.a.m.a(var1, var2, var25, fishing4.a.f.a(0.0F, 371.0F, 314.0F, 154.0F), '\u0001');
                  fishing4.a.e var23 = fishing4.a.e.a(fishing4.a.m.c(), var5.c.b / 2.0F + 40.0F);
                  an.a(var1, var5, var23, fishing4.a.g.b(1.5F));
                  var12 = (var5.c.a - 40.0F) * 1.5F + 40.0F;
                  ag var26;
                  if (k == 0) {
                     var26 = (ag)ad.q.get(l);
                     var26.a(var1, var7, var10, var25.a, var25.b);
                     fishing4.game.k.a(var1, var25, 180.0F, var11);
                     if (ad.c(var26.a)) {
                        if (globalConfig.languageId == 0) {
                           fishing4.a.ae.a(var1, ab.c(var26.a) + " (보유중)", var23.a, 150.0F + var23.b, var12 - 60.0F, var5.c.b, 26.0F, 4, fishing4.a.aa.a(1.0F, 1.0F, 0.0F, 1.0F));
                        } else {
                           fishing4.a.ae.a(var1, ab.c(var26.a) + " (In possession)", var23.a, 150.0F + var23.b, var12 - 60.0F, var5.c.b, 26.0F, 4, fishing4.a.aa.a(1.0F, 1.0F, 0.0F, 1.0F));
                        }
                     } else {
                        fishing4.a.ae.a(var1, ab.c(var26.a), var23.a, 150.0F + var23.b, var12 - 60.0F, var5.c.b, 26.0F, 4, fishing4.a.aa.a(1.0F, 1.0F, 0.0F, 1.0F));
                     }

                     fishing4.a.m.a(var1, var2, var23.a, var23.b + 120.0F, 493.0F, 496.0F, 352.0F, 4.0F, '\u0001');
                     fishing4.a.ae.a(var1, fishing4.a.y.a(2131165235) + " (Lv." + var26.c + ")", var23.a, 90.0F + var23.b, var12 - 60.0F, var5.c.b, 24.0F, 0, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                     if (globalConfig.languageId == 0) {
                        fishing4.a.ae.a(var1, var26.j() + "마리", var23.a, 90.0F + var23.b, var12 - 60.0F, var5.c.b, 24.0F, 1);
                     } else {
                        fishing4.a.ae.a(var1, String.valueOf(var26.j()), var23.a, 90.0F + var23.b, var12 - 60.0F, var5.c.b, 24.0F, 1);
                     }

                     fishing4.a.ae.a(var1, fishing4.a.y.a(2131165236) + " (Lv." + var26.d + ")", var23.a, 55.0F + var23.b, var12 - 60.0F, var5.c.b, 24.0F, 0, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                     fishing4.a.ae.a(var1, var26.h(), var23.a, 55.0F + var23.b, var12 - 60.0F, var5.c.b, 24.0F, 1);
                     var26.a(var1, var8, var23.a - (var12 - 130.0F) / 2.0F, var23.b, var11, fishing4.a.g.a(0.75F));
                     fishing4.a.ae.a(var1, ag.e(var26.e), var23.a, var23.b, var12 - 60.0F, var5.c.b, 24.0F, 4);
                     fishing4.a.ae.a(var1, ag.f(var26.e), var23.a, var23.b, var12 - 60.0F, var5.c.b, 24.0F, 1);
                     fishing4.a.ae.a(var1, fishing4.a.y.a(2131165241), var23.a, var23.b - 75.0F, var12 - 60.0F, var5.c.b, 24.0F, 0, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                     fishing4.a.ae.a(var1, var26.r(), var23.a, var23.b - 75.0F, var12 - 60.0F, var5.c.b, 24.0F, 1);
                     ad.o.a(var1, fishing4.a.e.a(var23.a, var23.b - 105.0F), var3);
                     fishing4.a.m.a(var1, var2, var23.a, var23.b - 45.0F, 493.0F, 496.0F, 352.0F, 4.0F, '\u0001');
                  } else {
                     if (k != 1 && k != 2) {
                        break label410;
                     }

                     var26 = (ag)ad.h.get(l);
                     var26.a(var1, var7, var10, var25.a, var25.b);
                     if (ad.h.size() > 1) {
                        fishing4.game.k.a(var1, var25, 180.0F, var11);
                     }

                     fishing4.a.ae.a(var1, ab.c(var26.a), var23.a, 150.0F + var23.b, var12 - 60.0F, var5.c.b, 26.0F, 4, fishing4.a.aa.a(1.0F, 1.0F, 0.0F, 1.0F));
                     fishing4.a.m.a(var1, var2, var23.a, var23.b + 120.0F, 493.0F, 496.0F, 352.0F, 4.0F, '\u0001');
                     fishing4.a.ae.a(var1, fishing4.a.y.a(2131165235) + " (Lv." + var26.c + ")", var23.a, 90.0F + var23.b, var12 - 60.0F, var5.c.b, 24.0F, 0, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                     if (globalConfig.languageId == 0) {
                        fishing4.a.ae.a(var1, var26.j() + "마리", var23.a, 90.0F + var23.b, var12 - 60.0F, var5.c.b, 24.0F, 1);
                     } else {
                        fishing4.a.ae.a(var1, String.valueOf(var26.j()), var23.a, 90.0F + var23.b, var12 - 60.0F, var5.c.b, 24.0F, 1);
                     }

                     fishing4.a.ae.a(var1, fishing4.a.y.a(2131165236) + " (Lv." + var26.d + ")", var23.a, 55.0F + var23.b, var12 - 60.0F, var5.c.b, 24.0F, 0, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                     fishing4.a.ae.a(var1, var26.h(), var23.a, 55.0F + var23.b, var12 - 60.0F, var5.c.b, 24.0F, 1);
                     var26.a(var1, var8, var23.a - (var12 - 130.0F) / 2.0F, var23.b, var11, fishing4.a.g.a(0.75F));
                     fishing4.a.ae.a(var1, ag.e(var26.e), var23.a, var23.b, var12 - 60.0F, var5.c.b, 24.0F, 4);
                     fishing4.a.ae.a(var1, ag.f(var26.e), var23.a, var23.b, var12 - 60.0F, var5.c.b, 24.0F, 1);
                     fishing4.a.m.a(var1, var2, var23.a, var23.b - 45.0F, 493.0F, 496.0F, 352.0F, 4.0F, '\u0001');
                     if (k == 1) {
                        fishing4.a.ae.a(var1, fishing4.a.y.a(2131165242), var23.a, var23.b - 75.0F, var12 - 60.0F, var5.c.b, 24.0F, 0, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                        fishing4.a.ae.a(var1, var26.t(), var23.a, var23.b - 75.0F, var12 - 60.0F, var5.c.b, 24.0F, 1);
                        ad.o.a(var1, fishing4.a.e.a(var23.a, var23.b - 105.0F), var3);
                     } else {
                        ad.o.a(var1, fishing4.a.e.a(var23.a, var23.b - 90.0F), var3);
                     }
                  }

                  this.s.a(var1, var2, var3, fishing4.a.e.a(var23.a, var23.b - 150.0F));
               default:
                  break label410;
            }
         case 2:
         case 3:
            if ((a == 1 || a == 14 || a == 15) && this.g != null) {
               for(var14 = 0; var14 < this.g.length; ++var14) {
                  if (m == var14) {
                     fishing4.a.m.a(var1, var2, this.g[var14], c, '\u0001');
                  }

                  if (var14 < this.f().size()) {
                     if (((ac)this.f().get(var14)).j() > 0) {
                        var28 = ((ac)this.f().get(var14)).h() * 100 / ((ac)this.f().get(var14)).j();
                     } else {
                        var28 = 100;
                     }

                     ac.a(var1, var4, this.g[var14].a, this.g[var14].b, ((ac)this.f().get(var14)).f(), var28);
                  } else {
                     ac.a(var1, var4, this.g[var14].a, this.g[var14].b);
                  }

                  if (k != 0 && var14 < this.f().size()) {
                     switch (((ac)this.f().get(var14)).s()) {
                        case 0:
                           if (var14 == ad.a) {
                              fishing4.a.m.a(var1, var2, this.g[var14].a - 28.0F + 10.0F, this.g[var14].b + 28.0F - 10.0F, 920.0F, 354.0F, 20.0F, 20.0F);
                           }
                           break;
                        case 1:
                           if (var14 == ad.c) {
                              fishing4.a.m.a(var1, var2, this.g[var14].a - 28.0F + 10.0F, this.g[var14].b + 28.0F - 10.0F, 920.0F, 354.0F, 20.0F, 20.0F);
                           }

                           fishing4.game.k.a(var1, ((ac)this.f().get(var14)).c(), fishing4.a.e.a(this.g[var14].a + 28.0F - 10.0F, this.g[var14].b - 28.0F + 10.0F), 1);
                           break;
                        case 2:
                           if (var14 == ad.b) {
                              fishing4.a.m.a(var1, var2, this.g[var14].a - 28.0F + 10.0F, this.g[var14].b + 28.0F - 10.0F, 920.0F, 354.0F, 20.0F, 20.0F);
                           }
                           break;
                        case 3:
                           if (var14 == ad.e) {
                              fishing4.a.m.a(var1, var2, this.g[var14].a - 28.0F + 10.0F, this.g[var14].b + 28.0F - 10.0F, 920.0F, 354.0F, 20.0F, 20.0F);
                           }
                           break;
                        case 4:
                           if (var14 == ad.f) {
                              fishing4.a.m.a(var1, var2, this.g[var14].a - 28.0F + 10.0F, this.g[var14].b + 28.0F - 10.0F, 920.0F, 354.0F, 20.0F, 20.0F);
                           }
                           break;
                        case 5:
                           if (var14 == ad.d) {
                              fishing4.a.m.a(var1, var2, this.g[var14].a - 28.0F + 10.0F, this.g[var14].b + 28.0F - 10.0F, 920.0F, 354.0F, 20.0F, 20.0F);
                           }
                     }
                  }
               }

               if (m < this.f().size()) {
                  ac var22 = (ac)this.f().get(m);
                  var12 = 400.0F - var5.c.b;
                  var25 = fishing4.a.e.c(15.0F + var5.c.a / 2.0F, 400.0F - var5.c.b / 2.0F);
                  fishing4.a.m.a(var1, var5, var25, 128);
                  ad.o.a(var1, fishing4.a.e.a(var25.a, 484.0F - var5.c.b), var3);
                  var14 = ab.e(var22.s());
                  if (k > 0) {
                     --var14;
                  }

                  for(var28 = 0; var28 < var14; ++var28) {
                     fishing4.a.m.a(var1, var2, var25.a, 300.0F + var12 - (float)(var28 * 36), 493.0F, 496.0F, 352.0F, 4.0F, fishing4.a.g.b(0.6F), '\u0001');
                     fishing4.a.ae.a(var1, ab.a(var22.s(), var28), var25.a, 300.0F + var12 - (float)(var28 * 36) - 22.0F, var5.c.a - 50.0F, var5.c.b, 24.0F, 0, fishing4.a.aa.a(0.0F, 1.0F, 1.0F, 1.0F));
                     boolean var16;
                     if (k == 0) {
                        var16 = true;
                     } else {
                        var16 = false;
                     }

                     fishing4.a.ae.a(var1, ab.a(var22, var28, var16), var25.a, 300.0F + var12 - (float)(var28 * 36) - 22.0F, var5.c.a - 50.0F, var5.c.b, 24.0F, 1);
                  }

                  fishing4.a.ae.a(var1, var22.u(), var25.a, 360.0F, var5.c.a, var5.c.b, 26.0F, 4);
                  this.s.a(var1, var2, var3, fishing4.a.e.a(var25.a, 40.0F + var12));
               }

               if (this.g.length > 12) {
                  if (n < this.g.length / 12 - 1) {
                     fishing4.a.m.a(var1, var2, (float)(fishing4.a.m.a() - 20), (float)(fishing4.a.m.b() - 244 - 38), 910.0F, 937.0F, 34.0F, 48.0F, fishing4.a.g.b(), '\u0001');
                  }

                  if (n > 0) {
                     fishing4.a.m.a(var1, var2, 20.0F, (float)(fishing4.a.m.b() - 244 - 38), 910.0F, 937.0F, 34.0F, 48.0F, '\u0001');
                  }

                  if (k == 0) {
                     fishing4.game.k.a(var1, m / 12, 2, (float)(fishing4.a.m.b() - 244 + 46 - 170));
                  } else {
                     fishing4.game.k.a(var1, m / 12, 3, (float)(fishing4.a.m.b() - 244 + 46 - 170));
                  }
               }
            }
            break;
         case 4:
         case 5:
            if (a == 40) {
               this.a(var1, var2, var11);
            } else if (a == 41) {
               this.a(var1, var2);
            }

            if (fishing4.game.k.k != null && !fishing4.game.k.k.equals("")) {
               fishing4.game.k.a();

               try {
                  URL var21 = new URL(fishing4.game.k.k);
                  fishing4.a.y.postToUrl(var21);
               } catch (MalformedURLException var19) {
                  var19.printStackTrace();
               } catch (IOException var20) {
                  var20.printStackTrace();
               }

               fishing4.game.k.k = null;
               fishing4.game.k.b();
            }
      }

      this.c(var1, var2, var3, var7, var8, var10, var11);
   }

   public final void b(int var1) {
      while(true) {
         int var2;
         switch (var1) {
            case 0:
               l = -1;
               break;
            case 1:
               this.m(0);
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 11:
            case 12:
            case 16:
            case 17:
            case 18:
            case 19:
            case 23:
            case 24:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            default:
               break;
            case 10:
               if (this.f != null) {
                  for(var2 = 0; var2 < this.f.length; ++var2) {
                     this.f[var2] = null;
                  }

                  this.f = null;
               }

               k = -1;
               l = 0;
               this.o = 0;
               break;
            case 13:
               if (this.j == 3) {
                  this.l(3);
               } else if (this.j == 2) {
                  if (k != 0 && k != 1) {
                     this.l(2);
                  } else {
                     this.l(3);
                  }
               }
               break;
            case 14:
               this.p = n - 1;
               break;
            case 15:
               this.p = n + 1;
               break;
            case 20:
               this.e();
               break;
            case 21:
               if (bh.a == 10) {
                  bh.a = 11;
                  bd.a(2131165285);
                  be.a = true;
               }
               break;
            case 22:
               this.e();
               break;
            case 25:
               if (am.e) {
                  if (b == 40) {
                     this.o = (m + ad.h.size() - 1) % ad.h.size();
                     return;
                  }
               } else {
                  if (k == 0) {
                     l = (l + 8 - 1) % 8;
                     var1 = 20;
                     continue;
                  }

                  if (z.c.b >= this.f[0].b - this.i.b.b / 2.0F) {
                     l = (l + ad.h.size() - 1) % ad.h.size();
                     this.o = 0;
                     var1 = 22;
                     continue;
                  }

                  if (((ag)ad.h.get(l)).b.size() > 0) {
                     var1 = m;
                     this.o = (((ag)ad.h.get(l)).b.size() + var1 - 1) % ((ag)ad.h.get(l)).b.size();
                     var1 = 23;
                     continue;
                  }
               }

               return;
            case 26:
               if (am.e) {
                  if (b == 40) {
                     this.o = (m + 1) % ad.h.size();
                     return;
                  }
               } else {
                  if (k == 0) {
                     l = (l + 1) % 8;
                     var1 = 20;
                     continue;
                  }

                  if (z.c.b >= this.f[0].b - this.i.b.b / 2.0F) {
                     l = (l + 1) % ad.h.size();
                     this.o = 0;
                     var1 = 22;
                     continue;
                  }

                  if (((ag)ad.h.get(l)).b.size() > 0) {
                     this.o = (m + 1) % ((ag)ad.h.get(l)).b.size();
                     var1 = 23;
                     continue;
                  }
               }

               return;
            case 32:
               if (!am.e) {
                  if (k == 0) {
                     l = (l + ad.q.size() - 1) % ad.q.size();
                  } else {
                     l = (l + ad.h.size() - 1) % ad.h.size();
                  }

                  var1 = 31;
                  continue;
               }

               return;
            case 33:
               if (!am.e) {
                  if (k == 0) {
                     l = (l + 1) % ad.q.size();
                  } else {
                     l = (l + 1) % ad.h.size();
                  }

                  var1 = 31;
                  continue;
               }

               return;
            case 42:
               int var3;
               if (this.j == 4) {
                  var2 = fishing4.game.w.b.size();
                  var1 = fishing4.game.w.c.size();
                  var3 = fishing4.game.w.d.size();
                  if (l < var2 + var1 + var3 - 10) {
                     ++l;
                  }
               } else if (this.j == 5) {
                  var3 = fishing4.game.v.b.size();
                  var1 = fishing4.game.v.c.size();
                  var2 = fishing4.game.v.d.size();
                  if (l < var3 + var1 + var2 - 10) {
                     ++l;
                  }
               }

               a = 44;
               return;
            case 43:
               if (this.j == 4) {
                  if (l > 0) {
                     --l;
                  }
               } else if (this.j == 5 && l > 0) {
                  --l;
               }

               a = 44;
               return;
         }

         a = var1;
         return;
      }
   }

   public final void b(fishing4.a.e var1) {
      int var4 = 0;
      int var3 = 0;
      int var2;
      fishing4.a.e var5;
      switch (a) {
         case 0:
            if (this.j == 0 && bh.a == 10) {
               if (be.a) {
                  be.a = false;
               } else if (am.e && am.b == 161) {
                  if (am.c.a(var1, true)) {
                     bh.c();
                     bb.a(1);
                  } else if (am.d.a(var1, true)) {
                     am.b();
                  }
               } else if (fishing4.a.f.a(this.e[1], this.h.b, var1)) {
                  bd.a(2131165284);
                  be.a = true;
               } else if (fishing4.a.f.a(this.e[0], this.h.b, var1)) {
                  k = 0;
                  this.b(12);
               }
            } else if (am.e) {
               if (am.a == 1) {
                  if (am.c.a(var1, true)) {
                     this.h();
                  } else if (am.d.a(var1, true)) {
                     am.b();
                  }
               } else if (am.c.a(var1, true)) {
                  am.b();
               }
            } else {
               for(var2 = 0; var2 < this.e.length; ++var2) {
                  if (fishing4.a.f.a(this.e[var2], this.h.b, var1)) {
                     if ((this.j != 4 || !fishing4.game.w.b() || var2 != 0) && (this.j != 5 || !fishing4.game.v.b() || var2 != 0)) {
                        k = var2;
                        this.b(12);
                     } else {
                        am.b(0);
                        b = 104;
                     }

                     return;
                  }
               }

               return;
            }
            break;
         case 1:
            if (am.e) {
               if (am.b == 180) {
                  if (am.c.a(var1, true)) {
                     aq.b = 16;
                     fishing4.game.k.o();
                  } else if (am.d.a(var1, true)) {
                     am.b();
                  }
               } else if (am.b == 181) {
                  if (d == 0) {
                     aq.b(var1);
                  }
               } else if (am.b >= 185 && am.b <= 190) {
                  if (am.c.a(var1, true)) {
                     switch (am.b) {
                        case 185:
                           fishing4.a.r.g = "fish4_gg_001";
                           fishing4.a.r.g();
                           aq.b = 10;
                           break;
                        case 186:
                           fishing4.a.r.g = "fish4_gg_002";
                           fishing4.a.r.g();
                           aq.b = 11;
                           break;
                        case 187:
                           fishing4.a.r.g = "fish4_gg_003";
                           fishing4.a.r.g();
                           aq.b = 12;
                           break;
                        case 188:
                           fishing4.a.r.g = "fish4_gg_004";
                           fishing4.a.r.g();
                           aq.b = 13;
                           break;
                        case 189:
                           fishing4.a.r.g = "fish4_gg_005";
                           fishing4.a.r.g();
                           aq.b = 14;
                           break;
                        case 190:
                           fishing4.a.r.g = "fish4_gg_006";
                           fishing4.a.r.g();
                           aq.b = 15;
                     }
                  } else if (am.d.a(var1, true)) {
                     am.a(181);
                  }
               } else if (am.b != 182 && am.b != 45 && am.b != 46 && am.b != 174 && am.b != 175) {
                  if (am.a == 1) {
                     if (am.c.a(var1, true)) {
                        this.h();
                     } else if (am.d.a(var1, true)) {
                        am.b();
                     }
                  } else if (b == 5) {
                     if (am.c.a(var1, true)) {
                        am.b(1);
                        b = 0;
                     } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 80.0F, fishing4.a.m.d()), fishing4.a.h.a(50.0F, 50.0F), var1)) {
                        if (this.r.encrypt() > 1L) {
                           this.r.b(-1L);
                        } else if (((ac)this.f().get(m)).p() > 0) {
                           this.r.encryptLong((long)((int)(ad.o.b() / (long)((ac)this.f().get(m)).p())));
                           if (this.r.encrypt() > 99L) {
                              this.r.encryptLong(99L);
                           } else if (this.r.encrypt() < 1L) {
                              this.r.encryptLong(1L);
                           }
                        } else {
                           this.r.encryptLong(99L);
                        }
                     } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 140.0F, fishing4.a.m.d()), fishing4.a.h.a(50.0F, 50.0F), var1)) {
                        if (this.r.encrypt() > 10L) {
                           this.r.b(-10L);
                        } else if (this.r.encrypt() == 1L) {
                           if (((ac)this.f().get(m)).p() > 0) {
                              this.r.encryptLong((long)((int)(ad.o.b() / (long)((ac)this.f().get(m)).p())));
                              if (this.r.encrypt() > 99L) {
                                 this.r.encryptLong(99L);
                              } else if (this.r.encrypt() < 1L) {
                                 this.r.encryptLong(1L);
                              }
                           } else {
                              this.r.encryptLong(99L);
                           }
                        } else {
                           this.r.encryptLong(1L);
                        }
                     } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 80.0F, fishing4.a.m.d()), fishing4.a.h.a(50.0F, 50.0F), var1)) {
                        if (this.r.encrypt() < 99L && ad.o.b() >= (long)((ac)this.f().get(m)).p() * (this.r.encrypt() + 1L)) {
                           this.r.b(1L);
                        } else {
                           this.r.encryptLong(1L);
                        }
                     } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 140.0F, fishing4.a.m.d()), fishing4.a.h.a(50.0F, 50.0F), var1)) {
                        if (this.r.encrypt() < 89L && ad.o.b() >= (long)((ac)this.f().get(m)).p() * (this.r.encrypt() + 10L)) {
                           this.r.b(10L);
                        } else if (((ac)this.f().get(m)).p() > 0) {
                           if (this.r.encrypt() != 99L && ad.o.b() >= (long)((ac)this.f().get(m)).p()) {
                              this.r.encryptLong((long)((int)(ad.o.b() / (long)((ac)this.f().get(m)).p())));
                           } else {
                              this.r.encryptLong(1L);
                           }

                           if (this.r.encrypt() > 99L) {
                              this.r.encryptLong(99L);
                           }
                        } else if (this.r.encrypt() < 99L) {
                           this.r.encryptLong(99L);
                        } else {
                           this.r.encryptLong(1L);
                        }
                     }
                  } else if (b == 14) {
                     if (m < this.f().size()) {
                        ac var8 = (ac)this.f().get(m);
                        if (am.c.a(var1, true)) {
                           am.b(1);
                           b = 10;
                        } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 80.0F, fishing4.a.m.d()), fishing4.a.h.a(50.0F, 50.0F), var1)) {
                           if (this.r.encrypt() > 1L) {
                              this.r.b(-1L);
                           } else {
                              this.r.encryptLong((long)((ac)this.f().get(m)).c());
                           }
                        } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 140.0F, fishing4.a.m.d()), fishing4.a.h.a(50.0F, 50.0F), var1)) {
                           if (this.r.encrypt() > 10L) {
                              this.r.b(-10L);
                           } else if (this.r.encrypt() == 1L) {
                              this.r.encryptLong((long)var8.c());
                           } else {
                              this.r.encryptLong(1L);
                           }
                        } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 80.0F, fishing4.a.m.d()), fishing4.a.h.a(50.0F, 50.0F), var1)) {
                           if (this.r.encrypt() < (long)var8.c()) {
                              this.r.b(1L);
                           } else {
                              this.r.encryptLong(1L);
                           }
                        } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 140.0F, fishing4.a.m.d()), fishing4.a.h.a(50.0F, 50.0F), var1)) {
                           if (var8.c() > 10 && this.r.encrypt() + 10L <= (long)var8.c()) {
                              this.r.b(10L);
                           } else if (this.r.encrypt() == (long)var8.c()) {
                              this.r.encryptLong(1L);
                           } else {
                              this.r.encryptLong((long)var8.c());
                           }
                        }
                     }
                  } else if (am.c.a(var1, true)) {
                     am.b();
                  }
               } else if (am.c.a(var1, true)) {
                  fishing4.a.r.h();
                  am.b();
               }
            } else if (a == 1 && this.g != null && m < this.f().size() && this.s.a(var1, true)) {
               this.r.encryptLong(1L);
               this.g();
            } else {
               for(var2 = 0; var2 < 12; ++var2) {
                  if (fishing4.a.f.a(this.g[n * 12 + var2], c.b, var1)) {
                     if (m == n * 12 + var2) {
                        this.r.encryptLong(1L);
                        this.g();
                     } else {
                        this.n(var2);
                     }

                     return;
                  }
               }

               for(var2 = var3; var2 < this.f.length; ++var2) {
                  if (fishing4.a.f.a(this.f[var2], this.i.b, var1)) {
                     this.q = var2;
                     return;
                  }
               }

               if (fishing4.a.f.a(fishing4.a.e.a((float)(fishing4.a.m.a() - 20), (float)(fishing4.a.m.b() - 244 - 38)), fishing4.a.h.a(34.0F, 48.0F), var1)) {
                  if (n + 1 < this.g.length / 12) {
                     this.b(15);
                  }
               } else if (fishing4.a.f.a(fishing4.a.e.a(20.0F, (float)(fishing4.a.m.b() - 244 - 38)), fishing4.a.h.a(34.0F, 48.0F), var1) && n > 0) {
                  this.b(14);
               }
            }
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 32:
         case 33:
         default:
            break;
         case 21:
         case 24:
            if (this.j == 0 && bh.a == 11 && be.a) {
               if (System.currentTimeMillis() - bd.b > 1000L) {
                  be.a = false;
               }
            } else if (am.e) {
               if (am.a == 1) {
                  if (am.c.a(var1, true)) {
                     if (am.b == 161) {
                        bh.c();
                        bb.a(1);
                     } else {
                        this.h();
                     }
                  } else if (am.d.a(var1, true)) {
                     am.b();
                  }
               } else if (am.c.a(var1, true)) {
                  am.b();
                  if (b == 40) {
                     var3 = l;
                     var2 = m;
                     boolean var9;
                     if (var2 >= 0 && var2 < ad.h.size()) {
                        ag var6 = (ag)ad.h.get(var2);
                        if (var6.a == 88) {
                           var9 = false;
                        } else {
                           switch (var3) {
                              case 0:
                              case 1:
                              case 2:
                                 if (var6.a != 80 && var6.a != 81 && var6.a != 87) {
                                    var9 = false;
                                    break;
                                 }

                                 var9 = true;
                                 break;
                              default:
                                 if (var6.a != 80 && var6.a != 81) {
                                    var9 = true;
                                 } else {
                                    var9 = false;
                                 }
                           }
                        }
                     } else {
                        var9 = false;
                     }

                     if (!var9) {
                        am.b(0);
                        b = 50;
                     } else if (((ag)ad.h.get(m)).f()) {
                        am.b(0);
                        b = 51;
                     } else if (fishing4.game.r.f()) {
                        am.b(1);
                        b = 48;
                     } else {
                        a(l, m);
                     }
                  }
               } else if (b == 40) {
                  if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 190.0F, fishing4.a.m.d() + 100.0F), fishing4.a.h.a(34.0F, 48.0F), var1)) {
                     this.o = (m + ad.h.size() - 1) % ad.h.size();
                  } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 190.0F, fishing4.a.m.d() + 100.0F), fishing4.a.h.a(34.0F, 48.0F), var1)) {
                     this.o = (m + 1) % ad.h.size();
                  }
               }
            } else if (a == 21) {
               if (this.s.a(var1, true)) {
                  if (bh.a != 11 || l == 0) {
                     this.g();
                     break;
                  }

                  bd.a(2131165286);
                  be.a = true;
               }

               if (fishing4.a.f.a(fishing4.a.e.a(50.0F, 325.0F), fishing4.a.h.a(50.0F, 50.0F), var1)) {
                  this.b(25);
               } else if (fishing4.a.f.a(fishing4.a.e.a(250.0F, 325.0F), fishing4.a.h.a(50.0F, 50.0F), var1)) {
                  this.b(26);
               }
            } else if (a == 24) {
               if (((ag)ad.h.get(l)).b.size() > 0) {
                  if (this.t.a(var1, true)) {
                     this.o(41);
                     break;
                  }

                  if (this.u.a(var1, true)) {
                     this.o(42);
                     break;
                  }

                  if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 210.0F, fishing4.a.m.d() + 110.0F), fishing4.a.h.a(34.0F, 48.0F), var1)) {
                     this.b(25);
                     break;
                  }

                  if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 210.0F, fishing4.a.m.d() + 110.0F), fishing4.a.h.a(34.0F, 48.0F), var1)) {
                     this.b(26);
                     break;
                  }

                  if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), fishing4.a.m.d() + 110.0F), fishing4.a.h.a(190.0F, 186.0F), var1) && ((ag)ad.h.get(l)).b.size() > 0) {
                     m var7 = (m)((ag)ad.h.get(l)).b.get(m);
                     if (var7.c) {
                        var7.c = false;
                     } else {
                        var7.c = true;
                     }
                     break;
                  }
               }

               if (fishing4.a.f.a(fishing4.a.e.a((float)(fishing4.a.m.a() - 30), this.f[0].b - 17.0F), fishing4.a.h.a(60.0F, 60.0F), var1)) {
                  this.b(26);
               }
            }
            break;
         case 30:
         case 31:
            if (am.e) {
               if (am.b == 180) {
                  if (am.c.a(var1, true)) {
                     aq.b = 16;
                     fishing4.game.k.o();
                  } else if (am.d.a(var1, true)) {
                     am.b();
                  }
               } else if (am.b == 181) {
                  if (d == 0) {
                     aq.b(var1);
                  }
               } else if (am.b >= 185 && am.b <= 190) {
                  if (am.c.a(var1, true)) {
                     switch (am.b) {
                        case 185:
                           fishing4.a.r.g = "fish4_gg_001";
                           fishing4.a.r.g();
                           aq.b = 10;
                           return;
                        case 186:
                           fishing4.a.r.g = "fish4_gg_002";
                           fishing4.a.r.g();
                           aq.b = 11;
                           return;
                        case 187:
                           fishing4.a.r.g = "fish4_gg_003";
                           fishing4.a.r.g();
                           aq.b = 12;
                           return;
                        case 188:
                           fishing4.a.r.g = "fish4_gg_004";
                           fishing4.a.r.g();
                           aq.b = 13;
                           return;
                        case 189:
                           fishing4.a.r.g = "fish4_gg_005";
                           fishing4.a.r.g();
                           aq.b = 14;
                           return;
                        case 190:
                           fishing4.a.r.g = "fish4_gg_006";
                           fishing4.a.r.g();
                           aq.b = 15;
                     }
                  } else if (am.d.a(var1, true)) {
                     am.a(181);
                  }
               } else if (am.b != 182 && am.b != 45 && am.b != 46 && am.b != 174 && am.b != 175) {
                  if (am.a == 1) {
                     if (am.c.a(var1, true)) {
                        this.h();
                     } else if (am.d.a(var1, true)) {
                        am.b();
                     }
                  } else if (am.a == 3) {
                     if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), fishing4.a.m.d() + 96.0F), fishing4.a.h.a(354.0F, 64.0F), var1)) {
                        this.o(71);
                     } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), fishing4.a.m.d()), fishing4.a.h.a(354.0F, 64.0F), var1)) {
                        this.o(76);
                     } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), fishing4.a.m.d() - 96.0F), fishing4.a.h.a(354.0F, 64.0F), var1)) {
                        this.o(81);
                     }
                  } else if (am.c.a(var1, true)) {
                     am.b();
                  }
               } else if (am.c.a(var1, true)) {
                  fishing4.a.r.h();
                  am.b();
               }
            } else if (this.s.a(var1, true)) {
               this.g();
            } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() - 180.0F, fishing4.a.m.d() + 140.0F), fishing4.a.h.a(34.0F, 48.0F), var1)) {
               this.b(32);
            } else if (fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c() + 180.0F, fishing4.a.m.d() + 140.0F), fishing4.a.h.a(34.0F, 48.0F), var1)) {
               this.b(33);
            }
            break;
         case 40:
            if (am.e) {
               if (am.a == 1) {
                  if (am.c.a(var1, true)) {
                     this.h();
                  } else if (am.d.a(var1, true)) {
                     am.b();
                  }
               } else if (am.c.a(var1, true)) {
                  this.h();
               }
               break;
            } else {
               var5 = fishing4.a.e.a(186.0F, 570.0F);
               if (this.j == 4) {
                  var2 = fishing4.game.w.b.size() + fishing4.game.w.c.size() + fishing4.game.w.d.size();
               } else {
                  var2 = fishing4.game.v.b.size() + fishing4.game.v.c.size() + fishing4.game.v.d.size();
               }

               var3 = var4;
               if (var2 > 10) {
                  if (fishing4.a.f.a(fishing4.a.e.a(var5.a, var5.b + 54.0F), fishing4.a.h.a(48.0F, 34.0F), var1)) {
                     this.b(43);
                     break;
                  }

                  var3 = var4;
                  if (fishing4.a.f.a(fishing4.a.e.a(var5.a, var5.b - 540.0F), fishing4.a.h.a(48.0F, 34.0F), var1)) {
                     this.b(42);
                     break;
                  }
               }

               for(; var3 < 10 && var3 < var2; ++var3) {
                  if (fishing4.a.f.a(fishing4.a.e.a(var5.a, var5.b - (float)(var3 * 54)), fishing4.a.h.a(332.0F, 54.0F), var1)) {
                     m = l + var3;
                     if (this.j == 4) {
                        if (m < fishing4.game.w.b.size()) {
                           bd.a((Integer)fishing4.game.w.b.get(m) + 2131165743 - 1);
                           bb.a(3);
                           this.b(50);
                           return;
                        }

                        if (m < fishing4.game.w.b.size() + fishing4.game.w.c.size()) {
                           this.g();
                           return;
                        }

                        if (m < fishing4.game.w.b.size() + fishing4.game.w.c.size() + fishing4.game.w.d.size()) {
                           bd.a(2131165777);
                           bb.a(3);
                           this.b(50);
                           return;
                        }
                     } else if (this.j == 5) {
                        if (m < fishing4.game.v.b.size()) {
                           bd.a((Integer)fishing4.game.v.b.get(m) + 2131165874 - 1);
                           bb.a(3);
                           this.b(50);
                           return;
                        }

                        if (m < fishing4.game.v.b.size() + fishing4.game.v.c.size()) {
                           this.g();
                           return;
                        }

                        if (m < fishing4.game.v.b.size() + fishing4.game.v.c.size() + fishing4.game.v.d.size()) {
                           bd.a(2131165906);
                           bb.a(3);
                           this.b(50);
                           return;
                        }
                     }
                  }
               }

               return;
            }
         case 41:
            if (am.e) {
               if (am.a == 1) {
                  if (am.c.a(var1, true)) {
                     this.h();
                  } else if (am.d.a(var1, true)) {
                     am.b();
                  }
               } else if (am.c.a(var1, true)) {
                  this.h();
               }
            } else {
               var5 = fishing4.a.e.a(186.0F, 570.0F);
               if (this.j == 4) {
                  var3 = x.c(false);
                  if (var3 == 7) {
                     var2 = var3 + 1;
                  } else {
                     var2 = var3;
                     if (var3 == 8) {
                        var2 = var3 + 2;
                     }
                  }
               } else if (this.j == 5) {
                  var3 = x.k();
                  if (var3 == 7) {
                     var2 = var3 + 1;
                  } else {
                     var2 = var3;
                     if (var3 == 8) {
                        var2 = var3 + 2;
                     }
                  }
               } else {
                  var2 = 0;
               }

               for(var3 = 0; var3 < var2; ++var3) {
                  if (fishing4.a.f.a(fishing4.a.e.a(var5.a, var5.b - (float)(var3 * 54)), fishing4.a.h.a(332.0F, 54.0F), var1)) {
                     m = var3;
                     if (fishing4.game.r.a == 0) {
                        this.o(110);
                     } else {
                        if (this.j == 4) {
                           var4 = fishing4.game.r.b(0, var3);
                        } else {
                           var4 = fishing4.game.r.b(1, var3);
                        }

                        if (fishing4.game.r.a == var4) {
                           if (fishing4.game.r.b <= 0) {
                              if (fishing4.game.r.h()) {
                                 if (this.j == 4) {
                                    bd.a(2131165917);
                                 } else {
                                    bd.a(2131165918);
                                 }

                                 bb.a(3);
                                 this.b(51);
                              } else {
                                 if (this.j == 4) {
                                    bd.a(2131165919);
                                 } else {
                                    bd.a(2131165920);
                                 }

                                 bb.a(3);
                                 this.b(51);
                              }
                              break;
                           }

                           this.o(111);
                        } else {
                           this.o(114);
                        }
                     }
                  }
               }
            }
      }

   }
}

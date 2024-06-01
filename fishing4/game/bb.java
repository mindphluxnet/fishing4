package fishing4.game;

import android.content.Context;
import java.text.DecimalFormat;
import javax.microedition.khronos.opengles.GL10;

import fishing4.a.GLRootView;
import pnjmobile.fishing4.google_free.Main;

public final class bb extends aa {
   public static int f;
   public static fishing4.a.w g;
   public static int h = 0;
   public static DecimalFormat i = new DecimalFormat("###0.0#");
   private fishing4.a.w j;
   private fishing4.a.w k;
   private bf[] l;
   private bc m;
   private fishing4.a.w n;
   private fishing4.a.w o;
   private fishing4.a.w p;
   private fishing4.a.w q;
   private fishing4.a.w r;
   private fishing4.a.w s;
   private fishing4.a.w t;
   private fishing4.a.w u;
   private fishing4.a.w v;
   private be w;
   private bg x;
   private aq y = new aq();

   public bb(Context var1) {
      super(3, var1);
   }

   private static boolean a(fishing4.a.e var0, boolean var1) {
      if (bh.a()) {
         var1 = false;
      } else {
         fishing4.game.k.l();
         var1 = fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.getHalfWidthPixels() - 160.0F, 70.0F), fishing4.a.h.a(128.0F, 128.0F), var0, var1);
      }

      return var1;
   }

   private static boolean b(fishing4.a.e var0, boolean var1) {
      return fishing4.a.f.a(fishing4.a.e.a((float)(fishing4.a.m.getWidthPixels() - 90), 90.0F), fishing4.a.h.a(160.0F, 160.0F), var0, var1);
   }

   public static boolean d(int var0) {
      boolean var2 = false;
      boolean var1 = var2;
      if (globalConfig.j) {
         switch (var0) {
            case 0:
               var1 = fishing4.game.k.c;
               break;
            case 1:
               var1 = fishing4.game.k.h;
               break;
            case 2:
               var1 = fishing4.game.k.d;
               break;
            case 3:
               var1 = fishing4.game.k.e;
               break;
            case 4:
               var1 = fishing4.game.k.f;
               break;
            case 5:
               var1 = fishing4.game.k.g;
               break;
            default:
               var1 = var2;
         }
      }

      return var1;
   }

   public static void e(int var0) {
      if (globalConfig.j) {
         switch (var0) {
            case 0:
               fishing4.game.k.c = false;
               break;
            case 1:
               fishing4.game.k.h = false;
               break;
            case 2:
               fishing4.game.k.d = false;
               break;
            case 3:
               fishing4.game.k.e = false;
               break;
            case 4:
               fishing4.game.k.f = false;
               break;
            case 5:
               fishing4.game.k.g = false;
         }
      }

   }

   public final void a(fishing4.a.e var1) {
      boolean var2 = false;
      if (aa.c == 1) {
         if (aq.a == 1) {
            aq var3 = this.y;
            aq.a(var1);
         } else if (am.e) {
            if (am.a == 1) {
               if (!am.c.a(var1, false)) {
                  am.d.a(var1, false);
               }
            } else if (am.a == 0) {
               am.c.a(var1, false);
            }
         } else {
            if (!bh.a()) {
               var2 = b(var1, true);
            }

            if (var2) {
               Main.openPlayStoreLink();
            } else if (a(var1, true)) {
               aq var4 = this.y;
               aq.a();
               aq.b = 16;
               fishing4.game.k.o();
            }
         }
      } else if (aa.c == 4) {
         this.x.a(var1);
      }

   }

   public final void a(GL10 var1, int var2) {
      c = var2;
      boolean var10001;
      switch (var2) {
         case 0:
            aa.d = 1;
            break;
         case 1:
            try {
               if (this.w != null) {
                  this.w.a(var1);
               }
            } catch (Exception var20) {
               var10001 = false;
               break;
            }

            label186: {
               try {
                  e = 0;
                  fishing4.b.d.a().e();
                  fishing4.b.d.a().c(GLRootView.getAppContext(), 2131034128);
                  fishing4.game.y.a();
                  fishing4.game.y.b();
                  fishing4.game.y.c();
                  if (bh.a()) {
                     break label186;
                  }

                  fishing4.b.d.a().a(GLRootView.getAppContext(), 2131034133);
                  Thread.sleep(500L);
                  if (OptionsManager.i == 1) {
                     ad.o.c(10000L);
                     OptionsManager.i = 2;
                     OptionsManager.b();
                     fishing4.b.d.a().b(GLRootView.getAppContext(), 2131034133);
                     am.a(96);
                     break label186;
                  }
               } catch (Exception var19) {
                  var10001 = false;
                  break;
               }

               try {
                  var2 = fishing4.game.q.a();
               } catch (Exception var17) {
                  var10001 = false;
                  break;
               }

               if (var2 >= 0) {
                  try {
                     am.a(var2 + 0);
                  } catch (Exception var16) {
                     var10001 = false;
                     break;
                  }
               } else {
                  label188: {
                     try {
                        if (fishing4.game.x.a(false) <= 0 || OptionsManager.f || az.e) {
                           break label188;
                        }

                        var2 = h++;
                     } catch (Exception var18) {
                        var10001 = false;
                        break;
                     }

                     if (var2 % 3 == 0) {
                        try {
                           fishing4.game.k.l();
                        } catch (Exception var15) {
                           var10001 = false;
                           break;
                        }
                     }

                     try {
                        fishing4.a.w.a(var1, g);
                        g = null;
                     } catch (Exception var14) {
                        var10001 = false;
                        break;
                     }
                  }
               }
            }

            try {
               fishing4.game.k.f();
               fishing4.game.q.c = System.currentTimeMillis();
               fishing4.a.ae.j = 1;
               fishing4.game.x.d = System.currentTimeMillis();
               if (globalConfig.j) {
                  fishing4.game.k.k();
               }
            } catch (Exception var13) {
               var10001 = false;
               break;
            }

            try {
               fishing4.game.k.i = fishing4.a.z.a(2);
            } catch (Exception var12) {
               var10001 = false;
            }
            break;
         case 2:
            label179: {
               label180: {
                  label181: {
                     label182: {
                        label183: {
                           label184: {
                              try {
                                 switch (f) {
                                    case 0:
                                       break;
                                    case 1:
                                       break label184;
                                    case 2:
                                       break label183;
                                    case 3:
                                       break label182;
                                    case 4:
                                       break label180;
                                    case 5:
                                       break label181;
                                    default:
                                       break label179;
                                 }
                              } catch (Exception var11) {
                                 var10001 = false;
                                 break;
                              }

                              try {
                                 fishing4.b.d.a().c(GLRootView.getAppContext(), 2131034141);
                                 break label179;
                              } catch (Exception var7) {
                                 var10001 = false;
                                 break;
                              }
                           }

                           try {
                              fishing4.b.d.a().c(GLRootView.getAppContext(), 2131034141);
                              fishing4.b.d.a().a(GLRootView.getAppContext(), 2131034116);
                              fishing4.b.d.a().a(GLRootView.getAppContext(), 2131034135);
                              fishing4.b.d.a().a(GLRootView.getAppContext(), 2131034143);
                              fishing4.b.d.a().a(GLRootView.getAppContext(), 2131034145);
                              fishing4.b.d.a().a(GLRootView.getAppContext(), 2131034144);
                              break label179;
                           } catch (Exception var6) {
                              var10001 = false;
                              break;
                           }
                        }

                        try {
                           fishing4.b.d.a().c(GLRootView.getAppContext(), 2131034126);
                           fishing4.b.d.a().a(GLRootView.getAppContext(), 2131034116);
                           fishing4.b.d.a().a(GLRootView.getAppContext(), 2131034135);
                           fishing4.b.d.a().a(GLRootView.getAppContext(), 2131034143);
                           fishing4.b.d.a().a(GLRootView.getAppContext(), 2131034145);
                           fishing4.b.d.a().a(GLRootView.getAppContext(), 2131034144);
                           break label179;
                        } catch (Exception var5) {
                           var10001 = false;
                           break;
                        }
                     }

                     try {
                        fishing4.b.d.a().c(GLRootView.getAppContext(), 2131034126);
                        fishing4.b.d.a().a(GLRootView.getAppContext(), 2131034116);
                        fishing4.b.d.a().a(GLRootView.getAppContext(), 2131034135);
                        fishing4.b.d.a().a(GLRootView.getAppContext(), 2131034143);
                        fishing4.b.d.a().a(GLRootView.getAppContext(), 2131034145);
                        fishing4.b.d.a().a(GLRootView.getAppContext(), 2131034144);
                        break label179;
                     } catch (Exception var10) {
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     fishing4.b.d.a().c(GLRootView.getAppContext(), 2131034125);
                     break label179;
                  } catch (Exception var9) {
                     var10001 = false;
                     break;
                  }
               }

               try {
                  fishing4.b.d.a().c(GLRootView.getAppContext(), 2131034125);
               } catch (Exception var8) {
                  var10001 = false;
                  break;
               }
            }

            try {
               this.w = be.a(var1, f);
               this.x = bg.a(f);
            } catch (Exception var4) {
               var10001 = false;
            }
            break;
         case 3:
            try {
               bd.b = System.currentTimeMillis();
               be.a = true;
            } catch (Exception var3) {
            }
      }

   }

   public final void b(int var1) {
      if (var1 != 26) {
         fishing4.game.q.c = System.currentTimeMillis();
      }

   }

   public final void b(fishing4.a.e var1) {
      if (!z.d && !be.a) {
         if (z.c.a < var1.a && z.c.a + 70.0F < var1.a) {
            if (c == 4 && bg.a == 1 && !am.e) {
               if (bg.b() > 0) {
                  this.x.b(14);
               }
            } else if (c == 4 && (bg.a == 21 || bg.a == 24)) {
               this.x.b(26);
            } else if (c == 4 && bg.a == 31) {
               this.x.b(33);
            }

            z.d = true;
         } else if (var1.a < z.c.a && var1.a + 70.0F < z.c.a) {
            if (c == 4 && bg.a == 1 && !am.e) {
               if (bg.b() + 1 < bg.c(this.x).length / 12) {
                  this.x.b(15);
               }
            } else if (c == 4 && (bg.a == 21 || bg.a == 24)) {
               this.x.b(25);
            } else if (c == 4 && bg.a == 31) {
               this.x.b(32);
            }

            z.d = true;
         } else if (z.c.b < var1.b && z.c.b + 70.0F < var1.b) {
            if (c == 4 && bg.a == 40 && !am.e) {
               this.x.b(42);
            }

            z.d = true;
         } else if (var1.b < z.c.b && var1.b + 70.0F < z.c.b) {
            if (c == 4 && bg.a == 40 && !am.e) {
               this.x.b(43);
            }

            z.d = true;
         }
      }

   }

   public final void b(GL10 var1) {
      this.a(var1, 0);
   }

   public final void c(int var1) {
      if (var1 == 4) {
         if (aa.c == 1) {
            if (aq.a == 1) {
               aq var2 = this.y;
               aq.a();
            } else if (bh.a()) {
               if (bh.a == 3 && !be.a) {
                  az.a();
               }
            } else {
               az.a();
            }
         } else if (aa.c == 3) {
            be var3 = this.w;
            if (be.a()) {
               aa.d = 4;
               if (bg.a == 50) {
                  bg.a(this.x);
                  bg.a = 40;
               } else if (bg.a == 51) {
                  if (fishing4.game.r.h()) {
                     bg.a(this.x, 112);
                  } else {
                     bg.a(this.x, 115);
                  }

                  bg.a = 41;
               }
            }
         } else if (aa.c == 4) {
            if (bg.b(this.x) == 0 && bh.a != 100) {
               if (be.a) {
                  be.a = false;
               } else if (bg.b == 40) {
                  bg.b = -1;
                  am.b();
               } else {
                  am.a(161);
               }
            } else {
               switch (bg.a) {
                  case 0:
                     if (!am.e) {
                        aa.d = 1;
                        if (d(bg.b(this.x))) {
                           e(bg.b(this.x));
                        }

                        return;
                     }
                     break;
                  case 1:
                  case 21:
                  case 24:
                     if (!am.e) {
                        this.x.b(11);
                     } else {
                        am.b();
                     }

                     return;
                  case 30:
                  case 31:
                  case 40:
                  case 41:
                     if (!am.e) {
                        this.x.b(10);
                        return;
                     }
                     break;
                  default:
                     return;
               }

               am.b();
            }
         }
      }

   }

   public final void c(fishing4.a.e var1) {
      z.d = false;
      if (aa.c == 1) {
         if (aq.a == 1) {
            aq var6 = this.y;
            aq.c(var1);
         } else if (bh.a() && be.a) {
            bh.a(var1);
         } else {
            int var4;
            if (am.e && am.b != -1) {
               if (am.b == 210) {
                  if (am.c.a(var1, true)) {
                     var4 = ag.b();
                     if (var4 != -1) {
                        az.p = var4;
                        am.a(211);
                     } else {
                        am.a(212);
                     }
                  } else {
                     fishing4.game.k.d();
                  }
               } else if (am.b == 211) {
                  if (am.c.a(var1, true)) {
                     am.a(213);
                  } else {
                     fishing4.game.k.d();
                  }
               } else if (am.b == 213) {
                  if (am.c.a(var1, true)) {
                     var4 = ag.b();
                     az.p = var4;
                     if (var4 == -1) {
                        am.a(212);
                     } else if (((ag)ad.h.get(az.p)).f()) {
                        am.a(214);
                     } else if (fishing4.game.r.g()) {
                        am.a(216);
                     } else if (fishing4.game.r.f()) {
                        am.a(215);
                     } else {
                        am.a(217);
                        bg.d = 1;
                     }
                  } else if (am.d.a(var1, true)) {
                     am.b();
                  } else {
                     fishing4.game.k.d();
                  }
               } else if (am.b == 215) {
                  if (am.c.a(var1, true)) {
                     am.a(217);
                     bg.d = 1;
                  } else if (am.d.a(var1, true)) {
                     am.b();
                  } else {
                     fishing4.game.k.d();
                  }
               } else if (am.a == 0) {
                  if (am.c.a(var1, true)) {
                     if ((am.b < 0 || am.b >= 24) && am.b != 96) {
                        am.b();
                        fishing4.a.r.h();
                        if (z.b() == 3) {
                           aq.a = 3;
                        }
                     } else {
                        var4 = fishing4.game.q.a();
                        if (var4 >= 0) {
                           am.a(var4 + 0);
                           fishing4.game.k.f();
                        } else {
                           am.b();
                        }
                     }
                  } else {
                     fishing4.game.k.d();
                  }
               } else if (am.a == 1) {
                  if (am.b == 160) {
                     bh.a(var1);
                  } else if (am.b == 200) {
                     if (am.c.a(var1, true)) {
                        fishing4.a.r.g = "Q02D10132216";
                        fishing4.a.r.g();
                     } else if (am.d.a(var1, true)) {
                        am.b();
                        if (z.b() == 3) {
                           aq.a = 3;
                        }
                     }
                  }
               } else {
                  fishing4.game.k.d();
               }
            } else {
               fishing4.game.k.d();
               if (fishing4.a.f.a(bc.c, bc.a.b, var1)) {
                  if (bh.a == 3) {
                     f = 0;
                     bh.b = 0;
                     bd.a(2131165282);
                     be.a = true;
                  } else {
                     aq var8 = this.y;
                     aq.a();
                  }
               } else if (!b(var1, false) && !a(var1, false)) {
                  for(var4 = 0; var4 < 6; ++var4) {
                     float var2 = bf.a(this.l[var4]).a;
                     float var3 = bf.a(this.l[var4]).b;
                     bf[] var10 = this.l;
                     boolean var5;
                     if (f == var4) {
                        var5 = true;
                     } else {
                        var5 = false;
                     }

                     fishing4.a.e var7 = fishing4.a.e.a(var2, bf.a(var5).b.b / 2.0F + var3);
                     var10 = this.l;
                     if (f == var4) {
                        var5 = true;
                     } else {
                        var5 = false;
                     }

                     if (fishing4.a.f.a(var7, bf.a(var5).b, var1)) {
                        if (f == var4) {
                           if (bh.a == 3) {
                              if (f == 0) {
                                 am.a(160);
                              } else {
                                 f = 0;
                                 bh.b = 0;
                                 bd.a(2131165282);
                                 be.a = true;
                              }
                           } else if (f == 6) {
                              var4 = ag.b();
                              az.p = var4;
                              if (var4 == -1) {
                                 am.a(212);
                              } else if (((ag)ad.h.get(az.p)).f()) {
                                 am.a(214);
                              } else if (fishing4.game.r.g()) {
                                 am.a(216);
                              } else if (fishing4.game.r.f()) {
                                 am.a(215);
                              } else {
                                 am.a(213);
                              }
                           } else {
                              aa.d = 2;
                           }
                        } else {
                           f = var4;
                        }
                        break;
                     }
                  }
               }
            }
         }
      } else if (aa.c == 3) {
         be var9 = this.w;
         if (be.a()) {
            aa.d = 4;
            if (bg.a == 50) {
               bg.a(this.x);
               bg.a = 40;
            } else if (bg.a == 51) {
               if (fishing4.game.r.h()) {
                  bg.a(this.x, 112);
               } else {
                  bg.a(this.x, 115);
               }

               bg.a = 41;
            }
         }
      } else if (aa.c == 4 && !(Math.abs(fishing4.a.e.d(z.c, var1)) > 70.0F)) {
         fishing4.game.k.d();
         this.x.b(var1);
      }

   }

   public final void c(GL10 var1) {
      if (this.j == null) {
         this.j = fishing4.a.w.a(var1, "img/town/town.png");
         this.k = fishing4.a.w.a(var1, "img/town/shop_bg_eff.png");
         this.l = new bf[6];

         for(int var2 = 0; var2 < 6; ++var2) {
            this.l[var2] = bf.a(var2);
         }

         this.m = bc.a();
      }

      if (this.n == null) {
         this.n = fishing4.a.w.a(var1, "img/town/bg.png");
         this.o = fishing4.a.w.a(var1, "img/town/item.png");
         this.p = fishing4.a.w.a(var1, "img/town/popBG.png");
         this.q = fishing4.a.w.a(var1, "img/town/radar.png");
         this.r = fishing4.a.w.a(var1, "img/town/ship.png");
         this.s = fishing4.a.w.a(var1, "img/sea/s_map.png");
         this.t = fishing4.a.w.a(var1, "img/town/choice_icon.png");
         if (globalConfig.languageId == 0) {
            this.u = fishing4.a.w.a(var1, "img/town/plusdown_bigfish.png");
         } else {
            this.u = fishing4.a.w.a(var1, "img/town/plusdown_bigfishen.png");
         }

         this.v = fishing4.a.w.a(var1, "img/town/pointmall.png");
         f = -1;
      }

   }

   public final void d(GL10 var1) {
      fishing4.a.w.a(var1, this.j);
      this.j = null;
      fishing4.a.w.a(var1, this.k);
      this.k = null;
      fishing4.a.w.a(var1, this.n);
      this.n = null;
      fishing4.a.w.a(var1, this.o);
      this.o = null;
      fishing4.a.w.a(var1, this.p);
      this.p = null;
      fishing4.a.w.a(var1, this.q);
      this.q = null;
      fishing4.a.w.a(var1, this.r);
      this.r = null;
      fishing4.a.w.a(var1, this.s);
      this.s = null;
      fishing4.a.w.a(var1, this.t);
      this.t = null;
      fishing4.a.w.a(var1, this.u);
      this.u = null;
      fishing4.a.w.a(var1, this.v);
      this.v = null;
   }

   public final void e(GL10 var1) {
      var1.glLoadIdentity();
      var1.glTranslatef(0.0F, 0.0F, 0.0F);
      int var2;
      switch (aa.c) {
         case 0:
            fishing4.game.k.a(var1);
            break;
         case 1:
            fishing4.a.m.a(var1, this.j, fishing4.a.m.getHalfWidthPixels(), 854.0F - this.j.c.b / 2.0F);

            for(var2 = 0; var2 < 6; ++var2) {
               bf var15 = this.l[var2];
               fishing4.a.w var14 = az.t;
               boolean var3;
               if (f == var2) {
                  var3 = true;
               } else {
                  var3 = false;
               }

               var15.a(var1, var14, var3, e / 2);
            }

            bc.a(this.m, var1, az.t, this.k, e / 3);
            if (!bh.a()) {
               fishing4.a.m.a(var1, this.u, (float)(fishing4.a.m.getWidthPixels() - 90), 90.0F);
            }

            if (!bh.a() && aq.a != 1 && aq.a != 4) {
               fishing4.game.k.l();
               aq.a(var1, fishing4.a.m.getHalfWidthPixels() - 160.0F);
            }

            am.displayMessageBox(var1, e);
            var2 = e;
            fishing4.game.k.c();
            this.y.a(var1, e);
            if (System.currentTimeMillis() - fishing4.game.q.c >= 1800000L && !az.e) {
               fishing4.game.q.c(10);
            }

            bh.a(var1, e);
            break;
         case 2:
         case 3:
         case 4:
            var2 = e;

            for(var2 = 0; var2 < 2; ++var2) {
               if (fishing4.a.m.width == 540) {
                  fishing4.a.m.a(var1, this.n, fishing4.a.m.getHalfWidthPixels() - this.n.c.a / 2.0F + this.n.c.a * (float)var2, fishing4.a.m.getHalfHeightPixels());
               } else if (fishing4.a.m.width != 720 && fishing4.a.m.height != 1232 && fishing4.a.m.height != 1280) {
                  fishing4.a.m.a(var1, this.n, this.n.c.a / 2.0F + this.n.c.a * (float)var2, fishing4.a.m.getHalfHeightPixels());
               } else {
                  fishing4.a.m.a(var1, this.n, fishing4.a.m.getHalfWidthPixels() - this.n.c.a / 2.0F + this.n.c.a * (float)var2, fishing4.a.m.getHalfHeightPixels(), fishing4.a.g.a(1.001F));
               }
            }

            fishing4.a.m.a(var1, az.s, fishing4.a.m.getHalfWidthPixels(), (float)(fishing4.a.m.getHeightPixels() - 34), 359.0F, 865.0F, 366.0F, 68.0F);
            fishing4.a.m.a(var1, az.s, fishing4.a.m.getHalfWidthPixels(), (float)(fishing4.a.m.getHeightPixels() - 33), 1.0F, 866.0F, 356.0F, 64.0F, '\u0002');
            switch (f) {
               case 0:
                  if (globalConfig.languageId == 0) {
                     fishing4.a.m.a(var1, az.t, fishing4.a.m.getHalfWidthPixels(), (float)(fishing4.a.m.getHeightPixels() - 33), 0.0F, 100.0F, 84.0F, 48.0F);
                  } else {
                     fishing4.a.m.a(var1, az.t, fishing4.a.m.getHalfWidthPixels(), (float)(fishing4.a.m.getHeightPixels() - 33), 95.0F, 103.0F, 139.0F, 40.0F);
                  }
                  break;
               case 1:
                  if (globalConfig.languageId == 0) {
                     fishing4.a.m.a(var1, az.t, fishing4.a.m.getHalfWidthPixels(), (float)(fishing4.a.m.getHeightPixels() - 33), 0.0F, 150.0F, 120.0F, 48.0F);
                  } else {
                     fishing4.a.m.a(var1, az.t, fishing4.a.m.getHalfWidthPixels(), (float)(fishing4.a.m.getHeightPixels() - 33), 133.0F, 153.0F, 190.0F, 46.0F);
                  }
                  break;
               case 2:
                  if (globalConfig.languageId == 0) {
                     fishing4.a.m.a(var1, az.t, fishing4.a.m.getHalfWidthPixels(), (float)(fishing4.a.m.getHeightPixels() - 33), 0.0F, 0.0F, 120.0F, 48.0F);
                  } else {
                     fishing4.a.m.a(var1, az.t, fishing4.a.m.getHalfWidthPixels(), (float)(fishing4.a.m.getHeightPixels() - 33), 133.0F, 1.0F, 130.0F, 44.0F);
                  }
                  break;
               case 3:
                  if (globalConfig.languageId == 0) {
                     fishing4.a.m.a(var1, az.t, fishing4.a.m.getHalfWidthPixels(), (float)(fishing4.a.m.getHeightPixels() - 33), 0.0F, 50.0F, 120.0F, 48.0F);
                  } else {
                     fishing4.a.m.a(var1, az.t, fishing4.a.m.getHalfWidthPixels(), (float)(fishing4.a.m.getHeightPixels() - 33), 135.0F, 53.0F, 150.0F, 40.0F);
                  }
                  break;
               case 4:
                  if (globalConfig.languageId == 0) {
                     fishing4.a.m.a(var1, az.t, fishing4.a.m.getHalfWidthPixels(), (float)(fishing4.a.m.getHeightPixels() - 33), 0.0F, 250.0F, 160.0F, 48.0F);
                  } else {
                     fishing4.a.m.a(var1, az.t, fishing4.a.m.getHalfWidthPixels(), (float)(fishing4.a.m.getHeightPixels() - 33), 166.0F, 253.0F, 260.0F, 40.0F);
                  }
                  break;
               case 5:
                  if (globalConfig.languageId == 0) {
                     fishing4.a.m.a(var1, az.t, fishing4.a.m.getHalfWidthPixels(), (float)(fishing4.a.m.getHeightPixels() - 33), 0.0F, 200.0F, 160.0F, 48.0F);
                  } else {
                     fishing4.a.m.a(var1, az.t, fishing4.a.m.getHalfWidthPixels(), (float)(fishing4.a.m.getHeightPixels() - 33), 170.0F, 203.0F, 260.0F, 40.0F);
                  }
            }

            be var4 = this.w;
            fishing4.a.w var5 = az.s;
            var4.b(var1, e);
            bg var13 = this.x;
            fishing4.a.w var9 = az.s;
            var5 = az.t;
            fishing4.a.w var8 = this.o;
            fishing4.a.w var10 = this.p;
            fishing4.a.w var11 = this.s;
            fishing4.a.w var6 = this.r;
            fishing4.a.w var7 = this.q;
            fishing4.a.w var12 = az.u;
            var13.a(var1, var9, var5, var8, var10, var11, var6, var7, az.v, this.t, e);
            bd.a(var1, az.s);
            if (bh.a()) {
               am.displayMessageBox(var1, e);
            }

            d(f);
      }

   }

   public final void f(GL10 var1) {
      this.a(var1);
   }
}

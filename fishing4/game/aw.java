package fishing4.game;

import android.content.Context;
import android.util.Log;
import java.text.DecimalFormat;
import javax.microedition.khronos.opengles.GL10;

public final class aw extends aa {
   public static int f;
   public static float h;
   public static float i;
   public static boolean j;
   public static boolean k;
   public static boolean l = false;
   public static boolean m = false;
   public static int n = 0;
   public static int o;
   public static int p = -1;
   public static int q = 0;
   public static int r = -1;
   public static int s = -1;
   public static int t = 0;
   public static int u = 0;
   public static DecimalFormat v = new DecimalFormat("###0.0#");
   public static boolean w;
   private fishing4.a.w A;
   private fishing4.a.w B;
   private fishing4.a.w C;
   private fishing4.a.w D;
   private fishing4.a.w E;
   private fishing4.a.w F;
   private fishing4.a.w G;
   private fishing4.a.w H;
   private fishing4.a.w I;
   private fishing4.a.ad J;
   private fishing4.a.r K = new fishing4.a.r();
   private int L;
   private final int M = 0;
   private final int N = 1;
   private final int O = 2;
   private final int P = 99;
   private aq Q = new aq();
   private long R;
   private boolean S;
   public j g;
   private ah x;
   private i y;
   private fishing4.a.w z;

   public aw(Context var1) {
      super(4, var1);
   }

   public final void a(fishing4.a.e var1) {
      fishing4.game.q.c = System.currentTimeMillis();
      if (o != 1) {
         switch (c) {
            case 0:
            default:
               break;
            case 1:
               if (bh.a() && bh.a != 51) {
                  return;
               }

               if (!bh.a() && fishing4.game.j.a == 0) {
                  boolean var2;
                  if (fishing4.game.p.j) {
                     var2 = fishing4.a.f.a(fishing4.a.e.a(fishing4.a.m.c(), 40.0F), fishing4.a.h.a(120.0F, 120.0F), var1);
                  } else {
                     var2 = fishing4.a.f.a(fishing4.a.e.a(40.0F, (float)(fishing4.a.m.b() - 40)), fishing4.a.h.a(120.0F, 120.0F), var1);
                  }

                  if (var2) {
                     aq var4 = this.Q;
                     aq.a();
                     break;
                  }
               }

               if (aq.a == 1) {
                  aq var5 = this.Q;
                  aq.a(var1);
               } else {
                  fishing4.game.k.d();
                  if (!am.e() && am.b != -1) {
                     Log.d("", "sms50:mypopup66?");
                     if (am.a == 1) {
                        if (!am.c.a(var1, false)) {
                           am.d.a(var1, false);
                        }
                     } else {
                        am.c.a(var1, false);
                     }
                  } else if (this.g != null) {
                     if (fishing4.game.j.a == 0) {
                        if (!this.J.a(var1, false)) {
                           if (fishing4.a.f.a(fishing4.a.e.a(50.0F, 250.0F), fishing4.a.h.a(60.0F, 60.0F), var1)) {
                              az.a(0);
                           } else if (fishing4.a.f.a(fishing4.a.e.a(50.0F, 180.0F), fishing4.a.h.a(60.0F, 60.0F), var1)) {
                              az.a(1);
                           } else if (fishing4.a.f.a(fishing4.a.e.a(50.0F, 110.0F), fishing4.a.h.a(60.0F, 60.0F), var1)) {
                              az.a(2);
                           } else if (fishing4.a.f.a(fishing4.a.e.a(120.0F, 250.0F), fishing4.a.h.a(60.0F, 60.0F), var1)) {
                              az.a(3);
                           } else if (fishing4.a.f.a(fishing4.a.e.a(120.0F, 180.0F), fishing4.a.h.a(60.0F, 60.0F), var1)) {
                              az.a(4);
                           } else if (fishing4.a.f.a(fishing4.a.e.a(120.0F, 110.0F), fishing4.a.h.a(60.0F, 60.0F), var1)) {
                              az.a(5);
                           } else if (!this.J.k) {
                              if (ad.a != -1 && ad.c != -1 && ad.b != -1) {
                                 if (((ag)ad.h.get(ad.g)).f()) {
                                    fishing4.game.l.a(1);
                                    aa.d = 4;
                                 } else {
                                    this.g.c();
                                 }
                              } else {
                                 fishing4.game.l.a(0);
                                 aa.d = 4;
                              }
                           }
                        }
                     } else if (fishing4.game.j.a == 2) {
                        this.g.c();
                     }
                  }
               }
               break;
            case 2:
               if (this.x != null) {
                  if (bh.a() && bh.a != 51) {
                     return;
                  }

                  this.x.a(var1);
               }
               break;
            case 3:
               if (this.y != null) {
                  i var3 = this.y;
                  if ((!bh.a() || bh.a == 51) && var3.a.c(var1)) {
                     var3.a.e();
                     if (!fishing4.game.i.c) {
                        var3.a.d(var1);
                     }
                  }
               }
               break;
            case 4:
               if (am.e) {
                  if (am.a == 1) {
                     if (!am.c.a(var1, false)) {
                        am.d.a(var1, false);
                     }
                  } else {
                     am.c.a(var1, false);
                  }
               }
         }

         fishing4.game.q.c = System.currentTimeMillis();
      }

   }

   public final void a(GL10 var1, int var2) {
      c = var2;
      boolean var10001;
      switch (var2) {
         case 0:
            label125: {
               this.z = fishing4.a.w.a(var1, "img/battle/firstbattle01.png");
               this.A = fishing4.a.w.a(var1, "img/battle/firstbattle02.png");
               this.B = fishing4.a.w.a(var1, "img/battle/good.png");
               this.C = fishing4.a.w.a(var1, "img/battle/fish.png");
               this.D = fishing4.a.w.a(var1, "img/town/radar.png");
               this.E = fishing4.a.w.a(var1, "img/town/item.png");
               this.F = fishing4.a.w.a(var1, "img/battle/lighting.png");
               this.G = fishing4.a.w.a(var1, "img/battle/lastbattle.png");
               this.H = fishing4.a.w.a(var1, "img/battle/lastbattle02.png");
               this.I = fishing4.a.w.a(var1, "img/battle/dummy_banner.png");
               az.G = fishing4.a.w.a(var1, "img/ui/shopicon.png");
               this.J = fishing4.a.ad.a(6);
               ay.a(var1, f);
               av.a(var1, f);
               this.g = new j();
               switch (f) {
                  case 0:
                  case 2:
                     fishing4.b.d.a().c(fishing4.a.s.a(), 2131034132);
                     break label125;
                  case 1:
                     fishing4.b.d.a().a(fishing4.a.s.a(), 2131034121);
                     fishing4.b.d.a().c(fishing4.a.s.a(), 2131034132);
                     break label125;
                  case 3:
                     fishing4.b.d.a().a(fishing4.a.s.a(), 2131034123);
                  case 4:
                  case 5:
                  case 6:
                  case 10:
                     break;
                  case 7:
                     fishing4.b.d.a().a(fishing4.a.s.a(), 2131034122);
                     break;
                  case 8:
                  case 9:
                  default:
                     break label125;
               }

               fishing4.b.d.a().c(fishing4.a.s.a(), 2131034113);
            }

            fishing4.game.q.c = System.currentTimeMillis();
            fishing4.game.q.c(0);
            aa.d = 1;
            m = false;
            l = false;
            n = 0;
            if (fishing4.game.u.d) {
               fishing4.game.m.b(var1);
            }
            break;
         case 1:
            try {
               fishing4.a.w.a(var1, fishing4.game.l.g);
               fishing4.game.l.g = null;
               am.b();
               this.S = false;
               if (this.x != null) {
                  fishing4.b.d.a().d();
                  this.x.b(var1);
                  this.x = null;
               }
            } catch (Exception var21) {
               var10001 = false;
               break;
            }

            try {
               if (fishing4.game.j.a == 6) {
                  this.g.c();
               }
            } catch (Exception var20) {
               var10001 = false;
               break;
            }

            try {
               av.a(0);
               e = 0;
               this.R = System.currentTimeMillis();
               fishing4.game.k.f();
               fishing4.game.l.d = -1;
               if (!bh.a()) {
                  break;
               }

               if (bh.a == 11) {
                  bh.a = 20;
                  bd.a(2131165287);
                  be.a = true;
                  break;
               }
            } catch (Exception var19) {
               var10001 = false;
               break;
            }

            try {
               if (bh.a == 50) {
                  bh.b = 0;
                  bh.a = 51;
                  break;
               }
            } catch (Exception var22) {
               var10001 = false;
               break;
            }

            try {
               if (bh.a == 51 && bh.b >= 3) {
                  bh.a = 53;
                  bd.a(2131165301);
                  be.a = true;
               }
            } catch (Exception var18) {
               var10001 = false;
            }
            break;
         case 2:
            try {
               am.b();
               this.x = ah.a(var1);
               if (bh.a() && bh.a != 51) {
                  bh.a = 30;
                  bh.b = 0;
                  bd.a(2131165291);
               }
            } catch (Exception var12) {
               var10001 = false;
               break;
            }

            try {
               if (bh.a == 51) {
                  ++bh.b;
               }
            } catch (Exception var11) {
               var10001 = false;
            }
            break;
         case 3:
            try {
               am.b();
               var2 = fishing4.game.m.c(h, ad.b(1));
               if (this.x != null) {
                  this.x.b(var1);
                  this.x = null;
               }
            } catch (Exception var17) {
               var10001 = false;
               break;
            }

            try {
               this.y = fishing4.game.i.a(var1, var2);
               if (bh.a() && bh.a != 51) {
                  bh.a = 40;
                  bh.b = 0;
                  bd.a(2131165292);
                  break;
               }
            } catch (Exception var16) {
               var10001 = false;
               break;
            }

            label238: {
               try {
                  if (fishing4.game.m.b(i) <= 2) {
                     fishing4.b.d.a().e();
                     fishing4.b.d.a().c(fishing4.a.s.a(), 2131034114);
                     break label238;
                  }
               } catch (Exception var15) {
                  var10001 = false;
                  break;
               }

               try {
                  fishing4.b.d.a().e();
                  fishing4.b.d.a().c(fishing4.a.s.a(), 2131034115);
               } catch (Exception var14) {
                  var10001 = false;
                  break;
               }
            }

            try {
               fishing4.b.d var23 = fishing4.b.d.a();
               fishing4.a.s.a();
               var23.a(2131034123);
               var23 = fishing4.b.d.a();
               fishing4.a.s.a();
               var23.a(2131034121);
               var23 = fishing4.b.d.a();
               fishing4.a.s.a();
               var23.a(2131034122);
            } catch (Exception var13) {
               var10001 = false;
            }
            break;
         case 4:
            try {
               if (this.y != null) {
                  this.y.a(var1);
                  this.y = null;
               }
            } catch (Exception var10) {
               var10001 = false;
               return;
            }

            label231: {
               label232: {
                  label233: {
                     label234: {
                        label235: {
                           try {
                              switch (f) {
                                 case 0:
                                 case 2:
                                    break label235;
                                 case 1:
                                    break;
                                 case 3:
                                    break label234;
                                 case 4:
                                 case 5:
                                 case 6:
                                 case 10:
                                    break label232;
                                 case 7:
                                    break label233;
                                 case 8:
                                 case 9:
                                 default:
                                    break label231;
                              }
                           } catch (Exception var9) {
                              var10001 = false;
                              return;
                           }

                           try {
                              fishing4.b.d.a().c(fishing4.a.s.a(), 2131034132);
                              break label231;
                           } catch (Exception var8) {
                              var10001 = false;
                              return;
                           }
                        }

                        try {
                           fishing4.b.d.a().c(fishing4.a.s.a(), 2131034132);
                           break label231;
                        } catch (Exception var7) {
                           var10001 = false;
                           return;
                        }
                     }

                     try {
                        fishing4.b.d.a().c(fishing4.a.s.a(), 2131034113);
                        break label231;
                     } catch (Exception var6) {
                        var10001 = false;
                        return;
                     }
                  }

                  try {
                     fishing4.b.d.a().c(fishing4.a.s.a(), 2131034113);
                     break label231;
                  } catch (Exception var5) {
                     var10001 = false;
                     return;
                  }
               }

               try {
                  fishing4.b.d.a().c(fishing4.a.s.a(), 2131034113);
               } catch (Exception var4) {
                  var10001 = false;
                  return;
               }
            }

            try {
               if (bh.a() && bh.a == 46) {
                  bh.a = 50;
                  bd.a(2131165299);
                  be.a = true;
               }
            } catch (Exception var3) {
               var10001 = false;
            }
      }

   }

   public final void b(int var1) {
      if (var1 != 26) {
         fishing4.game.q.c = System.currentTimeMillis();
      }

   }

   public final void b(fishing4.a.e var1) {
      switch (c) {
         case 0:
         case 1:
         default:
            break;
         case 2:
            if (this.x != null) {
               this.x.a(var1);
            }
            break;
         case 3:
            if (this.y != null) {
               i var2 = this.y;
               if (!bh.a() || bh.a == 51) {
                  if (var2.a.a) {
                     if (fishing4.game.i.c) {
                        var2.a.b(var1);
                     } else {
                        var2.a.d(var1);
                     }
                  }

                  if (fishing4.a.o.g) {
                     fishing4.a.o var3 = var2.a;
                     fishing4.a.o.b();
                  }
               }
            }
      }

   }

   public final void b(GL10 var1) {
      this.a(var1, 0);
   }

   public final void c(int var1) {
      if (o != 1 && var1 == 4) {
         if (bh.a()) {
            if (bh.a == 51 && (c != 1 || fishing4.game.j.a == 0) && c != 4) {
               if (c == 3) {
                  fishing4.game.i.a();
               } else {
                  am.a(161);
               }
            }
         } else {
            switch (c) {
               case 0:
               default:
                  break;
               case 1:
                  if (aq.a == 1) {
                     aq var2 = this.Q;
                     aq.a();
                  } else if (fishing4.game.j.a == 0) {
                     az.a();
                  }
                  break;
               case 2:
                  ah.b();
                  break;
               case 3:
                  fishing4.game.i.a();
                  break;
               case 4:
                  if (am.b == 181 || am.b == 45) {
                     Log.d("", "sms50:mypopup22?");
                     am.b = -1;
                     fishing4.game.l.a(fishing4.game.l.d);
                  }
            }
         }
      }

   }

   public final void c(fishing4.a.e var1) {
      if (o != 1) {
         be var10;
         switch (c) {
            case 0:
            default:
               break;
            case 1:
               if (bh.a() && bh.a != 51) {
                  if (bh.a == 21) {
                     if (bh.b >= 60) {
                        var10 = bh.c;
                        if (be.a()) {
                           bh.a = 22;
                           bh.b = 0;
                           bd.a(2131165289);
                           this.g.c();
                        }
                     }
                  } else if (bh.a == 22) {
                     if (bh.b >= 60) {
                        var10 = bh.c;
                        if (be.a()) {
                           bh.a = 23;
                           bh.b = 0;
                           bd.a(2131165290);
                           this.g.b();
                        }
                     }
                  } else if (bh.a == 23) {
                     if (bh.b >= 60) {
                        var10 = bh.c;
                        if (be.a() && fishing4.game.j.a == 4) {
                           this.g.c();
                        }
                     }
                  } else {
                     bh.a(var1);
                  }
               } else if (aq.a == 1) {
                  aq var13 = this.Q;
                  aq.c(var1);
               } else if (!am.e() && am.b != -1) {
                  Log.d("", "sms50:mypopup55?");
                  if (am.a == 1) {
                     if (am.b == 161) {
                        if (am.c.a(var1, true)) {
                           bh.c();
                           fishing4.game.z.a(3);
                        } else if (am.d.a(var1, true)) {
                           am.b();
                        }
                     }
                  } else if (am.a == 0 && am.c.a(var1, true)) {
                     am.b();
                  }
               } else {
                  fishing4.game.k.d();
                  if (fishing4.game.j.a == 0 && this.J.a(var1, true)) {
                     if (bh.a == 51) {
                        am.a(161);
                     } else {
                        fishing4.game.l.a(2);
                        aa.d = 4;
                     }
                  } else if (this.g != null && fishing4.game.j.a == 4) {
                     this.g.c();
                  }
               }
               break;
            case 2:
               if (this.x != null) {
                  if (bh.a() && bh.a != 51) {
                     if (bh.b >= 60) {
                        var10 = bh.c;
                        if (be.a()) {
                           aa.d = 3;
                        }
                     }
                  } else {
                     fishing4.game.k.d();
                     ah var12 = this.x;
                     ah.b(var1);
                  }
               }
               break;
            case 3:
               if (this.y != null) {
                  if (bh.a() && bh.a != 51) {
                     if (bh.b >= 60) {
                        bh.a(var1);
                     }
                  } else {
                     fishing4.game.k.d();
                     this.y.a(var1);
                  }
               }
               break;
            case 4:
               if (bh.a() && bh.a != 51) {
                  bh.a(var1);
               } else if (am.e && am.d()) {
                  if (am.b == 180) {
                     if (am.c.a(var1, true)) {
                        Log.d("", "sms50:코인부족 충전 예누름요");
                        Log.d("", "sms50:servercoincheck1");
                        aq.b = 16;
                        fishing4.game.k.o();
                     } else if (am.d.a(var1, true)) {
                        Log.d("", "sms50:코인부족 충전 아니오 누름요");
                        am.b = -1;
                        fishing4.game.l.a(fishing4.game.l.d);
                     }
                  } else if (am.b == 181) {
                     Log.d("", "sms50:충전할 코인 가격 선택요");
                     aq.b(var1);
                  } else if (am.b >= 185 && am.b <= 190) {
                     if (am.c.a(var1, true)) {
                        switch (am.b) {
                           case 185:
                              fishing4.a.r.g = "fish4_gg_001";
                              fishing4.a.r.g();
                              aq.b = 10;
                              w = true;
                              break;
                           case 186:
                              fishing4.a.r.g = "fish4_gg_002";
                              fishing4.a.r.g();
                              aq.b = 11;
                              w = true;
                              break;
                           case 187:
                              fishing4.a.r.g = "fish4_gg_003";
                              fishing4.a.r.g();
                              aq.b = 12;
                              w = true;
                              break;
                           case 188:
                              fishing4.a.r.g = "fish4_gg_004";
                              fishing4.a.r.g();
                              aq.b = 13;
                              w = true;
                              break;
                           case 189:
                              fishing4.a.r.g = "fish4_gg_005";
                              fishing4.a.r.g();
                              aq.b = 14;
                              w = true;
                              break;
                           case 190:
                              fishing4.a.r.g = "fish4_gg_006";
                              fishing4.a.r.g();
                              aq.b = 15;
                              w = true;
                        }
                     } else if (am.d.a(var1, true)) {
                        am.a(181);
                        w = false;
                     }
                  } else if (am.b != 182 && am.b != 45 && am.b != 46 && am.b != 174 && am.b != 173 && am.b != 175) {
                     if (am.a == 1) {
                        if (!fishing4.a.r.i) {
                           if (am.c.a(var1, true)) {
                              if (fishing4.game.l.d != 2 && fishing4.game.l.d != 1) {
                                 if (fishing4.game.l.d == 61) {
                                    o = 1;
                                 } else if (fishing4.game.l.d == 80) {
                                    o = 1;
                                 } else if (fishing4.game.l.d == 12) {
                                    if (p >= 201 && p <= 205) {
                                       if (ad.p.b() >= 0L && ab.a(p) > 0 && ad.p.b() >= (long)ab.a(p)) {
                                          aq.b = 3;
                                          fishing4.game.k.o();
                                       } else {
                                          am.a(180);
                                       }
                                    } else if (p >= 206 && p <= 214) {
                                       if (ad.p.b() >= 0L && ab.a(p) > 0 && ad.p.b() >= (long)ab.a(p)) {
                                          aq.b = 4;
                                          fishing4.game.k.o();
                                       } else {
                                          am.a(180);
                                       }
                                    } else if (ad.p.b() >= 0L && ab.a(p) > 0 && ad.p.b() >= (long)ab.a(p)) {
                                       aq.b = 5;
                                       fishing4.game.k.o();
                                    } else {
                                       am.a(180);
                                    }
                                 } else if (fishing4.game.l.d == 55) {
                                    if (ad.p.b() >= 0L && ab.a(p) > 0 && ad.p.b() >= (long)ab.a(p)) {
                                       aq.b = 20;
                                       fishing4.game.k.o();
                                    } else {
                                       am.a(180);
                                    }
                                 } else if (fishing4.game.l.d == 56) {
                                    if (ad.p.b() >= 0L && ab.a(p) > 0 && ad.p.b() >= (long)ab.a(p)) {
                                       aq.b = 21;
                                       fishing4.game.k.o();
                                    } else {
                                       am.a(180);
                                    }
                                 } else if (fishing4.game.l.d == 57) {
                                    if (ad.p.b() >= 0L && ab.a(p) > 0 && ad.p.b() >= (long)ab.a(p)) {
                                       aq.b = 2;
                                       fishing4.game.k.o();
                                    } else {
                                       am.a(180);
                                    }
                                 } else if (fishing4.game.l.d == 58) {
                                    if (ad.p.b() >= 0L && ab.a(p) > 0 && ad.p.b() >= (long)ab.a(p)) {
                                       aq.b = 2;
                                       fishing4.game.k.o();
                                    } else {
                                       am.a(180);
                                    }
                                 } else if (fishing4.game.l.d == 59) {
                                    if (ad.p.b() >= 0L && ab.a(p) > 0 && ad.p.b() >= (long)ab.a(p)) {
                                       aq.b = 2;
                                       fishing4.game.k.o();
                                    } else {
                                       am.a(180);
                                    }
                                 } else if (fishing4.game.l.d == 66) {
                                    fishing4.game.u.o = true;
                                    fishing4.game.u.d();
                                    fishing4.game.p.o = true;
                                    fishing4.game.l.a(62);
                                 }
                              } else {
                                 fishing4.game.q.c(16);
                                 am.b();
                                 fishing4.game.z.a(3);
                              }
                           } else if (!am.d.a(var1, true)) {
                              fishing4.game.k.d();
                           } else if (!fishing4.a.r.i) {
                              if (fishing4.game.l.d == 61) {
                                 fishing4.game.l.a(64);
                              } else if (fishing4.game.l.d == 80) {
                                 fishing4.game.p.h.a(0L);
                                 fishing4.game.l.a(82);
                              } else if (fishing4.game.l.d == 55) {
                                 fishing4.game.l.a(44);
                              } else if (fishing4.game.l.d == 56) {
                                 fishing4.game.l.a(48);
                              } else if (fishing4.game.l.d == 57) {
                                 fishing4.game.l.a(52);
                              } else if (fishing4.game.l.d == 58) {
                                 fishing4.game.l.a(53);
                              } else if (fishing4.game.l.d == 59) {
                                 fishing4.game.l.a(54);
                              } else if (fishing4.game.l.d == 66) {
                                 fishing4.game.l.a(62);
                              } else {
                                 am.b();
                                 aa.d = 1;
                              }
                           }
                        }
                     } else if (am.c.a(var1, true)) {
                        label715: {
                           label635: {
                              float var2;
                              int var5;
                              boolean var11;
                              label505: {
                                 label504: {
                                    label636: {
                                       label502: {
                                          label501: {
                                             label648: {
                                                fishing4.a.r.h();
                                                switch (fishing4.game.l.d) {
                                                   case 0:
                                                   case 1:
                                                      aa.d = 1;
                                                      return;
                                                   case 2:
                                                   case 3:
                                                   case 4:
                                                   case 5:
                                                   case 6:
                                                   case 7:
                                                   case 8:
                                                   case 9:
                                                   case 12:
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
                                                   case 49:
                                                   case 50:
                                                   case 51:
                                                   case 55:
                                                   case 56:
                                                   case 57:
                                                   case 58:
                                                   case 59:
                                                   case 61:
                                                   case 66:
                                                   case 67:
                                                   case 68:
                                                   case 69:
                                                   case 76:
                                                   case 77:
                                                   case 78:
                                                   case 79:
                                                   case 80:
                                                   case 86:
                                                   case 87:
                                                   case 88:
                                                   case 89:
                                                   default:
                                                      return;
                                                   case 10:
                                                      aa.d = 1;
                                                      return;
                                                   case 11:
                                                      aa.d = 3;
                                                      return;
                                                   case 13:
                                                      aa.d = 1;
                                                      return;
                                                   case 40:
                                                      if (fishing4.game.x.a(fishing4.game.m.b(i), fishing4.game.m.d(fishing4.game.i.b))) {
                                                         fishing4.game.l.a(46);
                                                         return;
                                                      }
                                                      break label648;
                                                   case 41:
                                                      break label505;
                                                   case 42:
                                                      break label715;
                                                   case 43:
                                                      if (fishing4.game.u.d) {
                                                         fishing4.game.k.q();
                                                         if (fishing4.a.z.a(100) < 5) {
                                                            fishing4.game.l.a(61);
                                                            return;
                                                         }

                                                         if (fishing4.a.z.a(100) < 5) {
                                                            fishing4.game.p.h.a(1L);
                                                            fishing4.game.l.a(80);
                                                            return;
                                                         }

                                                         if (fishing4.game.k.n()) {
                                                            fishing4.game.p.h.a(1L);

                                                            while(fishing4.game.k.n()) {
                                                               fishing4.game.p.g.b(1L);
                                                            }

                                                            fishing4.game.l.a(80);
                                                            return;
                                                         }
                                                      } else {
                                                         if (fishing4.a.z.a(100) < 5) {
                                                            fishing4.game.p.h.a(1L);
                                                            fishing4.game.l.a(80);
                                                            return;
                                                         }

                                                         if (fishing4.game.k.n()) {
                                                            fishing4.game.p.h.a(1L);

                                                            while(fishing4.game.k.n()) {
                                                               fishing4.game.p.g.b(1L);
                                                            }

                                                            fishing4.game.l.a(80);
                                                            return;
                                                         }
                                                      }
                                                   case 62:
                                                   case 63:
                                                   case 64:
                                                   case 81:
                                                   case 82:
                                                   case 84:
                                                   case 85:
                                                   case 90:
                                                   case 91:
                                                      ag var9;
                                                      if (((ag)ad.h.get(ad.g)).a >= 80 && ((ag)ad.h.get(ad.g)).a <= 86 || ((ag)ad.h.get(ad.g)).a == 88 && ((ag)ad.h.get(ad.g)).d < 5) {
                                                         var2 = fishing4.game.m.a(i, fishing4.game.i.b);
                                                         var9 = (ag)ad.h.get(ad.g);
                                                         if (var2 > (float)ag.a(var9.a, var9.d)) {
                                                            fishing4.game.l.a(45);
                                                            fishing4.game.q.c(12);
                                                            return;
                                                         }
                                                      }

                                                      this.S = true;
                                                      var9 = (ag)ad.h.get(ad.g);
                                                      m var8 = fishing4.game.m.a(fishing4.game.i.b, i);
                                                      if (var9.b.size() < var9.j()) {
                                                         var9.b.add(var8);
                                                      }

                                                      var5 = fishing4.game.i.b;
                                                      var2 = i;
                                                      if (var5 == fishing4.game.r.c) {
                                                         if (fishing4.game.r.e() == 0) {
                                                            if (var2 > fishing4.game.r.d) {
                                                               fishing4.game.r.d = var2;
                                                            }
                                                         } else if (fishing4.game.r.e() == 1) {
                                                            if (fishing4.game.r.a <= 4) {
                                                               if (fishing4.game.m.b(var2) + 1 >= 2) {
                                                                  ++fishing4.game.r.d;
                                                               }
                                                            } else if (fishing4.game.r.a <= 10) {
                                                               if (fishing4.game.m.b(var2) + 1 >= 3) {
                                                                  ++fishing4.game.r.d;
                                                               }
                                                            } else if (fishing4.game.m.b(var2) + 1 >= 4) {
                                                               ++fishing4.game.r.d;
                                                            }
                                                         }
                                                      }
                                                   case 30:
                                                   case 31:
                                                   case 32:
                                                   case 45:
                                                   case 60:
                                                   case 70:
                                                   case 71:
                                                   case 72:
                                                   case 73:
                                                   case 74:
                                                   case 75:
                                                      if (ad.a != -1 && ad.b(0) != 100 && ad.a(0).h() <= 0) {
                                                         var5 = ((ac)ad.i.get(ad.a)).f();
                                                         r = var5;
                                                         p = var5;
                                                         q = ((ac)ad.i.get(ad.a)).d();
                                                         fishing4.game.l.a(55);
                                                         ad.i.remove(ad.a);
                                                         ad.a = -1;
                                                         fishing4.game.k.f();
                                                         return;
                                                      }
                                                   case 44:
                                                      break;
                                                   case 46:
                                                      break label648;
                                                   case 47:
                                                      break label502;
                                                   case 48:
                                                      break label501;
                                                   case 52:
                                                      break label636;
                                                   case 53:
                                                      break label504;
                                                   case 54:
                                                      break label635;
                                                   case 65:
                                                      fishing4.game.l.a(61);
                                                      return;
                                                   case 83:
                                                      fishing4.game.l.a(80);
                                                      return;
                                                }

                                                if (ad.b != -1 && ad.b(2) != 300 && ad.a(2).h() <= 0) {
                                                   var5 = ((ac)ad.k.get(ad.b)).f();
                                                   r = var5;
                                                   p = var5;
                                                   q = ((ac)ad.k.get(ad.b)).d();
                                                   fishing4.game.l.a(56);
                                                   ad.k.remove(ad.b);
                                                   ad.b = -1;
                                                   fishing4.game.k.f();
                                                   return;
                                                }
                                                break label501;
                                             }

                                             if (fishing4.game.x.f(fishing4.game.m.d(fishing4.game.i.b))) {
                                                fishing4.game.l.a(47);
                                                return;
                                             }
                                             break label502;
                                          }

                                          if (ad.f != -1 && ad.b(4) != -1 && ad.a(4).h() <= 0) {
                                             fishing4.game.l.a(49);
                                             return;
                                          }
                                          break label636;
                                       }

                                       var5 = fishing4.game.i.b;
                                       var2 = i;
                                       if (var5 >= 0 && var5 <= 186) {
                                          if (fishing4.game.s.a[var5] == 0.0F) {
                                             ++fishing4.game.s.c;
                                             fishing4.game.s.a[var5] = var2;
                                             var11 = true;
                                          } else if (fishing4.game.s.a[var5] < var2) {
                                             fishing4.game.s.a[var5] = var2;
                                             var11 = true;
                                          } else {
                                             var11 = false;
                                          }
                                       } else {
                                          var11 = false;
                                       }

                                       if (var11) {
                                          fishing4.game.l.a(41);
                                          return;
                                       }
                                       break label505;
                                    }

                                    if (ad.e != -1 && ad.b(3) != -1 && ad.a(3).h() <= 0) {
                                       fishing4.game.l.a(50);
                                       return;
                                    }
                                 }

                                 if (ad.d != -1 && ad.b(5) != -1 && ad.a(5).h() <= 0) {
                                    fishing4.game.l.a(51);
                                    return;
                                 }
                                 break label635;
                              }

                              var5 = fishing4.game.i.b;
                              float var4 = i;
                              if (var5 >= 0 && var5 <= 186) {
                                 if (fishing4.game.s.b[var5] == 0.0F) {
                                    ++fishing4.game.s.d;
                                    fishing4.game.s.b[var5] = var4;
                                    var11 = true;
                                 } else if (fishing4.game.m.b(var4) > fishing4.game.m.b(fishing4.game.s.b[var5])) {
                                    fishing4.game.s.b[var5] = var4;
                                    var11 = true;
                                 } else {
                                    label634: {
                                       if (fishing4.game.m.b(var4) == fishing4.game.m.b(fishing4.game.s.b[var5])) {
                                          if (var4 > 1.0F) {
                                             var2 = var4 - 1.0F;
                                          } else {
                                             var2 = (1.0F - var4) * 2.0F;
                                          }

                                          float var3;
                                          if (fishing4.game.s.b[var5] > 1.0F) {
                                             var3 = fishing4.game.s.b[var5] - 1.0F;
                                          } else {
                                             var3 = (1.0F - fishing4.game.s.b[var5]) * 2.0F;
                                          }

                                          if (var2 > var3) {
                                             fishing4.game.s.b[var5] = var4;
                                             var11 = true;
                                             break label634;
                                          }
                                       }

                                       var11 = false;
                                    }
                                 }
                              } else {
                                 var11 = false;
                              }

                              if (var11) {
                                 fishing4.game.l.a(42);
                                 return;
                              }
                              break label715;
                           }

                           if (this.S) {
                              boolean var6 = fishing4.game.y.a(false);
                              boolean var7 = fishing4.game.y.b(false);
                              if (var6) {
                                 l = true;
                              } else if (var7) {
                                 m = true;
                              }

                              if (fishing4.game.m.b(i) >= 4) {
                                 fishing4.game.q.c(2);
                              }

                              if (fishing4.game.m.d(fishing4.game.i.b) == 8) {
                                 fishing4.game.q.c(3);
                              }

                              if (fishing4.game.m.a(i, fishing4.game.i.b) <= 8.0F) {
                                 fishing4.game.q.c(4);
                              }

                              if (fishing4.game.m.a(i, fishing4.game.i.b) >= 2400.0F) {
                                 fishing4.game.q.c(5);
                              }

                              if (bh.a() && bh.a == 51 && bh.b <= 3) {
                                 bh.a = 52;
                                 bd.a(2131165300);
                                 be.a = true;
                              }
                           }

                           aa.d = 1;
                           return;
                        }

                        j = fishing4.game.y.a(fishing4.game.i.b, i);
                        k = fishing4.game.y.b(fishing4.game.i.b, i);
                        fishing4.game.l.a(43);
                     }
                  } else if (am.c.a(var1, true)) {
                     fishing4.a.r.h();
                     am.b = -1;
                     fishing4.game.l.a(fishing4.game.l.d);
                  }
               }
         }
      }

   }

   public final void c(GL10 var1) {
   }

   public final void d(GL10 var1) {
      fishing4.a.w.a(var1, this.z);
      this.z = null;
      fishing4.a.w.a(var1, this.A);
      this.A = null;
      fishing4.a.w.a(var1, this.B);
      this.B = null;
      fishing4.a.w.a(var1, this.C);
      this.C = null;
      fishing4.a.w.a(var1, this.D);
      this.D = null;
      fishing4.a.w.a(var1, this.E);
      this.E = null;
      fishing4.a.w.a(var1, this.F);
      this.F = null;
      fishing4.a.w.a(var1, this.G);
      this.G = null;
      fishing4.a.w.a(var1, this.H);
      this.H = null;
      fishing4.a.w.a(var1, this.I);
      this.I = null;
      fishing4.a.w.a(var1, az.G);
      az.G = null;
      this.J.a();
      ay.a(var1);
      if (this.g != null) {
         this.g.a();
         this.g = null;
      }

      if (this.x != null) {
         this.x.b(var1);
         this.x = null;
      }

      if (this.y != null) {
         this.y.a(var1);
         this.y = null;
      }

      fishing4.game.l.a(var1);
      av.e(var1);
      fishing4.b.d.a().e();
   }

   public final void e(GL10 var1) {
      byte var6 = 0;
      var1.glLoadIdentity();
      var1.glTranslatef(0.0F, 0.0F, 0.0F);
      int var4;
      fishing4.a.w var9;
      fishing4.a.w var10;
      fishing4.a.w var11;
      switch (aa.c) {
         case 0:
            fishing4.game.k.a(var1);
            break;
         case 1:
            ay.b(var1, e / 2);
            av.b(var1, e);
            this.g.a(var1, this.z, this.A, this.B, e);
            if (fishing4.game.j.a == 0) {
               this.J.a(var1, az.s, az.t, fishing4.a.e.a(75.0F, 25.0F));
               if (!bh.a()) {
                  fishing4.a.m.a(var1, (float)(fishing4.a.m.a() - 85), 20.0F, 160.0F, 30.0F, fishing4.a.aa.a());
                  fishing4.a.m.a(var1, az.s, (float)(fishing4.a.m.a() - 130), 20.0F, 794.0F, 576.0F, 140.0F, 66.0F, fishing4.a.g.a(0.35F));
                  fishing4.a.ae.a(var1, ((ag)ad.h.get(ad.g)).g(), (float)(fishing4.a.m.a() - 80), 20.0F, 140.0F, 50.0F, 24.0F, 1);
               }

               if (ad.a != -1) {
                  var4 = ((ac)ad.i.get(ad.a)).h() * 100 / ((ac)ad.i.get(ad.a)).j();
                  ac.a(var1, this.E, 50.0F, 250.0F, ((ac)ad.i.get(ad.a)).f(), var4);
               } else {
                  ac.a(var1, this.E, 50.0F, 250.0F);
               }

               if (ad.c != -1) {
                  ac.a(var1, this.E, 50.0F, 180.0F, ((ac)ad.j.get(ad.c)).f());
                  fishing4.game.k.a(var1, ((ac)ad.j.get(ad.c)).c(), fishing4.a.e.a(68.0F, 162.0F), 1);
               } else {
                  ac.a(var1, this.E, 50.0F, 180.0F);
               }

               if (ad.b != -1) {
                  var4 = ((ac)ad.k.get(ad.b)).h() * 100 / ((ac)ad.k.get(ad.b)).j();
                  ac.a(var1, this.E, 50.0F, 110.0F, ((ac)ad.k.get(ad.b)).f(), var4);
               } else {
                  ac.a(var1, this.E, 50.0F, 110.0F);
               }

               if (ad.f != -1) {
                  var4 = ((ac)ad.m.get(ad.f)).h() * 100 / ((ac)ad.m.get(ad.f)).j();
                  ac.a(var1, this.E, 120.0F, 250.0F, ((ac)ad.m.get(ad.f)).f(), var4);
               } else {
                  ac.a(var1, this.E, 120.0F, 250.0F);
               }

               if (ad.e != -1) {
                  var4 = ((ac)ad.l.get(ad.e)).h() * 100 / ((ac)ad.l.get(ad.e)).j();
                  ac.a(var1, this.E, 120.0F, 180.0F, ((ac)ad.l.get(ad.e)).f(), var4);
               } else {
                  ac.a(var1, this.E, 120.0F, 180.0F);
               }

               if (ad.d != -1) {
                  var4 = ((ac)ad.n.get(ad.d)).h() * 100 / ((ac)ad.n.get(ad.d)).j();
                  ac.a(var1, this.E, 120.0F, 110.0F, ((ac)ad.n.get(ad.d)).f(), var4);
               } else {
                  ac.a(var1, this.E, 120.0F, 110.0F);
               }
            }

            var4 = e;
            fishing4.game.k.c();
            break;
         case 2:
            ay.b(var1, e / 2);
            av.b(var1, e);
            this.x.a(var1, this.C, az.s, az.t, e);
            var4 = e;
            fishing4.game.k.c();
            break;
         case 3:
            this.y.a(var1, this.C, this.G, this.H, this.F, this.I, e);
            av.b(var1, e);
            var10 = az.s;
            var9 = az.t;
            var11 = az.u;
            var11 = az.v;
            fishing4.game.l.a(var1, var10, var9, e);
            i var14 = this.y;
            var9 = this.G;
            var14.b(var1, e);
            this.y.a.a(var1, this.G);
            var4 = e;
            fishing4.game.k.c();
            break;
         case 4:
            ay.b(var1, e / 2);
            av.b(var1, e);
            var9 = az.s;
            var10 = az.t;
            var11 = az.u;
            var11 = az.v;
            fishing4.game.l.a(var1, var9, var10, e);
            am.a(var1, e);
            fishing4.a.r var12;
            if (fishing4.game.l.d == 61) {
               if (o == 1) {
                  label329: {
                     if (this.L == 0) {
                        this.K.a(6);
                        this.L = 1;
                     }

                     this.K.a(var1);
                     if (this.L == 1) {
                        var12 = this.K;
                        if (fishing4.a.r.b()) {
                           this.K.b(6);
                           this.L = 2;
                        }
                     } else if (this.L == 2 && this.K.c()) {
                        this.L = 0;
                        o = 2;
                     }

                     var12 = this.K;
                     if (fishing4.a.r.d() != 99) {
                        var12 = this.K;
                        if (fishing4.a.r.d() != 100) {
                           break label329;
                        }
                     }

                     if (!this.K.c()) {
                        fishing4.game.l.a(65);
                        this.L = 0;
                        o = 0;
                     }
                  }
               } else if (o == 2) {
                  var12 = this.K;
                  if (fishing4.a.r.f() == 99) {
                     am.a(46);
                     this.L = 0;
                     o = 0;
                  } else {
                     var12 = this.K;
                     if (fishing4.a.r.e() == 1) {
                        if (fishing4.a.r.ae >= 100000 && !fishing4.game.u.o) {
                           fishing4.game.l.a(66);
                        } else {
                           fishing4.game.l.a(62);
                        }
                     } else {
                        var12 = this.K;
                        if (fishing4.a.r.e() == 0) {
                           am.a(171);
                        } else {
                           var12 = this.K;
                           if (fishing4.a.r.e() == 2) {
                              am.a(172);
                           } else {
                              var12 = this.K;
                              if (fishing4.a.r.e() == 3) {
                                 fishing4.game.u.d = false;
                                 fishing4.game.u.d();
                                 fishing4.game.l.a(63);
                              }
                           }
                        }
                     }

                     o = 0;
                  }
               }
            } else if (fishing4.game.l.d == 80) {
               if (o == 1) {
                  label341: {
                     if (this.L == 0) {
                        this.K.a(4);
                        this.L = 1;
                     }

                     this.K.a(var1);
                     if (this.L == 1) {
                        var12 = this.K;
                        if (fishing4.a.r.b()) {
                           long var7 = fishing4.game.p.h.b();
                           fishing4.game.p.i = null;
                           if (var7 >= 2L && var7 <= 10L) {
                              fishing4.game.p.i = new String("네트워크낚시터 코인 획득");
                           } else {
                              fishing4.game.p.i = new String("코인물고기 획득");
                           }

                           aq.b = 23;
                           this.K.b(4);
                           this.L = 2;
                        }
                     } else if (this.L == 2 && this.K.c()) {
                        this.L = 0;
                        o = 2;
                     }

                     var12 = this.K;
                     if (fishing4.a.r.d() != 99) {
                        var12 = this.K;
                        if (fishing4.a.r.d() != 100) {
                           break label341;
                        }
                     }

                     if (!this.K.c()) {
                        fishing4.game.l.a(83);
                        this.L = 0;
                        o = 0;
                     }
                  }
               } else if (o == 2) {
                  var12 = this.K;
                  if (fishing4.a.r.f() == 99) {
                     am.a(46);
                     this.L = 0;
                     o = 0;
                  } else {
                     var12 = this.K;
                     if (fishing4.a.r.e() == 1) {
                        fishing4.game.l.a(81);
                     } else {
                        var12 = this.K;
                        if (fishing4.a.r.e() == 0) {
                           am.a(173);
                        } else {
                           var12 = this.K;
                           if (fishing4.a.r.e() == 2) {
                              fishing4.game.l.a(84);
                           } else {
                              var12 = this.K;
                              if (fishing4.a.r.e() == 3) {
                                 fishing4.game.l.a(85);
                              }
                           }
                        }
                     }

                     o = 0;
                  }
               }
            } else if (fishing4.a.r.j) {
               if (o == 1) {
                  label342: {
                     if (this.L == 0) {
                        this.K.a(4);
                        this.L = 1;
                     }

                     this.K.a(var1);
                     if (this.L == 1) {
                        var12 = this.K;
                        if (fishing4.a.r.b()) {
                           switch (aq.b) {
                              case 10:
                                 fishing4.game.p.h.a(200L);
                                 break;
                              case 11:
                                 fishing4.game.p.h.a(515L);
                                 break;
                              case 12:
                                 fishing4.game.p.h.a(840L);
                                 break;
                              case 13:
                                 fishing4.game.p.h.a(1400L);
                                 break;
                              case 14:
                                 fishing4.game.p.h.a(3300L);
                                 break;
                              case 15:
                                 fishing4.game.p.h.a(6000L);
                                 break;
                              case 16:
                                 fishing4.game.p.h.a(0L);
                                 break;
                              default:
                                 fishing4.game.p.h.a((long)(aq.b() * -1));
                           }

                           if (aq.b >= 10 && aq.b <= 15) {
                              fishing4.game.p.i = null;
                              fishing4.game.p.i = new String("낚시터 아이템 부활");
                              this.K.b(3);
                              this.L = 2;
                           } else {
                              fishing4.game.p.i = null;
                              fishing4.game.p.i = new String("낚시터 아이템 부활");
                              this.K.b(4);
                              this.L = 2;
                           }
                        }
                     } else if (this.L == 2 && this.K.c()) {
                        this.L = 0;
                        o = 2;
                     }

                     var12 = this.K;
                     if (fishing4.a.r.d() != 99) {
                        var12 = this.K;
                        if (fishing4.a.r.d() != 100) {
                           break label342;
                        }
                     }

                     if (!this.K.c()) {
                        am.a(45);
                        this.L = 0;
                        o = 0;
                     }
                  }
               } else if (o == 2) {
                  var12 = this.K;
                  if (fishing4.a.r.f() == 99) {
                     am.a(46);
                     this.L = 0;
                     o = 0;
                  } else {
                     var12 = this.K;
                     if (fishing4.a.r.c(fishing4.a.r.e())) {
                        var4 = 1;
                     } else {
                        var4 = 0;
                     }

                     o = var4;
                  }
               }
            } else if (o == 1) {
               label334: {
                  if (this.L == 0) {
                     this.K.a(3);
                     this.L = 1;
                  }

                  this.K.a(var1);
                  if (this.L == 1) {
                     var12 = this.K;
                     if (fishing4.a.r.b()) {
                        this.K.b(3);
                        this.L = 2;
                     }
                  } else if (this.L == 2 && this.K.c()) {
                     this.L = 0;
                     o = 2;
                  }

                  var12 = this.K;
                  if (fishing4.a.r.d() != 99) {
                     var12 = this.K;
                     if (fishing4.a.r.d() != 100) {
                        break label334;
                     }
                  }

                  if (!this.K.c()) {
                     am.a(45);
                     this.L = 0;
                     o = 0;
                  }
               }
            } else if (o == 2) {
               var12 = this.K;
               if (fishing4.a.r.f() == 99) {
                  am.a(46);
                  this.L = 0;
                  o = 0;
               } else {
                  var12 = this.K;
                  fishing4.a.r.c(fishing4.a.r.e());
                  o = 0;
               }
            }
      }

      int var5;
      if (l) {
         if (n < 46) {
            var4 = fishing4.a.m.b() + 23 - n;
         } else {
            var4 = fishing4.a.m.b() - 23;
         }

         if (n < 100) {
            var5 = 255;
         } else {
            var5 = 255 - (n - 100) * 25;
         }

         fishing4.a.m.a(var1, az.s, fishing4.a.m.c(), (float)(var4 - 5), 0.0F, 527.0F, 332.0F, 46.0F, var5);
         if (fishing4.game.p.a == 0) {
            fishing4.a.ae.a(var1, "공인협회 " + fishing4.a.y.a(2131165318), fishing4.a.m.c(), (float)(var4 - 5), (float)var5);
         } else {
            fishing4.a.ae.a(var1, "Public " + fishing4.a.y.a(2131165318), fishing4.a.m.c(), (float)(var4 - 5), (float)var5);
         }
      } else if (m) {
         if (n < 46) {
            var4 = fishing4.a.m.b() + 23 - n;
         } else {
            var4 = fishing4.a.m.b() - 23;
         }

         if (n < 100) {
            var5 = 255;
         } else {
            var5 = 255 - (n - 100) * 25;
         }

         fishing4.a.m.a(var1, az.s, fishing4.a.m.c(), (float)(var4 - 5), 0.0F, 527.0F, 332.0F, 46.0F, var5);
         if (fishing4.game.p.a == 0) {
            fishing4.a.ae.a(var1, "민간협회 " + fishing4.a.y.a(2131165318), fishing4.a.m.c(), (float)(var4 - 5), (float)var5);
         } else {
            fishing4.a.ae.a(var1, "Private " + fishing4.a.y.a(2131165318), fishing4.a.m.c(), (float)(var4 - 5), (float)var5);
         }
      }

      if (bh.a() && aa.c != 0) {
         bh.a(var1, e);
      }

      if (aa.c == 1) {
         if (fishing4.game.j.a == 0 && !bh.a()) {
            var4 = e;
            float var2;
            float var3;
            if (fishing4.game.p.j) {
               var2 = fishing4.a.m.c();
               var3 = 40.0F;
            } else {
               var2 = 40.0F;
               var3 = (float)(fishing4.a.m.b() - 40);
            }

            short var13;
            switch (var4 % 40) {
               case 0:
                  var13 = 64;
                  break;
               case 1:
                  var13 = 128;
                  break;
               case 2:
                  var13 = 255;
                  break;
               case 3:
                  var13 = 255;
                  break;
               case 4:
                  var13 = 255;
                  break;
               case 5:
                  var13 = 225;
                  break;
               case 6:
                  var13 = 200;
                  break;
               case 7:
                  var13 = 175;
                  break;
               case 8:
                  var13 = 150;
                  break;
               case 9:
                  var13 = 125;
                  break;
               case 10:
                  var13 = 100;
                  break;
               case 11:
                  var13 = 75;
                  break;
               case 12:
                  var13 = 50;
                  break;
               case 13:
                  var13 = 25;
                  break;
               default:
                  var13 = var6;
            }

            fishing4.a.m.a(var1, az.G, var2, var3, 66.0F, 0.0F, 60.0F, 56.0F);
            fishing4.a.m.a(var1, az.G, var2, var3, 66.0F, 58.0F, 60.0F, 52.0F, '\u0001', var13);
            fishing4.a.m.a(var1, az.G, var2 - 15.0F, var3 + 15.0F, 0.0F, 0.0F, 64.0F, 64.0F, '\u0001', var13);
         }

         am.a(var1, e);
      }

      this.Q.a(var1, e);
   }

   public final void f(GL10 var1) {
      switch (aa.c) {
         case 0:
         default:
            break;
         case 1:
            if (fishing4.game.j.a == 0 && System.currentTimeMillis() - fishing4.game.q.c >= 1800000L && !az.e) {
               fishing4.game.q.c(11);
            }
            break;
         case 2:
            ah var3 = this.x;
            int var2 = e;
            var3.a();
            break;
         case 3:
            this.y.b();
      }

      this.a(var1);
      if (l || m) {
         if (n < 110) {
            ++n;
         } else {
            l = false;
            m = false;
            n = 0;
         }
      }

      if (aa.c == 1 || aa.c == 2) {
         if (!az.e) {
            if (System.currentTimeMillis() - this.R > 3000L) {
               if (fishing4.a.z.a(100) < 35) {
                  switch (f) {
                     case 1:
                        fishing4.b.d.a().b(fishing4.a.s.a(), 2131034121);
                        break;
                     case 3:
                        fishing4.b.d.a().b(fishing4.a.s.a(), 2131034123);
                        break;
                     case 7:
                        fishing4.b.d.a().b(fishing4.a.s.a(), 2131034122);
                  }
               }

               this.R = System.currentTimeMillis();
            }
         } else {
            this.R = System.currentTimeMillis();
         }
      }

   }
}

package fishing4.a;

import android.util.Log;

import fishing4.game.aq;
import fishing4.game.aw;
import fishing4.game.az;
import fishing4.game.bg;
import fishing4.game.globalConfig;

import javax.microedition.khronos.opengles.GL10;

public final class r implements Runnable {
   public static boolean A;
   public static boolean B;
   public static int C;
   public static String[] D = new String[5];
   public static byte E;
   public static byte F;
   public static String G = "";
   public static boolean H = false;
   public static boolean I = false;
   public static int numGiftsWaiting = 0;
   public static int[] K;
   public static int[] L;
   public static AESUtils M = AESUtils.a();
   public static String N = "01";
   public static int O;
   public static int P;
   public static int Q;
   public static byte R;
   public static String[] S = new String[5];
   public static int[] T = new int[5];
   public static int[] U = new int[5];
   public static int V;
   public static int W;
   public static byte X;
   public static byte Y;
   public static int[] Z = new int[187];
   public static String phoneNumber = null;
   public static String[] aa = new String[187];
   public static int[] ab = new int[187];
   public static int[] ac = new int[187];
   public static int[] ad = new int[187];
   public static int ae;
   public static boolean af;
   public static boolean ag = true;
   public static boolean ah = false;
   public static int ai = 0;
   public static boolean aj = true;
   public static String ak = "";
   private static int al;
   private static byte[] am;
   public static String deviceId = null;
   public static final boolean c = fishing4.a.u.a();
   public static String deviceModel = null;
   public static String deviceBuildVersion;
   public static int f;
   public static String g = "";
   public static boolean h = false;
   public static boolean i = false;
   public static boolean j = false;
   public static final byte k = Byte.valueOf("8");
   public static int l;
   public static String m = "";
   public static String n = "";
   public static boolean o;
   public static byte[] p = new byte[21];
   public static byte[] q = new byte[21];
   public static long u;
   static byte y;
   public static boolean z;
   int r;
   byte s;
   boolean t;
   long v;
   int w;
   int x;

   public r() {
      o = false;
      B = false;
      l = 1000;
   }

   public static void a() {
      o = false;
      B = false;
      l = 1000;
   }

   public static void a(String var0) {
      ak = var0;
   }

   private void a(GL10 var1, String var2) {
      if (fishing4.game.z.b() != 2) {
         fishing4.game.am.a(var1, az.s, fishing4.a.m.e(), fishing4.a.g.a(18.0F));
         fishing4.a.ae.a(var1, var2, fishing4.a.m.c(), fishing4.a.m.d() + 70.0F, 300.0F, 80.0F, 26.0F, 4);
         if (globalConfig.languageId == 0) {
            fishing4.a.ae.a(var1, "강제종료시 데이터가 손상될 수 있으니 절대 강제종료하지 마시기 바랍니다.", fishing4.a.m.c(), fishing4.a.m.d() - 100.0F, 300.0F, 90.0F, 24.0F, 4, fishing4.a.aa.c());
         } else {
            fishing4.a.ae.a(var1, "Do not close the app\nsuddenly as it can \nresult data crash.", fishing4.a.m.c(), fishing4.a.m.d() - 100.0F, 300.0F, 90.0F, 24.0F, 4, fishing4.a.aa.c());
         }

         fishing4.a.m.a(var1, fishing4.a.m.c(), fishing4.a.m.d(), 324.0F, 10.0F, fishing4.a.aa.a(1.0F, 1.0F, 1.0F, 1.0F));
         float var3 = fishing4.a.m.c();
         fishing4.a.m.a(var1, (float)(this.w % 81 * 4 / 2) + (var3 - 160.0F), fishing4.a.m.d(), (float)(this.w % 81 * 4), 6.0F, fishing4.a.aa.a(0.0F, 0.0F, 1.0F, 1.0F));
      }

   }

   private static void a(boolean var0) {
      int var1;
      if (var0) {
         for(var1 = 0; var1 < 5; ++var1) {
            D[var1] = null;
         }

         D = null;
         D = new String[5];
      }

      if (K != null) {
         for(var1 = 0; var1 < K.length; ++var1) {
            K[var1] = 0;
            L[var1] = 0;
         }

         K = null;
         L = null;
      }

   }

   private void b(boolean var1) {
      if (l != 100 || o) {
         Exception var10000;
         label29: {
            boolean var10001;
            if (var1) {
               try {
                  l = 100;
               } catch (Exception var5) {
                  var10000 = var5;
                  var10001 = false;
                  break label29;
               }
            } else {
               try {
                  l = 8;
                  this.t = true;
               } catch (Exception var4) {
                  var10000 = var4;
                  var10001 = false;
                  break label29;
               }
            }

            try {
               o = false;
               fishing4.a.q.c();
               return;
            } catch (Exception var3) {
               var10000 = var3;
               var10001 = false;
            }
         }

         Exception var2 = var10000;
         n = "disconnect() : " + var2;
      }

   }

   public static boolean b() {
      return o;
   }

   public static boolean c(int var0) {
      boolean var1;
      if (aq.b == 22) {
         if (z) {
            if (y == 1) {
               fishing4.game.am.a(200);
            } else if (y == 2) {
               fishing4.game.k.i();
               fishing4.game.am.a(203);
            } else {
               fishing4.game.am.a(202);
            }
         } else {
            switch (y) {
               case 0:
                  fishing4.game.am.a(202);
                  break;
               case 1:
                  fishing4.game.k.i();
                  if (!ah) {
                     ah = true;
                     var1 = true;
                     return var1;
                  }

                  fishing4.game.am.a(201);
                  break;
               case 2:
                  fishing4.game.k.i();
                  fishing4.game.am.a(203);
                  break;
               case 3:
                  fishing4.game.am.a(204);
               case 4:
               case 5:
               default:
                  break;
               case 6:
                  fishing4.game.am.a(205);
            }
         }
      } else if (j) {
         if (var0 == 1) {
            if (aq.b < 10 || aq.b > 15) {
               if (aq.b == 16) {
                  j = false;
                  var1 = false;
                  return var1;
               }

               fishing4.game.k.p();
            }

            if (fishing4.game.am.b == 217) {
               if (var0 == 1) {
                  bg.a(10, az.p);
               } else if (var0 == 3) {
                  fishing4.game.am.a(219);
               } else {
                  aw.r = aw.s;
                  fishing4.game.am.a(218);
               }
            } else if (aq.b == 17) {
               if (bg.b == 72) {
                  fishing4.game.am.i = 2131034145;
                  fishing4.game.am.a(0, fishing4.a.g.a(20.0F));
                  bg.b = 73;
               } else if (bg.b == 77) {
                  fishing4.game.am.i = 2131034145;
                  fishing4.game.am.a(0, fishing4.a.g.a(20.0F));
                  bg.b = 78;
               }
            } else if (aq.b == 18) {
               fishing4.game.am.b(0);
               bg.b = 22;
            } else if (var0 != 1) {
               if (var0 == 0) {
                  if (aq.b != 3 && aq.b != 4 && aq.b != 5 && aq.b != 20 && aq.b != 21 && fishing4.game.l.d != 12 && fishing4.game.l.d != 55 && fishing4.game.l.d != 56 && fishing4.game.l.d != 57 && fishing4.game.l.d != 58 && fishing4.game.l.d != 59) {
                     fishing4.game.am.a(73);
                  } else {
                     fishing4.game.l.a(70);
                  }
               } else if (var0 == 2) {
                  if (aq.b != 3 && aq.b != 4 && aq.b != 5 && aq.b != 20 && aq.b != 21 && fishing4.game.l.d != 12 && fishing4.game.l.d != 55 && fishing4.game.l.d != 56 && fishing4.game.l.d != 57 && fishing4.game.l.d != 58 && fishing4.game.l.d != 59) {
                     fishing4.game.am.a(74);
                  } else {
                     fishing4.game.l.a(71);
                  }
               } else if (var0 == 3) {
                  if (aq.b != 3 && aq.b != 4 && aq.b != 5 && aq.b != 20 && aq.b != 21 && fishing4.game.l.d != 12 && fishing4.game.l.d != 55 && fishing4.game.l.d != 56 && fishing4.game.l.d != 57 && fishing4.game.l.d != 58 && fishing4.game.l.d != 59) {
                     fishing4.game.am.a(75);
                  } else {
                     fishing4.game.l.a(72);
                  }
               } else if (var0 == 4) {
                  if (aq.b != 3 && aq.b != 4 && aq.b != 5 && aq.b != 20 && aq.b != 21 && fishing4.game.l.d != 12 && fishing4.game.l.d != 55 && fishing4.game.l.d != 56 && fishing4.game.l.d != 57 && fishing4.game.l.d != 58 && fishing4.game.l.d != 59) {
                     fishing4.game.am.a(76);
                  } else {
                     fishing4.game.l.a(73);
                  }
               } else if (var0 == 5) {
                  if (aq.b != 3 && aq.b != 4 && aq.b != 5 && aq.b != 20 && aq.b != 21 && fishing4.game.l.d != 12 && fishing4.game.l.d != 55 && fishing4.game.l.d != 56 && fishing4.game.l.d != 57 && fishing4.game.l.d != 58 && fishing4.game.l.d != 59) {
                     fishing4.game.am.a(77);
                  } else {
                     fishing4.game.l.a(74);
                  }
               } else if (var0 == 6) {
                  if (aq.b != 3 && aq.b != 4 && aq.b != 5 && aq.b != 20 && aq.b != 21 && fishing4.game.l.d != 12 && fishing4.game.l.d != 55 && fishing4.game.l.d != 56 && fishing4.game.l.d != 57 && fishing4.game.l.d != 58 && fishing4.game.l.d != 59) {
                     fishing4.game.am.a(78);
                  } else {
                     fishing4.game.l.a(75);
                  }
               }
            }

            var1 = false;
            return var1;
         }

         if (var0 == 0) {
            fishing4.game.am.a(173);
            aw.r = aw.s;
         } else if (var0 == 2) {
            fishing4.game.am.a(174);
         } else if (var0 == 3) {
            fishing4.game.am.a(175);
         }
      } else if (fishing4.game.am.b == 217) {
         if (var0 == 1) {
            bg.a(10, az.p);
         } else if (var0 == 3) {
            fishing4.game.am.a(219);
         } else {
            aw.r = aw.s;
            fishing4.game.am.a(218);
         }
      } else if (aq.b == 17) {
         if (bg.b == 72) {
            fishing4.game.am.i = 2131034145;
            fishing4.game.am.a(0, fishing4.a.g.a(20.0F));
            bg.b = 73;
         } else if (bg.b == 77) {
            fishing4.game.am.i = 2131034145;
            fishing4.game.am.a(0, fishing4.a.g.a(20.0F));
            bg.b = 78;
         }
      } else if (aq.b == 18) {
         fishing4.game.am.b(0);
         bg.b = 22;
      } else if (var0 != 1) {
         if (var0 == 0) {
            if (aq.b != 3 && aq.b != 4 && aq.b != 5 && aq.b != 20 && aq.b != 21 && fishing4.game.l.d != 12 && fishing4.game.l.d != 55 && fishing4.game.l.d != 56 && fishing4.game.l.d != 57 && fishing4.game.l.d != 58 && fishing4.game.l.d != 59) {
               fishing4.game.am.a(73);
            } else {
               fishing4.game.l.a(70);
            }
         } else if (var0 == 2) {
            if (aq.b != 3 && aq.b != 4 && aq.b != 5 && aq.b != 20 && aq.b != 21 && fishing4.game.l.d != 12 && fishing4.game.l.d != 55 && fishing4.game.l.d != 56 && fishing4.game.l.d != 57 && fishing4.game.l.d != 58 && fishing4.game.l.d != 59) {
               fishing4.game.am.a(74);
            } else {
               fishing4.game.l.a(71);
            }
         } else if (var0 == 3) {
            if (aq.b != 3 && aq.b != 4 && aq.b != 5 && aq.b != 20 && aq.b != 21 && fishing4.game.l.d != 12 && fishing4.game.l.d != 55 && fishing4.game.l.d != 56 && fishing4.game.l.d != 57 && fishing4.game.l.d != 58 && fishing4.game.l.d != 59) {
               fishing4.game.am.a(75);
            } else {
               fishing4.game.l.a(72);
            }
         } else if (var0 == 4) {
            if (aq.b != 3 && aq.b != 4 && aq.b != 5 && aq.b != 20 && aq.b != 21 && fishing4.game.l.d != 12 && fishing4.game.l.d != 55 && fishing4.game.l.d != 56 && fishing4.game.l.d != 57 && fishing4.game.l.d != 58 && fishing4.game.l.d != 59) {
               fishing4.game.am.a(76);
            } else {
               fishing4.game.l.a(73);
            }
         } else if (var0 == 5) {
            if (aq.b != 3 && aq.b != 4 && aq.b != 5 && aq.b != 20 && aq.b != 21 && fishing4.game.l.d != 12 && fishing4.game.l.d != 55 && fishing4.game.l.d != 56 && fishing4.game.l.d != 57 && fishing4.game.l.d != 58 && fishing4.game.l.d != 59) {
               fishing4.game.am.a(77);
            } else {
               fishing4.game.l.a(74);
            }
         } else if (var0 == 6) {
            if (aq.b != 3 && aq.b != 4 && aq.b != 5 && aq.b != 20 && aq.b != 21 && fishing4.game.l.d != 12 && fishing4.game.l.d != 55 && fishing4.game.l.d != 56 && fishing4.game.l.d != 57 && fishing4.game.l.d != 58 && fishing4.game.l.d != 59) {
               fishing4.game.am.a(78);
            } else {
               fishing4.game.l.a(75);
            }
         }
      }

      var1 = false;
      return var1;
   }

   public static int d() {
      return l;
   }

   private static byte[] d(int var0) {
      return new byte[]{(byte)(var0 & 255), (byte)(var0 >> 8 & 255), (byte)(var0 >> 16 & 255), (byte)(var0 >> 24 & 255)};
   }

   public static byte e() {
      return y;
   }

   private byte[] e(int var1) {
      am = new byte[var1 + 66];
      System.arraycopy("PNJNETCON".getBytes(), 0, am, 0, 9);
      fishing4.game.k.l();
      System.arraycopy("ADM".getBytes(), 0, am, 9, 3);
      System.arraycopy(p, 0, am, 12, p.length);
      System.arraycopy(q, 0, am, 32, q.length);
      System.arraycopy(d(100), 0, am, 52, 4);
      System.arraycopy(d(f), 0, am, 56, 4);
      System.arraycopy(d(var1 + 2), 0, am, 60, 4);
      am[64] = k;
      if (255 == this.r && E == 1) {
         Log.i("", "1");
         am[65] = 6;
      } else {
         Log.i("", "2");
         am[65] = (byte)this.r;
         Log.i("", Integer.toString(this.r));
      }

      return am;
   }

   public static int f() {
      return al;
   }

   public static void g() {
      h = true;
      i = true;
   }

   public static void h() {
      i = false;
   }

   private int i() {
      // $FF: Couldn't be decompiled
      return 0;
   }

   private static void j() {
      for(int var0 = 0; var0 < 5; ++var0) {
         S[var0] = null;
         T[var0] = 0;
         U[var0] = 0;
      }

      S = null;
      S = new String[5];
      V = 0;
      W = 0;
      X = 0;
   }

   private static void k() {
      for(int var0 = 0; var0 < 187; ++var0) {
         Z[var0] = 0;
         aa[var0] = null;
         ab[var0] = 0;
         ac[var0] = 0;
         ad[var0] = 0;
      }

      aa = null;
      aa = new String[187];
   }

   private static void l() {
      label116:
      for(int var0 = 0; var0 < numGiftsWaiting; ++var0) {
         int var1;
         switch (K[var0]) {
            case 0:
               fishing4.game.x.b(L[var0]);
               break;
            case 1:
               fishing4.game.ad.o.c((long)L[var0]);
               break;
            case 2:
               fishing4.game.ad.a(120, (long)L[var0], true);
               break;
            case 3:
               fishing4.game.ad.a(121, (long)L[var0], true);
               break;
            case 4:
               fishing4.game.ad.a(122, (long)L[var0], true);
               break;
            case 5:
               fishing4.game.ad.a(607, (long)L[var0], true);
               break;
            case 6:
               fishing4.game.ad.a(608, (long)L[var0], true);
               break;
            case 7:
               fishing4.game.ad.a(507, (long)L[var0], true);
               break;
            case 8:
               fishing4.game.ad.a(508, (long)L[var0], true);
               break;
            case 9:
               fishing4.game.ad.a(707, (long)L[var0], true);
               break;
            case 10:
               fishing4.game.ad.a(708, (long)L[var0], true);
            case 11:
            default:
               break;
            case 12:
               fishing4.game.ad.a(310, (long)L[var0], true);
               break;
            case 13:
               fishing4.game.x.d(L[var0]);
               break;
            case 14:
               var1 = 1;

               while(true) {
                  if (var1 > L[var0] || var1 >= 35) {
                     continue label116;
                  }

                  fishing4.game.w.a[var1].e();
                  ++var1;
               }
            case 15:
               var1 = 1;

               while(true) {
                  if (var1 > L[var0] || var1 >= 33) {
                     continue label116;
                  }

                  fishing4.game.v.a[var1].e();
                  ++var1;
               }
            case 16:
               for(var1 = 100; var1 <= 122; ++var1) {
                  fishing4.game.ad.i.add(fishing4.game.ac.a(var1, 1, fishing4.a.z.a(9), 1));
               }

               for(var1 = 300; var1 <= 309; ++var1) {
                  fishing4.game.ad.k.add(fishing4.game.ac.a(var1, 1, fishing4.a.z.a(9), 1));
               }

               fishing4.game.ad.k.add(fishing4.game.ac.a(310, 1, 0, 1));

               for(var1 = 600; var1 <= 608; ++var1) {
                  fishing4.game.ad.m.add(fishing4.game.ac.a(var1, 1, 0, 1));
               }

               for(var1 = 500; var1 <= 508; ++var1) {
                  fishing4.game.ad.l.add(fishing4.game.ac.a(var1, 1, 0, 1));
               }

               for(var1 = 700; var1 <= 708; ++var1) {
                  fishing4.game.ad.n.add(fishing4.game.ac.a(var1, 1, 0, 1));
               }
               break;
            case 17:
               M.encryptLong((long)L[var0]);
               globalConfig.f = true;
               break;
            case 18:
               fishing4.game.ad.i.add(fishing4.game.ac.a(123));
               break;
            case 19:
               fishing4.game.ad.i.add(fishing4.game.ac.a(124));
               break;
            case 20:
               fishing4.game.ad.i.add(fishing4.game.ac.a(125));
               break;
            case 21:
               if (L[var0] >= 0 && L[var0] <= 9) {
                  fishing4.game.ad.a(120, L[var0], 1L, true);
               }
               break;
            case 22:
               if (L[var0] >= 0 && L[var0] <= 9) {
                  fishing4.game.ad.a(121, L[var0], 1L, true);
               }
               break;
            case 23:
               if (L[var0] >= 0 && L[var0] <= 9) {
                  fishing4.game.ad.a(122, L[var0], 1L, true);
               }
               break;
            case 24:
               if (L[var0] >= 0 && L[var0] <= 9) {
                  fishing4.game.ad.a(119, L[var0], 1L, true);
               }
         }
      }

   }

   public final void a(int var1) {
      byte var2 = 0;
      if (o) {
         this.b(true);
      }

      u = fishing4.a.y.a();
      this.x = var1;
      o = false;
      l = 1;
      this.t = false;
      z = false;
      if (this.x == 3 || this.x == 112 && ag) {
         z = true;
      }

      this.w = 0;
      this.r = -1;
      if (phoneNumber == null) {
         l = 99;
      } else {
         p = phoneNumber.getBytes();
         q = deviceId.getBytes();
      }

      for(var1 = 0; var1 < p.length; ++var1) {
         p[var1] = (byte)(p[var1] ^ 1559);
      }

      for(var1 = var2; var1 < q.length; ++var1) {
         q[var1] = (byte)(q[var1] ^ 1559);
      }

      (new Thread(this)).start();
   }

   public final void a(GL10 var1) {
      if (l == 0) {
         if (globalConfig.languageId == 0) {
            this.a(var1, "전송중");
         } else {
            this.a(var1, "Transferring…");
         }
      } else if (l == 1) {
         if (globalConfig.languageId == 0) {
            this.a(var1, "전송중");
         } else {
            this.a(var1, "Transferring…");
         }

         if (fishing4.a.y.a() - u > 30000L) {
            l = 99;
         }
      } else if (l == 2) {
         if (globalConfig.languageId == 0) {
            this.a(var1, "전송중");
         } else {
            this.a(var1, "Transferring…");
         }

         if (fishing4.a.y.a() - u > 30000L) {
            l = 99;
         }
      } else if (l != 6 && l != 7) {
         if (l == 8) {
            if (globalConfig.languageId == 0) {
               this.a(var1, "전송중");
            } else {
               this.a(var1, "Transferring…");
            }
         } else if (l == 3) {
            if (globalConfig.languageId == 0) {
               this.a(var1, "전송중");
            } else {
               this.a(var1, "Transferring…");
            }

            if (fishing4.a.y.a() - u > 30000L) {
               l = 99;
            }
         } else if (l != 4 && l != 5) {
            if (l != 99 && l != 100) {
               if (l != 100 && l != 0) {
                  if (globalConfig.languageId == 0) {
                     fishing4.game.am.a(var1, "네트워크 장애입니다.", fishing4.a.m.e(), az.s, az.t);
                  } else {
                     fishing4.game.am.a(var1, "Network error. ", fishing4.a.m.e(), az.s, az.t);
                  }
               }
            } else {
               if (o) {
                  this.b(true);
                  l = 99;
               }

               if (globalConfig.languageId == 0) {
                  fishing4.game.am.a(var1, "네트워크 오류입니다. 다시 접속하시겠습니까?", fishing4.a.m.e(), az.s, az.t);
               } else {
                  fishing4.game.am.a(var1, "Network error. \nTry again?", fishing4.a.m.e(), az.s, az.t);
               }
            }
         }
      } else {
         if (globalConfig.languageId == 0) {
            this.a(var1, "전송중");
         } else {
            this.a(var1, "Transferring…");
         }

         if (fishing4.a.y.a() - u > 30000L) {
            l = 99;
         }
      }

      ++this.w;
   }

   public final void b(int var1) {
      // $FF: Couldn't be decompiled
   }

   public final boolean c() {
      return this.t;
   }

   public final void run() {
      Exception var10000;
      label60: {
         boolean var10001;
         label63: {
            try {
               if (l != 1) {
                  break label63;
               }

               Log.i("", "sms20:접속중:con()");
            } catch (Exception var9) {
               var10000 = var9;
               var10001 = false;
               break label60;
            }

            try {
               if (fishing4.a.q.a() == 1) {
                  l = 2;
                  o = true;
               }
            } catch (Exception var8) {
               Exception var2 = var8;

               try {
                  StringBuilder var1 = new StringBuilder("con() : ");
                  n = var1.append(var2).toString();
               } catch (Exception var7) {
                  var10000 = var7;
                  var10001 = false;
                  break label60;
               }
            }

            try {
               this.w = 0;
               u = System.currentTimeMillis();
            } catch (Exception var6) {
               var10000 = var6;
               var10001 = false;
               break label60;
            }
         }

         while(true) {
            try {
               if (!o) {
                  this.b(true);
                  return;
               }
            } catch (Exception var4) {
               var10000 = var4;
               var10001 = false;
               break;
            }

            try {
               Thread.yield();
               if (l == 7) {
                  this.i();
               }
            } catch (Exception var5) {
               var10000 = var5;
               var10001 = false;
               break;
            }

            try {
               Thread.sleep(100L);
            } catch (Exception var3) {
               var10000 = var3;
               var10001 = false;
               break;
            }
         }
      }

      Exception var10 = var10000;
      n = "run() : " + var10;
   }
}

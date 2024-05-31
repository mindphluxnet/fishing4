package fishing4.game;

import android.app.ProgressDialog;
import android.content.Context;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;
import javax.microedition.khronos.opengles.GL10;

import fishing4.a.SaveLoadManager;
import pnjmobile.fishing4.google_free.Main;

public final class k {
   public static fishing4.a.w a;
   public static fishing4.a.w b;
   public static boolean c = true;
   public static boolean d = true;
   public static boolean e = true;
   public static boolean f = true;
   public static boolean g = true;
   public static boolean h = true;
   public static int i = 0;
   public static int j = -1;
   public static String k;
   public static fishing4.a.p l = null;
   public static ProgressDialog m = null;

   private static fishing4.a.f a(char var0) {
      fishing4.a.f var1;
      switch (var0) {
         case '0':
            var1 = fishing4.a.f.a(76.0F, 212.0F, 18.0F, 22.0F);
            break;
         case '1':
            var1 = fishing4.a.f.a(96.0F, 212.0F, 18.0F, 22.0F);
            break;
         case '2':
            var1 = fishing4.a.f.a(115.0F, 212.0F, 18.0F, 22.0F);
            break;
         case '3':
            var1 = fishing4.a.f.a(136.0F, 212.0F, 18.0F, 22.0F);
            break;
         case '4':
            var1 = fishing4.a.f.a(156.0F, 212.0F, 18.0F, 22.0F);
            break;
         case '5':
            var1 = fishing4.a.f.a(176.0F, 212.0F, 18.0F, 22.0F);
            break;
         case '6':
            var1 = fishing4.a.f.a(196.0F, 212.0F, 18.0F, 22.0F);
            break;
         case '7':
            var1 = fishing4.a.f.a(216.0F, 212.0F, 18.0F, 22.0F);
            break;
         case '8':
            var1 = fishing4.a.f.a(236.0F, 212.0F, 18.0F, 22.0F);
            break;
         case '9':
            var1 = fishing4.a.f.a(256.0F, 212.0F, 18.0F, 22.0F);
            break;
         case 'm':
            if (globalConfig.languageId == 0) {
               var1 = fishing4.a.f.a(278.0F, 212.0F, 30.0F, 32.0F);
            } else {
               var1 = fishing4.a.f.a(308.0F, 212.0F, 39.0F, 32.0F);
            }
            break;
         default:
            var1 = fishing4.a.f.a(0.0F, 0.0F, 0.0F, 0.0F);
      }

      return var1;
   }

   public static void a() {
      Main.f();
   }

   public static void a(int var0) {
      byte[] var4 = fishing4.a.r.a.getBytes();
      byte[] var2 = fishing4.a.r.deviceId.getBytes();

      int var1;
      for(var1 = 0; var1 < var4.length; ++var1) {
         var4[var1] = (byte)(var4[var1] ^ 1559);
      }

      for(var1 = 0; var1 < var2.length; ++var1) {
         var2[var1] = (byte)(var2[var1] ^ 1559);
      }

      String var3 = "p=";

      for(var1 = 0; var1 < fishing4.a.r.a.length(); ++var1) {
         var3 = var3 + var4[var1];
      }

      var1 = 0;

      String var25;
      for(var25 = "&m="; var1 < fishing4.a.r.deviceId.length(); ++var1) {
         var25 = var25 + var2[var1];
      }

      String var24;
      switch (var0) {
         case 29:
            var24 = "&questid=SHIP8_UP";
            break;
         case 30:
            var24 = "&questid=Fix_ROD";
            break;
         case 1001:
            var24 = "&questid=COIN100";
            break;
         case 1002:
            var24 = "&questid=COIN315";
            break;
         case 1003:
            var24 = "&questid=COIN550";
            break;
         case 1004:
            var24 = "&questid=COIN1160";
            break;
         case 1005:
            var24 = "&questid=COIN3690";
            break;
         case 1006:
            var24 = "&questid=COIN6600";
            break;
         case 9000:
            var24 = "&questid=COIN_CHECK";
            break;
         default:
            var24 = "&questid=si2c_" + Integer.toString(var0 - 12 + 401);
      }

      String var15 = "&fame=" + Integer.toString(x.c());
      String var16 = "&skill=" + Integer.toString(x.d());
      String var5;
      String var6;
      if (ad.b(0) == -1) {
         var6 = "&rod=-1";
         var5 = "&rod_plus=0";
      } else {
         var6 = "&rod=" + Integer.toString(ad.a(0).f());
         var5 = "&rod_plus=" + Integer.toString(ad.a(0).d());
      }

      String var7;
      String var8;
      if (ad.b(2) == -1) {
         var8 = "&reel=-1";
         var7 = "&reel_plus=0";
      } else {
         var8 = "&reel=" + Integer.toString(ad.a(2).f());
         var7 = "&reel_plus=" + Integer.toString(ad.a(2).d());
      }

      String var9;
      String var10;
      if (ad.b(1) == -1) {
         var9 = "&lure=-1";
         var10 = "&lure_cnt=0";
      } else {
         var9 = "&lure=" + Integer.toString(ad.a(1).f());
         var10 = "&lure_cnt=" + Integer.toString(ad.a(1).c());
      }

      String var11;
      if (ad.b(4) == -1) {
         var11 = "&cap=-1";
      } else {
         var11 = "&cap=" + Integer.toString(ad.a(4).f());
      }

      String var12;
      if (ad.b(3) == -1) {
         var12 = "&shirts=-1";
      } else {
         var12 = "&shirts=" + Integer.toString(ad.a(3).f());
      }

      String var13;
      if (ad.b(5) == -1) {
         var13 = "&chokki=-1";
      } else {
         var13 = "&chokki=" + Integer.toString(ad.a(5).f());
      }

      String var19 = "&ship=" + Integer.toString(((ag)ad.h.get(x.b / 100 % 10)).a);
      String var17 = "&gold=" + Long.toString(ad.o.b());
      String var20 = "&playtime=" + Long.toString(x.c);
      String var18 = "&version=" + "1.0.5".replace(".", "");
      (new StringBuilder("&main=")).append(Integer.toString(OptionsManager.m)).toString();
      (new StringBuilder("&game=")).append(Integer.toString(OptionsManager.n)).toString();
      String var14;
      if (globalConfig.languageId == 0) {
         var14 = "&location=kr";
      } else {
         var14 = "&location=en";
      }

      StringBuilder var26 = (new StringBuilder(String.valueOf("http://wap.pnjmobile.co.kr/GameUserDataLog/Fishing4/Google_Fishing4_Free_Gobal_Log.php?".trim()))).append(var3).append(var25).append(var24).append(var15).append(var16).append(var6).append(var5).append(var8).append(var7).append(var9).append(var10).append(var11).append(var12).append(var13).append(var19).append(var17).append(var20).append(var18).append("&device=").append(fishing4.a.r.d).append("&OSVer=").append(fishing4.a.r.e).append("&jailbreak=");
      byte var23;
      if (fishing4.a.r.c) {
         var23 = 1;
      } else {
         var23 = 0;
      }

      var3 = var26.append(Integer.toString(var23)).append(var14).toString();

      try {
         URL var27 = new URL(var3);
         fishing4.a.y.b(var27);
      } catch (MalformedURLException var21) {
         var21.printStackTrace();
      } catch (IOException var22) {
         var22.printStackTrace();
      }

   }

   public static void a(GL10 var0) {
      fishing4.a.m.a(var0, fishing4.a.m.c(), fishing4.a.m.d(), (float)fishing4.a.m.a(), (float)fishing4.a.m.b(), fishing4.a.aa.a());
      fishing4.a.ae.a(var0, "LOADING...", (float)(fishing4.a.m.a() - 175), 50.0F, 175.0F, 50.0F, 30.0F, 4);
   }

   public static void a(GL10 var0, int var1, int var2, float var3) {
      float var4 = fishing4.a.m.c() - (float)((var2 - 1) * 15);

      for(int var5 = 0; var5 < var2; ++var5) {
         if (var1 == var5) {
            fishing4.a.m.a(var0, az.t, var4 + (float)(var5 * 30), var3, (float)(var5 * 25 + 288), 399.0F, 24.0F, 24.0F, '\u0001');
            fishing4.a.m.a(var0, az.t, var4 + (float)(var5 * 30), var3, 356.0F, 426.0F, 56.0F, 44.0F, '\u0001');
         } else {
            fishing4.a.m.a(var0, az.t, var4 + (float)(var5 * 30), var3, (float)(var5 * 25 + 288), 399.0F, 24.0F, 24.0F, '\u0001', 128);
         }
      }

   }

   public static void a(GL10 var0, int var1, fishing4.a.e var2, int var3) {
      String var6 = Integer.toString(var1);
      float var4;
      float var5;
      if (var3 == 4) {
         var4 = var2.a - (float)((var6.length() - 1) * 18 / 2);
         var5 = var2.b;
      } else if (var3 == 1) {
         var4 = var2.a - (float)((var6.length() - 1) * 18);
         var5 = var2.b;
      } else {
         var4 = var2.a;
         var5 = var2.b;
      }

      for(var1 = 0; var1 < var6.length(); ++var1) {
         fishing4.a.w var7 = b;
         fishing4.a.f var8;
         switch (var6.charAt(var1)) {
            case '0':
               var8 = fishing4.a.f.a(0.0F, 0.0F, 16.0F, 16.0F);
               break;
            case '1':
               var8 = fishing4.a.f.a(17.0F, 0.0F, 16.0F, 14.0F);
               break;
            case '2':
               var8 = fishing4.a.f.a(34.0F, 0.0F, 16.0F, 14.0F);
               break;
            case '3':
               var8 = fishing4.a.f.a(51.0F, 0.0F, 16.0F, 16.0F);
               break;
            case '4':
               var8 = fishing4.a.f.a(68.0F, 0.0F, 16.0F, 14.0F);
               break;
            case '5':
               var8 = fishing4.a.f.a(85.0F, 0.0F, 16.0F, 16.0F);
               break;
            case '6':
               var8 = fishing4.a.f.a(102.0F, 0.0F, 16.0F, 16.0F);
               break;
            case '7':
               var8 = fishing4.a.f.a(119.0F, 0.0F, 16.0F, 14.0F);
               break;
            case '8':
               var8 = fishing4.a.f.a(136.0F, 0.0F, 16.0F, 14.0F);
               break;
            case '9':
               var8 = fishing4.a.f.a(153.0F, 0.0F, 16.0F, 14.0F);
               break;
            default:
               var8 = fishing4.a.f.a();
         }

         fishing4.a.m.a(var0, var7, var4, var5, var8);
         var4 += 18.0F;
      }

   }

   public static void a(GL10 var0, Context var1) {
      x.a();
      fishing4.a.ae.a();
      a = fishing4.a.w.a(var0, "img/ui/back.png");
      b = fishing4.a.w.a(var0, "img/town/stack.png");
      az.a(var0);
      if (e()) {
         label696: {
            x.d = System.currentTimeMillis();
            byte[] var11;
            if (fishing4.a.y.b("new_f4save.data")) {
               var11 = SaveLoadManager.loadFile("new_f4save.data");
            } else {
               var11 = SaveLoadManager.b("f4save.data");
            }

            Exception var10000;
            label697: {
               boolean var10001;
               try {
                  x.a(fishing4.a.a.a(var11, 0));
                  x.c(fishing4.a.a.a(var11, 4));
                  x.a = fishing4.a.a.a(var11, 8);
                  x.b = fishing4.a.a.a(var11, 12);
                  if (x.b < 10000) {
                     x.b = 0;
                  }
               } catch (Exception var92) {
                  var10000 = var92;
                  var10001 = false;
                  break label697;
               }

               try {
                  x.c = fishing4.a.a.b(var11, 16);
                  bh.a = fishing4.a.a.a(var11, 24);
                  s.c = fishing4.a.a.a(var11, 28);
                  s.d = fishing4.a.a.a(var11, 32);
               } catch (Exception var91) {
                  var10000 = var91;
                  var10001 = false;
                  break label697;
               }

               int var3 = 36;

               int var4;
               for(var4 = 0; var4 < 187; ++var4) {
                  try {
                     s.a[var4] = fishing4.a.a.c(var11, var3);
                  } catch (Exception var90) {
                     var10000 = var90;
                     var10001 = false;
                     break label697;
                  }

                  var3 += 4;

                  try {
                     s.b[var4] = fishing4.a.a.c(var11, var3);
                  } catch (Exception var89) {
                     var10000 = var89;
                     var10001 = false;
                     break label697;
                  }

                  var3 += 4;
               }

               boolean var10;
               for(var4 = 0; var4 < 24; ++var4) {
                  try {
                     q.a[var4] = fishing4.a.a.a(var11, var3);
                  } catch (Exception var88) {
                     var10000 = var88;
                     var10001 = false;
                     break label697;
                  }

                  var3 += 4;

                  boolean[] var12;
                  try {
                     var12 = q.b;
                  } catch (Exception var87) {
                     var10000 = var87;
                     var10001 = false;
                     break label697;
                  }

                  if (var11[var3] == 0) {
                     var10 = false;
                  } else {
                     var10 = true;
                  }

                  var12[var4] = var10;
                  ++var3;
               }

               int var6;
               try {
                  var6 = fishing4.a.a.a(var11, var3);
               } catch (Exception var86) {
                  var10000 = var86;
                  var10001 = false;
                  break label697;
               }

               var3 += 4;

               try {
                  ad.g = fishing4.a.a.a(var11, var3);
               } catch (Exception var85) {
                  var10000 = var85;
                  var10001 = false;
                  break label697;
               }

               var3 += 4;
               var4 = 0;

               label652:
               while(true) {
                  int var5;
                  int var7;
                  int var8;
                  if (var4 >= var6) {
                     try {
                        var5 = fishing4.a.a.a(var11, var3);
                     } catch (Exception var71) {
                        var10000 = var71;
                        var10001 = false;
                        break;
                     }

                     var3 += 4;

                     try {
                        ad.a = fishing4.a.a.a(var11, var3);
                     } catch (Exception var70) {
                        var10000 = var70;
                        var10001 = false;
                        break;
                     }

                     var4 = var3 + 4;

                     int var9;
                     for(var3 = 0; var3 < var5; ++var3) {
                        try {
                           var6 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var69) {
                           var10000 = var69;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           var7 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var68) {
                           var10000 = var68;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           var8 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var67) {
                           var10000 = var67;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           var9 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var66) {
                           var10000 = var66;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           ad.i.add(var3, ac.a(var6, var7, var8, var9));
                        } catch (Exception var65) {
                           var10000 = var65;
                           var10001 = false;
                           break label652;
                        }
                     }

                     try {
                        var5 = fishing4.a.a.a(var11, var4);
                     } catch (Exception var64) {
                        var10000 = var64;
                        var10001 = false;
                        break;
                     }

                     var3 = var4 + 4;

                     try {
                        ad.c = fishing4.a.a.a(var11, var3);
                     } catch (Exception var63) {
                        var10000 = var63;
                        var10001 = false;
                        break;
                     }

                     var4 = var3 + 4;

                     for(var3 = 0; var3 < var5; ++var3) {
                        try {
                           var6 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var62) {
                           var10000 = var62;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           var7 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var61) {
                           var10000 = var61;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           var8 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var60) {
                           var10000 = var60;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           var9 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var59) {
                           var10000 = var59;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           ad.j.add(var3, ac.a(var6, var7, var8, var9));
                        } catch (Exception var58) {
                           var10000 = var58;
                           var10001 = false;
                           break label652;
                        }
                     }

                     try {
                        var5 = fishing4.a.a.a(var11, var4);
                     } catch (Exception var57) {
                        var10000 = var57;
                        var10001 = false;
                        break;
                     }

                     var3 = var4 + 4;

                     try {
                        ad.b = fishing4.a.a.a(var11, var3);
                     } catch (Exception var56) {
                        var10000 = var56;
                        var10001 = false;
                        break;
                     }

                     var4 = var3 + 4;

                     for(var3 = 0; var3 < var5; ++var3) {
                        try {
                           var6 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var55) {
                           var10000 = var55;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           var7 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var54) {
                           var10000 = var54;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           var8 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var53) {
                           var10000 = var53;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           var9 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var52) {
                           var10000 = var52;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           ad.k.add(var3, ac.a(var6, var7, var8, var9));
                        } catch (Exception var51) {
                           var10000 = var51;
                           var10001 = false;
                           break label652;
                        }
                     }

                     try {
                        var5 = fishing4.a.a.a(var11, var4);
                     } catch (Exception var50) {
                        var10000 = var50;
                        var10001 = false;
                        break;
                     }

                     var3 = var4 + 4;

                     try {
                        ad.e = fishing4.a.a.a(var11, var3);
                     } catch (Exception var49) {
                        var10000 = var49;
                        var10001 = false;
                        break;
                     }

                     var4 = var3 + 4;

                     for(var3 = 0; var3 < var5; ++var3) {
                        try {
                           var6 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var48) {
                           var10000 = var48;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           var7 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var47) {
                           var10000 = var47;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           var8 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var46) {
                           var10000 = var46;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           var9 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var45) {
                           var10000 = var45;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           ad.l.add(var3, ac.a(var6, var7, var8, var9));
                        } catch (Exception var44) {
                           var10000 = var44;
                           var10001 = false;
                           break label652;
                        }
                     }

                     try {
                        var5 = fishing4.a.a.a(var11, var4);
                     } catch (Exception var43) {
                        var10000 = var43;
                        var10001 = false;
                        break;
                     }

                     var3 = var4 + 4;

                     try {
                        ad.f = fishing4.a.a.a(var11, var3);
                     } catch (Exception var42) {
                        var10000 = var42;
                        var10001 = false;
                        break;
                     }

                     var4 = var3 + 4;

                     for(var3 = 0; var3 < var5; ++var3) {
                        try {
                           var6 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var41) {
                           var10000 = var41;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           var7 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var40) {
                           var10000 = var40;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           var8 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var39) {
                           var10000 = var39;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           var9 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var38) {
                           var10000 = var38;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           ad.m.add(var3, ac.a(var6, var7, var8, var9));
                        } catch (Exception var37) {
                           var10000 = var37;
                           var10001 = false;
                           break label652;
                        }
                     }

                     try {
                        var5 = fishing4.a.a.a(var11, var4);
                     } catch (Exception var36) {
                        var10000 = var36;
                        var10001 = false;
                        break;
                     }

                     var3 = var4 + 4;

                     try {
                        ad.d = fishing4.a.a.a(var11, var3);
                     } catch (Exception var35) {
                        var10000 = var35;
                        var10001 = false;
                        break;
                     }

                     var4 = var3 + 4;

                     for(var3 = 0; var3 < var5; ++var3) {
                        try {
                           var6 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var34) {
                           var10000 = var34;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           var7 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var33) {
                           var10000 = var33;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           var8 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var32) {
                           var10000 = var32;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           var9 = fishing4.a.a.a(var11, var4);
                        } catch (Exception var31) {
                           var10000 = var31;
                           var10001 = false;
                           break label652;
                        }

                        var4 += 4;

                        try {
                           ad.n.add(var3, ac.a(var6, var7, var8, var9));
                        } catch (Exception var30) {
                           var10000 = var30;
                           var10001 = false;
                           break label652;
                        }
                     }

                     try {
                        ad.o = ae.a(fishing4.a.a.b(var11, var4));
                     } catch (Exception var29) {
                        var10000 = var29;
                        var10001 = false;
                        break;
                     }

                     var3 = var4 + 8;

                     for(var4 = 0; var4 < 35; ++var4) {
                        try {
                           var5 = fishing4.a.a.a(var11, var3);
                        } catch (Exception var28) {
                           var10000 = var28;
                           var10001 = false;
                           break label652;
                        }

                        var3 += 4;

                        try {
                           var6 = fishing4.a.a.a(var11, var3);
                        } catch (Exception var27) {
                           var10000 = var27;
                           var10001 = false;
                           break label652;
                        }

                        var3 += 4;

                        try {
                           var7 = fishing4.a.a.a(var11, var3);
                        } catch (Exception var26) {
                           var10000 = var26;
                           var10001 = false;
                           break label652;
                        }

                        var3 += 4;

                        try {
                           w.a[var4] = y.a(var6, var5, var7);
                        } catch (Exception var25) {
                           var10000 = var25;
                           var10001 = false;
                           break label652;
                        }
                     }

                     for(var4 = 0; var4 < 33; ++var4) {
                        try {
                           var5 = fishing4.a.a.a(var11, var3);
                        } catch (Exception var24) {
                           var10000 = var24;
                           var10001 = false;
                           break label652;
                        }

                        var3 += 4;

                        try {
                           var6 = fishing4.a.a.a(var11, var3);
                        } catch (Exception var23) {
                           var10000 = var23;
                           var10001 = false;
                           break label652;
                        }

                        var3 += 4;

                        try {
                           var7 = fishing4.a.a.a(var11, var3);
                        } catch (Exception var22) {
                           var10000 = var22;
                           var10001 = false;
                           break label652;
                        }

                        var3 += 4;

                        try {
                           v.a[var4] = y.a(var6, var5, var7);
                        } catch (Exception var21) {
                           var10000 = var21;
                           var10001 = false;
                           break label652;
                        }
                     }

                     try {
                        r.a = fishing4.a.a.a(var11, var3);
                     } catch (Exception var20) {
                        var10000 = var20;
                        var10001 = false;
                        break;
                     }

                     var3 += 4;

                     try {
                        r.b = fishing4.a.a.a(var11, var3);
                     } catch (Exception var19) {
                        var10000 = var19;
                        var10001 = false;
                        break;
                     }

                     var3 += 4;

                     try {
                        r.c = fishing4.a.a.a(var11, var3);
                     } catch (Exception var18) {
                        var10000 = var18;
                        var10001 = false;
                        break;
                     }

                     var3 += 4;

                     try {
                        r.d = fishing4.a.a.c(var11, var3);
                     } catch (Exception var17) {
                        var10000 = var17;
                        var10001 = false;
                        break;
                     }

                     var3 += 4;

                     try {
                        r.e = fishing4.a.a.c(var11, var3);
                     } catch (Exception var16) {
                        var10000 = var16;
                        var10001 = false;
                        break;
                     }

                     var3 += 4;

                     try {
                        Main.i = fishing4.a.a.a(var11, var3);
                     } catch (Exception var15) {
                        var10000 = var15;
                        var10001 = false;
                        break;
                     }

                     var3 += 4;

                     try {
                        Main.j = fishing4.a.a.a(var11, var3);
                     } catch (Exception var14) {
                        var10000 = var14;
                        var10001 = false;
                        break;
                     }

                     var3 += 4;

                     try {
                        Main.k = fishing4.a.a.a(var11, var3);
                        Main.l = fishing4.a.a.a(var11, var3 + 4);
                        break label696;
                     } catch (Exception var13) {
                        var10000 = var13;
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     ad.h.add(var4, ag.a(fishing4.a.a.a(var11, var3)));
                  } catch (Exception var84) {
                     var10000 = var84;
                     var10001 = false;
                     break;
                  }

                  var3 += 4;

                  try {
                     ((ag)ad.h.get(var4)).e = fishing4.a.a.a(var11, var3);
                  } catch (Exception var83) {
                     var10000 = var83;
                     var10001 = false;
                     break;
                  }

                  var3 += 4;

                  try {
                     ((ag)ad.h.get(var4)).d = fishing4.a.a.a(var11, var3);
                  } catch (Exception var82) {
                     var10000 = var82;
                     var10001 = false;
                     break;
                  }

                  var3 += 4;

                  try {
                     ((ag)ad.h.get(var4)).c = fishing4.a.a.a(var11, var3);
                  } catch (Exception var81) {
                     var10000 = var81;
                     var10001 = false;
                     break;
                  }

                  var3 += 4;

                  try {
                     var7 = fishing4.a.a.a(var11, var3);
                  } catch (Exception var80) {
                     var10000 = var80;
                     var10001 = false;
                     break;
                  }

                  var3 += 4;

                  for(var5 = 0; var5 < var7; ++var3) {
                     try {
                        var8 = fishing4.a.a.a(var11, var3);
                     } catch (Exception var79) {
                        var10000 = var79;
                        var10001 = false;
                        break label652;
                     }

                     var3 += 4;

                     float var2;
                     try {
                        var2 = fishing4.a.a.c(var11, var3);
                     } catch (Exception var78) {
                        var10000 = var78;
                        var10001 = false;
                        break label652;
                     }

                     var3 += 4;

                     m var94;
                     try {
                        ((ag)ad.h.get(var4)).b.add(var5, fishing4.game.m.a(var8, var2));
                        var94 = (m)((ag)ad.h.get(var4)).b.get(var5);
                     } catch (Exception var77) {
                        var10000 = var77;
                        var10001 = false;
                        break label652;
                     }

                     if (var11[var3] == 0) {
                        var10 = false;
                     } else {
                        var10 = true;
                     }

                     try {
                        var94.c = var10;
                     } catch (Exception var76) {
                        var10000 = var76;
                        var10001 = false;
                        break label652;
                     }

                     ++var3;

                     try {
                        var94 = (m)((ag)ad.h.get(var4)).b.get(var5);
                     } catch (Exception var75) {
                        var10000 = var75;
                        var10001 = false;
                        break label652;
                     }

                     if (var11[var3] == 0) {
                        var10 = false;
                     } else {
                        var10 = true;
                     }

                     try {
                        var94.d = var10;
                     } catch (Exception var74) {
                        var10000 = var74;
                        var10001 = false;
                        break label652;
                     }

                     ++var3;

                     try {
                        var94 = (m)((ag)ad.h.get(var4)).b.get(var5);
                     } catch (Exception var73) {
                        var10000 = var73;
                        var10001 = false;
                        break label652;
                     }

                     if (var11[var3] == 0) {
                        var10 = false;
                     } else {
                        var10 = true;
                     }

                     try {
                        var94.e = var10;
                     } catch (Exception var72) {
                        var10000 = var72;
                        var10001 = false;
                        break label652;
                     }

                     ++var5;
                  }

                  ++var4;
               }
            }

            Exception var93 = var10000;
            var93.printStackTrace();
         }
      } else {
         x.b();
      }

      if (bh.a != 100) {
         bh.a = 0;
      }

      am.a();
      fishing4.a.t.a(var1, fishing4.a.m.a(), fishing4.a.m.b());
      fishing4.a.t.b(var0);
      fishing4.a.t.a();
      q.c(22);
      z.a();
      z.a((aa)(new au(var1)), 1);
      z.a((aa)(new ba(var1)), 2);
      z.a((aa)(new bb(var1)), 3);
      z.a((aa)(new aw(var1)), 4);
      z.a((GL10)var0, 1);
   }

   public static void a(GL10 var0, fishing4.a.e var1, float var2, int var3) {
      float var4;
      switch (var3 / 4 % 8) {
         case 2:
         case 7:
            var4 = 1.0F;
            break;
         case 3:
         case 6:
            var4 = 2.0F;
            break;
         case 4:
         case 5:
            var4 = 3.0F;
            break;
         default:
            var4 = 0.0F;
      }

      fishing4.a.m.a(var0, az.s, var1.a - (var2 + var4), var1.b, 910.0F, 937.0F, 34.0F, 48.0F, '\u0001');
      fishing4.a.m.a(var0, az.s, var2 + var4 + var1.a, var1.b, 910.0F, 937.0F, 34.0F, 48.0F, fishing4.a.g.b(), '\u0001');
   }

   public static void a(GL10 var0, fishing4.a.e var1, float var2, int var3, int var4) {
      float var5;
      switch (var3 / 4 % 8) {
         case 2:
         case 7:
            var5 = 1.0F;
            break;
         case 3:
         case 6:
            var5 = 2.0F;
            break;
         case 4:
         case 5:
            var5 = 3.0F;
            break;
         default:
            var5 = 0.0F;
      }

      if (var4 == 2) {
         fishing4.a.m.a(var0, az.s, var1.a, var2 + var5 + var1.b, 945.0F, 937.0F, 48.0F, 34.0F, '\u0001');
      } else if (var4 == 3) {
         fishing4.a.m.a(var0, az.s, var1.a, var1.b - (var2 + var5), 945.0F, 937.0F, 48.0F, 34.0F, fishing4.a.g.c(), '\u0001');
      } else {
         fishing4.a.m.a(var0, az.s, var1.a, var2 + var5 + var1.b, 945.0F, 937.0F, 48.0F, 34.0F, '\u0001');
         fishing4.a.m.a(var0, az.s, var1.a, var1.b - (var2 + var5), 945.0F, 937.0F, 48.0F, 34.0F, fishing4.a.g.c(), '\u0001');
      }

   }

   public static void a(GL10 var0, fishing4.a.w var1, String var2, fishing4.a.e var3) {
      int var6 = 0;
      byte var7 = 0;
      float var4;
      float var5;
      if (var2.toLowerCase().charAt(var2.length() - 1) == 'm') {
         var4 = var3.a - (float)((var2.length() - 1) * 20 / 2);
         var5 = var3.b;

         for(var6 = var7; var6 < var2.length() - 1; ++var6) {
            fishing4.a.m.a(var0, var1, var4, 4.0F + var5, a(var2.charAt(var6)));
            var4 += 20.0F;
         }

         fishing4.a.m.a(var0, var1, var4 - 2.0F + 14.0F, var5, a(var2.charAt(var6)));
      } else {
         var4 = var3.a - (float)((var2.length() * 20 - 2) / 2);

         for(var5 = var3.b; var6 < var2.length(); ++var6) {
            fishing4.a.m.a(var0, var1, var4, var5, a(var2.charAt(var6)));
            var4 += 20.0F;
         }
      }

   }

   public static void a(boolean var0, int var1) {
      byte[] var4 = fishing4.a.r.a.getBytes();
      byte[] var5 = fishing4.a.r.deviceId.getBytes();

      int var2;
      for(var2 = 0; var2 < var4.length; ++var2) {
         var4[var2] = (byte)(var4[var2] ^ 1559);
      }

      for(var2 = 0; var2 < var5.length; ++var2) {
         var5[var2] = (byte)(var5[var2] ^ 1559);
      }

      String var3 = "p=";

      for(var2 = 0; var2 < fishing4.a.r.a.length(); ++var2) {
         var3 = var3 + var4[var2];
      }

      var2 = 0;

      String var24;
      for(var24 = "&m="; var2 < fishing4.a.r.deviceId.length(); ++var2) {
         var24 = var24 + var5[var2];
      }

      String var25;
      if (var0) {
         var25 = "&questid=o_" + Integer.toString(var1);
      } else {
         var25 = "&questid=p_" + Integer.toString(var1);
      }

      String var17 = "&fame=" + Integer.toString(x.c());
      String var16 = "&skill=" + Integer.toString(x.d());
      String var6;
      String var7;
      if (ad.b(0) == -1) {
         var6 = "&rod=-1";
         var7 = "&rod_plus=0";
      } else {
         var6 = "&rod=" + Integer.toString(ad.a(0).f());
         var7 = "&rod_plus=" + Integer.toString(ad.a(0).d());
      }

      String var8;
      String var9;
      if (ad.b(2) == -1) {
         var9 = "&reel=-1";
         var8 = "&reel_plus=0";
      } else {
         var9 = "&reel=" + Integer.toString(ad.a(2).f());
         var8 = "&reel_plus=" + Integer.toString(ad.a(2).d());
      }

      String var10;
      String var11;
      if (ad.b(1) == -1) {
         var10 = "&lure=-1";
         var11 = "&lure_cnt=0";
      } else {
         var10 = "&lure=" + Integer.toString(ad.a(1).f());
         var11 = "&lure_cnt=" + Integer.toString(ad.a(1).c());
      }

      String var12;
      if (ad.b(4) == -1) {
         var12 = "&cap=-1";
      } else {
         var12 = "&cap=" + Integer.toString(ad.a(4).f());
      }

      String var13;
      if (ad.b(3) == -1) {
         var13 = "&shirts=-1";
      } else {
         var13 = "&shirts=" + Integer.toString(ad.a(3).f());
      }

      String var14;
      if (ad.b(5) == -1) {
         var14 = "&chokki=-1";
      } else {
         var14 = "&chokki=" + Integer.toString(ad.a(5).f());
      }

      String var21 = "&ship=" + Integer.toString(((ag)ad.h.get(x.b / 100 % 10)).a);
      String var18 = "&gold=" + Long.toString(ad.o.b());
      String var20 = "&playtime=" + Long.toString(x.c);
      String var19 = "&version=" + "1.0.5".replace(".", "");
      (new StringBuilder("&main=")).append(Integer.toString(OptionsManager.m)).toString();
      (new StringBuilder("&game=")).append(Integer.toString(OptionsManager.n)).toString();
      String var15;
      if (globalConfig.languageId == 0) {
         var15 = "&location=kr";
      } else {
         var15 = "&location=en";
      }

      StringBuilder var23 = (new StringBuilder(String.valueOf("http://wap.pnjmobile.co.kr/GameUserDataLog/Fishing4/Google_Fishing4_Free_Gobal_Log.php?".trim()))).append(var3).append(var24).append(var25).append(var17).append(var16).append(var6).append(var7).append(var9).append(var8).append(var10).append(var11).append(var12).append(var13).append(var14).append(var21).append(var18).append(var20).append(var19).append("&device=").append(fishing4.a.r.d).append("&OSVer=").append(fishing4.a.r.e).append("&jailbreak=");
      byte var22;
      if (fishing4.a.r.c) {
         var22 = 1;
      } else {
         var22 = 0;
      }

      k = new String(var23.append(Integer.toString(var22)).append(var15).toString());
   }

   public static void a(boolean var0, int var1, boolean var2) {
      byte[] var6 = fishing4.a.r.a.getBytes();
      byte[] var4 = fishing4.a.r.deviceId.getBytes();

      int var3;
      for(var3 = 0; var3 < var6.length; ++var3) {
         var6[var3] = (byte)(var6[var3] ^ 1559);
      }

      for(var3 = 0; var3 < var4.length; ++var3) {
         var4[var3] = (byte)(var4[var3] ^ 1559);
      }

      String var5 = "p=";

      for(var3 = 0; var3 < fishing4.a.r.a.length(); ++var3) {
         var5 = var5 + var6[var3];
      }

      var3 = 0;

      String var26;
      for(var26 = "&m="; var3 < fishing4.a.r.deviceId.length(); ++var3) {
         var26 = var26 + var4[var3];
      }

      String var24;
      if (var0) {
         if (var2) {
            var24 = "&questid=con_o" + Integer.toString(var1) + "_s";
         } else {
            var24 = "&questid=con_o" + Integer.toString(var1) + "_f";
         }
      } else if (var2) {
         var24 = "&questid=con_p" + Integer.toString(var1) + "_s";
      } else {
         var24 = "&questid=con_p" + Integer.toString(var1) + "_f";
      }

      String var18 = "&fame=" + Integer.toString(x.c());
      String var17 = "&skill=" + Integer.toString(x.d());
      String var7;
      String var8;
      if (ad.b(0) == -1) {
         var7 = "&rod=-1";
         var8 = "&rod_plus=0";
      } else {
         var7 = "&rod=" + Integer.toString(ad.a(0).f());
         var8 = "&rod_plus=" + Integer.toString(ad.a(0).d());
      }

      String var9;
      String var10;
      if (ad.b(2) == -1) {
         var10 = "&reel=-1";
         var9 = "&reel_plus=0";
      } else {
         var10 = "&reel=" + Integer.toString(ad.a(2).f());
         var9 = "&reel_plus=" + Integer.toString(ad.a(2).d());
      }

      String var11;
      String var12;
      if (ad.b(1) == -1) {
         var11 = "&lure=-1";
         var12 = "&lure_cnt=0";
      } else {
         var11 = "&lure=" + Integer.toString(ad.a(1).f());
         var12 = "&lure_cnt=" + Integer.toString(ad.a(1).c());
      }

      String var13;
      if (ad.b(4) == -1) {
         var13 = "&cap=-1";
      } else {
         var13 = "&cap=" + Integer.toString(ad.a(4).f());
      }

      String var14;
      if (ad.b(3) == -1) {
         var14 = "&shirts=-1";
      } else {
         var14 = "&shirts=" + Integer.toString(ad.a(3).f());
      }

      String var15;
      if (ad.b(5) == -1) {
         var15 = "&chokki=-1";
      } else {
         var15 = "&chokki=" + Integer.toString(ad.a(5).f());
      }

      String var21 = "&ship=" + Integer.toString(((ag)ad.h.get(x.b / 100 % 10)).a);
      String var20 = "&gold=" + Long.toString(ad.o.b());
      String var19 = "&playtime=" + Long.toString(x.c);
      String var22 = "&version=" + "1.0.5".replace(".", "");
      (new StringBuilder("&main=")).append(Integer.toString(OptionsManager.m)).toString();
      (new StringBuilder("&game=")).append(Integer.toString(OptionsManager.n)).toString();
      String var16;
      if (globalConfig.languageId == 0) {
         var16 = "&location=kr";
      } else {
         var16 = "&location=en";
      }

      StringBuilder var25 = (new StringBuilder(String.valueOf("http://wap.pnjmobile.co.kr/GameUserDataLog/Fishing4/Google_Fishing4_Free_Gobal_Log.php?".trim()))).append(var5).append(var26).append(var24).append(var18).append(var17).append(var7).append(var8).append(var10).append(var9).append(var11).append(var12).append(var13).append(var14).append(var15).append(var21).append(var20).append(var19).append(var22).append("&device=").append(fishing4.a.r.d).append("&OSVer=").append(fishing4.a.r.e).append("&jailbreak=");
      byte var23;
      if (fishing4.a.r.c) {
         var23 = 1;
      } else {
         var23 = 0;
      }

      k = new String(var25.append(Integer.toString(var23)).append(var16).toString());
   }

   public static void b() {
      if (l != null && l.isShowing()) {
         l.dismiss();
         l = null;
      }

   }

   public static void b(GL10 var0, fishing4.a.e var1, float var2, int var3) {
      a(var0, var1, var2, var3, 4);
   }

   public static void c() {
   }

   public static boolean d() {
      return false;
   }

   public static boolean e() {
      boolean var0;
      if (!fishing4.a.y.b("f4save.data") && !fishing4.a.y.b("new_f4save.data")) {
         var0 = false;
      } else {
         var0 = true;
      }

      return var0;
   }

   public static void f() {
      byte[] var3 = new byte[10240];
      if (x.d > 0L) {
         x.c += System.currentTimeMillis() - x.d;
      }

      x.d = System.currentTimeMillis();
      System.arraycopy(fishing4.a.a.a(x.c()), 0, var3, 0, 4);
      System.arraycopy(fishing4.a.a.a(x.d()), 0, var3, 4, 4);
      System.arraycopy(fishing4.a.a.a(x.a), 0, var3, 8, 4);
      System.arraycopy(fishing4.a.a.a(x.b), 0, var3, 12, 4);
      System.arraycopy(fishing4.a.a.a(x.c), 0, var3, 16, 8);
      System.arraycopy(fishing4.a.a.a(bh.a), 0, var3, 24, 4);
      System.arraycopy(fishing4.a.a.a(s.c), 0, var3, 28, 4);
      System.arraycopy(fishing4.a.a.a(s.d), 0, var3, 32, 4);
      int var0 = 36;

      int var1;
      for(var1 = 0; var1 < 187; ++var1) {
         System.arraycopy(fishing4.a.a.a(Float.floatToRawIntBits(s.a[var1])), 0, var3, var0, 4);
         var0 += 4;
         System.arraycopy(fishing4.a.a.a(Float.floatToRawIntBits(s.b[var1])), 0, var3, var0, 4);
         var0 += 4;
      }

      for(var1 = 0; var1 < 24; ++var1) {
         System.arraycopy(fishing4.a.a.a(q.a[var1]), 0, var3, var0, 4);
         var0 += 4;
         System.arraycopy(fishing4.a.a.a(q.b[var1]), 0, var3, var0, 1);
         ++var0;
      }

      System.arraycopy(fishing4.a.a.a(ad.h.size()), 0, var3, var0, 4);
      var0 += 4;
      System.arraycopy(fishing4.a.a.a(ad.g), 0, var3, var0, 4);
      var0 += 4;

      for(var1 = 0; var1 < ad.h.size(); ++var1) {
         System.arraycopy(fishing4.a.a.a(((ag)ad.h.get(var1)).a), 0, var3, var0, 4);
         var0 += 4;
         System.arraycopy(fishing4.a.a.a(((ag)ad.h.get(var1)).e), 0, var3, var0, 4);
         var0 += 4;
         System.arraycopy(fishing4.a.a.a(((ag)ad.h.get(var1)).d), 0, var3, var0, 4);
         var0 += 4;
         System.arraycopy(fishing4.a.a.a(((ag)ad.h.get(var1)).c), 0, var3, var0, 4);
         var0 += 4;
         System.arraycopy(fishing4.a.a.a(((ag)ad.h.get(var1)).b.size()), 0, var3, var0, 4);
         var0 += 4;

         for(int var2 = 0; var2 < ((ag)ad.h.get(var1)).b.size(); ++var2) {
            System.arraycopy(fishing4.a.a.a(((m)((ag)ad.h.get(var1)).b.get(var2)).a), 0, var3, var0, 4);
            var0 += 4;
            System.arraycopy(fishing4.a.a.a(Float.floatToRawIntBits(((m)((ag)ad.h.get(var1)).b.get(var2)).b)), 0, var3, var0, 4);
            var0 += 4;
            System.arraycopy(fishing4.a.a.a(((m)((ag)ad.h.get(var1)).b.get(var2)).c), 0, var3, var0, 1);
            ++var0;
            System.arraycopy(fishing4.a.a.a(((m)((ag)ad.h.get(var1)).b.get(var2)).d), 0, var3, var0, 1);
            ++var0;
            System.arraycopy(fishing4.a.a.a(((m)((ag)ad.h.get(var1)).b.get(var2)).e), 0, var3, var0, 1);
            ++var0;
         }
      }

      System.arraycopy(fishing4.a.a.a(ad.i.size()), 0, var3, var0, 4);
      var0 += 4;
      System.arraycopy(fishing4.a.a.a(ad.a), 0, var3, var0, 4);
      var1 = var0 + 4;

      for(var0 = 0; var0 < ad.i.size(); var1 += 4) {
         System.arraycopy(fishing4.a.a.a(((ac)ad.i.get(var0)).f()), 0, var3, var1, 4);
         var1 += 4;
         System.arraycopy(fishing4.a.a.a(((ac)ad.i.get(var0)).h()), 0, var3, var1, 4);
         var1 += 4;
         System.arraycopy(fishing4.a.a.a(((ac)ad.i.get(var0)).d()), 0, var3, var1, 4);
         var1 += 4;
         System.arraycopy(fishing4.a.a.a(((ac)ad.i.get(var0)).c()), 0, var3, var1, 4);
         ++var0;
      }

      System.arraycopy(fishing4.a.a.a(ad.j.size()), 0, var3, var1, 4);
      var0 = var1 + 4;
      System.arraycopy(fishing4.a.a.a(ad.c), 0, var3, var0, 4);
      var1 = var0 + 4;

      for(var0 = 0; var0 < ad.j.size(); var1 += 4) {
         System.arraycopy(fishing4.a.a.a(((ac)ad.j.get(var0)).f()), 0, var3, var1, 4);
         var1 += 4;
         System.arraycopy(fishing4.a.a.a(((ac)ad.j.get(var0)).h()), 0, var3, var1, 4);
         var1 += 4;
         System.arraycopy(fishing4.a.a.a(((ac)ad.j.get(var0)).d()), 0, var3, var1, 4);
         var1 += 4;
         System.arraycopy(fishing4.a.a.a(((ac)ad.j.get(var0)).c()), 0, var3, var1, 4);
         ++var0;
      }

      System.arraycopy(fishing4.a.a.a(ad.k.size()), 0, var3, var1, 4);
      var0 = var1 + 4;
      System.arraycopy(fishing4.a.a.a(ad.b), 0, var3, var0, 4);
      var1 = var0 + 4;

      for(var0 = 0; var0 < ad.k.size(); var1 += 4) {
         System.arraycopy(fishing4.a.a.a(((ac)ad.k.get(var0)).f()), 0, var3, var1, 4);
         var1 += 4;
         System.arraycopy(fishing4.a.a.a(((ac)ad.k.get(var0)).h()), 0, var3, var1, 4);
         var1 += 4;
         System.arraycopy(fishing4.a.a.a(((ac)ad.k.get(var0)).d()), 0, var3, var1, 4);
         var1 += 4;
         System.arraycopy(fishing4.a.a.a(((ac)ad.k.get(var0)).c()), 0, var3, var1, 4);
         ++var0;
      }

      System.arraycopy(fishing4.a.a.a(ad.l.size()), 0, var3, var1, 4);
      var0 = var1 + 4;
      System.arraycopy(fishing4.a.a.a(ad.e), 0, var3, var0, 4);
      var1 = var0 + 4;

      for(var0 = 0; var0 < ad.l.size(); var1 += 4) {
         System.arraycopy(fishing4.a.a.a(((ac)ad.l.get(var0)).f()), 0, var3, var1, 4);
         var1 += 4;
         System.arraycopy(fishing4.a.a.a(((ac)ad.l.get(var0)).h()), 0, var3, var1, 4);
         var1 += 4;
         System.arraycopy(fishing4.a.a.a(((ac)ad.l.get(var0)).d()), 0, var3, var1, 4);
         var1 += 4;
         System.arraycopy(fishing4.a.a.a(((ac)ad.l.get(var0)).c()), 0, var3, var1, 4);
         ++var0;
      }

      System.arraycopy(fishing4.a.a.a(ad.m.size()), 0, var3, var1, 4);
      var0 = var1 + 4;
      System.arraycopy(fishing4.a.a.a(ad.f), 0, var3, var0, 4);
      var1 = var0 + 4;

      for(var0 = 0; var0 < ad.m.size(); var1 += 4) {
         System.arraycopy(fishing4.a.a.a(((ac)ad.m.get(var0)).f()), 0, var3, var1, 4);
         var1 += 4;
         System.arraycopy(fishing4.a.a.a(((ac)ad.m.get(var0)).h()), 0, var3, var1, 4);
         var1 += 4;
         System.arraycopy(fishing4.a.a.a(((ac)ad.m.get(var0)).d()), 0, var3, var1, 4);
         var1 += 4;
         System.arraycopy(fishing4.a.a.a(((ac)ad.m.get(var0)).c()), 0, var3, var1, 4);
         ++var0;
      }

      System.arraycopy(fishing4.a.a.a(ad.n.size()), 0, var3, var1, 4);
      var0 = var1 + 4;
      System.arraycopy(fishing4.a.a.a(ad.d), 0, var3, var0, 4);
      var1 = var0 + 4;

      for(var0 = 0; var0 < ad.n.size(); var1 += 4) {
         System.arraycopy(fishing4.a.a.a(((ac)ad.n.get(var0)).f()), 0, var3, var1, 4);
         var1 += 4;
         System.arraycopy(fishing4.a.a.a(((ac)ad.n.get(var0)).h()), 0, var3, var1, 4);
         var1 += 4;
         System.arraycopy(fishing4.a.a.a(((ac)ad.n.get(var0)).d()), 0, var3, var1, 4);
         var1 += 4;
         System.arraycopy(fishing4.a.a.a(((ac)ad.n.get(var0)).c()), 0, var3, var1, 4);
         ++var0;
      }

      System.arraycopy(fishing4.a.a.a(ad.o.b()), 0, var3, var1, 8);
      var0 = var1 + 8;

      for(var1 = 0; var1 < 35; ++var1) {
         System.arraycopy(fishing4.a.a.a(w.a[var1].b), 0, var3, var0, 4);
         var0 += 4;
         System.arraycopy(fishing4.a.a.a(w.a[var1].a), 0, var3, var0, 4);
         var0 += 4;
         System.arraycopy(fishing4.a.a.a(w.a[var1].c), 0, var3, var0, 4);
         var0 += 4;
      }

      for(var1 = 0; var1 < 33; ++var1) {
         System.arraycopy(fishing4.a.a.a(v.a[var1].b), 0, var3, var0, 4);
         var0 += 4;
         System.arraycopy(fishing4.a.a.a(v.a[var1].a), 0, var3, var0, 4);
         var0 += 4;
         System.arraycopy(fishing4.a.a.a(v.a[var1].c), 0, var3, var0, 4);
         var0 += 4;
      }

      System.arraycopy(fishing4.a.a.a(r.a), 0, var3, var0, 4);
      var0 += 4;
      System.arraycopy(fishing4.a.a.a(r.b), 0, var3, var0, 4);
      var0 += 4;
      System.arraycopy(fishing4.a.a.a(r.c), 0, var3, var0, 4);
      var0 += 4;
      System.arraycopy(fishing4.a.a.a(Float.floatToRawIntBits(r.d)), 0, var3, var0, 4);
      var0 += 4;
      System.arraycopy(fishing4.a.a.a(Float.floatToRawIntBits(r.e)), 0, var3, var0, 4);
      var0 += 4;
      System.arraycopy(fishing4.a.a.a(Main.i), 0, var3, var0, 4);
      var0 += 4;
      System.arraycopy(fishing4.a.a.a(Main.j), 0, var3, var0, 4);
      var0 += 4;
      System.arraycopy(fishing4.a.a.a(Main.k), 0, var3, var0, 4);
      System.arraycopy(fishing4.a.a.a(Main.l), 0, var3, var0 + 4, 4);
      SaveLoadManager.a("f4save.data", var3);
      SaveLoadManager.b("new_f4save.data", var3);
   }

   public static final boolean g() {
      return true;
   }

   public static final boolean h() {
      boolean var0;
      if (!OptionsManager.h) {
         var0 = true;
      } else {
         var0 = false;
      }

      return var0;
   }

   public static void i() {
      Main.e();
      OptionsManager.h = true;
      OptionsManager.saveOptions();
      fishing4.a.r.h();
   }

   public static void j() {
      Main.e();
   }

   public static void k() {
      Main.d();
   }

   public static final boolean l() {
      return false;
   }

   public static final boolean m() {
      return false;
   }

   public static final boolean n() {
      boolean var1 = false;
      int var0 = x.c();
      if (var0 >= 60) {
         if (var0 < 140) {
            if (globalConfig.g.encrypt() < 1L) {
               var1 = true;
            }
         } else if (var0 < 240) {
            if (globalConfig.g.encrypt() < 2L) {
               var1 = true;
            }
         } else if (var0 < 400) {
            if (globalConfig.g.encrypt() < 3L) {
               var1 = true;
            }
         } else if (var0 < 600) {
            if (globalConfig.g.encrypt() < 4L) {
               var1 = true;
            }
         } else if (var0 < 800) {
            if (globalConfig.g.encrypt() < 5L) {
               var1 = true;
            }
         } else if (var0 < 1000) {
            if (globalConfig.g.encrypt() < 6L) {
               var1 = true;
            }
         } else if (var0 < 1200) {
            if (globalConfig.g.encrypt() < 7L) {
               var1 = true;
            }
         } else if (var0 < 1400) {
            if (globalConfig.g.encrypt() < 8L) {
               var1 = true;
            }
         } else if (var0 < 1600) {
            if (globalConfig.g.encrypt() < 9L) {
               var1 = true;
            }
         } else if (var0 < 1800) {
            if (globalConfig.g.encrypt() < 10L) {
               var1 = true;
            }
         } else if (var0 < 2000) {
            if (globalConfig.g.encrypt() < 11L) {
               var1 = true;
            }
         } else if (var0 < 2400) {
            if (globalConfig.g.encrypt() < 12L) {
               var1 = true;
            }
         } else if (var0 < 2800) {
            if (globalConfig.g.encrypt() < 13L) {
               var1 = true;
            }
         } else if (var0 < 3000) {
            if (globalConfig.g.encrypt() < 14L) {
               var1 = true;
            }
         } else if (var0 < 3500) {
            if (globalConfig.g.encrypt() < 15L) {
               var1 = true;
            }
         } else if (var0 < 3900) {
            if (globalConfig.g.encrypt() < 16L) {
               var1 = true;
            }
         } else if (var0 < 4200) {
            if (globalConfig.g.encrypt() < 17L) {
               var1 = true;
            }
         } else if (var0 < 4400) {
            if (globalConfig.g.encrypt() < 18L) {
               var1 = true;
            }
         } else if (var0 < 5000) {
            if (globalConfig.g.encrypt() < 19L) {
               var1 = true;
            }
         } else if (var0 < 5600) {
            if (globalConfig.g.encrypt() < 20L) {
               var1 = true;
            }
         } else if (var0 < 6200) {
            if (globalConfig.g.encrypt() < 21L) {
               var1 = true;
            }
         } else if (var0 < 7000) {
            if (globalConfig.g.encrypt() < 22L) {
               var1 = true;
            }
         } else if (var0 < 7800) {
            if (globalConfig.g.encrypt() < 23L) {
               var1 = true;
            }
         } else if (var0 < 8600) {
            if (globalConfig.g.encrypt() < 24L) {
               var1 = true;
            }
         } else if (var0 < 9800) {
            if (globalConfig.g.encrypt() < 25L) {
               var1 = true;
            }
         } else if (var0 < 11000) {
            if (globalConfig.g.encrypt() < 26L) {
               var1 = true;
            }
         } else if (var0 < 12000) {
            if (globalConfig.g.encrypt() < 27L) {
               var1 = true;
            }
         } else if (var0 < 13000) {
            if (globalConfig.g.encrypt() < 28L) {
               var1 = true;
            }
         } else if (var0 < 14000) {
            if (globalConfig.g.encrypt() < 29L) {
               var1 = true;
            }
         } else if (var0 < 16000) {
            if (globalConfig.g.encrypt() < 30L) {
               var1 = true;
            }
         } else if (var0 < 18000) {
            if (globalConfig.g.encrypt() < 31L) {
               var1 = true;
            }
         } else if (var0 < 20000) {
            if (globalConfig.g.encrypt() < 32L) {
               var1 = true;
            }
         } else if (var0 < 22000) {
            if (globalConfig.g.encrypt() < 33L) {
               var1 = true;
            }
         } else if (var0 < 24000) {
            if (globalConfig.g.encrypt() < 34L) {
               var1 = true;
            }
         } else if (var0 < 25000) {
            if (globalConfig.g.encrypt() < 35L) {
               var1 = true;
            }
         } else if (var0 < 27000) {
            if (globalConfig.g.encrypt() < 36L) {
               var1 = true;
            }
         } else if (var0 < 30000) {
            if (globalConfig.g.encrypt() < 37L) {
               var1 = true;
            }
         } else if (var0 < 33000) {
            if (globalConfig.g.encrypt() < 38L) {
               var1 = true;
            }
         } else if (var0 < 36000) {
            if (globalConfig.g.encrypt() < 39L) {
               var1 = true;
            }
         } else if (var0 < 38000) {
            if (globalConfig.g.encrypt() < 40L) {
               var1 = true;
            }
         } else if (var0 < 41000) {
            if (globalConfig.g.encrypt() < 41L) {
               var1 = true;
            }
         } else if (var0 < 44000) {
            if (globalConfig.g.encrypt() < 42L) {
               var1 = true;
            }
         } else if (var0 < 47000) {
            if (globalConfig.g.encrypt() < 43L) {
               var1 = true;
            }
         } else if (var0 < 50000) {
            if (globalConfig.g.encrypt() < 44L) {
               var1 = true;
            }
         } else if (var0 < 54000) {
            if (globalConfig.g.encrypt() < 45L) {
               var1 = true;
            }
         } else if (var0 < 56000) {
            if (globalConfig.g.encrypt() < 46L) {
               var1 = true;
            }
         } else if (var0 < 58000) {
            if (globalConfig.g.encrypt() < 47L) {
               var1 = true;
            }
         } else if (var0 < 61000) {
            if (globalConfig.g.encrypt() < 48L) {
               var1 = true;
            }
         } else if (var0 < 64000) {
            if (globalConfig.g.encrypt() < 49L) {
               var1 = true;
            }
         } else if (var0 < 67000) {
            if (globalConfig.g.encrypt() < 50L) {
               var1 = true;
            }
         } else if (var0 < 70000) {
            if (globalConfig.g.encrypt() < 51L) {
               var1 = true;
            }
         } else if (var0 < 74000) {
            if (globalConfig.g.encrypt() < 52L) {
               var1 = true;
            }
         } else if (var0 < 77000) {
            if (globalConfig.g.encrypt() < 53L) {
               var1 = true;
            }
         } else if (var0 < 81000) {
            if (globalConfig.g.encrypt() < 54L) {
               var1 = true;
            }
         } else if (var0 < 85000) {
            if (globalConfig.g.encrypt() < 55L) {
               var1 = true;
            }
         } else if (var0 < 89000) {
            if (globalConfig.g.encrypt() < 56L) {
               var1 = true;
            }
         } else if (var0 < 93000) {
            if (globalConfig.g.encrypt() < 57L) {
               var1 = true;
            }
         } else if (var0 < 97000) {
            if (globalConfig.g.encrypt() < 58L) {
               var1 = true;
            }
         } else if (var0 < 101000) {
            if (globalConfig.g.encrypt() < 59L) {
               var1 = true;
            }
         } else if (var0 < 104000) {
            if (globalConfig.g.encrypt() < 60L) {
               var1 = true;
            }
         } else if (var0 < 107000) {
            if (globalConfig.g.encrypt() < 61L) {
               var1 = true;
            }
         } else if (var0 < 112000) {
            if (globalConfig.g.encrypt() < 62L) {
               var1 = true;
            }
         } else if (var0 < 117000) {
            if (globalConfig.g.encrypt() < 63L) {
               var1 = true;
            }
         } else if (var0 < 122000) {
            if (globalConfig.g.encrypt() < 64L) {
               var1 = true;
            }
         } else if (var0 < 127000) {
            if (globalConfig.g.encrypt() < 65L) {
               var1 = true;
            }
         } else if (var0 < 132000) {
            if (globalConfig.g.encrypt() < 66L) {
               var1 = true;
            }
         } else if (var0 < 137000) {
            if (globalConfig.g.encrypt() < 67L) {
               var1 = true;
            }
         } else if (var0 < 142000) {
            if (globalConfig.g.encrypt() < 68L) {
               var1 = true;
            }
         } else if (var0 < 147000) {
            if (globalConfig.g.encrypt() < 69L) {
               var1 = true;
            }
         } else if (var0 < 152000) {
            if (globalConfig.g.encrypt() < 70L) {
               var1 = true;
            }
         } else if (var0 < 157000) {
            if (globalConfig.g.encrypt() < 71L) {
               var1 = true;
            }
         } else if (var0 < 162000) {
            if (globalConfig.g.encrypt() < 72L) {
               var1 = true;
            }
         } else if (var0 < 169000) {
            if (globalConfig.g.encrypt() < 73L) {
               var1 = true;
            }
         } else if (var0 < 177000) {
            if (globalConfig.g.encrypt() < 74L) {
               var1 = true;
            }
         } else if (var0 < 183000) {
            if (globalConfig.g.encrypt() < 75L) {
               var1 = true;
            }
         } else if (var0 < 189000) {
            if (globalConfig.g.encrypt() < 76L) {
               var1 = true;
            }
         } else if (var0 < 197000) {
            if (globalConfig.g.encrypt() < 77L) {
               var1 = true;
            }
         } else if (var0 < 203000) {
            if (globalConfig.g.encrypt() < 78L) {
               var1 = true;
            }
         } else if (var0 < 209000) {
            if (globalConfig.g.encrypt() < 79L) {
               var1 = true;
            }
         } else if (var0 < 217000) {
            if (globalConfig.g.encrypt() < 80L) {
               var1 = true;
            }
         } else if (var0 < 223000) {
            if (globalConfig.g.encrypt() < 81L) {
               var1 = true;
            }
         } else if (var0 < 229000) {
            if (globalConfig.g.encrypt() < 82L) {
               var1 = true;
            }
         } else if (var0 < 233000) {
            if (globalConfig.g.encrypt() < 83L) {
               var1 = true;
            }
         } else if (var0 < 239000) {
            if (globalConfig.g.encrypt() < 84L) {
               var1 = true;
            }
         } else if (var0 < 245000) {
            if (globalConfig.g.encrypt() < 85L) {
               var1 = true;
            }
         } else if (var0 < 251000) {
            if (globalConfig.g.encrypt() < 86L) {
               var1 = true;
            }
         } else if (var0 < 257000) {
            if (globalConfig.g.encrypt() < 87L) {
               var1 = true;
            }
         } else if (var0 < 263000) {
            if (globalConfig.g.encrypt() < 88L) {
               var1 = true;
            }
         } else if (var0 < 269000) {
            if (globalConfig.g.encrypt() < 89L) {
               var1 = true;
            }
         } else if (var0 < 276000) {
            if (globalConfig.g.encrypt() < 90L) {
               var1 = true;
            }
         } else if (var0 < 283000) {
            if (globalConfig.g.encrypt() < 91L) {
               var1 = true;
            }
         } else if (var0 < 289000) {
            if (globalConfig.g.encrypt() < 92L) {
               var1 = true;
            }
         } else if (var0 < 294000) {
            if (globalConfig.g.encrypt() < 93L) {
               var1 = true;
            }
         } else if (var0 < 299000) {
            if (globalConfig.g.encrypt() < 94L) {
               var1 = true;
            }
         } else if (var0 < 313000) {
            if (globalConfig.g.encrypt() < 95L) {
               var1 = true;
            }
         } else if (var0 < 319000) {
            if (globalConfig.g.encrypt() < 96L) {
               var1 = true;
            }
         } else if (var0 < 328000) {
            if (globalConfig.g.encrypt() < 97L) {
               var1 = true;
            }
         } else if (var0 < 336000) {
            if (globalConfig.g.encrypt() < 98L) {
               var1 = true;
            }
         } else if (var0 < 345000) {
            if (globalConfig.g.encrypt() < 99L) {
               var1 = true;
            }
         } else if (var0 < 354000) {
            if (globalConfig.g.encrypt() < 100L) {
               var1 = true;
            }
         } else if (var0 < 363000) {
            if (globalConfig.g.encrypt() < 101L) {
               var1 = true;
            }
         } else if (var0 < 372000) {
            if (globalConfig.g.encrypt() < 102L) {
               var1 = true;
            }
         } else if (var0 < 380000) {
            if (globalConfig.g.encrypt() < 103L) {
               var1 = true;
            }
         } else if (var0 < 387000) {
            if (globalConfig.g.encrypt() < 104L) {
               var1 = true;
            }
         } else if (var0 < 394000) {
            if (globalConfig.g.encrypt() < 105L) {
               var1 = true;
            }
         } else if (var0 < 400000) {
            if (globalConfig.g.encrypt() < 106L) {
               var1 = true;
            }
         } else if (globalConfig.g.encrypt() < 107L) {
            var1 = true;
         }
      }

      return var1;
   }

   public static void o() {
      if (aq.b == 22) {
         fishing4.a.r.j = false;
      } else {
         fishing4.a.r.j = true;
      }

      Main.k();
   }

   public static void p() {
      Main.l();
   }

   public static final boolean q() {
      return false;
   }

   public static int getLanguageId() {
      byte selectedLanguage = 0;
      String defaultLanguage = Locale.getDefault().toString();
      if (!defaultLanguage.startsWith("ko")) {
         if (defaultLanguage.startsWith("jp")) {
            selectedLanguage = 2;
         } else if (defaultLanguage.startsWith("cn")) {
            selectedLanguage = 3;
         } else {
            selectedLanguage = 1;
         }
      }

      return selectedLanguage;
   }
}

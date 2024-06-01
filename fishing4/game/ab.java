package fishing4.game;

import java.text.DecimalFormat;

import fishing4.a.GLRootView;

public final class ab {
   public static DecimalFormat a = new DecimalFormat("###0.0#");

   public static int a(int var0) {
      short var2 = 150;
      int var1;
      if (var0 >= 201 && var0 <= 205) {
         var1 = 10;
      } else if (var0 >= 206 && var0 <= 214) {
         var1 = 30;
      } else if (var0 >= 215 && var0 <= 219) {
         var1 = 50;
      } else if (var0 == 310) {
         var1 = 200;
      } else if (var0 == 607) {
         var1 = 100;
      } else {
         var1 = var2;
         if (var0 != 608) {
            var1 = var2;
            if (var0 != 507) {
               if (var0 == 508) {
                  var1 = 300;
               } else {
                  var1 = var2;
                  if (var0 != 707) {
                     if (var0 == 708) {
                        var1 = 300;
                     } else if (var0 >= 101 && var0 <= 125) {
                        var1 = b(aw.p, aw.q);
                     } else if (var0 >= 301 && var0 <= 309) {
                        var1 = b(aw.p, aw.q);
                     } else {
                        var1 = 0;
                     }
                  }
               }
            }
         }
      }

      return var1;
   }

   public static String a(int var0, int var1) {
      String var2;
      if (globalConfig.languageId == 0) {
         if (var0 != 6) {
            if (var0 == 0) {
               switch (var1) {
                  case 0:
                     var2 = "힘";
                     return var2;
                  case 1:
                     var2 = "제한";
                     return var2;
                  case 2:
                     var2 = "내구도";
                     return var2;
                  case 3:
                     var2 = "가격";
                     return var2;
               }
            } else if (var0 == 1) {
               switch (var1) {
                  case 0:
                     var2 = "제한";
                     return var2;
                  case 1:
                     var2 = "대상";
                     return var2;
                  case 2:
                     var2 = "가격";
                     return var2;
               }
            } else if (var0 == 2) {
               switch (var1) {
                  case 0:
                     var2 = "텐션";
                     return var2;
                  case 1:
                     var2 = "거리";
                     return var2;
                  case 2:
                     var2 = "제한";
                     return var2;
                  case 3:
                     var2 = "내구도";
                     return var2;
                  case 4:
                     var2 = "가격";
                     return var2;
               }
            } else if (var0 == 3) {
               switch (var1) {
                  case 0:
                     var2 = "체력";
                     return var2;
                  case 1:
                     var2 = "제한";
                     return var2;
                  case 2:
                     var2 = "내구도";
                     return var2;
                  case 3:
                     var2 = "가격";
                     return var2;
               }
            } else if (var0 == 4) {
               switch (var1) {
                  case 0:
                     var2 = "입질";
                     return var2;
                  case 1:
                     var2 = "제한";
                     return var2;
                  case 2:
                     var2 = "내구도";
                     return var2;
                  case 3:
                     var2 = "가격";
                     return var2;
               }
            } else if (var0 == 5) {
               switch (var1) {
                  case 0:
                     var2 = "힘";
                     return var2;
                  case 1:
                     var2 = "제한";
                     return var2;
                  case 2:
                     var2 = "내구도";
                     return var2;
                  case 3:
                     var2 = "가격";
                     return var2;
               }
            }
         }
      } else if (var0 != 6) {
         if (var0 == 0) {
            switch (var1) {
               case 0:
                  var2 = "Power";
                  return var2;
               case 1:
                  var2 = "Limit";
                  return var2;
               case 2:
                  var2 = "Durabilty";
                  return var2;
               case 3:
                  var2 = "Price";
                  return var2;
            }
         } else if (var0 == 1) {
            switch (var1) {
               case 0:
                  var2 = "Limit";
                  return var2;
               case 1:
                  var2 = "Fish grade";
                  return var2;
               case 2:
                  var2 = "Price";
                  return var2;
            }
         } else if (var0 == 2) {
            switch (var1) {
               case 0:
                  var2 = "Tension";
                  return var2;
               case 1:
                  var2 = "Distance";
                  return var2;
               case 2:
                  var2 = "Limit";
                  return var2;
               case 3:
                  var2 = "Durabilty";
                  return var2;
               case 4:
                  var2 = "Price";
                  return var2;
            }
         } else if (var0 == 3) {
            switch (var1) {
               case 0:
                  var2 = "Stamina";
                  return var2;
               case 1:
                  var2 = "Limit";
                  return var2;
               case 2:
                  var2 = "Durabilty";
                  return var2;
               case 3:
                  var2 = "Price";
                  return var2;
            }
         } else if (var0 == 4) {
            switch (var1) {
               case 0:
                  var2 = "Tenacity";
                  return var2;
               case 1:
                  var2 = "Limit";
                  return var2;
               case 2:
                  var2 = "Durabilty";
                  return var2;
               case 3:
                  var2 = "Price";
                  return var2;
            }
         } else if (var0 == 5) {
            switch (var1) {
               case 0:
                  var2 = "Power";
                  return var2;
               case 1:
                  var2 = "Limit";
                  return var2;
               case 2:
                  var2 = "Durabilty";
                  return var2;
               case 3:
                  var2 = "Price";
                  return var2;
            }
         }
      }

      var2 = "";
      return var2;
   }

   public static String a(ac var0, int var1, boolean var2) {
      int var3 = var0.f();
      String var4;
      if (var0.s() != 6) {
         if (var0.s() == 0) {
            switch (var1) {
               case 0:
                  var4 = Integer.toString(var0.q());
                  return var4;
               case 1:
                  var4 = t.a(ac.g(var3), true);
                  return var4;
               case 2:
                  var4 = var0.i();
                  return var4;
               case 3:
                  var4 = ac.a(var3, var2, 1);
                  return var4;
            }
         } else if (var0.s() == 1) {
            switch (var1) {
               case 0:
                  var4 = t.a(ac.g(var3), true);
                  return var4;
               case 1:
                  switch (var3) {
                     case 200:
                        if (globalConfig.languageId == 0) {
                           var4 = "F등급";
                        } else {
                           var4 = "F";
                        }

                        return var4;
                     case 201:
                     case 202:
                        if (globalConfig.languageId == 0) {
                           var4 = "F~E등급";
                        } else {
                           var4 = "F~E";
                        }

                        return var4;
                     case 203:
                     case 204:
                     case 205:
                        if (globalConfig.languageId == 0) {
                           var4 = "F~D등급";
                        } else {
                           var4 = "F~D";
                        }

                        return var4;
                     case 206:
                     case 207:
                     case 208:
                        if (globalConfig.languageId == 0) {
                           var4 = "F~C등급";
                        } else {
                           var4 = "F~C";
                        }

                        return var4;
                     case 209:
                     case 210:
                     case 211:
                        if (globalConfig.languageId == 0) {
                           var4 = "F~B등급";
                        } else {
                           var4 = "F~B";
                        }

                        return var4;
                     case 212:
                     case 213:
                     case 214:
                        if (globalConfig.languageId == 0) {
                           var4 = "F~A등급";
                        } else {
                           var4 = "F~A";
                        }

                        return var4;
                     case 215:
                     case 216:
                        if (globalConfig.languageId == 0) {
                           var4 = "F~S등급";
                        } else {
                           var4 = "F~S";
                        }

                        return var4;
                     case 217:
                     case 218:
                     case 219:
                        if (globalConfig.languageId == 0) {
                           var4 = "F~SS등급";
                        } else {
                           var4 = "F~SS";
                        }

                        return var4;
                     default:
                        var4 = "F";
                        return var4;
                  }
               case 2:
                  var4 = ac.a(var3, var2, 1);
                  return var4;
            }
         } else if (var0.s() == 2) {
            switch (var1) {
               case 0:
                  var1 = var0.t();
                  if (var1 < 0) {
                     if (globalConfig.languageId == 0) {
                        var4 = "무제한";
                     } else {
                        var4 = "Unlimited";
                     }

                     return var4;
                  } else {
                     var4 = Integer.toString(var1);
                     return var4;
                  }
               case 1:
                  if (globalConfig.languageId == 0) {
                     var4 = Integer.toString(ac.j(var3)) + "(m)";
                  } else {
                     var4 = Integer.toString(ac.j(var3)) + "(yd)";
                  }

                  return var4;
               case 2:
                  var4 = t.a(ac.g(var3), true);
                  return var4;
               case 3:
                  var4 = var0.i();
                  return var4;
               case 4:
                  var4 = ac.a(var3, var2, 1);
                  return var4;
            }
         } else if (var0.s() == 3) {
            switch (var1) {
               case 0:
                  var4 = Integer.toString(ac.l(var3));
                  return var4;
               case 1:
                  var4 = t.a(ac.g(var3), true);
                  return var4;
               case 2:
                  var4 = var0.i();
                  return var4;
               case 3:
                  var4 = ac.a(var3, var2, 1);
                  return var4;
            }
         } else if (var0.s() == 4) {
            switch (var1) {
               case 0:
                  var4 = Integer.toString(ac.k(var3)) + "%";
                  return var4;
               case 1:
                  var4 = t.a(ac.g(var3), true);
                  return var4;
               case 2:
                  var4 = var0.i();
                  return var4;
               case 3:
                  var4 = ac.a(var3, var2, 1);
                  return var4;
            }
         } else if (var0.s() == 5) {
            switch (var1) {
               case 0:
                  var4 = Integer.toString(var0.q());
                  return var4;
               case 1:
                  var4 = t.a(ac.g(var3), true);
                  return var4;
               case 2:
                  var4 = var0.i();
                  return var4;
               case 3:
                  var4 = ac.a(var3, var2, 1);
                  return var4;
            }
         }
      }

      var4 = "";
      return var4;
   }

   private static int b(int var0, int var1) {
      if (d(var0) == 0) {
         var0 = ac.b(var0, var1).q();
      } else if (d(var0) == 2) {
         var0 = ac.b(var0, var1).t() * 200 / ac.b(309, 9).t() / 2;
      } else {
         var0 = 0;
      }

      return var0;
   }

   public static String b(int var0) {
      String var1;
      if (globalConfig.languageId == 0) {
         if (am.b == 200) {
            var1 = "\n\n" + fishing4.a.y.b(var0) + "입니다.\n결제하시겠습니까?";
         } else {
            var1 = "\n\n" + fishing4.a.y.c(var0) + "입니다.\n결제하시겠습니까?";
         }
      } else if (am.b == 200) {
         var1 = "\n\n" + fishing4.a.y.b(var0) + " coin will be charged. Okay?";
      } else {
         var1 = "\n\n" + fishing4.a.y.c(var0) + " coin will be charged. Okay?";
      }

      return var1;
   }

   public static String c(int var0) {
      int var1 = 2131166038;
      switch (var0) {
         case 50:
            var0 = 2131165240;
            break;
         case 80:
            var0 = 2131165218;
            break;
         case 81:
            var0 = 2131165219;
            break;
         case 82:
            var0 = 2131165220;
            break;
         case 83:
            var0 = 2131165221;
            break;
         case 84:
            var0 = 2131165222;
            break;
         case 85:
            var0 = 2131165223;
            break;
         case 86:
            var0 = 2131165224;
            break;
         case 87:
            var0 = 2131165225;
            break;
         case 88:
            var0 = 2131165226;
            break;
         case 100:
            var0 = 2131165350;
            break;
         case 101:
            var0 = 2131165351;
            break;
         case 102:
            var0 = 2131165352;
            break;
         case 103:
            var0 = 2131165353;
            break;
         case 104:
            var0 = 2131165354;
            break;
         case 105:
            var0 = 2131165355;
            break;
         case 106:
            var0 = 2131165356;
            break;
         case 107:
            var0 = 2131165357;
            break;
         case 108:
            var0 = 2131165358;
            break;
         case 109:
            var0 = 2131165359;
            break;
         case 110:
            var0 = 2131165360;
            break;
         case 111:
            var0 = 2131165361;
            break;
         case 112:
            var0 = 2131165362;
            break;
         case 113:
            var0 = 2131165363;
            break;
         case 114:
            var0 = 2131165364;
            break;
         case 115:
            var0 = 2131165365;
            break;
         case 116:
            var0 = 2131165366;
            break;
         case 117:
            var0 = 2131165367;
            break;
         case 118:
            var0 = 2131165368;
            break;
         case 119:
            var0 = 2131165369;
            break;
         case 120:
            var0 = 2131165370;
            break;
         case 121:
            var0 = 2131165371;
            break;
         case 122:
            var0 = 2131165372;
            break;
         case 123:
            var0 = 2131165373;
            break;
         case 124:
            var0 = 2131165374;
            break;
         case 125:
            var0 = 2131165375;
            break;
         case 200:
            var0 = 2131165376;
            break;
         case 201:
            var0 = 2131165377;
            break;
         case 202:
            var0 = 2131165378;
            break;
         case 203:
            var0 = 2131165379;
            break;
         case 204:
            var0 = 2131165380;
            break;
         case 205:
            var0 = 2131165381;
            break;
         case 206:
            var0 = 2131165382;
            break;
         case 207:
            var0 = 2131165383;
            break;
         case 208:
            var0 = 2131165384;
            break;
         case 209:
            var0 = 2131165385;
            break;
         case 210:
            var0 = 2131165386;
            break;
         case 211:
            var0 = 2131165387;
            break;
         case 212:
            var0 = 2131165388;
            break;
         case 213:
            var0 = 2131165389;
            break;
         case 214:
            var0 = 2131165390;
            break;
         case 215:
            var0 = 2131165391;
            break;
         case 216:
            var0 = 2131165392;
            break;
         case 217:
            var0 = 2131165393;
            break;
         case 218:
            var0 = 2131165394;
            break;
         case 219:
            var0 = 2131165395;
            break;
         case 300:
            var0 = 2131165396;
            break;
         case 301:
            var0 = 2131165397;
            break;
         case 302:
            var0 = 2131165398;
            break;
         case 303:
            var0 = 2131165399;
            break;
         case 304:
            var0 = 2131165400;
            break;
         case 305:
            var0 = 2131165401;
            break;
         case 306:
            var0 = 2131165402;
            break;
         case 307:
            var0 = 2131165403;
            break;
         case 308:
            var0 = 2131165404;
            break;
         case 309:
            var0 = 2131165405;
            break;
         case 310:
            var0 = 2131165406;
            break;
         case 500:
            var0 = 2131165407;
            break;
         case 501:
            var0 = 2131165408;
            break;
         case 502:
            var0 = 2131165409;
            break;
         case 503:
            var0 = 2131165410;
            break;
         case 504:
            var0 = 2131165411;
            break;
         case 505:
            var0 = 2131165412;
            break;
         case 506:
            var0 = 2131165413;
            break;
         case 507:
            var0 = 2131165414;
            break;
         case 508:
            var0 = 2131165415;
            break;
         case 600:
            var0 = 2131165416;
            break;
         case 601:
            var0 = 2131165417;
            break;
         case 602:
            var0 = 2131165418;
            break;
         case 603:
            var0 = 2131165419;
            break;
         case 604:
            var0 = 2131165420;
            break;
         case 605:
            var0 = 2131165421;
            break;
         case 606:
            var0 = 2131165422;
            break;
         case 607:
            var0 = 2131165423;
            break;
         case 608:
            var0 = 2131165424;
            break;
         case 700:
            var0 = 2131165425;
            break;
         case 701:
            var0 = 2131165426;
            break;
         case 702:
            var0 = 2131165427;
            break;
         case 703:
            var0 = 2131165428;
            break;
         case 704:
            var0 = 2131165429;
            break;
         case 705:
            var0 = 2131165430;
            break;
         case 706:
            var0 = 2131165431;
            break;
         case 707:
            var0 = 2131165432;
            break;
         case 708:
            var0 = 2131165433;
            break;
         default:
            var0 = var1;
      }

      return GLRootView.getAppContext().getString(var0);
   }

   public static int d(int var0) {
      byte var1;
      if (var0 >= 80 && var0 <= 88) {
         var1 = 6;
      } else if (var0 >= 100 && var0 <= 125) {
         var1 = 0;
      } else if (var0 >= 200 && var0 <= 219) {
         var1 = 1;
      } else if (var0 >= 300 && var0 <= 310) {
         var1 = 2;
      } else if (var0 >= 500 && var0 <= 508) {
         var1 = 3;
      } else if (var0 >= 600 && var0 <= 608) {
         var1 = 4;
      } else if (var0 >= 700 && var0 <= 708) {
         var1 = 5;
      } else {
         var1 = -1;
      }

      return var1;
   }

   public static int e(int var0) {
      byte var1 = 5;
      if (var0 != 6) {
         if (var0 == 0) {
            var1 = 4;
         } else if (var0 == 1) {
            var1 = 3;
         } else if (var0 != 2) {
            if (var0 == 3) {
               var1 = 4;
            } else if (var0 == 4) {
               var1 = 4;
            } else if (var0 == 5) {
               var1 = 4;
            } else {
               var1 = 0;
            }
         }
      }

      return var1;
   }
}

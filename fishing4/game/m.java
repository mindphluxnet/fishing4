package fishing4.game;

import java.math.BigDecimal;
import javax.microedition.khronos.opengles.GL10;

import fishing4.a.AESUtils;

public final class m {
   public static fishing4.a.w f;
   public static boolean g;
   public static fishing4.a.w h;
   public static fishing4.a.w i;
   public static AESUtils j = AESUtils.a();
   public static AESUtils k = AESUtils.a();
   protected int a;
   protected float b;
   protected boolean c;
   protected boolean d;
   protected boolean e;

   private m(int var1, float var2) {
      this.a = var1;
      this.b = var2;
      this.c = false;
      this.d = false;
      this.e = false;
   }

   public static float a(float var0, int var1) {
      float var2 = 0.0F;
      if (var0 == 0.0F) {
         var0 = var2;
      } else {
         var0 = 1.0F / var0;
         var0 = (new BigDecimal(p(var1))).divide(new BigDecimal((double)var0), 2, 4).floatValue();
      }

      return var0;
   }

   public static float a(int var0, int var1) {
      return (float)var1 * 0.01F / (float)p(var0);
   }

   public static m a(int var0, float var1) {
      return new m(var0, var1);
   }

   public static String a(float var0) {
      // $FF: Couldn't be decompiled
   }

   public static void a(GL10 var0) {
      if (h != null) {
         fishing4.a.w.a(var0, h);
         h = null;
      }

      if (i != null) {
         fishing4.a.w.a(var0, i);
         i = null;
      }

   }

   public static void a(GL10 var0, float var1, float var2, int var3) {
      if (i == null) {
         i = fishing4.a.w.a(var0, "img/fish/goldfish.png");
      }

      byte var4;
      switch (var3 / 4 % 9) {
         case 0:
            var4 = 1;
            break;
         case 1:
            var4 = 2;
            break;
         case 2:
            var4 = 3;
            break;
         case 3:
            var4 = 3;
            break;
         case 4:
            var4 = 3;
            break;
         case 5:
            var4 = 2;
            break;
         case 6:
            var4 = 1;
            break;
         default:
            var4 = 0;
      }

      fishing4.a.m.a(var0, i, var1, var2 + (float)var4, 0.0F, 0.0F, 256.0F, 256.0F, '\b');
      if (var3 % 40 == 0) {
         fishing4.a.m.a(var0, i, var1 + 0.0F, var2 + 20.0F, 258.0F, 72.0F, 68.0F, 68.0F, '\u0005');
      } else if (var3 % 40 == 1) {
         fishing4.a.m.a(var0, i, var1 + 0.0F, var2 + 20.0F, 0.0F, 258.0F, 240.0F, 240.0F, '\u0005');
      }

      if (var3 % 40 == 20) {
         fishing4.a.m.a(var0, i, var1 - 50.0F, var2 - 10.0F, 258.0F, 72.0F, 68.0F, 68.0F, '\u0005');
      } else if (var3 % 40 == 21) {
         fishing4.a.m.a(var0, i, var1 - 50.0F, var2 - 10.0F, 0.0F, 258.0F, 240.0F, 240.0F, '\u0005');
      }

   }

   public static void a(GL10 var0, int var1, float var2, boolean var3, boolean var4, boolean var5, fishing4.a.w var6, fishing4.a.w var7, float var8, float var9, int var10) {
      // $FF: Couldn't be decompiled
   }

   public static boolean a(int var0) {
      boolean var1;
      if (var0 >= 0 && var0 <= 143) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public static int b(float var0) {
      byte var2 = 0;
      byte var1;
      if (var0 > 0.95F && var0 < 1.1F) {
         var1 = var2;
      } else if (var0 > 0.9F && var0 < 1.2F) {
         var1 = 1;
      } else if (var0 > 0.85F && var0 < 1.3F) {
         var1 = 2;
      } else if (var0 > 0.8F && var0 < 1.4F) {
         var1 = 3;
      } else {
         var1 = var2;
         if (var0 >= 0.75F) {
            var1 = var2;
            if (var0 <= 1.6F) {
               var1 = 4;
            }
         }
      }

      return var1;
   }

   public static int b(float var0, int var1) {
      return (new BigDecimal(String.valueOf(a(var0, var1)))).multiply(new BigDecimal(100)).intValue();
   }

   private static int b(int var0, int var1) {
      byte var2 = 1;
      switch (var0) {
         case 0:
            if (var1 == 1) {
               var0 = fishing4.a.z.a(3);
               if (var0 == 0) {
                  var0 = 144;
                  return var0;
               } else {
                  if (var0 == 1) {
                     var0 = 145;
                  } else {
                     var0 = 147;
                  }

                  return var0;
               }
            }

            if (var1 == 2) {
               var0 = fishing4.a.z.a(3);
               if (var0 == 0) {
                  var0 = 150;
                  return var0;
               } else {
                  if (var0 == 1) {
                     var0 = 151;
                  } else {
                     var0 = 152;
                  }

                  return var0;
               }
            }

            if (var1 == 3) {
               var0 = fishing4.a.z.a(6);
               if (var0 == 0) {
                  var0 = 154;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 155;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 157;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 159;
                  return var0;
               } else {
                  if (var0 == 4) {
                     var0 = 160;
                  } else {
                     var0 = 161;
                  }

                  return var0;
               }
            }

            if (var1 == 4) {
               var0 = fishing4.a.z.a(6);
               if (var0 == 0) {
                  var0 = 163;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 164;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 166;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 167;
                  return var0;
               } else {
                  if (var0 == 4) {
                     var0 = 168;
                  } else {
                     var0 = 171;
                  }

                  return var0;
               }
            }

            if (var1 == 5) {
               var0 = fishing4.a.z.a(4);
               if (var0 == 0) {
                  var0 = 173;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 175;
                  return var0;
               } else {
                  if (var0 == 2) {
                     var0 = 176;
                  } else {
                     var0 = 179;
                  }

                  return var0;
               }
            }

            if (var1 == 6) {
               if (fishing4.a.z.a(2) == 0) {
                  var0 = 182;
               } else {
                  var0 = 183;
               }

               return var0;
            }

            if (var1 != 7 && var1 != 8) {
               break;
            }

            var0 = 185;
            return var0;
         case 1:
            if (var1 == 1) {
               var0 = fishing4.a.z.a(3);
               if (var0 == 0) {
                  var0 = 144;
                  return var0;
               } else {
                  if (var0 == 1) {
                     var0 = 146;
                  } else {
                     var0 = 148;
                  }

                  return var0;
               }
            }

            if (var1 == 2) {
               var0 = fishing4.a.z.a(4);
               if (var0 == 0) {
                  var0 = 149;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 151;
                  return var0;
               } else {
                  if (var0 == 2) {
                     var0 = 152;
                  } else {
                     var0 = 153;
                  }

                  return var0;
               }
            }

            if (var1 == 3) {
               var0 = fishing4.a.z.a(6);
               if (var0 == 0) {
                  var0 = 155;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 156;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 158;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 159;
                  return var0;
               } else {
                  if (var0 == 4) {
                     var0 = 161;
                  } else {
                     var0 = 162;
                  }

                  return var0;
               }
            }

            if (var1 == 4) {
               var0 = fishing4.a.z.a(6);
               if (var0 == 0) {
                  var0 = 163;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 165;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 166;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 168;
                  return var0;
               } else {
                  if (var0 == 4) {
                     var0 = 169;
                  } else {
                     var0 = 172;
                  }

                  return var0;
               }
            }

            if (var1 == 5) {
               var0 = fishing4.a.z.a(4);
               if (var0 == 0) {
                  var0 = 174;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 175;
                  return var0;
               } else {
                  if (var0 == 2) {
                     var0 = 178;
                  } else {
                     var0 = 179;
                  }

                  return var0;
               }
            }

            if (var1 == 6) {
               if (fishing4.a.z.a(2) == 0) {
                  var0 = 181;
               } else {
                  var0 = 183;
               }

               return var0;
            }

            if (var1 != 7 && var1 != 8) {
               break;
            }

            var0 = 184;
            return var0;
         case 2:
            if (var1 == 1) {
               var0 = fishing4.a.z.a(4);
               if (var0 == 0) {
                  var0 = 145;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 146;
                  return var0;
               } else {
                  if (var0 == 2) {
                     var0 = 147;
                  } else {
                     var0 = 148;
                  }

                  return var0;
               }
            }

            if (var1 == 2) {
               var0 = fishing4.a.z.a(3);
               if (var0 == 0) {
                  var0 = 149;
                  return var0;
               } else {
                  if (var0 == 1) {
                     var0 = 150;
                  } else {
                     var0 = 153;
                  }

                  return var0;
               }
            }

            if (var1 == 3) {
               var0 = fishing4.a.z.a(6);
               if (var0 == 0) {
                  var0 = 154;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 156;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 157;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 158;
                  return var0;
               } else {
                  if (var0 == 4) {
                     var0 = 160;
                  } else {
                     var0 = 162;
                  }

                  return var0;
               }
            }

            if (var1 == 4) {
               var0 = fishing4.a.z.a(6);
               if (var0 == 0) {
                  var0 = 164;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 165;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 167;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 168;
                  return var0;
               } else {
                  if (var0 == 4) {
                     var0 = 169;
                  } else {
                     var0 = 170;
                  }

                  return var0;
               }
            }

            if (var1 == 5) {
               var0 = fishing4.a.z.a(3);
               if (var0 == 0) {
                  var0 = 173;
                  return var0;
               } else {
                  if (var0 == 1) {
                     var0 = 174;
                  } else {
                     var0 = 177;
                  }

                  return var0;
               }
            }

            if (var1 != 6 && var1 != 7) {
               if (var1 == 8) {
                  var0 = 186;
                  return var0;
               }
               break;
            }

            if (fishing4.a.z.a(2) == 0) {
               var0 = 180;
            } else {
               var0 = 183;
            }

            return var0;
         case 3:
            if (var1 == 1) {
               var1 = fishing4.a.z.a(4);
               if (var1 == 0) {
                  var0 = 0;
               } else {
                  var0 = var2;
                  if (var1 != 1) {
                     if (var1 == 2) {
                        var0 = 6;
                     } else {
                        var0 = 8;
                     }

                     return var0;
                  }
               }

               return var0;
            }

            if (var1 == 2) {
               var0 = fishing4.a.z.a(5);
               if (var0 == 0) {
                  var0 = 9;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 11;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 14;
                  return var0;
               } else {
                  if (var0 == 3) {
                     var0 = 16;
                  } else {
                     var0 = 19;
                  }

                  return var0;
               }
            }

            if (var1 == 3) {
               var0 = fishing4.a.z.a(10);
               if (var0 == 0) {
                  var0 = 24;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 25;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 27;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 28;
                  return var0;
               } else if (var0 == 4) {
                  var0 = 29;
                  return var0;
               } else if (var0 == 5) {
                  var0 = 35;
                  return var0;
               } else if (var0 == 6) {
                  var0 = 39;
                  return var0;
               } else if (var0 == 7) {
                  var0 = 41;
                  return var0;
               } else {
                  if (var0 == 8) {
                     var0 = 44;
                  } else {
                     var0 = 46;
                  }

                  return var0;
               }
            }

            if (var1 == 4) {
               var0 = fishing4.a.z.a(13);
               if (var0 == 0) {
                  var0 = 50;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 52;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 55;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 58;
                  return var0;
               } else if (var0 == 4) {
                  var0 = 59;
                  return var0;
               } else if (var0 == 5) {
                  var0 = 63;
                  return var0;
               } else if (var0 == 6) {
                  var0 = 65;
                  return var0;
               } else if (var0 == 7) {
                  var0 = 68;
                  return var0;
               } else if (var0 == 8) {
                  var0 = 69;
                  return var0;
               } else if (var0 == 9) {
                  var0 = 73;
                  return var0;
               } else if (var0 == 10) {
                  var0 = 76;
                  return var0;
               } else {
                  if (var0 == 11) {
                     var0 = 77;
                  } else {
                     var0 = 82;
                  }

                  return var0;
               }
            }

            if (var1 == 5) {
               var0 = fishing4.a.z.a(12);
               if (var0 == 0) {
                  var0 = 83;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 90;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 92;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 94;
                  return var0;
               } else if (var0 == 4) {
                  var0 = 96;
                  return var0;
               } else if (var0 == 5) {
                  var0 = 98;
                  return var0;
               } else if (var0 == 6) {
                  var0 = 100;
                  return var0;
               } else if (var0 == 7) {
                  var0 = 104;
                  return var0;
               } else if (var0 == 8) {
                  var0 = 106;
                  return var0;
               } else if (var0 == 9) {
                  var0 = 108;
                  return var0;
               } else {
                  if (var0 == 10) {
                     var0 = 110;
                  } else {
                     var0 = 114;
                  }

                  return var0;
               }
            }

            if (var1 == 6) {
               var0 = fishing4.a.z.a(5);
               if (var0 == 0) {
                  var0 = 116;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 119;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 120;
                  return var0;
               } else {
                  if (var0 == 3) {
                     var0 = 122;
                  } else {
                     var0 = 127;
                  }

                  return var0;
               }
            }

            if (var1 == 7) {
               if (fishing4.a.z.a(2) == 0) {
                  var0 = 130;
               } else {
                  var0 = 131;
               }

               return var0;
            }

            if (var1 == 8) {
               var0 = 142;
               return var0;
            }
            break;
         case 4:
            if (var1 == 1) {
               var0 = fishing4.a.z.a(4);
               if (var0 == 0) {
                  var0 = 2;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 4;
                  return var0;
               } else {
                  if (var0 == 2) {
                     var0 = 5;
                  } else {
                     var0 = 7;
                  }

                  return var0;
               }
            }

            if (var1 == 2) {
               var0 = fishing4.a.z.a(5);
               if (var0 == 0) {
                  var0 = 10;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 13;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 15;
                  return var0;
               } else {
                  if (var0 == 3) {
                     var0 = 17;
                  } else {
                     var0 = 18;
                  }

                  return var0;
               }
            }

            if (var1 == 3) {
               var0 = fishing4.a.z.a(11);
               if (var0 == 0) {
                  var0 = 21;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 22;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 24;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 30;
                  return var0;
               } else if (var0 == 4) {
                  var0 = 32;
                  return var0;
               } else if (var0 == 5) {
                  var0 = 33;
                  return var0;
               } else if (var0 == 6) {
                  var0 = 36;
                  return var0;
               } else if (var0 == 7) {
                  var0 = 40;
                  return var0;
               } else if (var0 == 8) {
                  var0 = 42;
                  return var0;
               } else {
                  if (var0 == 9) {
                     var0 = 45;
                  } else {
                     var0 = 47;
                  }

                  return var0;
               }
            }

            if (var1 == 4) {
               var0 = fishing4.a.z.a(12);
               if (var0 == 0) {
                  var0 = 51;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 53;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 56;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 57;
                  return var0;
               } else if (var0 == 4) {
                  var0 = 60;
                  return var0;
               } else if (var0 == 5) {
                  var0 = 63;
                  return var0;
               } else if (var0 == 6) {
                  var0 = 69;
                  return var0;
               } else if (var0 == 7) {
                  var0 = 71;
                  return var0;
               } else if (var0 == 8) {
                  var0 = 74;
                  return var0;
               } else if (var0 == 9) {
                  var0 = 75;
                  return var0;
               } else {
                  if (var0 == 10) {
                     var0 = 81;
                  } else {
                     var0 = 82;
                  }

                  return var0;
               }
            }

            if (var1 == 5) {
               var0 = fishing4.a.z.a(12);
               if (var0 == 0) {
                  var0 = 86;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 89;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 93;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 95;
                  return var0;
               } else if (var0 == 4) {
                  var0 = 97;
                  return var0;
               } else if (var0 == 5) {
                  var0 = 100;
                  return var0;
               } else if (var0 == 6) {
                  var0 = 102;
                  return var0;
               } else if (var0 == 7) {
                  var0 = 104;
                  return var0;
               } else if (var0 == 8) {
                  var0 = 108;
                  return var0;
               } else if (var0 == 9) {
                  var0 = 111;
                  return var0;
               } else {
                  if (var0 == 10) {
                     var0 = 113;
                  } else {
                     var0 = 115;
                  }

                  return var0;
               }
            }

            if (var1 == 6) {
               var0 = fishing4.a.z.a(4);
               if (var0 == 0) {
                  var0 = 121;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 124;
                  return var0;
               } else {
                  if (var0 == 2) {
                     var0 = 126;
                  } else {
                     var0 = 129;
                  }

                  return var0;
               }
            }

            if (var1 == 7) {
               if (fishing4.a.z.a(2) == 0) {
                  var0 = 134;
               } else {
                  var0 = 136;
               }

               return var0;
            }

            if (var1 == 8) {
               var0 = 139;
               return var0;
            }
            break;
         case 5:
            if (var1 == 1) {
               var1 = fishing4.a.z.a(4);
               var0 = var2;
               if (var1 != 0) {
                  if (var1 == 1) {
                     var0 = 3;
                     return var0;
                  } else {
                     if (var1 == 2) {
                        var0 = 6;
                     } else {
                        var0 = 8;
                     }

                     return var0;
                  }
               }

               return var0;
            }

            if (var1 == 2) {
               var0 = fishing4.a.z.a(6);
               if (var0 == 0) {
                  var0 = 10;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 12;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 13;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 16;
                  return var0;
               } else {
                  if (var0 == 4) {
                     var0 = 17;
                  } else {
                     var0 = 19;
                  }

                  return var0;
               }
            }

            if (var1 == 3) {
               var0 = fishing4.a.z.a(10);
               if (var0 == 0) {
                  var0 = 22;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 26;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 30;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 34;
                  return var0;
               } else if (var0 == 4) {
                  var0 = 38;
                  return var0;
               } else if (var0 == 5) {
                  var0 = 41;
                  return var0;
               } else if (var0 == 6) {
                  var0 = 43;
                  return var0;
               } else if (var0 == 7) {
                  var0 = 45;
                  return var0;
               } else {
                  if (var0 == 8) {
                     var0 = 46;
                  } else {
                     var0 = 48;
                  }

                  return var0;
               }
            }

            if (var1 == 4) {
               var0 = fishing4.a.z.a(13);
               if (var0 == 0) {
                  var0 = 52;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 57;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 59;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 60;
                  return var0;
               } else if (var0 == 4) {
                  var0 = 61;
                  return var0;
               } else if (var0 == 5) {
                  var0 = 62;
                  return var0;
               } else if (var0 == 6) {
                  var0 = 64;
                  return var0;
               } else if (var0 == 7) {
                  var0 = 66;
                  return var0;
               } else if (var0 == 8) {
                  var0 = 67;
                  return var0;
               } else if (var0 == 9) {
                  var0 = 73;
                  return var0;
               } else if (var0 == 10) {
                  var0 = 75;
                  return var0;
               } else {
                  if (var0 == 11) {
                     var0 = 78;
                  } else {
                     var0 = 79;
                  }

                  return var0;
               }
            }

            if (var1 == 5) {
               var0 = fishing4.a.z.a(12);
               if (var0 == 0) {
                  var0 = 83;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 87;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 88;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 89;
                  return var0;
               } else if (var0 == 4) {
                  var0 = 91;
                  return var0;
               } else if (var0 == 5) {
                  var0 = 95;
                  return var0;
               } else if (var0 == 6) {
                  var0 = 99;
                  return var0;
               } else if (var0 == 7) {
                  var0 = 103;
                  return var0;
               } else if (var0 == 8) {
                  var0 = 107;
                  return var0;
               } else if (var0 == 9) {
                  var0 = 109;
                  return var0;
               } else {
                  if (var0 == 10) {
                     var0 = 112;
                  } else {
                     var0 = 114;
                  }

                  return var0;
               }
            }

            if (var1 == 6) {
               var0 = fishing4.a.z.a(5);
               if (var0 == 0) {
                  var0 = 116;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 118;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 120;
                  return var0;
               } else {
                  if (var0 == 3) {
                     var0 = 127;
                  } else {
                     var0 = 128;
                  }

                  return var0;
               }
            }

            if (var1 == 7) {
               if (fishing4.a.z.a(2) == 0) {
                  var0 = 132;
               } else {
                  var0 = 137;
               }

               return var0;
            }

            if (var1 == 8) {
               var0 = 140;
               return var0;
            }
            break;
         case 6:
            if (var1 == 1) {
               var0 = fishing4.a.z.a(4);
               if (var0 == 0) {
                  var0 = 0;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 2;
                  return var0;
               } else {
                  if (var0 == 2) {
                     var0 = 5;
                  } else {
                     var0 = 7;
                  }

                  return var0;
               }
            }

            if (var1 == 2) {
               var0 = fishing4.a.z.a(6);
               if (var0 == 0) {
                  var0 = 9;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 11;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 14;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 17;
                  return var0;
               } else {
                  if (var0 == 4) {
                     var0 = 18;
                  } else {
                     var0 = 20;
                  }

                  return var0;
               }
            }

            if (var1 == 3) {
               var0 = fishing4.a.z.a(9);
               if (var0 == 0) {
                  var0 = 21;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 23;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 25;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 27;
                  return var0;
               } else if (var0 == 4) {
                  var0 = 31;
                  return var0;
               } else if (var0 == 5) {
                  var0 = 37;
                  return var0;
               } else if (var0 == 6) {
                  var0 = 39;
                  return var0;
               } else {
                  if (var0 == 7) {
                     var0 = 40;
                  } else {
                     var0 = 47;
                  }

                  return var0;
               }
            }

            if (var1 == 4) {
               var0 = fishing4.a.z.a(12);
               if (var0 == 0) {
                  var0 = 51;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 53;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 55;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 58;
                  return var0;
               } else if (var0 == 4) {
                  var0 = 61;
                  return var0;
               } else if (var0 == 5) {
                  var0 = 66;
                  return var0;
               } else if (var0 == 6) {
                  var0 = 70;
                  return var0;
               } else if (var0 == 7) {
                  var0 = 72;
                  return var0;
               } else if (var0 == 8) {
                  var0 = 76;
                  return var0;
               } else if (var0 == 9) {
                  var0 = 77;
                  return var0;
               } else {
                  if (var0 == 10) {
                     var0 = 80;
                  } else {
                     var0 = 81;
                  }

                  return var0;
               }
            }

            if (var1 == 5) {
               var0 = fishing4.a.z.a(12);
               if (var0 == 0) {
                  var0 = 85;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 88;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 90;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 92;
                  return var0;
               } else if (var0 == 4) {
                  var0 = 96;
                  return var0;
               } else if (var0 == 5) {
                  var0 = 98;
                  return var0;
               } else if (var0 == 6) {
                  var0 = 101;
                  return var0;
               } else if (var0 == 7) {
                  var0 = 102;
                  return var0;
               } else if (var0 == 8) {
                  var0 = 107;
                  return var0;
               } else if (var0 == 9) {
                  var0 = 110;
                  return var0;
               } else {
                  if (var0 == 10) {
                     var0 = 111;
                  } else {
                     var0 = 115;
                  }

                  return var0;
               }
            }

            if (var1 == 6) {
               var0 = fishing4.a.z.a(4);
               if (var0 == 0) {
                  var0 = 119;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 123;
                  return var0;
               } else {
                  if (var0 == 2) {
                     var0 = 125;
                  } else {
                     var0 = 129;
                  }

                  return var0;
               }
            }

            if (var1 == 7) {
               if (fishing4.a.z.a(2) == 0) {
                  var0 = 131;
               } else {
                  var0 = 133;
               }

               return var0;
            }

            if (var1 == 8) {
               var0 = 138;
               return var0;
            }
            break;
         case 7:
            if (var1 == 1) {
               var1 = fishing4.a.z.a(4);
               var0 = var2;
               if (var1 != 0) {
                  if (var1 == 1) {
                     var0 = 3;
                     return var0;
                  } else {
                     if (var1 == 2) {
                        var0 = 4;
                     } else {
                        var0 = 6;
                     }

                     return var0;
                  }
               }

               return var0;
            }

            if (var1 == 2) {
               var0 = fishing4.a.z.a(6);
               if (var0 == 0) {
                  var0 = 9;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 12;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 13;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 15;
                  return var0;
               } else {
                  if (var0 == 4) {
                     var0 = 18;
                  } else {
                     var0 = 20;
                  }

                  return var0;
               }
            }

            if (var1 == 3) {
               var0 = fishing4.a.z.a(11);
               if (var0 == 0) {
                  var0 = 23;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 26;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 28;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 34;
                  return var0;
               } else if (var0 == 4) {
                  var0 = 35;
                  return var0;
               } else if (var0 == 5) {
                  var0 = 36;
                  return var0;
               } else if (var0 == 6) {
                  var0 = 38;
                  return var0;
               } else if (var0 == 7) {
                  var0 = 42;
                  return var0;
               } else if (var0 == 8) {
                  var0 = 44;
                  return var0;
               } else {
                  if (var0 == 9) {
                     var0 = 48;
                  } else {
                     var0 = 49;
                  }

                  return var0;
               }
            }

            if (var1 == 4) {
               var0 = fishing4.a.z.a(11);
               if (var0 == 0) {
                  var0 = 50;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 54;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 56;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 64;
                  return var0;
               } else if (var0 == 4) {
                  var0 = 67;
                  return var0;
               } else if (var0 == 5) {
                  var0 = 68;
                  return var0;
               } else if (var0 == 6) {
                  var0 = 70;
                  return var0;
               } else if (var0 == 7) {
                  var0 = 71;
                  return var0;
               } else if (var0 == 8) {
                  var0 = 72;
                  return var0;
               } else {
                  if (var0 == 9) {
                     var0 = 78;
                  } else {
                     var0 = 79;
                  }

                  return var0;
               }
            }

            if (var1 == 5) {
               var0 = fishing4.a.z.a(12);
               if (var0 == 0) {
                  var0 = 84;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 86;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 88;
                  return var0;
               } else if (var0 == 3) {
                  var0 = 91;
                  return var0;
               } else if (var0 == 4) {
                  var0 = 93;
                  return var0;
               } else if (var0 == 5) {
                  var0 = 96;
                  return var0;
               } else if (var0 == 6) {
                  var0 = 99;
                  return var0;
               } else if (var0 == 7) {
                  var0 = 105;
                  return var0;
               } else if (var0 == 8) {
                  var0 = 108;
                  return var0;
               } else if (var0 == 9) {
                  var0 = 109;
                  return var0;
               } else {
                  if (var0 == 10) {
                     var0 = 112;
                  } else {
                     var0 = 115;
                  }

                  return var0;
               }
            }

            if (var1 == 6) {
               var0 = fishing4.a.z.a(5);
               if (var0 == 0) {
                  var0 = 117;
                  return var0;
               } else if (var0 == 1) {
                  var0 = 118;
                  return var0;
               } else if (var0 == 2) {
                  var0 = 121;
                  return var0;
               } else {
                  if (var0 == 3) {
                     var0 = 123;
                  } else {
                     var0 = 124;
                  }

                  return var0;
               }
            }

            if (var1 == 7) {
               var0 = fishing4.a.z.a(3);
               if (var0 == 0) {
                  var0 = 132;
                  return var0;
               } else {
                  if (var0 == 1) {
                     var0 = 134;
                  } else {
                     var0 = 135;
                  }

                  return var0;
               }
            }

            if (var1 == 8) {
               if (fishing4.a.z.a(2) == 0) {
                  var0 = 141;
               } else {
                  var0 = 143;
               }

               return var0;
            }
         case 8:
         case 9:
         default:
            break;
         case 10:
            if (fishing4.a.z.a(2) == 0) {
               if (var1 == 1) {
                  var0 = fishing4.a.z.a(9);
                  return var0;
               }

               if (var1 == 2) {
                  var0 = fishing4.a.z.a(9, 20);
                  return var0;
               }

               if (var1 == 3) {
                  var0 = fishing4.a.z.a(21, 49);
                  return var0;
               }

               if (var1 == 4) {
                  var0 = fishing4.a.z.a(50, 82);
                  return var0;
               }

               if (var1 == 5) {
                  var0 = fishing4.a.z.a(83, 115);
                  return var0;
               }

               if (var1 == 6) {
                  var0 = fishing4.a.z.a(116, 129);
                  return var0;
               }

               if (var1 == 7) {
                  var0 = fishing4.a.z.a(130, 137);
                  return var0;
               }

               if (var1 == 8) {
                  var0 = fishing4.a.z.a(138, 143);
                  return var0;
               }
            } else {
               if (var1 == 1) {
                  var0 = fishing4.a.z.a(144, 148);
                  return var0;
               }

               if (var1 == 2) {
                  var0 = fishing4.a.z.a(149, 153);
                  return var0;
               }

               if (var1 == 3) {
                  var0 = fishing4.a.z.a(154, 162);
                  return var0;
               }

               if (var1 == 4) {
                  var0 = fishing4.a.z.a(163, 172);
                  return var0;
               }

               if (var1 == 5) {
                  var0 = fishing4.a.z.a(173, 179);
                  return var0;
               }

               if (var1 == 6) {
                  var0 = fishing4.a.z.a(180, 183);
                  return var0;
               }

               if (var1 == 7) {
                  var0 = fishing4.a.z.a(184, 185);
                  return var0;
               }

               if (var1 == 8) {
                  var0 = 186;
                  return var0;
               }
            }

            var0 = fishing4.a.z.a(187);
            return var0;
      }

      var0 = 0;
      return var0;
   }

   public static void b(GL10 var0) {
      a(var0);
      h = fishing4.a.w.a(var0, "img/fish/goldfish.png");
      i = fishing4.a.w.a(var0, "img/fish/goldfish.png");
   }

   public static void b(GL10 var0, float var1, float var2, int var3) {
      if (h == null) {
         h = fishing4.a.w.a(var0, "img/fish/bonus.png");
      }

      if (i == null) {
         i = fishing4.a.w.a(var0, "img/fish/goldfish.png");
      }

      a(var0, var1, 31.0F + var2, var3);
      var3 /= 4;
      d(var0, var1 - 60.0F, var2, var3 % 20);
      d(var0, 55.0F + var1, var2, (var3 + 4) % 20);
      d(var0, var1 - 75.0F, var2, (var3 + 8) % 20);
      d(var0, 65.0F + var1, var2, (var3 + 12) % 20);
      d(var0, var1 - 70.0F, var2, (var3 + 16) % 20);
      c(var0, var1 - 160.0F, 35.0F + var2, var3 % 33);
      c(var0, var1 + 60.0F, var2 - 45.0F, var3 % 30);
      c(var0, var1 - 80.0F, var2 - 30.0F, var3 % 40);
      c(var0, 170.0F + var1, 50.0F + var2, var3 % 35);
   }

   public static boolean b(int var0) {
      boolean var1;
      if (var0 >= 144 && var0 <= 186) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public static int c(float var0, int var1) {
      int var2;
      int var3;
      int var4;
      int var5;
      int var6;
      int var7;
      int var8;
      if (var0 >= 241.0F) {
         var6 = ac.c(var1, 7);
         var5 = ac.c(var1, 6);
         var4 = ac.c(var1, 5);
         var3 = ac.c(var1, 4);
         var2 = ac.c(var1, 3);
         var8 = ac.c(var1, 2);
         var7 = ac.c(var1, 1);
         var1 = var8;
      } else {
         int var9;
         if (var0 >= 211.0F) {
            var6 = ac.c(var1, 8);
            var9 = ac.c(var1, 7);
            var5 = ac.c(var1, 6);
            var4 = ac.c(var1, 5);
            var3 = ac.c(var1, 4);
            var2 = ac.c(var1, 3);
            var8 = ac.c(var1, 2);
            var7 = ac.c(var1, 1);
            var6 += var9;
            var1 = var8;
         } else if (var0 >= 181.0F) {
            var9 = ac.c(var1, 8);
            var6 = ac.c(var1, 7);
            var5 = ac.c(var1, 6);
            var4 = ac.c(var1, 5);
            var3 = ac.c(var1, 4);
            var2 = ac.c(var1, 3);
            var8 = ac.c(var1, 2);
            var7 = ac.c(var1, 1);
            var5 = var9 + var6 + var5;
            var6 = 0;
            var1 = var8;
         } else if (var0 >= 141.0F) {
            var9 = ac.c(var1, 8);
            var8 = ac.c(var1, 7);
            var5 = ac.c(var1, 6);
            var6 = ac.c(var1, 5);
            var3 = ac.c(var1, 4);
            var2 = ac.c(var1, 3);
            var4 = ac.c(var1, 2);
            var7 = ac.c(var1, 1);
            var8 = var9 + var8 + var5 + var6;
            var5 = 0;
            var6 = 0;
            var1 = var4;
            var4 = var8;
         } else if (var0 >= 121.0F) {
            var9 = ac.c(var1, 8);
            var4 = ac.c(var1, 7);
            var6 = ac.c(var1, 6);
            var5 = ac.c(var1, 5);
            var8 = ac.c(var1, 4);
            var2 = ac.c(var1, 3);
            var3 = ac.c(var1, 2);
            var7 = ac.c(var1, 1);
            var8 = var9 + var4 + var6 + var5 + var8;
            var4 = 0;
            var6 = 0;
            var5 = 0;
            var1 = var3;
            var3 = var8;
         } else if (var0 >= 81.0F) {
            var3 = ac.c(var1, 8);
            var6 = ac.c(var1, 7);
            var5 = ac.c(var1, 6);
            var4 = ac.c(var1, 5);
            var9 = ac.c(var1, 4);
            var8 = ac.c(var1, 3);
            var2 = ac.c(var1, 2);
            var7 = ac.c(var1, 1);
            var8 = var3 + var6 + var5 + var4 + var9 + var8;
            var3 = 0;
            var5 = 0;
            var6 = 0;
            var4 = 0;
            var1 = var2;
            var2 = var8;
         } else if (var0 >= 51.0F) {
            var8 = ac.c(var1, 8);
            var6 = ac.c(var1, 7);
            var9 = ac.c(var1, 6);
            var5 = ac.c(var1, 5);
            var4 = ac.c(var1, 4);
            var2 = ac.c(var1, 3);
            var3 = ac.c(var1, 2);
            var7 = ac.c(var1, 1);
            var1 = var8 + var6 + var9 + var5 + var4 + var2 + var3;
            var2 = 0;
            var4 = 0;
            var5 = 0;
            var6 = 0;
            var3 = 0;
         } else {
            var1 = 0;
            var3 = 0;
            var4 = 0;
            var5 = 0;
            var6 = 0;
            var7 = 100;
            var2 = 0;
         }
      }

      var8 = fishing4.a.z.a(100);
      if (var8 < var7) {
         var1 = b(aw.f, 1);
      } else if (var8 < var7 + var1) {
         var1 = b(aw.f, 2);
      } else if (var8 < var7 + var1 + var2) {
         var1 = b(aw.f, 3);
      } else if (var8 < var7 + var1 + var2) {
         var1 = b(aw.f, 3);
      } else if (var8 < var7 + var1 + var2 + var3) {
         var1 = b(aw.f, 4);
      } else if (var8 < var7 + var1 + var2 + var3 + var4) {
         var1 = b(aw.f, 5);
      } else if (var8 < var7 + var1 + var2 + var3 + var4 + var5) {
         var1 = b(aw.f, 6);
      } else if (var8 < var1 + var7 + var2 + var3 + var4 + var5 + var6) {
         var1 = b(aw.f, 7);
      } else {
         var1 = b(aw.f, 8);
      }

      return var1;
   }

   public static String c(int var0) {
      return fishing4.a.s.a().getString(2131165434 + var0);
   }

   private static void c(GL10 var0, float var1, float var2, int var3) {
      switch (var3) {
         case 0:
            fishing4.a.m.a(var0, i, var1, var2, 704.0F, 482.0F, 116.0F, 120.0F, '\u0005');
            break;
         case 1:
            fishing4.a.m.a(var0, i, var1, var2, 822.0F, 482.0F, 116.0F, 120.0F, '\u0005');
            break;
         case 2:
            fishing4.a.m.a(var0, i, var1, var2, 704.0F, 602.0F, 116.0F, 120.0F, '\u0005');
            break;
         case 3:
            fishing4.a.m.a(var0, i, var1, var2, 822.0F, 602.0F, 116.0F, 120.0F, '\u0005');
            break;
         case 4:
            fishing4.a.m.a(var0, i, var1, var2, 822.0F, 602.0F, 116.0F, 120.0F, '\u0005', 100);
      }

   }

   public static int d(int var0) {
      byte var1;
      if ((var0 < 138 || var0 > 143) && var0 != 186) {
         if (var0 >= 130 && var0 <= 137 || var0 >= 184 && var0 <= 185) {
            var1 = 7;
         } else if ((var0 < 116 || var0 > 129) && (var0 < 180 || var0 > 183)) {
            if (var0 >= 83 && var0 <= 115 || var0 >= 173 && var0 <= 179) {
               var1 = 5;
            } else if ((var0 < 50 || var0 > 82) && (var0 < 163 || var0 > 172)) {
               if (var0 >= 21 && var0 <= 49 || var0 >= 154 && var0 <= 162) {
                  var1 = 3;
               } else if ((var0 < 9 || var0 > 20) && (var0 < 149 || var0 > 153)) {
                  var1 = 1;
               } else {
                  var1 = 2;
               }
            } else {
               var1 = 4;
            }
         } else {
            var1 = 6;
         }
      } else {
         var1 = 8;
      }

      return var1;
   }

   private static void d(GL10 var0, float var1, float var2, int var3) {
      switch (var3) {
         case 0:
            fishing4.a.m.a(var0, i, var1, var2, 382.0F, 0.0F, 320.0F, 240.0F, '\u0005');
            break;
         case 1:
            fishing4.a.m.a(var0, i, var1, var2, 704.0F, 0.0F, 320.0F, 240.0F, '\u0005', 200);
            break;
         case 2:
            fishing4.a.m.a(var0, i, var1, var2, 382.0F, 241.0F, 320.0F, 240.0F, '\u0005', 150);
            break;
         case 3:
            fishing4.a.m.a(var0, i, var1, var2, 704.0F, 241.0F, 320.0F, 240.0F, '\u0005', 100);
            break;
         case 4:
            fishing4.a.m.a(var0, i, var1, var2, 382.0F, 482.0F, 320.0F, 240.0F, '\u0005', 50);
      }

   }

   public static String e(int var0) {
      // $FF: Couldn't be decompiled
   }

   public static int f(int var0) {
      byte var1 = 6;
      if (var0 == 8) {
         var1 = 8;
      } else if (var0 == 7) {
         var1 = 7;
      } else if (var0 != 6) {
         if (var0 == 5) {
            var1 = 5;
         } else if (var0 == 4) {
            var1 = 4;
         } else if (var0 == 3) {
            var1 = 3;
         } else if (var0 == 2) {
            var1 = 2;
         } else {
            var1 = 1;
         }
      }

      return var1;
   }

   public static int g(int var0) {
      short var1;
      if (var0 == 8) {
         var1 = 700;
      } else if (var0 == 7) {
         var1 = 600;
      } else if (var0 == 6) {
         var1 = 500;
      } else if (var0 == 5) {
         var1 = 300;
      } else if (var0 == 4) {
         var1 = 200;
      } else if (var0 == 3) {
         var1 = 100;
      } else if (var0 == 2) {
         var1 = 40;
      } else {
         var1 = 10;
      }

      return var1;
   }

   public static int h(int var0) {
      short var1;
      if (var0 == 8) {
         var1 = 700;
      } else if (var0 == 7) {
         var1 = 600;
      } else if (var0 == 6) {
         var1 = 500;
      } else if (var0 == 5) {
         var1 = 300;
      } else if (var0 == 4) {
         var1 = 200;
      } else if (var0 == 3) {
         var1 = 100;
      } else if (var0 == 2) {
         var1 = 40;
      } else {
         var1 = 10;
      }

      return var1;
   }

   public static String i(int var0) {
      n var1;
      switch (var0) {
         case 0:
            var1 = new n(true, false, false, true, false, false, false, false);
            break;
         case 1:
            var1 = new n(true, false, true, false, true, false, false, false);
            break;
         case 2:
            var1 = new n(false, true, false, true, false, false, false, false);
            break;
         case 3:
            var1 = new n(false, false, true, false, true, false, false, false);
            break;
         case 4:
            var1 = new n(false, true, false, false, true, false, false, false);
            break;
         case 5:
            var1 = new n(false, true, false, true, false, false, false, false);
            break;
         case 6:
            var1 = new n(true, false, true, false, true, false, false, false);
            break;
         case 7:
            var1 = new n(false, true, false, true, false, false, false, false);
            break;
         case 8:
            var1 = new n(true, false, true, false, false, false, false, false);
            break;
         case 9:
            var1 = new n(true, false, false, true, true, false, false, false);
            break;
         case 10:
            var1 = new n(false, true, true, false, false, false, false, false);
            break;
         case 11:
            var1 = new n(true, false, false, true, false, false, false, false);
            break;
         case 12:
            var1 = new n(false, false, true, false, true, false, false, false);
            break;
         case 13:
            var1 = new n(false, true, true, false, true, false, false, false);
            break;
         case 14:
            var1 = new n(true, false, false, true, false, false, false, false);
            break;
         case 15:
            var1 = new n(false, true, false, false, true, false, false, false);
            break;
         case 16:
            var1 = new n(true, false, true, false, false, false, false, false);
            break;
         case 17:
            var1 = new n(false, true, true, true, false, false, false, false);
            break;
         case 18:
            var1 = new n(false, true, false, true, true, false, false, false);
            break;
         case 19:
            var1 = new n(true, false, true, false, false, false, false, false);
            break;
         case 20:
            var1 = new n(false, false, false, true, true, false, false, false);
            break;
         case 21:
            var1 = new n(false, true, false, true, false, false, false, false);
            break;
         case 22:
            var1 = new n(false, true, true, false, false, false, false, false);
            break;
         case 23:
            var1 = new n(false, false, false, false, true, false, false, false);
            break;
         case 24:
            var1 = new n(true, true, false, false, false, false, false, false);
            break;
         case 25:
            var1 = new n(true, false, false, true, false, false, false, false);
            break;
         case 26:
            var1 = new n(false, false, true, false, true, false, false, false);
            break;
         case 27:
            var1 = new n(true, false, false, true, false, false, false, false);
            break;
         case 28:
            var1 = new n(true, false, false, false, true, false, false, false);
            break;
         case 29:
            var1 = new n(true, false, false, false, false, false, false, false);
            break;
         case 30:
            var1 = new n(false, true, true, false, false, false, false, false);
            break;
         case 31:
            var1 = new n(false, false, false, true, false, false, false, false);
            break;
         case 32:
            var1 = new n(false, true, false, false, false, false, false, false);
            break;
         case 33:
            var1 = new n(false, true, false, false, false, false, false, false);
            break;
         case 34:
            var1 = new n(false, false, true, false, true, false, false, false);
            break;
         case 35:
            var1 = new n(true, false, false, false, true, false, false, false);
            break;
         case 36:
            var1 = new n(false, true, false, false, true, false, false, false);
            break;
         case 37:
            var1 = new n(false, false, false, true, false, false, false, false);
            break;
         case 38:
            var1 = new n(false, false, true, false, true, false, false, false);
            break;
         case 39:
            var1 = new n(true, true, false, false, false, false, false, false);
            break;
         case 40:
            var1 = new n(false, true, false, true, false, false, false, false);
            break;
         case 41:
            var1 = new n(true, false, true, false, false, false, false, false);
            break;
         case 42:
            var1 = new n(false, true, false, false, true, false, false, false);
            break;
         case 43:
            var1 = new n(false, false, true, false, false, false, false, false);
            break;
         case 44:
            var1 = new n(true, false, false, false, true, false, false, false);
            break;
         case 45:
            var1 = new n(false, true, true, false, false, false, false, false);
            break;
         case 46:
            var1 = new n(true, false, true, false, false, false, false, false);
            break;
         case 47:
            var1 = new n(false, true, false, true, false, false, false, false);
            break;
         case 48:
            var1 = new n(false, false, true, false, true, false, false, false);
            break;
         case 49:
            var1 = new n(false, false, false, false, true, false, false, false);
            break;
         case 50:
            var1 = new n(true, false, false, false, true, false, false, false);
            break;
         case 51:
            var1 = new n(false, true, false, true, false, false, false, false);
            break;
         case 52:
            var1 = new n(true, false, true, false, false, false, false, false);
            break;
         case 53:
            var1 = new n(false, true, false, true, false, false, false, false);
            break;
         case 54:
            var1 = new n(false, false, false, false, true, false, false, false);
            break;
         case 55:
            var1 = new n(true, false, false, true, false, false, false, false);
            break;
         case 56:
            var1 = new n(false, true, false, false, true, false, false, false);
            break;
         case 57:
            var1 = new n(false, true, true, false, false, false, false, false);
            break;
         case 58:
            var1 = new n(true, false, false, true, false, false, false, false);
            break;
         case 59:
            var1 = new n(true, false, true, false, false, false, false, false);
            break;
         case 60:
            var1 = new n(false, true, true, false, false, false, false, false);
            break;
         case 61:
            var1 = new n(false, false, true, true, false, false, false, false);
            break;
         case 62:
            var1 = new n(false, false, true, false, false, false, false, false);
            break;
         case 63:
            var1 = new n(true, true, false, false, false, false, false, false);
            break;
         case 64:
            var1 = new n(false, false, true, false, true, false, false, false);
            break;
         case 65:
            var1 = new n(true, false, false, false, false, false, false, false);
            break;
         case 66:
            var1 = new n(false, false, true, true, false, false, false, false);
            break;
         case 67:
            var1 = new n(false, false, true, false, true, false, false, false);
            break;
         case 68:
            var1 = new n(true, false, false, false, true, false, false, false);
            break;
         case 69:
            var1 = new n(true, true, false, false, false, false, false, false);
            break;
         case 70:
            var1 = new n(false, false, false, true, true, false, false, false);
            break;
         case 71:
            var1 = new n(false, true, false, false, true, false, false, false);
            break;
         case 72:
            var1 = new n(false, false, false, true, true, false, false, false);
            break;
         case 73:
            var1 = new n(true, false, true, false, false, false, false, false);
            break;
         case 74:
            var1 = new n(false, true, false, false, false, false, false, false);
            break;
         case 75:
            var1 = new n(false, true, true, false, false, false, false, false);
            break;
         case 76:
            var1 = new n(true, false, false, true, false, false, false, false);
            break;
         case 77:
            var1 = new n(true, false, false, true, false, false, false, false);
            break;
         case 78:
            var1 = new n(false, false, true, false, true, false, false, false);
            break;
         case 79:
            var1 = new n(false, false, true, false, true, false, false, false);
            break;
         case 80:
            var1 = new n(false, false, false, true, false, false, false, false);
            break;
         case 81:
            var1 = new n(false, true, false, true, false, false, false, false);
            break;
         case 82:
            var1 = new n(true, true, false, false, false, false, false, false);
            break;
         case 83:
            var1 = new n(true, false, true, false, false, false, false, false);
            break;
         case 84:
            var1 = new n(false, false, false, false, true, false, false, false);
            break;
         case 85:
            var1 = new n(false, false, false, true, false, false, false, false);
            break;
         case 86:
            var1 = new n(false, true, false, false, true, false, false, false);
            break;
         case 87:
            var1 = new n(false, false, true, false, false, false, false, false);
            break;
         case 88:
            var1 = new n(false, false, true, true, true, false, false, false);
            break;
         case 89:
            var1 = new n(false, true, true, false, false, false, false, false);
            break;
         case 90:
            var1 = new n(true, false, false, true, false, false, false, false);
            break;
         case 91:
            var1 = new n(false, false, true, false, true, false, false, false);
            break;
         case 92:
            var1 = new n(true, false, false, true, false, false, false, false);
            break;
         case 93:
            var1 = new n(false, true, false, false, true, false, false, false);
            break;
         case 94:
            var1 = new n(true, false, false, false, false, false, false, false);
            break;
         case 95:
            var1 = new n(false, true, true, false, false, false, false, false);
            break;
         case 96:
            var1 = new n(true, false, false, true, true, false, false, false);
            break;
         case 97:
            var1 = new n(false, true, false, false, false, false, false, false);
            break;
         case 98:
            var1 = new n(true, false, false, true, false, false, false, false);
            break;
         case 99:
            var1 = new n(false, false, true, false, true, false, false, false);
            break;
         case 100:
            var1 = new n(true, true, false, false, false, false, false, false);
            break;
         case 101:
            var1 = new n(false, false, false, true, false, false, false, false);
            break;
         case 102:
            var1 = new n(false, true, false, true, false, false, false, false);
            break;
         case 103:
            var1 = new n(false, false, true, false, false, false, false, false);
            break;
         case 104:
            var1 = new n(true, true, false, false, false, false, false, false);
            break;
         case 105:
            var1 = new n(false, false, false, false, true, false, false, false);
            break;
         case 106:
            var1 = new n(true, false, false, false, false, false, false, false);
            break;
         case 107:
            var1 = new n(false, false, true, true, false, false, false, false);
            break;
         case 108:
            var1 = new n(true, true, false, false, true, false, false, false);
            break;
         case 109:
            var1 = new n(false, false, true, false, true, false, false, false);
            break;
         case 110:
            var1 = new n(true, false, false, true, false, false, false, false);
            break;
         case 111:
            var1 = new n(false, true, false, true, false, false, false, false);
            break;
         case 112:
            var1 = new n(false, false, true, false, true, false, false, false);
            break;
         case 113:
            var1 = new n(false, true, false, false, false, false, false, false);
            break;
         case 114:
            var1 = new n(true, false, true, false, false, false, false, false);
            break;
         case 115:
            var1 = new n(false, true, false, true, true, false, false, false);
            break;
         case 116:
            var1 = new n(true, false, true, false, false, false, false, false);
            break;
         case 117:
            var1 = new n(false, false, false, false, true, false, false, false);
            break;
         case 118:
            var1 = new n(false, false, true, false, true, false, false, false);
            break;
         case 119:
            var1 = new n(true, false, false, true, false, false, false, false);
            break;
         case 120:
            var1 = new n(true, false, true, false, false, false, false, false);
            break;
         case 121:
            var1 = new n(false, true, false, false, true, false, false, false);
            break;
         case 122:
            var1 = new n(true, false, false, false, false, false, false, false);
            break;
         case 123:
            var1 = new n(false, false, false, true, true, false, false, false);
            break;
         case 124:
            var1 = new n(false, true, false, false, true, false, false, false);
            break;
         case 125:
            var1 = new n(false, false, false, true, false, false, false, false);
            break;
         case 126:
            var1 = new n(false, true, false, false, false, false, false, false);
            break;
         case 127:
            var1 = new n(true, false, true, false, false, false, false, false);
            break;
         case 128:
            var1 = new n(false, false, true, false, false, false, false, false);
            break;
         case 129:
            var1 = new n(false, true, false, true, false, false, false, false);
            break;
         case 130:
            var1 = new n(true, false, false, false, false, false, false, false);
            break;
         case 131:
            var1 = new n(true, false, false, true, false, false, false, false);
            break;
         case 132:
            var1 = new n(false, false, true, false, true, false, false, false);
            break;
         case 133:
            var1 = new n(false, false, false, true, false, false, false, false);
            break;
         case 134:
            var1 = new n(false, true, false, false, true, false, false, false);
            break;
         case 135:
            var1 = new n(false, false, false, false, true, false, false, false);
            break;
         case 136:
            var1 = new n(false, true, false, false, false, false, false, false);
            break;
         case 137:
            var1 = new n(false, false, true, false, false, false, false, false);
            break;
         case 138:
            var1 = new n(false, false, false, true, false, false, false, false);
            break;
         case 139:
            var1 = new n(false, true, false, false, false, false, false, false);
            break;
         case 140:
            var1 = new n(false, false, true, false, false, false, false, false);
            break;
         case 141:
            var1 = new n(false, false, false, false, true, false, false, false);
            break;
         case 142:
            var1 = new n(true, false, false, false, false, false, false, false);
            break;
         case 143:
            var1 = new n(false, false, false, false, true, false, false, false);
            break;
         case 144:
            var1 = new n(false, false, false, false, false, true, true, false);
            break;
         case 145:
            var1 = new n(false, false, false, false, false, true, false, true);
            break;
         case 146:
            var1 = new n(false, false, false, false, false, false, true, true);
            break;
         case 147:
            var1 = new n(false, false, false, false, false, true, false, true);
            break;
         case 148:
            var1 = new n(false, false, false, false, false, false, true, true);
            break;
         case 149:
            var1 = new n(false, false, false, false, false, false, true, true);
            break;
         case 150:
            var1 = new n(false, false, false, false, false, true, false, true);
            break;
         case 151:
            var1 = new n(false, false, false, false, false, true, true, false);
            break;
         case 152:
            var1 = new n(false, false, false, false, false, true, true, false);
            break;
         case 153:
            var1 = new n(false, false, false, false, false, false, true, true);
            break;
         case 154:
            var1 = new n(false, false, false, false, false, true, false, true);
            break;
         case 155:
            var1 = new n(false, false, false, false, false, true, true, false);
            break;
         case 156:
            var1 = new n(false, false, false, false, false, false, true, true);
            break;
         case 157:
            var1 = new n(false, false, false, false, false, true, false, true);
            break;
         case 158:
            var1 = new n(false, false, false, false, false, false, true, true);
            break;
         case 159:
            var1 = new n(false, false, false, false, false, true, true, false);
            break;
         case 160:
            var1 = new n(false, false, false, false, false, true, false, true);
            break;
         case 161:
            var1 = new n(false, false, false, false, false, true, true, false);
            break;
         case 162:
            var1 = new n(false, false, false, false, false, false, true, true);
            break;
         case 163:
            var1 = new n(false, false, false, false, false, true, true, false);
            break;
         case 164:
            var1 = new n(false, false, false, false, false, true, false, true);
            break;
         case 165:
            var1 = new n(false, false, false, false, false, false, true, true);
            break;
         case 166:
            var1 = new n(false, false, false, false, false, true, true, false);
            break;
         case 167:
            var1 = new n(false, false, false, false, false, true, false, true);
            break;
         case 168:
            var1 = new n(false, false, false, false, false, true, true, true);
            break;
         case 169:
            var1 = new n(false, false, false, false, false, false, true, true);
            break;
         case 170:
            var1 = new n(false, false, false, false, false, false, false, true);
            break;
         case 171:
            var1 = new n(false, false, false, false, false, true, false, false);
            break;
         case 172:
            var1 = new n(false, false, false, false, false, false, true, false);
            break;
         case 173:
            var1 = new n(false, false, false, false, false, true, false, true);
            break;
         case 174:
            var1 = new n(false, false, false, false, false, false, true, true);
            break;
         case 175:
            var1 = new n(false, false, false, false, false, true, true, false);
            break;
         case 176:
            var1 = new n(false, false, false, false, false, true, false, false);
            break;
         case 177:
            var1 = new n(false, false, false, false, false, false, false, true);
            break;
         case 178:
            var1 = new n(false, false, false, false, false, false, true, false);
            break;
         case 179:
            var1 = new n(false, false, false, false, false, true, true, false);
            break;
         case 180:
            var1 = new n(false, false, false, false, false, false, false, true);
            break;
         case 181:
            var1 = new n(false, false, false, false, false, false, true, false);
            break;
         case 182:
            var1 = new n(false, false, false, false, false, true, false, false);
            break;
         case 183:
            var1 = new n(false, false, false, false, false, true, true, true);
            break;
         case 184:
            var1 = new n(false, false, false, false, false, false, true, false);
            break;
         case 185:
            var1 = new n(false, false, false, false, false, true, false, false);
            break;
         case 186:
            var1 = new n(false, false, false, false, false, false, false, true);
            break;
         default:
            var1 = new n(false, false, false, false, false, false, false, false);
      }

      String var3 = new String();
      String var2 = var3;
      if (var1.f) {
         var2 = var3 + fishing4.a.y.a(2131165227) + "\n";
      }

      var3 = var2;
      if (var1.g) {
         var3 = var2 + fishing4.a.y.a(2131165228) + "\n";
      }

      var2 = var3;
      if (var1.h) {
         var2 = var3 + fishing4.a.y.a(2131165229) + "\n";
      }

      var3 = var2;
      if (var1.a) {
         var3 = var2 + fishing4.a.y.a(2131165230) + "\n";
      }

      var2 = var3;
      if (var1.b) {
         var2 = var3 + fishing4.a.y.a(2131165231) + "\n";
      }

      var3 = var2;
      if (var1.c) {
         var3 = var2 + fishing4.a.y.a(2131165232) + "\n";
      }

      var2 = var3;
      if (var1.d) {
         var2 = var3 + fishing4.a.y.a(2131165233) + "\n";
      }

      var3 = var2;
      if (var1.e) {
         var3 = var2 + fishing4.a.y.a(2131165234) + "\n";
      }

      return var3.trim();
   }

   public static int j(int var0) {
      short var1 = 300;
      switch (var0) {
         case 0:
            var1 = 200;
            break;
         case 1:
            var1 = 200;
            break;
         case 2:
            var1 = 200;
            break;
         case 3:
            var1 = 200;
            break;
         case 4:
            var1 = 200;
            break;
         case 5:
            var1 = 200;
            break;
         case 6:
            var1 = 200;
            break;
         case 7:
            var1 = 200;
            break;
         case 8:
            var1 = 200;
         case 9:
         case 10:
         case 11:
         case 12:
         case 13:
         case 14:
         case 15:
         case 16:
         case 17:
         case 18:
         case 19:
         case 20:
         case 149:
         case 150:
         case 151:
         case 152:
         case 153:
            break;
         case 21:
            var1 = 420;
            break;
         case 22:
            var1 = 420;
            break;
         case 23:
            var1 = 420;
            break;
         case 24:
            var1 = 420;
            break;
         case 25:
            var1 = 420;
            break;
         case 26:
            var1 = 420;
            break;
         case 27:
            var1 = 420;
            break;
         case 28:
            var1 = 420;
            break;
         case 29:
            var1 = 420;
            break;
         case 30:
            var1 = 420;
            break;
         case 31:
            var1 = 420;
            break;
         case 32:
            var1 = 420;
            break;
         case 33:
            var1 = 420;
            break;
         case 34:
            var1 = 420;
            break;
         case 35:
            var1 = 420;
            break;
         case 36:
            var1 = 420;
            break;
         case 37:
            var1 = 420;
            break;
         case 38:
            var1 = 420;
            break;
         case 39:
            var1 = 420;
            break;
         case 40:
            var1 = 420;
            break;
         case 41:
            var1 = 420;
            break;
         case 42:
            var1 = 420;
            break;
         case 43:
            var1 = 420;
            break;
         case 44:
            var1 = 420;
            break;
         case 45:
            var1 = 420;
            break;
         case 46:
            var1 = 420;
            break;
         case 47:
            var1 = 420;
            break;
         case 48:
            var1 = 420;
            break;
         case 49:
            var1 = 420;
            break;
         case 50:
            var1 = 600;
            break;
         case 51:
            var1 = 600;
            break;
         case 52:
            var1 = 600;
            break;
         case 53:
            var1 = 600;
            break;
         case 54:
            var1 = 600;
            break;
         case 55:
            var1 = 600;
            break;
         case 56:
            var1 = 600;
            break;
         case 57:
            var1 = 600;
            break;
         case 58:
            var1 = 600;
            break;
         case 59:
            var1 = 600;
            break;
         case 60:
            var1 = 600;
            break;
         case 61:
            var1 = 600;
            break;
         case 62:
            var1 = 600;
            break;
         case 63:
            var1 = 600;
            break;
         case 64:
            var1 = 600;
            break;
         case 65:
            var1 = 600;
            break;
         case 66:
            var1 = 600;
            break;
         case 67:
            var1 = 600;
            break;
         case 68:
            var1 = 600;
            break;
         case 69:
            var1 = 600;
            break;
         case 70:
            var1 = 600;
            break;
         case 71:
            var1 = 600;
            break;
         case 72:
            var1 = 600;
            break;
         case 73:
            var1 = 600;
            break;
         case 74:
            var1 = 600;
            break;
         case 75:
            var1 = 600;
            break;
         case 76:
            var1 = 600;
            break;
         case 77:
            var1 = 600;
            break;
         case 78:
            var1 = 600;
            break;
         case 79:
            var1 = 600;
            break;
         case 80:
            var1 = 600;
            break;
         case 81:
            var1 = 600;
            break;
         case 82:
            var1 = 600;
            break;
         case 83:
            var1 = 700;
            break;
         case 84:
            var1 = 700;
            break;
         case 85:
            var1 = 700;
            break;
         case 86:
            var1 = 700;
            break;
         case 87:
            var1 = 700;
            break;
         case 88:
            var1 = 700;
            break;
         case 89:
            var1 = 700;
            break;
         case 90:
            var1 = 700;
            break;
         case 91:
            var1 = 700;
            break;
         case 92:
            var1 = 700;
            break;
         case 93:
            var1 = 700;
            break;
         case 94:
            var1 = 700;
            break;
         case 95:
            var1 = 700;
            break;
         case 96:
            var1 = 700;
            break;
         case 97:
            var1 = 700;
            break;
         case 98:
            var1 = 700;
            break;
         case 99:
            var1 = 700;
            break;
         case 100:
            var1 = 700;
            break;
         case 101:
            var1 = 700;
            break;
         case 102:
            var1 = 700;
            break;
         case 103:
            var1 = 700;
            break;
         case 104:
            var1 = 700;
            break;
         case 105:
            var1 = 700;
            break;
         case 106:
            var1 = 700;
            break;
         case 107:
            var1 = 700;
            break;
         case 108:
            var1 = 700;
            break;
         case 109:
            var1 = 700;
            break;
         case 110:
            var1 = 700;
            break;
         case 111:
            var1 = 700;
            break;
         case 112:
            var1 = 700;
            break;
         case 113:
            var1 = 700;
            break;
         case 114:
            var1 = 700;
            break;
         case 115:
            var1 = 700;
            break;
         case 116:
         case 117:
         case 118:
         case 119:
         case 120:
         case 121:
         case 122:
         case 123:
         case 124:
         case 125:
         case 126:
         case 127:
         case 128:
         case 129:
            var1 = 900;
            break;
         case 130:
            var1 = 1000;
            break;
         case 131:
            var1 = 1000;
            break;
         case 132:
            var1 = 1000;
            break;
         case 133:
            var1 = 1000;
            break;
         case 134:
            var1 = 1000;
            break;
         case 135:
            var1 = 1000;
            break;
         case 136:
            var1 = 1000;
            break;
         case 137:
            var1 = 1000;
            break;
         case 138:
            var1 = 1000;
            break;
         case 139:
            var1 = 1000;
            break;
         case 140:
            var1 = 1000;
            break;
         case 141:
            var1 = 1000;
            break;
         case 142:
            var1 = 1000;
            break;
         case 143:
            var1 = 1000;
            break;
         case 144:
            var1 = 200;
            break;
         case 145:
            var1 = 200;
            break;
         case 146:
            var1 = 200;
            break;
         case 147:
            var1 = 200;
            break;
         case 148:
            var1 = 200;
            break;
         case 154:
            var1 = 420;
            break;
         case 155:
            var1 = 420;
            break;
         case 156:
            var1 = 420;
            break;
         case 157:
            var1 = 420;
            break;
         case 158:
            var1 = 420;
            break;
         case 159:
            var1 = 420;
            break;
         case 160:
            var1 = 420;
            break;
         case 161:
            var1 = 420;
            break;
         case 162:
            var1 = 420;
            break;
         case 163:
            var1 = 600;
            break;
         case 164:
            var1 = 600;
            break;
         case 165:
            var1 = 600;
            break;
         case 166:
            var1 = 600;
            break;
         case 167:
            var1 = 600;
            break;
         case 168:
            var1 = 600;
            break;
         case 169:
            var1 = 600;
            break;
         case 170:
            var1 = 600;
            break;
         case 171:
            var1 = 600;
            break;
         case 172:
            var1 = 600;
            break;
         case 173:
            var1 = 700;
            break;
         case 174:
            var1 = 700;
            break;
         case 175:
            var1 = 700;
            break;
         case 176:
            var1 = 700;
            break;
         case 177:
            var1 = 700;
            break;
         case 178:
            var1 = 700;
            break;
         case 179:
            var1 = 700;
            break;
         case 180:
         case 181:
         case 182:
         case 183:
            var1 = 900;
            break;
         case 184:
            var1 = 1000;
            break;
         case 185:
            var1 = 1000;
            break;
         case 186:
            var1 = 1000;
            break;
         default:
            var1 = 0;
      }

      return var1;
   }

   public static int k(int var0) {
      // $FF: Couldn't be decompiled
   }

   public static int l(int var0) {
      short var1 = 30;
      switch (var0) {
         case 0:
            var1 = 18;
            break;
         case 1:
            var1 = 20;
            break;
         case 2:
            var1 = 24;
            break;
         case 3:
            var1 = 16;
            break;
         case 4:
            var1 = 24;
            break;
         case 5:
            var1 = 20;
            break;
         case 6:
            var1 = 24;
            break;
         case 7:
            var1 = 18;
            break;
         case 8:
            var1 = 18;
         case 9:
         case 10:
         case 12:
         case 17:
         case 18:
         case 19:
         case 20:
         case 152:
            break;
         case 11:
            var1 = 40;
            break;
         case 13:
            var1 = 25;
            break;
         case 14:
            var1 = 50;
            break;
         case 15:
            var1 = 45;
            break;
         case 16:
            var1 = 35;
            break;
         case 21:
            var1 = 80;
            break;
         case 22:
            var1 = 70;
            break;
         case 23:
            var1 = 70;
            break;
         case 24:
            var1 = 75;
            break;
         case 25:
            var1 = 75;
            break;
         case 26:
            var1 = 65;
            break;
         case 27:
            var1 = 60;
            break;
         case 28:
            var1 = 55;
            break;
         case 29:
            var1 = 90;
            break;
         case 30:
            var1 = 65;
            break;
         case 31:
            var1 = 60;
            break;
         case 32:
            var1 = 80;
            break;
         case 33:
            var1 = 90;
            break;
         case 34:
            var1 = 70;
            break;
         case 35:
            var1 = 60;
            break;
         case 36:
            var1 = 75;
            break;
         case 37:
            var1 = 100;
            break;
         case 38:
            var1 = 55;
            break;
         case 39:
            var1 = 50;
            break;
         case 40:
            var1 = 70;
            break;
         case 41:
            var1 = 70;
            break;
         case 42:
            var1 = 60;
            break;
         case 43:
            var1 = 75;
            break;
         case 44:
            var1 = 50;
            break;
         case 45:
            var1 = 45;
            break;
         case 46:
            var1 = 47;
            break;
         case 47:
            var1 = 55;
            break;
         case 48:
            var1 = 50;
            break;
         case 49:
            var1 = 60;
            break;
         case 50:
            var1 = 125;
            break;
         case 51:
            var1 = 110;
            break;
         case 52:
            var1 = 130;
            break;
         case 53:
            var1 = 125;
            break;
         case 54:
            var1 = 120;
            break;
         case 55:
            var1 = 120;
            break;
         case 56:
            var1 = 130;
            break;
         case 57:
            var1 = 120;
            break;
         case 58:
            var1 = 125;
            break;
         case 59:
            var1 = 130;
            break;
         case 60:
            var1 = 115;
            break;
         case 61:
            var1 = 110;
            break;
         case 62:
            var1 = 140;
            break;
         case 63:
            var1 = 125;
            break;
         case 64:
            var1 = 140;
            break;
         case 65:
            var1 = 120;
            break;
         case 66:
            var1 = 125;
            break;
         case 67:
            var1 = 130;
            break;
         case 68:
            var1 = 105;
            break;
         case 69:
            var1 = 120;
            break;
         case 70:
            var1 = 130;
            break;
         case 71:
            var1 = 110;
            break;
         case 72:
            var1 = 120;
            break;
         case 73:
            var1 = 125;
            break;
         case 74:
            var1 = 120;
            break;
         case 75:
            var1 = 115;
            break;
         case 76:
            var1 = 110;
            break;
         case 77:
            var1 = 130;
            break;
         case 78:
            var1 = 120;
            break;
         case 79:
            var1 = 105;
            break;
         case 80:
            var1 = 115;
            break;
         case 81:
            var1 = 115;
            break;
         case 82:
            var1 = 125;
            break;
         case 83:
            var1 = 150;
            break;
         case 84:
            var1 = 165;
            break;
         case 85:
            var1 = 170;
            break;
         case 86:
            var1 = 165;
            break;
         case 87:
            var1 = 170;
            break;
         case 88:
            var1 = 155;
            break;
         case 89:
            var1 = 160;
            break;
         case 90:
            var1 = 165;
            break;
         case 91:
            var1 = 170;
            break;
         case 92:
            var1 = 160;
            break;
         case 93:
            var1 = 150;
            break;
         case 94:
            var1 = 155;
            break;
         case 95:
            var1 = 155;
            break;
         case 96:
            var1 = 200;
            break;
         case 97:
            var1 = 130;
            break;
         case 98:
            var1 = 125;
            break;
         case 99:
            var1 = 160;
            break;
         case 100:
            var1 = 170;
            break;
         case 101:
            var1 = 210;
            break;
         case 102:
            var1 = 170;
            break;
         case 103:
            var1 = 210;
            break;
         case 104:
            var1 = 155;
            break;
         case 105:
            var1 = 220;
            break;
         case 106:
            var1 = 160;
            break;
         case 107:
            var1 = 165;
            break;
         case 108:
            var1 = 145;
            break;
         case 109:
            var1 = 140;
            break;
         case 110:
            var1 = 135;
            break;
         case 111:
            var1 = 140;
            break;
         case 112:
            var1 = 150;
            break;
         case 113:
            var1 = 175;
            break;
         case 114:
            var1 = 155;
            break;
         case 115:
            var1 = 160;
            break;
         case 116:
            var1 = 265;
            break;
         case 117:
            var1 = 255;
            break;
         case 118:
            var1 = 250;
            break;
         case 119:
            var1 = 275;
            break;
         case 120:
            var1 = 230;
            break;
         case 121:
            var1 = 235;
            break;
         case 122:
            var1 = 250;
            break;
         case 123:
            var1 = 255;
            break;
         case 124:
            var1 = 265;
            break;
         case 125:
            var1 = 280;
            break;
         case 126:
            var1 = 275;
            break;
         case 127:
            var1 = 270;
            break;
         case 128:
            var1 = 310;
            break;
         case 129:
            var1 = 290;
            break;
         case 130:
            var1 = 390;
            break;
         case 131:
            var1 = 385;
            break;
         case 132:
            var1 = 400;
            break;
         case 133:
            var1 = 420;
            break;
         case 134:
            var1 = 395;
            break;
         case 135:
            var1 = 340;
            break;
         case 136:
            var1 = 385;
            break;
         case 137:
            var1 = 370;
            break;
         case 138:
            var1 = 510;
            break;
         case 139:
            var1 = 540;
            break;
         case 140:
            var1 = 525;
            break;
         case 141:
            var1 = 580;
            break;
         case 142:
            var1 = 535;
            break;
         case 143:
            var1 = 530;
            break;
         case 144:
            var1 = 17;
            break;
         case 145:
            var1 = 22;
            break;
         case 146:
            var1 = 18;
            break;
         case 147:
            var1 = 16;
            break;
         case 148:
            var1 = 20;
            break;
         case 149:
            var1 = 45;
            break;
         case 150:
            var1 = 35;
            break;
         case 151:
            var1 = 35;
            break;
         case 153:
            var1 = 40;
            break;
         case 154:
            var1 = 70;
            break;
         case 155:
            var1 = 65;
            break;
         case 156:
            var1 = 80;
            break;
         case 157:
            var1 = 60;
            break;
         case 158:
            var1 = 65;
            break;
         case 159:
            var1 = 65;
            break;
         case 160:
            var1 = 75;
            break;
         case 161:
            var1 = 70;
            break;
         case 162:
            var1 = 70;
            break;
         case 163:
            var1 = 140;
            break;
         case 164:
            var1 = 130;
            break;
         case 165:
            var1 = 100;
            break;
         case 166:
            var1 = 120;
            break;
         case 167:
            var1 = 130;
            break;
         case 168:
            var1 = 115;
            break;
         case 169:
            var1 = 110;
            break;
         case 170:
            var1 = 125;
            break;
         case 171:
            var1 = 120;
            break;
         case 172:
            var1 = 135;
            break;
         case 173:
            var1 = 200;
            break;
         case 174:
            var1 = 180;
            break;
         case 175:
            var1 = 165;
            break;
         case 176:
            var1 = 175;
            break;
         case 177:
            var1 = 170;
            break;
         case 178:
            var1 = 190;
            break;
         case 179:
            var1 = 150;
            break;
         case 180:
            var1 = 310;
            break;
         case 181:
            var1 = 240;
            break;
         case 182:
            var1 = 260;
            break;
         case 183:
            var1 = 270;
            break;
         case 184:
            var1 = 390;
            break;
         case 185:
            var1 = 375;
            break;
         case 186:
            var1 = 480;
            break;
         default:
            var1 = 0;
      }

      return var1;
   }

   public static int m(int var0) {
      switch (var0) {
         case 2:
            var0 = fishing4.a.z.a(5) + 149;
            break;
         case 3:
            var0 = fishing4.a.z.a(9) + 154;
            break;
         case 4:
            var0 = fishing4.a.z.a(10) + 163;
            break;
         case 5:
            var0 = fishing4.a.z.a(7) + 173;
            break;
         case 6:
            var0 = fishing4.a.z.a(4) + 180;
            break;
         case 7:
            var0 = fishing4.a.z.a(2) + 184;
            break;
         case 8:
            var0 = 186;
            break;
         default:
            var0 = fishing4.a.z.a(5) + 144;
      }

      return var0;
   }

   public static int n(int var0) {
      switch (var0) {
         case 2:
            var0 = fishing4.a.z.a(12) + 9;
            break;
         case 3:
            var0 = fishing4.a.z.a(29) + 21;
            break;
         case 4:
            var0 = fishing4.a.z.a(33) + 50;
            break;
         case 5:
            var0 = fishing4.a.z.a(33) + 83;
            break;
         case 6:
            var0 = fishing4.a.z.a(14) + 116;
            break;
         case 7:
            var0 = fishing4.a.z.a(8) + 130;
            break;
         case 8:
            var0 = fishing4.a.z.a(6) + 138;
            break;
         default:
            var0 = fishing4.a.z.a(9);
      }

      return var0;
   }

   private static int o(int var0) {
      short var1 = 15;
      switch (var0) {
         case 0:
            var1 = 13;
            break;
         case 1:
            var1 = 12;
            break;
         case 2:
            var1 = 10;
         case 3:
         case 11:
         case 15:
         case 16:
         case 20:
         case 29:
         case 33:
            break;
         case 4:
            var1 = 10;
            break;
         case 5:
            var1 = 12;
            break;
         case 6:
            var1 = 10;
            break;
         case 7:
            var1 = 13;
            break;
         case 8:
            var1 = 14;
            break;
         case 9:
            var1 = 16;
            break;
         case 10:
            var1 = 17;
            break;
         case 12:
            var1 = 16;
            break;
         case 13:
            var1 = 20;
            break;
         case 14:
            var1 = 13;
            break;
         case 17:
            var1 = 20;
            break;
         case 18:
            var1 = 20;
            break;
         case 19:
            var1 = 16;
            break;
         case 21:
            var1 = 16;
            break;
         case 22:
            var1 = 20;
            break;
         case 23:
            var1 = 20;
            break;
         case 24:
            var1 = 20;
            break;
         case 25:
            var1 = 20;
            break;
         case 26:
            var1 = 22;
            break;
         case 27:
            var1 = 25;
            break;
         case 28:
            var1 = 35;
            break;
         case 30:
            var1 = 20;
            break;
         case 31:
            var1 = 20;
            break;
         case 32:
            var1 = 14;
            break;
         case 34:
            var1 = 20;
            break;
         case 35:
            var1 = 20;
            break;
         case 36:
            var1 = 20;
            break;
         case 37:
            var1 = 12;
            break;
         case 38:
            var1 = 20;
            break;
         case 39:
            var1 = 28;
            break;
         case 40:
            var1 = 20;
            break;
         case 41:
            var1 = 20;
            break;
         case 42:
            var1 = 24;
            break;
         case 43:
            var1 = 24;
            break;
         case 44:
            var1 = 25;
            break;
         case 45:
            var1 = 30;
            break;
         case 46:
            var1 = 30;
            break;
         case 47:
            var1 = 20;
            break;
         case 48:
            var1 = 20;
            break;
         case 49:
            var1 = 26;
            break;
         case 50:
            var1 = 30;
            break;
         case 51:
            var1 = 45;
            break;
         case 52:
            var1 = 28;
            break;
         case 53:
            var1 = 30;
            break;
         case 54:
            var1 = 40;
            break;
         case 55:
            var1 = 32;
            break;
         case 56:
            var1 = 28;
            break;
         case 57:
            var1 = 30;
            break;
         case 58:
            var1 = 30;
            break;
         case 59:
            var1 = 28;
            break;
         case 60:
            var1 = 30;
            break;
         case 61:
            var1 = 45;
            break;
         case 62:
            var1 = 26;
            break;
         case 63:
            var1 = 30;
            break;
         case 64:
            var1 = 8;
            break;
         case 65:
            var1 = 40;
            break;
         case 66:
            var1 = 30;
            break;
         case 67:
            var1 = 25;
            break;
         case 68:
            var1 = 60;
            break;
         case 69:
            var1 = 40;
            break;
         case 70:
            var1 = 20;
            break;
         case 71:
            var1 = 50;
            break;
         case 72:
            var1 = 34;
            break;
         case 73:
            var1 = 28;
            break;
         case 74:
            var1 = 40;
            break;
         case 75:
            var1 = 34;
            break;
         case 76:
            var1 = 34;
            break;
         case 77:
            var1 = 30;
            break;
         case 78:
            var1 = 34;
            break;
         case 79:
            var1 = 80;
            break;
         case 80:
            var1 = 55;
            break;
         case 81:
            var1 = 40;
            break;
         case 82:
            var1 = 16;
            break;
         case 83:
            var1 = 80;
            break;
         case 84:
            var1 = 70;
            break;
         case 85:
            var1 = 70;
            break;
         case 86:
            var1 = 50;
            break;
         case 87:
            var1 = 70;
            break;
         case 88:
            var1 = 65;
            break;
         case 89:
            var1 = 60;
            break;
         case 90:
            var1 = 55;
            break;
         case 91:
            var1 = 40;
            break;
         case 92:
            var1 = 55;
            break;
         case 93:
            var1 = 110;
            break;
         case 94:
            var1 = 80;
            break;
         case 95:
            var1 = 70;
            break;
         case 96:
            var1 = 35;
            break;
         case 97:
            var1 = 130;
            break;
         case 98:
            var1 = 175;
            break;
         case 99:
            var1 = 65;
            break;
         case 100:
            var1 = 55;
            break;
         case 101:
            var1 = 35;
            break;
         case 102:
            var1 = 35;
            break;
         case 103:
            var1 = 36;
            break;
         case 104:
            var1 = 70;
            break;
         case 105:
            var1 = 37;
            break;
         case 106:
            var1 = 75;
            break;
         case 107:
            var1 = 65;
            break;
         case 108:
            var1 = 100;
            break;
         case 109:
            var1 = 140;
            break;
         case 110:
            var1 = 140;
            break;
         case 111:
            var1 = 120;
            break;
         case 112:
            var1 = 70;
            break;
         case 113:
            var1 = 70;
            break;
         case 114:
            var1 = 85;
            break;
         case 115:
            var1 = 65;
            break;
         case 116:
            var1 = 100;
            break;
         case 117:
            var1 = 140;
            break;
         case 118:
            var1 = 120;
            break;
         case 119:
            var1 = 80;
            break;
         case 120:
            var1 = 120;
            break;
         case 121:
            var1 = 120;
            break;
         case 122:
            var1 = 150;
            break;
         case 123:
            var1 = 110;
            break;
         case 124:
            var1 = 100;
            break;
         case 125:
            var1 = 125;
            break;
         case 126:
            var1 = 125;
            break;
         case 127:
            var1 = 85;
            break;
         case 128:
            var1 = 90;
            break;
         case 129:
            var1 = 75;
            break;
         case 130:
            var1 = 220;
            break;
         case 131:
            var1 = 200;
            break;
         case 132:
            var1 = 80;
            break;
         case 133:
            fishing4.game.k.g();
            var1 = 45;
            break;
         case 134:
            var1 = 80;
            break;
         case 135:
            fishing4.game.k.g();
            var1 = 45;
            break;
         case 136:
            var1 = 450;
            break;
         case 137:
            var1 = 700;
            break;
         case 138:
            var1 = 900;
            break;
         case 139:
            var1 = 65;
            break;
         case 140:
            var1 = 100;
            break;
         case 141:
            var1 = 65;
            break;
         case 142:
            var1 = 75;
            break;
         case 143:
            var1 = 75;
            break;
         case 144:
            var1 = 12;
            break;
         case 145:
            var1 = 12;
            break;
         case 146:
            var1 = 12;
            break;
         case 147:
            var1 = 17;
            break;
         case 148:
            var1 = 22;
            break;
         case 149:
            var1 = 17;
            break;
         case 150:
            var1 = 22;
            break;
         case 151:
            var1 = 22;
            break;
         case 152:
            var1 = 30;
            break;
         case 153:
            var1 = 17;
            break;
         case 154:
            var1 = 20;
            break;
         case 155:
            var1 = 28;
            break;
         case 156:
            var1 = 17;
            break;
         case 157:
            var1 = 28;
            break;
         case 158:
            var1 = 26;
            break;
         case 159:
            var1 = 38;
            break;
         case 160:
            var1 = 20;
            break;
         case 161:
            var1 = 30;
            break;
         case 162:
            var1 = 30;
            break;
         case 163:
            var1 = 20;
            break;
         case 164:
            var1 = 30;
            break;
         case 165:
            var1 = 90;
            break;
         case 166:
            var1 = 50;
            break;
         case 167:
            var1 = 45;
            break;
         case 168:
            var1 = 60;
            break;
         case 169:
            var1 = 65;
            break;
         case 170:
            var1 = 50;
            break;
         case 171:
            var1 = 70;
            break;
         case 172:
            var1 = 25;
            break;
         case 173:
            var1 = 55;
            break;
         case 174:
            var1 = 80;
            break;
         case 175:
            var1 = 90;
            break;
         case 176:
            var1 = 80;
            break;
         case 177:
            var1 = 100;
            break;
         case 178:
            var1 = 60;
            break;
         case 179:
            var1 = 200;
            break;
         case 180:
            var1 = 150;
            break;
         case 181:
            var1 = 350;
            break;
         case 182:
            var1 = 280;
            break;
         case 183:
            var1 = 200;
            break;
         case 184:
            var1 = 160;
            break;
         case 185:
            var1 = 190;
            break;
         case 186:
            var1 = 170;
            break;
         default:
            var1 = 0;
      }

      return var1;
   }

   private static int p(int var0) {
      short var1 = 20;
      switch (var0) {
         case 0:
            var1 = 12;
            break;
         case 1:
            var1 = 15;
         case 2:
         case 4:
         case 6:
         case 13:
         case 17:
         case 18:
         case 27:
         case 39:
         case 44:
         case 68:
         case 98:
         case 153:
         case 155:
         case 157:
         case 169:
            break;
         case 3:
            var1 = 10;
            break;
         case 5:
            var1 = 15;
            break;
         case 7:
            var1 = 12;
            break;
         case 8:
            var1 = 11;
            break;
         case 9:
            var1 = 25;
            break;
         case 10:
            var1 = 24;
            break;
         case 11:
            var1 = 30;
            break;
         case 12:
            var1 = 25;
            break;
         case 14:
            var1 = 50;
            break;
         case 15:
            var1 = 40;
            break;
         case 16:
            var1 = 30;
            break;
         case 19:
            var1 = 25;
            break;
         case 20:
            var1 = 26;
            break;
         case 21:
            var1 = 50;
            break;
         case 22:
            var1 = 35;
            break;
         case 23:
            var1 = 35;
            break;
         case 24:
            var1 = 40;
            break;
         case 25:
            var1 = 40;
            break;
         case 26:
            var1 = 30;
            break;
         case 28:
            var1 = 15;
            break;
         case 29:
            var1 = 60;
            break;
         case 30:
            var1 = 25;
            break;
         case 31:
            var1 = 25;
            break;
         case 32:
            var1 = 50;
            break;
         case 33:
            var1 = 60;
            break;
         case 34:
            var1 = 35;
            break;
         case 35:
            var1 = 25;
            break;
         case 36:
            var1 = 40;
            break;
         case 37:
            var1 = 120;
            break;
         case 38:
            var1 = 30;
            break;
         case 40:
            var1 = 35;
            break;
         case 41:
            var1 = 35;
            break;
         case 42:
            var1 = 25;
            break;
         case 43:
            var1 = 40;
            break;
         case 45:
            var1 = 15;
            break;
         case 46:
            var1 = 18;
            break;
         case 47:
            var1 = 30;
            break;
         case 48:
            var1 = 32;
            break;
         case 49:
            var1 = 35;
            break;
         case 50:
            var1 = 55;
            break;
         case 51:
            var1 = 30;
            break;
         case 52:
            var1 = 70;
            break;
         case 53:
            var1 = 50;
            break;
         case 54:
            var1 = 50;
            break;
         case 55:
            var1 = 45;
            break;
         case 56:
            var1 = 60;
            break;
         case 57:
            var1 = 50;
            break;
         case 58:
            var1 = 50;
            break;
         case 59:
            var1 = 70;
            break;
         case 60:
            var1 = 40;
            break;
         case 61:
            var1 = 30;
            break;
         case 62:
            var1 = 100;
            break;
         case 63:
            var1 = 50;
            break;
         case 64:
            var1 = 200;
            break;
         case 65:
            var1 = 50;
            break;
         case 66:
            var1 = 50;
            break;
         case 67:
            var1 = 70;
            break;
         case 69:
            var1 = 40;
            break;
         case 70:
            var1 = 80;
            break;
         case 71:
            var1 = 25;
            break;
         case 72:
            var1 = 40;
            break;
         case 73:
            var1 = 60;
            break;
         case 74:
            var1 = 50;
            break;
         case 75:
            var1 = 40;
            break;
         case 76:
            var1 = 40;
            break;
         case 77:
            var1 = 55;
            break;
         case 78:
            var1 = 40;
            break;
         case 79:
            var1 = 15;
            break;
         case 80:
            var1 = 35;
            break;
         case 81:
            var1 = 35;
            break;
         case 82:
            var1 = 85;
            break;
         case 83:
            var1 = 50;
            break;
         case 84:
            var1 = 100;
            break;
         case 85:
            var1 = 100;
            break;
         case 86:
            var1 = 100;
            break;
         case 87:
            var1 = 100;
            break;
         case 88:
            var1 = 60;
            break;
         case 89:
            var1 = 75;
            break;
         case 90:
            var1 = 90;
            break;
         case 91:
            var1 = 150;
            break;
         case 92:
            var1 = 80;
            break;
         case 93:
            var1 = 40;
            break;
         case 94:
            var1 = 65;
            break;
         case 95:
            var1 = 60;
            break;
         case 96:
            var1 = 200;
            break;
         case 97:
            var1 = 30;
            break;
         case 99:
            var1 = 70;
            break;
         case 100:
            var1 = 90;
            break;
         case 101:
            var1 = 400;
            break;
         case 102:
            var1 = 180;
            break;
         case 103:
            var1 = 300;
            break;
         case 104:
            var1 = 60;
            break;
         case 105:
            var1 = 400;
            break;
         case 106:
            var1 = 70;
            break;
         case 107:
            var1 = 70;
            break;
         case 108:
            var1 = 40;
            break;
         case 109:
            var1 = 25;
            break;
         case 110:
            var1 = 25;
            break;
         case 111:
            var1 = 30;
            break;
         case 112:
            var1 = 60;
            break;
         case 113:
            var1 = 90;
            break;
         case 114:
            var1 = 45;
            break;
         case 115:
            var1 = 70;
            break;
         case 116:
            var1 = 150;
            break;
         case 117:
            var1 = 120;
            break;
         case 118:
            var1 = 100;
            break;
         case 119:
            var1 = 200;
            break;
         case 120:
            var1 = 75;
            break;
         case 121:
            var1 = 80;
            break;
         case 122:
            var1 = 100;
            break;
         case 123:
            var1 = 120;
            break;
         case 124:
            var1 = 150;
            break;
         case 125:
            var1 = 200;
            break;
         case 126:
            var1 = 200;
            break;
         case 127:
            var1 = 200;
            break;
         case 128:
            var1 = 500;
            break;
         case 129:
            var1 = 240;
            break;
         case 130:
            var1 = 200;
            break;
         case 131:
            var1 = 200;
            break;
         case 132:
            var1 = 690;
            break;
         case 133:
            var1 = 1300;
            break;
         case 134:
            var1 = 600;
            break;
         case 135:
            var1 = 1500;
            break;
         case 136:
            var1 = 100;
            break;
         case 137:
            var1 = 60;
            break;
         case 138:
            var1 = 90;
            break;
         case 139:
            var1 = 1600;
            break;
         case 140:
            var1 = 1000;
            break;
         case 141:
            var1 = 1800;
            break;
         case 142:
            var1 = 1350;
            break;
         case 143:
            var1 = 1450;
            break;
         case 144:
            var1 = 10;
            break;
         case 145:
            var1 = 12;
            break;
         case 146:
            var1 = 10;
            break;
         case 147:
            var1 = 10;
            break;
         case 148:
            var1 = 11;
            break;
         case 149:
            var1 = 25;
            break;
         case 150:
            var1 = 15;
            break;
         case 151:
            var1 = 15;
            break;
         case 152:
            var1 = 12;
            break;
         case 154:
            var1 = 30;
            break;
         case 156:
            var1 = 50;
            break;
         case 158:
            var1 = 25;
            break;
         case 159:
            var1 = 15;
            break;
         case 160:
            var1 = 40;
            break;
         case 161:
            var1 = 25;
            break;
         case 162:
            var1 = 22;
            break;
         case 163:
            var1 = 80;
            break;
         case 164:
            var1 = 50;
            break;
         case 165:
            var1 = 15;
            break;
         case 166:
            var1 = 30;
            break;
         case 167:
            var1 = 45;
            break;
         case 168:
            var1 = 25;
            break;
         case 170:
            var1 = 33;
            break;
         case 171:
            var1 = 23;
            break;
         case 172:
            var1 = 60;
            break;
         case 173:
            var1 = 90;
            break;
         case 174:
            var1 = 55;
            break;
         case 175:
            var1 = 40;
            break;
         case 176:
            var1 = 50;
            break;
         case 177:
            var1 = 40;
            break;
         case 178:
            var1 = 80;
            break;
         case 179:
            var1 = 15;
            break;
         case 180:
            var1 = 90;
            break;
         case 181:
            var1 = 35;
            break;
         case 182:
            var1 = 45;
            break;
         case 183:
            var1 = 60;
            break;
         case 184:
            var1 = 250;
            break;
         case 185:
            var1 = 200;
            break;
         case 186:
            var1 = 450;
            break;
         default:
            var1 = 0;
      }

      return var1;
   }

   public final float a() {
      return this.b;
   }

   public final void a(GL10 var1, fishing4.a.w var2, fishing4.a.w var3, float var4, float var5, int var6) {
      a(var1, this.a, this.b, this.c, this.d, this.e, var2, var3, var4, var5, var6);
   }

   public final int b() {
      return this.a;
   }

   public final boolean c() {
      return a(this.a);
   }

   public final boolean d() {
      return b(this.a);
   }

   public final String e() {
      return c(this.a);
   }

   public final int f() {
      return d(this.a);
   }

   public final String g() {
      return e(this.a);
   }

   public final int h() {
      return b(this.b);
   }

   public final float i() {
      return a(this.b, this.a);
   }

   public final int j() {
      int var1;
      if (d(this.a) != 8 && d(this.a) != 7) {
         if (d(this.a) >= 6) {
            var1 = (int)((float)(o(this.a) * p(this.a)) * this.b * 0.8F);
         } else if (d(this.a) >= 4) {
            var1 = (int)((float)(o(this.a) * p(this.a)) * this.b * 0.8F);
         } else {
            var1 = (int)((float)(o(this.a) * p(this.a)) * this.b * 1.0F);
         }
      } else {
         var1 = (int)((float)(o(this.a) * p(this.a)) * this.b * 0.6F);
      }

      return var1;
   }

   public final String k() {
      return fishing4.a.y.d(this.j());
   }

   public final String l() {
      return i(this.a);
   }
}

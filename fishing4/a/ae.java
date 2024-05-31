package fishing4.a;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.Bitmap.Config;
import android.graphics.Paint.Align;
import android.util.Log;
import fishing4.game.az;
import javax.microedition.khronos.opengles.GL10;

public final class ae extends w {
   static v[] h = new v[24];
   public static Paint i = new Paint(1);
   public static int j = 1;
   public static int k = 1;
   private static Typeface l;

   public static int a(float var0) {
      Paint var2 = new Paint();
      var2.setTypeface(l);
      var2.setTextSize(var0);
      var2.setAntiAlias(true);
      int var1 = (int)Math.ceil((double)(-var2.ascent()));
      return (int)Math.ceil((double)var2.descent()) + var1;
   }

   private static int a(String var0) {
      int var1 = 0;

      int var2;
      while(true) {
         if (var1 >= 24) {
            var2 = 999;
            break;
         }

         var2 = var1;
         if (h[var1].a.equals(var0)) {
            break;
         }

         ++var1;
      }

      return var2;
   }

   private static h a(String var0, float var1) {
      return fishing4.a.h.a((float)((int)Math.ceil((double)i.measureText(var0))), (float)a(var1));
   }

   public static void a() {
      // $FF: Couldn't be decompiled
   }

   public static void a(GL10 var0, String var1, float var2, float var3, float var4) {
      a(var0, var1, var2, var3, 332.0F, 50.0F, 26.0F, 4, aa.a(1.0F, 1.0F, 1.0F, var4 / 255.0F));
   }

   public static void a(GL10 var0, String var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      a(var0, var1, var2, var3, var4, var5, var6, var7, aa.a(1.0F, 1.0F, 1.0F, 1.0F));
   }

   public static void a(GL10 var0, String var1, float var2, float var3, float var4, float var5, float var6, int var7, aa var8) {
      if (var1 != null) {
         int var9 = a(var1);
         if (var9 != 999 && h[var9].b != null) {
            if (h[var9].b.c.a != var4) {
               c(var0, var1);
               a(var0, var1, fishing4.a.h.a(var4, var5), var6, var7);
               b(var0, var1);
               var9 = a(var1);
            } else {
               k = h[var9].d;
            }
         } else {
            a(var0, var1, fishing4.a.h.a(var4, var5), var6, var7);
            b(var0, var1);
            var9 = a(var1);
         }

         int var10 = a(var6);
         if (var7 != 5 && var7 != 9 && var7 != 6) {
            if (var7 == 7 || var7 == 10 || var7 == 8) {
               var3 += h[var9].b.c.b / 2.0F + (float)var10;
            }
         } else {
            var3 -= h[var9].b.c.b / 2.0F - (float)var10;
         }

         if (h[var9].b.c.b > var5 && h[var9].d > 1) {
            if ((float)((h[var9].d - j + 1) * var10) > var5) {
               m.a(var0, h[var9].b, var2, var3, 0.0F, (float)((j - 1) * var10), var4, var5, var8);
            } else {
               m.a(var0, h[var9].b, var2, var3, 0.0F, (float)((j - 1) * var10), var4, (float)((h[var9].d - j + 1) * var10), var8);
            }
         } else {
            m.a(var0, h[var9].b, var2, var3, 0.0F, 0.0F, var4, (float)(h[var9].d * var10), var8);
         }
      }

   }

   public static void a(GL10 var0, String var1, float var2, float var3, float var4, int var5) {
      aa var8 = aa.b();
      if (var1 != null) {
         f var7;
         if (var5 != 5 && var5 != 9 && var5 != 6) {
            if (var5 != 7 && var5 != 10 && var5 != 8) {
               var7 = fishing4.a.f.a(var2 - 175.0F, var3 - 195.0F, 350.0F, 390.0F);
            } else {
               var7 = fishing4.a.f.a(var2 - 175.0F, var3 + 390.0F - (float)a(var4), 350.0F, 390.0F);
            }
         } else {
            var7 = fishing4.a.f.a(var2 - 175.0F, var3 - 390.0F + (float)a(var4), 350.0F, 390.0F);
         }

         int var6 = a(var1);
         if (var6 != 999 && h[var6].b != null) {
            if (h[var6].b.c.a != 350.0F) {
               c(var0, var1);
               a(var0, var1, fishing4.a.h.a(350.0F, 390.0F), var4, var5);
               b(var0, var1);
               var6 = a(var1);
            } else {
               k = h[var6].d;
            }
         } else {
            a(var0, var1, fishing4.a.h.a(350.0F, 390.0F), var4, var5);
            b(var0, var1);
            var6 = a(var1);
         }

         if (var5 != 5 && var5 != 9 && var5 != 6) {
            if (var5 == 7 || var5 == 10 || var5 == 8) {
               var3 += h[var6].b.c.b / 2.0F + (float)a(var4);
            }
         } else {
            var3 -= h[var6].b.c.b / 2.0F - (float)a(var4);
         }

         if (h[var6].b.c.b > 390.0F && h[var6].d > 1) {
            var5 = a(var4);
            m.a(var0, var7);
            m.a(var0, h[var6].b, var2, var3 + (float)az.y, 0.0F, (float)((j - 1) * var5), 350.0F, h[var6].b.c.b, var8);
            m.b(var0);
         } else {
            var5 = a(var4);
            m.a(var0, h[var6].b, var2, var3, 0.0F, 0.0F, 350.0F, (float)(var5 * h[var6].d), var8);
         }
      }

   }

   public static void a(GL10 var0, String var1, float var2, float var3, aa var4) {
      if (var1 != null) {
         int var5 = a(var1);
         if (var5 != 999 && h[var5].b != null) {
            if (h[var5].b.c.a != 200.0F) {
               c(var0, var1);
               a(var0, var1, fishing4.a.h.a(200.0F, 90.0F));
               b(var0, var1);
               var5 = a(var1);
            } else {
               k = h[var5].d;
            }
         } else {
            a(var0, var1, fishing4.a.h.a(200.0F, 90.0F));
            b(var0, var1);
            var5 = a(var1);
         }

         int var6 = a(26.0F);
         if (h[var5].b.c.b > 90.0F && h[var5].d > 1) {
            if ((float)((h[var5].d - j + 1) * var6) > 90.0F) {
               m.a(var0, h[var5].b, var2, var3, 0.0F, (float)((j - 1) * var6), 200.0F, 90.0F, var4);
            } else {
               m.a(var0, h[var5].b, var2, var3, 0.0F, (float)((j - 1) * var6), 200.0F, (float)((h[var5].d - j + 1) * var6), var4);
            }
         } else {
            m.a(var0, h[var5].b, var2, var3, 0.0F, 0.0F, 200.0F, (float)(h[var5].d * var6), var4);
         }
      }

   }

   private static void a(GL10 var0, String var1, h var2) {
      Paint.Align var13 = Align.LEFT;
      String var14 = var1.replace("\\n", "\n").replace('_', ' ');
      String[] var17 = var14.split("\n");
      String[] var19 = var14.split("\n");

      int var5;
      int var6;
      for(var5 = 0; var5 < var19.length; ++var5) {
         for(var6 = 0; var6 < var19[var5].length(); ++var6) {
            if (var19[var5].charAt(var6) == '|') {
               var19[var5] = var19[var5].substring(0, var6) + var19[var5].substring(var6 + 11);
            }
         }
      }

      i.setTextSize(26.0F);
      i.setColor(-1);
      i.setAntiAlias(true);
      Paint.Align var15 = Align.LEFT;
      i.setTextAlign(var15);
      int var9 = a(26.0F);
      var5 = 0;
      float var4 = (float)var9;
      float var3 = (float)Math.ceil((double)i.descent());

      for(var6 = 0; var6 < var17.length; ++var6) {
         var5 += (int)(a(var19[var6], 26.0F).a / var2.a + 1.0F) * var9;
      }

      Bitmap var18 = Bitmap.createBitmap((int)var2.a, var5 + var9, Config.ARGB_8888);
      var18.eraseColor(0);
      Canvas var16 = new Canvas(var18);
      var16.setBitmap(var18);
      var5 = 0;
      var6 = 0;
      var3 = var4 - var3;

      while(var6 < var17.length) {
         int var7 = 0;
         int var8 = var5;

         while(true) {
            var5 = 0;
            int var10;
            int var11;
            if (a(var19[var6], 26.0F).a <= var2.a) {
               if (!var17[var6].equals("") && var17[var6].charAt(0) == '|') {
                  var10 = Integer.parseInt(var17[var6].substring(1, 4));
                  var11 = Integer.parseInt(var17[var6].substring(4, 7));
                  var5 = Integer.parseInt(var17[var6].substring(7, 10));
                  i.setColor(Color.rgb(var10, var11, var5));
                  var17[var6] = var17[var6].substring(11);
               }

               var16.drawText(var17[var6], 0.0F, (float)(var9 * var7) + var3, i);
               var5 = var8 + 1;
               var3 += (float)((var7 + 1) * var9);
               ++var6;
               i.setColor(-1);
               break;
            }

            while(a(var19[var6].substring(0, var5 + 1), 26.0F).a <= var2.a) {
               if (!var17[var6].equals("")) {
                  if (var17[var6].charAt(var5) == '|') {
                     var11 = Integer.parseInt(var17[var6].substring(var5 + 1, var5 + 4));
                     int var12 = Integer.parseInt(var17[var6].substring(var5 + 4, var5 + 7));
                     var10 = Integer.parseInt(var17[var6].substring(var5 + 7, var5 + 10));
                     i.setColor(Color.rgb(var11, var12, var10));
                     var17[var6] = var17[var6].substring(0, var5) + var17[var6].substring(var5 + 11);
                  } else {
                     ++var5;
                  }
               } else {
                  ++var5;
               }
            }

            i.setTextAlign(var15);
            var16.drawText(var17[var6].substring(0, var5), 0.0F, (float)(var9 * var7) + var3, i);
            var17[var6] = var17[var6].substring(var5);
            var19[var6] = var19[var6].substring(var5);
            ++var8;
            ++var7;
         }
      }

      k = var5;
      w.a(var0, var18, var14);
      var18.recycle();
   }

   private static void a(GL10 var0, String var1, h var2, float var3, int var4) {
      Paint.Align var17 = Align.LEFT;
      String var18 = var1.replace("\\n", "\n").replace('_', ' ');
      String[] var19 = var18.split("\n");
      String[] var20 = var18.split("\n");

      int var8;
      int var9;
      for(var8 = 0; var8 < var20.length; ++var8) {
         for(var9 = 0; var9 < var20[var8].length(); ++var9) {
            if (var20[var8].charAt(var9) == '|') {
               var20[var8] = var20[var8].substring(0, var9) + var20[var8].substring(var9 + 11);
            }
         }
      }

      i.setTextSize(var3);
      i.setColor(-1);
      i.setAntiAlias(true);
      float var5 = 0.0F;
      Paint.Align var22;
      if (var4 != 0 && var4 != 5 && var4 != 7) {
         if (var4 != 1 && var4 != 6 && var4 != 8) {
            if (var4 != 4 && var4 != 9 && var4 != 10) {
               var22 = var17;
            } else {
               var22 = Align.CENTER;
               var5 = 0.0F + var2.a / 2.0F;
            }
         } else {
            var22 = Align.RIGHT;
            var5 = 0.0F + var2.a;
         }
      } else {
         var22 = Align.LEFT;
      }

      i.setTextAlign(var22);
      int var15 = a(var3);
      var8 = 0;
      float var6 = (float)var15;
      float var7 = (float)Math.ceil((double)i.descent());

      for(var4 = 0; var4 < var19.length; ++var4) {
         var8 += (int)(a(var20[var4], var3).a / var2.a + 1.0F) * var15;
      }

      Bitmap var23 = Bitmap.createBitmap((int)var2.a, var8 + var15, Config.ARGB_8888);
      var23.eraseColor(0);
      Canvas var21 = new Canvas(var23);
      var21.setBitmap(var23);
      var4 = 0;
      var9 = 0;
      int var12 = 0;
      var6 -= var7;

      int var11;
      for(int var10 = 0; var12 < var19.length; var4 = var11) {
         int var13 = 0;
         int var14 = var4;

         label86:
         while(true) {
            var11 = 0;
            var8 = var10;
            var4 = var9;
            if (a(var20[var12], var3).a <= var2.a) {
               if (!var19[var12].equals("") && var19[var12].charAt(0) == '|') {
                  var11 = Integer.parseInt(var19[var12].substring(1, 4));
                  var8 = Integer.parseInt(var19[var12].substring(4, 7));
                  var4 = Integer.parseInt(var19[var12].substring(7, 10));
                  i.setColor(Color.rgb(var11, var8, var4));
                  var19[var12] = var19[var12].substring(11);
               }

               i.setTextAlign(var22);
               var21.drawText(var19[var12], var5, (float)(var15 * var13) + var6, i);
               var11 = var14 + 1;
               break;
            }

            while(true) {
               while(true) {
                  while(a(var20[var12].substring(0, var11 + 1), var3).a <= var2.a) {
                     if (!var19[var12].equals("")) {
                        if (var19[var12].charAt(var11) == '|') {
                           var10 = Integer.parseInt(var19[var12].substring(var11 + 1, var11 + 4));
                           var9 = Integer.parseInt(var19[var12].substring(var11 + 4, var11 + 7));
                           int var16 = Integer.parseInt(var19[var12].substring(var11 + 7, var11 + 10));
                           i.setColor(Color.rgb(var10, var9, var16));
                           var19[var12] = var19[var12].substring(0, var11) + var19[var12].substring(var11 + 11);
                        } else {
                           var9 = var11 + 1;
                           var10 = var8;
                           if (var20[var12].substring(var9, var9 + 1).equals(" ")) {
                              var10 = var9;
                           }

                           var8 = var10;
                           var11 = var9;
                           if (a(var20[var12].substring(0, var9 + 1), var3).a > var2.a) {
                              if (!var20[var12].substring(var9 - 1, var9).equals(" ") && !var20[var12].substring(var9, var9 + 1).equals(" ")) {
                                 var4 = var10;
                                 var8 = var10;
                                 var11 = var9;
                              } else {
                                 var4 = var9;
                                 var8 = var10;
                                 var11 = var9;
                              }
                           }
                        }
                     } else {
                        ++var11;
                     }
                  }

                  i.setTextAlign(var22);
                  var21.drawText(var19[var12].substring(0, var4), var5, (float)(var15 * var13) + var6, i);
                  var19[var12] = var19[var12].substring(var4);
                  var20[var12] = var20[var12].substring(var4);
                  ++var14;
                  Log.d("asdfasdfasfd", var14 + "- 라인수" + var20[var12].toString());
                  var11 = var14;
                  var10 = var8;
                  var9 = var4;
                  if (var14 > 100) {
                     break label86;
                  }

                  ++var13;
                  var10 = var8;
                  var9 = var4;
                  continue label86;
               }
            }
         }

         var6 += (float)((var13 + 1) * var15);
         ++var12;
         i.setColor(-1);
      }

      k = var4;
      w.a(var0, var23, var18);
      var23.recycle();
   }

   private static void b(GL10 var0, String var1) {
      byte var4 = 0;
      int var3 = 0;

      int var2;
      while(true) {
         if (var3 >= 24) {
            for(var2 = 0; var2 < 23; ++var2) {
               for(var3 = var2 + 1; var3 < 24; ++var3) {
                  if (h[var2].c > h[var3].c) {
                     new w();
                     new String();
                     w var9 = h[var3].b;
                     String var8 = h[var3].a;
                     long var6 = h[var3].c;
                     int var5 = h[var3].d;
                     h[var3].b = h[var2].b;
                     h[var3].a = h[var2].a;
                     h[var3].c = h[var2].c;
                     h[var3].d = h[var2].d;
                     h[var2].b = var9;
                     h[var2].a = var8;
                     h[var2].c = var6;
                     h[var2].d = var5;
                  }
               }
            }

            var3 = a(h[0].a.toString());
            var2 = var4;
            if (var3 != 999) {
               h[var3].a = "";
               w.a(var0, h[var3].b);
               h[var3].b = null;
               h[var3].c = 0L;
               var2 = var4;
            }
            break;
         }

         var2 = var4;
         if (h[var3].a.equals("")) {
            break;
         }

         ++var3;
      }

      while(var2 < 24) {
         if (h[var2].a.equals("")) {
            h[var2].a = var1.toString();
            h[var2].b = w.a;
            h[var2].c = y.a();
            h[var2].d = k;
            break;
         }

         ++var2;
      }

   }

   private static void c(GL10 var0, String var1) {
      for(int var2 = 0; var2 < 24; ++var2) {
         if (h[var2].a.equals(var1)) {
            h[var2].a = "";
            w.a(var0, h[var2].b);
            h[var2].b = null;
            h[var2].c = 0L;
            h[var2].d = 1;
            break;
         }
      }

   }

   public static void d(GL10 var0) {
      v[] var3 = h;
      int var2 = var3.length;

      for(int var1 = 0; var1 < var2; ++var1) {
         v var4 = var3[var1];
         var4.a = "";
         w.a(var0, var4.b);
         var4.b = null;
         var4.c = 0L;
         var4.d = 1;
      }

   }
}

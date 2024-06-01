package fishing4.a;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Bitmap.Config;
import android.opengl.GLUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.microedition.khronos.opengles.GL10;

public class w {
   public static w a;
   public static ArrayList b;
   static final boolean g;
   public h c;
   public h d;
   public String e;
   public int f;

   static {
      boolean var0;
      if (!w.class.desiredAssertionStatus()) {
         var0 = true;
      } else {
         var0 = false;
      }

      g = var0;
      b = new ArrayList();
   }

   private static int a(int var0) {
      byte var2 = 1;
      int var1 = var0;
      if (var0 != 1) {
         var1 = var0;
         if ((var0 - 1 & var0) != 0) {
            for(var1 = var2; var1 < var0; var1 *= 2) {
            }
         }
      }

      return var1;
   }

   public static w a(GL10 var0) {
      w var6 = new w();
      h var7 = h.a((float)t.v.getWidth(), (float)t.v.getHeight());
      h var5 = h.a((float)t.v.getWidth(), (float)t.v.getHeight());
      int var1 = a((int)var7.a);
      int var3 = a((int)var7.b);

      boolean var2;
      for(var2 = false; var1 > 1024 || var3 > 1024; var2 = true) {
         var1 /= 2;
         var3 /= 2;
         var7.a *= 0.5F;
         var7.b *= 0.5F;
      }

      Bitmap var4;
      if (var2) {
         var4 = Bitmap.createScaledBitmap(t.v, (int)var7.a, (int)var7.b, false);
         t.v.recycle();
         t.v = var4;
      }

      if (var7.a != (float)var1 || var7.b != (float)var3) {
         Bitmap.Config var8;
         if (t.v.hasAlpha()) {
            var8 = Config.ARGB_8888;
         } else {
            var8 = Config.RGB_565;
         }

         var4 = Bitmap.createBitmap(var1, var3, var8);
         (new Canvas(var4)).drawBitmap(t.v, 0.0F, 0.0F, (Paint)null);
         t.v.recycle();
         t.v = var4;
      }

      int[] var9 = new int[1];
      var0.glGenTextures(1, var9, 0);
      var0.glBindTexture(3553, var9[0]);
      var0.glTexParameterf(3553, 10241, 9729.0F);
      var0.glTexParameterf(3553, 10240, 9729.0F);
      var0.glTexParameterf(3553, 10242, 33071.0F);
      var0.glTexParameterf(3553, 10243, 33071.0F);
      GLUtils.texImage2D(3553, 0, t.v, 0);
      var0.glEnable(3042);
      var6.f = var9[0];
      var6.c = var5;
      var6.d = h.a((float)t.v.getWidth(), (float)t.v.getHeight());
      var6.e = "img/pnj/banner.png";
      return var6;
   }

   public static w a(GL10 var0, String var1) {
      boolean var4 = false;
      if (!g && var1 == null) {
         throw new AssertionError("TextureMgr: path must not be null");
      } else {
         w var7 = new w();

         label88: {
            IOException var10000;
            label87: {
               int var2;
               int var3;
               Bitmap var5;
               h var8;
               h var9;
               boolean var10001;
               try {
                  InputStream var6 = GLRootView.getAppContext().getAssets().open(var1);
                  var5 = BitmapFactory.decodeStream(var6);
                  var6.close();
                  var9 = h.a((float)var5.getWidth(), (float)var5.getHeight());
                  var8 = h.a((float)var5.getWidth(), (float)var5.getHeight());
                  var3 = a((int)var9.a);
                  var2 = a((int)var9.b);
               } catch (IOException var18) {
                  var10000 = var18;
                  var10001 = false;
                  break label87;
               }

               while(true) {
                  if (var3 <= 1024 && var2 <= 1024) {
                     Bitmap var20;
                     if (var4) {
                        try {
                           var20 = Bitmap.createScaledBitmap(var5, (int)var9.a, (int)var9.b, false);
                           var5.recycle();
                        } catch (IOException var16) {
                           var10000 = var16;
                           var10001 = false;
                           break;
                        }

                        var5 = var20;
                     }

                     label96: {
                        label97: {
                           try {
                              if (var9.a != (float)var3) {
                                 break label97;
                              }
                           } catch (IOException var15) {
                              var10000 = var15;
                              var10001 = false;
                              break;
                           }

                           var20 = var5;

                           try {
                              if (var9.b == (float)var2) {
                                 break label96;
                              }
                           } catch (IOException var14) {
                              var10000 = var14;
                              var10001 = false;
                              break;
                           }
                        }

                        Bitmap.Config var22;
                        label98: {
                           try {
                              if (var5.hasAlpha()) {
                                 var22 = Config.ARGB_8888;
                                 break label98;
                              }
                           } catch (IOException var13) {
                              var10000 = var13;
                              var10001 = false;
                              break;
                           }

                           try {
                              var22 = Config.RGB_565;
                           } catch (IOException var12) {
                              var10000 = var12;
                              var10001 = false;
                              break;
                           }
                        }

                        try {
                           var20 = Bitmap.createBitmap(var3, var2, var22);
                           Canvas var23 = new Canvas(var20);
                           var23.drawBitmap(var5, 0.0F, 0.0F, (Paint)null);
                           var5.recycle();
                        } catch (IOException var11) {
                           var10000 = var11;
                           var10001 = false;
                           break;
                        }
                     }

                     try {
                        int[] var21 = new int[1];
                        var0.glGenTextures(1, var21, 0);
                        var0.glBindTexture(3553, var21[0]);
                        var0.glTexParameterf(3553, 10241, 9729.0F);
                        var0.glTexParameterf(3553, 10240, 9729.0F);
                        var0.glTexParameterf(3553, 10242, 33071.0F);
                        var0.glTexParameterf(3553, 10243, 33071.0F);
                        GLUtils.texImage2D(3553, 0, var20, 0);
                        var0.glEnable(3042);
                        var7.f = var21[0];
                        var7.c = var8;
                        var7.d = h.a((float)var20.getWidth(), (float)var20.getHeight());
                        var7.e = var1;
                        var20.recycle();
                        break label88;
                     } catch (IOException var10) {
                        var10000 = var10;
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     var3 /= 2;
                     var2 /= 2;
                     var9.a *= 0.5F;
                     var9.b *= 0.5F;
                  } catch (IOException var17) {
                     var10000 = var17;
                     var10001 = false;
                     break;
                  }

                  var4 = true;
               }
            }

            IOException var19 = var10000;
            var19.printStackTrace();
         }

         b.add(var7);
         return var7;
      }
   }

   public static void a(GL10 var0, Bitmap var1, String var2) {
      w var9 = new w();
      h var10 = h.a((float)var1.getWidth(), (float)var1.getHeight());
      h var8 = h.a((float)var1.getWidth(), (float)var1.getHeight());
      int var4 = a((int)var10.a);
      int var3 = a((int)var10.b);

      boolean var5;
      for(var5 = false; var4 > 1024 || var3 > 1024; var5 = true) {
         var4 /= 2;
         var3 /= 2;
         var10.a *= 0.5F;
         var10.b *= 0.5F;
      }

      Bitmap var6;
      if (var5) {
         var6 = Bitmap.createScaledBitmap(var1, (int)var10.a, (int)var10.b, false);
         var1.recycle();
      } else {
         var6 = var1;
      }

      Bitmap var7;
      label35: {
         if (var10.a == (float)var4) {
            var7 = var6;
            if (var10.b == (float)var3) {
               break label35;
            }
         }

         Bitmap.Config var12;
         if (var6.hasAlpha()) {
            var12 = Config.ARGB_8888;
         } else {
            var12 = Config.RGB_565;
         }

         var7 = Bitmap.createBitmap(var4, var3, var12);
         (new Canvas(var7)).drawBitmap(var6, 0.0F, 0.0F, (Paint)null);
         var6.recycle();
      }

      int[] var11 = new int[1];
      var0.glGenTextures(1, var11, 0);
      var0.glBindTexture(3553, var11[0]);
      var0.glTexParameterf(3553, 10241, 9729.0F);
      var0.glTexParameterf(3553, 10240, 9729.0F);
      var0.glTexParameterf(3553, 10242, 33071.0F);
      var0.glTexParameterf(3553, 10243, 33071.0F);
      GLUtils.texImage2D(3553, 0, var7, 0);
      var0.glEnable(3042);
      var9.f = var11[0];
      var9.c = var8;
      var9.d = h.a((float)var7.getWidth(), (float)var7.getHeight());
      var9.e = var2;
      b.add(var9);
      a = var9;
      var1.recycle();
   }

   public static void a(GL10 var0, w var1) {
      if (var1 != null && var1.f != 0) {
         b.remove(var1);
         var0.glDeleteTextures(1, new int[]{var1.f}, 0);
         var1.e = null;
         var1.f = 0;
         var1.d = null;
         var1.c = null;
      }

   }

   private static int b(GL10 var0, String var1) {
      byte var5 = 0;
      if (!g && var1 == null) {
         throw new AssertionError("TextureMgr: path must not be null");
      } else {
         int var19;
         int[] var20;
         label110: {
            IOException var10000;
            label98: {
               int var3;
               int var4;
               h var7;
               boolean var10001;
               Bitmap var18;
               try {
                  InputStream var6 = GLRootView.getAppContext().getAssets().open(var1);
                  var18 = BitmapFactory.decodeStream(var6);
                  var6.close();
                  var7 = h.a((float)var18.getWidth(), (float)var18.getHeight());
                  var3 = a((int)var7.a);
                  var4 = a((int)var7.b);
               } catch (IOException var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label98;
               }

               boolean var2 = false;

               while(true) {
                  if (var3 <= 1024 && var4 <= 1024) {
                     Bitmap var21;
                     if (var2) {
                        try {
                           var21 = Bitmap.createScaledBitmap(var18, (int)var7.a, (int)var7.b, false);
                           var18.recycle();
                        } catch (IOException var14) {
                           var10000 = var14;
                           var10001 = false;
                           break;
                        }

                        var18 = var21;
                     }

                     label101: {
                        label102: {
                           try {
                              if (var7.a != (float)var3) {
                                 break label102;
                              }
                           } catch (IOException var13) {
                              var10000 = var13;
                              var10001 = false;
                              break;
                           }

                           var21 = var18;

                           try {
                              if (var7.b == (float)var4) {
                                 break label101;
                              }
                           } catch (IOException var12) {
                              var10000 = var12;
                              var10001 = false;
                              break;
                           }
                        }

                        Bitmap.Config var22;
                        label103: {
                           try {
                              if (var18.hasAlpha()) {
                                 var22 = Config.ARGB_8888;
                                 break label103;
                              }
                           } catch (IOException var11) {
                              var10000 = var11;
                              var10001 = false;
                              break;
                           }

                           try {
                              var22 = Config.RGB_565;
                           } catch (IOException var10) {
                              var10000 = var10;
                              var10001 = false;
                              break;
                           }
                        }

                        try {
                           var21 = Bitmap.createBitmap(var3, var4, var22);
                           Canvas var23 = new Canvas(var21);
                           var23.drawBitmap(var18, 0.0F, 0.0F, (Paint)null);
                           var18.recycle();
                        } catch (IOException var9) {
                           var10000 = var9;
                           var10001 = false;
                           break;
                        }
                     }

                     try {
                        var20 = new int[1];
                        var0.glGenTextures(1, var20, 0);
                        var0.glBindTexture(3553, var20[0]);
                        var0.glTexParameterf(3553, 10241, 9729.0F);
                        var0.glTexParameterf(3553, 10240, 9729.0F);
                        var0.glTexParameterf(3553, 10242, 33071.0F);
                        var0.glTexParameterf(3553, 10243, 33071.0F);
                        GLUtils.texImage2D(3553, 0, var21, 0);
                        var0.glEnable(3042);
                        var21.recycle();
                        break label110;
                     } catch (IOException var8) {
                        var10000 = var8;
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     var3 /= 2;
                     var4 /= 2;
                     var7.a *= 0.5F;
                     var7.b *= 0.5F;
                  } catch (IOException var15) {
                     var10000 = var15;
                     var10001 = false;
                     break;
                  }

                  var2 = true;
               }
            }

            IOException var17 = var10000;
            var17.printStackTrace();
            var19 = var5;
            return var19;
         }

         var19 = var20[0];
         return var19;
      }
   }

   public static void b(GL10 var0) {
      int[] var2 = new int[1];

      w var1;
      for(Iterator var3 = b.iterator(); var3.hasNext(); var1.f = 0) {
         var1 = (w)var3.next();
         var2[0] = var1.f;
         var0.glDeleteTextures(1, var2, 0);
      }

      ae.d(var0);
      if (t.j != null && t.j.f != 0) {
         var2[0] = t.j.f;
         var0.glDeleteTextures(1, var2, 0);
         t.j.f = 0;
      }

      System.gc();
   }

   public static void c(GL10 var0) {
      Iterator var2 = b.iterator();

      while(var2.hasNext()) {
         w var1 = (w)var2.next();
         if (var1.e.length() > 4 && var1.e.substring(0, 4).equals("img/")) {
            var1.f = b(var0, var1.e);
            Log.d("asdasdasd", "Filepath(" + var1.e + ") ReloadTexID(" + var1.f + ")");
         }
      }

      if (t.v != null) {
         if (t.j != null) {
            h var4 = t.j.c;
            a(var0, t.j);
            t.j = null;
            t.j = new w();
            w var3 = a(var0);
            t.j = var3;
            var3.c.a(var4);
         } else {
            t.j = new w();
            t.j = a(var0);
         }
      }

   }
}

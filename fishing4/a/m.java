package fishing4.a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;

import fishing4.game.globalConfig;

public final class m {
   public static int widthPixels;
   public static int heightPixels;
   public static int width;
   public static int height;
   public static boolean e = false;
   public static e f = fishing4.a.e.a();
   public static int g = 0;
   public static FloatBuffer h;
   public static FloatBuffer i;
   private static float halfWidthPixels;
   private static float halfHeightPixels;

   public static int getWidthPixels() {
      return widthPixels;
   }

   private static void a(float var0, float var1) {
      float[] var2 = new float[]{-var0 / 2.0F, -var1 / 2.0F, 0.0F, var0 / 2.0F, -var1 / 2.0F, 0.0F, -var0 / 2.0F, var1 / 2.0F, 0.0F, var0 / 2.0F, var1 / 2.0F, 0.0F};
      ByteBuffer byteBuffer = ByteBuffer.allocateDirect(var2.length * 4);
      byteBuffer.order(ByteOrder.nativeOrder());
      FloatBuffer floatBuffer = byteBuffer.asFloatBuffer();
      h = floatBuffer;
      floatBuffer.put(var2);
      h.position(0);
   }

   public static void a(GL10 glContext) {
      boolean var1 = true;
      width = widthPixels;
      height = heightPixels;
      globalConfig.k = 73;
      if (widthPixels != 480) {
         if (widthPixels != 540 && widthPixels != 960) {
            if (widthPixels != 600 && widthPixels != 1024) {
               if (widthPixels != 720 && widthPixels != 1280) {
                  if ((widthPixels != 800 || heightPixels != 1232) && (widthPixels != 1232 || heightPixels != 800)) {
                     widthPixels = 480;
                     heightPixels = 800;
                  } else {
                     globalConfig.k = 61;
                     widthPixels = 480;
                     heightPixels = 768;
                  }
               } else {
                  widthPixels = 480;
                  heightPixels = 854;
               }
            } else {
               widthPixels = 480;
               heightPixels = 818;
            }
         } else {
            widthPixels = 480;
            heightPixels = 854;
         }
      } else {
         var1 = false;
      }

      halfWidthPixels = (float)(widthPixels / 2);
      halfHeightPixels = (float)(heightPixels / 2);
      glContext.glViewport(0, 0, width, height);
      glContext.glMatrixMode(5889);
      glContext.glLoadIdentity();
      if (var1) {
         glContext.glOrthof((float)(-width / 2 * widthPixels / width), (float)(width / 2 * widthPixels / width), (float)(-height / 2 * heightPixels / height), (float)(height / 2 * heightPixels / height), -1.0F, 1.0F);
      } else {
         glContext.glOrthof(-halfWidthPixels, halfWidthPixels, -halfHeightPixels, halfHeightPixels, -1.0F, 1.0F);
      }

      glContext.glMatrixMode(5888);
      glContext.glLoadIdentity();
      glContext.glDisable(3024);
      glContext.glEnable(3553);
      glContext.glShadeModel(7425);
      glContext.glClearDepthf(1.0F);
      glContext.glEnable(2929);
      glContext.glDepthFunc(515);
      glContext.glHint(3152, 4354);
      glContext.glBlendFunc(770, 771);
      glContext.glEnable(3042);
   }

   public static void a(GL10 var0, float var1, float var2, float var3, float var4, RGBColor var5) {
      float[] var7 = new float[]{-var3 / 2.0F, -var4 / 2.0F, 0.0F, var3 / 2.0F, -var4 / 2.0F, 0.0F, -var3 / 2.0F, var4 / 2.0F, 0.0F, var3 / 2.0F, var4 / 2.0F, 0.0F};
      FloatBuffer var6 = ByteBuffer.allocateDirect(var7.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
      var6.put(var7).position(0);
      var0.glLoadIdentity();
      var0.glTranslatef((float)((int)var1) - halfWidthPixels, (float)((int)var2) - halfHeightPixels, 0.0F);
      var0.glColor4f(var5.r, var5.g, var5.b, var5.a);
      var0.glDisable(3553);
      var0.glEnableClientState(32884);
      var0.glVertexPointer(3, 5126, 0, var6);
      var0.glDrawArrays(5, 0, 4);
      var0.glDisableClientState(32884);
      var0.glEnable(3553);
   }

   private static void a(GL10 var0, b var1) {
      var0.glBlendFunc(var1.a, var1.b);
   }

   public static void a(GL10 glContext, e var1, e var2, RGBColor var3) {
      float var4 = var1.a;
      float var6 = var1.b;
      float var5 = var2.a;
      float var7 = var2.b;
      float[] var9 = new float[]{var4, var6, 0.0F, var5, var7, 0.0F};
      FloatBuffer var8 = ByteBuffer.allocateDirect(var9.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
      var8.put(var9).position(0);
      glContext.glLoadIdentity();
      glContext.glTranslatef((float)((int)(-halfWidthPixels)), (float)((int)(-halfHeightPixels)), 0.0F);
      glContext.glColor4f(var3.r, var3.g, var3.b, var3.a);
      glContext.glDisable(3553);
      glContext.glEnableClientState(32884);
      glContext.glVertexPointer(3, 5126, 0, var8);
      glContext.glDrawArrays(3, 0, 2);
      glContext.glDisableClientState(32884);
      glContext.glEnable(3553);
   }

   public static void a(GL10 glContext, f var1) {
      glContext.glPushMatrix();
      glContext.glEnable(3089);
      if (width == widthPixels) {
         glContext.glScissor((int)var1.a.a, (int)var1.a.b, (int)var1.b.a, (int)var1.b.b);
      } else {
         glContext.glScissor((int)var1.a.a * width / widthPixels, (int)var1.a.b * height / heightPixels, (int)var1.b.a * width / widthPixels, (int)var1.b.b * height / heightPixels);
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3) {
      if (var1 != null) {
         a(glContext, var1, var2, var3, 0.0F, 0.0F, var1.c.a, var1.c.b, fishing4.a.g.a(), '\u0000', RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, char var4) {
      if (var1 != null) {
         a(glContext, var1, var2, var3, 0.0F, 0.0F, var1.c.a, var1.c.b, fishing4.a.g.a(), var4, RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      if (var1 != null) {
         a(glContext, var1, var2, var3, var4, var5, var6, var7, fishing4.a.g.a(), '\u0000', RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, float var4, float var5, float var6, float var7, char var8) {
      if (var1 != null) {
         a(glContext, var1, var2, var3, var4, var5, var6, var7, fishing4.a.g.a(), var8, RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, float var4, float var5, float var6, float var7, char var8, int var9) {
      if (var1 != null) {
         int var10 = var9;
         if (var9 > 255) {
            var10 = 255;
         }

         a(glContext, var1, var2, var3, var4, var5, var6, var7, fishing4.a.g.a(), var8, RGBColor.getColor(1.0F, 1.0F, 1.0F, (float)var10 / 255.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, float var4, float var5, float var6, float var7, char var8, int var9, d var10) {
      if (var1 != null) {
         a(glContext, var1, var2, var3, var4, var5, var6, var7, fishing4.a.g.a(), var8, RGBColor.getColor(1.0F, 1.0F, 1.0F, (float)var9 / 255.0F), var10);
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, float var4, float var5, float var6, float var7, char var8, d var9) {
      if (var1 != null) {
         a(glContext, var1, var2, var3, var4, var5, var6, var7, fishing4.a.g.a(), var8, RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F), var9);
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      if (var1 != null) {
         int var9 = var8;
         if (var8 > 255) {
            var9 = 255;
         }

         a(glContext, var1, var2, var3, var4, var5, var6, var7, fishing4.a.g.a(), '\u0000', RGBColor.getColor(1.0F, 1.0F, 1.0F, (float)var9 / 255.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, float var4, float var5, float var6, float var7, RGBColor var8) {
      if (var1 != null) {
         a(glContext, var1, var2, var3, var4, var5, var6, var7, fishing4.a.g.a(), '\u0000', var8, fishing4.a.d.a());
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, float var4, float var5, float var6, float var7, g var8) {
      if (var1 != null) {
         a(glContext, var1, var2, var3, var4, var5, var6, var7, var8, '\u0000', RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, float var4, float var5, float var6, float var7, g var8, char var9) {
      if (var1 != null) {
         a(glContext, var1, var2, var3, var4, var5, var6, var7, var8, var9, RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, float var4, float var5, float var6, float var7, g var8, char var9, RGBColor var10, d var11) {
      if (var1 != null && !(var2 - var6 > (float) widthPixels) && !(var3 - var7 > (float) heightPixels) && !(var2 + var6 < 0.0F) && !(var3 + var7 < 0.0F) && !(var6 <= 0.0F) && !(var7 <= 0.0F)) {
         float var12 = var6;
         if (var4 + var6 > var1.c.a) {
            var12 = var6 - (var4 + var6 - var1.c.a);
         }

         var6 = var7;
         if (var5 + var7 > var1.c.b) {
            var6 = var7 - (var5 + var7 - var1.c.b);
         }

         boolean var15;
         if (var12 != 0.0F) {
            var15 = true;
         } else {
            var15 = false;
         }

         float var13;
         if (!var15) {
            var7 = 0.0F;
            var13 = 1.0F;
            var5 = 0.0F;
            var4 = 1.0F;
         } else {
            var7 = var4 / var1.d.a;
            var13 = (var4 + var12) / var1.d.a;
            float var14 = var5 / var1.d.b;
            var4 = (var5 + var6) / var1.d.b;
            var5 = var14;
         }

         float[] var16 = new float[]{var7, var4, var13, var4, var7, var5, var13, var5};
         ByteBuffer byteBuffer = ByteBuffer.allocateDirect(var16.length * 4);
         byteBuffer.order(ByteOrder.nativeOrder());
         FloatBuffer floatBuffer = byteBuffer.asFloatBuffer();
         i = floatBuffer;
         floatBuffer.put(var16);
         i.position(0);
         if (!var15) {
            a(var1.c.a, var1.c.b);
         } else {
            a(var12, var6);
         }

         glContext.glLoadIdentity();
         glContext.glTranslatef(var2 - halfWidthPixels, var3 - halfHeightPixels, 0.0F);
         if (var11.c != 0.0F) {
            glContext.glRotatef(-var11.c, 0.0F, 0.0F, 1.0F);
         }

         glContext.glTranslatef(-var12 * (0.5F - var11.a), -var6 * (0.5F - var11.b), 0.0F);
         glContext.glScalef(var8.a, var8.b, 1.0F);
         if (var9 != 0) {
            glContext.glColor4f(var10.r * var10.a, var10.g * var10.a, var10.b * var10.a, var10.a * var10.a);
         } else {
            glContext.glColor4f(var10.r, var10.g, var10.b, var10.a);
         }

         switch (var9) {
            case '\u0001':
               a(glContext, fishing4.a.b.f);
               break;
            case '\u0002':
               a(glContext, fishing4.a.b.g);
               break;
            case '\u0003':
               a(glContext, fishing4.a.b.j);
               break;
            case '\u0004':
               a(glContext, fishing4.a.b.i);
               break;
            case '\u0005':
               a(glContext, fishing4.a.b.e);
            case '\u0006':
            case '\u0007':
            default:
               break;
            case '\b':
               a(glContext, fishing4.a.b.k);
               break;
            case '\t':
               a(glContext, fishing4.a.b.l);
         }

         glContext.glBindTexture(3553, var1.f);
         glContext.glFrontFace(2305);
         glContext.glEnableClientState(32884);
         glContext.glEnableClientState(32888);
         glContext.glVertexPointer(3, 5126, 0, h);
         glContext.glTexCoordPointer(2, 5126, 0, i);
         glContext.glDrawArrays(5, 0, 4);
         glContext.glDisableClientState(32884);
         glContext.glEnableClientState(32888);
         a(glContext, fishing4.a.b.c);
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, float var4, float var5, float var6, float var7, g var8, char var9, d var10) {
      if (var1 != null) {
         a(glContext, var1, var2, var3, var4, var5, var6, var7, var8, var9, RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F), var10);
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, float var4, float var5, float var6, float var7, g var8, int var9) {
      if (var1 != null) {
         int var10 = var9;
         if (var9 > 255) {
            var10 = 255;
         }

         a(glContext, var1, var2, var3, var4, var5, var6, var7, var8, '\u0000', RGBColor.getColor(1.0F, 1.0F, 1.0F, (float)var10 / 255.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, float var4, float var5, float var6, float var7, g var8, d var9) {
      if (var1 != null) {
         a(glContext, var1, var2, var3, var4, var5, var6, var7, var8, '\u0000', RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F), var9);
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, float var4, RGBColor var5, d var6) {
      if (var1 != null) {
         a(glContext, var1, var2, var3, 926.0F, 61.0F, 56.0F, var4, fishing4.a.g.a(), '\u0000', var5, var6);
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, int var4) {
      if (var1 != null) {
         int var5 = var4;
         if (var4 > 255) {
            var5 = 255;
         }

         a(glContext, var1, var2, var3, 0.0F, 0.0F, var1.c.a, var1.c.b, fishing4.a.g.a(), '\u0000', RGBColor.getColor(1.0F, 1.0F, 1.0F, (float)var5 / 255.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, d var4) {
      if (var1 != null) {
         a(glContext, var1, var2, var3, 0.0F, 0.0F, var1.c.a, var1.c.b, fishing4.a.g.a(), '\u0000', RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F), var4);
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, f var4) {
      if (var1 != null) {
         g var5 = fishing4.a.g.a();
         RGBColor var7 = RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F);
         d var6 = fishing4.a.d.a();
         a(glContext, var1, var2, var3, var4.a.a, var4.a.b, var4.b.a, var4.b.b, var5, '\u0000', var7, var6);
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, f var4, char var5) {
      if (var1 != null) {
         g var8 = fishing4.a.g.a();
         RGBColor var6 = RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F);
         d var7 = fishing4.a.d.a();
         a(glContext, var1, var2, var3, var4.a.a, var4.a.b, var4.b.a, var4.b.b, var8, var5, var6, var7);
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, f var4, int var5) {
      if (var1 != null) {
         int var6 = var5;
         if (var5 > 255) {
            var6 = 255;
         }

         g var7 = fishing4.a.g.a();
         RGBColor var8 = RGBColor.getColor(1.0F, 1.0F, 1.0F, (float)var6 / 255.0F);
         d var9 = fishing4.a.d.a();
         a(glContext, var1, var2, var3, var4.a.a, var4.a.b, var4.b.a, var4.b.b, var7, '\u0000', var8, var9);
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, f var4, RGBColor var5) {
      if (var1 != null) {
         g var6 = fishing4.a.g.a();
         d var7 = fishing4.a.d.a();
         a(glContext, var1, var2, var3, var4.a.a, var4.a.b, var4.b.a, var4.b.b, var6, '\u0000', var5, var7);
      }

   }

   public static void a(GL10 glContext, w var1, float var2, float var3, g var4) {
      if (var1 != null) {
         a(glContext, var1, var2, var3, 0.0F, 0.0F, var1.c.a, var1.c.b, var4, '\u0000', RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 glContext, w var1, float var2, f var3, char var4, d var5) {
      if (var1 != null) {
         g var7 = fishing4.a.g.a();
         RGBColor var6 = RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F);
         a(glContext, var1, var2, 0.0F, var3.a.a, var3.a.b, var3.b.a, var3.b.b, var7, var4, var6, var5);
      }

   }

   public static void a(GL10 glContext, w var1, float var2, f var3, d var4) {
      if (var1 != null) {
         g var6 = fishing4.a.g.a();
         RGBColor color = RGBColor.getColor(1.0F, 1.0F, 1.0F, 0.7058824F);
         a(glContext, var1, var2, 0.0F, var3.a.a, var3.a.b, var3.b.a, var3.b.b, var6, '\u0000', color, var4);
      }

   }

   public static void a(GL10 glContext, w var1, e var2, char var3, int alpha) {
      if (var1 != null) {
         int clampedAlpha = alpha;
         if (alpha > 255) {
            clampedAlpha = 255;
         }

         float var6 = var1.c.a;
         float var5 = var1.c.b;
         g var8 = fishing4.a.g.a();
         RGBColor color = RGBColor.getColor(1.0F, 1.0F, 1.0F, (float)clampedAlpha / 255.0F);
         d var9 = fishing4.a.d.a();
         a(glContext, var1, var2.a, var2.b, 0.0F, 0.0F, var6, var5, var8, var3, color, var9);
      }

   }

   public static void a(GL10 glContext, w var1, e var2, int alpha) {
      if (var1 != null) {
         int clampedAlpha = alpha;
         if (alpha > 255) {
            clampedAlpha = 255;
         }

         float var5 = var1.c.a;
         float var4 = var1.c.b;
         g var7 = fishing4.a.g.a();
         RGBColor color = RGBColor.getColor(1.0F, 1.0F, 1.0F, (float)clampedAlpha / 255.0F);
         d var8 = fishing4.a.d.a();
         a(glContext, var1, var2.a, var2.b, 0.0F, 0.0F, var5, var4, var7, '\u0000', color, var8);
      }

   }

   public static void a(GL10 glContext, w var1, e var2, f var3) {
      if (var1 != null) {
         g var4 = fishing4.a.g.a();
         RGBColor color = RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F);
         d var6 = fishing4.a.d.a();
         a(glContext, var1, var2.a, var2.b, var3.a.a, var3.a.b, var3.b.a, var3.b.b, var4, '\u0000', color, var6);
      }

   }

   public static void a(GL10 glContext, w var1, e var2, f var3, char var4) {
      if (var1 != null) {
         g var6 = fishing4.a.g.a();
         RGBColor color = RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F);
         d var5 = fishing4.a.d.a();
         a(glContext, var1, var2.a, var2.b, var3.a.a, var3.a.b, var3.b.a, var3.b.b, var6, var4, color, var5);
      }

   }

   public static void a(GL10 glContext, w var1, e var2, f var3, int alpha) {
      if (var1 != null) {
         int clampedAlpha = alpha;
         if (alpha > 255) {
            clampedAlpha = 255;
         }

         g var8 = fishing4.a.g.a();
         RGBColor color = RGBColor.getColor(1.0F, 1.0F, 1.0F, (float)clampedAlpha / 255.0F);
         d var7 = fishing4.a.d.a();
         a(glContext, var1, var2.a, var2.b, var3.a.a, var3.a.b, var3.b.a, var3.b.b, var8, '\u0000', color, var7);
      }

   }

   public static void a(GL10 glContext, w var1, e var2, f var3, RGBColor color, d var5) {
      if (var1 != null) {
         g var6 = fishing4.a.g.a();
         a(glContext, var1, var2.a, var2.b, var3.a.a, var3.a.b, var3.b.a, var3.b.b, var6, '\u0000', color, var5);
      }

   }

   public static void a(GL10 glContext, w var1, e var2, f var3, d var4) {
      if (var1 != null) {
         g var5 = fishing4.a.g.a();
         RGBColor color = RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F);
         a(glContext, var1, var2.a, var2.b, var3.a.a, var3.a.b, var3.b.a, var3.b.b, var5, '\u0000', color, var4);
      }

   }

   public static void a(GL10 glContext, w var1, e var2, f var3, g var4) {
      if (var1 != null) {
         RGBColor color = RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F);
         d var6 = fishing4.a.d.a();
         a(glContext, var1, var2.a, var2.b, var3.a.a, var3.a.b, var3.b.a, var3.b.b, var4, '\u0001', color, var6);
      }

   }

   public static void a(GL10 glContext, w var1, e var2, f var3, g var4, int alpha) {
      if (var1 != null) {
         int clampedAlpha = alpha;
         if (alpha > 255) {
            clampedAlpha = 255;
         }

         RGBColor var7 = RGBColor.getColor(1.0F, 1.0F, 1.0F, (float)clampedAlpha / 255.0F);
         d var8 = fishing4.a.d.a();
         a(glContext, var1, var2.a, var2.b, var3.a.a, var3.a.b, var3.b.a, var3.b.b, var4, '\u0000', var7, var8);
      }

   }

   public static void a(GL10 glContext, w var1, e var2, f var3, g var4, d var5) {
      if (var1 != null) {
         RGBColor color = RGBColor.getColor(1.0F, 1.0F, 1.0F, 1.0F);
         a(glContext, var1, var2.a, var2.b, var3.a.a, var3.a.b, var3.b.a, var3.b.b, var4, '\u0002', color, var5);
      }

   }

   public static int getHeightPixels() {
      return heightPixels;
   }

   public static void b(GL10 glContext) {
      glContext.glDisable(3089);
      glContext.glPopMatrix();
   }

   public static void b(GL10 glContext, w var1, float var2, float var3, float var4, float var5, float var6, float var7, g var8, int alpha) {
      if (var1 != null) {
         a(glContext, var1, var2, var3, var4, var5, var6, var7, var8, '\u0001', RGBColor.getColor(1.0F, 1.0F, 1.0F, (float)alpha / 255.0F), fishing4.a.d.a());
      }

   }

   public static void b(GL10 glContext, w var1, float var2, float var3, int alpha) {
      if (var1 != null) {
         a(glContext, var1, var2, var3, 0.0F, 0.0F, var1.c.a, var1.c.b, fishing4.a.g.a(), '\u0001', RGBColor.getColor(1.0F, 1.0F, 1.0F, (float)alpha / 255.0F), fishing4.a.d.a());
      }

   }

   public static float getHalfWidthPixels() {
      return halfWidthPixels;
   }

   public static float getHalfHeightPixels() {
      return halfHeightPixels;
   }

   public static e e() {
      return fishing4.a.e.a(halfWidthPixels, halfHeightPixels);
   }
}

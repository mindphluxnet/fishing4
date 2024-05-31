package fishing4.a;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;

import fishing4.game.globalConfig;

public final class m {
   public static int a;
   public static int b;
   public static int c;
   public static int d;
   public static boolean e = false;
   public static e f = fishing4.a.e.a();
   public static int g = 0;
   public static FloatBuffer h;
   public static FloatBuffer i;
   private static float j;
   private static float k;

   public static int a() {
      return a;
   }

   private static void a(float var0, float var1) {
      float[] var2 = new float[]{-var0 / 2.0F, -var1 / 2.0F, 0.0F, var0 / 2.0F, -var1 / 2.0F, 0.0F, -var0 / 2.0F, var1 / 2.0F, 0.0F, var0 / 2.0F, var1 / 2.0F, 0.0F};
      ByteBuffer var3 = ByteBuffer.allocateDirect(var2.length * 4);
      var3.order(ByteOrder.nativeOrder());
      FloatBuffer var4 = var3.asFloatBuffer();
      h = var4;
      var4.put(var2);
      h.position(0);
   }

   public static void a(GL10 var0) {
      boolean var1 = true;
      c = a;
      d = b;
      globalConfig.k = 73;
      if (a != 480) {
         if (a != 540 && a != 960) {
            if (a != 600 && a != 1024) {
               if (a != 720 && a != 1280) {
                  if ((a != 800 || b != 1232) && (a != 1232 || b != 800)) {
                     a = 480;
                     b = 800;
                  } else {
                     globalConfig.k = 61;
                     a = 480;
                     b = 768;
                  }
               } else {
                  a = 480;
                  b = 854;
               }
            } else {
               a = 480;
               b = 818;
            }
         } else {
            a = 480;
            b = 854;
         }
      } else {
         var1 = false;
      }

      j = (float)(a / 2);
      k = (float)(b / 2);
      var0.glViewport(0, 0, c, d);
      var0.glMatrixMode(5889);
      var0.glLoadIdentity();
      if (var1) {
         var0.glOrthof((float)(-c / 2 * a / c), (float)(c / 2 * a / c), (float)(-d / 2 * b / d), (float)(d / 2 * b / d), -1.0F, 1.0F);
      } else {
         var0.glOrthof(-j, j, -k, k, -1.0F, 1.0F);
      }

      var0.glMatrixMode(5888);
      var0.glLoadIdentity();
      var0.glDisable(3024);
      var0.glEnable(3553);
      var0.glShadeModel(7425);
      var0.glClearDepthf(1.0F);
      var0.glEnable(2929);
      var0.glDepthFunc(515);
      var0.glHint(3152, 4354);
      var0.glBlendFunc(770, 771);
      var0.glEnable(3042);
   }

   public static void a(GL10 var0, float var1, float var2, float var3, float var4, aa var5) {
      float[] var7 = new float[]{-var3 / 2.0F, -var4 / 2.0F, 0.0F, var3 / 2.0F, -var4 / 2.0F, 0.0F, -var3 / 2.0F, var4 / 2.0F, 0.0F, var3 / 2.0F, var4 / 2.0F, 0.0F};
      FloatBuffer var6 = ByteBuffer.allocateDirect(var7.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
      var6.put(var7).position(0);
      var0.glLoadIdentity();
      var0.glTranslatef((float)((int)var1) - j, (float)((int)var2) - k, 0.0F);
      var0.glColor4f(var5.a, var5.b, var5.c, var5.d);
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

   public static void a(GL10 var0, e var1, e var2, aa var3) {
      float var4 = var1.a;
      float var6 = var1.b;
      float var5 = var2.a;
      float var7 = var2.b;
      float[] var9 = new float[]{var4, var6, 0.0F, var5, var7, 0.0F};
      FloatBuffer var8 = ByteBuffer.allocateDirect(var9.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
      var8.put(var9).position(0);
      var0.glLoadIdentity();
      var0.glTranslatef((float)((int)(-j)), (float)((int)(-k)), 0.0F);
      var0.glColor4f(var3.a, var3.b, var3.c, var3.d);
      var0.glDisable(3553);
      var0.glEnableClientState(32884);
      var0.glVertexPointer(3, 5126, 0, var8);
      var0.glDrawArrays(3, 0, 2);
      var0.glDisableClientState(32884);
      var0.glEnable(3553);
   }

   public static void a(GL10 var0, f var1) {
      var0.glPushMatrix();
      var0.glEnable(3089);
      if (c == a) {
         var0.glScissor((int)var1.a.a, (int)var1.a.b, (int)var1.b.a, (int)var1.b.b);
      } else {
         var0.glScissor((int)var1.a.a * c / a, (int)var1.a.b * d / b, (int)var1.b.a * c / a, (int)var1.b.b * d / b);
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3) {
      if (var1 != null) {
         a(var0, var1, var2, var3, 0.0F, 0.0F, var1.c.a, var1.c.b, fishing4.a.g.a(), '\u0000', aa.a(1.0F, 1.0F, 1.0F, 1.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, char var4) {
      if (var1 != null) {
         a(var0, var1, var2, var3, 0.0F, 0.0F, var1.c.a, var1.c.b, fishing4.a.g.a(), var4, aa.a(1.0F, 1.0F, 1.0F, 1.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      if (var1 != null) {
         a(var0, var1, var2, var3, var4, var5, var6, var7, fishing4.a.g.a(), '\u0000', aa.a(1.0F, 1.0F, 1.0F, 1.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, float var4, float var5, float var6, float var7, char var8) {
      if (var1 != null) {
         a(var0, var1, var2, var3, var4, var5, var6, var7, fishing4.a.g.a(), var8, aa.a(1.0F, 1.0F, 1.0F, 1.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, float var4, float var5, float var6, float var7, char var8, int var9) {
      if (var1 != null) {
         int var10 = var9;
         if (var9 > 255) {
            var10 = 255;
         }

         a(var0, var1, var2, var3, var4, var5, var6, var7, fishing4.a.g.a(), var8, aa.a(1.0F, 1.0F, 1.0F, (float)var10 / 255.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, float var4, float var5, float var6, float var7, char var8, int var9, d var10) {
      if (var1 != null) {
         a(var0, var1, var2, var3, var4, var5, var6, var7, fishing4.a.g.a(), var8, aa.a(1.0F, 1.0F, 1.0F, (float)var9 / 255.0F), var10);
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, float var4, float var5, float var6, float var7, char var8, d var9) {
      if (var1 != null) {
         a(var0, var1, var2, var3, var4, var5, var6, var7, fishing4.a.g.a(), var8, aa.a(1.0F, 1.0F, 1.0F, 1.0F), var9);
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8) {
      if (var1 != null) {
         int var9 = var8;
         if (var8 > 255) {
            var9 = 255;
         }

         a(var0, var1, var2, var3, var4, var5, var6, var7, fishing4.a.g.a(), '\u0000', aa.a(1.0F, 1.0F, 1.0F, (float)var9 / 255.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, float var4, float var5, float var6, float var7, aa var8) {
      if (var1 != null) {
         a(var0, var1, var2, var3, var4, var5, var6, var7, fishing4.a.g.a(), '\u0000', var8, fishing4.a.d.a());
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, float var4, float var5, float var6, float var7, g var8) {
      if (var1 != null) {
         a(var0, var1, var2, var3, var4, var5, var6, var7, var8, '\u0000', aa.a(1.0F, 1.0F, 1.0F, 1.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, float var4, float var5, float var6, float var7, g var8, char var9) {
      if (var1 != null) {
         a(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, aa.a(1.0F, 1.0F, 1.0F, 1.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, float var4, float var5, float var6, float var7, g var8, char var9, aa var10, d var11) {
      if (var1 != null && !(var2 - var6 > (float)a) && !(var3 - var7 > (float)b) && !(var2 + var6 < 0.0F) && !(var3 + var7 < 0.0F) && !(var6 <= 0.0F) && !(var7 <= 0.0F)) {
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
         ByteBuffer var17 = ByteBuffer.allocateDirect(var16.length * 4);
         var17.order(ByteOrder.nativeOrder());
         FloatBuffer var18 = var17.asFloatBuffer();
         i = var18;
         var18.put(var16);
         i.position(0);
         if (!var15) {
            a(var1.c.a, var1.c.b);
         } else {
            a(var12, var6);
         }

         var0.glLoadIdentity();
         var0.glTranslatef(var2 - j, var3 - k, 0.0F);
         if (var11.c != 0.0F) {
            var0.glRotatef(-var11.c, 0.0F, 0.0F, 1.0F);
         }

         var0.glTranslatef(-var12 * (0.5F - var11.a), -var6 * (0.5F - var11.b), 0.0F);
         var0.glScalef(var8.a, var8.b, 1.0F);
         if (var9 != 0) {
            var0.glColor4f(var10.a * var10.d, var10.b * var10.d, var10.c * var10.d, var10.d * var10.d);
         } else {
            var0.glColor4f(var10.a, var10.b, var10.c, var10.d);
         }

         switch (var9) {
            case '\u0001':
               a(var0, fishing4.a.b.f);
               break;
            case '\u0002':
               a(var0, fishing4.a.b.g);
               break;
            case '\u0003':
               a(var0, fishing4.a.b.j);
               break;
            case '\u0004':
               a(var0, fishing4.a.b.i);
               break;
            case '\u0005':
               a(var0, fishing4.a.b.e);
            case '\u0006':
            case '\u0007':
            default:
               break;
            case '\b':
               a(var0, fishing4.a.b.k);
               break;
            case '\t':
               a(var0, fishing4.a.b.l);
         }

         var0.glBindTexture(3553, var1.f);
         var0.glFrontFace(2305);
         var0.glEnableClientState(32884);
         var0.glEnableClientState(32888);
         var0.glVertexPointer(3, 5126, 0, h);
         var0.glTexCoordPointer(2, 5126, 0, i);
         var0.glDrawArrays(5, 0, 4);
         var0.glDisableClientState(32884);
         var0.glEnableClientState(32888);
         a(var0, fishing4.a.b.c);
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, float var4, float var5, float var6, float var7, g var8, char var9, d var10) {
      if (var1 != null) {
         a(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, aa.a(1.0F, 1.0F, 1.0F, 1.0F), var10);
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, float var4, float var5, float var6, float var7, g var8, int var9) {
      if (var1 != null) {
         int var10 = var9;
         if (var9 > 255) {
            var10 = 255;
         }

         a(var0, var1, var2, var3, var4, var5, var6, var7, var8, '\u0000', aa.a(1.0F, 1.0F, 1.0F, (float)var10 / 255.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, float var4, float var5, float var6, float var7, g var8, d var9) {
      if (var1 != null) {
         a(var0, var1, var2, var3, var4, var5, var6, var7, var8, '\u0000', aa.a(1.0F, 1.0F, 1.0F, 1.0F), var9);
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, float var4, aa var5, d var6) {
      if (var1 != null) {
         a(var0, var1, var2, var3, 926.0F, 61.0F, 56.0F, var4, fishing4.a.g.a(), '\u0000', var5, var6);
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, int var4) {
      if (var1 != null) {
         int var5 = var4;
         if (var4 > 255) {
            var5 = 255;
         }

         a(var0, var1, var2, var3, 0.0F, 0.0F, var1.c.a, var1.c.b, fishing4.a.g.a(), '\u0000', aa.a(1.0F, 1.0F, 1.0F, (float)var5 / 255.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, d var4) {
      if (var1 != null) {
         a(var0, var1, var2, var3, 0.0F, 0.0F, var1.c.a, var1.c.b, fishing4.a.g.a(), '\u0000', aa.a(1.0F, 1.0F, 1.0F, 1.0F), var4);
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, f var4) {
      if (var1 != null) {
         g var5 = fishing4.a.g.a();
         aa var7 = aa.a(1.0F, 1.0F, 1.0F, 1.0F);
         d var6 = fishing4.a.d.a();
         a(var0, var1, var2, var3, var4.a.a, var4.a.b, var4.b.a, var4.b.b, var5, '\u0000', var7, var6);
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, f var4, char var5) {
      if (var1 != null) {
         g var8 = fishing4.a.g.a();
         aa var6 = aa.a(1.0F, 1.0F, 1.0F, 1.0F);
         d var7 = fishing4.a.d.a();
         a(var0, var1, var2, var3, var4.a.a, var4.a.b, var4.b.a, var4.b.b, var8, var5, var6, var7);
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, f var4, int var5) {
      if (var1 != null) {
         int var6 = var5;
         if (var5 > 255) {
            var6 = 255;
         }

         g var7 = fishing4.a.g.a();
         aa var8 = aa.a(1.0F, 1.0F, 1.0F, (float)var6 / 255.0F);
         d var9 = fishing4.a.d.a();
         a(var0, var1, var2, var3, var4.a.a, var4.a.b, var4.b.a, var4.b.b, var7, '\u0000', var8, var9);
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, f var4, aa var5) {
      if (var1 != null) {
         g var6 = fishing4.a.g.a();
         d var7 = fishing4.a.d.a();
         a(var0, var1, var2, var3, var4.a.a, var4.a.b, var4.b.a, var4.b.b, var6, '\u0000', var5, var7);
      }

   }

   public static void a(GL10 var0, w var1, float var2, float var3, g var4) {
      if (var1 != null) {
         a(var0, var1, var2, var3, 0.0F, 0.0F, var1.c.a, var1.c.b, var4, '\u0000', aa.a(1.0F, 1.0F, 1.0F, 1.0F), fishing4.a.d.a());
      }

   }

   public static void a(GL10 var0, w var1, float var2, f var3, char var4, d var5) {
      if (var1 != null) {
         g var7 = fishing4.a.g.a();
         aa var6 = aa.a(1.0F, 1.0F, 1.0F, 1.0F);
         a(var0, var1, var2, 0.0F, var3.a.a, var3.a.b, var3.b.a, var3.b.b, var7, var4, var6, var5);
      }

   }

   public static void a(GL10 var0, w var1, float var2, f var3, d var4) {
      if (var1 != null) {
         g var6 = fishing4.a.g.a();
         aa var5 = aa.a(1.0F, 1.0F, 1.0F, 0.7058824F);
         a(var0, var1, var2, 0.0F, var3.a.a, var3.a.b, var3.b.a, var3.b.b, var6, '\u0000', var5, var4);
      }

   }

   public static void a(GL10 var0, w var1, e var2, char var3, int var4) {
      if (var1 != null) {
         int var7 = var4;
         if (var4 > 255) {
            var7 = 255;
         }

         float var6 = var1.c.a;
         float var5 = var1.c.b;
         g var8 = fishing4.a.g.a();
         aa var10 = aa.a(1.0F, 1.0F, 1.0F, (float)var7 / 255.0F);
         d var9 = fishing4.a.d.a();
         a(var0, var1, var2.a, var2.b, 0.0F, 0.0F, var6, var5, var8, var3, var10, var9);
      }

   }

   public static void a(GL10 var0, w var1, e var2, int var3) {
      if (var1 != null) {
         int var6 = var3;
         if (var3 > 255) {
            var6 = 255;
         }

         float var5 = var1.c.a;
         float var4 = var1.c.b;
         g var7 = fishing4.a.g.a();
         aa var9 = aa.a(1.0F, 1.0F, 1.0F, (float)var6 / 255.0F);
         d var8 = fishing4.a.d.a();
         a(var0, var1, var2.a, var2.b, 0.0F, 0.0F, var5, var4, var7, '\u0000', var9, var8);
      }

   }

   public static void a(GL10 var0, w var1, e var2, f var3) {
      if (var1 != null) {
         g var4 = fishing4.a.g.a();
         aa var5 = aa.a(1.0F, 1.0F, 1.0F, 1.0F);
         d var6 = fishing4.a.d.a();
         a(var0, var1, var2.a, var2.b, var3.a.a, var3.a.b, var3.b.a, var3.b.b, var4, '\u0000', var5, var6);
      }

   }

   public static void a(GL10 var0, w var1, e var2, f var3, char var4) {
      if (var1 != null) {
         g var6 = fishing4.a.g.a();
         aa var7 = aa.a(1.0F, 1.0F, 1.0F, 1.0F);
         d var5 = fishing4.a.d.a();
         a(var0, var1, var2.a, var2.b, var3.a.a, var3.a.b, var3.b.a, var3.b.b, var6, var4, var7, var5);
      }

   }

   public static void a(GL10 var0, w var1, e var2, f var3, int var4) {
      if (var1 != null) {
         int var5 = var4;
         if (var4 > 255) {
            var5 = 255;
         }

         g var8 = fishing4.a.g.a();
         aa var6 = aa.a(1.0F, 1.0F, 1.0F, (float)var5 / 255.0F);
         d var7 = fishing4.a.d.a();
         a(var0, var1, var2.a, var2.b, var3.a.a, var3.a.b, var3.b.a, var3.b.b, var8, '\u0000', var6, var7);
      }

   }

   public static void a(GL10 var0, w var1, e var2, f var3, aa var4, d var5) {
      if (var1 != null) {
         g var6 = fishing4.a.g.a();
         a(var0, var1, var2.a, var2.b, var3.a.a, var3.a.b, var3.b.a, var3.b.b, var6, '\u0000', var4, var5);
      }

   }

   public static void a(GL10 var0, w var1, e var2, f var3, d var4) {
      if (var1 != null) {
         g var5 = fishing4.a.g.a();
         aa var6 = aa.a(1.0F, 1.0F, 1.0F, 1.0F);
         a(var0, var1, var2.a, var2.b, var3.a.a, var3.a.b, var3.b.a, var3.b.b, var5, '\u0000', var6, var4);
      }

   }

   public static void a(GL10 var0, w var1, e var2, f var3, g var4) {
      if (var1 != null) {
         aa var5 = aa.a(1.0F, 1.0F, 1.0F, 1.0F);
         d var6 = fishing4.a.d.a();
         a(var0, var1, var2.a, var2.b, var3.a.a, var3.a.b, var3.b.a, var3.b.b, var4, '\u0001', var5, var6);
      }

   }

   public static void a(GL10 var0, w var1, e var2, f var3, g var4, int var5) {
      if (var1 != null) {
         int var6 = var5;
         if (var5 > 255) {
            var6 = 255;
         }

         aa var7 = aa.a(1.0F, 1.0F, 1.0F, (float)var6 / 255.0F);
         d var8 = fishing4.a.d.a();
         a(var0, var1, var2.a, var2.b, var3.a.a, var3.a.b, var3.b.a, var3.b.b, var4, '\u0000', var7, var8);
      }

   }

   public static void a(GL10 var0, w var1, e var2, f var3, g var4, d var5) {
      if (var1 != null) {
         aa var6 = aa.a(1.0F, 1.0F, 1.0F, 1.0F);
         a(var0, var1, var2.a, var2.b, var3.a.a, var3.a.b, var3.b.a, var3.b.b, var4, '\u0002', var6, var5);
      }

   }

   public static int b() {
      return b;
   }

   public static void b(GL10 var0) {
      var0.glDisable(3089);
      var0.glPopMatrix();
   }

   public static void b(GL10 var0, w var1, float var2, float var3, float var4, float var5, float var6, float var7, g var8, int var9) {
      if (var1 != null) {
         a(var0, var1, var2, var3, var4, var5, var6, var7, var8, '\u0001', aa.a(1.0F, 1.0F, 1.0F, (float)var9 / 255.0F), fishing4.a.d.a());
      }

   }

   public static void b(GL10 var0, w var1, float var2, float var3, int var4) {
      if (var1 != null) {
         a(var0, var1, var2, var3, 0.0F, 0.0F, var1.c.a, var1.c.b, fishing4.a.g.a(), '\u0001', aa.a(1.0F, 1.0F, 1.0F, (float)var4 / 255.0F), fishing4.a.d.a());
      }

   }

   public static float c() {
      return j;
   }

   public static float d() {
      return k;
   }

   public static e e() {
      return fishing4.a.e.a(j, k);
   }
}

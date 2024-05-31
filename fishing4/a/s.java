package fishing4.a;

import android.app.Instrumentation;
import android.content.Context;
import android.opengl.GLSurfaceView;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.WindowManager;
import fishing4.game.ah;
import fishing4.game.am;
import fishing4.game.aq;
import fishing4.game.az;
import fishing4.game.bh;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public final class s extends GLSurfaceView implements GLSurfaceView.Renderer {
   public static Context a;
   public static boolean b = false;
   public static long c = 35L;

   public s(Context var1) {
      super(var1);
      this.setDebugFlags(3);
      this.setFocusableInTouchMode(true);
      this.setKeepScreenOn(true);
      DisplayMetrics var2 = new DisplayMetrics();
      ((WindowManager)var1.getSystemService("window")).getDefaultDisplay().getMetrics(var2);
      m.a = var2.widthPixels;
      m.b = var2.heightPixels;
   }

   public static Context a() {
      return a;
   }

   public final void onDrawFrame(GL10 var1) {
      long var2;
      if (r.h) {
         Instrumentation var7 = new Instrumentation();
         var2 = SystemClock.uptimeMillis();
         long var4 = SystemClock.uptimeMillis();
         MotionEvent var8 = MotionEvent.obtain(var2, var4, 0, 0.0F, 200.0F, 0);
         MotionEvent var6 = MotionEvent.obtain(var2, var4, 1, 0.0F, 200.0F, 0);
         var7.sendPointerSync(var8);
         var7.sendPointerSync(var6);
         r.h = false;
      }

      if (az.e()) {
         az.f();
      } else if (!az.f && az.I) {
         az.d();
      } else {
         var1.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
         var1.glClear(16640);
         var2 = System.currentTimeMillis();
         fishing4.game.z.a(var1);
         fishing4.game.z.b(var1);
         var2 = c - (System.currentTimeMillis() - var2);
         if (var2 > 0L) {
            try {
               Thread.sleep(var2);
            } catch (InterruptedException var9) {
               var9.printStackTrace();
            }
         }

         if (fishing4.game.z.b() == 1 || fishing4.game.z.b() == 2 && fishing4.game.aa.c == 0) {
            fishing4.game.k.b();
         }
      }

   }

   public final void onSurfaceChanged(GL10 var1, int var2, int var3) {
      if (az.I) {
         az.d();
      } else {
         DisplayMetrics var4 = new DisplayMetrics();
         ((WindowManager)a.getSystemService("window")).getDefaultDisplay().getMetrics(var4);
         m.a = var4.widthPixels;
         m.b = var4.heightPixels;
         m.a(var1);
         az.a = e.a(m.c(), m.d() + 120.0F);
         az.b = e.a(m.c(), m.d() - 120.0F);
         az.c = e.a(m.c() - 150.0F, m.d());
         az.d = e.a(m.c() + 150.0F, m.d());
      }

   }

   public final void onSurfaceCreated(GL10 var1, EGLConfig var2) {
      if (az.I) {
         az.d();
      } else {
         if (!b) {
            fishing4.game.k.a(var1, a);
            b = true;
         } else if (fishing4.game.z.b() == 3) {
            if (fishing4.game.aa.c == 1 && aq.a == 3 && !az.e && am.b == -1 && !bh.a()) {
               az.a();
            }
         } else if (fishing4.game.z.b() == 4 && aq.a == 3) {
            if (fishing4.game.aa.c == 1) {
               if (fishing4.game.j.a == 0 && !az.e && !bh.a()) {
                  az.a();
               }
            } else if (fishing4.game.aa.c == 2) {
               if (!am.e && (!bh.a() || bh.b())) {
                  ah.b();
               }
            } else if (fishing4.game.aa.c == 3 && !fishing4.game.i.c && (!bh.a() || bh.b())) {
               fishing4.game.i.a();
            }
         }

         w.b(var1);
         w.c(var1);
      }

   }
}

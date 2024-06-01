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

public final class GLRootView extends GLSurfaceView implements GLSurfaceView.Renderer {
   public static Context applicationContext;
   public static boolean b = false;
   public static long drawDelayMs = 35L;

   public GLRootView(Context context) {
      super(context);
      this.setDebugFlags(3);
      this.setFocusableInTouchMode(true);
      this.setKeepScreenOn(true);
      DisplayMetrics displayMetrics = new DisplayMetrics();
      ((WindowManager)context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
      m.widthPixels = displayMetrics.widthPixels;
      m.heightPixels = displayMetrics.heightPixels;
   }

   public static Context getAppContext() {
      return applicationContext;
   }

   public final void onDrawFrame(GL10 glContext) {
      long ms;
      if (r.h) {
         Instrumentation var7 = new Instrumentation();
         ms = SystemClock.uptimeMillis();
         long var4 = SystemClock.uptimeMillis();
         MotionEvent var8 = MotionEvent.obtain(ms, var4, 0, 0.0F, 200.0F, 0);
         MotionEvent var6 = MotionEvent.obtain(ms, var4, 1, 0.0F, 200.0F, 0);
         var7.sendPointerSync(var8);
         var7.sendPointerSync(var6);
         r.h = false;
      }

      if (az.e()) {
         az.f();
      } else if (!az.f && az.I) {
         az.d();
      } else {
         glContext.glClearColor(1.0F, 1.0F, 1.0F, 1.0F);
         glContext.glClear(16640);
         ms = System.currentTimeMillis();
         fishing4.game.z.a(glContext);
         fishing4.game.z.b(glContext);
         ms = drawDelayMs - (System.currentTimeMillis() - ms);
         if (ms > 0L) {
            try {
               Thread.sleep(ms);
            } catch (InterruptedException ex) {
               ex.printStackTrace();
            }
         }

         if (fishing4.game.z.b() == 1 || fishing4.game.z.b() == 2 && fishing4.game.aa.c == 0) {
            fishing4.game.k.b();
         }
      }

   }

   public final void onSurfaceChanged(GL10 glContext, int width, int height) {
      if (az.I) {
         az.d();
      } else {
         DisplayMetrics displayMetrics = new DisplayMetrics();
         ((WindowManager) applicationContext.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
         m.widthPixels = displayMetrics.widthPixels;
         m.heightPixels = displayMetrics.heightPixels;
         m.a(glContext);
         az.a = e.a(m.getHalfWidthPixels(), m.getHalfHeightPixels() + 120.0F);
         az.b = e.a(m.getHalfWidthPixels(), m.getHalfHeightPixels() - 120.0F);
         az.c = e.a(m.getHalfWidthPixels() - 150.0F, m.getHalfHeightPixels());
         az.d = e.a(m.getHalfWidthPixels() + 150.0F, m.getHalfHeightPixels());
      }

   }

   public final void onSurfaceCreated(GL10 glContext, EGLConfig eglConfig) {
      if (az.I) {
         az.d();
      } else {
         if (!b) {
            fishing4.game.k.a(glContext, applicationContext);
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

         w.b(glContext);
         w.c(glContext);
      }

   }
}

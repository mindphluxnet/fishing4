package fishing4.b;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.SoundPool;
import fishing4.game.u;
import java.util.Iterator;

public class d {
   static d k = null;
   a a = new a();
   a b = new a();
   a c = new a();
   SoundPool d = new SoundPool(5, 3, 0);
   int e = -1;
   Float f = null;
   Float g = null;
   Float h = null;
   Float i = null;
   boolean j = false;

   private d() {
   }

   public static d a() {
      synchronized(d.class) {
         if (k == null) {
            d var0 = new d();
            k = var0;
         }

      }

      return k;
   }

   public static void b() {
      synchronized(d.class) {
         k = null;
      }
   }

   public final void a(int var1) {
      Integer var2 = (Integer)this.b.a(var1);
      if (var2 != null) {
         this.d.stop(var2);
      }

   }

   public final void a(Context var1) {
      a var2 = this.c;
      synchronized(var2) {
         if ((MediaPlayer)this.c.a(2131034129) == null) {
            MediaPlayer var4 = MediaPlayer.create(var1, 2131034129);
            this.c.a(2131034129, var4);
         }

      }
   }

   public final void a(Context var1, int var2) {
      a var3 = this.a;
      synchronized(var3) {
         if ((Integer)this.a.a(var2) == null) {
            Integer var5 = this.d.load(var1, var2, 0);
            if (var5 != 0) {
               this.a.a(var2, var5);
            }
         }

      }
   }

   public final void a(Context var1, int var2, int var3) {
      if (u.b) {
         a var6 = this.a;
         synchronized(var6){}

         Integer var4;
         label258: {
            Throwable var10000;
            label264: {
               Integer var5;
               boolean var10001;
               try {
                  var5 = (Integer)this.a.a(var2);
               } catch (Throwable var26) {
                  var10000 = var26;
                  var10001 = false;
                  break label264;
               }

               var4 = var5;
               if (var5 == null) {
                  label265: {
                     Integer var27;
                     try {
                        var27 = this.d.load(var1, var2, 0);
                     } catch (Throwable var24) {
                        var10000 = var24;
                        var10001 = false;
                        break label264;
                     }

                     var4 = var27;

                     try {
                        if (var27 == 0) {
                           break label265;
                        }

                        this.a.a(var2, var27);
                     } catch (Throwable var25) {
                        var10000 = var25;
                        var10001 = false;
                        break label264;
                     }

                     var4 = var27;
                  }
               }

               label243:
               try {
                  break label258;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label243;
               }
            }

            Throwable var28 = var10000;
            throw var28;
         }

         var3 = this.d.play(var4, 1.0F, 1.0F, 0, var3, 1.0F);
         if (this.h != null) {
            this.d.setVolume(var3, this.h, this.h);
         }

         this.b.a(var2, var3);
      }

   }

   public final void a(Float var1) {
      if (!this.j) {
         this.h = var1;
      }

   }

   public final void b(Context var1, int var2) {
      this.a(var1, var2, 0);
   }

   public final void b(Float var1) {
      if (!this.j) {
         this.i = var1;
         Iterator var2 = this.c.iterator();

         while(var2.hasNext()) {
            ((MediaPlayer)((b)var2.next()).a()).setVolume(this.i, this.i);
         }
      }

   }

   public final void c() {
      if (this.e != -1) {
         a var1 = this.c;
         synchronized(var1){}

         Throwable var10000;
         label91: {
            boolean var10001;
            MediaPlayer var2;
            try {
               var2 = (MediaPlayer)this.c.a(this.e);
            } catch (Throwable var8) {
               var10000 = var8;
               var10001 = false;
               break label91;
            }

            if (var2 != null) {
               var2.pause();
               return;
            }

            label80:
            try {
               return;
            } catch (Throwable var7) {
               var10000 = var7;
               var10001 = false;
               break label80;
            }
         }

         Throwable var9 = var10000;
         throw var9;
      }
   }

   public final void c(Context param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   public final void d() {
      if (this.e != -1) {
         a var1 = this.c;
         synchronized(var1){}

         Throwable var10000;
         label91: {
            boolean var10001;
            MediaPlayer var2;
            try {
               var2 = (MediaPlayer)this.c.a(this.e);
            } catch (Throwable var8) {
               var10000 = var8;
               var10001 = false;
               break label91;
            }

            if (var2 != null) {
               var2.start();
               return;
            }

            label80:
            try {
               return;
            } catch (Throwable var7) {
               var10000 = var7;
               var10001 = false;
               break label80;
            }
         }

         Throwable var9 = var10000;
         throw var9;
      }
   }

   public final void e() {
      Iterator var1 = this.c.iterator();

      while(var1.hasNext()) {
         ((MediaPlayer)((b)var1.next()).a()).release();
      }

      this.c.a();
   }

   public final void f() {
      this.d.release();
   }
}

package fishing4.game;

import javax.microedition.khronos.opengles.GL10;

public final class ah {
   public static final fishing4.a.f a;
   public static final fishing4.a.f b;
   public static final fishing4.a.f c;
   public static final fishing4.a.f d;
   public static final fishing4.a.f e;
   public static final fishing4.a.f f;
   public static final fishing4.a.f g;
   public static fishing4.a.f h;
   public static boolean i;
   public static boolean j;
   public static boolean k;
   public static int l;
   public static int m;
   public static int n;
   public static int o;
   private final float A = 20.0F;
   protected ai p;
   private fishing4.a.w q;
   private fishing4.a.w r;
   private fishing4.a.w s;
   private fishing4.a.w t;
   private fishing4.a.w u;
   private fishing4.a.w v;
   private fishing4.a.w w;
   private bi x;
   private aj[] y;
   private boolean z = false;

   static {
      fishing4.a.f var0;
      if (globalConfig.j) {
         var0 = fishing4.a.f.a(40.0F, 180.0F, 400.0F, 530.0F);
      } else {
         var0 = fishing4.a.f.a(40.0F, 230.0F, 400.0F, 530.0F);
      }

      a = var0;
      b = fishing4.a.f.a((float)(fishing4.a.m.a() / 2), a.a.b - 20.0F - 56.0F, 114.0F, 112.0F);
      c = fishing4.a.f.a((float)(fishing4.a.m.a() / 2) - 126.0F, a.a.b - 20.0F - 56.0F, 106.0F, 112.0F);
      d = fishing4.a.f.a((float)(fishing4.a.m.a() / 2) + 126.0F, a.a.b - 20.0F - 56.0F, 106.0F, 112.0F);
      e = fishing4.a.f.a(b.a.a, b.a.b, 114.0F, 112.0F);
      f = fishing4.a.f.a(c.a.a, c.a.b, 106.0F, 112.0F);
      g = fishing4.a.f.a(d.a.a, d.a.b, 106.0F, 112.0F);
      h = a;
      l = 4;
      m = 2;
      n = 0;
   }

   private ah(GL10 var1) {
      this.c(var1);
   }

   public static ah a(GL10 var0) {
      return new ah(var0);
   }

   private static void a(fishing4.a.e var0, boolean var1) {
      i = false;
      j = false;
      k = false;
      if (fishing4.a.f.a(f.a, f.b, var0, false)) {
         i = var1;
      } else if (fishing4.a.f.a(e.a, e.b, var0, false)) {
         j = var1;
      } else if (fishing4.a.f.a(g.a, g.b, var0, false)) {
         k = var1;
      }

   }

   public static void b() {
      if (am.e) {
         fishing4.b.d.a().d();
         am.b();
      } else {
         fishing4.b.d.a().c();
         am.b(1);
      }

   }

   public static void b(fishing4.a.e var0) {
      if (am.e) {
         if (am.a == 1) {
            if (am.c.a(var0, true)) {
               fishing4.game.q.c(6);
               am.b();
               aw.a(1);
            } else if (am.d.a(var0, true)) {
               fishing4.b.d.a().d();
               am.b();
            }
         } else if (am.c.a(var0, true)) {
            am.b();
         }
      } else {
         a(var0, false);
      }

   }

   private fishing4.a.f c() {
      return fishing4.a.f.a(fishing4.a.e.a(this.p.f.d.a, this.p.f.d.b + this.p.f.a.b / 2.0F), fishing4.a.h.a(this.p.f.e.a - 6.0F, this.p.f.a.b), this.p.f.f);
   }

   private void c(GL10 var1) {
      int var5 = 0;
      i = false;
      j = false;
      k = false;
      o = 0;
      this.x = bi.a(var1, 4, 6, a);
      this.p = new ai();

      for(this.y = new aj[2]; var5 < 2; ++var5) {
         float var4 = fishing4.a.m.c();
         float var3 = a.b.a / 2.0F;
         float var2 = (float)fishing4.a.z.a((int)a.b.a - 100);
         this.y[var5] = aj.a(var4 - var3 + var2, a.a.b - (float)((var5 + 1) * 200));
      }

      this.q = fishing4.a.w.a(var1, "img/battle/secondbattle.png");
      this.r = fishing4.a.w.a(var1, "img/battle/lighting.png");
      this.s = fishing4.a.w.a(var1, "img/lure/Lure_Waveani_Front.png");
      this.t = fishing4.a.w.a(var1, "img/lure/Lure_Waveani_Tail.png");
      this.u = fishing4.a.w.a(var1, "img/lure/Lure_Waveani_Top.png");
      this.v = fishing4.a.w.a(var1, "img/lure/Spray_Side.png");
      this.w = fishing4.a.w.a(var1, "img/lure/Spray_Top.png");
      fishing4.b.d.a().a(fishing4.a.s.a(), 2131034140);
   }

   public final void a() {
      byte var3 = 2;
      int var2 = 0;

      int var1;
      label64:
      while(true) {
         if (var2 >= 2) {
            for(var1 = 0; var1 < 15; ++var1) {
               fishing4.a.f var4 = fishing4.a.f.a(this.p.e[var1].a, this.p.e[var1].b().b);
               if (fishing4.a.f.a(fishing4.a.f.a(var4.a.a, var4.a.b, var4.b.a - 40.0F, var4.b.b - 40.0F), this.c())) {
                  var1 = 1;
                  break label64;
               }
            }

            var1 = 0;
            break;
         }

         var1 = var3;
         if (fishing4.a.f.a(this.y[var2].b(), this.c())) {
            break;
         }

         ++var2;
      }

      o = var1;
      if (am.e()) {
         switch (o) {
            case 0:
            default:
               break;
            case 1:
               if (((ac)ad.j.get(ad.c)).f() == 200) {
                  if (!((ac)ad.j.get(ad.c)).b(1L)) {
                     ad.j.remove(ad.c);
                     ad.c = -1;
                  }

                  fishing4.game.k.f();
                  fishing4.game.l.a(10);
               } else {
                  var1 = ((ac)ad.j.get(ad.c)).f();
                  aw.r = var1;
                  aw.p = var1;
                  if (!((ac)ad.j.get(ad.c)).b(1L)) {
                     ad.j.remove(ad.c);
                     ad.c = -1;
                  }

                  fishing4.game.k.f();
                  fishing4.game.l.a(12);
               }

               aw.a(4);
               break;
            case 2:
               fishing4.game.l.a(11);
               aw.a(4);
         }

         fishing4.b.d var5;
         if (aw.h <= this.p.c) {
            if (this.z) {
               this.z = false;
               var5 = fishing4.b.d.a();
               fishing4.a.s.a();
               var5.a(2131034140);
            }

            aw.a(1);
         }

         if (o != 0) {
            var5 = fishing4.b.d.a();
            fishing4.a.s.a();
            var5.a(2131034140);
         }
      } else {
         i = false;
         j = false;
         k = false;
      }

   }

   public final void a(fishing4.a.e var1) {
      if (!bh.a() || bh.a == 51) {
         if (am.e) {
            if (am.a == 1) {
               if (!am.c.a(var1, false)) {
                  am.d.a(var1, false);
               }
            } else {
               am.c.a(var1, false);
            }
         } else {
            if (fishing4.a.f.a(f.a, f.b, var1, false)) {
               if (!i) {
                  this.p.f.a();
               }
            } else if (fishing4.a.f.a(g.a, g.b, var1, false)) {
               if (!k) {
                  this.p.f.b();
               }
            } else if (fishing4.a.f.a(e.a, e.b, var1, false) && !j) {
               this.p.f.c();
            }

            a(var1, true);
         }
      }

   }

   public final void a(GL10 var1, fishing4.a.w var2, fishing4.a.w var3, fishing4.a.w var4, int var5) {
      float var7 = a.a.a;
      float var8 = a.b.a / 2.0F;
      float var6 = a.a.b;
      fishing4.a.m.a(var1, var8 + var7, a.b.b / 2.0F + var6, 4.0F + a.b.a, 4.0F + a.b.b, fishing4.a.aa.b());
      fishing4.a.m.a(var1, h);
      int var9;
      int var10;
      boolean var13;
      if (!am.e() || bh.a() && bh.a != 51 && be.a) {
         var13 = false;
         var9 = 0;
         var10 = 0;
      } else {
         var10 = l;
         int var11 = n;
         int var12 = m;
         var9 = n;
         var13 = true;
         var9 += var12;
         var10 += var11;
      }

      this.x.a(var1, 0, var10, var5);
      fishing4.a.w var14;
      if (fishing4.a.m.c != 600 && fishing4.a.m.d != 600 && fishing4.a.m.d != 1232) {
         var14 = this.q;
         var6 = fishing4.a.m.c();
         var7 = a.a.b;
         fishing4.a.m.a(var1, var14, var6, a.b.b / 2.0F + var7, 0.0F, 0.0F, 480.0F, 108.0F, fishing4.a.g.b(a.b.a / 480.0F, a.b.b / 108.0F), '\u0002');
      } else {
         var14 = this.q;
         var7 = fishing4.a.m.c();
         var6 = a.a.b;
         fishing4.a.m.a(var1, var14, var7, a.b.b / 2.0F + var6, 0.0F, 0.0F, 480.0F, 108.0F, fishing4.a.g.b(a.b.a / 480.0F, (float)(fishing4.a.m.b() / 108)), '\u0002');
      }

      ai var15 = this.p;
      var14 = this.q;
      if (var15.b < 210.0F) {
         var15.b += (float)var9;
      } else {
         var15.b = (float)var9;
         var15.a();
      }

      var15.c += (float)var9 * 0.04F;

      for(var9 = 0; var9 < 15; ++var9) {
         if (al.a(var15.e[var9]) != -1) {
            var15.e[var9].a(var15.b);
         }

         var15.e[var9].a(var1, var14);
      }

      this.y[0].a(var1, var2, var5, var13);
      this.y[1].a(var1, var2, var5, var13);
      this.p.f.a(var1, this.q, this.s, this.t, this.u, this.v, this.w);
      fishing4.game.k.a(var1, this.q, Integer.toString((int)(aw.h - this.p.c)) + 'm', fishing4.a.e.a(fishing4.a.m.c(), a.a.b + a.b.b - 50.0F));
      fishing4.a.m.a(var1, this.p.f.c, this.p.f.d, fishing4.a.aa.b());
      fishing4.a.m.b(var1);
      var2 = this.q;
      var5 %= 6;
      fishing4.a.m.a(var1, var2, c.a, fishing4.a.f.a(0.0F, 246.0F, 106.0F, 112.0F));
      fishing4.a.m.a(var1, var2, d.a, fishing4.a.f.a(220.0F, 246.0F, 106.0F, 112.0F));
      fishing4.a.m.a(var1, var2, b.a, fishing4.a.f.a(106.0F, 246.0F, 114.0F, 112.0F));
      ak var16;
      if (i) {
         fishing4.a.m.a(var1, var2, c.a, fishing4.a.f.a(2.0F, 360.0F, 88.0F, 94.0F));
         fishing4.a.m.a(var1, this.r, c.a.a, c.a.b, (float)(var5 % 3 * 252), (float)(var5 / 3 * 240), 252.0F, 240.0F, '\u0001');
         if (!am.e) {
            var16 = this.p.f;
            if (!(var16.d.a <= a.a.a + var16.e.a / 2.0F)) {
               var16.c.b(var16.c.a - 4.0F, var16.c.b);
               var16.d.b(var16.d.a - 4.0F, var16.d.b);
            }
         }
      } else if (k) {
         fishing4.a.m.a(var1, var2, d.a, fishing4.a.f.a(198.0F, 360.0F, 88.0F, 94.0F));
         fishing4.a.m.a(var1, this.r, d.a.a, d.a.b, (float)(var5 % 3 * 252), (float)(var5 / 3 * 240), 252.0F, 240.0F, '\u0001');
         if (!am.e) {
            var16 = this.p.f;
            if (!(var16.d.a >= a.a.a + a.b.a - var16.e.a / 2.0F)) {
               var16.c.b(var16.c.a + 4.0F, var16.c.b);
               var16.d.b(var16.d.a + 4.0F, var16.d.b);
            }
         }
      } else if (j) {
         fishing4.a.m.a(var1, var2, b.a, fishing4.a.f.a(96.0F, 360.0F, 96.0F, 94.0F));
         fishing4.a.m.a(var1, this.r, b.a.a, b.a.b, (float)(var5 % 3 * 252), (float)(var5 / 3 * 240), 252.0F, 240.0F, '\u0001');
         if (!am.e) {
            this.p.f.d();
         }

         if (!this.z) {
            this.z = true;
            fishing4.b.d.a().a(fishing4.a.s.a(), 2131034140, -1);
         }
      } else if (!am.e) {
         this.p.f.e();
      }

      if (!j) {
         n = 0;
         if (this.z) {
            this.z = false;
            fishing4.b.d var17 = fishing4.b.d.a();
            fishing4.a.s.a();
            var17.a(2131034140);
         }
      }

      if (!am.e) {
         var16 = this.p.f;
         var6 = fishing4.a.e.e(var16.c, var16.d);
         var7 = var16.f;
         if (!(Math.abs(var6 - var7) % 360.0F < 5.0F)) {
            if (var6 > var7) {
               var6 = 5.0F + var7;
            } else {
               var6 = var7 - 5.0F;
            }
         }

         var16.f = var6;
      }

      if (bh.a() && bh.a != 51 && bh.b < 60) {
         if ((float)bh.b < 19.800001F) {
            i = false;
            k = true;
            j = false;
            if (bh.b == 0) {
               this.p.f.b();
            }
         } else if ((float)bh.b < 39.600002F) {
            i = true;
            k = false;
            j = false;
            if (bh.b == 20) {
               this.p.f.a();
            }
         } else if (bh.b < 60) {
            i = false;
            k = false;
            j = true;
            if (bh.b == 40) {
               this.p.f.c();
            }
         }

         var5 = bh.b + 1;
         bh.b = var5;
         if (var5 == 60) {
            i = false;
            k = false;
            j = false;
            bd.b = System.currentTimeMillis();
            be.a = true;
         }
      }

      am.a(var1, fishing4.a.y.a(2131165314), fishing4.a.m.e(), var3, var4);
   }

   public final void b(GL10 var1) {
      if (this.x != null) {
         this.x.a(var1);
      }

      fishing4.a.w.a(var1, this.q);
      this.q = null;
      fishing4.a.w.a(var1, this.r);
      this.r = null;
      fishing4.a.w.a(var1, this.s);
      this.s = null;
      fishing4.a.w.a(var1, this.t);
      this.t = null;
      fishing4.a.w.a(var1, this.u);
      this.u = null;
      fishing4.a.w.a(var1, this.v);
      this.v = null;
      fishing4.a.w.a(var1, this.w);
      this.w = null;
   }
}

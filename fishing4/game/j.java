package fishing4.game;

import javax.microedition.khronos.opengles.GL10;

public final class j {
   public static int a;
   private float b;
   private float c;
   private float d;
   private int e;
   private fishing4.a.e f;
   private final int g = 10;
   private final int h = 20;
   private final int i = 50;
   private final int j = 10;
   private final int k = 3;
   private final int l = 2;
   private final float m = 2.5F;

   public j() {
      a = 0;
      this.b = 0.0F;
      this.c = -45.0F;
      this.d = 0.0F;
      this.e = 0;
      fishing4.b.d.a().a(fishing4.a.s.a(), 2131034142);
      fishing4.b.d.a().a(fishing4.a.s.a(), 2131034112);
      fishing4.b.d.a().a(fishing4.a.s.a(), 2131034139);
      fishing4.b.d.a().a(fishing4.a.s.a(), 2131034124);
      fishing4.b.d.a().a(fishing4.a.s.a(), 2131034136);
      fishing4.b.d.a().a(fishing4.a.s.a(), 2131034134);
   }

   private void a(GL10 var1, fishing4.a.e var2, fishing4.a.e var3) {
      while(!(fishing4.a.e.d(var2, var3) < 50.0F)) {
         fishing4.a.m.a(var1, az.t, fishing4.a.e.c(var2, var3), fishing4.a.f.a(406.0F, 300.0F, 28.0F, 28.0F), '\u0001');
         this.a(var1, var2, fishing4.a.e.c(var2, var3));
         var2 = fishing4.a.e.c(var2, var3);
      }

   }

   private int d() {
      float var1;
      if (this.c < 0.0F) {
         var1 = this.c + 90.0F;
      } else {
         var1 = 90.0F - this.c;
      }

      byte var2;
      if (var1 >= this.b - 3.0F && var1 <= this.b + 3.0F) {
         var2 = 2;
      } else {
         var2 = -1;
      }

      return var2;
   }

   private int e() {
      float var1;
      if (this.d < 50.0F) {
         var1 = this.d;
      } else {
         var1 = 100.0F - this.d;
      }

      byte var2;
      if (var1 >= 48.0F && var1 <= 52.0F) {
         if (this.d() == 2) {
            var2 = 0;
         } else {
            var2 = 1;
         }
      } else {
         var2 = -1;
      }

      return var2;
   }

   public final void a() {
      this.f = null;
   }

   public final void a(GL10 var1, fishing4.a.w var2, fishing4.a.w var3, fishing4.a.w var4, int var5) {
      float var6;
      switch (a) {
         case 0:
         default:
            break;
         case 1:
            if (this.e < 9) {
               switch (this.e) {
                  case 0:
                     fishing4.a.m.a(var1, var2, this.f, fishing4.a.f.a(1.0F, 1.0F, 118.0F, 112.0F), '\u0001');
                     break;
                  case 1:
                     fishing4.a.m.a(var1, var2, this.f, fishing4.a.f.a(121.0F, 1.0F, 118.0F, 112.0F), '\u0001');
                     break;
                  case 2:
                     fishing4.a.m.a(var1, var2, this.f, fishing4.a.f.a(241.0F, 1.0F, 118.0F, 112.0F), '\u0001');
                     break;
                  case 3:
                     fishing4.a.m.a(var1, var2, this.f, fishing4.a.f.a(361.0F, 1.0F, 118.0F, 112.0F), '\u0001');
                     break;
                  case 4:
                     fishing4.a.m.a(var1, var2, this.f, fishing4.a.f.a(1.0F, 115.0F, 118.0F, 112.0F), '\u0001');
                     break;
                  case 5:
                     fishing4.a.m.a(var1, var2, this.f, fishing4.a.f.a(121.0F, 115.0F, 118.0F, 112.0F), '\u0001');
                     break;
                  case 6:
                     fishing4.a.m.a(var1, var2, this.f, fishing4.a.f.a(241.0F, 115.0F, 118.0F, 112.0F), '\u0001');
                     break;
                  case 7:
                     fishing4.a.m.a(var1, var2, this.f, fishing4.a.f.a(361.0F, 115.0F, 118.0F, 112.0F), '\u0001');
                     break;
                  case 8:
                     fishing4.a.m.a(var1, var2, this.f, fishing4.a.f.a(1.0F, 229.0F, 118.0F, 112.0F), '\u0001');
               }

               ++this.e;
            } else {
               this.c();
            }
            break;
         case 2:
            fishing4.a.m.a(var1, var3, (float)(fishing4.a.m.a() - 96), 99.0F, 0.0F, 0.0F, 192.0F, 198.0F, '\b', 204);
            this.c = (float)(var5 % 60 - 30);
            if (this.c < 0.0F) {
               this.c -= 5.0F;
            } else {
               this.c += 5.0F;
            }

            this.c *= 2.0F;
            if (this.c < 0.0F) {
               fishing4.a.m.a(var1, var3, (float)fishing4.a.m.a(), fishing4.a.f.a(262.0F, 204.0F, 46.0F, 148.0F), '\b', fishing4.a.d.a(0.5F, 1.0F, this.c));
            } else {
               fishing4.a.m.a(var1, var3, (float)fishing4.a.m.a(), fishing4.a.f.a(262.0F, 204.0F, 46.0F, 148.0F), '\b', fishing4.a.d.a(0.5F, 1.0F, -this.c));
            }

            if (((ag)ad.h.get(ad.g)).e == 5) {
               this.a(var1, fishing4.a.e.a((float)fishing4.a.m.a(), 0.0F), this.f);
            }

            if (bh.a() && bh.a == 22) {
               var5 = bh.b;
            }

            switch (this.e % 4) {
               case 0:
                  fishing4.a.m.a(var1, var2, this.f, fishing4.a.f.a(122.0F, 230.0F, 116.0F, 110.0F), '\u0001');
                  break;
               case 1:
                  fishing4.a.m.a(var1, var2, this.f, fishing4.a.f.a(242.0F, 230.0F, 116.0F, 110.0F), '\u0001');
                  break;
               case 2:
                  fishing4.a.m.a(var1, var2, this.f, fishing4.a.f.a(362.0F, 230.0F, 116.0F, 110.0F), '\u0001');
                  break;
               case 3:
                  fishing4.a.m.a(var1, var2, this.f, fishing4.a.f.a(2.0F, 344.0F, 116.0F, 110.0F), '\u0001');
            }

            ++this.e;
            break;
         case 3:
            fishing4.a.m.a(var1, var3, (float)(fishing4.a.m.a() - 96), 99.0F, 0.0F, 0.0F, 192.0F, 198.0F, (int)204);
            if (this.d() == 2) {
               if (this.e == 0) {
                  fishing4.b.d.a().b(fishing4.a.s.a(), 2131034124);
               }

               if (this.e < 20) {
                  fishing4.a.m.a(var1, var4, fishing4.a.m.c(), (float)fishing4.a.m.b() * 0.75F + (float)this.e, fishing4.a.f.a(0.0F, 0.0F, 238.0F, 64.0F), 255 - this.e * 255 / 20);
                  if (this.e < 10) {
                     fishing4.a.m.a(var1, var3, (float)(fishing4.a.m.a() - 96), 99.0F, 195.0F, 0.0F, 192.0F, 198.0F, '\u0001', 150 - this.e * 50 / 10);
                  }

                  ++this.e;
               } else {
                  this.c();
               }
            } else if (this.e < 10) {
               fishing4.a.m.a(var1, var3, (float)(fishing4.a.m.a() - 96), 99.0F, 195.0F, 0.0F, 192.0F, 198.0F, '\u0001', 150 - this.e * 50 / 10);
               ++this.e;
            } else {
               this.c();
            }
            break;
         case 4:
            if (!bh.a() || !be.a) {
               if (this.d < 100.0F) {
                  this.d += 2.5F;
               } else {
                  this.d = 0.0F;
               }
            }

            if (this.d < 50.0F) {
               var6 = 268.0F * this.d / 50.0F;
            } else {
               var6 = 268.0F * (100.0F - this.d) / 50.0F;
            }

            if (this.c < 0.0F) {
               fishing4.a.m.a(var1, var3, (float)fishing4.a.m.a(), fishing4.a.f.a(166.0F, 201.0F, 90.0F, 272.0F), '\b', fishing4.a.d.a(0.5F, 1.0F, this.c));
               fishing4.a.m.a(var1, var3, (float)fishing4.a.m.a(), fishing4.a.f.a(82.0F, 474.0F - var6, 80.0F, var6), fishing4.a.d.a(0.5F, 1.0F, this.c));
            } else {
               fishing4.a.m.a(var1, var3, (float)fishing4.a.m.a(), fishing4.a.f.a(166.0F, 201.0F, 90.0F, 272.0F), '\b', fishing4.a.d.a(0.5F, 1.0F, -this.c));
               fishing4.a.m.a(var1, var3, (float)fishing4.a.m.a(), fishing4.a.f.a(82.0F, 474.0F - var6, 80.0F, var6), fishing4.a.d.a(0.5F, 1.0F, -this.c));
            }

            if (bh.a() && bh.a != 51 && this.d >= 48.0F && this.d <= 52.0F) {
               if (!be.a) {
                  bd.b = System.currentTimeMillis();
               }

               bh.b = 60;
               be.a = true;
            }

            if (!z.b && !bh.a()) {
               this.c();
            }
            break;
         case 5:
            int var10;
            if (this.e == 0) {
               var5 = this.e();
               if (var5 == 0) {
                  fishing4.b.d.a().b(fishing4.a.s.a(), 2131034136);
               } else if (var5 == 1) {
                  fishing4.b.d.a().b(fishing4.a.s.a(), 2131034134);
               }

               if (this.c < 0.0F) {
                  var6 = 90.0F + this.c;
               } else {
                  var6 = 90.0F - this.c;
               }

               float var7 = 0.9F + Math.abs(this.b - var6) / 3.0F * 0.05F;
               float var8 = var7;
               if (var7 > 1.0F) {
                  var8 = 1.0F;
               }

               float var9 = 1.2F - Math.abs(this.b - var6) / 3.0F * 0.05F;
               if (var9 < 1.0F) {
                  var9 = 1.0F;
               }

               var6 = var8;
               var7 = var9;
               switch (((ag)ad.h.get(ad.g)).e) {
                  case 0:
                     break;
                  case 1:
                     var6 = var8 - 0.02F;
                     var7 = var9 + 0.04F;
                     break;
                  case 2:
                     var6 = var8 - 0.04F;
                     var7 = var9 + 0.08F;
                     break;
                  case 3:
                     var6 = var8 - 0.06F;
                     var7 = var9 + 0.12F;
                     break;
                  case 4:
                     var6 = var8 - 0.08F;
                     var7 = var9 + 0.16F;
                     break;
                  case 5:
                     var6 = var8 - 0.1F;
                     var7 = var9 + 0.2F;
                     break;
                  default:
                     var7 = var9;
                     var6 = var8;
               }

               var6 += x.h();
               var7 += x.i();
               var5 = (int)(100.0F * var6);
               var10 = (int)(100.0F * var7);
               if (var5 == var10) {
                  aw.i = var7;
               } else {
                  aw.i = var6 + (float)fishing4.a.z.a(var10 - var5) * 0.01F;
               }

               if (this.d < 50.0F) {
                  var6 = this.d;
               } else {
                  var6 = 100.0F - this.d;
               }

               var7 = (float)ac.j(ad.b(2));
               var6 = (1.1F - Math.abs(var6 - 50.0F) / 2.0F * 0.05F) * var7;
               aw.h = var6;
               if (var6 < (float)ac.j(ad.b(2)) * 0.3F) {
                  aw.h = (float)ac.j(ad.b(2)) * 0.3F;
               }
            }

            var10 = this.e();
            byte var11;
            if (var10 != 0 && var10 != 1) {
               var11 = 2;
            } else {
               var11 = 10;
            }

            if (this.e < var11) {
               if (var10 == 0) {
                  fishing4.a.m.a(var1, var2, fishing4.a.m.c(), (float)fishing4.a.m.b() * 0.75F + (float)this.e, fishing4.a.f.a(140.0F, 410.0F, 340.0F, 60.0F), 255 - this.e * 255 / 10);
                  if (this.c < 0.0F) {
                     fishing4.a.m.a(var1, var3, (float)fishing4.a.m.a(), fishing4.a.f.a(1.0F, 206.0F, 80.0F, 268.0F), '\u0001', fishing4.a.d.a(0.5F, 1.0F, this.c));
                  } else {
                     fishing4.a.m.a(var1, var3, (float)fishing4.a.m.a(), fishing4.a.f.a(1.0F, 206.0F, 80.0F, 268.0F), '\u0001', fishing4.a.d.a(0.5F, 1.0F, -this.c));
                  }
               } else if (var10 == 1) {
                  fishing4.a.m.a(var1, var2, fishing4.a.m.c(), (float)fishing4.a.m.b() * 0.75F + (float)this.e, fishing4.a.f.a(288.0F, 344.0F, 192.0F, 64.0F), 255 - this.e * 255 / 10);
               }

               if (this.d < 50.0F) {
                  var6 = 268.0F * this.d / 50.0F;
               } else {
                  var6 = 268.0F * (100.0F - this.d) / 50.0F;
               }

               if (this.c < 0.0F) {
                  fishing4.a.m.a(var1, var3, (float)fishing4.a.m.a(), fishing4.a.f.a(166.0F, 201.0F, 90.0F, 272.0F), '\b', fishing4.a.d.a(0.5F, 1.0F, this.c));
                  fishing4.a.m.a(var1, var3, (float)fishing4.a.m.a(), fishing4.a.f.a(82.0F, 474.0F - var6, 80.0F, var6), '\u0001', fishing4.a.d.a(0.5F, 1.0F, this.c));
                  fishing4.a.m.a(var1, var3, (float)fishing4.a.m.a(), fishing4.a.f.a(350.0F, 530.0F, 99.0F, 280.0F), '\u0001', fishing4.a.d.a(0.5F, 1.0F, this.c));
               } else {
                  fishing4.a.m.a(var1, var3, (float)fishing4.a.m.a(), fishing4.a.f.a(166.0F, 201.0F, 90.0F, 272.0F), '\b', fishing4.a.d.a(0.5F, 1.0F, -this.c));
                  fishing4.a.m.a(var1, var3, (float)fishing4.a.m.a(), fishing4.a.f.a(82.0F, 474.0F - var6, 80.0F, var6), '\u0001', fishing4.a.d.a(0.5F, 1.0F, -this.c));
                  fishing4.a.m.a(var1, var3, (float)fishing4.a.m.a(), fishing4.a.f.a(350.0F, 530.0F, 99.0F, 280.0F), '\u0001', fishing4.a.d.a(0.5F, 1.0F, -this.c));
               }

               ++this.e;
            } else {
               this.e = 0;
               a = 6;
               av.a(1);
            }
      }

   }

   public final void b() {
      this.c = this.b;
      a = 2;
      this.c();
   }

   public final void c() {
      this.e = 0;
      switch (a) {
         case 0:
            this.b = (float)(fishing4.a.z.a(50) + 20);
            float var1 = (float)fishing4.a.m.a();
            fishing4.a.e var2 = fishing4.a.e.a(var1, 0.0F);
            this.f = fishing4.a.e.a(fishing4.a.e.a(var1 * 0.2F, 0.0F), var2, (float)Math.toRadians((double)(this.b * -1.0F)));
            this.d = 0.0F;
            fishing4.b.d.a().b(fishing4.a.s.a(), 2131034142);
            a = 1;
            break;
         case 1:
            fishing4.b.d.a().b(fishing4.a.s.a(), 2131034112);
            a = 2;
            break;
         case 2:
            a = 3;
            break;
         case 3:
            a = 4;
            fishing4.b.d.a().b(fishing4.a.s.a(), 2131034139);
            break;
         case 4:
            a = 5;
         case 5:
         default:
            break;
         case 6:
            a = 0;
      }

   }
}

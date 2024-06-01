package fishing4.game;

public final class ai {
   final int a;
   public float b;
   public float c;
   int d;
   public al[] e;
   public ak f;

   public ai() {
      byte var2 = 60;
      super();
      this.a = (int)ah.a.b.b;
      this.e = new al[15];
      this.f = new ak();

      int var1;
      for(var1 = 0; var1 < 15; ++var1) {
         this.e[var1] = al.a();
      }

      for(var1 = 4; var1 < 5; ++var1) {
         this.b();
      }

      byte var3;
      if (x.a(true) < 5) {
         var3 = 30;
      } else {
         var3 = var2;
         if (x.a(true) >= 10) {
            var3 = var2;
            if (x.a(true) >= 15) {
               var3 = 100;
            }
         }
      }

      this.b = (float)var3;
      this.c = 0.0F;
      this.c();
   }

   private void b() {
      int var4;
      if (ad.c == -1) {
         var4 = 0;
      } else {
         var4 = ((ac)ad.j.get(ad.c)).f();
      }

      if (var4 < 205) {
         this.d = 0;
      } else if (var4 < 210) {
         this.d = 1;
      } else if (var4 < 215) {
         this.d = 2;
      } else {
         this.d = 3;
      }

      int var5 = fishing4.a.z.a(100);
      var4 = fishing4.a.z.a(100);
      boolean var15;
      if (var5 < 50 - this.d * 10) {
         var15 = false;
      } else {
         var15 = true;
      }

      boolean var16;
      label73: {
         if (x.a(true) < 5) {
            if (var4 < 10) {
               var16 = false;
               break label73;
            }
         } else if (x.a(true) < 10) {
            if (var4 < 20) {
               var16 = false;
               break label73;
            }
         } else if (x.a(true) < 15) {
            if (var4 < 30) {
               var16 = false;
               break label73;
            }
         } else if (var4 < 40) {
            var16 = false;
            break label73;
         }

         var16 = true;
      }

      for(int var6 = 0; var6 < 3; ++var6) {
         int var7 = var6 + 12;
         al.c(this.e[var7]);
         int var8;
         al[] var14;
         if (var7 % 3 == 0) {
            var8 = fishing4.a.z.a(2);
            float var3 = fishing4.a.m.getHalfWidthPixels();
            var14 = this.e;
            float var1 = (float)fishing4.a.z.a(400 - (int)al.b(var8).a);
            var14 = this.e;
            float var2 = (float)(0 - fishing4.a.z.a(210 - (int)al.b(var8).b));
            this.e[var7].a(var8);
            this.e[var7].a(var3 - 200.0F + var1, var2);
         } else {
            int var9;
            int var10;
            int var11;
            int var12;
            if (var7 % 3 == 1) {
               if (!var15) {
                  var8 = fishing4.a.z.a(2) + 2;
                  var14 = this.e;
                  var9 = (int)al.b(var8).a;
                  var14 = this.e;
                  var11 = (int)al.b(var8).a;
                  var14 = this.e;
                  var10 = fishing4.a.z.a(210 - (int)al.b(var8).b);
                  var12 = (int)al.b(this.e[var7 - 1]).a;
                  var14 = this.e;
                  int var13 = (int)al.b(al.a(this.e[var7 - 1])).a;
                  this.e[var7].a(var8);
                  this.e[var7].a(400 - var9, var12, var13, var11, 0 - var10);
               } else {
                  if (this.d == 3) {
                     if (al.a(this.e[var7 - 1]) == 0) {
                        this.e[var7].a(1);
                     } else {
                        this.e[var7].a(fishing4.a.z.a(2));
                     }
                  } else {
                     this.e[var7].a(fishing4.a.z.a(2));
                  }

                  var10 = al.a(this.e[var7]);
                  var14 = this.e;
                  var9 = (int)al.b(var10).a;
                  var14 = this.e;
                  var8 = (int)al.b(var10).a;
                  var14 = this.e;
                  var11 = fishing4.a.z.a(210 - (int)al.b(var10).b);
                  var12 = (int)al.b(this.e[var7 - 1]).a;
                  var14 = this.e;
                  var10 = (int)al.b(al.a(this.e[var7 - 1])).a;
                  this.e[var7].a(400 - var9, var12, var10, var8, 0 - var11);
               }
            } else if (!var16) {
               this.e[var7].a(3);
               var10 = al.a(this.e[var7]);
               var14 = this.e;
               var9 = (int)al.b(var10).a;
               var14 = this.e;
               var8 = (int)al.b(var10).a;
               var14 = this.e;
               var12 = fishing4.a.z.a(210 - (int)al.b(var10).b);
               var11 = (int)al.b(this.e[var7 - 1]).a;
               var14 = this.e;
               var10 = (int)al.b(al.a(this.e[var7 - 1])).a;
               this.e[var7].a(400 - var9, var11, var10, var8, 0 - var12);
            }
         }
      }

   }

   private void c() {
      for(int var1 = 0; var1 < 15; ++var1) {
         if (al.a(this.e[var1]) != -1) {
            this.e[var1].a(this.b);
         }
      }

   }

   public final void a() {
      for(int var1 = 0; var1 < 4; ++var1) {
         int var3 = var1 * 3;

         for(int var2 = 0; var2 < 3; ++var2) {
            this.e[var3 + var2].a(al.a(this.e[var3 + 3 + var2]));
            this.e[var3 + var2].a(al.b(this.e[var3 + 3 + var2]).a, al.b(this.e[var3 + 3 + var2]).b + 210.0F);
         }
      }

      this.b();
   }
}

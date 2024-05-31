package fishing4.b;

import java.util.Iterator;

public final class a implements Cloneable, Iterable {
   private b[] a;
   private final float b;
   private int c;
   private int d;
   private int e;
   private int f;

   public a() {
      this((byte)0);
   }

   private a(byte var1) {
      for(this.e = 1; this.e < 16; this.e <<= 1) {
      }

      this.b = 0.75F;
      this.f = (int)((float)this.e * 0.75F);
      this.a = new b[this.e];
      this.d = this.e - 1;
   }

   // $FF: synthetic method
   static b[] a(a var0) {
      return var0.a;
   }

   // $FF: synthetic method
   static int b(a var0) {
      return var0.c;
   }

   private a b() {
      a var2;
      label33: {
         int var1;
         boolean var10001;
         b[] var3;
         try {
            var2 = (a)super.clone();
            var3 = new b[this.a.length];
            var1 = this.a.length - 1;
         } catch (CloneNotSupportedException var5) {
            var10001 = false;
            break label33;
         }

         while(true) {
            if (var1 < 0) {
               try {
                  var2.a = var3;
                  return var2;
               } catch (CloneNotSupportedException var4) {
                  var10001 = false;
                  break;
               }
            }

            try {
               if (this.a[var1] != null) {
                  var3[var1] = this.a[var1].b();
               }
            } catch (CloneNotSupportedException var6) {
               var10001 = false;
               break;
            }

            --var1;
         }
      }

      var2 = null;
      return var2;
   }

   public final Object a(int var1) {
      int var2 = this.d;
      b var3 = this.a[var2 & var1];

      Object var4;
      while(true) {
         if (var3 == null) {
            var4 = null;
            break;
         }

         if (var3.a == var1) {
            var4 = var3.b;
            break;
         }

         var3 = var3.c;
      }

      return var4;
   }

   public final Object a(int var1, Object var2) {
      int var3 = var1 & this.d;
      b var5 = this.a[var3];

      while(true) {
         if (var5 == null) {
            this.a[var3] = new b(var1, var2, this.a[var3]);
            var1 = this.c++;
            if (var1 >= this.f) {
               var3 = this.e * 2;
               b[] var7 = new b[var3];
               b[] var9 = this.a;
               var1 = 0;

               while(true) {
                  if (var1 >= var9.length) {
                     this.a = var7;
                     this.e = var3;
                     this.f = (int)((float)var3 * this.b);
                     this.d = this.e - 1;
                     break;
                  }

                  b var8 = var9[var1];
                  if (var8 != null) {
                     var9[var1] = null;

                     while(true) {
                        var5 = var8.c;
                        int var4 = var8.a & var3 - 1;
                        var8.c = var7[var4];
                        var7[var4] = var8;
                        if (var5 == null) {
                           break;
                        }

                        var8 = var5;
                     }
                  }

                  ++var1;
               }
            }

            var2 = null;
            break;
         }

         if (var5.a == var1) {
            Object var6 = var5.b;
            var5.b = var2;
            var2 = var6;
            break;
         }

         var5 = var5.c;
      }

      return var2;
   }

   public final void a() {
      b[] var2 = this.a;
      int var1 = var2.length;

      while(true) {
         --var1;
         if (var1 < 0) {
            this.c = 0;
            return;
         }

         var2[var1] = null;
      }
   }

   // $FF: synthetic method
   public final Object clone() {
      return this.b();
   }

   public final Iterator iterator() {
      return new c(this);
   }
}

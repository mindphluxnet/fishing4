package fishing4.b;

import java.util.Iterator;

final class c implements Iterator {
   final a a;
   private b b;
   private int c;
   private int d;

   public c(a var1) {
      this.a = var1;
      this.c = 0;
      this.d = 0;
      this.b = fishing4.b.a.a(var1)[0];
   }

   public final boolean hasNext() {
      boolean var1;
      if (this.d < fishing4.b.a.b(this.a)) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   // $FF: synthetic method
   public final Object next() {
      if (this.d >= fishing4.b.a.b(this.a)) {
         throw new IllegalStateException("No more elements!");
      } else {
         b var2;
         if (this.b != null) {
            var2 = this.b;
            this.b = this.b.c;
            ++this.d;
         } else {
            do {
               b[] var3 = fishing4.b.a.a(this.a);
               int var1 = this.c + 1;
               this.c = var1;
               this.b = var3[var1];
            } while(this.b == null);

            var2 = this.b;
            this.b = this.b.c;
            ++this.d;
         }

         return var2;
      }
   }

   public final void remove() {
   }
}

package fishing4.game;

import javax.microedition.khronos.opengles.GL10;

public final class af extends ae {
   public af() {
      super(0L);
   }

   public final void a(GL10 var1, fishing4.a.e var2, fishing4.a.w var3) {
      int var4 = 0;
      if (this.e) {
         this.e = false;
         this.a();
      }

      for(var2 = fishing4.a.e.c(var2.a - this.b.a / 2.0F + 8.0F, var2.b); var4 < this.d.length - 1; ++var4) {
         fishing4.a.m.a(var1, var3, fishing4.a.e.c(var2.a + this.d[var4].a, var2.b), this.c[var4]);
      }

   }

   public final boolean c(long var1) {
      if (this.a.encrypt() + var1 > 99999L) {
         this.a.encryptLong(99999L);
         this.e = true;
      } else if (var1 > 0L) {
         this.a.encryptLong(this.a.encrypt() + var1);
         this.e = true;
      }

      return true;
   }

   public final String e() {
      return this.c() + "Coin";
   }
}

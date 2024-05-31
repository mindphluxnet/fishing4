package fishing4.game;

import javax.microedition.khronos.opengles.GL10;

public final class ax {
   protected fishing4.a.e a;
   protected int b;

   public ax() {
      this.a();
   }

   private void a() {
      this.a = fishing4.a.e.a((float)fishing4.a.z.a(fishing4.a.m.a()), (float)(fishing4.a.z.a(240) + 180));
      this.b = 0;
   }

   public final void a(GL10 var1, fishing4.a.w var2) {
      if (this.b < 10) {
         fishing4.a.m.a(var1, var2, this.a, '\u0001', this.b * 25);
      } else if (this.b < 20) {
         fishing4.a.m.a(var1, var2, this.a, '\u0001', 255 - this.b * 25);
      } else if (this.b % 13 == 0 && fishing4.a.z.a(2) == 0) {
         this.a();
      }

      ++this.b;
   }
}

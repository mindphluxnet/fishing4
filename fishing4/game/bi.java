package fishing4.game;

import java.util.ArrayList;
import javax.microedition.khronos.opengles.GL10;

public final class bi {
   private int a;
   private int b;
   private fishing4.a.f c;
   private ArrayList d;
   private ArrayList e;

   private bi(GL10 var1, int var2, int var3, fishing4.a.f var4) {
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = new ArrayList(6);

      for(var2 = 0; var2 < 6; ++var2) {
         switch (aw.f) {
            case 0:
               this.d.add(var2, fishing4.a.w.a(var1, "img/sea/Yangzi/wavetile" + var2 + ".png"));
               break;
            case 1:
               this.d.add(var2, fishing4.a.w.a(var1, "img/sea/Plit/wavetile" + var2 + ".png"));
               break;
            case 2:
               this.d.add(var2, fishing4.a.w.a(var1, "img/sea/Baikal/wavetile" + var2 + ".png"));
               break;
            case 3:
               this.d.add(var2, fishing4.a.w.a(var1, "img/sea/Eastsea/wavetile" + var2 + ".png"));
               break;
            case 4:
               this.d.add(var2, fishing4.a.w.a(var1, "img/sea/Moldive/wavetile" + var2 + ".png"));
               break;
            case 5:
               this.d.add(var2, fishing4.a.w.a(var1, "img/sea/Asawa/wavetile" + var2 + ".png"));
               break;
            case 6:
               this.d.add(var2, fishing4.a.w.a(var1, "img/sea/Capehorn/wavetile" + var2 + ".png"));
               break;
            case 7:
               this.d.add(var2, fishing4.a.w.a(var1, "img/sea/Polarsea/wavetile" + var2 + ".png"));
            case 8:
            case 9:
            default:
               break;
            case 10:
               this.d.add(var2, fishing4.a.w.a(var1, "img/sea/Network/wavetile" + var2 + ".png"));
         }
      }

      this.e = new ArrayList(this.a * this.b);

      for(var2 = 0; var2 < this.b; ++var2) {
         for(var3 = 0; var3 < this.a; ++var3) {
            float var6 = (float)((fishing4.a.m.getWidthPixels() - this.a * 128) / 2 + (var3 * 2 + 1) * 64);
            float var5 = (float)((fishing4.a.m.getHeightPixels() - this.b * 128) / 2 + (var2 * 2 + 1) * 64);
            this.e.add(this.a * var2 + var3, fishing4.a.e.a(var6, var5));
         }
      }

   }

   public static bi a(GL10 var0, int var1, int var2, fishing4.a.f var3) {
      return new bi(var0, var1, var2, var3);
   }

   public final void a(GL10 var1) {
      for(int var2 = 0; var2 < this.d.size(); ++var2) {
         fishing4.a.w.a(var1, (fishing4.a.w)this.d.get(var2));
      }

      this.d.clear();
      this.d = null;
      this.e.clear();
      this.e = null;
   }

   public final void a(GL10 var1, int var2, int var3, int var4) {
      for(int var7 = 0; var7 < this.b; ++var7) {
         for(int var8 = 0; var8 < this.a; ++var8) {
            int var9 = this.a * var7 + var8;
            float var6 = ((fishing4.a.e)this.e.get(var9)).a;
            float var5 = ((fishing4.a.e)this.e.get(var9)).b;
            if (var3 != 0) {
               if (var3 > 0 && (float)var3 + var5 > this.c.a.b + this.c.b.b + 64.0F) {
                  this.e.set(var9, fishing4.a.e.a(var6, var5 - (float)(this.b * 128) + (float)var3));
               } else if (var3 < 0 && (float)var3 + var5 < this.c.a.b - 64.0F) {
                  this.e.set(var9, fishing4.a.e.a(var6, var5 + (float)(this.b * 128) + (float)var3));
               } else {
                  this.e.set(var9, fishing4.a.e.a(var6, var5 + (float)var3));
               }
            }

            var5 = ((fishing4.a.e)this.e.get(var9)).a;
            var6 = ((fishing4.a.e)this.e.get(var9)).b;
            if (var2 != 0) {
               if (var2 > 0 && (float)var2 + var5 > this.c.a.a + this.c.b.a + 64.0F) {
                  this.e.set(var9, fishing4.a.e.a(var5 - (float)(this.a * 128) + (float)var2, var6));
               } else if (var2 < 0 && (float)var2 + var5 < this.c.a.a - 64.0F) {
                  this.e.set(var9, fishing4.a.e.a(var5 + (float)(this.a * 128) + (float)var2, var6));
               } else {
                  this.e.set(var9, fishing4.a.e.a(var5 + (float)var2, var6));
               }
            }

            fishing4.a.m.a(var1, (fishing4.a.w)this.d.get(var4 % 6), ((fishing4.a.e)this.e.get(var9)).a, ((fishing4.a.e)this.e.get(var9)).b);
         }
      }

   }
}

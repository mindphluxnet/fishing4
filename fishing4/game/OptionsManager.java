package fishing4.game;

import android.os.Vibrator;
import android.util.Log;

import fishing4.a.SaveLoadManager;

public final class OptionsManager {
   public static boolean a;
   public static boolean b;
   public static boolean c;
   public static boolean d;
   public static boolean hasConfirmedAgreement;
   public static boolean f;
   public static boolean hasChosenUserName;
   public static boolean h;
   public static int i;
   public static float j;
   public static float k;
   public static float l;
   public static int m;
   public static int n;
   public static boolean o;
   public static Vibrator vibrator;

   public static void a() {
      // $FF: Couldn't be decompiled
   }

   public static void a(int var0) {
      if (c) {
         vibrator.vibrate((long)var0);
      }

   }

   public static void b() {
      // $FF: Couldn't be decompiled
   }

   public static void c() {
      // $FF: Couldn't be decompiled
   }

   public static void saveOptions() {
      byte[] buf = new byte[85];
      System.arraycopy(fishing4.a.a.a(a), 0, buf, 0, 1);
      System.arraycopy(fishing4.a.a.a(b), 0, buf, 1, 1);
      System.arraycopy(fishing4.a.a.a(c), 0, buf, 2, 1);
      System.arraycopy(fishing4.a.a.a(d), 0, buf, 3, 1);
      System.arraycopy(fishing4.a.a.a(hasConfirmedAgreement), 0, buf, 4, 1);
      System.arraycopy(fishing4.a.a.a(f), 0, buf, 5, 1);
      System.arraycopy(fishing4.a.a.a(m), 0, buf, 6, 4);
      System.arraycopy(fishing4.a.a.a(n), 0, buf, 10, 4);
      System.arraycopy(fishing4.a.a.a(o), 0, buf, 14, 1);
      System.arraycopy(fishing4.a.a.a(h), 0, buf, 15, 1);
      System.arraycopy(fishing4.a.a.a(ad.p.b()), 0, buf, 16, 8);
      System.arraycopy(fishing4.a.a.a(globalConfig.g.encrypt()), 0, buf, 24, 8);
      System.arraycopy(fishing4.a.a.a(hasChosenUserName), 0, buf, 32, 1);
      System.arraycopy(globalConfig.userName.getBytes(), 0, buf, 33, globalConfig.userName.getBytes().length);
      SaveLoadManager.saveFile("f4option.data", buf);
      SaveLoadManager.b("new_f4option.data", buf);
   }

   public static void loadOptions() {
      boolean var1 = false;
      if (!fishing4.a.y.b("f4option.data") && !fishing4.a.y.b("new_f4option.data")) {
         a = true;
         b = true;
         c = true;
         d = true;
         hasConfirmedAgreement = false;
         hasChosenUserName = false;
         f = false;
         h = false;
         m = 0;
         n = 0;
         o = false;
         fishing4.b.d.a().b(0.5F);
         fishing4.b.d.a().a(1.0F);
      } else {
         x.d = System.currentTimeMillis();
         byte[] var2;
         if (fishing4.a.y.b("new_f4option.data")) {
            var2 = SaveLoadManager.loadFile("new_f4option.data");
         } else {
            var2 = SaveLoadManager.b("f4option.data");
         }

         boolean var0;
         if (var2[0] == 0) {
            var0 = false;
         } else {
            var0 = true;
         }

         Exception var10000;
         label159: {
            boolean var10001;
            try {
               a = var0;
            } catch (Exception var14) {
               var10000 = var14;
               var10001 = false;
               break label159;
            }

            if (var2[1] == 0) {
               var0 = false;
            } else {
               var0 = true;
            }

            try {
               b = var0;
            } catch (Exception var13) {
               var10000 = var13;
               var10001 = false;
               break label159;
            }

            if (var2[2] == 0) {
               var0 = false;
            } else {
               var0 = true;
            }

            try {
               c = var0;
            } catch (Exception var12) {
               var10000 = var12;
               var10001 = false;
               break label159;
            }

            if (var2[3] == 0) {
               var0 = false;
            } else {
               var0 = true;
            }

            try {
               d = var0;
            } catch (Exception var11) {
               var10000 = var11;
               var10001 = false;
               break label159;
            }

            if (var2[4] == 0) {
               var0 = false;
            } else {
               var0 = true;
            }

            try {
               hasConfirmedAgreement = var0;
               StringBuilder var3 = new StringBuilder("k:");
               Log.d("", var3.append(Boolean.toString(hasConfirmedAgreement)).toString());
            } catch (Exception var10) {
               var10000 = var10;
               var10001 = false;
               break label159;
            }

            if (var2[5] == 0) {
               var0 = false;
            } else {
               var0 = true;
            }

            try {
               f = var0;
               m = fishing4.a.a.a(var2, 6);
               n = fishing4.a.a.a(var2, 10);
            } catch (Exception var9) {
               var10000 = var9;
               var10001 = false;
               break label159;
            }

            if (var2[14] == 0) {
               var0 = false;
            } else {
               var0 = true;
            }

            try {
               o = var0;
            } catch (Exception var8) {
               var10000 = var8;
               var10001 = false;
               break label159;
            }

            if (var2[15] == 0) {
               var0 = false;
            } else {
               var0 = true;
            }

            try {
               h = var0;
               ad.p.b(fishing4.a.a.b(var2, 16));
               globalConfig.g.encryptLong(fishing4.a.a.b(var2, 24));
            } catch (Exception var7) {
               var10000 = var7;
               var10001 = false;
               break label159;
            }

            if (var2[32] == 0) {
               var0 = var1;
            } else {
               var0 = true;
            }

            label160: {
               try {
                  hasChosenUserName = var0;
                  byte[] var20 = new byte[21];
                  System.arraycopy(var2, 33, var20, 0, 20);
                  String var18 = new String(var20, "KSC5601");
                  globalConfig.userName = var18.trim();
                  if (a) {
                     fishing4.b.d.a().b(0.5F);
                     break label160;
                  }
               } catch (Exception var17) {
                  var10000 = var17;
                  var10001 = false;
                  break label159;
               }

               try {
                  fishing4.b.d.a().b(0.0F);
               } catch (Exception var6) {
                  var10000 = var6;
                  var10001 = false;
                  break label159;
               }
            }

            label161: {
               try {
                  if (b) {
                     fishing4.b.d.a().a(1.0F);
                     break label161;
                  }
               } catch (Exception var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label159;
               }

               try {
                  fishing4.b.d.a().a(0.0F);
               } catch (Exception var5) {
                  var10000 = var5;
                  var10001 = false;
                  break label159;
               }
            }

            try {
               if (h) {
                  globalConfig.j = true;
                  return;
               }
            } catch (Exception var15) {
               var10000 = var15;
               var10001 = false;
               break label159;
            }

            try {
               globalConfig.j = true;
               return;
            } catch (Exception var4) {
               var10000 = var4;
               var10001 = false;
            }
         }

         Exception var19 = var10000;
         var19.printStackTrace();
      }

   }
}

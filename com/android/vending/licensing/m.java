package com.android.vending.licensing;

import android.text.TextUtils;
import android.util.Log;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.util.Iterator;
import java.util.regex.Pattern;

final class m {
   private final n a;
   private final k b;
   private final int c;
   private final String d;
   private final String e;
   private final a f;

   private void d() {
      n var1 = this.a;
      k var2;
      if (this.a.a()) {
         var2 = this.b;
      } else {
         var2 = this.b;
      }

   }

   public final k a() {
      return this.b;
   }

   public final void a(PublicKey var1, int var2, String var3, String var4) {
      k var15;
      label104: {
         l var16;
         if (var2 == 0 || var2 == 1 || var2 == 2) {
            try {
               Signature var5 = Signature.getInstance("SHA1withRSA");
               var5.initVerify(var1);
               var5.update(var3.getBytes());
               if (!var5.verify(com.android.vending.licensing.a.a.a(var4))) {
                  Log.e("LicenseValidator", "Signature verification failed.");
                  var15 = this.b;
                  return;
               }
            } catch (NoSuchAlgorithmException var6) {
               throw new RuntimeException(var6);
            } catch (InvalidKeyException var7) {
               var16 = l.e;
               var15 = this.b;
               return;
            } catch (SignatureException var8) {
               throw new RuntimeException(var8);
            } catch (com.android.vending.licensing.a.b var9) {
               Log.e("LicenseValidator", "Could not Base64-decode signature.");
               var15 = this.b;
               return;
            }

            boolean var10001;
            Iterator var20;
            IllegalArgumentException var24;
            try {
               TextUtils.SimpleStringSplitter var17 = new TextUtils.SimpleStringSplitter(':');
               var17.setString(var3);
               var20 = var17.iterator();
               if (!var20.hasNext()) {
                  var24 = new IllegalArgumentException("Blank response.");
                  throw var24;
               }
            } catch (IllegalArgumentException var14) {
               var10001 = false;
               break label104;
            }

            try {
               var3 = (String)var20.next();
            } catch (IllegalArgumentException var12) {
               var10001 = false;
               break label104;
            }

            String var18 = "";

            try {
               if (var20.hasNext()) {
                  var18 = (String)var20.next();
               }
            } catch (IllegalArgumentException var11) {
               var10001 = false;
               break label104;
            }

            String[] var21;
            try {
               var21 = TextUtils.split(var3, Pattern.quote("|"));
               if (var21.length < 6) {
                  var24 = new IllegalArgumentException("Wrong number of fields.");
                  throw var24;
               }
            } catch (IllegalArgumentException var13) {
               var10001 = false;
               break label104;
            }

            p var19;
            try {
               var19 = new p();
               var19.g = var18;
               var19.a = Integer.parseInt(var21[0]);
               var19.b = Integer.parseInt(var21[1]);
               var19.c = var21[2];
               var19.d = var21[3];
               var19.e = var21[4];
               var19.f = Long.parseLong(var21[5]);
            } catch (IllegalArgumentException var10) {
               var10001 = false;
               break label104;
            }

            if (var19.a != var2) {
               Log.e("LicenseValidator", "Response codes don't match.");
               var15 = this.b;
               return;
            }

            if (var19.b != this.c) {
               Log.e("LicenseValidator", "Nonce doesn't match.");
               var15 = this.b;
               return;
            }

            if (!var19.c.equals(this.d)) {
               Log.e("LicenseValidator", "Package name doesn't match.");
               var15 = this.b;
               return;
            }

            if (!var19.d.equals(this.e)) {
               Log.e("LicenseValidator", "Version codes don't match.");
               var15 = this.b;
               return;
            }

            if (TextUtils.isEmpty(var19.e)) {
               Log.e("LicenseValidator", "User identifier is empty.");
               var15 = this.b;
               return;
            }
         }

         o var22;
         switch (var2) {
            case 0:
            case 2:
               a var23 = this.f;
               this.d();
               return;
            case 1:
               var22 = o.b;
               this.d();
               return;
            case 3:
               var16 = l.c;
               var15 = this.b;
               return;
            case 4:
               Log.w("LicenseValidator", "An error has occurred on the licensing server.");
               var22 = o.c;
               this.d();
               return;
            case 5:
               Log.w("LicenseValidator", "Licensing server is refusing to talk to this device, over quota.");
               var22 = o.c;
               this.d();
               return;
            case 257:
               Log.w("LicenseValidator", "Error contacting licensing server.");
               var22 = o.c;
               this.d();
               return;
            case 258:
               var16 = l.a;
               var15 = this.b;
               return;
            case 259:
               var16 = l.b;
               var15 = this.b;
               return;
            default:
               Log.e("LicenseValidator", "Unknown response code for license check.");
               var15 = this.b;
               return;
         }
      }

      Log.e("LicenseValidator", "Could not parse response.");
      var15 = this.b;
   }

   public final int b() {
      return this.c;
   }

   public final String c() {
      return this.d;
   }
}

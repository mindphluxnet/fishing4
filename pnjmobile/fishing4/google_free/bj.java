package pnjmobile.fishing4.google_free;

import android.text.TextUtils;
import android.util.Log;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class bj {
   private static final SecureRandom a = new SecureRandom();
   private static HashSet b = new HashSet();

   public static long a() {
      long var0 = a.nextLong();
      b.add(var0);
      return var0;
   }

   private static PublicKey a(String var0) {
      try {
         byte[] var6 = pnjmobile.fishing4.google_free.a.a.a(var0);
         KeyFactory var2 = KeyFactory.getInstance("RSA");
         X509EncodedKeySpec var1 = new X509EncodedKeySpec(var6);
         PublicKey var7 = var2.generatePublic(var1);
         return var7;
      } catch (NoSuchAlgorithmException var3) {
         throw new RuntimeException(var3);
      } catch (InvalidKeySpecException var4) {
         Log.e("Security", "Invalid key specification.");
         throw new IllegalArgumentException(var4);
      } catch (pnjmobile.fishing4.google_free.a.b var5) {
         Log.e("Security", "Base64 decoding failed.");
         throw new IllegalArgumentException(var5);
      }
   }

   public static ArrayList a(String var0, String var1) {
      ArrayList var21;
      if (var0 == null) {
         Log.e("Security", "data is null");
         var21 = null;
      } else {
         boolean var8;
         if (!TextUtils.isEmpty(var1)) {
            var8 = a(a("MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAhqHSj0N0tzeuU1W86+/9Ieu6epbptQvDYQ7+JU6B7o69xZlD+yyuedex3Gir/hNNdOdTv8WW182pDqibfiANqA0sIiYNvUrfIMnIWHQK53X7eFmF6fWHl+Pfog75IbpsLUlfVSp/j3mu240ypiZR+qipQ6vGp5Y2K4UdZWIpEN9Xr8vL0JOveyxHcEY+/puvsriMdRec7hdNKIqCjdUX1CYfJMbFNQzETmDNfWiM+nmi+9XdC2milByNiQgV0y7vR9r4DgcNkYB6InYjYevvPmGnkK0tQk2YhCCktSPirxLVw1AmbsMq4ePL1Ckn5i3a8ElfPpckcVa6wPy+zI+GKQIDAQAB"), var0, var1);
            if (!var8) {
               Log.w("Security", "signature does not match data.");
               var21 = null;
               return var21;
            }
         } else {
            var8 = false;
         }

         int var2;
         long var4;
         JSONArray var11;
         boolean var10001;
         label103: {
            label89: {
               try {
                  JSONObject var22 = new JSONObject(var0);
                  var4 = var22.optLong("nonce");
                  var11 = var22.optJSONArray("orders");
               } catch (JSONException var20) {
                  var10001 = false;
                  break label89;
               }

               if (var11 == null) {
                  var2 = 0;
                  break label103;
               }

               try {
                  var2 = var11.length();
                  break label103;
               } catch (JSONException var19) {
                  var10001 = false;
               }
            }

            var21 = null;
            return var21;
         }

         if (!b.contains(var4)) {
            Log.w("Security", "Nonce not found: " + var4);
            var21 = null;
         } else {
            ArrayList var23 = new ArrayList();

            for(int var3 = 0; var3 < var2; ++var3) {
               JSONException var10000;
               label92: {
                  long var6;
                  g var9;
                  String var10;
                  String var12;
                  JSONObject var13;
                  try {
                     var13 = var11.getJSONObject(var3);
                     var9 = g.a(var13.getInt("purchaseState"));
                     var10 = var13.getString("productId");
                     var13.getString("packageName");
                     var6 = var13.getLong("purchaseTime");
                     var12 = var13.optString("orderId", "");
                  } catch (JSONException var18) {
                     var10000 = var18;
                     var10001 = false;
                     break label92;
                  }

                  var0 = null;

                  try {
                     if (var13.has("notificationId")) {
                        var0 = var13.getString("notificationId");
                     }
                  } catch (JSONException var17) {
                     var10000 = var17;
                     var10001 = false;
                     break label92;
                  }

                  String var14;
                  label55: {
                     try {
                        var14 = var13.optString("developerPayload", (String)null);
                        if (var9 != g.a) {
                           break label55;
                        }
                     } catch (JSONException var16) {
                        var10000 = var16;
                        var10001 = false;
                        break label92;
                     }

                     if (!var8) {
                        continue;
                     }
                  }

                  try {
                     bk var25 = new bk(var9, var0, var10, var12, var6, var14);
                     var23.add(var25);
                     continue;
                  } catch (JSONException var15) {
                     var10000 = var15;
                     var10001 = false;
                  }
               }

               JSONException var24 = var10000;
               Log.e("Security", "JSON exception: ", var24);
               var21 = null;
               return var21;
            }

            a(var4);
            var21 = var23;
         }
      }

      return var21;
   }

   public static void a(long var0) {
      b.remove(var0);
   }

   private static boolean a(PublicKey var0, String var1, String var2) {
      boolean var3 = false;

      try {
         Signature var4 = Signature.getInstance("SHA1withRSA");
         var4.initVerify(var0);
         var4.update(var1.getBytes());
         if (!var4.verify(pnjmobile.fishing4.google_free.a.a.a(var2))) {
            Log.e("Security", "Signature verification failed.");
            return var3;
         }
      } catch (NoSuchAlgorithmException var5) {
         Log.e("Security", "NoSuchAlgorithmException.");
         return var3;
      } catch (InvalidKeyException var6) {
         Log.e("Security", "Invalid key specification.");
         return var3;
      } catch (SignatureException var7) {
         Log.e("Security", "Signature exception.");
         return var3;
      } catch (pnjmobile.fishing4.google_free.a.b var8) {
         Log.e("Security", "Base64 decoding failed.");
         return var3;
      }

      var3 = true;
      return var3;
   }
}

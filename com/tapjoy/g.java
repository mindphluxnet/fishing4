package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.Vector;
import org.w3c.dom.Document;

public final class g {
   private static String A = "";
   private static String B = "";
   private static String C = "";
   private static String D = "";
   private static String E = "";
   private static String F = "native";
   private static String G = "";
   private static boolean H = false;
   private static String I = "";
   private static float J = 1.0F;
   private static String K = null;
   private static Hashtable N = null;
   private static String O = "";
   private static Context a = null;
   private static g b = null;
   private static ag c = null;
   private static String d = "";
   private static String e = "";
   private static String f = "";
   private static String g = "";
   private static String h = "";
   private static String i = "";
   private static String j = "";
   private static String k = "";
   private static String l = "";
   private static String m = "";
   private static String n = "";
   private static String o = "";
   private static String p = "";
   private static String q = "";
   private static String r = "";
   private static String s = "";
   private static String t = "";
   private static String u = "";
   private static String v = "";
   private static String w = "";
   private static String x = "";
   private static String y = "";
   private static String z = "";
   private long L = 0L;
   private Timer M = null;

   private g(Context var1) {
      a = var1;
      c = new ag();
      m();
      aa.a("TapjoyConnect", "URL parameters: " + c());
      (new Thread(new h(this))).start();
   }

   public static g a() {
      return b;
   }

   private static String a(long var0) {
      String var2 = "";

      String var5;
      try {
         StringBuilder var3 = new StringBuilder(String.valueOf(p));
         var5 = ah.a(var3.append(":").append(e).append(":").append(var0).append(":").append(C).toString());
      } catch (Exception var4) {
         aa.b("TapjoyConnect", "getVerifier ERROR: " + var4.toString());
         return var2;
      }

      var2 = var5;
      return var2;
   }

   public static String a(long var0, String var2) {
      String var3 = "";

      try {
         StringBuilder var4 = new StringBuilder(String.valueOf(p));
         var2 = ah.a(var4.append(":").append(e).append(":").append(var0).append(":").append(C).append(":").append(var2).toString());
      } catch (Exception var5) {
         aa.b("TapjoyConnect", "getVerifier ERROR: " + var5.toString());
         var2 = var3;
      }

      return var2;
   }

   public static void a(int var0) {
      SharedPreferences.Editor var1 = a.getSharedPreferences("tjcPrefrences", 0).edit();
      var1.putInt("last_tap_points", var0);
      var1.commit();
   }

   public static void a(Context var0, String var1, String var2) {
      p = var1;
      C = var2;
      N = null;
      b = new g(var0);
   }

   public static void a(String var0) {
      F = var0;
   }

   public static void a(boolean var0) {
      H = var0;
   }

   public static void b(String var0) {
      G = var0;
   }

   public static String c() {
      String var3 = d() + "&";
      long var0 = System.currentTimeMillis() / 1000L;
      String var2 = a(var0);
      return var3 + "timestamp=" + var0 + "&" + "verifier=" + var2;
   }

   public static void c(String var0) {
      I = var0;
   }

   public static String d() {
      return "" + "app_id=" + Uri.encode(p) + "&" + l();
   }

   public static String e() {
      return u;
   }

   public static String e(String var0) {
      if (N != null) {
         var0 = (String)N.get(var0);
      } else {
         var0 = "";
      }

      return var0;
   }

   public static String f() {
      String var0 = "";
      if (H) {
         if (I.length() > 0) {
            var0 = "video_offer_ids=" + I;
         }
      } else {
         var0 = "hide_videos=true";
      }

      aa.a("TapjoyConnect", "video parameters: " + var0);
      return var0;
   }

   // $FF: synthetic method
   static boolean f(String var0) {
      Document var6 = ah.b(var0);
      if (var6 != null) {
         String var4 = ah.a(var6.getElementsByTagName("PackageNames"));
         if (var4 != null && var4.length() > 0) {
            Vector var3 = new Vector();
            int var1 = 0;

            while(true) {
               int var2 = var4.indexOf(44, var1);
               if (var2 == -1) {
                  aa.a("TapjoyConnect", "parse: " + var4.substring(var1).trim());
                  var3.add(var4.substring(var1).trim());
                  O = "";
                  Iterator var7 = a.getPackageManager().getInstalledApplications(0).iterator();

                  while(var7.hasNext()) {
                     ApplicationInfo var5 = (ApplicationInfo)var7.next();
                     if ((var5.flags & 1) != 1 && var3.contains(var5.packageName)) {
                        aa.a("TapjoyConnect", "MATCH: installed packageName: " + var5.packageName);
                        if (O.length() > 0) {
                           O = O + ",";
                        }

                        O = O + var5.packageName;
                     }
                  }
                  break;
               }

               aa.a("TapjoyConnect", "parse: " + var4.substring(var1, var2).trim());
               var3.add(var4.substring(var1, var2).trim());
               var1 = var2 + 1;
            }
         }

         var0 = ah.a(var6.getElementsByTagName("Success"));
         if (var0 != null) {
            var0.equals("true");
         }
      }

      return true;
   }

   public static String g() {
      String var0 = "";
      String var1 = var0;

      Exception var10000;
      label100: {
         ConnectivityManager var2;
         boolean var10001;
         try {
            var2 = (ConnectivityManager)a.getSystemService("connectivity");
         } catch (Exception var11) {
            var10000 = var11;
            var10001 = false;
            break label100;
         }

         label108: {
            if (var2 != null) {
               var1 = var0;

               try {
                  if (var2.getActiveNetworkInfo() != null) {
                     break label108;
                  }
               } catch (Exception var12) {
                  var10000 = var12;
                  var10001 = false;
                  break label100;
               }
            }

            var0 = "";
            return var0;
         }

         var1 = var0;

         label82: {
            label81: {
               try {
                  switch (var2.getActiveNetworkInfo().getType()) {
                     case 1:
                     case 6:
                        break label81;
                  }
               } catch (Exception var10) {
                  var10000 = var10;
                  var10001 = false;
                  break label100;
               }

               var0 = "mobile";
               break label82;
            }

            var0 = "wifi";
         }

         var1 = var0;

         StringBuilder var3;
         try {
            var3 = new StringBuilder;
         } catch (Exception var9) {
            var10000 = var9;
            var10001 = false;
            break label100;
         }

         var1 = var0;

         try {
            var3.<init>("connectivity: ");
         } catch (Exception var8) {
            var10000 = var8;
            var10001 = false;
            break label100;
         }

         var1 = var0;

         try {
            aa.a("TapjoyConnect", var3.append(var2.getActiveNetworkInfo().getType()).toString());
         } catch (Exception var7) {
            var10000 = var7;
            var10001 = false;
            break label100;
         }

         var1 = var0;

         StringBuilder var13;
         try {
            var13 = new StringBuilder;
         } catch (Exception var6) {
            var10000 = var6;
            var10001 = false;
            break label100;
         }

         var1 = var0;

         try {
            var13.<init>("connection_type: ");
         } catch (Exception var5) {
            var10000 = var5;
            var10001 = false;
            break label100;
         }

         var1 = var0;

         try {
            aa.a("TapjoyConnect", var13.append(var0).toString());
            return var0;
         } catch (Exception var4) {
            var10000 = var4;
            var10001 = false;
         }
      }

      Exception var14 = var10000;
      var0 = var1;
      aa.b("TapjoyConnect", "getConnectionType error: " + var14.toString());
      return var0;
   }

   // $FF: synthetic method
   static boolean g(String var0) {
      Document var2 = ah.b(var0);
      boolean var1;
      if (var2 != null) {
         var0 = ah.a(var2.getElementsByTagName("Success"));
         if (var0 != null && var0.equals("true")) {
            aa.a("TapjoyConnect", "Successfully sent completed Pay-Per-Action to Tapjoy server.");
            var1 = true;
            return var1;
         }

         aa.b("TapjoyConnect", "Completed Pay-Per-Action call failed.");
      }

      var1 = false;
      return var1;
   }

   public static String h() {
      return D;
   }

   public static int i() {
      return a.getSharedPreferences("tjcPrefrences", 0).getInt("last_tap_points", -9999);
   }

   // $FF: synthetic method
   static ag j() {
      return c;
   }

   // $FF: synthetic method
   static String k() {
      return O;
   }

   private static String l() {
      String var0 = "" + "android_id=" + d + "&";
      String var1;
      if (e("sha_2_udid") != null && e("sha_2_udid").equals("true")) {
         var1 = var0 + "sha2_udid=" + Uri.encode(f) + "&";
      } else {
         var1 = var0 + "udid=" + Uri.encode(e) + "&";
      }

      var0 = var1;
      if (g != null) {
         var0 = var1;
         if (g.length() > 0) {
            var0 = var1 + "sha1_mac_address=" + Uri.encode(h) + "&";
         }
      }

      var1 = var0;
      if (i != null) {
         var1 = var0;
         if (i.length() > 0) {
            var1 = var0 + "serial_id=" + Uri.encode(i) + "&";
         }
      }

      var1 = var1 + "device_name=" + Uri.encode(j) + "&" + "device_manufacturer=" + Uri.encode(k) + "&" + "device_type=" + Uri.encode(l) + "&" + "os_version=" + Uri.encode(m) + "&" + "country_code=" + Uri.encode(n) + "&" + "language_code=" + Uri.encode(o) + "&" + "app_version=" + Uri.encode(q) + "&" + "library_version=" + Uri.encode(r) + "&" + "platform=" + Uri.encode(v) + "&" + "display_multiplier=" + Uri.encode(Float.toString(J));
      var0 = var1;
      if (w.length() > 0) {
         var0 = var1 + "&" + "carrier_name=" + Uri.encode(w);
      }

      var1 = var0;
      if (x.length() > 0) {
         var1 = var0 + "&" + "carrier_country_code=" + Uri.encode(x);
      }

      String var2 = var1;
      if (y.length() > 0) {
         var2 = var1 + "&" + "mobile_country_code=" + Uri.encode(y);
      }

      var0 = var2;
      if (z.length() > 0) {
         var0 = var2 + "&" + "mobile_network_code=" + Uri.encode(z);
      }

      var1 = var0;
      if (s.length() > 0) {
         var1 = var0;
         if (t.length() > 0) {
            var1 = var0 + "&" + "screen_density=" + Uri.encode(s) + "&" + "screen_layout_size=" + Uri.encode(t);
         }
      }

      var2 = g();
      A = var2;
      var0 = var1;
      if (var2.length() > 0) {
         var0 = var1 + "&" + "connection_type=" + Uri.encode(A);
      }

      var1 = var0;
      if (F.length() > 0) {
         var1 = var0 + "&" + "plugin=" + Uri.encode(F);
      }

      var0 = var1;
      if (G.length() > 0) {
         var0 = var1 + "&" + "sdk_type=" + Uri.encode(G);
      }

      var1 = var0;
      if (B.length() > 0) {
         var1 = var0 + "&" + "store_name=" + Uri.encode(B);
      }

      return var1;
   }

   private static void m() {
      PackageManager var3 = a.getPackageManager();

      int var0;
      Exception var10000;
      boolean var10001;
      String var57;
      Exception var58;
      label418: {
         label441: {
            try {
               if (N == null) {
                  Hashtable var4 = new Hashtable();
                  N = var4;
               }
            } catch (Exception var51) {
               var10000 = var51;
               var10001 = false;
               break label441;
            }

            if (var3 == null) {
               break label418;
            }

            ApplicationInfo var5;
            try {
               var5 = var3.getApplicationInfo(a.getPackageName(), 128);
            } catch (Exception var50) {
               var10000 = var50;
               var10001 = false;
               break label441;
            }

            if (var5 != null) {
               label439: {
                  int var1;
                  String[] var6;
                  try {
                     if (var5.metaData == null) {
                        break label439;
                     }

                     var6 = com.tapjoy.j.a;
                     var1 = var6.length;
                  } catch (Exception var49) {
                     var10000 = var49;
                     var10001 = false;
                     break label441;
                  }

                  for(var0 = 0; var0 < var1; ++var0) {
                     var57 = var6[var0];

                     Object var65;
                     try {
                        Bundle var8 = var5.metaData;
                        StringBuilder var7 = new StringBuilder("tapjoy.");
                        var65 = var8.get(var7.append(var57).toString());
                     } catch (Exception var47) {
                        var10000 = var47;
                        var10001 = false;
                        break label441;
                     }

                     if (var65 != null) {
                        String var68;
                        try {
                           var68 = var65.toString();
                        } catch (Exception var46) {
                           var10000 = var46;
                           var10001 = false;
                           break label441;
                        }

                        if (var68 != null) {
                           try {
                              StringBuilder var71 = new StringBuilder("Found manifest flag: ");
                              aa.a("TapjoyConnect", var71.append(var57).append(", ").append(var68).toString());
                              N.put(var57, var68);
                           } catch (Exception var45) {
                              var10000 = var45;
                              var10001 = false;
                              break label441;
                           }
                        }
                     }
                  }

                  try {
                     aa.a("TapjoyConnect", "Metadata successfully loaded");
                     break label418;
                  } catch (Exception var44) {
                     var10000 = var44;
                     var10001 = false;
                     break label441;
                  }
               }
            }

            try {
               aa.a("TapjoyConnect", "No metadata present.");
               break label418;
            } catch (Exception var48) {
               var10000 = var48;
               var10001 = false;
            }
         }

         var58 = var10000;
         aa.b("TapjoyConnect", "Error reading manifest meta-data: " + var58.toString());
      }

      label425: {
         SharedPreferences var54;
         try {
            d = Secure.getString(a.getContentResolver(), "android_id");
            q = var3.getPackageInfo(a.getPackageName(), 0).versionName;
            l = "android";
            v = "android";
            j = Build.MODEL;
            k = Build.MANUFACTURER;
            m = VERSION.RELEASE;
            n = Locale.getDefault().getCountry();
            o = Locale.getDefault().getLanguage();
            r = "8.3.1";
            var54 = a.getSharedPreferences("tjcPrefrences", 0);
         } catch (Exception var43) {
            var10000 = var43;
            var10001 = false;
            break label425;
         }

         StringBuilder var60;
         StringBuilder var62;
         label426: {
            label427: {
               TelephonyManager var59;
               try {
                  var59 = (TelephonyManager)a.getSystemService("phone");
               } catch (Exception var42) {
                  var10000 = var42;
                  var10001 = false;
                  break label427;
               }

               if (var59 != null) {
                  label367: {
                     try {
                        e = var59.getDeviceId();
                        w = var59.getNetworkOperatorName();
                        x = var59.getNetworkCountryIso();
                        if (var59.getNetworkOperator() == null || var59.getNetworkOperator().length() != 5 && var59.getNetworkOperator().length() != 6) {
                           break label367;
                        }
                     } catch (Exception var41) {
                        var10000 = var41;
                        var10001 = false;
                        break label427;
                     }

                     try {
                        y = var59.getNetworkOperator().substring(0, 3);
                        z = var59.getNetworkOperator().substring(3);
                     } catch (Exception var40) {
                        var10000 = var40;
                        var10001 = false;
                        break label427;
                     }
                  }
               }

               boolean var52;
               label355: {
                  label429: {
                     try {
                        var60 = new StringBuilder("deviceID: ");
                        aa.a("TapjoyConnect", var60.append(e).toString());
                        if (e == null) {
                           aa.b("TapjoyConnect", "Device id is null.");
                           break label429;
                        }
                     } catch (Exception var39) {
                        var10000 = var39;
                        var10001 = false;
                        break label427;
                     }

                     label430: {
                        try {
                           if (e.length() == 0 || e.equals("000000000000000") || e.equals("0")) {
                              break label430;
                           }
                        } catch (Exception var38) {
                           var10000 = var38;
                           var10001 = false;
                           break label427;
                        }

                        try {
                           e = e.toLowerCase();
                        } catch (Exception var36) {
                           var10000 = var36;
                           var10001 = false;
                           break label427;
                        }

                        var52 = false;
                        break label355;
                     }

                     try {
                        aa.b("TapjoyConnect", "Device id is empty or an emulator.");
                     } catch (Exception var37) {
                        var10000 = var37;
                        var10001 = false;
                        break label427;
                     }

                     var52 = true;
                     break label355;
                  }

                  var52 = true;
               }

               try {
                  var60 = new StringBuilder("ANDROID SDK VERSION: ");
                  aa.a("TapjoyConnect", var60.append(VERSION.SDK).toString());
               } catch (Exception var35) {
                  var10000 = var35;
                  var10001 = false;
                  break label427;
               }

               boolean var53 = var52;

               label432: {
                  try {
                     if (Integer.parseInt(VERSION.SDK) < 9) {
                        break label432;
                     }

                     aa.a("TapjoyConnect", "TRYING TO GET SERIAL OF 2.3+ DEVICE...");
                     new y();
                     i = com.tapjoy.y.a();
                  } catch (Exception var34) {
                     var10000 = var34;
                     var10001 = false;
                     break label427;
                  }

                  if (var52) {
                     try {
                        e = i;
                     } catch (Exception var31) {
                        var10000 = var31;
                        var10001 = false;
                        break label427;
                     }
                  }

                  label320: {
                     try {
                        aa.a("TapjoyConnect", "====================");
                        var60 = new StringBuilder("SERIAL: deviceID: [");
                        aa.a("TapjoyConnect", var60.append(e).append("]").toString());
                        aa.a("TapjoyConnect", "====================");
                        if (e != null) {
                           break label320;
                        }

                        aa.b("TapjoyConnect", "SERIAL: Device id is null.");
                     } catch (Exception var33) {
                        var10000 = var33;
                        var10001 = false;
                        break label427;
                     }

                     var53 = true;
                     break label432;
                  }

                  label433: {
                     try {
                        if (e.length() != 0 && !e.equals("000000000000000") && !e.equals("0") && !e.equals("unknown")) {
                           break label433;
                        }
                     } catch (Exception var32) {
                        var10000 = var32;
                        var10001 = false;
                        break label427;
                     }

                     try {
                        aa.b("TapjoyConnect", "SERIAL: Device id is empty or an emulator.");
                     } catch (Exception var30) {
                        var10000 = var30;
                        var10001 = false;
                        break label427;
                     }

                     var53 = true;
                     break label432;
                  }

                  try {
                     e = e.toLowerCase();
                  } catch (Exception var29) {
                     var10000 = var29;
                     var10001 = false;
                     break label427;
                  }

                  var53 = false;
               }

               if (!var53) {
                  break label426;
               }

               String var61;
               StringBuffer var63;
               try {
                  var63 = new StringBuffer();
                  var63.append("EMULATOR");
                  var61 = var54.getString("emulatorDeviceId", (String)null);
               } catch (Exception var28) {
                  var10000 = var28;
                  var10001 = false;
                  break label427;
               }

               if (var61 != null) {
                  try {
                     if (!var61.equals("")) {
                        e = var61;
                        break label426;
                     }
                  } catch (Exception var27) {
                     var10000 = var27;
                     var10001 = false;
                     break label427;
                  }
               }

               for(var0 = 0; var0 < 32; ++var0) {
                  try {
                     var63.append("1234567890abcdefghijklmnopqrstuvw".charAt((int)(Math.random() * 100.0) % 30));
                  } catch (Exception var26) {
                     var10000 = var26;
                     var10001 = false;
                     break label427;
                  }
               }

               try {
                  e = var63.toString().toLowerCase();
                  SharedPreferences.Editor var64 = var54.edit();
                  var64.putString("emulatorDeviceId", e);
                  var64.commit();
                  break label426;
               } catch (Exception var25) {
                  var10000 = var25;
                  var10001 = false;
               }
            }

            var58 = var10000;

            try {
               var62 = new StringBuilder("Error getting deviceID. e: ");
               aa.b("TapjoyConnect", var62.append(var58.toString()).toString());
               e = null;
            } catch (Exception var24) {
               var10000 = var24;
               var10001 = false;
               break label425;
            }
         }

         try {
            if (u.length() == 0) {
               u = e;
            }
         } catch (Exception var23) {
            var10000 = var23;
            var10001 = false;
            break label425;
         }

         try {
            f = ah.a(e);
         } catch (Exception var22) {
            var10000 = var22;
            var10001 = false;
            break label425;
         }

         try {
            if (Integer.parseInt(VERSION.SDK) > 3) {
               r var67 = new r(a);
               var62 = new StringBuilder();
               s = var62.append(var67.a()).toString();
               var62 = new StringBuilder();
               t = var62.append(var67.b()).toString();
            }
         } catch (Exception var21) {
            var58 = var21;

            try {
               var62 = new StringBuilder("Error getting screen density/dimensions/layout: ");
               aa.b("TapjoyConnect", var62.append(var58.toString()).toString());
            } catch (Exception var20) {
               var10000 = var20;
               var10001 = false;
               break label425;
            }
         }

         label435: {
            label436: {
               WifiManager var69;
               try {
                  var69 = (WifiManager)a.getSystemService("wifi");
               } catch (Exception var19) {
                  var10000 = var19;
                  var10001 = false;
                  break label436;
               }

               if (var69 == null) {
                  break label435;
               }

               WifiInfo var70;
               try {
                  var70 = var69.getConnectionInfo();
               } catch (Exception var18) {
                  var10000 = var18;
                  var10001 = false;
                  break label436;
               }

               if (var70 == null) {
                  break label435;
               }

               try {
                  var57 = var70.getMacAddress();
                  g = var57;
               } catch (Exception var17) {
                  var10000 = var17;
                  var10001 = false;
                  break label436;
               }

               if (var57 == null) {
                  break label435;
               }

               try {
                  if (g.length() > 0) {
                     var57 = g.toUpperCase();
                     g = var57;
                     h = ah.a("SHA-1", var57);
                  }
                  break label435;
               } catch (Exception var16) {
                  var10000 = var16;
                  var10001 = false;
               }
            }

            var58 = var10000;

            try {
               var62 = new StringBuilder("Error getting device mac address: ");
               aa.b("TapjoyConnect", var62.append(var58.toString()).toString());
            } catch (Exception var15) {
               var10000 = var15;
               var10001 = false;
               break label425;
            }
         }

         try {
            if (e("store_name") != null && e("store_name").length() > 0) {
               B = e("store_name");
               ArrayList var72 = new ArrayList(Arrays.asList(com.tapjoy.j.b));
               if (!var72.contains(B)) {
                  var60 = new StringBuilder("Warning -- undefined STORE_NAME: ");
                  Log.w("TapjoyConnect", var60.append(B).toString());
               }
            }
         } catch (Exception var14) {
            var10000 = var14;
            var10001 = false;
            break label425;
         }

         String var55;
         try {
            var55 = var54.getString("InstallReferral", (String)null);
         } catch (Exception var13) {
            var10000 = var13;
            var10001 = false;
            break label425;
         }

         if (var55 != null) {
            try {
               if (!var55.equals("")) {
                  E = var55;
               }
            } catch (Exception var12) {
               var10000 = var12;
               var10001 = false;
               break label425;
            }
         }

         StringBuilder var56;
         Iterator var66;
         try {
            D = a.getPackageName();
            var56 = new StringBuilder("APP_ID = [");
            aa.a("TapjoyConnect", var56.append(p).append("]").toString());
            var56 = new StringBuilder("ANDROID_ID: [");
            aa.a("TapjoyConnect", var56.append(d).append("]").toString());
            var56 = new StringBuilder("CLIENT_PACKAGE = [");
            aa.a("TapjoyConnect", var56.append(D).append("]").toString());
            var56 = new StringBuilder("deviceID: [");
            aa.a("TapjoyConnect", var56.append(e).append("]").toString());
            var56 = new StringBuilder("sha2DeviceID: [");
            aa.a("TapjoyConnect", var56.append(f).append("]").toString());
            var56 = new StringBuilder("serial_id: [");
            aa.a("TapjoyConnect", var56.append(i).append("]").toString());
            var56 = new StringBuilder("mac_address: [");
            aa.a("TapjoyConnect", var56.append(g).append("]").toString());
            var56 = new StringBuilder("sha1_mac_address: [");
            aa.a("TapjoyConnect", var56.append(h).append("]").toString());
            var56 = new StringBuilder("deviceName: [");
            aa.a("TapjoyConnect", var56.append(j).append("]").toString());
            var56 = new StringBuilder("deviceManufacturer: [");
            aa.a("TapjoyConnect", var56.append(k).append("]").toString());
            var56 = new StringBuilder("deviceType: [");
            aa.a("TapjoyConnect", var56.append(l).append("]").toString());
            var56 = new StringBuilder("libraryVersion: [");
            aa.a("TapjoyConnect", var56.append(r).append("]").toString());
            var56 = new StringBuilder("deviceOSVersion: [");
            aa.a("TapjoyConnect", var56.append(m).append("]").toString());
            var56 = new StringBuilder("COUNTRY_CODE: [");
            aa.a("TapjoyConnect", var56.append(n).append("]").toString());
            var56 = new StringBuilder("LANGUAGE_CODE: [");
            aa.a("TapjoyConnect", var56.append(o).append("]").toString());
            var56 = new StringBuilder("density: [");
            aa.a("TapjoyConnect", var56.append(s).append("]").toString());
            var56 = new StringBuilder("screen_layout: [");
            aa.a("TapjoyConnect", var56.append(t).append("]").toString());
            var56 = new StringBuilder("carrier_name: [");
            aa.a("TapjoyConnect", var56.append(w).append("]").toString());
            var56 = new StringBuilder("carrier_country_code: [");
            aa.a("TapjoyConnect", var56.append(x).append("]").toString());
            var56 = new StringBuilder("mobile_country_code: [");
            aa.a("TapjoyConnect", var56.append(y).append("]").toString());
            var56 = new StringBuilder("mobile_network_code: [");
            aa.a("TapjoyConnect", var56.append(z).append("]").toString());
            var56 = new StringBuilder("store_name: [");
            aa.a("TapjoyConnect", var56.append(B).append("]").toString());
            var56 = new StringBuilder("referralURL: [");
            aa.a("TapjoyConnect", var56.append(E).append("]").toString());
            if (N == null) {
               return;
            }

            aa.a("TapjoyConnect", "Connect Flags:");
            aa.a("TapjoyConnect", "--------------------");
            var66 = N.entrySet().iterator();
         } catch (Exception var11) {
            var10000 = var11;
            var10001 = false;
            break label425;
         }

         while(true) {
            boolean var2;
            try {
               var2 = var66.hasNext();
            } catch (Exception var10) {
               var10000 = var10;
               var10001 = false;
               break;
            }

            if (!var2) {
               return;
            }

            try {
               Map.Entry var73 = (Map.Entry)var66.next();
               var56 = new StringBuilder("key: ");
               aa.a("TapjoyConnect", var56.append((String)var73.getKey()).append(", value: ").append(Uri.encode((String)var73.getValue())).toString());
               if (((String)var73.getKey()).equals("sha_2_udid") && !G.equals("connect")) {
                  aa.c("TapjoyConnect", "WARNING -- only the Connect/Advertiser SDK can support sha_2_udid");
                  N.remove("sha_2_udid");
               }
            } catch (Exception var9) {
               var10000 = var9;
               var10001 = false;
               break;
            }
         }
      }

      Exception var74 = var10000;
      aa.b("TapjoyConnect", "Error initializing Tapjoy parameters.  e=" + var74.toString());
   }

   public final void b() {
      (new Thread(new h(this))).start();
   }

   public final void d(String var1) {
      label11: {
         aa.a("TapjoyConnect", "actionComplete: " + var1);
         String var4 = "app_id=" + var1 + "&" + l();
         if (e("sha_2_udid") != null) {
            var1 = var4;
            if (e("sha_2_udid").equals("true")) {
               break label11;
            }
         }

         var1 = var4 + "&publisher_user_id=" + u;
      }

      var1 = var1 + "&";
      long var2 = System.currentTimeMillis() / 1000L;
      var1 = var1 + "timestamp=" + var2 + "&" + "verifier=" + a(var2);
      aa.a("TapjoyConnect", "PPA URL parameters: " + var1);
      (new Thread(new i(this, var1))).start();
   }
}

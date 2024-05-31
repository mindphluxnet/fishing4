package com.tapjoy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public final class ag {
   public static z a(String var0, String var1) {
      z var3 = new z();
      InputStreamReader var2 = null;

      label94: {
         StringBuilder var4;
         Exception var10000;
         HttpURLConnection var17;
         boolean var10001;
         Exception var20;
         BufferedReader var21;
         StringBuilder var24;
         label98: {
            try {
               var4 = new StringBuilder(String.valueOf(var0));
               var1 = var4.append(var1).toString().replaceAll(" ", "%20");
               var4 = new StringBuilder("baseURL: ");
               aa.a("TapjoyURLConnection", var4.append(var0).toString());
               StringBuilder var18 = new StringBuilder("requestURL: ");
               aa.a("TapjoyURLConnection", var18.append(var1).toString());
               aa.a("TapjoyURLConnection", "type: 0");
               URL var19 = new URL(var1);
               var17 = (HttpURLConnection)var19.openConnection();
            } catch (Exception var16) {
               var20 = var16;
               var17 = var2;
               break label98;
            }

            label89: {
               try {
                  var17.setConnectTimeout(15000);
                  var17.setReadTimeout(30000);
                  var17.connect();
                  var3.a = var17.getResponseCode();
                  var2 = new InputStreamReader(var17.getInputStream());
                  var21 = new BufferedReader(var2);
                  var4 = new StringBuilder();
               } catch (Exception var15) {
                  var10000 = var15;
                  var10001 = false;
                  break label89;
               }

               while(true) {
                  String var23;
                  try {
                     var23 = var21.readLine();
                  } catch (Exception var13) {
                     var10000 = var13;
                     var10001 = false;
                     break;
                  }

                  if (var23 == null) {
                     try {
                        var3.c = var4.toString();
                        var1 = var17.getHeaderField("content-length");
                     } catch (Exception var12) {
                        var10000 = var12;
                        var10001 = false;
                        break;
                     }

                     if (var1 == null) {
                        break label94;
                     }

                     try {
                        var3.b = Integer.valueOf(var1);
                        break label94;
                     } catch (Exception var11) {
                        var20 = var11;

                        try {
                           var24 = new StringBuilder("Exception: ");
                           aa.b("TapjoyURLConnection", var24.append(var20.toString()).toString());
                           break label94;
                        } catch (Exception var10) {
                           var10000 = var10;
                           var10001 = false;
                           break;
                        }
                     }
                  }

                  try {
                     StringBuilder var5 = new StringBuilder(String.valueOf(var23));
                     var4.append(var5.append('\n').toString());
                  } catch (Exception var14) {
                     var10000 = var14;
                     var10001 = false;
                     break;
                  }
               }
            }

            var20 = var10000;
         }

         aa.b("TapjoyURLConnection", "Exception: " + var20.toString());
         if (var17 != null) {
            label66: {
               label65: {
                  try {
                     if (var3.c != null) {
                        break label66;
                     }

                     var2 = new InputStreamReader(var17.getErrorStream());
                     var21 = new BufferedReader(var2);
                     var24 = new StringBuilder();
                  } catch (Exception var8) {
                     var10000 = var8;
                     var10001 = false;
                     break label65;
                  }

                  while(true) {
                     try {
                        var0 = var21.readLine();
                     } catch (Exception var7) {
                        var10000 = var7;
                        var10001 = false;
                        break;
                     }

                     if (var0 == null) {
                        try {
                           var3.c = var24.toString();
                           break label66;
                        } catch (Exception var6) {
                           var10000 = var6;
                           var10001 = false;
                           break;
                        }
                     }

                     try {
                        var4 = new StringBuilder(String.valueOf(var0));
                        var24.append(var4.append('\n').toString());
                     } catch (Exception var9) {
                        var10000 = var9;
                        var10001 = false;
                        break;
                     }
                  }
               }

               Exception var22 = var10000;
               aa.b("TapjoyURLConnection", "Exception trying to get error code/content: " + var22.toString());
            }
         }
      }

      aa.a("TapjoyURLConnection", "--------------------");
      aa.a("TapjoyURLConnection", "response status: " + var3.a);
      aa.a("TapjoyURLConnection", "response size: " + var3.b);
      aa.a("TapjoyURLConnection", "response: ");
      aa.a("TapjoyURLConnection", var3.c);
      aa.a("TapjoyURLConnection", "--------------------");
      return var3;
   }

   public static String a(String var0) {
      try {
         var0 = var0.replaceAll(" ", "%20");
         StringBuilder var1 = new StringBuilder("requestURL: ");
         aa.a("TapjoyURLConnection", var1.append(var0).toString());
         URL var4 = new URL(var0);
         HttpURLConnection var3 = (HttpURLConnection)var4.openConnection();
         var3.setConnectTimeout(15000);
         var3.setReadTimeout(30000);
         var0 = var3.getHeaderField("content-length");
      } catch (Exception var2) {
         aa.b("TapjoyURLConnection", "Exception: " + var2.toString());
         var0 = null;
      }

      aa.a("TapjoyURLConnection", "content-length: " + var0);
      return var0;
   }

   public static String b(String var0, String var1) {
      Exception var13;
      label54: {
         StringBuilder var2;
         HttpURLConnection var3;
         try {
            var2 = new StringBuilder(String.valueOf(var0));
            var1 = var2.append(var1).toString().replaceAll(" ", "%20");
            var2 = new StringBuilder("baseURL: ");
            aa.a("TapjoyURLConnection", var2.append(var0).toString());
            StringBuilder var11 = new StringBuilder("requestURL: ");
            aa.a("TapjoyURLConnection", var11.append(var1).toString());
            URL var12 = new URL(var1);
            var3 = (HttpURLConnection)var12.openConnection();
            var3.setConnectTimeout(15000);
            var3.setReadTimeout(30000);
            var0 = var3.getResponseMessage();
         } catch (Exception var10) {
            var13 = var10;
            var0 = null;
            break label54;
         }

         label47: {
            Exception var10000;
            label46: {
               StringBuilder var4;
               BufferedReader var14;
               boolean var10001;
               try {
                  var3.connect();
                  InputStreamReader var15 = new InputStreamReader(var3.getInputStream());
                  var14 = new BufferedReader(var15);
                  var4 = new StringBuilder();
               } catch (Exception var9) {
                  var10000 = var9;
                  var10001 = false;
                  break label46;
               }

               while(true) {
                  String var16;
                  try {
                     var16 = var14.readLine();
                  } catch (Exception var7) {
                     var10000 = var7;
                     var10001 = false;
                     break;
                  }

                  if (var16 == null) {
                     try {
                        var1 = var4.toString();
                        break label47;
                     } catch (Exception var6) {
                        var10000 = var6;
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     var2 = new StringBuilder(String.valueOf(var16));
                     var4.append(var2.append('\n').toString());
                  } catch (Exception var8) {
                     var10000 = var8;
                     var10001 = false;
                     break;
                  }
               }
            }

            var13 = var10000;
            break label54;
         }

         var0 = var1;

         try {
            aa.a("TapjoyURLConnection", "--------------------");
            StringBuilder var17 = new StringBuilder("response size: ");
            aa.a("TapjoyURLConnection", var17.append(var0.length()).toString());
            aa.a("TapjoyURLConnection", "response: ");
            var17 = new StringBuilder();
            aa.a("TapjoyURLConnection", var17.append(var0).toString());
            aa.a("TapjoyURLConnection", "--------------------");
            return var0;
         } catch (Exception var5) {
            var13 = var5;
         }
      }

      aa.b("TapjoyURLConnection", "Exception: " + var13.toString());
      return var0;
   }
}

package com.facebook.android;

import android.app.AlertDialog;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import org.json.JSONObject;

public final class FbUtil {
   public static Bundle a(String var0) {
      var0 = var0.replace("fbconnect", "http");

      Bundle var3;
      try {
         URL var1 = new URL(var0);
         var3 = c(var1.getQuery());
         var3.putAll(c(var1.getRef()));
      } catch (MalformedURLException var2) {
         var3 = new Bundle();
      }

      return var3;
   }

   public static String a(Bundle var0) {
      String var5;
      if (var0 == null) {
         var5 = "";
      } else {
         StringBuilder var2 = new StringBuilder();
         Iterator var3 = var0.keySet().iterator();

         String var4;
         for(boolean var1 = true; var3.hasNext(); var2.append(URLEncoder.encode(var4) + "=" + URLEncoder.encode(var0.getString(var4)))) {
            var4 = (String)var3.next();
            if (var1) {
               var1 = false;
            } else {
               var2.append("&");
            }
         }

         var5 = var2.toString();
      }

      return var5;
   }

   private static String a(Bundle var0, String var1) {
      String var5;
      if (var0 == null) {
         var5 = "";
      } else {
         StringBuilder var4 = new StringBuilder();
         Iterator var3 = var0.keySet().iterator();

         while(var3.hasNext()) {
            String var2 = (String)var3.next();
            if (!(var0.get(var2) instanceof byte[])) {
               var4.append("Content-Disposition: form-data; name=\"" + var2 + "\"\r\n\r\n" + var0.getString(var2));
               var4.append("\r\n--" + var1 + "\r\n");
            }
         }

         var5 = var4.toString();
      }

      return var5;
   }

   private static String a(InputStream var0) {
      StringBuilder var3 = new StringBuilder();
      BufferedReader var2 = new BufferedReader(new InputStreamReader(var0), 1000);

      for(String var1 = var2.readLine(); var1 != null; var1 = var2.readLine()) {
         var3.append(var1);
      }

      var0.close();
      return var3.toString();
   }

   public static String a(String var0, String var1, Bundle var2) {
      String var3 = var0;
      if (var1.equals("GET")) {
         var3 = var0 + "?" + a(var2);
      }

      Log.d("Facebook-Util", var1 + " URL: " + var3);
      HttpURLConnection var10 = (HttpURLConnection)(new URL(var3)).openConnection();
      var10.setRequestProperty("User-Agent", System.getProperties().getProperty("http.agent") + " FacebookAndroidSDK");
      if (!var1.equals("GET")) {
         Bundle var7 = new Bundle();
         Iterator var5 = var2.keySet().iterator();

         while(var5.hasNext()) {
            String var4 = (String)var5.next();
            if (var2.get(var4) instanceof byte[]) {
               var7.putByteArray(var4, var2.getByteArray(var4));
            }
         }

         if (!var2.containsKey("method")) {
            var2.putString("method", var1);
         }

         if (var2.containsKey("access_token")) {
            var2.putString("access_token", URLDecoder.decode(var2.getString("access_token")));
         }

         var10.setRequestMethod("POST");
         var10.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f");
         var10.setDoOutput(true);
         var10.setDoInput(true);
         var10.setRequestProperty("Connection", "Keep-Alive");
         var10.connect();
         BufferedOutputStream var8 = new BufferedOutputStream(var10.getOutputStream());
         var8.write(("--" + "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" + "\r\n").getBytes());
         var8.write(a(var2, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f").getBytes());
         var8.write(("\r\n" + "--" + "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" + "\r\n").getBytes());
         if (!var7.isEmpty()) {
            Iterator var11 = var7.keySet().iterator();

            while(var11.hasNext()) {
               String var9 = (String)var11.next();
               var8.write(("Content-Disposition: form-data; filename=\"" + var9 + "\"" + "\r\n").getBytes());
               var8.write(("Content-Type: content/unknown" + "\r\n" + "\r\n").getBytes());
               var8.write(var7.getByteArray(var9));
               var8.write(("\r\n" + "--" + "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f" + "\r\n").getBytes());
            }
         }

         var8.flush();
      }

      try {
         var0 = a(var10.getInputStream());
      } catch (FileNotFoundException var6) {
         var0 = a(var10.getErrorStream());
      }

      return var0;
   }

   public static void a(Context var0, String var1, String var2) {
      AlertDialog.Builder var3 = new AlertDialog.Builder(var0);
      var3.setTitle(var1);
      var3.setMessage(var2);
      var3.create().show();
   }

   public static JSONObject b(String var0) {
      if (var0.equals("false")) {
         throw new FacebookError("request failed");
      } else {
         String var1 = var0;
         if (var0.equals("true")) {
            var1 = "{value : true}";
         }

         JSONObject var2 = new JSONObject(var1);
         if (var2.has("error")) {
            var2 = var2.getJSONObject("error");
            throw new FacebookError(var2.getString("message"), var2.getString("type"), 0);
         } else if (var2.has("error_code") && var2.has("error_msg")) {
            throw new FacebookError(var2.getString("error_msg"), "", Integer.parseInt(var2.getString("error_code")));
         } else if (var2.has("error_code")) {
            throw new FacebookError("request failed", "", Integer.parseInt(var2.getString("error_code")));
         } else if (var2.has("error_msg")) {
            throw new FacebookError(var2.getString("error_msg"));
         } else if (var2.has("error_reason")) {
            throw new FacebookError(var2.getString("error_reason"));
         } else {
            return var2;
         }
      }
   }

   private static Bundle c(String var0) {
      Bundle var3 = new Bundle();
      if (var0 != null) {
         String[] var4 = var0.split("&");
         int var2 = var4.length;

         for(int var1 = 0; var1 < var2; ++var1) {
            String[] var5 = var4[var1].split("=");
            if (var5.length > 1 && var5[0] != null) {
               var3.putString(URLDecoder.decode(var5[0]), URLDecoder.decode(var5[1]));
            }
         }
      }

      return var3;
   }
}

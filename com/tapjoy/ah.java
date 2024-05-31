package com.tapjoy;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.security.MessageDigest;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class ah {
   public static String a(String var0) {
      return a("SHA-256", var0);
   }

   public static String a(String var0, String var1) {
      MessageDigest var5 = MessageDigest.getInstance(var0);
      var5.update(var1.getBytes("iso-8859-1"), 0, var1.length());
      byte[] var6 = var5.digest();
      StringBuffer var7 = new StringBuffer();

      for(int var2 = 0; var2 < var6.length; ++var2) {
         int var4 = var6[var2] >>> 4 & 15;
         int var3 = 0;

         while(true) {
            if (var4 >= 0 && var4 <= 9) {
               var7.append((char)(var4 + 48));
            } else {
               var7.append((char)(var4 - 10 + 97));
            }

            byte var8 = var6[var2];
            if (var3 > 0) {
               break;
            }

            ++var3;
            var4 = var8 & 15;
         }
      }

      return var7.toString();
   }

   public static String a(NodeList var0) {
      int var1 = 0;
      Element var6 = (Element)var0.item(0);
      String var7;
      if (var6 != null) {
         NodeList var4 = var6.getChildNodes();
         int var2 = var4.getLength();

         String var3;
         for(var3 = ""; var1 < var2; var3 = var7) {
            Node var5 = var4.item(var1);
            var7 = var3;
            if (var5 != null) {
               var7 = var3 + var5.getNodeValue();
            }

            ++var1;
         }

         if (var3 != null && !var3.equals("")) {
            var7 = var3.trim();
         } else {
            var7 = null;
         }
      } else {
         var7 = null;
      }

      return var7;
   }

   public static void a(File var0) {
      if (var0.isDirectory()) {
         File[] var3 = var0.listFiles();
         int var2 = var3.length;

         for(int var1 = 0; var1 < var2; ++var1) {
            a(var3[var1]);
         }
      }

      aa.a("TapjoyUtil", "****************************************");
      aa.a("TapjoyUtil", "deleteFileOrDirectory: " + var0.getAbsolutePath());
      aa.a("TapjoyUtil", "****************************************");
      var0.delete();
   }

   public static Document b(String var0) {
      Object var1 = null;

      Document var5;
      try {
         DocumentBuilderFactory var2 = DocumentBuilderFactory.newInstance();
         ByteArrayInputStream var3 = new ByteArrayInputStream(var0.getBytes("UTF-8"));
         var5 = var2.newDocumentBuilder().parse(var3);
      } catch (Exception var4) {
         aa.b("TapjoyUtil", "buildDocument exception: " + var4.toString());
         var5 = (Document)var1;
      }

      return var5;
   }
}

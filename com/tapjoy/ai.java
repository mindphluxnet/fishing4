package com.tapjoy;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Environment;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public final class ai {
   private static ai b = null;
   private static al c;
   private static Bitmap o;
   Context a;
   private String d = null;
   private String e = null;
   private int f = 5;
   private Vector g;
   private Hashtable h;
   private Hashtable i;
   private boolean j = false;
   private boolean k = false;
   private boolean l = false;
   private boolean m = false;
   private am n;

   public ai(Context var1) {
      this.a = var1;
      b = this;
      this.d = Environment.getExternalStorageDirectory().toString() + "/tjcache/data/";
      this.e = Environment.getExternalStorageDirectory().toString() + "/tjcache/tmp/";
      ah.a(new File(Environment.getExternalStorageDirectory().toString() + "/tapjoy/"));
      ah.a(new File(this.e));
      this.g = new Vector();
      this.h = new Hashtable();
      this.i = new Hashtable();
      aa.a("TapjoyVideo", "initVideoAd");
      if (com.tapjoy.g.e("disable_video_offers") != null && com.tapjoy.g.e("disable_video_offers").equals("true")) {
         aa.a("TapjoyVideo", "disable_video_offers: " + com.tapjoy.g.e("disable_video_offers") + ". Aborting video initializing... ");
         com.tapjoy.g.a(false);
      } else {
         this.g();
         (new Thread(new aj(this))).start();
         com.tapjoy.g.a(true);
      }

   }

   public static ai a() {
      return b;
   }

   // $FF: synthetic method
   static void a(Bitmap var0) {
      o = var0;
   }

   // $FF: synthetic method
   static boolean a(ai var0) {
      boolean var4 = false;
      byte var2 = 0;
      File[] var6 = (new File(var0.d)).listFiles();
      boolean var1;
      if (var0.h == null) {
         aa.b("TapjoyVideo", "Error: uncachedVideos is null");
         var1 = false;
      } else {
         var1 = true;
      }

      if (var0.i == null) {
         aa.b("TapjoyVideo", "Error: cachedVideos is null");
         var1 = false;
      }

      if (var0.g == null) {
         aa.b("TapjoyVideo", "Error: videoQueue is null");
         var1 = false;
      }

      boolean var3 = var4;
      if (var1) {
         var3 = var4;
         if (var6 != null) {
            for(int var9 = var2; var9 < var6.length; ++var9) {
               String var8 = var6[var9].getName();
               aa.a("TapjoyVideo", "-----");
               aa.a("TapjoyVideo", "Examining cached file[" + var9 + "]: " + var6[var9].getAbsolutePath() + " --- " + var6[var9].getName());
               if (var0.h.containsKey(var8)) {
                  aa.a("TapjoyVideo", "Local file found");
                  am var7 = (am)var0.h.get(var8);
                  if (var7 != null) {
                     new ag();
                     String var5 = ag.a(var7.c);
                     aa.a("TapjoyVideo", "local file size: " + var6[var9].length() + " vs. target: " + var5);
                     if (var5 != null && (long)Integer.parseInt(var5) == var6[var9].length()) {
                        var7.i = var6[var9].getAbsolutePath();
                        var0.i.put(var8, var7);
                        var0.h.remove(var8);
                        var0.g.remove(var8);
                        aa.a("TapjoyVideo", "VIDEO PREVIOUSLY CACHED -- " + var8 + ", location: " + var7.i);
                     } else {
                        aa.a("TapjoyVideo", "file size mismatch --- deleting video: " + var6[var9].getAbsolutePath());
                        ah.a(var6[var9]);
                     }
                  }
               } else {
                  aa.a("TapjoyVideo", "VIDEO EXPIRED? removing video from cache: " + var8 + " --- " + var6[var9].getAbsolutePath());
                  ah.a(var6[var9]);
               }
            }

            var3 = true;
         }
      }

      return var3;
   }

   // $FF: synthetic method
   static boolean a(ai var0, String var1) {
      return var0.a(var1);
   }

   private boolean a(String var1) {
      DocumentBuilderFactory var7 = DocumentBuilderFactory.newInstance();
      aa.a("TapjoyVideo", "========================================");

      boolean var5;
      Exception var10000;
      label249: {
         NodeList var8;
         boolean var10001;
         NodeList var39;
         NamedNodeMap var44;
         try {
            ByteArrayInputStream var6 = new ByteArrayInputStream(var1.getBytes("UTF-8"));
            Document var38 = var7.newDocumentBuilder().parse(var6);
            var38.getDocumentElement().normalize();
            var39 = var38.getElementsByTagName("TapjoyVideos");
            var8 = var39.item(0).getChildNodes();
            var44 = var39.item(0).getAttributes();
            if (var44.getNamedItem("cache_auto") != null && var44.getNamedItem("cache_auto").getNodeValue() != null) {
               this.j = Boolean.valueOf(var44.getNamedItem("cache_auto").getNodeValue());
            }
         } catch (Exception var37) {
            var10000 = var37;
            var10001 = false;
            break label249;
         }

         try {
            if (var44.getNamedItem("cache_wifi") != null && var44.getNamedItem("cache_wifi").getNodeValue() != null) {
               this.l = Boolean.valueOf(var44.getNamedItem("cache_wifi").getNodeValue());
            }
         } catch (Exception var36) {
            var10000 = var36;
            var10001 = false;
            break label249;
         }

         try {
            if (var44.getNamedItem("cache_mobile") != null && var44.getNamedItem("cache_mobile").getNodeValue() != null) {
               this.m = Boolean.valueOf(var44.getNamedItem("cache_mobile").getNodeValue());
            }
         } catch (Exception var35) {
            var10000 = var35;
            var10001 = false;
            break label249;
         }

         StringBuilder var45;
         try {
            var45 = new StringBuilder("cacheAuto: ");
            aa.a("TapjoyVideo", var45.append(this.j).toString());
            var45 = new StringBuilder("cacheWifi: ");
            aa.a("TapjoyVideo", var45.append(this.l).toString());
            var45 = new StringBuilder("cache3g: ");
            aa.a("TapjoyVideo", var45.append(this.m).toString());
            var45 = new StringBuilder("nodelistParent length: ");
            aa.a("TapjoyVideo", var45.append(var39.getLength()).toString());
            StringBuilder var40 = new StringBuilder("nodelist length: ");
            aa.a("TapjoyVideo", var40.append(var8.getLength()).toString());
         } catch (Exception var34) {
            var10000 = var34;
            var10001 = false;
            break label249;
         }

         int var2 = 0;

         label230:
         while(true) {
            int var3;
            try {
               var3 = var8.getLength();
            } catch (Exception var27) {
               var10000 = var27;
               var10001 = false;
               break;
            }

            if (var2 >= var3) {
               aa.a("TapjoyVideo", "========================================");
               var5 = true;
               return var5;
            }

            am var9;
            Node var41;
            try {
               var41 = var8.item(var2);
               var9 = new am();
            } catch (Exception var26) {
               var10000 = var26;
               var10001 = false;
               break;
            }

            if (var41 != null) {
               label251: {
                  Element var42;
                  String var47;
                  try {
                     if (var41.getNodeType() != 1) {
                        break label251;
                     }

                     var42 = (Element)var41;
                     var47 = ah.a(var42.getElementsByTagName("ClickURL"));
                  } catch (Exception var33) {
                     var10000 = var33;
                     var10001 = false;
                     break;
                  }

                  if (var47 != null) {
                     try {
                        if (!var47.equals("")) {
                           var9.b = var47;
                        }
                     } catch (Exception var25) {
                        var10000 = var25;
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     var47 = ah.a(var42.getElementsByTagName("OfferID"));
                  } catch (Exception var24) {
                     var10000 = var24;
                     var10001 = false;
                     break;
                  }

                  if (var47 != null) {
                     try {
                        if (!var47.equals("")) {
                           var9.a = var47;
                        }
                     } catch (Exception var23) {
                        var10000 = var23;
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     var47 = ah.a(var42.getElementsByTagName("Name"));
                  } catch (Exception var22) {
                     var10000 = var22;
                     var10001 = false;
                     break;
                  }

                  if (var47 != null) {
                     try {
                        if (!var47.equals("")) {
                           var9.d = var47;
                        }
                     } catch (Exception var21) {
                        var10000 = var21;
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     var47 = ah.a(var42.getElementsByTagName("Amount"));
                  } catch (Exception var20) {
                     var10000 = var20;
                     var10001 = false;
                     break;
                  }

                  if (var47 != null) {
                     try {
                        if (!var47.equals("")) {
                           var9.f = var47;
                        }
                     } catch (Exception var19) {
                        var10000 = var19;
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     var47 = ah.a(var42.getElementsByTagName("CurrencyName"));
                  } catch (Exception var18) {
                     var10000 = var18;
                     var10001 = false;
                     break;
                  }

                  if (var47 != null) {
                     try {
                        if (!var47.equals("")) {
                           var9.e = var47;
                        }
                     } catch (Exception var17) {
                        var10000 = var17;
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     var47 = ah.a(var42.getElementsByTagName("VideoURL"));
                  } catch (Exception var16) {
                     var10000 = var16;
                     var10001 = false;
                     break;
                  }

                  if (var47 != null) {
                     try {
                        if (!var47.equals("")) {
                           var9.c = var47;
                        }
                     } catch (Exception var15) {
                        var10000 = var15;
                        var10001 = false;
                        break;
                     }
                  }

                  try {
                     var47 = ah.a(var42.getElementsByTagName("IconURL"));
                  } catch (Exception var14) {
                     var10000 = var14;
                     var10001 = false;
                     break;
                  }

                  if (var47 != null) {
                     try {
                        if (!var47.equals("")) {
                           var9.g = var47;
                        }
                     } catch (Exception var13) {
                        var10000 = var13;
                        var10001 = false;
                        break;
                     }
                  }

                  NodeList var10;
                  try {
                     aa.a("TapjoyVideo", "-----");
                     var45 = new StringBuilder("videoObject.offerID: ");
                     aa.a("TapjoyVideo", var45.append(var9.a).toString());
                     var45 = new StringBuilder("videoObject.videoAdName: ");
                     aa.a("TapjoyVideo", var45.append(var9.d).toString());
                     var45 = new StringBuilder("videoObject.videoURL: ");
                     aa.a("TapjoyVideo", var45.append(var9.c).toString());
                     var10 = var42.getElementsByTagName("Buttons").item(0).getChildNodes();
                  } catch (Exception var12) {
                     var10000 = var12;
                     var10001 = false;
                     break;
                  }

                  var3 = 0;

                  while(true) {
                     label252: {
                        try {
                           if (var3 >= var10.getLength()) {
                              this.g.addElement(var9.a);
                              this.h.put(var9.a, var9);
                              break;
                           }
                        } catch (Exception var28) {
                           var10000 = var28;
                           var10001 = false;
                           break label230;
                        }

                        NodeList var11;
                        try {
                           var11 = var10.item(var3).getChildNodes();
                           if (var11.getLength() == 0) {
                              break label252;
                           }
                        } catch (Exception var30) {
                           var10000 = var30;
                           var10001 = false;
                           break label230;
                        }

                        var1 = "";
                        var47 = "";
                        int var4 = 0;

                        while(true) {
                           try {
                              if (var4 >= var11.getLength()) {
                                 StringBuilder var48 = new StringBuilder("name: ");
                                 aa.a("TapjoyVideo", var48.append(var1).append(", url: ").append(var47).toString());
                                 var9.j[var9.k][0] = var1;
                                 var9.j[var9.k][1] = var47;
                                 ++var9.k;
                                 break;
                              }
                           } catch (Exception var29) {
                              var10000 = var29;
                              var10001 = false;
                              break label230;
                           }

                           String var46;
                           label214: {
                              label213: {
                                 label212: {
                                    label211: {
                                       try {
                                          if ((Element)var11.item(var4) == null) {
                                             break label212;
                                          }

                                          var46 = ((Element)var11.item(var4)).getTagName();
                                          if (!var46.equals("Name") || var11.item(var4).getFirstChild() == null) {
                                             break label211;
                                          }

                                          var46 = var11.item(var4).getFirstChild().getNodeValue();
                                       } catch (Exception var32) {
                                          var10000 = var32;
                                          var10001 = false;
                                          break label230;
                                       }

                                       var1 = var47;
                                       var47 = var46;
                                       break label214;
                                    }

                                    try {
                                       if (var46.equals("URL") && var11.item(var4).getFirstChild() != null) {
                                          var46 = var11.item(var4).getFirstChild().getNodeValue();
                                          break label213;
                                       }
                                    } catch (Exception var31) {
                                       var10000 = var31;
                                       var10001 = false;
                                       break label230;
                                    }
                                 }

                                 var46 = var47;
                                 var47 = var1;
                                 var1 = var46;
                                 break label214;
                              }

                              var47 = var1;
                              var1 = var46;
                           }

                           ++var4;
                           var46 = var47;
                           var47 = var1;
                           var1 = var46;
                        }
                     }

                     ++var3;
                  }
               }
            }

            ++var2;
         }
      }

      Exception var43 = var10000;
      aa.b("TapjoyVideo", "Error parsing XML: " + var43.toString());
      var5 = false;
      return var5;
   }

   // $FF: synthetic method
   static void b(ai var0) {
      var0.g();
   }

   // $FF: synthetic method
   static void b(ai var0, String var1) {
      File var10 = null;
      File var9 = null;
      boolean var3 = true;
      aa.a("TapjoyVideo", "download and cache video from: " + var1);
      long var4 = System.currentTimeMillis();

      BufferedInputStream var8;
      boolean var34;
      FileOutputStream var45;
      label121: {
         long var6;
         File var36;
         label120: {
            FileOutputStream var33;
            SocketTimeoutException var41;
            label119: {
               SocketTimeoutException var46;
               label118: {
                  Exception var39;
                  label125: {
                     URLConnection var11;
                     try {
                        URL var38 = new URL(var1);
                        var11 = var38.openConnection();
                        var11.setConnectTimeout(15000);
                        var11.setReadTimeout(30000);
                        var11.connect();
                        var8 = new BufferedInputStream(var11.getInputStream());
                     } catch (SocketTimeoutException var26) {
                        var41 = var26;
                        var33 = null;
                        var8 = null;
                        break label119;
                     } catch (Exception var27) {
                        var39 = var27;
                        var33 = null;
                        var8 = null;
                        break label125;
                     }

                     Exception var10000;
                     boolean var10001;
                     label115: {
                        label114: {
                           String var12;
                           try {
                              File var44 = new File(var0.d);
                              String var13 = var1.substring(0, var1.lastIndexOf("/") + 1);
                              var1 = var1.substring(var1.lastIndexOf("/") + 1);
                              var12 = var1.substring(0, var1.indexOf(46));
                              StringBuilder var35 = new StringBuilder("fileDir: ");
                              aa.a("TapjoyVideo", var35.append(var44).toString());
                              var35 = new StringBuilder("path: ");
                              aa.a("TapjoyVideo", var35.append(var13).toString());
                              var35 = new StringBuilder("file name: ");
                              aa.a("TapjoyVideo", var35.append(var12).toString());
                              if (var44.mkdirs()) {
                                 var35 = new StringBuilder("created directory at: ");
                                 aa.a("TapjoyVideo", var35.append(var44.getPath()).toString());
                              }
                           } catch (SocketTimeoutException var30) {
                              var46 = var30;
                              var10001 = false;
                              break label118;
                           } catch (Exception var31) {
                              var10000 = var31;
                              var10001 = false;
                              break label114;
                           }

                           try {
                              var36 = new File(var0.d, var12);
                              break label115;
                           } catch (SocketTimeoutException var28) {
                              var46 = var28;
                              var10001 = false;
                              break label118;
                           } catch (Exception var29) {
                              var10000 = var29;
                              var10001 = false;
                           }
                        }

                        var39 = var10000;
                        var33 = null;
                        break label125;
                     }

                     try {
                        var45 = new FileOutputStream(var36);
                     } catch (SocketTimeoutException var24) {
                        var41 = var24;
                        var11 = null;
                        var9 = var36;
                        var33 = var11;
                        break label119;
                     } catch (Exception var25) {
                        var39 = var25;
                        var11 = null;
                        var10 = var36;
                        var33 = var11;
                        break label125;
                     }

                     label100: {
                        label99: {
                           StringBuilder var42;
                           byte[] var43;
                           try {
                              var42 = new StringBuilder("downloading video file to: ");
                              aa.a("TapjoyVideo", var42.append(var36.toString()).toString());
                              var43 = new byte[1024];
                           } catch (SocketTimeoutException var22) {
                              var46 = var22;
                              var10001 = false;
                              break label99;
                           } catch (Exception var23) {
                              var10000 = var23;
                              var10001 = false;
                              break label100;
                           }

                           while(true) {
                              int var2;
                              try {
                                 var2 = var8.read(var43);
                              } catch (SocketTimeoutException var18) {
                                 var46 = var18;
                                 var10001 = false;
                                 break;
                              } catch (Exception var19) {
                                 var10000 = var19;
                                 var10001 = false;
                                 break label100;
                              }

                              if (var2 == -1) {
                                 try {
                                    var45.close();
                                    var8.close();
                                    var42 = new StringBuilder("FILE SIZE: ");
                                    aa.a("TapjoyVideo", var42.append(var36.length()).toString());
                                    var6 = var36.length();
                                    break label120;
                                 } catch (SocketTimeoutException var16) {
                                    var46 = var16;
                                    var10001 = false;
                                    break;
                                 } catch (Exception var17) {
                                    var10000 = var17;
                                    var10001 = false;
                                    break label100;
                                 }
                              }

                              try {
                                 var45.write(var43, 0, var2);
                              } catch (SocketTimeoutException var20) {
                                 var46 = var20;
                                 var10001 = false;
                                 break;
                              } catch (Exception var21) {
                                 var10000 = var21;
                                 var10001 = false;
                                 break label100;
                              }
                           }
                        }

                        var41 = var46;
                        var9 = var36;
                        var33 = var45;
                        break label119;
                     }

                     var39 = var10000;
                     var10 = var36;
                     var33 = var45;
                  }

                  aa.b("TapjoyVideo", "Error caching video file: " + var39.toString());
                  var9 = var10;
                  var34 = true;
                  var3 = false;
                  var45 = var33;
                  break label121;
               }

               var41 = var46;
               var33 = null;
            }

            aa.b("TapjoyVideo", "Network timeout: " + var41.toString());
            var34 = true;
            var45 = var33;
            break label121;
         }

         if (var6 == 0L) {
            var34 = false;
            var9 = var36;
         } else {
            var34 = false;
            var3 = false;
            var9 = var36;
         }
      }

      if (var3) {
         aa.a("TapjoyVideo", "Network timeout");

         try {
            var8.close();
            var45.close();
         } catch (Exception var15) {
         }
      }

      if (!var3 && !var34) {
         try {
            String var40 = (String)var0.g.elementAt(0);
            am var37 = (am)var0.h.get(var40);
            var37.i = var9.getAbsolutePath();
            var0.i.put(var40, var37);
            var0.h.remove(var40);
            var0.g.removeElementAt(0);
            var0.g();
            StringBuilder var32 = new StringBuilder("video cached in: ");
            aa.a("TapjoyVideo", var32.append(System.currentTimeMillis() - var4).append("ms").toString());
         } catch (Exception var14) {
            aa.b("TapjoyVideo", "error caching video ???: " + var14.toString());
         }
      } else {
         c();
      }

   }

   public static void c() {
      if (c != null) {
         al var0 = c;
      }

   }

   // $FF: synthetic method
   static void c(ai var0) {
      var0.k = true;
   }

   public static void d() {
      if (c != null) {
         al var0 = c;
      }

   }

   // $FF: synthetic method
   static boolean d(ai var0) {
      return var0.j;
   }

   public static void e() {
      if (c != null) {
         al var0 = c;
      }

   }

   // $FF: synthetic method
   static void e(ai var0) {
      (new Thread(new ak(var0))).start();
   }

   public static Bitmap f() {
      return o;
   }

   // $FF: synthetic method
   static boolean f(ai var0) {
      return var0.k;
   }

   private void g() {
      String var2 = "";
      String var1 = var2;
      if (this.i != null) {
         var1 = var2;
         if (this.i.size() > 0) {
            Enumeration var4 = this.i.keys();
            var1 = "";

            while(var4.hasMoreElements()) {
               String var3 = (String)var4.nextElement();
               var1 = var1 + var3;
               if (var4.hasMoreElements()) {
                  var1 = var1 + ",";
               }
            }

            aa.a("TapjoyVideo", "cachedVideos size: " + this.i.size());
         }
      }

      aa.a("TapjoyVideo", "videoIDs: [" + var1 + "]");
      com.tapjoy.g.c(var1);
   }

   // $FF: synthetic method
   static boolean g(ai var0) {
      return var0.m;
   }

   // $FF: synthetic method
   static boolean h(ai var0) {
      return var0.l;
   }

   // $FF: synthetic method
   static Hashtable i(ai var0) {
      return var0.i;
   }

   // $FF: synthetic method
   static int j(ai var0) {
      return var0.f;
   }

   // $FF: synthetic method
   static Vector k(ai var0) {
      return var0.g;
   }

   // $FF: synthetic method
   static Hashtable l(ai var0) {
      return var0.h;
   }

   // $FF: synthetic method
   static void m(ai var0) {
      aa.a("TapjoyVideo", "cachedVideos size: " + var0.i.size());
      Iterator var2 = var0.i.entrySet().iterator();

      while(var2.hasNext()) {
         Map.Entry var1 = (Map.Entry)var2.next();
         aa.a("TapjoyVideo", "key: " + (String)var1.getKey() + ", name: " + ((am)var1.getValue()).d);
      }

   }

   public final boolean a(String var1, String var2, String var3, String var4, String var5, String var6) {
      boolean var8 = false;
      aa.a("TapjoyVideo", "Starting video activity with video: " + var1);
      if (var1 != null && var4 != null && var5 != null && var1.length() != 0 && var4.length() != 0 && var5.length() != 0) {
         this.n = (am)this.i.get(var1);
         if (!"mounted".equals(Environment.getExternalStorageState())) {
            aa.b("TapjoyVideo", "Cannot access external storage");
            c();
         } else {
            boolean var7;
            if (this.n == null) {
               aa.a("TapjoyVideo", "video not cached... checking uncached videos");
               this.n = (am)this.h.get(var1);
               if (this.n == null) {
                  if (var6 == null || var6.length() <= 0) {
                     aa.b("TapjoyVideo", "no video data and no video url - aborting playback...");
                     return var8;
                  }

                  am var9 = new am();
                  var9.a = var1;
                  var9.e = var2;
                  var9.f = var3;
                  var9.b = var4;
                  var9.h = var5;
                  var9.c = var6;
                  this.h.put(var1, var9);
                  this.n = (am)this.h.get(var1);
               }

               var7 = false;
            } else {
               var7 = true;
            }

            this.n.e = var2;
            this.n.f = var3;
            this.n.b = var4;
            this.n.h = var5;
            this.n.c = var6;
            aa.a("TapjoyVideo", "videoToPlay: " + this.n.a);
            aa.a("TapjoyVideo", "amount: " + this.n.f);
            aa.a("TapjoyVideo", "currency: " + this.n.e);
            aa.a("TapjoyVideo", "clickURL: " + this.n.b);
            aa.a("TapjoyVideo", "location: " + this.n.i);
            aa.a("TapjoyVideo", "webviewURL: " + this.n.h);
            aa.a("TapjoyVideo", "videoURL: " + this.n.c);
            if (var7 && this.n.i != null && !(new File(this.n.i)).exists()) {
               aa.b("TapjoyVideo", "video file does not exist.");
            } else {
               Intent var10 = new Intent(this.a, TapjoyVideoView.class);
               var10.setFlags(268435456);
               var10.putExtra("VIDEO_PATH", var1);
               this.a.startActivity(var10);
               var8 = true;
            }
         }
      } else {
         aa.a("TapjoyVideo", "aborting video playback... invalid or missing parameter");
      }

      return var8;
   }

   public final am b() {
      return this.n;
   }
}

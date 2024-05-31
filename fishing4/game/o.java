package fishing4.game;

import java.util.Vector;
import javax.microedition.khronos.opengles.GL10;

public final class o {
   public String a;
   public int[][] b;
   private boolean c = false;
   private String[] d;
   private fishing4.a.w[] e;
   private int[][] f;
   private int[] g;

   private o(GL10 var1, String var2) {
      if (!this.c) {
         try {
            this.b(var1, var2);
         } catch (Exception var3) {
         }
      }

   }

   public static o a(GL10 var0, String var1) {
      return new o(var0, var1);
   }

   private static void a(String[] var0, int[] var1, int var2) {
      for(int var3 = 0; var3 < var2; ++var3) {
         var1[var3 + 0] = Integer.parseInt(var0[var3 + 0]);
      }

   }

   private void b(GL10 var1, String var2) {
      this.a = fishing4.a.y.c(var2);
      fishing4.a.x var18 = new fishing4.a.x(this.a);

      while(true) {
         while(true) {
            label116:
            while(true) {
               boolean var10001;
               String var4;
               try {
                  var4 = var18.a();
               } catch (Exception var14) {
                  var10001 = false;
                  return;
               }

               if (var4 == null) {
                  return;
               }

               try {
                  if (var4.compareTo("TOTALFRAME") == 0) {
                     this.b = new int[Integer.parseInt(var18.a())][];
                     continue;
                  }
               } catch (Exception var13) {
                  var10001 = false;
                  return;
               }

               int var3;
               try {
                  if (var4.compareTo("TOTALANI") == 0) {
                     var3 = Integer.parseInt(var18.a());
                     this.f = new int[var3][];
                     this.g = new int[var3];
                     continue;
                  }
               } catch (Exception var12) {
                  var10001 = false;
                  return;
               }

               String[] var20;
               String var5;
               label128: {
                  try {
                     if (var4.compareTo("IMAGE") == 0) {
                        var20 = fishing4.a.x.d(var18.a("{", "}"));
                        this.e = new fishing4.a.w[var20.length];
                        break label128;
                     }
                  } catch (Exception var17) {
                     var10001 = false;
                     return;
                  }

                  label105: {
                     fishing4.a.x var19;
                     Vector var21;
                     try {
                        if (var4.compareTo("STRING") != 0) {
                           break label105;
                        }

                        var5 = var18.a("{", "}");
                        var19 = new fishing4.a.x(var5);
                        var21 = new Vector(30);
                     } catch (Exception var16) {
                        var10001 = false;
                        return;
                     }

                     while(true) {
                        String var6;
                        try {
                           var19.b("\"");
                           var19.a("\"");
                           var6 = var19.c("\"");
                        } catch (Exception var10) {
                           var10001 = false;
                           return;
                        }

                        if (var6 == null) {
                           try {
                              var20 = new String[var21.size()];
                              var21.copyInto(var20);
                              this.d = var20;
                              continue label116;
                           } catch (Exception var8) {
                              var10001 = false;
                              return;
                           }
                        }

                        try {
                           var21.addElement(var6);
                        } catch (Exception var11) {
                           var10001 = false;
                           return;
                        }
                     }
                  }

                  try {
                     if (var4.compareTo("ANIELEMENT") == 0) {
                        var3 = Integer.parseInt(var18.a());
                        var20 = fishing4.a.x.d(var18.a("{", "}"));
                        this.f[var3] = new int[var20.length];
                        a(var20, this.f[var3], var20.length);
                        this.g[var3] = 0;
                        continue;
                     }
                  } catch (Exception var15) {
                     var10001 = false;
                     return;
                  }

                  try {
                     if (var4.compareTo("FRAME") != 0) {
                        return;
                     }

                     var3 = Integer.parseInt(var18.a());
                     var20 = fishing4.a.x.d(var18.a("{", "}"));
                     this.b[var3] = new int[var20.length];
                     a(var20, this.b[var3], var20.length);
                     continue;
                  } catch (Exception var9) {
                     var10001 = false;
                     return;
                  }
               }

               var3 = 0;

               while(true) {
                  try {
                     if (var3 >= var20.length) {
                        break;
                     }

                     var5 = var20[var3].replace("\\", "/").substring(1);
                     this.e[var3] = fishing4.a.w.a(var1, var5);
                  } catch (Exception var7) {
                     var10001 = false;
                     return;
                  }

                  ++var3;
               }
            }
         }
      }
   }

   public final int a(int var1) {
      return this.f[var1].length;
   }

   public final void a(GL10 var1) {
      this.d = null;
      if (this.e != null) {
         for(int var2 = 0; var2 < this.e.length; ++var2) {
            fishing4.a.w.a(var1, this.e[var2]);
            this.e[var2] = null;
         }

         this.e = null;
      }

      this.b = null;
      this.f = null;
      this.g = null;
   }

   public final void a(GL10 var1, int var2, float var3, float var4, int var5) {
      int[] var12 = this.f[var2];
      var2 = var12[var5 % var12.length];
      int[] var13 = this.b[var2];

      for(var2 = 0; var2 < var13.length; var2 += 10) {
         fishing4.a.w var14 = this.e[var13[var2 + 1]];
         float var7 = (float)var13[var2 + 2];
         float var8 = (float)var13[var2 + 3];
         float var6 = (float)(var13[var2 + 4] + 0);
         float var11 = (float)(var13[var2 + 5] + 0);
         float var9 = (float)var13[var2 + 6];
         float var10 = (float)var13[var2 + 7];
         var5 = var13[var2 + 8];
         fishing4.a.m.a(var1, var14, var3 + var7, -1.0F * (var8 + var4), var6, var11, var9, var10, (char)var13[var2], var5, fishing4.a.d.a(1.0F, 0.0F));
      }

   }
}

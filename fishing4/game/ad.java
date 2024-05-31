package fishing4.game;

import java.util.ArrayList;

public final class ad {
   public static int a;
   public static int b;
   public static int c;
   public static int d;
   public static int e;
   public static int f;
   public static int g;
   public static ArrayList h;
   public static ArrayList i;
   public static ArrayList j;
   public static ArrayList k;
   public static ArrayList l;
   public static ArrayList m;
   public static ArrayList n;
   public static ae o;
   public static af p = new af();
   public static ArrayList q;
   public static ArrayList r;
   public static ArrayList s;
   public static ArrayList t;
   public static ArrayList u;
   public static ArrayList v;
   public static ArrayList w;

   public static ac a(int var0) {
      Object var2 = null;
      ac var1;
      if (var0 == 0) {
         if (a == -1) {
            var1 = (ac)var2;
         } else {
            var1 = (ac)i.get(a);
         }
      } else if (var0 == 1) {
         var1 = (ac)var2;
         if (c != -1) {
            var1 = (ac)j.get(c);
         }
      } else if (var0 == 2) {
         var1 = (ac)var2;
         if (b != -1) {
            var1 = (ac)k.get(b);
         }
      } else if (var0 == 4) {
         var1 = (ac)var2;
         if (f != -1) {
            var1 = (ac)m.get(f);
         }
      } else if (var0 == 3) {
         var1 = (ac)var2;
         if (e != -1) {
            var1 = (ac)l.get(e);
         }
      } else {
         var1 = (ac)var2;
         if (var0 == 5) {
            var1 = (ac)var2;
            if (d != -1) {
               var1 = (ac)n.get(d);
            }
         }
      }

      return var1;
   }

   public static void a() {
      byte var1 = 0;
      h = new ArrayList(8);
      i = new ArrayList(36);
      k = new ArrayList(36);
      j = new ArrayList(36);
      l = new ArrayList(36);
      m = new ArrayList(36);
      n = new ArrayList(36);
      r = new ArrayList(24);
      s = new ArrayList(24);
      t = new ArrayList(12);
      u = new ArrayList(12);
      v = new ArrayList(12);
      w = new ArrayList(12);
      q = new ArrayList(8);

      int var0;
      for(var0 = 0; var0 < 8; ++var0) {
         q.add(var0, ag.a(var0 + 80));
      }

      for(var0 = 0; var0 < 24; ++var0) {
         if (var0 < 20) {
            r.add(var0, ac.a(var0 + 100));
         }

         if (var0 < 20) {
            s.add(var0, ac.a(var0 + 200));
         }
      }

      for(var0 = var1; var0 < 12; ++var0) {
         if (var0 < 10) {
            t.add(var0, ac.a(var0 + 300));
         }

         if (var0 < 7) {
            u.add(var0, ac.a(var0 + 500));
            v.add(var0, ac.a(var0 + 600));
            w.add(var0, ac.a(var0 + 700));
         }
      }

   }

   public static boolean a(int var0, int var1) {
      // $FF: Couldn't be decompiled
   }

   public static boolean a(int var0, int var1, long var2, boolean var4) {
      int var6 = ab.d(var0);
      boolean var12;
      if (!var4) {
         if (var6 == 6) {
            if (o.b() < (long)ag.h(var0)) {
               var12 = false;
               return var12;
            }
         } else if (var6 == 7) {
            if (o.b() < (long)ag.g(var0)) {
               var12 = false;
               return var12;
            }
         } else if (o.b() < (long)ac.d(var0) * var2) {
            var12 = false;
            return var12;
         }
      }

      boolean var11;
      label152: {
         int var5;
         switch (var6) {
            case 0:
               if ((long)i.size() + var2 <= 36L) {
                  for(var5 = 0; (long)var5 < var2; ++var5) {
                     i.add(ac.b(var0, var1));
                  }

                  var11 = true;
                  break label152;
               }
               break;
            case 1:
               long var7 = var2;
               var1 = 0;

               long var9;
               while(true) {
                  if (var1 >= j.size()) {
                     var9 = var7;
                     break;
                  }

                  label143: {
                     if (((ac)j.get(var1)).f() == var0) {
                        if (((ac)j.get(var1)).c() >= 99) {
                           break label143;
                        }

                        var7 -= (long)(99 - ((ac)j.get(var1)).c());
                     }

                     var9 = var7;
                     if (var7 <= 0L) {
                        break;
                     }
                  }

                  ++var1;
               }

               if (var9 <= 0L) {
                  var7 = var2;

                  for(var1 = 0; var1 < j.size(); ++var1) {
                     if (((ac)j.get(var1)).f() == var0 && ((ac)j.get(var1)).c() < 99) {
                        if ((long)((ac)j.get(var1)).c() + var7 <= 99L) {
                           ((ac)j.get(var1)).a(var7);
                           var11 = true;
                           break label152;
                        }

                        var5 = 99 - ((ac)j.get(var1)).c();
                        ((ac)j.get(var1)).a((long)var5);
                        var7 -= (long)var5;
                     }
                  }

                  var11 = false;
                  break label152;
               }

               if (j.size() < 36) {
                  var7 = var2;

                  for(var1 = 0; var1 < j.size(); ++var1) {
                     if (((ac)j.get(var1)).f() == var0 && ((ac)j.get(var1)).c() < 99) {
                        var5 = 99 - ((ac)j.get(var1)).c();
                        ((ac)j.get(var1)).a((long)var5);
                        var7 -= (long)var5;
                     }
                  }

                  j.add(ac.a(var0, (int)var7));
                  var11 = true;
                  break label152;
               }
               break;
            case 2:
               if ((long)k.size() + var2 <= 36L) {
                  for(var5 = 0; (long)var5 < var2; ++var5) {
                     k.add(ac.b(var0, var1));
                  }

                  var11 = true;
                  break label152;
               }
               break;
            case 3:
               if ((long)l.size() + var2 <= 36L) {
                  for(var5 = 0; (long)var5 < var2; ++var5) {
                     l.add(ac.b(var0, var1));
                  }

                  var11 = true;
                  break label152;
               }
               break;
            case 4:
               if ((long)m.size() + var2 <= 36L) {
                  for(var5 = 0; (long)var5 < var2; ++var5) {
                     m.add(ac.b(var0, var1));
                  }

                  var11 = true;
                  break label152;
               }
               break;
            case 5:
               if ((long)n.size() + var2 <= 36L) {
                  for(var5 = 0; (long)var5 < var2; ++var5) {
                     n.add(ac.b(var0, var1));
                  }

                  var11 = true;
                  break label152;
               }
               break;
            case 6:
               h.add(ag.a(var0));
               var11 = true;
               fishing4.game.q.c(14);
               break label152;
         }

         var11 = false;
      }

      var12 = var11;
      if (var11) {
         var12 = var11;
         if (!var4) {
            if (var6 == 6) {
               o.d((long)ag.h(var0));
               var12 = var11;
            } else if (var6 == 7) {
               o.d((long)ag.g(var0));
               var12 = var11;
            } else {
               o.d((long)ac.d(var0) * var2);
               var12 = var11;
            }
         }
      }

      return var12;
   }

   public static boolean a(int var0, long var1, boolean var3) {
      return a(var0, 0, var1, var3);
   }

   public static int b(int var0) {
      byte var2 = -1;
      int var1;
      if (var0 == 6) {
         if (g == -1) {
            var1 = var2;
         } else {
            var1 = ((ag)h.get(g)).a;
         }
      } else if (var0 == 0) {
         var1 = var2;
         if (a != -1) {
            var1 = var2;
            if (i.size() != 0) {
               var1 = ac.d((ac)i.get(a));
            }
         }
      } else if (var0 == 1) {
         var1 = var2;
         if (c != -1) {
            var1 = var2;
            if (j.size() != 0) {
               var1 = ac.d((ac)j.get(c));
            }
         }
      } else if (var0 == 2) {
         var1 = var2;
         if (b != -1) {
            var1 = var2;
            if (k.size() != 0) {
               var1 = ac.d((ac)k.get(b));
            }
         }
      } else if (var0 == 4) {
         var1 = var2;
         if (f != -1) {
            var1 = var2;
            if (m.size() != 0) {
               var1 = ac.d((ac)m.get(f));
            }
         }
      } else if (var0 == 3) {
         var1 = var2;
         if (e != -1) {
            var1 = var2;
            if (l.size() != 0) {
               var1 = ac.d((ac)l.get(e));
            }
         }
      } else {
         var1 = var2;
         if (var0 == 5) {
            var1 = var2;
            if (d != -1) {
               var1 = var2;
               if (n.size() != 0) {
                  var1 = ac.d((ac)n.get(d));
               }
            }
         }
      }

      return var1;
   }

   public static void b() {
      h.clear();
      g = -1;
      m.clear();
      f = -1;
      l.clear();
      e = -1;
      n.clear();
      d = -1;
      i.clear();
      a = -1;
      j.clear();
      c = -1;
      k.clear();
      b = -1;
      o = ae.a(40000L);
      a(80, 0, 1L, true);
      g = 0;
      a(100, 0, 1L, true);
      a = 0;
      a(300, 0, 1L, true);
      b = 0;
      a(200, 0, 5L, true);
      c = 0;
      d = -1;
      e = -1;
      f = -1;
   }

   public static void b(int var0, int var1) {
      switch (var0) {
         case 0:
            if (var1 >= 0 && var1 < i.size()) {
               if (a > var1) {
                  --a;
               } else if (a == var1) {
                  a = -1;
               }

               i.remove(var1);
            }
            break;
         case 1:
            if (var1 >= 0 && var1 < j.size()) {
               if (c > var1) {
                  --c;
               } else if (c == var1) {
                  c = -1;
               }

               j.remove(var1);
            }
            break;
         case 2:
            if (var1 >= 0 && var1 < k.size()) {
               if (b > var1) {
                  --b;
               } else if (b == var1) {
                  b = -1;
               }

               k.remove(var1);
            }
            break;
         case 3:
            if (var1 >= 0 && var1 < l.size()) {
               if (e > var1) {
                  --e;
               } else if (e == var1) {
                  e = -1;
               }

               l.remove(var1);
            }
            break;
         case 4:
            if (var1 >= 0 && var1 < m.size()) {
               if (f > var1) {
                  --f;
               } else if (f == var1) {
                  f = -1;
               }

               m.remove(var1);
            }
            break;
         case 5:
            if (var1 >= 0 && var1 < n.size()) {
               if (d > var1) {
                  --d;
               } else if (d == var1) {
                  d = -1;
               }

               n.remove(var1);
            }
            break;
         case 6:
            if (var1 >= 0 && var1 < h.size()) {
               if (g > var1) {
                  --g;
               } else if (g == var1) {
                  g = -1;
               }

               h.remove(var1);
            }
      }

   }

   public static boolean c(int var0) {
      boolean var2 = false;

      for(int var1 = 0; var1 < h.size(); ++var1) {
         if (((ag)h.get(var1)).a == var0) {
            var2 = true;
            break;
         }
      }

      return var2;
   }

   public static boolean d(int var0) {
      return a(var0, 0, 1L, false);
   }
}

package fishing4.a;

import android.util.Log;
import com.tapjoy.af;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;

import fishing4.game.globalConfig;
import fishing4.game.OptionsManager;

public final class ab implements af, Runnable {
   private static int H;
   private static byte[] I;
   static boolean a;
   public static byte[] c = null;
   static Socket m = null;
   static DataOutputStream n = null;
   static DataInputStream o = null;
   int A = 101;
   int B = 1000;
   public boolean C = false;
   public boolean D = false;
   boolean E = false;
   int F;
   int G;
   boolean b;
   long d;
   int e;
   String f = "";
   String g = "";
   final byte h = 0;
   final byte i = 1;
   byte j;
   boolean k;
   byte l;
   int p = 0;
   int q = 1;
   int r = 2;
   int s = 3;
   int t = 4;
   int u = 5;
   int v = 6;
   int w = 7;
   int x = 8;
   int y = 99;
   int z = 100;

   public ab() {
      this.F = this.q;
      this.G = 0;
   }

   public ab(int var1) {
      this.F = this.q;
      this.G = var1;
   }

   private static byte[] c(int var0) throws IOException {
      byte[] var1 = null;
      if (a) {
         try {
            var1 = new byte[var0];
            o.readFully(var1, 0, var0);
         } catch (EOFException var2) {
            var1 = null;
         } catch (Exception var3) {
            throw new IOException(var3.getMessage());
         }
      }

      return var1;
   }

   public final void a() {
      com.tapjoy.f.a();
      com.tapjoy.f.a(this.G, this);
   }

   public final void a(int var1) {
      if (var1 > 0) {
         com.tapjoy.f.a();
         com.tapjoy.f.a(var1, this);
      }

      this.C = false;
   }

   public final void run() {
      // $FF: Couldn't be decompiled
   }
}

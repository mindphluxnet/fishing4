package com.android.vending.licensing;

import android.os.IBinder;
import android.os.Parcel;

final class f implements ILicensingService {
   private IBinder a;

   f(IBinder var1) {
      this.a = var1;
   }

   public final void a(long var1, String var3, b var4) {
      Object var5 = null;
      Parcel var6 = Parcel.obtain();

      label112: {
         Throwable var10000;
         label116: {
            boolean var10001;
            try {
               var6.writeInterfaceToken("com.android.vending.licensing.ILicensingService");
               var6.writeLong(var1);
               var6.writeString(var3);
            } catch (Throwable var18) {
               var10000 = var18;
               var10001 = false;
               break label116;
            }

            IBinder var19 = (IBinder)var5;
            if (var4 != null) {
               try {
                  var19 = var4.asBinder();
               } catch (Throwable var17) {
                  var10000 = var17;
                  var10001 = false;
                  break label116;
               }
            }

            label104:
            try {
               var6.writeStrongBinder(var19);
               this.a.transact(1, var6, (Parcel)null, 1);
               break label112;
            } catch (Throwable var16) {
               var10000 = var16;
               var10001 = false;
               break label104;
            }
         }

         Throwable var20 = var10000;
         var6.recycle();
         throw var20;
      }

      var6.recycle();
   }

   public final IBinder asBinder() {
      return this.a;
   }
}

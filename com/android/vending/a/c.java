package com.android.vending.a;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

final class c implements a {
   private IBinder a;

   c(IBinder var1) {
      this.a = var1;
   }

   public final Bundle a(Bundle var1) {
      Parcel var2 = Parcel.obtain();
      Parcel var3 = Parcel.obtain();

      label196: {
         Throwable var10000;
         label200: {
            boolean var10001;
            try {
               var2.writeInterfaceToken("com.android.vending.billing.IMarketBillingService");
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label200;
            }

            if (var1 != null) {
               try {
                  var2.writeInt(1);
                  var1.writeToParcel(var2, 0);
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  break label200;
               }
            } else {
               try {
                  var2.writeInt(0);
               } catch (Throwable var21) {
                  var10000 = var21;
                  var10001 = false;
                  break label200;
               }
            }

            try {
               this.a.transact(1, var2, var3, 0);
               var3.readException();
               if (var3.readInt() != 0) {
                  var1 = (Bundle)Bundle.CREATOR.createFromParcel(var3);
                  break label196;
               }
            } catch (Throwable var20) {
               var10000 = var20;
               var10001 = false;
               break label200;
            }

            var1 = null;
            break label196;
         }

         Throwable var24 = var10000;
         var3.recycle();
         var2.recycle();
         throw var24;
      }

      var3.recycle();
      var2.recycle();
      return var1;
   }

   public final IBinder asBinder() {
      return this.a;
   }
}

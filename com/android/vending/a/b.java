package com.android.vending.a;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class b extends Binder implements a {
   public static a a(IBinder var0) {
      Object var2;
      if (var0 == null) {
         var2 = null;
      } else {
         IInterface var1 = var0.queryLocalInterface("com.android.vending.billing.IMarketBillingService");
         if (var1 != null && var1 instanceof a) {
            var2 = (a)var1;
         } else {
            var2 = new c(var0);
         }
      }

      return (a)var2;
   }

   public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      boolean var5;
      switch (var1) {
         case 1:
            var2.enforceInterface("com.android.vending.billing.IMarketBillingService");
            Bundle var6;
            if (var2.readInt() != 0) {
               var6 = (Bundle)Bundle.CREATOR.createFromParcel(var2);
            } else {
               var6 = null;
            }

            var6 = this.a(var6);
            var3.writeNoException();
            if (var6 != null) {
               var3.writeInt(1);
               var6.writeToParcel(var3, 1);
            } else {
               var3.writeInt(0);
            }

            var5 = true;
            break;
         case 1598968902:
            var3.writeString("com.android.vending.billing.IMarketBillingService");
            var5 = true;
            break;
         default:
            var5 = super.onTransact(var1, var2, var3, var4);
      }

      return var5;
   }
}

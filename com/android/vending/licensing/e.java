package com.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public abstract class e extends Binder implements ILicensingService {
   public static ILicensingService a(IBinder var0) {
      Object var2;
      if (var0 == null) {
         var2 = null;
      } else {
         IInterface var1 = var0.queryLocalInterface("com.android.vending.licensing.ILicensingService");
         if (var1 != null && var1 instanceof ILicensingService) {
            var2 = (ILicensingService)var1;
         } else {
            var2 = new f(var0);
         }
      }

      return (ILicensingService)var2;
   }

   public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      boolean var7;
      switch (var1) {
         case 1:
            var2.enforceInterface("com.android.vending.licensing.ILicensingService");
            long var5 = var2.readLong();
            String var11 = var2.readString();
            IBinder var9 = var2.readStrongBinder();
            Object var10;
            if (var9 == null) {
               var10 = null;
            } else {
               IInterface var8 = var9.queryLocalInterface("com.android.vending.licensing.ILicenseResultListener");
               if (var8 != null && var8 instanceof b) {
                  var10 = (b)var8;
               } else {
                  var10 = new d(var9);
               }
            }

            this.a(var5, var11, (b)var10);
            var7 = true;
            break;
         case 1598968902:
            var3.writeString("com.android.vending.licensing.ILicensingService");
            var7 = true;
            break;
         default:
            var7 = super.onTransact(var1, var2, var3, var4);
      }

      return var7;
   }
}

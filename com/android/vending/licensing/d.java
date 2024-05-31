package com.android.vending.licensing;

import android.os.IBinder;
import android.os.Parcel;

final class d implements b {
   private IBinder a;

   d(IBinder var1) {
      this.a = var1;
   }

   public final void a(int var1, String var2, String var3) {
      Parcel var4 = Parcel.obtain();

      try {
         var4.writeInterfaceToken("com.android.vending.licensing.ILicenseResultListener");
         var4.writeInt(var1);
         var4.writeString(var2);
         var4.writeString(var3);
         this.a.transact(1, var4, (Parcel)null, 1);
      } finally {
         var4.recycle();
      }

   }

   public final IBinder asBinder() {
      return this.a;
   }
}

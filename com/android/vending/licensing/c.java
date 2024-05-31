package com.android.vending.licensing;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;

public abstract class c extends Binder implements b {
   public c() {
      this.attachInterface(this, "com.android.vending.licensing.ILicenseResultListener");
   }

   public IBinder asBinder() {
      return this;
   }

   public boolean onTransact(int var1, Parcel var2, Parcel var3, int var4) {
      boolean var5 = true;
      switch (var1) {
         case 1:
            var2.enforceInterface("com.android.vending.licensing.ILicenseResultListener");
            this.a(var2.readInt(), var2.readString(), var2.readString());
            break;
         case 1598968902:
            var3.writeString("com.android.vending.licensing.ILicenseResultListener");
            break;
         default:
            var5 = super.onTransact(var1, var2, var3, var4);
      }

      return var5;
   }
}

package pnjmobile.fishing4.google_free;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public final class bd {
   private static final String[] a = new String[]{"_id", "productId", "state", "purchaseTime", "developerPayload"};
   private static final String[] b = new String[]{"_id", "quantity"};
   private SQLiteDatabase c;
   private be d;

   public bd(Context var1) {
      this.d = new be(this, var1);
      this.c = this.d.getWritableDatabase();
   }

   public final int a(String param1, String param2, g param3, long param4, String param6) {
      // $FF: Couldn't be decompiled
   }

   public final void a() {
      this.d.close();
   }
}

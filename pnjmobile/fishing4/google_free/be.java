package pnjmobile.fishing4.google_free;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

final class be extends SQLiteOpenHelper {
   final bd a;

   public be(bd var1, Context var2) {
      super(var2, "purchase.db", (SQLiteDatabase.CursorFactory)null, 1);
      this.a = var1;
   }

   private static void a(SQLiteDatabase var0) {
      var0.execSQL("CREATE TABLE history(_id TEXT PRIMARY KEY, state INTEGER, productId TEXT, developerPayload TEXT, purchaseTime INTEGER)");
      var0.execSQL("CREATE TABLE purchased(_id TEXT PRIMARY KEY, quantity INTEGER)");
   }

   public final void onCreate(SQLiteDatabase var1) {
      a(var1);
   }

   public final void onUpgrade(SQLiteDatabase var1, int var2, int var3) {
      if (var3 != 1) {
         Log.w("PurchaseDatabase", "Database upgrade from old: " + var2 + " to: " + var3);
         var1.execSQL("DROP TABLE IF EXISTS history");
         var1.execSQL("DROP TABLE IF EXISTS purchased");
         a(var1);
      }

   }
}

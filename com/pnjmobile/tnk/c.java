package com.pnjmobile.tnk;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import java.io.IOException;
import java.net.URL;

final class c implements View.OnClickListener {
   final Pnjtnk a;

   c(Pnjtnk var1) {
      this.a = var1;
   }

   public final void onClick(View var1) {
      int var2 = var1.getId();
      this.a.b = ((h)this.a.m.get(var2)).f;
      this.a.c = ((h)this.a.m.get(var2)).e;
      Intent var6 = new Intent("android.intent.action.VIEW", Uri.parse(((h)this.a.m.get(var2)).d));
      this.a.startActivity(var6);

      StringBuilder var3;
      Pnjtnk var7;
      URL var8;
      try {
         var7 = this.a;
         var3 = new StringBuilder("http://wap.pnjmobile.co.kr/PNJ_Coin/Fishing4_FlatFish_Free_Coin/index.php?mode=log_publisher&packageName=");
         var8 = new URL(var3.append(com.pnjmobile.tnk.a.b()).append("&countKind=click_count").toString());
         Pnjtnk.a(var8);
      } catch (IOException var5) {
         var5.printStackTrace();
      }

      try {
         var7 = this.a;
         var3 = new StringBuilder("http://wap.pnjmobile.co.kr/PNJ_Coin/Fishing4_FlatFish_Free_Coin/index.php?mode=log_advertiser&packageName=");
         var8 = new URL(var3.append(this.a.c).append("&countKind=click_count").toString());
         Pnjtnk.a(var8);
      } catch (IOException var4) {
         var4.printStackTrace();
      }

   }
}

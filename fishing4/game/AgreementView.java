package fishing4.game;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.Window;
import android.widget.ImageButton;
import pnjmobile.fishing4.google_free.Main;

public class AgreementView extends Activity {
   int a = 0;
   private fishing4.a.r b = new fishing4.a.r();
   private fishing4.a.p c;

   // $FF: synthetic method
   static fishing4.a.p a(AgreementView var0) {
      return var0.c;
   }

   private void a() {
      if (this.c != null) {
         this.c.dismiss();
         this.c = null;
      }

      this.finish();
   }

   // $FF: synthetic method
   static void a(AgreementView var0, fishing4.a.p var1) {
      var0.c = var1;
   }

   // $FF: synthetic method
   static fishing4.a.r b(AgreementView var0) {
      return var0.b;
   }

   private void quitApplication() {
      AlertDialog.Builder alertDialogBuilder;
      if (globalConfig.languageId == 0) {
         alertDialogBuilder = new AlertDialog.Builder(this);
         alertDialogBuilder.setMessage("종료하시겠습니까?").setCancelable(false).setPositiveButton("예", new c(this)).setNegativeButton("아니오", new d(this));
         alertDialogBuilder.create().show();
      } else {
         alertDialogBuilder = new AlertDialog.Builder(this);
         alertDialogBuilder.setMessage("Do you want to quit?").setCancelable(false).setPositiveButton("Yes", new e(this)).setNegativeButton("No", new f(this));
         alertDialogBuilder.create().show();
      }

   }

   // $FF: synthetic method
   static void c(AgreementView var0) {
      var0.a();
   }

   // $FF: synthetic method
   static void d(AgreementView agreementView) {
      agreementView.c.dismiss();
      agreementView.c = null;
      OptionsManager.hasConfirmedAgreement = true;
      Thread newThread = new Thread(new fishing4.a.ac());
      Main.R = newThread;
      newThread.start();
      int apiLevel = VERSION.SDK_INT;
      if (apiLevel < 8) {
         throw new UnsupportedOperationException("Device must be at least API Level 8 (instead of " + apiLevel + ")");
      } else {
         PackageManager packageManager = agreementView.getPackageManager();

         try {
            packageManager.getPackageInfo("com.google.android.gsf", 0);
         } catch (PackageManager.NameNotFoundException ex) {
            throw new UnsupportedOperationException("Device does not have package com.google.android.gsf");
         }

         com.google.android.gcm.a.a((Context)agreementView);
         String var5 = com.google.android.gcm.a.c(agreementView);
         if ("".equals(var5)) {
            com.google.android.gcm.a.a(agreementView, "286281673119");
         } else {
            Log.v("GCMRegist", "이미 등록 되었음." + var5);
         }

         OptionsManager.saveOptions();
         agreementView.a();
         if (!OptionsManager.g) {
            agreementView.startActivity(new Intent(Main.u, userIDview.class));
         }

      }
   }

   // $FF: synthetic method
   static void exitApplication(AgreementView agreementView) {
      agreementView.quitApplication();
   }

   public void onBackPressed() {
      this.quitApplication();
   }

   public void onCreate(Bundle bundle) {
      super.onCreate(bundle);
      Window window = this.getWindow();
      this.setRequestedOrientation(1);
      window.setFlags(1024, 1024);
      window.addFlags(128);
      this.requestWindowFeature(1);
      this.requestWindowFeature(2);
      this.setRequestedOrientation(1);
      if (globalConfig.languageId == 0) {
         this.setContentView(2130903045);
      } else {
         this.setContentView(2130903040);
      }

      ImageButton var2 = (ImageButton)this.findViewById(2131099657);
      ImageButton var4 = (ImageButton)this.findViewById(2131099656);
      var2.setOnClickListener(new a(this, new g(this, this)));
      var4.setOnClickListener(new b(this));
   }
}

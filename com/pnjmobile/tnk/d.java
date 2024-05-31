package com.pnjmobile.tnk;

import android.app.AlertDialog;
import android.view.MotionEvent;
import android.view.View;

final class d implements View.OnTouchListener {
   final Pnjtnk a;

   d(Pnjtnk var1) {
      this.a = var1;
   }

   public final boolean onTouch(View var1, MotionEvent var2) {
      int var4 = (int)var2.getX();
      int var3 = (int)var2.getY();
      if (var2.getAction() == 0) {
         Pnjtnk var5 = this.a;
         if (Pnjtnk.a(var4, var3, 11, this.a.y.getWidth(), this.a.y.getHeight())) {
            this.a.finish();
         } else {
            var5 = this.a;
            if (Pnjtnk.a(var4, var3, (int)((float)this.a.s / this.a.r) - this.a.z.getWidth() - 11, this.a.z.getWidth(), this.a.z.getWidth())) {
               AlertDialog.Builder var6 = new AlertDialog.Builder(this.a);
               var6.setTitle("PNJ 무료 충전소 도움말");
               var6.setMessage("1. 이용절차\n\n환영합니다. 피엔제이 무료충전소를 통해, 게임머니 및 아이템을 무료로 획득하실 수 있습니다.\n피엔제이 무료충전소의 이용 절차는 다음과 같습니다.\n\n1) 게임 내에 피엔제이 무료충전소 버튼을 클릭합니다.\n2) 피엔제이 무료충전소 광고판에 표시되는 광고 중 원하는 것을 클릭합니다.\n3) 해당 게임의 상품 페이지로 이동합니다. 해당 게임을 설치해 주세요.\n4) 실행 중이던 게임을 다시 실행하신 후 무료충전소에서 선택했던 광고에 해당하는 게임이 사라진것을 확인합니다. 그리고 무료충전소를 나가 실행 중이던 게임으로 돌아가면 보상을 받으실 수 있습니다.\n\n\n2. 광고가 보이지 않으신가요?\n - 현재 실행중인 게임과 이미 설치하신 게임의 광고는 보이지 않습니다.\n - 네트워크 오류로 광고를 불러오는데 실패할 수 있습니다. 네트워크 연결을 확인해 주세요.\n - 일시적인 오류로 광고를 불러오지 못할 수 있습니다. 잠시 후 다시 시도해 보세요.\n - 현재 진행 중인 광고가 없을 때는 광고가 보이지 않습니다. 새로운 이벤트가 준비 중입니다.\n\n\n3. 페이지가 열리지 않으신가요?\n - 네트워크 연결에 문제가 있는 경우 정상적으로 동작하지 않을 수 있습니다. 네트워크 연결을 확인해 주세요.\n - 네트워크에 문제가 없을 경우 잠시 후 다시 시도해 보세요. 그래도 계속 에러가 발생할 경우 고객센터로 문의해 주시기 바랍니다.\n\n\n4. 보상이 들어오지 않았나요?\n - 피엔제이 무료충전소의 보상은 자동으로 진행됩니다. 보상을 받지 못하신 경우, 다음과 같이 시도해 보세요.\n1) 게임을 완전시 종료한 후 다시 실행합니다.\n2) 게임 내 충전샵 메뉴를 클릭합니다.\n3) 충전샵 메뉴에서 피엔제이 무료충전소 광고판을 다시 한번 실행하고, 설치한 게임의 광고가 보이는지 확인합니다.\n\n - 설치하신 게임의 광고가 여전히 보이는 경우는 게임 설치 과정에 문제가 있었던 경우일 수 있습니다. 다시 한번 광고를 클릭하고 게임 설치를 진행해 주세요.\n - 설치하신 게임의 광고가 보이지 않는 경우는 게임설치는 정상적으로 마무리 되었으나, 보상 지급에 문제가 생긴 경우일 수 있습니다. 피엔제이에 문의해 주세요.\n\n - 아래와 같은 경우에는 보상을 받으실 수 없습니다.\n > 한번 설치하여 보상을 받으신 게임을 다시 삭제하고 실행하시는 경우\n > 피엔제이 무료충전소를 거치지 않고 다른 경로를 통해 게임을 설치하신 경우\n   이런 경우에는 이전에 설치하신 게임을 삭제하시고 무료 충전소를 통해 재설치 하시면 보상을 드립니다.");
               var6.setPositiveButton("확인", new e(this));
               var6.show();
            }
         }
      }

      return false;
   }
}

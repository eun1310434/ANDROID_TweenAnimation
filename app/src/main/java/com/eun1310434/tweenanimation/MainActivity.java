/*=====================================================================
□ Infomation
  ○ Data : 15.03.2018
  ○ Mail : eun1310434@naver.com
  ○ Blog : https://blog.naver.com/eun1310434
  ○ Reference
     - Do it android app Programming
     - Hello JAVA Programming
     - http://itmining.tistory.com/5

□ Function
  ○ 투명도 : Alpha
  ○ 회전 : Rotate
  ○ 확대/축소 : Scale
  ○ 위치이동 : Translate

□ Study
  ○ 트윈 애니메이션
     - 보여줄 대상을 적절하게 연산한 후 그 결과를 연속적으로 디스플레이

  ○ 트윈 애니메이션을 위한 액션(Action) 정보
     - XML 리소스로 정의하거나 자바 코드에서 직접 객체로 만듬
     - 애니메이션을 위한 XML 파일은[/res/anim] 폴더의 밑에 두어야 하며 확장자를 xml로 함
     - 리소스로 포함된 애니메이션 액션 정의는 다른 리소스와 마찬가지로 필드할 때 컴파일되어 설치 파일에 포함

  ○ 대상
     - 뷰
       01) View는 위젯이나 레이아웃을 모두 포함
       02) 텍스트뷰나 리니어 레이아웃에 애니메이션을 적용할 수 있음
     - 그리기 객체
       01) 다양한 Drawable에 애니메이션을 적용할 수 있음
       02) ShaperDrawable은 캔버스에 그릴 도형을 지정할 수 있음
       03) BitmapDrawable은 비트맵 이미지를 지정할 수 있음

  ○ 효과
     - 위치이동 : Translate
     - 확대/축소 : Scale
     - 회전 : Rotate
     - 투명도 : Alpha
=====================================================================*/
package com.eun1310434.tweenanimation;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //alpha
        Button alphaButton = (Button) findViewById(R.id.alphaButton);
        alphaButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.alpha);
                v.startAnimation(anim);//해당 view 객체에 적용
            }
        });

        //rotate
        Button rotateButton = (Button) findViewById(R.id.rotateButton);
        rotateButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate);
                v.startAnimation(anim);//해당 view 객체에 적용
            }
        });

        //scale
        Button scaleButton = (Button) findViewById(R.id.scaleButton);
        scaleButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale);
                v.startAnimation(anim);//해당 view 객체에 적용
            }
        });

        //scale2
        Button scale2Button = (Button) findViewById(R.id.scale2Button);
        scale2Button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.scale2);
                v.startAnimation(anim);//해당 view 객체에 적용
            }
        });

        //translate
        Button translateButton = (Button) findViewById(R.id.translateButton);
        translateButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Animation anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
                v.startAnimation(anim);//해당 view 객체에 적용
            }
        });

    }

}

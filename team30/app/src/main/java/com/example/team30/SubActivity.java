package com.example.team30;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SubActivity extends AppCompatActivity {
    private TextView clickTextView;  //클릭된 카드의 숫자를 받아 오는 곳
    private boolean[] viewClickCheck = new boolean[22];
    private TextView[] cardText = new TextView[22];
    private List<Integer> listNum = new ArrayList<>();
    //private TextView clickTextView;  //클릭된 카드의 숫자를 받아 오는 곳
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.subactivity_main);

        int[] imagesources = {R.drawable.aa, R.drawable.ab, R.drawable.ac, R.drawable.ad,
                R.drawable.ba, R.drawable.bb, R.drawable.bc, R.drawable.bd, R.drawable.be,
                R.drawable.ca, R.drawable.cb, R.drawable.cc, R.drawable.cd,
                R.drawable.da, R.drawable.db, R.drawable.dc, R.drawable.dd, R.drawable.de,
                R.drawable.ea, R.drawable.eb, R.drawable.ec, R.drawable.ed,};  //카드의 앞면을 4장의 이미지를 이용해 랜덤 하게 표시하기 위한 곳

        Intent intent = getIntent();
        int sub_d = intent.getIntExtra("랜덤값",-1);

        clickTextView = findViewById(R.id.image_23);
        clickTextView.setBackgroundResource(imagesources[(int) sub_d]);
        //int sub_d;


//        clickTextView = findViewById(R.id.image_23);
//        clickTextView.setBackgroundResource(imagesources[(int) sub_d]);

//        for (int i = 0; i < cardText.length; i++) {
//            String viewName = "image_" + (i + 1);
////            cardText[i] = findViewById(getResources().getIdentifier(viewName, "id", getPackageName()));
////            cardText[i].setText(String.valueOf(listNum.get(i)));
////            viewClickCheck[i] = false;
//        }
        clickTextView.setOnClickListener(new View.OnClickListener() {
             int K = 1;

            public void onClick(final View view) {
                float scale = getApplicationContext().getResources().getDisplayMetrics().density;
                final float distance = clickTextView.getCameraDistance() * (scale + (scale / 3));
                clickTextView.setCameraDistance(distance);
                clickTextView.animate().withLayer()
                        .rotationY(90)
                        .setDuration(150);
                if (K == 1){ clickTextView.setBackgroundResource(R.drawable.ab); K =0;
                }
                else {
                    clickTextView.setBackgroundResource(imagesources[(int) sub_d]);
                    K = 1;
                }
                clickTextView.setRotationY(-90);
                      clickTextView.animate().withLayer()
                                        .rotationY(0)
                                        .setDuration(250)
                                        .start();
                }
            });
    }
}


////                for (int i = 0; i < cardText.length; i++) {
////                    viewClickCheck[i] = false;
////                }
//
//                clickTextView.animate().withLayer()
//                        .rotationY(90)
//                        .setDuration(150)
//                        .withEndAction(new Runnable(){
//                            @Override
//                            public void run(){
//                                if (!viewClickCheck[Integer.parseInt(clickTextView.getText().toString()) - 1]){
//                                    clickTextView.setBackgroundResource(R.drawable.aa);
//                                    viewClickCheck[Integer.parseInt(clickTextView.getText().toString()) - 1] = true;
//                                }else{
//                                    clickTextView.setBackgroundResource(R.drawable.card_back);
//                                    clickTextView.setTextColor(getResources().getColor(R.color.text_transparent));
//                                    viewClickCheck[Integer.parseInt(clickTextView.getText().toString()) - 1] = false;
//                                }
//                                clickTextView.setRotationY(-90);
//                                clickTextView.animate().withLayer()
//                                        .rotationY(0)
//                                        .setDuration(250)
//                                        .start();
//                            }
//                        }).start();




//        clickTextView.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//
//                float scale = getApplicationContext().getResources().getDisplayMetrics().density;
//                final float distance = clickTextView.getCameraDistance() * (scale + (scale / 3));
//                clickTextView.setCameraDistance(distance);
//
//                clickTextView.animate().withLayer()
//                        .rotationY(90)
//                        .setDuration(150)
//                        //현재 화면의 카드가 앞면 또는 뒷면인지를 구분한 후 카드의 이미지 교체 및 Textview의 글자 색상을 변경해 줍니다.
//                        //!viewClickCheck[Integer.parseInt(clickTextView.getText().toString()) - 1]
//                        //viewClickCheck 가 false면 (뒷면) 카드 이미지및 글자색상을 바꿔주며  앞면이 되었으니 viewClickCheck를 true로 변경해 줍니다.
//                        //Textview의 숫자를  viewClickCheck의 배열 순서로 사용했습니다.
//                        .withEndAction(new Runnable() {
//                            @Override
//                            public void run() {
//                                if (!viewClickCheck[Integer.parseInt(clickTextView.getText().toString()) - 1]) {
//                                    clickTextView.setBackgroundResource(imagesources[(int) sub_d]);
//                                    //clickTextView.setTextColor(getResources().getColor(R.color.text_color));
//                                    viewClickCheck[Integer.parseInt(clickTextView.getText().toString()) - 1] = true;
//                                } else {
//                                    clickTextView.setBackgroundResource(R.drawable.aa);
//                                    clickTextView.setTextColor(getResources().getColor(R.color.text_transparent));
//                                    viewClickCheck[Integer.parseInt(clickTextView.getText().toString()) - 1] = false;
//                                }
//                                clickTextView.setRotationY(-90);
//                                clickTextView.animate().withLayer()
//                                        .rotationY(0)
//                                        .setDuration(250)
//                                        .start();
//                            }
//                        }).start();
//            }
//        });


//    private void textViewOnClickListener() {
//        for (TextView v : cardText) {
//            v.setOnClickListener(cardClick(v));
//        }
//    }
//    private View.OnClickListener cardClick(final TextView textView) {
//
//        return new View.OnClickListener() {
//
//            @Override
//
//            public void onClick(View view) {
//
//
//
//                //카드 클릭 시 회전하면 위쪽과 아래쪽 카드 모서리가 잘려서 돌게 됩니다.
//                //setCameraDistance 카메라의 거리 값을 주는 것인데 회전 시 잘리는 이미지를 방지해 줍니다.
//                float scale = getApplicationContext().getResources().getDisplayMetrics().density;
//                final float distance = clickTextView.getCameraDistance() * (scale + (scale / 3));
//                clickTextView.setCameraDistance(distance);
//
//                //클릭 시 처음 이미지가 회전하는 각도 및 회전하는 시간을 설정할 수 있습니다.
//                //처음 회전이 완료되면 withEndAction이 다음 이미지를 출력합니다.
//                clickTextView.animate().withLayer()
//                        .rotationY(90)
//                        .setDuration(150)
//                        //현재 화면의 카드가 앞면 또는 뒷면인지를 구분한 후 카드의 이미지 교체 및 Textview의 글자 색상을 변경해 줍니다.
//                        //!viewClickCheck[Integer.parseInt(clickTextView.getText().toString()) - 1]
//                        //viewClickCheck 가 false면 (뒷면) 카드 이미지및 글자색상을 바꿔주며  앞면이 되었으니 viewClickCheck를 true로 변경해 줍니다.
//                        //Textview의 숫자를  viewClickCheck의 배열 순서로 사용했습니다.
//                        .withEndAction(new Runnable() {
//                            @Override
//                            public void run() {
//                                if (!viewClickCheck[Integer.parseInt(clickTextView.getText().toString()) - 1]) {
//                                    clickTextView.setBackgroundResource(imagesources[(int) sub_d]);
//                                    //clickTextView.setTextColor(getResources().getColor(R.color.text_color));
//                                    viewClickCheck[Integer.parseInt(clickTextView.getText().toString()) - 1] = true;
//                                } else {
//                                    clickTextView.setBackgroundResource(R.drawable.card_back);
//                                    clickTextView.setTextColor(getResources().getColor(R.color.text_transparent));
//                                    viewClickCheck[Integer.parseInt(clickTextView.getText().toString()) - 1] = false;
//                                }
//                                clickTextView.setRotationY(-90);
//                                clickTextView.animate().withLayer()
//                                        .rotationY(0)
//                                        .setDuration(250)
//                                        .start();
//                            }
//                        }).start();
//
//                //Intent intent1 = new Intent(getApplicationContext(), SubActivity.class);
//                //startActivity(intent1);
//
//                startActivity(intent);
//
//            }
//
//        };
//
//    }
//


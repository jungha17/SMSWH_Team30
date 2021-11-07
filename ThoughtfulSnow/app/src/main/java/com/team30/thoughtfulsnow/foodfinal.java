package com.team30.thoughtfulsnow;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class foodfinal extends AppCompatActivity {
    private TextView clickTextView2;
    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.foodfiinal);

        int[] imagesources = {R.drawable.aa, R.drawable.ab, R.drawable.ac, R.drawable.ad,
                R.drawable.ba, R.drawable.bb, R.drawable.bc, R.drawable.bd, R.drawable.be,
                R.drawable.ca, R.drawable.cb, R.drawable.cc, R.drawable.cd,
                R.drawable.da, R.drawable.db, R.drawable.dc, R.drawable.dd, R.drawable.de,
                R.drawable.ea, R.drawable.eb, R.drawable.ec, R.drawable.ed,};  //카드의 앞면을 4장의 이미지를 이용해 랜덤 하게 표시하기 위한 곳

        Intent intent1 = getIntent();
        int sub2_d = intent1.getIntExtra("랜덤값",-1);

        clickTextView2 = findViewById(R.id.image_24);
        clickTextView2.setBackgroundResource(imagesources[(int) sub2_d]);

//        //int sub_d;
//

//
//
//        Intent intent = getIntent();
//        int sub_d = intent.getIntExtra("랜덤값",-1);
//
//        System.out.println(sub_d);
//
//
//        clickTextView = findViewById(R.id.image_23);
//        clickTextView.setBackgroundResource(imagesources[(int) sub_d]);



    }
}
package com.example.team30;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View;

public class SubActivity extends AppCompatActivity {
    private TextView clickTextView;  //클릭된 카드의 숫자를 받아 오는 곳
    //private TextView clickTextView;  //클릭된 카드의 숫자를 받아 오는 곳
    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState){


        super.onCreate(savedInstanceState);
        setContentView(R.layout.subactivity_main);

        //int sub_d;

        int[] imagesources = {R.drawable.aa, R.drawable.ab, R.drawable.ac, R.drawable.ad,
                R.drawable.ba, R.drawable.bb, R.drawable.bc, R.drawable.bd, R.drawable.be,
                R.drawable.ca, R.drawable.cb, R.drawable.cc, R.drawable.cd,
                R.drawable.da, R.drawable.db, R.drawable.dc, R.drawable.dd, R.drawable.de,
                R.drawable.ea, R.drawable.eb, R.drawable.ec, R.drawable.ed,};  //카드의 앞면을 4장의 이미지를 이용해 랜덤 하게 표시하기 위한 곳


        Intent intent = getIntent();
        int sub_d = intent.getIntExtra("랜덤값",-1);

        System.out.println(sub_d);


        clickTextView = findViewById(R.id.image_23);
        clickTextView.setBackgroundResource(imagesources[(int) sub_d]);

        clickTextView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent1 = new Intent(SubActivity.this, foodfinal.class);
                intent1.putExtra("랜덤값", sub_d);
                startActivity(intent1);
            }
        });

    }

}

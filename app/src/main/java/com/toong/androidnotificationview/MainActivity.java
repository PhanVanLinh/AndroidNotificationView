package com.toong.androidnotificationview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private NotificationCustomView mNotificationCustomView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final View myYellowView = findViewById(R.id.viewA);

        mNotificationCustomView = (NotificationCustomView) findViewById(R.id.notification_view);
        mNotificationCustomView.setTitle("AAAA adaldk ;la ;adk;askd a;sdk;lasd;las kasd a;lsdka;sldklask");
        findViewById(R.id.btnSlideUp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                MyAnimationUtils.createBottomUpAnimation(myYellowView, null, myYellowView.getHeight()).start();

                mNotificationCustomView.hide();
            }
        });

        findViewById(R.id.btnSlideDown).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                MyAnimationUtils.createTopDownAnimation(myYellowView, null, myYellowView.getHeight()).start();
                mNotificationCustomView.show();
            }
        });
    }


}

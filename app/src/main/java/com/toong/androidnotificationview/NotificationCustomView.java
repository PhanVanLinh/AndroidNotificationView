package com.toong.androidnotificationview;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class NotificationCustomView extends LinearLayout implements View.OnClickListener {

    private TextView tvTitle;
    private ImageView ivClose;
    private boolean isShow;

    public NotificationCustomView(Context context) {
        this(context, null);
    }

    public NotificationCustomView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public NotificationCustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init(attrs);
    }

    private void init(AttributeSet attrs) {
        LayoutInflater.from(getContext()).inflate(R.layout.layout_custom_notification, this, true);
        tvTitle = (TextView) findViewById(R.id.text_title);
        ivClose = (ImageView) findViewById(R.id.image_close);

        ivClose.setOnClickListener(this);
        setOnClickListener(this);
    }

    public void setTitle(String title) {
        tvTitle.setText(title);
    }

    public void show() {
        isShow = true;
        MyAnimationUtils.createTopDownAnimation(this, null, this.getHeight()).start();
    }

    public void hide() {
        isShow = false;
        MyAnimationUtils.createBottomUpAnimation(this, null, this.getHeight()).start();
    }

    @Override
    public void onClick(View view) {
        hide();
    }
}
package com.toong.androidnotificationview;

import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.view.View;

public class MyAnimationUtils {

    public static void slideUp(View view) {
        view.startAnimation(android.view.animation.AnimationUtils.loadAnimation(view.getContext(),
                R.anim.slide_down));
    }

    public static void slideDown(View view) {
        view.startAnimation(android.view.animation.AnimationUtils.loadAnimation(view.getContext(),
                R.anim.slide_up));
    }

    public static ObjectAnimator createBottomUpAnimation(View view,
            AnimatorListenerAdapter listener, float distance) {
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "translationY", -distance);
        //        animator.setDuration(???)
        animator.removeAllListeners();
        if (listener != null) {
            animator.addListener(listener);
        }
        return animator;
    }

    public static ObjectAnimator createTopDownAnimation(View view, AnimatorListenerAdapter listener,
            float distance) {
        view.setTranslationY(-distance);
        ObjectAnimator animator = ObjectAnimator.ofFloat(view, "translationY", 0);
        animator.removeAllListeners();
        if (listener != null) {
            animator.addListener(listener);
        }
        return animator;
    }
}
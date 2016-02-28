package net.aungpyaephyo.phandeeyar.views;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;

import net.aungpyaephyo.phandeeyar.R;
import net.aungpyaephyo.phandeeyar.controllers.BaseController;
import net.aungpyaephyo.phandeeyar.controllers.ViewController;

/**
 * Created by aung on 2/25/16.
 */
public class ViewPodFabs extends FrameLayout implements ViewController {

    private FloatingActionButton fabPlus;
    private FloatingActionButton fabCall;
    private FloatingActionButton fabMap;
    private FloatingActionButton fabFacebook;

    private ControllerFabs controller;

    private boolean isOpen = false;

    public ViewPodFabs(Context context) {
        super(context);
    }

    public ViewPodFabs(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ViewPodFabs(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void openAnim() {
        ObjectAnimator objAnimRotation = ObjectAnimator.ofFloat(fabPlus, "rotation", 540f, 0f);
        objAnimRotation.setDuration(600);
        objAnimRotation.setInterpolator(new AccelerateInterpolator());
        objAnimRotation.start();

        ObjectAnimator objAnimCallFW = ObjectAnimator.ofFloat(fabCall, "y", fabCall.getY(), fabCall.getY() - 310f);
        objAnimCallFW.setDuration(500);
        objAnimCallFW.setInterpolator(new AccelerateDecelerateInterpolator());

        ObjectAnimator objAnimCallBW = ObjectAnimator.ofFloat(fabCall, "y", fabCall.getY() - 310, fabCall.getY() - 280f);
        objAnimCallBW.setDuration(100);
        objAnimCallBW.setInterpolator(new AccelerateDecelerateInterpolator());

        AnimatorSet asCall = new AnimatorSet();
        asCall.play(objAnimCallBW).after(objAnimCallFW);
        asCall.start();

        ObjectAnimator objAnimFacebookFW = ObjectAnimator.ofFloat(fabFacebook, "x", fabFacebook.getX(), fabFacebook.getX() - 310f);
        objAnimFacebookFW.setDuration(500);
        objAnimFacebookFW.setInterpolator(new AccelerateDecelerateInterpolator());

        ObjectAnimator objAnimFacebookBW = ObjectAnimator.ofFloat(fabFacebook, "x", fabFacebook.getX() - 310, fabFacebook.getX() - 280f);
        objAnimFacebookBW.setDuration(100);
        objAnimFacebookBW.setInterpolator(new AccelerateDecelerateInterpolator());

        AnimatorSet asFacebook = new AnimatorSet();
        asFacebook.play(objAnimFacebookBW).after(objAnimFacebookFW);
        asFacebook.start();

        ObjectAnimator objAnimMapXFW = ObjectAnimator.ofFloat(fabMap, "x", fabMap.getX(), fabMap.getX() - 180f);
        objAnimMapXFW.setDuration(500);
        objAnimMapXFW.setInterpolator(new AccelerateDecelerateInterpolator());

        ObjectAnimator objAnimMapYFW = ObjectAnimator.ofFloat(fabMap, "y", fabMap.getY(), fabMap.getY() - 180f);
        objAnimMapYFW.setDuration(500);
        objAnimMapYFW.setInterpolator(new AccelerateDecelerateInterpolator());

        AnimatorSet asMapFW = new AnimatorSet();
        asMapFW.play(objAnimMapYFW).with(objAnimMapXFW);
        asMapFW.start();

        ObjectAnimator objAnimMapXBW = ObjectAnimator.ofFloat(fabMap, "x", fabMap.getX() - 180f, fabMap.getX() - 160f);
        objAnimMapXBW.setDuration(100);
        objAnimMapXBW.setInterpolator(new AccelerateDecelerateInterpolator());

        ObjectAnimator objAnimMapYBW = ObjectAnimator.ofFloat(fabMap, "y", fabMap.getY() - 180f, fabMap.getY() - 160f);
        objAnimMapYBW.setDuration(100);
        objAnimMapYBW.setInterpolator(new AccelerateDecelerateInterpolator());

        AnimatorSet asMapBW = new AnimatorSet();
        asMapBW.play(objAnimMapYBW).with(objAnimMapXBW);
        asMapBW.setStartDelay(500);
        asMapBW.start();
    }

    private void closeAnim() {
        ObjectAnimator objAnimRotation = ObjectAnimator.ofFloat(fabPlus, "rotation", 0, 540f);
        objAnimRotation.setDuration(600);
        objAnimRotation.setInterpolator(new AccelerateInterpolator());
        objAnimRotation.start();

        ObjectAnimator objAnimCallFW = ObjectAnimator.ofFloat(fabCall, "y", fabCall.getY(), fabCall.getY() - 30f);
        objAnimCallFW.setDuration(100);
        objAnimCallFW.setInterpolator(new AccelerateDecelerateInterpolator());

        ObjectAnimator objAnimCallBW = ObjectAnimator.ofFloat(fabCall, "y", fabCall.getY() - 30, fabCall.getY() + 280f);
        objAnimCallBW.setDuration(500);
        objAnimCallBW.setInterpolator(new AccelerateDecelerateInterpolator());

        AnimatorSet asCall = new AnimatorSet();
        asCall.play(objAnimCallBW).after(objAnimCallFW);
        asCall.start();

        ObjectAnimator objAnimFacebookFW = ObjectAnimator.ofFloat(fabFacebook, "x", fabFacebook.getX(), fabFacebook.getX() - 30f);
        objAnimFacebookFW.setDuration(100);
        objAnimFacebookFW.setInterpolator(new AccelerateDecelerateInterpolator());

        ObjectAnimator objAnimFacebookBW = ObjectAnimator.ofFloat(fabFacebook, "x", fabFacebook.getX() - 30, fabFacebook.getX() + 280f);
        objAnimFacebookBW.setDuration(500);
        objAnimFacebookBW.setInterpolator(new AccelerateDecelerateInterpolator());

        AnimatorSet asFacebook = new AnimatorSet();
        asFacebook.play(objAnimFacebookBW).after(objAnimFacebookFW);
        asFacebook.start();

        ObjectAnimator objAnimMapXFW = ObjectAnimator.ofFloat(fabMap, "x", fabMap.getX(), fabMap.getX() - 20);
        objAnimMapXFW.setDuration(100);
        objAnimMapXFW.setInterpolator(new AccelerateDecelerateInterpolator());

        ObjectAnimator objAnimMapYFW = ObjectAnimator.ofFloat(fabMap, "y", fabMap.getY(), fabMap.getY() - 20);
        objAnimMapYFW.setDuration(100);
        objAnimMapYFW.setInterpolator(new AccelerateDecelerateInterpolator());

        AnimatorSet asMapFW = new AnimatorSet();
        asMapFW.play(objAnimMapYFW).with(objAnimMapXFW);
        asMapFW.start();

        ObjectAnimator objAnimMapXBW = ObjectAnimator.ofFloat(fabMap, "x", fabMap.getX() - 20f, fabMap.getX() + 160f);
        objAnimMapXBW.setDuration(500);
        objAnimMapXBW.setInterpolator(new AccelerateDecelerateInterpolator());

        ObjectAnimator objAnimMapYBW = ObjectAnimator.ofFloat(fabMap, "y", fabMap.getY() - 20f, fabMap.getY() + 160f);
        objAnimMapYBW.setDuration(500);
        objAnimMapYBW.setInterpolator(new AccelerateDecelerateInterpolator());

        AnimatorSet asMapBW = new AnimatorSet();
        asMapBW.play(objAnimMapYBW).with(objAnimMapXBW);
        asMapBW.setStartDelay(100);
        asMapBW.start();
    }

    @Override
    protected void onFinishInflate() {
        super.onFinishInflate();

        fabPlus = (FloatingActionButton) findViewById(R.id.fab_plus);
        fabPlus.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!isOpen) {
                    openAnim();
                    isOpen = true;
                } else {
                    closeAnim();
                    isOpen = false;
                }
            }
        });

        fabCall = (FloatingActionButton) findViewById(R.id.fab_call);
        fabCall.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.onTapCall();
            }
        });

        fabMap = (FloatingActionButton) findViewById(R.id.fab_map);
        fabMap.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.onTapMap();
            }
        });

        fabFacebook = (FloatingActionButton) findViewById(R.id.fab_facebook);
        fabFacebook.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                controller.onTapFacebook();
            }
        });
    }

    @Override
    public void setController(BaseController controller) {
        this.controller = (ControllerFabs) controller;
    }

    public interface ControllerFabs extends BaseController {
        void onTapCall();

        void onTapMap();

        void onTapFacebook();
    }
}

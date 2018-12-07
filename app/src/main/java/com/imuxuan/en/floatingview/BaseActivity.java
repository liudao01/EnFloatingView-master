package com.imuxuan.en.floatingview;

import android.support.v7.app.AppCompatActivity;

import com.imuxuan.floatingview.FloatingMagnetView;
import com.imuxuan.floatingview.FloatingView;
import com.imuxuan.floatingview.MagnetViewListener;

/**
 * @ClassName BaseActivity
 * @Description
 * @Author Yunpeng Li
 * @Creation 2018/3/15 下午5:01
 * @Mender Yunpeng Li
 * @Modification 2018/3/15 下午5:01
 */
public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onStart() {
        super.onStart();
        FloatingView.get().attach(this);


    }

    @Override
    protected void onStop() {
        super.onStop();
        FloatingView.get().detach(this);
    }
}

package com.imuxuan.en.floatingview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.imuxuan.floatingview.FloatingMagnetView;
import com.imuxuan.floatingview.FloatingView;
import com.imuxuan.floatingview.MagnetViewListener;

/**
 * @ClassName TestActivity
 * @Description
 * @Author Yunpeng Li
 * @Creation 2018/3/15 下午5:01
 * @Mender Yunpeng Li
 * @Modification 2018/3/15 下午5:01
 */
public class TestActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        FloatingView.get().add();
//        FloatingView.getInstance().remove();
        FloatingView.get().getView().setMagnetViewListener(new MagnetViewListener() {
            @Override
            public void onRemove(FloatingMagnetView magnetView) {

            }

            @Override
            public void onClick(FloatingMagnetView magnetView) {
                LogUtil.d("点击了");
                Toast.makeText(getApplicationContext(),"点击了",Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void createActivity(View view) {
        Intent intent = new Intent();
        intent.setClass(this, TestActivity.class);
        startActivity(intent);
    }

    public void remove(View view) {
        FloatingView.get().remove();
    }

    public void add(View view) {
        FloatingView.get().add();
        FloatingView.get().getView().setMagnetViewListener(new MagnetViewListener() {
            @Override
            public void onRemove(FloatingMagnetView magnetView) {

            }

            @Override
            public void onClick(FloatingMagnetView magnetView) {
                Toast.makeText(getApplicationContext(),"点击了",Toast.LENGTH_SHORT).show();
            }
        });

    }
}

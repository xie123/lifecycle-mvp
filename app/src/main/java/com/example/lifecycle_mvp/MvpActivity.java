package com.example.lifecycle_mvp;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.monster.mvp.viewer.Viewer;


public class MvpActivity extends FragmentActivity implements MvpActivityContract.IView {

    private MvpActivityContract.IPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvp);

        mPresenter = new MvpActivityPresenter();
        mPresenter.bind((Viewer) this);
        mPresenter.bind((LifecycleOwner) this);
    }

    @Override
    public Context context() {
        return this;
    }
}

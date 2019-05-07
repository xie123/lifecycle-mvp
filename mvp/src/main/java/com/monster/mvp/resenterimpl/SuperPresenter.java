package com.monster.mvp.resenterimpl;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;

import com.monster.mvp.presenter.Presenter;
import com.monster.mvp.viewer.Viewer;

import java.lang.ref.WeakReference;

public class SuperPresenter implements Presenter, LifecycleObserver {

    protected LifecycleOwner lifecycleOwner;
    protected WeakReference<Viewer> viewer;

    @Override
    public void bind(LifecycleOwner bindViewer) {
        this.lifecycleOwner = bindViewer;
        bindViewer.getLifecycle().addObserver(this);
    }

    @Override
    public void bind(Viewer viewer) {
        this.viewer = new WeakReference<>(viewer);
    }

    public Viewer viewer() {
        return viewer.get();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCrete() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStop() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy() {
    }
}

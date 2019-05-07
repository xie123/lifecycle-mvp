package com.monster.mvp.presenter;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;

import com.monster.mvp.viewer.Viewer;

public interface Presenter {
    /**
     * 生命周期的绑定
     * @param bindViewer
     */
    void bind(LifecycleOwner bindViewer);

    void bind(Viewer viewer);

}

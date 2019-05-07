package com.example.lifecycle_mvp;


import com.monster.mvp.presenter.Presenter;
import com.monster.mvp.viewer.Viewer;

public interface MvpActivityContract {
    interface IView extends Viewer {

    }

    interface IPresenter extends Presenter {
    }
}
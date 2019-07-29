package com.borisovskiy.simplemvpdagger2.di.modules;

import com.borisovskiy.simplemvpdagger2.mvp.Contract.IPresenter;
import com.borisovskiy.simplemvpdagger2.mvp.Model;
import com.borisovskiy.simplemvpdagger2.mvp.Presenter;
import com.borisovskiy.simplemvpdagger2.ui.MyFragment;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {

    @Provides
    public static IPresenter getPresenter(MyFragment fragment, Model model) {
        return new Presenter(fragment, model);
    }
}
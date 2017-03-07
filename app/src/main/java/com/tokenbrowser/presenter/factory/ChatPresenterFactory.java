package com.tokenbrowser.presenter.factory;

import com.tokenbrowser.presenter.ChatPresenter;

public final class ChatPresenterFactory implements PresenterFactory<ChatPresenter> {

    public ChatPresenterFactory() {}

    @Override
    public ChatPresenter create() {
        return new ChatPresenter();
    }
}
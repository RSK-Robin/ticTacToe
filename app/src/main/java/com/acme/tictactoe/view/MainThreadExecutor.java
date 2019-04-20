package com.acme.tictactoe.view;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;

import java.util.concurrent.Executor;

import javax.inject.Inject;

public class MainThreadExecutor implements Executor {

    private final Handler handler = new Handler(Looper.getMainLooper());

    @Inject
    public MainThreadExecutor() {
    }

    @Override
    public void execute(@NonNull Runnable command) {
        handler.post(command);
    }
}

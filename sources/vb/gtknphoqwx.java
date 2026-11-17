package vb;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public enum gtknphoqwx implements Executor {
    INSTANCE;


    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final Handler f116456yggfygwlhe = new Handler(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        f116456yggfygwlhe.post(runnable);
    }
}

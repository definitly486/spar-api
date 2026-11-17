package io.appmetrica.analytics.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.pk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ExecutorC3769pk implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Handler f47888a;

    public ExecutorC3769pk(Handler handler) {
        this.f47888a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f47888a.post(runnable);
    }
}

package io.appmetrica.analytics.impl;

import android.os.Handler;
import android.os.Looper;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class U9 implements IHandlerExecutor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Looper f46605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f46606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerThreadC3959xb f46607c;

    public U9(String str) {
        this(a(str));
    }

    public static HandlerThreadC3959xb a(String str) {
        HandlerThreadC3959xb handlerThreadC3959xb = new HandlerThreadC3959xb(str + "-" + Od.f46334a.incrementAndGet());
        handlerThreadC3959xb.start();
        return handlerThreadC3959xb;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor, java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f46606b.post(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j13) {
        this.f46606b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j13));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Handler getHandler() {
        return this.f46606b;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor
    public final Looper getLooper() {
        return this.f46605a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final boolean isRunning() {
        boolean z13;
        HandlerThreadC3959xb handlerThreadC3959xb = this.f46607c;
        synchronized (handlerThreadC3959xb) {
            z13 = handlerThreadC3959xb.f48418a;
        }
        return z13;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void remove(Runnable runnable) {
        this.f46606b.removeCallbacks(runnable);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void removeAll() {
        this.f46606b.removeCallbacksAndMessages(null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.IInterruptionSafeThread
    public final void stopRunning() {
        HandlerThreadC3959xb handlerThreadC3959xb = this.f46607c;
        synchronized (handlerThreadC3959xb) {
            handlerThreadC3959xb.f48418a = false;
            handlerThreadC3959xb.interrupt();
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f46606b.post(futureTask);
        return futureTask;
    }

    public U9(HandlerThreadC3959xb handlerThreadC3959xb) {
        this(handlerThreadC3959xb, handlerThreadC3959xb.getLooper(), new Handler(handlerThreadC3959xb.getLooper()));
    }

    public U9(HandlerThreadC3959xb handlerThreadC3959xb, Looper looper, Handler handler) {
        this.f46607c = handlerThreadC3959xb;
        this.f46605a = looper;
        this.f46606b = handler;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor
    public final void executeDelayed(Runnable runnable, long j13, TimeUnit timeUnit) {
        this.f46606b.postDelayed(runnable, timeUnit.toMillis(j13));
    }
}

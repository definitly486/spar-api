package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class T9 implements ExecutorProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3818rk f46552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f46553b;

    public T9() {
        C3818rk c3818rkW = Ia.j().w();
        this.f46552a = c3818rkW;
        this.f46553b = c3818rkW.c();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getDefaultExecutor() {
        return this.f46552a.a();
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final InterruptionSafeThread getInterruptionThread(String str, String str2, Runnable runnable) {
        return new InterruptionSafeThread(runnable, (str + '-' + str2) + "-" + Od.f46334a.incrementAndGet());
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getModuleExecutor() {
        return this.f46553b;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final IHandlerExecutor getSupportIOExecutor() {
        C3818rk c3818rk = this.f46552a;
        if (c3818rk.f48014f == null) {
            synchronized (c3818rk) {
                try {
                    if (c3818rk.f48014f == null) {
                        c3818rk.f48009a.getClass();
                        HandlerThreadC3959xb handlerThreadC3959xbA = U9.a("IAA-SIO");
                        c3818rk.f48014f = new U9(handlerThreadC3959xbA, handlerThreadC3959xbA.getLooper(), new Handler(handlerThreadC3959xbA.getLooper()));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return c3818rk.f48014f;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.common.ExecutorProvider
    public final Executor getUiExecutor() {
        return this.f46552a.f();
    }
}

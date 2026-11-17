package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3774q0 implements Wa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f47905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IHandlerExecutor f47906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4002z4 f47907c;

    public C3774q0() {
        IHandlerExecutor iHandlerExecutorA = C3952x4.l().g().a();
        this.f47906b = iHandlerExecutorA;
        this.f47905a = iHandlerExecutorA.getHandler();
        this.f47907c = new C4002z4();
    }

    @Override // io.appmetrica.analytics.impl.Wa
    public final void a(AppMetricaConfig appMetricaConfig, InterfaceC3735ob interfaceC3735ob) {
    }

    @Override // io.appmetrica.analytics.impl.Wa
    public final Handler b() {
        return this.f47905a;
    }

    @Override // io.appmetrica.analytics.impl.Wa
    public final Y1 c() {
        return new Y1();
    }

    @Override // io.appmetrica.analytics.impl.Wa
    public final Fb d() {
        return new Fb();
    }

    @Override // io.appmetrica.analytics.impl.Wa
    public final ICommonExecutor getDefaultExecutor() {
        return this.f47906b;
    }

    @Override // io.appmetrica.analytics.impl.Wa
    public final C4002z4 a() {
        return this.f47907c;
    }
}

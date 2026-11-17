package io.appmetrica.analytics.impl;

import android.os.Handler;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;

/* JADX INFO: loaded from: classes3.dex */
public interface Wa {
    C4002z4 a();

    void a(AppMetricaConfig appMetricaConfig, InterfaceC3735ob interfaceC3735ob);

    Handler b();

    Y1 c();

    Fb d();

    ICommonExecutor getDefaultExecutor();
}

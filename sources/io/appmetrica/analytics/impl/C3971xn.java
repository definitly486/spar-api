package io.appmetrica.analytics.impl;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.xn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3971xn implements InterfaceC4021zn {
    @Override // io.appmetrica.analytics.impl.InterfaceC4021zn
    public final Thread a() {
        return Looper.getMainLooper().getThread();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4021zn
    public final StackTraceElement[] b() {
        return null;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC4021zn
    public final Map c() {
        return Thread.getAllStackTraces();
    }
}

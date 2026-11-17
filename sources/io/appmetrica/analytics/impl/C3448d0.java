package io.appmetrica.analytics.impl;

import android.os.Looper;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3448d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f47057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread f47058b = Looper.getMainLooper().getThread();

    public C3448d0(InterfaceC3473e0 interfaceC3473e0, Map map) {
        this.f47057a = map;
    }
}

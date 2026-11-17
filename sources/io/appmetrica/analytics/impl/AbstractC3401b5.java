package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.b5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3401b5 extends J5 {
    public AbstractC3401b5(BaseRequestConfig.ComponentLoader<Object, Object, C3556h6> componentLoader, C3521fm c3521fm, BaseRequestConfig.BaseRequestArguments<J4, Object> baseRequestArguments) {
        super(componentLoader, c3521fm, baseRequestArguments);
    }

    @Override // io.appmetrica.analytics.impl.J5
    public final void a(Object obj) {
        J4 j13 = (J4) obj;
        synchronized (this) {
            super.a((Object) j13);
        }
    }

    public final synchronized void a(J4 j13) {
        super.a((Object) j13);
    }
}

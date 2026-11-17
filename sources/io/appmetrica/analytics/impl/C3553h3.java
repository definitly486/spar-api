package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3553h3 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProductInfo f47366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3578i3 f47367b;

    public C3553h3(C3578i3 c3578i3, ProductInfo productInfo) {
        this.f47367b = c3578i3;
        this.f47366a = productInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        ((C3828s5) this.f47367b.f47416a).a(C3655l6.a(new Tf(this.f47366a)));
    }
}

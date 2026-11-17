package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.ICommonExecutor;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.j2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3601j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bc f47504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ICommonExecutor f47505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f47506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f47507d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Runnable f47508e = new Runnable() { // from class: io.appmetrica.analytics.impl.lmojexxdyd
        @Override // java.lang.Runnable
        public final void run() {
            C3601j2.a(this.f47669zdlpuopuiu);
        }
    };

    public C3601j2(Bc bc3, IHandlerExecutor iHandlerExecutor, long j13) {
        this.f47504a = bc3;
        this.f47505b = iHandlerExecutor;
        this.f47506c = j13;
    }

    public static final void a(C3601j2 c3601j2) {
        Cc cc3 = c3601j2.f47504a.f45519a;
        Ji ji2 = cc3.f46649h;
        ji2.f46106c.a(cc3.f46643b.f47065a);
    }
}

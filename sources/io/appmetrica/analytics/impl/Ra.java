package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider;

/* JADX INFO: loaded from: classes3.dex */
public final class Ra implements HostRetryInfoProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3714nf f46451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC3589ie f46452b;

    public Ra(C3714nf c3714nf, EnumC3589ie enumC3589ie) {
        this.f46451a = c3714nf;
        this.f46452b = enumC3589ie;
    }

    public final EnumC3589ie a() {
        return this.f46452b;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final long getLastAttemptTimeSeconds() {
        return this.f46451a.a(this.f46452b, 0L);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final int getNextSendAttemptNumber() {
        return this.f46451a.a(this.f46452b, 1);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveLastAttemptTimeSeconds(long j13) {
        this.f46451a.b(this.f46452b, j13).b();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.HostRetryInfoProvider
    public final void saveNextSendAttemptNumber(int i13) {
        this.f46451a.b(this.f46452b, i13).b();
    }
}

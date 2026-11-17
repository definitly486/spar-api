package io.appmetrica.analytics.screenshot.impl;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f48984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f48985c;

    public f0(boolean z13, List list, long j13) {
        this.f48983a = z13;
        this.f48984b = list;
        this.f48985c = j13;
    }

    public final long a() {
        return this.f48985c;
    }

    public final boolean b() {
        return this.f48983a;
    }

    public final List c() {
        return this.f48984b;
    }

    public final String toString() {
        return "ServiceSideContentObserverCaptorConfig(enabled=" + this.f48983a + ", mediaStoreColumnNames=" + this.f48984b + ", detectWindowSeconds=" + this.f48985c + ')';
    }

    public f0(C4036o c4036o) {
        this(c4036o.b(), c4036o.c(), c4036o.a());
    }
}

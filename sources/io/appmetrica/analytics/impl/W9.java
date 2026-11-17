package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class W9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f46708a;

    public W9(long j13) {
        this.f46708a = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof W9) && this.f46708a == ((W9) obj).f46708a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f46708a);
    }

    public final String toString() {
        return "ExternalAttributionConfig(collectingInterval=" + this.f46708a + ')';
    }
}

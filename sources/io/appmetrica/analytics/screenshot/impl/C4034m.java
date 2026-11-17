package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4034m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f49002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f49003b;

    public C4034m(boolean z13, long j13) {
        this.f49002a = z13;
        this.f49003b = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zdlpuopuiu.eablkybsjg(C4034m.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideServiceCaptorConfig");
        }
        C4034m c4034m = (C4034m) obj;
        return this.f49002a == c4034m.f49002a && this.f49003b == c4034m.f49003b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f49003b) + (Boolean.hashCode(this.f49002a) * 31);
    }

    public final String toString() {
        return "ClientSideServiceCaptorConfig(enabled=" + this.f49002a + ", delaySeconds=" + this.f49003b + ')';
    }

    public C4034m(F f13) {
        this(f13.b(), f13.a());
    }
}

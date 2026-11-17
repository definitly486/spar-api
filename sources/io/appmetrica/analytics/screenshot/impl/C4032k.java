package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4032k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4033l f48998b;

    public C4032k(boolean z13, C4033l c4033l) {
        this.f48997a = z13;
        this.f48998b = c4033l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zdlpuopuiu.eablkybsjg(C4032k.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideRemoteScreenshotConfig");
        }
        C4032k c4032k = (C4032k) obj;
        return this.f48997a == c4032k.f48997a && zdlpuopuiu.eablkybsjg(this.f48998b, c4032k.f48998b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f48997a) * 31;
        C4033l c4033l = this.f48998b;
        return iHashCode + (c4033l != null ? c4033l.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideRemoteScreenshotConfig(enabled=" + this.f48997a + ", config=" + this.f48998b + ')';
    }
}

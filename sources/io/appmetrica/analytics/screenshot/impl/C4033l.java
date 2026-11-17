package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4033l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4030i f48999a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C4034m f49000b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4031j f49001c;

    public C4033l(C4030i c4030i, C4034m c4034m, C4031j c4031j) {
        this.f48999a = c4030i;
        this.f49000b = c4034m;
        this.f49001c = c4031j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zdlpuopuiu.eablkybsjg(C4033l.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideScreenshotConfig");
        }
        C4033l c4033l = (C4033l) obj;
        return zdlpuopuiu.eablkybsjg(this.f48999a, c4033l.f48999a) && zdlpuopuiu.eablkybsjg(this.f49000b, c4033l.f49000b) && zdlpuopuiu.eablkybsjg(this.f49001c, c4033l.f49001c);
    }

    public final int hashCode() {
        C4030i c4030i = this.f48999a;
        int iHashCode = (c4030i != null ? c4030i.hashCode() : 0) * 31;
        C4034m c4034m = this.f49000b;
        int iHashCode2 = (iHashCode + (c4034m != null ? c4034m.hashCode() : 0)) * 31;
        C4031j c4031j = this.f49001c;
        return iHashCode2 + (c4031j != null ? c4031j.hashCode() : 0);
    }

    public final String toString() {
        return "ClientSideScreenshotConfig(apiCaptorConfig=" + this.f48999a + ", serviceCaptorConfig=" + this.f49000b + ", contentObserverCaptorConfig=" + this.f49001c + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C4033l(D d13) {
        C4044x c4044xA = d13.a();
        C4030i c4030i = c4044xA != null ? new C4030i(c4044xA) : null;
        F fC = d13.c();
        C4034m c4034m = fC != null ? new C4034m(fC) : null;
        C4046z c4046zB = d13.b();
        this(c4030i, c4034m, c4046zB != null ? new C4031j(c4046zB) : null);
    }
}

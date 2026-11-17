package io.appmetrica.analytics.screenshot.impl;

import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4030i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48991a;

    public C4030i(boolean z13) {
        this.f48991a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zdlpuopuiu.eablkybsjg(C4030i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj != null) {
            return this.f48991a == ((C4030i) obj).f48991a;
        }
        throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideApiCaptorConfig");
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f48991a);
    }

    public final String toString() {
        return "ClientSideApiCaptorConfig(enabled=" + this.f48991a + ')';
    }

    public C4030i(C4044x c4044x) {
        this(c4044x.a());
    }
}

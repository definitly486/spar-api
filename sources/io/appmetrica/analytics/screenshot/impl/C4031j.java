package io.appmetrica.analytics.screenshot.impl;

import java.util.List;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4031j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f48994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f48995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f48996c;

    public C4031j(boolean z13, List list, long j13) {
        this.f48994a = z13;
        this.f48995b = list;
        this.f48996c = j13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!zdlpuopuiu.eablkybsjg(C4031j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type io.appmetrica.analytics.screenshot.impl.config.client.model.ClientSideContentObserverCaptorConfig");
        }
        C4031j c4031j = (C4031j) obj;
        return this.f48994a == c4031j.f48994a && zdlpuopuiu.eablkybsjg(this.f48995b, c4031j.f48995b) && this.f48996c == c4031j.f48996c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f48996c) + ((this.f48995b.hashCode() + (Boolean.hashCode(this.f48994a) * 31)) * 31);
    }

    public final String toString() {
        return "ClientSideContentObserverCaptorConfig(enabled=" + this.f48994a + ", mediaStoreColumnNames=" + this.f48995b + ", detectWindowSeconds=" + this.f48996c + ')';
    }

    public C4031j(C4046z c4046z) {
        this(c4046z.b(), c4046z.c(), c4046z.a());
    }
}

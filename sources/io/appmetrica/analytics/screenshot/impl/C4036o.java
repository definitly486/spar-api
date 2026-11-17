package io.appmetrica.analytics.screenshot.impl;

import hg.agtfadlqog;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4036o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f49006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f49007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f49008c;

    public C4036o(boolean z13, List list, long j13) {
        this.f49006a = z13;
        this.f49007b = list;
        this.f49008c = j13;
    }

    public final long a() {
        return this.f49008c;
    }

    public final boolean b() {
        return this.f49006a;
    }

    public final List c() {
        return this.f49007b;
    }

    public final String toString() {
        return "ContentObserverCaptorConfig(enabled=" + this.f49006a + ", mediaStoreColumnNames='" + this.f49007b + "', detectWindowSeconds=" + this.f49008c + ')';
    }

    public C4036o() {
        this(new L().f48936a, agtfadlqog.i(new L().f48938c), new L().f48937b);
    }
}

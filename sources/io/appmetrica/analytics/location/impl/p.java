package io.appmetrica.analytics.location.impl;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f48687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f48688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f48689c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f48690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f48691e = new HashMap();

    public p(List list, i iVar) {
        this.f48690d = list;
        this.f48687a = iVar;
        m mVar = new m();
        this.f48688b = mVar;
        this.f48689c = new h(mVar);
    }

    public final m a() {
        return this.f48688b;
    }
}

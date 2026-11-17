package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3551h1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f47364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f47365b;

    public RunnableC3551h1(C3750p1 c3750p1, List list) {
        this.f47365b = c3750p1;
        this.f47364a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3750p1.a(this.f47365b).reportAnr(CollectionUtils.getMapFromList(this.f47364a));
    }
}

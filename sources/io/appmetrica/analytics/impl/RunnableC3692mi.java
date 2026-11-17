package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3692mi implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f47712a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3866ti f47713b;

    public RunnableC3692mi(C3866ti c3866ti, List list) {
        this.f47713b = c3866ti;
        this.f47712a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f47713b;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).reportAnr(CollectionUtils.getMapFromList(this.f47712a));
    }
}

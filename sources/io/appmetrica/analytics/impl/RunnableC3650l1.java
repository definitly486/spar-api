package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.l1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3650l1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f47621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f47622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3750p1 f47623c;

    public RunnableC3650l1(C3750p1 c3750p1, String str, List list) {
        this.f47623c = c3750p1;
        this.f47621a = str;
        this.f47622b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3750p1.a(this.f47623c).reportEvent(this.f47621a, CollectionUtils.getMapFromList(this.f47622b));
    }
}

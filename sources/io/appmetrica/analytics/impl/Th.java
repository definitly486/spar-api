package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Th implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f46575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ List f46576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3866ti f46577c;

    public Th(C3866ti c3866ti, String str, List list) {
        this.f46577c = c3866ti;
        this.f46575a = str;
        this.f46576b = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3866ti c3866ti = this.f46577c;
        C3866ti.a(c3866ti.f48131a, c3866ti.f48134d, c3866ti.f48135e).reportEvent(this.f46575a, CollectionUtils.getMapFromList(this.f46576b));
    }
}

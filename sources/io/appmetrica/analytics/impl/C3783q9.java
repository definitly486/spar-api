package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3783q9 extends AbstractC3807r9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f47914a;

    public C3783q9(List<Object> list) {
        this.f47914a = CollectionUtils.unmodifiableListCopy(list);
    }

    public final List<Object> a() {
        return this.f47914a;
    }
}

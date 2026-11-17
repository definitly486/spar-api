package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3871tn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f48146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f48147c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f48148d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Integer f48149e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f48150f;

    public C3871tn(String str, int i13, long j13, String str2, Integer num, List list) {
        this.f48145a = str;
        this.f48146b = i13;
        this.f48147c = j13;
        this.f48148d = str2;
        this.f48149e = num;
        this.f48150f = list == null ? Collections.emptyList() : CollectionUtils.unmodifiableListCopy(list);
    }
}

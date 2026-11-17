package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3871tn f46589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f46590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46591c;

    public U(C3871tn c3871tn, ArrayList arrayList, String str) {
        this.f46589a = c3871tn;
        this.f46590b = arrayList == null ? Collections.emptyList() : CollectionUtils.unmodifiableListCopy(arrayList);
        this.f46591c = str;
    }
}

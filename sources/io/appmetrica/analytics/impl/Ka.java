package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class Ka {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f46140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f46141b;

    public Ka() {
        this(false);
    }

    public final void a(Object obj, Object obj2) {
        Collection collection = (Collection) this.f46140a.get(obj);
        ArrayList arrayList = collection == null ? new ArrayList() : new ArrayList(collection);
        arrayList.add(obj2);
    }

    public final String toString() {
        return this.f46140a.toString();
    }

    public Ka(boolean z13) {
        this.f46140a = new HashMap();
        this.f46141b = z13;
    }
}

package io.appmetrica.analytics.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class Yc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f46802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f46803b;

    public Yc(Object obj) {
        this(new HashMap(), obj);
    }

    public final void a(Object obj, Object obj2) {
        this.f46802a.put(obj, obj2);
    }

    public Yc(HashMap map, Object obj) {
        this.f46802a = map;
        this.f46803b = obj;
    }

    public final Object a(Object obj) {
        Object obj2 = this.f46802a.get(obj);
        return obj2 == null ? this.f46803b : obj2;
    }
}

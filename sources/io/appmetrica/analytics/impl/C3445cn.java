package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3445cn implements In {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final In f47040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f47041b;

    public C3445cn(In in2, Object obj) {
        this.f47040a = in2;
        this.f47041b = obj;
    }

    @Override // io.appmetrica.analytics.impl.In
    public final Object a(Object obj) {
        return obj != this.f47040a.a(obj) ? this.f47041b : obj;
    }
}

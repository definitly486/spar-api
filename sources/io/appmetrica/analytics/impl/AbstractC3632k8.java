package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3632k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yc f47581a;

    public AbstractC3632k8() {
        Yc yc2 = new Yc(0);
        yc2.a(EnumC3657l8.f47647b, 0);
        yc2.a(EnumC3657l8.f47648c, 1);
        yc2.a(EnumC3657l8.f47649d, 2);
        yc2.a(EnumC3657l8.f47650e, 3);
        this.f47581a = yc2;
    }

    public final Yc a() {
        return this.f47581a;
    }

    public abstract boolean a(Object obj, Object obj2);
}

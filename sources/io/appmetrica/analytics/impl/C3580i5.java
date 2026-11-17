package io.appmetrica.analytics.impl;

import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.i5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3580i5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T5 f47424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Zc f47425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Zc f47426c;

    public C3580i5(C3532g7 c3532g7, C3465dh c3465dh) {
        He he2 = new He(c3532g7);
        this.f47424a = new T5(c3532g7);
        this.f47425b = new Zc(he2, new C3555h5(c3465dh));
        this.f47426c = new Zc(he2, C3530g5.f47286a);
    }

    public final List<Y8> a() {
        return hg.jyumaefscl.rgvfuqvkyq(this.f47424a, this.f47425b);
    }

    public final List<Y8> b() {
        return hg.jyumaefscl.eablkybsjg(this.f47426c);
    }
}

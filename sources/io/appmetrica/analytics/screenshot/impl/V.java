package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes3.dex */
public final class V implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4028g f48956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z f48957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4038q f48958c;

    public V() {
        this(null, null, null, 7, null);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final N fromModel(T t13) {
        N n13 = new N();
        C4026e c4026e = t13.f48950a;
        n13.f48943a = c4026e != null ? this.f48956a.fromModel(c4026e) : null;
        X x13 = t13.f48951b;
        n13.f48944b = x13 != null ? this.f48957b.fromModel(x13) : null;
        C4036o c4036o = t13.f48952c;
        n13.f48945c = c4036o != null ? this.f48958c.fromModel(c4036o) : null;
        return n13;
    }

    public V(C4028g c4028g, Z z13, C4038q c4038q) {
        this.f48956a = c4028g;
        this.f48957b = z13;
        this.f48958c = c4038q;
    }

    public /* synthetic */ V(C4028g c4028g, Z z13, C4038q c4038q, int i13, gtknphoqwx gtknphoqwxVar) {
        this((i13 & 1) != 0 ? new C4028g() : c4028g, (i13 & 2) != 0 ? new Z() : z13, (i13 & 4) != 0 ? new C4038q() : c4038q);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T toModel(N n13) {
        C4026e c4026e;
        X x13;
        K k13 = n13.f48943a;
        if (k13 != null) {
            this.f48956a.getClass();
            c4026e = new C4026e(k13.f48934a);
        } else {
            c4026e = null;
        }
        M m13 = n13.f48944b;
        if (m13 != null) {
            this.f48957b.getClass();
            x13 = new X(m13.f48940a, m13.f48941b);
        } else {
            x13 = null;
        }
        L l13 = n13.f48945c;
        return new T(c4026e, x13, l13 != null ? this.f48958c.toModel(l13) : null);
    }
}

package io.appmetrica.analytics.screenshot.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.gtknphoqwx;

/* JADX INFO: loaded from: classes3.dex */
public final class J implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V f48932a;

    /* JADX WARN: Multi-variable type inference failed */
    public J() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final O fromModel(G g13) {
        O o13 = new O();
        o13.f48947a = g13.f48927a;
        T t13 = g13.f48928b;
        o13.f48948b = t13 != null ? this.f48932a.fromModel(t13) : null;
        return o13;
    }

    public J(V v13) {
        this.f48932a = v13;
    }

    public /* synthetic */ J(V v13, int i13, gtknphoqwx gtknphoqwxVar) {
        if ((i13 & 1) != 0) {
            v13 = new V(null, null, null, 7, null);
        }
        this(v13);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final G toModel(O o13) {
        return new G(o13.f48947a, this.f48932a.toModel(o13.f48948b));
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3668lj implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ge f47663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final H3 f47664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Na f47665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Na f47666d;

    public C3668lj() {
        this(new Ge(), new H3(), new Na(100), new Na(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(C3768pj c3768pj) {
        Qi qiFromModel;
        K8 k13 = new K8();
        Jn jnA = this.f47665c.a(c3768pj.f47884a);
        k13.f46136a = StringUtils.getUTF8Bytes((String) jnA.f46116a);
        List<String> list = c3768pj.f47885b;
        Qi qiA = null;
        if (list != null) {
            qiFromModel = this.f47664b.fromModel(list);
            k13.f46137b = (C4006z8) qiFromModel.f46427a;
        } else {
            qiFromModel = null;
        }
        Jn jnA2 = this.f47666d.a(c3768pj.f47886c);
        k13.f46138c = StringUtils.getUTF8Bytes((String) jnA2.f46116a);
        Map<String, String> map = c3768pj.f47887d;
        if (map != null) {
            qiA = this.f47663a.fromModel(map);
            k13.f46139d = (F8) qiA.f46427a;
        }
        return new Qi(k13, new C3926w3(C3926w3.b(jnA, qiFromModel, jnA2, qiA)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C3668lj(Ge ge2, H3 h13, Na na3, Na na4) {
        this.f47663a = ge2;
        this.f47664b = h13;
        this.f47665c = na3;
        this.f47666d = na4;
    }

    public final C3768pj a(Qi qi2) {
        throw new UnsupportedOperationException();
    }
}

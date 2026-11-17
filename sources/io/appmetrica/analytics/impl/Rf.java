package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class Rf implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ge f46456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lf f46457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H3 f46458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Vf f46459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Na f46460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Na f46461f;

    public Rf() {
        this(new Ge(), new Lf(), new H3(), new Vf(), new Na(100), new Na(1000));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(Uf uf2) {
        Qi qiFromModel;
        Qi qiFromModel2;
        Qi qiA;
        Qi qiA2;
        H8 h13 = new H8();
        Jn jnA = this.f46460e.a(uf2.f46616a);
        h13.f45898a = StringUtils.getUTF8Bytes((String) jnA.f46116a);
        Jn jnA2 = this.f46461f.a(uf2.f46617b);
        h13.f45899b = StringUtils.getUTF8Bytes((String) jnA2.f46116a);
        List<String> list = uf2.f46618c;
        Qi qiFromModel3 = null;
        if (list != null) {
            qiFromModel = this.f46458c.fromModel(list);
            h13.f45900c = (C4006z8) qiFromModel.f46427a;
        } else {
            qiFromModel = null;
        }
        Map<String, String> map = uf2.f46619d;
        if (map != null) {
            qiFromModel2 = this.f46456a.fromModel(map);
            h13.f45901d = (F8) qiFromModel2.f46427a;
        } else {
            qiFromModel2 = null;
        }
        Nf nf2 = uf2.f46620e;
        if (nf2 != null) {
            qiA = this.f46457b.fromModel(nf2);
            h13.f45902e = (G8) qiA.f46427a;
        } else {
            qiA = null;
        }
        Nf nf3 = uf2.f46621f;
        if (nf3 != null) {
            qiA2 = this.f46457b.fromModel(nf3);
            h13.f45903f = (G8) qiA2.f46427a;
        } else {
            qiA2 = null;
        }
        List<String> list2 = uf2.f46622g;
        if (list2 != null) {
            qiFromModel3 = this.f46459d.fromModel(list2);
            h13.f45904g = (I8[]) qiFromModel3.f46427a;
        }
        return new Qi(h13, new C3926w3(C3926w3.b(jnA, jnA2, qiFromModel, qiFromModel2, qiA, qiA2, qiFromModel3)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Rf(Ge ge2, Lf lf2, H3 h13, Vf vf2, Na na3, Na na4) {
        this.f46456a = ge2;
        this.f46457b = lf2;
        this.f46458c = h13;
        this.f46459d = vf2;
        this.f46460e = na3;
        this.f46461f = na4;
    }

    public final Uf a(Qi qi2) {
        throw new UnsupportedOperationException();
    }
}

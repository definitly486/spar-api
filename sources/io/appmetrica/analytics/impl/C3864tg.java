package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3864tg implements Converter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3668lj f48127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Na f48128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Na f48129c;

    public C3864tg() {
        this(new C3668lj(), new Na(100), new Na(2048));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Qi fromModel(Kg kg2) {
        Qi qiFromModel;
        J8 j13 = new J8();
        Jn jnA = this.f48128b.a(kg2.f46154a);
        j13.f46087a = StringUtils.getUTF8Bytes((String) jnA.f46116a);
        Jn jnA2 = this.f48129c.a(kg2.f46155b);
        j13.f46088b = StringUtils.getUTF8Bytes((String) jnA2.f46116a);
        C3768pj c3768pj = kg2.f46156c;
        if (c3768pj != null) {
            qiFromModel = this.f48127a.fromModel(c3768pj);
            j13.f46089c = (K8) qiFromModel.f46427a;
        } else {
            qiFromModel = null;
        }
        return new Qi(j13, new C3926w3(C3926w3.b(jnA, jnA2, qiFromModel)));
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C3864tg(C3668lj c3668lj, Na na3, Na na4) {
        this.f48127a = c3668lj;
        this.f48128b = na3;
        this.f48129c = na4;
    }

    public final Kg a(Qi qi2) {
        throw new UnsupportedOperationException();
    }
}

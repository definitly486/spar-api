package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.tf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3863tf implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ff f48125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3739of f48126b;

    public C3863tf() {
        this(new Ff(), new C3739of());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bf fromModel(C3813rf c3813rf) {
        Bf bf2 = new Bf();
        bf2.f45530a = this.f48125a.fromModel(c3813rf.f47989a);
        bf2.f45531b = new Af[c3813rf.f47990b.size()];
        Iterator<C3789qf> it = c3813rf.f47990b.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            bf2.f45531b[i13] = this.f48126b.fromModel(it.next());
            i13++;
        }
        return bf2;
    }

    public C3863tf(Ff ff2, C3739of c3739of) {
        this.f48125a = ff2;
        this.f48126b = c3739of;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3813rf toModel(Bf bf2) {
        Ef model;
        ArrayList arrayList = new ArrayList(bf2.f45531b.length);
        for (Af af2 : bf2.f45531b) {
            arrayList.add(this.f48126b.toModel(af2));
        }
        C4013zf c4013zf = bf2.f45530a;
        if (c4013zf == null) {
            model = this.f48125a.toModel(new C4013zf());
        } else {
            model = this.f48125a.toModel(c4013zf);
        }
        return new C3813rf(model, arrayList);
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Cn implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bl f45608a;

    public Cn() {
        this(new Bl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3954x6 fromModel(Dn dn2) {
        C3954x6 c3954x6 = new C3954x6();
        c3954x6.f48405a = (String) WrapUtils.getOrDefault(dn2.f45667a, "");
        c3954x6.f48406b = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(dn2.f45668b, ""));
        List<Dl> list = dn2.f45669c;
        if (list != null) {
            c3954x6.f48407c = this.f45608a.fromModel(list);
        }
        Dn dn3 = dn2.f45670d;
        if (dn3 != null) {
            c3954x6.f48408d = fromModel(dn3);
        }
        List list2 = dn2.f45671e;
        int i13 = 0;
        if (list2 == null) {
            c3954x6.f48409e = new C3954x6[0];
        } else {
            c3954x6.f48409e = new C3954x6[list2.size()];
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                c3954x6.f48409e[i13] = fromModel((Dn) it.next());
                i13++;
            }
        }
        return c3954x6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Cn(Bl bl2) {
        this.f45608a = bl2;
    }

    public final Dn a(C3954x6 c3954x6) {
        throw new UnsupportedOperationException();
    }
}

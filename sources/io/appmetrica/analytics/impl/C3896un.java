package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.un, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3896un implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bl f48215a;

    public C3896un() {
        this(new Bl());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3929w6 fromModel(C3871tn c3871tn) {
        C3929w6 c3929w6 = new C3929w6();
        Integer num = c3871tn.f48149e;
        c3929w6.f48277e = num == null ? -1 : num.intValue();
        c3929w6.f48276d = c3871tn.f48148d;
        c3929w6.f48274b = c3871tn.f48146b;
        c3929w6.f48273a = c3871tn.f48145a;
        c3929w6.f48275c = c3871tn.f48147c;
        Bl bl2 = this.f48215a;
        List list = c3871tn.f48150f;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Dl((StackTraceElement) it.next()));
        }
        c3929w6.f48278f = bl2.fromModel(arrayList);
        return c3929w6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public C3896un(Bl bl2) {
        this.f48215a = bl2;
    }

    public final C3871tn a(C3929w6 c3929w6) {
        throw new UnsupportedOperationException();
    }
}

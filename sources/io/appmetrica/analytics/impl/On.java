package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class On implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cn f46360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f46361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D6 f46362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bl f46363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ve f46364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final We f46365f;

    public On() {
        this(new Cn(), new V(new C3896un()), new D6(), new Bl(), new Ve(), new We());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3804r6 fromModel(Nn nn2) {
        C3804r6 c3804r6 = new C3804r6();
        Dn dn2 = nn2.f46292a;
        if (dn2 != null) {
            c3804r6.f47967a = this.f46360a.fromModel(dn2);
        }
        U u13 = nn2.f46293b;
        if (u13 != null) {
            c3804r6.f47968b = this.f46361b.fromModel(u13);
        }
        List<Dl> list = nn2.f46294c;
        if (list != null) {
            c3804r6.f47971e = this.f46363d.fromModel(list);
        }
        String str = nn2.f46298g;
        if (str != null) {
            c3804r6.f47969c = str;
        }
        c3804r6.f47970d = this.f46362c.a(nn2.f46299h);
        if (!TextUtils.isEmpty(nn2.f46295d)) {
            c3804r6.f47974h = this.f46364e.fromModel(nn2.f46295d);
        }
        if (!TextUtils.isEmpty(nn2.f46296e)) {
            c3804r6.f47975i = nn2.f46296e.getBytes();
        }
        if (!io.a(nn2.f46297f)) {
            c3804r6.f47976j = this.f46365f.fromModel(nn2.f46297f);
        }
        return c3804r6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public On(Cn cn2, V v13, D6 d13, Bl bl2, Ve ve2, We we2) {
        this.f46361b = v13;
        this.f46360a = cn2;
        this.f46362c = d13;
        this.f46363d = bl2;
        this.f46364e = ve2;
        this.f46365f = we2;
    }

    public final Nn a(C3804r6 c3804r6) {
        throw new UnsupportedOperationException();
    }
}

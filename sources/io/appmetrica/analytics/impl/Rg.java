package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Rg implements ProtobufConverter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Cn f46462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V f46463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D6 f46464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Bl f46465d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Ve f46466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final We f46467f;

    public Rg() {
        this(new Cn(), new V(new C3896un()), new D6(), new Bl(), new Ve(), new We());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3854t6 fromModel(Qg qg2) {
        C3854t6 c3854t6 = new C3854t6();
        c3854t6.f48104f = StringUtils.correctIllFormedString((String) WrapUtils.getOrDefault(qg2.f46423a, c3854t6.f48104f));
        Nn nn2 = qg2.f46424b;
        if (nn2 != null) {
            Dn dn2 = nn2.f46292a;
            if (dn2 != null) {
                c3854t6.f48099a = this.f46462a.fromModel(dn2);
            }
            U u13 = nn2.f46293b;
            if (u13 != null) {
                c3854t6.f48100b = this.f46463b.fromModel(u13);
            }
            List<Dl> list = nn2.f46294c;
            if (list != null) {
                c3854t6.f48103e = this.f46465d.fromModel(list);
            }
            c3854t6.f48101c = (String) WrapUtils.getOrDefault(nn2.f46298g, c3854t6.f48101c);
            c3854t6.f48102d = this.f46464c.a(nn2.f46299h);
            if (!TextUtils.isEmpty(nn2.f46295d)) {
                c3854t6.f48107i = this.f46466e.fromModel(nn2.f46295d);
            }
            if (!TextUtils.isEmpty(nn2.f46296e)) {
                c3854t6.f48108j = nn2.f46296e.getBytes();
            }
            if (!io.a(nn2.f46297f)) {
                c3854t6.f48109k = this.f46467f.fromModel(nn2.f46297f);
            }
        }
        return c3854t6;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public Rg(Cn cn2, V v13, D6 d13, Bl bl2, Ve ve2, We we2) {
        this.f46462a = cn2;
        this.f46463b = v13;
        this.f46464c = d13;
        this.f46465d = bl2;
        this.f46466e = ve2;
        this.f46467f = we2;
    }

    public final Qg a(C3854t6 c3854t6) {
        throw new UnsupportedOperationException();
    }
}

package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashSet;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3701n2 extends AbstractC3490eh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uo f47732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3570hk f47733c;

    public C3701n2(C3828s5 c3828s5) {
        this(c3828s5, c3828s5.t(), C3570hk.c());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3490eh
    public final boolean a(C3655l6 c3655l6) {
        C3828s5 c3828s5 = this.f47182a;
        if (!this.f47732b.c() && !this.f47732b.d()) {
            if (((C3965xh) c3828s5.f48040k.a()).f48433e) {
                this.f47733c.b();
            }
            C3508f9 c3508f9 = this.f47182a.f48041l;
            if (c3508f9.f47215c == null) {
                c3508f9.a();
            }
            C3559h9 c3559h9 = c3508f9.f47215c;
            c3559h9.getClass();
            c3559h9.f47378b = new HashSet();
            c3559h9.f47380d = 0;
            C3559h9 c3559h10 = c3508f9.f47215c;
            c3559h10.f47377a = true;
            C3633k9 c3633k9 = c3508f9.f47214b;
            IBinaryDataHelper iBinaryDataHelper = c3633k9.f47584c;
            C3608j9 c3608j9 = c3633k9.f47583b;
            c3633k9.f47582a.getClass();
            P9 p9A = C3584i9.a(c3559h10);
            c3608j9.getClass();
            iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(p9A));
        }
        return false;
    }

    public C3701n2(C3828s5 c3828s5, uo uoVar, C3570hk c3570hk) {
        super(c3828s5);
        this.f47732b = uoVar;
        this.f47733c = c3570hk;
    }
}

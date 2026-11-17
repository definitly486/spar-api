package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3508f9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f47213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3633k9 f47214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C3559h9 f47215c;

    public C3508f9(C3633k9 c3633k9, int i13) {
        this.f47213a = i13;
        this.f47214b = c3633k9;
    }

    public final void a() {
        C3559h9 c3559h9;
        C3633k9 c3633k9 = this.f47214b;
        c3633k9.getClass();
        try {
            byte[] bArr = c3633k9.f47584c.get("event_hashes");
            if (bArr == null || bArr.length == 0) {
                C3584i9 c3584i9 = c3633k9.f47582a;
                c3633k9.f47583b.getClass();
                P9 p13 = new P9();
                c3584i9.getClass();
                c3559h9 = new C3559h9(p13.f46378a, p13.f46379b, p13.f46380c, CollectionUtils.hashSetFromIntArray(p13.f46381d));
            } else {
                C3584i9 c3584i10 = c3633k9.f47582a;
                P9 state = c3633k9.f47583b.toState(bArr);
                c3584i10.getClass();
                c3559h9 = new C3559h9(state.f46378a, state.f46379b, state.f46380c, CollectionUtils.hashSetFromIntArray(state.f46381d));
            }
        } catch (Throwable unused) {
            C3584i9 c3584i11 = c3633k9.f47582a;
            c3633k9.f47583b.getClass();
            P9 p14 = new P9();
            c3584i11.getClass();
            c3559h9 = new C3559h9(p14.f46378a, p14.f46379b, p14.f46380c, CollectionUtils.hashSetFromIntArray(p14.f46381d));
        }
        this.f47215c = c3559h9;
        int i13 = c3559h9.f47379c;
        int i14 = this.f47213a;
        if (i13 != i14) {
            c3559h9.f47379c = i14;
            c3559h9.f47380d = 0;
            C3633k9 c3633k10 = this.f47214b;
            IBinaryDataHelper iBinaryDataHelper = c3633k10.f47584c;
            C3608j9 c3608j9 = c3633k10.f47583b;
            c3633k10.f47582a.getClass();
            P9 p9A = C3584i9.a(c3559h9);
            c3608j9.getClass();
            iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(p9A));
        }
    }
}

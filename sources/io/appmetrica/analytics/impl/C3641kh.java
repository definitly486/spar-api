package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.protobuf.nano.MessageNano;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.kh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3641kh extends AbstractC3490eh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3508f9 f47607b;

    public C3641kh(C3828s5 c3828s5) {
        this(c3828s5, c3828s5.i());
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3490eh
    public final boolean a(C3655l6 c3655l6) {
        EnumC3983ya enumC3983ya;
        if (!TextUtils.isEmpty(c3655l6.getName())) {
            C3508f9 c3508f9 = this.f47607b;
            String name = c3655l6.getName();
            if (c3508f9.f47215c == null) {
                c3508f9.a();
            }
            int iHashCode = name.hashCode();
            if (c3508f9.f47215c.f47378b.contains(Integer.valueOf(iHashCode))) {
                enumC3983ya = EnumC3983ya.NON_FIRST_OCCURENCE;
            } else {
                C3559h9 c3559h9 = c3508f9.f47215c;
                EnumC3983ya enumC3983ya2 = c3559h9.f47377a ? EnumC3983ya.FIRST_OCCURRENCE : EnumC3983ya.UNKNOWN;
                if (c3559h9.f47380d < 1000) {
                    c3559h9.f47378b.add(Integer.valueOf(iHashCode));
                    c3559h9.f47380d++;
                } else {
                    c3559h9.f47377a = false;
                }
                C3633k9 c3633k9 = c3508f9.f47214b;
                C3559h9 c3559h10 = c3508f9.f47215c;
                IBinaryDataHelper iBinaryDataHelper = c3633k9.f47584c;
                C3608j9 c3608j9 = c3633k9.f47583b;
                c3633k9.f47582a.getClass();
                P9 p9A = C3584i9.a(c3559h10);
                c3608j9.getClass();
                iBinaryDataHelper.insert("event_hashes", MessageNano.toByteArray(p9A));
                enumC3983ya = enumC3983ya2;
            }
            c3655l6.f47641k = enumC3983ya;
        }
        return false;
    }

    public C3641kh(C3828s5 c3828s5, C3508f9 c3508f9) {
        super(c3828s5);
        this.f47607b = c3508f9;
    }
}

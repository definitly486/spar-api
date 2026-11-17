package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.k9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3633k9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3584i9 f47582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3608j9 f47583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IBinaryDataHelper f47584c;

    public C3633k9(Context context, C3654l5 c3654l5) {
        this(new C3608j9(), new C3584i9(), C3880u7.a(context).a(c3654l5));
    }

    public C3633k9(C3608j9 c3608j9, C3584i9 c3584i9, IBinaryDataHelper iBinaryDataHelper) {
        this.f47583b = c3608j9;
        this.f47582a = c3584i9;
        this.f47584c = iBinaryDataHelper;
    }
}

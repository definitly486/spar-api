package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3516fh implements InterfaceC4004z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3927w4 f47222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IHandlerExecutor f47223c = Ia.j().w().e();

    public C3516fh(Context context, C3927w4 c3927w4) {
        this.f47221a = context;
        this.f47222b = c3927w4;
    }

    public final void a(C3655l6 c3655l6, Bundle bundle) {
        if (c3655l6.m()) {
            return;
        }
        this.f47223c.execute(new RunnableC3990yh(this.f47221a, c3655l6, bundle, this.f47222b));
    }

    public final void a(C3653l4 c3653l4, C3655l6 c3655l6, K4 k13) {
        this.f47222b.a(c3653l4, k13).a(c3655l6, k13);
        this.f47222b.a(c3653l4.f47625b, c3653l4.f47626c, c3653l4.f47627d);
    }
}

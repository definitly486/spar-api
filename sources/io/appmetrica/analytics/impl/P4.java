package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes3.dex */
public final class P4 implements A4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f46370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S4 f46371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResultReceiver f46372c;

    public P4(Context context, S4 s13, K4 k13) {
        this.f46370a = context;
        this.f46371b = s13;
        this.f46372c = k13.f46126c;
        s13.a(this);
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final void a(C3655l6 c3655l6, K4 k13) {
        this.f46371b.a(k13.f46125b);
        this.f46371b.a(c3655l6, this);
    }

    public final S4 b() {
        return this.f46371b;
    }

    public final Context c() {
        return this.f46370a;
    }

    public final ResultReceiver d() {
        return this.f46372c;
    }

    public final void a(C3728o4 c3728o4) {
        W6.a(this.f46372c, c3728o4);
    }

    @Override // io.appmetrica.analytics.impl.A4
    public final void a() {
        this.f46371b.b(this);
    }
}

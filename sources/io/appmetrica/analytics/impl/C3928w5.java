package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.w5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3928w5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3654l5 f48270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3880u7 f48271b;

    public C3928w5(Context context, C3654l5 c3654l5) {
        this(c3654l5, C3880u7.a(context));
    }

    public final C3639kf a() {
        return new C3639kf(this.f48271b.b(this.f48270a));
    }

    public C3928w5(C3654l5 c3654l5, C3880u7 c3880u7) {
        this.f48270a = c3654l5;
        this.f48271b = c3880u7;
    }
}

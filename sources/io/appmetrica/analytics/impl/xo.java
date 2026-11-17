package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class xo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f48486b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final to f48487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final to f48488d;

    public xo(Context context) {
        this.f48485a = context;
        C3933wa c3933wa = new C3933wa(context, "appmetrica_vital.dat");
        this.f48487c = new to(Ia.j().x(), c3933wa);
        this.f48488d = new to(new C3714nf(C3880u7.a(context).d()), c3933wa);
    }

    public final to a() {
        return this.f48487c;
    }

    public final to b() {
        return this.f48488d;
    }
}

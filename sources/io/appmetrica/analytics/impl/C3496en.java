package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.en, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3496en implements InterfaceC3822s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3872u f47190b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3847t f47189a = new C3847t();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gg.gtknphoqwx f47191c = gg.draadjrbmk.zoijcleaow(new C3471dn(this));

    public C3496en(Context context) {
        this.f47190b = new C3872u(context);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC3822s
    public final Map<String, String> a(Map<String, String> map) {
        map.putAll((Map) this.f47191c.getValue());
        return map;
    }
}

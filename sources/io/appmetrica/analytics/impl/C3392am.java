package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.am, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3392am extends AbstractC3581i6 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V3 f46928b;

    public C3392am(Context context, String str) {
        this(context, str, new SafePackageManager(), Ia.j().e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.AbstractC3581i6, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C3418bm load(C3556h6 c3556h6) {
        C3418bm c3418bm = (C3418bm) super.load(c3556h6);
        C3521fm c3521fm = c3556h6.f47372a;
        c3418bm.f46986d = c3521fm.f47233f;
        c3418bm.f46987e = c3521fm.f47234g;
        Zl zl2 = (Zl) c3556h6.componentArguments;
        String str = zl2.f46889a;
        if (str != null) {
            c3418bm.f46988f = str;
            c3418bm.f46989g = zl2.f46890b;
        }
        Map<String, String> map = zl2.f46891c;
        c3418bm.f46990h = map;
        c3418bm.f46991i = (N3) this.f46928b.a(new N3(map, EnumC3657l8.f47648c));
        Zl zl3 = (Zl) c3556h6.componentArguments;
        c3418bm.f46993k = zl3.f46892d;
        c3418bm.f46992j = zl3.f46893e;
        C3521fm c3521fm2 = c3556h6.f47372a;
        c3418bm.f46994l = c3521fm2.f47243p;
        c3418bm.f46995m = c3521fm2.f47245r;
        long j13 = c3521fm2.f47249v;
        if (c3418bm.f46996n == 0) {
            c3418bm.f46996n = j13;
        }
        return c3418bm;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    public final BaseRequestConfig createBlankConfig() {
        return new C3418bm();
    }

    public C3392am(Context context, String str, SafePackageManager safePackageManager, V3 v13) {
        super(context, str, safePackageManager);
        this.f46928b = v13;
    }

    public final C3418bm a() {
        return new C3418bm();
    }
}

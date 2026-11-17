package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.IReporter;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.gh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3542gh extends AbstractC3490eh {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IReporter f47339b;

    public C3542gh(C3828s5 c3828s5, IReporter iReporter) {
        super(c3828s5);
        this.f47339b = iReporter;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC3490eh
    public final boolean a(C3655l6 c3655l6) {
        C3409bd c3409bd = (C3409bd) C3409bd.f46961c.get(c3655l6.f47634d);
        HashMap map = new HashMap();
        map.put("type", c3409bd.f46962a);
        map.put("delivery_method", c3409bd.f46963b);
        this.f47339b.reportEvent("crash_saved", map);
        return false;
    }
}

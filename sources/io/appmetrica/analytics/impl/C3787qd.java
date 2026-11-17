package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.qd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3787qd implements ModuleEventServiceHandlerReporter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f47918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F9 f47919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3655l6 f47920c;

    public C3787qd(boolean z13, F9 f13, C3655l6 c3655l6) {
        this.f47918a = z13;
        this.f47919b = f13;
        this.f47920c = c3655l6;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final boolean isMain() {
        return this.f47918a;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.event.ModuleEventServiceHandlerReporter
    public final void report(CounterReportApi counterReportApi) {
        C3655l6 c3655l6D = C3655l6.d(this.f47920c);
        c3655l6D.f47634d = counterReportApi.getType();
        c3655l6D.f47635e = counterReportApi.getCustomType();
        c3655l6D.setName(counterReportApi.getName());
        String value = counterReportApi.getValue();
        if (value != null) {
            c3655l6D.setValue(value);
        }
        byte[] valueBytes = counterReportApi.getValueBytes();
        if (valueBytes != null) {
            c3655l6D.setValueBytes(valueBytes);
        }
        c3655l6D.f47637g = counterReportApi.getBytesTruncated();
        F9 f13 = this.f47919b;
        f13.a(c3655l6D, Sk.a(f13.f45800c.b(c3655l6D), c3655l6D.f47639i));
    }
}

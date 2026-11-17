package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class Ye implements Pc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Oc f46807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Oc f46808b;

    public Ye(final M9 m13, C3465dh c3465dh, J4 j13, C3639kf c3639kf) {
        Oc oc3 = new Oc(c3465dh, j13, c3639kf);
        this.f46807a = oc3;
        this.f46808b = oc3;
        if (oc3.b()) {
            return;
        }
        Ia.j().a().subscribe(TimeUnit.SECONDS.toMillis(AbstractC3430c8.f47014a.longValue()), Ia.j().w().a(), new ActivationBarrierCallback() { // from class: io.appmetrica.analytics.impl.esjtqupxsv
            @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
            public final void onWaitFinished() {
                Ye.a(this.f47197iobyxmoadg, m13);
            }
        });
    }

    @Override // io.appmetrica.analytics.impl.Pc
    public final Y8 a() {
        return this.f46808b;
    }

    public static final void a(Ye ye2, M9 m13) {
        ye2.f46807a.a();
        ((F5) m13.a()).e();
    }
}

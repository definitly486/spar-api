package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeTypeChangeListener;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import java.util.Iterator;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3425c3 extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BatteryInfo f47006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3451d3 f47007b;

    public C3425c3(C3451d3 c3451d3, BatteryInfo batteryInfo) {
        this.f47007b = c3451d3;
        this.f47006a = batteryInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C3476e3 c3476e3 = this.f47007b.f47064a;
        ChargeType chargeType = this.f47006a.chargeType;
        ChargeType chargeType2 = C3476e3.f47148d;
        synchronized (c3476e3) {
            Iterator it = c3476e3.f47151c.iterator();
            while (it.hasNext()) {
                ((ChargeTypeChangeListener) it.next()).onChargeTypeChanged(chargeType);
            }
        }
    }
}

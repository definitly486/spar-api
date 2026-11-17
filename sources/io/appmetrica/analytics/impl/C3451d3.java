package io.appmetrica.analytics.impl;

import android.content.Intent;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.BatteryInfo;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.batteryinfo.ChargeType;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3451d3 implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3476e3 f47064a;

    public C3451d3(C3476e3 c3476e3) {
        this.f47064a = c3476e3;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    public final void consume(Object obj) {
        Intent intent = (Intent) obj;
        BatteryInfo batteryInfo = this.f47064a.f47150b;
        ChargeType chargeType = batteryInfo == null ? null : batteryInfo.chargeType;
        this.f47064a.getClass();
        BatteryInfo batteryInfoA = C3476e3.a(intent);
        this.f47064a.f47150b = batteryInfoA;
        if (chargeType != batteryInfoA.chargeType) {
            this.f47064a.f47149a.execute(new C3425c3(this, batteryInfoA));
        }
    }
}

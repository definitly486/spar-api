package io.appmetrica.analytics.impl;

import android.os.Bundle;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.p4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3753p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bm f47861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f47862b;

    public C3753p4(Bm bm2, T t13) {
        this.f47861a = bm2;
        this.f47862b = t13;
    }

    public final C3728o4 a(HashMap map) {
        AdvertisingIdsHolder advertisingIdsHolderA;
        C3521fm c3521fmE = this.f47861a.e();
        T t13 = this.f47862b;
        synchronized (t13) {
            advertisingIdsHolderA = t13.a(new C3688me());
        }
        return new C3728o4(C3728o4.a(c3521fmE.f47231d), C3728o4.a(c3521fmE.f47228a), C3728o4.a(c3521fmE.f47229b), C3728o4.a(c3521fmE.f47237j), C3728o4.a(c3521fmE.f47236i), C3728o4.a(Bb.a(Gm.a(c3521fmE.f47238k))), C3728o4.a(Bb.a(map)), new IdentifiersResult(advertisingIdsHolderA.getGoogle().mAdTrackingInfo == null ? null : advertisingIdsHolderA.getGoogle().mAdTrackingInfo.advId, advertisingIdsHolderA.getGoogle().mStatus, advertisingIdsHolderA.getGoogle().mErrorExplanation), new IdentifiersResult(advertisingIdsHolderA.getHuawei().mAdTrackingInfo == null ? null : advertisingIdsHolderA.getHuawei().mAdTrackingInfo.advId, advertisingIdsHolderA.getHuawei().mStatus, advertisingIdsHolderA.getHuawei().mErrorExplanation), new IdentifiersResult(advertisingIdsHolderA.getYandex().mAdTrackingInfo == null ? null : advertisingIdsHolderA.getYandex().mAdTrackingInfo.advId, advertisingIdsHolderA.getYandex().mStatus, advertisingIdsHolderA.getYandex().mErrorExplanation), C3728o4.a(Bb.a(c3521fmE.f47235h)), Fn.a(), c3521fmE.f47242o + ((long) c3521fmE.A.f45666a), C3728o4.a(c3521fmE.f47241n.f45842f), new Bundle());
    }
}

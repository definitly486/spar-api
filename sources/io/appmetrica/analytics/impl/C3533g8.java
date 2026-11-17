package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfoResult;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.g8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3533g8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f47300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3527g2 f47301b;

    public C3533g8(T t13, C3527g2 c3527g2) {
        this.f47300a = t13;
        this.f47301b = c3527g2;
    }

    public final String a() {
        AdvertisingIdsHolder advertisingIdsHolder;
        byte[] bArrDigest;
        T t13 = this.f47300a;
        Gn gn2 = new Gn(5, 500);
        synchronized (t13) {
            try {
                t13.a((Ti) gn2, true).get();
            } catch (InterruptedException | ExecutionException unused) {
            }
            advertisingIdsHolder = t13.f46535k;
        }
        AdTrackingInfoResult yandex = advertisingIdsHolder.getYandex();
        if (!yandex.isValid()) {
            String id2 = this.f47301b.getAppSetId().getId();
            if (id2 != null && id2.length() != 0) {
                try {
                    UUID.fromString(id2);
                    if (!kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(id2, "00000000-0000-0000-0000-000000000000")) {
                        return mj.kcexrzcfyt.hcddaimhww(id2, "-", "", false, 4, null);
                    }
                } catch (Throwable unused2) {
                }
            }
            return mj.kcexrzcfyt.hcddaimhww(UUID.randomUUID().toString(), "-", "", false, 4, null).toLowerCase(Locale.US);
        }
        AdTrackingInfo adTrackingInfo = yandex.mAdTrackingInfo;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(adTrackingInfo);
        String str = adTrackingInfo.advId;
        kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(str);
        try {
            bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(mj.wkgbmnqykc.f67326zoijcleaow));
        } catch (NoSuchAlgorithmException unused3) {
            bArrDigest = new byte[0];
        }
        return StringUtils.toHexString(bArrDigest);
    }

    public C3533g8() {
        this(Ia.j().b(), Ia.j().c());
    }
}

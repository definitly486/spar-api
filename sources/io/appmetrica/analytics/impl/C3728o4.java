package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.internal.IdentifiersResult;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.o4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3728o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IdentifiersResult f47797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdentifiersResult f47798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final IdentifiersResult f47799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final IdentifiersResult f47800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final IdentifiersResult f47801e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final IdentifiersResult f47802f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IdentifiersResult f47803g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final IdentifiersResult f47804h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final IdentifiersResult f47805i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final IdentifiersResult f47806j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final IdentifiersResult f47807k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f47808l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f47809m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C3784qa f47810n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Bundle f47811o;

    public C3728o4(IdentifiersResult identifiersResult, IdentifiersResult identifiersResult2, IdentifiersResult identifiersResult3, IdentifiersResult identifiersResult4, IdentifiersResult identifiersResult5, IdentifiersResult identifiersResult6, IdentifiersResult identifiersResult7, IdentifiersResult identifiersResult8, IdentifiersResult identifiersResult9, IdentifiersResult identifiersResult10, IdentifiersResult identifiersResult11, long j13, long j14, C3784qa c3784qa, Bundle bundle) {
        this.f47797a = identifiersResult;
        this.f47798b = identifiersResult2;
        this.f47799c = identifiersResult3;
        this.f47800d = identifiersResult4;
        this.f47801e = identifiersResult5;
        this.f47802f = identifiersResult6;
        this.f47803g = identifiersResult7;
        this.f47804h = identifiersResult8;
        this.f47805i = identifiersResult9;
        this.f47806j = identifiersResult10;
        this.f47807k = identifiersResult11;
        this.f47808l = j13;
        this.f47809m = j14;
        this.f47810n = c3784qa;
        this.f47811o = bundle;
    }

    public static IdentifiersResult a(Bundle bundle, String str) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle(str);
        ClassLoader classLoader = IdentifiersResult.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        IdentifiersResult identifiersResult = (IdentifiersResult) parcelable;
        return identifiersResult == null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : identifiersResult;
    }

    public final void b(Bundle bundle) {
        IdentifiersResult identifiersResult = this.f47797a;
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("value", identifiersResult);
        bundle.putBundle("Uuid", bundle2);
        IdentifiersResult identifiersResult2 = this.f47798b;
        Bundle bundle3 = new Bundle();
        bundle3.putParcelable("value", identifiersResult2);
        bundle.putBundle("DeviceId", bundle3);
        IdentifiersResult identifiersResult3 = this.f47799c;
        Bundle bundle4 = new Bundle();
        bundle4.putParcelable("value", identifiersResult3);
        bundle.putBundle("DeviceIdHash", bundle4);
        IdentifiersResult identifiersResult4 = this.f47800d;
        Bundle bundle5 = new Bundle();
        bundle5.putParcelable("value", identifiersResult4);
        bundle.putBundle("AdUrlReport", bundle5);
        IdentifiersResult identifiersResult5 = this.f47801e;
        Bundle bundle6 = new Bundle();
        bundle6.putParcelable("value", identifiersResult5);
        bundle.putBundle("AdUrlGet", bundle6);
        IdentifiersResult identifiersResult6 = this.f47802f;
        Bundle bundle7 = new Bundle();
        bundle7.putParcelable("value", identifiersResult6);
        bundle.putBundle("Clids", bundle7);
        IdentifiersResult identifiersResult7 = this.f47803g;
        Bundle bundle8 = new Bundle();
        bundle8.putParcelable("value", identifiersResult7);
        bundle.putBundle("RequestClids", bundle8);
        IdentifiersResult identifiersResult8 = this.f47804h;
        Bundle bundle9 = new Bundle();
        bundle9.putParcelable("value", identifiersResult8);
        bundle.putBundle("GAID", bundle9);
        IdentifiersResult identifiersResult9 = this.f47805i;
        Bundle bundle10 = new Bundle();
        bundle10.putParcelable("value", identifiersResult9);
        bundle.putBundle("HOAID", bundle10);
        IdentifiersResult identifiersResult10 = this.f47806j;
        Bundle bundle11 = new Bundle();
        bundle11.putParcelable("value", identifiersResult10);
        bundle.putBundle("YANDEX_ADV_ID", bundle11);
        IdentifiersResult identifiersResult11 = this.f47807k;
        Bundle bundle12 = new Bundle();
        bundle12.putParcelable("value", identifiersResult11);
        bundle.putBundle("CUSTOM_SDK_HOSTS", bundle12);
        bundle.putLong("ServerTimeOffset", this.f47808l);
        bundle.putLong("NextStartupTime", this.f47809m);
        C3784qa c3784qa = this.f47810n;
        Bundle bundle13 = new Bundle();
        bundle13.putParcelable("value", c3784qa);
        bundle.putBundle("features", bundle13);
        bundle.putBundle("module_configs", Ia.F.o().i());
    }

    public final String toString() {
        return "ClientIdentifiersHolder{mUuidData=" + this.f47797a + ", mDeviceIdData=" + this.f47798b + ", mDeviceIdHashData=" + this.f47799c + ", mReportAdUrlData=" + this.f47800d + ", mGetAdUrlData=" + this.f47801e + ", mResponseClidsData=" + this.f47802f + ", mClientClidsForRequestData=" + this.f47803g + ", mGaidData=" + this.f47804h + ", mHoaidData=" + this.f47805i + ", yandexAdvIdData=" + this.f47806j + ", customSdkHostsData=" + this.f47807k + ", mServerTimeOffset=" + this.f47808l + ", nextStartupTime=" + this.f47809m + ", features=" + this.f47810n + ", modulesConfig=" + this.f47811o + '}';
    }

    public static C3784qa a(Bundle bundle) {
        Parcelable parcelable;
        Bundle bundle2 = bundle.getBundle("features");
        ClassLoader classLoader = C3784qa.class.getClassLoader();
        if (bundle2 == null) {
            parcelable = null;
        } else {
            bundle2.setClassLoader(classLoader);
            parcelable = bundle2.getParcelable("value");
        }
        C3784qa c3784qa = (C3784qa) parcelable;
        return c3784qa == null ? new C3784qa(null, IdentifierStatus.UNKNOWN, "bundle serialization error") : c3784qa;
    }

    public static IdentifiersResult a(String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        return new IdentifiersResult(str, zIsEmpty ? IdentifierStatus.UNKNOWN : IdentifierStatus.OK, zIsEmpty ? "no identifier in startup state" : null);
    }

    public static C3784qa a(Boolean bool) {
        boolean z13 = bool != null;
        return new C3784qa(bool, z13 ? IdentifierStatus.OK : IdentifierStatus.UNKNOWN, z13 ? null : "no identifier in startup state");
    }
}

package io.appmetrica.analytics.coreapi.internal.identifiers;

/* JADX INFO: loaded from: classes3.dex */
public class AdvertisingIdsHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdTrackingInfoResult f45227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AdTrackingInfoResult f45228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AdTrackingInfoResult f45229c;

    public AdvertisingIdsHolder() {
        this(new AdTrackingInfoResult(), new AdTrackingInfoResult(), new AdTrackingInfoResult());
    }

    public AdTrackingInfoResult getGoogle() {
        return this.f45227a;
    }

    public AdTrackingInfoResult getHuawei() {
        return this.f45228b;
    }

    public AdTrackingInfoResult getYandex() {
        return this.f45229c;
    }

    public String toString() {
        return "AdvertisingIdsHolder{mGoogle=" + this.f45227a + ", mHuawei=" + this.f45228b + ", yandex=" + this.f45229c + '}';
    }

    public AdvertisingIdsHolder(AdTrackingInfoResult adTrackingInfoResult, AdTrackingInfoResult adTrackingInfoResult2, AdTrackingInfoResult adTrackingInfoResult3) {
        this.f45227a = adTrackingInfoResult;
        this.f45228b = adTrackingInfoResult2;
        this.f45229c = adTrackingInfoResult3;
    }
}

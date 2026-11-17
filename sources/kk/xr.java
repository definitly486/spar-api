package kk;

import modern.payments.ecomAndroid.util.analytics.EcomMetricKey;

/* JADX INFO: loaded from: classes3.dex */
public enum xr implements io {
    SDK_VERSION(EcomMetricKey.SDK_VERSION),
    RQ_REMOTE_CONFIG("RQRemoteConfig"),
    RQ_GOOD_REMOTE_CONFIG("RQGoodRemoteConfig"),
    RQ_FAIL_REMOTE_CONFIG("RQFailRemoteConfig"),
    RS_GOOD_REMOTE_CONFIG("RSGoodRemoteConfig"),
    RS_FAIL_REMOTE_CONFIG("RSFailRemoteConfig"),
    /* JADX INFO: Fake field, exist only in values array */
    ST_GET_GOOD_REMOTE_CONFIG("STGetGoodRemoteConfig"),
    /* JADX INFO: Fake field, exist only in values array */
    ST_GET_FAIL_REMOTE_CONFIG("STGetFailRemoteConfig"),
    LC_BANK_APP_FOUND("LCBankAppFound"),
    LC_NO_BANK_APP_FOUND("LCNoBankAppFound"),
    LC_PAY_BUTTON_INITED("LCPayButtonInited"),
    SC_PERMISSIONS("SCPermissions"),
    SC_GOOD_PERMISSIONS("SCGoodPermissions"),
    SC_FAIL_PERMISSIONS("SCFailPermissions"),
    SC_BIZONE("SCBiZone"),
    SC_GOOD_BIZONE("SCGoodBiZone"),
    SC_FAIL_BIZONE("SCFailBiZone");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final String f59340zdlpuopuiu;

    xr(String str) {
        this.f59340zdlpuopuiu = str;
    }

    @Override // kk.io
    public final String a() {
        return this.f59340zdlpuopuiu;
    }
}

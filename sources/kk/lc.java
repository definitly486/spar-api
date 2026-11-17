package kk;

/* JADX INFO: loaded from: classes3.dex */
public enum lc implements io {
    TOUCH_BACK("TouchBack"),
    TOUCH_LOG_OUT("TouchLogOut"),
    /* JADX INFO: Fake field, exist only in values array */
    RQ_REVOKE_TOKEN_SDK("RQRevokeTokenSdk"),
    RQ_GOOD_REVOKE_TOKEN_SDK("RQGoodRevokeTokenSdk"),
    RQ_FAIL_REVOKE_TOKEN_SDK("RQFailRevokeTokenSdk"),
    RS_GOOD_REVOKE_TOKEN_SDK("RSGoodRevokeTokenSdk"),
    RS_FAIL_REVOKE_TOKEN_SDK("RSFailRevokeTokenSdk"),
    /* JADX INFO: Fake field, exist only in values array */
    ST_REMOVE_REFRESH("STRemoveRefresh"),
    LC_PROFILE_VIEW_APPEARED("LCProfileViewAppeared"),
    LC_PROFILE_VIEW_DISAPPEARED("LCProfileViewDisappeared");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final String f57442zdlpuopuiu;

    lc(String str) {
        this.f57442zdlpuopuiu = str;
    }

    @Override // kk.io
    public final String a() {
        return this.f57442zdlpuopuiu;
    }
}

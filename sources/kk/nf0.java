package kk;

/* JADX INFO: loaded from: classes3.dex */
public enum nf0 implements io {
    TOUCH_BACK("TouchBack"),
    TOUCH_NEXT("TouchNext"),
    RQ_CREATE_OTP("RQCreateOtp"),
    RQ_GOOD_CREATE_OTP("RQGoodCreateOtp"),
    RQ_FAIL_CREATE_OTP("RQFailCreateOtp"),
    RS_GOOD_CREATE_OTP("RSGoodCreateOtp"),
    RS_FAIL_CREATE_OTP("RSFailCreateOtp"),
    RQ_CONFIRM_OTP("RQConfirmOtp"),
    RQ_GOOD_CONFIRM_OTP("RQGoodConfirmOtp"),
    RQ_FAIL_CONFIRM_OTP("RQFailConfirmOtp"),
    RS_GOOD_CONFIRM_OTP("RSGoodConfirmOtp"),
    RS_FAIL_CONFIRM_OTP("RSFailConfirmOtp"),
    LC_OTP_VIEW_APPEARED("LCOtpViewAppeared"),
    LC_OTP_VIEW_DISAPPEARED("LCOtpViewDisappeared");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final String f57823zdlpuopuiu;

    nf0(String str) {
        this.f57823zdlpuopuiu = str;
    }

    @Override // kk.io
    public final String a() {
        return this.f57823zdlpuopuiu;
    }
}

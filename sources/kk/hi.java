package kk;

/* JADX INFO: loaded from: classes3.dex */
public enum hi implements io {
    TOUCH_TOP_BUTTON("TouchTopButton"),
    TOUCH_BOTTOM_BUTTON("TouchBottomButton"),
    LC_STATUS_SUCCESS_VIEW_APPEARED("LCStatusSuccessViewAppeared"),
    LC_STATUS_IN_PROGRESS_VIEW_APPEARED("LCStatusInProgressViewAppeared"),
    LC_STATUS_ERROR_VIEW_APPEARED("LCStatusErrorViewAppeared"),
    LC_STATUS_VIEW_DISAPPEARED("LCStatusViewDisappeared");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final String f56928zdlpuopuiu;

    hi(String str) {
        this.f56928zdlpuopuiu = str;
    }

    @Override // kk.io
    public final String a() {
        return this.f56928zdlpuopuiu;
    }
}

package kk;

/* JADX INFO: loaded from: classes3.dex */
public enum w implements io {
    TOUCH_CONFIRMED_BY_USER("TouchConfirmedByUser"),
    TOUCH_DECLINED_BY_USER("TouchDeclinedByUser"),
    TOUCH_APPROVE_BNPL("TouchApproveBNPL"),
    TOUCH_CONTRACT_VIEW("TouchContractView"),
    TOUCH_AGREEMENT_VIEW("TouchAgreementView"),
    LC_BNPL_VIEW_APPEARED("LCBnplViewAppeared"),
    LC_BNPL_VIEW_DISAPPEARED("LCBnplViewDisappeared");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final String f59079zdlpuopuiu;

    w(String str) {
        this.f59079zdlpuopuiu = str;
    }

    @Override // kk.io
    public final String a() {
        return this.f59079zdlpuopuiu;
    }
}

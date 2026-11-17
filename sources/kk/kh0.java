package kk;

/* JADX INFO: loaded from: classes3.dex */
public enum kh0 implements io {
    TOUCH_CARD("TouchCard"),
    TOUCH_PAY("TouchPay"),
    TOUCH_CANCEL("TouchCancel"),
    TOUCH_APPROVE_BNPL("TouchApproveBNPL"),
    TOUCH_CONTRACT_VIEW("TouchContractView"),
    TOUCH_AGREEMENT_VIEW("TouchAgreementView");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final String f57317zdlpuopuiu;

    kh0(String str) {
        this.f57317zdlpuopuiu = str;
    }

    @Override // kk.io
    public final String a() {
        return this.f57317zdlpuopuiu;
    }
}

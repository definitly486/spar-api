package kk;

/* JADX INFO: loaded from: classes3.dex */
public enum uw implements io {
    RQ_BINDING_SESSION_ID("RQBindingSessionId"),
    RQ_GOOD_BINDING_SESSION_ID("RQGoodBindingSessionId"),
    RQ_FAIL_BINDING_SESSION_ID("RQFailBindingSessionId"),
    RS_GOOD_BINDING_SESSION_ID("RSGoodBindingSessionId"),
    RS_FAIL_BINDING_SESSION_ID("RSFailBindingSessionId"),
    RQ_CREATE_BINDING("RQCreateBinding"),
    RQ_GOOD_CREATE_BINDING("RQGoodCreateBinding"),
    RQ_FAIL_CREATE_BINDING("RQFailCreateBinding"),
    RS_GOOD_CREATE_BINDING("RSGoodCreateBinding"),
    RS_FAIL_CREATE_BINDING("RSFailCreateBinding"),
    RQ_CONFIRM_BINDING("RQConfirmBinding"),
    RQ_GOOD_CONFIRM_BINDING("RQGoodConfirmBinding"),
    RQ_FAIL_CONFIRM_BINDING("RQFailConfirmBinding"),
    RQ_PAY_BINDING("RQPayBinding"),
    RQ_GOOD_PAY_BINDING("RQGoodPayBinding"),
    RQ_FAIL_PAY_BINDING("RQFailPayBinding");


    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final String f58913zdlpuopuiu;

    uw(String str) {
        this.f58913zdlpuopuiu = str;
    }

    @Override // kk.io
    public final String a() {
        return this.f58913zdlpuopuiu;
    }
}

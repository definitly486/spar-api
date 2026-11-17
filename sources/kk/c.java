package kk;

import spay.sdk.domain.model.request.PayBindingOtpRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends ui {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final ll f56067iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final pc f56068zoijcleaow;

    public c(ll sPayRepository, pc sPaySdkReducer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayRepository, "sPayRepository");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        this.f56067iobyxmoadg = sPayRepository;
        this.f56068zoijcleaow = sPaySdkReducer;
    }

    @Override // kk.ui
    public final Object iobyxmoadg(Object obj, pj.pkzmftpjix pkzmftpjixVar, lg.gxszxtbevo gxszxtbevoVar) {
        Object objLqeggnwhkg = pj.dxjokdxxww.lqeggnwhkg(pkzmftpjixVar.plus(pj.krqnebusok.zoijcleaow(null, 1, null)), new nuxfzjnpeb(this, (PayBindingOtpRequestBody) obj, pkzmftpjixVar, null), gxszxtbevoVar);
        return objLqeggnwhkg == mg.zoijcleaow.gxszxtbevo() ? objLqeggnwhkg : gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}

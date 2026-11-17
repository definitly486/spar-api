package kk;

import npi.spay.Mn;
import spay.sdk.R;

/* JADX INFO: loaded from: classes3.dex */
public final class wg0 extends u0 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final int f59163eablkybsjg;

    /* JADX INFO: renamed from: gxszxtbevo, reason: collision with root package name */
    public final sj.wypolnanlu f59164gxszxtbevo;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final pc f59165wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg0(bt metricFacade, jlmebxxoox sPayDataContract, pc sPaySdkReducer, xf sPayStorage) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        this.f59165wkgbmnqykc = sPaySdkReducer;
        int i13 = R.string.spay_pay_binding_default_error_title_text;
        this.f59163eablkybsjg = i13;
        ij ijVar = (ij) sPayStorage;
        this.f59164gxszxtbevo = sj.dxjokdxxww.ribwqtqdhb(new sf0(new o80(new ac0(ijVar.f57056zoijcleaow)), this), androidx.lifecycle.ulzqkzuiru.iobyxmoadg(this), sj.jpowsppfya.iobyxmoadg.zoijcleaow(sj.jpowsppfya.f106926iobyxmoadg, 0L, 0L, 3, null), Integer.valueOf(i13));
        if (!(ijVar.iobyxmoadg().f57485iobyxmoadg instanceof q5)) {
            throw new Mn(ijVar.iobyxmoadg().toString());
        }
    }
}

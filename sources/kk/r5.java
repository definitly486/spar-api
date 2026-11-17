package kk;

import npi.spay.Gr;
import npi.spay.Mn;

/* JADX INFO: loaded from: classes3.dex */
public final class r5 extends u0 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Gr f58269eablkybsjg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final pc f58270wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(bt metricFacade, jlmebxxoox sPayDataContract, pc sPaySdkReducer, xf sPayStorage) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        this.f58270wkgbmnqykc = sPaySdkReducer;
        ij ijVar = (ij) sPayStorage;
        hl hlVar = ijVar.iobyxmoadg().f57485iobyxmoadg;
        if (!(hlVar instanceof t6)) {
            throw new Mn(ijVar.iobyxmoadg().toString());
        }
        this.f58269eablkybsjg = new Gr(((t6) hlVar).f58623zoijcleaow);
    }
}

package kk;

import npi.spay.Gr;
import npi.spay.Mn;

/* JADX INFO: loaded from: classes3.dex */
public final class t8 extends u0 {

    /* JADX INFO: renamed from: eablkybsjg, reason: collision with root package name */
    public final Gr f58628eablkybsjg;

    /* JADX INFO: renamed from: wkgbmnqykc, reason: collision with root package name */
    public final pc f58629wkgbmnqykc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v5, types: [kotlin.coroutines.jvm.internal.draadjrbmk, tg.draadjrbmk] */
    public t8(bt metricFacade, jlmebxxoox sPayDataContract, pc sPaySdkReducer, xf sPayStorage) {
        super(metricFacade, sPayDataContract, sPaySdkReducer);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(metricFacade, "metricFacade");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayDataContract, "sPayDataContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkReducer, "sPaySdkReducer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPayStorage, "sPayStorage");
        this.f58629wkgbmnqykc = sPaySdkReducer;
        ij ijVar = (ij) sPayStorage;
        hl hlVar = ijVar.iobyxmoadg().f57485iobyxmoadg;
        if (!(hlVar instanceof g60)) {
            throw new Mn(ijVar.iobyxmoadg().toString());
        }
        this.f58628eablkybsjg = new Gr(((g60) hlVar).f56661iobyxmoadg);
    }
}

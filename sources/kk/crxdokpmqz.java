package kk;

import npi.spay.Dn;
import spay.sdk.api.SPaySdkInitConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class crxdokpmqz extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ ka f56182zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public crxdokpmqz(ka kaVar) {
        super(0);
        this.f56182zdlpuopuiu = kaVar;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        SPaySdkInitConfig sPaySdkInitConfig = ((nb) this.f56182zdlpuopuiu).f57752iobyxmoadg;
        if (sPaySdkInitConfig != null) {
            return Boolean.valueOf(sPaySdkInitConfig.getResultViewNeeded());
        }
        throw Dn.f70543zdlpuopuiu;
    }
}

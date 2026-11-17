package kk;

import npi.spay.Dn;
import spay.sdk.api.SPaySdkInitConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class be implements zk.iobyxmoadg.zoijcleaow {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    public final nw f55974iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    public final ka f55975zoijcleaow;

    public be(nw loggingContract, ka sPaySdkMerchantOptionsRepository) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(loggingContract, "loggingContract");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sPaySdkMerchantOptionsRepository, "sPaySdkMerchantOptionsRepository");
        this.f55974iobyxmoadg = loggingContract;
        this.f55975zoijcleaow = sPaySdkMerchantOptionsRepository;
    }

    @Override // zk.iobyxmoadg.zoijcleaow
    public final void log(String message) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(message, "message");
        SPaySdkInitConfig sPaySdkInitConfig = ((nb) this.f55975zoijcleaow).f57752iobyxmoadg;
        if (sPaySdkInitConfig == null) {
            throw Dn.f70543zdlpuopuiu;
        }
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(new wb(this, message), "block");
        yc block = new yc(this, sPaySdkInitConfig, message);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(block, "block");
        block.invoke();
    }
}

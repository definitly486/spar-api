package kk;

import npi.spay.Dn;
import spay.sdk.SPaySdkApp;
import spay.sdk.api.InitializationResult;
import spay.sdk.api.SPaySdkInitConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class k50 extends kotlin.jvm.internal.jyumaefscl implements tg.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ SPaySdkApp f57263zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k50(SPaySdkApp sPaySdkApp) {
        super(0);
        this.f57263zdlpuopuiu = sPaySdkApp;
    }

    @Override // tg.iobyxmoadg
    public final Object invoke() {
        SPaySdkInitConfig sPaySdkInitConfig = ((nb) this.f57263zdlpuopuiu.getSPaySdkMerchantOptionsRepository$SPaySDK_baseRelease()).f57752iobyxmoadg;
        if (sPaySdkInitConfig == null) {
            throw Dn.f70543zdlpuopuiu;
        }
        sPaySdkInitConfig.getInitializationResult().invoke(new InitializationResult.ConfigError("SPaySdkApp initialize with exception : merchantConfig is null on reinitialization. Please initialize SDK again."));
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}

package kk;

import android.content.Context;
import spay.sdk.SPaySdkApp;
import spay.sdk.api.SPaySdkInitConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class c30 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ SPaySdkInitConfig f56085jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ Context f56086yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ SPaySdkApp f56087zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(SPaySdkApp sPaySdkApp, Context context, SPaySdkInitConfig sPaySdkInitConfig, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f56087zdlpuopuiu = sPaySdkApp;
        this.f56086yggfygwlhe = context;
        this.f56085jyumaefscl = sPaySdkInitConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new c30(this.f56087zdlpuopuiu, this.f56086yggfygwlhe, this.f56085jyumaefscl, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((c30) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        return pj.gtknphoqwx.wkgbmnqykc(this.f56087zdlpuopuiu.getScope(), null, null, new v10(this.f56087zdlpuopuiu, this.f56086yggfygwlhe, this.f56085jyumaefscl, null), 3, null);
    }
}

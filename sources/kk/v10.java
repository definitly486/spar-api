package kk;

import android.content.Context;
import spay.sdk.SPaySdkApp;
import spay.sdk.api.SPaySdkInitConfig;

/* JADX INFO: loaded from: classes3.dex */
public final class v10 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ SPaySdkInitConfig f58930jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ Context f58931yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ SPaySdkApp f58932zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v10(SPaySdkApp sPaySdkApp, Context context, SPaySdkInitConfig sPaySdkInitConfig, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f58932zdlpuopuiu = sPaySdkApp;
        this.f58931yggfygwlhe = context;
        this.f58930jyumaefscl = sPaySdkInitConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new v10(this.f58932zdlpuopuiu, this.f58931yggfygwlhe, this.f58930jyumaefscl, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((v10) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        SPaySdkApp.access$initLocalSecuredSharedPrefs(this.f58932zdlpuopuiu, this.f58931yggfygwlhe);
        SPaySdkApp.access$cacheConfigToSharedPreferences(this.f58932zdlpuopuiu, this.f58930jyumaefscl);
        this.f58932zdlpuopuiu.f107830a = null;
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}

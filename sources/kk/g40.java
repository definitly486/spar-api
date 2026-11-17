package kk;

import android.content.Context;
import spay.sdk.SPaySdkApp;

/* JADX INFO: loaded from: classes3.dex */
public final class g40 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ tg.draadjrbmk f56639iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.hkdspvbjdz f56640jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ Context f56641yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public final /* synthetic */ SPaySdkApp f56642zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g40(SPaySdkApp sPaySdkApp, Context context, kotlin.jvm.internal.hkdspvbjdz hkdspvbjdzVar, tg.draadjrbmk draadjrbmkVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f56642zdlpuopuiu = sPaySdkApp;
        this.f56641yggfygwlhe = context;
        this.f56640jyumaefscl = hkdspvbjdzVar;
        this.f56639iwizpuwonk = draadjrbmkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new g40(this.f56642zdlpuopuiu, this.f56641yggfygwlhe, this.f56640jyumaefscl, this.f56639iwizpuwonk, gxszxtbevoVar);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((g40) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        SPaySdkApp.access$initLocalSecuredSharedPrefs(this.f56642zdlpuopuiu, this.f56641yggfygwlhe);
        this.f56640jyumaefscl.f60015zdlpuopuiu = this.f56642zdlpuopuiu.a(this.f56639iwizpuwonk);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}

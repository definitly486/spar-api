package kk;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class fc0 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ spay.sdk.c f56529iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ tg.draadjrbmk f56530jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ Context f56531yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f56532zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc0(Context context, tg.draadjrbmk draadjrbmkVar, spay.sdk.c cVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(2, gxszxtbevoVar);
        this.f56531yggfygwlhe = context;
        this.f56530jyumaefscl = draadjrbmkVar;
        this.f56529iwizpuwonk = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        fc0 fc0Var = new fc0(this.f56531yggfygwlhe, this.f56530jyumaefscl, this.f56529iwizpuwonk, gxszxtbevoVar);
        fc0Var.f56532zdlpuopuiu = obj;
        return fc0Var;
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((fc0) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        mg.zoijcleaow.gxszxtbevo();
        gg.zdlpuopuiu.zoijcleaow(obj);
        pj.gtknphoqwx.wkgbmnqykc((pj.cllcsxoeiz) this.f56532zdlpuopuiu, null, null, new spay.sdk.b(this.f56531yggfygwlhe, this.f56530jyumaefscl, this.f56529iwizpuwonk, null), 3, null);
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}

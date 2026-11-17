package kk;

import npi.spay.Nf;

/* JADX INFO: loaded from: classes3.dex */
public final class vdvldrhtss extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final /* synthetic */ u00 f58992cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ sj.wypolnanlu f58993iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f58994jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ Nf f58995yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f58996zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vdvldrhtss(Nf nf2, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, sj.wypolnanlu wypolnanluVar, lg.gxszxtbevo gxszxtbevoVar, u00 u00Var) {
        super(2, gxszxtbevoVar);
        this.f58995yggfygwlhe = nf2;
        this.f58994jyumaefscl = zoijcleaowVar;
        this.f58993iwizpuwonk = wypolnanluVar;
        this.f58992cqumvgiudr = u00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new vdvldrhtss(this.f58995yggfygwlhe, this.f58994jyumaefscl, this.f58993iwizpuwonk, gxszxtbevoVar, this.f58992cqumvgiudr);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((vdvldrhtss) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f58996zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            Nf nf2 = this.f58995yggfygwlhe;
            androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f58994jyumaefscl;
            yh0 yh0Var = new yh0(this.f58993iwizpuwonk, null, this.f58992cqumvgiudr);
            this.f58996zdlpuopuiu = 1;
            if (androidx.lifecycle.lmojexxdyd.zoijcleaow(nf2, zoijcleaowVar, yh0Var, this) == objGxszxtbevo) {
                return objGxszxtbevo;
            }
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gg.zdlpuopuiu.zoijcleaow(obj);
        }
        return gg.wwaezpbzkn.f37140iobyxmoadg;
    }
}

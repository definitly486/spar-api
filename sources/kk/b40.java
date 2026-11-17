package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class b40 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final /* synthetic */ npi.spay.oi f55900cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ sj.wypolnanlu f55901iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f55902jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ npi.spay.oi f55903yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f55904zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(npi.spay.oi oiVar, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, sj.wypolnanlu wypolnanluVar, lg.gxszxtbevo gxszxtbevoVar, npi.spay.oi oiVar2) {
        super(2, gxszxtbevoVar);
        this.f55903yggfygwlhe = oiVar;
        this.f55902jyumaefscl = zoijcleaowVar;
        this.f55901iwizpuwonk = wypolnanluVar;
        this.f55900cqumvgiudr = oiVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new b40(this.f55903yggfygwlhe, this.f55902jyumaefscl, this.f55901iwizpuwonk, gxszxtbevoVar, this.f55900cqumvgiudr);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((b40) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f55904zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            npi.spay.oi oiVar = this.f55903yggfygwlhe;
            androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f55902jyumaefscl;
            x20 x20Var = new x20(this.f55901iwizpuwonk, null, this.f55900cqumvgiudr);
            this.f55904zdlpuopuiu = 1;
            if (androidx.lifecycle.lmojexxdyd.zoijcleaow(oiVar, zoijcleaowVar, x20Var, this) == objGxszxtbevo) {
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

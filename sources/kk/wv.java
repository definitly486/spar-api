package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class wv extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    public final /* synthetic */ npi.spay.uo f59197cqumvgiudr;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    public final /* synthetic */ sj.wypolnanlu f59198iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.gtknphoqwx.zoijcleaow f59199jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ npi.spay.uo f59200yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f59201zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv(npi.spay.uo uoVar, androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar, sj.wypolnanlu wypolnanluVar, lg.gxszxtbevo gxszxtbevoVar, npi.spay.uo uoVar2) {
        super(2, gxszxtbevoVar);
        this.f59200yggfygwlhe = uoVar;
        this.f59199jyumaefscl = zoijcleaowVar;
        this.f59198iwizpuwonk = wypolnanluVar;
        this.f59197cqumvgiudr = uoVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new wv(this.f59200yggfygwlhe, this.f59199jyumaefscl, this.f59198iwizpuwonk, gxszxtbevoVar, this.f59197cqumvgiudr);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return ((wv) create((pj.cllcsxoeiz) obj, (lg.gxszxtbevo) obj2)).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f59201zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            npi.spay.uo uoVar = this.f59200yggfygwlhe;
            androidx.lifecycle.gtknphoqwx.zoijcleaow zoijcleaowVar = this.f59199jyumaefscl;
            su suVar = new su(this.f59198iwizpuwonk, null, this.f59197cqumvgiudr);
            this.f59201zdlpuopuiu = 1;
            if (androidx.lifecycle.lmojexxdyd.zoijcleaow(uoVar, zoijcleaowVar, suVar, this) == objGxszxtbevo) {
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

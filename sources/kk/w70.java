package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class w70 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ npi.spay.x1 f59106jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ sj.wypolnanlu f59107yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f59108zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w70(sj.wypolnanlu wypolnanluVar, lg.gxszxtbevo gxszxtbevoVar, npi.spay.x1 x1Var) {
        super(2, gxszxtbevoVar);
        this.f59107yggfygwlhe = wypolnanluVar;
        this.f59106jyumaefscl = x1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new w70(this.f59107yggfygwlhe, gxszxtbevoVar, this.f59106jyumaefscl);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new w70(this.f59107yggfygwlhe, (lg.gxszxtbevo) obj2, this.f59106jyumaefscl).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f59108zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            sj.wypolnanlu wypolnanluVar = this.f59107yggfygwlhe;
            t60 t60Var = new t60(this.f59106jyumaefscl);
            this.f59108zdlpuopuiu = 1;
            if (wypolnanluVar.collect(t60Var, this) == objGxszxtbevo) {
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

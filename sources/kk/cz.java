package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class cz extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ u00 f56199jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ sj.wypolnanlu f56200yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f56201zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz(sj.wypolnanlu wypolnanluVar, lg.gxszxtbevo gxszxtbevoVar, u00 u00Var) {
        super(2, gxszxtbevoVar);
        this.f56200yggfygwlhe = wypolnanluVar;
        this.f56199jyumaefscl = u00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new cz(this.f56200yggfygwlhe, gxszxtbevoVar, this.f56199jyumaefscl);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new cz(this.f56200yggfygwlhe, (lg.gxszxtbevo) obj2, this.f56199jyumaefscl).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f56201zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            sj.wypolnanlu wypolnanluVar = this.f56200yggfygwlhe;
            yx yxVar = new yx(this.f56199jyumaefscl);
            this.f56201zdlpuopuiu = 1;
            if (wypolnanluVar.collect(yxVar, this) == objGxszxtbevo) {
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

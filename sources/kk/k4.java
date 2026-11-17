package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class k4 extends kotlin.coroutines.jvm.internal.draadjrbmk implements tg.rgvfuqvkyq {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ nz f57258jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ sj.wypolnanlu f57259yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public int f57260zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(sj.wypolnanlu wypolnanluVar, lg.gxszxtbevo gxszxtbevoVar, nz nzVar) {
        super(2, gxszxtbevoVar);
        this.f57259yggfygwlhe = wypolnanluVar;
        this.f57258jyumaefscl = nzVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final lg.gxszxtbevo create(Object obj, lg.gxszxtbevo gxszxtbevoVar) {
        return new k4(this.f57259yggfygwlhe, gxszxtbevoVar, this.f57258jyumaefscl);
    }

    @Override // tg.rgvfuqvkyq
    public final Object invoke(Object obj, Object obj2) {
        return new k4(this.f57259yggfygwlhe, (lg.gxszxtbevo) obj2, this.f57258jyumaefscl).invokeSuspend(gg.wwaezpbzkn.f37140iobyxmoadg);
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        Object objGxszxtbevo = mg.zoijcleaow.gxszxtbevo();
        int i13 = this.f57260zdlpuopuiu;
        if (i13 == 0) {
            gg.zdlpuopuiu.zoijcleaow(obj);
            sj.wypolnanlu wypolnanluVar = this.f57259yggfygwlhe;
            f3 f3Var = new f3(this.f57258jyumaefscl);
            this.f57260zdlpuopuiu = 1;
            if (wypolnanluVar.collect(f3Var, this) == objGxszxtbevo) {
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

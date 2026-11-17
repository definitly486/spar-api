package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class j5 extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ m6 f57151jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public int f57152yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f57153zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(m6 m6Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(gxszxtbevoVar);
        this.f57151jyumaefscl = m6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        this.f57153zdlpuopuiu = obj;
        this.f57152yggfygwlhe |= Integer.MIN_VALUE;
        return this.f57151jyumaefscl.emit(null, this);
    }
}

package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ke0 extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ qf0 f57294jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public int f57295yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f57296zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ke0(qf0 qf0Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(gxszxtbevoVar);
        this.f57294jyumaefscl = qf0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        this.f57296zdlpuopuiu = obj;
        this.f57295yggfygwlhe |= Integer.MIN_VALUE;
        return this.f57294jyumaefscl.emit(null, this);
    }
}

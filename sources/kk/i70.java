package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class i70 extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ m80 f57008jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public int f57009yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f57010zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i70(m80 m80Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(gxszxtbevoVar);
        this.f57008jyumaefscl = m80Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        this.f57010zdlpuopuiu = obj;
        this.f57009yggfygwlhe |= Integer.MIN_VALUE;
        return this.f57008jyumaefscl.emit(null, this);
    }
}

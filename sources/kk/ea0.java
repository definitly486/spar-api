package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class ea0 extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ jb0 f56394jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public int f56395yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f56396zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea0(jb0 jb0Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(gxszxtbevoVar);
        this.f56394jyumaefscl = jb0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        this.f56396zdlpuopuiu = obj;
        this.f56395yggfygwlhe |= Integer.MIN_VALUE;
        return this.f56394jyumaefscl.emit(null, this);
    }
}

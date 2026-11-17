package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class r8 extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ u9 f58280jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public int f58281yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f58282zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r8(u9 u9Var, lg.gxszxtbevo gxszxtbevoVar) {
        super(gxszxtbevoVar);
        this.f58280jyumaefscl = u9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        this.f58282zdlpuopuiu = obj;
        this.f58281yggfygwlhe |= Integer.MIN_VALUE;
        return this.f58280jyumaefscl.emit(null, this);
    }
}

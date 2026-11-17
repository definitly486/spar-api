package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class f10 extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public int f56482jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ l20 f56483yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f56484zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f10(l20 l20Var, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        super(wkgbmnqykcVar);
        this.f56483yggfygwlhe = l20Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        this.f56484zdlpuopuiu = obj;
        this.f56482jyumaefscl |= Integer.MIN_VALUE;
        return this.f56483yggfygwlhe.iobyxmoadg(this);
    }
}

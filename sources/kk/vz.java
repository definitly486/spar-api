package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class vz extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public int f59068jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public final /* synthetic */ b10 f59069yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f59070zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz(b10 b10Var, kotlin.coroutines.jvm.internal.wkgbmnqykc wkgbmnqykcVar) {
        super(wkgbmnqykcVar);
        this.f59069yggfygwlhe = b10Var;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        this.f59070zdlpuopuiu = obj;
        this.f59068jyumaefscl |= Integer.MIN_VALUE;
        return this.f59069yggfygwlhe.iobyxmoadg(this);
    }
}

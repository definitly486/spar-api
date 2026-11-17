package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class gd extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ ie f56694jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public int f56695yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f56696zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gd(ie ieVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(gxszxtbevoVar);
        this.f56694jyumaefscl = ieVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        this.f56696zdlpuopuiu = obj;
        this.f56695yggfygwlhe |= Integer.MIN_VALUE;
        return this.f56694jyumaefscl.emit(null, this);
    }
}

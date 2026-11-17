package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class da extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ gb f56245jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public int f56246yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f56247zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da(gb gbVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(gxszxtbevoVar);
        this.f56245jyumaefscl = gbVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        this.f56247zdlpuopuiu = obj;
        this.f56246yggfygwlhe |= Integer.MIN_VALUE;
        return this.f56245jyumaefscl.emit(null, this);
    }
}

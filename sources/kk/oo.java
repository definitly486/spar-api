package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class oo extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ sp f57983jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public int f57984yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f57985zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo(sp spVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(gxszxtbevoVar);
        this.f57983jyumaefscl = spVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        this.f57985zdlpuopuiu = obj;
        this.f57984yggfygwlhe |= Integer.MIN_VALUE;
        return this.f57983jyumaefscl.emit(null, this);
    }
}

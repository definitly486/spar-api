package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class qg extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ sh f58190jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public int f58191yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f58192zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg(sh shVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(gxszxtbevoVar);
        this.f58190jyumaefscl = shVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        this.f58192zdlpuopuiu = obj;
        this.f58191yggfygwlhe |= Integer.MIN_VALUE;
        return this.f58190jyumaefscl.emit(null, this);
    }
}

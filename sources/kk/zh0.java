package kk;

/* JADX INFO: loaded from: classes3.dex */
public final class zh0 extends kotlin.coroutines.jvm.internal.wkgbmnqykc {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public final /* synthetic */ oxmwwwfdhm f59585jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public int f59586yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public /* synthetic */ Object f59587zdlpuopuiu;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zh0(oxmwwwfdhm oxmwwwfdhmVar, lg.gxszxtbevo gxszxtbevoVar) {
        super(gxszxtbevoVar);
        this.f59585jyumaefscl = oxmwwwfdhmVar;
    }

    @Override // kotlin.coroutines.jvm.internal.iobyxmoadg
    public final Object invokeSuspend(Object obj) {
        this.f59587zdlpuopuiu = obj;
        this.f59586yggfygwlhe |= Integer.MIN_VALUE;
        return this.f59585jyumaefscl.emit(null, this);
    }
}

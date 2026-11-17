package tj;

/* JADX INFO: loaded from: classes3.dex */
final class lereixgezr implements lg.gxszxtbevo, kotlin.coroutines.jvm.internal.eablkybsjg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final lg.btonecajqb f110693yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final lg.gxszxtbevo f110694zdlpuopuiu;

    public lereixgezr(lg.gxszxtbevo gxszxtbevoVar, lg.btonecajqb btonecajqbVar) {
        this.f110694zdlpuopuiu = gxszxtbevoVar;
        this.f110693yggfygwlhe = btonecajqbVar;
    }

    @Override // kotlin.coroutines.jvm.internal.eablkybsjg
    public kotlin.coroutines.jvm.internal.eablkybsjg getCallerFrame() {
        lg.gxszxtbevo gxszxtbevoVar = this.f110694zdlpuopuiu;
        if (gxszxtbevoVar instanceof kotlin.coroutines.jvm.internal.eablkybsjg) {
            return (kotlin.coroutines.jvm.internal.eablkybsjg) gxszxtbevoVar;
        }
        return null;
    }

    @Override // lg.gxszxtbevo
    public lg.btonecajqb getContext() {
        return this.f110693yggfygwlhe;
    }

    @Override // lg.gxszxtbevo
    public void resumeWith(Object obj) {
        this.f110694zdlpuopuiu.resumeWith(obj);
    }
}

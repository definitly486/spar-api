package kotlin.coroutines.jvm.internal;

/* JADX INFO: loaded from: classes3.dex */
public abstract class btonecajqb extends iobyxmoadg {
    public btonecajqb(lg.gxszxtbevo gxszxtbevoVar) {
        super(gxszxtbevoVar);
        if (gxszxtbevoVar != null && gxszxtbevoVar.getContext() != lg.gtknphoqwx.f62507zdlpuopuiu) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // lg.gxszxtbevo
    public lg.btonecajqb getContext() {
        return lg.gtknphoqwx.f62507zdlpuopuiu;
    }
}

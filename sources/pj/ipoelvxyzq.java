package pj;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class ipoelvxyzq extends lg.iobyxmoadg implements auzgnhcxok {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final ipoelvxyzq f76723zdlpuopuiu = new ipoelvxyzq();

    private ipoelvxyzq() {
        super(auzgnhcxok.f76671gtknphoqwx);
    }

    @Override // pj.auzgnhcxok
    public boolean agtfadlqog() {
        return false;
    }

    @Override // pj.auzgnhcxok
    public boolean isActive() {
        return true;
    }

    @Override // pj.auzgnhcxok
    public boolean isCancelled() {
        return false;
    }

    @Override // pj.auzgnhcxok
    public jztzpxfvev kegysxyocb(boolean z13, boolean z14, tg.draadjrbmk draadjrbmkVar) {
        return grlcpdaxtj.f76704zdlpuopuiu;
    }

    @Override // pj.auzgnhcxok
    public void nufgyqmvbu(CancellationException cancellationException) {
    }

    @Override // pj.auzgnhcxok
    public jztzpxfvev pmvmpeiblj(tg.draadjrbmk draadjrbmkVar) {
        return grlcpdaxtj.f76704zdlpuopuiu;
    }

    @Override // pj.auzgnhcxok
    public boolean start() {
        return false;
    }

    public String toString() {
        return "NonCancellable";
    }

    @Override // pj.auzgnhcxok
    public CancellationException vdvldrhtss() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // pj.auzgnhcxok
    public yggfygwlhe wwaezpbzkn(iwizpuwonk iwizpuwonkVar) {
        return grlcpdaxtj.f76704zdlpuopuiu;
    }

    @Override // pj.auzgnhcxok
    public Object wypolnanlu(lg.gxszxtbevo gxszxtbevoVar) {
        throw new UnsupportedOperationException("This job is always active");
    }
}

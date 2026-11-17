package pj;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
final class okpsazkaxt implements jztzpxfvev {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Future f76759zdlpuopuiu;

    public okpsazkaxt(Future future) {
        this.f76759zdlpuopuiu = future;
    }

    @Override // pj.jztzpxfvev
    public void iobyxmoadg() {
        this.f76759zdlpuopuiu.cancel(false);
    }

    public String toString() {
        return "DisposableFutureHandle[" + this.f76759zdlpuopuiu + ']';
    }
}

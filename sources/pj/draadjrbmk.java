package pj;

import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
final class draadjrbmk implements wflxmlrfwp {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Future f76684zdlpuopuiu;

    public draadjrbmk(Future future) {
        this.f76684zdlpuopuiu = future;
    }

    @Override // pj.wflxmlrfwp
    public void ppxfxbqfkf(Throwable th2) {
        this.f76684zdlpuopuiu.cancel(false);
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.f76684zdlpuopuiu + ']';
    }
}

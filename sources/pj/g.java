package pj;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends pkzmftpjix {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    public static final g f76703yggfygwlhe = new g();

    private g() {
    }

    @Override // pj.pkzmftpjix
    public void dsvhmnatus(lg.btonecajqb btonecajqbVar, Runnable runnable) {
        k kVar = (k) btonecajqbVar.get(k.f76731yggfygwlhe);
        if (kVar == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        kVar.f76732zdlpuopuiu = true;
    }

    @Override // pj.pkzmftpjix
    public pkzmftpjix jlmebxxoox(int i13, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // pj.pkzmftpjix
    public String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // pj.pkzmftpjix
    public boolean ulzqkzuiru(lg.btonecajqb btonecajqbVar) {
        return false;
    }
}

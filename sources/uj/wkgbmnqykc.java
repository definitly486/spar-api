package uj;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc implements pj.cllcsxoeiz {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final lg.btonecajqb f113676zdlpuopuiu;

    public wkgbmnqykc(lg.btonecajqb btonecajqbVar) {
        this.f113676zdlpuopuiu = btonecajqbVar;
    }

    @Override // pj.cllcsxoeiz
    public lg.btonecajqb getCoroutineContext() {
        return this.f113676zdlpuopuiu;
    }

    public String toString() {
        return "CoroutineScope(coroutineContext=" + getCoroutineContext() + ')';
    }
}

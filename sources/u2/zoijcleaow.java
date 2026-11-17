package u2;

import kotlin.jvm.internal.zdlpuopuiu;
import lg.btonecajqb;
import pj.cllcsxoeiz;
import pj.skhdrjzrfn;

/* JADX INFO: loaded from: classes.dex */
public final class zoijcleaow implements AutoCloseable, cllcsxoeiz {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final btonecajqb f112513zdlpuopuiu;

    public zoijcleaow(btonecajqb coroutineContext) {
        zdlpuopuiu.btonecajqb(coroutineContext, "coroutineContext");
        this.f112513zdlpuopuiu = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        skhdrjzrfn.eablkybsjg(getCoroutineContext(), null, 1, null);
    }

    @Override // pj.cllcsxoeiz
    public btonecajqb getCoroutineContext() {
        return this.f112513zdlpuopuiu;
    }
}

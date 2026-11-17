package androidx.compose.runtime;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class g1 implements krqnebusok.gtknphoqwx, Iterable, ug.iobyxmoadg {

    /* JADX INFO: renamed from: cqumvgiudr, reason: collision with root package name */
    private final Object f5623cqumvgiudr;

    /* JADX INFO: renamed from: esjtqupxsv, reason: collision with root package name */
    private final Iterable f5624esjtqupxsv = this;

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final f1 f5625iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final jztzpxfvev f5626jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f5627yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final e0 f5628zdlpuopuiu;

    public g1(e0 e0Var, int i13, jztzpxfvev jztzpxfvevVar, f1 f1Var) {
        this.f5628zdlpuopuiu = e0Var;
        this.f5627yggfygwlhe = i13;
        this.f5625iwizpuwonk = f1Var;
        this.f5623cqumvgiudr = Integer.valueOf(jztzpxfvevVar.gxszxtbevo());
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new e1(this.f5628zdlpuopuiu, this.f5627yggfygwlhe, this.f5626jyumaefscl, this.f5625iwizpuwonk);
    }
}

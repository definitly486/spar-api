package androidx.compose.runtime;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class f0 implements krqnebusok.gtknphoqwx, Iterable, ug.iobyxmoadg {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private final int f5613jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f5614yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final e0 f5615zdlpuopuiu;

    public f0(e0 e0Var, int i13, int i14) {
        this.f5615zdlpuopuiu = e0Var;
        this.f5614yggfygwlhe = i13;
        this.f5613jyumaefscl = i14;
    }

    private final void iobyxmoadg() {
        if (this.f5615zdlpuopuiu.vdvldrhtss() != this.f5613jyumaefscl) {
            g0.yggfygwlhe();
        }
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        iobyxmoadg();
        this.f5615zdlpuopuiu.lereixgezr(this.f5614yggfygwlhe);
        e0 e0Var = this.f5615zdlpuopuiu;
        int i13 = this.f5614yggfygwlhe;
        return new ikoacuggdj(e0Var, i13 + 1, i13 + g0.ojitshcjhn(e0Var.draadjrbmk(), this.f5614yggfygwlhe));
    }
}

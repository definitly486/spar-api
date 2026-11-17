package androidx.compose.runtime;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class ikoacuggdj implements Iterator, ug.iobyxmoadg {

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private final int f5675iwizpuwonk;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private int f5676jyumaefscl;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f5677yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final e0 f5678zdlpuopuiu;

    public ikoacuggdj(e0 e0Var, int i13, int i14) {
        this.f5678zdlpuopuiu = e0Var;
        this.f5677yggfygwlhe = i14;
        this.f5676jyumaefscl = i13;
        this.f5675iwizpuwonk = e0Var.vdvldrhtss();
        if (e0Var.oxmwwwfdhm()) {
            g0.yggfygwlhe();
        }
    }

    private final void zoijcleaow() {
        if (this.f5678zdlpuopuiu.vdvldrhtss() != this.f5675iwizpuwonk) {
            g0.yggfygwlhe();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f5676jyumaefscl < this.f5677yggfygwlhe;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
    public krqnebusok.gtknphoqwx next() {
        zoijcleaow();
        int i13 = this.f5676jyumaefscl;
        this.f5676jyumaefscl = g0.ojitshcjhn(this.f5678zdlpuopuiu.draadjrbmk(), i13) + i13;
        return new f0(this.f5678zdlpuopuiu, i13, this.f5675iwizpuwonk);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}

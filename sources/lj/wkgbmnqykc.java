package lj;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class wkgbmnqykc implements btonecajqb, eablkybsjg {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final btonecajqb f62685iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final int f62686zoijcleaow;

    public static final class iobyxmoadg implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f62687yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Iterator f62688zdlpuopuiu;

        iobyxmoadg(wkgbmnqykc wkgbmnqykcVar) {
            this.f62688zdlpuopuiu = wkgbmnqykcVar.f62685iobyxmoadg.iterator();
            this.f62687yggfygwlhe = wkgbmnqykcVar.f62686zoijcleaow;
        }

        private final void iobyxmoadg() {
            while (this.f62687yggfygwlhe > 0 && this.f62688zdlpuopuiu.hasNext()) {
                this.f62688zdlpuopuiu.next();
                this.f62687yggfygwlhe--;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            iobyxmoadg();
            return this.f62688zdlpuopuiu.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            iobyxmoadg();
            return this.f62688zdlpuopuiu.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public wkgbmnqykc(btonecajqb sequence, int i13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sequence, "sequence");
        this.f62685iobyxmoadg = sequence;
        this.f62686zoijcleaow = i13;
        if (i13 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i13 + '.').toString());
    }

    @Override // lj.eablkybsjg
    public btonecajqb drop(int i13) {
        int i14 = this.f62686zoijcleaow + i13;
        return i14 < 0 ? new wkgbmnqykc(this, i13) : new wkgbmnqykc(this.f62685iobyxmoadg, i14);
    }

    @Override // lj.btonecajqb
    public Iterator iterator() {
        return new iobyxmoadg(this);
    }
}

package lj;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class lereixgezr implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final btonecajqb f62658iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.rgvfuqvkyq f62659zoijcleaow;

    public static final class iobyxmoadg implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f62661yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Iterator f62662zdlpuopuiu;

        iobyxmoadg() {
            this.f62662zdlpuopuiu = lereixgezr.this.f62658iobyxmoadg.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f62662zdlpuopuiu.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            tg.rgvfuqvkyq rgvfuqvkyqVar = lereixgezr.this.f62659zoijcleaow;
            int i13 = this.f62661yggfygwlhe;
            this.f62661yggfygwlhe = i13 + 1;
            if (i13 < 0) {
                hg.jyumaefscl.iwizpuwonk();
            }
            return rgvfuqvkyqVar.invoke(Integer.valueOf(i13), this.f62662zdlpuopuiu.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public lereixgezr(btonecajqb sequence, tg.rgvfuqvkyq transformer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sequence, "sequence");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transformer, "transformer");
        this.f62658iobyxmoadg = sequence;
        this.f62659zoijcleaow = transformer;
    }

    @Override // lj.btonecajqb
    public Iterator iterator() {
        return new iobyxmoadg();
    }
}

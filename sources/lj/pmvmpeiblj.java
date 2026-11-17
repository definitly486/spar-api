package lj;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class pmvmpeiblj implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final btonecajqb f62677iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.draadjrbmk f62678zoijcleaow;

    public static final class iobyxmoadg implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Iterator f62680zdlpuopuiu;

        iobyxmoadg() {
            this.f62680zdlpuopuiu = pmvmpeiblj.this.f62677iobyxmoadg.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f62680zdlpuopuiu.hasNext();
        }

        @Override // java.util.Iterator
        public Object next() {
            return pmvmpeiblj.this.f62678zoijcleaow.invoke(this.f62680zdlpuopuiu.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public pmvmpeiblj(btonecajqb sequence, tg.draadjrbmk transformer) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sequence, "sequence");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transformer, "transformer");
        this.f62677iobyxmoadg = sequence;
        this.f62678zoijcleaow = transformer;
    }

    @Override // lj.btonecajqb
    public Iterator iterator() {
        return new iobyxmoadg();
    }

    public final btonecajqb ppxfxbqfkf(tg.draadjrbmk iterator) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterator, "iterator");
        return new nufgyqmvbu(this.f62677iobyxmoadg, this.f62678zoijcleaow, iterator);
    }
}

package lj;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class nufgyqmvbu implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final btonecajqb f62670iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tg.draadjrbmk f62671ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.draadjrbmk f62672zoijcleaow;

    public static final class iobyxmoadg implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private int f62674jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private Iterator f62675yggfygwlhe;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Iterator f62676zdlpuopuiu;

        iobyxmoadg() {
            this.f62676zdlpuopuiu = nufgyqmvbu.this.f62670iobyxmoadg.iterator();
        }

        private final boolean iobyxmoadg() {
            Iterator it = this.f62675yggfygwlhe;
            if (it != null && it.hasNext()) {
                this.f62674jyumaefscl = 1;
                return true;
            }
            while (this.f62676zdlpuopuiu.hasNext()) {
                Iterator it2 = (Iterator) nufgyqmvbu.this.f62671ppxfxbqfkf.invoke(nufgyqmvbu.this.f62672zoijcleaow.invoke(this.f62676zdlpuopuiu.next()));
                if (it2.hasNext()) {
                    this.f62675yggfygwlhe = it2;
                    this.f62674jyumaefscl = 1;
                    return true;
                }
            }
            this.f62674jyumaefscl = 2;
            this.f62675yggfygwlhe = null;
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i13 = this.f62674jyumaefscl;
            if (i13 == 1) {
                return true;
            }
            if (i13 == 2) {
                return false;
            }
            return iobyxmoadg();
        }

        @Override // java.util.Iterator
        public Object next() {
            int i13 = this.f62674jyumaefscl;
            if (i13 == 2) {
                throw new NoSuchElementException();
            }
            if (i13 == 0 && !iobyxmoadg()) {
                throw new NoSuchElementException();
            }
            this.f62674jyumaefscl = 0;
            Iterator it = this.f62675yggfygwlhe;
            kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(it);
            return it.next();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public nufgyqmvbu(btonecajqb sequence, tg.draadjrbmk transformer, tg.draadjrbmk iterator) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sequence, "sequence");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(transformer, "transformer");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(iterator, "iterator");
        this.f62670iobyxmoadg = sequence;
        this.f62672zoijcleaow = transformer;
        this.f62671ppxfxbqfkf = iterator;
    }

    @Override // lj.btonecajqb
    public Iterator iterator() {
        return new iobyxmoadg();
    }
}

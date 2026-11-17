package lj;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final btonecajqb f62663iobyxmoadg;

    /* JADX INFO: renamed from: ppxfxbqfkf, reason: collision with root package name */
    private final tg.draadjrbmk f62664ppxfxbqfkf;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final boolean f62665zoijcleaow;

    public static final class iobyxmoadg implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private Object f62667jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f62668yggfygwlhe = -1;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Iterator f62669zdlpuopuiu;

        iobyxmoadg() {
            this.f62669zdlpuopuiu = lqeggnwhkg.this.f62663iobyxmoadg.iterator();
        }

        private final void iobyxmoadg() {
            while (this.f62669zdlpuopuiu.hasNext()) {
                Object next = this.f62669zdlpuopuiu.next();
                if (((Boolean) lqeggnwhkg.this.f62664ppxfxbqfkf.invoke(next)).booleanValue() == lqeggnwhkg.this.f62665zoijcleaow) {
                    this.f62667jyumaefscl = next;
                    this.f62668yggfygwlhe = 1;
                    return;
                }
            }
            this.f62668yggfygwlhe = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f62668yggfygwlhe == -1) {
                iobyxmoadg();
            }
            return this.f62668yggfygwlhe == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f62668yggfygwlhe == -1) {
                iobyxmoadg();
            }
            if (this.f62668yggfygwlhe == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f62667jyumaefscl;
            this.f62667jyumaefscl = null;
            this.f62668yggfygwlhe = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public lqeggnwhkg(btonecajqb sequence, boolean z13, tg.draadjrbmk predicate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sequence, "sequence");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(predicate, "predicate");
        this.f62663iobyxmoadg = sequence;
        this.f62665zoijcleaow = z13;
        this.f62664ppxfxbqfkf = predicate;
    }

    @Override // lj.btonecajqb
    public Iterator iterator() {
        return new iobyxmoadg();
    }
}

package lj;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class esjtqupxsv implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final btonecajqb f62646iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.draadjrbmk f62647zoijcleaow;

    public static final class iobyxmoadg implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
        private Object f62649jyumaefscl;

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f62650yggfygwlhe = -1;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Iterator f62651zdlpuopuiu;

        iobyxmoadg() {
            this.f62651zdlpuopuiu = esjtqupxsv.this.f62646iobyxmoadg.iterator();
        }

        private final void iobyxmoadg() {
            if (this.f62651zdlpuopuiu.hasNext()) {
                Object next = this.f62651zdlpuopuiu.next();
                if (((Boolean) esjtqupxsv.this.f62647zoijcleaow.invoke(next)).booleanValue()) {
                    this.f62650yggfygwlhe = 1;
                    this.f62649jyumaefscl = next;
                    return;
                }
            }
            this.f62650yggfygwlhe = 0;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f62650yggfygwlhe == -1) {
                iobyxmoadg();
            }
            return this.f62650yggfygwlhe == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f62650yggfygwlhe == -1) {
                iobyxmoadg();
            }
            if (this.f62650yggfygwlhe == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f62649jyumaefscl;
            this.f62649jyumaefscl = null;
            this.f62650yggfygwlhe = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public esjtqupxsv(btonecajqb sequence, tg.draadjrbmk predicate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(sequence, "sequence");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(predicate, "predicate");
        this.f62646iobyxmoadg = sequence;
        this.f62647zoijcleaow = predicate;
    }

    @Override // lj.btonecajqb
    public Iterator iterator() {
        return new iobyxmoadg();
    }
}

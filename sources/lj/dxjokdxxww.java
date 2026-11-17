package lj;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
final class dxjokdxxww implements btonecajqb {

    /* JADX INFO: renamed from: iobyxmoadg, reason: collision with root package name */
    private final tg.iobyxmoadg f62641iobyxmoadg;

    /* JADX INFO: renamed from: zoijcleaow, reason: collision with root package name */
    private final tg.draadjrbmk f62642zoijcleaow;

    public static final class iobyxmoadg implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private int f62644yggfygwlhe = -2;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private Object f62645zdlpuopuiu;

        iobyxmoadg() {
        }

        private final void iobyxmoadg() {
            Object objInvoke;
            if (this.f62644yggfygwlhe == -2) {
                objInvoke = dxjokdxxww.this.f62641iobyxmoadg.invoke();
            } else {
                tg.draadjrbmk draadjrbmkVar = dxjokdxxww.this.f62642zoijcleaow;
                Object obj = this.f62645zdlpuopuiu;
                kotlin.jvm.internal.zdlpuopuiu.lqeggnwhkg(obj);
                objInvoke = draadjrbmkVar.invoke(obj);
            }
            this.f62645zdlpuopuiu = objInvoke;
            this.f62644yggfygwlhe = objInvoke == null ? 0 : 1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f62644yggfygwlhe < 0) {
                iobyxmoadg();
            }
            return this.f62644yggfygwlhe == 1;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (this.f62644yggfygwlhe < 0) {
                iobyxmoadg();
            }
            if (this.f62644yggfygwlhe == 0) {
                throw new NoSuchElementException();
            }
            Object obj = this.f62645zdlpuopuiu;
            kotlin.jvm.internal.zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
            this.f62644yggfygwlhe = -1;
            return obj;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public dxjokdxxww(tg.iobyxmoadg getInitialValue, tg.draadjrbmk getNextValue) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getInitialValue, "getInitialValue");
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(getNextValue, "getNextValue");
        this.f62641iobyxmoadg = getInitialValue;
        this.f62642zoijcleaow = getNextValue;
    }

    @Override // lj.btonecajqb
    public Iterator iterator() {
        return new iobyxmoadg();
    }
}

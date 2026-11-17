package gj;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class ojitshcjhn extends ppxfxbqfkf {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f37572yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Object f37573zdlpuopuiu;

    public static final class iobyxmoadg implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private boolean f37575zdlpuopuiu = true;

        iobyxmoadg() {
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f37575zdlpuopuiu;
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f37575zdlpuopuiu) {
                throw new NoSuchElementException();
            }
            this.f37575zdlpuopuiu = false;
            return ojitshcjhn.this.wkgbmnqykc();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ojitshcjhn(Object value, int i13) {
        super(null);
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        this.f37573zdlpuopuiu = value;
        this.f37572yggfygwlhe = i13;
    }

    @Override // gj.ppxfxbqfkf
    public Object get(int i13) {
        if (i13 == this.f37572yggfygwlhe) {
            return this.f37573zdlpuopuiu;
        }
        return null;
    }

    @Override // gj.ppxfxbqfkf
    public int iobyxmoadg() {
        return 1;
    }

    @Override // gj.ppxfxbqfkf, java.lang.Iterable
    public Iterator iterator() {
        return new iobyxmoadg();
    }

    public final int ppxfxbqfkf() {
        return this.f37572yggfygwlhe;
    }

    public final Object wkgbmnqykc() {
        return this.f37573zdlpuopuiu;
    }

    @Override // gj.ppxfxbqfkf
    public void zoijcleaow(int i13, Object value) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(value, "value");
        throw new IllegalStateException();
    }
}

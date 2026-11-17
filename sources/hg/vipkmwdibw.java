package hg;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
class vipkmwdibw extends wkgbmnqykc {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final List f40266yggfygwlhe;

    public static final class iobyxmoadg implements ListIterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final ListIterator f40268zdlpuopuiu;

        iobyxmoadg(int i13) {
            this.f40268zdlpuopuiu = vipkmwdibw.this.f40266yggfygwlhe.listIterator(cdpycssgdh.crxdokpmqz(vipkmwdibw.this, i13));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f40268zdlpuopuiu.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f40268zdlpuopuiu.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f40268zdlpuopuiu.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return cdpycssgdh.sopmlzcsov(vipkmwdibw.this, this.f40268zdlpuopuiu.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f40268zdlpuopuiu.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return cdpycssgdh.sopmlzcsov(vipkmwdibw.this, this.f40268zdlpuopuiu.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public vipkmwdibw(List delegate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
        this.f40266yggfygwlhe = delegate;
    }

    @Override // hg.wkgbmnqykc, java.util.List
    public Object get(int i13) {
        return this.f40266yggfygwlhe.get(cdpycssgdh.ulzqkzuiru(this, i13));
    }

    @Override // hg.wkgbmnqykc, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // hg.wkgbmnqykc, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // hg.zoijcleaow
    public int wkgbmnqykc() {
        return this.f40266yggfygwlhe.size();
    }

    @Override // hg.wkgbmnqykc, java.util.List
    public ListIterator listIterator(int i13) {
        return new iobyxmoadg(i13);
    }
}

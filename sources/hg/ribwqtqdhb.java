package hg;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
final class ribwqtqdhb extends nufgyqmvbu {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f40262zdlpuopuiu;

    public static final class iobyxmoadg implements ListIterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final ListIterator f40264zdlpuopuiu;

        iobyxmoadg(int i13) {
            this.f40264zdlpuopuiu = ribwqtqdhb.this.f40262zdlpuopuiu.listIterator(cdpycssgdh.crxdokpmqz(ribwqtqdhb.this, i13));
        }

        @Override // java.util.ListIterator
        public void add(Object obj) {
            this.f40264zdlpuopuiu.add(obj);
            this.f40264zdlpuopuiu.previous();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f40264zdlpuopuiu.hasPrevious();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f40264zdlpuopuiu.hasNext();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public Object next() {
            return this.f40264zdlpuopuiu.previous();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return cdpycssgdh.sopmlzcsov(ribwqtqdhb.this, this.f40264zdlpuopuiu.previousIndex());
        }

        @Override // java.util.ListIterator
        public Object previous() {
            return this.f40264zdlpuopuiu.next();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return cdpycssgdh.sopmlzcsov(ribwqtqdhb.this, this.f40264zdlpuopuiu.nextIndex());
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            this.f40264zdlpuopuiu.remove();
        }

        @Override // java.util.ListIterator
        public void set(Object obj) {
            this.f40264zdlpuopuiu.set(obj);
        }
    }

    public ribwqtqdhb(List delegate) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(delegate, "delegate");
        this.f40262zdlpuopuiu = delegate;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i13, Object obj) {
        this.f40262zdlpuopuiu.add(cdpycssgdh.crxdokpmqz(this, i13), obj);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f40262zdlpuopuiu.clear();
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i13) {
        return this.f40262zdlpuopuiu.get(cdpycssgdh.ulzqkzuiru(this, i13));
    }

    @Override // hg.nufgyqmvbu
    public int iobyxmoadg() {
        return this.f40262zdlpuopuiu.size();
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i13, Object obj) {
        return this.f40262zdlpuopuiu.set(cdpycssgdh.ulzqkzuiru(this, i13), obj);
    }

    @Override // hg.nufgyqmvbu
    public Object wkgbmnqykc(int i13) {
        return this.f40262zdlpuopuiu.remove(cdpycssgdh.ulzqkzuiru(this, i13));
    }

    @Override // java.util.AbstractList, java.util.List
    public ListIterator listIterator(int i13) {
        return new iobyxmoadg(i13);
    }
}

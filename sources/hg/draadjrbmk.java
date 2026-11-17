package hg;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class draadjrbmk implements Collection, ug.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final boolean f40225yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final Object[] f40226zdlpuopuiu;

    public draadjrbmk(Object[] values, boolean z13) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(values, "values");
        this.f40226zdlpuopuiu = values;
        this.f40225yggfygwlhe = z13;
    }

    @Override // java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean contains(Object obj) {
        return agtfadlqog.okpsazkaxt(this.f40226zdlpuopuiu, obj);
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        Collection collection = elements;
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public int iobyxmoadg() {
        return this.f40226zdlpuopuiu.length;
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f40226zdlpuopuiu.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(this.f40226zdlpuopuiu);
    }

    @Override // java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return iobyxmoadg();
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(array, "array");
        return kotlin.jvm.internal.btonecajqb.zoijcleaow(this, array);
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        return iwizpuwonk.zoijcleaow(this.f40226zdlpuopuiu, this.f40225yggfygwlhe);
    }
}

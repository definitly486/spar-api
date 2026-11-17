package hg;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class pkzmftpjix implements List, Serializable, RandomAccess, ug.iobyxmoadg {
    private static final long serialVersionUID = -7390468764508069838L;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    public static final pkzmftpjix f40259zdlpuopuiu = new pkzmftpjix();

    private pkzmftpjix() {
    }

    private final Object readResolve() {
        return f40259zdlpuopuiu;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i13, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i13, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int btonecajqb(Void element) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(element, "element");
        return -1;
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return iobyxmoadg((Void) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        return elements.isEmpty();
    }

    public int draadjrbmk(Void element) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(element, "element");
        return -1;
    }

    public int dxjokdxxww() {
        return 0;
    }

    @Override // java.util.List, java.util.Collection
    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    @Override // java.util.List, java.util.Collection
    public int hashCode() {
        return 1;
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return btonecajqb((Void) obj);
        }
        return -1;
    }

    public boolean iobyxmoadg(Void element) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(element, "element");
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return ylkuphrtab.f40284zdlpuopuiu;
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return draadjrbmk((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return ylkuphrtab.f40284zdlpuopuiu;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i13) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object set(int i13, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return dxjokdxxww();
    }

    @Override // java.util.List
    public List subList(int i13, int i14) {
        if (i13 == 0 && i14 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i13 + ", toIndex: " + i14);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.btonecajqb.iobyxmoadg(this);
    }

    public String toString() {
        return "[]";
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: wkgbmnqykc, reason: merged with bridge method [inline-methods] */
    public Void get(int i13) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i13 + '.');
    }

    @Override // java.util.List, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public ListIterator listIterator(int i13) {
        if (i13 == 0) {
            return ylkuphrtab.f40284zdlpuopuiu;
        }
        throw new IndexOutOfBoundsException("Index: " + i13);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(array, "array");
        return kotlin.jvm.internal.btonecajqb.zoijcleaow(this, array);
    }
}

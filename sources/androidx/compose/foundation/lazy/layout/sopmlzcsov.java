package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes.dex */
public final class sopmlzcsov implements List, ug.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f5126zdlpuopuiu;

    public interface iobyxmoadg {
        int getIndex();

        Object getKey();
    }

    private sopmlzcsov(List list) {
        this.f5126zdlpuopuiu = list;
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ void add(int i13, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public boolean addAll(int i13, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addFirst(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ void addLast(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof iobyxmoadg) {
            return iobyxmoadg((iobyxmoadg) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f5126zdlpuopuiu.containsAll(collection);
    }

    public final void dxjokdxxww(iobyxmoadg iobyxmoadgVar) {
        this.f5126zdlpuopuiu.remove(iobyxmoadgVar);
    }

    public int eablkybsjg(iobyxmoadg iobyxmoadgVar) {
        return this.f5126zdlpuopuiu.lastIndexOf(iobyxmoadgVar);
    }

    public final void gxszxtbevo(iobyxmoadg iobyxmoadgVar) {
        this.f5126zdlpuopuiu.add(iobyxmoadgVar);
    }

    @Override // java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof iobyxmoadg) {
            return wkgbmnqykc((iobyxmoadg) obj);
        }
        return -1;
    }

    public boolean iobyxmoadg(iobyxmoadg iobyxmoadgVar) {
        return this.f5126zdlpuopuiu.contains(iobyxmoadgVar);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f5126zdlpuopuiu.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f5126zdlpuopuiu.iterator();
    }

    @Override // java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof iobyxmoadg) {
            return eablkybsjg((iobyxmoadg) obj);
        }
        return -1;
    }

    @Override // java.util.List
    public ListIterator listIterator() {
        return this.f5126zdlpuopuiu.listIterator();
    }

    public int ppxfxbqfkf() {
        return this.f5126zdlpuopuiu.size();
    }

    @Override // java.util.List
    public /* bridge */ /* synthetic */ Object remove(int i13) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeFirst() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* bridge */ /* synthetic */ Object removeLast() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public void replaceAll(UnaryOperator unaryOperator) {
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
        return ppxfxbqfkf();
    }

    @Override // java.util.List
    public void sort(Comparator comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public List subList(int i13, int i14) {
        return this.f5126zdlpuopuiu.subList(i13, i14);
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.btonecajqb.iobyxmoadg(this);
    }

    public int wkgbmnqykc(iobyxmoadg iobyxmoadgVar) {
        return this.f5126zdlpuopuiu.indexOf(iobyxmoadgVar);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: zoijcleaow, reason: merged with bridge method [inline-methods] */
    public iobyxmoadg get(int i13) {
        return (iobyxmoadg) this.f5126zdlpuopuiu.get(i13);
    }

    public sopmlzcsov() {
        this(new SnapshotStateList());
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
        return this.f5126zdlpuopuiu.listIterator(i13);
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return kotlin.jvm.internal.btonecajqb.zoijcleaow(this, objArr);
    }
}

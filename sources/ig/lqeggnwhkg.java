package ig;

import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class lqeggnwhkg extends hg.lqeggnwhkg implements Collection, ug.zoijcleaow {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final wkgbmnqykc f42493zdlpuopuiu;

    public lqeggnwhkg(wkgbmnqykc backing) {
        zdlpuopuiu.btonecajqb(backing, "backing");
        this.f42493zdlpuopuiu = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        zdlpuopuiu.btonecajqb(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f42493zdlpuopuiu.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f42493zdlpuopuiu.containsValue(obj);
    }

    @Override // hg.lqeggnwhkg
    public int iobyxmoadg() {
        return this.f42493zdlpuopuiu.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f42493zdlpuopuiu.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f42493zdlpuopuiu.xrmfcynszj();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return this.f42493zdlpuopuiu.okpsazkaxt(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        zdlpuopuiu.btonecajqb(elements, "elements");
        this.f42493zdlpuopuiu.jyumaefscl();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        zdlpuopuiu.btonecajqb(elements, "elements");
        this.f42493zdlpuopuiu.jyumaefscl();
        return super.retainAll(elements);
    }
}

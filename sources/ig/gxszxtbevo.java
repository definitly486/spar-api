package ig;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class gxszxtbevo extends hg.btonecajqb implements Set, ug.gxszxtbevo {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final wkgbmnqykc f42492zdlpuopuiu;

    public gxszxtbevo(wkgbmnqykc backing) {
        zdlpuopuiu.btonecajqb(backing, "backing");
        this.f42492zdlpuopuiu = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        zdlpuopuiu.btonecajqb(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f42492zdlpuopuiu.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f42492zdlpuopuiu.containsKey(obj);
    }

    @Override // hg.btonecajqb
    public int iobyxmoadg() {
        return this.f42492zdlpuopuiu.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f42492zdlpuopuiu.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f42492zdlpuopuiu.tzroggbefp();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f42492zdlpuopuiu.ikoacuggdj(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        zdlpuopuiu.btonecajqb(elements, "elements");
        this.f42492zdlpuopuiu.jyumaefscl();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        zdlpuopuiu.btonecajqb(elements, "elements");
        this.f42492zdlpuopuiu.jyumaefscl();
        return super.retainAll(elements);
    }
}

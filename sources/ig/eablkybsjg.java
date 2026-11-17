package ig;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class eablkybsjg extends iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final wkgbmnqykc f42491zdlpuopuiu;

    public eablkybsjg(wkgbmnqykc backing) {
        zdlpuopuiu.btonecajqb(backing, "backing");
        this.f42491zdlpuopuiu = backing;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        zdlpuopuiu.btonecajqb(elements, "elements");
        throw new UnsupportedOperationException();
    }

    @Override // ig.iobyxmoadg
    public boolean btonecajqb(Map.Entry element) {
        zdlpuopuiu.btonecajqb(element, "element");
        return this.f42491zdlpuopuiu.ribwqtqdhb(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f42491zdlpuopuiu.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection elements) {
        zdlpuopuiu.btonecajqb(elements, "elements");
        return this.f42491zdlpuopuiu.lereixgezr(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: draadjrbmk, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry element) {
        zdlpuopuiu.btonecajqb(element, "element");
        throw new UnsupportedOperationException();
    }

    @Override // ig.iobyxmoadg
    public boolean dxjokdxxww(Map.Entry element) {
        zdlpuopuiu.btonecajqb(element, "element");
        return this.f42491zdlpuopuiu.pmvmpeiblj(element);
    }

    @Override // hg.btonecajqb
    public int iobyxmoadg() {
        return this.f42491zdlpuopuiu.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f42491zdlpuopuiu.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f42491zdlpuopuiu.lmojexxdyd();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        zdlpuopuiu.btonecajqb(elements, "elements");
        this.f42491zdlpuopuiu.jyumaefscl();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        zdlpuopuiu.btonecajqb(elements, "elements");
        this.f42491zdlpuopuiu.jyumaefscl();
        return super.retainAll(elements);
    }
}

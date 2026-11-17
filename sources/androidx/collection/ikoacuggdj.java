package androidx.collection;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
abstract class ikoacuggdj implements Set, ug.iobyxmoadg {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final vipkmwdibw f4275zdlpuopuiu;

    public ikoacuggdj(vipkmwdibw parent) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(parent, "parent");
        this.f4275zdlpuopuiu = parent;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f4275zdlpuopuiu.iobyxmoadg(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection elements) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(elements, "elements");
        Iterator it = elements.iterator();
        while (it.hasNext()) {
            if (!this.f4275zdlpuopuiu.iobyxmoadg(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.zdlpuopuiu.eablkybsjg(this.f4275zdlpuopuiu, ((ikoacuggdj) obj).f4275zdlpuopuiu);
    }

    @Override // java.util.Set, java.util.Collection
    public int hashCode() {
        return this.f4275zdlpuopuiu.hashCode();
    }

    public int iobyxmoadg() {
        return this.f4275zdlpuopuiu.f4397wkgbmnqykc;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f4275zdlpuopuiu.wkgbmnqykc();
    }

    @Override // java.util.Set, java.util.Collection
    public final /* bridge */ int size() {
        return iobyxmoadg();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return kotlin.jvm.internal.btonecajqb.iobyxmoadg(this);
    }

    public String toString() {
        return this.f4275zdlpuopuiu.toString();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] array) {
        kotlin.jvm.internal.zdlpuopuiu.btonecajqb(array, "array");
        return kotlin.jvm.internal.btonecajqb.zoijcleaow(this, array);
    }
}

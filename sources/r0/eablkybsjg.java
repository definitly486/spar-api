package r0;

import hg.jyumaefscl;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import kotlin.jvm.internal.btonecajqb;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes.dex */
public final class eablkybsjg implements Collection, ug.iobyxmoadg {

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private final int f81328yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final List f81329zdlpuopuiu;

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final iobyxmoadg f81327jyumaefscl = new iobyxmoadg(null);

    /* JADX INFO: renamed from: iwizpuwonk, reason: collision with root package name */
    private static final eablkybsjg f81326iwizpuwonk = new eablkybsjg(jyumaefscl.wflxmlrfwp());

    public static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final eablkybsjg iobyxmoadg() {
            return lqeggnwhkg.iobyxmoadg().iobyxmoadg();
        }

        public final eablkybsjg zoijcleaow() {
            return eablkybsjg.f81326iwizpuwonk;
        }

        private iobyxmoadg() {
        }
    }

    public eablkybsjg(List list) {
        this.f81329zdlpuopuiu = list;
        this.f81328yggfygwlhe = list.size();
    }

    @Override // java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
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
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof wkgbmnqykc) {
            return zoijcleaow((wkgbmnqykc) obj);
        }
        return false;
    }

    @Override // java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f81329zdlpuopuiu.containsAll(collection);
    }

    public int eablkybsjg() {
        return this.f81328yggfygwlhe;
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eablkybsjg) && zdlpuopuiu.eablkybsjg(this.f81329zdlpuopuiu, ((eablkybsjg) obj).f81329zdlpuopuiu);
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.f81329zdlpuopuiu.hashCode();
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return this.f81329zdlpuopuiu.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f81329zdlpuopuiu.iterator();
    }

    public final wkgbmnqykc ppxfxbqfkf(int i13) {
        return (wkgbmnqykc) this.f81329zdlpuopuiu.get(i13);
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
    public boolean removeIf(Predicate predicate) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final /* bridge */ int size() {
        return eablkybsjg();
    }

    @Override // java.util.Collection
    public Object[] toArray() {
        return btonecajqb.iobyxmoadg(this);
    }

    public String toString() {
        return "LocaleList(localeList=" + this.f81329zdlpuopuiu + ')';
    }

    public final List wkgbmnqykc() {
        return this.f81329zdlpuopuiu;
    }

    public boolean zoijcleaow(wkgbmnqykc wkgbmnqykcVar) {
        return this.f81329zdlpuopuiu.contains(wkgbmnqykcVar);
    }

    @Override // java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return btonecajqb.zoijcleaow(this, objArr);
    }
}

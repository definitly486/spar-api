package ig;

import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.gtknphoqwx;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class btonecajqb extends hg.btonecajqb implements Set, Serializable, ug.gxszxtbevo {

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private final wkgbmnqykc f42488zdlpuopuiu;

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private static final iobyxmoadg f42487yggfygwlhe = new iobyxmoadg(null);

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    private static final btonecajqb f42486jyumaefscl = new btonecajqb(wkgbmnqykc.f42497lmojexxdyd.eablkybsjg());

    private static final class iobyxmoadg {
        public /* synthetic */ iobyxmoadg(gtknphoqwx gtknphoqwxVar) {
            this();
        }

        private iobyxmoadg() {
        }
    }

    public btonecajqb(wkgbmnqykc backing) {
        zdlpuopuiu.btonecajqb(backing, "backing");
        this.f42488zdlpuopuiu = backing;
    }

    private final Object writeReplace() throws NotSerializableException {
        if (this.f42488zdlpuopuiu.kegysxyocb()) {
            return new nufgyqmvbu(this, 1);
        }
        throw new NotSerializableException("The set cannot be serialized while it is being built.");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        return this.f42488zdlpuopuiu.vdvldrhtss(obj) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection elements) {
        zdlpuopuiu.btonecajqb(elements, "elements");
        this.f42488zdlpuopuiu.jyumaefscl();
        return super.addAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f42488zdlpuopuiu.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f42488zdlpuopuiu.containsKey(obj);
    }

    @Override // hg.btonecajqb
    public int iobyxmoadg() {
        return this.f42488zdlpuopuiu.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f42488zdlpuopuiu.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        return this.f42488zdlpuopuiu.tzroggbefp();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        return this.f42488zdlpuopuiu.ikoacuggdj(obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection elements) {
        zdlpuopuiu.btonecajqb(elements, "elements");
        this.f42488zdlpuopuiu.jyumaefscl();
        return super.removeAll(elements);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection elements) {
        zdlpuopuiu.btonecajqb(elements, "elements");
        this.f42488zdlpuopuiu.jyumaefscl();
        return super.retainAll(elements);
    }

    public final Set wkgbmnqykc() {
        this.f42488zdlpuopuiu.zdlpuopuiu();
        return size() > 0 ? this : f42486jyumaefscl;
    }

    public btonecajqb() {
        this(new wkgbmnqykc());
    }

    public btonecajqb(int i13) {
        this(new wkgbmnqykc(i13));
    }
}

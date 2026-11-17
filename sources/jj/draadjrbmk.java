package jj;

import hg.agtfadlqog;
import hg.ikoacuggdj;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.mbcevpiqjq;
import kotlin.jvm.internal.zdlpuopuiu;

/* JADX INFO: loaded from: classes3.dex */
public final class draadjrbmk extends hg.btonecajqb {

    /* JADX INFO: renamed from: jyumaefscl, reason: collision with root package name */
    public static final zoijcleaow f51581jyumaefscl = new zoijcleaow(null);

    /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
    private int f51582yggfygwlhe;

    /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
    private Object f51583zdlpuopuiu;

    private static final class iobyxmoadg implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Iterator f51584zdlpuopuiu;

        public iobyxmoadg(Object[] array) {
            zdlpuopuiu.btonecajqb(array, "array");
            this.f51584zdlpuopuiu = kotlin.jvm.internal.ppxfxbqfkf.iobyxmoadg(array);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f51584zdlpuopuiu.hasNext();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public Object next() {
            return this.f51584zdlpuopuiu.next();
        }
    }

    private static final class ppxfxbqfkf implements Iterator, ug.iobyxmoadg {

        /* JADX INFO: renamed from: yggfygwlhe, reason: collision with root package name */
        private boolean f51585yggfygwlhe = true;

        /* JADX INFO: renamed from: zdlpuopuiu, reason: collision with root package name */
        private final Object f51586zdlpuopuiu;

        public ppxfxbqfkf(Object obj) {
            this.f51586zdlpuopuiu = obj;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f51585yggfygwlhe;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: iobyxmoadg, reason: merged with bridge method [inline-methods] */
        public Void remove() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Iterator
        public Object next() {
            if (!this.f51585yggfygwlhe) {
                throw new NoSuchElementException();
            }
            this.f51585yggfygwlhe = false;
            return this.f51586zdlpuopuiu;
        }
    }

    public static final class zoijcleaow {
        public /* synthetic */ zoijcleaow(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
            this();
        }

        public final draadjrbmk iobyxmoadg() {
            return new draadjrbmk(null);
        }

        public final draadjrbmk zoijcleaow(Collection set) {
            zdlpuopuiu.btonecajqb(set, "set");
            draadjrbmk draadjrbmkVar = new draadjrbmk(null);
            draadjrbmkVar.addAll(set);
            return draadjrbmkVar;
        }

        private zoijcleaow() {
        }
    }

    public /* synthetic */ draadjrbmk(kotlin.jvm.internal.gtknphoqwx gtknphoqwxVar) {
        this();
    }

    public static final draadjrbmk wkgbmnqykc() {
        return f51581jyumaefscl.iobyxmoadg();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        Object obj2;
        if (size() == 0) {
            this.f51583zdlpuopuiu = obj;
        } else if (size() == 1) {
            if (zdlpuopuiu.eablkybsjg(this.f51583zdlpuopuiu, obj)) {
                return false;
            }
            this.f51583zdlpuopuiu = new Object[]{this.f51583zdlpuopuiu, obj};
        } else if (size() < 5) {
            Object obj3 = this.f51583zdlpuopuiu;
            zdlpuopuiu.nufgyqmvbu(obj3, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            Object[] objArr = (Object[]) obj3;
            if (agtfadlqog.okpsazkaxt(objArr, obj)) {
                return false;
            }
            if (size() == 4) {
                LinkedHashSet linkedHashSetGxszxtbevo = ikoacuggdj.gxszxtbevo(Arrays.copyOf(objArr, objArr.length));
                linkedHashSetGxszxtbevo.add(obj);
                obj2 = linkedHashSetGxszxtbevo;
            } else {
                Object[] objArrCopyOf = Arrays.copyOf(objArr, size() + 1);
                zdlpuopuiu.dxjokdxxww(objArrCopyOf, "copyOf(...)");
                objArrCopyOf[objArrCopyOf.length - 1] = obj;
                obj2 = objArrCopyOf;
            }
            this.f51583zdlpuopuiu = obj2;
        } else {
            Object obj4 = this.f51583zdlpuopuiu;
            zdlpuopuiu.nufgyqmvbu(obj4, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
            if (!mbcevpiqjq.wkgbmnqykc(obj4).add(obj)) {
                return false;
            }
        }
        dxjokdxxww(size() + 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.f51583zdlpuopuiu = null;
        dxjokdxxww(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (size() == 0) {
            return false;
        }
        if (size() == 1) {
            return zdlpuopuiu.eablkybsjg(this.f51583zdlpuopuiu, obj);
        }
        if (size() < 5) {
            Object obj2 = this.f51583zdlpuopuiu;
            zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return agtfadlqog.okpsazkaxt((Object[]) obj2, obj);
        }
        Object obj3 = this.f51583zdlpuopuiu;
        zdlpuopuiu.nufgyqmvbu(obj3, "null cannot be cast to non-null type kotlin.collections.Set<T of org.jetbrains.kotlin.utils.SmartSet>");
        return ((Set) obj3).contains(obj);
    }

    public void dxjokdxxww(int i13) {
        this.f51582yggfygwlhe = i13;
    }

    @Override // hg.btonecajqb
    public int iobyxmoadg() {
        return this.f51582yggfygwlhe;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        if (size() == 0) {
            return Collections.emptySet().iterator();
        }
        if (size() == 1) {
            return new ppxfxbqfkf(this.f51583zdlpuopuiu);
        }
        if (size() < 5) {
            Object obj = this.f51583zdlpuopuiu;
            zdlpuopuiu.nufgyqmvbu(obj, "null cannot be cast to non-null type kotlin.Array<T of org.jetbrains.kotlin.utils.SmartSet>");
            return new iobyxmoadg((Object[]) obj);
        }
        Object obj2 = this.f51583zdlpuopuiu;
        zdlpuopuiu.nufgyqmvbu(obj2, "null cannot be cast to non-null type kotlin.collections.MutableSet<T of org.jetbrains.kotlin.utils.SmartSet>");
        return mbcevpiqjq.wkgbmnqykc(obj2).iterator();
    }

    private draadjrbmk() {
    }
}
